package com.bamtechmedia.dominguez.bookmarks;

import android.content.SharedPreferences;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.bookmarks.BookmarksApi;
import javax.inject.Provider;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.bookmarks.e */
/* compiled from: LocalBookmarksRegistry_Factory */
public final class C3167e implements C11895c<LocalBookmarksRegistry> {

    /* renamed from: a */
    private final Provider<BookmarksApi> f8111a;

    /* renamed from: b */
    private final Provider<SharedPreferences> f8112b;

    /* renamed from: c */
    private final Provider<C3163a> f8113c;

    /* renamed from: d */
    private final Provider<C11969r> f8114d;

    /* renamed from: e */
    private final Provider<C11760v> f8115e;

    /* renamed from: f */
    private final Provider<Single<Session>> f8116f;

    public C3167e(Provider<BookmarksApi> provider, Provider<SharedPreferences> provider2, Provider<C3163a> provider3, Provider<C11969r> provider4, Provider<C11760v> provider5, Provider<Single<Session>> provider6) {
        this.f8111a = provider;
        this.f8112b = provider2;
        this.f8113c = provider3;
        this.f8114d = provider4;
        this.f8115e = provider5;
        this.f8116f = provider6;
    }

    /* renamed from: a */
    public static C3167e m11071a(Provider<BookmarksApi> provider, Provider<SharedPreferences> provider2, Provider<C3163a> provider3, Provider<C11969r> provider4, Provider<C11760v> provider5, Provider<Single<Session>> provider6) {
        C3167e eVar = new C3167e(provider, provider2, provider3, provider4, provider5, provider6);
        return eVar;
    }

    public LocalBookmarksRegistry get() {
        LocalBookmarksRegistry localBookmarksRegistry = new LocalBookmarksRegistry((BookmarksApi) this.f8111a.get(), (SharedPreferences) this.f8112b.get(), (C3163a) this.f8113c.get(), (C11969r) this.f8114d.get(), (C11760v) this.f8115e.get(), (Single) this.f8116f.get());
        return localBookmarksRegistry;
    }
}
