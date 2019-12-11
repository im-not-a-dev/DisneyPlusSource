package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import net.danlew.android.joda.DateUtils;
import p096e.p097a.C3863f;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: U */
    private View f684U;

    /* renamed from: V */
    private View f685V;

    /* renamed from: W */
    private View f686W;

    /* renamed from: a0 */
    Drawable f687a0;

    /* renamed from: b0 */
    Drawable f688b0;

    /* renamed from: c */
    private boolean f689c;

    /* renamed from: c0 */
    Drawable f690c0;

    /* renamed from: d0 */
    boolean f691d0;

    /* renamed from: e0 */
    boolean f692e0;

    /* renamed from: f0 */
    private int f693f0;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m958a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m959b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f687a0;
        if (drawable != null && drawable.isStateful()) {
            this.f687a0.setState(getDrawableState());
        }
        Drawable drawable2 = this.f688b0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f688b0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f690c0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f690c0.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f684U;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f687a0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f688b0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f690c0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f685V = findViewById(C3863f.action_bar);
        this.f686W = findViewById(C3863f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f689c || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f684U;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f691d0) {
            Drawable drawable = this.f690c0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f687a0 != null) {
                if (this.f685V.getVisibility() == 0) {
                    this.f687a0.setBounds(this.f685V.getLeft(), this.f685V.getTop(), this.f685V.getRight(), this.f685V.getBottom());
                } else {
                    View view2 = this.f686W;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f687a0.setBounds(0, 0, 0, 0);
                    } else {
                        this.f687a0.setBounds(this.f686W.getLeft(), this.f686W.getTop(), this.f686W.getRight(), this.f686W.getBottom());
                    }
                }
                z3 = true;
            }
            this.f692e0 = z4;
            if (z4) {
                Drawable drawable2 = this.f688b0;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f685V == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int i3 = this.f693f0;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f685V != null) {
            int mode = MeasureSpec.getMode(i2);
            View view = this.f684U;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i4 = !m959b(this.f685V) ? m958a(this.f685V) : !m959b(this.f686W) ? m958a(this.f686W) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + m958a(this.f684U), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f687a0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f687a0);
        }
        this.f687a0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f685V;
            if (view != null) {
                this.f687a0.setBounds(view.getLeft(), this.f685V.getTop(), this.f685V.getRight(), this.f685V.getBottom());
            }
        }
        boolean z = true;
        if (!this.f691d0 ? !(this.f687a0 == null && this.f688b0 == null) : this.f690c0 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f690c0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f690c0);
        }
        this.f690c0 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f691d0) {
                Drawable drawable3 = this.f690c0;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f691d0 ? this.f687a0 == null && this.f688b0 == null : this.f690c0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f688b0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f688b0);
        }
        this.f688b0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f692e0) {
                Drawable drawable3 = this.f688b0;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f684U.getLeft(), this.f684U.getTop(), this.f684U.getRight(), this.f684U.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f691d0 ? !(this.f687a0 == null && this.f688b0 == null) : this.f690c0 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0254m0 m0Var) {
        View view = this.f684U;
        if (view != null) {
            removeView(view);
        }
        this.f684U = m0Var;
        if (m0Var != null) {
            addView(m0Var);
            ViewGroup.LayoutParams layoutParams = m0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f689c = z;
        setDescendantFocusability(z ? 393216 : DateUtils.FORMAT_ABBREV_RELATIVE);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f687a0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f688b0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f690c0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f687a0 && !this.f691d0) || (drawable == this.f688b0 && this.f692e0) || ((drawable == this.f690c0 && this.f691d0) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4187x.m14358a((View) this, (Drawable) new C0203b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ActionBar);
        this.f687a0 = obtainStyledAttributes.getDrawable(C3867j.ActionBar_background);
        this.f688b0 = obtainStyledAttributes.getDrawable(C3867j.ActionBar_backgroundStacked);
        this.f693f0 = obtainStyledAttributes.getDimensionPixelSize(C3867j.ActionBar_height, -1);
        if (getId() == C3863f.split_action_bar) {
            this.f691d0 = true;
            this.f690c0 = obtainStyledAttributes.getDrawable(C3867j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f691d0 ? this.f687a0 == null && this.f688b0 == null : this.f690c0 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
