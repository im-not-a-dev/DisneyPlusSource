package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView.C5641a;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo31007d2 = {"com/bamtechmedia/dominguez/legal/LegalCenterErrorItem$bind$1", "Lcom/bamtechmedia/dominguez/core/design/widgets/NoConnectionView$RetryListener;", "onRetryClicked", "", "isOffline", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterErrorItem.kt */
public final class LegalCenterErrorItem$bind$1 implements C5641a {
    final /* synthetic */ LegalCenterErrorItem this$0;

    LegalCenterErrorItem$bind$1(LegalCenterErrorItem legalCenterErrorItem) {
        this.this$0 = legalCenterErrorItem;
    }

    public void onRetryClicked(boolean z) {
        this.this$0.viewModel.loadAllDisclosures();
    }
}
