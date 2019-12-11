package com.bamtechmedia.dominguez.profiles.p271y1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.List;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13180m;
import p096e.p121h.p135s.C4121a0;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7947f;
import p163g.p201e.p203b.p330z.C7948g;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0014\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/profiles/picker/ProfilesViewItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "profiles", "", "Lcom/bamtechmedia/dominguez/profiles/picker/ProfilePickerViewItem;", "(Ljava/util/List;)V", "positionInGrid", "", "getProfiles", "()Ljava/util/List;", "viewPropertyAnimator", "Landroid/view/ViewPropertyAnimator;", "views", "Landroid/view/View;", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/ViewHolder;", "position", "component1", "copy", "equals", "", "other", "", "getLayout", "hashCode", "quitAnimation", "onEndAnimation", "Lkotlin/Function0;", "toString", "", "unbind", "holder", "profiles_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.profiles.y1.l */
/* compiled from: ProfileViewItem.kt */
public final class C7016l extends C11866a {

    /* renamed from: U */
    private ViewPropertyAnimator f15585U;

    /* renamed from: V */
    private int f15586V;

    /* renamed from: W */
    private final List<C7005h> f15587W;

    /* renamed from: c */
    private List<? extends View> f15588c;

    /* renamed from: com.bamtechmedia.dominguez.profiles.y1.l$a */
    /* compiled from: ProfileViewItem.kt */
    public static final class C7017a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f15589a;

        /* renamed from: b */
        final /* synthetic */ List f15590b;

        /* renamed from: c */
        final /* synthetic */ Function0 f15591c;

        C7017a(int i, List list, C7016l lVar, Function0 function0) {
            this.f15589a = i;
            this.f15590b = list;
            this.f15591c = function0;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f15590b.size() - 1 == this.f15589a) {
                this.f15591c.invoke();
            }
        }
    }

    public C7016l(List<? extends C7005h> list) {
        this.f15587W = list;
    }

    /* renamed from: a */
    public void unbind(C11867b bVar) {
        ViewPropertyAnimator viewPropertyAnimator = this.f15585U;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        super.unbind(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.f15587W, (java.lang.Object) ((com.bamtechmedia.dominguez.profiles.p271y1.C7016l) r2).f15587W) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtechmedia.dominguez.profiles.p271y1.C7016l
            if (r0 == 0) goto L_0x0013
            com.bamtechmedia.dominguez.profiles.y1.l r2 = (com.bamtechmedia.dominguez.profiles.p271y1.C7016l) r2
            java.util.List<com.bamtechmedia.dominguez.profiles.y1.h> r0 = r1.f15587W
            java.util.List<com.bamtechmedia.dominguez.profiles.y1.h> r2 = r2.f15587W
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p271y1.C7016l.equals(java.lang.Object):boolean");
    }

    public int getLayout() {
        return C7948g.item_profiles_picker;
    }

    public int hashCode() {
        List<C7005h> list = this.f15587W;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfilesViewItem(profiles=");
        sb.append(this.f15587W);
        sb.append(")");
        return sb.toString();
    }

    public void bind(C11867b bVar, int i) {
        View view = bVar.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "viewHolder.itemView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C7946e.profilesPickerLayout);
        Context context = linearLayout.getContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) context, "context");
        linearLayout.setGravity(C5837i.m18842d(context) ? 17 : 8388611);
        this.f15586V = linearLayout.getResources().getInteger(C7947f.profile_picker_column) * i;
        linearLayout.removeAllViews();
        int i2 = 0;
        for (Object next : this.f15587W) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C7005h hVar = (C7005h) next;
                Intrinsics.checkReturnedValueIsNotNull((Object) linearLayout, "this");
                View a = hVar.mo19726a(linearLayout);
                a.setTranslationY(20.0f);
                a.setAlpha(0.0f);
                linearLayout.addView(a);
                a.animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(((long) (this.f15586V + i2)) * 50).translationY(0.0f).alpha(1.0f).start();
                this.f15585U = a.animate();
                i2 = i3;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        this.f15588c = C12788p.m39999g(C4121a0.m14117a(linearLayout));
    }

    /* renamed from: a */
    public final void mo19782a(Function0<C13145v> function0) {
        List<? extends View> list = this.f15588c;
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ((View) next).animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(((long) (this.f15586V + i)) * 50).translationY(20.0f).alpha(0.0f).setListener(new C7017a(i, list, this, function0)).start();
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
            return;
        }
        C13145v vVar = (C13145v) function0.invoke();
    }
}
