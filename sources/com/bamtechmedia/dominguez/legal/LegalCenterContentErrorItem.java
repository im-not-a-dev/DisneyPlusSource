package com.bamtechmedia.dominguez.legal;

import android.widget.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\b\u0010\u0014\u001a\u00020\fH\u0016J\t\u0010\u0015\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterContentErrorItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "documentCode", "", "viewModel", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "(Ljava/lang/String;Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "component2", "copy", "equals", "", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterContentErrorItem.kt */
public final class LegalCenterContentErrorItem extends C11866a {
    /* access modifiers changed from: private */
    public final String documentCode;
    /* access modifiers changed from: private */
    public final LegalCenterViewModel viewModel;

    public LegalCenterContentErrorItem(String str, LegalCenterViewModel legalCenterViewModel) {
        this.documentCode = str;
        this.viewModel = legalCenterViewModel;
    }

    private final String component1() {
        return this.documentCode;
    }

    private final LegalCenterViewModel component2() {
        return this.viewModel;
    }

    public static /* synthetic */ LegalCenterContentErrorItem copy$default(LegalCenterContentErrorItem legalCenterContentErrorItem, String str, LegalCenterViewModel legalCenterViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalCenterContentErrorItem.documentCode;
        }
        if ((i & 2) != 0) {
            legalCenterViewModel = legalCenterContentErrorItem.viewModel;
        }
        return legalCenterContentErrorItem.copy(str, legalCenterViewModel);
    }

    public final LegalCenterContentErrorItem copy(String str, LegalCenterViewModel legalCenterViewModel) {
        return new LegalCenterContentErrorItem(str, legalCenterViewModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.viewModel, (java.lang.Object) r3.viewModel) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.legal.LegalCenterContentErrorItem
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.legal.LegalCenterContentErrorItem r3 = (com.bamtechmedia.dominguez.legal.LegalCenterContentErrorItem) r3
            java.lang.String r0 = r2.documentCode
            java.lang.String r1 = r3.documentCode
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r0 = r2.viewModel
            com.bamtechmedia.dominguez.legal.LegalCenterViewModel r3 = r3.viewModel
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterContentErrorItem.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C6117R.layout.legal_center_retry_item;
    }

    public int hashCode() {
        String str = this.documentCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LegalCenterViewModel legalCenterViewModel = this.viewModel;
        if (legalCenterViewModel != null) {
            i = legalCenterViewModel.hashCode();
        }
        return hashCode + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof LegalCenterContentErrorItem) && C12880j.m40224a((Object) ((LegalCenterContentErrorItem) eVar).documentCode, (Object) this.documentCode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalCenterContentErrorItem(documentCode=");
        sb.append(this.documentCode);
        sb.append(", viewModel=");
        sb.append(this.viewModel);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        ((Button) bVar.mo20994a().findViewById(C6117R.C6119id.retry_button)).setOnClickListener(new LegalCenterContentErrorItem$bind$1(this));
    }
}
