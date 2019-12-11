package p163g.p449j.p450a.p468b.p470m;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.C0492a;
import com.google.android.material.internal.C10321h;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p477s.C11499a;
import p163g.p449j.p450a.p468b.p478t.C11503a;

/* renamed from: g.j.a.b.m.c */
/* compiled from: MaterialButtonHelper */
class C11480c {

    /* renamed from: w */
    private static final boolean f26845w = (VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final C11478a f26846a;

    /* renamed from: b */
    private int f26847b;

    /* renamed from: c */
    private int f26848c;

    /* renamed from: d */
    private int f26849d;

    /* renamed from: e */
    private int f26850e;

    /* renamed from: f */
    private int f26851f;

    /* renamed from: g */
    private int f26852g;

    /* renamed from: h */
    private Mode f26853h;

    /* renamed from: i */
    private ColorStateList f26854i;

    /* renamed from: j */
    private ColorStateList f26855j;

    /* renamed from: k */
    private ColorStateList f26856k;

    /* renamed from: l */
    private final Paint f26857l = new Paint(1);

    /* renamed from: m */
    private final Rect f26858m = new Rect();

    /* renamed from: n */
    private final RectF f26859n = new RectF();

    /* renamed from: o */
    private GradientDrawable f26860o;

    /* renamed from: p */
    private Drawable f26861p;

    /* renamed from: q */
    private GradientDrawable f26862q;

    /* renamed from: r */
    private Drawable f26863r;

    /* renamed from: s */
    private GradientDrawable f26864s;

    /* renamed from: t */
    private GradientDrawable f26865t;

    /* renamed from: u */
    private GradientDrawable f26866u;

    /* renamed from: v */
    private boolean f26867v = false;

    public C11480c(C11478a aVar) {
        this.f26846a = aVar;
    }

    /* renamed from: i */
    private Drawable m37026i() {
        this.f26860o = new GradientDrawable();
        this.f26860o.setCornerRadius(((float) this.f26851f) + 1.0E-5f);
        this.f26860o.setColor(-1);
        this.f26861p = C0492a.m2652i(this.f26860o);
        C0492a.m2637a(this.f26861p, this.f26854i);
        Mode mode = this.f26853h;
        if (mode != null) {
            C0492a.m2640a(this.f26861p, mode);
        }
        this.f26862q = new GradientDrawable();
        this.f26862q.setCornerRadius(((float) this.f26851f) + 1.0E-5f);
        this.f26862q.setColor(-1);
        this.f26863r = C0492a.m2652i(this.f26862q);
        C0492a.m2637a(this.f26863r, this.f26856k);
        return m37025a((Drawable) new LayerDrawable(new Drawable[]{this.f26861p, this.f26863r}));
    }

    @TargetApi(21)
    /* renamed from: j */
    private Drawable m37027j() {
        this.f26864s = new GradientDrawable();
        this.f26864s.setCornerRadius(((float) this.f26851f) + 1.0E-5f);
        this.f26864s.setColor(-1);
        m37031n();
        this.f26865t = new GradientDrawable();
        this.f26865t.setCornerRadius(((float) this.f26851f) + 1.0E-5f);
        this.f26865t.setColor(0);
        this.f26865t.setStroke(this.f26852g, this.f26855j);
        InsetDrawable a = m37025a((Drawable) new LayerDrawable(new Drawable[]{this.f26864s, this.f26865t}));
        this.f26866u = new GradientDrawable();
        this.f26866u.setCornerRadius(((float) this.f26851f) + 1.0E-5f);
        this.f26866u.setColor(-1);
        return new C11479b(C11503a.m37104a(this.f26856k), a, this.f26866u);
    }

    /* renamed from: k */
    private GradientDrawable m37028k() {
        if (!f26845w || this.f26846a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f26846a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    /* renamed from: l */
    private GradientDrawable m37029l() {
        if (!f26845w || this.f26846a.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.f26846a.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    /* renamed from: m */
    private void m37030m() {
        if (f26845w && this.f26865t != null) {
            this.f26846a.setInternalBackground(m37027j());
        } else if (!f26845w) {
            this.f26846a.invalidate();
        }
    }

    /* renamed from: n */
    private void m37031n() {
        GradientDrawable gradientDrawable = this.f26864s;
        if (gradientDrawable != null) {
            C0492a.m2637a((Drawable) gradientDrawable, this.f26854i);
            Mode mode = this.f26853h;
            if (mode != null) {
                C0492a.m2640a((Drawable) this.f26864s, mode);
            }
        }
    }

    /* renamed from: a */
    public void mo29359a(TypedArray typedArray) {
        int i = 0;
        this.f26847b = typedArray.getDimensionPixelOffset(C11467k.MaterialButton_android_insetLeft, 0);
        this.f26848c = typedArray.getDimensionPixelOffset(C11467k.MaterialButton_android_insetRight, 0);
        this.f26849d = typedArray.getDimensionPixelOffset(C11467k.MaterialButton_android_insetTop, 0);
        this.f26850e = typedArray.getDimensionPixelOffset(C11467k.MaterialButton_android_insetBottom, 0);
        this.f26851f = typedArray.getDimensionPixelSize(C11467k.MaterialButton_cornerRadius, 0);
        this.f26852g = typedArray.getDimensionPixelSize(C11467k.MaterialButton_strokeWidth, 0);
        this.f26853h = C10321h.m32560a(typedArray.getInt(C11467k.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.f26854i = C11499a.m37087a(this.f26846a.getContext(), typedArray, C11467k.MaterialButton_backgroundTint);
        this.f26855j = C11499a.m37087a(this.f26846a.getContext(), typedArray, C11467k.MaterialButton_strokeColor);
        this.f26856k = C11499a.m37087a(this.f26846a.getContext(), typedArray, C11467k.MaterialButton_rippleColor);
        this.f26857l.setStyle(Style.STROKE);
        this.f26857l.setStrokeWidth((float) this.f26852g);
        Paint paint = this.f26857l;
        ColorStateList colorStateList = this.f26855j;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(this.f26846a.getDrawableState(), 0);
        }
        paint.setColor(i);
        int r = C4187x.m14403r(this.f26846a);
        int paddingTop = this.f26846a.getPaddingTop();
        int q = C4187x.m14402q(this.f26846a);
        int paddingBottom = this.f26846a.getPaddingBottom();
        this.f26846a.setInternalBackground(f26845w ? m37027j() : m37026i());
        C4187x.m14354a(this.f26846a, r + this.f26847b, paddingTop + this.f26849d, q + this.f26848c, paddingBottom + this.f26850e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo29362b() {
        return this.f26856k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo29367c(ColorStateList colorStateList) {
        if (this.f26854i != colorStateList) {
            this.f26854i = colorStateList;
            if (f26845w) {
                m37031n();
                return;
            }
            Drawable drawable = this.f26861p;
            if (drawable != null) {
                C0492a.m2637a(drawable, this.f26854i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo29368d() {
        return this.f26852g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ColorStateList mo29369e() {
        return this.f26854i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Mode mo29370f() {
        return this.f26853h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo29371g() {
        return this.f26867v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo29372h() {
        this.f26867v = true;
        this.f26846a.setSupportBackgroundTintList(this.f26854i);
        this.f26846a.setSupportBackgroundTintMode(this.f26853h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo29364b(ColorStateList colorStateList) {
        if (this.f26855j != colorStateList) {
            this.f26855j = colorStateList;
            Paint paint = this.f26857l;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.f26846a.getDrawableState(), 0);
            }
            paint.setColor(i);
            m37030m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo29365c() {
        return this.f26855j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo29363b(int i) {
        if (this.f26851f != i) {
            this.f26851f = i;
            if (f26845w && this.f26864s != null && this.f26865t != null && this.f26866u != null) {
                if (VERSION.SDK_INT == 21) {
                    float f = ((float) i) + 1.0E-5f;
                    m37028k().setCornerRadius(f);
                    m37029l().setCornerRadius(f);
                }
                float f2 = ((float) i) + 1.0E-5f;
                this.f26864s.setCornerRadius(f2);
                this.f26865t.setCornerRadius(f2);
                this.f26866u.setCornerRadius(f2);
            } else if (!f26845w) {
                GradientDrawable gradientDrawable = this.f26860o;
                if (gradientDrawable != null && this.f26862q != null) {
                    float f3 = ((float) i) + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f3);
                    this.f26862q.setCornerRadius(f3);
                    this.f26846a.invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo29366c(int i) {
        if (this.f26852g != i) {
            this.f26852g = i;
            this.f26857l.setStrokeWidth((float) i);
            m37030m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29360a(Canvas canvas) {
        if (canvas != null && this.f26855j != null && this.f26852g > 0) {
            this.f26858m.set(this.f26846a.getBackground().getBounds());
            RectF rectF = this.f26859n;
            Rect rect = this.f26858m;
            float f = (float) rect.left;
            int i = this.f26852g;
            rectF.set(f + (((float) i) / 2.0f) + ((float) this.f26847b), ((float) rect.top) + (((float) i) / 2.0f) + ((float) this.f26849d), (((float) rect.right) - (((float) i) / 2.0f)) - ((float) this.f26848c), (((float) rect.bottom) - (((float) i) / 2.0f)) - ((float) this.f26850e));
            float f2 = ((float) this.f26851f) - (((float) this.f26852g) / 2.0f);
            canvas.drawRoundRect(this.f26859n, f2, f2, this.f26857l);
        }
    }

    /* renamed from: a */
    private InsetDrawable m37025a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f26847b, this.f26849d, this.f26848c, this.f26850e);
        return insetDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29361a(Mode mode) {
        if (this.f26853h != mode) {
            this.f26853h = mode;
            if (f26845w) {
                m37031n();
                return;
            }
            Drawable drawable = this.f26861p;
            if (drawable != null) {
                Mode mode2 = this.f26853h;
                if (mode2 != null) {
                    C0492a.m2640a(drawable, mode2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29357a(int i, int i2) {
        GradientDrawable gradientDrawable = this.f26866u;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(this.f26847b, this.f26849d, i2 - this.f26848c, i - this.f26850e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29356a(int i) {
        if (f26845w) {
            GradientDrawable gradientDrawable = this.f26864s;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return;
            }
        }
        if (!f26845w) {
            GradientDrawable gradientDrawable2 = this.f26860o;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29358a(ColorStateList colorStateList) {
        if (this.f26856k != colorStateList) {
            this.f26856k = colorStateList;
            if (f26845w && (this.f26846a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f26846a.getBackground()).setColor(colorStateList);
            } else if (!f26845w) {
                Drawable drawable = this.f26863r;
                if (drawable != null) {
                    C0492a.m2637a(drawable, colorStateList);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29355a() {
        return this.f26851f;
    }
}
