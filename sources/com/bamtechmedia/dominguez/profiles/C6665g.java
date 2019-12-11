package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.g */
/* compiled from: AvatarImages_Factory */
public final class C6665g implements C11895c<C6657f> {

    /* renamed from: a */
    private final Provider<Context> f15018a;

    /* renamed from: b */
    private final Provider<C7159g> f15019b;

    public C6665g(Provider<Context> provider, Provider<C7159g> provider2) {
        this.f15018a = provider;
        this.f15019b = provider2;
    }

    /* renamed from: a */
    public static C6665g m20661a(Provider<Context> provider, Provider<C7159g> provider2) {
        return new C6665g(provider, provider2);
    }

    public C6657f get() {
        return new C6657f((Context) this.f15018a.get(), (C7159g) this.f15019b.get());
    }
}
