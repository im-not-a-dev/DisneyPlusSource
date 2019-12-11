package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import p096e.p112d.C3922b;
import p096e.p112d.C3923c;

/* renamed from: androidx.cardview.widget.g */
/* compiled from: RoundRectDrawableWithShadow */
class C0312g extends Drawable {

    /* renamed from: q */
    private static final double f1351q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0313a f1352r;

    /* renamed from: a */
    private final int f1353a;

    /* renamed from: b */
    private Paint f1354b;

    /* renamed from: c */
    private Paint f1355c;

    /* renamed from: d */
    private Paint f1356d;

    /* renamed from: e */
    private final RectF f1357e;

    /* renamed from: f */
    private float f1358f;

    /* renamed from: g */
    private Path f1359g;

    /* renamed from: h */
    private float f1360h;

    /* renamed from: i */
    private float f1361i;

    /* renamed from: j */
    private float f1362j;

    /* renamed from: k */
    private ColorStateList f1363k;

    /* renamed from: l */
    private boolean f1364l = true;

    /* renamed from: m */
    private final int f1365m;

    /* renamed from: n */
    private final int f1366n;

    /* renamed from: o */
    private boolean f1367o = true;

    /* renamed from: p */
    private boolean f1368p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0313a {
        /* renamed from: a */
        void mo2057a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0312g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1365m = resources.getColor(C3922b.cardview_shadow_start_color);
        this.f1366n = resources.getColor(C3922b.cardview_shadow_end_color);
        this.f1353a = resources.getDimensionPixelSize(C3923c.cardview_compat_inset_shadow);
        this.f1354b = new Paint(5);
        m1717b(colorStateList);
        this.f1355c = new Paint(5);
        this.f1355c.setStyle(Style.FILL);
        this.f1358f = (float) ((int) (f + 0.5f));
        this.f1357e = new RectF();
        this.f1356d = new Paint(this.f1355c);
        this.f1356d.setAntiAlias(false);
        m1714a(f2, f3);
    }

    /* renamed from: b */
    private void m1717b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1363k = colorStateList;
        this.f1354b.setColor(this.f1363k.getColorForState(getState(), this.f1363k.getDefaultColor()));
    }

    /* renamed from: d */
    private int m1719d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m1720g() {
        float f = this.f1358f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1361i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1359g;
        if (path == null) {
            this.f1359g = new Path();
        } else {
            path.reset();
        }
        this.f1359g.setFillType(FillType.EVEN_ODD);
        this.f1359g.moveTo(-this.f1358f, 0.0f);
        this.f1359g.rLineTo(-this.f1361i, 0.0f);
        this.f1359g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1359g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1359g.close();
        float f3 = this.f1358f;
        float f4 = this.f1361i;
        float f5 = f3 / (f3 + f4);
        Paint paint = this.f1355c;
        float f6 = f3 + f4;
        int i = this.f1365m;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.f1366n}, new float[]{0.0f, f5, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f1356d;
        float f7 = this.f1358f;
        float f8 = -f7;
        float f9 = this.f1361i;
        float f10 = f8 + f9;
        float f11 = (-f7) - f9;
        int i2 = this.f1365m;
        LinearGradient linearGradient = new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i2, i2, this.f1366n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f1356d.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2093a(boolean z) {
        this.f1367o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2097c(float f) {
        m1714a(f, this.f1360h);
    }

    public void draw(Canvas canvas) {
        if (this.f1364l) {
            m1718b(getBounds());
            this.f1364l = false;
        }
        canvas.translate(0.0f, this.f1362j / 2.0f);
        m1715a(canvas);
        canvas.translate(0.0f, (-this.f1362j) / 2.0f);
        f1352r.mo2057a(canvas, this.f1357e, this.f1358f, this.f1354b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo2100e() {
        float f = this.f1360h;
        return (Math.max(f, this.f1358f + ((float) this.f1353a) + (f / 2.0f)) * 2.0f) + ((this.f1360h + ((float) this.f1353a)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo2101f() {
        return this.f1362j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1716b(this.f1360h, this.f1358f, this.f1367o));
        int ceil2 = (int) Math.ceil((double) m1713a(this.f1360h, this.f1358f, this.f1367o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1363k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1364l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1363k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1354b.getColor() == colorForState) {
            return false;
        }
        this.f1354b.setColor(colorForState);
        this.f1364l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f1354b.setAlpha(i);
        this.f1355c.setAlpha(i);
        this.f1356d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1354b.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo2096c() {
        return this.f1360h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo2098d() {
        float f = this.f1360h;
        return (Math.max(f, this.f1358f + ((float) this.f1353a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1360h * 1.5f) + ((float) this.f1353a)) * 2.0f);
    }

    /* renamed from: a */
    private void m1714a(float f, float f2) {
        String str = ". Must be >= 0";
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m1719d(f);
            float d2 = (float) m1719d(f2);
            if (d > d2) {
                if (!this.f1368p) {
                    this.f1368p = true;
                }
                d = d2;
            }
            if (this.f1362j != d || this.f1360h != d2) {
                this.f1362j = d;
                this.f1360h = d2;
                this.f1361i = (float) ((int) ((d * 1.5f) + ((float) this.f1353a) + 0.5f));
                this.f1364l = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    static float m1716b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f1351q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    private void m1718b(Rect rect) {
        float f = this.f1360h;
        float f2 = 1.5f * f;
        this.f1357e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m1720g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2094b() {
        return this.f1358f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2095b(float f) {
        m1714a(this.f1362j, f);
    }

    /* renamed from: a */
    static float m1713a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1351q) * ((double) f2))) : f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2090a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1358f != f2) {
                this.f1358f = f2;
                this.f1364l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m1715a(Canvas canvas) {
        float f = this.f1358f;
        float f2 = (-f) - this.f1361i;
        float f3 = f + ((float) this.f1353a) + (this.f1362j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1357e.width() - f4 > 0.0f;
        boolean z2 = this.f1357e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1357e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1359g, this.f1355c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1357e.width() - f4, -this.f1358f, this.f1356d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1357e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1359g, this.f1355c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1357e.width() - f4, (-this.f1358f) + this.f1361i, this.f1356d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1357e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1359g, this.f1355c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1357e.height() - f4, -this.f1358f, this.f1356d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1357e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1359g, this.f1355c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1357e.height() - f4, -this.f1358f, this.f1356d);
        }
        canvas.restoreToCount(save4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2092a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2091a(ColorStateList colorStateList) {
        m1717b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo2089a() {
        return this.f1363k;
    }
}
