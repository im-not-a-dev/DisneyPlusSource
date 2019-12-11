package com.bamtech.player.exo.scaling;

/* renamed from: com.bamtech.player.exo.scaling.a */
/* compiled from: ActiveAspectRatioScaler.kt */
public final class C1748a {
    /* renamed from: a */
    public final float mo7812a(float f, float f2, float f3) {
        float f4 = (float) 0;
        if (f3 > f4 && f2 > f4 && f > f4) {
            if (f3 > f2) {
                return f3 / f2;
            }
            if (f > f3) {
                return f / f3;
            }
        }
        return 1.0f;
    }
}
