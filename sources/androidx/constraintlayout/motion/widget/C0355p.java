package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0421b;
import androidx.constraintlayout.widget.C0436i;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* compiled from: MotionHelper */
public class C0355p extends C0421b implements C0318a {

    /* renamed from: e0 */
    private boolean f1616e0;

    /* renamed from: f0 */
    private boolean f1617f0;

    /* renamed from: g0 */
    private float f1618g0;

    /* renamed from: h0 */
    protected View[] f1619h0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2109a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.MotionHelper_onShow) {
                    this.f1616e0 = obtainStyledAttributes.getBoolean(index, this.f1616e0);
                } else if (index == C0436i.MotionHelper_onHide) {
                    this.f1617f0 = obtainStyledAttributes.getBoolean(index, this.f1617f0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2243a(View view, float f) {
    }

    /* renamed from: b */
    public boolean mo2244b() {
        return this.f1617f0;
    }

    /* renamed from: c */
    public boolean mo2245c() {
        return this.f1616e0;
    }

    public float getProgress() {
        return this.f1618g0;
    }

    public void setProgress(float f) {
        this.f1618g0 = f;
        int i = 0;
        if (this.f1846U > 0) {
            this.f1619h0 = mo2400a((ConstraintLayout) getParent());
            while (i < this.f1846U) {
                mo2243a(this.f1619h0[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof C0355p)) {
                mo2243a(childAt, f);
            }
            i++;
        }
    }
}
