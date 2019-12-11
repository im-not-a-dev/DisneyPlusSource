package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0194e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0442b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import androidx.core.graphics.drawable.C0492a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p135s.C4187x;
import p096e.p140j.p141a.C4204a;
import p163g.p449j.p450a.p468b.p469l.C11468a;
import p163g.p449j.p450a.p468b.p480v.C11507b;

public class BottomAppBar extends Toolbar implements C0442b {

    /* renamed from: L0 */
    private final int f24169L0;

    /* renamed from: M0 */
    private final C11507b f24170M0;

    /* renamed from: N0 */
    private final C10284a f24171N0;

    /* renamed from: O0 */
    private Animator f24172O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public Animator f24173P0;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public Animator f24174Q0;

    /* renamed from: R0 */
    private int f24175R0;

    /* renamed from: S0 */
    private boolean f24176S0;

    /* renamed from: T0 */
    private boolean f24177T0;

    /* renamed from: U0 */
    AnimatorListenerAdapter f24178U0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d */
        private final Rect f24179d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private boolean m32182a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((C0446f) floatingActionButton.getLayoutParams()).f2031d = 17;
            bottomAppBar.m32168a(floatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26383b(BottomAppBar bottomAppBar) {
            super.mo26383b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m32178m();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C11468a.f26818d).setDuration(225);
            }
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton a = bottomAppBar.m32178m();
            if (a != null) {
                m32182a(a, bottomAppBar);
                a.mo26693b(this.f24179d);
                bottomAppBar.setFabDiameter(this.f24179d.height());
            }
            if (bottomAppBar.m32179n()) {
                coordinatorLayout.mo2480c((View) bottomAppBar, i);
                return super.mo2526a(coordinatorLayout, bottomAppBar, i);
            }
            BottomAppBar.m32175c(bottomAppBar);
            throw null;
        }

        /* renamed from: a */
        public boolean mo2538b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2538b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26382a(BottomAppBar bottomAppBar) {
            super.mo26382a(bottomAppBar);
            FloatingActionButton a = bottomAppBar.m32178m();
            if (a != null) {
                a.mo26691a(this.f24179d);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f24179d.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C11468a.f26817c).setDuration(175);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C10279a extends AnimatorListenerAdapter {
        C10279a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f24173P0 = null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C10280b extends AnimatorListenerAdapter {
        C10280b() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.f24174Q0 = null;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C10281c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f24182a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f24183b;

        /* renamed from: c */
        final /* synthetic */ int f24184c;

        /* renamed from: d */
        final /* synthetic */ boolean f24185d;

        C10281c(ActionMenuView actionMenuView, int i, boolean z) {
            this.f24183b = actionMenuView;
            this.f24184c = i;
            this.f24185d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f24182a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24182a) {
                BottomAppBar.this.m32165a(this.f24183b, this.f24184c, this.f24185d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    static class C10282d extends C4204a {
        public static final Creator<C10282d> CREATOR = new C10283a();

        /* renamed from: V */
        int f24187V;

        /* renamed from: W */
        boolean f24188W;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d$a */
        static class C10283a implements ClassLoaderCreator<C10282d> {
            C10283a() {
            }

            public C10282d[] newArray(int i) {
                return new C10282d[i];
            }

            public C10282d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C10282d(parcel, classLoader);
            }

            public C10282d createFromParcel(Parcel parcel) {
                return new C10282d(parcel, null);
            }
        }

        public C10282d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24187V);
            parcel.writeInt(this.f24188W ? 1 : 0);
        }

        public C10282d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24187V = parcel.readInt();
            this.f24188W = parcel.readInt() != 0;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m32175c(BottomAppBar bottomAppBar) {
        bottomAppBar.m32181p();
        throw null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) m32169b(this.f24175R0);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return m32159a(this.f24177T0);
    }

    /* renamed from: l */
    private void m32177l() {
        Animator animator = this.f24172O0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f24174Q0;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f24173P0;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public FloatingActionButton m32178m() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo2478c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m32179n() {
        Animator animator = this.f24172O0;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = this.f24174Q0;
            if (animator2 == null || !animator2.isRunning()) {
                Animator animator3 = this.f24173P0;
                if (animator3 == null || !animator3.isRunning()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: o */
    private boolean m32180o() {
        FloatingActionButton m = m32178m();
        return m != null && m.mo26695b();
    }

    /* renamed from: p */
    private void m32181p() {
        this.f24171N0.mo26423d(getFabTranslationX());
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        this.f24170M0.mo29423a();
        throw null;
    }

    public C0443c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        this.f24171N0.mo26416a();
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f24175R0;
    }

    public float getFabCradleMargin() {
        this.f24171N0.mo26418b();
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        this.f24171N0.mo26420c();
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f24176S0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m32177l();
        m32181p();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10282d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10282d dVar = (C10282d) parcelable;
        super.onRestoreInstanceState(dVar.mo14857X());
        this.f24175R0 = dVar.f24187V;
        this.f24177T0 = dVar.f24188W;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C10282d dVar = new C10282d(super.onSaveInstanceState());
        dVar.f24187V = this.f24175R0;
        dVar.f24188W = this.f24177T0;
        return dVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0492a.m2637a((Drawable) this.f24170M0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f24171N0.mo26417a(f);
            throw null;
        }
    }

    public void setFabAlignmentMode(int i) {
        m32174c(i);
        m32163a(i, this.f24177T0);
        this.f24175R0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f24171N0.mo26419b(f);
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f24171N0.mo26421c(f);
            throw null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setFabDiameter(int i) {
        this.f24171N0.mo26422d();
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.f24176S0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: c */
    private void m32174c(int i) {
        if (this.f24175R0 != i && C4187x.m14340E(this)) {
            Animator animator = this.f24173P0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m32162a(i, (List<Animator>) arrayList);
            m32171b(i, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f24173P0 = animatorSet;
            this.f24173P0.addListener(new C10279a());
            this.f24173P0.start();
        }
    }

    /* renamed from: b */
    private void m32171b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m32178m(), "translationX", new float[]{(float) m32169b(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: a */
    private void m32162a(int i, List<Animator> list) {
        if (this.f24177T0) {
            this.f24171N0.mo26424e();
            throw null;
        }
    }

    /* renamed from: b */
    private int m32169b(int i) {
        int i2 = 1;
        boolean z = C4187x.m14399n(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f24169L0;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* renamed from: a */
    private void m32163a(int i, boolean z) {
        if (C4187x.m14340E(this)) {
            Animator animator = this.f24174Q0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m32180o()) {
                i = 0;
                z = false;
            }
            m32164a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f24174Q0 = animatorSet;
            this.f24174Q0.addListener(new C10280b());
            this.f24174Q0.start();
        }
    }

    /* renamed from: b */
    private void m32172b(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo26696c((AnimatorListener) this.f24178U0);
        floatingActionButton.mo26697d(this.f24178U0);
    }

    /* renamed from: a */
    private void m32164a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if ((this.f24177T0 || (z && m32180o())) && (this.f24175R0 == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C10281c(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: a */
    private float m32159a(boolean z) {
        FloatingActionButton m = m32178m();
        if (m == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        m.mo26691a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) m.getMeasuredHeight();
        }
        float height2 = (float) (m.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (m.getHeight() - rect.height())) - ((float) m.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32165a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C4187x.m14399n(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof C0194e) && (((C0194e) childAt.getLayoutParams()).f288a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32168a(FloatingActionButton floatingActionButton) {
        m32172b(floatingActionButton);
        floatingActionButton.mo26688a((AnimatorListener) this.f24178U0);
        floatingActionButton.mo26692b((AnimatorListener) this.f24178U0);
    }
}
