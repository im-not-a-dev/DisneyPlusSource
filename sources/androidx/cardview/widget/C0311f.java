package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
/* compiled from: RoundRectDrawable */
class C0311f extends Drawable {

    /* renamed from: a */
    private float f1340a;

    /* renamed from: b */
    private final Paint f1341b;

    /* renamed from: c */
    private final RectF f1342c;

    /* renamed from: d */
    private final Rect f1343d;

    /* renamed from: e */
    private float f1344e;

    /* renamed from: f */
    private boolean f1345f = false;

    /* renamed from: g */
    private boolean f1346g = true;

    /* renamed from: h */
    private ColorStateList f1347h;

    /* renamed from: i */
    private PorterDuffColorFilter f1348i;

    /* renamed from: j */
    private ColorStateList f1349j;

    /* renamed from: k */
    private Mode f1350k = Mode.SRC_IN;

    C0311f(ColorStateList colorStateList, float f) {
        this.f1340a = f;
        this.f1341b = new Paint(5);
        m1706b(colorStateList);
        this.f1342c = new RectF();
        this.f1343d = new Rect();
    }

    /* renamed from: b */
    private void m1706b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1347h = colorStateList;
        this.f1341b.setColor(this.f1347h.getColorForState(getState(), this.f1347h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2075a(float f, boolean z, boolean z2) {
        if (f != this.f1344e || this.f1345f != z || this.f1346g != z2) {
            this.f1344e = f;
            this.f1345f = z;
            this.f1346g = z2;
            m1705a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo2078c() {
        return this.f1340a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1341b;
        if (this.f1348i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1348i);
            z = true;
        }
        RectF rectF = this.f1342c;
        float f = this.f1340a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1343d, this.f1340a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1349j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f1347h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1705a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1347h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1341b.getColor();
        if (z) {
            this.f1341b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1349j;
        if (colorStateList2 != null) {
            Mode mode = this.f1350k;
            if (mode != null) {
                this.f1348i = m1704a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f1341b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1341b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1349j = colorStateList;
        this.f1348i = m1704a(this.f1349j, this.f1350k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f1350k = mode;
        this.f1348i = m1704a(this.f1349j, this.f1350k);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2077b() {
        return this.f1344e;
    }

    /* renamed from: a */
    private void m1705a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1342c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1343d.set(rect);
        if (this.f1345f) {
            float b = C0312g.m1716b(this.f1344e, this.f1340a, this.f1346g);
            this.f1343d.inset((int) Math.ceil((double) C0312g.m1713a(this.f1344e, this.f1340a, this.f1346g)), (int) Math.ceil((double) b));
            this.f1342c.set(this.f1343d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2074a(float f) {
        if (f != this.f1340a) {
            this.f1340a = f;
            m1705a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo2076a(ColorStateList colorStateList) {
        m1706b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: a */
    public ColorStateList mo2073a() {
        return this.f1347h;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1704a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
