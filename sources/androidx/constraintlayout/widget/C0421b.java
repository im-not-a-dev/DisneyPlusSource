package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.C0425d.C0426a;
import androidx.constraintlayout.widget.C0425d.C0427b;
import androidx.constraintlayout.widget.ConstraintLayout.C0415c;
import java.util.Arrays;
import java.util.HashMap;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3982k;
import p096e.p114f.p117b.p118j.C3983l;

/* renamed from: androidx.constraintlayout.widget.b */
/* compiled from: ConstraintHelper */
public abstract class C0421b extends View {

    /* renamed from: U */
    protected int f1846U;

    /* renamed from: V */
    protected Context f1847V;

    /* renamed from: W */
    protected C3982k f1848W;

    /* renamed from: a0 */
    protected boolean f1849a0 = false;

    /* renamed from: b0 */
    private String f1850b0;

    /* renamed from: c */
    protected int[] f1851c = new int[32];

    /* renamed from: c0 */
    private View[] f1852c0 = null;

    /* renamed from: d0 */
    private HashMap<Integer, String> f1853d0 = new HashMap<>();

    public C0421b(Context context) {
        super(context);
        this.f1847V = context;
        mo2109a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            this.f1846U = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2285a(str.substring(i));
                    return;
                } else {
                    m2285a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2109a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0436i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0436i.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f1850b0 = obtainStyledAttributes.getString(index);
                    setIds(this.f1850b0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2111a(C3973f fVar, boolean z) {
    }

    /* renamed from: b */
    public void mo2384b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo2401c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void mo2385d(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1850b0);
        }
        C3982k kVar = this.f1848W;
        if (kVar != null) {
            kVar.mo14464a();
            for (int i = 0; i < this.f1846U; i++) {
                int i2 = this.f1851c[i];
                View a = constraintLayout.mo2349a(i2);
                if (a == null) {
                    int childCount = constraintLayout.getChildCount();
                    String str = (String) this.f1853d0.get(Integer.valueOf(i2));
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            break;
                        }
                        View childAt = constraintLayout.getChildAt(i3);
                        if (childAt.getId() != -1) {
                            String str2 = null;
                            try {
                                str2 = getResources().getResourceEntryName(childAt.getId());
                            } catch (NotFoundException unused) {
                            }
                            if (str != null && str.equals(str2)) {
                                this.f1851c[i] = childAt.getId();
                                this.f1853d0.put(Integer.valueOf(childAt.getId()), str);
                                a = childAt;
                                break;
                            }
                        }
                        i3++;
                    }
                }
                if (a != null) {
                    this.f1848W.mo14465a(constraintLayout.mo2350a(a));
                }
            }
            this.f1848W.mo14466a(constraintLayout.f1741W);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1851c, this.f1846U);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1849a0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1846U = 0;
        for (int a : iArr) {
            m2284a(a);
        }
    }

    /* renamed from: a */
    private void m2284a(int i) {
        int i2 = this.f1846U + 1;
        int[] iArr = this.f1851c;
        if (i2 > iArr.length) {
            this.f1851c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1851c;
        int i3 = this.f1846U;
        iArr2[i3] = i;
        this.f1846U = i3 + 1;
    }

    public C0421b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1847V = context;
        mo2109a(attributeSet);
    }

    /* renamed from: a */
    public void mo2398a() {
        if (this.f1848W != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0415c) {
                ((C0415c) layoutParams).f1813m0 = (C3973f) this.f1848W;
            }
        }
    }

    public C0421b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1847V = context;
        mo2109a(attributeSet);
    }

    /* renamed from: a */
    private void m2285a(String str) {
        int i;
        if (str != null && str.length() != 0 && this.f1847V != null) {
            String trim = str.trim();
            try {
                i = C0435h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo2351a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i == 0) {
                i = this.f1847V.getResources().getIdentifier(trim, "id", this.f1847V.getPackageName());
            }
            if (i != 0) {
                this.f1853d0.put(Integer.valueOf(i), trim);
                m2284a(i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2399a(C3976g gVar, C3982k kVar, SparseArray<C3973f> sparseArray) {
        kVar.mo14464a();
        for (int i = 0; i < this.f1846U; i++) {
            kVar.mo14465a((C3973f) sparseArray.get(this.f1851c[i]));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View[] mo2400a(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1852c0;
        if (viewArr == null || viewArr.length != this.f1846U) {
            this.f1852c0 = new View[this.f1846U];
        }
        for (int i = 0; i < this.f1846U; i++) {
            this.f1852c0[i] = constraintLayout.mo2349a(this.f1851c[i]);
        }
        return this.f1852c0;
    }

    /* renamed from: a */
    public void mo2110a(C0426a aVar, C3983l lVar, C0415c cVar, SparseArray<C3973f> sparseArray) {
        C0427b bVar = aVar.f1879d;
        int[] iArr = bVar.f1918e0;
        if (iArr != null) {
            setReferencedIds(iArr);
            return;
        }
        String str = bVar.f1920f0;
        if (str != null && str.length() > 0) {
            C0427b bVar2 = aVar.f1879d;
            bVar2.f1918e0 = m2286a((View) this, bVar2.f1920f0);
            lVar.mo14464a();
            int i = 0;
            while (true) {
                int[] iArr2 = aVar.f1879d.f1918e0;
                if (i < iArr2.length) {
                    C3973f fVar = (C3973f) sparseArray.get(iArr2[i]);
                    if (fVar != null) {
                        lVar.mo14465a(fVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int[] m2286a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0435h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo2351a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
