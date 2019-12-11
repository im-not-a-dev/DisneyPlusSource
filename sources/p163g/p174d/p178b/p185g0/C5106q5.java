package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.net.Uri;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p195l0.C5299b;
import p163g.p174d.p178b.p196m0.C5305c;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020&H\u0007J\u0010\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0017H\u0007J\b\u00101\u001a\u00020\"H\u0007J\b\u00102\u001a\u00020\"H\u0007R&\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, mo31007d2 = {"Lcom/bamtech/player/delegates/UpNextTimeDelegate;", "Lcom/bamtech/player/delegates/ControllerDelegate;", "events", "Lcom/bamtech/player/PlayerEvents;", "upNextTimeEvents", "Lcom/bamtech/player/upnext/UpNextTimeEvents;", "(Lcom/bamtech/player/PlayerEvents;Lcom/bamtech/player/upnext/UpNextTimeEvents;)V", "controlsDisposable", "Lio/reactivex/disposables/Disposable;", "controlsDisposable$annotations", "()V", "getControlsDisposable", "()Lio/reactivex/disposables/Disposable;", "setControlsDisposable", "(Lio/reactivex/disposables/Disposable;)V", "controlsVisible", "", "controlsVisible$annotations", "getControlsVisible", "()Z", "setControlsVisible", "(Z)V", "currentSchedule", "Lcom/bamtech/player/upnext/Schedule;", "currentSchedule$annotations", "getCurrentSchedule", "()Lcom/bamtech/player/upnext/Schedule;", "setCurrentSchedule", "(Lcom/bamtech/player/upnext/Schedule;)V", "upNextEvent", "upNextEvent$annotations", "getUpNextEvent", "setUpNextEvent", "hide", "", "onControlsVisible", "onMaxTime", "maxTime", "", "onNewMedia", "uri", "Landroid/net/Uri;", "onSeek", "newTime", "Lcom/bamtech/player/util/TimePair;", "setCurrentTime", "timeInMs", "setNewSchedule", "schedule", "show", "showAtNextAvailableMoment", "bamplayer-core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.d.b.g0.q5 */
/* compiled from: UpNextTimeDelegate.kt */
public final class C5106q5 implements C5271z3 {

    /* renamed from: U */
    private Disposable f12414U;

    /* renamed from: V */
    private boolean f12415V;

    /* renamed from: W */
    private Disposable f12416W;

    /* renamed from: X */
    private final C5300m f12417X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C5299b f12418Y;

    /* renamed from: c */
    private C5298a f12419c;

    /* renamed from: g.d.b.g0.q5$a */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5107a extends C12879i implements Function1<C5298a, C13145v> {
        C5107a(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16604a(C5298a aVar) {
            ((C5106q5) this.receiver).mo16596a(aVar);
        }

        public final String getName() {
            return "setNewSchedule";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "setNewSchedule(Lcom/bamtech/player/upnext/Schedule;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16604a((C5298a) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$b */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5108b extends C12879i implements Function1<Uri, C13145v> {
        C5108b(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16605a(Uri uri) {
            ((C5106q5) this.receiver).mo16595a(uri);
        }

        public final String getName() {
            return "onNewMedia";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "onNewMedia(Landroid/net/Uri;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16605a((Uri) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$c */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5109c extends C12879i implements Function1<Long, C13145v> {
        C5109c(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16606a(long j) {
            ((C5106q5) this.receiver).mo16594a(j);
        }

        public final String getName() {
            return "onMaxTime";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "onMaxTime(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16606a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$d */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5110d extends C12879i implements Function1<Long, C13145v> {
        C5110d(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16607a(long j) {
            ((C5106q5) this.receiver).mo16600b(j);
        }

        public final String getName() {
            return "setCurrentTime";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "setCurrentTime(J)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16607a(((Number) obj).longValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$e */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5111e extends C12879i implements Function1<Boolean, C13145v> {
        C5111e(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16608a(boolean z) {
            ((C5106q5) this.receiver).mo16598a(z);
        }

        public final String getName() {
            return "onControlsVisible";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "onControlsVisible(Z)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16608a(((Boolean) obj).booleanValue());
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$f */
    /* compiled from: UpNextTimeDelegate.kt */
    static final /* synthetic */ class C5112f extends C12879i implements Function1<C5305c, C13145v> {
        C5112f(C5106q5 q5Var) {
            super(1, q5Var);
        }

        /* renamed from: a */
        public final void mo16609a(C5305c cVar) {
            ((C5106q5) this.receiver).mo16597a(cVar);
        }

        public final String getName() {
            return "onSeek";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C5106q5.class);
        }

        public final String getSignature() {
            return "onSeek(Lcom/bamtech/player/util/TimePair;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo16609a((C5305c) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: g.d.b.g0.q5$g */
    /* compiled from: UpNextTimeDelegate.kt */
    static final class C5113g<T> implements Consumer<Long> {

        /* renamed from: U */
        final /* synthetic */ C5106q5 f12420U;

        /* renamed from: c */
        final /* synthetic */ C5298a f12421c;

        C5113g(C5298a aVar, C5106q5 q5Var) {
            this.f12421c = aVar;
            this.f12420U = q5Var;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f12420U.f12418Y.mo16928a(this.f12421c.mo16919a() - l.longValue());
        }
    }

    /* renamed from: g.d.b.g0.q5$h */
    /* compiled from: UpNextTimeDelegate.kt */
    static final class C5114h implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5106q5 f12422a;

        C5114h(C5106q5 q5Var) {
            this.f12422a = q5Var;
        }

        public final void run() {
            this.f12422a.mo16601c();
            Disposable b = this.f12422a.mo16599b();
            if (b != null) {
                b.dispose();
            }
        }
    }

    /* renamed from: g.d.b.g0.q5$i */
    /* compiled from: UpNextTimeDelegate.kt */
    static final class C5115i<T> implements C11952h<Long> {

        /* renamed from: c */
        final /* synthetic */ C5298a f12423c;

        C5115i(C5298a aVar) {
            this.f12423c = aVar;
        }

        /* renamed from: a */
        public final boolean test(Long l) {
            return l.longValue() > this.f12423c.mo16919a();
        }
    }

    /* renamed from: g.d.b.g0.q5$j */
    /* compiled from: UpNextTimeDelegate.kt */
    static final class C5116j<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ C5106q5 f12424c;

        C5116j(C5106q5 q5Var) {
            this.f12424c = q5Var;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f12424c.mo16602d();
                Disposable a = this.f12424c.mo16593a();
                if (a != null) {
                    a.dispose();
                }
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public C5106q5(C5300m mVar, C5299b bVar) {
        this.f12417X = mVar;
        this.f12418Y = bVar;
        this.f12418Y.mo16931b().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5107a(this)));
        this.f12417X.mo16973U().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5108b(this)));
        this.f12417X.mo16963P().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5109c(this)));
        this.f12417X.mo16938C0().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5110d(this)));
        this.f12417X.mo17076x().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5111e(this)));
        this.f12417X.mo17059o0().mo30192f((Consumer<? super T>) new C5123r5<Object>(new C5112f(this)));
    }

    /* renamed from: b */
    public final Disposable mo16599b() {
        return this.f12414U;
    }

    /* renamed from: c */
    public final void mo16601c() {
        this.f12418Y.mo16930a(false);
        Disposable disposable = this.f12414U;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: d */
    public final void mo16602d() {
        this.f12418Y.mo16930a(true);
        C5298a aVar = this.f12419c;
        if (aVar != null) {
            aVar.mo16920a(true);
            Disposable disposable = this.f12414U;
            if (disposable != null && !disposable.isDisposed()) {
                Disposable disposable2 = this.f12414U;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
            }
            this.f12414U = Observable.m38306b(1, TimeUnit.MILLISECONDS).mo30151a(C11934b.m38498a()).mo30184d((Consumer<? super T>) new C5113g<Object>(aVar, this)).mo30181c((C11952h<? super T>) new C5115i<Object>(aVar)).mo30169b((C11945a) new C5114h(this)).mo30200j();
        }
    }

    /* renamed from: e */
    public final void mo16603e() {
        if (this.f12415V) {
            Disposable disposable = this.f12416W;
            if (disposable == null || (disposable != null && disposable.isDisposed())) {
                this.f12416W = this.f12417X.mo17076x().mo30192f((Consumer<? super T>) new C5116j<Object>(this));
                return;
            }
            return;
        }
        mo16602d();
    }

    /* renamed from: a */
    public final Disposable mo16593a() {
        return this.f12416W;
    }

    /* renamed from: b */
    public final void mo16600b(long j) {
        C5298a aVar = this.f12419c;
        if (aVar == null) {
            return;
        }
        if (!aVar.mo16922c() && aVar.mo16923d() > 0 && j >= aVar.mo16923d()) {
            mo16603e();
        } else if (this.f12416W != null && j < aVar.mo16923d()) {
            Disposable disposable = this.f12416W;
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo16596a(C5298a aVar) {
        this.f12419c = aVar;
    }

    /* renamed from: a */
    public final void mo16595a(Uri uri) {
        mo16601c();
    }

    /* renamed from: a */
    public final void mo16598a(boolean z) {
        this.f12415V = z;
        mo16601c();
    }

    /* renamed from: a */
    public final void mo16597a(C5305c cVar) {
        C5298a aVar = this.f12419c;
        if ((aVar != null ? aVar.mo16923d() : 0) >= cVar.mo17084b()) {
            C5298a aVar2 = this.f12419c;
            if (aVar2 != null) {
                aVar2.mo16920a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo16594a(long j) {
        C5298a aVar = this.f12419c;
        if (aVar != null && aVar.mo16923d() < 0) {
            this.f12419c = new C5298a(j + aVar.mo16923d(), aVar.mo16919a());
        }
    }
}
