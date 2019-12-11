package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0446f;
import java.util.List;
import p096e.p121h.p128m.C4062a;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4147h0;
import p096e.p121h.p135s.C4187x;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: HeaderScrollingViewBehavior */
abstract class C10271b extends C10272c<View> {

    /* renamed from: d */
    final Rect f24136d = new Rect();

    /* renamed from: e */
    final Rect f24137e = new Rect();

    /* renamed from: f */
    private int f24138f = 0;

    /* renamed from: g */
    private int f24139g;

    public C10271b() {
    }

    /* renamed from: c */
    private static int m32109c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo26360a(List<View> list);

    /* renamed from: a */
    public boolean mo2527a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo26360a(coordinatorLayout.mo2474b(view));
            if (a != null) {
                if (!C4187x.m14396k(a) || C4187x.m14396k(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C4187x.m14366a(view, true);
                    if (C4187x.m14396k(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.mo2469a(view, i, i2, MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + mo26362c(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract float mo26361b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26373b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo26360a(coordinatorLayout.mo2474b(view));
        if (a != null) {
            C0446f fVar = (C0446f) view.getLayoutParams();
            Rect rect = this.f24136d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C4147h0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C4187x.m14396k(coordinatorLayout) && !C4187x.m14396k(view)) {
                rect.left += lastWindowInsets.mo14722c();
                rect.right -= lastWindowInsets.mo14723d();
            }
            Rect rect2 = this.f24137e;
            C4139e.m14174a(m32109c(fVar.f2030c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo26371a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            this.f24138f = rect2.top - a.getBottom();
            return;
        }
        super.mo26373b(coordinatorLayout, view, i);
        this.f24138f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo26362c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo26375d() {
        return this.f24138f;
    }

    /* renamed from: c */
    public final int mo26374c() {
        return this.f24139g;
    }

    public C10271b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo26371a(View view) {
        if (this.f24139g == 0) {
            return 0;
        }
        float b = mo26361b(view);
        int i = this.f24139g;
        return C4062a.m13967a((int) (b * ((float) i)), 0, i);
    }

    /* renamed from: b */
    public final void mo26372b(int i) {
        this.f24139g = i;
    }
}
