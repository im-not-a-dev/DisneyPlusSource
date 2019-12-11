package com.bamtechmedia.dominguez.profiles.p268x1;

import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.b */
/* compiled from: CreateProfileLanguageSetupImpl_Factory */
public final class C6910b implements C11895c<C6906a> {

    /* renamed from: a */
    private final Provider<C6865a> f15383a;

    /* renamed from: b */
    private final Provider<C6913e> f15384b;

    /* renamed from: c */
    private final Provider<C6667g1> f15385c;

    /* renamed from: d */
    private final Provider<C11969r> f15386d;

    public C6910b(Provider<C6865a> provider, Provider<C6913e> provider2, Provider<C6667g1> provider3, Provider<C11969r> provider4) {
        this.f15383a = provider;
        this.f15384b = provider2;
        this.f15385c = provider3;
        this.f15386d = provider4;
    }

    /* renamed from: a */
    public static C6910b m21122a(Provider<C6865a> provider, Provider<C6913e> provider2, Provider<C6667g1> provider3, Provider<C11969r> provider4) {
        return new C6910b(provider, provider2, provider3, provider4);
    }

    public C6906a get() {
        return new C6906a((C6865a) this.f15383a.get(), (C6913e) this.f15384b.get(), (C6667g1) this.f15385c.get(), (C11969r) this.f15386d.get());
    }
}
