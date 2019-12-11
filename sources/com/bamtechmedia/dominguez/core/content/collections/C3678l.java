package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.assets.CollectionAsset;
import javax.inject.Provider;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.l */
/* compiled from: SlugProvider.kt */
public final class C3678l {

    /* renamed from: a */
    private final Provider<String> f9221a;

    public C3678l(Provider<String> provider) {
        this.f9221a = provider;
    }

    /* renamed from: a */
    public final C3676k mo13387a(String str) {
        C3676k kVar = new C3676k("brand", str, false, 4, null);
        return kVar;
    }

    /* renamed from: b */
    public final C3676k mo13388b() {
        C3676k kVar = new C3676k("explore", "explore", false, 4, null);
        return kVar;
    }

    /* renamed from: c */
    public final C3676k mo13390c() {
        C3676k kVar = new C3676k("home", "home", false, 4, null);
        return kVar;
    }

    /* renamed from: d */
    public final C3676k mo13391d() {
        return mo13389b("movies");
    }

    /* renamed from: e */
    public final C3676k mo13392e() {
        C3676k kVar = new C3676k("originals", "originals", false, 4, null);
        return kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f9221a, (java.lang.Object) ((com.bamtechmedia.dominguez.core.content.collections.C3678l) r2).f9221a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.core.content.collections.C3678l
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.core.content.collections.l r2 = (com.bamtechmedia.dominguez.core.content.collections.C3678l) r2
            javax.inject.Provider<java.lang.String> r0 = r1.f9221a
            javax.inject.Provider<java.lang.String> r2 = r2.f9221a
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.content.collections.C3678l.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C3676k mo13394f() {
        C3676k kVar = new C3676k("editorial", "recommendations", false, 4, null);
        return kVar;
    }

    /* renamed from: g */
    public final C3676k mo13395g() {
        return mo13389b("series");
    }

    /* renamed from: h */
    public final C3676k mo13396h() {
        String str = "watchlist";
        return new C3676k(str, str, false);
    }

    public int hashCode() {
        Provider<String> provider = this.f9221a;
        if (provider != null) {
            return provider.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SlugProvider(languageProvider=");
        sb.append(this.f9221a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final C3676k mo13385a() {
        C3676k kVar = new C3676k("avatars", "avatars", false, 4, null);
        return kVar;
    }

    /* renamed from: b */
    public final C3676k mo13389b(String str) {
        C3676k kVar = new C3676k("contentType", str, false, 4, null);
        return kVar;
    }

    /* renamed from: a */
    public final C3676k mo13386a(CollectionAsset collectionAsset) {
        String P = collectionAsset.mo12842P();
        if (P == null) {
            return null;
        }
        CollectionSlug collectionSlug = (CollectionSlug) C13199w.m40591g(collectionAsset.mo12843Q());
        if (collectionSlug == null) {
            return null;
        }
        C3676k kVar = new C3676k(P, collectionSlug.mo13305b(), false, 4, null);
        return kVar;
    }
}
