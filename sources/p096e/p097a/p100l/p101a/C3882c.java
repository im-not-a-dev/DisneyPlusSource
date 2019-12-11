package p096e.p097a.p100l.p101a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.C0492a;

/* renamed from: e.a.l.a.c */
/* compiled from: DrawableWrapper */
public class C3882c extends Drawable implements Callback {

    /* renamed from: c */
    private Drawable f9604c;

    public C3882c(Drawable drawable) {
        mo13868a(drawable);
    }

    /* renamed from: a */
    public Drawable mo13867a() {
        return this.f9604c;
    }

    public void draw(Canvas canvas) {
        this.f9604c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f9604c.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f9604c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9604c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9604c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f9604c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9604c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9604c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9604c.getPadding(rect);
    }

    public int[] getState() {
        return this.f9604c.getState();
    }

    public Region getTransparentRegion() {
        return this.f9604c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0492a.m2649f(this.f9604c);
    }

    public boolean isStateful() {
        return this.f9604c.isStateful();
    }

    public void jumpToCurrentState() {
        C0492a.m2650g(this.f9604c);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f9604c.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f9604c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f9604c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0492a.m2641a(this.f9604c, z);
    }

    public void setChangingConfigurations(int i) {
        this.f9604c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9604c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f9604c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9604c.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0492a.m2635a(this.f9604c, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0492a.m2636a(this.f9604c, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f9604c.setState(iArr);
    }

    public void setTint(int i) {
        C0492a.m2645b(this.f9604c, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0492a.m2637a(this.f9604c, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0492a.m2640a(this.f9604c, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f9604c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    public void mo13868a(Drawable drawable) {
        Drawable drawable2 = this.f9604c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9604c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
