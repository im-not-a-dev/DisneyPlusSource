package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.content.GraphQlResponse;
import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtechmedia.dominguez.core.C3796d;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import com.google.common.base.Optional;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Provider;
import javax.net.ssl.SSLException;
import kotlin.C12907r;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.C14100a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0017JF\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u001b0\u001a\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020 \u0012\u0002\b\u00030\"2\b\u0010#\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApiImpl;", "Lcom/bamtechmedia/dominguez/core/content/search/DmgzSearchApi;", "searchApi", "Lcom/bamtech/sdk4/content/search/SearchApi;", "offlineState", "Lcom/google/common/base/Optional;", "Lcom/bamtechmedia/dominguez/core/OfflineState;", "searchOverridesProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/content/SearchOverrides;", "uiLanguageCodeRepo", "Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;", "staticSearchApi", "Lcom/bamtechmedia/dominguez/core/content/search/StaticSearchApi;", "config", "Lcom/bamtechmedia/dominguez/core/content/search/SearchApiConfig;", "(Lcom/bamtech/sdk4/content/search/SearchApi;Lcom/google/common/base/Optional;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/core/content/search/UiLanguageCodeRepo;Lcom/bamtechmedia/dominguez/core/content/search/StaticSearchApi;Lcom/bamtechmedia/dominguez/core/content/search/SearchApiConfig;)V", "isNetWorkConnectionIssue", "", "throwable", "", "markOffline", "", "()Lkotlin/Unit;", "markOnline", "search", "Lio/reactivex/Single;", "Lcom/bamtech/sdk4/content/GraphQlResponse;", "T", "type", "Ljava/lang/reflect/Type;", "queryId", "", "variables", "", "contentTransactionId", "Companion", "coreContent_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.content.search.b */
/* compiled from: DmgzSearchApiImpl.kt */
public final class C3727b implements C3724a {

    /* renamed from: b */
    private final SearchApi f9313b;

    /* renamed from: c */
    private final Optional<C3796d> f9314c;

    /* renamed from: d */
    private final Provider<SearchOverrides> f9315d;

    /* renamed from: e */
    private final C3749j f9316e;

    /* renamed from: f */
    private final C3743h f9317f;

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.b$a */
    /* compiled from: DmgzSearchApiImpl.kt */
    public static final class C3728a {
        private C3728a() {
        }

        public /* synthetic */ C3728a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.b$b */
    /* compiled from: DmgzSearchApiImpl.kt */
    static final class C3729b<T> implements Consumer<GraphQlResponse<? extends T>> {

        /* renamed from: c */
        final /* synthetic */ C3727b f9318c;

        C3729b(C3727b bVar) {
            this.f9318c = bVar;
        }

        /* renamed from: a */
        public final void accept(GraphQlResponse<? extends T> graphQlResponse) {
            this.f9318c.m12667b();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.content.search.b$c */
    /* compiled from: DmgzSearchApiImpl.kt */
    static final class C3730c<T> implements Consumer<Throwable> {

        /* renamed from: c */
        final /* synthetic */ C3727b f9319c;

        C3730c(C3727b bVar) {
            this.f9319c = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C3727b bVar = this.f9319c;
            C12880j.m40222a((Object) th, "it");
            if (bVar.m12666a(th)) {
                this.f9319c.m12663a();
            }
        }
    }

    static {
        new C3728a(null);
    }

    public C3727b(SearchApi searchApi, Optional<C3796d> optional, Provider<SearchOverrides> provider, C3749j jVar, C3743h hVar, C3741f fVar) {
        this.f9313b = searchApi;
        this.f9314c = optional;
        this.f9315d = provider;
        this.f9316e = jVar;
        this.f9317f = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C13145v m12667b() {
        C3796d dVar = (C3796d) this.f9314c.mo27107c();
        if (dVar == null) {
            return null;
        }
        if (!dVar.mo13695j()) {
            dVar.mo13694h();
        }
        return C13145v.f29587a;
    }

    /* renamed from: a */
    public <T> Single<GraphQlResponse<T>> mo13577a(Type type, String str, Map<String, ?> map, String str2) {
        String code = this.f9316e.getCode();
        if (code == null) {
            code = this.f9316e.mo13595a();
        }
        HashMap hashMap = new HashMap(map);
        String str3 = "preferredLanguage";
        if (!hashMap.containsKey(str3)) {
            hashMap.put(str3, code);
        }
        Map a = C5859p.m18900a((Map<T, ? extends U>) hashMap, C12907r.m40244a("cache_buster", C3724a.f9310a.mo13578a()));
        Maybe a2 = this.f9317f.mo13590a(type, str, a);
        SearchApi searchApi = this.f9313b;
        Object obj = this.f9315d.get();
        SearchOverrides searchOverrides = (SearchOverrides) obj;
        if (!((searchOverrides.getActiveDate() == null && searchOverrides.getCountryCode() == null) ? false : true)) {
            obj = null;
        }
        Single<GraphQlResponse<T>> b = a2.mo30109a((SingleSource<? extends T>) searchApi.search(type, str, a, (SearchOverrides) obj, str2)).mo30227d((Consumer<? super T>) new C3729b<Object>(this)).mo30218b((Consumer<? super Throwable>) new C3730c<Object>(this));
        C12880j.m40222a((Object) b, "staticSearchApi.staticRe…ssue(it)) markOffline() }");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m12666a(Throwable th) {
        Throwable cause = th.getCause();
        if ((cause instanceof UnknownHostException) || (cause instanceof ConnectException) || (cause instanceof NoRouteToHostException) || (cause instanceof SSLException)) {
            return true;
        }
        C14100a.m44523a(th);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C13145v m12663a() {
        C3796d dVar = (C3796d) this.f9314c.mo27107c();
        if (dVar == null) {
            return null;
        }
        dVar.mo13699u();
        return C13145v.f29587a;
    }
}
