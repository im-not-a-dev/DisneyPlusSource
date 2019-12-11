package com.bamtechmedia.dominguez.profiles.p268x1.p270h;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p122j.C4025a;
import p163g.p201e.p203b.p330z.C7943b;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÂ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\t\u0010\u001b\u001a\u00020\u000fHÖ\u0001J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/language/uiselector/MobileLanguageSelectionItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "languageTitle", "", "initialSelection", "", "listener", "Lcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;", "(Ljava/lang/String;ZLcom/bamtechmedia/dominguez/profiles/language/uiselector/LanguageSelectionListener;)V", "currentSelection", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "", "holder", "payloads", "", "", "component1", "component2", "component3", "copy", "equals", "other", "getLayout", "hashCode", "removeCheckWhenSelectAnotherRow", "setupInitialView", "toString", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.g */
/* compiled from: MobileLanguageSelectionItem.kt */
public final class C6962g extends C11866a {

    /* renamed from: U */
    private final String f15470U;

    /* renamed from: V */
    private final boolean f15471V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C6960e f15472W;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f15473c = this.f15471V;

    /* renamed from: com.bamtechmedia.dominguez.profiles.x1.h.g$a */
    /* compiled from: MobileLanguageSelectionItem.kt */
    static final class C6963a implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C6962g f15474U;

        /* renamed from: V */
        final /* synthetic */ C11867b f15475V;

        /* renamed from: c */
        final /* synthetic */ C11867b f15476c;

        C6963a(C11867b bVar, C6962g gVar, C11867b bVar2) {
            this.f15476c = bVar;
            this.f15474U = gVar;
            this.f15475V = bVar2;
        }

        public final void onClick(View view) {
            if (!this.f15474U.f15473c) {
                this.f15474U.f15472W.mo19701a(this.f15476c.getAdapterPosition(), true);
                this.f15474U.f15473c = true;
                CheckBox checkBox = (CheckBox) this.f15476c.mo20994a().findViewById(C7946e.checkbox);
                if (checkBox != null) {
                    checkBox.setChecked(true);
                }
                TextView textView = (TextView) this.f15476c.mo20994a().findViewById(C7946e.languageName);
                View view2 = this.f15475V.itemView;
                Intrinsics.checkReturnedValueIsNotNull((Object) view2, "holder.itemView");
                textView.setTextColor(C4025a.m13788a(view2.getContext(), C7943b.vader_white));
            }
        }
    }

    public C6962g(String str, boolean z, C6960e eVar) {
        this.f15470U = str;
        this.f15471V = z;
        this.f15472W = eVar;
    }

    public void bind(C11867b bVar, int i) {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6962g) {
                C6962g gVar = (C6962g) obj;
                if (Intrinsics.areEqual((Object) this.f15470U, (Object) gVar.f15470U)) {
                    if (!(this.f15471V == gVar.f15471V) || !Intrinsics.areEqual((Object) this.f15472W, (Object) gVar.f15472W)) {
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
        String str = this.f15470U;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f15471V;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C6960e eVar = this.f15472W;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MobileLanguageSelectionItem(languageTitle=");
        sb.append(this.f15470U);
        sb.append(", initialSelection=");
        sb.append(this.f15471V);
        sb.append(", listener=");
        sb.append(this.f15472W);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private final void m21222b(C11867b bVar) {
        CheckBox checkBox = (CheckBox) bVar.mo20994a().findViewById(C7946e.checkbox);
        if (checkBox != null) {
            checkBox.setChecked(this.f15473c);
        }
        TextView textView = (TextView) bVar.mo20994a().findViewById(C7946e.languageName);
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        textView.setTextColor(C4025a.m13788a(view.getContext(), this.f15473c ? C7943b.vader_white : C7943b.vader_grey8));
        TextView textView2 = (TextView) bVar.mo20994a().findViewById(C7946e.languageName);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView2, "languageName");
        textView2.setText(this.f15470U);
        bVar.mo20994a().findViewById(C7946e.rootView).setOnClickListener(new C6963a(bVar, this, bVar));
    }

    /* renamed from: a */
    private final void m21219a(C11867b bVar) {
        CheckBox checkBox = (CheckBox) bVar.mo20994a().findViewById(C7946e.checkbox);
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        TextView textView = (TextView) bVar.mo20994a().findViewById(C7946e.languageName);
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        textView.setTextColor(C4025a.m13788a(view.getContext(), C7943b.vader_grey8));
        this.f15473c = false;
    }

    public void bind(C11867b bVar, int i, List<Object> list) {
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof Boolean) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            m21219a(bVar);
        } else {
            m21222b(bVar);
        }
    }
}
