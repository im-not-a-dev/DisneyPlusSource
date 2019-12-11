package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder;", "", "()V", "legalDocument", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "legalItem", "Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "documents", "", "LegalItem", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDocumentFinder.kt */
public final class LegalDocumentFinder {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalDocumentFinder$LegalItem;", "", "documentCodeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDocumentCodeName", "()Ljava/lang/String;", "SUBSCRIBER_AGGREMENT", "PRIVACY_POLICY", "COOKIES_POLICY", "EU_PRIVACY_RIGHTS", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LegalDocumentFinder.kt */
    public enum LegalItem {
        SUBSCRIBER_AGGREMENT("GTOU_DPLUS_SUB"),
        PRIVACY_POLICY("ppV2"),
        COOKIES_POLICY("DISNEY-EU-SHAREINFO-COOKIE-ACCEPT"),
        EU_PRIVACY_RIGHTS(r2);
        
        private final String documentCodeName;

        private LegalItem(String str) {
            this.documentCodeName = str;
        }

        public final String getDocumentCodeName() {
            return this.documentCodeName;
        }
    }

    public final LegalDocument legalDocument(LegalItem legalItem, List<LegalDocument> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12832w.m40123b(((LegalDocument) obj).getDocumentCode(), legalItem.getDocumentCodeName(), false, 2, null)) {
                break;
            }
        }
        return (LegalDocument) obj;
    }
}
