package com.bamtechmedia.dominguez.legal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\b\u0010\u0013\u001a\u00020\fH\u0016J\t\u0010\u0014\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterLoadingItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "code", "", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "component1", "copy", "equals", "", "other", "", "getLayout", "hashCode", "isSameAs", "Lcom/xwray/groupie/Item;", "toString", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterLoadingItem.kt */
public final class LegalCenterLoadingItem extends C11866a {
    private final String code;

    public LegalCenterLoadingItem() {
        this(null, 1, null);
    }

    public LegalCenterLoadingItem(String str) {
        this.code = str;
    }

    public static /* synthetic */ LegalCenterLoadingItem copy$default(LegalCenterLoadingItem legalCenterLoadingItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalCenterLoadingItem.code;
        }
        return legalCenterLoadingItem.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final LegalCenterLoadingItem copy(String str) {
        return new LegalCenterLoadingItem(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.code, (java.lang.Object) ((com.bamtechmedia.dominguez.legal.LegalCenterLoadingItem) r2).code) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.legal.LegalCenterLoadingItem
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.legal.LegalCenterLoadingItem r2 = (com.bamtechmedia.dominguez.legal.LegalCenterLoadingItem) r2
            java.lang.String r0 = r1.code
            java.lang.String r2 = r2.code
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalCenterLoadingItem.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public int getLayout() {
        return C6117R.layout.legal_center_loading_item;
    }

    public int hashCode() {
        String str = this.code;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof LegalCenterLoadingItem) && Intrinsics.areEqual((Object) ((LegalCenterLoadingItem) eVar).code, (Object) this.code);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalCenterLoadingItem(code=");
        sb.append(this.code);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ LegalCenterLoadingItem(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        this(str);
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        view.getLayoutParams().height = this.code == null ? -1 : -2;
    }
}
