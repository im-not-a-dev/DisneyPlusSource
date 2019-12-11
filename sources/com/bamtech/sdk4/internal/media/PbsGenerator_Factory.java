package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class PbsGenerator_Factory implements C2111c<PbsGenerator> {
    private final Provider<MediaCapabilitiesProvider> mediaCapabilitiesProvider;

    public PbsGenerator_Factory(Provider<MediaCapabilitiesProvider> provider) {
        this.mediaCapabilitiesProvider = provider;
    }

    public static PbsGenerator_Factory create(Provider<MediaCapabilitiesProvider> provider) {
        return new PbsGenerator_Factory(provider);
    }

    public PbsGenerator get() {
        return new PbsGenerator((MediaCapabilitiesProvider) this.mediaCapabilitiesProvider.get());
    }
}
