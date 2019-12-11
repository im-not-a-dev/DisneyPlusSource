package com.bamtechmedia.dominguez.main;

import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.auth.p061o0.C2746g;
import com.bamtechmedia.dominguez.auth.p066r0.C2793c;
import com.bamtechmedia.dominguez.collections.caching.C3291a;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.main.p234w.C6206a;
import com.bamtechmedia.dominguez.main.p235x.C6216a;
import com.bamtechmedia.dominguez.main.p235x.C6219d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6220a;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6221b;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6222c;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6223d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6224e;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6225f;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6226g;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6227h;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6228i;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6229j;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6230k;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6231l;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6233n;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import com.bamtechmedia.dominguez.main.startup.C6181d;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.profiles.C6766q1;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import okhttp3.HttpUrl;
import org.reactivestreams.C14313b;
import p163g.p201e.p203b.p286j.C7300k;
import p163g.p201e.p203b.p286j.C7301l;
import p163g.p201e.p203b.p307o.p308p.C7630d;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p163g.p201e.p203b.p406d0.C10582k;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p163g.p503n.p504a.C11839v;
import p163g.p503n.p504a.C11842x;
import p163g.p503n.p504a.C11844z;
import p512h.C11868a;
import p520io.reactivex.C11912b;
import p520io.reactivex.C11932e;
import p520io.reactivex.C11957k;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.Flowable;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.C11978b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB©\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\t\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\t\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0002\u0010%J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\u0018\u0010.\u001a\u00020+2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020+00H\u0002J\u0016\u00101\u001a\u00020+2\f\u00102\u001a\b\u0012\u0004\u0012\u00020+00H\u0002J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020+H\u0016J\b\u0010;\u001a\u00020+H\u0016J\b\u0010<\u001a\u00020+H\u0002J\b\u0010=\u001a\u00020+H\u0002J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020@H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/MainActivityViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Lcom/bamtechmedia/dominguez/splash/SplashListener;", "Lcom/bamtechmedia/dominguez/error/api/ReloadListener;", "appInitialization", "Lcom/bamtechmedia/dominguez/main/startup/FallbackAppInitialization;", "stateHolder", "Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;", "startupProfileProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/profiles/StartupProfileProvider;", "collectionPrefetchHelper", "Lcom/bamtechmedia/dominguez/collections/caching/CollectionPrefetchHelper;", "logOutAction", "Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;", "router", "Lcom/bamtechmedia/dominguez/main/MainActivityRouter;", "sessionInfoOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "createProfileLanguageSetup", "Lcom/bamtechmedia/dominguez/profiles/api/language/CreateProfileLanguageSetup;", "profilesSetup", "Lcom/bamtechmedia/dominguez/profiles/ProfilesSetup;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "serviceAvailabilityState", "Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;", "userSubscriptionInfo", "Lcom/bamtechmedia/dominguez/auth/api/UserSubscriptionInfo;", "paywallHandler", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/main/paywall/MainActivityPaywallHandler;", "deepLinksProvider", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "deeplinkOriginChecker", "Lcom/bamtechmedia/dominguez/deeplink/DeeplinkOriginChecker;", "(Lcom/bamtechmedia/dominguez/main/startup/FallbackAppInitialization;Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;Ljavax/inject/Provider;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/auth/logout/LogOutAction;Lcom/bamtechmedia/dominguez/main/MainActivityRouter;Lio/reactivex/Single;Ljavax/inject/Provider;Ljavax/inject/Provider;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;Lcom/bamtechmedia/dominguez/auth/api/UserSubscriptionInfo;Ldagger/Lazy;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/deeplink/DeeplinkOriginChecker;)V", "completableSubject", "Lio/reactivex/subjects/CompletableSubject;", "loggedOutStateDisposable", "Lio/reactivex/disposables/Disposable;", "determineLoggedInAccountState", "", "determineLoggedOutAccountState", "handleNewUser", "initialize", "onInitialized", "Lkotlin/Function0;", "loadPaywall", "onPaywallLoaded", "loadProfiles", "logOutCompletelyBeforeAuth", "maybeDoFirstTimeSetup", "Lio/reactivex/Completable;", "onAccountStateChanges", "state", "Lcom/bamtechmedia/dominguez/main/state/MainActivityState;", "onReloadRequested", "onSplashComplete", "removeLocalSelectedProfileId", "softLogout", "startMainApp", "profile", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "Companion", "mainApp_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.q */
/* compiled from: MainActivityViewModel.kt */
public final class C6144q extends C5733a implements C10582k, C7630d {

    /* renamed from: U */
    private final C11978b f14122U;

    /* renamed from: V */
    private final C6181d f14123V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6234e f14124W;

    /* renamed from: X */
    private final Provider<C6766q1> f14125X;

    /* renamed from: Y */
    private final Provider<C3291a> f14126Y;

    /* renamed from: Z */
    private final C2793c f14127Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C6136l f14128a0;

    /* renamed from: b0 */
    private final Single<SessionInfo> f14129b0;

    /* renamed from: c */
    private Disposable f14130c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final Provider<C6864d> f14131c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final Provider<C6722l1> f14132d0;

    /* renamed from: e0 */
    private final C11969r f14133e0;

    /* renamed from: f0 */
    private final C7930a f14134f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final C2746g f14135g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final C11868a<C6206a> f14136h0;

    /* renamed from: i0 */
    private final Provider<C7300k> f14137i0;

    /* renamed from: j0 */
    private final C7301l f14138j0;

    /* renamed from: com.bamtechmedia.dominguez.main.q$a */
    /* compiled from: MainActivityViewModel.kt */
    static final /* synthetic */ class C6145a extends C12879i implements Function1<C6219d, C13145v> {
        C6145a(C6144q qVar) {
            super(1, qVar);
        }

        /* renamed from: a */
        public final void mo18763a(C6219d dVar) {
            ((C6144q) this.receiver).m19586a(dVar);
        }

        public final String getName() {
            return "onAccountStateChanges";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C6144q.class);
        }

        public final String getSignature() {
            return "onAccountStateChanges(Lcom/bamtechmedia/dominguez/main/state/MainActivityState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18763a((C6219d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$b */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6146b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6146b f14139c = new C6146b();

        C6146b() {
        }

        /* renamed from: a */
        public final void mo18764a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo18764a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$c */
    /* compiled from: MainActivityViewModel.kt */
    static final /* synthetic */ class C6147c extends C12879i implements Function0<C13145v> {
        C6147c(C11978b bVar) {
            super(0, bVar);
        }

        public final String getName() {
            return "onComplete";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C11978b.class);
        }

        public final String getSignature() {
            return "onComplete()V";
        }

        public final void invoke() {
            ((C11978b) this.receiver).onComplete();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$d */
    /* compiled from: MainActivityViewModel.kt */
    public static final class C6148d {
        private C6148d() {
        }

        public /* synthetic */ C6148d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$e */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6149e<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14140c;

        C6149e(C6144q qVar) {
            this.f14140c = qVar;
        }

        /* renamed from: a */
        public final Single<? extends C6219d> apply(SessionInfo sessionInfo) {
            if (sessionInfo.isSubscriber()) {
                this.f14140c.f14135g0.mo11574b("is Active");
                Single<? extends C6219d> b = Single.m38399b(C6233n.f14270a);
                Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(Subscribed)");
                return b;
            }
            this.f14140c.f14135g0.mo11574b("not Subscribed");
            return ((C6206a) this.f14140c.f14136h0.get()).mo18803b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$f */
    /* compiled from: MainActivityViewModel.kt */
    static final /* synthetic */ class C6150f extends C12879i implements Function1<C6219d, C13145v> {
        C6150f(C6234e eVar) {
            super(1, eVar);
        }

        /* renamed from: a */
        public final void mo18766a(C6219d dVar) {
            C6216a.m19703a((C6234e) this.receiver, dVar);
        }

        public final String getName() {
            return "updateIfAllowed";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40231a(C6216a.class, "mainApp_release");
        }

        public final String getSignature() {
            return "updateIfAllowed(Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;Lcom/bamtechmedia/dominguez/main/state/MainActivityState;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo18766a((C6219d) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$g */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6151g<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14141c;

        C6151g(C6144q qVar) {
            this.f14141c = qVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C6216a.m19703a(this.f14141c.f14124W, C6222c.f14258a);
            C5855o oVar = C5855o.f13640a;
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$h */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6152h<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14142c;

        C6152h(C6144q qVar) {
            this.f14142c = qVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            Intrinsics.checkReturnedValueIsNotNull((Object) bool, "serviceAvailable");
            if (bool.booleanValue()) {
                this.f14142c.m19579C();
                return;
            }
            this.f14142c.m19581E();
            this.f14142c.f14128a0.mo18758h();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$i */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6153i<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14143c;

        C6153i(C6144q qVar) {
            this.f14143c = qVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
            this.f14143c.m19579C();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$j */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6154j extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14144c;

        C6154j(C6144q qVar) {
            this.f14144c = qVar;
            super(0);
        }

        public final void invoke() {
            this.f14144c.f14128a0.mo18755e();
            this.f14144c.f14135g0.mo11573a("new");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$k */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6155k extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C6155k f14145c = new C6155k();

        C6155k() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$l */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6156l implements C11945a {

        /* renamed from: a */
        final /* synthetic */ Function0 f14146a;

        C6156l(Function0 function0) {
            this.f14146a = function0;
        }

        public final void run() {
            this.f14146a.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$m */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6157m<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6157m f14147c = new C6157m();

        C6157m() {
        }

        /* renamed from: a */
        public final void mo18770a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo18770a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$n */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6158n<T> implements Consumer<C6219d> {

        /* renamed from: c */
        final /* synthetic */ Function0 f14148c;

        C6158n(Function0 function0) {
            this.f14148c = function0;
        }

        /* renamed from: a */
        public final void accept(C6219d dVar) {
            this.f14148c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$o */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6159o<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14149c;

        C6159o(C6144q qVar) {
            this.f14149c = qVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C6216a.m19703a(this.f14149c.f14124W, C6222c.f14258a);
            C5855o oVar = C5855o.f13640a;
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtechmedia/dominguez/profiles/Profile;", "kotlin.jvm.PlatformType", "profile", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.main.q$p */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6160p<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14150c;

        /* renamed from: com.bamtechmedia.dominguez.main.q$p$a */
        /* compiled from: MainActivityViewModel.kt */
        static final class C6161a<T> implements Consumer<Throwable> {

            /* renamed from: c */
            public static final C6161a f14151c = new C6161a();

            C6161a() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Timber.m44524a(th, "createProfileLanguageSetup setValues failed", new Object[0]);
            }
        }

        C6160p(C6144q qVar) {
            this.f14150c = qVar;
        }

        /* renamed from: a */
        public final Maybe<? extends C6626c0> apply(C6626c0 c0Var) {
            if (((C6722l1) this.f14150c.f14132d0.get()).mo19271e()) {
                return ((C6864d) this.f14150c.f14131c0.get()).mo19633a(c0Var).mo30218b((Consumer<? super Throwable>) C6161a.f14151c).mo30234h();
            }
            return Maybe.m38258c(c0Var);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$q */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6162q<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14152c;

        C6162q(C6144q qVar) {
            this.f14152c = qVar;
        }

        /* renamed from: a */
        public final Single<C6626c0> apply(C6626c0 c0Var) {
            return this.f14152c.m19580D().mo30045a(c0Var);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$r */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6163r<T> implements Consumer<C6626c0> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14153c;

        C6163r(C6144q qVar) {
            this.f14153c = qVar;
        }

        /* renamed from: a */
        public final void accept(C6626c0 c0Var) {
            C6234e e = this.f14153c.f14124W;
            Intrinsics.checkReturnedValueIsNotNull((Object) c0Var, "it");
            C6216a.m19703a(e, new C6232m(c0Var));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$s */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6164s<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6164s f14154c = new C6164s();

        C6164s() {
        }

        /* renamed from: a */
        public final void mo18777a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo18777a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$t */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6165t implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6144q f14155a;

        C6165t(C6144q qVar) {
            this.f14155a = qVar;
        }

        public final void run() {
            C6216a.m19703a(this.f14155a.f14124W, C6229j.f14266a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$u */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6166u extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        final /* synthetic */ C6144q f14156c;

        C6166u(C6144q qVar) {
            this.f14156c = qVar;
            super(0);
        }

        public final void invoke() {
            this.f14156c.m19581E();
            this.f14156c.f14128a0.mo18752b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$v */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6167v implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6144q f14157a;

        C6167v(C6144q qVar) {
            this.f14157a = qVar;
        }

        public final void run() {
            C6216a.m19703a(this.f14157a.f14124W, C6225f.f14262a);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$w */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6168w<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6168w f14158c = new C6168w();

        C6168w() {
        }

        /* renamed from: a */
        public final void mo18778a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo18778a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$x */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6169x implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C6144q f14159a;

        /* renamed from: b */
        final /* synthetic */ C6626c0 f14160b;

        C6169x(C6144q qVar, C6626c0 c0Var) {
            this.f14159a = qVar;
            this.f14160b = c0Var;
        }

        public final void run() {
            this.f14159a.f14128a0.mo18751a(this.f14160b.mo19354R());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.q$y */
    /* compiled from: MainActivityViewModel.kt */
    static final class C6170y<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6170y f14161c = new C6170y();

        C6170y() {
        }

        /* renamed from: a */
        public final void mo18779a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo18779a((Throwable) obj);
            throw null;
        }
    }

    static {
        new C6148d(null);
    }

    public C6144q(C6181d dVar, C6234e eVar, Provider<C6766q1> provider, Provider<C3291a> provider2, C2793c cVar, C6136l lVar, Single<SessionInfo> single, Provider<C6864d> provider3, Provider<C6722l1> provider4, C11969r rVar, C7930a aVar, C2746g gVar, C11868a<C6206a> aVar2, Provider<C7300k> provider5, C7301l lVar2) {
        this.f14123V = dVar;
        this.f14124W = eVar;
        this.f14125X = provider;
        this.f14126Y = provider2;
        this.f14127Z = cVar;
        this.f14128a0 = lVar;
        this.f14129b0 = single;
        this.f14131c0 = provider3;
        this.f14132d0 = provider4;
        this.f14133e0 = rVar;
        this.f14134f0 = aVar;
        this.f14135g0 = gVar;
        this.f14136h0 = aVar2;
        this.f14137i0 = provider5;
        this.f14138j0 = lVar2;
        C11978b j = C11978b.m38573j();
        Intrinsics.checkReturnedValueIsNotNull((Object) j, "CompletableSubject.create()");
        this.f14122U = j;
        if (this.f14123V.mo18786b()) {
            this.f14128a0.mo18759i();
        }
        Flowable a = this.f14122U.mo30041a((C14313b<T>) this.f14124W.mo18831c());
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "completableSubject\n     …hen(stateHolder.stream())");
        Object a2 = a.mo30079a((C11932e<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11842x) a2).mo29927a(new C6171r(new C6145a(this)), C6146b.f14139c);
        m19588a((Function0<C13145v>) new C6147c<C13145v>(this.f14122U));
    }

    /* renamed from: A */
    private final void m19577A() {
        m19590b((Function0<C13145v>) new C6154j<C13145v>(this));
    }

    /* renamed from: B */
    private final void m19578B() {
        HttpUrl x = ((C7300k) this.f14137i0.get()).mo20107x();
        Maybe a = ((C6766q1) this.f14125X.get()).mo19268b(x != null ? this.f14138j0.mo20111a(x) : false).mo30103a((Function<? super T, ? extends MaybeSource<? extends R>>) new C6160p<Object,Object>(this)).mo30129e(new C6162q(this)).mo30107a(this.f14133e0);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "startupProfileProvider.g…veOn(mainThreadScheduler)");
        Object a2 = a.mo30112a((C11957k<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11844z) a2).mo29930a(new C6163r(this), C6164s.f14154c, new C6165t(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m19579C() {
        m19590b((Function0<C13145v>) new C6166u<C13145v>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final Completable m19580D() {
        C6722l1 l1Var = (C6722l1) this.f14132d0.get();
        if (l1Var.mo19271e()) {
            return l1Var.mo19267b();
        }
        Completable h = Completable.m38169h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Completable.complete()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m19581E() {
        ((C6766q1) this.f14125X.get()).mo19269c();
    }

    /* renamed from: F */
    private final void m19582F() {
        Object a = this.f14127Z.mo11572c().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C6167v(this), C6168w.f14158c);
    }

    /* renamed from: y */
    private final void m19598y() {
        ((C6206a) this.f14136h0.get()).mo18804c();
        this.f14135g0.mo11573a("returned");
        Single a = this.f14129b0.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6149e<Object,Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "sessionInfoOnce.flatMap …)\n            }\n        }");
        Object a2 = a.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a2).mo29920a(new C6171r(new C6150f(this.f14124W)), new C6151g(this));
    }

    /* renamed from: z */
    private final void m19599z() {
        this.f14130c = this.f14134f0.mo19243b().mo30157a((Consumer<? super T>) new C6152h<Object>(this), (Consumer<? super Throwable>) new C6153i<Object>(this));
    }

    /* renamed from: l */
    public void mo18762l() {
        C6219d a = this.f14124W.mo18827a();
        C6219d dVar = null;
        if (!(a instanceof C6223d)) {
            a = null;
        }
        C6223d dVar2 = (C6223d) a;
        if (dVar2 != null) {
            dVar = dVar2.mo18819b();
        }
        this.f14124W.mo18829a(new C6223d(dVar, true));
    }

    /* renamed from: b */
    private final void m19590b(Function0<C13145v> function0) {
        ((C6206a) this.f14136h0.get()).mo18802a();
        Object a = ((C6206a) this.f14136h0.get()).mo18803b().mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C6158n(function0), new C6159o(this));
    }

    /* renamed from: f */
    public void mo11889f() {
        if (Intrinsics.areEqual((Object) this.f14124W.mo18827a(), (Object) C6222c.f14258a)) {
            this.f14124W.mo18829a(C6231l.f14268a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19586a(C6219d dVar) {
        C13145v vVar;
        StringBuilder sb = new StringBuilder();
        sb.append("New MainActivityState : ");
        sb.append(dVar);
        Timber.m44529c(sb.toString(), new Object[0]);
        Disposable disposable = this.f14130c;
        if (disposable != null) {
            disposable.dispose();
        }
        if (dVar instanceof C6223d) {
            this.f14128a0.mo18759i();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6231l.f14268a)) {
            m19585a(this, null, 1, null);
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6225f.f14262a)) {
            m19599z();
            this.f14135g0.mo11574b("not Active");
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6224e.f14261a)) {
            m19598y();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6227h.f14264a)) {
            m19577A();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6226g.f14263a)) {
            this.f14128a0.mo18753c();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6230k.f14267a)) {
            this.f14128a0.mo18757g();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6233n.f14270a)) {
            m19578B();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6229j.f14266a)) {
            this.f14128a0.mo18756f();
            vVar = C13145v.f29587a;
        } else if (dVar instanceof C6232m) {
            m19587a(((C6232m) dVar).mo18823a());
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6221b.f14257a)) {
            m19582F();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6222c.f14258a)) {
            this.f14128a0.mo18754d();
            vVar = C13145v.f29587a;
        } else if (Intrinsics.areEqual((Object) dVar, (Object) C6228i.f14265a)) {
            this.f14128a0.mo18749a();
            vVar = C13145v.f29587a;
        } else if (dVar instanceof C6220a) {
            this.f14128a0.mo18750a(((C6220a) dVar).mo18813a());
            vVar = C13145v.f29587a;
        } else {
            throw new C12898l();
        }
        C5884x.m18950a(vVar, "To make this when exhaustive");
    }

    /* renamed from: a */
    private final void m19587a(C6626c0 c0Var) {
        Object a = ((C3291a) this.f14126Y.get()).mo12340a().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C6169x(this, c0Var), C6170y.f14161c);
    }

    /* renamed from: a */
    static /* synthetic */ void m19585a(C6144q qVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C6155k.f14145c;
        }
        qVar.m19588a(function0);
    }

    /* renamed from: a */
    private final void m19588a(Function0<C13145v> function0) {
        Object a = this.f14123V.mo18785a().mo30048a((C11912b<? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((C11839v) a).mo29926a(new C6156l(function0), C6157m.f14147c);
    }
}
