package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.widget.C0510f;
import java.lang.reflect.Field;
import p096e.p097a.C3858a;
import p096e.p097a.p100l.p101a.C3882c;
import p096e.p121h.p135s.C4135d0;

/* renamed from: androidx.appcompat.widget.c0 */
/* compiled from: DropDownListView */
class C0213c0 extends ListView {

    /* renamed from: U */
    private int f993U = 0;

    /* renamed from: V */
    private int f994V = 0;

    /* renamed from: W */
    private int f995W = 0;

    /* renamed from: a0 */
    private int f996a0 = 0;

    /* renamed from: b0 */
    private int f997b0;

    /* renamed from: c */
    private final Rect f998c = new Rect();

    /* renamed from: c0 */
    private Field f999c0;

    /* renamed from: d0 */
    private C0214a f1000d0;

    /* renamed from: e0 */
    private boolean f1001e0;

    /* renamed from: f0 */
    private boolean f1002f0;

    /* renamed from: g0 */
    private boolean f1003g0;

    /* renamed from: h0 */
    private C4135d0 f1004h0;

    /* renamed from: i0 */
    private C0510f f1005i0;

    /* renamed from: j0 */
    C0215b f1006j0;

    /* renamed from: androidx.appcompat.widget.c0$a */
    /* compiled from: DropDownListView */
    private static class C0214a extends C3882c {

        /* renamed from: U */
        private boolean f1007U = true;

        C0214a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1548a(boolean z) {
            this.f1007U = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1007U) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1007U) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1007U) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1007U) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1007U) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$b */
    /* compiled from: DropDownListView */
    private class C0215b implements Runnable {
        C0215b() {
        }

        /* renamed from: a */
        public void mo1554a() {
            C0213c0 c0Var = C0213c0.this;
            c0Var.f1006j0 = null;
            c0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1555b() {
            C0213c0.this.post(this);
        }

        public void run() {
            C0213c0 c0Var = C0213c0.this;
            c0Var.f1006j0 = null;
            c0Var.drawableStateChanged();
        }
    }

    C0213c0(Context context, boolean z) {
        super(context, null, C3858a.dropDownListViewStyle);
        this.f1002f0 = z;
        setCacheColorHint(0);
        try {
            this.f999c0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f999c0.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1221b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1216a(i, view);
        if (z2) {
            Rect rect = this.f998c;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0492a.m2635a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: c */
    private void m1223c() {
        Drawable selector = getSelector();
        if (selector != null && m1222b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0214a aVar = this.f1000d0;
        if (aVar != null) {
            aVar.mo1548a(z);
        }
    }

    /* renamed from: a */
    public int mo1535a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                i6 = MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i11 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                if (i5 >= 0 && i11 > i5 && i10 > 0 && i8 != i4) {
                    i4 = i10;
                }
                return i4;
            }
            if (i5 >= 0 && i11 >= i5) {
                i10 = i8;
            }
        }
        return i8;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m1218a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1006j0 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1223c();
        }
    }

    public boolean hasFocus() {
        return this.f1002f0 || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1002f0 || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1002f0 || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1002f0 && this.f1001e0) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1006j0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1006j0 == null) {
            this.f1006j0 = new C0215b();
            this.f1006j0.mo1555b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1223c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f997b0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0215b bVar = this.f1006j0;
        if (bVar != null) {
            bVar.mo1554a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f1001e0 = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1000d0 = drawable != null ? new C0214a(drawable) : null;
        super.setSelector(this.f1000d0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f993U = rect.left;
        this.f994V = rect.top;
        this.f995W = rect.right;
        this.f996a0 = rect.bottom;
    }

    /* renamed from: b */
    private boolean m1222b() {
        return this.f1003g0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1536a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1220a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m1219a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m1215a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f1005i0
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1005i0 = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f1005i0
            r9.mo2824a(r2)
            androidx.core.widget.f r9 = r7.f1005i0
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f1005i0
            if (r8 == 0) goto L_0x006c
            r8.mo2824a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0213c0.mo1536a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m1219a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m1218a(Canvas canvas) {
        if (!this.f998c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f998c);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m1217a(int i, View view, float f, float f2) {
        m1221b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0492a.m2635a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m1216a(int i, View view) {
        Rect rect = this.f998c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f993U;
        rect.top -= this.f994V;
        rect.right += this.f995W;
        rect.bottom += this.f996a0;
        try {
            boolean z = this.f999c0.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f999c0.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1215a() {
        this.f1003g0 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f997b0 - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C4135d0 d0Var = this.f1004h0;
        if (d0Var != null) {
            d0Var.mo14709a();
            this.f1004h0 = null;
        }
    }

    /* renamed from: a */
    private void m1220a(View view, int i, float f, float f2) {
        this.f1003g0 = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f997b0;
        if (i2 != -1) {
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f997b0 = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1217a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }
}
