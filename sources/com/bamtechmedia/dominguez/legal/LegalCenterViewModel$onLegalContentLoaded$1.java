package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "it", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$onLegalContentLoaded$1 extends C12881k implements Function1<State, State> {
    final /* synthetic */ String $code;
    final /* synthetic */ LegalDocContent $content;
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$onLegalContentLoaded$1(LegalCenterViewModel legalCenterViewModel, String str, LegalDocContent legalDocContent) {
        this.this$0 = legalCenterViewModel;
        this.$code = str;
        this.$content = legalDocContent;
        super(1);
    }

    public final State invoke(State state) {
        return State.copy$default(state, null, null, C13173j0.m40354a(state.getSpannedDocumentContent(), C12907r.m40244a(this.$code, this.this$0.toSpannableString(this.$content))), null, C13190q0.m40535a(state.getFailedContentDocumentCodes(), (Object) this.$code), 11, null);
    }
}
