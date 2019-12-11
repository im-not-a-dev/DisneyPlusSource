package p163g.p449j.p450a.p468b.p469l;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g.j.a.b.l.e */
/* compiled from: DrawableAlphaProperty */
public class C11472e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f26822b = new C11472e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f26823a = new WeakHashMap<>();

    private C11472e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f26823a.containsKey(drawable)) {
            return (Integer) this.f26823a.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f26823a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
