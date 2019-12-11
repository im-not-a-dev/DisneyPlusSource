package com.bamtechmedia.dominguez.config;

import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.p082t0.C3577a;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.content.search.C3749j;
import com.bamtechmedia.dominguez.core.framework.C5735b.C5736a;
import com.bamtechmedia.dominguez.dictionaries.C6063a;
import com.bamtechmedia.dominguez.dictionaries.C6072g;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import javax.inject.Provider;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.config.p */
/* compiled from: FeatureConfigModule */
public abstract class C3567p {
    /* renamed from: a */
    static C3572r0 m12015a(C6072g gVar) {
        return gVar.mo18351b("language-settings");
    }

    /* renamed from: b */
    static C3572r0 m12021b(C6072g gVar) {
        return gVar.mo18351b("paywall");
    }

    /* renamed from: c */
    static C3572r0 m12025c(C6072g gVar) {
        return gVar.mo18351b("ratings");
    }

    /* renamed from: d */
    static C3572r0 m12026d(C6072g gVar) {
        return gVar.mo18351b("sdk-errors");
    }

    /* renamed from: a */
    static Locale m12020a(C3749j jVar) {
        return jVar.mo13597b();
    }

    /* renamed from: b */
    static Single<C3524e> m12023b(AppConfigRepository appConfigRepository) {
        return appConfigRepository.mo12714b();
    }

    /* renamed from: c */
    static C3558l m12024c() {
        return C3560m.f8894g;
    }

    /* renamed from: a */
    static String m12019a(Locale locale) {
        return locale.getLanguage();
    }

    /* renamed from: b */
    static C5736a m12022b() {
        return C3553j.f8882g;
    }

    /* renamed from: a */
    static C3524e m12013a(AppConfigRepository appConfigRepository) {
        return appConfigRepository.mo12715d();
    }

    /* renamed from: a */
    static Single<C6063a> m12018a(AppConfigRepository appConfigRepository, BuildInfo buildInfo) {
        return appConfigRepository.mo12714b().mo30233g(new C3515a(buildInfo));
    }

    /* renamed from: a */
    static /* synthetic */ C6063a m12017a(BuildInfo buildInfo, C3524e eVar) throws Exception {
        return new C6063a(eVar, buildInfo);
    }

    /* renamed from: a */
    static C3526e0 m12012a() {
        return C3529f0.f8828c;
    }

    /* renamed from: a */
    static C3577a m12016a(SharedPreferences sharedPreferences) {
        return new C3577a(sharedPreferences, "tunneledPlaybackValue", ThreadLocalRandom.current().nextDouble(0.0d, 1.0d));
    }

    /* renamed from: a */
    static C3552i0 m12014a(C6063a aVar, Provider<C3531g0> provider, Provider<C3563n> provider2) {
        if (aVar.mo18339d()) {
            return (C3552i0) provider2.get();
        }
        return (C3552i0) provider.get();
    }
}
