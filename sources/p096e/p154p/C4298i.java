package p096e.p154p;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: e.p.i */
/* compiled from: PropertyValuesHolderUtils */
class C4298i {
    /* renamed from: a */
    static PropertyValuesHolder m14763a(Property<?, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, null, path);
        }
        return PropertyValuesHolder.ofFloat(new C4296h(property, path), new float[]{0.0f, 1.0f});
    }
}
