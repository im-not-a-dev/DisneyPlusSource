package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0794d0;
import androidx.recyclerview.widget.RecyclerView.C0802l;
import androidx.recyclerview.widget.RecyclerView.C0802l.C0805c;

/* renamed from: androidx.recyclerview.widget.t */
/* compiled from: SimpleItemAnimator */
public abstract class C0900t extends C0802l {

    /* renamed from: g */
    boolean f3634g = true;

    /* renamed from: a */
    public void mo5132a(boolean z) {
        this.f3634g = z;
    }

    /* renamed from: a */
    public abstract boolean mo4982a(C0794d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo4983a(C0794d0 d0Var, C0794d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public boolean mo4664b(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
        int i = cVar.f3289a;
        int i2 = cVar.f3290b;
        View view = d0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3289a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3290b;
        if (d0Var.isRemoved() || (i == left && i2 == top)) {
            return mo4986g(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4982a(d0Var, i, i2, left, top);
    }

    /* renamed from: c */
    public void mo5134c(C0794d0 d0Var, boolean z) {
    }

    /* renamed from: c */
    public boolean mo4667c(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
        if (cVar.f3289a == cVar2.f3289a && cVar.f3290b == cVar2.f3290b) {
            mo5138j(d0Var);
            return false;
        }
        return mo4982a(d0Var, cVar.f3289a, cVar.f3290b, cVar2.f3289a, cVar2.f3290b);
    }

    /* renamed from: d */
    public void mo5135d(C0794d0 d0Var, boolean z) {
    }

    /* renamed from: f */
    public abstract boolean mo4985f(C0794d0 d0Var);

    /* renamed from: g */
    public abstract boolean mo4986g(C0794d0 d0Var);

    /* renamed from: h */
    public final void mo5136h(C0794d0 d0Var) {
        mo5142n(d0Var);
        mo4663b(d0Var);
    }

    /* renamed from: i */
    public final void mo5137i(C0794d0 d0Var) {
        mo5143o(d0Var);
    }

    /* renamed from: j */
    public final void mo5138j(C0794d0 d0Var) {
        mo5144p(d0Var);
        mo4663b(d0Var);
    }

    /* renamed from: k */
    public final void mo5139k(C0794d0 d0Var) {
        mo5145q(d0Var);
    }

    /* renamed from: l */
    public final void mo5140l(C0794d0 d0Var) {
        mo5146r(d0Var);
        mo4663b(d0Var);
    }

    /* renamed from: m */
    public final void mo5141m(C0794d0 d0Var) {
        mo5147s(d0Var);
    }

    /* renamed from: n */
    public void mo5142n(C0794d0 d0Var) {
    }

    /* renamed from: o */
    public void mo5143o(C0794d0 d0Var) {
    }

    /* renamed from: p */
    public void mo5144p(C0794d0 d0Var) {
    }

    /* renamed from: q */
    public void mo5145q(C0794d0 d0Var) {
    }

    /* renamed from: r */
    public void mo5146r(C0794d0 d0Var) {
    }

    /* renamed from: s */
    public void mo5147s(C0794d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo4656a(C0794d0 d0Var) {
        return !this.f3634g || d0Var.isInvalid();
    }

    /* renamed from: a */
    public boolean mo4658a(C0794d0 d0Var, C0805c cVar, C0805c cVar2) {
        if (cVar == null || (cVar.f3289a == cVar2.f3289a && cVar.f3290b == cVar2.f3290b)) {
            return mo4985f(d0Var);
        }
        return mo4982a(d0Var, cVar.f3289a, cVar.f3290b, cVar2.f3289a, cVar2.f3290b);
    }

    /* renamed from: a */
    public boolean mo4657a(C0794d0 d0Var, C0794d0 d0Var2, C0805c cVar, C0805c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3289a;
        int i4 = cVar.f3290b;
        if (d0Var2.shouldIgnore()) {
            int i5 = cVar.f3289a;
            i = cVar.f3290b;
            i2 = i5;
        } else {
            i2 = cVar2.f3289a;
            i = cVar2.f3290b;
        }
        return mo4983a(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: b */
    public final void mo5133b(C0794d0 d0Var, boolean z) {
        mo5135d(d0Var, z);
    }

    /* renamed from: a */
    public final void mo5131a(C0794d0 d0Var, boolean z) {
        mo5134c(d0Var, z);
        mo4663b(d0Var);
    }
}
