package com.bamtechmedia.dominguez.legal.api;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¨\u0006\t"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;", "", "showLegalDocument", "", "documentId", "", "documents", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "legalApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalRouter.kt */
public interface LegalRouter {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: LegalRouter.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void showLegalDocument$default(LegalRouter legalRouter, String str, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    list = null;
                }
                legalRouter.showLegalDocument(str, list);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLegalDocument");
        }
    }

    void showLegalDocument(String str, List<LegalDocument> list);
}
