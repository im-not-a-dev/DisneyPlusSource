package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import androidx.core.widget.C0506b;
import java.lang.ref.WeakReference;
import p096e.p097a.C3867j;
import p096e.p121h.p122j.p124d.C4039f.C4040a;

/* renamed from: androidx.appcompat.widget.v */
/* compiled from: AppCompatTextHelper */
class C0289v {

    /* renamed from: a */
    private final TextView f1266a;

    /* renamed from: b */
    private C0269r0 f1267b;

    /* renamed from: c */
    private C0269r0 f1268c;

    /* renamed from: d */
    private C0269r0 f1269d;

    /* renamed from: e */
    private C0269r0 f1270e;

    /* renamed from: f */
    private C0269r0 f1271f;

    /* renamed from: g */
    private C0269r0 f1272g;

    /* renamed from: h */
    private C0269r0 f1273h;

    /* renamed from: i */
    private final C0297x f1274i;

    /* renamed from: j */
    private int f1275j = 0;

    /* renamed from: k */
    private int f1276k = -1;

    /* renamed from: l */
    private Typeface f1277l;

    /* renamed from: m */
    private boolean f1278m;

    /* renamed from: androidx.appcompat.widget.v$a */
    /* compiled from: AppCompatTextHelper */
    private static class C0290a extends C4040a {

        /* renamed from: a */
        private final WeakReference<C0289v> f1279a;

        /* renamed from: b */
        private final int f1280b;

        /* renamed from: c */
        private final int f1281c;

        /* renamed from: androidx.appcompat.widget.v$a$a */
        /* compiled from: AppCompatTextHelper */
        private class C0291a implements Runnable {

            /* renamed from: U */
            private final Typeface f1282U;

            /* renamed from: c */
            private final WeakReference<C0289v> f1283c;

            C0291a(C0290a aVar, WeakReference<C0289v> weakReference, Typeface typeface) {
                this.f1283c = weakReference;
                this.f1282U = typeface;
            }

            public void run() {
                C0289v vVar = (C0289v) this.f1283c.get();
                if (vVar != null) {
                    vVar.mo1940a(this.f1282U);
                }
            }
        }

        C0290a(C0289v vVar, int i, int i2) {
            this.f1279a = new WeakReference<>(vVar);
            this.f1280b = i;
            this.f1281c = i2;
        }

        /* renamed from: a */
        public void mo1956a(int i) {
        }

        /* renamed from: a */
        public void mo1957a(Typeface typeface) {
            C0289v vVar = (C0289v) this.f1279a.get();
            if (vVar != null) {
                if (VERSION.SDK_INT >= 28) {
                    int i = this.f1280b;
                    if (i != -1) {
                        typeface = Typeface.create(typeface, i, (this.f1281c & 2) != 0);
                    }
                }
                vVar.mo1942a((Runnable) new C0291a(this, this.f1279a, typeface));
            }
        }
    }

    C0289v(TextView textView) {
        this.f1266a = textView;
        this.f1274i = new C0297x(this.f1266a);
    }

    /* renamed from: l */
    private void m1550l() {
        C0269r0 r0Var = this.f1273h;
        this.f1267b = r0Var;
        this.f1268c = r0Var;
        this.f1269d = r0Var;
        this.f1270e = r0Var;
        this.f1271f = r0Var;
        this.f1272g = r0Var;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1941a(android.util.AttributeSet r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            android.widget.TextView r2 = r7.f1266a
            android.content.Context r2 = r2.getContext()
            androidx.appcompat.widget.h r3 = androidx.appcompat.widget.C0235h.m1313b()
            int[] r4 = p096e.p097a.C3867j.AppCompatTextHelper
            r5 = 0
            androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.C0284t0.m1486a(r2, r0, r4, r1, r5)
            int r6 = p096e.p097a.C3867j.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r6 = r4.mo1921g(r6, r8)
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableLeft
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1267b = r9
        L_0x0032:
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableTop
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableTop
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1268c = r9
        L_0x0046:
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableRight
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableRight
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1269d = r9
        L_0x005a:
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableBottom
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1270e = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableStart
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableStart
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1271f = r9
        L_0x0088:
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r4.mo1922g(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = p096e.p097a.C3867j.AppCompatTextHelper_android_drawableEnd
            int r9 = r4.mo1921g(r9, r5)
            androidx.appcompat.widget.r0 r9 = m1545a(r2, r3, r9)
            r7.f1272g = r9
        L_0x009c:
            r4.mo1908a()
            android.widget.TextView r4 = r7.f1266a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            r11 = 23
            if (r6 == r8) goto L_0x0130
            int[] r13 = p096e.p097a.C3867j.TextAppearance
            androidx.appcompat.widget.t0 r6 = androidx.appcompat.widget.C0284t0.m1484a(r2, r6, r13)
            if (r4 != 0) goto L_0x00c6
            int r13 = p096e.p097a.C3867j.TextAppearance_textAllCaps
            boolean r13 = r6.mo1922g(r13)
            if (r13 == 0) goto L_0x00c6
            int r13 = p096e.p097a.C3867j.TextAppearance_textAllCaps
            boolean r13 = r6.mo1909a(r13, r5)
            r14 = r13
            r13 = 1
            goto L_0x00c8
        L_0x00c6:
            r13 = 0
            r14 = 0
        L_0x00c8:
            r7.m1546a(r2, r6)
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r11) goto L_0x0105
            int r15 = p096e.p097a.C3867j.TextAppearance_android_textColor
            boolean r15 = r6.mo1922g(r15)
            if (r15 == 0) goto L_0x00de
            int r15 = p096e.p097a.C3867j.TextAppearance_android_textColor
            android.content.res.ColorStateList r15 = r6.mo1906a(r15)
            goto L_0x00df
        L_0x00de:
            r15 = 0
        L_0x00df:
            int r10 = p096e.p097a.C3867j.TextAppearance_android_textColorHint
            boolean r10 = r6.mo1922g(r10)
            if (r10 == 0) goto L_0x00ee
            int r10 = p096e.p097a.C3867j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo1906a(r10)
            goto L_0x00ef
        L_0x00ee:
            r10 = 0
        L_0x00ef:
            int r12 = p096e.p097a.C3867j.TextAppearance_android_textColorLink
            boolean r12 = r6.mo1922g(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = p096e.p097a.C3867j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r12 = r6.mo1906a(r12)
            r17 = r15
            r15 = r12
            r12 = r17
            goto L_0x0108
        L_0x0103:
            r12 = r15
            goto L_0x0107
        L_0x0105:
            r10 = 0
            r12 = 0
        L_0x0107:
            r15 = 0
        L_0x0108:
            int r8 = p096e.p097a.C3867j.TextAppearance_textLocale
            boolean r8 = r6.mo1922g(r8)
            if (r8 == 0) goto L_0x0117
            int r8 = p096e.p097a.C3867j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo1916d(r8)
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x012b
            int r11 = p096e.p097a.C3867j.TextAppearance_fontVariationSettings
            boolean r11 = r6.mo1922g(r11)
            if (r11 == 0) goto L_0x012b
            int r11 = p096e.p097a.C3867j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo1916d(r11)
            goto L_0x012c
        L_0x012b:
            r11 = 0
        L_0x012c:
            r6.mo1908a()
            goto L_0x0137
        L_0x0130:
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0137:
            int[] r6 = p096e.p097a.C3867j.TextAppearance
            androidx.appcompat.widget.t0 r6 = androidx.appcompat.widget.C0284t0.m1486a(r2, r0, r6, r1, r5)
            if (r4 != 0) goto L_0x014e
            int r9 = p096e.p097a.C3867j.TextAppearance_textAllCaps
            boolean r9 = r6.mo1922g(r9)
            if (r9 == 0) goto L_0x014e
            int r9 = p096e.p097a.C3867j.TextAppearance_textAllCaps
            boolean r14 = r6.mo1909a(r9, r5)
            r13 = 1
        L_0x014e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r9 >= r5) goto L_0x017e
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColor
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x0162
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColor
            android.content.res.ColorStateList r12 = r6.mo1906a(r5)
        L_0x0162:
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColorHint
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x0170
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo1906a(r5)
        L_0x0170:
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColorLink
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x017e
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r15 = r6.mo1906a(r5)
        L_0x017e:
            int r5 = p096e.p097a.C3867j.TextAppearance_textLocale
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x018c
            int r5 = p096e.p097a.C3867j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo1916d(r5)
        L_0x018c:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r5 < r9) goto L_0x01a0
            int r5 = p096e.p097a.C3867j.TextAppearance_fontVariationSettings
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x01a0
            int r5 = p096e.p097a.C3867j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo1916d(r5)
        L_0x01a0:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r5 < r9) goto L_0x01c1
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textSize
            boolean r5 = r6.mo1922g(r5)
            if (r5 == 0) goto L_0x01c1
            int r5 = p096e.p097a.C3867j.TextAppearance_android_textSize
            r9 = -1
            int r5 = r6.mo1913c(r5, r9)
            if (r5 != 0) goto L_0x01c1
            android.widget.TextView r5 = r7.f1266a
            r9 = 0
            r16 = r3
            r3 = 0
            r5.setTextSize(r3, r9)
            goto L_0x01c3
        L_0x01c1:
            r16 = r3
        L_0x01c3:
            r7.m1546a(r2, r6)
            r6.mo1908a()
            if (r12 == 0) goto L_0x01d0
            android.widget.TextView r3 = r7.f1266a
            r3.setTextColor(r12)
        L_0x01d0:
            if (r10 == 0) goto L_0x01d7
            android.widget.TextView r3 = r7.f1266a
            r3.setHintTextColor(r10)
        L_0x01d7:
            if (r15 == 0) goto L_0x01de
            android.widget.TextView r3 = r7.f1266a
            r3.setLinkTextColor(r15)
        L_0x01de:
            if (r4 != 0) goto L_0x01e5
            if (r13 == 0) goto L_0x01e5
            r7.mo1943a(r14)
        L_0x01e5:
            android.graphics.Typeface r3 = r7.f1277l
            if (r3 == 0) goto L_0x01fb
            int r4 = r7.f1276k
            r5 = -1
            if (r4 != r5) goto L_0x01f6
            android.widget.TextView r4 = r7.f1266a
            int r5 = r7.f1275j
            r4.setTypeface(r3, r5)
            goto L_0x01fb
        L_0x01f6:
            android.widget.TextView r4 = r7.f1266a
            r4.setTypeface(r3)
        L_0x01fb:
            if (r11 == 0) goto L_0x0202
            android.widget.TextView r3 = r7.f1266a
            r3.setFontVariationSettings(r11)
        L_0x0202:
            if (r8 == 0) goto L_0x022c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0214
            android.widget.TextView r3 = r7.f1266a
            android.os.LocaleList r4 = android.os.LocaleList.forLanguageTags(r8)
            r3.setTextLocales(r4)
            goto L_0x022c
        L_0x0214:
            r4 = 21
            if (r3 < r4) goto L_0x022c
            r3 = 44
            int r3 = r8.indexOf(r3)
            r4 = 0
            java.lang.String r3 = r8.substring(r4, r3)
            android.widget.TextView r4 = r7.f1266a
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r4.setTextLocale(r3)
        L_0x022c:
            androidx.appcompat.widget.x r3 = r7.f1274i
            r3.mo2012a(r0, r1)
            boolean r1 = androidx.core.widget.C0506b.f2275a
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.x r1 = r7.f1274i
            int r1 = r1.mo2019f()
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.x r1 = r7.f1274i
            int[] r1 = r1.mo2018e()
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0272
            android.widget.TextView r3 = r7.f1266a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x026c
            android.widget.TextView r1 = r7.f1266a
            androidx.appcompat.widget.x r3 = r7.f1274i
            int r3 = r3.mo2016c()
            androidx.appcompat.widget.x r4 = r7.f1274i
            int r4 = r4.mo2014b()
            androidx.appcompat.widget.x r5 = r7.f1274i
            int r5 = r5.mo2017d()
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L_0x0272
        L_0x026c:
            r6 = 0
            android.widget.TextView r3 = r7.f1266a
            r3.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x0272:
            int[] r1 = p096e.p097a.C3867j.AppCompatTextView
            androidx.appcompat.widget.t0 r8 = androidx.appcompat.widget.C0284t0.m1485a(r2, r0, r1)
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo1921g(r0, r1)
            r3 = r16
            if (r0 == r1) goto L_0x0289
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r4 = r0
            goto L_0x028a
        L_0x0289:
            r4 = 0
        L_0x028a:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo1921g(r0, r1)
            if (r0 == r1) goto L_0x0298
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r5 = r0
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo1921g(r0, r1)
            if (r0 == r1) goto L_0x02a7
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r6 = r0
            goto L_0x02a8
        L_0x02a7:
            r6 = 0
        L_0x02a8:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo1921g(r0, r1)
            if (r0 == r1) goto L_0x02b6
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r9 = r0
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo1921g(r0, r1)
            if (r0 == r1) goto L_0x02c5
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r10 = r0
            goto L_0x02c6
        L_0x02c5:
            r10 = 0
        L_0x02c6:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo1921g(r0, r1)
            if (r0 == r1) goto L_0x02d4
            android.graphics.drawable.Drawable r0 = r3.mo1667a(r2, r0)
            r11 = r0
            goto L_0x02d5
        L_0x02d4:
            r11 = 0
        L_0x02d5:
            r0 = r18
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.m1547a(r1, r2, r3, r4, r5, r6)
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableTint
            boolean r0 = r8.mo1922g(r0)
            if (r0 == 0) goto L_0x02f3
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r8.mo1906a(r0)
            android.widget.TextView r1 = r7.f1266a
            androidx.core.widget.C0513i.m2767a(r1, r0)
        L_0x02f3:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableTintMode
            boolean r0 = r8.mo1922g(r0)
            if (r0 == 0) goto L_0x030d
            int r0 = p096e.p097a.C3867j.AppCompatTextView_drawableTintMode
            r1 = -1
            int r0 = r8.mo1915d(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0204b0.m1171a(r0, r2)
            android.widget.TextView r2 = r7.f1266a
            androidx.core.widget.C0513i.m2768a(r2, r0)
            goto L_0x030e
        L_0x030d:
            r1 = -1
        L_0x030e:
            int r0 = p096e.p097a.C3867j.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo1913c(r0, r1)
            int r2 = p096e.p097a.C3867j.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo1913c(r2, r1)
            int r3 = p096e.p097a.C3867j.AppCompatTextView_lineHeight
            int r3 = r8.mo1913c(r3, r1)
            r8.mo1908a()
            if (r0 == r1) goto L_0x032a
            android.widget.TextView r4 = r7.f1266a
            androidx.core.widget.C0513i.m2766a(r4, r0)
        L_0x032a:
            if (r2 == r1) goto L_0x0331
            android.widget.TextView r0 = r7.f1266a
            androidx.core.widget.C0513i.m2774b(r0, r2)
        L_0x0331:
            if (r3 == r1) goto L_0x0338
            android.widget.TextView r0 = r7.f1266a
            androidx.core.widget.C0513i.m2776c(r0, r3)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0289v.mo1941a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1946b() {
        this.f1274i.mo2008a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1947c() {
        return this.f1274i.mo2014b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1948d() {
        return this.f1274i.mo2016c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1949e() {
        return this.f1274i.mo2017d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo1950f() {
        return this.f1274i.mo2018e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo1951g() {
        return this.f1274i.mo2019f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo1952h() {
        C0269r0 r0Var = this.f1273h;
        if (r0Var != null) {
            return r0Var.f1200a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Mode mo1953i() {
        C0269r0 r0Var = this.f1273h;
        if (r0Var != null) {
            return r0Var.f1201b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo1954j() {
        return this.f1274i.mo2020g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1955k() {
        mo1933a();
    }

    /* renamed from: b */
    private void m1549b(int i, float f) {
        this.f1274i.mo2010a(i, f);
    }

    /* renamed from: a */
    public void mo1940a(Typeface typeface) {
        if (this.f1278m) {
            this.f1266a.setTypeface(typeface);
            this.f1277l = typeface;
        }
    }

    /* renamed from: a */
    public void mo1942a(Runnable runnable) {
        this.f1266a.post(runnable);
    }

    /* renamed from: a */
    private void m1546a(Context context, C0284t0 t0Var) {
        this.f1275j = t0Var.mo1915d(C3867j.TextAppearance_android_textStyle, this.f1275j);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            this.f1276k = t0Var.mo1915d(C3867j.TextAppearance_android_textFontWeight, -1);
            if (this.f1276k != -1) {
                this.f1275j = (this.f1275j & 2) | 0;
            }
        }
        if (t0Var.mo1922g(C3867j.TextAppearance_android_fontFamily) || t0Var.mo1922g(C3867j.TextAppearance_fontFamily)) {
            this.f1277l = null;
            int i = t0Var.mo1922g(C3867j.TextAppearance_fontFamily) ? C3867j.TextAppearance_fontFamily : C3867j.TextAppearance_android_fontFamily;
            int i2 = this.f1276k;
            int i3 = this.f1275j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = t0Var.mo1907a(i, this.f1275j, (C4040a) new C0290a(this, i2, i3));
                    if (a != null) {
                        if (VERSION.SDK_INT < 28 || this.f1276k == -1) {
                            this.f1277l = a;
                        } else {
                            this.f1277l = Typeface.create(Typeface.create(a, 0), this.f1276k, (this.f1275j & 2) != 0);
                        }
                    }
                    this.f1278m = this.f1277l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1277l == null) {
                String d = t0Var.mo1916d(i);
                if (d != null) {
                    if (VERSION.SDK_INT < 28 || this.f1276k == -1) {
                        this.f1277l = Typeface.create(d, this.f1275j);
                    } else {
                        Typeface create = Typeface.create(d, 0);
                        int i4 = this.f1276k;
                        if ((this.f1275j & 2) != 0) {
                            z = true;
                        }
                        this.f1277l = Typeface.create(create, i4, z);
                    }
                }
            }
            return;
        }
        if (t0Var.mo1922g(C3867j.TextAppearance_android_typeface)) {
            this.f1278m = false;
            int d2 = t0Var.mo1915d(C3867j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                this.f1277l = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                this.f1277l = Typeface.SERIF;
            } else if (d2 == 3) {
                this.f1277l = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1937a(Context context, int i) {
        C0284t0 a = C0284t0.m1484a(context, i, C3867j.TextAppearance);
        if (a.mo1922g(C3867j.TextAppearance_textAllCaps)) {
            mo1943a(a.mo1909a(C3867j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo1922g(C3867j.TextAppearance_android_textColor)) {
            ColorStateList a2 = a.mo1906a(C3867j.TextAppearance_android_textColor);
            if (a2 != null) {
                this.f1266a.setTextColor(a2);
            }
        }
        if (a.mo1922g(C3867j.TextAppearance_android_textSize) && a.mo1913c(C3867j.TextAppearance_android_textSize, -1) == 0) {
            this.f1266a.setTextSize(0, 0.0f);
        }
        m1546a(context, a);
        if (VERSION.SDK_INT >= 26 && a.mo1922g(C3867j.TextAppearance_fontVariationSettings)) {
            String d = a.mo1916d(C3867j.TextAppearance_fontVariationSettings);
            if (d != null) {
                this.f1266a.setFontVariationSettings(d);
            }
        }
        a.mo1908a();
        Typeface typeface = this.f1277l;
        if (typeface != null) {
            this.f1266a.setTypeface(typeface, this.f1275j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1943a(boolean z) {
        this.f1266a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1933a() {
        if (!(this.f1267b == null && this.f1268c == null && this.f1269d == null && this.f1270e == null)) {
            Drawable[] compoundDrawables = this.f1266a.getCompoundDrawables();
            m1548a(compoundDrawables[0], this.f1267b);
            m1548a(compoundDrawables[1], this.f1268c);
            m1548a(compoundDrawables[2], this.f1269d);
            m1548a(compoundDrawables[3], this.f1270e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1271f != null || this.f1272g != null) {
            Drawable[] compoundDrawablesRelative = this.f1266a.getCompoundDrawablesRelative();
            m1548a(compoundDrawablesRelative[0], this.f1271f);
            m1548a(compoundDrawablesRelative[2], this.f1272g);
        }
    }

    /* renamed from: a */
    private void m1548a(Drawable drawable, C0269r0 r0Var) {
        if (drawable != null && r0Var != null) {
            C0235h.m1312a(drawable, r0Var, this.f1266a.getDrawableState());
        }
    }

    /* renamed from: a */
    private static C0269r0 m1545a(Context context, C0235h hVar, int i) {
        ColorStateList b = hVar.mo1670b(context, i);
        if (b == null) {
            return null;
        }
        C0269r0 r0Var = new C0269r0();
        r0Var.f1203d = true;
        r0Var.f1200a = b;
        return r0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1944a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0506b.f2275a) {
            mo1946b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1935a(int i, float f) {
        if (!C0506b.f2275a && !mo1954j()) {
            m1549b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1934a(int i) {
        this.f1274i.mo2015b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1936a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1274i.mo2011a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1945a(int[] iArr, int i) throws IllegalArgumentException {
        this.f1274i.mo2013a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1938a(ColorStateList colorStateList) {
        if (this.f1273h == null) {
            this.f1273h = new C0269r0();
        }
        C0269r0 r0Var = this.f1273h;
        r0Var.f1200a = colorStateList;
        r0Var.f1203d = colorStateList != null;
        m1550l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1939a(Mode mode) {
        if (this.f1273h == null) {
            this.f1273h = new C0269r0();
        }
        C0269r0 r0Var = this.f1273h;
        r0Var.f1201b = mode;
        r0Var.f1202c = mode != null;
        m1550l();
    }

    /* renamed from: a */
    private void m1547a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1266a.getCompoundDrawablesRelative();
            TextView textView = this.f1266a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            if (VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1266a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1266a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1266a.getCompoundDrawables();
            TextView textView3 = this.f1266a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
}
