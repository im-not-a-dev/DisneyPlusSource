package com.bamtechmedia.dominguez.core.p084g;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010+\u001a\u00020,*\u00020-2\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u00012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u00104\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u00020\u00012\b\b\u0002\u00109\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\u00072\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020=2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020,0?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020,0?2\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020,0B¢\u0006\u0002\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006E"}, mo31007d2 = {"ALPHA_60", "", "ALPHA_70", "ALPHA_INVISIBLE", "ALPHA_VISIBLE", "ANGLE90", "DURATION0", "", "DURATION05", "DURATION1", "DURATION100", "DURATION15", "DURATION150", "DURATION19", "DURATION2", "DURATION25", "DURATION3", "DURATION35", "DURATION4", "DURATION5", "DURATION6", "DURATION7", "DURATION75", "DURATION91", "DURATION96", "PIVOT_HALF", "SCALE_DOWN_60", "SCALE_DOWN_90", "SCALE_DOWN_92", "SCALE_DOWN_97", "SCALE_DOWN_98", "SCALE_ORIGIN", "SCALE_UP_02", "SCALE_UP_06", "SCALE_UP_10", "TRANSLATE10", "TRANSLATE120", "TRANSLATE20", "TRANSLATE30", "TRANSLATE4", "TRANSLATE40", "TRANSLATE48", "TRANSLATE_ORIGIN", "animate", "", "Landroid/view/View;", "fromAlpha", "toAlpha", "fromScale", "toScale", "fromPivotY", "fromPivotX", "fromTranslationY", "toTranslationY", "fromTranslationX", "toTranslationX", "fromTranslationZ", "toTranslationZ", "duration", "startDelay", "interpolator", "Landroid/animation/TimeInterpolator;", "withStartAction", "Lkotlin/Function0;", "withEndAction", "updateListener", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "(Landroid/view/View;FFFFLjava/lang/Float;Ljava/lang/Float;FFFFFFJJLandroid/animation/TimeInterpolator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "core-utils_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.core.g.a */
/* compiled from: AnimationHelper.kt */
public final class C3800a {

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$a */
    /* compiled from: AnimationHelper.kt */
    static final class C3801a extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C3801a f9445c = new C3801a();

        C3801a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$b */
    /* compiled from: AnimationHelper.kt */
    static final class C3802b extends C12881k implements Function0<C13145v> {

        /* renamed from: c */
        public static final C3802b f9446c = new C3802b();

        C3802b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$c */
    /* compiled from: AnimationHelper.kt */
    static final class C3803c extends C12881k implements Function1<ValueAnimator, C13145v> {

        /* renamed from: c */
        public static final C3803c f9447c = new C3803c();

        C3803c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo13704a(ValueAnimator valueAnimator) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13704a((ValueAnimator) obj);
            return C13145v.f29587a;
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$d */
    /* compiled from: AnimationHelper.kt */
    static final class C3804d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Function0 f9448c;

        C3804d(Function0 function0) {
            this.f9448c = function0;
        }

        public final void run() {
            this.f9448c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$e */
    /* compiled from: AnimationHelper.kt */
    static final class C3805e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Function0 f9449c;

        C3805e(Function0 function0) {
            this.f9449c = function0;
        }

        public final void run() {
            this.f9449c.invoke();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.core.g.a$f */
    /* compiled from: AnimationHelper.kt */
    static final class C3806f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Function1 f9450a;

        C3806f(Function1 function1) {
            this.f9450a = function1;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Function1 function1 = this.f9450a;
            C12880j.m40222a((Object) valueAnimator, "it");
            function1.invoke(valueAnimator);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m12829a(View view, float f, float f2, float f3, float f4, Float f5, Float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j, long j2, TimeInterpolator timeInterpolator, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        int i2 = i;
        float f13 = 1.0f;
        float f14 = (i2 & 1) != 0 ? 1.0f : f;
        float f15 = (i2 & 2) != 0 ? 1.0f : f2;
        float f16 = (i2 & 4) != 0 ? 1.0f : f3;
        if ((i2 & 8) == 0) {
            f13 = f4;
        }
        Float f17 = null;
        Float f18 = (i2 & 16) != 0 ? null : f5;
        if ((i2 & 32) == 0) {
            f17 = f6;
        }
        float f19 = 0.0f;
        float f20 = (i2 & 64) != 0 ? 0.0f : f7;
        float f21 = (i2 & 128) != 0 ? 0.0f : f8;
        float f22 = (i2 & 256) != 0 ? 0.0f : f9;
        float f23 = (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? 0.0f : f10;
        float f24 = (i2 & 1024) != 0 ? 0.0f : f11;
        if ((i2 & DateUtils.FORMAT_NO_MIDNIGHT) == 0) {
            f19 = f12;
        }
        m12828a(view, f14, f15, f16, f13, f18, f17, f20, f21, f22, f23, f24, f19, (i2 & 4096) != 0 ? 200 : j, (i2 & ContentServiceClientExtras.URL_SIZE_LIMIT) != 0 ? 0 : j2, (i2 & DateUtils.FORMAT_ABBREV_TIME) != 0 ? new DecelerateInterpolator() : timeInterpolator, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? C3801a.f9445c : function0, (i2 & DateUtils.FORMAT_ABBREV_MONTH) != 0 ? C3802b.f9446c : function02, (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? C3803c.f9447c : function1);
    }

    /* renamed from: a */
    public static final void m12828a(View view, float f, float f2, float f3, float f4, Float f5, Float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j, long j2, TimeInterpolator timeInterpolator, Function0<C13145v> function0, Function0<C13145v> function02, Function1<? super ValueAnimator, C13145v> function1) {
        View view2 = view;
        float f13 = f2;
        float f14 = f3;
        float f15 = f4;
        float f16 = f7;
        float f17 = f8;
        float f18 = f9;
        float f19 = f10;
        float f20 = f11;
        float f21 = f12;
        if (!(f == 1.0f && f13 == 1.0f)) {
            view.setAlpha(f);
        }
        if (!(f14 == 1.0f && f15 == 1.0f)) {
            view.setScaleY(f3);
            view.setScaleX(f3);
        }
        if (!(f5 == null && f6 == null)) {
            view.setPivotY(f5 != null ? f5.floatValue() : 0.0f);
            view.setPivotX(f6 != null ? f6.floatValue() : 0.0f);
        }
        if (!(f16 == 0.0f && f17 == 0.0f)) {
            view.setTranslationY(f16);
        }
        if (!(f18 == 0.0f && f19 == 0.0f)) {
            view.setTranslationX(f18);
        }
        if (!(f20 == 0.0f && f21 == 0.0f)) {
            view.setTranslationZ(f20);
        }
        view.animate().setInterpolator(timeInterpolator).alpha(f2).scaleY(f15).scaleX(f15).translationY(f17).translationX(f19).translationZ(f21).setStartDelay(j2).setDuration(j).withStartAction(new C3804d(function0)).withEndAction(new C3805e(function02)).setUpdateListener(new C3806f(function1)).start();
    }
}
