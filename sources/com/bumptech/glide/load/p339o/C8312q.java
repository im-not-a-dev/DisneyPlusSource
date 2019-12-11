package com.bumptech.glide.load.p339o;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8122d.C8123a;
import com.bumptech.glide.load.p334n.C8251q;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.C10657j;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.o.q */
/* compiled from: MultiModelLoader */
class C8312q<Model, Data> implements C8306n<Model, Data> {

    /* renamed from: a */
    private final List<C8306n<Model, Data>> f17779a;

    /* renamed from: b */
    private final C4114f<List<Throwable>> f17780b;

    /* renamed from: com.bumptech.glide.load.o.q$a */
    /* compiled from: MultiModelLoader */
    static class C8313a<Data> implements C8122d<Data>, C8123a<Data> {

        /* renamed from: U */
        private final C4114f<List<Throwable>> f17781U;

        /* renamed from: V */
        private int f17782V = 0;

        /* renamed from: W */
        private C10657j f17783W;

        /* renamed from: X */
        private C8123a<? super Data> f17784X;

        /* renamed from: Y */
        private List<Throwable> f17785Y;

        /* renamed from: Z */
        private boolean f17786Z;

        /* renamed from: c */
        private final List<C8122d<Data>> f17787c;

        C8313a(List<C8122d<Data>> list, C4114f<List<Throwable>> fVar) {
            this.f17781U = fVar;
            C10774j.m34015a(list);
            this.f17787c = list;
        }

        /* renamed from: c */
        private void m24144c() {
            if (!this.f17786Z) {
                if (this.f17782V < this.f17787c.size() - 1) {
                    this.f17782V++;
                    mo21141a(this.f17783W, this.f17784X);
                } else {
                    C10774j.m34012a(this.f17785Y);
                    this.f17784X.mo21179a((Exception) new C8251q("Fetch failed", (List<Throwable>) new ArrayList<Throwable>(this.f17785Y)));
                }
            }
        }

        /* renamed from: a */
        public void mo21141a(C10657j jVar, C8123a<? super Data> aVar) {
            this.f17783W = jVar;
            this.f17784X = aVar;
            this.f17785Y = (List) this.f17781U.mo14666a();
            ((C8122d) this.f17787c.get(this.f17782V)).mo21141a(jVar, this);
            if (this.f17786Z) {
                cancel();
            }
        }

        /* renamed from: b */
        public C8105a mo21142b() {
            return ((C8122d) this.f17787c.get(0)).mo21142b();
        }

        public void cancel() {
            this.f17786Z = true;
            for (C8122d cancel : this.f17787c) {
                cancel.cancel();
            }
        }

        public void cleanup() {
            List<Throwable> list = this.f17785Y;
            if (list != null) {
                this.f17781U.mo14667a(list);
            }
            this.f17785Y = null;
            for (C8122d cleanup : this.f17787c) {
                cleanup.cleanup();
            }
        }

        /* renamed from: a */
        public Class<Data> mo21140a() {
            return ((C8122d) this.f17787c.get(0)).mo21140a();
        }

        /* renamed from: a */
        public void mo21180a(Data data) {
            if (data != null) {
                this.f17784X.mo21180a(data);
            } else {
                m24144c();
            }
        }

        /* renamed from: a */
        public void mo21179a(Exception exc) {
            List<Throwable> list = this.f17785Y;
            C10774j.m34012a(list);
            list.add(exc);
            m24144c();
        }
    }

    C8312q(List<C8306n<Model, Data>> list, C4114f<List<Throwable>> fVar) {
        this.f17779a = list;
        this.f17780b = fVar;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(ModelMODEL, int i, int i2, C8115i iVar) {
        int size = this.f17779a.size();
        ArrayList arrayList = new ArrayList(size);
        C8111g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C8306n nVar = (C8306n) this.f17779a.get(i3);
            if (nVar.mo19953a(model)) {
                C8307a a = nVar.mo19951a(model, i, i2, iVar);
                if (a != null) {
                    gVar = a.f17772a;
                    arrayList.add(a.f17774c);
                }
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new C8307a<>(gVar, new C8313a(arrayList, this.f17780b));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.f17779a.toArray()));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo19953a(ModelMODEL) {
        for (C8306n a : this.f17779a) {
            if (a.mo19953a(model)) {
                return true;
            }
        }
        return false;
    }
}
