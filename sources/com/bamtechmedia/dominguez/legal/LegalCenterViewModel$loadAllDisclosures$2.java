package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "it", "", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$loadAllDisclosures$2<T> implements Consumer<List<? extends LegalDocument>> {
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$loadAllDisclosures$2(LegalCenterViewModel legalCenterViewModel) {
        this.this$0 = legalCenterViewModel;
    }

    public final void accept(List<LegalDocument> list) {
        LegalCenterViewModel legalCenterViewModel = this.this$0;
        Intrinsics.checkReturnedValueIsNotNull((Object) list, "it");
        legalCenterViewModel.onDisclosuresLoaded(list);
    }
}
