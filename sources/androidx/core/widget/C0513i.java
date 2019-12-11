package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p132q.C4092d;
import p096e.p121h.p132q.C4092d.C4093a;
import p096e.p121h.p132q.C4092d.C4093a.C4094a;
import p096e.p121h.p134r.C4117i;

/* renamed from: androidx.core.widget.i */
/* compiled from: TextViewCompat */
public final class C0513i {

    /* renamed from: a */
    private static Field f2283a;

    /* renamed from: b */
    private static boolean f2284b;

    /* renamed from: c */
    private static Field f2285c;

    /* renamed from: d */
    private static boolean f2286d;

    /* renamed from: androidx.core.widget.i$a */
    /* compiled from: TextViewCompat */
    private static class C0514a implements Callback {

        /* renamed from: a */
        private final Callback f2287a;

        /* renamed from: b */
        private final TextView f2288b;

        /* renamed from: c */
        private Class f2289c;

        /* renamed from: d */
        private Method f2290d;

        /* renamed from: e */
        private boolean f2291e;

        /* renamed from: f */
        private boolean f2292f = false;

        C0514a(Callback callback, TextView textView) {
            this.f2287a = callback;
            this.f2288b = textView;
        }

        /* renamed from: a */
        private void m2784a(Menu menu) {
            Method method;
            Context context = this.f2288b.getContext();
            PackageManager packageManager = context.getPackageManager();
            String str = "removeItemAt";
            if (!this.f2292f) {
                this.f2292f = true;
                try {
                    this.f2289c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2290d = this.f2289c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                    this.f2291e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2289c = null;
                    this.f2290d = null;
                    this.f2291e = false;
                }
            }
            try {
                if (!this.f2291e || !this.f2289c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE});
                } else {
                    method = this.f2290d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m2783a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m2782a(resolveInfo, this.f2288b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2287a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2287a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2287a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m2784a(menu);
            return this.f2287a.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: a */
        private List<ResolveInfo> m2783a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2781a(), 0)) {
                if (m2785a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private boolean m2785a(ResolveInfo resolveInfo, Context context) {
            boolean z = true;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            String str = resolveInfo.activityInfo.permission;
            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private Intent m2782a(ResolveInfo resolveInfo, TextView textView) {
            return m2781a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m2786a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private boolean m2786a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: a */
        private Intent m2781a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: a */
    private static Field m2765a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve ");
            sb.append(str);
            sb.append(" field.");
            Log.e("TextViewCompat", sb.toString());
            return field;
        }
    }

    /* renamed from: b */
    public static void m2774b(TextView textView, int i) {
        int i2;
        C4117i.m14094a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static int m2775c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m2777d(TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f2286d) {
            f2285c = m2765a("mMaxMode");
            f2286d = true;
        }
        Field field = f2285c;
        if (field != null && m2763a(field, textView) == 1) {
            if (!f2284b) {
                f2283a = m2765a("mMaximum");
                f2284b = true;
            }
            Field field2 = f2283a;
            if (field2 != null) {
                return m2763a(field2, textView);
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static TextDirectionHeuristic m2779e(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    return textDirectionHeuristic;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: f */
    public static C4093a m2780f(TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C4093a(textView.getTextMetricsParams());
        }
        C4094a aVar = new C4094a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo14650a(textView.getBreakStrategy());
            aVar.mo14653b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo14651a(m2779e(textView));
        }
        return aVar.mo14652a();
    }

    /* renamed from: c */
    public static void m2776c(TextView textView, int i) {
        C4117i.m14094a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    private static int m2763a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            Log.d("TextViewCompat", sb.toString());
            return -1;
        }
    }

    /* renamed from: a */
    public static void m2769a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: a */
    public static Drawable[] m2772a(TextView textView) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m2773b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: d */
    public static void m2778d(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: a */
    public static Callback m2764a(TextView textView, Callback callback) {
        int i = VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0514a)) ? callback : new C0514a(callback, textView);
    }

    /* renamed from: a */
    public static void m2766a(TextView textView, int i) {
        int i2;
        C4117i.m14094a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m2770a(TextView textView, C4093a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m2762a(aVar.mo14645c()));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo14646d().getTextScaleX();
            textView.getPaint().set(aVar.mo14646d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo14646d());
        textView.setBreakStrategy(aVar.mo14642a());
        textView.setHyphenationFrequency(aVar.mo14644b());
    }

    /* renamed from: a */
    public static void m2771a(TextView textView, C4092d dVar) {
        if (m2780f(textView).mo14643a(dVar.mo14630a())) {
            textView.setText(dVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: a */
    private static int m2762a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static void m2767a(TextView textView, ColorStateList colorStateList) {
        C4117i.m14095a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof C0516k) {
            ((C0516k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2768a(TextView textView, Mode mode) {
        C4117i.m14095a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof C0516k) {
            ((C0516k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
