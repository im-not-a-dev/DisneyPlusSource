package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;

class ControlBar extends LinearLayout {

    /* renamed from: U */
    private C0608a f2572U;

    /* renamed from: V */
    int f2573V = -1;

    /* renamed from: W */
    boolean f2574W = true;

    /* renamed from: c */
    private int f2575c;

    /* renamed from: androidx.leanback.widget.ControlBar$a */
    public interface C0608a {
        /* renamed from: a */
        void mo3431a(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3426a() {
        if (this.f2574W) {
            return getChildCount() / 2;
        }
        return 0;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (i == 33 || i == 130) {
            int i3 = this.f2573V;
            if (i3 >= 0 && i3 < getChildCount()) {
                arrayList.add(getChildAt(this.f2573V));
            } else if (getChildCount() > 0) {
                arrayList.add(getChildAt(mo3426a()));
            }
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2575c > 0) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < getChildCount() - 1) {
                View childAt = getChildAt(i3);
                i3++;
                View childAt2 = getChildAt(i3);
                int measuredWidth = this.f2575c - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
                LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                int marginStart = measuredWidth - layoutParams.getMarginStart();
                layoutParams.setMarginStart(measuredWidth);
                childAt2.setLayoutParams(layoutParams);
                i4 += marginStart;
            }
            setMeasuredDimension(getMeasuredWidth() + i4, getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        if (getChildCount() > 0) {
            int i3 = this.f2573V;
            if (i3 < 0 || i3 >= getChildCount()) {
                i2 = mo3426a();
            } else {
                i2 = this.f2573V;
            }
            if (getChildAt(i2).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f2573V = indexOfChild(view);
        C0608a aVar = this.f2572U;
        if (aVar != null) {
            aVar.mo3431a(view, view2);
        }
    }

    public ControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
