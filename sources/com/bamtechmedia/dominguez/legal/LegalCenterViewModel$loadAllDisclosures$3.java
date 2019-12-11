package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.LegalCenterViewModel.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$loadAllDisclosures$3<T> implements Consumer<Throwable> {
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$loadAllDisclosures$3(LegalCenterViewModel legalCenterViewModel) {
        this.this$0 = legalCenterViewModel;
    }

    public final void accept(final Throwable th) {
        this.this$0.updateState(new Function1<State, State>() {
            public final State invoke(State state) {
                return State.copy$default(state, null, null, null, th, null, 23, null);
            }
        });
    }
}
