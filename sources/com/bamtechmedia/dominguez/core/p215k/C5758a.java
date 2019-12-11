package com.bamtechmedia.dominguez.core.p215k;

/* renamed from: com.bamtechmedia.dominguez.core.k.a */
/* compiled from: FocusDirectionMapper.kt */
public final class C5758a {
    /* renamed from: a */
    public final int mo17637a(int i, int i2) {
        return i != 17 ? i != 66 ? i2 : i2 + 1 : i2 - 1;
    }

    /* renamed from: a */
    public final String mo17638a(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? i != 130 ? "UNKNOWN DIRECTION" : "FOCUS DOWN" : "FOCUS RIGHT" : "FOCUS UP" : "FOCUS LEFT" : "FOCUS FORWARD" : "FOCUS BACKWARD";
    }

    /* renamed from: b */
    public final int mo17639b(int i, int i2) {
        return i != 33 ? i != 130 ? i2 : i2 + 1 : i2 - 1;
    }

    /* renamed from: b */
    public final boolean mo17640b(int i) {
        return i == 17 || i == 66;
    }

    /* renamed from: c */
    public final boolean mo17641c(int i) {
        return i == 33 || i == 130;
    }

    /* renamed from: d */
    public final int mo17642d(int i) {
        switch (i) {
            case 19:
                return 33;
            case 20:
                return 130;
            case 21:
                return 17;
            case 22:
                return 66;
            default:
                return -1;
        }
    }
}
