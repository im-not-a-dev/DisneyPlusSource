package com.bumptech.glide.load.p339o;

import java.util.Queue;
import p163g.p413f.p414a.p424w.C10771g;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.o.m */
/* compiled from: ModelCache */
public class C8303m<A, B> {

    /* renamed from: a */
    private final C10771g<C8305b<A>, B> f17767a;

    /* renamed from: com.bumptech.glide.load.o.m$a */
    /* compiled from: ModelCache */
    class C8304a extends C10771g<C8305b<A>, B> {
        C8304a(C8303m mVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo21283a(C8305b<A> bVar, B b) {
            bVar.mo21482a();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.m$b */
    /* compiled from: ModelCache */
    static final class C8305b<A> {

        /* renamed from: d */
        private static final Queue<C8305b<?>> f17768d = C10775k.m34028a(0);

        /* renamed from: a */
        private int f17769a;

        /* renamed from: b */
        private int f17770b;

        /* renamed from: c */
        private A f17771c;

        private C8305b() {
        }

        /* renamed from: a */
        static <A> C8305b<A> m24125a(A a, int i, int i2) {
            C8305b<A> bVar;
            synchronized (f17768d) {
                bVar = (C8305b) f17768d.poll();
            }
            if (bVar == null) {
                bVar = new C8305b<>();
            }
            bVar.m24126b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m24126b(A a, int i, int i2) {
            this.f17771c = a;
            this.f17770b = i;
            this.f17769a = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8305b)) {
                return false;
            }
            C8305b bVar = (C8305b) obj;
            if (this.f17770b == bVar.f17770b && this.f17769a == bVar.f17769a && this.f17771c.equals(bVar.f17771c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f17769a * 31) + this.f17770b) * 31) + this.f17771c.hashCode();
        }

        /* renamed from: a */
        public void mo21482a() {
            synchronized (f17768d) {
                f17768d.offer(this);
            }
        }
    }

    public C8303m(long j) {
        this.f17767a = new C8304a(this, j);
    }

    /* renamed from: a */
    public B mo21479a(A a, int i, int i2) {
        C8305b a2 = C8305b.m24125a(a, i, i2);
        B a3 = this.f17767a.mo27803a(a2);
        a2.mo21482a();
        return a3;
    }

    /* renamed from: a */
    public void mo21480a(A a, int i, int i2, B b) {
        this.f17767a.mo27807b(C8305b.m24125a(a, i, i2), b);
    }
}
