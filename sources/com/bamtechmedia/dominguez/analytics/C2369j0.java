package com.bamtechmedia.dominguez.analytics;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bamtechmedia.dominguez.analytics.j0 */
/* compiled from: TransactionIdProviderImpl.kt */
public final class C2369j0 implements C2366i0 {

    /* renamed from: a */
    private final Map<String, String> f6579a = new LinkedHashMap();

    /* renamed from: b */
    private final C2361g0 f6580b;

    public C2369j0(C2361g0 g0Var) {
        this.f6580b = g0Var;
    }

    /* renamed from: a */
    public String mo11491a(String str, boolean z) {
        if (!z) {
            return this.f6580b.mo11489a();
        }
        Map<String, String> map = this.f6579a;
        Object obj = map.get(str);
        if (obj == null) {
            obj = this.f6580b.mo11489a();
            map.put(str, obj);
        }
        return (String) obj;
    }

    /* renamed from: e */
    public void mo11493e() {
        this.f6579a.clear();
    }

    /* renamed from: a */
    public void mo11492a(String str) {
        this.f6579a.remove(str);
    }
}
