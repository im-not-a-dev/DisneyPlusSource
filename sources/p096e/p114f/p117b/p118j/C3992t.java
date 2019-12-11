package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import p096e.p114f.p117b.C3955c;

/* renamed from: e.f.b.j.t */
/* compiled from: WidgetContainer */
public class C3992t extends C3973f {

    /* renamed from: J0 */
    public ArrayList<C3973f> f10159J0 = new ArrayList<>();

    /* renamed from: K */
    public void mo14325K() {
        this.f10159J0.clear();
        super.mo14325K();
    }

    /* renamed from: P */
    public void mo14328P() {
        super.mo14328P();
        ArrayList<C3973f> arrayList = this.f10159J0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3973f fVar = (C3973f) this.f10159J0.get(i);
                fVar.mo14349b(mo14377j(), mo14379k());
                if (!(fVar instanceof C3976g)) {
                    fVar.mo14328P();
                }
            }
        }
    }

    /* renamed from: R */
    public ArrayList<C3973f> mo14286R() {
        return this.f10159J0;
    }

    /* renamed from: S */
    public C3976g mo14501S() {
        C3973f r = mo14393r();
        C3976g gVar = this instanceof C3976g ? (C3976g) this : null;
        while (r != null) {
            C3973f r2 = r.mo14393r();
            if (r instanceof C3976g) {
                gVar = (C3976g) r;
            }
            r = r2;
        }
        return gVar;
    }

    /* renamed from: T */
    public void mo14412T() {
        mo14328P();
        ArrayList<C3973f> arrayList = this.f10159J0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3973f fVar = (C3973f) this.f10159J0.get(i);
                if (fVar instanceof C3992t) {
                    ((C3992t) fVar).mo14412T();
                }
            }
        }
    }

    /* renamed from: U */
    public void mo14502U() {
        this.f10159J0.clear();
    }

    /* renamed from: a */
    public void mo14503a(C3973f fVar) {
        this.f10159J0.add(fVar);
        if (fVar.mo14393r() != null) {
            ((C3992t) fVar.mo14393r()).mo14504d(fVar);
        }
        fVar.mo14361c((C3973f) this);
    }

    /* renamed from: b */
    public void mo14349b(int i, int i2) {
        super.mo14349b(i, i2);
        int size = this.f10159J0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C3973f) this.f10159J0.get(i3)).mo14349b(mo14402v(), mo14404w());
        }
    }

    /* renamed from: d */
    public void mo14504d(C3973f fVar) {
        this.f10159J0.remove(fVar);
        fVar.mo14361c((C3973f) null);
    }

    /* renamed from: a */
    public void mo14335a(C3955c cVar) {
        super.mo14335a(cVar);
        int size = this.f10159J0.size();
        for (int i = 0; i < size; i++) {
            ((C3973f) this.f10159J0.get(i)).mo14335a(cVar);
        }
    }
}
