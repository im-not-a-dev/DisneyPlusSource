package com.bamtechmedia.dominguez.core.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a0\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a8\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u000e"}, mo31007d2 = {"getFadeInAnimator", "Landroid/animation/ValueAnimator;", "Landroid/view/View;", "duration", "", "startDelay", "startAlpha", "", "interpolator", "Landroid/view/animation/Interpolator;", "getFadeOutAnimator", "getTranslateYAnimator", "toTranslationY", "fromTranslationY", "core-utils_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.utils.m0 */
/* compiled from: ViewAnimatorExt.kt */
public final class C5846m0 {

    /* renamed from: com.bamtechmedia.dominguez.core.utils.m0$a */
    /* compiled from: ViewAnimatorExt.kt */
    static final class C5847a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f13628a;

        C5847a(View view, Interpolator interpolator, long j, long j2) {
            this.f13628a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f13628a;
            C12880j.m40222a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.m0$b */
    /* compiled from: ViewAnimatorExt.kt */
    static final class C5848b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f13629a;

        C5848b(View view, Interpolator interpolator, long j, long j2) {
            this.f13629a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f13629a;
            C12880j.m40222a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.utils.m0$c */
    /* compiled from: ViewAnimatorExt.kt */
    static final class C5849c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f13630a;

        C5849c(View view, Interpolator interpolator, long j, long j2) {
            this.f13630a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f13630a;
            C12880j.m40222a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new C13142s("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ ValueAnimator m18870a(View view, long j, long j2, float f, Interpolator interpolator, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            f = view.getAlpha();
        }
        float f2 = f;
        if ((i & 8) != 0) {
            interpolator = new LinearInterpolator();
        }
        return m18869a(view, j, j3, f2, interpolator);
    }

    /* renamed from: b */
    public static /* synthetic */ ValueAnimator m18872b(View view, long j, long j2, float f, Interpolator interpolator, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            f = view.getAlpha();
        }
        float f2 = f;
        if ((i & 8) != 0) {
            interpolator = new LinearInterpolator();
        }
        return m18871b(view, j, j3, f2, interpolator);
    }

    /* renamed from: a */
    public static final ValueAnimator m18869a(View view, long j, long j2, float f, Interpolator interpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 1.0f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        C5847a aVar = new C5847a(view, interpolator, j, j2);
        ofFloat.addUpdateListener(aVar);
        C12880j.m40222a((Object) ofFloat, "ValueAnimator.ofFloat(st… as Float\n        }\n    }");
        return ofFloat;
    }

    /* renamed from: b */
    public static final ValueAnimator m18871b(View view, long j, long j2, float f, Interpolator interpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        C5848b bVar = new C5848b(view, interpolator, j, j2);
        ofFloat.addUpdateListener(bVar);
        C12880j.m40222a((Object) ofFloat, "ValueAnimator.ofFloat(st… as Float\n        }\n    }");
        return ofFloat;
    }

    /* renamed from: a */
    public static /* synthetic */ ValueAnimator m18868a(View view, float f, long j, long j2, float f2, Interpolator interpolator, int i, Object obj) {
        return m18867a(view, f, j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? view.getTranslationY() : f2, (i & 16) != 0 ? new LinearInterpolator() : interpolator);
    }

    /* renamed from: a */
    public static final ValueAnimator m18867a(View view, float f, long j, long j2, float f2, Interpolator interpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        C12880j.m40222a((Object) ofFloat, "it");
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        C5849c cVar = new C5849c(view, interpolator, j, j2);
        ofFloat.addUpdateListener(cVar);
        C12880j.m40222a((Object) ofFloat, "ValueAnimator.ofFloat(fr… as Float\n        }\n    }");
        return ofFloat;
    }
}
