package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.C0436i;
import androidx.constraintlayout.widget.C0440k;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3978i;
import p096e.p114f.p117b.p118j.C3983l;
import p096e.p114f.p117b.p118j.C3991s;

public class Flow extends C0440k {

    /* renamed from: e0 */
    private C3978i f1369e0;

    public Flow(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo2111a(C3973f fVar, boolean z) {
    }

    /* renamed from: a */
    public void mo2112a(C3991s sVar, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (sVar != null) {
            sVar.mo14446b(mode, size, mode2, size2);
            setMeasuredDimension(sVar.mo14492T(), sVar.mo14491S());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2112a(this.f1369e0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1369e0.mo14447e(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1369e0.mo14435E(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1369e0.mo14448f(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1369e0.mo14436F(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1369e0.mo14437G(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1369e0.mo14449g(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1369e0.mo14438H(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1369e0.mo14439I(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1369e0.mo14440J(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1369e0.mo14441K(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1369e0.mo14294z(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1369e0.mo14487A(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1369e0.mo14488B(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1369e0.mo14489C(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1369e0.mo14490D(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1369e0.mo14442L(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1369e0.mo14450h(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1369e0.mo14443M(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1369e0.mo14444N(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1369e0.mo14445O(i);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo2110a(C0426a aVar, C3983l lVar, C0415c cVar, SparseArray<C3973f> sparseArray) {
        super.mo2110a(aVar, lVar, cVar, sparseArray);
        if (lVar instanceof C3978i) {
            C3978i iVar = (C3978i) lVar;
            int i = cVar.f1779R;
            if (i != -1) {
                iVar.mo14441K(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2109a(AttributeSet attributeSet) {
        super.mo2109a(attributeSet);
        this.f1369e0 = new C3978i();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.ConstraintLayout_Layout_android_orientation) {
                    this.f1369e0.mo14441K(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_android_padding) {
                    this.f1369e0.mo14294z(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1369e0.mo14488B(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1369e0.mo14490D(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1369e0.mo14489C(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1369e0.mo14487A(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1369e0.mo14445O(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1369e0.mo14439I(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1369e0.mo14444N(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1369e0.mo14435E(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1369e0.mo14436F(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1369e0.mo14449g(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1369e0.mo14447e(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1369e0.mo14448f(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1369e0.mo14450h(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1369e0.mo14437G(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1369e0.mo14442L(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1369e0.mo14438H(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1369e0.mo14443M(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1369e0.mo14440J(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f1848W = this.f1369e0;
        mo2398a();
    }
}
