package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/AccountLegalRouter;", "Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;", "navigation", "Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;", "legalFragmentFactory", "Lcom/bamtechmedia/dominguez/legal/LegalFragmentFactory;", "(Lcom/bamtechmedia/dominguez/core/navigation/FragmentViewNavigation;Lcom/bamtechmedia/dominguez/legal/LegalFragmentFactory;)V", "showLegalDocument", "", "documentId", "", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AccountLegalRouter.kt */
public final class AccountLegalRouter implements LegalRouter {
    private final LegalFragmentFactory legalFragmentFactory;
    private final C5792f navigation;

    public AccountLegalRouter(C5792f fVar, LegalFragmentFactory legalFragmentFactory2) {
        this.navigation = fVar;
        this.legalFragmentFactory = legalFragmentFactory2;
    }

    public void showLegalDocument(String str, List<LegalDocument> list) {
        this.navigation.mo17668a(this.legalFragmentFactory.newLegalCenterFragment(list, str), "LegalCenterFragment");
    }
}
