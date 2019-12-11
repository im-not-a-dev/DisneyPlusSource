package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.k */
/* compiled from: LottieResult */
public final class C1211k<V> {

    /* renamed from: a */
    private final V f4547a;

    /* renamed from: b */
    private final Throwable f4548b;

    public C1211k(V v) {
        this.f4547a = v;
        this.f4548b = null;
    }

    /* renamed from: a */
    public Throwable mo6124a() {
        return this.f4548b;
    }

    /* renamed from: b */
    public V mo6125b() {
        return this.f4547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1211k)) {
            return false;
        }
        C1211k kVar = (C1211k) obj;
        if (mo6125b() != null && mo6125b().equals(kVar.mo6125b())) {
            return true;
        }
        if (mo6124a() == null || kVar.mo6124a() == null) {
            return false;
        }
        return mo6124a().toString().equals(mo6124a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo6125b(), mo6124a()});
    }

    public C1211k(Throwable th) {
        this.f4548b = th;
        this.f4547a = null;
    }
}
