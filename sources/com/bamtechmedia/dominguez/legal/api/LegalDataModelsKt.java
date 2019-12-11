package com.bamtechmedia.dominguez.legal.api;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo31007d2 = {"toLegalDocument", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "Lcom/bamtechmedia/dominguez/legal/api/LegalLink;", "legalApi_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: LegalDataModels.kt */
public final class LegalDataModelsKt {
    public static final LegalDocument toLegalDocument(LegalLink legalLink) {
        String documentCode = legalLink.getDocumentCode();
        if (documentCode != null) {
            return new LegalDocument(documentCode, legalLink.getLabel());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
