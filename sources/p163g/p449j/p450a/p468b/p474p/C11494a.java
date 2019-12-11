package p163g.p449j.p450a.p468b.p474p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: g.j.a.b.p.a */
/* compiled from: DrawableUtils */
public class C11494a {
    /* renamed from: a */
    public static PorterDuffColorFilter m37075a(Drawable drawable, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
