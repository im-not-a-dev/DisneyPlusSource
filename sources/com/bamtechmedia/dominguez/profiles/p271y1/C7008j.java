package com.bamtechmedia.dominguez.profiles.p271y1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0513i;
import com.bamtechmedia.dominguez.core.p084g.C3800a;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.C6653e;
import com.bamtechmedia.dominguez.profiles.C6657f;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p201e.p203b.p330z.C7949h;
import p163g.p201e.p203b.p330z.C7950i;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÂ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÂ\u0003J\t\u0010\u001b\u001a\u00020\nHÂ\u0003J\t\u0010\u001c\u001a\u00020\nHÂ\u0003J\t\u0010\u001d\u001a\u00020\rHÂ\u0003J\t\u0010\u001e\u001a\u00020\rHÂ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÂ\u0003J\t\u0010 \u001a\u00020\u0011HÂ\u0003Jk\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010$\u001a\u00020\rH\u0002J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\u0014\u0010'\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0016\u0010(\u001a\u00020\b*\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfileViewTvItem;", "", "avatar", "Lcom/bamtechmedia/dominguez/profiles/Avatar;", "label", "", "onClick", "Lkotlin/Function0;", "", "isEditMode", "", "isSelectedProfile", "size", "", "startMargin", "contentDescriptionItem", "avatarImages", "Lcom/bamtechmedia/dominguez/profiles/AvatarImages;", "(Lcom/bamtechmedia/dominguez/profiles/Avatar;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZIILjava/lang/String;Lcom/bamtechmedia/dominguez/profiles/AvatarImages;)V", "bind", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "position", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getLayout", "hashCode", "toString", "bindAnimation", "bindAvatar", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.j */
/* compiled from: ProfileViewTvItem.kt */
public final class C7008j {

    /* renamed from: a */
    private final C6653e f15563a;

    /* renamed from: b */
    private final String f15564b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function0<C13145v> f15565c;

    /* renamed from: d */
    private final boolean f15566d;

    /* renamed from: e */
    private final boolean f15567e;

    /* renamed from: f */
    private final int f15568f;

    /* renamed from: g */
    private final int f15569g;

    /* renamed from: h */
    private final String f15570h;

    /* renamed from: i */
    private final C6657f f15571i;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.j$a */
    /* compiled from: ProfileViewTvItem.kt */
    static final class C7009a implements OnClickListener {

        /* renamed from: c */
        final /* synthetic */ C7008j f15572c;

        C7009a(C7008j jVar, int i) {
            this.f15572c = jVar;
        }

        public final void onClick(View view) {
            this.f15572c.f15565c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.j$b */
    /* compiled from: ProfileViewTvItem.kt */
    static final class C7010b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f15573c;

        C7010b(View view) {
            this.f15573c = view;
        }

        public final void run() {
            ((ConstraintLayout) this.f15573c.findViewById(C7946e.profileViewItemContainer)).requestFocus();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.j$c */
    /* compiled from: ProfileViewTvItem.kt */
    static final class C7011c implements OnFocusChangeListener {

        /* renamed from: c */
        final /* synthetic */ View f15574c;

        C7011c(View view) {
            this.f15574c = view;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            boolean z2 = z;
            String str = "avatarImageView";
            String str2 = "avatarProfileRing";
            if (z2) {
                ImageView imageView = (ImageView) this.f15574c.findViewById(C7946e.avatarImageView);
                ImageView imageView2 = imageView;
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView, str);
                C3800a.m12829a(imageView2, 0.7f, 0.0f, 0.9f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, null, null, 262138, null);
                ImageView imageView3 = (ImageView) this.f15574c.findViewById(C7946e.avatarProfileRing);
                ImageView imageView4 = imageView3;
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView3, str2);
                C3800a.m12829a(imageView4, 0.0f, 0.0f, 0.9f, 0.0f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, null, null, 262138, null);
            } else {
                ImageView imageView5 = (ImageView) this.f15574c.findViewById(C7946e.avatarImageView);
                ImageView imageView6 = imageView5;
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView5, str);
                C3800a.m12829a(imageView6, 0.0f, 0.7f, 0.0f, 0.9f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, null, null, 262133, null);
                ImageView imageView7 = (ImageView) this.f15574c.findViewById(C7946e.avatarProfileRing);
                ImageView imageView8 = imageView7;
                Intrinsics.checkReturnedValueIsNotNull((Object) imageView7, str2);
                C3800a.m12829a(imageView8, 0.0f, 0.0f, 0.0f, 0.9f, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, null, null, null, 262133, null);
            }
            ImageView imageView9 = (ImageView) this.f15574c.findViewById(C7946e.editButton);
            Intrinsics.checkReturnedValueIsNotNull((Object) imageView9, "editButton");
            imageView9.setSelected(z2);
            ImageView imageView10 = (ImageView) this.f15574c.findViewById(C7946e.avatarProfileRing);
            Intrinsics.checkReturnedValueIsNotNull((Object) imageView10, str2);
            imageView10.setActivated(z2);
            TextView textView = (TextView) this.f15574c.findViewById(C7946e.labelTextView);
            if (z2) {
                i = C7950i.Disney_TextAppearance_ProfileNameFocused;
            } else {
                i = C7950i.Disney_TextAppearance_ProfileNameUnfocused;
            }
            C0513i.m2778d(textView, i);
        }
    }

    public C7008j(C6653e eVar, String str, Function0<C13145v> function0, boolean z, boolean z2, int i, int i2, String str2, C6657f fVar) {
        this.f15563a = eVar;
        this.f15564b = str;
        this.f15565c = function0;
        this.f15566d = z;
        this.f15567e = z2;
        this.f15568f = i;
        this.f15569g = i2;
        this.f15570h = str2;
        this.f15571i = fVar;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7008j) {
                C7008j jVar = (C7008j) obj;
                if (Intrinsics.areEqual((Object) this.f15563a, (Object) jVar.f15563a) && Intrinsics.areEqual((Object) this.f15564b, (Object) jVar.f15564b) && Intrinsics.areEqual((Object) this.f15565c, (Object) jVar.f15565c)) {
                    if (this.f15566d == jVar.f15566d) {
                        if (this.f15567e == jVar.f15567e) {
                            if (this.f15568f == jVar.f15568f) {
                                if (!(this.f15569g == jVar.f15569g) || !Intrinsics.areEqual((Object) this.f15570h, (Object) jVar.f15570h) || !Intrinsics.areEqual((Object) this.f15571i, (Object) jVar.f15571i)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6653e eVar = this.f15563a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f15564b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Function0<C13145v> function0 = this.f15565c;
        int hashCode3 = (hashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31;
        boolean z = this.f15566d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f15567e;
        if (z2) {
            z2 = true;
        }
        int i3 = (((((i2 + (z2 ? 1 : 0)) * 31) + this.f15568f) * 31) + this.f15569g) * 31;
        String str2 = this.f15570h;
        int hashCode4 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C6657f fVar = this.f15571i;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileViewTvItem(avatar=");
        sb.append(this.f15563a);
        sb.append(", label=");
        sb.append(this.f15564b);
        sb.append(", onClick=");
        sb.append(this.f15565c);
        sb.append(", isEditMode=");
        sb.append(this.f15566d);
        sb.append(", isSelectedProfile=");
        sb.append(this.f15567e);
        sb.append(", size=");
        sb.append(this.f15568f);
        sb.append(", startMargin=");
        sb.append(this.f15569g);
        sb.append(", contentDescriptionItem=");
        sb.append(this.f15570h);
        sb.append(", avatarImages=");
        sb.append(this.f15571i);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C7008j(C6653e eVar, String str, Function0 function0, boolean z, boolean z2, int i, int i2, String str2, C6657f fVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : eVar, (i3 & 2) != 0 ? C5880u.m18936a(C7949h.create_profile_add_profile) : str, function0, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, i, i2, str2, fVar);
    }

    /* renamed from: a */
    private final int m21303a() {
        return C7948g.profile_tv_item;
    }

    /* renamed from: a */
    public final View mo19769a(ViewGroup viewGroup, int i) {
        int i2 = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(m21303a(), viewGroup, false);
        m21306a(inflate, this.f15563a);
        TextView textView = (TextView) inflate.findViewById(C7946e.labelTextView);
        Intrinsics.checkReturnedValueIsNotNull((Object) textView, "labelTextView");
        textView.setText(this.f15564b);
        ImageView imageView = (ImageView) inflate.findViewById(C7946e.editButton);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, "editButton");
        if (!this.f15566d) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C7946e.profileViewItemContainer);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, "profileViewItemContainer");
        constraintLayout.setContentDescription(this.f15570h);
        inflate.setOnClickListener(new C7009a(this, i));
        m21305a(inflate, i);
        if (this.f15567e) {
            inflate.post(new C7010b(inflate));
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "LayoutInflater\n        .…equestFocus() }\n        }");
        return inflate;
    }

    /* renamed from: a */
    private final void m21305a(View view, int i) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C7946e.profileViewItemContainer);
        String str = "profileViewItemContainer";
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout, str);
        constraintLayout.setTranslationY(20.0f);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(C7946e.profileViewItemContainer);
        Intrinsics.checkReturnedValueIsNotNull((Object) constraintLayout2, str);
        constraintLayout2.setAlpha(0.0f);
        view.setOnFocusChangeListener(new C7011c(view));
        ((ConstraintLayout) view.findViewById(C7946e.profileViewItemContainer)).animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(((long) i) * 50).translationY(0.0f).alpha(1.0f).start();
    }

    /* renamed from: a */
    private final void m21306a(View view, C6653e eVar) {
        ImageView imageView = (ImageView) view.findViewById(C7946e.avatarImageView);
        String str = "avatarImageView";
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView, str);
        ImageView imageView2 = (ImageView) view.findViewById(C7946e.avatarImageView);
        Intrinsics.checkReturnedValueIsNotNull((Object) imageView2, str);
        LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            int i = this.f15568f;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            int i2 = this.f15569g;
            int i3 = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i4 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i4;
            imageView.setLayoutParams(marginLayoutParams);
            if (eVar != null) {
                this.f15571i.mo19349a((ImageView) view.findViewById(C7946e.avatarImageView), eVar);
                return;
            }
            return;
        }
        throw new C13142s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
