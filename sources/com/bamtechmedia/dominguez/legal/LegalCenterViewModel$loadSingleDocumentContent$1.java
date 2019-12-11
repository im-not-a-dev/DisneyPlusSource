package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocContent;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterViewModel.kt */
final class LegalCenterViewModel$loadSingleDocumentContent$1<T> implements Consumer<LegalDocContent> {
    final /* synthetic */ String $code;
    final /* synthetic */ LegalCenterViewModel this$0;

    LegalCenterViewModel$loadSingleDocumentContent$1(LegalCenterViewModel legalCenterViewModel, String str) {
        this.this$0 = legalCenterViewModel;
        this.$code = str;
    }

    public final void accept(LegalDocContent legalDocContent) {
        LegalCenterViewModel legalCenterViewModel = this.this$0;
        String str = this.$code;
        C12880j.m40222a((Object) legalDocContent, "it");
        legalCenterViewModel.onLegalContentLoaded(str, legalDocContent);
    }
}
