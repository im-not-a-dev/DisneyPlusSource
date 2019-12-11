package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.f */
/* compiled from: WrappedDrawableApi21 */
class C0497f extends C0496e {

    /* renamed from: a0 */
    private static Method f2211a0;

    C0497f(Drawable drawable) {
        super(drawable);
        m2663c();
    }

    /* renamed from: c */
    private void m2663c() {
        if (f2211a0 == null) {
            try {
                f2211a0 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2714b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2209Y;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2209Y.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2209Y.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f2209Y.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2209Y.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo2714b()) {
            super.setTint(i);
        } else {
            this.f2209Y.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2714b()) {
            super.setTintList(colorStateList);
        } else {
            this.f2209Y.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo2714b()) {
            super.setTintMode(mode);
        } else {
            this.f2209Y.setTintMode(mode);
        }
    }

    C0497f(C0498g gVar, Resources resources) {
        super(gVar, resources);
        m2663c();
    }
}
