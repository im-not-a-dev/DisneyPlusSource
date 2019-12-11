package p163g.p201e.p203b.p319v;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.z */
/* compiled from: SubscriptionMessageImpl_Factory */
public final class C7911z implements C11895c<C7909y> {

    /* renamed from: a */
    private final Provider<SharedPreferences> f17045a;

    /* renamed from: b */
    private final Provider<C7547h> f17046b;

    public C7911z(Provider<SharedPreferences> provider, Provider<C7547h> provider2) {
        this.f17045a = provider;
        this.f17046b = provider2;
    }

    /* renamed from: a */
    public static C7911z m23127a(Provider<SharedPreferences> provider, Provider<C7547h> provider2) {
        return new C7911z(provider, provider2);
    }

    public C7909y get() {
        return new C7909y((SharedPreferences) this.f17045a.get(), (C7547h) this.f17046b.get());
    }
}
