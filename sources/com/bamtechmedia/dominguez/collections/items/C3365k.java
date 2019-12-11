package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.items.k */
/* compiled from: DebugAssetHelper_Factory */
public final class C3365k implements C11895c<C3364j> {

    /* renamed from: a */
    private final Provider<BuildInfo> f8489a;

    public C3365k(Provider<BuildInfo> provider) {
        this.f8489a = provider;
    }

    /* renamed from: a */
    public static C3365k m11555a(Provider<BuildInfo> provider) {
        return new C3365k(provider);
    }

    public C3364j get() {
        return new C3364j((BuildInfo) this.f8489a.get());
    }
}
