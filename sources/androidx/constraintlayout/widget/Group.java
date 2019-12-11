package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;

public class Group extends C0421b {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2109a(AttributeSet attributeSet) {
        super.mo2109a(attributeSet);
        this.f1849a0 = false;
    }

    /* renamed from: b */
    public void mo2384b(ConstraintLayout constraintLayout) {
        C0415c cVar = (C0415c) getLayoutParams();
        cVar.f1813m0.mo14401u(0);
        cVar.f1813m0.mo14384m(0);
    }

    /* renamed from: d */
    public void mo2385d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1846U; i++) {
            View a = constraintLayout.mo2349a(this.f1851c[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
