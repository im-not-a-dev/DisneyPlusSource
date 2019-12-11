package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.graphics.drawable.C0494c;
import com.google.android.material.internal.C10320g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p096e.p097a.p098k.p099a.C3868a;
import p096e.p121h.p122j.p124d.C4039f.C4040a;
import p096e.p121h.p125k.C4045a;
import p096e.p121h.p132q.C4087a;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p471n.C11481a;
import p163g.p449j.p450a.p468b.p474p.C11494a;
import p163g.p449j.p450a.p468b.p477s.C11499a;
import p163g.p449j.p450a.p468b.p477s.C11500b;
import p163g.p449j.p450a.p468b.p478t.C11503a;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C10293a extends Drawable implements C0494c, Callback {

    /* renamed from: a1 */
    private static final int[] f24238a1 = {16842910};

    /* renamed from: A0 */
    private final TextPaint f24239A0 = new TextPaint(1);

    /* renamed from: B0 */
    private final Paint f24240B0 = new Paint(1);

    /* renamed from: C0 */
    private final Paint f24241C0;

    /* renamed from: D0 */
    private final FontMetrics f24242D0 = new FontMetrics();

    /* renamed from: E0 */
    private final RectF f24243E0 = new RectF();

    /* renamed from: F0 */
    private final PointF f24244F0 = new PointF();

    /* renamed from: G0 */
    private int f24245G0;

    /* renamed from: H0 */
    private int f24246H0;

    /* renamed from: I0 */
    private int f24247I0;

    /* renamed from: J0 */
    private int f24248J0;

    /* renamed from: K0 */
    private boolean f24249K0;

    /* renamed from: L0 */
    private int f24250L0;

    /* renamed from: M0 */
    private int f24251M0 = 255;

    /* renamed from: N0 */
    private ColorFilter f24252N0;

    /* renamed from: O0 */
    private PorterDuffColorFilter f24253O0;

    /* renamed from: P0 */
    private ColorStateList f24254P0;

    /* renamed from: Q0 */
    private Mode f24255Q0 = Mode.SRC_IN;

    /* renamed from: R0 */
    private int[] f24256R0;

    /* renamed from: S0 */
    private boolean f24257S0;

    /* renamed from: T0 */
    private ColorStateList f24258T0;

    /* renamed from: U */
    private float f24259U;

    /* renamed from: U0 */
    private WeakReference<C10295b> f24260U0 = new WeakReference<>(null);

    /* renamed from: V */
    private float f24261V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public boolean f24262V0 = true;

    /* renamed from: W */
    private ColorStateList f24263W;

    /* renamed from: W0 */
    private float f24264W0;

    /* renamed from: X */
    private float f24265X;

    /* renamed from: X0 */
    private TruncateAt f24266X0;

    /* renamed from: Y */
    private ColorStateList f24267Y;

    /* renamed from: Y0 */
    private boolean f24268Y0;

    /* renamed from: Z */
    private CharSequence f24269Z;

    /* renamed from: Z0 */
    private int f24270Z0;

    /* renamed from: a0 */
    private CharSequence f24271a0;

    /* renamed from: b0 */
    private C11500b f24272b0;

    /* renamed from: c */
    private ColorStateList f24273c;

    /* renamed from: c0 */
    private final C4040a f24274c0 = new C10294a();

    /* renamed from: d0 */
    private boolean f24275d0;

    /* renamed from: e0 */
    private Drawable f24276e0;

    /* renamed from: f0 */
    private ColorStateList f24277f0;

    /* renamed from: g0 */
    private float f24278g0;

    /* renamed from: h0 */
    private boolean f24279h0;

    /* renamed from: i0 */
    private Drawable f24280i0;

    /* renamed from: j0 */
    private ColorStateList f24281j0;

    /* renamed from: k0 */
    private float f24282k0;

    /* renamed from: l0 */
    private CharSequence f24283l0;

    /* renamed from: m0 */
    private boolean f24284m0;

    /* renamed from: n0 */
    private boolean f24285n0;

    /* renamed from: o0 */
    private Drawable f24286o0;

    /* renamed from: p0 */
    private C11475h f24287p0;

    /* renamed from: q0 */
    private C11475h f24288q0;

    /* renamed from: r0 */
    private float f24289r0;

    /* renamed from: s0 */
    private float f24290s0;

    /* renamed from: t0 */
    private float f24291t0;

    /* renamed from: u0 */
    private float f24292u0;

    /* renamed from: v0 */
    private float f24293v0;

    /* renamed from: w0 */
    private float f24294w0;

    /* renamed from: x0 */
    private float f24295x0;

    /* renamed from: y0 */
    private float f24296y0;

    /* renamed from: z0 */
    private final Context f24297z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    class C10294a extends C4040a {
        C10294a() {
        }

        /* renamed from: a */
        public void mo1956a(int i) {
        }

        /* renamed from: a */
        public void mo1957a(Typeface typeface) {
            C10293a.this.f24262V0 = true;
            C10293a.this.mo26580I();
            C10293a.this.invalidateSelf();
        }
    }

    /* renamed from: com.google.android.material.chip.a$b */
    /* compiled from: ChipDrawable */
    public interface C10295b {
        /* renamed from: a */
        void mo26439a();
    }

    private C10293a(Context context) {
        this.f24297z0 = context;
        this.f24269Z = "";
        this.f24239A0.density = context.getResources().getDisplayMetrics().density;
        this.f24241C0 = null;
        Paint paint = this.f24241C0;
        if (paint != null) {
            paint.setStyle(Style.STROKE);
        }
        setState(f24238a1);
        mo26595a(f24238a1);
        this.f24268Y0 = true;
    }

    /* renamed from: K */
    private float m32259K() {
        if (m32266R()) {
            return this.f24294w0 + this.f24282k0 + this.f24295x0;
        }
        return 0.0f;
    }

    /* renamed from: L */
    private float m32260L() {
        this.f24239A0.getFontMetrics(this.f24242D0);
        FontMetrics fontMetrics = this.f24242D0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: M */
    private boolean m32261M() {
        return this.f24285n0 && this.f24286o0 != null && this.f24284m0;
    }

    /* renamed from: N */
    private float m32262N() {
        if (!this.f24262V0) {
            return this.f24264W0;
        }
        this.f24264W0 = m32278c(this.f24271a0);
        this.f24262V0 = false;
        return this.f24264W0;
    }

    /* renamed from: O */
    private ColorFilter m32263O() {
        ColorFilter colorFilter = this.f24252N0;
        return colorFilter != null ? colorFilter : this.f24253O0;
    }

    /* renamed from: P */
    private boolean m32264P() {
        return this.f24285n0 && this.f24286o0 != null && this.f24249K0;
    }

    /* renamed from: Q */
    private boolean m32265Q() {
        return this.f24275d0 && this.f24276e0 != null;
    }

    /* renamed from: R */
    private boolean m32266R() {
        return this.f24279h0 && this.f24280i0 != null;
    }

    /* renamed from: S */
    private void m32267S() {
        this.f24258T0 = this.f24257S0 ? C11503a.m37104a(this.f24267Y) : null;
    }

    /* renamed from: b */
    private void m32275b(Canvas canvas, Rect rect) {
        this.f24240B0.setColor(this.f24245G0);
        this.f24240B0.setStyle(Style.FILL);
        this.f24240B0.setColorFilter(m32263O());
        this.f24243E0.set(rect);
        RectF rectF = this.f24243E0;
        float f = this.f24261V;
        canvas.drawRoundRect(rectF, f, f, this.f24240B0);
    }

    /* renamed from: c */
    private float m32278c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f24239A0.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    private void m32281d(Canvas canvas, Rect rect) {
        if (this.f24265X > 0.0f) {
            this.f24240B0.setColor(this.f24246H0);
            this.f24240B0.setStyle(Style.STROKE);
            this.f24240B0.setColorFilter(m32263O());
            RectF rectF = this.f24243E0;
            float f = (float) rect.left;
            float f2 = this.f24265X;
            rectF.set(f + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.f24261V - (this.f24265X / 2.0f);
            canvas.drawRoundRect(this.f24243E0, f3, f3, this.f24240B0);
        }
    }

    /* renamed from: e */
    private void m32284e(Canvas canvas, Rect rect) {
        if (m32266R()) {
            m32280c(rect, this.f24243E0);
            RectF rectF = this.f24243E0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24280i0.setBounds(0, 0, (int) this.f24243E0.width(), (int) this.f24243E0.height());
            this.f24280i0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: g */
    private void m32290g(Canvas canvas, Rect rect) {
        Paint paint = this.f24241C0;
        if (paint != null) {
            paint.setColor(C4045a.m13882c(-16777216, 127));
            canvas.drawRect(rect, this.f24241C0);
            if (m32265Q() || m32264P()) {
                m32270a(rect, this.f24243E0);
                canvas.drawRect(this.f24243E0, this.f24241C0);
            }
            if (this.f24271a0 != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f24241C0);
            }
            if (m32266R()) {
                m32280c(rect, this.f24243E0);
                canvas.drawRect(this.f24243E0, this.f24241C0);
            }
            this.f24241C0.setColor(C4045a.m13882c(-65536, 127));
            m32276b(rect, this.f24243E0);
            canvas.drawRect(this.f24243E0, this.f24241C0);
            this.f24241C0.setColor(C4045a.m13882c(-16711936, 127));
            m32282d(rect, this.f24243E0);
            canvas.drawRect(this.f24243E0, this.f24241C0);
        }
    }

    /* renamed from: h */
    private void m32291h(Canvas canvas, Rect rect) {
        if (this.f24271a0 != null) {
            Align a = mo26583a(rect, this.f24244F0);
            m32285e(rect, this.f24243E0);
            if (this.f24272b0 != null) {
                this.f24239A0.drawableState = getState();
                this.f24272b0.mo29417b(this.f24297z0, this.f24239A0, this.f24274c0);
            }
            this.f24239A0.setTextAlign(a);
            int i = 0;
            boolean z = Math.round(m32262N()) > Math.round(this.f24243E0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f24243E0);
            }
            CharSequence charSequence = this.f24271a0;
            if (z && this.f24266X0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f24239A0, this.f24243E0.width(), this.f24266X0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f24244F0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f24239A0);
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: A */
    public C11500b mo26569A() {
        return this.f24272b0;
    }

    /* renamed from: B */
    public float mo26571B() {
        return this.f24293v0;
    }

    /* renamed from: C */
    public float mo26573C() {
        return this.f24292u0;
    }

    /* renamed from: D */
    public boolean mo26575D() {
        return this.f24284m0;
    }

    /* renamed from: E */
    public boolean mo26576E() {
        return this.f24285n0;
    }

    /* renamed from: F */
    public boolean mo26577F() {
        return this.f24275d0;
    }

    /* renamed from: G */
    public boolean mo26578G() {
        return m32286e(this.f24280i0);
    }

    /* renamed from: H */
    public boolean mo26579H() {
        return this.f24279h0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo26580I() {
        C10295b bVar = (C10295b) this.f24260U0.get();
        if (bVar != null) {
            bVar.mo26439a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public boolean mo26581J() {
        return this.f24268Y0;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f24251M0;
            if (i2 < 255) {
                i = C11481a.m37050a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m32275b(canvas, bounds);
            m32281d(canvas, bounds);
            m32287f(canvas, bounds);
            m32279c(canvas, bounds);
            m32269a(canvas, bounds);
            if (this.f24268Y0) {
                m32291h(canvas, bounds);
            }
            m32284e(canvas, bounds);
            m32290g(canvas, bounds);
            if (this.f24251M0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: f */
    public void mo26624f(boolean z) {
        if (this.f24257S0 != z) {
            this.f24257S0 = z;
            m32267S();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f24251M0;
    }

    public ColorFilter getColorFilter() {
        return this.f24252N0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f24259U;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f24289r0 + mo26582a() + this.f24292u0 + m32262N() + this.f24293v0 + m32259K() + this.f24296y0), this.f24270Z0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f24261V);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f24261V);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: i */
    public float mo26637i() {
        return this.f24259U;
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m32289f(this.f24273c) || m32289f(this.f24263W) || (this.f24257S0 && m32289f(this.f24258T0)) || m32277b(this.f24272b0) || m32261M() || m32286e(this.f24276e0) || m32286e(this.f24286o0) || m32289f(this.f24254P0);
    }

    /* renamed from: j */
    public void mo26644j(int i) {
        mo26609c(this.f24297z0.getResources().getBoolean(i));
    }

    /* renamed from: k */
    public void mo26647k(int i) {
        mo26611d(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: l */
    public float mo26648l() {
        return this.f24265X;
    }

    /* renamed from: m */
    public void mo26653m(int i) {
        mo26607c(C3868a.m12945b(this.f24297z0, i));
    }

    /* renamed from: n */
    public void mo26655n(int i) {
        mo26622f(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: o */
    public float mo26656o() {
        return this.f24295x0;
    }

    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m32265Q()) {
            onLayoutDirectionChanged |= this.f24276e0.setLayoutDirection(i);
        }
        if (m32264P()) {
            onLayoutDirectionChanged |= this.f24286o0.setLayoutDirection(i);
        }
        if (m32266R()) {
            onLayoutDirectionChanged |= this.f24280i0.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m32265Q()) {
            onLevelChange |= this.f24276e0.setLevel(i);
        }
        if (m32264P()) {
            onLevelChange |= this.f24286o0.setLevel(i);
        }
        if (m32266R()) {
            onLevelChange |= this.f24280i0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return m32274a(iArr, mo26666r());
    }

    /* renamed from: p */
    public void mo26662p(int i) {
        mo26608c(C3868a.m12946c(this.f24297z0, i));
    }

    /* renamed from: q */
    public void mo26664q(int i) {
        mo26635h(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: r */
    public int[] mo26666r() {
        return this.f24256R0;
    }

    /* renamed from: s */
    public ColorStateList mo26667s() {
        return this.f24281j0;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f24251M0 != i) {
            this.f24251M0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f24252N0 != colorFilter) {
            this.f24252N0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f24254P0 != colorStateList) {
            this.f24254P0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f24255Q0 != mode) {
            this.f24255Q0 = mode;
            this.f24253O0 = C11494a.m37075a(this, this.f24254P0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m32265Q()) {
            visible |= this.f24276e0.setVisible(z, z2);
        }
        if (m32264P()) {
            visible |= this.f24286o0.setVisible(z, z2);
        }
        if (m32266R()) {
            visible |= this.f24280i0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public TruncateAt mo26673t() {
        return this.f24266X0;
    }

    /* renamed from: u */
    public C11475h mo26675u() {
        return this.f24288q0;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public float mo26678v() {
        return this.f24291t0;
    }

    /* renamed from: w */
    public float mo26680w() {
        return this.f24290s0;
    }

    /* renamed from: x */
    public ColorStateList mo26682x() {
        return this.f24267Y;
    }

    /* renamed from: y */
    public void mo26685y(int i) {
        mo26619e(C3868a.m12945b(this.f24297z0, i));
    }

    /* renamed from: z */
    public CharSequence mo26686z() {
        return this.f24269Z;
    }

    /* renamed from: a */
    public static C10293a m32268a(Context context, AttributeSet attributeSet, int i, int i2) {
        C10293a aVar = new C10293a(context);
        aVar.m32271a(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: c */
    private void m32279c(Canvas canvas, Rect rect) {
        if (m32265Q()) {
            m32270a(rect, this.f24243E0);
            RectF rectF = this.f24243E0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24276e0.setBounds(0, 0, (int) this.f24243E0.width(), (int) this.f24243E0.height());
            this.f24276e0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: A */
    public void mo26570A(int i) {
        mo26592a(new C11500b(this.f24297z0, i));
    }

    /* renamed from: B */
    public void mo26572B(int i) {
        mo26649l(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: C */
    public void mo26574C(int i) {
        mo26652m(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: i */
    public void mo26639i(int i) {
        mo26599b(C3868a.m12945b(this.f24297z0, i));
    }

    /* renamed from: j */
    public float mo26642j() {
        return this.f24289r0;
    }

    /* renamed from: k */
    public ColorStateList mo26645k() {
        return this.f24263W;
    }

    /* renamed from: l */
    public void mo26650l(int i) {
        mo26617e(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: m */
    public Drawable mo26651m() {
        Drawable drawable = this.f24280i0;
        if (drawable != null) {
            return C0492a.m2651h(drawable);
        }
        return null;
    }

    /* renamed from: n */
    public CharSequence mo26654n() {
        return this.f24283l0;
    }

    /* renamed from: o */
    public void mo26657o(int i) {
        mo26626g(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: p */
    public float mo26661p() {
        return this.f24282k0;
    }

    /* renamed from: q */
    public float mo26663q() {
        return this.f24294w0;
    }

    /* renamed from: r */
    public void mo26665r(int i) {
        mo26638i(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: s */
    public void mo26668s(int i) {
        mo26613d(C3868a.m12945b(this.f24297z0, i));
    }

    /* renamed from: t */
    public void mo26674t(int i) {
        mo26614d(this.f24297z0.getResources().getBoolean(i));
    }

    /* renamed from: u */
    public void mo26676u(int i) {
        mo26591a(C11475h.m37006a(this.f24297z0, i));
    }

    /* renamed from: v */
    public void mo26679v(int i) {
        mo26643j(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: w */
    public void mo26681w(int i) {
        mo26646k(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: x */
    public void mo26683x(int i) {
        this.f24270Z0 = i;
    }

    /* renamed from: y */
    public C11475h mo26684y() {
        return this.f24287p0;
    }

    /* renamed from: z */
    public void mo26687z(int i) {
        mo26601b(C11475h.m37006a(this.f24297z0, i));
    }

    /* renamed from: i */
    public void mo26638i(float f) {
        if (this.f24294w0 != f) {
            this.f24294w0 = f;
            invalidateSelf();
            if (m32266R()) {
                mo26580I();
            }
        }
    }

    /* renamed from: j */
    public void mo26643j(float f) {
        if (this.f24291t0 != f) {
            float a = mo26582a();
            this.f24291t0 = f;
            float a2 = mo26582a();
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: k */
    public void mo26646k(float f) {
        if (this.f24290s0 != f) {
            float a = mo26582a();
            this.f24290s0 = f;
            float a2 = mo26582a();
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: l */
    public void mo26649l(float f) {
        if (this.f24293v0 != f) {
            this.f24293v0 = f;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: m */
    public void mo26652m(float f) {
        if (this.f24292u0 != f) {
            this.f24292u0 = f;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: a */
    private void m32271a(AttributeSet attributeSet, int i, int i2) {
        TypedArray c = C10320g.m32558c(this.f24297z0, attributeSet, C11467k.Chip, i, i2, new int[0]);
        mo26586a(C11499a.m37087a(this.f24297z0, c, C11467k.Chip_chipBackgroundColor));
        mo26611d(c.getDimension(C11467k.Chip_chipMinHeight, 0.0f));
        mo26584a(c.getDimension(C11467k.Chip_chipCornerRadius, 0.0f));
        mo26607c(C11499a.m37087a(this.f24297z0, c, C11467k.Chip_chipStrokeColor));
        mo26622f(c.getDimension(C11467k.Chip_chipStrokeWidth, 0.0f));
        mo26619e(C11499a.m37087a(this.f24297z0, c, C11467k.Chip_rippleColor));
        mo26602b(c.getText(C11467k.Chip_android_text));
        mo26592a(C11499a.m37089c(this.f24297z0, c, C11467k.Chip_android_textAppearance));
        int i3 = c.getInt(C11467k.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            mo26589a(TruncateAt.START);
        } else if (i3 == 2) {
            mo26589a(TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            mo26589a(TruncateAt.END);
        }
        mo26609c(c.getBoolean(C11467k.Chip_chipIconVisible, false));
        String str = "http://schemas.android.com/apk/res-auto";
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "chipIconEnabled") == null || attributeSet.getAttributeValue(str, "chipIconVisible") != null)) {
            mo26609c(c.getBoolean(C11467k.Chip_chipIconEnabled, false));
        }
        mo26600b(C11499a.m37088b(this.f24297z0, c, C11467k.Chip_chipIcon));
        mo26599b(C11499a.m37087a(this.f24297z0, c, C11467k.Chip_chipIconTint));
        mo26605c(c.getDimension(C11467k.Chip_chipIconSize, 0.0f));
        mo26614d(c.getBoolean(C11467k.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "closeIconEnabled") == null || attributeSet.getAttributeValue(str, "closeIconVisible") != null)) {
            mo26614d(c.getBoolean(C11467k.Chip_closeIconEnabled, false));
        }
        mo26608c(C11499a.m37088b(this.f24297z0, c, C11467k.Chip_closeIcon));
        mo26613d(C11499a.m37087a(this.f24297z0, c, C11467k.Chip_closeIconTint));
        mo26635h(c.getDimension(C11467k.Chip_closeIconSize, 0.0f));
        mo26594a(c.getBoolean(C11467k.Chip_android_checkable, false));
        mo26603b(c.getBoolean(C11467k.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "checkedIconEnabled") == null || attributeSet.getAttributeValue(str, "checkedIconVisible") != null)) {
            mo26603b(c.getBoolean(C11467k.Chip_checkedIconEnabled, false));
        }
        mo26588a(C11499a.m37088b(this.f24297z0, c, C11467k.Chip_checkedIcon));
        mo26601b(C11475h.m37007a(this.f24297z0, c, C11467k.Chip_showMotionSpec));
        mo26591a(C11475h.m37007a(this.f24297z0, c, C11467k.Chip_hideMotionSpec));
        mo26617e(c.getDimension(C11467k.Chip_chipStartPadding, 0.0f));
        mo26646k(c.getDimension(C11467k.Chip_iconStartPadding, 0.0f));
        mo26643j(c.getDimension(C11467k.Chip_iconEndPadding, 0.0f));
        mo26652m(c.getDimension(C11467k.Chip_textStartPadding, 0.0f));
        mo26649l(c.getDimension(C11467k.Chip_textEndPadding, 0.0f));
        mo26638i(c.getDimension(C11467k.Chip_closeIconStartPadding, 0.0f));
        mo26626g(c.getDimension(C11467k.Chip_closeIconEndPadding, 0.0f));
        mo26597b(c.getDimension(C11467k.Chip_chipEndPadding, 0.0f));
        mo26683x(c.getDimensionPixelSize(C11467k.Chip_android_maxWidth, Integer.MAX_VALUE));
        c.recycle();
    }

    /* renamed from: f */
    private void m32287f(Canvas canvas, Rect rect) {
        this.f24240B0.setColor(this.f24247I0);
        this.f24240B0.setStyle(Style.FILL);
        this.f24243E0.set(rect);
        RectF rectF = this.f24243E0;
        float f = this.f24261V;
        canvas.drawRoundRect(rectF, f, f, this.f24240B0);
    }

    /* renamed from: b */
    private void m32276b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m32266R()) {
            float f = this.f24296y0 + this.f24295x0 + this.f24282k0 + this.f24294w0 + this.f24293v0;
            if (C0492a.m2648e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: d */
    private void m32282d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32266R()) {
            float f = this.f24296y0 + this.f24295x0 + this.f24282k0 + this.f24294w0 + this.f24293v0;
            if (C0492a.m2648e(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: e */
    private void m32285e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f24271a0 != null) {
            float a = this.f24289r0 + mo26582a() + this.f24292u0;
            float K = this.f24296y0 + m32259K() + this.f24293v0;
            if (C0492a.m2648e(this) == 0) {
                rectF.left = ((float) rect.left) + a;
                rectF.right = ((float) rect.right) - K;
            } else {
                rectF.left = ((float) rect.left) + K;
                rectF.right = ((float) rect.right) - a;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: f */
    private static boolean m32289f(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: c */
    private void m32280c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32266R()) {
            float f = this.f24296y0 + this.f24295x0;
            if (C0492a.m2648e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f24282k0;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f24282k0;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f24282k0;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* renamed from: f */
    private void m32288f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: f */
    public void mo26622f(float f) {
        if (this.f24265X != f) {
            this.f24265X = f;
            this.f24240B0.setStrokeWidth(f);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    private static boolean m32277b(C11500b bVar) {
        if (bVar != null) {
            ColorStateList colorStateList = bVar.f26880b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo26602b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f24269Z != charSequence) {
            this.f24269Z = charSequence;
            this.f24271a0 = C4087a.m14021b().mo14622a(charSequence);
            this.f24262V0 = true;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: f */
    public Drawable mo26621f() {
        Drawable drawable = this.f24276e0;
        if (drawable != null) {
            return C0492a.m2651h(drawable);
        }
        return null;
    }

    /* renamed from: f */
    public void mo26623f(int i) {
        mo26597b(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: h */
    public ColorStateList mo26634h() {
        return this.f24277f0;
    }

    /* renamed from: h */
    public void mo26636h(int i) {
        mo26605c(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: d */
    private void m32283d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0492a.m2643a(drawable, C0492a.m2648e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f24280i0) {
                if (drawable.isStateful()) {
                    drawable.setState(mo26666r());
                }
                C0492a.m2637a(drawable, this.f24281j0);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* renamed from: h */
    public void mo26635h(float f) {
        if (this.f24282k0 != f) {
            this.f24282k0 = f;
            invalidateSelf();
            if (m32266R()) {
                mo26580I();
            }
        }
    }

    /* renamed from: e */
    private static boolean m32286e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: b */
    public void mo26600b(Drawable drawable) {
        Drawable f = mo26621f();
        if (f != drawable) {
            float a = mo26582a();
            this.f24276e0 = drawable != null ? C0492a.m2652i(drawable).mutate() : null;
            float a2 = mo26582a();
            m32288f(f);
            if (m32265Q()) {
                m32283d(this.f24276e0);
            }
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: c */
    public ColorStateList mo26604c() {
        return this.f24273c;
    }

    /* renamed from: g */
    public void mo26627g(int i) {
        mo26600b(C3868a.m12946c(this.f24297z0, i));
    }

    /* renamed from: c */
    public void mo26607c(ColorStateList colorStateList) {
        if (this.f24263W != colorStateList) {
            this.f24263W = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public void mo26618e(int i) {
        mo26584a(this.f24297z0.getResources().getDimension(i));
    }

    /* renamed from: g */
    public float mo26625g() {
        return this.f24278g0;
    }

    /* renamed from: e */
    public void mo26619e(ColorStateList colorStateList) {
        if (this.f24267Y != colorStateList) {
            this.f24267Y = colorStateList;
            m32267S();
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public void mo26626g(float f) {
        if (this.f24295x0 != f) {
            this.f24295x0 = f;
            invalidateSelf();
            if (m32266R()) {
                mo26580I();
            }
        }
    }

    /* renamed from: c */
    public void mo26609c(boolean z) {
        if (this.f24275d0 != z) {
            boolean Q = m32265Q();
            this.f24275d0 = z;
            boolean Q2 = m32265Q();
            if (Q != Q2) {
                if (Q2) {
                    m32283d(this.f24276e0);
                } else {
                    m32288f(this.f24276e0);
                }
                invalidateSelf();
                mo26580I();
            }
        }
    }

    /* renamed from: e */
    public void mo26617e(float f) {
        if (this.f24289r0 != f) {
            this.f24289r0 = f;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: d */
    public void mo26612d(int i) {
        mo26586a(C3868a.m12945b(this.f24297z0, i));
    }

    /* renamed from: b */
    public void mo26599b(ColorStateList colorStateList) {
        if (this.f24277f0 != colorStateList) {
            this.f24277f0 = colorStateList;
            if (m32265Q()) {
                C0492a.m2637a(this.f24276e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo26611d(float f) {
        if (this.f24259U != f) {
            this.f24259U = f;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: e */
    public float mo26616e() {
        return this.f24296y0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo26620e(boolean z) {
        this.f24268Y0 = z;
    }

    /* renamed from: c */
    public void mo26605c(float f) {
        if (this.f24278g0 != f) {
            float a = mo26582a();
            this.f24278g0 = f;
            float a2 = mo26582a();
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: d */
    public float mo26610d() {
        return this.f24261V;
    }

    /* renamed from: b */
    public void mo26603b(boolean z) {
        if (this.f24285n0 != z) {
            boolean P = m32264P();
            this.f24285n0 = z;
            boolean P2 = m32264P();
            if (P != P2) {
                if (P2) {
                    m32283d(this.f24286o0);
                } else {
                    m32288f(this.f24286o0);
                }
                invalidateSelf();
                mo26580I();
            }
        }
    }

    /* renamed from: d */
    public void mo26614d(boolean z) {
        if (this.f24279h0 != z) {
            boolean R = m32266R();
            this.f24279h0 = z;
            boolean R2 = m32266R();
            if (R != R2) {
                if (R2) {
                    m32283d(this.f24280i0);
                } else {
                    m32288f(this.f24280i0);
                }
                invalidateSelf();
                mo26580I();
            }
        }
    }

    /* renamed from: c */
    public void mo26608c(Drawable drawable) {
        Drawable m = mo26651m();
        if (m != drawable) {
            float K = m32259K();
            this.f24280i0 = drawable != null ? C0492a.m2652i(drawable).mutate() : null;
            float K2 = m32259K();
            m32288f(m);
            if (m32266R()) {
                m32283d(this.f24280i0);
            }
            invalidateSelf();
            if (K != K2) {
                mo26580I();
            }
        }
    }

    /* renamed from: b */
    public Drawable mo26596b() {
        return this.f24286o0;
    }

    /* renamed from: d */
    public void mo26613d(ColorStateList colorStateList) {
        if (this.f24281j0 != colorStateList) {
            this.f24281j0 = colorStateList;
            if (m32266R()) {
                C0492a.m2637a(this.f24280i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public void mo26598b(int i) {
        mo26588a(C3868a.m12946c(this.f24297z0, i));
    }

    /* renamed from: b */
    public void mo26601b(C11475h hVar) {
        this.f24287p0 = hVar;
    }

    /* renamed from: b */
    public void mo26597b(float f) {
        if (this.f24296y0 != f) {
            this.f24296y0 = f;
            invalidateSelf();
            mo26580I();
        }
    }

    /* renamed from: c */
    public void mo26606c(int i) {
        mo26603b(this.f24297z0.getResources().getBoolean(i));
    }

    /* renamed from: a */
    public void mo26590a(C10295b bVar) {
        this.f24260U0 = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo26587a(RectF rectF) {
        m32282d(getBounds(), rectF);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo26582a() {
        if (m32265Q() || m32264P()) {
            return this.f24290s0 + this.f24278g0 + this.f24291t0;
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m32269a(Canvas canvas, Rect rect) {
        if (m32264P()) {
            m32270a(rect, this.f24243E0);
            RectF rectF = this.f24243E0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24286o0.setBounds(0, 0, (int) this.f24243E0.width(), (int) this.f24243E0.height());
            this.f24286o0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: a */
    private void m32270a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32265Q() || m32264P()) {
            float f = this.f24289r0 + this.f24290s0;
            if (C0492a.m2648e(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f24278g0;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f24278g0;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f24278g0;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Align mo26583a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.f24271a0 != null) {
            float a = this.f24289r0 + mo26582a() + this.f24292u0;
            if (C0492a.m2648e(this) == 0) {
                pointF.x = ((float) rect.left) + a;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - a;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m32260L();
        }
        return align;
    }

    /* renamed from: a */
    public boolean mo26595a(int[] iArr) {
        if (!Arrays.equals(this.f24256R0, iArr)) {
            this.f24256R0 = iArr;
            if (m32266R()) {
                return m32274a(getState(), iArr);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m32274a(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.f24273c
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r5.f24245G0
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r5.f24245G0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r5.f24245G0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r1 = r5.f24263W
            if (r1 == 0) goto L_0x0024
            int r3 = r5.f24246H0
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            int r3 = r5.f24246H0
            if (r3 == r1) goto L_0x002c
            r5.f24246H0 = r1
            r0 = 1
        L_0x002c:
            android.content.res.ColorStateList r1 = r5.f24258T0
            if (r1 == 0) goto L_0x0037
            int r3 = r5.f24247I0
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r3 = r5.f24247I0
            if (r3 == r1) goto L_0x0043
            r5.f24247I0 = r1
            boolean r1 = r5.f24257S0
            if (r1 == 0) goto L_0x0043
            r0 = 1
        L_0x0043:
            g.j.a.b.s.b r1 = r5.f24272b0
            if (r1 == 0) goto L_0x0052
            android.content.res.ColorStateList r1 = r1.f26880b
            if (r1 == 0) goto L_0x0052
            int r3 = r5.f24248J0
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            int r3 = r5.f24248J0
            if (r3 == r1) goto L_0x005a
            r5.f24248J0 = r1
            r0 = 1
        L_0x005a:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m32273a(r1, r3)
            if (r1 == 0) goto L_0x006d
            boolean r1 = r5.f24284m0
            if (r1 == 0) goto L_0x006d
            r1 = 1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            boolean r3 = r5.f24249K0
            if (r3 == r1) goto L_0x0088
            android.graphics.drawable.Drawable r3 = r5.f24286o0
            if (r3 == 0) goto L_0x0088
            float r0 = r5.mo26582a()
            r5.f24249K0 = r1
            float r1 = r5.mo26582a()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0087
            r0 = 1
            r1 = 1
            goto L_0x0089
        L_0x0087:
            r0 = 1
        L_0x0088:
            r1 = 0
        L_0x0089:
            android.content.res.ColorStateList r3 = r5.f24254P0
            if (r3 == 0) goto L_0x0093
            int r2 = r5.f24250L0
            int r2 = r3.getColorForState(r6, r2)
        L_0x0093:
            int r3 = r5.f24250L0
            if (r3 == r2) goto L_0x00a4
            r5.f24250L0 = r2
            android.content.res.ColorStateList r0 = r5.f24254P0
            android.graphics.PorterDuff$Mode r2 = r5.f24255Q0
            android.graphics.PorterDuffColorFilter r0 = p163g.p449j.p450a.p468b.p474p.C11494a.m37075a(r5, r0, r2)
            r5.f24253O0 = r0
            r0 = 1
        L_0x00a4:
            android.graphics.drawable.Drawable r2 = r5.f24276e0
            boolean r2 = m32286e(r2)
            if (r2 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r2 = r5.f24276e0
            boolean r2 = r2.setState(r6)
            r0 = r0 | r2
        L_0x00b3:
            android.graphics.drawable.Drawable r2 = r5.f24286o0
            boolean r2 = m32286e(r2)
            if (r2 == 0) goto L_0x00c2
            android.graphics.drawable.Drawable r2 = r5.f24286o0
            boolean r6 = r2.setState(r6)
            r0 = r0 | r6
        L_0x00c2:
            android.graphics.drawable.Drawable r6 = r5.f24280i0
            boolean r6 = m32286e(r6)
            if (r6 == 0) goto L_0x00d1
            android.graphics.drawable.Drawable r6 = r5.f24280i0
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x00d1:
            if (r0 == 0) goto L_0x00d6
            r5.invalidateSelf()
        L_0x00d6:
            if (r1 == 0) goto L_0x00db
            r5.mo26580I()
        L_0x00db:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C10293a.m32274a(int[], int[]):boolean");
    }

    /* renamed from: a */
    private static boolean m32273a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo26586a(ColorStateList colorStateList) {
        if (this.f24273c != colorStateList) {
            this.f24273c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a */
    public void mo26584a(float f) {
        if (this.f24261V != f) {
            this.f24261V = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo26592a(C11500b bVar) {
        if (this.f24272b0 != bVar) {
            this.f24272b0 = bVar;
            if (bVar != null) {
                bVar.mo29418c(this.f24297z0, this.f24239A0, this.f24274c0);
                this.f24262V0 = true;
            }
            onStateChange(getState());
            mo26580I();
        }
    }

    /* renamed from: a */
    public void mo26589a(TruncateAt truncateAt) {
        this.f24266X0 = truncateAt;
    }

    /* renamed from: a */
    public void mo26593a(CharSequence charSequence) {
        if (this.f24283l0 != charSequence) {
            this.f24283l0 = C4087a.m14021b().mo14622a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo26585a(int i) {
        mo26594a(this.f24297z0.getResources().getBoolean(i));
    }

    /* renamed from: a */
    public void mo26594a(boolean z) {
        if (this.f24284m0 != z) {
            this.f24284m0 = z;
            float a = mo26582a();
            if (!z && this.f24249K0) {
                this.f24249K0 = false;
            }
            float a2 = mo26582a();
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: a */
    public void mo26588a(Drawable drawable) {
        if (this.f24286o0 != drawable) {
            float a = mo26582a();
            this.f24286o0 = drawable;
            float a2 = mo26582a();
            m32288f(this.f24286o0);
            m32283d(this.f24286o0);
            invalidateSelf();
            if (a != a2) {
                mo26580I();
            }
        }
    }

    /* renamed from: a */
    public void mo26591a(C11475h hVar) {
        this.f24288q0 = hVar;
    }
}
