package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0216d;
import androidx.appcompat.widget.C0223f;
import androidx.appcompat.widget.C0238i;
import androidx.appcompat.widget.C0249k;
import androidx.appcompat.widget.C0253m;
import androidx.appcompat.widget.C0264p;
import androidx.appcompat.widget.C0266q;
import androidx.appcompat.widget.C0267q0;
import androidx.appcompat.widget.C0268r;
import androidx.appcompat.widget.C0272t;
import androidx.appcompat.widget.C0293w;
import androidx.appcompat.widget.C0299y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p096e.p097a.C3867j;
import p096e.p097a.p104o.C3892d;
import p096e.p113e.C3926a;
import p096e.p121h.p135s.C4187x;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C3926a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    private static class C0075a implements OnClickListener {

        /* renamed from: U */
        private final String f284U;

        /* renamed from: V */
        private Method f285V;

        /* renamed from: W */
        private Context f286W;

        /* renamed from: c */
        private final View f287c;

        public C0075a(View view, String str) {
            this.f287c = view;
            this.f284U = str;
        }

        /* renamed from: a */
        private void m428a(Context context, String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f284U, new Class[]{View.class});
                        if (method != null) {
                            this.f285V = method;
                            this.f286W = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f287c.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f287c.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f284U);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.f287c.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(View view) {
            if (this.f285V == null) {
                m428a(this.f287c.getContext(), this.f284U);
            }
            try {
                this.f285V.invoke(this.f286W, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C4187x.m14411z(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0075a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String createViewByPrefix : sClassPrefixList) {
                    View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        return createViewByPrefix2;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix3 = createViewByPrefix(context, str, null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C3867j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C3867j.View_theme, 0);
            if (resourceId != 0) {
                Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C3892d) || ((C3892d) context).mo13911a() != resourceId) ? new C3892d(context, resourceId) : context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public C0216d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0216d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0223f createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C0223f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0238i createEditText(Context context, AttributeSet attributeSet) {
        return new C0238i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0249k createImageButton(Context context, AttributeSet attributeSet) {
        return new C0249k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0253m createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C0253m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0264p createRadioButton(Context context, AttributeSet attributeSet) {
        return new C0264p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0266q createRatingBar(Context context, AttributeSet attributeSet) {
        return new C0266q(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0268r createSeekBar(Context context, AttributeSet attributeSet) {
        return new C0268r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0272t createSpinner(Context context, AttributeSet attributeSet) {
        return new C0272t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0293w createTextView(Context context, AttributeSet attributeSet) {
        return new C0293w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0299y createToggleButton(Context context, AttributeSet attributeSet) {
        return new C0299y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0267q0.m1439b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 8:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 10:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 12:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 13:
                view2 = createToggleButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
