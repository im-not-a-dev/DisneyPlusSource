package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;

/* renamed from: androidx.recyclerview.widget.s */
/* compiled from: ScrollbarHelper */
class C0899s {
    /* renamed from: a */
    static int m4998a(C0788a0 a0Var, C0892p pVar, View view, View view2, C0808o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.mo4732e() == 0 || a0Var.mo4531b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.mo4749l(view), oVar.mo4749l(view2));
        int max = Math.max(oVar.mo4749l(view), oVar.mo4749l(view2));
        if (z2) {
            i = Math.max(0, (a0Var.mo4531b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(pVar.mo5110a(view2) - pVar.mo5117d(view))) / ((float) (Math.abs(oVar.mo4749l(view) - oVar.mo4749l(view2)) + 1)))) + ((float) (pVar.mo5120f() - pVar.mo5117d(view))));
    }

    /* renamed from: b */
    static int m4999b(C0788a0 a0Var, C0892p pVar, View view, View view2, C0808o oVar, boolean z) {
        if (oVar.mo4732e() == 0 || a0Var.mo4531b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo4531b();
        }
        return (int) ((((float) (pVar.mo5110a(view2) - pVar.mo5117d(view))) / ((float) (Math.abs(oVar.mo4749l(view) - oVar.mo4749l(view2)) + 1))) * ((float) a0Var.mo4531b()));
    }

    /* renamed from: a */
    static int m4997a(C0788a0 a0Var, C0892p pVar, View view, View view2, C0808o oVar, boolean z) {
        if (oVar.mo4732e() == 0 || a0Var.mo4531b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo4749l(view) - oVar.mo4749l(view2)) + 1;
        }
        return Math.min(pVar.mo5122g(), pVar.mo5110a(view2) - pVar.mo5117d(view));
    }
}
