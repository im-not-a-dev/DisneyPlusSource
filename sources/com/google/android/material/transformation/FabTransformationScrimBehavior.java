package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p163g.p449j.p450a.p468b.p469l.C11469b;
import p163g.p449j.p450a.p468b.p469l.C11476i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C11476i f24666c = new C11476i(75, 150);

    /* renamed from: d */
    private final C11476i f24667d = new C11476i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C10363a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24668a;

        /* renamed from: b */
        final /* synthetic */ View f24669b;

        C10363a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f24668a = z;
            this.f24669b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24668a) {
                this.f24669b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24668a) {
                this.f24669b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: a */
    public boolean mo2531a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: b */
    public boolean mo2535b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2535b(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    private void m32783a(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C11476i iVar = z ? this.f24666c : this.f24667d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo29311a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo27093b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m32783a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C11469b.m36996a(animatorSet, arrayList);
        animatorSet.addListener(new C10363a(this, z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
