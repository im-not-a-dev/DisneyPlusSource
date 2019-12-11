package com.bamtechmedia.dominguez.auth;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.List;

/* renamed from: com.bamtechmedia.dominguez.auth.c */
/* compiled from: AuthConfigImpl.kt */
public final class C2704c implements C2702b {

    /* renamed from: a */
    private final C3524e f7461a;

    public C2704c(C3524e eVar) {
        this.f7461a = eVar;
    }

    /* renamed from: a */
    public List<String> mo11736a() {
        List<String> list = (List) this.f7461a.mo12720d("auth", "initialLogOutActionIds");
        return list != null ? list : C13185o.m40513a();
    }

    /* renamed from: b */
    public List<String> mo11737b() {
        List<String> list = (List) this.f7461a.mo12720d("auth", "finalLogOutActionIds");
        return list != null ? list : C13185o.m40520c("accountIdProvider", "profiles");
    }

    /* renamed from: c */
    public String mo11738c() {
        return (String) this.f7461a.mo12720d("onboarding", "webSignUpUrl");
    }
}
