package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import p096e.p114f.p117b.p118j.C3965b;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3983l;

public class Barrier extends C0421b {

    /* renamed from: e0 */
    private int f1736e0;

    /* renamed from: f0 */
    private int f1737f0;

    /* renamed from: g0 */
    private C3965b f1738g0;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    private void m2240a(C3973f fVar, int i, boolean z) {
        this.f1737f0 = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.f1736e0;
            if (i2 == 5) {
                this.f1737f0 = 0;
            } else if (i2 == 6) {
                this.f1737f0 = 1;
            }
        } else if (z) {
            int i3 = this.f1736e0;
            if (i3 == 5) {
                this.f1737f0 = 1;
            } else if (i3 == 6) {
                this.f1737f0 = 0;
            }
        } else {
            int i4 = this.f1736e0;
            if (i4 == 5) {
                this.f1737f0 = 0;
            } else if (i4 == 6) {
                this.f1737f0 = 1;
            }
        }
        if (fVar instanceof C3965b) {
            ((C3965b) fVar).mo14294z(this.f1737f0);
        }
    }

    /* renamed from: b */
    public boolean mo2342b() {
        return this.f1738g0.mo14286R();
    }

    public int getMargin() {
        return this.f1738g0.mo14288T();
    }

    public int getType() {
        return this.f1736e0;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1738g0.mo14293d(z);
    }

    public void setDpMargin(int i) {
        this.f1738g0.mo14283A((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1738g0.mo14283A(i);
    }

    public void setType(int i) {
        this.f1736e0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2111a(C3973f fVar, boolean z) {
        m2240a(fVar, this.f1736e0, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2109a(AttributeSet attributeSet) {
        super.mo2109a(attributeSet);
        this.f1738g0 = new C3965b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0436i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1738g0.mo14293d(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0436i.ConstraintLayout_Layout_barrierMargin) {
                    this.f1738g0.mo14283A(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1848W = this.f1738g0;
        mo2398a();
    }

    /* renamed from: a */
    public void mo2110a(C0426a aVar, C3983l lVar, C0415c cVar, SparseArray<C3973f> sparseArray) {
        super.mo2110a(aVar, lVar, cVar, sparseArray);
        if (lVar instanceof C3965b) {
            C3965b bVar = (C3965b) lVar;
            m2240a(bVar, aVar.f1879d.f1912b0, ((C3976g) lVar.mo14393r()).mo14423a0());
            bVar.mo14293d(aVar.f1879d.f1928j0);
            bVar.mo14283A(aVar.f1879d.f1914c0);
        }
    }
}
