package p096e.p114f.p117b.p118j.p119u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.C3976g;
import p096e.p114f.p117b.p118j.C3980j;
import p096e.p114f.p117b.p118j.C3983l;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3996b;

/* renamed from: e.f.b.j.u.e */
/* compiled from: DependencyGraph */
public class C3999e {

    /* renamed from: a */
    private C3976g f10171a;

    /* renamed from: b */
    private boolean f10172b = true;

    /* renamed from: c */
    private C3976g f10173c;

    /* renamed from: d */
    private ArrayList<C4010m> f10174d = new ArrayList<>();

    /* renamed from: e */
    private C3996b f10175e;

    /* renamed from: f */
    ArrayList<C4007k> f10176f;

    public C3999e(C3976g gVar) {
        new ArrayList();
        this.f10175e = null;
        this.f10176f = new ArrayList<>();
        this.f10171a = gVar;
        this.f10173c = gVar;
    }

    /* renamed from: a */
    public void mo14515a(C3996b bVar) {
        this.f10175e = bVar;
    }

    /* renamed from: b */
    public boolean mo14520b(boolean z) {
        if (this.f10172b) {
            Iterator it = this.f10171a.f10159J0.iterator();
            while (it.hasNext()) {
                C3973f fVar = (C3973f) it.next();
                fVar.f10000a = false;
                C4005j jVar = fVar.f10006d;
                jVar.f10212e.f10186j = false;
                jVar.f10214g = false;
                jVar.mo14526f();
                C4008l lVar = fVar.f10008e;
                lVar.f10212e.f10186j = false;
                lVar.f10214g = false;
                lVar.mo14530f();
            }
            C3976g gVar = this.f10171a;
            gVar.f10000a = false;
            C4005j jVar2 = gVar.f10006d;
            jVar2.f10212e.f10186j = false;
            jVar2.f10214g = false;
            jVar2.mo14526f();
            C4008l lVar2 = this.f10171a.f10008e;
            lVar2.f10212e.f10186j = false;
            lVar2.f10214g = false;
            lVar2.mo14530f();
            mo14514a();
        }
        if (m13730a(this.f10173c)) {
            return false;
        }
        this.f10171a.mo14407x(0);
        this.f10171a.mo14409y(0);
        this.f10171a.f10006d.f10215h.mo14523a(0);
        this.f10171a.f10008e.f10215h.mo14523a(0);
        return true;
    }

    /* renamed from: c */
    public void mo14521c() {
        Iterator it = this.f10171a.f10159J0.iterator();
        while (it.hasNext()) {
            C3973f fVar = (C3973f) it.next();
            if (!fVar.f10000a) {
                C3975b[] bVarArr = fVar.f9985L;
                boolean z = false;
                C3975b bVar = bVarArr[0];
                C3975b bVar2 = bVarArr[1];
                int i = fVar.f10020k;
                int i2 = fVar.f10022l;
                boolean z2 = bVar == C3975b.WRAP_CONTENT || (bVar == C3975b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == C3975b.WRAP_CONTENT || (bVar2 == C3975b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C4002g gVar = fVar.f10006d.f10212e;
                boolean z3 = gVar.f10186j;
                C4002g gVar2 = fVar.f10008e.f10212e;
                boolean z4 = gVar2.f10186j;
                if (z3 && z4) {
                    C3996b bVar3 = this.f10175e;
                    C3975b bVar4 = C3975b.FIXED;
                    bVar3.mo2381a(fVar, bVar4, gVar.f10183g, bVar4, gVar2.f10183g);
                    fVar.f10000a = true;
                } else if (z3 && z) {
                    this.f10175e.mo2381a(fVar, C3975b.FIXED, fVar.f10006d.f10212e.f10183g, C3975b.WRAP_CONTENT, fVar.f10008e.f10212e.f10183g);
                    if (bVar2 == C3975b.MATCH_CONSTRAINT) {
                        fVar.f10008e.f10212e.f10198m = fVar.mo14381l();
                    } else {
                        fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                        fVar.f10000a = true;
                    }
                } else if (z4 && z2) {
                    this.f10175e.mo2381a(fVar, C3975b.WRAP_CONTENT, fVar.f10006d.f10212e.f10183g, C3975b.FIXED, fVar.f10008e.f10212e.f10183g);
                    if (bVar == C3975b.MATCH_CONSTRAINT) {
                        fVar.f10006d.f10212e.f10198m = fVar.mo14316B();
                    } else {
                        fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                        fVar.f10000a = true;
                    }
                }
                if (fVar.f10000a) {
                    C4002g gVar3 = fVar.f10008e.f10206l;
                    if (gVar3 != null) {
                        gVar3.mo14523a(fVar.mo14363d());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private int m13727a(C3976g gVar, int i) {
        int size = this.f10176f.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C4007k) this.f10176f.get(i2)).mo14528a(gVar, i));
        }
        return (int) j;
    }

    /* renamed from: a */
    public boolean mo14517a(boolean z) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        if (this.f10172b) {
            Iterator it = this.f10171a.f10159J0.iterator();
            while (it.hasNext()) {
                C3973f fVar = (C3973f) it.next();
                fVar.f10000a = false;
                C4005j jVar = fVar.f10006d;
                jVar.f10212e.f10186j = false;
                C4008l lVar = fVar.f10008e;
                lVar.f10212e.f10186j = false;
                jVar.f10214g = false;
                lVar.f10214g = false;
                jVar.mo14526f();
                fVar.f10008e.mo14530f();
            }
            C3976g gVar = this.f10171a;
            gVar.f10000a = false;
            C4005j jVar2 = gVar.f10006d;
            jVar2.f10212e.f10186j = false;
            C4008l lVar2 = gVar.f10008e;
            lVar2.f10212e.f10186j = false;
            jVar2.f10214g = false;
            lVar2.f10214g = false;
            jVar2.mo14526f();
            this.f10171a.f10008e.mo14530f();
        }
        if (m13730a(this.f10173c)) {
            return false;
        }
        int E = this.f10171a.mo14319E();
        int F = this.f10171a.mo14320F();
        this.f10171a.mo14407x(0);
        this.f10171a.mo14409y(0);
        C3975b c = this.f10171a.mo14356c(0);
        C3975b c2 = this.f10171a.mo14356c(1);
        if (this.f10172b) {
            mo14514a();
        }
        int E2 = this.f10171a.mo14319E();
        int F2 = this.f10171a.mo14320F();
        this.f10171a.f10006d.f10215h.mo14523a(E2);
        this.f10171a.f10008e.f10215h.mo14523a(F2);
        mo14521c();
        C3975b bVar = C3975b.WRAP_CONTENT;
        if (c == bVar || c2 == bVar) {
            if (z3) {
                Iterator it2 = this.f10174d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((C4010m) it2.next()).mo14512e()) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3 && c == C3975b.WRAP_CONTENT) {
                this.f10171a.mo14340a(C3975b.FIXED);
                C3976g gVar2 = this.f10171a;
                gVar2.mo14401u(m13727a(gVar2, 0));
                C3976g gVar3 = this.f10171a;
                gVar3.f10006d.f10212e.mo14523a(gVar3.mo14316B());
            }
            if (z3 && c2 == C3975b.WRAP_CONTENT) {
                this.f10171a.mo14352b(C3975b.FIXED);
                C3976g gVar4 = this.f10171a;
                gVar4.mo14384m(m13727a(gVar4, 1));
                C3976g gVar5 = this.f10171a;
                gVar5.f10008e.f10212e.mo14523a(gVar5.mo14381l());
            }
        }
        C3975b[] bVarArr = this.f10171a.f9985L;
        if (bVarArr[0] == C3975b.FIXED || bVarArr[0] == C3975b.MATCH_PARENT) {
            int B = this.f10171a.mo14316B() + E2;
            this.f10171a.f10006d.f10216i.mo14523a(B);
            this.f10171a.f10006d.f10212e.mo14523a(B - E2);
            mo14521c();
            C3975b[] bVarArr2 = this.f10171a.f9985L;
            if (bVarArr2[1] == C3975b.FIXED || bVarArr2[1] == C3975b.MATCH_PARENT) {
                int l = this.f10171a.mo14381l() + F2;
                this.f10171a.f10008e.f10216i.mo14523a(l);
                this.f10171a.f10008e.f10212e.mo14523a(l - F2);
            }
            mo14521c();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f10174d.iterator();
        while (it3.hasNext()) {
            C4010m mVar = (C4010m) it3.next();
            if (mVar.f10209b != this.f10171a || mVar.f10214g) {
                mVar.mo14509b();
            }
        }
        Iterator it4 = this.f10171a.f10159J0.iterator();
        while (it4.hasNext()) {
            C3973f fVar2 = (C3973f) it4.next();
            fVar2.mo14380k(fVar2.mo14377j() + E);
            fVar2.mo14382l(fVar2.mo14379k() + F);
        }
        this.f10171a.mo14407x(E);
        this.f10171a.mo14409y(F);
        Iterator it5 = this.f10174d.iterator();
        while (true) {
            if (!it5.hasNext()) {
                z4 = true;
                break;
            }
            C4010m mVar2 = (C4010m) it5.next();
            if ((z2 || mVar2.f10209b != this.f10171a) && (!mVar2.f10215h.f10186j || ((!mVar2.f10216i.f10186j && !(mVar2 instanceof C4003h)) || (!mVar2.f10212e.f10186j && !(mVar2 instanceof C3997c) && !(mVar2 instanceof C4003h))))) {
                break;
            }
        }
        this.f10171a.mo14340a(c);
        this.f10171a.mo14352b(c2);
        return z4;
    }

    /* renamed from: b */
    public void mo14519b() {
        this.f10172b = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0146 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14518a(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            e.f.b.j.g r1 = r9.f10171a
            r2 = 0
            e.f.b.j.f$b r1 = r1.mo14356c(r2)
            e.f.b.j.g r3 = r9.f10171a
            e.f.b.j.f$b r3 = r3.mo14356c(r0)
            e.f.b.j.g r4 = r9.f10171a
            int r4 = r4.mo14319E()
            e.f.b.j.g r5 = r9.f10171a
            int r5 = r5.mo14320F()
            if (r10 == 0) goto L_0x0089
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<e.f.b.j.u.m> r6 = r9.f10174d
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            e.f.b.j.u.m r7 = (p096e.p114f.p117b.p118j.p119u.C4010m) r7
            int r8 = r7.f10213f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo14512e()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            e.f.b.j.f$b r10 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r10.mo14340a(r6)
            e.f.b.j.g r10 = r9.f10171a
            int r6 = r9.m13727a(r10, r2)
            r10.mo14401u(r6)
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.u.j r6 = r10.f10006d
            e.f.b.j.u.g r6 = r6.f10212e
            int r10 = r10.mo14316B()
            r6.mo14523a(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            e.f.b.j.f$b r10 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r10.mo14352b(r6)
            e.f.b.j.g r10 = r9.f10171a
            int r6 = r9.m13727a(r10, r0)
            r10.mo14384m(r6)
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.u.l r6 = r10.f10008e
            e.f.b.j.u.g r6 = r6.f10212e
            int r10 = r10.mo14381l()
            r6.mo14523a(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b6
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.f$b[] r10 = r10.f9985L
            r5 = r10[r2]
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            if (r5 == r6) goto L_0x009b
            r10 = r10[r2]
            e.f.b.j.f$b r5 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c7
        L_0x009b:
            e.f.b.j.g r10 = r9.f10171a
            int r10 = r10.mo14316B()
            int r10 = r10 + r4
            e.f.b.j.g r5 = r9.f10171a
            e.f.b.j.u.j r5 = r5.f10006d
            e.f.b.j.u.f r5 = r5.f10216i
            r5.mo14523a(r10)
            e.f.b.j.g r5 = r9.f10171a
            e.f.b.j.u.j r5 = r5.f10006d
            e.f.b.j.u.g r5 = r5.f10212e
            int r10 = r10 - r4
            r5.mo14523a(r10)
            goto L_0x00e3
        L_0x00b6:
            e.f.b.j.g r10 = r9.f10171a
            e.f.b.j.f$b[] r10 = r10.f9985L
            r4 = r10[r0]
            e.f.b.j.f$b r6 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            if (r4 == r6) goto L_0x00c9
            r10 = r10[r0]
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r10 = 0
            goto L_0x00e4
        L_0x00c9:
            e.f.b.j.g r10 = r9.f10171a
            int r10 = r10.mo14381l()
            int r10 = r10 + r5
            e.f.b.j.g r4 = r9.f10171a
            e.f.b.j.u.l r4 = r4.f10008e
            e.f.b.j.u.f r4 = r4.f10216i
            r4.mo14523a(r10)
            e.f.b.j.g r4 = r9.f10171a
            e.f.b.j.u.l r4 = r4.f10008e
            e.f.b.j.u.g r4 = r4.f10212e
            int r10 = r10 - r5
            r4.mo14523a(r10)
        L_0x00e3:
            r10 = 1
        L_0x00e4:
            r9.mo14521c()
            java.util.ArrayList<e.f.b.j.u.m> r4 = r9.f10174d
            java.util.Iterator r4 = r4.iterator()
        L_0x00ed:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x010d
            java.lang.Object r5 = r4.next()
            e.f.b.j.u.m r5 = (p096e.p114f.p117b.p118j.p119u.C4010m) r5
            int r6 = r5.f10213f
            if (r6 == r11) goto L_0x00fe
            goto L_0x00ed
        L_0x00fe:
            e.f.b.j.f r6 = r5.f10209b
            e.f.b.j.g r7 = r9.f10171a
            if (r6 != r7) goto L_0x0109
            boolean r6 = r5.f10214g
            if (r6 != 0) goto L_0x0109
            goto L_0x00ed
        L_0x0109:
            r5.mo14509b()
            goto L_0x00ed
        L_0x010d:
            java.util.ArrayList<e.f.b.j.u.m> r4 = r9.f10174d
            java.util.Iterator r4 = r4.iterator()
        L_0x0113:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0146
            java.lang.Object r5 = r4.next()
            e.f.b.j.u.m r5 = (p096e.p114f.p117b.p118j.p119u.C4010m) r5
            int r6 = r5.f10213f
            if (r6 == r11) goto L_0x0124
            goto L_0x0113
        L_0x0124:
            if (r10 != 0) goto L_0x012d
            e.f.b.j.f r6 = r5.f10209b
            e.f.b.j.g r7 = r9.f10171a
            if (r6 != r7) goto L_0x012d
            goto L_0x0113
        L_0x012d:
            e.f.b.j.u.f r6 = r5.f10215h
            boolean r6 = r6.f10186j
            if (r6 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            e.f.b.j.u.f r6 = r5.f10216i
            boolean r6 = r6.f10186j
            if (r6 != 0) goto L_0x013b
            goto L_0x0147
        L_0x013b:
            boolean r6 = r5 instanceof p096e.p114f.p117b.p118j.p119u.C3997c
            if (r6 != 0) goto L_0x0113
            e.f.b.j.u.g r5 = r5.f10212e
            boolean r5 = r5.f10186j
            if (r5 != 0) goto L_0x0113
            goto L_0x0147
        L_0x0146:
            r2 = 1
        L_0x0147:
            e.f.b.j.g r10 = r9.f10171a
            r10.mo14340a(r1)
            e.f.b.j.g r10 = r9.f10171a
            r10.mo14352b(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C3999e.mo14518a(boolean, int):boolean");
    }

    /* renamed from: a */
    private boolean m13730a(C3976g gVar) {
        int i;
        int i2;
        Iterator it = gVar.f10159J0.iterator();
        while (it.hasNext()) {
            C3973f fVar = (C3973f) it.next();
            C3975b[] bVarArr = fVar.f9985L;
            C3975b bVar = bVarArr[0];
            C3975b bVar2 = bVarArr[1];
            if (fVar.mo14315A() == 8) {
                fVar.f10000a = true;
            } else {
                if (fVar.f10030p < 1.0f && bVar == C3975b.MATCH_CONSTRAINT) {
                    fVar.f10020k = 2;
                }
                if (fVar.f10036s < 1.0f && bVar2 == C3975b.MATCH_CONSTRAINT) {
                    fVar.f10022l = 2;
                }
                if (fVar.mo14373h() > 0.0f) {
                    if (bVar == C3975b.MATCH_CONSTRAINT && (bVar2 == C3975b.WRAP_CONTENT || bVar2 == C3975b.FIXED)) {
                        fVar.f10020k = 3;
                    } else if (bVar2 == C3975b.MATCH_CONSTRAINT && (bVar == C3975b.WRAP_CONTENT || bVar == C3975b.FIXED)) {
                        fVar.f10022l = 3;
                    } else {
                        C3975b bVar3 = C3975b.MATCH_CONSTRAINT;
                        if (bVar == bVar3 && bVar2 == bVar3) {
                            if (fVar.f10020k == 0) {
                                fVar.f10020k = 3;
                            }
                            if (fVar.f10022l == 0) {
                                fVar.f10022l = 3;
                            }
                        }
                    }
                }
                if (bVar == C3975b.MATCH_CONSTRAINT && fVar.f10020k == 1 && (fVar.f9968B.f9941d == null || fVar.f9972D.f9941d == null)) {
                    bVar = C3975b.WRAP_CONTENT;
                }
                C3975b bVar4 = bVar;
                if (bVar2 == C3975b.MATCH_CONSTRAINT && fVar.f10022l == 1 && (fVar.f9970C.f9941d == null || fVar.f9974E.f9941d == null)) {
                    bVar2 = C3975b.WRAP_CONTENT;
                }
                C3975b bVar5 = bVar2;
                C4005j jVar = fVar.f10006d;
                jVar.f10211d = bVar4;
                jVar.f10208a = fVar.f10020k;
                C4008l lVar = fVar.f10008e;
                lVar.f10211d = bVar5;
                lVar.f10208a = fVar.f10022l;
                if ((bVar4 == C3975b.MATCH_PARENT || bVar4 == C3975b.FIXED || bVar4 == C3975b.WRAP_CONTENT) && (bVar5 == C3975b.MATCH_PARENT || bVar5 == C3975b.FIXED || bVar5 == C3975b.WRAP_CONTENT)) {
                    int B = fVar.mo14316B();
                    if (bVar4 == C3975b.MATCH_PARENT) {
                        i = (gVar.mo14316B() - fVar.f9968B.f9942e) - fVar.f9972D.f9942e;
                        bVar4 = C3975b.FIXED;
                    } else {
                        i = B;
                    }
                    int l = fVar.mo14381l();
                    if (bVar5 == C3975b.MATCH_PARENT) {
                        i2 = (gVar.mo14381l() - fVar.f9970C.f9942e) - fVar.f9974E.f9942e;
                        bVar5 = C3975b.FIXED;
                    } else {
                        i2 = l;
                    }
                    this.f10175e.mo2381a(fVar, bVar4, i, bVar5, i2);
                    fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                    fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                    fVar.f10000a = true;
                } else {
                    if (bVar4 == C3975b.MATCH_CONSTRAINT && (bVar5 == C3975b.WRAP_CONTENT || bVar5 == C3975b.FIXED)) {
                        int i3 = fVar.f10020k;
                        if (i3 == 3) {
                            C3975b bVar6 = C3975b.WRAP_CONTENT;
                            if (bVar5 == bVar6) {
                                this.f10175e.mo2381a(fVar, bVar6, 0, bVar6, 0);
                            }
                            int l2 = fVar.mo14381l();
                            int i4 = (int) ((((float) l2) * fVar.f9989P) + 0.5f);
                            C3996b bVar7 = this.f10175e;
                            C3975b bVar8 = C3975b.FIXED;
                            bVar7.mo2381a(fVar, bVar8, i4, bVar8, l2);
                            fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                            fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                            fVar.f10000a = true;
                        } else if (i3 == 1) {
                            this.f10175e.mo2381a(fVar, C3975b.WRAP_CONTENT, 0, bVar5, 0);
                            fVar.f10006d.f10212e.f10198m = fVar.mo14316B();
                        } else if (i3 == 2) {
                            C3975b[] bVarArr2 = gVar.f9985L;
                            if (bVarArr2[0] == C3975b.FIXED || bVarArr2[0] == C3975b.MATCH_PARENT) {
                                C3973f fVar2 = fVar;
                                this.f10175e.mo2381a(fVar2, C3975b.FIXED, (int) ((fVar.f10030p * ((float) gVar.mo14316B())) + 0.5f), bVar5, fVar.mo14381l());
                                fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                                fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                                fVar.f10000a = true;
                            }
                        } else {
                            C3968e[] eVarArr = fVar.f9983J;
                            if (eVarArr[0].f9941d == null || eVarArr[1].f9941d == null) {
                                this.f10175e.mo2381a(fVar, C3975b.WRAP_CONTENT, 0, bVar5, 0);
                                fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                                fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                                fVar.f10000a = true;
                            }
                        }
                    }
                    if (bVar5 == C3975b.MATCH_CONSTRAINT && (bVar4 == C3975b.WRAP_CONTENT || bVar4 == C3975b.FIXED)) {
                        int i5 = fVar.f10022l;
                        if (i5 == 3) {
                            C3975b bVar9 = C3975b.WRAP_CONTENT;
                            if (bVar4 == bVar9) {
                                this.f10175e.mo2381a(fVar, bVar9, 0, bVar9, 0);
                            }
                            int B2 = fVar.mo14316B();
                            float f = fVar.f9989P;
                            if (fVar.mo14375i() == -1) {
                                f = 1.0f / f;
                            }
                            int i6 = (int) ((((float) B2) * f) + 0.5f);
                            C3996b bVar10 = this.f10175e;
                            C3975b bVar11 = C3975b.FIXED;
                            bVar10.mo2381a(fVar, bVar11, B2, bVar11, i6);
                            fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                            fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                            fVar.f10000a = true;
                        } else if (i5 == 1) {
                            this.f10175e.mo2381a(fVar, bVar4, 0, C3975b.WRAP_CONTENT, 0);
                            fVar.f10008e.f10212e.f10198m = fVar.mo14381l();
                        } else if (i5 == 2) {
                            C3975b[] bVarArr3 = gVar.f9985L;
                            if (bVarArr3[1] == C3975b.FIXED || bVarArr3[1] == C3975b.MATCH_PARENT) {
                                float f2 = fVar.f10036s;
                                C3973f fVar3 = fVar;
                                this.f10175e.mo2381a(fVar3, bVar4, fVar.mo14316B(), C3975b.FIXED, (int) ((f2 * ((float) gVar.mo14381l())) + 0.5f));
                                fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                                fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                                fVar.f10000a = true;
                            }
                        } else {
                            C3968e[] eVarArr2 = fVar.f9983J;
                            if (eVarArr2[2].f9941d == null || eVarArr2[3].f9941d == null) {
                                this.f10175e.mo2381a(fVar, C3975b.WRAP_CONTENT, 0, bVar5, 0);
                                fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                                fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                                fVar.f10000a = true;
                            }
                        }
                    }
                    C3975b bVar12 = C3975b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar12 && bVar5 == bVar12) {
                        int i7 = fVar.f10020k;
                        if (i7 != 1) {
                            int i8 = fVar.f10022l;
                            if (i8 != 1) {
                                if (i8 == 2 && i7 == 2) {
                                    C3975b[] bVarArr4 = gVar.f9985L;
                                    C3975b bVar13 = bVarArr4[0];
                                    C3975b bVar14 = C3975b.FIXED;
                                    if (bVar13 == bVar14 || bVarArr4[0] == bVar14) {
                                        C3975b[] bVarArr5 = gVar.f9985L;
                                        C3975b bVar15 = bVarArr5[1];
                                        C3975b bVar16 = C3975b.FIXED;
                                        if (bVar15 == bVar16 || bVarArr5[1] == bVar16) {
                                            float f3 = fVar.f10030p;
                                            int B3 = (int) ((f3 * ((float) gVar.mo14316B())) + 0.5f);
                                            int l3 = (int) ((fVar.f10036s * ((float) gVar.mo14381l())) + 0.5f);
                                            C3996b bVar17 = this.f10175e;
                                            C3975b bVar18 = C3975b.FIXED;
                                            bVar17.mo2381a(fVar, bVar18, B3, bVar18, l3);
                                            fVar.f10006d.f10212e.mo14523a(fVar.mo14316B());
                                            fVar.f10008e.f10212e.mo14523a(fVar.mo14381l());
                                            fVar.f10000a = true;
                                        }
                                    }
                                }
                            }
                        }
                        C3996b bVar19 = this.f10175e;
                        C3975b bVar20 = C3975b.WRAP_CONTENT;
                        bVar19.mo2381a(fVar, bVar20, 0, bVar20, 0);
                        fVar.f10006d.f10212e.f10198m = fVar.mo14316B();
                        fVar.f10008e.f10212e.f10198m = fVar.mo14381l();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo14514a() {
        mo14516a(this.f10174d);
        this.f10176f.clear();
        C4007k.f10201d = 0;
        m13729a(this.f10171a.f10006d, 0, this.f10176f);
        m13729a(this.f10171a.f10008e, 1, this.f10176f);
        this.f10172b = false;
    }

    /* renamed from: a */
    public void mo14516a(ArrayList<C4010m> arrayList) {
        arrayList.clear();
        this.f10173c.f10006d.mo14510c();
        this.f10173c.f10008e.mo14510c();
        arrayList.add(this.f10173c.f10006d);
        arrayList.add(this.f10173c.f10008e);
        Iterator it = this.f10173c.f10159J0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3973f fVar = (C3973f) it.next();
            if (fVar instanceof C3980j) {
                arrayList.add(new C4003h(fVar));
            } else {
                if (fVar.mo14323I()) {
                    if (fVar.f10002b == null) {
                        fVar.f10002b = new C3997c(fVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f10002b);
                } else {
                    arrayList.add(fVar.f10006d);
                }
                if (fVar.mo14324J()) {
                    if (fVar.f10004c == null) {
                        fVar.f10004c = new C3997c(fVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f10004c);
                } else {
                    arrayList.add(fVar.f10008e);
                }
                if (fVar instanceof C3983l) {
                    arrayList.add(new C4004i(fVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C4010m) it2.next()).mo14510c();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C4010m mVar = (C4010m) it3.next();
            if (mVar.f10209b != this.f10173c) {
                mVar.mo14507a();
            }
        }
    }

    /* renamed from: a */
    private void m13728a(C4000f fVar, int i, int i2, C4000f fVar2, ArrayList<C4007k> arrayList, C4007k kVar) {
        C4010m mVar = fVar.f10180d;
        if (mVar.f10210c == null) {
            C3976g gVar = this.f10171a;
            if (mVar != gVar.f10006d && mVar != gVar.f10008e) {
                if (kVar == null) {
                    kVar = new C4007k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f10210c = kVar;
                kVar.mo14529a(mVar);
                for (C3998d dVar : mVar.f10215h.f10187k) {
                    if (dVar instanceof C4000f) {
                        m13728a((C4000f) dVar, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (C3998d dVar2 : mVar.f10216i.f10187k) {
                    if (dVar2 instanceof C4000f) {
                        m13728a((C4000f) dVar2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C4008l)) {
                    for (C3998d dVar3 : ((C4008l) mVar).f10205k.f10187k) {
                        if (dVar3 instanceof C4000f) {
                            m13728a((C4000f) dVar3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C4000f fVar3 : mVar.f10215h.f10188l) {
                    if (fVar3 == fVar2) {
                        kVar.f10202a = true;
                    }
                    m13728a(fVar3, i, 0, fVar2, arrayList, kVar);
                }
                for (C4000f fVar4 : mVar.f10216i.f10188l) {
                    if (fVar4 == fVar2) {
                        kVar.f10202a = true;
                    }
                    m13728a(fVar4, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C4008l)) {
                    for (C4000f a : ((C4008l) mVar).f10205k.f10188l) {
                        m13728a(a, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m13729a(C4010m mVar, int i, ArrayList<C4007k> arrayList) {
        for (C3998d dVar : mVar.f10215h.f10187k) {
            if (dVar instanceof C4000f) {
                m13728a((C4000f) dVar, i, 0, mVar.f10216i, arrayList, null);
            } else if (dVar instanceof C4010m) {
                m13728a(((C4010m) dVar).f10215h, i, 0, mVar.f10216i, arrayList, null);
            }
        }
        for (C3998d dVar2 : mVar.f10216i.f10187k) {
            if (dVar2 instanceof C4000f) {
                m13728a((C4000f) dVar2, i, 1, mVar.f10215h, arrayList, null);
            } else if (dVar2 instanceof C4010m) {
                m13728a(((C4010m) dVar2).f10216i, i, 1, mVar.f10215h, arrayList, null);
            }
        }
        if (i == 1) {
            for (C3998d dVar3 : ((C4008l) mVar).f10205k.f10187k) {
                if (dVar3 instanceof C4000f) {
                    m13728a((C4000f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}
