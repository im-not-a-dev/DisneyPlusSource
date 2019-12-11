package com.bamtechmedia.dominguez.playback.p237m.p242m.p244f;

import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.offline.StreamingPreferences;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6384c;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6391e;
import com.bamtechmedia.dominguez.playback.p237m.p242m.C6423b;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.playback.m.m.f.e */
/* compiled from: SessionStarter_Factory */
public final class C6446e implements C11895c<C6439c> {

    /* renamed from: a */
    private final Provider<MediaApi> f14619a;

    /* renamed from: b */
    private final Provider<C6384c> f14620b;

    /* renamed from: c */
    private final Provider<C6423b> f14621c;

    /* renamed from: d */
    private final Provider<Optional<StreamingPreferences>> f14622d;

    /* renamed from: e */
    private final Provider<ConnectivityManager> f14623e;

    /* renamed from: f */
    private final Provider<DisplayMetrics> f14624f;

    /* renamed from: g */
    private final Provider<C6391e> f14625g;

    /* renamed from: h */
    private final Provider<C3165c<C3693o>> f14626h;

    /* renamed from: i */
    private final Provider<C6266a> f14627i;

    /* renamed from: j */
    private final Provider<C11969r> f14628j;

    /* renamed from: k */
    private final Provider<C11969r> f14629k;

    public C6446e(Provider<MediaApi> provider, Provider<C6384c> provider2, Provider<C6423b> provider3, Provider<Optional<StreamingPreferences>> provider4, Provider<ConnectivityManager> provider5, Provider<DisplayMetrics> provider6, Provider<C6391e> provider7, Provider<C3165c<C3693o>> provider8, Provider<C6266a> provider9, Provider<C11969r> provider10, Provider<C11969r> provider11) {
        this.f14619a = provider;
        this.f14620b = provider2;
        this.f14621c = provider3;
        this.f14622d = provider4;
        this.f14623e = provider5;
        this.f14624f = provider6;
        this.f14625g = provider7;
        this.f14626h = provider8;
        this.f14627i = provider9;
        this.f14628j = provider10;
        this.f14629k = provider11;
    }

    /* renamed from: a */
    public static C6446e m20129a(Provider<MediaApi> provider, Provider<C6384c> provider2, Provider<C6423b> provider3, Provider<Optional<StreamingPreferences>> provider4, Provider<ConnectivityManager> provider5, Provider<DisplayMetrics> provider6, Provider<C6391e> provider7, Provider<C3165c<C3693o>> provider8, Provider<C6266a> provider9, Provider<C11969r> provider10, Provider<C11969r> provider11) {
        C6446e eVar = new C6446e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
        return eVar;
    }

    public C6439c get() {
        C6439c cVar = new C6439c((MediaApi) this.f14619a.get(), (C6384c) this.f14620b.get(), (C6423b) this.f14621c.get(), (Optional) this.f14622d.get(), (ConnectivityManager) this.f14623e.get(), (DisplayMetrics) this.f14624f.get(), (C6391e) this.f14625g.get(), (C3165c) this.f14626h.get(), (C6266a) this.f14627i.get(), (C11969r) this.f14628j.get(), (C11969r) this.f14629k.get());
        return cVar;
    }
}
