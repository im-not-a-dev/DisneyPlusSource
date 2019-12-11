package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00122\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\t\u0010\u001d\u001a\u00020\u000eHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001bH\u0016J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalDocumentTitleItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "document", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "open", "", "viewModel", "Lcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;", "(Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;ZLcom/bamtechmedia/dominguez/legal/LegalCenterViewModel;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "", "component1", "component2", "component3", "copy", "equals", "other", "getChangePayload", "newItem", "Lcom/xwray/groupie/Item;", "getLayout", "hashCode", "isSameAs", "toString", "", "Payload", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalDocumentTitleItem.kt */
public final class LegalDocumentTitleItem extends C11866a {
    /* access modifiers changed from: private */
    public final LegalDocument document;
    private final boolean open;
    /* access modifiers changed from: private */
    public final LegalCenterViewModel viewModel;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalDocumentTitleItem$Payload;", "", "titleChanged", "", "expandedChanged", "(ZZ)V", "getExpandedChanged", "()Z", "getTitleChanged", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: LegalDocumentTitleItem.kt */
    private static final class Payload {
        private final boolean expandedChanged;
        private final boolean titleChanged;

        public Payload(boolean z, boolean z2) {
            this.titleChanged = z;
            this.expandedChanged = z2;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.titleChanged;
            }
            if ((i & 2) != 0) {
                z2 = payload.expandedChanged;
            }
            return payload.copy(z, z2);
        }

        public final boolean component1() {
            return this.titleChanged;
        }

        public final boolean component2() {
            return this.expandedChanged;
        }

        public final Payload copy(boolean z, boolean z2) {
            return new Payload(z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Payload) {
                    Payload payload = (Payload) obj;
                    if (this.titleChanged == payload.titleChanged) {
                        if (this.expandedChanged == payload.expandedChanged) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean getExpandedChanged() {
            return this.expandedChanged;
        }

        public final boolean getTitleChanged() {
            return this.titleChanged;
        }

        public int hashCode() {
            boolean z = this.titleChanged;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.expandedChanged;
            if (!z2) {
                i = z2;
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Payload(titleChanged=");
            sb.append(this.titleChanged);
            sb.append(", expandedChanged=");
            sb.append(this.expandedChanged);
            sb.append(")");
            return sb.toString();
        }
    }

    public LegalDocumentTitleItem(LegalDocument legalDocument, boolean z, LegalCenterViewModel legalCenterViewModel) {
        this.document = legalDocument;
        this.open = z;
        this.viewModel = legalCenterViewModel;
    }

    private final LegalDocument component1() {
        return this.document;
    }

    private final boolean component2() {
        return this.open;
    }

    private final LegalCenterViewModel component3() {
        return this.viewModel;
    }

    public static /* synthetic */ LegalDocumentTitleItem copy$default(LegalDocumentTitleItem legalDocumentTitleItem, LegalDocument legalDocument, boolean z, LegalCenterViewModel legalCenterViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            legalDocument = legalDocumentTitleItem.document;
        }
        if ((i & 2) != 0) {
            z = legalDocumentTitleItem.open;
        }
        if ((i & 4) != 0) {
            legalCenterViewModel = legalDocumentTitleItem.viewModel;
        }
        return legalDocumentTitleItem.copy(legalDocument, z, legalCenterViewModel);
    }

    public void bind(C11867b bVar, int i) {
    }

    public final LegalDocumentTitleItem copy(LegalDocument legalDocument, boolean z, LegalCenterViewModel legalCenterViewModel) {
        return new LegalDocumentTitleItem(legalDocument, z, legalCenterViewModel);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LegalDocumentTitleItem) {
                LegalDocumentTitleItem legalDocumentTitleItem = (LegalDocumentTitleItem) obj;
                if (Intrinsics.areEqual((Object) this.document, (Object) legalDocumentTitleItem.document)) {
                    if (!(this.open == legalDocumentTitleItem.open) || !Intrinsics.areEqual((Object) this.viewModel, (Object) legalDocumentTitleItem.viewModel)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Object getChangePayload(C11853e<?> eVar) {
        String title = this.document.getTitle();
        if (eVar != null) {
            LegalDocumentTitleItem legalDocumentTitleItem = (LegalDocumentTitleItem) eVar;
            boolean z = true;
            boolean z2 = !Intrinsics.areEqual((Object) title, (Object) legalDocumentTitleItem.document.getTitle());
            if (this.open == legalDocumentTitleItem.open) {
                z = false;
            }
            return new Payload(z2, z);
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem");
    }

    public int getLayout() {
        return C6117R.layout.legal_document_title_item;
    }

    public int hashCode() {
        LegalDocument legalDocument = this.document;
        int i = 0;
        int hashCode = (legalDocument != null ? legalDocument.hashCode() : 0) * 31;
        boolean z = this.open;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        LegalCenterViewModel legalCenterViewModel = this.viewModel;
        if (legalCenterViewModel != null) {
            i = legalCenterViewModel.hashCode();
        }
        return i2 + i;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof LegalDocumentTitleItem) && Intrinsics.areEqual((Object) ((LegalDocumentTitleItem) eVar).document.getDocumentCode(), (Object) this.document.getDocumentCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegalDocumentTitleItem(document=");
        sb.append(this.document);
        sb.append(", open=");
        sb.append(this.open);
        sb.append(", viewModel=");
        sb.append(this.viewModel);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(p163g.p509o.p510a.p511l.C11867b r5, int r6, java.util.List<java.lang.Object> r7) {
        /*
            r4 = this;
            boolean r6 = r7.isEmpty()
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0039
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0014
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0014
        L_0x0012:
            r6 = 0
            goto L_0x0034
        L_0x0014:
            java.util.Iterator r6 = r7.iterator()
        L_0x0018:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0012
            java.lang.Object r2 = r6.next()
            boolean r3 = r2 instanceof com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem.Payload
            if (r3 == 0) goto L_0x0030
            com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem$Payload r2 = (com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem.Payload) r2
            boolean r2 = r2.getTitleChanged()
            if (r2 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            if (r2 == 0) goto L_0x0018
            r6 = 1
        L_0x0034:
            if (r6 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r6 = 0
            goto L_0x003a
        L_0x0039:
            r6 = 1
        L_0x003a:
            if (r6 == 0) goto L_0x0056
            android.view.View r6 = r5.mo20994a()
            int r2 = com.bamtechmedia.dominguez.legal.C6117R.C6119id.legal_title
            android.view.View r6 = r6.findViewById(r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r2 = "holder.legal_title"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r2)
            com.bamtechmedia.dominguez.legal.api.LegalDocument r2 = r4.document
            java.lang.String r2 = r2.getTitle()
            r6.setText(r2)
        L_0x0056:
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x008c
            boolean r6 = r7 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0068
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0068
        L_0x0066:
            r6 = 0
            goto L_0x0088
        L_0x0068:
            java.util.Iterator r6 = r7.iterator()
        L_0x006c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0066
            java.lang.Object r7 = r6.next()
            boolean r2 = r7 instanceof com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem.Payload
            if (r2 == 0) goto L_0x0084
            com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem$Payload r7 = (com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem.Payload) r7
            boolean r7 = r7.getExpandedChanged()
            if (r7 == 0) goto L_0x0084
            r7 = 1
            goto L_0x0085
        L_0x0084:
            r7 = 0
        L_0x0085:
            if (r7 == 0) goto L_0x006c
            r6 = 1
        L_0x0088:
            if (r6 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x009a
            android.view.View r6 = r5.itemView
            java.lang.String r7 = "holder.itemView"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r7)
            boolean r7 = r4.open
            r6.setActivated(r7)
        L_0x009a:
            android.view.View r5 = r5.itemView
            com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem$bind$3 r6 = new com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem$bind$3
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.legal.LegalDocumentTitleItem.bind(g.o.a.l.b, int, java.util.List):void");
    }
}
