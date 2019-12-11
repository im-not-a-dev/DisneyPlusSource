package com.bamtechmedia.dominguez.purchase;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamnet.iap.Market;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7887p;
import p163g.p201e.p203b.p319v.C7900q;
import p520io.reactivex.subjects.C11976a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/purchase/MarketHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "provider", "Ljavax/inject/Provider;", "Lcom/bamnet/iap/Market;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "(Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;)V", "reference", "restoreRequested", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRestoreRequested", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setRestoreRequested", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "serviceEventsSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "getServiceEventsSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "serviceInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "getServiceInteractor", "()Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "setServiceInteractor", "(Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;)V", "skusRequested", "Ljava/util/concurrent/atomic/AtomicReference;", "", "", "getSkusRequested", "()Ljava/util/concurrent/atomic/AtomicReference;", "setSkusRequested", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "market", "onDestroy", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MarketHolder.kt */
public final class MarketHolder implements C0710d {

    /* renamed from: U */
    private AtomicReference<List<String>> f15602U = new AtomicReference<>(C13185o.m40513a());

    /* renamed from: V */
    private AtomicBoolean f15603V = new AtomicBoolean(false);

    /* renamed from: W */
    private Market f15604W;

    /* renamed from: X */
    private final C11976a<C7887p> f15605X;

    /* renamed from: Y */
    private final Provider<Market> f15606Y;

    /* renamed from: Z */
    private final C7873f f15607Z;

    /* renamed from: c */
    private C7900q f15608c;

    public MarketHolder(Provider<Market> provider, C7873f fVar) {
        this.f15606Y = provider;
        this.f15607Z = fVar;
        C11976a<C7887p> p = C11976a.m38563p();
        Intrinsics.checkReturnedValueIsNotNull((Object) p, "BehaviorSubject.create()");
        this.f15605X = p;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: a */
    public final void mo19806a(C7900q qVar) {
        this.f15608c = qVar;
    }

    /* renamed from: b */
    public final AtomicBoolean mo19807b() {
        return this.f15603V;
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public final C11976a<C7887p> mo19808d() {
        return this.f15605X;
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public final C7900q mo19809e() {
        return this.f15608c;
    }

    /* renamed from: f */
    public final AtomicReference<List<String>> mo19810f() {
        return this.f15602U;
    }

    /* renamed from: f */
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: g */
    public final Market mo19811g() {
        if (!this.f15607Z.mo20799c()) {
            return new C7050h();
        }
        if (this.f15604W == null) {
            synchronized (this) {
                if (this.f15604W == null) {
                    this.f15604W = (Market) this.f15606Y.get();
                }
                C13145v vVar = C13145v.f29587a;
            }
        }
        Market market = this.f15604W;
        if (market != null) {
            return market;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: e */
    public void mo4130e(C0722m mVar) {
        this.f15608c = null;
        if (!this.f15607Z.mo20801e()) {
            Market market = this.f15604W;
            if (market != null) {
                market.cleanup();
            }
        }
        this.f15604W = null;
    }
}
