package p163g.p449j.p450a.p468b.p472o;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11489b;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11490c;
import p163g.p449j.p450a.p468b.p472o.C11487d.C11492e;

/* renamed from: g.j.a.b.o.a */
/* compiled from: CircularRevealCompat */
public final class C11482a {

    /* renamed from: g.j.a.b.o.a$a */
    /* compiled from: CircularRevealCompat */
    static class C11483a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11487d f26868a;

        C11483a(C11487d dVar) {
            this.f26868a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f26868a.mo29376b();
        }

        public void onAnimationStart(Animator animator) {
            this.f26868a.mo29375a();
        }
    }

    /* renamed from: a */
    public static Animator m37052a(C11487d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C11490c.f26873a, C11489b.f26871b, new C11492e[]{new C11492e(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C11492e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f26877c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a */
    public static AnimatorListener m37051a(C11487d dVar) {
        return new C11483a(dVar);
    }
}
