package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C10320g;
import p163g.p449j.p450a.p468b.C11458b;
import p163g.p449j.p450a.p468b.C11463g;

/* renamed from: com.google.android.material.appbar.e */
/* compiled from: ViewUtilsLollipop */
class C10274e {

    /* renamed from: a */
    private static final int[] f24148a = {16843848};

    /* renamed from: a */
    static void m32128a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m32130a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray c = C10320g.m32558c(context, attributeSet, f24148a, i, i2, new int[0]);
        try {
            if (c.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, c.getResourceId(0, 0)));
            }
        } finally {
            c.recycle();
        }
    }

    /* renamed from: a */
    static void m32129a(View view, float f) {
        int integer = view.getResources().getInteger(C11463g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C11458b.state_liftable, -C11458b.state_lifted}, ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
