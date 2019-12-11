package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel$State;", "it", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$onLegalContentLoadFailed$1 extends C12881k implements Function1<State, State> {
    final /* synthetic */ String $code;

    LegalCenterViewModel$onLegalContentLoadFailed$1(String str) {
        this.$code = str;
        super(1);
    }

    public final State invoke(State state) {
        return State.copy$default(state, null, null, null, null, C13190q0.m40536b(state.getFailedContentDocumentCodes(), this.$code), 15, null);
    }
}
