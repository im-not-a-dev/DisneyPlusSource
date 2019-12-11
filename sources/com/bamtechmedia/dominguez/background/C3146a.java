package com.bamtechmedia.dominguez.background;

import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.p087h.C3828d;
import javax.inject.Provider;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p286j.C7301l;
import p512h.p515d.C11894b;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.background.a */
/* compiled from: MainActivityBackgroundResponder_Factory */
public final class C3146a implements C11895c<MainActivityBackgroundResponder> {

    /* renamed from: a */
    private final Provider<C3828d> f8075a;

    /* renamed from: b */
    private final Provider<C7300k> f8076b;

    /* renamed from: c */
    private final Provider<C5765a> f8077c;

    /* renamed from: d */
    private final Provider<C7301l> f8078d;

    public C3146a(Provider<C3828d> provider, Provider<C7300k> provider2, Provider<C5765a> provider3, Provider<C7301l> provider4) {
        this.f8075a = provider;
        this.f8076b = provider2;
        this.f8077c = provider3;
        this.f8078d = provider4;
    }

    /* renamed from: a */
    public static C3146a m11015a(Provider<C3828d> provider, Provider<C7300k> provider2, Provider<C5765a> provider3, Provider<C7301l> provider4) {
        return new C3146a(provider, provider2, provider3, provider4);
    }

    public MainActivityBackgroundResponder get() {
        return new MainActivityBackgroundResponder(C11894b.m38125a(this.f8075a), this.f8076b, (C5765a) this.f8077c.get(), (C7301l) this.f8078d.get());
    }
}
