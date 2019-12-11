package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.widget.C0511g;
import p096e.p121h.p122j.C4025a;
import p096e.p121h.p135s.C4176m;
import p096e.p121h.p135s.C4177n;
import p096e.p121h.p135s.C4180q;
import p096e.p121h.p135s.C4181r;
import p096e.p121h.p135s.C4187x;

public class SwipeRefreshLayout extends ViewGroup implements C4180q, C4176m {

    /* renamed from: K0 */
    private static final String f3809K0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: L0 */
    private static final int[] f3810L0 = {16842766};

    /* renamed from: A0 */
    private Animation f3811A0;

    /* renamed from: B0 */
    private Animation f3812B0;

    /* renamed from: C0 */
    private Animation f3813C0;

    /* renamed from: D0 */
    boolean f3814D0;

    /* renamed from: E0 */
    private int f3815E0;

    /* renamed from: F0 */
    boolean f3816F0;

    /* renamed from: G0 */
    private C0980i f3817G0;

    /* renamed from: H0 */
    private AnimationListener f3818H0;

    /* renamed from: I0 */
    private final Animation f3819I0;

    /* renamed from: J0 */
    private final Animation f3820J0;

    /* renamed from: U */
    C0981j f3821U;

    /* renamed from: V */
    boolean f3822V;

    /* renamed from: W */
    private int f3823W;

    /* renamed from: a0 */
    private float f3824a0;

    /* renamed from: b0 */
    private float f3825b0;

    /* renamed from: c */
    private View f3826c;

    /* renamed from: c0 */
    private final C4181r f3827c0;

    /* renamed from: d0 */
    private final C4177n f3828d0;

    /* renamed from: e0 */
    private final int[] f3829e0;

    /* renamed from: f0 */
    private final int[] f3830f0;

    /* renamed from: g0 */
    private boolean f3831g0;

    /* renamed from: h0 */
    private int f3832h0;

    /* renamed from: i0 */
    int f3833i0;

    /* renamed from: j0 */
    private float f3834j0;

    /* renamed from: k0 */
    private float f3835k0;

    /* renamed from: l0 */
    private boolean f3836l0;

    /* renamed from: m0 */
    private int f3837m0;

    /* renamed from: n0 */
    boolean f3838n0;

    /* renamed from: o0 */
    private boolean f3839o0;

    /* renamed from: p0 */
    private final DecelerateInterpolator f3840p0;

    /* renamed from: q0 */
    C0982a f3841q0;

    /* renamed from: r0 */
    private int f3842r0;

    /* renamed from: s0 */
    protected int f3843s0;

    /* renamed from: t0 */
    float f3844t0;

    /* renamed from: u0 */
    protected int f3845u0;

    /* renamed from: v0 */
    int f3846v0;

    /* renamed from: w0 */
    int f3847w0;

    /* renamed from: x0 */
    C0984b f3848x0;

    /* renamed from: y0 */
    private Animation f3849y0;

    /* renamed from: z0 */
    private Animation f3850z0;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C0972a implements AnimationListener {
        C0972a() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f3822V) {
                swipeRefreshLayout.f3848x0.setAlpha(255);
                SwipeRefreshLayout.this.f3848x0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f3814D0) {
                    C0981j jVar = swipeRefreshLayout2.f3821U;
                    if (jVar != null) {
                        jVar.onRefresh();
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f3833i0 = swipeRefreshLayout3.f3841q0.getTop();
                return;
            }
            swipeRefreshLayout.mo5341b();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C0973b extends Animation {
        C0973b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C0974c extends Animation {
        C0974c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C0975d extends Animation {

        /* renamed from: U */
        final /* synthetic */ int f3854U;

        /* renamed from: c */
        final /* synthetic */ int f3856c;

        C0975d(int i, int i2) {
            this.f3856c = i;
            this.f3854U = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C0984b bVar = SwipeRefreshLayout.this.f3848x0;
            int i = this.f3856c;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f3854U - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C0976e implements AnimationListener {
        C0976e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3838n0) {
                swipeRefreshLayout.mo5339a((AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C0977f extends Animation {
        C0977f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3816F0) {
                i = swipeRefreshLayout.f3846v0 - Math.abs(swipeRefreshLayout.f3845u0);
            } else {
                i = swipeRefreshLayout.f3846v0;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f3843s0;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f3841q0.getTop());
            SwipeRefreshLayout.this.f3848x0.mo5396a(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C0978g extends Animation {
        C0978g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo5338a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C0979h extends Animation {
        C0979h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f3844t0;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo5338a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C0980i {
        /* renamed from: a */
        boolean mo5387a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C0981j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m5247a(boolean z, boolean z2) {
        if (this.f3822V != z) {
            this.f3814D0 = z2;
            m5255d();
            this.f3822V = z;
            if (this.f3822V) {
                m5245a(this.f3833i0, this.f3818H0);
            } else {
                mo5339a(this.f3818H0);
            }
        }
    }

    /* renamed from: c */
    private void m5252c() {
        this.f3841q0 = new C0982a(getContext(), -328966);
        this.f3848x0 = new C0984b(getContext());
        this.f3848x0.mo5400a(1);
        this.f3841q0.setImageDrawable(this.f3848x0);
        this.f3841q0.setVisibility(8);
        addView(this.f3841q0);
    }

    /* renamed from: d */
    private void m5255d() {
        if (this.f3826c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f3841q0)) {
                    this.f3826c = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    private void m5257e() {
        this.f3812B0 = m5244a(this.f3848x0.getAlpha(), 255);
    }

    /* renamed from: f */
    private void m5258f() {
        this.f3811A0 = m5244a(this.f3848x0.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f3841q0.getBackground().setAlpha(i);
        this.f3848x0.setAlpha(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5341b() {
        this.f3841q0.clearAnimation();
        this.f3848x0.stop();
        this.f3841q0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3838n0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f3845u0 - this.f3833i0);
        }
        this.f3833i0 = this.f3841q0.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3828d0.mo14811a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3828d0.mo14810a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3828d0.mo14816a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3828d0.mo14814a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f3842r0;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f3827c0.mo14822a();
    }

    public int getProgressCircleDiameter() {
        return this.f3815E0;
    }

    public int getProgressViewEndOffset() {
        return this.f3846v0;
    }

    public int getProgressViewStartOffset() {
        return this.f3845u0;
    }

    public boolean hasNestedScrollingParent() {
        return this.f3828d0.mo14809a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3828d0.mo14818b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5341b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m5255d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3839o0 && actionMasked == 0) {
            this.f3839o0 = false;
        }
        if (!isEnabled() || this.f3839o0 || mo5340a() || this.f3822V || this.f3831g0) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f3837m0;
                    if (i == -1) {
                        Log.e(f3809K0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m5256d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m5246a(motionEvent);
                    }
                }
            }
            this.f3836l0 = false;
            this.f3837m0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f3845u0 - this.f3841q0.getTop());
            this.f3837m0 = motionEvent.getPointerId(0);
            this.f3836l0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f3837m0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f3835k0 = motionEvent.getY(findPointerIndex2);
        }
        return this.f3836l0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f3826c == null) {
                m5255d();
            }
            View view = this.f3826c;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f3841q0.getMeasuredWidth();
                int measuredHeight2 = this.f3841q0.getMeasuredHeight();
                C0982a aVar = this.f3841q0;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.f3833i0;
                aVar.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3826c == null) {
            m5255d();
        }
        View view = this.f3826c;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f3841q0.measure(MeasureSpec.makeMeasureSpec(this.f3815E0, 1073741824), MeasureSpec.makeMeasureSpec(this.f3815E0, 1073741824));
            this.f3842r0 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f3841q0) {
                    this.f3842r0 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f3825b0;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f3825b0 = 0.0f;
                } else {
                    this.f3825b0 = f - f2;
                    iArr[1] = i2;
                }
                m5253c(this.f3825b0);
            }
        }
        if (this.f3816F0 && i2 > 0 && this.f3825b0 == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f3841q0.setVisibility(8);
        }
        int[] iArr2 = this.f3829e0;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f3830f0);
        int i5 = i4 + this.f3830f0[1];
        if (i5 < 0 && !mo5340a()) {
            this.f3825b0 += (float) Math.abs(i5);
            m5253c(this.f3825b0);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3827c0.mo14825a(view, view2, i);
        startNestedScroll(i & 2);
        this.f3825b0 = 0.0f;
        this.f3831g0 = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f3839o0 && !this.f3822V && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f3827c0.mo14823a(view);
        this.f3831g0 = false;
        float f = this.f3825b0;
        if (f > 0.0f) {
            m5249b(f);
            this.f3825b0 = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3839o0 && actionMasked == 0) {
            this.f3839o0 = false;
        }
        if (!isEnabled() || this.f3839o0 || mo5340a() || this.f3822V || this.f3831g0) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3837m0 = motionEvent.getPointerId(0);
            this.f3836l0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3837m0);
            if (findPointerIndex < 0) {
                Log.e(f3809K0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f3836l0) {
                float y = (motionEvent.getY(findPointerIndex) - this.f3834j0) * 0.5f;
                this.f3836l0 = false;
                m5249b(y);
            }
            this.f3837m0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f3837m0);
            if (findPointerIndex2 < 0) {
                Log.e(f3809K0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m5256d(y2);
            if (this.f3836l0) {
                float f = (y2 - this.f3834j0) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m5253c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f3809K0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f3837m0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m5246a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f3826c instanceof AbsListView)) {
            View view = this.f3826c;
            if (view == null || C4187x.m14341F(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f3841q0.setScaleX(f);
        this.f3841q0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m5255d();
        this.f3848x0.mo5402a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C4025a.m13788a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f3824a0 = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo5341b();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3828d0.mo14808a(z);
    }

    public void setOnChildScrollUpCallback(C0980i iVar) {
        this.f3817G0 = iVar;
    }

    public void setOnRefreshListener(C0981j jVar) {
        this.f3821U = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f3841q0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C4025a.m13788a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f3822V == z) {
            m5247a(z, false);
            return;
        }
        this.f3822V = z;
        if (!this.f3816F0) {
            i = this.f3846v0 + this.f3845u0;
        } else {
            i = this.f3846v0;
        }
        setTargetOffsetTopAndBottom(i - this.f3833i0);
        this.f3814D0 = false;
        m5251b(this.f3818H0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f3815E0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f3815E0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f3841q0.setImageDrawable(null);
            this.f3848x0.mo5400a(i);
            this.f3841q0.setImageDrawable(this.f3848x0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f3847w0 = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f3841q0.bringToFront();
        C4187x.m14386e((View) this.f3841q0, i);
        this.f3833i0 = this.f3841q0.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f3828d0.mo14819b(i);
    }

    public void stopNestedScroll() {
        this.f3828d0.mo14820c();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3822V = false;
        this.f3824a0 = -1.0f;
        this.f3829e0 = new int[2];
        this.f3830f0 = new int[2];
        this.f3837m0 = -1;
        this.f3842r0 = -1;
        this.f3818H0 = new C0972a();
        this.f3819I0 = new C0977f();
        this.f3820J0 = new C0978g();
        this.f3823W = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3832h0 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f3840p0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3815E0 = (int) (displayMetrics.density * 40.0f);
        m5252c();
        setChildrenDrawingOrderEnabled(true);
        this.f3846v0 = (int) (displayMetrics.density * 64.0f);
        this.f3824a0 = (float) this.f3846v0;
        this.f3827c0 = new C4181r(this);
        this.f3828d0 = new C4177n(this);
        setNestedScrollingEnabled(true);
        int i = -this.f3815E0;
        this.f3833i0 = i;
        this.f3845u0 = i;
        mo5338a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3810L0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m5256d(float f) {
        float f2 = this.f3835k0;
        float f3 = f - f2;
        int i = this.f3823W;
        if (f3 > ((float) i) && !this.f3836l0) {
            this.f3834j0 = f2 + ((float) i);
            this.f3836l0 = true;
            this.f3848x0.setAlpha(76);
        }
    }

    /* renamed from: c */
    private void m5253c(float f) {
        this.f3848x0.mo5401a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f3824a0));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f3824a0;
        int i = this.f3847w0;
        if (i <= 0) {
            i = this.f3816F0 ? this.f3846v0 - this.f3845u0 : this.f3846v0;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f3845u0 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f3841q0.getVisibility() != 0) {
            this.f3841q0.setVisibility(0);
        }
        if (!this.f3838n0) {
            this.f3841q0.setScaleX(1.0f);
            this.f3841q0.setScaleY(1.0f);
        }
        if (this.f3838n0) {
            setAnimationProgress(Math.min(1.0f, f / this.f3824a0));
        }
        if (f < this.f3824a0) {
            if (this.f3848x0.getAlpha() > 76 && !m5248a(this.f3811A0)) {
                m5258f();
            }
        } else if (this.f3848x0.getAlpha() < 255 && !m5248a(this.f3812B0)) {
            m5257e();
        }
        this.f3848x0.mo5397a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f3848x0.mo5396a(Math.min(1.0f, max));
        this.f3848x0.mo5403b((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f3833i0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5339a(AnimationListener animationListener) {
        this.f3850z0 = new C0974c();
        this.f3850z0.setDuration(150);
        this.f3841q0.mo5389a(animationListener);
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(this.f3850z0);
    }

    /* renamed from: b */
    private void m5251b(AnimationListener animationListener) {
        this.f3841q0.setVisibility(0);
        this.f3848x0.setAlpha(255);
        this.f3849y0 = new C0973b();
        this.f3849y0.setDuration((long) this.f3832h0);
        if (animationListener != null) {
            this.f3841q0.mo5389a(animationListener);
        }
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(this.f3849y0);
    }

    /* renamed from: a */
    private Animation m5244a(int i, int i2) {
        C0975d dVar = new C0975d(i, i2);
        dVar.setDuration(300);
        this.f3841q0.mo5389a(null);
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: b */
    private void m5249b(float f) {
        if (f > this.f3824a0) {
            m5247a(true, true);
            return;
        }
        this.f3822V = false;
        this.f3848x0.mo5397a(0.0f, 0.0f);
        C0976e eVar = null;
        if (!this.f3838n0) {
            eVar = new C0976e();
        }
        m5250b(this.f3833i0, eVar);
        this.f3848x0.mo5401a(false);
    }

    /* renamed from: a */
    public boolean mo5340a() {
        C0980i iVar = this.f3817G0;
        if (iVar != null) {
            return iVar.mo5387a(this, this.f3826c);
        }
        View view = this.f3826c;
        if (view instanceof ListView) {
            return C0511g.m2757a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: a */
    private boolean m5248a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: a */
    private void m5245a(int i, AnimationListener animationListener) {
        this.f3843s0 = i;
        this.f3819I0.reset();
        this.f3819I0.setDuration(200);
        this.f3819I0.setInterpolator(this.f3840p0);
        if (animationListener != null) {
            this.f3841q0.mo5389a(animationListener);
        }
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(this.f3819I0);
    }

    /* renamed from: b */
    private void m5250b(int i, AnimationListener animationListener) {
        if (this.f3838n0) {
            m5254c(i, animationListener);
            return;
        }
        this.f3843s0 = i;
        this.f3820J0.reset();
        this.f3820J0.setDuration(200);
        this.f3820J0.setInterpolator(this.f3840p0);
        if (animationListener != null) {
            this.f3841q0.mo5389a(animationListener);
        }
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(this.f3820J0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5338a(float f) {
        int i = this.f3843s0;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f3845u0 - i)) * f))) - this.f3841q0.getTop());
    }

    /* renamed from: c */
    private void m5254c(int i, AnimationListener animationListener) {
        this.f3843s0 = i;
        this.f3844t0 = this.f3841q0.getScaleX();
        this.f3813C0 = new C0979h();
        this.f3813C0.setDuration(150);
        if (animationListener != null) {
            this.f3841q0.mo5389a(animationListener);
        }
        this.f3841q0.clearAnimation();
        this.f3841q0.startAnimation(this.f3813C0);
    }

    /* renamed from: a */
    private void m5246a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3837m0) {
            this.f3837m0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
