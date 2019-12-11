package com.bamtechmedia.dominguez.profiles.p271y1;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.profiles.y1.m */
/* compiled from: ProfileViewItem.kt */
public final class C7018m extends C11866a {

    /* renamed from: U */
    private final boolean f15592U;

    /* renamed from: c */
    private final String f15593c;

    public C7018m(String str, boolean z) {
        this.f15593c = str;
        this.f15592U = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7018m) {
                C7018m mVar = (C7018m) obj;
                if (C12880j.m40224a((Object) this.f15593c, (Object) mVar.f15593c)) {
                    if (this.f15592U == mVar.f15592U) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int getLayout() {
        return C7948g.item_profile_picker_header;
    }

    public int hashCode() {
        String str = this.f15593c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f15592U;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TitleProfileViewItem(title=");
        sb.append(this.f15593c);
        sb.append(", isAddProfiles=");
        sb.append(this.f15592U);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        String str = "viewHolder.itemView";
        C12880j.m40222a((Object) view, str);
        TextView textView = (TextView) view.findViewById(C7946e.titleTextView);
        C12880j.m40222a((Object) textView, "viewHolder.itemView.titleTextView");
        textView.setText(this.f15593c);
        View view2 = bVar.itemView;
        C12880j.m40222a((Object) view2, str);
        TextView textView2 = (TextView) view2.findViewById(C7946e.descriptionTextView);
        C12880j.m40222a((Object) textView2, "viewHolder.itemView.descriptionTextView");
        textView2.setVisibility(this.f15592U ? 0 : 8);
    }
}
