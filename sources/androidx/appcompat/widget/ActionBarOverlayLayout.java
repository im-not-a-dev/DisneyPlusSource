package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0148n.C0149a;
import p096e.p097a.C3858a;
import p096e.p097a.C3863f;
import p096e.p121h.p135s.C4178o;
import p096e.p121h.p135s.C4179p;
import p096e.p121h.p135s.C4180q;
import p096e.p121h.p135s.C4181r;
import p096e.p121h.p135s.C4187x;

public class ActionBarOverlayLayout extends ViewGroup implements C0301z, C4180q, C4178o, C4179p {

    /* renamed from: x0 */
    static final int[] f706x0 = {C3858a.actionBarSize, 16842841};

    /* renamed from: U */
    private int f707U;

    /* renamed from: V */
    private ContentFrameLayout f708V;

    /* renamed from: W */
    ActionBarContainer f709W;

    /* renamed from: a0 */
    private C0201a0 f710a0;

    /* renamed from: b0 */
    private Drawable f711b0;

    /* renamed from: c */
    private int f712c;

    /* renamed from: c0 */
    private boolean f713c0;

    /* renamed from: d0 */
    private boolean f714d0;

    /* renamed from: e0 */
    private boolean f715e0;

    /* renamed from: f0 */
    private boolean f716f0;

    /* renamed from: g0 */
    boolean f717g0;

    /* renamed from: h0 */
    private int f718h0;

    /* renamed from: i0 */
    private int f719i0;

    /* renamed from: j0 */
    private final Rect f720j0;

    /* renamed from: k0 */
    private final Rect f721k0;

    /* renamed from: l0 */
    private final Rect f722l0;

    /* renamed from: m0 */
    private final Rect f723m0;

    /* renamed from: n0 */
    private final Rect f724n0;

    /* renamed from: o0 */
    private final Rect f725o0;

    /* renamed from: p0 */
    private final Rect f726p0;

    /* renamed from: q0 */
    private C0163d f727q0;

    /* renamed from: r0 */
    private OverScroller f728r0;

    /* renamed from: s0 */
    ViewPropertyAnimator f729s0;

    /* renamed from: t0 */
    final AnimatorListenerAdapter f730t0;

    /* renamed from: u0 */
    private final Runnable f731u0;

    /* renamed from: v0 */
    private final Runnable f732v0;

    /* renamed from: w0 */
    private final C4181r f733w0;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0160a extends AnimatorListenerAdapter {
        C0160a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f729s0 = null;
            actionBarOverlayLayout.f717g0 = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f729s0 = null;
            actionBarOverlayLayout.f717g0 = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0161b implements Runnable {
        C0161b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1083b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f729s0 = actionBarOverlayLayout.f709W.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f730t0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0162c implements Runnable {
        C0162c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1083b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f729s0 = actionBarOverlayLayout.f709W.animate().translationY((float) (-ActionBarOverlayLayout.this.f709W.getHeight())).setListener(ActionBarOverlayLayout.this.f730t0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0163d {
        /* renamed from: a */
        void mo580a();

        /* renamed from: a */
        void mo582a(int i);

        /* renamed from: a */
        void mo584a(boolean z);

        /* renamed from: b */
        void mo585b();

        /* renamed from: c */
        void mo586c();

        /* renamed from: d */
        void mo587d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0164e extends MarginLayoutParams {
        public C0164e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0164e(int i, int i2) {
            super(i, i2);
        }

        public C0164e(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m967a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f706x0);
        boolean z = false;
        this.f712c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f711b0 = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f711b0 == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f713c0 = z;
        this.f728r0 = new OverScroller(context);
    }

    /* renamed from: k */
    private void m970k() {
        mo1083b();
        this.f732v0.run();
    }

    /* renamed from: l */
    private void m971l() {
        mo1083b();
        postDelayed(this.f732v0, 600);
    }

    /* renamed from: m */
    private void m972m() {
        mo1083b();
        postDelayed(this.f731u0, 600);
    }

    /* renamed from: n */
    private void m973n() {
        mo1083b();
        this.f731u0.run();
    }

    /* renamed from: b */
    public void mo1084b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: c */
    public void mo1085c() {
        mo1101j();
        this.f710a0.mo1493c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0164e;
    }

    /* renamed from: d */
    public boolean mo1087d() {
        mo1101j();
        return this.f710a0.mo1496d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f711b0 != null && !this.f713c0) {
            int bottom = this.f709W.getVisibility() == 0 ? (int) (((float) this.f709W.getBottom()) + this.f709W.getTranslationY() + 0.5f) : 0;
            this.f711b0.setBounds(0, bottom, getWidth(), this.f711b0.getIntrinsicHeight() + bottom);
            this.f711b0.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1089e() {
        mo1101j();
        return this.f710a0.mo1497e();
    }

    /* renamed from: f */
    public boolean mo1090f() {
        mo1101j();
        return this.f710a0.mo1498f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo1101j();
        int w = C4187x.m14408w(this) & 256;
        boolean a = m969a((View) this.f709W, rect, true, true, false, true);
        this.f723m0.set(rect);
        C0302z0.m1634a(this, this.f723m0, this.f720j0);
        if (!this.f724n0.equals(this.f723m0)) {
            this.f724n0.set(this.f723m0);
            a = true;
        }
        if (!this.f721k0.equals(this.f720j0)) {
            this.f721k0.set(this.f720j0);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1092g() {
        mo1101j();
        return this.f710a0.mo1499g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f709W;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f733w0.mo14822a();
    }

    public CharSequence getTitle() {
        mo1101j();
        return this.f710a0.getTitle();
    }

    /* renamed from: h */
    public void mo1099h() {
        mo1101j();
        this.f710a0.mo1501h();
    }

    /* renamed from: i */
    public boolean mo1100i() {
        return this.f714d0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1101j() {
        if (this.f708V == null) {
            this.f708V = (ContentFrameLayout) findViewById(C3863f.action_bar_activity_content);
            this.f709W = (ActionBarContainer) findViewById(C3863f.action_bar_container);
            this.f710a0 = m966a(findViewById(C3863f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m967a(getContext());
        C4187x.m14345J(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1083b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0164e eVar = (C0164e) childAt.getLayoutParams();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1101j();
        measureChildWithMargins(this.f709W, i, 0, i2, 0);
        C0164e eVar = (C0164e) this.f709W.getLayoutParams();
        int max = Math.max(0, this.f709W.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f709W.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f709W.getMeasuredState());
        boolean z = (C4187x.m14408w(this) & 256) != 0;
        if (z) {
            i3 = this.f712c;
            if (this.f715e0 && this.f709W.getTabContainer() != null) {
                i3 += this.f712c;
            }
        } else {
            i3 = this.f709W.getVisibility() != 8 ? this.f709W.getMeasuredHeight() : 0;
        }
        this.f722l0.set(this.f720j0);
        this.f725o0.set(this.f723m0);
        if (this.f714d0 || z) {
            Rect rect = this.f725o0;
            rect.top += i3;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f722l0;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m969a((View) this.f708V, this.f722l0, true, true, true, true);
        if (!this.f726p0.equals(this.f725o0)) {
            this.f726p0.set(this.f725o0);
            this.f708V.mo1211a(this.f725o0);
        }
        measureChildWithMargins(this.f708V, i, 0, i2, 0);
        C0164e eVar2 = (C0164e) this.f708V.getLayoutParams();
        int max3 = Math.max(max, this.f708V.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f708V.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f708V.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f716f0 || !z) {
            return false;
        }
        if (m968a(f, f2)) {
            m970k();
        } else {
            m973n();
        }
        this.f717g0 = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f718h0 += i2;
        setActionBarHideOffset(this.f718h0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f733w0.mo14825a(view, view2, i);
        this.f718h0 = getActionBarHideOffset();
        mo1083b();
        C0163d dVar = this.f727q0;
        if (dVar != null) {
            dVar.mo587d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f709W.getVisibility() != 0) {
            return false;
        }
        return this.f716f0;
    }

    public void onStopNestedScroll(View view) {
        if (this.f716f0 && !this.f717g0) {
            if (this.f718h0 <= this.f709W.getHeight()) {
                m972m();
            } else {
                m971l();
            }
        }
        C0163d dVar = this.f727q0;
        if (dVar != null) {
            dVar.mo585b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1101j();
        int i2 = this.f719i0 ^ i;
        this.f719i0 = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0163d dVar = this.f727q0;
        if (dVar != null) {
            dVar.mo584a(!z);
            if (z2 || !z) {
                this.f727q0.mo580a();
            } else {
                this.f727q0.mo586c();
            }
        }
        if ((i2 & 256) != 0 && this.f727q0 != null) {
            C4187x.m14345J(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f707U = i;
        C0163d dVar = this.f727q0;
        if (dVar != null) {
            dVar.mo582a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo1083b();
        this.f709W.setTranslationY((float) (-Math.max(0, Math.min(i, this.f709W.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0163d dVar) {
        this.f727q0 = dVar;
        if (getWindowToken() != null) {
            this.f727q0.mo582a(this.f707U);
            int i = this.f719i0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C4187x.m14345J(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f715e0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f716f0) {
            this.f716f0 = z;
            if (!z) {
                mo1083b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1101j();
        this.f710a0.setIcon(i);
    }

    public void setLogo(int i) {
        mo1101j();
        this.f710a0.mo1491b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f714d0 = z;
        this.f713c0 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo1101j();
        this.f710a0.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1101j();
        this.f710a0.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f707U = 0;
        this.f720j0 = new Rect();
        this.f721k0 = new Rect();
        this.f722l0 = new Rect();
        this.f723m0 = new Rect();
        this.f724n0 = new Rect();
        this.f725o0 = new Rect();
        this.f726p0 = new Rect();
        this.f730t0 = new C0160a();
        this.f731u0 = new C0161b();
        this.f732v0 = new C0162c();
        m967a(context);
        this.f733w0 = new C4181r(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1083b() {
        removeCallbacks(this.f731u0);
        removeCallbacks(this.f732v0);
        ViewPropertyAnimator viewPropertyAnimator = this.f729s0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public C0164e generateDefaultLayoutParams() {
        return new C0164e(-1, -1);
    }

    public C0164e generateLayoutParams(AttributeSet attributeSet) {
        return new C0164e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0164e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1101j();
        this.f710a0.setIcon(drawable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m969a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0164e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m969a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: a */
    public void mo1079a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1078a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public boolean mo1082a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: a */
    public void mo1077a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo1078a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo1080a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    private C0201a0 m966a(View view) {
        if (view instanceof C0201a0) {
            return (C0201a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private boolean m968a(float f, float f2) {
        this.f728r0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f728r0.getFinalY() > this.f709W.getHeight();
    }

    /* renamed from: a */
    public void mo1075a(int i) {
        mo1101j();
        if (i == 2) {
            this.f710a0.mo1506m();
        } else if (i == 5) {
            this.f710a0.mo1507n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public boolean mo1081a() {
        mo1101j();
        return this.f710a0.mo1489a();
    }

    /* renamed from: a */
    public void mo1076a(Menu menu, C0149a aVar) {
        mo1101j();
        this.f710a0.mo1486a(menu, aVar);
    }
}
