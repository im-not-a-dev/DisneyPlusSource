package p163g.p201e.p203b.p278h.p282n;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.session.SessionState.LoggedOut;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b.C2741a;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.ctvactivation.api.C5892c;
import com.bamtechmedia.dominguez.profiles.C6766q1;
import com.disneystreaming.companion.messaging.MessageType;
import com.disneystreaming.companion.messaging.MessageType.C8545a;
import com.disneystreaming.companion.messaging.MessagingEvent;
import com.disneystreaming.companion.messaging.MessagingEvent.C8552c;
import com.disneystreaming.companion.messaging.MessagingEvent.C8555f;
import com.disneystreaming.companion.messaging.MessagingEvent.C8557h;
import com.disneystreaming.companion.messaging.MessagingEventError;
import com.disneystreaming.companion.messaging.MessagingEventError.C8561b;
import com.disneystreaming.companion.messaging.MessagingEventError.C8564e;
import com.disneystreaming.companion.p352m.C8489l;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p201e.p203b.p278h.C7244i;
import p163g.p201e.p203b.p278h.p279k.C7246a;
import p163g.p201e.p203b.p278h.p279k.C7248c;
import p163g.p201e.p203b.p278h.p279k.C7249d.C7250a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p299m.p300y.C7576g;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p520io.reactivex.C11912b;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.C11978b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020!H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ctvactivation/tv/RequesterViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Lcom/bamtechmedia/dominguez/ctvactivation/common/CtvActivatorViewModel;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "activator", "Lcom/bamtechmedia/dominguez/ctvactivation/api/TvCtvActivator;", "identityApi", "Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;", "accountApi", "Lcom/bamtech/sdk4/account/AccountApi;", "logInAction", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "authListener", "Lcom/bamtechmedia/dominguez/auth/api/AuthListener;", "dialogRouter", "Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;", "ctvActivationRouter", "Lcom/bamtechmedia/dominguez/ctvactivation/common/CtvActivationRouter;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/ctvactivation/api/TvCtvActivator;Lcom/bamtech/sdk4/identity/bam/BamIdentityApi;Lcom/bamtech/sdk4/account/AccountApi;Lcom/bamtechmedia/dominguez/auth/login/LogInAction;Lcom/bamtechmedia/dominguez/auth/api/AuthListener;Lcom/bamtechmedia/dominguez/dialogs/DialogRouter;Lcom/bamtechmedia/dominguez/ctvactivation/common/CtvActivationRouter;)V", "dismissSubject", "Lio/reactivex/subjects/CompletableSubject;", "value", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "sessionState", "Lcom/bamtech/sdk4/session/SessionState;", "handleCompanionEvent", "", "event", "Lcom/disneystreaming/companion/messaging/MessagingEvent;", "handleDisconnect", "host", "", "type", "Lcom/disneystreaming/companion/service/ServiceType;", "handleErrorEvent", "error", "Lcom/disneystreaming/companion/messaging/MessagingEvent$Error;", "handleIncomingMessageEvent", "Lcom/disneystreaming/companion/messaging/MessagingEvent$MessageReceived;", "sendMessage", "to", "request", "update", "ctvActivation_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.h.n.a */
/* compiled from: RequesterViewModel.kt */
public final class C7260a extends C5733a implements C7248c {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11978b f15987U;

    /* renamed from: V */
    private boolean f15988V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C5892c f15989W;

    /* renamed from: X */
    private final BamIdentityApi f15990X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final AccountApi f15991Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final C2783b f15992Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C2740b f15993a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final C7547h f15994b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SessionState f15995c;

    /* renamed from: c0 */
    private final C7246a f15996c0;

    /* renamed from: g.e.b.h.n.a$a */
    /* compiled from: RequesterViewModel.kt */
    static final /* synthetic */ class C7261a extends C12879i implements Function1<MessagingEvent, C13145v> {
        C7261a(C7260a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo20085a(MessagingEvent messagingEvent) {
            ((C7260a) this.receiver).mo20081a(messagingEvent);
        }

        public final String getName() {
            return "handleCompanionEvent";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C7260a.class);
        }

        public final String getSignature() {
            return "handleCompanionEvent(Lcom/disneystreaming/companion/messaging/MessagingEvent;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo20085a((MessagingEvent) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.h.n.a$b */
    /* compiled from: RequesterViewModel.kt */
    static final /* synthetic */ class C7262b extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7262b f15997c = new C7262b();

        C7262b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20086a(Throwable th) {
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
            mo20086a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.h.n.a$c */
    /* compiled from: RequesterViewModel.kt */
    static final class C7263c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        public static final C7263c f15998c = new C7263c();

        C7263c() {
        }

        /* renamed from: a */
        public final Observable<SessionState> apply(Session session) {
            return session.watchSessionState();
        }
    }

    /* renamed from: g.e.b.h.n.a$d */
    /* compiled from: RequesterViewModel.kt */
    static final class C7264d<T> implements Consumer<SessionState> {

        /* renamed from: c */
        final /* synthetic */ C7260a f15999c;

        C7264d(C7260a aVar) {
            this.f15999c = aVar;
        }

        /* renamed from: a */
        public final void accept(SessionState sessionState) {
            this.f15999c.f15995c = sessionState;
        }
    }

    /* renamed from: g.e.b.h.n.a$e */
    /* compiled from: RequesterViewModel.kt */
    static final /* synthetic */ class C7265e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C7265e f16000c = new C7265e();

        C7265e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo20089a(Throwable th) {
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
            mo20089a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.h.n.a$f */
    /* compiled from: RequesterViewModel.kt */
    static final class C7266f<T, R> implements Function<IdentityToken, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C7260a f16001c;

        C7266f(C7260a aVar) {
            this.f16001c = aVar;
        }

        /* renamed from: a */
        public final Completable apply(IdentityToken identityToken) {
            return this.f16001c.f15991Y.authorize(identityToken);
        }
    }

    /* renamed from: g.e.b.h.n.a$g */
    /* compiled from: RequesterViewModel.kt */
    static final class C7267g<T> implements Consumer<Throwable> {

        /* renamed from: U */
        final /* synthetic */ C8555f f16002U;

        /* renamed from: c */
        final /* synthetic */ C7260a f16003c;

        C7267g(C7260a aVar, C8555f fVar) {
            this.f16003c = aVar;
            this.f16002U = fVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f16003c.m21874a(this.f16002U.mo21878a(), "login.failed");
            this.f16003c.f15994b0.mo20490a(C7576g.ERROR, C5880u.m18936a(C7244i.ctv_activation_error));
        }
    }

    /* renamed from: g.e.b.h.n.a$h */
    /* compiled from: RequesterViewModel.kt */
    static final class C7268h implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C7260a f16004a;

        /* renamed from: b */
        final /* synthetic */ C8555f f16005b;

        C7268h(C7260a aVar, C8555f fVar) {
            this.f16004a = aVar;
            this.f16005b = fVar;
        }

        public final void run() {
            this.f16004a.f15994b0.mo20490a(C7576g.SUCCESS, C5880u.m18936a(C7244i.ctv_activation_success));
            Map context = this.f16005b.mo21879b().getPayload().getContext();
            String str = context != null ? (String) context.get("profileId") : null;
            if (str != null) {
                C6766q1.f15142a.mo19491a(str);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.h.n.a$i */
    /* compiled from: RequesterViewModel.kt */
    static final class C7269i<V> implements Callable<CompletableSource> {

        /* renamed from: U */
        final /* synthetic */ C8555f f16006U;

        /* renamed from: c */
        final /* synthetic */ C7260a f16007c;

        /* renamed from: g.e.b.h.n.a$i$a */
        /* compiled from: RequesterViewModel.kt */
        static final class C7270a implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C7269i f16008a;

            C7270a(C7269i iVar) {
                this.f16008a = iVar;
            }

            public final void run() {
                C11978b e = this.f16008a.f16007c.f15987U;
                if (e != null) {
                    e.onComplete();
                }
            }
        }

        /* renamed from: g.e.b.h.n.a$i$b */
        /* compiled from: RequesterViewModel.kt */
        static final class C7271b implements C11945a {

            /* renamed from: a */
            final /* synthetic */ C7269i f16009a;

            C7271b(C7269i iVar) {
                this.f16009a = iVar;
            }

            public final void run() {
                C2741a.m10380a(this.f16009a.f16007c.f15993a0, false, 1, null);
            }
        }

        C7269i(C7260a aVar, C8555f fVar) {
            this.f16007c = aVar;
            this.f16006U = fVar;
        }

        public final Completable call() {
            return Completable.m38157a(Completable.m38166c((C11945a) new C7270a(this)), this.f16007c.f15992Z.mo11569a().mo30050b((C11945a) new C7271b(this)), C7250a.m21858a(this.f16007c.f15989W, this.f16006U.mo21878a(), "login.success", null, 4, null));
        }
    }

    /* renamed from: g.e.b.h.n.a$j */
    /* compiled from: RequesterViewModel.kt */
    static final class C7272j implements C11945a {

        /* renamed from: a */
        public static final C7272j f16010a = new C7272j();

        C7272j() {
        }

        public final void run() {
        }
    }

    /* renamed from: g.e.b.h.n.a$k */
    /* compiled from: RequesterViewModel.kt */
    static final class C7273k<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7273k f16011c = new C7273k();

        C7273k() {
        }

        /* renamed from: a */
        public final void mo20093a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20093a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.h.n.a$l */
    /* compiled from: RequesterViewModel.kt */
    static final class C7274l implements C11945a {

        /* renamed from: a */
        public static final C7274l f16012a = new C7274l();

        C7274l() {
        }

        public final void run() {
        }
    }

    /* renamed from: g.e.b.h.n.a$m */
    /* compiled from: RequesterViewModel.kt */
    static final class C7275m<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7275m f16013c = new C7275m();

        C7275m() {
        }

        /* renamed from: a */
        public final void mo20094a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20094a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.h.n.a$n */
    /* compiled from: RequesterViewModel.kt */
    static final class C7276n implements C11945a {

        /* renamed from: a */
        public static final C7276n f16014a = new C7276n();

        C7276n() {
        }

        public final void run() {
        }
    }

    /* renamed from: g.e.b.h.n.a$o */
    /* compiled from: RequesterViewModel.kt */
    static final class C7277o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7277o f16015c = new C7277o();

        C7277o() {
        }

        /* renamed from: a */
        public final void mo20095a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20095a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: g.e.b.h.n.a$p */
    /* compiled from: RequesterViewModel.kt */
    static final class C7278p implements C11945a {

        /* renamed from: a */
        public static final C7278p f16016a = new C7278p();

        C7278p() {
        }

        public final void run() {
        }
    }

    /* renamed from: g.e.b.h.n.a$q */
    /* compiled from: RequesterViewModel.kt */
    static final class C7279q<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C7279q f16017c = new C7279q();

        C7279q() {
        }

        /* renamed from: a */
        public final void mo20096a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo20096a((Throwable) obj);
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [g.e.b.h.n.a$b, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [g.e.b.h.n.a$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r4v5, types: [g.e.b.h.n.b] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r6v1, types: [g.e.b.h.n.b] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7260a(p520io.reactivex.Single<com.bamtech.sdk4.Session> r1, com.bamtechmedia.dominguez.ctvactivation.api.C5892c r2, com.bamtech.sdk4.identity.bam.BamIdentityApi r3, com.bamtech.sdk4.account.AccountApi r4, com.bamtechmedia.dominguez.auth.p065q0.C2783b r5, com.bamtechmedia.dominguez.auth.p061o0.C2740b r6, p163g.p201e.p203b.p299m.C7547h r7, p163g.p201e.p203b.p278h.p279k.C7246a r8) {
        /*
            r0 = this;
            r0.<init>()
            r0.f15989W = r2
            r0.f15990X = r3
            r0.f15991Y = r4
            r0.f15992Z = r5
            r0.f15993a0 = r6
            r0.f15994b0 = r7
            r0.f15996c0 = r8
            com.bamtechmedia.dominguez.ctvactivation.api.c r2 = r0.f15989W
            io.reactivex.Observable r2 = r2.mo20064a()
            g.n.a.c0 r3 = r0.getViewModelScope()
            g.n.a.h r3 = p163g.p503n.p504a.C11793e.m37930a(r3)
            java.lang.Object r2 = r2.mo30161a(r3)
            java.lang.String r3 = "this.`as`(AutoDispose.autoDisposable(provider))"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            g.n.a.a0 r2 = (p163g.p503n.p504a.C11786a0) r2
            g.e.b.h.n.a$a r4 = new g.e.b.h.n.a$a
            r4.<init>(r0)
            g.e.b.h.n.b r5 = new g.e.b.h.n.b
            r5.<init>(r4)
            g.e.b.h.n.a$b r4 = p163g.p201e.p203b.p278h.p282n.C7260a.C7262b.f15997c
            if (r4 == 0) goto L_0x003e
            g.e.b.h.n.b r6 = new g.e.b.h.n.b
            r6.<init>(r4)
            r4 = r6
        L_0x003e:
            io.reactivex.functions.Consumer r4 = (p520io.reactivex.functions.Consumer) r4
            r2.mo29915a(r5, r4)
            g.e.b.h.n.a$c r2 = p163g.p201e.p203b.p278h.p282n.C7260a.C7263c.f15998c
            io.reactivex.Observable r1 = r1.mo30225d(r2)
            java.lang.String r2 = "sessionOnce.flatMapObser… it.watchSessionState() }"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            g.n.a.c0 r2 = r0.getViewModelScope()
            g.n.a.h r2 = p163g.p503n.p504a.C11793e.m37930a(r2)
            java.lang.Object r1 = r1.mo30161a(r2)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r3)
            g.n.a.a0 r1 = (p163g.p503n.p504a.C11786a0) r1
            g.e.b.h.n.a$d r2 = new g.e.b.h.n.a$d
            r2.<init>(r0)
            g.e.b.h.n.a$e r3 = p163g.p201e.p203b.p278h.p282n.C7260a.C7265e.f16000c
            if (r3 == 0) goto L_0x006e
            g.e.b.h.n.b r4 = new g.e.b.h.n.b
            r4.<init>(r3)
            r3 = r4
        L_0x006e:
            io.reactivex.functions.Consumer r3 = (p520io.reactivex.functions.Consumer) r3
            r1.mo29915a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p278h.p282n.C7260a.<init>(io.reactivex.Single, com.bamtechmedia.dominguez.ctvactivation.api.c, com.bamtech.sdk4.identity.bam.BamIdentityApi, com.bamtech.sdk4.account.AccountApi, com.bamtechmedia.dominguez.auth.q0.b, com.bamtechmedia.dominguez.auth.o0.b, g.e.b.m.h, g.e.b.h.k.a):void");
    }

    public void setEnabled(boolean z) {
        if (this.f15988V != z) {
            this.f15988V = z;
            mo20084z();
        }
    }

    /* renamed from: y */
    public boolean mo20083y() {
        return this.f15988V;
    }

    /* renamed from: z */
    public void mo20084z() {
        String str = "this.`as`(AutoDispose.au…isposable<Any>(provider))";
        if (mo20083y()) {
            Object a = this.f15989W.mo20066d().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a, str);
            ((C11839v) a).mo29926a(C7276n.f16014a, C7277o.f16015c);
            return;
        }
        Object a2 = this.f15989W.mo20065b().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, str);
        ((C11839v) a2).mo29926a(C7278p.f16016a, C7279q.f16017c);
    }

    /* renamed from: a */
    public void mo20081a(MessagingEvent messagingEvent) {
        if (messagingEvent instanceof C8557h) {
            if (this.f15995c instanceof LoggedOut) {
                C8557h hVar = (C8557h) messagingEvent;
                m21874a(hVar.mo21886a(), "login.request");
                C11978b bVar = this.f15987U;
                if (bVar != null) {
                    bVar.onComplete();
                }
                this.f15987U = C11978b.m38573j();
                C7246a aVar = this.f15996c0;
                String deviceName = hVar.mo21887b().getDeviceName();
                if (deviceName != null) {
                    aVar.mo20061a(deviceName, this.f15987U);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        } else if (messagingEvent instanceof C8555f) {
            mo20080a((C8555f) messagingEvent);
        } else if (messagingEvent instanceof C8552c) {
            m21871a((C8552c) messagingEvent);
        }
    }

    /* renamed from: a */
    private final void m21871a(C8552c cVar) {
        MessagingEventError a = cVar.mo21867a();
        if (a instanceof C8561b) {
            mo20082a(((C8561b) a).mo21900a(), cVar.mo21868b());
        } else if (a instanceof C8564e) {
            mo20082a(((C8564e) a).mo21910a(), cVar.mo21868b());
        }
    }

    /* renamed from: a */
    public void mo20080a(C8555f fVar) {
        MessageType messageType = fVar.mo21879b().getPayload().getMessageType();
        if (messageType instanceof C8545a) {
            String a = ((C8545a) messageType).mo21856a();
            int hashCode = a.hashCode();
            if (hashCode != -2147254986) {
                if (hashCode == -1671412461 && a.equals("login.declined")) {
                    C11978b bVar = this.f15987U;
                    if (bVar != null) {
                        bVar.onComplete();
                    }
                }
            } else if (a.equals("login.granted")) {
                BamIdentityApi bamIdentityApi = this.f15990X;
                Map context = fVar.mo21879b().getPayload().getContext();
                String str = context != null ? (String) C13173j0.m40359b(context, (Object) "email") : null;
                if (str != null) {
                    Map context2 = fVar.mo21879b().getPayload().getContext();
                    String str2 = context2 != null ? (String) C13173j0.m40359b(context2, (Object) "password") : null;
                    if (str2 != null) {
                        Completable a2 = bamIdentityApi.authenticate(str, str2).mo30217b((Function<? super T, ? extends CompletableSource>) new C7266f<Object,Object>(this)).mo30036a((Consumer<? super Throwable>) new C7267g<Object>(this, fVar)).mo30050b((C11945a) new C7268h(this, fVar)).mo30034a((CompletableSource) Completable.m38162b((Callable<? extends CompletableSource>) new C7269i<Object>(this, fVar)));
                        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "identityApi.authenticate…                       })");
                        Object a3 = a2.mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
                        Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                        ((C11839v) a3).mo29926a(C7272j.f16010a, C7273k.f16011c);
                        return;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                }
                Intrinsics.throwNpe();
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21874a(String str, String str2) {
        Object a = C7250a.m21858a(this.f15989W, str, str2, null, 4, null).mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(C7274l.f16012a, C7275m.f16013c);
    }

    /* renamed from: a */
    public void mo20082a(String str, C8489l lVar) {
        this.f15989W.mo17779a(str, lVar);
        C11978b bVar = this.f15987U;
        if (bVar != null) {
            bVar.onComplete();
        }
    }
}
