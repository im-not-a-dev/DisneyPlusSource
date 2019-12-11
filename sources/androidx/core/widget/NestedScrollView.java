package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.util.ArrayList;
import net.danlew.android.joda.DateUtils;
import p096e.p121h.p135s.C4119a;
import p096e.p121h.p135s.C4175l;
import p096e.p121h.p135s.C4177n;
import p096e.p121h.p135s.C4179p;
import p096e.p121h.p135s.C4181r;
import p096e.p121h.p135s.C4185v;
import p096e.p121h.p135s.C4187x;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4161f;

public class NestedScrollView extends FrameLayout implements C4179p, C4175l, C4185v {

    /* renamed from: w0 */
    private static final C0499a f2216w0 = new C0499a();

    /* renamed from: x0 */
    private static final int[] f2217x0 = {16843130};

    /* renamed from: U */
    private final Rect f2218U;

    /* renamed from: V */
    private OverScroller f2219V;

    /* renamed from: W */
    private EdgeEffect f2220W;

    /* renamed from: a0 */
    private EdgeEffect f2221a0;

    /* renamed from: b0 */
    private int f2222b0;

    /* renamed from: c */
    private long f2223c;

    /* renamed from: c0 */
    private boolean f2224c0;

    /* renamed from: d0 */
    private boolean f2225d0;

    /* renamed from: e0 */
    private View f2226e0;

    /* renamed from: f0 */
    private boolean f2227f0;

    /* renamed from: g0 */
    private VelocityTracker f2228g0;

    /* renamed from: h0 */
    private boolean f2229h0;

    /* renamed from: i0 */
    private boolean f2230i0;

    /* renamed from: j0 */
    private int f2231j0;

    /* renamed from: k0 */
    private int f2232k0;

    /* renamed from: l0 */
    private int f2233l0;

    /* renamed from: m0 */
    private int f2234m0;

    /* renamed from: n0 */
    private final int[] f2235n0;

    /* renamed from: o0 */
    private final int[] f2236o0;

    /* renamed from: p0 */
    private int f2237p0;

    /* renamed from: q0 */
    private int f2238q0;

    /* renamed from: r0 */
    private C0501c f2239r0;

    /* renamed from: s0 */
    private final C4181r f2240s0;

    /* renamed from: t0 */
    private final C4177n f2241t0;

    /* renamed from: u0 */
    private float f2242u0;

    /* renamed from: v0 */
    private C0500b f2243v0;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0499a extends C4119a {
        C0499a() {
        }

        /* renamed from: a */
        public boolean mo2817a(View view, int i, Bundle bundle) {
            if (super.mo2817a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2763b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2763b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo2818b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2818b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C4161f.m14293a(accessibilityEvent, nestedScrollView.getScrollX());
            C4161f.m14295b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public void mo2816a(View view, C4154d dVar) {
            super.mo2816a(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.mo14739a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    dVar.mo14774j(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        dVar.mo14734a((int) ContentServiceClientExtras.URL_SIZE_LIMIT);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        dVar.mo14734a(4096);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0500b {
        /* renamed from: a */
        void mo358a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0501c extends BaseSavedState {
        public static final Creator<C0501c> CREATOR = new C0502a();

        /* renamed from: c */
        public int f2244c;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        static class C0502a implements Creator<C0501c> {
            C0502a() {
            }

            public C0501c createFromParcel(Parcel parcel) {
                return new C0501c(parcel);
            }

            public C0501c[] newArray(int i) {
                return new C0501c[i];
            }
        }

        C0501c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f2244c);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2244c);
        }

        C0501c(Parcel parcel) {
            super(parcel);
            this.f2244c = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m2666a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: d */
    private boolean m2681d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m2683f() {
        this.f2219V = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2231j0 = viewConfiguration.getScaledTouchSlop();
        this.f2232k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2233l0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: g */
    private void m2684g() {
        if (this.f2228g0 == null) {
            this.f2228g0 = VelocityTracker.obtain();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2242u0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2242u0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2242u0;
    }

    /* renamed from: h */
    private void m2686h() {
        VelocityTracker velocityTracker = this.f2228g0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2228g0 = null;
        }
    }

    /* renamed from: a */
    public void mo2755a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2241t0.mo14807a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo1082a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo1084b(View view, View view2, int i, int i2) {
        this.f2240s0.mo14826a(view, view2, i, i2);
        mo2766c(2, i2);
    }

    /* renamed from: c */
    public boolean mo2766c(int i, int i2) {
        return this.f2241t0.mo14813a(i, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2219V.isFinished()) {
            this.f2219V.computeScrollOffset();
            int currY = this.f2219V.getCurrY();
            int i = currY - this.f2238q0;
            this.f2238q0 = currY;
            int[] iArr = this.f2236o0;
            boolean z = false;
            iArr[1] = 0;
            mo2757a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f2236o0[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2756a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2236o0;
                iArr2[1] = 0;
                mo2755a(0, scrollY2, 0, i3, this.f2235n0, 1, iArr2);
                i2 = i3 - this.f2236o0[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m2680d();
                    if (i2 < 0) {
                        if (this.f2220W.isFinished()) {
                            this.f2220W.onAbsorb((int) this.f2219V.getCurrVelocity());
                        }
                    } else if (this.f2221a0.isFinished()) {
                        this.f2221a0.onAbsorb((int) this.f2219V.getCurrVelocity());
                    }
                }
                m2668a();
            }
            if (!this.f2219V.isFinished()) {
                C4187x.m14344I(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2758a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2241t0.mo14811a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2241t0.mo14810a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2757a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2241t0.mo14814a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2220W != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2220W.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2220W.setSize(width, height);
                if (this.f2220W.draw(canvas)) {
                    C4187x.m14344I(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2221a0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2221a0.setSize(width2, height2);
                if (this.f2221a0.draw(canvas)) {
                    C4187x.m14344I(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo2781e(int i) {
        return this.f2241t0.mo14812a(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2240s0.mo14822a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo2781e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2241t0.mo14818b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2225d0 = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2227f0) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2227f0) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2234m0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2222b0) > this.f2231j0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f2227f0 = true;
                                this.f2222b0 = y;
                                m2684g();
                                this.f2228g0.addMovement(motionEvent);
                                this.f2237p0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m2670a(motionEvent);
                    }
                }
            }
            this.f2227f0 = false;
            this.f2234m0 = -1;
            m2686h();
            if (this.f2219V.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C4187x.m14344I(this);
            }
            mo2753a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m2681d((int) motionEvent.getX(), y2)) {
                this.f2227f0 = false;
                m2686h();
            } else {
                this.f2222b0 = y2;
                this.f2234m0 = motionEvent.getPointerId(0);
                m2682e();
                this.f2228g0.addMovement(motionEvent);
                this.f2219V.computeScrollOffset();
                this.f2227f0 = !this.f2219V.isFinished();
                mo2766c(2, 0);
            }
        }
        return this.f2227f0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2224c0 = false;
        View view = this.f2226e0;
        if (view != null && m2675a(view, (View) this)) {
            m2676b(this.f2226e0);
        }
        this.f2226e0 = null;
        if (!this.f2225d0) {
            if (this.f2239r0 != null) {
                scrollTo(getScrollX(), this.f2239r0.f2244c);
                this.f2239r0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m2666a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2225d0 = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2229h0 && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2765c((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1080a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2669a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1084b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m2673a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0501c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0501c cVar = (C0501c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f2239r0 = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0501c cVar = new C0501c(super.onSaveInstanceState());
        cVar.f2244c = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0500b bVar = this.f2243v0;
        if (bVar != null) {
            bVar.mo358a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2674a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2218U);
            offsetDescendantRectToMyCoords(findFocus, this.f2218U);
            m2685g(mo2752a(this.f2218U));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1082a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1077a(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m2684g();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2237p0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f2237p0);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2228g0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f2233l0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2234m0);
                if (Math.abs(yVelocity) > this.f2232k0) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo2765c(i);
                    }
                } else if (this.f2219V.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C4187x.m14344I(this);
                }
                this.f2234m0 = -1;
                m2679c();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f2234m0);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f2234m0);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f2222b0 - y;
                    if (mo2757a(0, i2, this.f2236o0, this.f2235n0, 0)) {
                        i2 -= this.f2236o0[1];
                        this.f2237p0 += this.f2235n0[1];
                    }
                    if (!this.f2227f0 && Math.abs(i2) > this.f2231j0) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2227f0 = true;
                        if (i2 > 0) {
                            i2 -= this.f2231j0;
                        } else {
                            i2 += this.f2231j0;
                        }
                    }
                    int i3 = i2;
                    if (this.f2227f0) {
                        this.f2222b0 = y - this.f2235n0[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i4 = scrollRange;
                        if (mo2756a(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo2781e(0)) {
                            this.f2228g0.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i5 = i3 - scrollY2;
                        int[] iArr = this.f2236o0;
                        iArr[1] = 0;
                        mo2755a(0, scrollY2, 0, i5, this.f2235n0, 0, iArr);
                        int i6 = this.f2222b0;
                        int[] iArr2 = this.f2235n0;
                        this.f2222b0 = i6 - iArr2[1];
                        this.f2237p0 += iArr2[1];
                        if (z) {
                            int i7 = i3 - this.f2236o0[1];
                            m2680d();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C0508d.m2749a(this.f2220W, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f2221a0.isFinished()) {
                                    this.f2221a0.onRelease();
                                }
                            } else if (i8 > i4) {
                                C0508d.m2749a(this.f2221a0, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f2220W.isFinished()) {
                                    this.f2220W.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2220W;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2221a0.isFinished())) {
                                C4187x.m14344I(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2227f0 && getChildCount() > 0 && this.f2219V.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C4187x.m14344I(this);
                }
                this.f2234m0 = -1;
                m2679c();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2222b0 = (int) motionEvent2.getY(actionIndex);
                this.f2234m0 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2670a(motionEvent);
                this.f2222b0 = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f2234m0));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f2219V.isFinished();
            this.f2227f0 = z2;
            if (z2) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.f2219V.isFinished()) {
                m2668a();
            }
            this.f2222b0 = (int) motionEvent.getY();
            this.f2234m0 = motionEvent2.getPointerId(0);
            mo2766c(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2228g0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2224c0) {
            m2676b(view2);
        } else {
            this.f2226e0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2672a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2686h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2224c0 = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a = m2666a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a2 = m2666a(i2, height, height2);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2229h0) {
            this.f2229h0 = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2241t0.mo14808a(z);
    }

    public void setOnScrollChangeListener(C0500b bVar) {
        this.f2243v0 = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2230i0 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2766c(i, 0);
    }

    public void stopNestedScroll() {
        mo2753a(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m2682e() {
        VelocityTracker velocityTracker = this.f2228g0;
        if (velocityTracker == null) {
            this.f2228g0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: a */
    public void mo2753a(int i) {
        this.f2241t0.mo14821c(i);
    }

    /* renamed from: c */
    public void mo2765c(int i) {
        if (getChildCount() > 0) {
            this.f2219V.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2671a(true);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2218U = new Rect();
        this.f2224c0 = true;
        this.f2225d0 = false;
        this.f2226e0 = null;
        this.f2227f0 = false;
        this.f2230i0 = true;
        this.f2234m0 = -1;
        this.f2235n0 = new int[2];
        this.f2236o0 = new int[2];
        m2683f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2217x0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2240s0 = new C4181r(this);
        this.f2241t0 = new C4177n(this);
        setNestedScrollingEnabled(true);
        C4187x.m14359a((View) this, (C4119a) f2216w0);
    }

    /* renamed from: b */
    private boolean m2677b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m2685g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2230i0) {
            mo2754a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: a */
    public boolean mo2757a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2241t0.mo14817a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public void mo1079a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2669a(i4, i5, iArr);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private void m2669a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2241t0.mo14807a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: c */
    private void m2679c() {
        this.f2227f0 = false;
        m2686h();
        mo2753a(0);
        EdgeEffect edgeEffect = this.f2220W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2221a0.onRelease();
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    private boolean m2678b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2667a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2685g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo2774d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2218U;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f2218U.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f2218U;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f2218U;
        return m2678b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: f */
    public boolean mo2782f(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2218U.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2218U;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2218U.top = getScrollY() - height;
            Rect rect2 = this.f2218U;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2218U;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m2678b(i, i2, rect3.bottom);
    }

    /* renamed from: a */
    public void mo1077a(View view, int i) {
        this.f2240s0.mo14824a(view, i);
        mo2753a(i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    public void mo1078a(View view, int i, int i2, int i3, int i4, int i5) {
        m2669a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo1080a(View view, int i, int i2, int[] iArr, int i3) {
        mo2757a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: b */
    public boolean mo2764b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2674a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2685g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2218U);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2218U);
            m2685g(mo2752a(this.f2218U));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m2673a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2758a(KeyEvent keyEvent) {
        this.f2218U.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m2677b()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo2764b(33) : mo2774d(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo2764b(130) : mo2774d(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo2782f(i);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m2680d() {
        if (getOverScrollMode() == 2) {
            this.f2220W = null;
            this.f2221a0 = null;
        } else if (this.f2220W == null) {
            Context context = getContext();
            this.f2220W = new EdgeEffect(context);
            this.f2221a0 = new EdgeEffect(context);
        }
    }

    /* renamed from: a */
    private void m2670a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2234m0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2222b0 = (int) motionEvent.getY(i);
            this.f2234m0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2228g0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2756a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.mo2781e(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f2219V
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2756a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: b */
    public final void mo2763b(int i, int i2) {
        mo2754a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    private void m2676b(View view) {
        view.getDrawingRect(this.f2218U);
        offsetDescendantRectToMyCoords(view, this.f2218U);
        int a = mo2752a(this.f2218U);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    private View m2667a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private boolean m2673a(View view) {
        return !m2674a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2674a(View view, int i, int i2) {
        view.getDrawingRect(this.f2218U);
        offsetDescendantRectToMyCoords(view, this.f2218U);
        return this.f2218U.bottom + i >= getScrollY() && this.f2218U.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo2754a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2223c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f2219V.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m2671a(false);
            } else {
                if (!this.f2219V.isFinished()) {
                    m2668a();
                }
                scrollBy(i, i2);
            }
            this.f2223c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m2671a(boolean z) {
        if (z) {
            mo2766c(2, 1);
        } else {
            mo2753a(1);
        }
        this.f2238q0 = getScrollY();
        C4187x.m14344I(this);
    }

    /* renamed from: a */
    private void m2668a() {
        this.f2219V.abortAnimation();
        mo2753a(1);
    }

    /* renamed from: a */
    private boolean m2672a(Rect rect, boolean z) {
        int a = mo2752a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2754a(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2752a(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i5;
            }
            i3 = Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top < scrollY && rect.bottom < i5) {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i3 = Math.max(i, -getScrollY());
        }
        return i3;
    }

    /* renamed from: a */
    private static boolean m2675a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2675a((View) parent, view2)) {
            z = false;
        }
        return z;
    }
}
