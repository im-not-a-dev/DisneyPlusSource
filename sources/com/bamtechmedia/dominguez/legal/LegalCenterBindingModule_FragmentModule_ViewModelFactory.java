package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

public final class LegalCenterBindingModule_FragmentModule_ViewModelFactory implements C11895c<LegalCenterViewModel> {
    private final Provider<LegalCenterAnalytics> analyticsProvider;
    private final Provider<LegalCenterFragment> fragmentProvider;
    private final Provider<Boolean> isTelevisionProvider;
    private final Provider<LegalApi> legalApiProvider;
    private final Provider<LegalDocumentFinder> legalDocumentFinderProvider;

    public LegalCenterBindingModule_FragmentModule_ViewModelFactory(Provider<LegalCenterFragment> provider, Provider<LegalApi> provider2, Provider<LegalCenterAnalytics> provider3, Provider<Boolean> provider4, Provider<LegalDocumentFinder> provider5) {
        this.fragmentProvider = provider;
        this.legalApiProvider = provider2;
        this.analyticsProvider = provider3;
        this.isTelevisionProvider = provider4;
        this.legalDocumentFinderProvider = provider5;
    }

    public static LegalCenterBindingModule_FragmentModule_ViewModelFactory create(Provider<LegalCenterFragment> provider, Provider<LegalApi> provider2, Provider<LegalCenterAnalytics> provider3, Provider<Boolean> provider4, Provider<LegalDocumentFinder> provider5) {
        LegalCenterBindingModule_FragmentModule_ViewModelFactory legalCenterBindingModule_FragmentModule_ViewModelFactory = new LegalCenterBindingModule_FragmentModule_ViewModelFactory(provider, provider2, provider3, provider4, provider5);
        return legalCenterBindingModule_FragmentModule_ViewModelFactory;
    }

    public static LegalCenterViewModel viewModel(LegalCenterFragment legalCenterFragment, LegalApi legalApi, LegalCenterAnalytics legalCenterAnalytics, boolean z, LegalDocumentFinder legalDocumentFinder) {
        LegalCenterViewModel viewModel = FragmentModule.viewModel(legalCenterFragment, legalApi, legalCenterAnalytics, z, legalDocumentFinder);
        C11897e.m38130a(viewModel, "Cannot return null from a non-@Nullable @Provides method");
        return viewModel;
    }

    public LegalCenterViewModel get() {
        return viewModel((LegalCenterFragment) this.fragmentProvider.get(), (LegalApi) this.legalApiProvider.get(), (LegalCenterAnalytics) this.analyticsProvider.get(), ((Boolean) this.isTelevisionProvider.get()).booleanValue(), (LegalDocumentFinder) this.legalDocumentFinderProvider.get());
    }
}
