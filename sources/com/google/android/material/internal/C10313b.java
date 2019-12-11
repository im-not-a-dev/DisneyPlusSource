package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import androidx.appcompat.widget.C0284t0;
import p096e.p097a.C3867j;
import p096e.p121h.p128m.C4062a;
import p096e.p121h.p132q.C4096f;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.p469l.C11468a;

/* renamed from: com.google.android.material.internal.b */
/* compiled from: CollapsingTextHelper */
public final class C10313b {

    /* renamed from: T */
    private static final boolean f24385T = (VERSION.SDK_INT < 18);

    /* renamed from: U */
    private static final Paint f24386U = null;

    /* renamed from: A */
    private Paint f24387A;

    /* renamed from: B */
    private float f24388B;

    /* renamed from: C */
    private float f24389C;

    /* renamed from: D */
    private float f24390D;

    /* renamed from: E */
    private float f24391E;

    /* renamed from: F */
    private int[] f24392F;

    /* renamed from: G */
    private boolean f24393G;

    /* renamed from: H */
    private final TextPaint f24394H;

    /* renamed from: I */
    private final TextPaint f24395I;

    /* renamed from: J */
    private TimeInterpolator f24396J;

    /* renamed from: K */
    private TimeInterpolator f24397K;

    /* renamed from: L */
    private float f24398L;

    /* renamed from: M */
    private float f24399M;

    /* renamed from: N */
    private float f24400N;

    /* renamed from: O */
    private int f24401O;

    /* renamed from: P */
    private float f24402P;

    /* renamed from: Q */
    private float f24403Q;

    /* renamed from: R */
    private float f24404R;

    /* renamed from: S */
    private int f24405S;

    /* renamed from: a */
    private final View f24406a;

    /* renamed from: b */
    private boolean f24407b;

    /* renamed from: c */
    private float f24408c;

    /* renamed from: d */
    private final Rect f24409d;

    /* renamed from: e */
    private final Rect f24410e;

    /* renamed from: f */
    private final RectF f24411f;

    /* renamed from: g */
    private int f24412g = 16;

    /* renamed from: h */
    private int f24413h = 16;

    /* renamed from: i */
    private float f24414i = 15.0f;

    /* renamed from: j */
    private float f24415j = 15.0f;

    /* renamed from: k */
    private ColorStateList f24416k;

    /* renamed from: l */
    private ColorStateList f24417l;

    /* renamed from: m */
    private float f24418m;

    /* renamed from: n */
    private float f24419n;

    /* renamed from: o */
    private float f24420o;

    /* renamed from: p */
    private float f24421p;

    /* renamed from: q */
    private float f24422q;

    /* renamed from: r */
    private float f24423r;

    /* renamed from: s */
    private Typeface f24424s;

    /* renamed from: t */
    private Typeface f24425t;

    /* renamed from: u */
    private Typeface f24426u;

    /* renamed from: v */
    private CharSequence f24427v;

    /* renamed from: w */
    private CharSequence f24428w;

    /* renamed from: x */
    private boolean f24429x;

    /* renamed from: y */
    private boolean f24430y;

    /* renamed from: z */
    private Bitmap f24431z;

    static {
        Paint paint = f24386U;
        if (paint != null) {
            paint.setAntiAlias(true);
            f24386U.setColor(-65281);
        }
    }

    public C10313b(View view) {
        this.f24406a = view;
        this.f24394H = new TextPaint(129);
        this.f24395I = new TextPaint(this.f24394H);
        this.f24410e = new Rect();
        this.f24409d = new Rect();
        this.f24411f = new RectF();
    }

    /* renamed from: d */
    private Typeface m32508d(int i) {
        TypedArray obtainStyledAttributes = this.f24406a.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    private void m32512i() {
        float f = this.f24391E;
        m32509d(this.f24415j);
        CharSequence charSequence = this.f24428w;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.f24394H.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int a = C4139e.m14173a(this.f24413h, this.f24429x ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f24419n = ((float) this.f24410e.top) - this.f24394H.ascent();
        } else if (i != 80) {
            this.f24419n = ((float) this.f24410e.centerY()) + (((this.f24394H.descent() - this.f24394H.ascent()) / 2.0f) - this.f24394H.descent());
        } else {
            this.f24419n = (float) this.f24410e.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f24421p = ((float) this.f24410e.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f24421p = (float) this.f24410e.left;
        } else {
            this.f24421p = ((float) this.f24410e.right) - measureText;
        }
        m32509d(this.f24414i);
        CharSequence charSequence2 = this.f24428w;
        if (charSequence2 != null) {
            f2 = this.f24394H.measureText(charSequence2, 0, charSequence2.length());
        }
        int a2 = C4139e.m14173a(this.f24412g, this.f24429x ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f24418m = ((float) this.f24409d.top) - this.f24394H.ascent();
        } else if (i3 != 80) {
            this.f24418m = ((float) this.f24409d.centerY()) + (((this.f24394H.descent() - this.f24394H.ascent()) / 2.0f) - this.f24394H.descent());
        } else {
            this.f24418m = (float) this.f24409d.bottom;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f24420o = ((float) this.f24409d.centerX()) - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.f24420o = (float) this.f24409d.left;
        } else {
            this.f24420o = ((float) this.f24409d.right) - f2;
        }
        m32514k();
        m32511f(f);
    }

    /* renamed from: j */
    private void m32513j() {
        m32507c(this.f24408c);
    }

    /* renamed from: k */
    private void m32514k() {
        Bitmap bitmap = this.f24431z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24431z = null;
        }
    }

    /* renamed from: l */
    private void m32515l() {
        if (this.f24431z == null && !this.f24409d.isEmpty() && !TextUtils.isEmpty(this.f24428w)) {
            m32507c(0.0f);
            this.f24388B = this.f24394H.ascent();
            this.f24389C = this.f24394H.descent();
            TextPaint textPaint = this.f24394H;
            CharSequence charSequence = this.f24428w;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f24389C - this.f24388B);
            if (round > 0 && round2 > 0) {
                this.f24431z = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f24431z);
                CharSequence charSequence2 = this.f24428w;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f24394H.descent(), this.f24394H);
                if (this.f24387A == null) {
                    this.f24387A = new Paint(3);
                }
            }
        }
    }

    /* renamed from: m */
    private int m32516m() {
        int[] iArr = this.f24392F;
        if (iArr != null) {
            return this.f24416k.getColorForState(iArr, 0);
        }
        return this.f24416k.getDefaultColor();
    }

    /* renamed from: a */
    public void mo26820a(TimeInterpolator timeInterpolator) {
        this.f24396J = timeInterpolator;
        mo26839h();
    }

    /* renamed from: b */
    public void mo26831b(TimeInterpolator timeInterpolator) {
        this.f24397K = timeInterpolator;
        mo26839h();
    }

    /* renamed from: c */
    public float mo26833c() {
        m32503a(this.f24395I);
        return -this.f24395I.ascent();
    }

    /* renamed from: e */
    public float mo26836e() {
        return this.f24408c;
    }

    /* renamed from: f */
    public final boolean mo26837f() {
        ColorStateList colorStateList = this.f24417l;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f24416k;
            if (colorStateList2 == null || !colorStateList2.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo26838g() {
        this.f24407b = this.f24410e.width() > 0 && this.f24410e.height() > 0 && this.f24409d.width() > 0 && this.f24409d.height() > 0;
    }

    /* renamed from: h */
    public void mo26839h() {
        if (this.f24406a.getHeight() > 0 && this.f24406a.getWidth() > 0) {
            m32512i();
            m32513j();
        }
    }

    /* renamed from: e */
    private void m32510e(float f) {
        this.f24411f.left = m32501a((float) this.f24409d.left, (float) this.f24410e.left, f, this.f24396J);
        this.f24411f.top = m32501a(this.f24418m, this.f24419n, f, this.f24396J);
        this.f24411f.right = m32501a((float) this.f24409d.right, (float) this.f24410e.right, f, this.f24396J);
        this.f24411f.bottom = m32501a((float) this.f24409d.bottom, (float) this.f24410e.bottom, f, this.f24396J);
    }

    /* renamed from: f */
    private void m32511f(float f) {
        m32509d(f);
        this.f24430y = f24385T && this.f24390D != 1.0f;
        if (this.f24430y) {
            m32515l();
        }
        C4187x.m14344I(this.f24406a);
    }

    /* renamed from: a */
    public void mo26817a(float f) {
        if (this.f24414i != f) {
            this.f24414i = f;
            mo26839h();
        }
    }

    /* renamed from: b */
    public void mo26832b(ColorStateList colorStateList) {
        if (this.f24416k != colorStateList) {
            this.f24416k = colorStateList;
            mo26839h();
        }
    }

    /* renamed from: c */
    public void mo26834c(int i) {
        if (this.f24412g != i) {
            this.f24412g = i;
            mo26839h();
        }
    }

    /* renamed from: c */
    private void m32507c(float f) {
        m32510e(f);
        this.f24422q = m32501a(this.f24420o, this.f24421p, f, this.f24396J);
        this.f24423r = m32501a(this.f24418m, this.f24419n, f, this.f24396J);
        m32511f(m32501a(this.f24414i, this.f24415j, f, this.f24397K));
        if (this.f24417l != this.f24416k) {
            this.f24394H.setColor(m32502a(m32516m(), mo26835d(), f));
        } else {
            this.f24394H.setColor(mo26835d());
        }
        this.f24394H.setShadowLayer(m32501a(this.f24402P, this.f24398L, f, (TimeInterpolator) null), m32501a(this.f24403Q, this.f24399M, f, (TimeInterpolator) null), m32501a(this.f24404R, this.f24400N, f, (TimeInterpolator) null), m32502a(this.f24405S, this.f24401O, f));
        C4187x.m14344I(this.f24406a);
    }

    /* renamed from: a */
    public void mo26821a(ColorStateList colorStateList) {
        if (this.f24417l != colorStateList) {
            this.f24417l = colorStateList;
            mo26839h();
        }
    }

    /* renamed from: b */
    public void mo26830b(int i, int i2, int i3, int i4) {
        if (!m32505a(this.f24409d, i, i2, i3, i4)) {
            this.f24409d.set(i, i2, i3, i4);
            this.f24393G = true;
            mo26838g();
        }
    }

    /* renamed from: d */
    public int mo26835d() {
        int[] iArr = this.f24392F;
        if (iArr != null) {
            return this.f24417l.getColorForState(iArr, 0);
        }
        return this.f24417l.getDefaultColor();
    }

    /* renamed from: d */
    private void m32509d(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f24427v != null) {
            float width = (float) this.f24410e.width();
            float width2 = (float) this.f24409d.width();
            boolean z3 = true;
            if (m32504a(f, this.f24415j)) {
                float f3 = this.f24415j;
                this.f24390D = 1.0f;
                Typeface typeface = this.f24426u;
                Typeface typeface2 = this.f24424s;
                if (typeface != typeface2) {
                    this.f24426u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f24414i;
                Typeface typeface3 = this.f24426u;
                Typeface typeface4 = this.f24425t;
                if (typeface3 != typeface4) {
                    this.f24426u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (m32504a(f, this.f24414i)) {
                    this.f24390D = 1.0f;
                } else {
                    this.f24390D = f / this.f24414i;
                }
                float f4 = this.f24415j / this.f24414i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f24391E != f2 || this.f24393G || z;
                this.f24391E = f2;
                this.f24393G = false;
            }
            if (this.f24428w == null || z) {
                this.f24394H.setTextSize(this.f24391E);
                this.f24394H.setTypeface(this.f24426u);
                TextPaint textPaint = this.f24394H;
                if (this.f24390D == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f24427v, this.f24394H, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f24428w)) {
                    this.f24428w = ellipsize;
                    this.f24429x = m32506b(this.f24428w);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo26819a(int i, int i2, int i3, int i4) {
        if (!m32505a(this.f24410e, i, i2, i3, i4)) {
            this.f24410e.set(i, i2, i3, i4);
            this.f24393G = true;
            mo26838g();
        }
    }

    /* renamed from: b */
    public void mo26829b(int i) {
        if (this.f24413h != i) {
            this.f24413h = i;
            mo26839h();
        }
    }

    /* renamed from: a */
    public float mo26816a() {
        if (this.f24427v == null) {
            return 0.0f;
        }
        m32503a(this.f24395I);
        TextPaint textPaint = this.f24395I;
        CharSequence charSequence = this.f24427v;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public void mo26828b(float f) {
        float a = C4062a.m13966a(f, 0.0f, 1.0f);
        if (a != this.f24408c) {
            this.f24408c = a;
            m32513j();
        }
    }

    /* renamed from: a */
    public void mo26823a(RectF rectF) {
        float f;
        boolean b = m32506b(this.f24427v);
        Rect rect = this.f24410e;
        if (!b) {
            f = (float) rect.left;
        } else {
            f = ((float) rect.right) - mo26816a();
        }
        rectF.left = f;
        Rect rect2 = this.f24410e;
        rectF.top = (float) rect2.top;
        rectF.right = !b ? rectF.left + mo26816a() : (float) rect2.right;
        rectF.bottom = ((float) this.f24410e.top) + mo26833c();
    }

    /* renamed from: b */
    private boolean m32506b(CharSequence charSequence) {
        boolean z = true;
        if (C4187x.m14399n(this.f24406a) != 1) {
            z = false;
        }
        return (z ? C4096f.f10353d : C4096f.f10352c).mo14654a(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public ColorStateList mo26827b() {
        return this.f24417l;
    }

    /* renamed from: a */
    private void m32503a(TextPaint textPaint) {
        textPaint.setTextSize(this.f24415j);
        textPaint.setTypeface(this.f24424s);
    }

    /* renamed from: a */
    public void mo26818a(int i) {
        C0284t0 a = C0284t0.m1484a(this.f24406a.getContext(), i, C3867j.TextAppearance);
        if (a.mo1922g(C3867j.TextAppearance_android_textColor)) {
            this.f24417l = a.mo1906a(C3867j.TextAppearance_android_textColor);
        }
        if (a.mo1922g(C3867j.TextAppearance_android_textSize)) {
            this.f24415j = (float) a.mo1913c(C3867j.TextAppearance_android_textSize, (int) this.f24415j);
        }
        this.f24401O = a.mo1915d(C3867j.TextAppearance_android_shadowColor, 0);
        this.f24399M = a.mo1910b(C3867j.TextAppearance_android_shadowDx, 0.0f);
        this.f24400N = a.mo1910b(C3867j.TextAppearance_android_shadowDy, 0.0f);
        this.f24398L = a.mo1910b(C3867j.TextAppearance_android_shadowRadius, 0.0f);
        a.mo1908a();
        if (VERSION.SDK_INT >= 16) {
            this.f24424s = m32508d(i);
        }
        mo26839h();
    }

    /* renamed from: a */
    public void mo26824a(Typeface typeface) {
        this.f24425t = typeface;
        this.f24424s = typeface;
        mo26839h();
    }

    /* renamed from: a */
    public final boolean mo26826a(int[] iArr) {
        this.f24392F = iArr;
        if (!mo26837f()) {
            return false;
        }
        mo26839h();
        return true;
    }

    /* renamed from: a */
    public void mo26822a(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f24428w != null && this.f24407b) {
            float f2 = this.f24422q;
            float f3 = this.f24423r;
            boolean z = this.f24430y && this.f24431z != null;
            if (z) {
                f = this.f24388B * this.f24390D;
            } else {
                f = this.f24394H.ascent() * this.f24390D;
                this.f24394H.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f24390D;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f24431z, f2, f4, this.f24387A);
            } else {
                CharSequence charSequence = this.f24428w;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f24394H);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public void mo26825a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.f24427v)) {
            this.f24427v = charSequence;
            this.f24428w = null;
            m32514k();
            mo26839h();
        }
    }

    /* renamed from: a */
    private static boolean m32504a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static int m32502a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m32501a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C11468a.m36994a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m32505a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
