package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.bookmarks.C3165c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.l */
/* compiled from: RemoteContentSetDataSource_Factory */
public final class C3787l implements C11895c<RemoteContentSetDataSource> {

    /* renamed from: a */
    private final Provider<C3724a> f9432a;

    /* renamed from: b */
    private final Provider<C3776f> f9433b;

    /* renamed from: c */
    private final Provider<C3165c<C3693o>> f9434c;

    public C3787l(Provider<C3724a> provider, Provider<C3776f> provider2, Provider<C3165c<C3693o>> provider3) {
        this.f9432a = provider;
        this.f9433b = provider2;
        this.f9434c = provider3;
    }

    /* renamed from: a */
    public static C3787l m12807a(Provider<C3724a> provider, Provider<C3776f> provider2, Provider<C3165c<C3693o>> provider3) {
        return new C3787l(provider, provider2, provider3);
    }

    public RemoteContentSetDataSource get() {
        return new RemoteContentSetDataSource((C3724a) this.f9432a.get(), (C3776f) this.f9433b.get(), (C3165c) this.f9434c.get());
    }
}
