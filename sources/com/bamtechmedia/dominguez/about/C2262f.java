package com.bamtechmedia.dominguez.about;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0741y;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.framework.C5741g;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.profiles.C6626c0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p163g.p503n.p504a.C11786a0;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11960n;
import p520io.reactivex.C11974s;
import p520io.reactivex.Observable;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/AboutViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/ReactiveViewModel;", "Lcom/bamtechmedia/dominguez/about/AboutViewModel$State;", "profilesMemoryCache", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "sessionOnce", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "appConfigMap", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/config/AppConfigMap;)V", "observeActiveWorkers", "", "onSessionInfoLoaded", "sessionInfo", "Lcom/bamtech/sdk4/session/SessionInfo;", "State", "ViewModelProvider", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.f */
/* compiled from: AboutViewModel.kt */
public final class C2262f extends C5741g<C2266d> {

    /* renamed from: com.bamtechmedia.dominguez.about.f$a */
    /* compiled from: AboutViewModel.kt */
    static final class C2263a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: c */
        public static final C2263a f6392c = new C2263a();

        C2263a() {
        }

        /* renamed from: a */
        public final Single<SessionInfo> apply(Session session) {
            return session.getSessionInfo();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$b */
    /* compiled from: AboutViewModel.kt */
    static final /* synthetic */ class C2264b extends C12879i implements Function1<SessionInfo, C13145v> {
        C2264b(C2262f fVar) {
            super(1, fVar);
        }

        /* renamed from: a */
        public final void mo11305a(SessionInfo sessionInfo) {
            ((C2262f) this.receiver).m8681a(sessionInfo);
        }

        public final String getName() {
            return "onSessionInfoLoaded";
        }

        public final KDeclarationContainer getOwner() {
            return C12895y.m40230a(C2262f.class);
        }

        public final String getSignature() {
            return "onSessionInfoLoaded(Lcom/bamtech/sdk4/session/SessionInfo;)V";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11305a((SessionInfo) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$c */
    /* compiled from: AboutViewModel.kt */
    static final class C2265c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2265c f6393c = new C2265c();

        C2265c() {
        }

        /* renamed from: a */
        public final void mo11306a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo11306a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$d */
    /* compiled from: AboutViewModel.kt */
    public static final class C2266d {

        /* renamed from: a */
        private final boolean f6394a;

        /* renamed from: b */
        private final C3524e f6395b;

        /* renamed from: c */
        private final SessionInfo f6396c;

        /* renamed from: d */
        private final C6626c0 f6397d;

        /* renamed from: e */
        private final List<WorkInfo> f6398e;

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
            if (r2 != true) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2266d(com.bamtechmedia.dominguez.config.C3524e r2, com.bamtech.sdk4.session.SessionInfo r3, com.bamtechmedia.dominguez.profiles.C6626c0 r4, java.util.List<androidx.work.WorkInfo> r5) {
            /*
                r1 = this;
                r1.<init>()
                r1.f6395b = r2
                r1.f6396c = r3
                r1.f6397d = r4
                r1.f6398e = r5
                com.bamtech.sdk4.session.SessionInfo r2 = r1.f6396c
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0043
                java.util.List r2 = r2.getEntitlements()
                if (r2 == 0) goto L_0x0043
                boolean r5 = r2 instanceof java.util.Collection
                if (r5 == 0) goto L_0x0023
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x0023
            L_0x0021:
                r2 = 0
                goto L_0x0040
            L_0x0023:
                java.util.Iterator r2 = r2.iterator()
            L_0x0027:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x0021
                java.lang.Object r5 = r2.next()
                com.bamtech.sdk4.session.SessionEntitlement r5 = (com.bamtech.sdk4.session.SessionEntitlement) r5
                java.lang.String r5 = r5.getName()
                java.lang.String r0 = "DISNEY_EXEC"
                boolean r5 = kotlin.jvm.internal.C12880j.m40224a(r5, r0)
                if (r5 == 0) goto L_0x0027
                r2 = 1
            L_0x0040:
                if (r2 != r3) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r3 = 0
            L_0x0044:
                r1.f6394a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.C2262f.C2266d.<init>(com.bamtechmedia.dominguez.config.e, com.bamtech.sdk4.session.SessionInfo, com.bamtechmedia.dominguez.profiles.c0, java.util.List):void");
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<androidx.work.WorkInfo>, for r4v0, types: [java.util.List] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.bamtechmedia.dominguez.about.C2262f.C2266d m8688a(com.bamtechmedia.dominguez.about.C2262f.C2266d r0, com.bamtechmedia.dominguez.config.C3524e r1, com.bamtech.sdk4.session.SessionInfo r2, com.bamtechmedia.dominguez.profiles.C6626c0 r3, java.util.List<androidx.work.WorkInfo> r4, int r5, java.lang.Object r6) {
            /*
                r6 = r5 & 1
                if (r6 == 0) goto L_0x0006
                com.bamtechmedia.dominguez.config.e r1 = r0.f6395b
            L_0x0006:
                r6 = r5 & 2
                if (r6 == 0) goto L_0x000c
                com.bamtech.sdk4.session.SessionInfo r2 = r0.f6396c
            L_0x000c:
                r6 = r5 & 4
                if (r6 == 0) goto L_0x0012
                com.bamtechmedia.dominguez.profiles.c0 r3 = r0.f6397d
            L_0x0012:
                r5 = r5 & 8
                if (r5 == 0) goto L_0x0018
                java.util.List<androidx.work.WorkInfo> r4 = r0.f6398e
            L_0x0018:
                com.bamtechmedia.dominguez.about.f$d r0 = r0.mo11307a(r1, r2, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.C2262f.C2266d.m8688a(com.bamtechmedia.dominguez.about.f$d, com.bamtechmedia.dominguez.config.e, com.bamtech.sdk4.session.SessionInfo, com.bamtechmedia.dominguez.profiles.c0, java.util.List, int, java.lang.Object):com.bamtechmedia.dominguez.about.f$d");
        }

        /* renamed from: a */
        public final C2266d mo11307a(C3524e eVar, SessionInfo sessionInfo, C6626c0 c0Var, List<WorkInfo> list) {
            return new C2266d(eVar, sessionInfo, c0Var, list);
        }

        /* renamed from: a */
        public final List<WorkInfo> mo11308a() {
            return this.f6398e;
        }

        /* renamed from: b */
        public final C6626c0 mo11309b() {
            return this.f6397d;
        }

        /* renamed from: c */
        public final C3524e mo11310c() {
            return this.f6395b;
        }

        /* renamed from: d */
        public final SessionInfo mo11311d() {
            return this.f6396c;
        }

        /* renamed from: e */
        public final boolean mo11312e() {
            return this.f6394a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f6398e, (java.lang.Object) r3.f6398e) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.bamtechmedia.dominguez.about.C2262f.C2266d
                if (r0 == 0) goto L_0x0031
                com.bamtechmedia.dominguez.about.f$d r3 = (com.bamtechmedia.dominguez.about.C2262f.C2266d) r3
                com.bamtechmedia.dominguez.config.e r0 = r2.f6395b
                com.bamtechmedia.dominguez.config.e r1 = r3.f6395b
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.bamtech.sdk4.session.SessionInfo r0 = r2.f6396c
                com.bamtech.sdk4.session.SessionInfo r1 = r3.f6396c
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0031
                com.bamtechmedia.dominguez.profiles.c0 r0 = r2.f6397d
                com.bamtechmedia.dominguez.profiles.c0 r1 = r3.f6397d
                boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<androidx.work.WorkInfo> r0 = r2.f6398e
                java.util.List<androidx.work.WorkInfo> r3 = r3.f6398e
                boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.about.C2262f.C2266d.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C3524e eVar = this.f6395b;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            SessionInfo sessionInfo = this.f6396c;
            int hashCode2 = (hashCode + (sessionInfo != null ? sessionInfo.hashCode() : 0)) * 31;
            C6626c0 c0Var = this.f6397d;
            int hashCode3 = (hashCode2 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
            List<WorkInfo> list = this.f6398e;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(appConfigMap=");
            sb.append(this.f6395b);
            sb.append(", sessionInfo=");
            sb.append(this.f6396c);
            sb.append(", activeProfile=");
            sb.append(this.f6397d);
            sb.append(", activeDownloadWorkInfoList=");
            sb.append(this.f6398e);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C2266d(C3524e eVar, SessionInfo sessionInfo, C6626c0 c0Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                sessionInfo = null;
            }
            if ((i & 4) != 0) {
                c0Var = null;
            }
            if ((i & 8) != 0) {
                list = null;
            }
            this(eVar, sessionInfo, c0Var, list);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/AboutViewModel$ViewModelProvider;", "", "profilesMemoryCacheProvider", "Ljavax/inject/Provider;", "Lcom/bamtechmedia/dominguez/profiles/ProfilesMemoryCache;", "sessionOnceProvider", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/Session;", "appConfigMapProvider", "Lcom/bamtechmedia/dominguez/config/AppConfigMap;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Lcom/bamtechmedia/dominguez/about/AboutViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.f$e */
    /* compiled from: AboutViewModel.kt */
    public static final class C2267e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Provider<C6627c1> f6399a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Provider<Single<Session>> f6400b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Provider<C3524e> f6401c;

        /* renamed from: com.bamtechmedia.dominguez.about.f$e$a */
        /* compiled from: ViewModelUtilsExt.kt */
        public static final class C2268a<T> implements Provider<T> {

            /* renamed from: a */
            final /* synthetic */ C2267e f6402a;

            public C2268a(C2267e eVar) {
                this.f6402a = eVar;
            }

            public final T get() {
                Object obj = this.f6402a.f6399a.get();
                C12880j.m40222a(obj, "profilesMemoryCacheProvider.get()");
                C6627c1 c1Var = (C6627c1) obj;
                Object obj2 = this.f6402a.f6400b.get();
                C12880j.m40222a(obj2, "sessionOnceProvider.get()");
                Single single = (Single) obj2;
                Object obj3 = this.f6402a.f6401c.get();
                C12880j.m40222a(obj3, "appConfigMapProvider.get()");
                return new C2262f(c1Var, single, (C3524e) obj3);
            }
        }

        public C2267e(Provider<C6627c1> provider, Provider<Single<Session>> provider2, Provider<C3524e> provider3) {
            this.f6399a = provider;
            this.f6400b = provider2;
            this.f6401c = provider3;
        }

        /* renamed from: a */
        public final C2262f mo11316a(Fragment fragment) {
            C0741y a = C5856o0.m18893a(fragment, C2262f.class, (Provider<T>) new C2268a<T>(this));
            C12880j.m40222a((Object) a, "ViewModelUtils.getViewMo…:class.java) { create() }");
            return (C2262f) a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$f */
    /* compiled from: AboutViewModel.kt */
    static final class C2269f<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C2269f f6403c = new C2269f();

        C2269f() {
        }

        /* renamed from: a */
        public final List<WorkInfo> apply(Long l) {
            return (List) WorkManager.m5490a().mo5643b("sdk-download-worker").get();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "", "infoList", "", "Landroidx/work/WorkInfo;", "kotlin.jvm.PlatformType", "", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.about.f$g */
    /* compiled from: AboutViewModel.kt */
    static final class C2270g<T> implements Consumer<List<WorkInfo>> {

        /* renamed from: c */
        final /* synthetic */ C2262f f6404c;

        /* renamed from: com.bamtechmedia.dominguez.about.f$g$a */
        /* compiled from: AboutViewModel.kt */
        static final class C2271a extends C12881k implements Function1<C2266d, C2266d> {

            /* renamed from: c */
            final /* synthetic */ List f6405c;

            C2271a(List list) {
                this.f6405c = list;
                super(1);
            }

            /* renamed from: a */
            public final C2266d invoke(C2266d dVar) {
                List list = this.f6405c;
                C12880j.m40222a((Object) list, "it");
                if (!(!list.isEmpty())) {
                    list = null;
                }
                return C2266d.m8688a(dVar, null, null, null, list, 7, null);
            }
        }

        C2270g(C2262f fVar) {
            this.f6404c = fVar;
        }

        /* renamed from: a */
        public final void accept(List<WorkInfo> list) {
            this.f6404c.updateState(new C2271a(list));
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$h */
    /* compiled from: AboutViewModel.kt */
    static final class C2272h<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2272h f6406c = new C2272h();

        C2272h() {
        }

        /* renamed from: a */
        public final void mo11320a(Throwable th) {
            C12880j.m40222a((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo11320a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.about.f$i */
    /* compiled from: AboutViewModel.kt */
    static final class C2273i extends C12881k implements Function1<C2266d, C2266d> {

        /* renamed from: U */
        final /* synthetic */ SessionInfo f6407U;

        /* renamed from: c */
        final /* synthetic */ C2262f f6408c;

        C2273i(C2262f fVar, SessionInfo sessionInfo) {
            this.f6408c = fVar;
            this.f6407U = sessionInfo;
            super(1);
        }

        /* renamed from: a */
        public final C2266d invoke(C2266d dVar) {
            C2266d a = C2266d.m8688a(dVar, null, this.f6407U, null, null, 13, null);
            if (dVar.mo11312e()) {
                this.f6408c.m8684y();
            }
            return a;
        }
    }

    public C2262f(C6627c1 c1Var, Single<Session> single, C3524e eVar) {
        super(null, 1, null);
        C2266d dVar = new C2266d(eVar, null, c1Var.mo19287b(), null, 10, null);
        createState(dVar);
        Single a = single.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) C2263a.f6392c);
        C12880j.m40222a((Object) a, "sessionOnce.flatMap { it.getSessionInfo() }");
        Object a2 = a.mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a2).mo29920a(new C2274g(new C2264b(this)), C2265c.f6393c);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m8684y() {
        Observable g = Observable.m38298a(0, 1, TimeUnit.SECONDS, C11934b.m38500b()).mo30193g(C2269f.f6403c);
        C12880j.m40222a((Object) g, "Observable.interval(0, 1…download-worker\").get() }");
        Object a = g.mo30161a((C11960n<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        C12880j.m40222a(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11786a0) a).mo29915a(new C2270g(this), C2272h.f6406c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m8681a(SessionInfo sessionInfo) {
        updateState(new C2273i(this, sessionInfo));
    }
}
