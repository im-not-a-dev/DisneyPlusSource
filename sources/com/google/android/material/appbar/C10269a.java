package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p096e.p121h.p135s.C4187x;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: HeaderBehavior */
abstract class C10269a<V extends View> extends C10272c<V> {

    /* renamed from: d */
    private Runnable f24126d;

    /* renamed from: e */
    OverScroller f24127e;

    /* renamed from: f */
    private boolean f24128f;

    /* renamed from: g */
    private int f24129g = -1;

    /* renamed from: h */
    private int f24130h;

    /* renamed from: i */
    private int f24131i = -1;

    /* renamed from: j */
    private VelocityTracker f24132j;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* compiled from: HeaderBehavior */
    private class C10270a implements Runnable {

        /* renamed from: U */
        private final V f24133U;

        /* renamed from: c */
        private final CoordinatorLayout f24135c;

        C10270a(CoordinatorLayout coordinatorLayout, V v) {
            this.f24135c = coordinatorLayout;
            this.f24133U = v;
        }

        public void run() {
            if (this.f24133U != null) {
                OverScroller overScroller = C10269a.this.f24127e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    C10269a aVar = C10269a.this;
                    aVar.mo26369c(this.f24135c, this.f24133U, aVar.f24127e.getCurrY());
                    C4187x.m14363a((View) this.f24133U, (Runnable) this);
                    return;
                }
                C10269a.this.mo26354e(this.f24135c, this.f24133U);
            }
        }
    }

    public C10269a() {
    }

    /* renamed from: d */
    private void m32097d() {
        if (this.f24132j == null) {
            this.f24132j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo26342a(V v);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2530a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f24131i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f24131i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f24128f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f24129g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f24130h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f24131i
            if (r6 <= r0) goto L_0x0083
            r4.f24128f = r2
            r4.f24130h = r5
            goto L_0x0083
        L_0x0051:
            r4.f24128f = r3
            r4.f24129g = r5
            android.view.VelocityTracker r5 = r4.f24132j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f24132j = r5
            goto L_0x0083
        L_0x0060:
            r4.f24128f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo26342a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo2473a(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f24130h = r1
            int r5 = r7.getPointerId(r3)
            r4.f24129g = r5
            r4.m32097d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f24132j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f24128f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C10269a.mo2530a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo26347b(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo26348b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2535b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f24131i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f24131i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f24129g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f24130h
            int r2 = r2 - r0
            boolean r3 = r11.f24128f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f24131i
            if (r3 <= r4) goto L_0x0049
            r11.f24128f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f24128f
            if (r2 == 0) goto L_0x00ae
            r11.f24130h = r0
            int r7 = r11.mo26347b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo26367a(r4, (V) r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f24132j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f24132j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f24132j
            int r4 = r11.f24129g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo26352c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo26368a(r6, (V) r7, r8, r9, r10)
        L_0x007e:
            r11.f24128f = r2
            r11.f24129g = r3
            android.view.VelocityTracker r12 = r11.f24132j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f24132j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo2473a(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo26342a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f24130h = r3
            int r12 = r14.getPointerId(r2)
            r11.f24129g = r12
            r11.m32097d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f24132j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C10269a.mo2535b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo26351c();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo26352c(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo26369c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo26348b(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo26354e(CoordinatorLayout coordinatorLayout, V v);

    public C10269a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo26367a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo26348b(coordinatorLayout, v, mo26351c() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26368a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f24126d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f24126d = null;
        }
        if (this.f24127e == null) {
            this.f24127e = new OverScroller(v.getContext());
        }
        this.f24127e.fling(0, mo26377b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f24127e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f24126d = new C10270a(coordinatorLayout, v);
            C4187x.m14363a((View) v, this.f24126d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo26354e(coordinatorLayout, v);
        return false;
    }
}
