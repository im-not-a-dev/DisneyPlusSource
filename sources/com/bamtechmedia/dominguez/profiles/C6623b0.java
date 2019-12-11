package com.bamtechmedia.dominguez.profiles;

import android.content.Context;
import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.content.search.C3749j;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.profiles.b0 */
/* compiled from: LocalProfileSelection_Factory */
public final class C6623b0 implements C11895c<C6606a0> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f14943a;

    /* renamed from: b */
    private final Provider<C6667g1> f14944b;

    /* renamed from: c */
    private final Provider<C6675i> f14945c;

    /* renamed from: d */
    private final Provider<C3667h> f14946d;

    /* renamed from: e */
    private final Provider<C6864d> f14947e;

    /* renamed from: f */
    private final Provider<C3749j> f14948f;

    /* renamed from: g */
    private final Provider<C3678l> f14949g;

    /* renamed from: h */
    private final Provider<Context> f14950h;

    /* renamed from: i */
    private final Provider<C3572r0> f14951i;

    /* renamed from: j */
    private final Provider<C6627c1> f14952j;

    /* renamed from: k */
    private final Provider<C11969r> f14953k;

    public C6623b0(Provider<SharedPreferences> provider, Provider<C6667g1> provider2, Provider<C6675i> provider3, Provider<C3667h> provider4, Provider<C6864d> provider5, Provider<C3749j> provider6, Provider<C3678l> provider7, Provider<Context> provider8, Provider<C3572r0> provider9, Provider<C6627c1> provider10, Provider<C11969r> provider11) {
        this.f14943a = provider;
        this.f14944b = provider2;
        this.f14945c = provider3;
        this.f14946d = provider4;
        this.f14947e = provider5;
        this.f14948f = provider6;
        this.f14949g = provider7;
        this.f14950h = provider8;
        this.f14951i = provider9;
        this.f14952j = provider10;
        this.f14953k = provider11;
    }

    /* renamed from: a */
    public static C6623b0 m20554a(Provider<SharedPreferences> provider, Provider<C6667g1> provider2, Provider<C6675i> provider3, Provider<C3667h> provider4, Provider<C6864d> provider5, Provider<C3749j> provider6, Provider<C3678l> provider7, Provider<Context> provider8, Provider<C3572r0> provider9, Provider<C6627c1> provider10, Provider<C11969r> provider11) {
        C6623b0 b0Var = new C6623b0(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
        return b0Var;
    }

    public C6606a0 get() {
        C6606a0 a0Var = new C6606a0((SharedPreferences) this.f14943a.get(), (C6667g1) this.f14944b.get(), (C6675i) this.f14945c.get(), (C3667h) this.f14946d.get(), (C6864d) this.f14947e.get(), (C3749j) this.f14948f.get(), (C3678l) this.f14949g.get(), (Context) this.f14950h.get(), (C3572r0) this.f14951i.get(), (C6627c1) this.f14952j.get(), (C11969r) this.f14953k.get());
        return a0Var;
    }
}
