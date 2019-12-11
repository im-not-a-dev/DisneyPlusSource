package com.appboy.p025o;

import com.appboy.p033s.C1557c;

/* renamed from: com.appboy.o.h */
public enum C1501h {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULY(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);
    

    /* renamed from: g0 */
    private static final String f5496g0 = null;

    /* renamed from: c */
    private final int f5498c;

    static {
        f5496g0 = C1557c.m7461a(C1501h.class);
    }

    private C1501h(int i) {
        this.f5498c = i;
    }

    /* renamed from: a */
    public int mo6751a() {
        return this.f5498c;
    }

    /* renamed from: a */
    public static C1501h m7151a(int i) {
        C1501h[] values;
        for (C1501h hVar : values()) {
            if (hVar.mo6751a() == i) {
                return hVar;
            }
        }
        String str = f5496g0;
        StringBuilder sb = new StringBuilder();
        sb.append("No month with value ");
        sb.append(i);
        sb.append(", value must be in (0,11)");
        C1557c.m7465b(str, sb.toString());
        return null;
    }
}
