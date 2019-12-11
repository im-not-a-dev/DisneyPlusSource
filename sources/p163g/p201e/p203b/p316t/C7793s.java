package p163g.p201e.p203b.p316t;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.account.DefaultAccount;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.design.widgets.C5666c;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.legal.BuildConfig;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import org.reactivestreams.C14314c;
import p163g.p201e.p203b.p204d.C5407l0;
import p163g.p201e.p203b.p204d.C5434u;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11842x;
import p163g.p503n.p504a.C11844z;
import p163g.p509o.p510a.p511l.C11866a;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11957k;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/options/OptionsViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/options/OptionsViewModel$State;", "router", "Lcom/bamtechmedia/dominguez/options/OptionsRouter;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "optionsItemProvider", "Lcom/bamtechmedia/dominguez/options/OptionsItemProvider;", "isTelevision", "", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "accountSettingsChecker", "Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;", "(Lcom/bamtechmedia/dominguez/options/OptionsRouter;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/options/OptionsItemProvider;ZLcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/account/AccountSettingsViewedChecker;)V", "createOptions", "", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "showVerifyBadge", "loadAccountInfo", "", "refreshOptions", "State", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.t.s */
/* compiled from: OptionsViewModel.kt */
public final class C7793s extends C5741g<C7794a> {

    /* renamed from: a */
    private final C7777f f16876a;

    /* renamed from: b */
    private final C6667g1 f16877b;

    /* renamed from: c */
    private final AccountApi f16878c;

    /* renamed from: d */
    private final C7776e f16879d;

    /* renamed from: e */
    private final boolean f16880e;

    /* renamed from: f */
    private final BuildInfo f16881f;

    /* renamed from: g */
    private final C5434u f16882g;

    /* renamed from: g.e.b.t.s$a */
    /* compiled from: OptionsViewModel.kt */
    public static final class C7794a {

        /* renamed from: a */
        private final List<C11866a> f16883a;

        /* renamed from: b */
        private final boolean f16884b;

        public C7794a() {
            this(null, false, 3, null);
        }

        public C7794a(List<? extends C11866a> list, boolean z) {
            this.f16883a = list;
            this.f16884b = z;
        }

        /* renamed from: a */
        public final boolean mo20700a() {
            return this.f16884b;
        }

        /* renamed from: b */
        public final List<C11866a> mo20701b() {
            return this.f16883a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C7794a) {
                    C7794a aVar = (C7794a) obj;
                    if (C12880j.m40224a((Object) this.f16883a, (Object) aVar.f16883a)) {
                        if (this.f16884b == aVar.f16884b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C11866a> list = this.f16883a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f16884b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(options=");
            sb.append(this.f16883a);
            sb.append(", loading=");
            sb.append(this.f16884b);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C7794a(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            this(list, z);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "account", "Lcom/bamtech/sdk4/account/DefaultAccount;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.t.s$b */
    /* compiled from: OptionsViewModel.kt */
    static final class C7795b<T> implements Consumer<DefaultAccount> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f16885U;

        /* renamed from: c */
        final /* synthetic */ C7793s f16886c;

        /* renamed from: g.e.b.t.s$b$a */
        /* compiled from: OptionsViewModel.kt */
        static final class C7796a extends C12881k implements Function1<C7794a, C7794a> {

            /* renamed from: U */
            final /* synthetic */ DefaultAccount f16887U;

            /* renamed from: c */
            final /* synthetic */ C7795b f16888c;

            C7796a(C7795b bVar, DefaultAccount defaultAccount) {
                this.f16888c = bVar;
                this.f16887U = defaultAccount;
                super(1);
            }

            /* renamed from: a */
            public final C7794a invoke(C7794a aVar) {
                C7795b bVar = this.f16888c;
                C7793s sVar = bVar.f16886c;
                C6626c0 c0Var = bVar.f16885U;
                DefaultAccount defaultAccount = this.f16887U;
                C12880j.m40222a((Object) defaultAccount, SubjectTokenTypes.ACCOUNT);
                return new C7794a(sVar.m22879a(c0Var, !C5407l0.m18172b(defaultAccount)), false, 2, null);
            }
        }

        C7795b(C7793s sVar, C6626c0 c0Var) {
            this.f16886c = sVar;
            this.f16885U = c0Var;
        }

        /* renamed from: a */
        public final void accept(DefaultAccount defaultAccount) {
            this.f16886c.updateState(new C7796a(this, defaultAccount));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.t.s$c */
    /* compiled from: OptionsViewModel.kt */
    static final class C7797c<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ C6626c0 f16889U;

        /* renamed from: c */
        final /* synthetic */ C7793s f16890c;

        /* renamed from: g.e.b.t.s$c$a */
        /* compiled from: OptionsViewModel.kt */
        static final class C7798a extends C12881k implements Function1<C7794a, C7794a> {

            /* renamed from: c */
            final /* synthetic */ C7797c f16891c;

            C7798a(C7797c cVar) {
                this.f16891c = cVar;
                super(1);
            }

            /* renamed from: a */
            public final C7794a invoke(C7794a aVar) {
                C7797c cVar = this.f16891c;
                return new C7794a(C7793s.m22881a(cVar.f16890c, cVar.f16889U, false, 2, null), false, 2, null);
            }
        }

        C7797c(C7793s sVar, C6626c0 c0Var) {
            this.f16890c = sVar;
            this.f16889U = c0Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16890c.updateState(new C7798a(this));
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.t.s$d */
    /* compiled from: OptionsViewModel.kt */
    static final class C7799d<T> implements Consumer<C14314c> {

        /* renamed from: c */
        final /* synthetic */ C7793s f16892c;

        /* renamed from: g.e.b.t.s$d$a */
        /* compiled from: OptionsViewModel.kt */
        static final class C7800a extends C12881k implements Function1<C7794a, C7794a> {

            /* renamed from: c */
            public static final C7800a f16893c = new C7800a();

            C7800a() {
                super(1);
            }

            /* renamed from: a */
            public final C7794a invoke(C7794a aVar) {
                return new C7794a(null, true, 1, null);
            }
        }

        C7799d(C7793s sVar) {
            this.f16892c = sVar;
        }

        /* renamed from: a */
        public final void accept(C14314c cVar) {
            this.f16892c.updateState(C7800a.f16893c);
        }
    }

    /* renamed from: g.e.b.t.s$e */
    /* compiled from: OptionsViewModel.kt */
    static final class C7801e<T> implements Consumer<C6626c0> {

        /* renamed from: c */
        final /* synthetic */ C7793s f16894c;

        C7801e(C7793s sVar) {
            this.f16894c = sVar;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            C7793s sVar = this.f16894c;
            C12880j.m40222a((Object) c0Var, "profile");
            sVar.m22882a(c0Var);
        }
    }

    /* renamed from: g.e.b.t.s$f */
    /* compiled from: OptionsViewModel.kt */
    static final class C7802f<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7802f f16895c = new C7802f();

        C7802f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C14100a.m44523a(th);
        }
    }

    public C7793s(C7777f fVar, C6667g1 g1Var, AccountApi accountApi, C7776e eVar, boolean z, BuildInfo buildInfo, C5434u uVar) {
        super(null, 1, null);
        this.f16876a = fVar;
        this.f16877b = g1Var;
        this.f16878c = accountApi;
        this.f16879d = eVar;
        this.f16880e = z;
        this.f16881f = buildInfo;
        this.f16882g = uVar;
        createState(new C7794a(null, false, 3, null));
    }

    /* renamed from: y */
    public final void mo20699y() {
        Flowable c = this.f16877b.mo19377a().mo30061a().mo30089c((Consumer<? super C14314c>) new C7799d<Object>(this));
        C12880j.m40222a((Object) c, "profilesRepository.activ…State(loading = true) } }");
        Object a = c.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a).mo29927a(new C7801e(this), C7802f.f16895c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22882a(C6626c0 c0Var) {
        Object a = this.f16878c.getAccount().mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11844z) a).mo29929a(new C7795b(this, c0Var), new C7797c(this, c0Var));
    }

    /* renamed from: a */
    static /* synthetic */ List m22881a(C7793s sVar, C6626c0 c0Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sVar.m22879a(c0Var, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C11866a> m22879a(C6626c0 c0Var, boolean z) {
        List<C7774c> a = this.f16879d.mo20688a(c0Var.mo19354R());
        Collection arrayList = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (C7774c cVar : a) {
            arrayList.add(new C7791r(cVar, this.f16876a, cVar == C7774c.ACCOUNT && z && !this.f16882g.mo17168a()));
        }
        if (this.f16880e) {
            arrayList = C13199w.m40563a(arrayList, (Object) C5666c.f13300c);
        }
        return C13199w.m40563a(arrayList, (Object) new C7803t(BuildConfig.VERSION_NAME, this.f16881f.mo12781d()));
    }
}
