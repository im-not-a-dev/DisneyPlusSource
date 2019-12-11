package com.bamtechmedia.dominguez.core.framework;

import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import com.uber.autodispose.android.lifecycle.C10541b;
import java.util.concurrent.Callable;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p527w.p529c.C11992a;
import p520io.reactivex.subjects.C11983e;
import p520io.reactivex.subjects.C11984f;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00011B\u0017\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\fJ8\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0)J\b\u0010*\u001a\u00020 H\u0016J\u0016\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007J\u0016\u0010-\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u001a\u0010.\u001a\u00020 2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000)J\u001c\u00100\u001a\u00020 2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020 0)H\u0004R*\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000@GX\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00178\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "STATE", "", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "initialEvent", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "(Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;)V", "<set-?>", "currentState", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "disposable", "Lio/reactivex/disposables/Disposable;", "disposable$annotations", "()V", "getDisposable$core_ui_framework_release", "()Lio/reactivex/disposables/Disposable;", "setDisposable$core_ui_framework_release", "(Lio/reactivex/disposables/Disposable;)V", "events", "Lio/reactivex/subjects/Subject;", "events$annotations", "getEvents", "()Lio/reactivex/subjects/Subject;", "state", "Lio/reactivex/Observable;", "getState", "()Lio/reactivex/Observable;", "createState", "", "observeInLifecycle", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "untilEvent", "Landroidx/lifecycle/Lifecycle$Event;", "scheduler", "Lio/reactivex/Scheduler;", "consumer", "Lkotlin/Function1;", "onCleared", "submitEvent", "event", "submitEventInternal", "updateState", "block", "withState", "Event", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.framework.g */
/* compiled from: ReactiveViewModel.kt */
public abstract class C5741g<STATE> extends C5733a {
    private STATE currentState;
    private Disposable disposable;
    private final C11983e<C5742a<STATE>> events;
    private final Observable<STATE> state;

    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$a */
    /* compiled from: ReactiveViewModel.kt */
    public interface C5742a<STATE> {
        /* renamed from: a */
        Observable<STATE> mo17627a(STATE state);
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"com/bamtechmedia/dominguez/core/framework/ReactiveViewModel$createState$1", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "process", "Lio/reactivex/Observable;", "currentState", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$b */
    /* compiled from: ReactiveViewModel.kt */
    public static final class C5743b implements C5742a<STATE> {

        /* renamed from: a */
        final /* synthetic */ Object f13502a;

        /* renamed from: com.bamtechmedia.dominguez.core.framework.g$b$a */
        /* compiled from: ReactiveViewModel.kt */
        static final class C5744a<V> implements Callable<T> {

            /* renamed from: c */
            final /* synthetic */ C5743b f13503c;

            C5744a(C5743b bVar) {
                this.f13503c = bVar;
            }

            public final STATE call() {
                return this.f13503c.f13502a;
            }
        }

        C5743b(Object obj) {
            this.f13502a = obj;
        }

        /* renamed from: a */
        public Observable<STATE> mo17627a(STATE state) {
            Observable<STATE> a = Observable.m38303a((Callable<? extends T>) new C5744a<Object>(this));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Observable.fromCallable { state }");
            return a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$c */
    /* compiled from: ReactiveViewModel.kt */
    static final class C5745c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C5741g f13504c;

        C5745c(C5741g gVar) {
            this.f13504c = gVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error in ");
            sb.append(this.f13504c.getClass().getSimpleName());
            sb.append(" stream");
            Timber.m44528b(th, sb.toString(), new Object[0]);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Observable;", "STATE", "kotlin.jvm.PlatformType", "", "it", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$d */
    /* compiled from: ReactiveViewModel.kt */
    static final class C5746d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C5741g f13505c;

        /* renamed from: com.bamtechmedia.dominguez.core.framework.g$d$a */
        /* compiled from: ReactiveViewModel.kt */
        static final class C5747a<T> implements Consumer<Throwable> {

            /* renamed from: c */
            final /* synthetic */ C5742a f13506c;

            C5747a(C5742a aVar) {
                this.f13506c = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Event failed. Not updating the state: ");
                sb.append(this.f13506c);
                Timber.m44528b(th, sb.toString(), new Object[0]);
            }
        }

        /* renamed from: com.bamtechmedia.dominguez.core.framework.g$d$b */
        /* compiled from: ReactiveViewModel.kt */
        static final class C5748b<T, R> implements Function<Throwable, ObservableSource<? extends STATE>> {

            /* renamed from: c */
            public static final C5748b f13507c = new C5748b();

            C5748b() {
            }

            /* renamed from: a */
            public final ObservableSource<? extends STATE> apply(Throwable th) {
                return Observable.m38314m();
            }
        }

        C5746d(C5741g gVar) {
            this.f13505c = gVar;
        }

        /* renamed from: a */
        public final Observable<STATE> apply(C5742a<STATE> aVar) {
            return aVar.mo17627a(this.f13505c.getCurrentState()).mo30177c((Consumer<? super Throwable>) new C5747a<Object>(aVar)).mo30196h(C5748b.f13507c);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$e */
    /* compiled from: ReactiveViewModel.kt */
    static final class C5749e<T> implements Consumer<STATE> {

        /* renamed from: c */
        final /* synthetic */ C5741g f13508c;

        C5749e(C5741g gVar) {
            this.f13508c = gVar;
        }

        public final void accept(STATE state) {
            this.f13508c.setCurrentState(state);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$f */
    /* compiled from: ReactiveViewModel.kt */
    static final class C5750f<T> implements Consumer<Disposable> {

        /* renamed from: c */
        final /* synthetic */ C5741g f13509c;

        C5750f(C5741g gVar) {
            this.f13509c = gVar;
        }

        /* renamed from: a */
        public final void accept(Disposable disposable) {
            this.f13509c.setDisposable$core_ui_framework_release(disposable);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo31007d2 = {"com/bamtechmedia/dominguez/core/framework/ReactiveViewModel$updateState$1", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel$Event;", "process", "Lio/reactivex/Observable;", "currentState", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "core-ui-framework_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$g */
    /* compiled from: ReactiveViewModel.kt */
    public static final class C5751g implements C5742a<STATE> {

        /* renamed from: a */
        final /* synthetic */ Function1 f13510a;

        /* renamed from: com.bamtechmedia.dominguez.core.framework.g$g$a */
        /* compiled from: ReactiveViewModel.kt */
        static final class C5752a<V> implements Callable<T> {

            /* renamed from: U */
            final /* synthetic */ Object f13511U;

            /* renamed from: c */
            final /* synthetic */ C5751g f13512c;

            C5752a(C5751g gVar, Object obj) {
                this.f13512c = gVar;
                this.f13511U = obj;
            }

            public final STATE call() {
                Function1 function1 = this.f13512c.f13510a;
                Object obj = this.f13511U;
                if (obj != null) {
                    return function1.invoke(obj);
                }
                throw new IllegalArgumentException("Can not call updateState before createState".toString());
            }
        }

        C5751g(Function1 function1) {
            this.f13510a = function1;
        }

        /* renamed from: a */
        public Observable<STATE> mo17627a(STATE state) {
            Observable<STATE> a = Observable.m38303a((Callable<? extends T>) new C5752a<Object>(this, state));
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "Observable.fromCallable …createState\" })\n        }");
            return a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.framework.g$h */
    /* compiled from: ReactiveViewModel.kt */
    public static final class C5753h implements C5742a<STATE> {

        /* renamed from: a */
        final /* synthetic */ Function1 f13513a;

        C5753h(Function1 function1) {
            this.f13513a = function1;
        }

        /* renamed from: a */
        public Observable<STATE> mo17627a(STATE state) {
            Function1 function1 = this.f13513a;
            if (state != null) {
                function1.invoke(state);
                Observable<STATE> m = Observable.m38314m();
                Intrinsics.checkReturnedValueIsNotNull((Object) m, "Observable.empty()");
                return m;
            }
            throw new IllegalArgumentException("Can not call withState before createState".toString());
        }
    }

    public C5741g() {
        this(null, 1, null);
    }

    public /* synthetic */ C5741g(C5742a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        this(aVar);
    }

    public static /* synthetic */ void disposable$annotations() {
    }

    public static /* synthetic */ void events$annotations() {
    }

    public static /* synthetic */ void observeInLifecycle$default(C5741g gVar, C0722m mVar, C0716a aVar, C11969r rVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                aVar = C0716a.ON_STOP;
            }
            if ((i & 4) != 0) {
                rVar = null;
            }
            gVar.observeInLifecycle(mVar, aVar, rVar, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeInLifecycle");
    }

    private final void submitEventInternal(C5742a<STATE> aVar) {
        this.events.onNext(aVar);
    }

    /* access modifiers changed from: protected */
    public final void createState(STATE state2) {
        submitEventInternal(new C5743b(state2));
    }

    public final STATE getCurrentState() {
        return this.currentState;
    }

    public final Disposable getDisposable$core_ui_framework_release() {
        return this.disposable;
    }

    public final C11983e<C5742a<STATE>> getEvents() {
        return this.events;
    }

    public final Observable<STATE> getState() {
        return this.state;
    }

    public final void observeInLifecycle(C0722m mVar, C0716a aVar, C11969r rVar, Function1<? super STATE, C13145v> function1) {
        Observable b = this.state.mo30164b();
        if (rVar == null) {
            rVar = C11992a.m38600a();
        }
        Observable a = b.mo30151a(rVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "state.distinctUntilChang…dSchedulers.mainThread())");
        C10541b a2 = C10541b.m33255a(mVar, aVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a3 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
        Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a3).mo29915a(new C5754h(function1), new C5745c(this));
    }

    public void onCleared() {
        super.onCleared();
        Disposable disposable2 = this.disposable;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }

    public final void setCurrentState(STATE state2) {
        this.currentState = state2;
    }

    public final void setDisposable$core_ui_framework_release(Disposable disposable2) {
        this.disposable = disposable2;
    }

    public final void submitEvent(C5742a<STATE> aVar) {
        submitEventInternal(aVar);
    }

    public final void updateState(Function1<? super STATE, ? extends STATE> function1) {
        submitEventInternal(new C5751g(function1));
    }

    /* access modifiers changed from: protected */
    public final void withState(Function1<? super STATE, C13145v> function1) {
        submitEventInternal(new C5753h(function1));
    }

    public C5741g(C5742a<STATE> aVar) {
        C11983e<C5742a<STATE>> n = C11984f.m38584q().mo30320n();
        Intrinsics.checkReturnedValueIsNotNull((Object) n, "UnicastSubject.create<Ev…<STATE>>().toSerialized()");
        this.events = n;
        Observable<STATE> a = this.events.mo30143a((Function<? super T, ? extends ObservableSource<? extends R>>) new C5746d<Object,Object>(this)).mo30184d((Consumer<? super T>) new C5749e<Object>(this)).mo30160a(1).mo30682a(1, new C5750f(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "events\n        .concatMa…ct(1) { disposable = it }");
        this.state = a;
        if (aVar != null) {
            submitEventInternal(aVar);
        }
    }
}
