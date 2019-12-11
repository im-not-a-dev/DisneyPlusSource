package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: LinearLayoutCompat */
public class C0224f0 extends ViewGroup {

    /* renamed from: U */
    private int f1031U;

    /* renamed from: V */
    private int f1032V;

    /* renamed from: W */
    private int f1033W;

    /* renamed from: a0 */
    private int f1034a0;

    /* renamed from: b0 */
    private int f1035b0;

    /* renamed from: c */
    private boolean f1036c;

    /* renamed from: c0 */
    private float f1037c0;

    /* renamed from: d0 */
    private boolean f1038d0;

    /* renamed from: e0 */
    private int[] f1039e0;

    /* renamed from: f0 */
    private int[] f1040f0;

    /* renamed from: g0 */
    private Drawable f1041g0;

    /* renamed from: h0 */
    private int f1042h0;

    /* renamed from: i0 */
    private int f1043i0;

    /* renamed from: j0 */
    private int f1044j0;

    /* renamed from: k0 */
    private int f1045k0;

    /* renamed from: androidx.appcompat.widget.f0$a */
    /* compiled from: LinearLayoutCompat */
    public static class C0225a extends MarginLayoutParams {

        /* renamed from: a */
        public float f1046a;

        /* renamed from: b */
        public int f1047b;

        public C0225a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1047b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.LinearLayoutCompat_Layout);
            this.f1046a = obtainStyledAttributes.getFloat(C3867j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1047b = obtainStyledAttributes.getInt(C3867j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0225a(int i, int i2) {
            super(i, i2);
            this.f1047b = -1;
            this.f1046a = 0.0f;
        }

        public C0225a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1047b = -1;
        }
    }

    public C0224f0(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m1252c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1585a(i3);
            if (a.getVisibility() != 8) {
                C0225a aVar = (C0225a) a.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m1253d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1585a(i3);
            if (a.getVisibility() != 8) {
                C0225a aVar = (C0225a) a.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1583a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1584a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1588a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0302z0.m1635a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View a2 = mo1585a(i5);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo1596b(i5))) {
                C0225a aVar = (C0225a) a2.getLayoutParams();
                if (a) {
                    i4 = a2.getRight() + aVar.rightMargin;
                } else {
                    i4 = (a2.getLeft() - aVar.leftMargin) - this.f1042h0;
                }
                mo1595b(canvas, i4);
            }
        }
        if (mo1596b(virtualChildCount)) {
            View a3 = mo1585a(virtualChildCount - 1);
            if (a3 != null) {
                C0225a aVar2 = (C0225a) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft() - aVar2.leftMargin;
                    i2 = this.f1042h0;
                } else {
                    i = a3.getRight() + aVar2.rightMargin;
                    mo1595b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo1595b(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.f1042h0;
            }
            i = i3 - i2;
            mo1595b(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1591b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1594b(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a = mo1585a(i2);
            if (!(a == null || a.getVisibility() == 8 || !mo1596b(i2))) {
                mo1589a(canvas, (a.getTop() - ((C0225a) a.getLayoutParams()).topMargin) - this.f1043i0);
            }
        }
        if (mo1596b(virtualChildCount)) {
            View a2 = mo1585a(virtualChildCount - 1);
            if (a2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f1043i0;
            } else {
                i = a2.getBottom() + ((C0225a) a2.getLayoutParams()).bottomMargin;
            }
            mo1589a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1597c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0225a;
    }

    public int getBaseline() {
        if (this.f1031U < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f1031U;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f1032V;
                if (this.f1033W == 1) {
                    int i3 = this.f1034a0 & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1035b0) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1035b0;
                        }
                    }
                }
                return i2 + ((C0225a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1031U == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1031U;
    }

    public Drawable getDividerDrawable() {
        return this.f1041g0;
    }

    public int getDividerPadding() {
        return this.f1045k0;
    }

    public int getDividerWidth() {
        return this.f1042h0;
    }

    public int getGravity() {
        return this.f1034a0;
    }

    public int getOrientation() {
        return this.f1033W;
    }

    public int getShowDividers() {
        return this.f1044j0;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1037c0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1041g0 != null) {
            if (this.f1033W == 1) {
                mo1594b(canvas);
            } else {
                mo1588a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1033W == 1) {
            mo1593b(i, i2, i3, i4);
        } else {
            mo1587a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1033W == 1) {
            mo1592b(i, i2);
        } else {
            mo1586a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1036c = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f1031U = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1041g0) {
            this.f1041g0 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1042h0 = drawable.getIntrinsicWidth();
                this.f1043i0 = drawable.getIntrinsicHeight();
            } else {
                this.f1042h0 = 0;
                this.f1043i0 = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1045k0 = i;
    }

    public void setGravity(int i) {
        if (this.f1034a0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1034a0 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1034a0;
        if ((8388615 & i3) != i2) {
            this.f1034a0 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1038d0 = z;
    }

    public void setOrientation(int i) {
        if (this.f1033W != i) {
            this.f1033W = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1044j0) {
            requestLayout();
        }
        this.f1044j0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1034a0;
        if ((i3 & 112) != i2) {
            this.f1034a0 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1037c0 = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0224f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public C0225a generateDefaultLayoutParams() {
        int i = this.f1033W;
        if (i == 0) {
            return new C0225a(-2, -2);
        }
        if (i == 1) {
            return new C0225a(-1, -2);
        }
        return null;
    }

    public C0224f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1036c = true;
        this.f1031U = -1;
        this.f1032V = 0;
        this.f1034a0 = 8388659;
        C0284t0 a = C0284t0.m1486a(context, attributeSet, C3867j.LinearLayoutCompat, i, 0);
        int d = a.mo1915d(C3867j.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.mo1915d(C3867j.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.mo1909a(C3867j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f1037c0 = a.mo1910b(C3867j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1031U = a.mo1915d(C3867j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1038d0 = a.mo1909a(C3867j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo1912b(C3867j.LinearLayoutCompat_divider));
        this.f1044j0 = a.mo1915d(C3867j.LinearLayoutCompat_showDividers, 0);
        this.f1045k0 = a.mo1913c(C3867j.LinearLayoutCompat_dividerPadding, 0);
        a.mo1908a();
    }

    public C0225a generateLayoutParams(AttributeSet attributeSet) {
        return new C0225a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0225a generateLayoutParams(LayoutParams layoutParams) {
        return new C0225a(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1595b(Canvas canvas, int i) {
        this.f1041g0.setBounds(i, getPaddingTop() + this.f1045k0, this.f1042h0 + i, (getHeight() - getPaddingBottom()) - this.f1045k0);
        this.f1041g0.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1589a(Canvas canvas, int i) {
        this.f1041g0.setBounds(getPaddingLeft() + this.f1045k0, i, (getWidth() - getPaddingRight()) - this.f1045k0, this.f1043i0 + i);
        this.f1041g0.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1596b(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f1044j0 & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f1044j0 & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f1044j0 & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo1585a(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1586a(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f1035b0 = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f1039e0
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1040f0
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f1039e0 = r0
            int[] r0 = new int[r14]
            r7.f1040f0 = r0
        L_0x0026:
            int[] r15 = r7.f1039e0
            int[] r6 = r7.f1040f0
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1036c
            boolean r3 = r7.f1038d0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0202
            android.view.View r6 = r7.mo1585a(r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f1035b0
            int r6 = r7.mo1597c(r1)
            int r5 = r5 + r6
            r7.f1035b0 = r5
        L_0x0076:
            r33 = r3
            r37 = r4
            goto L_0x01f2
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0088
            int r5 = r7.mo1584a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x0088:
            boolean r5 = r7.mo1596b(r1)
            if (r5 == 0) goto L_0x0095
            int r5 = r7.f1035b0
            int r10 = r7.f1042h0
            int r5 = r5 + r10
            r7.f1035b0 = r5
        L_0x0095:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.f0$a r10 = (androidx.appcompat.widget.C0224f0.C0225a) r10
            float r5 = r10.f1046a
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00eb
            int r0 = r10.width
            if (r0 != 0) goto L_0x00eb
            float r0 = r10.f1046a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            if (r19 == 0) goto L_0x00b9
            int r0 = r7.f1035b0
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f1035b0 = r0
            goto L_0x00c7
        L_0x00b9:
            int r0 = r7.f1035b0
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f1035b0 = r0
        L_0x00c7:
            if (r4 == 0) goto L_0x00dc
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x0167
        L_0x00dc:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r31 = -2
            goto L_0x0169
        L_0x00eb:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00fa
            float r0 = r10.f1046a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fa
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fd
        L_0x00fa:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fd:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            int r0 = r7.f1035b0
            r30 = r0
            goto L_0x0108
        L_0x0106:
            r30 = 0
        L_0x0108:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r40
            r30 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            r6 = r34
            r0.mo1590a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x0131
            r10.width = r0
        L_0x0131:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x014a
            int r1 = r7.f1035b0
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo1591b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.f1035b0 = r1
            goto L_0x0161
        L_0x014a:
            r3 = r30
            int r1 = r7.f1035b0
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo1591b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1035b0 = r1
        L_0x0161:
            if (r33 == 0) goto L_0x0167
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0167:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0169:
            if (r13 == r1) goto L_0x0174
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0174
            r0 = 1
            r28 = 1
            goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01b4
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01b4
            int r9 = r10.f1047b
            if (r9 >= 0) goto L_0x0198
            int r9 = r7.f1034a0
        L_0x0198:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01b4:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01c3
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01c3
            r6 = 1
            goto L_0x01c4
        L_0x01c3:
            r6 = 0
        L_0x01c4:
            float r9 = r10.f1046a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d5
            if (r0 == 0) goto L_0x01cd
            goto L_0x01ce
        L_0x01cd:
            r2 = r4
        L_0x01ce:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e2
        L_0x01d5:
            r10 = r23
            if (r0 == 0) goto L_0x01da
            r4 = r2
        L_0x01da:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
        L_0x01e2:
            r10 = r35
            int r0 = r7.mo1584a(r3, r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x01f2:
            int r1 = r1 + 1
            r9 = r40
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x0202:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f1035b0
            if (r3 <= 0) goto L_0x0223
            boolean r3 = r7.mo1596b(r11)
            if (r3 == 0) goto L_0x0223
            int r3 = r7.f1035b0
            int r4 = r7.f1042h0
            int r3 = r3 + r4
            r7.f1035b0 = r3
        L_0x0223:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x0239
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x0239
            r3 = r15[r17]
            if (r3 != r4) goto L_0x0239
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r23 = r6
            goto L_0x026a
        L_0x0239:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x026a:
            if (r33 == 0) goto L_0x02cd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0272
            if (r12 != 0) goto L_0x02cd
        L_0x0272:
            r3 = 0
            r7.f1035b0 = r3
            r3 = 0
        L_0x0276:
            if (r3 >= r11) goto L_0x02cd
            android.view.View r4 = r7.mo1585a(r3)
            if (r4 != 0) goto L_0x0288
            int r4 = r7.f1035b0
            int r5 = r7.mo1597c(r3)
            int r4 = r4 + r5
            r7.f1035b0 = r4
            goto L_0x0295
        L_0x0288:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0298
            int r4 = r7.mo1584a(r4, r3)
            int r3 = r3 + r4
        L_0x0295:
            r22 = r1
            goto L_0x02c8
        L_0x0298:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.f0$a r5 = (androidx.appcompat.widget.C0224f0.C0225a) r5
            if (r19 == 0) goto L_0x02b1
            int r6 = r7.f1035b0
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo1591b(r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f1035b0 = r6
            goto L_0x0295
        L_0x02b1:
            int r6 = r7.f1035b0
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo1591b(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f1035b0 = r1
        L_0x02c8:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0276
        L_0x02cd:
            r22 = r1
            int r1 = r7.f1035b0
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f1035b0 = r1
            int r1 = r7.f1035b0
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f1035b0
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x0340
            if (r3 == 0) goto L_0x02fc
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fc
            goto L_0x0340
        L_0x02fc:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0338
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0338
            r2 = 0
        L_0x0307:
            if (r2 >= r11) goto L_0x0338
            android.view.View r3 = r7.mo1585a(r2)
            if (r3 == 0) goto L_0x0335
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0318
            goto L_0x0335
        L_0x0318:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.f0$a r5 = (androidx.appcompat.widget.C0224f0.C0225a) r5
            float r5 = r5.f1046a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0335
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x0335:
            int r2 = r2 + 1
            goto L_0x0307
        L_0x0338:
            r3 = r40
            r26 = r11
            r2 = r22
            goto L_0x04e2
        L_0x0340:
            float r5 = r7.f1037c0
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0347
            r0 = r5
        L_0x0347:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f1035b0 = r6
            r10 = r2
            r9 = r23
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0361:
            if (r0 >= r11) goto L_0x0489
            android.view.View r14 = r7.mo1585a(r0)
            if (r14 == 0) goto L_0x0478
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x0373
            goto L_0x0478
        L_0x0373:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.f0$a r5 = (androidx.appcompat.widget.C0224f0.C0225a) r5
            float r4 = r5.f1046a
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03dc
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r11 = -1
            r3 = r40
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03ba
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03ae
            goto L_0x03bc
        L_0x03ae:
            if (r8 <= 0) goto L_0x03b1
            goto L_0x03b2
        L_0x03b1:
            r8 = 0
        L_0x03b2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            goto L_0x03cc
        L_0x03ba:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03bc:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03c5
            r8 = 0
        L_0x03c5:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
        L_0x03cc:
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x03e2
        L_0x03dc:
            r4 = r3
            r26 = r11
            r11 = -1
            r3 = r40
        L_0x03e2:
            if (r19 == 0) goto L_0x03ff
            int r8 = r7.f1035b0
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo1591b(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f1035b0 = r8
            r23 = r2
            goto L_0x0419
        L_0x03ff:
            int r8 = r7.f1035b0
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo1591b(r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f1035b0 = r2
        L_0x0419:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x0424
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x0424
            r2 = 1
            goto L_0x0425
        L_0x0424:
            r2 = 0
        L_0x0425:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0436
            goto L_0x0437
        L_0x0436:
            r8 = r11
        L_0x0437:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x0444
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x0445
            r8 = 1
            goto L_0x0446
        L_0x0444:
            r10 = -1
        L_0x0445:
            r8 = 0
        L_0x0446:
            if (r37 == 0) goto L_0x0470
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0470
            int r5 = r5.f1047b
            if (r5 >= 0) goto L_0x0454
            int r5 = r7.f1034a0
        L_0x0454:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x0472
        L_0x0470:
            r24 = 4
        L_0x0472:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x047f
        L_0x0478:
            r4 = r3
            r26 = r11
            r24 = 4
            r3 = r40
        L_0x047f:
            int r0 = r0 + 1
            r8 = r39
            r3 = r4
            r11 = r26
            r5 = -1
            goto L_0x0361
        L_0x0489:
            r3 = r40
            r26 = r11
            int r0 = r7.f1035b0
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f1035b0 = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04b0
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04b0
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04b0
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04ae
            goto L_0x04b0
        L_0x04ae:
            r0 = r6
            goto L_0x04de
        L_0x04b0:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04de:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x04e2:
            if (r27 != 0) goto L_0x04e9
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04e9
            goto L_0x04ea
        L_0x04e9:
            r0 = r2
        L_0x04ea:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x0513
            r0 = r39
            r1 = r26
            r7.m1252c(r1, r0)
        L_0x0513:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0224f0.mo1586a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1592b(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f1035b0 = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1031U
            boolean r15 = r7.f1038d0
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019d
            android.view.View r4 = r7.mo1585a(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f1035b0
            int r10 = r7.mo1597c(r6)
            int r4 = r4 + r10
            r7.f1035b0 = r4
            r23 = r11
            r4 = r22
        L_0x0043:
            r22 = r13
            goto L_0x0191
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005b
            int r1 = r7.mo1584a(r4, r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            goto L_0x0043
        L_0x005b:
            boolean r1 = r7.mo1596b(r6)
            if (r1 == 0) goto L_0x0068
            int r1 = r7.f1035b0
            int r10 = r7.f1043i0
            int r1 = r1 + r10
            r7.f1035b0 = r1
        L_0x0068:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.f0$a r10 = (androidx.appcompat.widget.C0224f0.C0225a) r10
            float r1 = r10.f1046a
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            float r0 = r10.f1046a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.f1035b0
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f1035b0 = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r8 = r24
            r30 = r26
            r18 = 1
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x0118
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b7
            float r0 = r10.f1046a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b9
        L_0x00b7:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b9:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r0 = r7.f1035b0
            r28 = r0
            goto L_0x00c6
        L_0x00c4:
            r28 = 0
        L_0x00c6:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r4
            r23 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r22
            r22 = r13
            r13 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.mo1590a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f5
            r10.height = r0
        L_0x00f5:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f1035b0
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.mo1591b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1035b0 = r1
            if (r15 == 0) goto L_0x0117
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0118
        L_0x0117:
            r0 = r9
        L_0x0118:
            if (r14 < 0) goto L_0x0122
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0122
            int r1 = r7.f1035b0
            r7.f1032V = r1
        L_0x0122:
            if (r11 >= r14) goto L_0x0133
            float r1 = r10.f1046a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0140
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0140
            r1 = 1
            r20 = 1
            goto L_0x0141
        L_0x0140:
            r1 = 0
        L_0x0141:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0162
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0162
            r8 = 1
            goto L_0x0163
        L_0x0162:
            r8 = 0
        L_0x0163:
            float r9 = r10.f1046a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0175
            if (r1 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x017f
        L_0x0175:
            if (r1 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x017f:
            int r2 = r7.mo1584a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0191:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r22
            r11 = r23
            goto L_0x002a
        L_0x019d:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f1035b0
            if (r2 <= 0) goto L_0x01bd
            r2 = r23
            boolean r3 = r7.mo1596b(r2)
            if (r3 == 0) goto L_0x01bf
            int r3 = r7.f1035b0
            int r4 = r7.f1043i0
            int r3 = r3 + r4
            r7.f1035b0 = r3
            goto L_0x01bf
        L_0x01bd:
            r2 = r23
        L_0x01bf:
            r3 = r22
            if (r15 == 0) goto L_0x020e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c9
            if (r3 != 0) goto L_0x020e
        L_0x01c9:
            r4 = 0
            r7.f1035b0 = r4
            r4 = 0
        L_0x01cd:
            if (r4 >= r2) goto L_0x020e
            android.view.View r6 = r7.mo1585a(r4)
            if (r6 != 0) goto L_0x01df
            int r6 = r7.f1035b0
            int r11 = r7.mo1597c(r4)
            int r6 = r6 + r11
            r7.f1035b0 = r6
            goto L_0x0209
        L_0x01df:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01eb
            int r6 = r7.mo1584a(r6, r4)
            int r4 = r4 + r6
            goto L_0x0209
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.f0$a r11 = (androidx.appcompat.widget.C0224f0.C0225a) r11
            int r14 = r7.f1035b0
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo1591b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.f1035b0 = r6
        L_0x0209:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01cd
        L_0x020e:
            int r4 = r7.f1035b0
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f1035b0 = r4
            int r4 = r7.f1035b0
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f1035b0
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027f
            if (r9 == 0) goto L_0x023e
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x023e
            goto L_0x027f
        L_0x023e:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x027a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x027a
            r1 = 0
        L_0x0249:
            if (r1 >= r2) goto L_0x027a
            android.view.View r3 = r7.mo1585a(r1)
            if (r3 == 0) goto L_0x0277
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x025a
            goto L_0x0277
        L_0x025a:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.f0$a r9 = (androidx.appcompat.widget.C0224f0.C0225a) r9
            float r9 = r9.f1046a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0277
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0277:
            int r1 = r1 + 1
            goto L_0x0249
        L_0x027a:
            r11 = r34
            r1 = r8
            goto L_0x0372
        L_0x027f:
            float r10 = r7.f1037c0
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0286
            r0 = r10
        L_0x0286:
            r10 = 0
            r7.f1035b0 = r10
            r11 = r0
            r0 = 0
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x0290:
            if (r0 >= r2) goto L_0x0361
            android.view.View r13 = r7.mo1585a(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a4
            r21 = r11
            r11 = r34
            goto L_0x035a
        L_0x02a4:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.f0$a r14 = (androidx.appcompat.widget.C0224f0.C0225a) r14
            float r10 = r14.f1046a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0305
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02e8
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02dc
            goto L_0x02ea
        L_0x02dc:
            if (r15 <= 0) goto L_0x02df
            goto L_0x02e0
        L_0x02df:
            r15 = 0
        L_0x02e0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            goto L_0x02fa
        L_0x02e8:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02ea:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02f3
            r15 = 0
        L_0x02f3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
        L_0x02fa:
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x030c
        L_0x0305:
            r10 = r11
            r11 = r34
            r18 = r9
            r21 = r10
        L_0x030c:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x0327
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x032a
            r15 = 1
            goto L_0x032b
        L_0x0327:
            r23 = r1
            r1 = -1
        L_0x032a:
            r15 = 0
        L_0x032b:
            if (r15 == 0) goto L_0x032e
            goto L_0x032f
        L_0x032e:
            r9 = r10
        L_0x032f:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x033b
            int r9 = r14.width
            if (r9 != r1) goto L_0x033b
            r9 = 1
            goto L_0x033c
        L_0x033b:
            r9 = 0
        L_0x033c:
            int r10 = r7.f1035b0
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo1591b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f1035b0 = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x035a:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x0290
        L_0x0361:
            r11 = r34
            int r0 = r7.f1035b0
            int r3 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f1035b0 = r0
            r0 = r8
        L_0x0372:
            if (r19 != 0) goto L_0x0379
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0379
            goto L_0x037a
        L_0x0379:
            r0 = r5
        L_0x037a:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0398
            r7.m1253d(r2, r6)
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0224f0.mo1592b(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1593b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f1034a0;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        if (i11 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f1035b0) / 2);
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f1035b0;
        }
        int i13 = 0;
        while (i13 < virtualChildCount) {
            View a = mo1585a(i13);
            if (a == null) {
                i5 += mo1597c(i13);
            } else if (a.getVisibility() != 8) {
                int measuredWidth = a.getMeasuredWidth();
                int measuredHeight = a.getMeasuredHeight();
                C0225a aVar = (C0225a) a.getLayoutParams();
                int i14 = aVar.f1047b;
                if (i14 < 0) {
                    i14 = i12;
                }
                int a2 = C4139e.m14173a(i14, C4187x.m14399n(this)) & 7;
                if (a2 == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i6 = aVar.rightMargin;
                    i8 = i7 - i6;
                } else if (a2 != 5) {
                    i8 = aVar.leftMargin + paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i6 = aVar.rightMargin;
                    i8 = i7 - i6;
                }
                int i15 = i8;
                if (mo1596b(i13)) {
                    i5 += this.f1043i0;
                }
                int i16 = i5 + aVar.topMargin;
                C0225a aVar2 = aVar;
                m1251a(a, i15, i16 + mo1583a(a), measuredWidth, measuredHeight);
                i13 += mo1584a(a, i13);
                i5 = i16 + measuredHeight + aVar2.bottomMargin + mo1591b(a);
            }
            i13++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1590a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1587a(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0302z0.m1635a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f1034a0
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1036c
            int[] r13 = r6.f1039e0
            int[] r14 = r6.f1040f0
            int r1 = p096e.p121h.p135s.C4187x.m14399n(r24)
            int r1 = p096e.p121h.p135s.C4139e.m14173a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f1035b0
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f1035b0
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0140
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo1585a(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo1597c(r2)
            int r1 = r1 + r0
            goto L_0x012a
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0128
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.f0$a r4 = (androidx.appcompat.widget.C0224f0.C0225a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r3 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            int r10 = r4.f1047b
            if (r10 >= 0) goto L_0x00a8
            r10 = r11
        L_0x00a8:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00e4
            r11 = 48
            if (r10 == r11) goto L_0x00d4
            r11 = 80
            if (r10 == r11) goto L_0x00bd
            r3 = r7
            r11 = -1
        L_0x00ba:
            r21 = 1
            goto L_0x00f2
        L_0x00bd:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00d2
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00d2:
            r3 = r10
            goto L_0x00ba
        L_0x00d4:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            r21 = 1
            if (r3 == r11) goto L_0x00e2
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
        L_0x00e2:
            r3 = r10
            goto L_0x00f2
        L_0x00e4:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f2:
            boolean r10 = r6.mo1596b(r2)
            if (r10 == 0) goto L_0x00fb
            int r10 = r6.f1042h0
            int r1 = r1 + r10
        L_0x00fb:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo1583a(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m1251a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo1591b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo1584a(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0134
        L_0x0128:
            r18 = r3
        L_0x012a:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0134:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0224f0.mo1587a(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m1251a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
