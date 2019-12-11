package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.config.C3526e0.C3527a;
import java.util.Map;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.config.f0 */
/* compiled from: FeatureFlagsImpl.kt */
public final class C3529f0 implements C3526e0 {

    /* renamed from: a */
    private static final Map<C3527a, Boolean> f8826a = C13170i0.m40332a(C12907r.m40244a(C3527a.SENTRY, Boolean.valueOf(true)));

    /* renamed from: b */
    private static final Map<String, String> f8827b = C13170i0.m40332a(C12907r.m40244a("sentryDsn", "https://d5637b8a30f648a48347f6bcb2b6da61@disney.my.sentry.io/4"));

    /* renamed from: c */
    public static final C3529f0 f8828c = new C3529f0();

    private C3529f0() {
    }

    /* renamed from: a */
    public boolean mo12733a(C3527a aVar) {
        Boolean bool = (Boolean) f8826a.get(aVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public String mo12732a(String str) {
        return (String) f8827b.get(str);
    }
}
