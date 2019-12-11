package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.LegalDocumentFinder.LegalItem;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "currentState", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$onDisclosuresLoaded$2 extends C12881k implements Function1<State, State> {
    final /* synthetic */ List $documents;
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$onDisclosuresLoaded$2(LegalCenterViewModel legalCenterViewModel, List list) {
        this.this$0 = legalCenterViewModel;
        this.$documents = list;
        super(1);
    }

    public final State invoke(State state) {
        List list = this.$documents;
        String openDocumentCode = state.getOpenDocumentCode();
        String str = null;
        if (openDocumentCode == null) {
            LegalItem access$getRequestedLegalItem$p = this.this$0.requestedLegalItem;
            if (access$getRequestedLegalItem$p != null) {
                LegalDocument legalDocument = this.this$0.legalDocumentFinder.legalDocument(access$getRequestedLegalItem$p, this.$documents);
                if (legalDocument != null) {
                    openDocumentCode = legalDocument.getDocumentCode();
                }
            }
            openDocumentCode = null;
        }
        if (openDocumentCode == null) {
            LegalDocument legalDocument2 = (LegalDocument) C13199w.m40591g(this.$documents);
            if (legalDocument2 != null) {
                openDocumentCode = legalDocument2.getDocumentCode();
                if (openDocumentCode != null) {
                    if (!this.this$0.isTelevision) {
                        openDocumentCode = null;
                    }
                }
            }
            State copy$default = State.copy$default(state, list, str, null, null, null, 28, null);
            this.this$0.trackPageLoad(copy$default);
            this.this$0.loadDocumentContents(this.$documents, state);
            return copy$default;
        }
        str = openDocumentCode;
        State copy$default2 = State.copy$default(state, list, str, null, null, null, 28, null);
        this.this$0.trackPageLoad(copy$default2);
        this.this$0.loadDocumentContents(this.$documents, state);
        return copy$default2;
    }
}
