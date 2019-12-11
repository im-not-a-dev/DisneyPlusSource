package com.bamtechmedia.dominguez.collections.items;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.bamtechmedia.dominguez.collections.C3320f;
import com.bamtechmedia.dominguez.collections.C3416k0;
import com.bamtechmedia.dominguez.collections.p080o0.C3441g;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.core.utils.C5825e;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001dB\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\u0010\"J\u000e\u0010B\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\bCJ\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016HÀ\u0003¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001aHÀ\u0003¢\u0006\u0002\bGJ\u000e\u0010H\u001a\u00020\u001cHÀ\u0003¢\u0006\u0002\bIJ\u000e\u0010J\u001a\u00020\u001eHÀ\u0003¢\u0006\u0002\bKJ\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020!0 HÀ\u0003¢\u0006\u0002\bMJ\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bOJ\u000e\u0010P\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\bQJ\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0\bHÀ\u0003¢\u0006\u0002\bSJ\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÀ\u0003¢\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\bWJ\u000e\u0010X\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\bYJ\u000e\u0010Z\u001a\u00020\u0012HÀ\u0003¢\u0006\u0002\b[J\u000e\u0010\\\u001a\u00020\u0014HÀ\u0003¢\u0006\u0002\b]Jµ\u0001\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0001J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020!HÖ\u0001J\t\u0010c\u001a\u00020\u0003HÖ\u0001R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters;", "", "shelfId", "", "shelfTitle", "config", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "items", "", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "bindListener", "Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "shelfItemSession", "Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "shelfFragmentHelper", "Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;", "analytics", "Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "adapterProvider", "Ljavax/inject/Provider;", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "buildVersionProvider", "Lcom/bamtechmedia/dominguez/core/utils/BuildVersionProvider;", "collectionsAppConfig", "Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "viewTypeSet", "", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;Ljava/util/List;Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;Ljavax/inject/Provider;Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;Lcom/bamtechmedia/dominguez/core/utils/BuildVersionProvider;Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;Ljava/util/Set;)V", "getAdapterProvider$collectionsApi_release", "()Ljavax/inject/Provider;", "getAnalytics$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/CollectionAnalytics;", "getAssets$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "getBindListener$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/items/ShelfBindListener;", "getBuildVersionProvider$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/core/utils/BuildVersionProvider;", "getCollectionsAppConfig$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/config/CollectionsAppConfig;", "getConfig$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/config/ContainerConfig;", "getItems$collectionsApi_release", "()Ljava/util/List;", "getPagingListener$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "getShelfFragmentHelper$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/items/ShelfFragmentHelper;", "getShelfId$collectionsApi_release", "()Ljava/lang/String;", "getShelfItemSession$collectionsApi_release", "()Lcom/bamtechmedia/dominguez/collections/ShelfItemSession;", "getShelfTitle$collectionsApi_release", "stableId", "", "getStableId", "()J", "getViewTypeSet$collectionsApi_release", "()Ljava/util/Set;", "component1", "component1$collectionsApi_release", "component10", "component10$collectionsApi_release", "component11", "component11$collectionsApi_release", "component12", "component12$collectionsApi_release", "component13", "component13$collectionsApi_release", "component14", "component14$collectionsApi_release", "component2", "component2$collectionsApi_release", "component3", "component3$collectionsApi_release", "component4", "component4$collectionsApi_release", "component5", "component5$collectionsApi_release", "component6", "component6$collectionsApi_release", "component7", "component7$collectionsApi_release", "component8", "component8$collectionsApi_release", "component9", "component9$collectionsApi_release", "copy", "equals", "", "other", "hashCode", "toString", "Factory", "collectionsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.collections.items.v */
/* compiled from: ShelfItemParameters.kt */
public final class C3392v {

    /* renamed from: a */
    private final String f8551a;

    /* renamed from: b */
    private final String f8552b;

    /* renamed from: c */
    private final C3444j f8553c;

    /* renamed from: d */
    private final C3700c<C3626b> f8554d;

    /* renamed from: e */
    private final List<C11866a> f8555e;

    /* renamed from: f */
    private final C3374o f8556f;

    /* renamed from: g */
    private final C3416k0 f8557g;

    /* renamed from: h */
    private final ShelfFragmentHelper f8558h;

    /* renamed from: i */
    private final C3320f f8559i;

    /* renamed from: j */
    private final Provider<C11848c<C11867b>> f8560j;

    /* renamed from: k */
    private final C3702e f8561k;

    /* renamed from: l */
    private final C5825e f8562l;

    /* renamed from: m */
    private final C3441g f8563m;

    /* renamed from: n */
    private final Set<Integer> f8564n;

    /* renamed from: com.bamtechmedia.dominguez.collections.items.v$a */
    /* compiled from: ShelfItemParameters.kt */
    public static final class C3393a {

        /* renamed from: a */
        private final C3374o f8565a;

        /* renamed from: b */
        private final C3416k0 f8566b;

        /* renamed from: c */
        private final ShelfFragmentHelper f8567c;

        /* renamed from: d */
        private final C3320f f8568d;

        /* renamed from: e */
        private final Provider<C11848c<C11867b>> f8569e;

        /* renamed from: f */
        private final C3702e f8570f;

        /* renamed from: g */
        private final C5825e f8571g;

        /* renamed from: h */
        private final C3441g f8572h;

        public C3393a(C3374o oVar, C3416k0 k0Var, ShelfFragmentHelper shelfFragmentHelper, C3320f fVar, Provider<C11848c<C11867b>> provider, C3702e eVar, C5825e eVar2, C3441g gVar) {
            this.f8565a = oVar;
            this.f8566b = k0Var;
            this.f8567c = shelfFragmentHelper;
            this.f8568d = fVar;
            this.f8569e = provider;
            this.f8570f = eVar;
            this.f8571g = eVar2;
            this.f8572h = gVar;
        }

        /* renamed from: a */
        public final C3392v mo12547a(String str, String str2, C3444j jVar, C3700c<? extends C3626b> cVar, List<? extends C11866a> list) {
            C3392v vVar = new C3392v(str, str2, jVar, cVar, list, this.f8565a, this.f8566b, this.f8567c, this.f8568d, this.f8569e, this.f8570f, this.f8571g, this.f8572h, null, ContentServiceClientExtras.URL_SIZE_LIMIT, null);
            return vVar;
        }
    }

    public C3392v(String str, String str2, C3444j jVar, C3700c<? extends C3626b> cVar, List<? extends C11866a> list, C3374o oVar, C3416k0 k0Var, ShelfFragmentHelper shelfFragmentHelper, C3320f fVar, Provider<C11848c<C11867b>> provider, C3702e eVar, C5825e eVar2, C3441g gVar, Set<Integer> set) {
        this.f8551a = str;
        this.f8552b = str2;
        this.f8553c = jVar;
        this.f8554d = cVar;
        this.f8555e = list;
        this.f8556f = oVar;
        this.f8557g = k0Var;
        this.f8558h = shelfFragmentHelper;
        this.f8559i = fVar;
        this.f8560j = provider;
        this.f8561k = eVar;
        this.f8562l = eVar2;
        this.f8563m = gVar;
        this.f8564n = set;
    }

    /* renamed from: a */
    public final Provider<C11848c<C11867b>> mo12530a() {
        return this.f8560j;
    }

    /* renamed from: b */
    public final C3320f mo12531b() {
        return this.f8559i;
    }

    /* renamed from: c */
    public final C3700c<C3626b> mo12532c() {
        return this.f8554d;
    }

    /* renamed from: d */
    public final C3374o mo12533d() {
        return this.f8556f;
    }

    /* renamed from: e */
    public final C5825e mo12534e() {
        return this.f8562l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f8564n, (java.lang.Object) r3.f8564n) != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0097
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.collections.items.C3392v
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.items.v r3 = (com.bamtechmedia.dominguez.collections.items.C3392v) r3
            java.lang.String r0 = r2.f8551a
            java.lang.String r1 = r3.f8551a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r2.f8552b
            java.lang.String r1 = r3.f8552b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.o0.j r0 = r2.f8553c
            com.bamtechmedia.dominguez.collections.o0.j r1 = r3.f8553c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r0 = r2.f8554d
            com.bamtechmedia.dominguez.core.content.paging.c<com.bamtechmedia.dominguez.core.content.assets.b> r1 = r3.f8554d
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.util.List<g.o.a.l.a> r0 = r2.f8555e
            java.util.List<g.o.a.l.a> r1 = r3.f8555e
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.items.o r0 = r2.f8556f
            com.bamtechmedia.dominguez.collections.items.o r1 = r3.f8556f
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.k0 r0 = r2.f8557g
            com.bamtechmedia.dominguez.collections.k0 r1 = r3.f8557g
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper r0 = r2.f8558h
            com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper r1 = r3.f8558h
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.f r0 = r2.f8559i
            com.bamtechmedia.dominguez.collections.f r1 = r3.f8559i
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            javax.inject.Provider<g.o.a.c<g.o.a.l.b>> r0 = r2.f8560j
            javax.inject.Provider<g.o.a.c<g.o.a.l.b>> r1 = r3.f8560j
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.core.content.paging.e r0 = r2.f8561k
            com.bamtechmedia.dominguez.core.content.paging.e r1 = r3.f8561k
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.core.utils.e r0 = r2.f8562l
            com.bamtechmedia.dominguez.core.utils.e r1 = r3.f8562l
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            com.bamtechmedia.dominguez.collections.o0.g r0 = r2.f8563m
            com.bamtechmedia.dominguez.collections.o0.g r1 = r3.f8563m
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0095
            java.util.Set<java.lang.Integer> r0 = r2.f8564n
            java.util.Set<java.lang.Integer> r3 = r3.f8564n
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r3 = 0
            return r3
        L_0x0097:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3392v.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C3441g mo12536f() {
        return this.f8563m;
    }

    /* renamed from: g */
    public final C3444j mo12537g() {
        return this.f8553c;
    }

    /* renamed from: h */
    public final List<C11866a> mo12538h() {
        return this.f8555e;
    }

    public int hashCode() {
        String str = this.f8551a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8552b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3444j jVar = this.f8553c;
        int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C3700c<C3626b> cVar = this.f8554d;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        List<C11866a> list = this.f8555e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        C3374o oVar = this.f8556f;
        int hashCode6 = (hashCode5 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        C3416k0 k0Var = this.f8557g;
        int hashCode7 = (hashCode6 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        ShelfFragmentHelper shelfFragmentHelper = this.f8558h;
        int hashCode8 = (hashCode7 + (shelfFragmentHelper != null ? shelfFragmentHelper.hashCode() : 0)) * 31;
        C3320f fVar = this.f8559i;
        int hashCode9 = (hashCode8 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Provider<C11848c<C11867b>> provider = this.f8560j;
        int hashCode10 = (hashCode9 + (provider != null ? provider.hashCode() : 0)) * 31;
        C3702e eVar = this.f8561k;
        int hashCode11 = (hashCode10 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C5825e eVar2 = this.f8562l;
        int hashCode12 = (hashCode11 + (eVar2 != null ? eVar2.hashCode() : 0)) * 31;
        C3441g gVar = this.f8563m;
        int hashCode13 = (hashCode12 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        Set<Integer> set = this.f8564n;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode13 + i;
    }

    /* renamed from: i */
    public final C3702e mo12540i() {
        return this.f8561k;
    }

    /* renamed from: j */
    public final ShelfFragmentHelper mo12541j() {
        return this.f8558h;
    }

    /* renamed from: k */
    public final String mo12542k() {
        return this.f8551a;
    }

    /* renamed from: l */
    public final C3416k0 mo12543l() {
        return this.f8557g;
    }

    /* renamed from: m */
    public final String mo12544m() {
        return this.f8552b;
    }

    /* renamed from: n */
    public final long mo12545n() {
        return this.f8557g.mo12581b(this.f8551a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShelfItemParameters(shelfId=");
        sb.append(this.f8551a);
        sb.append(", shelfTitle=");
        sb.append(this.f8552b);
        sb.append(", config=");
        sb.append(this.f8553c);
        sb.append(", assets=");
        sb.append(this.f8554d);
        sb.append(", items=");
        sb.append(this.f8555e);
        sb.append(", bindListener=");
        sb.append(this.f8556f);
        sb.append(", shelfItemSession=");
        sb.append(this.f8557g);
        sb.append(", shelfFragmentHelper=");
        sb.append(this.f8558h);
        sb.append(", analytics=");
        sb.append(this.f8559i);
        sb.append(", adapterProvider=");
        sb.append(this.f8560j);
        sb.append(", pagingListener=");
        sb.append(this.f8561k);
        sb.append(", buildVersionProvider=");
        sb.append(this.f8562l);
        sb.append(", collectionsAppConfig=");
        sb.append(this.f8563m);
        sb.append(", viewTypeSet=");
        sb.append(this.f8564n);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<g.o.a.l.a>, for r22v0, types: [java.util.List, java.util.List<g.o.a.l.a>, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3392v(java.lang.String r18, java.lang.String r19, com.bamtechmedia.dominguez.collections.p080o0.C3444j r20, com.bamtechmedia.dominguez.core.content.paging.C3700c r21, java.util.List<p163g.p509o.p510a.p511l.C11866a> r22, com.bamtechmedia.dominguez.collections.items.C3374o r23, com.bamtechmedia.dominguez.collections.C3416k0 r24, com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper r25, com.bamtechmedia.dominguez.collections.C3320f r26, javax.inject.Provider r27, com.bamtechmedia.dominguez.core.content.paging.C3702e r28, com.bamtechmedia.dominguez.core.utils.C5825e r29, com.bamtechmedia.dominguez.collections.p080o0.C3441g r30, java.util.Set r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r4 = r1
            goto L_0x000b
        L_0x0009:
            r4 = r19
        L_0x000b:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x003f
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            r7 = r22
            int r1 = kotlin.p590y.C13187p.m40525a(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r22.iterator()
        L_0x0020:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            g.o.a.l.a r2 = (p163g.p509o.p510a.p511l.C11866a) r2
            int r2 = r2.getViewType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            goto L_0x0020
        L_0x0038:
            java.util.Set r0 = kotlin.p590y.C13199w.m40609t(r0)
            r16 = r0
            goto L_0x0043
        L_0x003f:
            r7 = r22
            r16 = r31
        L_0x0043:
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.collections.items.C3392v.<init>(java.lang.String, java.lang.String, com.bamtechmedia.dominguez.collections.o0.j, com.bamtechmedia.dominguez.core.content.paging.c, java.util.List, com.bamtechmedia.dominguez.collections.items.o, com.bamtechmedia.dominguez.collections.k0, com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper, com.bamtechmedia.dominguez.collections.f, javax.inject.Provider, com.bamtechmedia.dominguez.core.content.paging.e, com.bamtechmedia.dominguez.core.utils.e, com.bamtechmedia.dominguez.collections.o0.g, java.util.Set, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
