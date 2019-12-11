package p096e.p154p;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import java.util.ArrayList;

/* renamed from: e.p.a */
/* compiled from: AnimatorUtils */
class C4261a {

    /* renamed from: e.p.a$a */
    /* compiled from: AnimatorUtils */
    interface C4262a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    static void m14654a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    /* renamed from: b */
    static void m14655b(Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C4262a) {
                    ((C4262a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    /* renamed from: a */
    static void m14653a(Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C4262a) {
                    ((C4262a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }
}
