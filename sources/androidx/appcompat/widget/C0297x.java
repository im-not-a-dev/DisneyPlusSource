package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p096e.p097a.C3867j;

/* renamed from: androidx.appcompat.widget.x */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0297x {

    /* renamed from: k */
    private static final RectF f1301k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1302l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f1303m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1304a = 0;

    /* renamed from: b */
    private boolean f1305b = false;

    /* renamed from: c */
    private float f1306c = -1.0f;

    /* renamed from: d */
    private float f1307d = -1.0f;

    /* renamed from: e */
    private float f1308e = -1.0f;

    /* renamed from: f */
    private int[] f1309f = new int[0];

    /* renamed from: g */
    private boolean f1310g = false;

    /* renamed from: h */
    private TextPaint f1311h;

    /* renamed from: i */
    private final TextView f1312i;

    /* renamed from: j */
    private final Context f1313j;

    C0297x(TextView textView) {
        this.f1312i = textView;
        this.f1313j = this.f1312i.getContext();
    }

    /* renamed from: h */
    private void m1599h() {
        this.f1304a = 0;
        this.f1307d = -1.0f;
        this.f1308e = -1.0f;
        this.f1306c = -1.0f;
        this.f1309f = new int[0];
        this.f1305b = false;
    }

    /* renamed from: i */
    private boolean m1600i() {
        if (!m1602k() || this.f1304a != 1) {
            this.f1305b = false;
        } else {
            if (!this.f1310g || this.f1309f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1308e - this.f1307d) / this.f1306c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1307d + (((float) i) * this.f1306c));
                }
                this.f1309f = m1594a(iArr);
            }
            this.f1305b = true;
        }
        return this.f1305b;
    }

    /* renamed from: j */
    private boolean m1601j() {
        int length = this.f1309f.length;
        this.f1310g = length > 0;
        if (this.f1310g) {
            this.f1304a = 1;
            int[] iArr = this.f1309f;
            this.f1307d = (float) iArr[0];
            this.f1308e = (float) iArr[length - 1];
            this.f1306c = -1.0f;
        }
        return this.f1310g;
    }

    /* renamed from: k */
    private boolean m1602k() {
        return !(this.f1312i instanceof C0238i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2012a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1313j.obtainStyledAttributes(attributeSet, C3867j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTextView_autoSizeTextType)) {
            this.f1304a = obtainStyledAttributes.getInt(C3867j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C3867j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C3867j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C3867j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C3867j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C3867j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C3867j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C3867j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C3867j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m1592a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m1602k()) {
            this.f1304a = 0;
        } else if (this.f1304a == 1) {
            if (!this.f1310g) {
                DisplayMetrics displayMetrics = this.f1313j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1591a(dimension2, dimension3, dimension);
            }
            m1600i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2015b(int i) {
        if (!m1602k()) {
            return;
        }
        if (i == 0) {
            m1599h();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1313j.getResources().getDisplayMetrics();
            m1591a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1600i()) {
                mo2008a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo2016c() {
        return Math.round(this.f1307d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2017d() {
        return Math.round(this.f1306c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int[] mo2018e() {
        return this.f1309f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo2019f() {
        return this.f1304a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2020g() {
        return m1602k() && this.f1304a != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2014b() {
        return Math.round(this.f1308e);
    }

    /* renamed from: b */
    private StaticLayout m1596b(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        Builder obtain = Builder.obtain(charSequence, 0, charSequence.length(), this.f1311h, i);
        Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1312i.getLineSpacingExtra(), this.f1312i.getLineSpacingMultiplier()).setIncludePad(this.f1312i.getIncludeFontPadding()).setBreakStrategy(this.f1312i.getBreakStrategy()).setHyphenationFrequency(this.f1312i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            if (VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f1312i.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) m1597b((Object) this.f1312i, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2011a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1602k()) {
            DisplayMetrics displayMetrics = this.f1313j.getResources().getDisplayMetrics();
            m1591a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1600i()) {
                mo2008a();
            }
        }
    }

    /* renamed from: b */
    private StaticLayout m1595b(CharSequence charSequence, Alignment alignment, int i) {
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f1311h, i, alignment, this.f1312i.getLineSpacingMultiplier(), this.f1312i.getLineSpacingExtra(), this.f1312i.getIncludeFontPadding());
        return staticLayout;
    }

    /* renamed from: b */
    private static <T> T m1597b(Object obj, String str, T t) {
        try {
            return m1598b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            String str2 = "ACTVAutoSizeHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w(str2, sb.toString(), e);
            return t;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2013a(int[] iArr, int i) throws IllegalArgumentException {
        if (m1602k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1313j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1309f = m1594a(iArr2);
                if (!m1601j()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f1310g = false;
            }
            if (m1600i()) {
                mo2008a();
            }
        }
    }

    /* renamed from: b */
    private static Method m1598b(String str) {
        try {
            Method method = (Method) f1302l.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f1302l.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1592a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1309f = m1594a(iArr);
            m1601j();
        }
    }

    /* renamed from: a */
    private int[] m1594a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m1591a(float f, float f2, float f3) throws IllegalArgumentException {
        String str = "px) is less or equal to (0px)";
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f1304a = 1;
            this.f1307d = f;
            this.f1308e = f2;
            this.f1306c = f3;
            this.f1310g = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append(str);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2008a() {
        boolean z;
        int i;
        if (mo2020g()) {
            if (this.f1305b) {
                if (this.f1312i.getMeasuredHeight() > 0 && this.f1312i.getMeasuredWidth() > 0) {
                    if (VERSION.SDK_INT >= 29) {
                        z = this.f1312i.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) m1597b((Object) this.f1312i, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue();
                    }
                    if (z) {
                        i = 1048576;
                    } else {
                        i = (this.f1312i.getMeasuredWidth() - this.f1312i.getTotalPaddingLeft()) - this.f1312i.getTotalPaddingRight();
                    }
                    int height = (this.f1312i.getHeight() - this.f1312i.getCompoundPaddingBottom()) - this.f1312i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f1301k) {
                            f1301k.setEmpty();
                            f1301k.right = (float) i;
                            f1301k.bottom = (float) height;
                            float a = (float) m1586a(f1301k);
                            if (a != this.f1312i.getTextSize()) {
                                mo2010a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.f1305b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2010a(int i, float f) {
        Resources resources;
        Context context = this.f1313j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1590a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m1590a(float f) {
        if (f != this.f1312i.getPaint().getTextSize()) {
            this.f1312i.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.f1312i.isInLayout() : false;
            if (this.f1312i.getLayout() != null) {
                this.f1305b = false;
                try {
                    Method b = m1598b("nullLayouts");
                    if (b != null) {
                        b.invoke(this.f1312i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1312i.requestLayout();
                } else {
                    this.f1312i.forceLayout();
                }
                this.f1312i.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m1586a(RectF rectF) {
        int length = this.f1309f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1593a(this.f1309f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1309f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2009a(int i) {
        TextPaint textPaint = this.f1311h;
        if (textPaint == null) {
            this.f1311h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1311h.set(this.f1312i.getPaint());
        this.f1311h.setTextSize((float) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public StaticLayout mo2007a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        int i3 = VERSION.SDK_INT;
        if (i3 >= 23) {
            return m1596b(charSequence, alignment, i, i2);
        }
        if (i3 >= 16) {
            return m1595b(charSequence, alignment, i);
        }
        return m1587a(charSequence, alignment, i);
    }

    /* renamed from: a */
    private boolean m1593a(int i, RectF rectF) {
        CharSequence text = this.f1312i.getText();
        TransformationMethod transformationMethod = this.f1312i.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f1312i);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f1312i.getMaxLines() : -1;
        mo2009a(i);
        StaticLayout a = mo2007a(text, (Alignment) m1597b((Object) this.f1312i, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private StaticLayout m1587a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue = ((Float) m1588a((Object) this.f1312i, "mSpacingMult", (T) Float.valueOf(1.0f))).floatValue();
        float floatValue2 = ((Float) m1588a((Object) this.f1312i, "mSpacingAdd", (T) Float.valueOf(0.0f))).floatValue();
        boolean booleanValue = ((Boolean) m1588a((Object) this.f1312i, "mIncludePad", (T) Boolean.valueOf(true))).booleanValue();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f1311h, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private static <T> T m1588a(Object obj, String str, T t) {
        try {
            Field a = m1589a(str);
            if (a == null) {
                return t;
            }
            return a.get(obj);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    /* renamed from: a */
    private static Field m1589a(String str) {
        try {
            Field field = (Field) f1303m.get(str);
            if (field == null) {
                field = TextView.class.getDeclaredField(str);
                if (field != null) {
                    field.setAccessible(true);
                    f1303m.put(str, field);
                }
            }
            return field;
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }
}
