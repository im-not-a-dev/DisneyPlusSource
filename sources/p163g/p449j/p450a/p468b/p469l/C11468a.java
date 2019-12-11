package p163g.p449j.p450a.p468b.p469l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p096e.p143k.p144a.p145a.C4219a;
import p096e.p143k.p144a.p145a.C4220b;
import p096e.p143k.p144a.p145a.C4221c;

/* renamed from: g.j.a.b.l.a */
/* compiled from: AnimationUtils */
public class C11468a {

    /* renamed from: a */
    public static final TimeInterpolator f26815a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f26816b = new C4220b();

    /* renamed from: c */
    public static final TimeInterpolator f26817c = new C4219a();

    /* renamed from: d */
    public static final TimeInterpolator f26818d = new C4221c();

    /* renamed from: e */
    public static final TimeInterpolator f26819e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m36994a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m36995a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
