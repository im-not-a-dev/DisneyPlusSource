package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: androidx.core.graphics.drawable.g */
/* compiled from: WrappedDrawableState */
final class C0498g extends ConstantState {

    /* renamed from: a */
    int f2212a;

    /* renamed from: b */
    ConstantState f2213b;

    /* renamed from: c */
    ColorStateList f2214c = null;

    /* renamed from: d */
    Mode f2215d = C0496e.f2204Z;

    C0498g(C0498g gVar) {
        if (gVar != null) {
            this.f2212a = gVar.f2212a;
            this.f2213b = gVar.f2213b;
            this.f2214c = gVar.f2214c;
            this.f2215d = gVar.f2215d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2748a() {
        return this.f2213b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2212a;
        ConstantState constantState = this.f2213b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new C0497f(this, resources);
        }
        return new C0496e(this, resources);
    }
}
