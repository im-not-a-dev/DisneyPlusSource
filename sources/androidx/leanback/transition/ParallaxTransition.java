package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.leanback.widget.C0675p;
import p096e.p146l.C4228f;

public class ParallaxTransition extends Visibility {

    /* renamed from: c */
    static Interpolator f2540c = new LinearInterpolator();

    /* renamed from: androidx.leanback.transition.ParallaxTransition$a */
    class C0593a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0675p f2541a;

        C0593a(ParallaxTransition parallaxTransition, C0675p pVar) {
            this.f2541a = pVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2541a.mo3992a();
        }
    }

    public ParallaxTransition() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Animator mo3385a(View view) {
        C0675p pVar = (C0675p) view.getTag(C4228f.lb_parallax_source);
        if (pVar == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(f2540c);
        ofFloat.addUpdateListener(new C0593a(this, pVar));
        return ofFloat;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return mo3385a(view);
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return mo3385a(view);
    }

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
