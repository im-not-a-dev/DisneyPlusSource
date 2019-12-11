package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$onDisclosuresLoaded$1 extends C12881k implements Function1<LegalDocument, String> {
    public static final LegalCenterViewModel$onDisclosuresLoaded$1 INSTANCE = new LegalCenterViewModel$onDisclosuresLoaded$1();

    LegalCenterViewModel$onDisclosuresLoaded$1() {
        super(1);
    }

    public final String invoke(LegalDocument legalDocument) {
        return legalDocument.getTitle();
    }
}
