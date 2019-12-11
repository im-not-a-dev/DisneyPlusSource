package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0788a0;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0826a;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0827b;

/* renamed from: androidx.recyclerview.widget.q */
/* compiled from: PagerSnapHelper */
public class C0895q extends C0901u {

    /* renamed from: c */
    private C0892p f3628c;

    /* renamed from: d */
    private C0892p f3629d;

    /* renamed from: androidx.recyclerview.widget.q$a */
    /* compiled from: PagerSnapHelper */
    class C0896a extends C0888m {
        C0896a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3934a(View view, C0788a0 a0Var, C0826a aVar) {
            C0895q qVar = C0895q.this;
            int[] a = qVar.mo5126a(qVar.f3635a.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int d = mo5103d(Math.max(Math.abs(i), Math.abs(i2)));
            if (d > 0) {
                aVar.mo4852a(i, i2, d, this.f3619j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo3935e(int i) {
            return Math.min(100, super.mo3935e(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo5099a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: d */
    private C0892p m4981d(C0808o oVar) {
        C0892p pVar = this.f3629d;
        if (pVar == null || pVar.f3625a != oVar) {
            this.f3629d = C0892p.m4932a(oVar);
        }
        return this.f3629d;
    }

    /* renamed from: e */
    private C0892p m4982e(C0808o oVar) {
        C0892p pVar = this.f3628c;
        if (pVar == null || pVar.f3625a != oVar) {
            this.f3628c = C0892p.m4934b(oVar);
        }
        return this.f3628c;
    }

    /* renamed from: a */
    public int mo5125a(C0808o oVar, int i, int i2) {
        int j = oVar.mo4745j();
        if (j == 0) {
            return -1;
        }
        View view = null;
        if (oVar.mo3882b()) {
            view = m4980b(oVar, m4982e(oVar));
        } else if (oVar.mo3862a()) {
            view = m4980b(oVar, m4981d(oVar));
        }
        if (view == null) {
            return -1;
        }
        int l = oVar.mo4749l(view);
        if (l == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !oVar.mo3862a() ? i2 > 0 : i > 0;
        if (oVar instanceof C0827b) {
            PointF a = ((C0827b) oVar).mo4327a(j - 1);
            if (a != null && (a.x < 0.0f || a.y < 0.0f)) {
                z = true;
            }
        }
        if (z) {
            if (z2) {
                l--;
            }
        } else if (z2) {
            l++;
        }
        return l;
    }

    /* renamed from: a */
    public int[] mo5126a(C0808o oVar, View view) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0888m mo5127b(C0808o oVar) {
        if (!(oVar instanceof C0827b)) {
            return null;
        }
        return new C0896a(this.f3635a.getContext());
    }

    /* renamed from: c */
    public View mo5128c(C0808o oVar) {
        if (oVar.mo3882b()) {
            return m4979a(oVar, m4982e(oVar));
        }
        if (oVar.mo3862a()) {
            return m4979a(oVar, m4981d(oVar));
        }
        return null;
    }

    /* renamed from: b */
    private View m4980b(C0808o oVar, C0892p pVar) {
        int e = oVar.mo4732e();
        View view = null;
        if (e == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < e; i2++) {
            View d = oVar.mo4729d(i2);
            int d2 = pVar.mo5117d(d);
            if (d2 < i) {
                view = d;
                i = d2;
            }
        }
        return view;
    }

    /* renamed from: a */
    private View m4979a(C0808o oVar, C0892p pVar) {
        int i;
        int e = oVar.mo4732e();
        View view = null;
        if (e == 0) {
            return null;
        }
        if (oVar.mo4737f()) {
            i = pVar.mo5120f() + (pVar.mo5122g() / 2);
        } else {
            i = pVar.mo5109a() / 2;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            View d = oVar.mo4729d(i3);
            int abs = Math.abs((pVar.mo5117d(d) + (pVar.mo5113b(d) / 2)) - i);
            if (abs < i2) {
                view = d;
                i2 = abs;
            }
        }
        return view;
    }
}
