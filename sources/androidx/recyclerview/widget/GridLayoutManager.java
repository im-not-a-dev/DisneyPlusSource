package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0808o.C0811c;
import androidx.recyclerview.widget.RecyclerView.C0813p;
import androidx.recyclerview.widget.RecyclerView.C0820v;
import java.util.Arrays;
import p096e.p121h.p135s.p136i0.C4154d;
import p096e.p121h.p135s.p136i0.C4154d.C4157c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: H */
    boolean f3119H = false;

    /* renamed from: I */
    int f3120I = -1;

    /* renamed from: J */
    int[] f3121J;

    /* renamed from: K */
    View[] f3122K;

    /* renamed from: L */
    final SparseIntArray f3123L = new SparseIntArray();

    /* renamed from: M */
    final SparseIntArray f3124M = new SparseIntArray();

    /* renamed from: N */
    C0781c f3125N = new C0779a();

    /* renamed from: O */
    final Rect f3126O = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0779a extends C0781c {
        /* renamed from: b */
        public int mo4307b(int i) {
            return 1;
        }

        /* renamed from: c */
        public int mo4308c(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0780b extends C0813p {

        /* renamed from: e */
        int f3127e = -1;

        /* renamed from: f */
        int f3128f = 0;

        public C0780b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        public int mo4309g() {
            return this.f3127e;
        }

        /* renamed from: h */
        public int mo4310h() {
            return this.f3128f;
        }

        public C0780b(int i, int i2) {
            super(i, i2);
        }

        public C0780b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0780b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0781c {

        /* renamed from: a */
        final SparseIntArray f3129a = new SparseIntArray();

        /* renamed from: b */
        private boolean f3130b = false;

        /* renamed from: a */
        public void mo4313a() {
            this.f3129a.clear();
        }

        /* renamed from: b */
        public abstract int mo4307b(int i);

        /* renamed from: b */
        public int mo4314b(int i, int i2) {
            int b = mo4307b(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int b2 = mo4307b(i5);
                i3 += b2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = b2;
                }
            }
            return i3 + b > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[RETURN] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4308c(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo4307b(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f3130b
                if (r2 == 0) goto L_0x0026
                android.util.SparseIntArray r2 = r5.f3129a
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0026
                int r2 = r5.mo4311a(r6)
                if (r2 < 0) goto L_0x0026
                android.util.SparseIntArray r3 = r5.f3129a
                int r3 = r3.get(r2)
                int r4 = r5.mo4307b(r2)
                int r3 = r3 + r4
                goto L_0x0036
            L_0x0026:
                r2 = 0
                r3 = 0
            L_0x0028:
                if (r2 >= r6) goto L_0x0039
                int r4 = r5.mo4307b(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x0033
                r3 = 0
                goto L_0x0036
            L_0x0033:
                if (r3 <= r7) goto L_0x0036
                r3 = r4
            L_0x0036:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0039:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x003d
                return r3
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0781c.mo4308c(int, int):int");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4312a(int i, int i2) {
            if (!this.f3130b) {
                return mo4308c(i, i2);
            }
            int i3 = this.f3129a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo4308c(i, i2);
            this.f3129a.put(i, c);
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4311a(int i) {
            int size = this.f3129a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f3129a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f3129a.size()) {
                return -1;
            }
            return this.f3129a.keyAt(i4);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4306m(C0808o.m4305a(context, attributeSet, i, i2).f3313b);
    }

    /* renamed from: O */
    private void m3932O() {
        int e = mo4732e();
        for (int i = 0; i < e; i++) {
            C0780b bVar = (C0780b) mo4729d(i).getLayoutParams();
            int b = bVar.mo4772b();
            this.f3123L.put(b, bVar.mo4310h());
            this.f3124M.put(b, bVar.mo4309g());
        }
    }

    /* renamed from: P */
    private void m3933P() {
        this.f3123L.clear();
        this.f3124M.clear();
    }

    /* renamed from: Q */
    private void m3934Q() {
        View[] viewArr = this.f3122K;
        if (viewArr == null || viewArr.length != this.f3120I) {
            this.f3122K = new View[this.f3120I];
        }
    }

    /* renamed from: R */
    private void m3935R() {
        int i;
        int i2;
        if (mo4322L() == 1) {
            i2 = mo4758r() - mo4756p();
            i = mo4754o();
        } else {
            i2 = mo4741h() - mo4752n();
            i = mo4757q();
        }
        m3945n(i2 - i);
    }

    /* renamed from: n */
    private void m3945n(int i) {
        this.f3121J = m3941a(this.f3121J, this.f3120I, i);
    }

    /* renamed from: E */
    public boolean mo3811E() {
        return this.f3134D == null && !this.f3119H;
    }

    /* renamed from: a */
    public int mo3835a(C0820v vVar, C0788a0 a0Var) {
        if (this.f3138s == 1) {
            return this.f3120I;
        }
        if (a0Var.mo4531b() < 1) {
            return 0;
        }
        return m3936a(vVar, a0Var, a0Var.mo4531b() - 1) + 1;
    }

    /* renamed from: b */
    public int mo3871b(C0820v vVar, C0788a0 a0Var) {
        if (this.f3138s == 0) {
            return this.f3120I;
        }
        if (a0Var.mo4531b() < 1) {
            return 0;
        }
        return m3936a(vVar, a0Var, a0Var.mo4531b() - 1) + 1;
    }

    /* renamed from: c */
    public void mo4304c(boolean z) {
        if (!z) {
            super.mo4304c(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: d */
    public void mo3890d(RecyclerView recyclerView) {
        this.f3125N.mo4313a();
    }

    /* renamed from: e */
    public void mo3895e(C0820v vVar, C0788a0 a0Var) {
        if (a0Var.mo4536g()) {
            m3932O();
        }
        super.mo3895e(vVar, a0Var);
        m3933P();
    }

    /* renamed from: g */
    public void mo3901g(C0788a0 a0Var) {
        super.mo3901g(a0Var);
        this.f3119H = false;
    }

    /* renamed from: m */
    public void mo4306m(int i) {
        if (i != this.f3120I) {
            this.f3119H = true;
            if (i >= 1) {
                this.f3120I = i;
                this.f3125N.mo4313a();
                mo4685A();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public C0813p mo3884c() {
        if (this.f3138s == 0) {
            return new C0780b(-2, -1);
        }
        return new C0780b(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo4305g(int i, int i2) {
        if (this.f3138s != 1 || !mo4323M()) {
            int[] iArr = this.f3121J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3121J;
        int i3 = this.f3120I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: a */
    public void mo3854a(C0820v vVar, C0788a0 a0Var, View view, C4154d dVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0780b)) {
            super.mo4697a(view, dVar);
            return;
        }
        C0780b bVar = (C0780b) layoutParams;
        int a = m3936a(vVar, a0Var, bVar.mo4772b());
        if (this.f3138s == 0) {
            dVar.mo14748b((Object) C4157c.m14287a(bVar.mo4309g(), bVar.mo4310h(), a, 1, this.f3120I > 1 && bVar.mo4310h() == this.f3120I, false));
        } else {
            dVar.mo14748b((Object) C4157c.m14287a(a, 1, bVar.mo4309g(), bVar.mo4310h(), this.f3120I > 1 && bVar.mo4310h() == this.f3120I, false));
        }
    }

    /* renamed from: b */
    public void mo3878b(RecyclerView recyclerView, int i, int i2) {
        this.f3125N.mo4313a();
    }

    /* renamed from: c */
    private int m3944c(C0820v vVar, C0788a0 a0Var, int i) {
        if (!a0Var.mo4536g()) {
            return this.f3125N.mo4307b(i);
        }
        int i2 = this.f3123L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo4796a(i);
        if (a != -1) {
            return this.f3125N.mo4307b(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* renamed from: b */
    public int mo3870b(int i, C0820v vVar, C0788a0 a0Var) {
        m3935R();
        m3934Q();
        return super.mo3870b(i, vVar, a0Var);
    }

    /* renamed from: b */
    private void m3943b(C0820v vVar, C0788a0 a0Var, C0782a aVar, int i) {
        boolean z = i == 1;
        int b = m3942b(vVar, a0Var, aVar.f3147b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f3147b;
                if (i2 > 0) {
                    aVar.f3147b = i2 - 1;
                    b = m3942b(vVar, a0Var, aVar.f3147b);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = a0Var.mo4531b() - 1;
        int i3 = aVar.f3147b;
        while (i3 < b2) {
            int i4 = i3 + 1;
            int b3 = m3942b(vVar, a0Var, i4);
            if (b3 <= b) {
                break;
            }
            i3 = i4;
            b = b3;
        }
        aVar.f3147b = i3;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo4306m(i);
    }

    /* renamed from: b */
    private int m3942b(C0820v vVar, C0788a0 a0Var, int i) {
        if (!a0Var.mo4536g()) {
            return this.f3125N.mo4312a(i, this.f3120I);
        }
        int i2 = this.f3124M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo4796a(i);
        if (a != -1) {
            return this.f3125N.mo4312a(a, this.f3120I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: a */
    public void mo3856a(RecyclerView recyclerView, int i, int i2) {
        this.f3125N.mo4313a();
    }

    /* renamed from: a */
    public void mo4302a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3125N.mo4313a();
    }

    /* renamed from: a */
    public void mo3857a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3125N.mo4313a();
    }

    /* renamed from: a */
    public C0813p mo3837a(Context context, AttributeSet attributeSet) {
        return new C0780b(context, attributeSet);
    }

    /* renamed from: a */
    public C0813p mo3838a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0780b((MarginLayoutParams) layoutParams);
        }
        return new C0780b(layoutParams);
    }

    /* renamed from: a */
    public boolean mo4303a(C0813p pVar) {
        return pVar instanceof C0780b;
    }

    /* renamed from: a */
    public void mo4298a(C0781c cVar) {
        this.f3125N = cVar;
    }

    /* renamed from: a */
    public void mo4297a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3121J == null) {
            super.mo4297a(rect, i, i2);
        }
        int o = mo4754o() + mo4756p();
        int q = mo4757q() + mo4752n();
        if (this.f3138s == 1) {
            i4 = C0808o.m4303a(i2, rect.height() + q, mo4748l());
            int[] iArr = this.f3121J;
            i3 = C0808o.m4303a(i, iArr[iArr.length - 1] + o, mo4750m());
        } else {
            i3 = C0808o.m4303a(i, rect.width() + o, mo4750m());
            int[] iArr2 = this.f3121J;
            i4 = C0808o.m4303a(i2, iArr2[iArr2.length - 1] + q, mo4748l());
        }
        mo4723c(i3, i4);
    }

    /* renamed from: a */
    static int[] m3941a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4300a(C0820v vVar, C0788a0 a0Var, C0782a aVar, int i) {
        super.mo4300a(vVar, a0Var, aVar, i);
        m3935R();
        if (a0Var.mo4531b() > 0 && !a0Var.mo4536g()) {
            m3943b(vVar, a0Var, aVar, i);
        }
        m3934Q();
    }

    /* renamed from: a */
    public int mo3833a(int i, C0820v vVar, C0788a0 a0Var) {
        m3935R();
        m3934Q();
        return super.mo3833a(i, vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4296a(C0820v vVar, C0788a0 a0Var, int i, int i2, int i3) {
        mo4317G();
        int f = this.f3140u.mo5120f();
        int b = this.f3140u.mo5112b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo4729d(i);
            int l = mo4749l(d);
            if (l >= 0 && l < i3 && m3942b(vVar, a0Var, l) == 0) {
                if (((C0813p) d.getLayoutParams()).mo4774d()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f3140u.mo5117d(d) < b && this.f3140u.mo5110a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    private int m3936a(C0820v vVar, C0788a0 a0Var, int i) {
        if (!a0Var.mo4536g()) {
            return this.f3125N.mo4314b(i, this.f3120I);
        }
        int a = vVar.mo4796a(i);
        if (a != -1) {
            return this.f3125N.mo4314b(a, this.f3120I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4299a(C0788a0 a0Var, C0784c cVar, C0811c cVar2) {
        int i = this.f3120I;
        for (int i2 = 0; i2 < this.f3120I && cVar.mo4358a(a0Var) && i > 0; i2++) {
            int i3 = cVar.f3158d;
            cVar2.mo4770a(i3, Math.max(0, cVar.f3161g));
            i -= this.f3125N.mo4307b(i3);
            cVar.f3158d += cVar.f3159e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4301a(C0820v vVar, C0788a0 a0Var, C0784c cVar, C0783b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        C0820v vVar2 = vVar;
        C0788a0 a0Var2 = a0Var;
        C0784c cVar2 = cVar;
        C0783b bVar2 = bVar;
        int e = this.f3140u.mo5118e();
        boolean z2 = e != 1073741824;
        int i9 = mo4732e() > 0 ? this.f3121J[this.f3120I] : 0;
        if (z2) {
            m3935R();
        }
        boolean z3 = cVar2.f3159e == 1;
        int i10 = this.f3120I;
        if (!z3) {
            i10 = m3942b(vVar2, a0Var2, cVar2.f3158d) + m3944c(vVar2, a0Var2, cVar2.f3158d);
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f3120I && cVar2.mo4358a(a0Var2) && i10 > 0) {
            int i13 = cVar2.f3158d;
            int c = m3944c(vVar2, a0Var2, i13);
            if (c <= this.f3120I) {
                i10 -= c;
                if (i10 < 0) {
                    break;
                }
                View a = cVar2.mo4355a(vVar2);
                if (a == null) {
                    break;
                }
                i11 += c;
                this.f3122K[i12] = a;
                i12++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i13);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f3120I);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i12 == 0) {
            bVar2.f3152b = true;
            return;
        }
        float f = 0.0f;
        int i14 = i12;
        m3940a(vVar, a0Var, i12, i11, z3);
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            View view = this.f3122K[i16];
            if (cVar2.f3165k != null) {
                z = false;
                if (z3) {
                    mo4690a(view);
                } else {
                    mo4691a(view, 0);
                }
            } else if (z3) {
                mo4716b(view);
                z = false;
            } else {
                z = false;
                mo4717b(view, 0);
            }
            mo4695a(view, this.f3126O);
            m3939a(view, e, z);
            int b = this.f3140u.mo5113b(view);
            if (b > i15) {
                i15 = b;
            }
            float c2 = (((float) this.f3140u.mo5115c(view)) * 1.0f) / ((float) ((C0780b) view.getLayoutParams()).f3128f);
            if (c2 > f) {
                f = c2;
            }
        }
        if (z2) {
            m3937a(f, i9);
            i15 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                View view2 = this.f3122K[i17];
                m3939a(view2, 1073741824, true);
                int b2 = this.f3140u.mo5113b(view2);
                if (b2 > i15) {
                    i15 = b2;
                }
            }
        }
        for (int i18 = 0; i18 < i14; i18++) {
            View view3 = this.f3122K[i18];
            if (this.f3140u.mo5113b(view3) != i15) {
                C0780b bVar3 = (C0780b) view3.getLayoutParams();
                Rect rect = bVar3.f3317b;
                int i19 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i20 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int g = mo4305g(bVar3.f3127e, bVar3.f3128f);
                if (this.f3138s == 1) {
                    i8 = C0808o.m4304a(g, 1073741824, i20, bVar3.width, false);
                    i7 = MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    i7 = C0808o.m4304a(g, 1073741824, i19, bVar3.height, false);
                    i8 = makeMeasureSpec;
                }
                m3938a(view3, i8, i7, true);
            }
        }
        int i21 = 0;
        bVar2.f3151a = i15;
        if (this.f3138s == 1) {
            if (cVar2.f3160f == -1) {
                int i22 = cVar2.f3156b;
                i = i22;
                i2 = i22 - i15;
            } else {
                int i23 = cVar2.f3156b;
                i2 = i23;
                i = i15 + i23;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f3160f == -1) {
            int i24 = cVar2.f3156b;
            i2 = 0;
            i = 0;
            int i25 = i24 - i15;
            i3 = i24;
            i4 = i25;
        } else {
            i4 = cVar2.f3156b;
            i3 = i15 + i4;
            i2 = 0;
            i = 0;
        }
        while (i21 < i14) {
            View view4 = this.f3122K[i21];
            C0780b bVar4 = (C0780b) view4.getLayoutParams();
            if (this.f3138s != 1) {
                i2 = mo4757q() + this.f3121J[bVar4.f3127e];
                i = this.f3140u.mo5115c(view4) + i2;
            } else if (mo4323M()) {
                int o = mo4754o() + this.f3121J[this.f3120I - bVar4.f3127e];
                i5 = o;
                i6 = o - this.f3140u.mo5115c(view4);
                int i26 = i2;
                int i27 = i;
                mo4693a(view4, i6, i26, i5, i27);
                if (!bVar4.mo4774d() || bVar4.mo4773c()) {
                    bVar2.f3153c = true;
                }
                bVar2.f3154d |= view4.hasFocusable();
                i21++;
                i4 = i6;
                i2 = i26;
                i3 = i5;
                i = i27;
            } else {
                i4 = mo4754o() + this.f3121J[bVar4.f3127e];
                i3 = this.f3140u.mo5115c(view4) + i4;
            }
            i6 = i4;
            i5 = i3;
            int i262 = i2;
            int i272 = i;
            mo4693a(view4, i6, i262, i5, i272);
            if (!bVar4.mo4774d()) {
            }
            bVar2.f3153c = true;
            bVar2.f3154d |= view4.hasFocusable();
            i21++;
            i4 = i6;
            i2 = i262;
            i3 = i5;
            i = i272;
        }
        Arrays.fill(this.f3122K, null);
    }

    /* renamed from: a */
    private void m3939a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0780b bVar = (C0780b) view.getLayoutParams();
        Rect rect = bVar.f3317b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int g = mo4305g(bVar.f3127e, bVar.f3128f);
        if (this.f3138s == 1) {
            i2 = C0808o.m4304a(g, i, i5, bVar.width, false);
            i3 = C0808o.m4304a(this.f3140u.mo5122g(), mo4744i(), i4, bVar.height, true);
        } else {
            int a = C0808o.m4304a(g, i, i4, bVar.height, false);
            int a2 = C0808o.m4304a(this.f3140u.mo5122g(), mo4759s(), i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        m3938a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m3937a(float f, int i) {
        m3945n(Math.max(Math.round(f * ((float) this.f3120I)), i));
    }

    /* renamed from: a */
    private void m3938a(View view, int i, int i2, boolean z) {
        boolean z2;
        C0813p pVar = (C0813p) view.getLayoutParams();
        if (z) {
            z2 = mo4720b(view, i, i2, pVar);
        } else {
            z2 = mo4707a(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m3940a(C0820v vVar, C0788a0 a0Var, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.f3122K[i4];
            C0780b bVar = (C0780b) view.getLayoutParams();
            bVar.f3128f = m3944c(vVar, a0Var, mo4749l(view));
            bVar.f3127e = i5;
            i5 += bVar.f3128f;
            i4 += i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4295a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0820v r26, androidx.recyclerview.widget.RecyclerView.C0788a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo4722c(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0780b) r5
            int r6 = r5.f3127e
            int r5 = r5.f3128f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4295a(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo4344j(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3143x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo4732e()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo4732e()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3138s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4323M()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m3936a(r1, r2, r7)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m3936a(r1, r2, r7)
            android.view.View r1 = r0.mo4729d(r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0780b) r9
            int r2 = r9.f3127e
            r18 = r3
            int r3 = r9.f3128f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo4709a(r1, r8, r11)
            r8 = r16
            if (r22 == 0) goto L_0x0100
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f3127e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f3127e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4295a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }
}
