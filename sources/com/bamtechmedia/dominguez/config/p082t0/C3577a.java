package com.bamtechmedia.dominguez.config.p082t0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C12877g;

/* renamed from: com.bamtechmedia.dominguez.config.t0.a */
/* compiled from: DoublePreference.kt */
public final class C3577a {

    /* renamed from: a */
    private final SharedPreferences f8906a;

    /* renamed from: b */
    private final String f8907b;

    /* renamed from: c */
    private final double f8908c;

    public C3577a(SharedPreferences sharedPreferences, String str, double d) {
        this.f8906a = sharedPreferences;
        this.f8907b = str;
        this.f8908c = d;
    }

    /* renamed from: a */
    public final double mo12776a() {
        C12877g gVar = C12877g.f29523a;
        return Double.longBitsToDouble(this.f8906a.getLong(this.f8907b, Double.doubleToRawLongBits(this.f8908c)));
    }
}
