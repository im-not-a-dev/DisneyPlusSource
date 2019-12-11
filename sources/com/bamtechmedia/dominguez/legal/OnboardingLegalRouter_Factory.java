package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

public final class OnboardingLegalRouter_Factory implements C11895c<OnboardingLegalRouter> {
    private final Provider<LegalFragmentFactory> legalFragmentFactoryProvider;
    private final Provider<C5773a> navigationProvider;

    public OnboardingLegalRouter_Factory(Provider<C5773a> provider, Provider<LegalFragmentFactory> provider2) {
        this.navigationProvider = provider;
        this.legalFragmentFactoryProvider = provider2;
    }

    public static OnboardingLegalRouter_Factory create(Provider<C5773a> provider, Provider<LegalFragmentFactory> provider2) {
        return new OnboardingLegalRouter_Factory(provider, provider2);
    }

    public static OnboardingLegalRouter newInstance(C5773a aVar, LegalFragmentFactory legalFragmentFactory) {
        return new OnboardingLegalRouter(aVar, legalFragmentFactory);
    }

    public OnboardingLegalRouter get() {
        return new OnboardingLegalRouter((C5773a) this.navigationProvider.get(), (LegalFragmentFactory) this.legalFragmentFactoryProvider.get());
    }
}
