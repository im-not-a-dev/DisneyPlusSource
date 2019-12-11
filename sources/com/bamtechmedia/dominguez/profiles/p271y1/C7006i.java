package com.bamtechmedia.dominguez.profiles.p271y1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.profiles.C6629d0;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÂ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003J\t\u0010\u001e\u001a\u00020\rHÂ\u0003J\t\u0010\u001f\u001a\u00020\u000fHÂ\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0012HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfileViewItem;", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerViewItem;", "avatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "name", "", "isSelectedProfile", "", "isEditMode", "onClick", "Lkotlin/Function0;", "", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "accessibility", "Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;", "(Lcom/bamtechmedia/dominguez/profiles/Avatar;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lcom/bamtechmedia/dominguez/profiles/AvatarImages;Lcom/bamtechmedia/dominguez/profiles/ProfileAccessibility;)V", "layout", "", "getLayout", "()I", "bind", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.i */
/* compiled from: ProfileViewItem.kt */
public final class C7006i implements C7005h {

    /* renamed from: a */
    private final C6653e f15554a;

    /* renamed from: b */
    private final String f15555b;

    /* renamed from: c */
    private final boolean f15556c;

    /* renamed from: d */
    private final boolean f15557d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Function0<C13145v> f15558e;

    /* renamed from: f */
    private final C6657f f15559f;

    /* renamed from: g */
    private final C6629d0 f15560g;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.i$a */
    /* compiled from: ProfileViewItem.kt */
    static final class C7007a implements OnClickListener {

        /* renamed from: U */
        final /* synthetic */ C7006i f15561U;

        /* renamed from: c */
        final /* synthetic */ View f15562c;

        C7007a(View view, C7006i iVar) {
            this.f15562c = view;
            this.f15561U = iVar;
        }

        public final void onClick(View view) {
            this.f15561U.f15558e.invoke();
            ImageView imageView = (ImageView) this.f15562c.findViewById(C7946e.avatarProfileRing);
            ImageView imageView2 = imageView;
            C12880j.m40222a((Object) imageView, "avatarProfileRing");
            C3800a.m12829a(imageView2, 0.0f, 1.0f, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 0, null, null, null, null, 258044, null);
        }
    }

    public C7006i(C6653e eVar, String str, boolean z, boolean z2, Function0<C13145v> function0, C6657f fVar, C6629d0 d0Var) {
        this.f15554a = eVar;
        this.f15555b = str;
        this.f15556c = z;
        this.f15557d = z2;
        this.f15558e = function0;
        this.f15559f = fVar;
        this.f15560g = d0Var;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7006i) {
                C7006i iVar = (C7006i) obj;
                if (C12880j.m40224a((Object) this.f15554a, (Object) iVar.f15554a) && C12880j.m40224a((Object) this.f15555b, (Object) iVar.f15555b)) {
                    if (this.f15556c == iVar.f15556c) {
                        if (!(this.f15557d == iVar.f15557d) || !C12880j.m40224a((Object) this.f15558e, (Object) iVar.f15558e) || !C12880j.m40224a((Object) this.f15559f, (Object) iVar.f15559f) || !C12880j.m40224a((Object) this.f15560g, (Object) iVar.f15560g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6653e eVar = this.f15554a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f15555b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f15556c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f15557d;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Function0<C13145v> function0 = this.f15558e;
        int hashCode3 = (i3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        C6657f fVar = this.f15559f;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C6629d0 d0Var = this.f15560g;
        if (d0Var != null) {
            i = d0Var.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileViewItem(avatar=");
        sb.append(this.f15554a);
        sb.append(", name=");
        sb.append(this.f15555b);
        sb.append(", isSelectedProfile=");
        sb.append(this.f15556c);
        sb.append(", isEditMode=");
        sb.append(this.f15557d);
        sb.append(", onClick=");
        sb.append(this.f15558e);
        sb.append(", avatarImages=");
        sb.append(this.f15559f);
        sb.append(", accessibility=");
        sb.append(this.f15560g);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public int mo19764a() {
        return C7948g.item_profile_picker;
    }

    /* renamed from: a */
    public View mo19726a(ViewGroup viewGroup) {
        int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(mo19764a(), viewGroup, false);
        if (this.f15554a != null) {
            C6657f fVar = this.f15559f;
            View findViewById = inflate.findViewById(C7946e.avatarImageView);
            if (findViewById != null) {
                fVar.mo19349a((ImageView) findViewById, this.f15554a);
            } else {
                throw new C13142s("null cannot be cast to non-null type android.widget.ImageView");
            }
        }
        TextView textView = (TextView) inflate.findViewById(C7946e.profileNameTextView);
        C12880j.m40222a((Object) textView, "profileNameTextView");
        textView.setText(this.f15555b);
        ImageView imageView = (ImageView) inflate.findViewById(C7946e.editButton);
        C12880j.m40222a((Object) imageView, "editButton");
        if (!this.f15557d) {
            i = 8;
        }
        imageView.setVisibility(i);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C7946e.profileViewItemContainer);
        C12880j.m40222a((Object) constraintLayout, "profileViewItemContainer");
        constraintLayout.setContentDescription(this.f15560g.mo19295a(this.f15557d, this.f15555b));
        inflate.setOnClickListener(new C7007a(inflate, this));
        C12880j.m40222a((Object) inflate, "LayoutInflater.from(pare…)\n            }\n        }");
        return inflate;
    }
}
