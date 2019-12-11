package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f24651b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C10357a extends AnimatorListenerAdapter {
        C10357a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f24651b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo27093b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27090a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f24651b != null;
        if (z3) {
            this.f24651b.cancel();
        }
        this.f24651b = mo27093b(view, view2, z, z3);
        this.f24651b.addListener(new C10357a());
        this.f24651b.start();
        if (!z2) {
            this.f24651b.end();
        }
        return true;
    }
}
