package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import p096e.p114f.p117b.p118j.C3968e.C3971c;

/* renamed from: e.f.b.j.r */
/* compiled from: Snapshot */
public class C3989r {

    /* renamed from: a */
    private int f10141a;

    /* renamed from: b */
    private int f10142b;

    /* renamed from: c */
    private int f10143c;

    /* renamed from: d */
    private int f10144d;

    /* renamed from: e */
    private ArrayList<C3990a> f10145e = new ArrayList<>();

    /* renamed from: e.f.b.j.r$a */
    /* compiled from: Snapshot */
    static class C3990a {

        /* renamed from: a */
        private C3968e f10146a;

        /* renamed from: b */
        private C3968e f10147b;

        /* renamed from: c */
        private int f10148c;

        /* renamed from: d */
        private C3971c f10149d;

        /* renamed from: e */
        private int f10150e;

        public C3990a(C3968e eVar) {
            this.f10146a = eVar;
            this.f10147b = eVar.mo14310h();
            this.f10148c = eVar.mo14304b();
            this.f10149d = eVar.mo14309g();
            this.f10150e = eVar.mo14296a();
        }

        /* renamed from: a */
        public void mo14485a(C3973f fVar) {
            fVar.mo14330a(this.f10146a.mo14311i()).mo14303a(this.f10147b, this.f10148c, this.f10149d, this.f10150e);
        }

        /* renamed from: b */
        public void mo14486b(C3973f fVar) {
            this.f10146a = fVar.mo14330a(this.f10146a.mo14311i());
            C3968e eVar = this.f10146a;
            if (eVar != null) {
                this.f10147b = eVar.mo14310h();
                this.f10148c = this.f10146a.mo14304b();
                this.f10149d = this.f10146a.mo14309g();
                this.f10150e = this.f10146a.mo14296a();
                return;
            }
            this.f10147b = null;
            this.f10148c = 0;
            this.f10149d = C3971c.STRONG;
            this.f10150e = 0;
        }
    }

    public C3989r(C3973f fVar) {
        this.f10141a = fVar.mo14319E();
        this.f10142b = fVar.mo14320F();
        this.f10143c = fVar.mo14316B();
        this.f10144d = fVar.mo14381l();
        ArrayList c = fVar.mo14357c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            this.f10145e.add(new C3990a((C3968e) c.get(i)));
        }
    }

    /* renamed from: a */
    public void mo14483a(C3973f fVar) {
        fVar.mo14407x(this.f10141a);
        fVar.mo14409y(this.f10142b);
        fVar.mo14401u(this.f10143c);
        fVar.mo14384m(this.f10144d);
        int size = this.f10145e.size();
        for (int i = 0; i < size; i++) {
            ((C3990a) this.f10145e.get(i)).mo14485a(fVar);
        }
    }

    /* renamed from: b */
    public void mo14484b(C3973f fVar) {
        this.f10141a = fVar.mo14319E();
        this.f10142b = fVar.mo14320F();
        this.f10143c = fVar.mo14316B();
        this.f10144d = fVar.mo14381l();
        int size = this.f10145e.size();
        for (int i = 0; i < size; i++) {
            ((C3990a) this.f10145e.get(i)).mo14486b(fVar);
        }
    }
}
