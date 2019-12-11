package p096e.p097a.p104o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p096e.p121h.p135s.C4135d0;
import p096e.p121h.p135s.C4140e0;
import p096e.p121h.p135s.C4143f0;

/* renamed from: e.a.o.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C3899h {

    /* renamed from: a */
    final ArrayList<C4135d0> f9670a = new ArrayList<>();

    /* renamed from: b */
    private long f9671b = -1;

    /* renamed from: c */
    private Interpolator f9672c;

    /* renamed from: d */
    C4140e0 f9673d;

    /* renamed from: e */
    private boolean f9674e;

    /* renamed from: f */
    private final C4143f0 f9675f = new C3900a();

    /* renamed from: e.a.o.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C3900a extends C4143f0 {

        /* renamed from: a */
        private boolean f9676a = false;

        /* renamed from: b */
        private int f9677b = 0;

        C3900a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13954a() {
            this.f9677b = 0;
            this.f9676a = false;
            C3899h.this.mo13952b();
        }

        /* renamed from: b */
        public void mo531b(View view) {
            int i = this.f9677b + 1;
            this.f9677b = i;
            if (i == C3899h.this.f9670a.size()) {
                C4140e0 e0Var = C3899h.this.f9673d;
                if (e0Var != null) {
                    e0Var.mo531b(null);
                }
                mo13954a();
            }
        }

        /* renamed from: c */
        public void mo532c(View view) {
            if (!this.f9676a) {
                this.f9676a = true;
                C4140e0 e0Var = C3899h.this.f9673d;
                if (e0Var != null) {
                    e0Var.mo532c(null);
                }
            }
        }
    }

    /* renamed from: a */
    public C3899h mo13948a(C4135d0 d0Var) {
        if (!this.f9674e) {
            this.f9670a.add(d0Var);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13952b() {
        this.f9674e = false;
    }

    /* renamed from: c */
    public void mo13953c() {
        if (!this.f9674e) {
            Iterator it = this.f9670a.iterator();
            while (it.hasNext()) {
                C4135d0 d0Var = (C4135d0) it.next();
                long j = this.f9671b;
                if (j >= 0) {
                    d0Var.mo14705a(j);
                }
                Interpolator interpolator = this.f9672c;
                if (interpolator != null) {
                    d0Var.mo14706a(interpolator);
                }
                if (this.f9673d != null) {
                    d0Var.mo14707a((C4140e0) this.f9675f);
                }
                d0Var.mo14714c();
            }
            this.f9674e = true;
        }
    }

    /* renamed from: a */
    public C3899h mo13949a(C4135d0 d0Var, C4135d0 d0Var2) {
        this.f9670a.add(d0Var);
        d0Var2.mo14712b(d0Var.mo14710b());
        this.f9670a.add(d0Var2);
        return this;
    }

    /* renamed from: a */
    public void mo13951a() {
        if (this.f9674e) {
            Iterator it = this.f9670a.iterator();
            while (it.hasNext()) {
                ((C4135d0) it.next()).mo14709a();
            }
            this.f9674e = false;
        }
    }

    /* renamed from: a */
    public C3899h mo13946a(long j) {
        if (!this.f9674e) {
            this.f9671b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C3899h mo13947a(Interpolator interpolator) {
        if (!this.f9674e) {
            this.f9672c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C3899h mo13950a(C4140e0 e0Var) {
        if (!this.f9674e) {
            this.f9673d = e0Var;
        }
        return this;
    }
}
