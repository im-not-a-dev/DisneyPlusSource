package p096e.p158r.p159a.p160a;

import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.graphics.drawable.C0494c;

/* renamed from: e.r.a.a.h */
/* compiled from: VectorDrawableCommon */
abstract class C4368h extends Drawable implements C0494c {

    /* renamed from: c */
    Drawable f10837c;

    C4368h() {
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2638a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2650g(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, Mode mode) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2635a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            C0492a.m2636a(drawable, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f10837c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
