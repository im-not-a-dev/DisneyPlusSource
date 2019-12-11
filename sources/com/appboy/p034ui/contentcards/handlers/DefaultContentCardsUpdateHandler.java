package com.appboy.p034ui.contentcards.handlers;

import com.appboy.p027p.C1516a;
import com.appboy.p030r.p031o.C1547c;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.appboy.ui.contentcards.handlers.DefaultContentCardsUpdateHandler */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public List<C1547c> handleCardUpdate(C1516a aVar) {
        List<C1547c> a = aVar.mo6752a();
        Collections.sort(a, new Comparator<C1547c>(this) {
            public int compare(C1547c cVar, C1547c cVar2) {
                if (cVar.mo6868M() && !cVar2.mo6868M()) {
                    return -1;
                }
                if (!cVar.mo6868M() && cVar2.mo6868M()) {
                    return 1;
                }
                if (cVar.mo6869N() > cVar2.mo6869N()) {
                    return -1;
                }
                if (cVar.mo6869N() < cVar2.mo6869N()) {
                    return 1;
                }
                return 0;
            }
        });
        return a;
    }
}
