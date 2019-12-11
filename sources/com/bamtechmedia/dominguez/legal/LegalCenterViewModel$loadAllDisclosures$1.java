package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDataModelsKt;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import com.bamtechmedia.dominguez.legal.api.LegalLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "disclosures", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$loadAllDisclosures$1<T, R> implements Function<T, R> {
    public static final LegalCenterViewModel$loadAllDisclosures$1 INSTANCE = new LegalCenterViewModel$loadAllDisclosures$1();

    LegalCenterViewModel$loadAllDisclosures$1() {
    }

    public final List<LegalDocument> apply(List<LegalDisclosure> list) {
        ArrayList<LegalLink> arrayList = new ArrayList<>();
        for (LegalDisclosure content : list) {
            C13196t.m40545a((Collection) arrayList, (Iterable) content.getContent().getLinks());
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (LegalLink legalDocument : arrayList) {
            arrayList2.add(LegalDataModelsKt.toLegalDocument(legalDocument));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (hashSet.add(((LegalDocument) next).getDocumentCode())) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }
}
