package com.airbnb.lottie.p022w;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.w.a */
/* compiled from: BaseLottieAnimator */
public abstract class C1370a extends ValueAnimator {

    /* renamed from: U */
    private final Set<AnimatorListener> f5032U = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final Set<AnimatorUpdateListener> f5033c = new CopyOnWriteArraySet();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6377a(boolean z) {
        for (AnimatorListener animatorListener : this.f5032U) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(AnimatorListener animatorListener) {
        this.f5032U.add(animatorListener);
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f5033c.add(animatorUpdateListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6381b(boolean z) {
        for (AnimatorListener animatorListener : this.f5032U) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6382c() {
        for (AnimatorUpdateListener onAnimationUpdate : this.f5033c) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f5032U.clear();
    }

    public void removeAllUpdateListeners() {
        this.f5033c.clear();
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.f5032U.remove(animatorListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f5033c.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6376a() {
        for (AnimatorListener onAnimationCancel : this.f5032U) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6380b() {
        for (AnimatorListener onAnimationRepeat : this.f5032U) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }
}
