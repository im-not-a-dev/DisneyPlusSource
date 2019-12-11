package com.bamtechmedia.dominguez.profiles.p271y1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÂ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/AddProfileViewItem;", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerViewItem;", "isEditMode", "", "accessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "onClick", "Lkotlin/Function0;", "", "(ZLcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;Lkotlin/jvm/functions/Function0;)V", "layout", "", "getLayout", "()I", "bind", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.a */
/* compiled from: ProfileViewItem.kt */
public final class C6970a implements C7005h {

    /* renamed from: a */
    private final boolean f15485a;

    /* renamed from: b */
    private final C6629d0 f15486b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function0<C13145v> f15487c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.a$a */
    /* compiled from: ProfileViewItem.kt */
    static final class C6971a implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C6970a f15488U;

        /* renamed from: c */
        final /* synthetic */ View f15489c;

        C6971a(View view, C6970a aVar) {
            this.f15489c = view;
            this.f15488U = aVar;
        }

        public final void onClick(View view) {
            this.f15488U.f15487c.invoke();
            ImageView imageView = (ImageView) this.f15489c.findViewById(C7946e.addProfileRing);
            ImageView imageView2 = imageView;
            C12880j.m40222a((Object) imageView, "addProfileRing");
            C3800a.m12829a(imageView2, 0.0f, 1.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, null, null, null, null, 258044, null);
        }
    }

    public C6970a(boolean z, C6629d0 d0Var, Function0<C13145v> function0) {
        this.f15485a = z;
        this.f15486b = d0Var;
        this.f15487c = function0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6970a) {
                C6970a aVar = (C6970a) obj;
                if (!(this.f15485a == aVar.f15485a) || !C12880j.m40224a((Object) this.f15486b, (Object) aVar.f15486b) || !C12880j.m40224a((Object) this.f15487c, (Object) aVar.f15487c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f15485a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C6629d0 d0Var = this.f15486b;
        int i2 = 0;
        int hashCode = (i + (d0Var != null ? d0Var.hashCode() : 0)) * 31;
        Function0<C13145v> function0 = this.f15487c;
        if (function0 != null) {
            i2 = function0.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddProfileViewItem(isEditMode=");
        sb.append(this.f15485a);
        sb.append(", accessibility=");
        sb.append(this.f15486b);
        sb.append(", onClick=");
        sb.append(this.f15487c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public int mo19725a() {
        return C7948g.item_profile_picker_add;
    }

    /* renamed from: a */
    public View mo19726a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo19725a(), viewGroup, false);
        inflate.setOnClickListener(new C6971a(inflate, this));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C7946e.addProfileViewItemContainer);
        C12880j.m40222a((Object) constraintLayout, "addProfileViewItemContainer");
        constraintLayout.setContentDescription(this.f15486b.mo19294a(this.f15485a));
        C12880j.m40222a((Object) inflate, "LayoutInflater.from(pare…tem(isEditMode)\n        }");
        return inflate;
    }
}
