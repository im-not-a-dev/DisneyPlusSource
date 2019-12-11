package com.bamtechmedia.dominguez.dictionaries;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eJ2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00052\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/dictionaries/DictionaryRequest;", "", "searchApi", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "configOnce", "Lio/reactivex/Single;", "Lcom/bamtechmedia/dominguez/dictionaries/DictionaryConfig;", "buildInfo", "Lcom/bamtechmedia/dominguez/core/BuildInfo;", "(Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;Lio/reactivex/Single;Lcom/bamtechmedia/dominguez/core/BuildInfo;)V", "dictionariesOnce", "", "Lcom/bamtechmedia/dominguez/dictionaries/Dictionary;", "resourceKeys", "", "language", "keyVersionMap", "", "initialDictionariesOnce", "config_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.dictionaries.j */
/* compiled from: DictionaryRequest.kt */
public final class C6082j {

    /* renamed from: a */
    private final C3724a f14000a;

    /* renamed from: b */
    private final Single<C6063a> f14001b;

    /* renamed from: c */
    private final BuildInfo f14002c;

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.j$a */
    /* compiled from: DictionaryRequest.kt */
    static final class C6083a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ List f14003U;

        /* renamed from: V */
        final /* synthetic */ String f14004V;

        /* renamed from: c */
        final /* synthetic */ C6082j f14005c;

        C6083a(C6082j jVar, List list, String str) {
            this.f14005c = jVar;
            this.f14003U = list;
            this.f14004V = str;
        }

        /* renamed from: a */
        public final Single<List<Dictionary>> apply(C6063a aVar) {
            List<String> list = this.f14003U;
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (String str : list) {
                arrayList.add(C12907r.m40244a(str, aVar.mo18335a(str)));
            }
            return this.f14005c.m19467a(C13173j0.m40351a((Iterable) arrayList), this.f14004V);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.j$b */
    /* compiled from: DictionaryRequest.kt */
    static final class C6084b<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C6084b f14006c = new C6084b();

        C6084b() {
        }

        /* renamed from: a */
        public final List<Dictionary> apply(GraphQlResponse<DictionariesResponse> graphQlResponse) {
            DictionariesResponse dictionariesResponse = (DictionariesResponse) graphQlResponse.getData();
            if (dictionariesResponse != null) {
                return dictionariesResponse.mo18319a();
            }
            return null;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.dictionaries.j$c */
    /* compiled from: DictionaryRequest.kt */
    static final class C6085c<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: U */
        final /* synthetic */ String f14007U;

        /* renamed from: c */
        final /* synthetic */ C6082j f14008c;

        C6085c(C6082j jVar, String str) {
            this.f14008c = jVar;
            this.f14007U = str;
        }

        /* renamed from: a */
        public final Single<List<Dictionary>> apply(C6063a aVar) {
            return this.f14008c.m19467a(aVar.mo18338c(), this.f14007U);
        }
    }

    public C6082j(C3724a aVar, Single<C6063a> single, BuildInfo buildInfo) {
        this.f14000a = aVar;
        this.f14001b = single;
        this.f14002c = buildInfo;
    }

    /* renamed from: a */
    public final Single<List<Dictionary>> mo18357a(List<String> list, String str) {
        Single<List<Dictionary>> a = this.f14001b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6083a<Object,Object>(this, list, str));
        C12880j.m40222a((Object) a, "configOnce.flatMap { con…nMap, language)\n        }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Single<List<Dictionary>> m19467a(Map<String, String> map, String str) {
        C3724a aVar = this.f14000a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C12907r.m40244a("platform", this.f14002c.mo12780c().mo12791a());
        pairArr[1] = C12907r.m40244a("preferredLanguage", new String[]{str});
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(C5859p.m18900a(C13170i0.m40332a(C12907r.m40244a("resourceKey", entry.getKey())), C12907r.m40244a("version", entry.getValue())));
        }
        pairArr[2] = C12907r.m40244a("dictionary", arrayList);
        Single<List<Dictionary>> g = aVar.mo13577a(DictionariesResponse.class, "core/Dictionaries", C13173j0.m40356a(pairArr), null).mo30233g(C6084b.f14006c);
        C12880j.m40222a((Object) g, "searchApi.typedSearch<Di…{ it.data?.dictionaries }");
        return g;
    }

    /* renamed from: a */
    public final Single<List<Dictionary>> mo18356a(String str) {
        Single<List<Dictionary>> a = this.f14001b.mo30208a((Function<? super T, ? extends SingleSource<? extends R>>) new C6085c<Object,Object>(this, str));
        C12880j.m40222a((Object) a, "configOnce.flatMap { dic…eyVersionMap, language) }");
        return a;
    }
}
