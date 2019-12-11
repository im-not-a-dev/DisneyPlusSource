package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.custom.GraphQlRequest;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.core.utils.p223t0.C5879c;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.C6673h1;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Provider;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p524d0.C11920c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\u0010\u000eJ*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100\u0005\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J>\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0018\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J<\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u00100!\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00152\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0019JF\u0010$\u001a\u0004\u0018\u00010\u00152\u0014\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00190&2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/StaticSearchApi;", "", "config", "Lcom/bamtechmedia/dominguez/core/content/search/SearchApiConfig;", "sessionInfo", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/session/SessionInfo;", "profilesRepository", "Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;", "httpClientProvider", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "moshiProvider", "Lcom/squareup/moshi/Moshi;", "(Lcom/bamtechmedia/dominguez/core/content/search/SearchApiConfig;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/profiles/ProfilesRepository;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "loadFromNetwork", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "url", "", "matches", "", "overrideVariables", "", "requestVariables", "countryCode", "kidsMode", "parse", "response", "Lokhttp3/Response;", "staticResponseMaybe", "Lio/reactivex/Maybe;", "queryId", "variables", "staticResponseUrl", "queryOverrides", "", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.h */
/* compiled from: StaticSearchApi.kt */
public final class C3743h {

    /* renamed from: a */
    private final C3741f f9336a;

    /* renamed from: b */
    private final Single<SessionInfo> f9337b;

    /* renamed from: c */
    private final C6667g1 f9338c;

    /* renamed from: d */
    private final Provider<OkHttpClient> f9339d;

    /* renamed from: e */
    private final Provider<C11760v> f9340e;

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.h$a */
    /* compiled from: StaticSearchApi.kt */
    static final class C3744a<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ Type f9341U;

        /* renamed from: c */
        final /* synthetic */ C3743h f9342c;

        C3744a(C3743h hVar, Type type) {
            this.f9342c = hVar;
            this.f9341U = type;
        }

        /* renamed from: a */
        public final GraphQlResponse<T> apply(Response response) {
            return this.f9342c.m12684a(response, this.f9341U);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.h$b */
    /* compiled from: StaticSearchApi.kt */
    static final class C3745b<T, R> implements Function<T, R> {

        /* renamed from: U */
        final /* synthetic */ List f9343U;

        /* renamed from: V */
        final /* synthetic */ Map f9344V;

        /* renamed from: c */
        final /* synthetic */ C3743h f9345c;

        C3745b(C3743h hVar, List list, Map map) {
            this.f9345c = hVar;
            this.f9343U = list;
            this.f9344V = map;
        }

        /* renamed from: a */
        public final String apply(Pair<SessionInfo, Boolean> pair) {
            SessionInfo sessionInfo = (SessionInfo) pair.mo31013a();
            Boolean bool = (Boolean) pair.mo31014b();
            C3743h hVar = this.f9345c;
            List list = this.f9343U;
            Map map = this.f9344V;
            String countryCode = sessionInfo.getLocation().getCountryCode();
            if (countryCode != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) bool, "kidsMode");
                String a = hVar.m12688a(list, map, countryCode, bool.booleanValue());
                return a != null ? a : "";
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.h$c */
    /* compiled from: StaticSearchApi.kt */
    static final class C3746c<T> implements C11952h<String> {

        /* renamed from: c */
        public static final C3746c f9346c = new C3746c();

        C3746c() {
        }

        /* renamed from: a */
        public final boolean test(String str) {
            return !C12832w.m40118a(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.h$d */
    /* compiled from: StaticSearchApi.kt */
    static final class C3747d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ Type f9347U;

        /* renamed from: c */
        final /* synthetic */ C3743h f9348c;

        C3747d(C3743h hVar, Type type) {
            this.f9348c = hVar;
            this.f9347U = type;
        }

        /* renamed from: a */
        public final Single<GraphQlResponse<T>> apply(String str) {
            return this.f9348c.m12686a(this.f9347U, str);
        }
    }

    public C3743h(C3741f fVar, Single<SessionInfo> single, C6667g1 g1Var, Provider<OkHttpClient> provider, Provider<C11760v> provider2) {
        this.f9336a = fVar;
        this.f9337b = single;
        this.f9338c = g1Var;
        this.f9339d = provider;
        this.f9340e = provider2;
    }

    /* renamed from: a */
    public final <T> Maybe<GraphQlResponse<T>> mo13590a(Type type, String str, Map<String, ? extends Object> map) {
        List a = this.f9336a.mo13589a(str);
        if (a != null) {
            C5855o oVar = C5855o.f13640a;
            Maybe<GraphQlResponse<T>> e = C11920c.m38475a(this.f9337b, C6673h1.m20690a(this.f9338c)).mo30233g(new C3745b(this, a, map)).mo30202a((C11952h<? super T>) C3746c.f9346c).mo30129e(new C3747d(this, type));
            Intrinsics.checkReturnedValueIsNotNull((Object) e, "sessionInfo\n            …romNetwork<T>(type, it) }");
            return e;
        }
        Maybe<GraphQlResponse<T>> h = Maybe.m38259h();
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "Maybe.empty()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m12688a(List<? extends Map<?, ?>> list, Map<String, ? extends Object> map, String str, boolean z) {
        Object obj;
        String str2 = str;
        boolean z2 = z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Map<String, ? extends Object> map2 = map;
                obj = null;
                break;
            }
            obj = it.next();
            if (m12689a((Map) obj, map, str2, z2)) {
                break;
            }
        }
        Map map3 = (Map) obj;
        if (map3 == null) {
            return null;
        }
        Object obj2 = map3.get("url");
        if (obj2 != null) {
            String a = C12832w.m40117a((String) obj2, "{audience}", z2 ? "kids" : "ga", false, 4, (Object) null);
            if (str2 == null) {
                str2 = "";
            }
            String a2 = C12832w.m40117a(a, "{country}", str2, false, 4, (Object) null);
            String str3 = a2;
            for (Entry entry : map.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append('{');
                sb.append((String) entry.getKey());
                sb.append('}');
                str3 = C12832w.m40117a(str3, sb.toString(), entry.getValue().toString(), false, 4, (Object) null);
            }
            return str3;
        }
        throw new C13142s("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: a */
    private final boolean m12689a(Map<?, ?> map, Map<String, ? extends Object> map2, String str, boolean z) {
        boolean z2;
        C5855o oVar = C5855o.f13640a;
        String str2 = "null cannot be cast to non-null type kotlin.collections.Map<K, *>";
        if (map != null) {
            String str3 = "kidsMode";
            boolean z3 = false;
            boolean z4 = !map.containsKey(str3) || Intrinsics.areEqual((Object) Boolean.valueOf(z), map.get(str3));
            if (map != null) {
                String str4 = "country";
                boolean z5 = !map.containsKey(str4) || Intrinsics.areEqual((Object) str, map.get(str4));
                Object obj = map.get(GraphQlRequest.VARIABLES);
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                Map map3 = (Map) obj;
                if (map3 != null && !map3.isEmpty()) {
                    Iterator it = map3.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Entry entry = (Entry) it.next();
                        if (!Intrinsics.areEqual(map2.get(entry.getKey()), entry.getValue())) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2 && z5 && z4) {
                    z3 = true;
                }
                C5855o oVar2 = C5855o.f13640a;
                return z3;
            }
            throw new C13142s(str2);
        }
        throw new C13142s(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <T> Single<GraphQlResponse<T>> m12686a(Type type, String str) {
        C14113a aVar = new C14113a();
        aVar.mo35848b(str);
        Request a = aVar.mo35846a();
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "Request.Builder().url(url).build()");
        Object obj = this.f9339d.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "httpClientProvider.get()");
        Single<GraphQlResponse<T>> g = C5879c.m18933a(a, (OkHttpClient) obj).mo30233g(new C3744a(this, type));
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "Request.Builder().url(ur…ap { parse<T>(it, type) }");
        return g;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        kotlin.p580c0.C12724b.m39863a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r0 = move-exception;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.bamtech.sdk4.content.GraphQlResponse<T> m12684a(okhttp3.Response r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            javax.inject.Provider<g.m.a.v> r0 = r4.f9340e
            java.lang.Object r0 = r0.get()
            g.m.a.v r0 = (p163g.p500m.p501a.C11760v) r0
            java.lang.Class<com.bamtech.sdk4.content.GraphQlResponse> r1 = com.bamtech.sdk4.content.GraphQlResponse.class
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.reflect.ParameterizedType r6 = p163g.p500m.p501a.C11780y.m37894a(r1, r2)
            g.m.a.h r6 = r0.mo29867a(r6)
            okhttp3.y r5 = r5.mo35855a()
            r0 = 0
            if (r5 == 0) goto L_0x0036
            okio.BufferedSource r1 = r5.mo35703d()     // Catch:{ all -> 0x002f }
            java.lang.Object r6 = r6.fromJson(r1)     // Catch:{ all -> 0x002f }
            com.bamtech.sdk4.content.GraphQlResponse r6 = (com.bamtech.sdk4.content.GraphQlResponse) r6     // Catch:{ all -> 0x002f }
            kotlin.p580c0.C12724b.m39863a(r5, r0)
            if (r6 == 0) goto L_0x0036
            goto L_0x003f
        L_0x002f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            kotlin.p580c0.C12724b.m39863a(r5, r6)
            throw r0
        L_0x0036:
            com.bamtech.sdk4.content.GraphQlResponse r6 = new com.bamtech.sdk4.content.GraphQlResponse
            java.util.List r5 = kotlin.p590y.C13185o.m40513a()
            r6.<init>(r0, r5)
        L_0x003f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.search.C3743h.m12684a(okhttp3.Response, java.lang.reflect.Type):com.bamtech.sdk4.content.GraphQlResponse");
    }
}
