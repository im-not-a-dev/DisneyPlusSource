package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import p163g.p449j.p450a.p468b.p469l.C11468a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0443c<V> {

    /* renamed from: a */
    private int f24149a = 0;

    /* renamed from: b */
    private int f24150b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewPropertyAnimator f24151c;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C10275a extends AnimatorListenerAdapter {
        C10275a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f24151c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26383b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f24151c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f24150b = 2;
        m32132a(v, 0, 225, C11468a.f26818d);
    }

    /* renamed from: b */
    public boolean mo2537b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    /* renamed from: a */
    public boolean mo2526a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f24149a = v.getMeasuredHeight();
        return super.mo2526a(coordinatorLayout, v, i);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f24150b != 1 && i2 > 0) {
            mo26382a(v);
        } else if (this.f24150b != 2 && i2 < 0) {
            mo26383b(v);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26382a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f24151c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f24150b = 1;
        m32132a(v, this.f24149a, 175, C11468a.f26817c);
    }

    /* renamed from: a */
    private void m32132a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f24151c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C10275a());
    }
}
