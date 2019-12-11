package p096e.p154p;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: e.p.f */
/* compiled from: ObjectAnimatorUtils */
class C4292f {
    /* renamed from: a */
    static <T> ObjectAnimator m14747a(T t, Property<T, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, null, path);
        }
        return ObjectAnimator.ofFloat(t, new C4296h(property, path), new float[]{0.0f, 1.0f});
    }
}
