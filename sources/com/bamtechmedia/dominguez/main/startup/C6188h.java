package com.bamtechmedia.dominguez.main.startup;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.main.p235x.C6219d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6222c;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6225f;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6232m;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Completable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/startup/OfflineAppInitialization;", "Lcom/bamtechmedia/dominguez/main/startup/InitializationAction;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "stateHolder", "Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;", "(Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;)V", "initialize", "Lio/reactivex/Completable;", "appStart_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.startup.h */
/* compiled from: OfflineAppInitialization.kt */
public final class C6188h implements C6187g {

    /* renamed from: a */
    private final Single<Session> f14191a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6667g1 f14192b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6234e f14193c;

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$a */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6189a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C6189a f14194c = new C6189a();

        C6189a() {
        }

        /* renamed from: a */
        public final Single<SessionInfo> apply(Session session) {
            return session.getSessionInfo();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$b */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6190b<T> implements C11952h<SessionInfo> {

        /* renamed from: c */
        public static final C6190b f14195c = new C6190b();

        C6190b() {
        }

        /* renamed from: a */
        public final boolean test(SessionInfo sessionInfo) {
            return sessionInfo.isSubscriber();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$c */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6191c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        final /* synthetic */ C6188h f14196c;

        C6191c(C6188h hVar) {
            this.f14196c = hVar;
        }

        /* renamed from: a */
        public final Single<? extends C6626c0> apply(SessionInfo sessionInfo) {
            return this.f14196c.f14192b.mo19381b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$d */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6192d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6192d f14197c = new C6192d();

        C6192d() {
        }

        /* renamed from: a */
        public final C6232m apply(C6626c0 c0Var) {
            return new C6232m(c0Var);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$e */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6193e<T, R> implements Function<Throwable, C6219d> {

        /* renamed from: c */
        public static final C6193e f14198c = new C6193e();

        C6193e() {
        }

        /* renamed from: a */
        public final C6222c apply(Throwable th) {
            C5855o oVar = C5855o.f13640a;
            return C6222c.f14258a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.h$f */
    /* compiled from: OfflineAppInitialization.kt */
    static final class C6194f<T> implements Consumer<C6219d> {

        /* renamed from: c */
        final /* synthetic */ C6188h f14199c;

        C6194f(C6188h hVar) {
            this.f14199c = hVar;
        }

        /* renamed from: a */
        public final void accept(C6219d dVar) {
            C6234e b = this.f14199c.f14193c;
            Intrinsics.checkReturnedValueIsNotNull((Object) dVar, "it");
            b.mo18829a(dVar);
        }
    }

    public C6188h(Single<Session> single, C6667g1 g1Var, C6234e eVar) {
        this.f14191a = single;
        this.f14192b = g1Var;
        this.f14193c = eVar;
    }

    /* renamed from: a */
    public Completable mo18790a() {
        C5855o oVar = C5855o.f13640a;
        Completable e = this.f14191a.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C6189a.f14194c).mo30202a((C11952h<? super T>) C6190b.f14195c).mo30129e(new C6191c(this)).mo30131f(C6192d.f14197c).mo30109a((SingleSource<? extends T>) Single.m38399b(C6225f.f14262a)).mo30237i(C6193e.f14198c).mo30227d((Consumer<? super T>) new C6194f<Object>(this)).mo30228e();
        Intrinsics.checkReturnedValueIsNotNull((Object) e, "sessionOnce.flatMap { it…         .ignoreElement()");
        return e;
    }
}
