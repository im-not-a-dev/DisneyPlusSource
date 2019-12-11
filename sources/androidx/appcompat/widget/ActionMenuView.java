package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0132g;
import androidx.appcompat.view.menu.C0132g.C0133a;
import androidx.appcompat.view.menu.C0132g.C0134b;
import androidx.appcompat.view.menu.C0137j;
import androidx.appcompat.view.menu.C0148n;
import androidx.appcompat.view.menu.C0148n.C0149a;
import androidx.appcompat.view.menu.C0150o;
import androidx.appcompat.widget.C0224f0.C0225a;

public class ActionMenuView extends C0224f0 implements C0134b, C0150o {

    /* renamed from: l0 */
    private C0132g f737l0;

    /* renamed from: m0 */
    private Context f738m0;

    /* renamed from: n0 */
    private int f739n0;

    /* renamed from: o0 */
    private boolean f740o0;

    /* renamed from: p0 */
    private C0205c f741p0;

    /* renamed from: q0 */
    private C0149a f742q0;

    /* renamed from: r0 */
    C0133a f743r0;

    /* renamed from: s0 */
    private boolean f744s0;

    /* renamed from: t0 */
    private int f745t0;

    /* renamed from: u0 */
    private int f746u0;

    /* renamed from: v0 */
    private int f747v0;

    /* renamed from: w0 */
    C0169e f748w0;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0165a {
        /* renamed from: b */
        boolean mo614b();

        /* renamed from: c */
        boolean mo615c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0166b implements C0149a {
        C0166b() {
        }

        /* renamed from: a */
        public void mo533a(C0132g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo534a(C0132g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0167c extends C0225a {
        @ExportedProperty

        /* renamed from: c */
        public boolean f749c;
        @ExportedProperty

        /* renamed from: d */
        public int f750d;
        @ExportedProperty

        /* renamed from: e */
        public int f751e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f752f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f753g;

        /* renamed from: h */
        boolean f754h;

        public C0167c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0167c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0167c(C0167c cVar) {
            super(cVar);
            this.f749c = cVar.f749c;
        }

        public C0167c(int i, int i2) {
            super(i, i2);
            this.f749c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0168d implements C0133a {
        C0168d() {
        }

        /* renamed from: a */
        public boolean mo500a(C0132g gVar, MenuItem menuItem) {
            C0169e eVar = ActionMenuView.this.f748w0;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: a */
        public void mo497a(C0132g gVar) {
            C0133a aVar = ActionMenuView.this.f743r0;
            if (aVar != null) {
                aVar.mo497a(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0169e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static int m998a(View view, int i, int i2, int i3, int i4) {
        C0167c cVar = (C0167c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo616d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f749c || !z2) {
            z = false;
        }
        cVar.f752f = z;
        cVar.f750d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: c */
    private void m999c(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f746u0;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = i11;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i20 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z4) {
                    int i22 = this.f747v0;
                    i8 = i21;
                    z2 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = i21;
                    z2 = false;
                }
                C0167c cVar = (C0167c) childAt.getLayoutParams();
                cVar.f754h = z2;
                cVar.f751e = z2 ? 1 : 0;
                cVar.f750d = z2;
                cVar.f752f = z2;
                cVar.leftMargin = z2;
                cVar.rightMargin = z2;
                cVar.f753g = z4 && ((ActionMenuItemView) childAt).mo616d();
                int a = m998a(childAt, i13, cVar.f749c ? 1 : i14, childMeasureSpec, paddingTop);
                int max = Math.max(i18, a);
                if (cVar.f752f) {
                    i19++;
                }
                if (cVar.f749c) {
                    z3 = true;
                }
                i14 -= a;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i15);
                    i16 = i16;
                } else {
                    int i23 = i16;
                }
                i18 = max;
                i17 = i8;
            }
            i15++;
            size2 = i20;
        }
        int i24 = size2;
        boolean z5 = z3 && i17 == 2;
        boolean z6 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                i5 = mode;
                i3 = i9;
                z = z6;
                i4 = i16;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount) {
                    boolean z7 = z6;
                    C0167c cVar2 = (C0167c) getChildAt(i26).getLayoutParams();
                    int i28 = i16;
                    if (cVar2.f752f) {
                        int i29 = cVar2.f750d;
                        if (i29 < i25) {
                            i25 = i29;
                            j2 = 1 << i26;
                            i27 = 1;
                        } else if (i29 == i25) {
                            j2 |= 1 << i26;
                            i27++;
                        }
                    }
                    i26++;
                    i16 = i28;
                    z6 = z7;
                }
                z = z6;
                i4 = i16;
                j |= j2;
                if (i27 > i14) {
                    i5 = mode;
                    i3 = i9;
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt2 = getChildAt(i31);
                    C0167c cVar3 = (C0167c) childAt2.getLayoutParams();
                    int i32 = i9;
                    int i33 = mode;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f750d == i30) {
                            j |= j3;
                        }
                        i7 = i30;
                    } else {
                        if (!z5 || !cVar3.f753g || i14 != 1) {
                            i7 = i30;
                        } else {
                            int i34 = this.f747v0;
                            i7 = i30;
                            childAt2.setPadding(i34 + i13, 0, i34, 0);
                        }
                        cVar3.f750d++;
                        cVar3.f754h = true;
                        i14--;
                    }
                    i31++;
                    mode = i33;
                    i30 = i7;
                    i9 = i32;
                }
                i16 = i4;
                z6 = true;
            }
        }
        boolean z8 = !z3 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z8 && i18 <= 1)) {
            i6 = 0;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z8) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0167c) getChildAt(0).getLayoutParams()).f753g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((C0167c) getChildAt(i35).getLayoutParams()).f753g) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i14 * i13)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0167c cVar4 = (C0167c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f751e = i36;
                        cVar4.f754h = true;
                        if (i37 == 0 && !cVar4.f753g) {
                            cVar4.leftMargin = (-i36) / 2;
                        }
                    } else if (cVar4.f749c) {
                        cVar4.f751e = i36;
                        cVar4.f754h = true;
                        cVar4.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            cVar4.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            cVar4.rightMargin = i36 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0167c cVar5 = (C0167c) childAt4.getLayoutParams();
                if (cVar5.f754h) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((cVar5.f750d * i13) + cVar5.f751e, 1073741824), childMeasureSpec);
                }
                i6++;
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i24);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0167c;
    }

    /* renamed from: d */
    public void mo1134d() {
        C0205c cVar = this.f741p0;
        if (cVar != null) {
            cVar.mo1524c();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0167c mo1137e() {
        C0167c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f749c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean mo1138f() {
        C0205c cVar = this.f741p0;
        return cVar != null && cVar.mo1526e();
    }

    /* renamed from: g */
    public boolean mo1139g() {
        C0205c cVar = this.f741p0;
        return cVar != null && cVar.mo1528g();
    }

    public Menu getMenu() {
        if (this.f737l0 == null) {
            Context context = getContext();
            this.f737l0 = new C0132g(context);
            this.f737l0.mo776a((C0133a) new C0168d());
            this.f741p0 = new C0205c(context);
            this.f741p0.mo1523c(true);
            C0205c cVar = this.f741p0;
            C0149a aVar = this.f742q0;
            if (aVar == null) {
                aVar = new C0166b();
            }
            cVar.mo712a(aVar);
            this.f737l0.mo778a((C0148n) this.f741p0, this.f738m0);
            this.f741p0.mo1521a(this);
        }
        return this.f737l0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f741p0.mo1525d();
    }

    public int getPopupTheme() {
        return this.f739n0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo1147h() {
        C0205c cVar = this.f741p0;
        return cVar != null && cVar.mo1529h();
    }

    /* renamed from: i */
    public boolean mo1148i() {
        return this.f740o0;
    }

    /* renamed from: j */
    public C0132g mo1149j() {
        return this.f737l0;
    }

    /* renamed from: k */
    public boolean mo1150k() {
        C0205c cVar = this.f741p0;
        return cVar != null && cVar.mo1530i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0205c cVar = this.f741p0;
        if (cVar != null) {
            cVar.mo713a(false);
            if (this.f741p0.mo1529h()) {
                this.f741p0.mo1526e();
                this.f741p0.mo1530i();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1134d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f744s0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0302z0.m1635a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0167c cVar = (C0167c) childAt.getLayoutParams();
                if (cVar.f749c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1135d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo1135d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0167c cVar2 = (C0167c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f749c) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0167c cVar3 = (C0167c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f749c) {
                    int i21 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f744s0;
        this.f744s0 = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f744s0) {
            this.f745t0 = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f744s0) {
            C0132g gVar = this.f737l0;
            if (!(gVar == null || size == this.f745t0)) {
                this.f745t0 = size;
                gVar.mo798b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f744s0 || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0167c cVar = (C0167c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m999c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f741p0.mo1522b(z);
    }

    public void setOnMenuItemClickListener(C0169e eVar) {
        this.f748w0 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f741p0.mo1520a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f740o0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f739n0 != i) {
            this.f739n0 = i;
            if (i == 0) {
                this.f738m0 = getContext();
            } else {
                this.f738m0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0205c cVar) {
        this.f741p0 = cVar;
        this.f741p0.mo1521a(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f746u0 = (int) (56.0f * f);
        this.f747v0 = (int) (f * 4.0f);
        this.f738m0 = context;
        this.f739n0 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1135d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0165a)) {
            z = false | ((C0165a) childAt).mo614b();
        }
        if (i > 0 && (childAt2 instanceof C0165a)) {
            z |= ((C0165a) childAt2).mo615c();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public C0167c generateDefaultLayoutParams() {
        C0167c cVar = new C0167c(-2, -2);
        cVar.f1047b = 16;
        return cVar;
    }

    public C0167c generateLayoutParams(AttributeSet attributeSet) {
        return new C0167c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0167c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0167c cVar = layoutParams instanceof C0167c ? new C0167c((C0167c) layoutParams) : new C0167c(layoutParams);
        if (cVar.f1047b <= 0) {
            cVar.f1047b = 16;
        }
        return cVar;
    }

    /* renamed from: a */
    public boolean mo635a(C0137j jVar) {
        return this.f737l0.mo781a((MenuItem) jVar, 0);
    }

    /* renamed from: a */
    public void mo634a(C0132g gVar) {
        this.f737l0 = gVar;
    }

    /* renamed from: a */
    public void mo1132a(C0149a aVar, C0133a aVar2) {
        this.f742q0 = aVar;
        this.f743r0 = aVar2;
    }
}
