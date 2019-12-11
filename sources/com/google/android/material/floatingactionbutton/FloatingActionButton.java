package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.C0235h;
import androidx.appcompat.widget.C0251l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0443c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0444d;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0517l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C10314c;
import com.google.android.material.internal.C10322i;
import java.util.List;
import p096e.p113e.C3941i;
import p096e.p121h.p135s.C4186w;
import p096e.p121h.p135s.C4187x;
import p163g.p449j.p450a.p468b.C11460d;
import p163g.p449j.p450a.p468b.C11467k;
import p163g.p449j.p450a.p468b.p469l.C11475h;
import p163g.p449j.p450a.p468b.p475q.C11495a;
import p163g.p449j.p450a.p468b.p475q.C11497c;
import p163g.p449j.p450a.p468b.p479u.C11505b;
import p163g.p449j.p450a.p468b.p481w.C11508a;

@C0444d(Behavior.class)
public class FloatingActionButton extends C10322i implements C4186w, C0517l, C11495a {

    /* renamed from: U */
    private ColorStateList f24299U;

    /* renamed from: V */
    private Mode f24300V;

    /* renamed from: W */
    private ColorStateList f24301W;

    /* renamed from: a0 */
    private Mode f24302a0;

    /* renamed from: b0 */
    private ColorStateList f24303b0;

    /* renamed from: c0 */
    private int f24304c0;

    /* renamed from: d0 */
    private int f24305d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f24306e0;

    /* renamed from: f0 */
    private int f24307f0;

    /* renamed from: g0 */
    boolean f24308g0;

    /* renamed from: h0 */
    final Rect f24309h0;

    /* renamed from: i0 */
    private final Rect f24310i0;

    /* renamed from: j0 */
    private final C0251l f24311j0;

    /* renamed from: k0 */
    private final C11497c f24312k0;

    /* renamed from: l0 */
    private C10299a f24313l0;

    protected static class BaseBehavior<T extends FloatingActionButton> extends C0443c<T> {

        /* renamed from: a */
        private Rect f24314a;

        /* renamed from: b */
        private C10297b f24315b;

        /* renamed from: c */
        private boolean f24316c;

        public BaseBehavior() {
            this.f24316c = true;
        }

        /* renamed from: b */
        private boolean m32419b(View view, FloatingActionButton floatingActionButton) {
            if (!m32417a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0446f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo26689a(this.f24315b, false);
            } else {
                floatingActionButton.mo26694b(this.f24315b, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11467k.FloatingActionButton_Behavior_Layout);
            this.f24316c = obtainStyledAttributes.getBoolean(C11467k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2516a(C0446f fVar) {
            if (fVar.f2035h == 0) {
                fVar.f2035h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo2536b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m32418a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m32416a(view)) {
                m32419b(view, floatingActionButton);
            }
            return false;
        }

        /* renamed from: a */
        private static boolean m32416a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0446f) {
                return ((C0446f) layoutParams).mo2558d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m32417a(View view, FloatingActionButton floatingActionButton) {
            C0446f fVar = (C0446f) floatingActionButton.getLayoutParams();
            if (this.f24316c && fVar.mo2557c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m32418a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m32417a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f24314a == null) {
                this.f24314a = new Rect();
            }
            Rect rect = this.f24314a;
            C10314c.m32541a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo26689a(this.f24315b, false);
            } else {
                floatingActionButton.mo26694b(this.f24315b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List b = coordinatorLayout.mo2474b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m32416a(view) && m32419b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m32418a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2480c((View) floatingActionButton, i);
            m32415a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo2528a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f24309h0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private void m32415a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f24309h0;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0446f fVar = (C0446f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C4187x.m14386e((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    C4187x.m14383d((View) floatingActionButton, i2);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C10296a implements C10306g {

        /* renamed from: a */
        final /* synthetic */ C10297b f24317a;

        C10296a(C10297b bVar) {
            this.f24317a = bVar;
        }

        /* renamed from: a */
        public void mo26747a() {
            this.f24317a.mo26750b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo26748b() {
            this.f24317a.mo26749a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C10297b {
        /* renamed from: a */
        public abstract void mo26749a(FloatingActionButton floatingActionButton);

        /* renamed from: b */
        public abstract void mo26750b(FloatingActionButton floatingActionButton);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C10298c implements C11505b {
        C10298c() {
        }

        /* renamed from: a */
        public void mo26751a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f24309h0.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f24306e0, i2 + FloatingActionButton.this.f24306e0, i3 + FloatingActionButton.this.f24306e0, i4 + FloatingActionButton.this.f24306e0);
        }

        /* renamed from: b */
        public float mo26754b() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo26752a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public boolean mo26753a() {
            return FloatingActionButton.this.f24308g0;
        }
    }

    /* renamed from: d */
    private void m32404d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f24301W;
            if (colorStateList == null) {
                C0492a.m2644b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f24302a0;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0235h.m1311a(colorForState, mode));
        }
    }

    private C10299a getImpl() {
        if (this.f24313l0 == null) {
            this.f24313l0 = m32402c();
        }
        return this.f24313l0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo26694b(C10297b bVar, boolean z) {
        getImpl().mo26770b(m32400a(bVar), z);
    }

    /* renamed from: c */
    public void mo26696c(AnimatorListener animatorListener) {
        getImpl().mo26774c(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo26764a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f24299U;
    }

    public Mode getBackgroundTintMode() {
        return this.f24300V;
    }

    public float getCompatElevation() {
        return getImpl().mo26765b();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo26775d();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo26778e();
    }

    public Drawable getContentBackground() {
        return getImpl().mo26755a();
    }

    public int getCustomSize() {
        return this.f24305d0;
    }

    public int getExpandedComponentIdHint() {
        this.f24312k0.mo29409a();
        throw null;
    }

    public C11475h getHideMotionSpec() {
        return getImpl().mo26772c();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f24303b0;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f24303b0;
    }

    public C11475h getShowMotionSpec() {
        return getImpl().mo26779f();
    }

    public int getSize() {
        return this.f24304c0;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m32397a(this.f24304c0);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f24301W;
    }

    public Mode getSupportImageTintMode() {
        return this.f24302a0;
    }

    public boolean getUseCompatPadding() {
        return this.f24308g0;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo26782i();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo26783j();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo26785l();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f24306e0 = (sizeDimension - this.f24307f0) / 2;
        getImpl().mo26789p();
        int min = Math.min(m32398a(sizeDimension, i), m32398a(sizeDimension, i2));
        Rect rect = this.f24309h0;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C11508a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C11508a aVar = (C11508a) parcelable;
        super.onRestoreInstanceState(aVar.mo14857X());
        this.f24312k0.mo29411a((Bundle) aVar.f26906V.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C3941i<String, Bundle> iVar = new C11508a(super.onSaveInstanceState()).f26906V;
        this.f24312k0.mo29413c();
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo26691a(this.f24310i0) || this.f24310i0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f24299U != colorStateList) {
            this.f24299U = colorStateList;
            getImpl().mo26759a(colorStateList);
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f24300V != mode) {
            this.f24300V = mode;
            getImpl().mo26760a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo26756a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo26766b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo26776d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.f24305d0 = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i) {
        this.f24312k0.mo29410a(i);
        throw null;
    }

    public void setHideMotionSpec(C11475h hVar) {
        getImpl().mo26763a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C11475h.m37006a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().mo26788o();
    }

    public void setImageResource(int i) {
        this.f24311j0.mo1755a(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setShowMotionSpec(C11475h hVar) {
        getImpl().mo26771b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C11475h.m37006a(getContext(), i));
    }

    public void setSize(int i) {
        this.f24305d0 = 0;
        if (i != this.f24304c0) {
            this.f24304c0 = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f24301W != colorStateList) {
            this.f24301W = colorStateList;
            m32404d();
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f24302a0 != mode) {
            this.f24302a0 = mode;
            m32404d();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f24308g0 != z) {
            this.f24308g0 = z;
            getImpl().mo26784k();
        }
    }

    /* renamed from: c */
    private void m32403c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f24309h0;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: b */
    public void mo26692b(AnimatorListener animatorListener) {
        getImpl().mo26767b(animatorListener);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f24303b0 != colorStateList) {
            this.f24303b0 = colorStateList;
            getImpl().mo26768b(this.f24303b0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26689a(C10297b bVar, boolean z) {
        getImpl().mo26762a(m32400a(bVar), z);
    }

    /* renamed from: b */
    public boolean mo26695b() {
        return getImpl().mo26781h();
    }

    /* renamed from: a */
    public void mo26688a(AnimatorListener animatorListener) {
        getImpl().mo26758a(animatorListener);
    }

    /* renamed from: b */
    public void mo26693b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m32403c(rect);
    }

    /* renamed from: a */
    public boolean mo26690a() {
        this.f24312k0.mo29412b();
        throw null;
    }

    /* renamed from: a */
    private C10306g m32400a(C10297b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C10296a(bVar);
    }

    /* renamed from: c */
    private C10299a m32402c() {
        if (VERSION.SDK_INT >= 21) {
            return new C10309b(this, new C10298c());
        }
        return new C10299a(this, new C10298c());
    }

    /* renamed from: a */
    private int m32397a(int i) {
        int i2;
        int i3 = this.f24305d0;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
                i2 = m32397a(1);
            } else {
                i2 = m32397a(0);
            }
            return i2;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C11460d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C11460d.design_fab_size_mini);
        }
    }

    /* renamed from: d */
    public void mo26697d(AnimatorListener animatorListener) {
        getImpl().mo26777d(animatorListener);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo26691a(Rect rect) {
        if (!C4187x.m14340E(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m32403c(rect);
        return true;
    }

    /* renamed from: a */
    private static int m32398a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }
}
