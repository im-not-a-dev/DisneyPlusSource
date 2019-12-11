package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
/* compiled from: StateListAnimator */
public final class C10317f {

    /* renamed from: a */
    private final ArrayList<C10319b> f24442a = new ArrayList<>();

    /* renamed from: b */
    private C10319b f24443b = null;

    /* renamed from: c */
    ValueAnimator f24444c = null;

    /* renamed from: d */
    private final AnimatorListener f24445d = new C10318a();

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: StateListAnimator */
    class C10318a extends AnimatorListenerAdapter {
        C10318a() {
        }

        public void onAnimationEnd(Animator animator) {
            C10317f fVar = C10317f.this;
            if (fVar.f24444c == animator) {
                fVar.f24444c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: StateListAnimator */
    static class C10319b {

        /* renamed from: a */
        final int[] f24447a;

        /* renamed from: b */
        final ValueAnimator f24448b;

        C10319b(int[] iArr, ValueAnimator valueAnimator) {
            this.f24447a = iArr;
            this.f24448b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m32547b() {
        ValueAnimator valueAnimator = this.f24444c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24444c = null;
        }
    }

    /* renamed from: a */
    public void mo26852a(int[] iArr, ValueAnimator valueAnimator) {
        C10319b bVar = new C10319b(iArr, valueAnimator);
        valueAnimator.addListener(this.f24445d);
        this.f24442a.add(bVar);
    }

    /* renamed from: a */
    public void mo26851a(int[] iArr) {
        C10319b bVar;
        int size = this.f24442a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = (C10319b) this.f24442a.get(i);
            if (StateSet.stateSetMatches(bVar.f24447a, iArr)) {
                break;
            }
            i++;
        }
        C10319b bVar2 = this.f24443b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m32547b();
            }
            this.f24443b = bVar;
            if (bVar != null) {
                m32546a(bVar);
            }
        }
    }

    /* renamed from: a */
    private void m32546a(C10319b bVar) {
        this.f24444c = bVar.f24448b;
        this.f24444c.start();
    }

    /* renamed from: a */
    public void mo26850a() {
        ValueAnimator valueAnimator = this.f24444c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f24444c = null;
        }
    }
}
