package com.bamtechmedia.dominguez.main.p234w;

import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.main.p235x.C6219d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6226g;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6230k;
import com.bamtechmedia.dominguez.paywall.exceptions.C6261a;
import javax.inject.Provider;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7887p;
import p163g.p201e.p203b.p319v.C7887p.C7890c;
import p163g.p201e.p203b.p319v.C7887p.C7899l;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p201e.p203b.p319v.p320a0.C7820a;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0018H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006#"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/paywall/MainActivityPaywallHandler;", "", "paywallRepositoryProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/paywall/PaywallRepository;", "paywallServicesInteractor", "Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;", "(Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/paywall/PaywallServicesInteractor;)V", "tempAccessDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "tempAccessDisposable$annotations", "()V", "getTempAccessDisposable$mainApp_release", "()Lio/reactivex/disposables/CompositeDisposable;", "setTempAccessDisposable$mainApp_release", "(Lio/reactivex/disposables/CompositeDisposable;)V", "clear", "", "()Lkotlin/Unit;", "clearPaywall", "handlePaywallEvents", "event", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent;", "handleTempAccessResolved", "Lcom/bamtechmedia/dominguez/paywall/PaywallServiceEvent$TempAccessResolved;", "mapAccountStateForPaywall", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState;", "mapPaywallToSubscriptionStatus", "paywall", "Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;", "mapThrowableToSubscriptionState", "throwable", "", "resolveTempAccess", "mainApp_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.w.a */
/* compiled from: MainActivityPaywallHandler.kt */
public final class C6206a {

    /* renamed from: a */
    private CompositeDisposable f14239a;

    /* renamed from: b */
    private final Provider<C7885o> f14240b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7900q f14241c;

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$a */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final class C6207a implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6206a f14242a;

        C6207a(C6206a aVar) {
            this.f14242a = aVar;
        }

        public final void run() {
            this.f14242a.f14241c.mo20746d();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$b */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final class C6208b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6208b f14243c = new C6208b();

        C6208b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44528b(th, "Error in linking accounts after temp access resolution.", new Object[0]);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$c */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final /* synthetic */ class C6209c extends C12879i implements Function1<C7820a, C6219d> {
        C6209c(C6206a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final C6219d invoke(C7820a aVar) {
            return ((C6206a) this.receiver).m19687a(aVar);
        }

        public final String getName() {
            return "mapPaywallToSubscriptionStatus";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C6206a.class);
        }

        public final String getSignature() {
            return "mapPaywallToSubscriptionStatus(Lcom/bamtechmedia/dominguez/paywall/model/DmgzPaywall;)Lcom/bamtechmedia/dominguez/main/state/MainActivityState;";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$d */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final /* synthetic */ class C6210d extends C12879i implements Function1<Throwable, C6219d> {
        C6210d(C6206a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final C6219d invoke(Throwable th) {
            return ((C6206a) this.receiver).m19688a(th);
        }

        public final String getName() {
            return "mapThrowableToSubscriptionState";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C6206a.class);
        }

        public final String getSignature() {
            return "mapThrowableToSubscriptionState(Ljava/lang/Throwable;)Lcom/bamtechmedia/dominguez/main/state/MainActivityState;";
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$e */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final class C6211e<T> implements Consumer<C7887p> {

        /* renamed from: c */
        final /* synthetic */ C6206a f14244c;

        C6211e(C6206a aVar) {
            this.f14244c = aVar;
        }

        /* renamed from: a */
        public final void accept(C7887p pVar) {
            C6206a aVar = this.f14244c;
            C12880j.m40222a((Object) pVar, "it");
            aVar.m19692a(pVar);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.w.a$f */
    /* compiled from: MainActivityPaywallHandler.kt */
    static final /* synthetic */ class C6212f extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C6212f f14245c = new C6212f();

        C6212f() {
            super(1);
        }

        /* renamed from: a */
        public final void mo18809a(Throwable th) {
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
            mo18809a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C6206a(Provider<C7885o> provider, C7900q qVar) {
        this.f14240b = provider;
        this.f14241c = qVar;
    }

    /* renamed from: d */
    private final C13145v m19693d() {
        CompositeDisposable compositeDisposable = this.f14239a;
        if (compositeDisposable == null) {
            return null;
        }
        compositeDisposable.dispose();
        return C13145v.f29587a;
    }

    /* renamed from: b */
    public final Single<C6219d> mo18803b() {
        C5855o oVar = C5855o.f13640a;
        Single<C6219d> i = ((C7885o) this.f14240b.get()).mo19841a(true).mo30233g(new C6214c(new C6209c(this))).mo30237i(new C6214c(new C6210d(this)));
        C12880j.m40222a((Object) i, "paywallRepositoryProvide…wableToSubscriptionState)");
        return i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bamtechmedia.dominguez.main.w.a$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.bamtechmedia.dominguez.main.w.b] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18804c() {
        /*
            r5 = this;
            io.reactivex.disposables.CompositeDisposable r0 = r5.f14239a
            if (r0 == 0) goto L_0x0007
            r0.dispose()
        L_0x0007:
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r5.f14239a = r0
            io.reactivex.disposables.CompositeDisposable r0 = r5.f14239a
            if (r0 == 0) goto L_0x0030
            g.e.b.v.q r1 = r5.f14241c
            io.reactivex.subjects.a r1 = r1.mo20744b()
            com.bamtechmedia.dominguez.main.w.a$e r2 = new com.bamtechmedia.dominguez.main.w.a$e
            r2.<init>(r5)
            com.bamtechmedia.dominguez.main.w.a$f r3 = com.bamtechmedia.dominguez.main.p234w.C6206a.C6212f.f14245c
            if (r3 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.main.w.b r4 = new com.bamtechmedia.dominguez.main.w.b
            r4.<init>(r3)
            r3 = r4
        L_0x0027:
            io.reactivex.functions.Consumer r3 = (p520io.reactivex.functions.Consumer) r3
            io.reactivex.disposables.Disposable r1 = r1.mo30157a(r2, r3)
            r0.mo30250b(r1)
        L_0x0030:
            g.e.b.v.q r0 = r5.f14241c
            r0.mo20739a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.main.p234w.C6206a.mo18804c():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6219d m19687a(C7820a aVar) {
        if (aVar.mo20725c()) {
            return C6230k.f14267a;
        }
        return C6226g.f14263a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C6219d m19688a(Throwable th) {
        C6219d dVar;
        if (th instanceof C6261a) {
            C7820a a = ((C6261a) th).mo18844a();
            if (a == null) {
                return C6226g.f14263a;
            }
            dVar = m19687a(a);
        } else {
            dVar = C6226g.f14263a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo18802a() {
        ((C7885o) this.f14240b.get()).mo19845b(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19692a(C7887p pVar) {
        if (pVar instanceof C7899l) {
            m19691a((C7899l) pVar);
        } else if (pVar instanceof C7890c) {
            m19693d();
        }
    }

    /* renamed from: a */
    private final void m19691a(C7899l lVar) {
        if (lVar.mo20829b()) {
            CompositeDisposable compositeDisposable = this.f14239a;
            if (compositeDisposable != null) {
                compositeDisposable.mo30250b(this.f14241c.mo20738a(lVar.mo20828a()).mo30047a(new C6207a(this), C6208b.f14243c));
                return;
            }
            return;
        }
        m19693d();
    }
}
