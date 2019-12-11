package com.airbnb.lottie.p022w;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p012r.p013b.C1235k;
import com.airbnb.lottie.p016t.C1266a;
import com.airbnb.lottie.p016t.C1271e;
import com.airbnb.lottie.p016t.C1272f;
import com.airbnb.lottie.p016t.p018k.C1304l;
import java.util.List;

/* renamed from: com.airbnb.lottie.w.e */
/* compiled from: MiscUtils */
public class C1374e {

    /* renamed from: a */
    private static PointF f5045a = new PointF();

    /* renamed from: a */
    public static double m6720a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static int m6724a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: a */
    public static PointF m6726a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    private static int m6729b(int i, int i2) {
        return i - (i2 * m6723a(i, i2));
    }

    /* renamed from: b */
    public static boolean m6730b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: c */
    public static float m6731c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static void m6728a(C1304l lVar, Path path) {
        path.reset();
        PointF b = lVar.mo6299b();
        path.moveTo(b.x, b.y);
        f5045a.set(b.x, b.y);
        for (int i = 0; i < lVar.mo6297a().size(); i++) {
            C1266a aVar = (C1266a) lVar.mo6297a().get(i);
            PointF a = aVar.mo6195a();
            PointF b2 = aVar.mo6197b();
            PointF c = aVar.mo6199c();
            if (!a.equals(f5045a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f5045a.set(c.x, c.y);
        }
        if (lVar.mo6300c()) {
            path.close();
        }
    }

    /* renamed from: a */
    static int m6722a(float f, float f2) {
        return m6729b((int) f, (int) f2);
    }

    /* renamed from: a */
    private static int m6723a(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    public static int m6725a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: a */
    public static float m6721a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m6727a(C1271e eVar, int i, List<C1271e> list, C1271e eVar2, C1235k kVar) {
        if (eVar.mo6211a(kVar.getName(), i)) {
            list.add(eVar2.mo6209a(kVar.getName()).mo6208a((C1272f) kVar));
        }
    }
}
