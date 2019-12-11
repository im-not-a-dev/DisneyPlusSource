package com.bamtechmedia.dominguez.dictionaries;

import com.bamtech.sdk4.session.SessionState;
import com.bamtechmedia.dominguez.config.C3556k;
import com.bamtechmedia.dominguez.core.content.search.C3749j;
import com.bamtechmedia.dominguez.dictionaries.C6087l.C6088a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.i */
/* compiled from: DictionaryManager_Factory */
public final class C6081i implements C11895c<C6072g> {

    /* renamed from: a */
    private final Provider<Single<SessionState>> f13994a;

    /* renamed from: b */
    private final Provider<C6088a> f13995b;

    /* renamed from: c */
    private final Provider<C6068e> f13996c;

    /* renamed from: d */
    private final Provider<C3556k> f13997d;

    /* renamed from: e */
    private final Provider<C3749j> f13998e;

    /* renamed from: f */
    private final Provider<C11969r> f13999f;

    public C6081i(Provider<Single<SessionState>> provider, Provider<C6088a> provider2, Provider<C6068e> provider3, Provider<C3556k> provider4, Provider<C3749j> provider5, Provider<C11969r> provider6) {
        this.f13994a = provider;
        this.f13995b = provider2;
        this.f13996c = provider3;
        this.f13997d = provider4;
        this.f13998e = provider5;
        this.f13999f = provider6;
    }

    /* renamed from: a */
    public static C6081i m19465a(Provider<Single<SessionState>> provider, Provider<C6088a> provider2, Provider<C6068e> provider3, Provider<C3556k> provider4, Provider<C3749j> provider5, Provider<C11969r> provider6) {
        C6081i iVar = new C6081i(provider, provider2, provider3, provider4, provider5, provider6);
        return iVar;
    }

    public C6072g get() {
        C6072g gVar = new C6072g((Single) this.f13994a.get(), (C6088a) this.f13995b.get(), (C6068e) this.f13996c.get(), (C3556k) this.f13997d.get(), (C3749j) this.f13998e.get(), (C11969r) this.f13999f.get());
        return gVar;
    }
}
