package com.bamtechmedia.dominguez.purchase;

import android.app.Activity;
import com.bamtech.sdk4.purchase.AccessStatus;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.offline.C6239a;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6252a;
import com.bamtechmedia.dominguez.paywall.exceptions.PaywallError.C6260i;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p319v.C7884n;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7885o.C7886a;
import p163g.p201e.p203b.p319v.C7887p;
import p163g.p201e.p203b.p319v.C7887p.C7888a;
import p163g.p201e.p203b.p319v.C7887p.C7889b;
import p163g.p201e.p203b.p319v.C7887p.C7890c;
import p163g.p201e.p203b.p319v.C7887p.C7892e;
import p163g.p201e.p203b.p319v.C7887p.C7893f;
import p163g.p201e.p203b.p319v.C7887p.C7894g;
import p163g.p201e.p203b.p319v.C7887p.C7895h;
import p163g.p201e.p203b.p319v.C7887p.C7896i;
import p163g.p201e.p203b.p319v.C7887p.C7897j;
import p163g.p201e.p203b.p319v.C7887p.C7898k;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p163g.p201e.p203b.p319v.p320a0.C7822c;
import p163g.p201e.p203b.p319v.p320a0.C7823d;
import p163g.p201e.p203b.p319v.p321b0.C7838e.C7840b;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010%\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\b\u00102\u001a\u00020\"H\u0016J\u0016\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u001eH\u0002J\u0006\u0010;\u001a\u00020\"J\u0010\u0010<\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/purchase/PaywallViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/purchase/PaywallState;", "paywallListener", "Lcom/bamtechmedia/dominguez/paywall/PaywallListener;", "marketHolder", "Lcom/bamtechmedia/dominguez/purchase/MarketHolder;", "mainScheduler", "Lio/reactivex/Scheduler;", "subscriptionMessage", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "paywallRepository", "Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "contentLicenseRenewal", "Lcom/bamtechmedia/dominguez/offline/ContentLicenseRenewal;", "type", "Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment$Type;", "isDevSkipEnabled", "", "errorHandler", "Lcom/bamtechmedia/dominguez/purchase/PaywallErrorHandler;", "paywallAnalytics", "Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;", "(Lcom/bamtechmedia/dominguez/paywall/PaywallListener;Lcom/bamtechmedia/dominguez/purchase/MarketHolder;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;Lcom/bamtechmedia/dominguez/offline/ContentLicenseRenewal;Lcom/bamtechmedia/dominguez/paywall/ui/PaywallFragment$Type;ZLcom/bamtechmedia/dominguez/purchase/PaywallErrorHandler;Lcom/bamtechmedia/dominguez/purchase/PaywallAnalytics;)V", "entranceAnimationAlreadyDone", "getEntranceAnimationAlreadyDone", "()Z", "setEntranceAnimationAlreadyDone", "(Z)V", "servicesInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "getServicesInteractor", "()Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "confirmLoginStatus", "", "fetchPaywall", "handleSuccessfulState", "serviceEvent", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "linkSubscriptionsToAccount", "accessStatus", "Lcom/bamtech/sdk4/purchase/AccessStatus;", "mapErrorState", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$Error;", "mapServiceEventFatalError", "throwable", "", "observePaywall", "observePaywallEvents", "onAccessGranted", "onCleared", "purchaseClicked", "activity", "Landroid/app/Activity;", "product", "Lcom/bamtechmedia/dominguez/paywall/model/PaywallProduct;", "renewLicenses", "Lio/reactivex/Completable;", "requireServiceInteractor", "restoreClicked", "setActiveSubscription", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.purchase.v */
/* compiled from: PaywallViewModel.kt */
public final class C7084v extends C5741g<C7083u> {

    /* renamed from: a */
    private boolean f15705a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7884n f15706b;

    /* renamed from: c */
    private final MarketHolder f15707c;

    /* renamed from: d */
    private final C11969r f15708d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7908x f15709e;

    /* renamed from: f */
    private final C7885o f15710f;

    /* renamed from: g */
    private final C6239a f15711g;

    /* renamed from: h */
    private final C7840b f15712h;

    /* renamed from: i */
    private final boolean f15713i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C7061p f15714j;

    /* renamed from: k */
    private final C7051i f15715k;

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$a */
    /* compiled from: PaywallViewModel.kt */
    static final class C7085a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7084v f15716a;

        C7085a(C7084v vVar) {
            this.f15716a = vVar;
        }

        public final void run() {
            this.f15716a.m21473a((C7887p) C7896i.f17023a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$b */
    /* compiled from: PaywallViewModel.kt */
    static final class C7086b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7084v f15717c;

        C7086b(C7084v vVar) {
            this.f15717c = vVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "paywall", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.v$c */
    /* compiled from: PaywallViewModel.kt */
    static final class C7087c<T> implements Consumer<C7820a> {

        /* renamed from: c */
        final /* synthetic */ C7084v f15718c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.v$c$a */
        /* compiled from: PaywallViewModel.kt */
        static final class C7088a extends C12881k implements Function1<C7083u, C7083u> {

            /* renamed from: c */
            final /* synthetic */ C7820a f15719c;

            C7088a(C7820a aVar) {
                this.f15719c = aVar;
                super(1);
            }

            /* renamed from: a */
            public final C7083u invoke(C7083u uVar) {
                return C7083u.m21456a(uVar, null, false, false, this.f15719c, false, 19, null);
            }
        }

        C7087c(C7084v vVar) {
            this.f15718c = vVar;
        }

        /* renamed from: a */
        public final void accept(C7820a aVar) {
            this.f15718c.updateState(new C7088a(aVar));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.v$d */
    /* compiled from: PaywallViewModel.kt */
    static final class C7089d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7084v f15720c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.v$d$a */
        /* compiled from: PaywallViewModel.kt */
        static final class C7090a extends C12881k implements Function1<C7083u, C7083u> {

            /* renamed from: c */
            public static final C7090a f15721c = new C7090a();

            C7090a() {
                super(1);
            }

            /* renamed from: a */
            public final C7083u invoke(C7083u uVar) {
                return C7083u.m21456a(uVar, null, false, false, null, false, 25, null);
            }
        }

        C7089d(C7084v vVar) {
            this.f15720c = vVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C7061p a = this.f15720c.f15714j;
            C12880j.m40222a((Object) th, "throwable");
            if (!a.mo19839b(th)) {
                this.f15720c.f15714j.mo19838a(th);
            }
            this.f15720c.updateState(C7090a.f15721c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$e */
    /* compiled from: PaywallViewModel.kt */
    static final class C7091e extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7091e f15722c = new C7091e();

        C7091e() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, false, false, null, false, 24, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$f */
    /* compiled from: PaywallViewModel.kt */
    static final class C7092f extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7092f f15723c = new C7092f();

        C7092f() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, false, false, null, true, 15, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$g */
    /* compiled from: PaywallViewModel.kt */
    static final class C7093g extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7093g f15724c = new C7093g();

        C7093g() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, true, true, null, false, 24, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$h */
    /* compiled from: PaywallViewModel.kt */
    static final class C7094h implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7084v f15725a;

        C7094h(C7084v vVar) {
            this.f15725a = vVar;
        }

        public final void run() {
            this.f15725a.mo19875C();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.v$i */
    /* compiled from: PaywallViewModel.kt */
    static final class C7095i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C7084v f15726c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.v$i$a */
        /* compiled from: PaywallViewModel.kt */
        static final class C7096a extends C12881k implements Function1<C7083u, C7083u> {

            /* renamed from: c */
            public static final C7096a f15727c = new C7096a();

            C7096a() {
                super(1);
            }

            /* renamed from: a */
            public final C7083u invoke(C7083u uVar) {
                return C7083u.m21456a(uVar, C6252a.f14291a, false, false, null, false, 24, null);
            }
        }

        C7095i(C7084v vVar) {
            this.f15726c = vVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C7061p a = this.f15726c.f15714j;
            C12880j.m40222a((Object) th, "throwable");
            a.mo19838a(th);
            this.f15726c.updateState(C7096a.f15727c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$j */
    /* compiled from: PaywallViewModel.kt */
    static final class C7097j extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        final /* synthetic */ C7889b f15728c;

        C7097j(C7889b bVar) {
            this.f15728c = bVar;
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, this.f15728c.mo20804a(), false, false, null, false, 24, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$k */
    /* compiled from: PaywallViewModel.kt */
    static final class C7098k extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7098k f15729c = new C7098k();

        C7098k() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, C6260i.f14299a, false, false, null, false, 24, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$l */
    /* compiled from: PaywallViewModel.kt */
    static final /* synthetic */ class C7099l extends C12879i implements Function1<C7887p, C13145v> {
        C7099l(C7084v vVar) {
            super(1, vVar);
        }

        /* renamed from: a */
        public final void mo19893a(C7887p pVar) {
            ((C7084v) this.receiver).m21473a(pVar);
        }

        public final String getName() {
            return "handleSuccessfulState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7084v.class);
        }

        public final String getSignature() {
            return "handleSuccessfulState(Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19893a((C7887p) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$m */
    /* compiled from: PaywallViewModel.kt */
    static final /* synthetic */ class C7100m extends C12879i implements Function1<Throwable, C13145v> {
        C7100m(C7084v vVar) {
            super(1, vVar);
        }

        /* renamed from: a */
        public final void mo19894a(Throwable th) {
            ((C7084v) this.receiver).m21474a(th);
        }

        public final String getName() {
            return "mapServiceEventFatalError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7084v.class);
        }

        public final String getSignature() {
            return "mapServiceEventFatalError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19894a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.purchase.v$n */
    /* compiled from: PaywallViewModel.kt */
    static final class C7101n<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C7084v f15730c;

        /* renamed from: com.bamtechmedia.dominguez.purchase.v$n$a */
        /* compiled from: PaywallViewModel.kt */
        static final class C7102a extends C12881k implements Function1<C7083u, C7083u> {

            /* renamed from: c */
            public static final C7102a f15731c = new C7102a();

            C7102a() {
                super(1);
            }

            /* renamed from: a */
            public final C7083u invoke(C7083u uVar) {
                return C7083u.m21456a(uVar, null, true, true, null, false, 25, null);
            }
        }

        C7101n(C7084v vVar) {
            this.f15730c = vVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f15730c.updateState(C7102a.f15731c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$o */
    /* compiled from: PaywallViewModel.kt */
    static final class C7103o implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7084v f15732a;

        C7103o(C7084v vVar) {
            this.f15732a = vVar;
        }

        public final void run() {
            this.f15732a.f15706b.mo18811c();
            this.f15732a.f15709e.mo20834a(true);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$p */
    /* compiled from: PaywallViewModel.kt */
    static final class C7104p implements C11945a {

        /* renamed from: a */
        public static final C7104p f15733a = new C7104p();

        C7104p() {
        }

        public final void run() {
            C14100a.m44522a("RenewLicenses Completed", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$q */
    /* compiled from: PaywallViewModel.kt */
    static final /* synthetic */ class C7105q extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7105q f15734c = new C7105q();

        C7105q() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19897a(Throwable th) {
            C14100a.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C14100a.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19897a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$r */
    /* compiled from: PaywallViewModel.kt */
    static final class C7106r extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7106r f15735c = new C7106r();

        C7106r() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, true, false, null, false, 29, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$s */
    /* compiled from: PaywallViewModel.kt */
    static final class C7107s extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7107s f15736c = new C7107s();

        C7107s() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, true, true, null, false, 25, null);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.purchase.v$t */
    /* compiled from: PaywallViewModel.kt */
    static final class C7108t extends C12881k implements Function1<C7083u, C7083u> {

        /* renamed from: c */
        public static final C7108t f15737c = new C7108t();

        C7108t() {
            super(1);
        }

        /* renamed from: a */
        public final C7083u invoke(C7083u uVar) {
            return C7083u.m21456a(uVar, null, false, true, null, true, 11, null);
        }
    }

    public C7084v(C7884n nVar, MarketHolder marketHolder, C11969r rVar, C7908x xVar, C7885o oVar, C6239a aVar, C7840b bVar, boolean z, C7061p pVar, C7051i iVar) {
        super(null, 1, null);
        this.f15706b = nVar;
        this.f15707c = marketHolder;
        this.f15708d = rVar;
        this.f15709e = xVar;
        this.f15710f = oVar;
        this.f15711g = aVar;
        this.f15712h = bVar;
        this.f15713i = z;
        this.f15714j = pVar;
        this.f15715k = iVar;
        m21465G();
    }

    /* renamed from: E */
    private final void m21463E() {
        Object a = C7886a.m23101b(this.f15710f, false, 1, null).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C7087c(this), new C7089d(this));
    }

    /* renamed from: F */
    private final C7900q m21464F() {
        return this.f15707c.mo19809e();
    }

    /* renamed from: G */
    private final void m21465G() {
        C7083u uVar = new C7083u(null, false, true, null, false, 27, null);
        createState(uVar);
        mo19874B();
        m21463E();
    }

    /* renamed from: H */
    private final Completable m21466H() {
        if (this.f15712h == C7840b.RESTART) {
            C6239a aVar = this.f15711g;
            if (aVar != null) {
                return aVar.mo18833a();
            }
        }
        Completable h = Completable.m38169h();
        C12880j.m40222a((Object) h, "Completable.complete()");
        return h;
    }

    /* renamed from: I */
    private final C7900q m21467I() {
        C7900q F = m21464F();
        if (F != null) {
            return F;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: A */
    public final boolean mo19873A() {
        return this.f15713i;
    }

    /* renamed from: B */
    public final void mo19874B() {
        Observable a = this.f15707c.mo19808d().mo30171b(C11934b.m38500b()).mo30151a(this.f15708d);
        C12880j.m40222a((Object) a, "marketHolder.serviceEven….observeOn(mainScheduler)");
        Object a2 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a2).mo29915a(new C7109w(new C7099l(this)), new C7109w(new C7100m(this)));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bamtechmedia.dominguez.purchase.v$q, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.purchase.w] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19875C() {
        /*
            r4 = this;
            io.reactivex.Completable r0 = r4.m21466H()
            com.bamtechmedia.dominguez.purchase.v$n r1 = new com.bamtechmedia.dominguez.purchase.v$n
            r1.<init>(r4)
            io.reactivex.Completable r0 = r0.mo30052c(r1)
            io.reactivex.Completable r0 = r0.mo30055f()
            com.bamtechmedia.dominguez.purchase.v$o r1 = new com.bamtechmedia.dominguez.purchase.v$o
            r1.<init>(r4)
            io.reactivex.Completable r0 = r0.mo30050b(r1)
            java.lang.String r1 = "renewLicenses()\n        …ested(true)\n            }"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.c0 r1 = r4.getViewModelScope()
            g.n.a.h r1 = p163g.p503n.p504a.C11793e.m37930a(r1)
            java.lang.Object r0 = r0.mo30048a(r1)
            java.lang.String r1 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            g.n.a.v r0 = (p163g.p503n.p504a.C11839v) r0
            com.bamtechmedia.dominguez.purchase.v$p r1 = com.bamtechmedia.dominguez.purchase.C7084v.C7104p.f15733a
            com.bamtechmedia.dominguez.purchase.v$q r2 = com.bamtechmedia.dominguez.purchase.C7084v.C7105q.f15734c
            if (r2 == 0) goto L_0x003e
            com.bamtechmedia.dominguez.purchase.w r3 = new com.bamtechmedia.dominguez.purchase.w
            r3.<init>(r2)
            r2 = r3
        L_0x003e:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            r0.mo29926a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.purchase.C7084v.mo19875C():void");
    }

    /* renamed from: D */
    public final void mo19876D() {
        updateState(C7107s.f15736c);
        m21467I().mo20747e();
    }

    /* renamed from: d */
    public final void mo19878d(boolean z) {
        this.f15705a = z;
    }

    public void onCleared() {
        super.onCleared();
        C7900q F = m21464F();
        if (F != null) {
            F.mo20745c();
        }
    }

    /* renamed from: y */
    public final void mo19879y() {
        Object a = this.f15710f.mo19840a().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C7085a(this), new C7086b(this));
    }

    /* renamed from: z */
    public final boolean mo19880z() {
        return this.f15705a;
    }

    /* renamed from: b */
    private final void m21476b(AccessStatus accessStatus) {
        updateState(C7108t.f15737c);
        m21469a(accessStatus);
    }

    /* renamed from: a */
    public final void mo19877a(Activity activity, C7823d dVar) {
        updateState(C7106r.f15735c);
        m21467I().mo20742a(activity, ((C7822c) dVar).mo20735f());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21473a(C7887p pVar) {
        if (pVar instanceof C7893f) {
            if (((C7893f) pVar).mo20816a()) {
                m21463E();
            }
        } else if (pVar instanceof C7895h) {
            m21463E();
        } else if (pVar instanceof C7888a) {
            updateState(C7091e.f15722c);
        } else if (pVar instanceof C7897j) {
            m21476b(((C7897j) pVar).mo20824a());
        } else if (pVar instanceof C7894g) {
            m21476b(((C7894g) pVar).mo20820a());
        } else if (pVar instanceof C7889b) {
            m21472a((C7889b) pVar);
        } else if (pVar instanceof C7898k) {
            updateState(C7092f.f15723c);
            this.f15714j.mo19836a();
        } else if ((pVar instanceof C7890c) || C12880j.m40224a((Object) pVar, (Object) C7896i.f17023a)) {
            mo19875C();
        } else if (pVar instanceof C7892e) {
            this.f15715k.mo19832c();
            updateState(C7093g.f15724c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21474a(Throwable th) {
        C14100a.m44530c(th, "Error observing Paywall Events.", new Object[0]);
        this.f15714j.mo19838a(th);
        updateState(C7098k.f15729c);
    }

    /* renamed from: a */
    private final void m21472a(C7889b bVar) {
        this.f15714j.mo19837a(bVar);
        updateState(new C7097j(bVar));
    }

    /* renamed from: a */
    private final void m21469a(AccessStatus accessStatus) {
        Object a = m21467I().mo20738a(accessStatus).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C7094h(this), new C7095i(this));
    }
}
