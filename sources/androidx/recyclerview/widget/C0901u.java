package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView.C0808o;
import androidx.recyclerview.widget.RecyclerView.C0815r;
import androidx.recyclerview.widget.RecyclerView.C0817t;
import androidx.recyclerview.widget.RecyclerView.C0825z;
import androidx.recyclerview.widget.RecyclerView.C0825z.C0827b;

/* renamed from: androidx.recyclerview.widget.u */
/* compiled from: SnapHelper */
public abstract class C0901u extends C0815r {

    /* renamed from: a */
    RecyclerView f3635a;

    /* renamed from: b */
    private final C0817t f3636b = new C0902a();

    /* renamed from: androidx.recyclerview.widget.u$a */
    /* compiled from: SnapHelper */
    class C0902a extends C0817t {

        /* renamed from: a */
        boolean f3637a = false;

        C0902a() {
        }

        /* renamed from: a */
        public void mo4783a(RecyclerView recyclerView, int i) {
            super.mo4783a(recyclerView, i);
            if (i == 0 && this.f3637a) {
                this.f3637a = false;
                C0901u.this.mo5149a();
            }
        }

        /* renamed from: a */
        public void mo4784a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3637a = true;
            }
        }
    }

    /* renamed from: b */
    private void m5026b() {
        this.f3635a.mo4404b(this.f3636b);
        this.f3635a.setOnFlingListener(null);
    }

    /* renamed from: c */
    private void m5028c() throws IllegalStateException {
        if (this.f3635a.getOnFlingListener() == null) {
            this.f3635a.mo4385a(this.f3636b);
            this.f3635a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: a */
    public abstract int mo5125a(C0808o oVar, int i, int i2);

    /* renamed from: a */
    public boolean mo4779a(int i, int i2) {
        C0808o layoutManager = this.f3635a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f3635a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3635a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5027b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public abstract int[] mo5126a(C0808o oVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public abstract C0888m mo5127b(C0808o oVar);

    /* renamed from: c */
    public abstract View mo5128c(C0808o oVar);

    /* renamed from: b */
    private boolean m5027b(C0808o oVar, int i, int i2) {
        if (!(oVar instanceof C0827b)) {
            return false;
        }
        C0825z a = mo5148a(oVar);
        if (a == null) {
            return false;
        }
        int a2 = mo5125a(oVar, i, i2);
        if (a2 == -1) {
            return false;
        }
        a.mo4846c(a2);
        oVar.mo3877b(a);
        return true;
    }

    /* renamed from: a */
    public void mo5150a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3635a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5026b();
            }
            this.f3635a = recyclerView;
            if (this.f3635a != null) {
                m5028c();
                new Scroller(this.f3635a.getContext(), new DecelerateInterpolator());
                mo5149a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5149a() {
        RecyclerView recyclerView = this.f3635a;
        if (recyclerView != null) {
            C0808o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = mo5128c(layoutManager);
                if (c != null) {
                    int[] a = mo5126a(layoutManager, c);
                    if (!(a[0] == 0 && a[1] == 0)) {
                        this.f3635a.mo4467i(a[0], a[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0825z mo5148a(C0808o oVar) {
        return mo5127b(oVar);
    }
}
