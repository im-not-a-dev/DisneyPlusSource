package com.bamtechmedia.dominguez.legal;

import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bamtechmedia.dominguez.core.design.widgets.vadergrid.VaderTextView;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p122j.C4025a;
import p163g.p509o.p510a.C11853e;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterContentItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "document", "Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;", "content", "", "(Lcom/bamtechmedia/dominguez/legal/api/LegalDocument;Ljava/lang/CharSequence;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "getLayout", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterContentItem.kt */
public final class LegalCenterContentItem extends C11866a {
    private final CharSequence content;
    private final LegalDocument document;

    public LegalCenterContentItem(LegalDocument legalDocument, CharSequence charSequence) {
        this.document = legalDocument;
        this.content = charSequence;
    }

    public int getLayout() {
        return C6117R.layout.legal_center_content_item;
    }

    public boolean isSameAs(C11853e<?> eVar) {
        return (eVar instanceof LegalCenterContentItem) && C12880j.m40224a((Object) ((LegalCenterContentItem) eVar).document.getDocumentCode(), (Object) this.document.getDocumentCode());
    }

    public void bind(C11867b bVar, int i) {
        VaderTextView vaderTextView = (VaderTextView) bVar.mo20994a().findViewById(C6117R.C6119id.legal_content);
        String str = "viewHolder.legal_content";
        C12880j.m40222a((Object) vaderTextView, str);
        vaderTextView.setText(this.content);
        VaderTextView vaderTextView2 = (VaderTextView) bVar.mo20994a().findViewById(C6117R.C6119id.legal_content);
        C12880j.m40222a((Object) vaderTextView2, str);
        vaderTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        VaderTextView vaderTextView3 = (VaderTextView) bVar.mo20994a().findViewById(C6117R.C6119id.legal_content);
        View view = bVar.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        vaderTextView3.setLinkTextColor(C4025a.m13788a(view.getContext(), C6117R.color.vader_secondary));
    }
}
