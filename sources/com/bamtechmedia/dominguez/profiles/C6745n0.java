package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bamtechmedia.dominguez.profiles.n0 */
/* compiled from: ProfilesConfig.kt */
public final class C6745n0 {

    /* renamed from: a */
    private final C3524e f15121a;

    public C6745n0(C3524e eVar) {
        this.f15121a = eVar;
    }

    /* renamed from: a */
    public final Long mo19470a() {
        long j;
        Long a = this.f15121a.mo12716a("profiles", "cacheBusterDuration");
        if (a != null) {
            j = a.longValue();
        } else {
            j = TimeUnit.MINUTES.toMillis(0);
        }
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() > 0) {
            return valueOf;
        }
        return null;
    }
}
