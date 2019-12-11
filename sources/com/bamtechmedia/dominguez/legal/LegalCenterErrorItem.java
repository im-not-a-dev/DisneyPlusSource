package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.core.design.widgets.NoConnectionView;
import kotlin.Metadata;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterErrorItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "viewModel", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "isOnline", "", "(Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;Z)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "getLayout", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterErrorItem.kt */
public final class LegalCenterErrorItem extends C11866a {
    private final boolean isOnline;
    /* access modifiers changed from: private */
    public final LegalCenterViewModel viewModel;

    public LegalCenterErrorItem(LegalCenterViewModel legalCenterViewModel, boolean z) {
        super(0);
        this.viewModel = legalCenterViewModel;
        this.isOnline = z;
    }

    public int getLayout() {
        return C6117R.layout.legal_center_error_item;
    }

    public void bind(C11867b bVar, int i) {
        ((NoConnectionView) bVar.mo20994a().findViewById(C6117R.C6119id.no_connection_view)).mo17432a(this.isOnline);
        ((NoConnectionView) bVar.mo20994a().findViewById(C6117R.C6119id.no_connection_view)).setRetryListener(new LegalCenterErrorItem$bind$1(this));
    }
}
