package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import p096e.p097a.C3863f;
import p096e.p097a.C3867j;
import p096e.p121h.p135s.C4187x;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: U */
    private int f764U = -1;

    /* renamed from: V */
    private int f765V = 0;

    /* renamed from: c */
    private boolean f766c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3867j.ButtonBarLayout);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C3867j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f766c = obtainStyledAttributes.getBoolean(C3867j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m1022a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C3863f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f765V, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f766c) {
            if (size > this.f764U && m1023a()) {
                setStacked(false);
            }
            this.f764U = size;
        }
        if (m1023a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f766c && !m1023a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m1022a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1023a()) {
                int a2 = m1022a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C4187x.m14400o(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f766c != z) {
            this.f766c = z;
            if (!this.f766c && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private boolean m1023a() {
        return getOrientation() == 1;
    }
}
