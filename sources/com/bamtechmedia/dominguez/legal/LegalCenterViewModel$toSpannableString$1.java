package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import com.bamtechmedia.dominguez.legal.api.LegalLink;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "link", "Lcom/bamtechmedia/dominguez/legal/api/LegalLink;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$toSpannableString$1 extends C12881k implements Function1<LegalLink, C13145v> {
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$toSpannableString$1(LegalCenterViewModel legalCenterViewModel) {
        this.this$0 = legalCenterViewModel;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LegalLink) obj);
        return C13145v.f29587a;
    }

    public final void invoke(final LegalLink legalLink) {
        this.this$0.updateState(new Function1<State, State>() {
            public final State invoke(State state) {
                return State.copy$default(state, null, legalLink.getDocumentCode(), null, null, null, 29, null);
            }
        });
    }
}
