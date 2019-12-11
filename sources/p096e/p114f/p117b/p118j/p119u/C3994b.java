package p096e.p114f.p117b.p118j.p119u;

import java.util.ArrayList;
import java.util.Iterator;
import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.C3959f;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3980j;
import p096e.p114f.p117b.p118j.C3982k;
import p096e.p114f.p117b.p118j.C3984m;
import p096e.p114f.p117b.p118j.C3991s;

/* renamed from: e.f.b.j.u.b */
/* compiled from: BasicMeasure */
public class C3994b {

    /* renamed from: a */
    private final ArrayList<C3973f> f10160a = new ArrayList<>();

    /* renamed from: b */
    private C3976g f10161b;

    /* renamed from: e.f.b.j.u.b$a */
    /* compiled from: BasicMeasure */
    public static class C3995a {

        /* renamed from: a */
        public C3975b f10162a;

        /* renamed from: b */
        public C3975b f10163b;

        /* renamed from: c */
        public int f10164c;

        /* renamed from: d */
        public int f10165d;

        /* renamed from: e */
        public int f10166e;

        /* renamed from: f */
        public int f10167f;

        /* renamed from: g */
        public int f10168g;
    }

    /* renamed from: e.f.b.j.u.b$b */
    /* compiled from: BasicMeasure */
    public interface C3996b {
        /* renamed from: a */
        void mo2380a();

        /* renamed from: a */
        void mo2381a(C3973f fVar, C3975b bVar, int i, C3975b bVar2, int i2);

        /* renamed from: a */
        void mo2382a(C3973f fVar, C3995a aVar);

        /* renamed from: a */
        boolean mo2383a(C3973f fVar);
    }

    public C3994b(C3976g gVar) {
        this.f10161b = gVar;
    }

    /* renamed from: b */
    private void m13710b(C3976g gVar) {
        int size = gVar.f10159J0.size();
        C3996b V = gVar.mo14413V();
        for (int i = 0; i < size; i++) {
            C3973f fVar = (C3973f) gVar.f10159J0.get(i);
            if (!(fVar instanceof C3980j) && (!fVar.f10006d.f10212e.f10186j || !fVar.f10008e.f10212e.f10186j)) {
                C3975b c = fVar.mo14356c(0);
                boolean z = true;
                C3975b c2 = fVar.mo14356c(1);
                C3975b bVar = C3975b.MATCH_CONSTRAINT;
                if (c != bVar || fVar.f10020k == 1 || c2 != bVar || fVar.f10022l == 1) {
                    z = false;
                }
                if (!z) {
                    V.mo2381a(fVar, fVar.mo14387o(), fVar.mo14316B(), fVar.mo14410z(), fVar.mo14381l());
                }
            }
        }
        V.mo2380a();
    }

    /* renamed from: a */
    public void mo14505a(C3976g gVar) {
        this.f10160a.clear();
        int size = gVar.f10159J0.size();
        for (int i = 0; i < size; i++) {
            C3973f fVar = (C3973f) gVar.f10159J0.get(i);
            if (fVar.mo14387o() == C3975b.MATCH_CONSTRAINT || fVar.mo14387o() == C3975b.MATCH_PARENT || fVar.mo14410z() == C3975b.MATCH_CONSTRAINT || fVar.mo14410z() == C3975b.MATCH_PARENT) {
                this.f10160a.add(fVar);
            }
        }
        gVar.mo14416Y();
    }

    /* renamed from: a */
    private void m13709a(String str) {
        this.f10161b.mo14412T();
    }

    /* renamed from: a */
    public void mo14506a(C3976g gVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        boolean z;
        boolean z2;
        C3996b bVar;
        int i9;
        boolean z3;
        int i10;
        C3976g gVar2 = gVar;
        int i11 = i;
        int i12 = i2;
        int i13 = i4;
        C3996b V = gVar.mo14413V();
        int size = gVar2.f10159J0.size();
        int B = gVar.mo14316B();
        int l = gVar.mo14381l();
        boolean a = C3984m.m13654a(i11, 128);
        boolean z4 = a || C3984m.m13654a(i11, 64);
        if (z4) {
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                C3973f fVar = (C3973f) gVar2.f10159J0.get(i14);
                boolean z5 = (fVar.mo14387o() == C3975b.MATCH_CONSTRAINT) && (fVar.mo14410z() == C3975b.MATCH_CONSTRAINT) && fVar.mo14373h() > 0.0f;
                if ((!fVar.mo14323I() || !z5) && (!fVar.mo14324J() || !z5)) {
                    i14++;
                }
            }
            z4 = false;
        }
        if (z4) {
            C3959f fVar2 = C3957e.f9848r;
            if (fVar2 != null) {
                fVar2.f9868a++;
            }
        }
        if (z4 && (i12 == 1073741824 && i13 == 1073741824)) {
            if (i12 == 1073741824 && i13 == 1073741824) {
                z = gVar2.mo14427d(a);
                i8 = 2;
            } else {
                int E = gVar.mo14319E();
                int F = gVar.mo14320F();
                z = gVar2.mo14429e(a);
                if (i12 == 1073741824) {
                    z &= gVar2.mo14422a(a, 0);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (i13 == 1073741824) {
                    z &= gVar2.mo14422a(a, 1);
                    i8++;
                }
                gVar2.mo14407x(E);
                gVar2.mo14409y(F);
            }
            if (z) {
                gVar2.mo14345a(i12 == 1073741824, i13 == 1073741824);
            }
        } else {
            gVar2.f10006d.mo14510c();
            gVar2.f10008e.mo14510c();
            Iterator it = gVar.mo14286R().iterator();
            while (it.hasNext()) {
                C3973f fVar3 = (C3973f) it.next();
                fVar3.f10006d.mo14510c();
                fVar3.f10008e.mo14510c();
            }
            z = false;
            i8 = 0;
        }
        if (!z || i8 != 2) {
            if (size > 0) {
                m13710b(gVar);
            }
            int W = gVar.mo14414W();
            gVar2.mo14411A(64);
            if (size > 0) {
                m13709a("First pass");
            }
            int size2 = this.f10160a.size();
            if (size2 > 0) {
                boolean z6 = gVar.mo14387o() == C3975b.WRAP_CONTENT;
                boolean z7 = gVar.mo14410z() == C3975b.WRAP_CONTENT;
                int max = Math.max(gVar.mo14316B(), this.f10161b.mo14391q());
                int max2 = Math.max(gVar.mo14381l(), this.f10161b.mo14389p());
                int i15 = 0;
                boolean z8 = false;
                while (i15 < size2) {
                    C3973f fVar4 = (C3973f) this.f10160a.get(i15);
                    if ((!(fVar4 instanceof C3982k) || (fVar4 instanceof C3991s)) && !(fVar4 instanceof C3980j) && fVar4.mo14315A() != 8 && (!fVar4.f10006d.f10212e.f10186j || !fVar4.f10008e.f10212e.f10186j)) {
                        int B2 = fVar4.mo14316B();
                        int l2 = fVar4.mo14381l();
                        i9 = size2;
                        int d = fVar4.mo14363d();
                        boolean a2 = z8 | V.mo2383a(fVar4);
                        bVar = V;
                        int B3 = fVar4.mo14316B();
                        boolean z9 = a2;
                        int l3 = fVar4.mo14381l();
                        if (B3 != B2) {
                            fVar4.mo14401u(B3);
                            if (z6 && fVar4.mo14400u() > max) {
                                max = Math.max(max, fVar4.mo14400u() + fVar4.mo14330a(C3972d.RIGHT).mo14304b());
                            }
                            i10 = max;
                            z3 = true;
                        } else {
                            i10 = max;
                            z3 = z9;
                        }
                        if (l3 != l2) {
                            fVar4.mo14384m(l3);
                            if (z7 && fVar4.mo14367e() > max2) {
                                max2 = Math.max(max2, fVar4.mo14367e() + fVar4.mo14330a(C3972d.BOTTOM).mo14304b());
                            }
                            z3 = true;
                        }
                        if (fVar4.mo14321G() && d != fVar4.mo14363d()) {
                            z3 = true;
                        }
                        z8 = fVar4 instanceof C3991s ? ((C3991s) fVar4).mo14498Z() | z3 : z3;
                        max = i10;
                    } else {
                        i9 = size2;
                        bVar = V;
                    }
                    i15++;
                    size2 = i9;
                    V = bVar;
                }
                if (z8) {
                    gVar2.mo14401u(B);
                    gVar2.mo14384m(l);
                    m13709a("2nd pass");
                    if (gVar.mo14316B() < max) {
                        gVar2.mo14401u(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (gVar.mo14381l() < max2) {
                        gVar2.mo14384m(max2);
                        z2 = true;
                    }
                    if (z2) {
                        m13709a("3rd pass");
                    }
                }
            }
            gVar2.mo14411A(W);
        }
    }
}
