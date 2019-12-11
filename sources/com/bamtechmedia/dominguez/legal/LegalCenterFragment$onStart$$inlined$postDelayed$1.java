package com.bamtechmedia.dominguez.legal;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "", "run", "androidx/core/view/ViewKt$postDelayed$runnable$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: View.kt */
public final class LegalCenterFragment$onStart$$inlined$postDelayed$1 implements Runnable {
    final /* synthetic */ LegalCenterFragment this$0;

    public LegalCenterFragment$onStart$$inlined$postDelayed$1(LegalCenterFragment legalCenterFragment) {
        this.this$0 = legalCenterFragment;
    }

    public final void run() {
        LegalCenterViewModel.onDocumentSelected$default(this.this$0.getViewModel(), null, 1, null);
    }
}
