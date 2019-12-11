package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "state", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$onDocumentSelected$1 extends C12881k implements Function1<State, State> {
    final /* synthetic */ LegalDocument $document;
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$onDocumentSelected$1(LegalCenterViewModel legalCenterViewModel, LegalDocument legalDocument) {
        this.this$0 = legalCenterViewModel;
        this.$document = legalDocument;
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r0 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State invoke(com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State r10) {
        /*
            r9 = this;
            com.bamtechmedia.dominguez.legal.api.LegalDocument r0 = r9.$document
            if (r0 == 0) goto L_0x0038
            com.bamtechmedia.dominguez.legal.api.LegalDocument r0 = r10.getOpenDocument()
            com.bamtechmedia.dominguez.legal.api.LegalDocument r1 = r9.$document
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0013
            goto L_0x0038
        L_0x0013:
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r0 = r9.this$0
            boolean r0 = r0.isTelevision
            if (r0 != 0) goto L_0x005b
            com.bamtechmedia.dominguez.legal.api.LegalDocument r0 = r10.getOpenDocument()
            if (r0 == 0) goto L_0x002a
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r0 = r9.this$0
            com.bamtechmedia.dominguez.legal.LegalCenterAnalytics r0 = r0.analytics
            r0.trackSectionClosed()
        L_0x002a:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 29
            r8 = 0
            r1 = r10
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State r10 = com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x005b
        L_0x0038:
            r1 = 0
            com.bamtechmedia.dominguez.legal.api.LegalDocument r0 = r9.$document
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r0.getDocumentCode()
            if (r0 == 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r0 = r9.this$0
            java.lang.String r0 = r0.openDocumentCode
        L_0x004a:
            r2 = r0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 29
            r7 = 0
            r0 = r10
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State r10 = com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r0 = r9.this$0
            r0.trackPageLoad(r10)
        L_0x005b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterViewModel$onDocumentSelected$1.invoke(com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State):com.bamtechmedia.dominguez.legal.LegalCenterViewModel$State");
    }
}
