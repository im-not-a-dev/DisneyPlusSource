package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C0900t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0802l;
import androidx.recyclerview.widget.RecyclerView.C0821w;
import net.danlew.android.joda.DateUtils;
import p096e.p146l.C4234l;

/* renamed from: androidx.leanback.widget.a */
/* compiled from: BaseGridView */
public abstract class C0638a extends RecyclerView {

    /* renamed from: C1 */
    final C0652f f2765C1 = new C0652f(this);

    /* renamed from: D1 */
    private boolean f2766D1 = true;

    /* renamed from: E1 */
    private boolean f2767E1 = true;

    /* renamed from: F1 */
    private C0802l f2768F1;

    /* renamed from: G1 */
    private C0642d f2769G1;

    /* renamed from: H1 */
    private C0641c f2770H1;

    /* renamed from: I1 */
    private C0640b f2771I1;

    /* renamed from: J1 */
    C0821w f2772J1;

    /* renamed from: K1 */
    private C0643e f2773K1;

    /* renamed from: L1 */
    int f2774L1 = 4;

    /* renamed from: androidx.leanback.widget.a$a */
    /* compiled from: BaseGridView */
    class C0639a implements C0821w {
        C0639a() {
        }

        /* renamed from: a */
        public void mo3729a(C0794d0 d0Var) {
            C0638a.this.f2765C1.mo3851a(d0Var);
            C0821w wVar = C0638a.this.f2772J1;
            if (wVar != null) {
                wVar.mo3729a(d0Var);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.a$b */
    /* compiled from: BaseGridView */
    public interface C0640b {
        /* renamed from: a */
        boolean mo3730a(KeyEvent keyEvent);
    }

    /* renamed from: androidx.leanback.widget.a$c */
    /* compiled from: BaseGridView */
    public interface C0641c {
        /* renamed from: a */
        boolean mo3731a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.leanback.widget.a$d */
    /* compiled from: BaseGridView */
    public interface C0642d {
        /* renamed from: a */
        boolean mo3732a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.leanback.widget.a$e */
    /* compiled from: BaseGridView */
    public interface C0643e {
        /* renamed from: a */
        boolean mo3733a(KeyEvent keyEvent);
    }

    C0638a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(this.f2765C1);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(DateUtils.FORMAT_ABBREV_RELATIVE);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C0900t) getItemAnimator()).mo5132a(false);
        super.setRecyclerListener(new C0639a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3659a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4234l.lbBaseGridView);
        this.f2765C1.mo3861a(obtainStyledAttributes.getBoolean(C4234l.lbBaseGridView_focusOutFront, false), obtainStyledAttributes.getBoolean(C4234l.lbBaseGridView_focusOutEnd, false));
        this.f2765C1.mo3881b(obtainStyledAttributes.getBoolean(C4234l.lbBaseGridView_focusOutSideStart, true), obtainStyledAttributes.getBoolean(C4234l.lbBaseGridView_focusOutSideEnd, true));
        this.f2765C1.mo3931z(obtainStyledAttributes.getDimensionPixelSize(C4234l.lbBaseGridView_android_verticalSpacing, obtainStyledAttributes.getDimensionPixelSize(C4234l.lbBaseGridView_verticalMargin, 0)));
        this.f2765C1.mo3916r(obtainStyledAttributes.getDimensionPixelSize(C4234l.lbBaseGridView_android_horizontalSpacing, obtainStyledAttributes.getDimensionPixelSize(C4234l.lbBaseGridView_horizontalMargin, 0)));
        if (obtainStyledAttributes.hasValue(C4234l.lbBaseGridView_android_gravity)) {
            setGravity(obtainStyledAttributes.getInt(C4234l.lbBaseGridView_android_gravity, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        C0641c cVar = this.f2770H1;
        if (cVar == null || !cVar.mo3731a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C0640b bVar = this.f2771I1;
        boolean z = true;
        if ((bVar != null && bVar.mo3730a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        C0643e eVar = this.f2773K1;
        if (eVar == null || !eVar.mo3733a(keyEvent)) {
            z = false;
        }
        return z;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0642d dVar = this.f2769G1;
        if (dVar == null || !dVar.mo3732a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public View focusSearch(int i) {
        if (isFocused()) {
            C0652f fVar = this.f2765C1;
            View c = fVar.mo4337c(fVar.mo3821O());
            if (c != null) {
                return focusSearch(c, i);
            }
        }
        return super.focusSearch(i);
    }

    public int getChildDrawingOrder(int i, int i2) {
        return this.f2765C1.mo3888d(this, i, i2);
    }

    public int getExtraLayoutSpace() {
        return this.f2765C1.mo3815I();
    }

    public int getFocusScrollStrategy() {
        return this.f2765C1.mo3816J();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f2765C1.mo3817K();
    }

    public int getHorizontalSpacing() {
        return this.f2765C1.mo3817K();
    }

    public int getInitialPrefetchItemCount() {
        return this.f2774L1;
    }

    public int getItemAlignmentOffset() {
        return this.f2765C1.mo3818L();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f2765C1.mo3819M();
    }

    public int getItemAlignmentViewId() {
        return this.f2765C1.mo3820N();
    }

    public C0643e getOnUnhandledKeyListener() {
        return this.f2773K1;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f2765C1.f2837g0.mo4086c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f2765C1.f2837g0.mo4089d();
    }

    public int getSelectedPosition() {
        return this.f2765C1.mo3821O();
    }

    public int getSelectedSubPosition() {
        return this.f2765C1.mo3823Q();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f2765C1.mo3825S();
    }

    public int getVerticalSpacing() {
        return this.f2765C1.mo3825S();
    }

    public int getWindowAlignment() {
        return this.f2765C1.mo3826T();
    }

    public int getWindowAlignmentOffset() {
        return this.f2765C1.mo3827U();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f2765C1.mo3828V();
    }

    public boolean hasOverlappingRendering() {
        return this.f2767E1;
    }

    /* renamed from: i */
    public void mo3684i(int i) {
        if (this.f2765C1.mo3883b0()) {
            this.f2765C1.mo3873b(i, 0, 0);
        } else {
            super.mo3684i(i);
        }
    }

    /* renamed from: j */
    public void mo3685j(int i) {
        if (this.f2765C1.mo3883b0()) {
            this.f2765C1.mo3873b(i, 0, 0);
        } else {
            super.mo3685j(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f2765C1.mo3860a(z, i, rect);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        return this.f2765C1.mo3865a((RecyclerView) this, i, rect);
    }

    public void onRtlPropertiesChanged(int i) {
        this.f2765C1.mo3908m(i);
    }

    public void setAnimateChildLayout(boolean z) {
        if (this.f2766D1 != z) {
            this.f2766D1 = z;
            if (!this.f2766D1) {
                this.f2768F1 = getItemAnimator();
                super.setItemAnimator(null);
                return;
            }
            super.setItemAnimator(this.f2768F1);
        }
    }

    public void setChildrenVisibility(int i) {
        this.f2765C1.mo3909n(i);
    }

    public void setExtraLayoutSpace(int i) {
        this.f2765C1.mo3910o(i);
    }

    public void setFocusDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setFocusScrollStrategy(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f2765C1.mo3911p(i);
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid scrollStrategy");
    }

    public final void setFocusSearchDisabled(boolean z) {
        setDescendantFocusability(z ? 393216 : DateUtils.FORMAT_ABBREV_RELATIVE);
        this.f2765C1.mo3880b(z);
    }

    public void setGravity(int i) {
        this.f2765C1.mo3914q(i);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z) {
        this.f2767E1 = z;
    }

    @Deprecated
    public void setHorizontalMargin(int i) {
        setHorizontalSpacing(i);
    }

    public void setHorizontalSpacing(int i) {
        this.f2765C1.mo3916r(i);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.f2774L1 = i;
    }

    public void setItemAlignmentOffset(int i) {
        this.f2765C1.mo3918s(i);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        this.f2765C1.mo3840a(f);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z) {
        this.f2765C1.mo3886c(z);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i) {
        this.f2765C1.mo3920t(i);
    }

    @Deprecated
    public void setItemMargin(int i) {
        setItemSpacing(i);
    }

    public void setItemSpacing(int i) {
        this.f2765C1.mo3922u(i);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z) {
        this.f2765C1.mo3891d(z);
    }

    public void setOnChildLaidOutListener(C0672m mVar) {
        this.f2765C1.mo3848a(mVar);
    }

    public void setOnChildSelectedListener(C0673n nVar) {
        this.f2765C1.mo3849a(nVar);
    }

    public void setOnChildViewHolderSelectedListener(C0674o oVar) {
        this.f2765C1.mo3850a(oVar);
    }

    public void setOnKeyInterceptListener(C0640b bVar) {
        this.f2771I1 = bVar;
    }

    public void setOnMotionInterceptListener(C0641c cVar) {
        this.f2770H1 = cVar;
    }

    public void setOnTouchInterceptListener(C0642d dVar) {
        this.f2769G1 = dVar;
    }

    public void setOnUnhandledKeyListener(C0643e eVar) {
        this.f2773K1 = eVar;
    }

    public void setPruneChild(boolean z) {
        this.f2765C1.mo3896e(z);
    }

    public void setRecyclerListener(C0821w wVar) {
        this.f2772J1 = wVar;
    }

    public final void setSaveChildrenLimitNumber(int i) {
        this.f2765C1.f2837g0.mo4084b(i);
    }

    public final void setSaveChildrenPolicy(int i) {
        this.f2765C1.f2837g0.mo4087c(i);
    }

    public void setScrollEnabled(boolean z) {
        this.f2765C1.mo3899f(z);
    }

    public void setSelectedPosition(int i) {
        this.f2765C1.mo3894e(i, 0);
    }

    public void setSelectedPositionSmooth(int i) {
        this.f2765C1.mo3929y(i);
    }

    @Deprecated
    public void setVerticalMargin(int i) {
        setVerticalSpacing(i);
    }

    public void setVerticalSpacing(int i) {
        this.f2765C1.mo3931z(i);
        requestLayout();
    }

    public void setWindowAlignment(int i) {
        this.f2765C1.mo3808A(i);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i) {
        this.f2765C1.mo3809B(i);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        this.f2765C1.mo3872b(f);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z) {
        this.f2765C1.f2832b0.mo3734a().mo3744a(z);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z) {
        this.f2765C1.f2832b0.mo3734a().mo3748b(z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final boolean mo3728z() {
        return isChildrenDrawingOrderEnabled();
    }
}
