package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import com.google.common.base.Optional;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.search.a */
/* compiled from: lambda */
public final /* synthetic */ class C7964a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ C3667h f17120a;

    /* renamed from: b */
    private final /* synthetic */ C3678l f17121b;

    /* renamed from: c */
    private final /* synthetic */ SearchRepository f17122c;

    /* renamed from: d */
    private final /* synthetic */ C8052r f17123d;

    /* renamed from: e */
    private final /* synthetic */ C3765c f17124e;

    /* renamed from: f */
    private final /* synthetic */ C8060t f17125f;

    /* renamed from: g */
    private final /* synthetic */ C2366i0 f17126g;

    /* renamed from: h */
    private final /* synthetic */ Optional f17127h;

    public /* synthetic */ C7964a(C3667h hVar, C3678l lVar, SearchRepository searchRepository, C8052r rVar, C3765c cVar, C8060t tVar, C2366i0 i0Var, Optional optional) {
        this.f17120a = hVar;
        this.f17121b = lVar;
        this.f17122c = searchRepository;
        this.f17123d = rVar;
        this.f17124e = cVar;
        this.f17125f = tVar;
        this.f17126g = i0Var;
        this.f17127h = optional;
    }

    public final Object get() {
        return C8024e0.m23335a(this.f17120a, this.f17121b, this.f17122c, this.f17123d, this.f17124e, this.f17125f, this.f17126g, this.f17127h);
    }
}
