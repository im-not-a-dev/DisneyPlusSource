package p163g.p201e.p203b.p210g;

import com.bamtechmedia.dominguez.core.framework.C5741g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/connectivity/OfflineViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/connectivity/TimerState;", "()V", "allDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "handleState", "", "timerState", "onCleared", "startRetryTimer", "stopTimers", "Companion", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.g.o */
/* compiled from: OfflineViewModel.kt */
public final class C5588o extends C5741g<C5597p> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CompositeDisposable f13162a = new CompositeDisposable();

    /* renamed from: g.e.b.g.o$a */
    /* compiled from: OfflineViewModel.kt */
    public static final class C5589a {
        private C5589a() {
        }

        public /* synthetic */ C5589a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g.e.b.g.o$b */
    /* compiled from: OfflineViewModel.kt */
    static final class C5590b extends C12881k implements Function1<C5597p, C5597p> {

        /* renamed from: c */
        final /* synthetic */ C5597p f13163c;

        C5590b(C5597p pVar) {
            this.f13163c = pVar;
            super(1);
        }

        /* renamed from: a */
        public final C5597p invoke(C5597p pVar) {
            return this.f13163c;
        }
    }

    /* renamed from: g.e.b.g.o$c */
    /* compiled from: OfflineViewModel.kt */
    static final class C5591c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C5591c f13164c = new C5591c();

        C5591c() {
        }

        /* renamed from: a */
        public final C5597p apply(Long l) {
            return C5597p.STOP;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: g.e.b.g.o$d */
    /* compiled from: OfflineViewModel.kt */
    static final class C5592d implements C11945a {

        /* renamed from: a */
        final /* synthetic */ C5588o f13165a;

        /* renamed from: g.e.b.g.o$d$a */
        /* compiled from: OfflineViewModel.kt */
        static final class C5593a extends C12881k implements Function1<C5597p, C5597p> {

            /* renamed from: c */
            public static final C5593a f13166c = new C5593a();

            C5593a() {
                super(1);
            }

            /* renamed from: a */
            public final C5597p invoke(C5597p pVar) {
                return C5597p.STOP;
            }
        }

        C5592d(C5588o oVar) {
            this.f13165a = oVar;
        }

        public final void run() {
            this.f13165a.updateState(C5593a.f13166c);
        }
    }

    /* renamed from: g.e.b.g.o$e */
    /* compiled from: OfflineViewModel.kt */
    static final class C5594e<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5588o f13167c;

        C5594e(C5588o oVar) {
            this.f13167c = oVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f13167c.f13162a.mo30250b(disposable);
        }
    }

    /* renamed from: g.e.b.g.o$f */
    /* compiled from: OfflineViewModel.kt */
    static final class C5595f<T> implements Consumer<C5597p> {

        /* renamed from: c */
        final /* synthetic */ C5588o f13168c;

        C5595f(C5588o oVar) {
            this.f13168c = oVar;
        }

        /* renamed from: a */
        public final void accept(C5597p pVar) {
            C5588o oVar = this.f13168c;
            Intrinsics.checkReturnedValueIsNotNull((Object) pVar, "it");
            oVar.m18414a(pVar);
        }
    }

    /* renamed from: g.e.b.g.o$g */
    /* compiled from: OfflineViewModel.kt */
    static final class C5596g<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5588o f13169c;

        C5596g(C5588o oVar) {
            this.f13169c = oVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f13169c.m18414a(C5597p.STOP);
        }
    }

    static {
        new C5589a(null);
    }

    public C5588o() {
        super(null, 1, null);
    }

    public void onCleared() {
        super.onCleared();
        mo17343z();
    }

    /* renamed from: y */
    public final void mo17342y() {
        Observable e = Observable.m38311c(10, TimeUnit.SECONDS, C11934b.m38498a()).mo30193g(C5591c.f13164c).mo30154a(C5597p.START).mo30180c((C11945a) new C5592d(this)).mo30188e((Consumer<? super Disposable>) new C5594e<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "Observable.timer(MAX_RET… allDisposables.add(it) }");
        Object a = e.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C5595f(this), new C5596g(this));
    }

    /* renamed from: z */
    public final void mo17343z() {
        this.f13162a.dispose();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18414a(C5597p pVar) {
        if (getCurrentState() == null) {
            createState(pVar);
        } else {
            updateState(new C5590b(pVar));
        }
    }
}
