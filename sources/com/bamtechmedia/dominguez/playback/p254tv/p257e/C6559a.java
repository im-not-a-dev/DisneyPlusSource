package com.bamtechmedia.dominguez.playback.p254tv.p257e;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C0425d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0845e;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0802l.C0805c;
import com.bamtechmedia.dominguez.playback.C6325d;
import com.bamtechmedia.dominguez.playback.C6327f;
import com.bamtechmedia.dominguez.playback.C6328g;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p096e.p154p.C4267c;
import p096e.p154p.C4317o;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0006H\u0016J.\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/tv/tracks/TvAudioAndSubtitlesItemAnimator;", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "()V", "animateChange", "", "oldHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "newHolder", "preInfo", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;", "postInfo", "canReuseUpdatedViewHolder", "viewHolder", "payloads", "", "", "recordPostLayoutInformation", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "recordPreLayoutInformation", "changeFlags", "", "setCheckmarkStartMargin", "", "trackTvLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "expand", "AudioAndSubtitlesItemHolderInfo", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.tv.e.a */
/* compiled from: TvAudioAndSubtitlesItemAnimator.kt */
public final class C6559a extends C0845e {

    /* renamed from: com.bamtechmedia.dominguez.playback.tv.e.a$a */
    /* compiled from: TvAudioAndSubtitlesItemAnimator.kt */
    public static final class C6560a extends C0805c {

        /* renamed from: c */
        private boolean f14819c;

        public C6560a() {
            this(false, 1, null);
        }

        public /* synthetic */ C6560a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                z = false;
            }
            this(z);
        }

        /* renamed from: a */
        public final boolean mo19213a() {
            return this.f14819c;
        }

        public C6560a(boolean z) {
            this.f14819c = z;
        }
    }

    /* renamed from: a */
    public boolean mo4657a(C0794d0 d0Var, C0794d0 d0Var2, C0805c cVar, C0805c cVar2) {
        boolean a = ((C6560a) cVar).mo19213a();
        boolean a2 = ((C6560a) cVar2).mo19213a();
        View view = d0Var2.itemView;
        if (view != null) {
            m20417a((ConstraintLayout) view, !a && a2);
            return a != a2;
        }
        throw new C13142s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }

    /* renamed from: a */
    public boolean mo4659a(C0794d0 d0Var, List<Object> list) {
        return true;
    }

    /* renamed from: a */
    private final void m20417a(ConstraintLayout constraintLayout, boolean z) {
        int i;
        C0425d dVar = new C0425d();
        dVar.mo2430c(constraintLayout);
        Context context = constraintLayout.getContext();
        if (z) {
            i = context.getResources().getDimensionPixelSize(C6325d.checkmark_visible_left_margin);
        } else {
            i = context.getResources().getDimensionPixelSize(C6325d.checkmark_invisible_left_margin);
        }
        int i2 = i;
        dVar.mo2411a(C6327f.checkBoxImageView, 6);
        dVar.mo2414a(C6327f.checkBoxImageView, 6, 0, 6, i2);
        C4267c cVar = new C4267c();
        Context context2 = constraintLayout.getContext();
        C12880j.m40222a((Object) context2, "trackTvLayout.context");
        cVar.mo15082a((long) context2.getResources().getInteger(C6328g.duration2_5));
        cVar.mo15083a((TimeInterpolator) new AccelerateDecelerateInterpolator());
        C4317o.m14847a(constraintLayout, cVar);
        dVar.mo2427b(constraintLayout);
    }

    /* renamed from: a */
    public C0805c mo4652a(C0788a0 a0Var, C0794d0 d0Var, int i, List<Object> list) {
        View view = d0Var.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        ImageView imageView = (ImageView) view.findViewById(C6327f.checkBoxImageView);
        C12880j.m40222a((Object) imageView, "viewHolder.itemView.checkBoxImageView");
        return new C6560a(imageView.isSelected());
    }

    /* renamed from: a */
    public C0805c mo4651a(C0788a0 a0Var, C0794d0 d0Var) {
        View view = d0Var.itemView;
        C12880j.m40222a((Object) view, "viewHolder.itemView");
        ImageView imageView = (ImageView) view.findViewById(C6327f.checkBoxImageView);
        C12880j.m40222a((Object) imageView, "viewHolder.itemView.checkBoxImageView");
        return new C6560a(imageView.isSelected());
    }
}
