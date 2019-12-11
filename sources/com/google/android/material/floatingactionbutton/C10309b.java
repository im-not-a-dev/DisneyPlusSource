package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.material.internal.C10322i;
import java.util.ArrayList;
import p163g.p449j.p450a.p468b.p478t.C11503a;
import p163g.p449j.p450a.p468b.p479u.C11504a;
import p163g.p449j.p450a.p468b.p479u.C11505b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: FloatingActionButtonImplLollipop */
class C10309b extends C10299a {

    /* renamed from: I */
    private InsetDrawable f24369I;

    C10309b(C10322i iVar, C11505b bVar) {
        super(iVar, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26757a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f24348u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C10299a.f24321C, m32480a(f, f3));
            stateListAnimator.addState(C10299a.f24322D, m32480a(f, f2));
            stateListAnimator.addState(C10299a.f24323E, m32480a(f, f2));
            stateListAnimator.addState(C10299a.f24324F, m32480a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f24348u, "elevation", new float[]{f}).setDuration(0));
            int i = VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                C10322i iVar = this.f24348u;
                arrayList.add(ObjectAnimator.ofFloat(iVar, View.TRANSLATION_Z, new float[]{iVar.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f24348u, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C10299a.f24320B);
            stateListAnimator.addState(C10299a.f24325G, animatorSet);
            stateListAnimator.addState(C10299a.f24326H, m32480a(0.0f, 0.0f));
            this.f24348u.setStateListAnimator(stateListAnimator);
        }
        if (this.f24349v.mo26753a()) {
            mo26789p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26768b(ColorStateList colorStateList) {
        Drawable drawable = this.f24338k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C11503a.m37104a(colorStateList));
        } else {
            super.mo26768b(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo26782i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo26784k() {
        mo26789p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo26787n() {
        return false;
    }

    /* renamed from: b */
    public float mo26765b() {
        return this.f24348u.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26769b(Rect rect) {
        if (this.f24349v.mo26753a()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f24338k, rect.left, rect.top, rect.right, rect.bottom);
            this.f24369I = insetDrawable;
            this.f24349v.mo26752a(this.f24369I);
            return;
        }
        this.f24349v.mo26752a(this.f24338k);
    }

    /* renamed from: a */
    private Animator m32480a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f24348u, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f24348u, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C10299a.f24320B);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26764a(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f24348u.isEnabled()) {
            this.f24348u.setElevation(this.f24341n);
            if (this.f24348u.isPressed()) {
                this.f24348u.setTranslationZ(this.f24343p);
            } else if (this.f24348u.isFocused() || this.f24348u.isHovered()) {
                this.f24348u.setTranslationZ(this.f24342o);
            } else {
                this.f24348u.setTranslationZ(0.0f);
            }
        } else {
            this.f24348u.setElevation(0.0f);
            this.f24348u.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26761a(Rect rect) {
        if (this.f24349v.mo26753a()) {
            float b = this.f24349v.mo26754b();
            float b2 = mo26765b() + this.f24343p;
            int ceil = (int) Math.ceil((double) C11504a.m37105a(b2, b, false));
            int ceil2 = (int) Math.ceil((double) C11504a.m37106b(b2, b, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
