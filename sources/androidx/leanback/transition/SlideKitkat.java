package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import p096e.p146l.C4228f;
import p096e.p146l.C4234l;

class SlideKitkat extends Visibility {

    /* renamed from: U */
    private static final TimeInterpolator f2542U = new DecelerateInterpolator();

    /* renamed from: V */
    private static final TimeInterpolator f2543V = new AccelerateInterpolator();

    /* renamed from: W */
    private static final C0600g f2544W = new C0594a();

    /* renamed from: X */
    private static final C0600g f2545X = new C0595b();

    /* renamed from: Y */
    private static final C0600g f2546Y = new C0596c();

    /* renamed from: Z */
    private static final C0600g f2547Z = new C0597d();

    /* renamed from: a0 */
    private static final C0600g f2548a0 = new C0598e();

    /* renamed from: b0 */
    private static final C0600g f2549b0 = new C0599f();

    /* renamed from: c */
    private C0600g f2550c;

    /* renamed from: androidx.leanback.transition.SlideKitkat$a */
    static class C0594a extends C0601h {
        C0594a() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            return view.getTranslationX() - ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$b */
    static class C0595b extends C0602i {
        C0595b() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            return view.getTranslationY() - ((float) view.getHeight());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$c */
    static class C0596c extends C0601h {
        C0596c() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$d */
    static class C0597d extends C0602i {
        C0597d() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            return view.getTranslationY() + ((float) view.getHeight());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$e */
    static class C0598e extends C0601h {
        C0598e() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() + ((float) view.getWidth());
            }
            return view.getTranslationX() - ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$f */
    static class C0599f extends C0601h {
        C0599f() {
        }

        /* renamed from: a */
        public float mo3392a(View view) {
            if (view.getLayoutDirection() == 1) {
                return view.getTranslationX() - ((float) view.getWidth());
            }
            return view.getTranslationX() + ((float) view.getWidth());
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$g */
    private interface C0600g {
        /* renamed from: a */
        float mo3392a(View view);

        /* renamed from: b */
        float mo3393b(View view);

        Property<View, Float> getProperty();
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$h */
    private static abstract class C0601h implements C0600g {
        C0601h() {
        }

        /* renamed from: b */
        public float mo3393b(View view) {
            return view.getTranslationX();
        }

        public Property<View, Float> getProperty() {
            return View.TRANSLATION_X;
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$i */
    private static abstract class C0602i implements C0600g {
        C0602i() {
        }

        /* renamed from: b */
        public float mo3393b(View view) {
            return view.getTranslationY();
        }

        public Property<View, Float> getProperty() {
            return View.TRANSLATION_Y;
        }
    }

    /* renamed from: androidx.leanback.transition.SlideKitkat$j */
    private static class C0603j extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2551a = false;

        /* renamed from: b */
        private float f2552b;

        /* renamed from: c */
        private final View f2553c;

        /* renamed from: d */
        private final float f2554d;

        /* renamed from: e */
        private final float f2555e;

        /* renamed from: f */
        private final int f2556f;

        /* renamed from: g */
        private final Property<View, Float> f2557g;

        public C0603j(View view, Property<View, Float> property, float f, float f2, int i) {
            this.f2557g = property;
            this.f2553c = view;
            this.f2555e = f;
            this.f2554d = f2;
            this.f2556f = i;
            view.setVisibility(0);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2553c.setTag(C4228f.lb_slide_transition_value, new float[]{this.f2553c.getTranslationX(), this.f2553c.getTranslationY()});
            this.f2557g.set(this.f2553c, Float.valueOf(this.f2555e));
            this.f2551a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2551a) {
                this.f2557g.set(this.f2553c, Float.valueOf(this.f2555e));
            }
            this.f2553c.setVisibility(this.f2556f);
        }

        public void onAnimationPause(Animator animator) {
            this.f2552b = ((Float) this.f2557g.get(this.f2553c)).floatValue();
            this.f2557g.set(this.f2553c, Float.valueOf(this.f2554d));
            this.f2553c.setVisibility(this.f2556f);
        }

        public void onAnimationResume(Animator animator) {
            this.f2557g.set(this.f2553c, Float.valueOf(this.f2552b));
            this.f2553c.setVisibility(0);
        }
    }

    public SlideKitkat() {
        mo3389a(80);
    }

    /* renamed from: a */
    public void mo3389a(int i) {
        if (i == 3) {
            this.f2550c = f2544W;
        } else if (i == 5) {
            this.f2550c = f2546Y;
        } else if (i == 48) {
            this.f2550c = f2545X;
        } else if (i == 80) {
            this.f2550c = f2547Z;
        } else if (i == 8388611) {
            this.f2550c = f2548a0;
        } else if (i == 8388613) {
            this.f2550c = f2549b0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
    }

    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f2550c.mo3393b(view);
        return m3181a(view, this.f2550c.getProperty(), this.f2550c.mo3392a(view), b, b, f2542U, 0);
    }

    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b = this.f2550c.mo3393b(view);
        return m3181a(view, this.f2550c.getProperty(), b, this.f2550c.mo3392a(view), b, f2543V, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbSlide);
        mo3389a(obtainStyledAttributes.getInt(C4234l.lbSlide_lb_slideEdge, 80));
        long j = (long) obtainStyledAttributes.getInt(C4234l.lbSlide_android_duration, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = (long) obtainStyledAttributes.getInt(C4234l.lbSlide_android_startDelay, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C4234l.lbSlide_android_interpolator, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animator m3181a(View view, Property<View, Float> property, float f, float f2, float f3, TimeInterpolator timeInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(C4228f.lb_slide_transition_value);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(C4228f.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{f, f2});
        C0603j jVar = new C0603j(view, property, f3, f2, i);
        ofFloat.addListener(jVar);
        ofFloat.addPauseListener(jVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }
}
