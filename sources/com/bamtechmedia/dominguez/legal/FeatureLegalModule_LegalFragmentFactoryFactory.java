package com.bamtechmedia.dominguez.legal;

import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

public final class FeatureLegalModule_LegalFragmentFactoryFactory implements C11895c<LegalFragmentFactory> {
    private static final FeatureLegalModule_LegalFragmentFactoryFactory INSTANCE = new FeatureLegalModule_LegalFragmentFactoryFactory();

    public static FeatureLegalModule_LegalFragmentFactoryFactory create() {
        return INSTANCE;
    }

    public static LegalFragmentFactory legalFragmentFactory() {
        LegalFragmentFactory legalFragmentFactory = FeatureLegalModule.legalFragmentFactory();
        C11897e.m38130a(legalFragmentFactory, "Cannot return null from a non-@Nullable @Provides method");
        return legalFragmentFactory;
    }

    public LegalFragmentFactory get() {
        return legalFragmentFactory();
    }
}
