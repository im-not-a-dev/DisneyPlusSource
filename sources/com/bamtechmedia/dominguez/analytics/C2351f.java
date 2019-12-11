package com.bamtechmedia.dominguez.analytics;

import com.bamtechmedia.dominguez.analytics.p054l0.C2374a;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import com.bamtechmedia.dominguez.core.framework.C5733a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p503n.p504a.C11792d0;
import p163g.p503n.p504a.C11793e;
import p520io.reactivex.C11974s;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ6\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AdobeAnalyticsViewModel;", "Lcom/bamtechmedia/dominguez/core/framework/AutoDisposeViewModel;", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "globalStateContributors", "", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "adobeWrapper", "Lcom/bamtechmedia/dominguez/analytics/AdobeWrapper;", "callTimeAnalyticsValues", "Lcom/bamtechmedia/dominguez/analytics/calltimevalues/CallTimeAnalyticsValues;", "activePageTracker", "Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;", "config", "Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;", "(Ljava/util/Set;Lcom/bamtechmedia/dominguez/analytics/AdobeWrapper;Lcom/bamtechmedia/dominguez/analytics/calltimevalues/CallTimeAnalyticsValues;Lcom/bamtechmedia/dominguez/analytics/ActivePageTracker;Lcom/bamtechmedia/dominguez/analytics/AnalyticsConfig;)V", "globalStateOnce", "Lio/reactivex/Single;", "", "", "extras", "hasPlaceholders", "", "trackAction", "", "action", "trackPageLoad", "overridePage", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.f */
/* compiled from: AdobeAnalyticsViewModel.kt */
public final class C2351f extends C5733a implements C2348e {
    @Deprecated

    /* renamed from: Y */
    public static final C2352a f6558Y = new C2352a(null);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C2360g f6559U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C2374a f6560V;

    /* renamed from: W */
    private final C2336b f6561W;

    /* renamed from: X */
    private final C2364i f6562X;

    /* renamed from: c */
    private final Set<C2434c> f6563c;

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$a */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    private static final class C2352a {
        private C2352a() {
        }

        public /* synthetic */ C2352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$b */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2353b<T, R> implements Function<Object[], R> {

        /* renamed from: c */
        public static final C2353b f6564c = new C2353b();

        C2353b() {
        }

        /* renamed from: a */
        public final Map<String, String> apply(Object[] objArr) {
            ArrayList<Map> arrayList = new ArrayList<>();
            for (Object obj : objArr) {
                if (obj instanceof Map) {
                    arrayList.add(obj);
                }
            }
            Map<String, String> a = C13173j0.m40350a();
            for (Map a2 : arrayList) {
                a = C13173j0.m40353a((Map) a, a2);
            }
            return a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$c */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2354c<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ String f6565U;

        /* renamed from: V */
        final /* synthetic */ Map f6566V;

        /* renamed from: c */
        final /* synthetic */ C2351f f6567c;

        C2354c(C2351f fVar, String str, Map map) {
            this.f6567c = fVar;
            this.f6565U = str;
            this.f6566V = map;
        }

        /* renamed from: a */
        public final Map<String, String> apply(Map<String, String> map) {
            Map a = C13173j0.m40353a((Map) map, this.f6567c.f6560V.mo11506a());
            C2351f.f6558Y;
            return C13173j0.m40353a(C13173j0.m40354a(a, C12907r.m40244a("section", this.f6565U)), this.f6566V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$d */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2355d<T> implements Consumer<Map<String, ? extends String>> {

        /* renamed from: U */
        final /* synthetic */ String f6568U;

        /* renamed from: c */
        final /* synthetic */ C2351f f6569c;

        C2355d(C2351f fVar, String str) {
            this.f6569c = fVar;
            this.f6568U = str;
        }

        /* renamed from: a */
        public final void accept(Map<String, String> map) {
            C2360g a = this.f6569c.f6559U;
            String str = this.f6568U;
            Intrinsics.checkReturnedValueIsNotNull((Object) map, "it");
            a.mo11487a(str, map);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$e */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2356e<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2356e f6570c = new C2356e();

        C2356e() {
        }

        /* renamed from: a */
        public final void mo11483a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo11483a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$f */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2357f<T> implements Consumer<Map<String, ? extends String>> {

        /* renamed from: U */
        final /* synthetic */ String f6571U;

        /* renamed from: c */
        final /* synthetic */ C2351f f6572c;

        C2357f(C2351f fVar, String str) {
            this.f6572c = fVar;
            this.f6571U = str;
        }

        /* renamed from: a */
        public final void accept(Map<String, String> map) {
            C2360g a = this.f6572c.f6559U;
            String str = this.f6571U;
            Intrinsics.checkReturnedValueIsNotNull((Object) map, "it");
            a.mo11488b(str, map);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.f$g */
    /* compiled from: AdobeAnalyticsViewModel.kt */
    static final class C2358g<T> implements Consumer<Throwable> {

        /* renamed from: c */
        public static final C2358g f6573c = new C2358g();

        C2358g() {
        }

        /* renamed from: a */
        public final void mo11485a(Throwable th) {
            Intrinsics.checkReturnedValueIsNotNull((Object) th, "it");
            throw th;
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            mo11485a((Throwable) obj);
            throw null;
        }
    }

    public C2351f(Set<? extends C2434c> set, C2360g gVar, C2374a aVar, C2336b bVar, C2364i iVar) {
        this.f6563c = set;
        this.f6559U = gVar;
        this.f6560V = aVar;
        this.f6561W = bVar;
        this.f6562X = iVar;
    }

    /* renamed from: a */
    public void mo11468a(Map<String, String> map, String str) {
        if (str == null) {
            str = this.f6561W.mo11445a();
        }
        Object a = m8867a(map, false).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
        Intrinsics.checkReturnedValueIsNotNull(a, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((C11792d0) a).mo29920a(new C2357f(this, str), C2358g.f6573c);
    }

    /* renamed from: a */
    public void mo11467a(String str, Map<String, String> map, boolean z) {
        String a = this.f6561W.mo11446a(str);
        if (!this.f6562X.mo11490a("adobe", a)) {
            Object a2 = m8867a(map, z).mo30215a((C11974s<T, ? extends R>) C11793e.m37930a(getViewModelScope()));
            Intrinsics.checkReturnedValueIsNotNull(a2, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((C11792d0) a2).mo29920a(new C2355d(this, a), C2356e.f6570c);
        }
    }

    /* renamed from: a */
    private final Single<Map<String, String>> m8867a(Map<String, String> map, boolean z) {
        if (z) {
            Map<String, String> linkedHashMap = new LinkedHashMap<>(C13173j0.m40349a(map.size()));
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this.f6561W.mo11446a((String) entry.getValue()));
            }
            map = linkedHashMap;
        }
        String b = this.f6561W.mo11447b();
        Set<C2434c> set = this.f6563c;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (C2434c a : set) {
            arrayList.add(a.mo11521a());
        }
        Single<Map<String, String>> g = Single.m38394a((Iterable<? extends SingleSource<? extends T>>) arrayList, (Function<? super Object[], ? extends R>) C2353b.f6564c).mo30233g(new C2354c(this, b, map));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "Single.zip(globalStateCo…ormattedExtras)\n        }");
        return g;
    }
}
