package com.bamtechmedia.dominguez.analytics.p055m0;

import android.location.LocationManager;
import android.telephony.TelephonyManager;
import java.util.Locale;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.f */
/* compiled from: AndroidSystemContributor_Factory */
public final class C2389f implements C11895c<C2386e> {

    /* renamed from: a */
    private final Provider<LocationManager> f6623a;

    /* renamed from: b */
    private final Provider<Locale> f6624b;

    /* renamed from: c */
    private final Provider<TelephonyManager> f6625c;

    /* renamed from: d */
    private final Provider<C11969r> f6626d;

    public C2389f(Provider<LocationManager> provider, Provider<Locale> provider2, Provider<TelephonyManager> provider3, Provider<C11969r> provider4) {
        this.f6623a = provider;
        this.f6624b = provider2;
        this.f6625c = provider3;
        this.f6626d = provider4;
    }

    /* renamed from: a */
    public static C2389f m8933a(Provider<LocationManager> provider, Provider<Locale> provider2, Provider<TelephonyManager> provider3, Provider<C11969r> provider4) {
        return new C2389f(provider, provider2, provider3, provider4);
    }

    public C2386e get() {
        return new C2386e((LocationManager) this.f6623a.get(), this.f6624b, (TelephonyManager) this.f6625c.get(), (C11969r) this.f6626d.get());
    }
}
