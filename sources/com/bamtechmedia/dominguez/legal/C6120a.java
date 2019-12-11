package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalApi;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.legal.a */
/* compiled from: lambda */
public final /* synthetic */ class C6120a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ LegalApi f14059a;

    /* renamed from: b */
    private final /* synthetic */ boolean f14060b;

    /* renamed from: c */
    private final /* synthetic */ LegalCenterAnalytics f14061c;

    /* renamed from: d */
    private final /* synthetic */ LegalDocumentFinder f14062d;

    /* renamed from: e */
    private final /* synthetic */ LegalCenterFragment f14063e;

    public /* synthetic */ C6120a(LegalApi legalApi, boolean z, LegalCenterAnalytics legalCenterAnalytics, LegalDocumentFinder legalDocumentFinder, LegalCenterFragment legalCenterFragment) {
        this.f14059a = legalApi;
        this.f14060b = z;
        this.f14061c = legalCenterAnalytics;
        this.f14062d = legalDocumentFinder;
        this.f14063e = legalCenterFragment;
    }

    public final Object get() {
        return FragmentModule.m19534a(this.f14059a, this.f14060b, this.f14061c, this.f14062d, this.f14063e);
    }
}
