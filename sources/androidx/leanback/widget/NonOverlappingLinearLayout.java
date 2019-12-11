package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: U */
    boolean f2607U;

    /* renamed from: V */
    final ArrayList<ArrayList<View>> f2608V;

    /* renamed from: c */
    boolean f2609c;

    public NonOverlappingLinearLayout(Context context) {
        this(context, null);
    }

    public void focusableViewAvailable(View view) {
        int i;
        if (this.f2607U) {
            View view2 = view;
            while (true) {
                if (view2 == this || view2 == null) {
                    i = -1;
                } else if (view2.getParent() == this) {
                    i = indexOfChild(view2);
                    break;
                } else {
                    view2 = (View) view2.getParent();
                }
            }
            if (i != -1) {
                ((ArrayList) this.f2608V.get(i)).add(view);
                return;
            }
            return;
        }
        super.focusableViewAvailable(view);
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        try {
            this.f2607U = this.f2609c && getOrientation() == 0 && getLayoutDirection() == 1;
            if (this.f2607U) {
                while (this.f2608V.size() > getChildCount()) {
                    this.f2608V.remove(this.f2608V.size() - 1);
                }
                while (this.f2608V.size() < getChildCount()) {
                    this.f2608V.add(new ArrayList());
                }
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.f2607U) {
                for (int i6 = 0; i6 < this.f2608V.size(); i6++) {
                    for (int i7 = 0; i7 < ((ArrayList) this.f2608V.get(i6)).size(); i7++) {
                        super.focusableViewAvailable((View) ((ArrayList) this.f2608V.get(i6)).get(i7));
                    }
                }
            }
            if (this.f2607U) {
                this.f2607U = false;
                while (i5 < this.f2608V.size()) {
                    ((ArrayList) this.f2608V.get(i5)).clear();
                    i5++;
                }
            }
        } catch (Throwable th) {
            if (this.f2607U) {
                this.f2607U = false;
                while (i5 < this.f2608V.size()) {
                    ((ArrayList) this.f2608V.get(i5)).clear();
                    i5++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.f2609c = z;
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2609c = false;
        this.f2608V = new ArrayList<>();
    }
}
