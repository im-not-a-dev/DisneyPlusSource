package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider;
import com.bamtech.sdk4.internal.media.drm.TestWidevineDrmProvider;
import com.bamtech.sdk4.media.drm.DefaultSilkDrmProvider;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DrmProviderModule_ProvidesTestDrmProvidersFactory implements C2111c<DrmProvider[]> {
    private final DrmProviderModule module;
    private final Provider<DefaultPlayReadyDrmProvider> playReadyDrmProvider;
    private final Provider<DefaultSilkDrmProvider> silkDrmProvider;
    private final Provider<TestWidevineDrmProvider> widevineDrmProvider;

    public DrmProviderModule_ProvidesTestDrmProvidersFactory(DrmProviderModule drmProviderModule, Provider<DefaultSilkDrmProvider> provider, Provider<TestWidevineDrmProvider> provider2, Provider<DefaultPlayReadyDrmProvider> provider3) {
        this.module = drmProviderModule;
        this.silkDrmProvider = provider;
        this.widevineDrmProvider = provider2;
        this.playReadyDrmProvider = provider3;
    }

    public static DrmProviderModule_ProvidesTestDrmProvidersFactory create(DrmProviderModule drmProviderModule, Provider<DefaultSilkDrmProvider> provider, Provider<TestWidevineDrmProvider> provider2, Provider<DefaultPlayReadyDrmProvider> provider3) {
        return new DrmProviderModule_ProvidesTestDrmProvidersFactory(drmProviderModule, provider, provider2, provider3);
    }

    public DrmProvider[] get() {
        DrmProvider[] providesTestDrmProviders = this.module.providesTestDrmProviders((DefaultSilkDrmProvider) this.silkDrmProvider.get(), (TestWidevineDrmProvider) this.widevineDrmProvider.get(), (DefaultPlayReadyDrmProvider) this.playReadyDrmProvider.get());
        C2113e.m8178a(providesTestDrmProviders, "Cannot return null from a non-@Nullable @Provides method");
        return providesTestDrmProviders;
    }
}
