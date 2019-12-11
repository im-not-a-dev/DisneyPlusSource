package p096e.p154p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: e.p.h */
/* compiled from: PathProperty */
class C4296h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f10682a;

    /* renamed from: b */
    private final PathMeasure f10683b;

    /* renamed from: c */
    private final float f10684c;

    /* renamed from: d */
    private final float[] f10685d = new float[2];

    /* renamed from: e */
    private final PointF f10686e = new PointF();

    /* renamed from: f */
    private float f10687f;

    C4296h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f10682a = property;
        this.f10683b = new PathMeasure(path, false);
        this.f10684c = this.f10683b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f10687f = f.floatValue();
        this.f10683b.getPosTan(this.f10684c * f.floatValue(), this.f10685d, null);
        PointF pointF = this.f10686e;
        float[] fArr = this.f10685d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f10682a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f10687f);
    }
}
