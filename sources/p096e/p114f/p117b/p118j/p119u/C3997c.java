package p096e.p114f.p117b.p118j.p119u;

import java.util.ArrayList;
import java.util.Iterator;
import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3976g;

/* renamed from: e.f.b.j.u.c */
/* compiled from: ChainRun */
public class C3997c extends C4010m {

    /* renamed from: k */
    ArrayList<C4010m> f10169k = new ArrayList<>();

    /* renamed from: l */
    private int f10170l;

    public C3997c(C3973f fVar, int i) {
        super(fVar);
        this.f10213f = i;
        m13717f();
    }

    /* renamed from: f */
    private void m13717f() {
        C3973f fVar;
        C3973f fVar2 = this.f10209b;
        C3973f f = fVar2.mo14369f(this.f10213f);
        while (true) {
            C3973f fVar3 = f;
            fVar = fVar2;
            fVar2 = fVar3;
            if (fVar2 == null) {
                break;
            }
            f = fVar2.mo14369f(this.f10213f);
        }
        this.f10209b = fVar;
        this.f10169k.add(fVar.mo14371g(this.f10213f));
        C3973f e = fVar.mo14368e(this.f10213f);
        while (e != null) {
            this.f10169k.add(e.mo14371g(this.f10213f));
            e = e.mo14368e(this.f10213f);
        }
        Iterator it = this.f10169k.iterator();
        while (it.hasNext()) {
            C4010m mVar = (C4010m) it.next();
            int i = this.f10213f;
            if (i == 0) {
                mVar.f10209b.f10002b = this;
            } else if (i == 1) {
                mVar.f10209b.f10004c = this;
            }
        }
        if ((this.f10213f == 0 && ((C3976g) this.f10209b.mo14393r()).mo14423a0()) && this.f10169k.size() > 1) {
            ArrayList<C4010m> arrayList = this.f10169k;
            this.f10209b = ((C4010m) arrayList.get(arrayList.size() - 1)).f10209b;
        }
        this.f10170l = this.f10213f == 0 ? this.f10209b.mo14385n() : this.f10209b.mo14408y();
    }

    /* renamed from: g */
    private C3973f m13718g() {
        for (int i = 0; i < this.f10169k.size(); i++) {
            C4010m mVar = (C4010m) this.f10169k.get(i);
            if (mVar.f10209b.mo14315A() != 8) {
                return mVar.f10209b;
            }
        }
        return null;
    }

    /* renamed from: h */
    private C3973f m13719h() {
        for (int size = this.f10169k.size() - 1; size >= 0; size--) {
            C4010m mVar = (C4010m) this.f10169k.get(size);
            if (mVar.f10209b.mo14315A() != 8) {
                return mVar.f10209b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019e, code lost:
        if (r7 != r11) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c6, code lost:
        if (r7 != r11) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f10212e.f10186j != false) goto L_0x00d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14508a(p096e.p114f.p117b.p118j.p119u.C3998d r23) {
        /*
            r22 = this;
            r0 = r22
            e.f.b.j.u.f r1 = r0.f10215h
            boolean r1 = r1.f10186j
            if (r1 == 0) goto L_0x0421
            e.f.b.j.u.f r1 = r0.f10216i
            boolean r1 = r1.f10186j
            if (r1 != 0) goto L_0x0010
            goto L_0x0421
        L_0x0010:
            e.f.b.j.f r1 = r0.f10209b
            e.f.b.j.f r1 = r1.mo14393r()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p096e.p114f.p117b.p118j.C3976g
            if (r3 == 0) goto L_0x0023
            e.f.b.j.g r1 = (p096e.p114f.p117b.p118j.C3976g) r1
            boolean r1 = r1.mo14423a0()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            e.f.b.j.u.f r3 = r0.f10216i
            int r3 = r3.f10183g
            e.f.b.j.u.f r4 = r0.f10215h
            int r4 = r4.f10183g
            int r3 = r3 - r4
            java.util.ArrayList<e.f.b.j.u.m> r4 = r0.f10169k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<e.f.b.j.u.m> r8 = r0.f10169k
            java.lang.Object r8 = r8.get(r5)
            e.f.b.j.u.m r8 = (p096e.p114f.p117b.p118j.p119u.C4010m) r8
            e.f.b.j.f r8 = r8.f10209b
            int r8 = r8.mo14315A()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<e.f.b.j.u.m> r10 = r0.f10169k
            java.lang.Object r10 = r10.get(r9)
            e.f.b.j.u.m r10 = (p096e.p114f.p117b.p118j.p119u.C4010m) r10
            e.f.b.j.f r10 = r10.f10209b
            int r10 = r10.mo14315A()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<e.f.b.j.u.m> r2 = r0.f10169k
            java.lang.Object r2 = r2.get(r13)
            e.f.b.j.u.m r2 = (p096e.p114f.p117b.p118j.p119u.C4010m) r2
            e.f.b.j.f r11 = r2.f10209b
            int r11 = r11.mo14315A()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            e.f.b.j.u.f r11 = r2.f10215h
            int r11 = r11.f10182f
            int r14 = r14 + r11
        L_0x0091:
            e.f.b.j.u.g r11 = r2.f10212e
            int r11 = r11.f10183g
            e.f.b.j.f$b r7 = r2.f10211d
            e.f.b.j.f$b r10 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f10213f
            if (r10 != 0) goto L_0x00af
            e.f.b.j.f r10 = r2.f10209b
            e.f.b.j.u.j r10 = r10.f10006d
            e.f.b.j.u.g r10 = r10.f10212e
            boolean r10 = r10.f10186j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f10213f
            if (r10 != r12) goto L_0x00d2
            e.f.b.j.f r10 = r2.f10209b
            e.f.b.j.u.l r10 = r10.f10008e
            e.f.b.j.u.g r10 = r10.f10212e
            boolean r10 = r10.f10186j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.f10208a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            e.f.b.j.u.g r7 = r2.f10212e
            int r11 = r7.f10198m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            e.f.b.j.u.g r10 = r2.f10212e
            boolean r10 = r10.f10186j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            e.f.b.j.f r7 = r2.f10209b
            float[] r7 = r7.f9973D0
            int r10 = r0.f10213f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            e.f.b.j.u.f r2 = r2.f10216i
            int r2 = r2.f10182f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            e.f.b.j.u.f r7 = r0.f10215h
            int r7 = r7.f10183g
            if (r1 == 0) goto L_0x0115
            e.f.b.j.u.f r7 = r0.f10216i
            int r7 = r7.f10183g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012c
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0125
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012c
        L_0x0125:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012c:
            if (r15 <= 0) goto L_0x0231
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0139:
            if (r13 >= r4) goto L_0x01e6
            java.util.ArrayList<e.f.b.j.u.m> r12 = r0.f10169k
            java.lang.Object r12 = r12.get(r13)
            e.f.b.j.u.m r12 = (p096e.p114f.p117b.p118j.p119u.C4010m) r12
            e.f.b.j.f r9 = r12.f10209b
            int r9 = r9.mo14315A()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x0151
            goto L_0x01d1
        L_0x0151:
            e.f.b.j.f$b r9 = r12.f10211d
            e.f.b.j.f$b r11 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01d1
            e.f.b.j.u.g r9 = r12.f10212e
            boolean r9 = r9.f10186j
            if (r9 != 0) goto L_0x01d1
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0173
            e.f.b.j.f r11 = r12.f10209b
            float[] r11 = r11.f9973D0
            int r9 = r0.f10213f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r11 = (int) r9
            goto L_0x0175
        L_0x0173:
            r11 = r18
        L_0x0175:
            int r9 = r0.f10213f
            if (r9 != 0) goto L_0x01a1
            e.f.b.j.f r9 = r12.f10209b
            r19 = r10
            int r10 = r9.f10028o
            int r9 = r9.f10026n
            r20 = r14
            int r14 = r12.f10208a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x0193
            e.f.b.j.u.g r7 = r12.f10212e
            int r7 = r7.f10198m
            int r7 = java.lang.Math.min(r11, r7)
            goto L_0x0194
        L_0x0193:
            r7 = r11
        L_0x0194:
            int r7 = java.lang.Math.max(r9, r7)
            if (r10 <= 0) goto L_0x019e
            int r7 = java.lang.Math.min(r10, r7)
        L_0x019e:
            if (r7 == r11) goto L_0x01cb
            goto L_0x01c8
        L_0x01a1:
            r21 = r7
            r19 = r10
            r20 = r14
            e.f.b.j.f r7 = r12.f10209b
            int r9 = r7.f10034r
            int r7 = r7.f10032q
            int r10 = r12.f10208a
            r14 = 1
            if (r10 != r14) goto L_0x01bb
            e.f.b.j.u.g r10 = r12.f10212e
            int r10 = r10.f10198m
            int r10 = java.lang.Math.min(r11, r10)
            goto L_0x01bc
        L_0x01bb:
            r10 = r11
        L_0x01bc:
            int r7 = java.lang.Math.max(r7, r10)
            if (r9 <= 0) goto L_0x01c6
            int r7 = java.lang.Math.min(r9, r7)
        L_0x01c6:
            if (r7 == r11) goto L_0x01cb
        L_0x01c8:
            int r16 = r16 + 1
            r11 = r7
        L_0x01cb:
            e.f.b.j.u.g r7 = r12.f10212e
            r7.mo14523a(r11)
            goto L_0x01d7
        L_0x01d1:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d7:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0139
        L_0x01e6:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x0222
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01f0:
            if (r7 >= r4) goto L_0x0220
            java.util.ArrayList<e.f.b.j.u.m> r10 = r0.f10169k
            java.lang.Object r10 = r10.get(r7)
            e.f.b.j.u.m r10 = (p096e.p114f.p117b.p118j.p119u.C4010m) r10
            e.f.b.j.f r11 = r10.f10209b
            int r11 = r11.mo14315A()
            r12 = 8
            if (r11 != r12) goto L_0x0205
            goto L_0x021d
        L_0x0205:
            if (r7 <= 0) goto L_0x020e
            if (r7 < r5) goto L_0x020e
            e.f.b.j.u.f r11 = r10.f10215h
            int r11 = r11.f10182f
            int r9 = r9 + r11
        L_0x020e:
            e.f.b.j.u.g r11 = r10.f10212e
            int r11 = r11.f10183g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x021d
            if (r7 >= r6) goto L_0x021d
            e.f.b.j.u.f r10 = r10.f10216i
            int r10 = r10.f10182f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x021d:
            int r7 = r7 + 1
            goto L_0x01f0
        L_0x0220:
            r14 = r9
            goto L_0x0224
        L_0x0222:
            r14 = r20
        L_0x0224:
            int r7 = r0.f10170l
            r9 = 2
            if (r7 != r9) goto L_0x022f
            if (r16 != 0) goto L_0x022f
            r7 = 0
            r0.f10170l = r7
            goto L_0x0237
        L_0x022f:
            r7 = 0
            goto L_0x0237
        L_0x0231:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0237:
            if (r14 <= r3) goto L_0x023b
            r0.f10170l = r9
        L_0x023b:
            int r9 = r0.f10170l
            r10 = 1
            if (r9 != r10) goto L_0x02dd
            if (r2 <= r10) goto L_0x0247
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r2 = r3 / r2
            goto L_0x024f
        L_0x0247:
            if (r2 != r10) goto L_0x024e
            int r3 = r3 - r14
            r2 = 2
            int r2 = r3 / 2
            goto L_0x024f
        L_0x024e:
            r2 = 0
        L_0x024f:
            if (r15 <= 0) goto L_0x0252
            r2 = 0
        L_0x0252:
            r3 = r21
        L_0x0254:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x025d
            int r9 = r7 + 1
            int r9 = r4 - r9
            goto L_0x025e
        L_0x025d:
            r9 = r7
        L_0x025e:
            java.util.ArrayList<e.f.b.j.u.m> r10 = r0.f10169k
            java.lang.Object r9 = r10.get(r9)
            e.f.b.j.u.m r9 = (p096e.p114f.p117b.p118j.p119u.C4010m) r9
            e.f.b.j.f r10 = r9.f10209b
            int r10 = r10.mo14315A()
            r11 = 8
            if (r10 != r11) goto L_0x027b
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
            e.f.b.j.u.f r9 = r9.f10216i
            r9.mo14523a(r3)
            goto L_0x02d9
        L_0x027b:
            if (r7 <= 0) goto L_0x0282
            if (r1 == 0) goto L_0x0281
            int r3 = r3 - r2
            goto L_0x0282
        L_0x0281:
            int r3 = r3 + r2
        L_0x0282:
            if (r7 <= 0) goto L_0x0293
            if (r7 < r5) goto L_0x0293
            if (r1 == 0) goto L_0x028e
            e.f.b.j.u.f r10 = r9.f10215h
            int r10 = r10.f10182f
            int r3 = r3 - r10
            goto L_0x0293
        L_0x028e:
            e.f.b.j.u.f r10 = r9.f10215h
            int r10 = r10.f10182f
            int r3 = r3 + r10
        L_0x0293:
            if (r1 == 0) goto L_0x029b
            e.f.b.j.u.f r10 = r9.f10216i
            r10.mo14523a(r3)
            goto L_0x02a0
        L_0x029b:
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
        L_0x02a0:
            e.f.b.j.u.g r10 = r9.f10212e
            int r11 = r10.f10183g
            e.f.b.j.f$b r12 = r9.f10211d
            e.f.b.j.f$b r13 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02b1
            int r12 = r9.f10208a
            r13 = 1
            if (r12 != r13) goto L_0x02b1
            int r11 = r10.f10198m
        L_0x02b1:
            if (r1 == 0) goto L_0x02b5
            int r3 = r3 - r11
            goto L_0x02b6
        L_0x02b5:
            int r3 = r3 + r11
        L_0x02b6:
            if (r1 == 0) goto L_0x02be
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
            goto L_0x02c3
        L_0x02be:
            e.f.b.j.u.f r10 = r9.f10216i
            r10.mo14523a(r3)
        L_0x02c3:
            r10 = 1
            r9.f10214g = r10
            if (r7 >= r8) goto L_0x02d9
            if (r7 >= r6) goto L_0x02d9
            if (r1 == 0) goto L_0x02d3
            e.f.b.j.u.f r9 = r9.f10216i
            int r9 = r9.f10182f
            int r9 = -r9
            int r3 = r3 - r9
            goto L_0x02d9
        L_0x02d3:
            e.f.b.j.u.f r9 = r9.f10216i
            int r9 = r9.f10182f
            int r9 = -r9
            int r3 = r3 + r9
        L_0x02d9:
            int r7 = r7 + 1
            goto L_0x0254
        L_0x02dd:
            if (r9 != 0) goto L_0x0371
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r2 = r3 / r2
            if (r15 <= 0) goto L_0x02e7
            r2 = 0
        L_0x02e7:
            r3 = r21
        L_0x02e9:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x02f2
            int r9 = r7 + 1
            int r9 = r4 - r9
            goto L_0x02f3
        L_0x02f2:
            r9 = r7
        L_0x02f3:
            java.util.ArrayList<e.f.b.j.u.m> r10 = r0.f10169k
            java.lang.Object r9 = r10.get(r9)
            e.f.b.j.u.m r9 = (p096e.p114f.p117b.p118j.p119u.C4010m) r9
            e.f.b.j.f r10 = r9.f10209b
            int r10 = r10.mo14315A()
            r11 = 8
            if (r10 != r11) goto L_0x0310
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
            e.f.b.j.u.f r9 = r9.f10216i
            r9.mo14523a(r3)
            goto L_0x036d
        L_0x0310:
            if (r1 == 0) goto L_0x0314
            int r3 = r3 - r2
            goto L_0x0315
        L_0x0314:
            int r3 = r3 + r2
        L_0x0315:
            if (r7 <= 0) goto L_0x0326
            if (r7 < r5) goto L_0x0326
            if (r1 == 0) goto L_0x0321
            e.f.b.j.u.f r10 = r9.f10215h
            int r10 = r10.f10182f
            int r3 = r3 - r10
            goto L_0x0326
        L_0x0321:
            e.f.b.j.u.f r10 = r9.f10215h
            int r10 = r10.f10182f
            int r3 = r3 + r10
        L_0x0326:
            if (r1 == 0) goto L_0x032e
            e.f.b.j.u.f r10 = r9.f10216i
            r10.mo14523a(r3)
            goto L_0x0333
        L_0x032e:
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
        L_0x0333:
            e.f.b.j.u.g r10 = r9.f10212e
            int r11 = r10.f10183g
            e.f.b.j.f$b r12 = r9.f10211d
            e.f.b.j.f$b r13 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0348
            int r12 = r9.f10208a
            r13 = 1
            if (r12 != r13) goto L_0x0348
            int r10 = r10.f10198m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x0348:
            if (r1 == 0) goto L_0x034c
            int r3 = r3 - r11
            goto L_0x034d
        L_0x034c:
            int r3 = r3 + r11
        L_0x034d:
            if (r1 == 0) goto L_0x0355
            e.f.b.j.u.f r10 = r9.f10215h
            r10.mo14523a(r3)
            goto L_0x035a
        L_0x0355:
            e.f.b.j.u.f r10 = r9.f10216i
            r10.mo14523a(r3)
        L_0x035a:
            if (r7 >= r8) goto L_0x036d
            if (r7 >= r6) goto L_0x036d
            if (r1 == 0) goto L_0x0367
            e.f.b.j.u.f r9 = r9.f10216i
            int r9 = r9.f10182f
            int r9 = -r9
            int r3 = r3 - r9
            goto L_0x036d
        L_0x0367:
            e.f.b.j.u.f r9 = r9.f10216i
            int r9 = r9.f10182f
            int r9 = -r9
            int r3 = r3 + r9
        L_0x036d:
            int r7 = r7 + 1
            goto L_0x02e9
        L_0x0371:
            r2 = 2
            if (r9 != r2) goto L_0x0421
            int r2 = r0.f10213f
            if (r2 != 0) goto L_0x037f
            e.f.b.j.f r2 = r0.f10209b
            float r2 = r2.mo14383m()
            goto L_0x0385
        L_0x037f:
            e.f.b.j.f r2 = r0.f10209b
            float r2 = r2.mo14406x()
        L_0x0385:
            if (r1 == 0) goto L_0x038b
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x038b:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0397
            if (r15 <= 0) goto L_0x0398
        L_0x0397:
            r2 = 0
        L_0x0398:
            if (r1 == 0) goto L_0x039d
            int r2 = r21 - r2
            goto L_0x039f
        L_0x039d:
            int r2 = r21 + r2
        L_0x039f:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x03a8
            int r3 = r7 + 1
            int r3 = r4 - r3
            goto L_0x03a9
        L_0x03a8:
            r3 = r7
        L_0x03a9:
            java.util.ArrayList<e.f.b.j.u.m> r9 = r0.f10169k
            java.lang.Object r3 = r9.get(r3)
            e.f.b.j.u.m r3 = (p096e.p114f.p117b.p118j.p119u.C4010m) r3
            e.f.b.j.f r9 = r3.f10209b
            int r9 = r9.mo14315A()
            r10 = 8
            if (r9 != r10) goto L_0x03c7
            e.f.b.j.u.f r9 = r3.f10215h
            r9.mo14523a(r2)
            e.f.b.j.u.f r3 = r3.f10216i
            r3.mo14523a(r2)
            r13 = 1
            goto L_0x041d
        L_0x03c7:
            if (r7 <= 0) goto L_0x03d8
            if (r7 < r5) goto L_0x03d8
            if (r1 == 0) goto L_0x03d3
            e.f.b.j.u.f r9 = r3.f10215h
            int r9 = r9.f10182f
            int r2 = r2 - r9
            goto L_0x03d8
        L_0x03d3:
            e.f.b.j.u.f r9 = r3.f10215h
            int r9 = r9.f10182f
            int r2 = r2 + r9
        L_0x03d8:
            if (r1 == 0) goto L_0x03e0
            e.f.b.j.u.f r9 = r3.f10216i
            r9.mo14523a(r2)
            goto L_0x03e5
        L_0x03e0:
            e.f.b.j.u.f r9 = r3.f10215h
            r9.mo14523a(r2)
        L_0x03e5:
            e.f.b.j.u.g r9 = r3.f10212e
            int r11 = r9.f10183g
            e.f.b.j.f$b r12 = r3.f10211d
            e.f.b.j.f$b r13 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x03f7
            int r12 = r3.f10208a
            r13 = 1
            if (r12 != r13) goto L_0x03f8
            int r11 = r9.f10198m
            goto L_0x03f8
        L_0x03f7:
            r13 = 1
        L_0x03f8:
            if (r1 == 0) goto L_0x03fc
            int r2 = r2 - r11
            goto L_0x03fd
        L_0x03fc:
            int r2 = r2 + r11
        L_0x03fd:
            if (r1 == 0) goto L_0x0405
            e.f.b.j.u.f r9 = r3.f10215h
            r9.mo14523a(r2)
            goto L_0x040a
        L_0x0405:
            e.f.b.j.u.f r9 = r3.f10216i
            r9.mo14523a(r2)
        L_0x040a:
            if (r7 >= r8) goto L_0x041d
            if (r7 >= r6) goto L_0x041d
            if (r1 == 0) goto L_0x0417
            e.f.b.j.u.f r3 = r3.f10216i
            int r3 = r3.f10182f
            int r3 = -r3
            int r2 = r2 - r3
            goto L_0x041d
        L_0x0417:
            e.f.b.j.u.f r3 = r3.f10216i
            int r3 = r3.f10182f
            int r3 = -r3
            int r2 = r2 + r3
        L_0x041d:
            int r7 = r7 + 1
            goto L_0x039f
        L_0x0421:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C3997c.mo14508a(e.f.b.j.u.d):void");
    }

    /* renamed from: b */
    public void mo14509b() {
        for (int i = 0; i < this.f10169k.size(); i++) {
            ((C4010m) this.f10169k.get(i)).mo14509b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo14510c() {
        this.f10210c = null;
        Iterator it = this.f10169k.iterator();
        while (it.hasNext()) {
            ((C4010m) it.next()).mo14510c();
        }
    }

    /* renamed from: d */
    public long mo14511d() {
        long j = 0;
        for (int i = 0; i < this.f10169k.size(); i++) {
            C4010m mVar = (C4010m) this.f10169k.get(i);
            j = j + ((long) mVar.f10215h.f10182f) + mVar.mo14511d() + ((long) mVar.f10216i.f10182f);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo14512e() {
        int size = this.f10169k.size();
        for (int i = 0; i < size; i++) {
            if (!((C4010m) this.f10169k.get(i)).mo14512e()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f10213f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f10169k.iterator();
        while (it.hasNext()) {
            C4010m mVar = (C4010m) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("<");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(mVar);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("> ");
            sb2 = sb7.toString();
        }
        return sb2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14507a() {
        Iterator it = this.f10169k.iterator();
        while (it.hasNext()) {
            ((C4010m) it.next()).mo14507a();
        }
        int size = this.f10169k.size();
        if (size >= 1) {
            C3973f fVar = ((C4010m) this.f10169k.get(0)).f10209b;
            C3973f fVar2 = ((C4010m) this.f10169k.get(size - 1)).f10209b;
            if (this.f10213f == 0) {
                C3968e eVar = fVar.f9968B;
                C3968e eVar2 = fVar2.f9972D;
                C4000f a = mo14534a(eVar, 0);
                int b = eVar.mo14304b();
                C3973f g = m13718g();
                if (g != null) {
                    b = g.f9968B.mo14304b();
                }
                if (a != null) {
                    mo14536a(this.f10215h, a, b);
                }
                C4000f a2 = mo14534a(eVar2, 0);
                int b2 = eVar2.mo14304b();
                C3973f h = m13719h();
                if (h != null) {
                    b2 = h.f9972D.mo14304b();
                }
                if (a2 != null) {
                    mo14536a(this.f10216i, a2, -b2);
                }
            } else {
                C3968e eVar3 = fVar.f9970C;
                C3968e eVar4 = fVar2.f9974E;
                C4000f a3 = mo14534a(eVar3, 1);
                int b3 = eVar3.mo14304b();
                C3973f g2 = m13718g();
                if (g2 != null) {
                    b3 = g2.f9970C.mo14304b();
                }
                if (a3 != null) {
                    mo14536a(this.f10215h, a3, b3);
                }
                C4000f a4 = mo14534a(eVar4, 1);
                int b4 = eVar4.mo14304b();
                C3973f h2 = m13719h();
                if (h2 != null) {
                    b4 = h2.f9974E.mo14304b();
                }
                if (a4 != null) {
                    mo14536a(this.f10216i, a4, -b4);
                }
            }
            this.f10215h.f10177a = this;
            this.f10216i.f10177a = this;
        }
    }
}
