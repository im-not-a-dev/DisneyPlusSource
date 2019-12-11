package com.bamtechmedia.dominguez.legal;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

public final class LegalCenterItemsFactory_Factory implements C11895c<LegalCenterItemsFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<LegalCenterViewModel> viewModelProvider;

    public LegalCenterItemsFactory_Factory(Provider<LegalCenterViewModel> provider, Provider<Context> provider2) {
        this.viewModelProvider = provider;
        this.contextProvider = provider2;
    }

    public static LegalCenterItemsFactory_Factory create(Provider<LegalCenterViewModel> provider, Provider<Context> provider2) {
        return new LegalCenterItemsFactory_Factory(provider, provider2);
    }

    public static LegalCenterItemsFactory newInstance(LegalCenterViewModel legalCenterViewModel, Context context) {
        return new LegalCenterItemsFactory(legalCenterViewModel, context);
    }

    public LegalCenterItemsFactory get() {
        return new LegalCenterItemsFactory((LegalCenterViewModel) this.viewModelProvider.get(), (Context) this.contextProvider.get());
    }
}
