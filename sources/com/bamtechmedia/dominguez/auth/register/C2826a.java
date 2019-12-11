package com.bamtechmedia.dominguez.auth.register;

import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.register.a */
/* compiled from: lambda */
public final /* synthetic */ class C2826a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ RegisterAccountAction f7588a;

    /* renamed from: b */
    private final /* synthetic */ C2740b f7589b;

    /* renamed from: c */
    private final /* synthetic */ String f7590c;

    /* renamed from: d */
    private final /* synthetic */ C2750c f7591d;

    /* renamed from: e */
    private final /* synthetic */ C7626a f7592e;

    /* renamed from: f */
    private final /* synthetic */ Optional f7593f;

    /* renamed from: g */
    private final /* synthetic */ C2827b f7594g;

    public /* synthetic */ C2826a(RegisterAccountAction registerAccountAction, C2740b bVar, String str, C2750c cVar, C7626a aVar, Optional optional, C2827b bVar2) {
        this.f7588a = registerAccountAction;
        this.f7589b = bVar;
        this.f7590c = str;
        this.f7591d = cVar;
        this.f7592e = aVar;
        this.f7593f = optional;
        this.f7594g = bVar2;
    }

    public final Object get() {
        return C2829c.m10512a(this.f7588a, this.f7589b, this.f7590c, this.f7591d, this.f7592e, this.f7593f, this.f7594g);
    }
}
