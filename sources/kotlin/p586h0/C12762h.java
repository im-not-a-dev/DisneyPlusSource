package kotlin.p586h0;

import kotlin.p586h0.C12754b.C12755a;

/* renamed from: kotlin.h0.h */
/* compiled from: _Ranges.kt */
class C12762h extends C12761g {
    /* renamed from: a */
    public static float m39912a(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: a */
    public static int m39913a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static long m39915a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: a */
    public static C12754b m39916a(C12754b bVar, int i) {
        C12761g.m39911a(i > 0, Integer.valueOf(i));
        C12755a aVar = C12754b.f29416W;
        int b = bVar.mo31070b();
        int c = bVar.mo31071c();
        if (bVar.mo31072d() <= 0) {
            i = -i;
        }
        return aVar.mo31078a(b, c, i);
    }

    /* renamed from: b */
    public static int m39917b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m39918b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static C12754b m39919c(int i, int i2) {
        return C12754b.f29416W.mo31078a(i, i2, -1);
    }

    /* renamed from: d */
    public static C12757d m39920d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C12757d.f29425Y.mo31084a();
        }
        return new C12757d(i, i2 - 1);
    }

    /* renamed from: a */
    public static int m39914a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }
}
