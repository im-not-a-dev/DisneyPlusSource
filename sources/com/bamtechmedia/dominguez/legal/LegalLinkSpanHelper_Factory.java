package com.bamtechmedia.dominguez.legal;

import javax.inject.Provider;
import p512h.p515d.C11895c;

public final class LegalLinkSpanHelper_Factory implements C11895c<LegalLinkSpanHelper> {
    private final Provider<Boolean> isTelevisionProvider;

    public LegalLinkSpanHelper_Factory(Provider<Boolean> provider) {
        this.isTelevisionProvider = provider;
    }

    public static LegalLinkSpanHelper_Factory create(Provider<Boolean> provider) {
        return new LegalLinkSpanHelper_Factory(provider);
    }

    public static LegalLinkSpanHelper newInstance(boolean z) {
        return new LegalLinkSpanHelper(z);
    }

    public LegalLinkSpanHelper get() {
        return new LegalLinkSpanHelper(((Boolean) this.isTelevisionProvider.get()).booleanValue());
    }
}
