package p163g.p201e.p203b.p298l;

import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import java.util.Map;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeDelegate;", "", "sessionInfoOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "profilesSetup", "Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "subscriptionMessage", "Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;", "paywallConfig", "Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "router", "Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeRouter;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;Lcom/bamtechmedia/dominguez/paywall/SubscriptionMessage;Lcom/bamtechmedia/dominguez/paywall/PaywallConfig;Lcom/bamtechmedia/dominguez/core/BuildInfo;Lcom/bamtechmedia/dominguez/dialog/FreeTrialWelcomeRouter;)V", "startDialog", "", "countryCode", "", "startIfNeeded", "scopeProvider", "Lcom/uber/autodispose/ScopeProvider;", "paywall_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.l.h */
/* compiled from: FreeTrialWelcomeDelegate.kt */
public final class C7509h {

    /* renamed from: a */
    private final Single<SessionInfo> f16465a;

    /* renamed from: b */
    private final C6722l1 f16466b;

    /* renamed from: c */
    private final C7908x f16467c;

    /* renamed from: d */
    private final C7873f f16468d;

    /* renamed from: e */
    private final BuildInfo f16469e;

    /* renamed from: f */
    private final C7530o f16470f;

    /* renamed from: g.e.b.l.h$a */
    /* compiled from: FreeTrialWelcomeDelegate.kt */
    static final class C7510a<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C7510a f16471c = new C7510a();

        C7510a() {
        }

        /* renamed from: a */
        public final String apply(SessionInfo sessionInfo) {
            String countryCode = sessionInfo.getLocation().getCountryCode();
            if (countryCode != null) {
                return countryCode;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: g.e.b.l.h$b */
    /* compiled from: FreeTrialWelcomeDelegate.kt */
    static final /* synthetic */ class C7511b extends C12879i implements Function1<String, C13145v> {
        C7511b(C7509h hVar) {
            super(1, hVar);
        }

        public final String getName() {
            return "startDialog";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7509h.class);
        }

        public final String getSignature() {
            return "startDialog(Ljava/lang/String;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13145v.f29587a;
        }

        public final void invoke(String str) {
            ((C7509h) this.receiver).m22400a(str);
        }
    }

    /* renamed from: g.e.b.l.h$c */
    /* compiled from: FreeTrialWelcomeDelegate.kt */
    static final class C7512c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7512c f16472c = new C7512c();

        C7512c() {
        }

        /* renamed from: a */
        public final void mo20399a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20399a((Throwable) obj);
            throw null;
        }
    }

    public C7509h(Single<SessionInfo> single, C6722l1 l1Var, C7908x xVar, C7873f fVar, BuildInfo buildInfo, C7530o oVar) {
        this.f16465a = single;
        this.f16466b = l1Var;
        this.f16467c = xVar;
        this.f16468d = fVar;
        this.f16469e = buildInfo;
        this.f16470f = oVar;
    }

    /* renamed from: a */
    public final void mo20396a(C11790c0 c0Var) {
        if (this.f16466b.mo19271e()) {
            this.f16467c.mo20834a(false);
            Single g = this.f16465a.mo30233g(C7510a.f16471c);
            C12880j.m40222a((Object) g, "sessionInfoOnce\n        …t.location.countryCode) }");
            Object a = g.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(c0Var));
            C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a).mo29920a(new C7508g(new C7511b(this)), C7512c.f16472c);
            return;
        }
        this.f16467c.mo20833a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22400a(String str) {
        String name = this.f16469e.mo12779b().name();
        Map d = this.f16468d.mo20800d();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('_');
        sb.append(str);
        String str2 = (String) d.get(sb.toString());
        if (str2 == null) {
            str2 = (String) d.get(name);
        }
        if (str2 == null) {
            str2 = (String) d.get(str);
        }
        if (str2 != null) {
            this.f16470f.mo20419a(new C7534q(str2));
        } else {
            this.f16470f.mo20418a();
        }
    }
}
