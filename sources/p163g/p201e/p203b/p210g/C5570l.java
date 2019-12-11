package p163g.p201e.p203b.p210g;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import androidx.lifecycle.C0702a;
import com.bamtechmedia.dominguez.core.C3585a;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a;
import com.bamtechmedia.dominguez.core.lifecycle.C5765a.C5766a.C5767a;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11974s;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p527w.p529c.C11992a;
import p520io.reactivex.subjects.C11976a;
import p520io.reactivex.subjects.C11978b;
import p520io.reactivex.subjects.PublishSubject;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000278B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0014J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0003J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0016J\b\u00105\u001a\u000206H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001a¨\u00069"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/connectivity/OfflineStateViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "application", "Landroid/app/Application;", "config", "Lcom/bamtechmedia/dominguez/core/CoreCommonConfig;", "appPresence", "Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;", "offlineStateTracker", "Lcom/bamtechmedia/dominguez/connectivity/OfflineStateTracker;", "computationScheduler", "Lio/reactivex/Scheduler;", "networkConnectivityCheck", "Lcom/bamtechmedia/dominguez/connectivity/NetworkConnectivityCheck;", "(Landroid/app/Application;Lcom/bamtechmedia/dominguez/core/CoreCommonConfig;Lcom/bamtechmedia/dominguez/core/lifecycle/AppPresenceApi;Lcom/bamtechmedia/dominguez/connectivity/OfflineStateTracker;Lio/reactivex/Scheduler;Lcom/bamtechmedia/dominguez/connectivity/NetworkConnectivityCheck;)V", "allSubscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "connectivityManager", "Landroid/net/ConnectivityManager;", "connectivitySubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "foregroundDisposable", "Lio/reactivex/disposables/Disposable;", "isOnline", "()Z", "isPerformingPing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "minimumOfflineDurationSeconds", "", "getMinimumOfflineDurationSeconds", "()J", "networkCallback", "Lcom/bamtechmedia/dominguez/connectivity/OfflineStateViewModel$NetworkCallback;", "scopeSubject", "Lio/reactivex/subjects/CompletableSubject;", "timerSubject", "Lio/reactivex/subjects/PublishSubject;", "timerSubscription", "wasPreviouslyOffline", "getWasPreviouslyOffline", "cancelInProgressChecksForMinDuration", "", "cancelInProgressChecksWhenForegrounded", "internalMarkOnline", "markOffline", "markOnline", "onCleared", "performPing", "startTimer", "whenOfflineForMinimumDuration", "Lio/reactivex/Observable;", "whenOnline", "Lio/reactivex/Completable;", "Companion", "NetworkCallback", "connectivity_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.g.l */
/* compiled from: OfflineStateViewModel.kt */
public final class C5570l extends C0702a implements C3796d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final CompositeDisposable f13132U = new CompositeDisposable();

    /* renamed from: V */
    private final C11978b f13133V;

    /* renamed from: W */
    private final ConnectivityManager f13134W;

    /* renamed from: X */
    private final C11976a<Boolean> f13135X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final PublishSubject<Boolean> f13136Y;

    /* renamed from: Z */
    private final CompositeDisposable f13137Z;

    /* renamed from: a0 */
    private Disposable f13138a0;

    /* renamed from: b0 */
    private final C5572b f13139b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public AtomicBoolean f13140c0;

    /* renamed from: d0 */
    private final C3585a f13141d0;

    /* renamed from: e0 */
    private final C5765a f13142e0;

    /* renamed from: f0 */
    private final C5568j f13143f0;

    /* renamed from: g0 */
    private final C11969r f13144g0;

    /* renamed from: h0 */
    private final C5562f f13145h0;

    /* renamed from: g.e.b.g.l$a */
    /* compiled from: OfflineStateViewModel.kt */
    public static final class C5571a {
        private C5571a() {
        }

        public /* synthetic */ C5571a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.g.l$b */
    /* compiled from: OfflineStateViewModel.kt */
    private static final class C5572b extends NetworkCallback {

        /* renamed from: a */
        private final HashSet<Network> f13146a = new HashSet<>();

        /* renamed from: b */
        private final C3796d f13147b;

        public C5572b(C3796d dVar) {
            this.f13147b = dVar;
        }

        /* renamed from: a */
        private final void m18397a(Network network) {
            C5855o oVar = C5855o.f13640a;
            this.f13146a.add(network);
            if (!this.f13147b.mo13695j()) {
                this.f13147b.mo13694h();
            }
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            if (VERSION.SDK_INT <= 23 && network != null) {
                m18397a(network);
            }
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            m18397a(network);
        }

        public void onLost(Network network) {
            super.onLost(network);
            this.f13146a.remove(network);
            if (this.f13146a.isEmpty()) {
                this.f13147b.mo13699u();
            }
        }
    }

    /* renamed from: g.e.b.g.l$c */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5573c<T> implements C11952h<C5766a> {

        /* renamed from: c */
        public static final C5573c f13148c = new C5573c();

        C5573c() {
        }

        /* renamed from: a */
        public final boolean test(C5766a aVar) {
            return !(aVar instanceof C5767a);
        }
    }

    /* renamed from: g.e.b.g.l$d */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5574d<T> implements Consumer<C5766a> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13149c;

        C5574d(C5570l lVar) {
            this.f13149c = lVar;
        }

        /* renamed from: a */
        public final void accept(C5766a aVar) {
            this.f13149c.mo17326z();
        }
    }

    /* renamed from: g.e.b.g.l$e */
    /* compiled from: OfflineStateViewModel.kt */
    static final /* synthetic */ class C5575e extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5575e f13150c = new C5575e();

        C5575e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17332a(Throwable th) {
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
            mo17332a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.g.l$f */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5576f implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5570l f13151a;

        C5576f(C5570l lVar) {
            this.f13151a = lVar;
        }

        public final void run() {
            this.f13151a.f13140c0.set(false);
        }
    }

    /* renamed from: g.e.b.g.l$g */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5577g<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13152c;

        C5577g(C5570l lVar) {
            this.f13152c = lVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C5855o oVar = C5855o.f13640a;
            C12880j.m40222a((Object) bool, "reached");
            if (bool.booleanValue()) {
                this.f13152c.m18382C();
            } else {
                this.f13152c.mo13699u();
            }
        }
    }

    /* renamed from: g.e.b.g.l$h */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5578h<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13153c;

        C5578h(C5570l lVar) {
            this.f13153c = lVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C5855o oVar = C5855o.f13640a;
            this.f13153c.mo13699u();
        }
    }

    /* renamed from: g.e.b.g.l$i */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5579i<T> implements Consumer<Long> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13154c;

        C5579i(C5570l lVar) {
            this.f13154c = lVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f13154c.f13136Y.onNext(Boolean.valueOf(true));
        }
    }

    /* renamed from: g.e.b.g.l$j */
    /* compiled from: OfflineStateViewModel.kt */
    static final /* synthetic */ class C5580j extends C12879i implements Function1<Throwable, C13145v> {

        /* renamed from: c */
        public static final C5580j f13155c = new C5580j();

        C5580j() {
            super(1);
        }

        /* renamed from: a */
        public final void mo17336a(Throwable th) {
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
            mo17336a((Throwable) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.e.b.g.l$k */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5581k<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13156c;

        C5581k(C5570l lVar) {
            this.f13156c = lVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (C12880j.m40224a((Object) bool, (Object) Boolean.valueOf(true))) {
                this.f13156c.mo17326z();
            } else if (C12880j.m40224a((Object) bool, (Object) Boolean.valueOf(false))) {
                this.f13156c.m18384E();
            }
        }
    }

    /* renamed from: g.e.b.g.l$l */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5582l<T> implements C11952h<Boolean> {

        /* renamed from: c */
        public static final C5582l f13157c = new C5582l();

        C5582l() {
        }

        /* renamed from: a */
        public final Boolean mo17338a(Boolean bool) {
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo17338a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: g.e.b.g.l$m */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5583m<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5583m f13158c = new C5583m();

        C5583m() {
        }

        /* renamed from: a */
        public final boolean mo17339a(Boolean bool) {
            return !bool.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo17339a((Boolean) obj));
        }
    }

    /* renamed from: g.e.b.g.l$n */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5584n<T> implements C11952h<Boolean> {

        /* renamed from: c */
        public static final C5584n f13159c = new C5584n();

        C5584n() {
        }

        /* renamed from: a */
        public final Boolean mo17340a(Boolean bool) {
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo17340a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: g.e.b.g.l$o */
    /* compiled from: OfflineStateViewModel.kt */
    static final class C5585o<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5570l f13160c;

        C5585o(C5570l lVar) {
            this.f13160c = lVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f13160c.f13132U.mo30250b(disposable);
        }
    }

    static {
        new C5571a(null);
    }

    public C5570l(Application application, C3585a aVar, C5765a aVar2, C5568j jVar, C11969r rVar, C5562f fVar) {
        super(application);
        this.f13141d0 = aVar;
        this.f13142e0 = aVar2;
        this.f13143f0 = jVar;
        this.f13144g0 = rVar;
        this.f13145h0 = fVar;
        C11978b j = C11978b.m38573j();
        C12880j.m40222a((Object) j, "CompletableSubject.create()");
        this.f13133V = j;
        Object systemService = mo4111y().getSystemService("connectivity");
        if (systemService != null) {
            this.f13134W = (ConnectivityManager) systemService;
            boolean z = true;
            C11976a<Boolean> e = C11976a.m38562e(Boolean.valueOf(true));
            C12880j.m40222a((Object) e, "BehaviorSubject.createDefault(true)");
            this.f13135X = e;
            PublishSubject<Boolean> q = PublishSubject.m38553q();
            C12880j.m40222a((Object) q, "PublishSubject.create()");
            this.f13136Y = q;
            this.f13137Z = new CompositeDisposable();
            this.f13139b0 = new C5572b(this);
            this.f13140c0 = new AtomicBoolean(false);
            this.f13134W.registerNetworkCallback(new Builder().addCapability(12).build(), this.f13139b0);
            m18380A();
            boolean isDefaultNetworkActive = this.f13134W.isDefaultNetworkActive();
            boolean a = C5587n.m18411b(this.f13134W);
            if (!isDefaultNetworkActive || !a) {
                z = false;
            }
            C5855o oVar = C5855o.f13640a;
            this.f13135X.onNext(Boolean.valueOf(z));
            this.f13143f0.mo17323a(z);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [g.e.b.g.l$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [g.e.b.g.m] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18380A() {
        /*
            r4 = this;
            com.bamtechmedia.dominguez.core.lifecycle.a r0 = r4.f13142e0
            io.reactivex.Observable r0 = r0.mo17649a()
            g.e.b.g.l$c r1 = p163g.p201e.p203b.p210g.C5570l.C5573c.f13148c
            io.reactivex.Observable r0 = r0.mo30150a(r1)
            g.e.b.g.l$d r1 = new g.e.b.g.l$d
            r1.<init>(r4)
            g.e.b.g.l$e r2 = p163g.p201e.p203b.p210g.C5570l.C5575e.f13150c
            if (r2 == 0) goto L_0x001b
            g.e.b.g.m r3 = new g.e.b.g.m
            r3.<init>(r2)
            r2 = r3
        L_0x001b:
            io.reactivex.functions.Consumer r2 = (p520io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo30157a(r1, r2)
            java.lang.String r1 = "appPresence.streamUpdate…nDuration() }, Timber::e)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            r4.f13138a0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p210g.C5570l.m18380A():void");
    }

    /* renamed from: B */
    private final long m18381B() {
        return this.f13141d0.mo12793a();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m18382C() {
        C5855o oVar = C5855o.f13640a;
        this.f13135X.onNext(Boolean.valueOf(true));
        this.f13143f0.mo17324b();
    }

    /* renamed from: D */
    private final void m18383D() {
        if (!this.f13140c0.getAndSet(true)) {
            Single b = this.f13145h0.mo17320a().mo30203a(5, TimeUnit.SECONDS, this.f13144g0).mo30220b(this.f13144g0).mo30219b((C11945a) new C5576f(this));
            C12880j.m40222a((Object) b, "networkConnectivityCheck…rformingPing.set(false) }");
            Object a = b.mo30215a((C11974s<T, ? extends R>) C11793e.m37931a((CompletableSource) this.f13133V));
            C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(scope))");
            ((C11792d0) a).mo29920a(new C5577g(this), new C5578h(this));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [g.e.b.g.l$j, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [g.e.b.g.m] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    @android.annotation.SuppressLint({"RxDefaultScheduler"})
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m18384E() {
        /*
            r5 = this;
            io.reactivex.disposables.CompositeDisposable r0 = r5.f13137Z
            long r1 = r5.m18381B()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r1 = p520io.reactivex.Observable.m38310c(r1, r3)
            g.e.b.g.l$i r2 = new g.e.b.g.l$i
            r2.<init>(r5)
            g.e.b.g.l$j r3 = p163g.p201e.p203b.p210g.C5570l.C5580j.f13155c
            if (r3 == 0) goto L_0x001b
            g.e.b.g.m r4 = new g.e.b.g.m
            r4.<init>(r3)
            r3 = r4
        L_0x001b:
            io.reactivex.functions.Consumer r3 = (p520io.reactivex.functions.Consumer) r3
            io.reactivex.disposables.Disposable r1 = r1.mo30157a(r2, r3)
            r0.mo30250b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p210g.C5570l.m18384E():void");
    }

    /* renamed from: h */
    public void mo13694h() {
        C5855o oVar = C5855o.f13640a;
        m18383D();
    }

    /* renamed from: j */
    public boolean mo13695j() {
        return C12880j.m40224a((Object) (Boolean) this.f13135X.mo30311o(), (Object) Boolean.valueOf(true));
    }

    /* renamed from: k */
    public Observable<Boolean> mo13696k() {
        Observable<Boolean> b = this.f13135X.mo30164b().mo30184d((Consumer<? super T>) new C5581k<Object>(this)).mo30150a((C11952h<? super T>) C5582l.f13157c).mo30193g(C5583m.f13158c).mo30165b((ObservableSource<? extends T>) this.f13136Y);
        C12880j.m40222a((Object) b, "connectivitySubject\n    … .mergeWith(timerSubject)");
        return b;
    }

    /* renamed from: n */
    public Completable mo13697n() {
        Completable c = this.f13135X.mo30150a((C11952h<? super T>) C5584n.f13159c).mo30186d().mo30228e().mo30051b(this.f13144g0).mo30040a(C11992a.m38600a()).mo30052c((Consumer<? super Disposable>) new C5585o<Object>(this));
        C12880j.m40222a((Object) c, "connectivitySubject.filt…llSubscriptions.add(it) }");
        return c;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f13132U.dispose();
        mo17326z();
        Disposable disposable = this.f13138a0;
        if (disposable != null) {
            disposable.dispose();
            this.f13134W.unregisterNetworkCallback(this.f13139b0);
            return;
        }
        C12880j.m40227c("foregroundDisposable");
        throw null;
    }

    /* renamed from: p */
    public boolean mo13698p() {
        return this.f13143f0.mo17325c();
    }

    /* renamed from: u */
    public void mo13699u() {
        C5855o oVar = C5855o.f13640a;
        this.f13135X.onNext(Boolean.valueOf(false));
        this.f13143f0.mo17322a();
    }

    /* renamed from: z */
    public void mo17326z() {
        this.f13137Z.mo30247a();
    }
}
