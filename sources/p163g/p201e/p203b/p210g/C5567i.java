package p163g.p201e.p203b.p210g;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.core.C3585a;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.C11969r;

/* renamed from: g.e.b.g.i */
/* compiled from: OfflineStateBindingModule_ProvideOfflineStateFactory */
public final class C5567i implements C11895c<C3796d> {

    /* renamed from: a */
    private final Provider<C0532d> f13124a;

    /* renamed from: b */
    private final Provider<C3585a> f13125b;

    /* renamed from: c */
    private final Provider<C5765a> f13126c;

    /* renamed from: d */
    private final Provider<C5568j> f13127d;

    /* renamed from: e */
    private final Provider<C5562f> f13128e;

    /* renamed from: f */
    private final Provider<C11969r> f13129f;

    public C5567i(Provider<C0532d> provider, Provider<C3585a> provider2, Provider<C5765a> provider3, Provider<C5568j> provider4, Provider<C5562f> provider5, Provider<C11969r> provider6) {
        this.f13124a = provider;
        this.f13125b = provider2;
        this.f13126c = provider3;
        this.f13127d = provider4;
        this.f13128e = provider5;
        this.f13129f = provider6;
    }

    /* renamed from: a */
    public static C5567i m18373a(Provider<C0532d> provider, Provider<C3585a> provider2, Provider<C5765a> provider3, Provider<C5568j> provider4, Provider<C5562f> provider5, Provider<C11969r> provider6) {
        C5567i iVar = new C5567i(provider, provider2, provider3, provider4, provider5, provider6);
        return iVar;
    }

    /* renamed from: a */
    public static C3796d m18372a(C0532d dVar, C3585a aVar, C5765a aVar2, C5568j jVar, C5562f fVar, C11969r rVar) {
        C3796d a = C5566h.m18370a(dVar, aVar, aVar2, jVar, fVar, rVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3796d get() {
        return m18372a((C0532d) this.f13124a.get(), (C3585a) this.f13125b.get(), (C5765a) this.f13126c.get(), (C5568j) this.f13127d.get(), (C5562f) this.f13128e.get(), (C11969r) this.f13129f.get());
    }
}
