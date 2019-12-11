package com.bamtechmedia.dominguez.legal;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.legal.api.LegalApi;
import javax.inject.Provider;
import p163g.p201e.p203b.p286j.C7290d;

abstract class LegalCenterBindingModule {

    static abstract class FragmentModule {
        FragmentModule() {
        }

        /* renamed from: a */
        static /* synthetic */ LegalCenterViewModel m19534a(LegalApi legalApi, boolean z, LegalCenterAnalytics legalCenterAnalytics, LegalDocumentFinder legalDocumentFinder, LegalCenterFragment legalCenterFragment) {
            LegalCenterViewModel legalCenterViewModel = new LegalCenterViewModel(legalApi, new LegalLinkSpanHelper(z), legalCenterAnalytics, z, legalDocumentFinder, legalCenterFragment.getPreloadedDocuments(), legalCenterFragment.getInitialOpenDocumentCode(), legalCenterFragment.getLegalItem());
            return legalCenterViewModel;
        }

        static LegalCenterViewModel viewModel(LegalCenterFragment legalCenterFragment, LegalApi legalApi, LegalCenterAnalytics legalCenterAnalytics, boolean z, LegalDocumentFinder legalDocumentFinder) {
            C6120a aVar = new C6120a(legalApi, z, legalCenterAnalytics, legalDocumentFinder, legalCenterFragment);
            return (LegalCenterViewModel) C5856o0.m18893a((Fragment) legalCenterFragment, LegalCenterViewModel.class, (Provider<T>) aVar);
        }
    }

    LegalCenterBindingModule() {
    }

    /* access modifiers changed from: 0000 */
    public abstract C7290d bindDeepLinkHandler(LegalLinkHandler legalLinkHandler);

    /* access modifiers changed from: 0000 */
    public abstract LegalCenterFragment legalCenterFragment();
}
