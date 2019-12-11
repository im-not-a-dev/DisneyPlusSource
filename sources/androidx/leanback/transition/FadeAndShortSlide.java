package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import p096e.p146l.C4234l;

public class FadeAndShortSlide extends Visibility {

    /* renamed from: X */
    private static final TimeInterpolator f2529X = new DecelerateInterpolator();

    /* renamed from: Y */
    static final C0592g f2530Y = new C0586a();

    /* renamed from: Z */
    static final C0592g f2531Z = new C0587b();

    /* renamed from: a0 */
    static final C0592g f2532a0 = new C0588c();

    /* renamed from: b0 */
    static final C0592g f2533b0 = new C0589d();

    /* renamed from: c0 */
    static final C0592g f2534c0 = new C0590e();

    /* renamed from: U */
    private Visibility f2535U;

    /* renamed from: V */
    private float f2536V;

    /* renamed from: W */
    final C0592g f2537W;

    /* renamed from: c */
    private C0592g f2538c;

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$a */
    static class C0586a extends C0592g {
        C0586a() {
        }

        /* renamed from: a */
        public float mo3383a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + fadeAndShortSlide.mo3372a(viewGroup);
            }
            return view.getTranslationX() - fadeAndShortSlide.mo3372a(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$b */
    static class C0587b extends C0592g {
        C0587b() {
        }

        /* renamed from: a */
        public float mo3383a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - fadeAndShortSlide.mo3372a(viewGroup);
            }
            return view.getTranslationX() + fadeAndShortSlide.mo3372a(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$c */
    static class C0588c extends C0592g {
        C0588c() {
        }

        /* renamed from: a */
        public float mo3383a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i;
            int width = iArr[0] + (view.getWidth() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            if (epicenter == null) {
                i = iArr[0] + (viewGroup.getWidth() / 2);
            } else {
                i = epicenter.centerX();
            }
            if (width < i) {
                return view.getTranslationX() - fadeAndShortSlide.mo3372a(viewGroup);
            }
            return view.getTranslationX() + fadeAndShortSlide.mo3372a(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$d */
    static class C0589d extends C0592g {
        C0589d() {
        }

        /* renamed from: b */
        public float mo3384b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.mo3375b(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$e */
    static class C0590e extends C0592g {
        C0590e() {
        }

        /* renamed from: b */
        public float mo3384b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.mo3375b(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$f */
    class C0591f extends C0592g {
        C0591f() {
        }

        /* renamed from: b */
        public float mo3384b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int i;
            int height = iArr[1] + (view.getHeight() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            if (epicenter == null) {
                i = iArr[1] + (viewGroup.getHeight() / 2);
            } else {
                i = epicenter.centerY();
            }
            if (height < i) {
                return view.getTranslationY() - fadeAndShortSlide.mo3375b(viewGroup);
            }
            return view.getTranslationY() + fadeAndShortSlide.mo3375b(viewGroup);
        }
    }

    /* renamed from: androidx.leanback.transition.FadeAndShortSlide$g */
    private static abstract class C0592g {
        C0592g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public float mo3383a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo3384b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this(8388611);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo3372a(ViewGroup viewGroup) {
        float f = this.f2536V;
        return f >= 0.0f ? f : (float) (viewGroup.getWidth() / 4);
    }

    public Transition addListener(TransitionListener transitionListener) {
        this.f2535U.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo3375b(ViewGroup viewGroup) {
        float f = this.f2536V;
        return f >= 0.0f ? f : (float) (viewGroup.getHeight() / 4);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        this.f2535U.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        m3168a(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        this.f2535U.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        m3168a(transitionValues);
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        TransitionValues transitionValues3 = transitionValues2;
        if (transitionValues3 == null || viewGroup2 == view2) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        View view3 = view;
        TransitionValues transitionValues4 = transitionValues2;
        Animator a = C0604a.m3193a(view3, transitionValues4, i, i2, this.f2538c.mo3383a(this, viewGroup, view2, iArr), this.f2538c.mo3384b(this, viewGroup, view2, iArr), translationX, view.getTranslationY(), f2529X, this);
        Animator onAppear = this.f2535U.onAppear(viewGroup, view2, transitionValues, transitionValues3);
        if (a == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a).with(onAppear);
        return animatorSet;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null || viewGroup2 == view2) {
            return null;
        }
        int[] iArr = (int[]) transitionValues3.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        float a = this.f2538c.mo3383a(this, viewGroup, view2, iArr);
        Animator a2 = C0604a.m3193a(view, transitionValues, i, i2, translationX, view.getTranslationY(), a, this.f2538c.mo3384b(this, viewGroup, view2, iArr), f2529X, this);
        Animator onDisappear = this.f2535U.onDisappear(viewGroup, view2, transitionValues3, transitionValues2);
        if (a2 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(a2).with(onDisappear);
        return animatorSet;
    }

    public Transition removeListener(TransitionListener transitionListener) {
        this.f2535U.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    public void setEpicenterCallback(EpicenterCallback epicenterCallback) {
        this.f2535U.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    public FadeAndShortSlide(int i) {
        this.f2535U = new Fade();
        this.f2536V = -1.0f;
        this.f2537W = new C0591f();
        mo3373a(i);
    }

    /* renamed from: a */
    private void m3168a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f2535U = (Visibility) this.f2535U.clone();
        return fadeAndShortSlide;
    }

    /* renamed from: a */
    public void mo3373a(int i) {
        if (i == 48) {
            this.f2538c = f2534c0;
        } else if (i == 80) {
            this.f2538c = f2533b0;
        } else if (i == 112) {
            this.f2538c = this.f2537W;
        } else if (i == 8388611) {
            this.f2538c = f2530Y;
        } else if (i == 8388613) {
            this.f2538c = f2531Z;
        } else if (i == 8388615) {
            this.f2538c = f2532a0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2535U = new Fade();
        this.f2536V = -1.0f;
        this.f2537W = new C0591f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbSlide);
        mo3373a(obtainStyledAttributes.getInt(C4234l.lbSlide_lb_slideEdge, 8388611));
        obtainStyledAttributes.recycle();
    }
}
