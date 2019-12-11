package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.profiles.p258db.C6632a;
import com.bamtechmedia.dominguez.profiles.p258db.C6639c;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.k1 */
/* compiled from: ProfilesRepositoryImpl_Factory */
public final class C6718k1 implements C11895c<C6677i1> {

    /* renamed from: a */
    private final Provider<C6639c> f15074a;

    /* renamed from: b */
    private final Provider<C6632a> f15075b;

    /* renamed from: c */
    private final Provider<C6746n1> f15076c;

    /* renamed from: d */
    private final Provider<C2436p> f15077d;

    /* renamed from: e */
    private final Provider<C6745n0> f15078e;

    /* renamed from: f */
    private final Provider<C11969r> f15079f;

    public C6718k1(Provider<C6639c> provider, Provider<C6632a> provider2, Provider<C6746n1> provider3, Provider<C2436p> provider4, Provider<C6745n0> provider5, Provider<C11969r> provider6) {
        this.f15074a = provider;
        this.f15075b = provider2;
        this.f15076c = provider3;
        this.f15077d = provider4;
        this.f15078e = provider5;
        this.f15079f = provider6;
    }

    /* renamed from: a */
    public static C6718k1 m20775a(Provider<C6639c> provider, Provider<C6632a> provider2, Provider<C6746n1> provider3, Provider<C2436p> provider4, Provider<C6745n0> provider5, Provider<C11969r> provider6) {
        C6718k1 k1Var = new C6718k1(provider, provider2, provider3, provider4, provider5, provider6);
        return k1Var;
    }

    public C6677i1 get() {
        C6677i1 i1Var = new C6677i1((C6639c) this.f15074a.get(), (C6632a) this.f15075b.get(), (C6746n1) this.f15076c.get(), (C2436p) this.f15077d.get(), (C6745n0) this.f15078e.get(), (C11969r) this.f15079f.get());
        return i1Var;
    }
}
