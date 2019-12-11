package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import p096e.p146l.C4224b;
import p096e.p146l.C4225c;
import p096e.p146l.C4226d;
import p096e.p146l.C4234l;

public class PagingIndicator extends View {

    /* renamed from: w0 */
    private static final TimeInterpolator f2610w0 = new DecelerateInterpolator();

    /* renamed from: x0 */
    private static final Property<C0614d, Float> f2611x0 = new C0611a(Float.class, "alpha");

    /* renamed from: y0 */
    private static final Property<C0614d, Float> f2612y0 = new C0612b(Float.class, "diameter");

    /* renamed from: z0 */
    private static final Property<C0614d, Float> f2613z0 = new C0613c(Float.class, "translation_x");

    /* renamed from: U */
    final int f2614U;

    /* renamed from: V */
    final int f2615V;

    /* renamed from: W */
    private final int f2616W;

    /* renamed from: a0 */
    final int f2617a0;

    /* renamed from: b0 */
    final int f2618b0;

    /* renamed from: c */
    boolean f2619c;

    /* renamed from: c0 */
    private final int f2620c0;

    /* renamed from: d0 */
    private final int f2621d0;

    /* renamed from: e0 */
    private C0614d[] f2622e0;

    /* renamed from: f0 */
    private int[] f2623f0;

    /* renamed from: g0 */
    private int[] f2624g0;

    /* renamed from: h0 */
    private int[] f2625h0;

    /* renamed from: i0 */
    int f2626i0;

    /* renamed from: j0 */
    private int f2627j0;

    /* renamed from: k0 */
    private int f2628k0;

    /* renamed from: l0 */
    private int f2629l0;

    /* renamed from: m0 */
    int f2630m0;

    /* renamed from: n0 */
    final Paint f2631n0;

    /* renamed from: o0 */
    final Paint f2632o0;

    /* renamed from: p0 */
    private final AnimatorSet f2633p0;

    /* renamed from: q0 */
    private final AnimatorSet f2634q0;

    /* renamed from: r0 */
    private final AnimatorSet f2635r0;

    /* renamed from: s0 */
    Bitmap f2636s0;

    /* renamed from: t0 */
    Paint f2637t0;

    /* renamed from: u0 */
    final Rect f2638u0;

    /* renamed from: v0 */
    final float f2639v0;

    /* renamed from: androidx.leanback.widget.PagingIndicator$a */
    static class C0611a extends Property<C0614d, Float> {
        C0611a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0614d dVar) {
            return Float.valueOf(dVar.mo3508c());
        }

        /* renamed from: a */
        public void set(C0614d dVar, Float f) {
            dVar.mo3504a(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$b */
    static class C0612b extends Property<C0614d, Float> {
        C0612b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0614d dVar) {
            return Float.valueOf(dVar.mo3510d());
        }

        /* renamed from: a */
        public void set(C0614d dVar, Float f) {
            dVar.mo3507b(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$c */
    static class C0613c extends Property<C0614d, Float> {
        C0613c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0614d dVar) {
            return Float.valueOf(dVar.mo3511e());
        }

        /* renamed from: a */
        public void set(C0614d dVar, Float f) {
            dVar.mo3509c(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$d */
    public class C0614d {

        /* renamed from: a */
        float f2640a;

        /* renamed from: b */
        int f2641b;

        /* renamed from: c */
        float f2642c;

        /* renamed from: d */
        float f2643d;

        /* renamed from: e */
        float f2644e;

        /* renamed from: f */
        float f2645f;

        /* renamed from: g */
        float f2646g;

        /* renamed from: h */
        float f2647h = 1.0f;

        /* renamed from: i */
        float f2648i;

        public C0614d() {
            float f = 1.0f;
            if (!PagingIndicator.this.f2619c) {
                f = -1.0f;
            }
            this.f2648i = f;
        }

        /* renamed from: a */
        public void mo3503a() {
            this.f2641b = Color.argb(Math.round(this.f2640a * 255.0f), Color.red(PagingIndicator.this.f2630m0), Color.green(PagingIndicator.this.f2630m0), Color.blue(PagingIndicator.this.f2630m0));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3506b() {
            this.f2642c = 0.0f;
            this.f2643d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2644e = (float) pagingIndicator.f2614U;
            this.f2645f = (float) pagingIndicator.f2615V;
            this.f2646g = this.f2645f * pagingIndicator.f2639v0;
            this.f2640a = 0.0f;
            mo3503a();
        }

        /* renamed from: c */
        public float mo3508c() {
            return this.f2640a;
        }

        /* renamed from: d */
        public float mo3510d() {
            return this.f2644e;
        }

        /* renamed from: e */
        public float mo3511e() {
            return this.f2642c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3512f() {
            this.f2648i = PagingIndicator.this.f2619c ? 1.0f : -1.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo3513g() {
            this.f2642c = 0.0f;
            this.f2643d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2644e = (float) pagingIndicator.f2617a0;
            this.f2645f = (float) pagingIndicator.f2618b0;
            this.f2646g = this.f2645f * pagingIndicator.f2639v0;
            this.f2640a = 1.0f;
            mo3503a();
        }

        /* renamed from: c */
        public void mo3509c(float f) {
            this.f2642c = f * this.f2647h * this.f2648i;
            PagingIndicator.this.invalidate();
        }

        /* renamed from: a */
        public void mo3504a(float f) {
            this.f2640a = f;
            mo3503a();
            PagingIndicator.this.invalidate();
        }

        /* renamed from: b */
        public void mo3507b(float f) {
            this.f2644e = f;
            float f2 = f / 2.0f;
            this.f2645f = f2;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2646g = f2 * pagingIndicator.f2639v0;
            pagingIndicator.invalidate();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3505a(Canvas canvas) {
            float f = this.f2643d + this.f2642c;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            canvas.drawCircle(f, (float) pagingIndicator.f2626i0, this.f2645f, pagingIndicator.f2631n0);
            if (this.f2640a > 0.0f) {
                PagingIndicator.this.f2632o0.setColor(this.f2641b);
                PagingIndicator pagingIndicator2 = PagingIndicator.this;
                canvas.drawCircle(f, (float) pagingIndicator2.f2626i0, this.f2645f, pagingIndicator2.f2632o0);
                PagingIndicator pagingIndicator3 = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator3.f2636s0;
                Rect rect = pagingIndicator3.f2638u0;
                float f2 = this.f2646g;
                int i = (int) (f - f2);
                int i2 = pagingIndicator3.f2626i0;
                canvas.drawBitmap(bitmap, rect, new Rect(i, (int) (((float) i2) - f2), (int) (f + f2), (int) (((float) i2) + f2)), PagingIndicator.this.f2637t0);
            }
        }
    }

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private int m3210a(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, getResources().getColor(i2));
    }

    /* renamed from: b */
    private int m3213b(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, getResources().getDimensionPixelOffset(i2));
    }

    /* renamed from: c */
    private Animator m3216c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(null, f2613z0, new float[]{(float) ((-this.f2620c0) + this.f2616W), 0.0f});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(f2610w0);
        return ofFloat;
    }

    /* renamed from: d */
    private Bitmap m3217d() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C4226d.lb_ic_nav_arrow);
        if (this.f2619c) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f2617a0 + getPaddingBottom() + this.f2621d0;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f2615V * 2) + (this.f2620c0 * 2) + ((this.f2627j0 - 3) * this.f2616W);
    }

    private void setSelectedPage(int i) {
        if (i != this.f2628k0) {
            this.f2628k0 = i;
            m3212a();
        }
    }

    /* access modifiers changed from: 0000 */
    public int[] getDotSelectedLeftX() {
        return this.f2624g0;
    }

    /* access modifiers changed from: 0000 */
    public int[] getDotSelectedRightX() {
        return this.f2625h0;
    }

    /* access modifiers changed from: 0000 */
    public int[] getDotSelectedX() {
        return this.f2623f0;
    }

    /* access modifiers changed from: 0000 */
    public int getPageCount() {
        return this.f2627j0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f2627j0; i++) {
            this.f2622e0[i].mo3505a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.f2619c != z) {
            this.f2619c = z;
            this.f2636s0 = m3217d();
            C0614d[] dVarArr = this.f2622e0;
            if (dVarArr != null) {
                for (C0614d f : dVarArr) {
                    f.mo3512f();
                }
            }
            m3215b();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        m3215b();
    }

    public void setArrowBackgroundColor(int i) {
        this.f2630m0 = i;
    }

    public void setArrowColor(int i) {
        if (this.f2637t0 == null) {
            this.f2637t0 = new Paint();
        }
        this.f2637t0.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.f2631n0.setColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.f2627j0 = i;
            this.f2622e0 = new C0614d[this.f2627j0];
            for (int i2 = 0; i2 < this.f2627j0; i2++) {
                this.f2622e0[i2] = new C0614d();
            }
            m3215b();
            setSelectedPage(0);
            return;
        }
        throw new IllegalArgumentException("The page count should be a positive integer");
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private Animator m3211a(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(null, f2611x0, new float[]{f, f2});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(f2610w0);
        return ofFloat;
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2635r0 = new AnimatorSet();
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.PagingIndicator, i, 0);
        this.f2615V = m3213b(obtainStyledAttributes, C4234l.PagingIndicator_lbDotRadius, C4225c.lb_page_indicator_dot_radius);
        this.f2614U = this.f2615V * 2;
        this.f2618b0 = m3213b(obtainStyledAttributes, C4234l.PagingIndicator_arrowRadius, C4225c.lb_page_indicator_arrow_radius);
        this.f2617a0 = this.f2618b0 * 2;
        this.f2616W = m3213b(obtainStyledAttributes, C4234l.PagingIndicator_dotToDotGap, C4225c.lb_page_indicator_dot_gap);
        this.f2620c0 = m3213b(obtainStyledAttributes, C4234l.PagingIndicator_dotToArrowGap, C4225c.lb_page_indicator_arrow_gap);
        int a = m3210a(obtainStyledAttributes, C4234l.PagingIndicator_dotBgColor, C4224b.lb_page_indicator_dot);
        this.f2631n0 = new Paint(1);
        this.f2631n0.setColor(a);
        this.f2630m0 = m3210a(obtainStyledAttributes, C4234l.PagingIndicator_arrowBgColor, C4224b.lb_page_indicator_arrow_background);
        if (this.f2637t0 == null && obtainStyledAttributes.hasValue(C4234l.PagingIndicator_arrowColor)) {
            setArrowColor(obtainStyledAttributes.getColor(C4234l.PagingIndicator_arrowColor, 0));
        }
        obtainStyledAttributes.recycle();
        this.f2619c = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(C4224b.lb_page_indicator_arrow_shadow);
        this.f2621d0 = resources.getDimensionPixelSize(C4225c.lb_page_indicator_arrow_shadow_radius);
        this.f2632o0 = new Paint(1);
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(C4225c.lb_page_indicator_arrow_shadow_offset);
        this.f2632o0.setShadowLayer((float) this.f2621d0, dimensionPixelSize, dimensionPixelSize, color);
        this.f2636s0 = m3217d();
        this.f2638u0 = new Rect(0, 0, this.f2636s0.getWidth(), this.f2636s0.getHeight());
        this.f2639v0 = ((float) this.f2636s0.getWidth()) / ((float) this.f2617a0);
        this.f2633p0 = new AnimatorSet();
        this.f2633p0.playTogether(new Animator[]{m3211a(0.0f, 1.0f), m3214b((float) (this.f2615V * 2), (float) (this.f2618b0 * 2)), m3216c()});
        this.f2634q0 = new AnimatorSet();
        this.f2634q0.playTogether(new Animator[]{m3211a(1.0f, 0.0f), m3214b((float) (this.f2618b0 * 2), (float) (this.f2615V * 2)), m3216c()});
        this.f2635r0.playTogether(new Animator[]{this.f2633p0, this.f2634q0});
        setLayerType(1, null);
    }

    /* renamed from: b */
    private Animator m3214b(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(null, f2612y0, new float[]{f, f2});
        ofFloat.setDuration(417);
        ofFloat.setInterpolator(f2610w0);
        return ofFloat;
    }

    /* renamed from: a */
    private void m3212a() {
        int i;
        float f;
        int i2 = 0;
        while (true) {
            i = this.f2628k0;
            f = -1.0f;
            if (i2 >= i) {
                break;
            }
            this.f2622e0[i2].mo3506b();
            C0614d dVar = this.f2622e0[i2];
            if (i2 != this.f2629l0) {
                f = 1.0f;
            }
            dVar.f2647h = f;
            this.f2622e0[i2].f2643d = (float) this.f2624g0[i2];
            i2++;
        }
        this.f2622e0[i].mo3513g();
        C0614d[] dVarArr = this.f2622e0;
        int i3 = this.f2628k0;
        C0614d dVar2 = dVarArr[i3];
        if (this.f2629l0 >= i3) {
            f = 1.0f;
        }
        dVar2.f2647h = f;
        C0614d[] dVarArr2 = this.f2622e0;
        int i4 = this.f2628k0;
        dVarArr2[i4].f2643d = (float) this.f2623f0[i4];
        while (true) {
            i4++;
            if (i4 < this.f2627j0) {
                this.f2622e0[i4].mo3506b();
                C0614d[] dVarArr3 = this.f2622e0;
                dVarArr3[i4].f2647h = 1.0f;
                dVarArr3[i4].f2643d = (float) this.f2625h0[i4];
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3215b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.f2627j0;
        this.f2623f0 = new int[i2];
        this.f2624g0 = new int[i2];
        this.f2625h0 = new int[i2];
        int i3 = 1;
        if (this.f2619c) {
            int i4 = i - (requiredWidth / 2);
            int[] iArr = this.f2623f0;
            int i5 = this.f2615V;
            int i6 = i4 + i5;
            int i7 = this.f2616W;
            int i8 = i6 - i7;
            int i9 = this.f2620c0;
            iArr[0] = i8 + i9;
            this.f2624g0[0] = i4 + i5;
            this.f2625h0[0] = ((i4 + i5) - (i7 * 2)) + (i9 * 2);
            while (i3 < this.f2627j0) {
                int[] iArr2 = this.f2623f0;
                int[] iArr3 = this.f2624g0;
                int i10 = i3 - 1;
                int i11 = iArr3[i10];
                int i12 = this.f2620c0;
                iArr2[i3] = i11 + i12;
                iArr3[i3] = iArr3[i10] + this.f2616W;
                this.f2625h0[i3] = iArr2[i10] + i12;
                i3++;
            }
        } else {
            int i13 = i + (requiredWidth / 2);
            int[] iArr4 = this.f2623f0;
            int i14 = this.f2615V;
            int i15 = i13 - i14;
            int i16 = this.f2616W;
            int i17 = i15 + i16;
            int i18 = this.f2620c0;
            iArr4[0] = i17 - i18;
            this.f2624g0[0] = i13 - i14;
            this.f2625h0[0] = ((i13 - i14) + (i16 * 2)) - (i18 * 2);
            while (i3 < this.f2627j0) {
                int[] iArr5 = this.f2623f0;
                int[] iArr6 = this.f2624g0;
                int i19 = i3 - 1;
                int i20 = iArr6[i19];
                int i21 = this.f2620c0;
                iArr5[i3] = i20 - i21;
                iArr6[i3] = iArr6[i19] - this.f2616W;
                this.f2625h0[i3] = iArr5[i19] - i21;
                i3++;
            }
        }
        this.f2626i0 = paddingTop + this.f2618b0;
        m3212a();
    }
}
