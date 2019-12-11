package com.bamtechmedia.dominguez.core.p084g.p085c;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.g.c.b */
/* compiled from: FadeInOutItemAnimator.kt */
public final class C3821b extends C3808a {

    /* renamed from: t */
    private final Interpolator f9502t;

    /* renamed from: u */
    private final Interpolator f9503u;

    public /* synthetic */ C3821b(Interpolator interpolator, Interpolator interpolator2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interpolator, (i & 2) != 0 ? interpolator : interpolator2, j, (i & 8) != 0 ? j : j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo13716t(C0794d0 d0Var) {
        d0Var.itemView.animate().alpha(1.0f).setDuration(mo4665c()).setInterpolator(this.f9502t).setStartDelay(0).setListener(new C3811c(d0Var)).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo13717u(C0794d0 d0Var) {
        d0Var.itemView.animate().alpha(0.0f).setDuration(mo4671f()).setInterpolator(this.f9503u).setStartDelay(0).setListener(new C3812d(d0Var)).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo13718v(C0794d0 d0Var) {
        View view = d0Var.itemView;
        Intrinsics.checkReturnedValueIsNotNull((Object) view, "holder.itemView");
        view.setAlpha(0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo13719w(C0794d0 d0Var) {
    }

    public C3821b(Interpolator interpolator, Interpolator interpolator2, long j, long j2) {
        this.f9502t = interpolator;
        this.f9503u = interpolator2;
        mo4654a(j);
        mo4662b(j2);
    }
}
