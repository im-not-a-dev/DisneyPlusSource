package com.bamtechmedia.dominguez.legal;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterContentErrorItem.kt */
final class LegalCenterContentErrorItem$bind$1 implements OnClickListener {
    final /* synthetic */ LegalCenterContentErrorItem this$0;

    LegalCenterContentErrorItem$bind$1(LegalCenterContentErrorItem legalCenterContentErrorItem) {
        this.this$0 = legalCenterContentErrorItem;
    }

    public final void onClick(View view) {
        this.this$0.viewModel.retryLoadContent(this.this$0.documentCode);
    }
}
