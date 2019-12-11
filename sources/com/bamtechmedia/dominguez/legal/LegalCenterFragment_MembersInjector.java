package com.bamtechmedia.dominguez.legal;

import javax.inject.Provider;
import p163g.p509o.p510a.C11848c;
import p163g.p509o.p510a.C11863k;
import p512h.C11869b;
import p512h.p513c.C11876f;
import p512h.p513c.p514k.C11889h;

public final class LegalCenterFragment_MembersInjector implements C11869b<LegalCenterFragment> {
    private final Provider<C11848c<C11863k>> adapterProvider;
    private final Provider<C11876f<Object>> androidInjectorProvider;
    private final Provider<LegalCenterItemsFactory> itemsFactoryProvider;
    private final Provider<LegalCenterViewModel> viewModelProvider;

    public LegalCenterFragment_MembersInjector(Provider<C11876f<Object>> provider, Provider<LegalCenterViewModel> provider2, Provider<LegalCenterItemsFactory> provider3, Provider<C11848c<C11863k>> provider4) {
        this.androidInjectorProvider = provider;
        this.viewModelProvider = provider2;
        this.itemsFactoryProvider = provider3;
        this.adapterProvider = provider4;
    }

    public static C11869b<LegalCenterFragment> create(Provider<C11876f<Object>> provider, Provider<LegalCenterViewModel> provider2, Provider<LegalCenterItemsFactory> provider3, Provider<C11848c<C11863k>> provider4) {
        return new LegalCenterFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectAdapter(LegalCenterFragment legalCenterFragment, C11848c<C11863k> cVar) {
        legalCenterFragment.adapter = cVar;
    }

    public static void injectItemsFactory(LegalCenterFragment legalCenterFragment, LegalCenterItemsFactory legalCenterItemsFactory) {
        legalCenterFragment.itemsFactory = legalCenterItemsFactory;
    }

    public static void injectViewModel(LegalCenterFragment legalCenterFragment, LegalCenterViewModel legalCenterViewModel) {
        legalCenterFragment.viewModel = legalCenterViewModel;
    }

    public void injectMembers(LegalCenterFragment legalCenterFragment) {
        C11889h.m38118a(legalCenterFragment, (C11876f) this.androidInjectorProvider.get());
        injectViewModel(legalCenterFragment, (LegalCenterViewModel) this.viewModelProvider.get());
        injectItemsFactory(legalCenterFragment, (LegalCenterItemsFactory) this.itemsFactoryProvider.get());
        injectAdapter(legalCenterFragment, (C11848c) this.adapterProvider.get());
    }
}
