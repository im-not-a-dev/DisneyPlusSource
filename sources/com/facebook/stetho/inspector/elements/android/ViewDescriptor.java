package com.facebook.stetho.inspector.elements.android;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewDebug.FlagToString;
import android.view.ViewDebug.IntToString;
import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.ReflectionUtil;
import com.facebook.stetho.common.StringUtil;
import com.facebook.stetho.common.android.ResourcesUtil;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import com.facebook.stetho.inspector.elements.ComputedStyleAccumulator;
import com.facebook.stetho.inspector.elements.Descriptor;
import com.facebook.stetho.inspector.elements.StyleAccumulator;
import com.facebook.stetho.inspector.elements.StyleRuleNameAccumulator;
import com.facebook.stetho.inspector.helper.IntegerFormatter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

final class ViewDescriptor extends AbstractChainedDescriptor<View> implements HighlightableDescriptor<View> {
    private static final String ACCESSIBILITY_STYLE_RULE_NAME = "Accessibility Properties";
    private static final String ID_NAME = "id";
    private static final String NONE_MAPPING = "<no mapping>";
    private static final String NONE_VALUE = "(none)";
    private static final String VIEW_STYLE_RULE_NAME = "<this_view>";
    private static final boolean sHasSupportNodeInfo = (ReflectionUtil.tryGetClassForName("androidx.core.view.accessibility.AccessibilityNodeInfoCompat") != null);
    private final MethodInvoker mMethodInvoker;
    private volatile List<ViewCSSProperty> mViewProperties;
    private Pattern mWordBoundaryPattern;

    private final class FieldBackedCSSProperty extends ViewCSSProperty {
        private final Field mField;

        public FieldBackedCSSProperty(Field field, String str, ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mField = field;
            this.mField.setAccessible(true);
        }

        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
            return this.mField.get(view);
        }
    }

    private final class MethodBackedCSSProperty extends ViewCSSProperty {
        private final Method mMethod;

        public MethodBackedCSSProperty(Method method, String str, ExportedProperty exportedProperty) {
            super(str, exportedProperty);
            this.mMethod = method;
            this.mMethod.setAccessible(true);
        }

        public Object getValue(View view) throws InvocationTargetException, IllegalAccessException {
            return this.mMethod.invoke(view, new Object[0]);
        }
    }

    private abstract class ViewCSSProperty {
        private final ExportedProperty mAnnotation;
        private final String mCSSName;

        public ViewCSSProperty(String str, ExportedProperty exportedProperty) {
            this.mCSSName = str;
            this.mAnnotation = exportedProperty;
        }

        public final ExportedProperty getAnnotation() {
            return this.mAnnotation;
        }

        public final String getCSSName() {
            return this.mCSSName;
        }

        public abstract Object getValue(View view) throws InvocationTargetException, IllegalAccessException;
    }

    public ViewDescriptor() {
        this(new MethodInvoker());
    }

    private static boolean canFlagsBeMappedToString(ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.flagMapping() == null || exportedProperty.flagMapping().length <= 0) ? false : true;
    }

    private static boolean canIntBeMappedToString(ExportedProperty exportedProperty) {
        return (exportedProperty == null || exportedProperty.mapping() == null || exportedProperty.mapping().length <= 0) ? false : true;
    }

    private static String capitalize(String str) {
        if (str == null || str.length() == 0 || Character.isTitleCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, Character.toTitleCase(sb.charAt(0)));
        return sb.toString();
    }

    private String convertViewPropertyNameToCSSName(String str) {
        String[] split = getWordBoundaryPattern().split(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("get") && !split[i].equals("m")) {
                sb.append(split[i].toLowerCase());
                if (i < split.length - 1) {
                    sb.append('-');
                }
            }
        }
        return sb.toString();
    }

    private static String getIdAttribute(View view) {
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        return ResourcesUtil.getIdStringQuietly(view, view.getResources(), id);
    }

    private void getIdStyle(View view, StyleAccumulator styleAccumulator) {
        String idAttribute = getIdAttribute(view);
        String str = ID_NAME;
        if (idAttribute == null) {
            styleAccumulator.store(str, NONE_VALUE, false);
        } else {
            styleAccumulator.store(str, idAttribute, false);
        }
    }

    private void getStyleFromInteger(String str, Integer num, ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        String format = IntegerFormatter.getInstance().format(num, exportedProperty);
        String str2 = ")";
        String str3 = " (";
        if (canIntBeMappedToString(exportedProperty)) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(str3);
            sb.append(mapIntToStringUsingAnnotation(num.intValue(), exportedProperty));
            sb.append(str2);
            styleAccumulator.store(str, sb.toString(), false);
        } else if (canFlagsBeMappedToString(exportedProperty)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append(str3);
            sb2.append(mapFlagsToStringUsingAnnotation(num.intValue(), exportedProperty));
            sb2.append(str2);
            styleAccumulator.store(str, sb2.toString(), false);
        } else {
            Boolean valueOf = Boolean.valueOf(true);
            if (num.intValue() != 0 || canFlagsBeMappedToString(exportedProperty) || canIntBeMappedToString(exportedProperty)) {
                valueOf = Boolean.valueOf(false);
            }
            styleAccumulator.store(str, format, valueOf.booleanValue());
        }
    }

    private void getStyleFromValue(View view, String str, Object obj, ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        if (str.equals(ID_NAME)) {
            getIdStyle(view, styleAccumulator);
        } else if (obj instanceof Integer) {
            getStyleFromInteger(str, (Integer) obj, exportedProperty, styleAccumulator);
        } else {
            boolean z = true;
            if (obj instanceof Float) {
                String valueOf = String.valueOf(obj);
                if (((Float) obj).floatValue() != 0.0f) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf, z);
            } else if (obj instanceof Boolean) {
                styleAccumulator.store(str, String.valueOf(obj), false);
            } else if (obj instanceof Short) {
                String valueOf2 = String.valueOf(obj);
                if (((Short) obj).shortValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf2, z);
            } else if (obj instanceof Long) {
                String valueOf3 = String.valueOf(obj);
                if (((Long) obj).longValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf3, z);
            } else if (obj instanceof Double) {
                String valueOf4 = String.valueOf(obj);
                if (((Double) obj).doubleValue() != 0.0d) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf4, z);
            } else if (obj instanceof Byte) {
                String valueOf5 = String.valueOf(obj);
                if (((Byte) obj).byteValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf5, z);
            } else if (obj instanceof Character) {
                String valueOf6 = String.valueOf(obj);
                if (((Character) obj).charValue() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf6, z);
            } else if (obj instanceof CharSequence) {
                String valueOf7 = String.valueOf(obj);
                if (((CharSequence) obj).length() != 0) {
                    z = false;
                }
                styleAccumulator.store(str, valueOf7, z);
            } else {
                getStylesFromObject(view, str, obj, exportedProperty, styleAccumulator);
            }
        }
    }

    private void getStylesFromObject(View view, String str, Object obj, ExportedProperty exportedProperty, StyleAccumulator styleAccumulator) {
        Field[] fields;
        String str2;
        Object obj2 = obj;
        if (exportedProperty == null || !exportedProperty.deepExport() || obj2 == null) {
            return;
        }
        for (Field field : obj.getClass().getFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj2);
                    String name = field.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -599904534:
                            if (name.equals("rightMargin")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -414179485:
                            if (name.equals("topMargin")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1928835221:
                            if (name.equals("leftMargin")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2064613305:
                            if (name.equals("bottomMargin")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        str2 = "margin-bottom";
                    } else if (c == 1) {
                        str2 = "margin-top";
                    } else if (c == 2) {
                        str2 = "margin-left";
                    } else if (c != 3) {
                        String prefix = exportedProperty.prefix();
                        if (prefix != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(prefix);
                            sb.append(name);
                            name = sb.toString();
                        }
                        str2 = convertViewPropertyNameToCSSName(name);
                    } else {
                        str2 = "margin-right";
                    }
                    getStyleFromValue(view, str2, obj3, (ExportedProperty) field.getAnnotation(ExportedProperty.class), styleAccumulator);
                } catch (IllegalAccessException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed to get property of name: \"");
                    String str3 = str;
                    sb2.append(str);
                    sb2.append("\" of object: ");
                    sb2.append(String.valueOf(obj));
                    LogUtil.m24845e((Throwable) e, sb2.toString());
                    return;
                }
            }
        }
    }

    private List<ViewCSSProperty> getViewProperties() {
        Method[] declaredMethods;
        Field[] declaredFields;
        if (this.mViewProperties == null) {
            synchronized (this) {
                if (this.mViewProperties == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Method method : View.class.getDeclaredMethods()) {
                        ExportedProperty exportedProperty = (ExportedProperty) method.getAnnotation(ExportedProperty.class);
                        if (exportedProperty != null) {
                            arrayList.add(new MethodBackedCSSProperty(method, convertViewPropertyNameToCSSName(method.getName()), exportedProperty));
                        }
                    }
                    for (Field field : View.class.getDeclaredFields()) {
                        ExportedProperty exportedProperty2 = (ExportedProperty) field.getAnnotation(ExportedProperty.class);
                        if (exportedProperty2 != null) {
                            arrayList.add(new FieldBackedCSSProperty(field, convertViewPropertyNameToCSSName(field.getName()), exportedProperty2));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<ViewCSSProperty>() {
                        public int compare(ViewCSSProperty viewCSSProperty, ViewCSSProperty viewCSSProperty2) {
                            return viewCSSProperty.getCSSName().compareTo(viewCSSProperty2.getCSSName());
                        }
                    });
                    this.mViewProperties = Collections.unmodifiableList(arrayList);
                }
            }
        }
        return this.mViewProperties;
    }

    private Pattern getWordBoundaryPattern() {
        if (this.mWordBoundaryPattern == null) {
            this.mWordBoundaryPattern = Pattern.compile("(?<=\\p{Lower})(?=\\p{Upper})");
        }
        return this.mWordBoundaryPattern;
    }

    private static String mapFlagsToStringUsingAnnotation(int i, ExportedProperty exportedProperty) {
        FlagToString[] flagMapping;
        if (canFlagsBeMappedToString(exportedProperty)) {
            StringBuilder sb = null;
            boolean z = false;
            for (FlagToString flagToString : exportedProperty.flagMapping()) {
                if (flagToString.outputIf() == ((flagToString.mask() & i) == flagToString.equals())) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    if (z) {
                        sb.append(" | ");
                    }
                    sb.append(flagToString.name());
                    z = true;
                }
            }
            return z ? sb.toString() : NONE_MAPPING;
        }
        throw new IllegalStateException("Cannot map using this annotation");
    }

    private static String mapIntToStringUsingAnnotation(int i, ExportedProperty exportedProperty) {
        IntToString[] mapping;
        if (canIntBeMappedToString(exportedProperty)) {
            for (IntToString intToString : exportedProperty.mapping()) {
                if (intToString.from() == i) {
                    return intToString.to();
                }
            }
            return NONE_MAPPING;
        }
        throw new IllegalStateException("Cannot map using this annotation");
    }

    public View getViewAndBoundsForHighlighting(View view, Rect rect) {
        return view;
    }

    public ViewDescriptor(MethodInvoker methodInvoker) {
        this.mMethodInvoker = methodInvoker;
    }

    public Object getElementToHighlightAtPosition(View view, int i, int i2, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        return view;
    }

    /* access modifiers changed from: protected */
    public void onGetAttributes(View view, AttributeAccumulator attributeAccumulator) {
        String idAttribute = getIdAttribute(view);
        if (idAttribute != null) {
            attributeAccumulator.store(ID_NAME, idAttribute);
        }
    }

    /* access modifiers changed from: protected */
    public void onGetComputedStyles(View view, ComputedStyleAccumulator computedStyleAccumulator) {
        computedStyleAccumulator.store("left", Integer.toString(view.getLeft()));
        computedStyleAccumulator.store("top", Integer.toString(view.getTop()));
        computedStyleAccumulator.store("right", Integer.toString(view.getRight()));
        computedStyleAccumulator.store("bottom", Integer.toString(view.getBottom()));
    }

    /* access modifiers changed from: protected */
    public String onGetNodeName(View view) {
        String name = view.getClass().getName();
        return StringUtil.removePrefix(name, "android.view.", StringUtil.removePrefix(name, "android.widget."));
    }

    /* access modifiers changed from: protected */
    public void onGetStyleRuleNames(View view, StyleRuleNameAccumulator styleRuleNameAccumulator) {
        styleRuleNameAccumulator.store(VIEW_STYLE_RULE_NAME, false);
        if (sHasSupportNodeInfo) {
            styleRuleNameAccumulator.store(ACCESSIBILITY_STYLE_RULE_NAME, false);
        }
    }

    /* access modifiers changed from: protected */
    public void onGetStyles(View view, String str, StyleAccumulator styleAccumulator) {
        if (VIEW_STYLE_RULE_NAME.equals(str)) {
            List viewProperties = getViewProperties();
            int size = viewProperties.size();
            for (int i = 0; i < size; i++) {
                ViewCSSProperty viewCSSProperty = (ViewCSSProperty) viewProperties.get(i);
                try {
                    getStyleFromValue(view, viewCSSProperty.getCSSName(), viewCSSProperty.getValue(view), viewCSSProperty.getAnnotation(), styleAccumulator);
                } catch (Exception e) {
                    if ((e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to get style property ");
                        sb.append(viewCSSProperty.getCSSName());
                        sb.append(" of element= ");
                        sb.append(view.toString());
                        LogUtil.m24845e((Throwable) e, sb.toString());
                    } else {
                        throw ExceptionUtil.propagate(e);
                    }
                }
            }
        } else if (ACCESSIBILITY_STYLE_RULE_NAME.equals(str) && sHasSupportNodeInfo) {
            boolean ignored = AccessibilityNodeInfoWrapper.getIgnored(view);
            View view2 = view;
            getStyleFromValue(view2, "ignored", Boolean.valueOf(ignored), null, styleAccumulator);
            if (ignored) {
                View view3 = view;
                getStyleFromValue(view3, "ignored-reasons", AccessibilityNodeInfoWrapper.getIgnoredReasons(view), null, styleAccumulator);
            }
            View view4 = view;
            getStyleFromValue(view4, "focusable", Boolean.valueOf(!ignored), null, styleAccumulator);
            if (!ignored) {
                View view5 = view;
                getStyleFromValue(view5, "focusable-reasons", AccessibilityNodeInfoWrapper.getFocusableReasons(view), null, styleAccumulator);
                View view6 = view;
                getStyleFromValue(view6, "focused", Boolean.valueOf(AccessibilityNodeInfoWrapper.getIsAccessibilityFocused(view)), null, styleAccumulator);
                View view7 = view;
                getStyleFromValue(view7, "description", AccessibilityNodeInfoWrapper.getDescription(view), null, styleAccumulator);
                getStyleFromValue(view6, "actions", AccessibilityNodeInfoWrapper.getActions(view), null, styleAccumulator);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSetAttributesAsText(View view, String str) {
        for (Entry entry : Descriptor.parseSetAttributesAsTextArg(str).entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(capitalize((String) entry.getKey()));
            this.mMethodInvoker.invoke(view, sb.toString(), (String) entry.getValue());
        }
    }
}
