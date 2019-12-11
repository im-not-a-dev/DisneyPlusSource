package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider;
import com.bamtech.sdk4.media.drm.DefaultSilkDrmProvider;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import java.util.Set;
import javax.inject.Provider;

public final class DrmProviderModule_ProvidersFactory implements C2111c<Set<DrmProvider>> {
    private final DrmProviderModule module;
    private final Provider<DefaultPlayReadyDrmProvider> playReadyDrmProvider;
    private final Provider<DefaultSilkDrmProvider> silkDrmProvider;
    private final Provider<DefaultWidevineDrmProvider> widevineDrmProvider;

    public DrmProviderModule_ProvidersFactory(DrmProviderModule drmProviderModule, Provider<DefaultSilkDrmProvider> provider, Provider<DefaultWidevineDrmProvider> provider2, Provider<DefaultPlayReadyDrmProvider> provider3) {
        this.module = drmProviderModule;
        this.silkDrmProvider = provider;
        this.widevineDrmProvider = provider2;
        this.playReadyDrmProvider = provider3;
    }

    public static DrmProviderModule_ProvidersFactory create(DrmProviderModule drmProviderModule, Provider<DefaultSilkDrmProvider> provider, Provider<DefaultWidevineDrmProvider> provider2, Provider<DefaultPlayReadyDrmProvider> provider3) {
        return new DrmProviderModule_ProvidersFactory(drmProviderModule, provider, provider2, provider3);
    }

    public Set<DrmProvider> get() {
        Set<DrmProvider> providers = this.module.providers((DefaultSilkDrmProvider) this.silkDrmProvider.get(), (DefaultWidevineDrmProvider) this.widevineDrmProvider.get(), (DefaultPlayReadyDrmProvider) this.playReadyDrmProvider.get());
        C2113e.m8178a(providers, "Cannot return null from a non-@Nullable @Provides method");
        return providers;
    }
}
