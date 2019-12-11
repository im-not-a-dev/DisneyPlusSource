package com.bamtechmedia.dominguez.portability.availability;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.session.SessionInfo;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p327y.p328g.C7930a;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/portability/availability/ServiceAvailabilityStateImpl;", "Lcom/bamtechmedia/dominguez/portability/api/ServiceAvailabilityState;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "config", "Lcom/bamtechmedia/dominguez/portability/availability/PortabilityConfig;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/portability/availability/PortabilityConfig;Landroidx/lifecycle/LifecycleOwner;)V", "subject", "Lio/reactivex/subjects/PublishSubject;", "", "availabilityOnce", "availabilityOnceAndStream", "Lio/reactivex/Observable;", "onStart", "", "owner", "portability_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ServiceAvailabilityStateImpl.kt */
public final class ServiceAvailabilityStateImpl implements C7930a, C0710d {

    /* renamed from: U */
    private final Single<Session> f14891U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C6602a f14892V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final PublishSubject<Boolean> f14893c;

    /* renamed from: com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl$a */
    /* compiled from: ServiceAvailabilityStateImpl.kt */
    static final class C6597a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C6597a f14894c = new C6597a();

        C6597a() {
        }

        /* renamed from: a */
        public final Single<SessionInfo> apply(Session session) {
            return session.getSessionInfo();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl$b */
    /* compiled from: ServiceAvailabilityStateImpl.kt */
    static final class C6598b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ ServiceAvailabilityStateImpl f14895c;

        C6598b(ServiceAvailabilityStateImpl serviceAvailabilityStateImpl) {
            this.f14895c = serviceAvailabilityStateImpl;
        }

        /* renamed from: a */
        public final boolean mo19246a(SessionInfo sessionInfo) {
            Boolean a = this.f14895c.f14892V.mo19250a();
            return a != null ? a.booleanValue() : sessionInfo.getInSupportedLocation();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo19246a((SessionInfo) obj));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl$c */
    /* compiled from: ServiceAvailabilityStateImpl.kt */
    static final class C6599c<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ServiceAvailabilityStateImpl f14896c;

        C6599c(ServiceAvailabilityStateImpl serviceAvailabilityStateImpl) {
            this.f14896c = serviceAvailabilityStateImpl;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14896c.f14893c.onNext(bool);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl$d */
    /* compiled from: ServiceAvailabilityStateImpl.kt */
    static final class C6600d<T> implements Consumer<Boolean> {

        /* renamed from: c */
        final /* synthetic */ ServiceAvailabilityStateImpl f14897c;

        C6600d(ServiceAvailabilityStateImpl serviceAvailabilityStateImpl) {
            this.f14897c = serviceAvailabilityStateImpl;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f14897c.f14893c.onNext(bool);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.portability.availability.ServiceAvailabilityStateImpl$e */
    /* compiled from: ServiceAvailabilityStateImpl.kt */
    static final class C6601e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C6601e f14898c = new C6601e();

        C6601e() {
        }

        /* renamed from: a */
        public final void mo19249a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo19249a((Throwable) obj);
            throw null;
        }
    }

    public ServiceAvailabilityStateImpl(Single<Session> single, C6602a aVar, C0722m mVar) {
        this.f14891U = single;
        this.f14892V = aVar;
        mVar.getLifecycle().mo4134a(this);
        PublishSubject<Boolean> q = PublishSubject.m38553q();
        Intrinsics.checkReturnedValueIsNotNull((Object) q, "PublishSubject.create()");
        this.f14893c = q;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo4127b(C0722m mVar) {
        C0708c.m3732a(this, mVar);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
    }

    /* renamed from: d */
    public Single<Boolean> mo19244d() {
        Single<Boolean> d = this.f14891U.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C6597a.f14894c).mo30233g(new C6598b(this)).mo30227d((Consumer<? super T>) new C6599c<Object>(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) d, "sessionOnce.flatMap { it…ss { subject.onNext(it) }");
        return d;
    }

    /* renamed from: d */
    public /* synthetic */ void mo4129d(C0722m mVar) {
        C0708c.m3737f(this, mVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo4130e(C0722m mVar) {
        C0708c.m3733b(this, mVar);
    }

    /* renamed from: f */
    public void mo4131f(C0722m mVar) {
        Single d = mo19244d();
        C10541b a = C10541b.m33254a(mVar);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "AndroidLifecycleScopeProvider.from(\n    this)");
        Object a2 = d.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a((C11790c0) a));
        Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a2).mo29920a(new C6600d(this), C6601e.f14898c);
    }

    /* renamed from: b */
    public Observable<Boolean> mo19243b() {
        Observable<Boolean> b = mo19244d().mo30236i().mo30140a((ObservableSource<? extends T>) this.f14893c).mo30164b();
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "availabilityOnce()\n     …  .distinctUntilChanged()");
        return b;
    }
}
