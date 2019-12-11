package com.bamtechmedia.dominguez.auth;

import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.session.SessionState;
import com.bamtech.sdk4.session.SessionState.AuthenticationExpired;
import com.uber.autodispose.android.lifecycle.C10541b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11790c0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/SessionStateObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "sessionExpiredListener", "Lcom/bamtechmedia/dominguez/auth/SessionExpiredListener;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/auth/SessionExpiredListener;)V", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "register", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionStateObserver.kt */
public final class SessionStateObserver implements C0710d {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C2725l0 f7438U;

    /* renamed from: c */
    private final Single<Session> f7439c;

    /* renamed from: com.bamtechmedia.dominguez.auth.SessionStateObserver$a */
    /* compiled from: SessionStateObserver.kt */
    static final class C2688a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: c */
        public static final C2688a f7440c = new C2688a();

        C2688a() {
        }

        /* renamed from: a */
        public final Observable<SessionState> apply(Session session) {
            return session.watchSessionState();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.SessionStateObserver$b */
    /* compiled from: SessionStateObserver.kt */
    static final class C2689b<T> implements C11952h<SessionState> {

        /* renamed from: c */
        public static final C2689b f7441c = new C2689b();

        C2689b() {
        }

        /* renamed from: a */
        public final boolean test(SessionState sessionState) {
            return sessionState instanceof AuthenticationExpired;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.SessionStateObserver$c */
    /* compiled from: SessionStateObserver.kt */
    static final class C2690c<T> implements Consumer<SessionState> {

        /* renamed from: c */
        final /* synthetic */ SessionStateObserver f7442c;

        C2690c(SessionStateObserver sessionStateObserver) {
            this.f7442c = sessionStateObserver;
        }

        /* renamed from: a */
        public final void accept(SessionState sessionState) {
            this.f7442c.f7438U.mo11743a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.SessionStateObserver$d */
    /* compiled from: SessionStateObserver.kt */
    static final class C2691d<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2691d f7443c = new C2691d();

        C2691d() {
        }

        /* renamed from: a */
        public final void mo11732a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo11732a((Throwable) obj);
            throw null;
        }
    }

    public SessionStateObserver(Single<Session> single, C2725l0 l0Var) {
        this.f7439c = single;
        this.f7438U = l0Var;
    }

    /* renamed from: a */
    public /* synthetic */ void mo4126a(C0722m mVar) {
        C0708c.m3735d(this, mVar);
    }

    /* renamed from: b */
    public final void mo11728b() {
        C0722m i = C0733v.m3782i();
        Intrinsics.checkReturnedValueIsNotNull((Object) i, "ProcessLifecycleOwner.get()");
        i.getLifecycle().mo4134a(this);
    }

    /* renamed from: c */
    public /* synthetic */ void mo4128c(C0722m mVar) {
        C0708c.m3734c(this, mVar);
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
    public /* synthetic */ void mo4131f(C0722m mVar) {
        C0708c.m3736e(this, mVar);
    }

    /* renamed from: b */
    public void mo4127b(C0722m mVar) {
        Observable a = this.f7439c.mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) C2688a.f7440c).mo30150a((C11952h<? super T>) C2689b.f7441c);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "sessionOnce.flatMapObser…e.AuthenticationExpired }");
        C10541b a2 = C10541b.m33255a(mVar, C0716a.ON_DESTROY);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "AndroidLifecycleScopePro…om(\n    this, untilEvent)");
        Object a3 = a.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a((C11790c0) a2));
        Intrinsics.checkReturnedValueIsNotNull(a3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a3).mo29915a(new C2690c(this), C2691d.f7443c);
    }
}
