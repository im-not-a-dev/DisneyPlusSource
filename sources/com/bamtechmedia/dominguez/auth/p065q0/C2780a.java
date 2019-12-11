package com.bamtechmedia.dominguez.auth.p065q0;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p525e0.C11934b;
import p686n.p687a.Timber;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/login/DispatchingLogInAction;", "Lcom/bamtechmedia/dominguez/auth/login/LogInAction;", "delegates", "Ljavax/inject/Provider;", "", "(Ljavax/inject/Provider;)V", "onLogin", "Lio/reactivex/Completable;", "Companion", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.q0.a */
/* compiled from: DispatchingLogInAction.kt */
public final class C2780a implements C2783b {

    /* renamed from: a */
    private final Provider<Set<C2783b>> f7531a;

    /* renamed from: com.bamtechmedia.dominguez.auth.q0.a$a */
    /* compiled from: DispatchingLogInAction.kt */
    public static final class C2781a {
        private C2781a() {
        }

        public /* synthetic */ C2781a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.q0.a$b */
    /* compiled from: DispatchingLogInAction.kt */
    static final class C2782b<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2782b f7532c = new C2782b();

        C2782b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Timber.m44523a(th);
        }
    }

    static {
        new C2781a(null);
    }

    public C2780a(Provider<Set<C2783b>> provider) {
        this.f7531a = provider;
    }

    /* renamed from: a */
    public Completable mo11569a() {
        Object obj = this.f7531a.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "delegates.get()");
        Iterable<C2783b> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) iterable, 10));
        for (C2783b bVar : iterable) {
            Completable a = bVar.mo11569a().mo30033a(10, TimeUnit.SECONDS, C11934b.m38500b());
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "it.onLogin().timeout(ACT…SECONDS, Schedulers.io())");
            Intrinsics.checkReturnedValueIsNotNull((Object) bVar.getClass().getSimpleName(), "it.javaClass.simpleName");
            arrayList.add(a);
        }
        Completable a2 = Completable.m38167c((Iterable<? extends CompletableSource>) arrayList).mo30036a((Consumer<? super Throwable>) C2782b.f7532c);
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "Completable.mergeDelayEr…oOnError { Timber.e(it) }");
        return a2;
    }
}
