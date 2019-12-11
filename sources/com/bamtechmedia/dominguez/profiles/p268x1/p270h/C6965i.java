package com.bamtechmedia.dominguez.profiles.p268x1.p270h;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import androidx.core.widget.C0513i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7950i;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÂ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/uiselector/TvLanguageSelectionItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "languageTitle", "", "initialSelection", "", "listener", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;", "(Ljava/lang/String;ZLcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;)V", "bind", "", "holder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "payloads", "", "", "component1", "component2", "component3", "copy", "equals", "other", "getLayout", "hashCode", "setFocusChangeListeners", "viewHolder", "toString", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.i */
/* compiled from: TvLanguageSelectionItem.kt */
public final class C6965i extends C11866a {

    /* renamed from: U */
    private final boolean f15477U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C6960e f15478V;

    /* renamed from: c */
    private final String f15479c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.i$a */
    /* compiled from: TvLanguageSelectionItem.kt */
    static final class C6966a implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C11867b f15480U;

        /* renamed from: c */
        final /* synthetic */ C6965i f15481c;

        C6966a(C6965i iVar, C11867b bVar) {
            this.f15481c = iVar;
            this.f15480U = bVar;
        }

        public final void onClick(View view) {
            this.f15481c.f15478V.mo19701a(this.f15480U.getAdapterPosition(), false);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.i$b */
    /* compiled from: TvLanguageSelectionItem.kt */
    static final class C6967b implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ C11867b f15482c;

        C6967b(C11867b bVar) {
            this.f15482c = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            View view2 = this.f15482c.itemView;
            C12880j.m40222a((Object) view2, "viewHolder.itemView");
            TextView textView = (TextView) view2.findViewById(C7946e.languageName);
            if (z) {
                i = C7950i.Disney_TextAppearance_LanguageNameFocused;
            } else {
                i = C7950i.Disney_TextAppearance_LanguageNameUnFocused;
            }
            C0513i.m2778d(textView, i);
        }
    }

    public C6965i(String str, boolean z, C6960e eVar) {
        this.f15479c = str;
        this.f15477U = z;
        this.f15478V = eVar;
    }

    public void bind(C11867b bVar, int i) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6965i) {
                C6965i iVar = (C6965i) obj;
                if (C12880j.m40224a((Object) this.f15479c, (Object) iVar.f15479c)) {
                    if (!(this.f15477U == iVar.f15477U) || !C12880j.m40224a((Object) this.f15478V, (Object) iVar.f15478V)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C7948g.item_language;
    }

    public int hashCode() {
        String str = this.f15479c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f15477U;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C6960e eVar = this.f15478V;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TvLanguageSelectionItem(languageTitle=");
        sb.append(this.f15479c);
        sb.append(", initialSelection=");
        sb.append(this.f15477U);
        sb.append(", listener=");
        sb.append(this.f15478V);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m21225a(C11867b bVar) {
        bVar.mo20994a().findViewById(C7946e.rootView).setOnFocusChangeListener(new C6967b(bVar));
    }

    public void bind(C11867b bVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            TextView textView = (TextView) bVar.mo20994a().findViewById(C7946e.languageName);
            C12880j.m40222a((Object) textView, "holder.languageName");
            textView.setText(this.f15479c);
            m21225a(bVar);
            if (this.f15477U) {
                bVar.mo20994a().findViewById(C7946e.rootView).requestFocus();
            }
            bVar.mo20994a().findViewById(C7946e.rootView).setOnClickListener(new C6966a(this, bVar));
        }
    }
}
