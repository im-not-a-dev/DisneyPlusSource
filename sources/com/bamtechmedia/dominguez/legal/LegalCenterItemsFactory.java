package com.bamtechmedia.dominguez.legal;

import android.content.Context;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterItemsFactory;", "", "viewModel", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "context", "Landroid/content/Context;", "(Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;Landroid/content/Context;)V", "create", "", "Lcom/xwray/groupie/Group;", "state", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "createDocumentItems", "document", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterItemsFactory.kt */
public final class LegalCenterItemsFactory {
    private final Context context;
    private final LegalCenterViewModel viewModel;

    public LegalCenterItemsFactory(LegalCenterViewModel legalCenterViewModel, Context context2) {
        this.viewModel = legalCenterViewModel;
        this.context = context2;
    }

    private final List<C11847b> createDocumentItems(State state, LegalDocument legalDocument) {
        LegalDocumentTitleItem legalDocumentTitleItem = new LegalDocumentTitleItem(legalDocument, C12880j.m40224a((Object) state.getOpenDocument(), (Object) legalDocument), this.viewModel);
        CharSequence charSequence = (CharSequence) state.getSpannedDocumentContent().get(legalDocument.getDocumentCode());
        if (C5837i.m18843e(this.context) || (!C12880j.m40224a((Object) state.getOpenDocument(), (Object) legalDocument))) {
            return C13183n.m40498a(legalDocumentTitleItem);
        }
        if (charSequence == null && state.getFailedContentDocumentCodes().contains(legalDocument.getDocumentCode())) {
            return C13185o.m40520c(legalDocumentTitleItem, new LegalCenterContentErrorItem(legalDocument.getDocumentCode(), this.viewModel));
        } else if (charSequence == null) {
            return C13185o.m40520c(legalDocumentTitleItem, new LegalCenterLoadingItem(legalDocument.getDocumentCode()));
        } else {
            return C13185o.m40520c(legalDocumentTitleItem, new LegalCenterContentItem(legalDocument, charSequence));
        }
    }

    public final List<C11847b> create(State state) {
        if (state.getLoading() && !C5837i.m18843e(this.context)) {
            return C13183n.m40498a(new LegalCenterLoadingItem(null, 1, null));
        }
        if (state.isOffline() && !C5837i.m18843e(this.context)) {
            return C13183n.m40498a(new LegalCenterErrorItem(this.viewModel, false));
        }
        List<LegalDocument> allDocuments = state.getAllDocuments();
        ArrayList arrayList = new ArrayList();
        for (LegalDocument createDocumentItems : allDocuments) {
            C13196t.m40545a((Collection) arrayList, (Iterable) createDocumentItems(state, createDocumentItems));
        }
        return arrayList;
    }
}
