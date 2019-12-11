package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.subscription.Subscription;
import com.bamtech.sdk4.subscription.SubscriptionApi;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p524d0.C11920c;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewModel$State;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "subscriptionApi", "Lcom/bamtech/sdk4/subscription/SubscriptionApi;", "offlineState", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "(Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtech/sdk4/subscription/SubscriptionApi;Lcom/bamtechmedia/dominguez/core/OfflineState;)V", "whenOnlineDisposable", "Lio/reactivex/disposables/Disposable;", "onError", "", "throwable", "", "refreshAccount", "State", "account_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.d.r */
/* compiled from: AccountSettingsViewModel.kt */
public final class C5419r extends C5741g<C5420a> {

    /* renamed from: a */
    private Disposable f12929a;

    /* renamed from: b */
    private final AccountApi f12930b;

    /* renamed from: c */
    private final SubscriptionApi f12931c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3796d f12932d;

    /* renamed from: g.e.b.d.r$a */
    /* compiled from: AccountSettingsViewModel.kt */
    public static final class C5420a {

        /* renamed from: a */
        private final DefaultAccount f12933a;

        /* renamed from: b */
        private final List<Subscription> f12934b;

        /* renamed from: c */
        private final boolean f12935c;

        /* renamed from: d */
        private final boolean f12936d;

        /* renamed from: e */
        private final boolean f12937e;

        public C5420a() {
            this(null, null, false, false, false, 31, null);
        }

        public C5420a(DefaultAccount defaultAccount, List<Subscription> list, boolean z, boolean z2, boolean z3) {
            this.f12933a = defaultAccount;
            this.f12934b = list;
            this.f12935c = z;
            this.f12936d = z2;
            this.f12937e = z3;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.subscription.Subscription>, for r5v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ p163g.p201e.p203b.p204d.C5419r.C5420a m18181a(p163g.p201e.p203b.p204d.C5419r.C5420a r3, com.bamtech.sdk4.account.DefaultAccount r4, java.util.List<com.bamtech.sdk4.subscription.Subscription> r5, boolean r6, boolean r7, boolean r8, int r9, java.lang.Object r10) {
            /*
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                com.bamtech.sdk4.account.DefaultAccount r4 = r3.f12933a
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                java.util.List<com.bamtech.sdk4.subscription.Subscription> r5 = r3.f12934b
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                boolean r6 = r3.f12935c
            L_0x0013:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                boolean r7 = r3.f12936d
            L_0x001a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                boolean r8 = r3.f12937e
            L_0x0021:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                g.e.b.d.r$a r3 = r5.mo17152a(r6, r7, r8, r9, r10)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.C5419r.C5420a.m18181a(g.e.b.d.r$a, com.bamtech.sdk4.account.DefaultAccount, java.util.List, boolean, boolean, boolean, int, java.lang.Object):g.e.b.d.r$a");
        }

        /* renamed from: a */
        public final DefaultAccount mo17151a() {
            return this.f12933a;
        }

        /* renamed from: a */
        public final C5420a mo17152a(DefaultAccount defaultAccount, List<Subscription> list, boolean z, boolean z2, boolean z3) {
            C5420a aVar = new C5420a(defaultAccount, list, z, z2, z3);
            return aVar;
        }

        /* renamed from: b */
        public final boolean mo17153b() {
            return this.f12936d;
        }

        /* renamed from: c */
        public final List<Subscription> mo17154c() {
            return this.f12934b;
        }

        /* renamed from: d */
        public final boolean mo17155d() {
            return this.f12935c;
        }

        /* renamed from: e */
        public final boolean mo17156e() {
            return this.f12937e;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5420a) {
                    C5420a aVar = (C5420a) obj;
                    if (Intrinsics.areEqual((Object) this.f12933a, (Object) aVar.f12933a) && Intrinsics.areEqual((Object) this.f12934b, (Object) aVar.f12934b)) {
                        if (this.f12935c == aVar.f12935c) {
                            if (this.f12936d == aVar.f12936d) {
                                if (this.f12937e == aVar.f12937e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            DefaultAccount defaultAccount = this.f12933a;
            int i = 0;
            int hashCode = (defaultAccount != null ? defaultAccount.hashCode() : 0) * 31;
            List<Subscription> list = this.f12934b;
            if (list != null) {
                i = list.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f12935c;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f12936d;
            if (z2) {
                z2 = true;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.f12937e;
            if (z3) {
                z3 = true;
            }
            return i4 + (z3 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(account=");
            sb.append(this.f12933a);
            sb.append(", subscriptions=");
            sb.append(this.f12934b);
            sb.append(", isLoading=");
            sb.append(this.f12935c);
            sb.append(", error=");
            sb.append(this.f12936d);
            sb.append(", isOnline=");
            sb.append(this.f12937e);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C5420a(DefaultAccount defaultAccount, List list, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            List list2 = null;
            DefaultAccount defaultAccount2 = (i & 1) != 0 ? null : defaultAccount;
            if ((i & 2) == 0) {
                list2 = list;
            }
            this(defaultAccount2, list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
        }
    }

    /* renamed from: g.e.b.d.r$b */
    /* compiled from: AccountSettingsViewModel.kt */
    static final class C5421b extends C12881k implements Function1<C5420a, C5420a> {

        /* renamed from: c */
        final /* synthetic */ C5419r f12938c;

        C5421b(C5419r rVar) {
            this.f12938c = rVar;
            super(1);
        }

        /* renamed from: a */
        public final C5420a invoke(C5420a aVar) {
            C5420a aVar2 = new C5420a(null, null, false, true, this.f12938c.f12932d.mo13695j(), 7, null);
            return aVar2;
        }
    }

    /* renamed from: g.e.b.d.r$c */
    /* compiled from: AccountSettingsViewModel.kt */
    static final /* synthetic */ class C5422c extends C12879i implements Function0<C13145v> {
        C5422c(C5419r rVar) {
            super(0, rVar);
        }

        public final String getName() {
            return "refreshAccount";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5419r.class);
        }

        public final String getSignature() {
            return "refreshAccount()V";
        }

        public final void invoke() {
            ((C5419r) this.receiver).mo17150y();
        }
    }

    /* renamed from: g.e.b.d.r$d */
    /* compiled from: AccountSettingsViewModel.kt */
    static final /* synthetic */ class C5423d extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5423d f12939c = new C5423d();

        C5423d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17161a(Throwable th) {
            Timber.m44523a(th);
        }

        public final String getName() {
            return "e";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(Timber.class);
        }

        public final String getSignature() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17161a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.r$e */
    /* compiled from: AccountSettingsViewModel.kt */
    static final class C5424e<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5419r f12940c;

        /* renamed from: g.e.b.d.r$e$a */
        /* compiled from: AccountSettingsViewModel.kt */
        static final class C5425a extends C12881k implements Function1<C5420a, C5420a> {

            /* renamed from: c */
            public static final C5425a f12941c = new C5425a();

            C5425a() {
                super(1);
            }

            /* renamed from: a */
            public final C5420a invoke(C5420a aVar) {
                return C5420a.m18181a(aVar, null, null, true, false, false, 27, null);
            }
        }

        C5424e(C5419r rVar) {
            this.f12940c = rVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f12940c.updateState(C5425a.f12941c);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, mo31007d2 = {"<anonymous>", "", "accountSubsPair", "Lkotlin/Pair;", "Lcom/bamtech/sdk4/account/DefaultAccount;", "kotlin.jvm.PlatformType", "", "Lcom/bamtech/sdk4/subscription/Subscription;", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.d.r$f */
    /* compiled from: AccountSettingsViewModel.kt */
    static final class C5426f<T> implements Consumer<Pair<? extends DefaultAccount, ? extends List<? extends Subscription>>> {

        /* renamed from: c */
        final /* synthetic */ C5419r f12942c;

        /* renamed from: g.e.b.d.r$f$a */
        /* compiled from: AccountSettingsViewModel.kt */
        static final class C5427a extends C12881k implements Function1<C5420a, C5420a> {

            /* renamed from: c */
            final /* synthetic */ Pair f12943c;

            C5427a(Pair pair) {
                this.f12943c = pair;
                super(1);
            }

            /* renamed from: a */
            public final C5420a invoke(C5420a aVar) {
                C5420a aVar2 = new C5420a((DefaultAccount) this.f12943c.mo31015c(), (List) this.f12943c.mo31016d(), false, false, false, 28, null);
                return aVar2;
            }
        }

        C5426f(C5419r rVar) {
            this.f12942c = rVar;
        }

        /* renamed from: a */
        public final void accept(Pair<DefaultAccount, ? extends List<Subscription>> pair) {
            this.f12942c.updateState(new C5427a(pair));
        }
    }

    /* renamed from: g.e.b.d.r$g */
    /* compiled from: AccountSettingsViewModel.kt */
    static final /* synthetic */ class C5428g extends C12879i implements Function1<Throwable, C13145v> {
        C5428g(C5419r rVar) {
            super(1, rVar);
        }

        /* renamed from: a */
        public final void mo17166a(Throwable th) {
            ((C5419r) this.receiver).m18179a(th);
        }

        public final String getName() {
            return "onError";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5419r.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo17166a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    public C5419r(AccountApi accountApi, SubscriptionApi subscriptionApi, C3796d dVar) {
        super(null, 1, null);
        this.f12930b = accountApi;
        this.f12931c = subscriptionApi;
        this.f12932d = dVar;
        C5420a aVar = new C5420a(null, null, false, false, false, 31, null);
        createState(aVar);
    }

    /* renamed from: y */
    public final void mo17150y() {
        Timber.m44522a("refreshAccount", new Object[0]);
        Single g = this.f12930b.getAccount().mo30134g();
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "accountApi.getAccount().toSingle()");
        Single c = C11920c.m38475a(g, this.f12931c.getSubscriptions()).mo30222c((Consumer<? super Disposable>) new C5424e<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) c, "accountApi.getAccount().…opy(isLoading = true) } }");
        Object a = c.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C5426f(this), new C5432t(new C5428g(this)));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [g.e.b.d.r$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r2v0, types: [g.e.b.d.t] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m18179a(java.lang.Throwable r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Refresh Account failed"
            p686n.p687a.Timber.m44528b(r4, r1, r0)
            g.e.b.d.r$b r4 = new g.e.b.d.r$b
            r4.<init>(r3)
            r3.updateState(r4)
            com.bamtechmedia.dominguez.core.d r4 = r3.f12932d
            boolean r4 = r4.mo13695j()
            if (r4 != 0) goto L_0x0051
            io.reactivex.disposables.Disposable r4 = r3.f12929a
            if (r4 != 0) goto L_0x0051
            com.bamtechmedia.dominguez.core.d r4 = r3.f12932d
            io.reactivex.Completable r4 = r4.mo13697n()
            g.n.a.c0 r0 = r3.getViewModelScope()
            g.n.a.h r0 = p163g.p503n.p504a.C11793e.m37930a(r0)
            java.lang.Object r4 = r4.mo30048a(r0)
            java.lang.String r0 = "this.`as`(AutoDispose.au…isposable<Any>(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r4, r0)
            g.n.a.v r4 = (p163g.p503n.p504a.C11839v) r4
            g.e.b.d.r$c r0 = new g.e.b.d.r$c
            r0.<init>(r3)
            g.e.b.d.s r1 = new g.e.b.d.s
            r1.<init>(r0)
            g.e.b.d.r$d r0 = p163g.p201e.p203b.p204d.C5419r.C5423d.f12939c
            if (r0 == 0) goto L_0x0049
            g.e.b.d.t r2 = new g.e.b.d.t
            r2.<init>(r0)
            r0 = r2
        L_0x0049:
            io.reactivex.functions.Consumer r0 = (p520io.reactivex.functions.Consumer) r0
            io.reactivex.disposables.Disposable r4 = r4.mo29926a(r1, r0)
            r3.f12929a = r4
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p204d.C5419r.m18179a(java.lang.Throwable):void");
    }
}
