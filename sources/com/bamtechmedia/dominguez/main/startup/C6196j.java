package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.auth.p061o0.C2742c;
import com.bamtechmedia.dominguez.config.C3555j0;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p314r.C7727c;
import p163g.p201e.p203b.p319v.C7862c;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;

/* renamed from: com.bamtechmedia.dominguez.main.startup.j */
/* compiled from: OnlineAppInitialization.kt */
public final class C6196j implements C6187g {

    /* renamed from: a */
    private final C3555j0 f14203a;

    /* renamed from: b */
    private final C2742c f14204b;

    /* renamed from: c */
    private final C7862c f14205c;

    /* renamed from: d */
    private final C7727c f14206d;

    /* renamed from: e */
    private final C3716q f14207e;

    public C6196j(C3555j0 j0Var, C2742c cVar, C7862c cVar2, C7727c cVar3, C3716q qVar) {
        this.f14203a = j0Var;
        this.f14204b = cVar;
        this.f14205c = cVar2;
        this.f14206d = cVar3;
        this.f14207e = qVar;
    }

    /* renamed from: a */
    public Completable mo18797a() {
        C5855o oVar = C5855o.f13640a;
        Completable b = Completable.m38164b(this.f14204b.mo11733a(), this.f14203a.mo12762a());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Completable.mergeArrayDe…oadAllConfigs\")\n        )");
        Completable a = b.mo30034a((CompletableSource) this.f14205c.mo20782a()).mo30034a((CompletableSource) this.f14206d.mo20643a()).mo30034a((CompletableSource) this.f14206d.mo20645b()).mo30034a((CompletableSource) this.f14207e.mo13547a());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Completable.mergeArrayDe…g(\"prefetchRatingIcons\"))");
        return a;
    }
}
