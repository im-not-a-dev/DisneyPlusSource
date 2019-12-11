package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.content.custom.CustomContentApi;
import com.bamtech.sdk4.content.custom.CustomContentApi.DefaultImpls;
import com.bamtech.sdk4.content.custom.GraphQlRequestBuilder.Persisted;
import java.util.Comparator;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11760v;
import p520io.reactivex.Single;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApiImpl;", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchSuggestApi;", "searchSuggestionApi", "Lcom/bamtech/sdk4/content/custom/CustomContentApi;", "uiLanguageCodeRepo", "Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/bamtech/sdk4/content/custom/CustomContentApi;Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;Lcom/squareup/moshi/Moshi;)V", "searchSuggest", "Lio/reactivex/Single;", "", "Lcom/bamtechmedia/dominguez/core/content/search/Suggestion;", "query", "", "Companion", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.e */
/* compiled from: DmgzSearchSuggestApiImpl.kt */
public final class C3733e implements C3732d {

    /* renamed from: a */
    private final CustomContentApi f9326a;

    /* renamed from: b */
    private final C3749j f9327b;

    /* renamed from: c */
    private final C11760v f9328c;

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$a */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    public static final class C3734a {
        private C3734a() {
        }

        public /* synthetic */ C3734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$b */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    static final class C3735b<T, R> implements Function<T, R> {

        /* renamed from: c */
        final /* synthetic */ C11725h f9329c;

        C3735b(C11725h hVar) {
            this.f9329c = hVar;
        }

        /* renamed from: a */
        public final SearchSuggestionResponse apply(String str) {
            return (SearchSuggestionResponse) this.f9329c.fromJson(str);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$c */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    static final class C3736c<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3736c f9330c = new C3736c();

        C3736c() {
        }

        /* renamed from: a */
        public final Data apply(SearchSuggestionResponse searchSuggestionResponse) {
            return searchSuggestionResponse.mo13562a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$d */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    static final class C3737d<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3737d f9331c = new C3737d();

        C3737d() {
        }

        /* renamed from: a */
        public final List<Suggestion> apply(Data data) {
            return data.mo13556a();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$e */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    static final class C3738e<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: c */
        public static final C3738e f9332c = new C3738e();

        C3738e() {
        }

        /* renamed from: a */
        public final List<Suggestion> mo13586a(List<Suggestion> list) {
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo13586a(list);
            return list;
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/core/content/search/Suggestion;", "kotlin.jvm.PlatformType", "list", "", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$f */
    /* compiled from: DmgzSearchSuggestApiImpl.kt */
    static final class C3739f<T, R> implements Function<T, R> {

        /* renamed from: c */
        public static final C3739f f9333c = new C3739f();

        /* renamed from: com.bamtechmedia.dominguez.core.content.search.e$f$a */
        /* compiled from: Comparisons.kt */
        public static final class C3740a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C13206b.m40622a(Integer.valueOf(((Suggestion) t).mo13570c().getSortOrder()), Integer.valueOf(((Suggestion) t2).mo13570c().getSortOrder()));
            }
        }

        C3739f() {
        }

        /* renamed from: a */
        public final List<Suggestion> apply(List<Suggestion> list) {
            return C13199w.m40562a((Iterable) list, (Comparator) new C3740a());
        }
    }

    static {
        new C3734a(null);
    }

    public C3733e(CustomContentApi customContentApi, C3749j jVar, C11760v vVar) {
        this.f9326a = customContentApi;
        this.f9327b = jVar;
        this.f9328c = vVar;
    }

    /* renamed from: a */
    public Single<List<Suggestion>> mo13582a(String str) {
        Single<List<Suggestion>> g = DefaultImpls.query$default(this.f9326a, new Persisted("autoSuggestPersisted", "core/suggest").variables(C13173j0.m40356a(C12907r.m40244a("index", "disney"), C12907r.m40244a("prefix", str), C12907r.m40244a("preferredLanguage", this.f9327b.getCode()))).build(), null, 2, null).mo30233g(new C3735b(this.f9328c.mo29866a(SearchSuggestionResponse.class))).mo30233g(C3736c.f9330c).mo30233g(C3737d.f9331c).mo30231f(C3738e.f9332c).mo30201k().mo30233g(C3739f.f9333c);
        Intrinsics.checkReturnedValueIsNotNull((Object) g, "searchSuggestionApi.quer…y { it.type.sortOrder } }");
        return g;
    }
}
