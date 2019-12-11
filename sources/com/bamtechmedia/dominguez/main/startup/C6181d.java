package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.core.utils.C5826e0;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6223d;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p512h.C11868a;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/main/startup/FallbackAppInitialization;", "Lcom/bamtechmedia/dominguez/main/startup/InitializationAction;", "lazyConfigInitialization", "Ldagger/Lazy;", "Lcom/bamtechmedia/dominguez/main/startup/ConfigInitialization;", "onlineAppInitialization", "Lcom/bamtechmedia/dominguez/main/startup/OnlineAppInitialization;", "offlineAppInitialization", "Lcom/bamtechmedia/dominguez/main/startup/OfflineAppInitialization;", "startupConfig", "Lcom/bamtechmedia/dominguez/main/startup/StartupConfig;", "stateHolder", "Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;", "computationScheduler", "Lio/reactivex/Scheduler;", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Lcom/bamtechmedia/dominguez/main/startup/StartupConfig;Lcom/bamtechmedia/dominguez/main/state/MainActivityStateHolder;Lio/reactivex/Scheduler;)V", "initialize", "Lio/reactivex/Completable;", "initializeAfterAppConfig", "initializeAppConfig", "initializeOffline", "it", "", "shouldDisplaySplash", "", "appStart_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.main.startup.d */
/* compiled from: FallbackAppInitialization.kt */
public final class C6181d implements C6187g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11868a<C6178b> f14182a;

    /* renamed from: b */
    private final C11868a<C6196j> f14183b;

    /* renamed from: c */
    private final C11868a<C6188h> f14184c;

    /* renamed from: d */
    private final C6198l f14185d;

    /* renamed from: e */
    private final C6234e f14186e;

    /* renamed from: f */
    private final C11969r f14187f;

    /* renamed from: com.bamtechmedia.dominguez.main.startup.d$a */
    /* compiled from: FallbackAppInitialization.kt */
    static final class C6182a<V> implements Callable<CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6181d f14188c;

        C6182a(C6181d dVar) {
            this.f14188c = dVar;
        }

        public final Completable call() {
            return this.f14188c.m19650c();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.d$b */
    /* compiled from: FallbackAppInitialization.kt */
    static final class C6183b<T, R> implements Function<Throwable, CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6181d f14189c;

        C6183b(C6181d dVar) {
            this.f14189c = dVar;
        }

        /* renamed from: a */
        public final Completable apply(Throwable th) {
            return this.f14189c.m19648a(th);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.main.startup.d$c */
    /* compiled from: FallbackAppInitialization.kt */
    static final class C6184c<V> implements Callable<CompletableSource> {

        /* renamed from: c */
        final /* synthetic */ C6181d f14190c;

        C6184c(C6181d dVar) {
            this.f14190c = dVar;
        }

        public final Completable call() {
            return ((C6178b) this.f14190c.f14182a.get()).mo18783a();
        }
    }

    public C6181d(C11868a<C6178b> aVar, C11868a<C6196j> aVar2, C11868a<C6188h> aVar3, C6198l lVar, C6234e eVar, C11969r rVar) {
        this.f14182a = aVar;
        this.f14183b = aVar2;
        this.f14184c = aVar3;
        this.f14185d = lVar;
        this.f14186e = eVar;
        this.f14187f = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Completable m19650c() {
        return C5826e0.m18820a(((C6196j) this.f14183b.get()).mo18797a(), this.f14185d.mo18798a(), TimeUnit.SECONDS, this.f14187f);
    }

    /* renamed from: d */
    private final Completable m19651d() {
        Completable b = Completable.m38162b((Callable<? extends CompletableSource>) new C6184c<Object>(this)).mo30051b(this.f14187f);
        C12880j.m40222a((Object) b, "Completable.defer { lazy…eOn(computationScheduler)");
        return b;
    }

    /* renamed from: b */
    public boolean mo18786b() {
        return !this.f14186e.mo18830b();
    }

    /* renamed from: a */
    public Completable mo18785a() {
        if (this.f14186e.mo18830b()) {
            Completable h = Completable.m38169h();
            C12880j.m40222a((Object) h, "Completable.complete()");
            return h;
        }
        this.f14186e.mo18829a(new C6223d(null, false, 3, null));
        Completable a = m19651d().mo30034a((CompletableSource) Completable.m38162b((Callable<? extends CompletableSource>) new C6182a<Object>(this))).mo30037a((Function<? super Throwable, ? extends CompletableSource>) new C6183b<Object,Object>(this));
        C12880j.m40222a((Object) a, "initializeAppConfig()\n  …{ initializeOffline(it) }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Completable m19648a(Throwable th) {
        Completable completable;
        if (C6185e.m19656b(th)) {
            completable = Completable.m38169h();
        } else {
            completable = ((C6188h) this.f14184c.get()).mo18790a();
        }
        C12880j.m40222a((Object) completable, "if (it.isIllegalAppState…gLog(\"initializeOffline\")");
        return completable;
    }
}
