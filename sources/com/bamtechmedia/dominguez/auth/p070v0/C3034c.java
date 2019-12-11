package com.bamtechmedia.dominguez.auth.p070v0;

import android.content.Context;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.TransformFilter;
import android.view.View;
import android.widget.TextView;
import com.bamtechmedia.dominguez.auth.C2711f0;
import com.bamtechmedia.dominguez.auth.C2714g0;
import com.bamtechmedia.dominguez.auth.C2716h0;
import com.bamtechmedia.dominguez.auth.C2718i0;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p070v0.p072h.C3105e;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.legal.api.LegalContent;
import com.bamtechmedia.dominguez.legal.api.LegalDataModelsKt;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.LegalDocument;
import com.bamtechmedia.dominguez.legal.api.LegalLink;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import p096e.p121h.p122j.C4025a;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/auth/validation/LegalLinkedItem;", "Lcom/bamtechmedia/dominguez/auth/validation/LegalItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "legalDisclosure", "Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;", "legalRouter", "Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;", "signUpEmailAnalytics", "Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;", "(Lcom/bamtechmedia/dominguez/legal/api/LegalDisclosure;Lcom/bamtechmedia/dominguez/legal/api/LegalRouter;Lcom/bamtechmedia/dominguez/auth/validation/signup/SignUpEmailAnalytics;)V", "isTopItem", "", "()Z", "setTopItem", "(Z)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "getLayout", "getLegalDisclosureCode", "", "URLSpanClickHandler", "auth_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.auth.v0.c */
/* compiled from: LegalLinkedItem.kt */
public final class C3034c extends C11866a implements C3032a {

    /* renamed from: U */
    private final LegalDisclosure f7892U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final LegalRouter f7893V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C3105e f7894W;

    /* renamed from: c */
    private boolean f7895c;

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.c$a */
    /* compiled from: LegalLinkedItem.kt */
    public final class C3035a extends URLSpan {

        /* renamed from: U */
        private final List<LegalDocument> f7896U;

        /* renamed from: c */
        private final String f7898c;

        public C3035a(String str, List<LegalDocument> list) {
            super(str);
            this.f7898c = str;
            this.f7896U = list;
        }

        public void onClick(View view) {
            String str;
            Object obj;
            Iterator it = this.f7896U.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12880j.m40224a((Object) ((LegalDocument) obj).getDocumentCode(), (Object) this.f7898c)) {
                    break;
                }
            }
            LegalDocument legalDocument = (LegalDocument) obj;
            if (legalDocument != null) {
                str = legalDocument.getTitle();
            }
            if (C12880j.m40224a((Object) str, (Object) C5880u.m18936a(C2721j0.terms))) {
                C3034c.this.f7894W.mo12143c();
            }
            List<LegalDocument> list = this.f7896U;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (hashSet.add(((LegalDocument) next).getDocumentCode())) {
                    arrayList.add(next);
                }
            }
            C3034c.this.f7893V.showLegalDocument(this.f7898c, arrayList);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.c$b */
    /* compiled from: LegalLinkedItem.kt */
    static final class C3036b extends C12881k implements Function1<String, C3035a> {

        /* renamed from: U */
        final /* synthetic */ C3034c f7899U;

        /* renamed from: c */
        final /* synthetic */ LegalContent f7900c;

        C3036b(LegalContent legalContent, C3034c cVar, C11867b bVar) {
            this.f7900c = legalContent;
            this.f7899U = cVar;
            super(1);
        }

        public final C3035a invoke(String str) {
            C3034c cVar = this.f7899U;
            List<LegalLink> links = this.f7900c.getLinks();
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) links, 10));
            for (LegalLink legalDocument : links) {
                arrayList.add(LegalDataModelsKt.toLegalDocument(legalDocument));
            }
            return new C3035a(str, arrayList);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.auth.v0.c$c */
    /* compiled from: LegalLinkedItem.kt */
    static final class C3037c implements TransformFilter {

        /* renamed from: a */
        final /* synthetic */ LegalLink f7901a;

        C3037c(LegalLink legalLink) {
            this.f7901a = legalLink;
        }

        public final String transformUrl(Matcher matcher, String str) {
            return this.f7901a.getDocumentCode();
        }
    }

    public C3034c(LegalDisclosure legalDisclosure, LegalRouter legalRouter, C3105e eVar) {
        this.f7892U = legalDisclosure;
        this.f7893V = legalRouter;
        this.f7894W = eVar;
    }

    public int getLayout() {
        return C2718i0.item_register_legal;
    }

    /* renamed from: a */
    public final void mo12042a(boolean z) {
        this.f7895c = z;
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        String str = "viewHolder.itemView";
        C12880j.m40222a((Object) view, str);
        Context context = view.getContext();
        C12880j.m40222a((Object) context, "viewHolder.itemView.context");
        String str2 = "viewHolder.legalese_tv";
        if (C5837i.m18843e(context)) {
            TextView textView = (TextView) bVar.mo20994a().findViewById(C2716h0.legalese_tv);
            C12880j.m40222a((Object) textView, str2);
            textView.setText(this.f7892U.getContent().getText());
            return;
        }
        LegalContent content = this.f7892U.getContent();
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C2716h0.legalese_tv);
        C12880j.m40222a((Object) textView2, str2);
        textView2.setText(content.getText());
        for (LegalLink legalLink : content.getLinks()) {
            Linkify.addLinks((TextView) bVar.mo20994a().findViewById(C2716h0.legalese_tv), Pattern.compile(legalLink.getLabel()), null, null, new C3037c(legalLink));
        }
        TextView textView3 = (TextView) bVar.mo20994a().findViewById(C2716h0.legalese_tv);
        C12880j.m40222a((Object) textView3, str2);
        textView3.setTransformationMethod(new C3038d(new C3036b(content, this, bVar), 0, 2, null));
        View view2 = bVar.itemView;
        C12880j.m40222a((Object) view2, str);
        View view3 = bVar.itemView;
        C12880j.m40222a((Object) view3, str);
        view2.setBackground(C4025a.m13798c(view3.getContext(), this.f7895c ? C2714g0.background_legalese_signup : C2711f0.vader_white_10));
    }
}
