package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionValues;
import android.view.View;
import p096e.p146l.C4228f;

/* renamed from: androidx.leanback.transition.a */
/* compiled from: TranslationAnimationCreator */
class C0604a {

    /* renamed from: androidx.leanback.transition.a$a */
    /* compiled from: TranslationAnimationCreator */
    private static class C0605a extends AnimatorListenerAdapter implements TransitionListener {

        /* renamed from: a */
        private final View f2558a;

        /* renamed from: b */
        private final View f2559b;

        /* renamed from: c */
        private final int f2560c;

        /* renamed from: d */
        private final int f2561d;

        /* renamed from: e */
        private int[] f2562e = ((int[]) this.f2558a.getTag(C4228f.transitionPosition));

        /* renamed from: f */
        private float f2563f;

        /* renamed from: g */
        private float f2564g;

        /* renamed from: h */
        private final float f2565h;

        /* renamed from: i */
        private final float f2566i;

        C0605a(View view, View view2, int i, int i2, float f, float f2) {
            this.f2559b = view;
            this.f2558a = view2;
            this.f2560c = i - Math.round(this.f2559b.getTranslationX());
            this.f2561d = i2 - Math.round(this.f2559b.getTranslationY());
            this.f2565h = f;
            this.f2566i = f2;
            if (this.f2562e != null) {
                this.f2558a.setTag(C4228f.transitionPosition, null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2562e == null) {
                this.f2562e = new int[2];
            }
            this.f2562e[0] = Math.round(((float) this.f2560c) + this.f2559b.getTranslationX());
            this.f2562e[1] = Math.round(((float) this.f2561d) + this.f2559b.getTranslationY());
            this.f2558a.setTag(C4228f.transitionPosition, this.f2562e);
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationPause(Animator animator) {
            this.f2563f = this.f2559b.getTranslationX();
            this.f2564g = this.f2559b.getTranslationY();
            this.f2559b.setTranslationX(this.f2565h);
            this.f2559b.setTranslationY(this.f2566i);
        }

        public void onAnimationResume(Animator animator) {
            this.f2559b.setTranslationX(this.f2563f);
            this.f2559b.setTranslationY(this.f2564g);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2559b.setTranslationX(this.f2565h);
            this.f2559b.setTranslationY(this.f2566i);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    static Animator m3193a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(C4228f.transitionPosition);
        if (iArr != null) {
            f = ((float) (iArr[0] - i)) + translationX;
            f2 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = Math.round(f - translationX) + i;
        int round2 = i2 + Math.round(f2 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        C0605a aVar = new C0605a(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(aVar);
        ofFloat.addListener(aVar);
        ofFloat.addPauseListener(aVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }
}
