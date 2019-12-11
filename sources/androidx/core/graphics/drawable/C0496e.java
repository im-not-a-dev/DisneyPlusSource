package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: androidx.core.graphics.drawable.e */
/* compiled from: WrappedDrawableApi14 */
class C0496e extends Drawable implements Callback, C0495d, C0494c {

    /* renamed from: Z */
    static final Mode f2204Z = Mode.SRC_IN;

    /* renamed from: U */
    private Mode f2205U;

    /* renamed from: V */
    private boolean f2206V;

    /* renamed from: W */
    C0498g f2207W;

    /* renamed from: X */
    private boolean f2208X;

    /* renamed from: Y */
    Drawable f2209Y;

    /* renamed from: c */
    private int f2210c;

    C0496e(C0498g gVar, Resources resources) {
        this.f2207W = gVar;
        m2657a(resources);
    }

    /* renamed from: a */
    private void m2657a(Resources resources) {
        C0498g gVar = this.f2207W;
        if (gVar != null) {
            ConstantState constantState = gVar.f2213b;
            if (constantState != null) {
                mo2713a(constantState.newDrawable(resources));
            }
        }
    }

    /* renamed from: c */
    private C0498g m2659c() {
        return new C0498g(this.f2207W);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2714b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2209Y.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0498g gVar = this.f2207W;
        return changingConfigurations | (gVar != null ? gVar.getChangingConfigurations() : 0) | this.f2209Y.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        C0498g gVar = this.f2207W;
        if (gVar == null || !gVar.mo2748a()) {
            return null;
        }
        this.f2207W.f2212a = getChangingConfigurations();
        return this.f2207W;
    }

    public Drawable getCurrent() {
        return this.f2209Y.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2209Y.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2209Y.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2209Y.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2209Y.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2209Y.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2209Y.getPadding(rect);
    }

    public int[] getState() {
        return this.f2209Y.getState();
    }

    public Region getTransparentRegion() {
        return this.f2209Y.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2209Y.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo2714b()) {
            C0498g gVar = this.f2207W;
            if (gVar != null) {
                colorStateList = gVar.f2214c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f2209Y.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f2209Y.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2208X && super.mutate() == this) {
            this.f2207W = m2659c();
            Drawable drawable = this.f2209Y;
            if (drawable != null) {
                drawable.mutate();
            }
            C0498g gVar = this.f2207W;
            if (gVar != null) {
                Drawable drawable2 = this.f2209Y;
                gVar.f2213b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2208X = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2209Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2209Y.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2209Y.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2209Y.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2209Y.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2209Y.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2209Y.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2209Y.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2658a(iArr) || this.f2209Y.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2207W.f2214c = colorStateList;
        m2658a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f2207W.f2215d = mode;
        m2658a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2209Y.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    private boolean m2658a(int[] iArr) {
        if (!mo2714b()) {
            return false;
        }
        C0498g gVar = this.f2207W;
        ColorStateList colorStateList = gVar.f2214c;
        Mode mode = gVar.f2215d;
        if (colorStateList == null || mode == null) {
            this.f2206V = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2206V && colorForState == this.f2210c && mode == this.f2205U)) {
                setColorFilter(colorForState, mode);
                this.f2210c = colorForState;
                this.f2205U = mode;
                this.f2206V = true;
                return true;
            }
        }
        return false;
    }

    C0496e(Drawable drawable) {
        this.f2207W = m2659c();
        mo2713a(drawable);
    }

    /* renamed from: a */
    public final Drawable mo2712a() {
        return this.f2209Y;
    }

    /* renamed from: a */
    public final void mo2713a(Drawable drawable) {
        Drawable drawable2 = this.f2209Y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2209Y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0498g gVar = this.f2207W;
            if (gVar != null) {
                gVar.f2213b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
