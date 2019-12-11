package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import p096e.p146l.C4225c;

public class ThumbsBar extends LinearLayout {

    /* renamed from: U */
    int f2752U;

    /* renamed from: V */
    int f2753V;

    /* renamed from: W */
    int f2754W;

    /* renamed from: a0 */
    int f2755a0;

    /* renamed from: b0 */
    int f2756b0;

    /* renamed from: c */
    int f2757c;

    /* renamed from: c0 */
    private boolean f2758c0;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m3272a() {
        while (getChildCount() > this.f2757c) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f2757c) {
            addView(mo3639a((ViewGroup) this), new LayoutParams(this.f2752U, this.f2753V));
        }
        int heroIndex = getHeroIndex();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i) {
                layoutParams.width = this.f2754W;
                layoutParams.height = this.f2755a0;
            } else {
                layoutParams.width = this.f2752U;
                layoutParams.height = this.f2753V;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.f2756b0;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex < this.f2757c) {
                int i7 = width2 + this.f2756b0;
                View childAt3 = getChildAt(heroIndex);
                childAt3.layout(i7, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + paddingTop);
                width2 = i7 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (!this.f2758c0) {
            int a = m3270a(measuredWidth);
            if (this.f2757c != a) {
                this.f2757c = a;
                m3272a();
            }
        }
    }

    public void setNumberOfThumbs(int i) {
        this.f2758c0 = true;
        this.f2757c = i;
        m3272a();
    }

    public void setThumbSpace(int i) {
        this.f2756b0 = i;
        requestLayout();
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2757c = -1;
        new SparseArray();
        this.f2758c0 = false;
        this.f2752U = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_thumbs_width);
        this.f2753V = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_thumbs_height);
        this.f2755a0 = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_hero_thumbs_width);
        this.f2754W = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_hero_thumbs_height);
        this.f2756b0 = context.getResources().getDimensionPixelSize(C4225c.lb_playback_transport_thumbs_margin);
    }

    /* renamed from: a */
    private static int m3271a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    private int m3270a(int i) {
        int a = m3271a(i - this.f2754W, this.f2752U + this.f2756b0);
        if (a < 2) {
            a = 2;
        } else if ((a & 1) != 0) {
            a++;
        }
        return a + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo3639a(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }
}
