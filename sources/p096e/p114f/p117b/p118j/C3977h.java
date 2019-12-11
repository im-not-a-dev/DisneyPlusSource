package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: e.f.b.j.h */
/* compiled from: ConstraintWidgetGroup */
public class C3977h {

    /* renamed from: a */
    public List<C3973f> f10078a;

    /* renamed from: b */
    public boolean f10079b = false;

    /* renamed from: c */
    List<C3973f> f10080c;

    /* renamed from: d */
    List<C3973f> f10081d;

    C3977h(List<C3973f> list) {
        new ArrayList();
        new ArrayList();
        new HashSet();
        new HashSet();
        this.f10080c = new ArrayList();
        this.f10081d = new ArrayList();
        this.f10078a = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C3973f> mo14433a() {
        if (!this.f10080c.isEmpty()) {
            return this.f10080c;
        }
        int size = this.f10078a.size();
        for (int i = 0; i < size; i++) {
            C3973f fVar = (C3973f) this.f10078a.get(i);
            if (!fVar.f10047x0) {
                m13581a((ArrayList) this.f10080c, fVar);
            }
        }
        this.f10081d.clear();
        this.f10081d.addAll(this.f10078a);
        this.f10081d.removeAll(this.f10080c);
        return this.f10080c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo14434b() {
        int size = this.f10081d.size();
        for (int i = 0; i < size; i++) {
            m13580a((C3973f) this.f10081d.get(i));
        }
    }

    /* renamed from: a */
    private void m13581a(ArrayList<C3973f> arrayList, C3973f fVar) {
        if (!fVar.f10049y0) {
            arrayList.add(fVar);
            fVar.f10049y0 = true;
            if (!fVar.mo14322H()) {
                if (fVar instanceof C3983l) {
                    C3983l lVar = (C3983l) fVar;
                    int i = lVar.f10125K0;
                    for (int i2 = 0; i2 < i; i2++) {
                        m13581a(arrayList, lVar.f10124J0[i2]);
                    }
                }
                for (C3968e eVar : fVar.f9983J) {
                    C3968e eVar2 = eVar.f9941d;
                    if (eVar2 != null) {
                        C3973f fVar2 = eVar2.f9939b;
                        if (!(eVar2 == null || fVar2 == fVar.mo14393r())) {
                            m13581a(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13580a(p096e.p114f.p117b.p118j.C3973f r7) {
        /*
            r6 = this;
            boolean r0 = r7.f10047x0
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r7.mo14322H()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            e.f.b.j.e r0 = r7.f9972D
            e.f.b.j.e r0 = r0.f9941d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            e.f.b.j.e r3 = r7.f9972D
            e.f.b.j.e r3 = r3.f9941d
            goto L_0x0021
        L_0x001d:
            e.f.b.j.e r3 = r7.f9968B
            e.f.b.j.e r3 = r3.f9941d
        L_0x0021:
            if (r3 == 0) goto L_0x0049
            e.f.b.j.f r4 = r3.f9939b
            boolean r4 = r4.mo14374h(r1)
            if (r4 != 0) goto L_0x0030
            e.f.b.j.f r4 = r3.f9939b
            r6.m13580a(r4)
        L_0x0030:
            e.f.b.j.e$d r4 = r3.f9940c
            e.f.b.j.e$d r5 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT
            if (r4 != r5) goto L_0x0040
            e.f.b.j.f r3 = r3.f9939b
            int r4 = r3.f9991R
            int r3 = r3.mo14316B()
            int r3 = r3 + r4
            goto L_0x004a
        L_0x0040:
            e.f.b.j.e$d r5 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT
            if (r4 != r5) goto L_0x0049
            e.f.b.j.f r3 = r3.f9939b
            int r3 = r3.f9991R
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0054
            e.f.b.j.e r0 = r7.f9972D
            int r0 = r0.mo14304b()
            int r3 = r3 - r0
            goto L_0x0060
        L_0x0054:
            e.f.b.j.e r0 = r7.f9968B
            int r0 = r0.mo14304b()
            int r4 = r7.mo14316B()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x0060:
            int r0 = r7.mo14316B()
            int r0 = r3 - r0
            r7.mo14332a(r0, r3)
            p096e.p114f.p117b.p118j.C3984m.m13658b(r7, r1, r0)
            e.f.b.j.e r0 = r7.f9976F
            e.f.b.j.e r0 = r0.f9941d
            if (r0 == 0) goto L_0x0093
            e.f.b.j.f r1 = r0.f9939b
            boolean r1 = r1.mo14374h(r2)
            if (r1 != 0) goto L_0x007f
            e.f.b.j.f r1 = r0.f9939b
            r6.m13580a(r1)
        L_0x007f:
            e.f.b.j.f r0 = r0.f9939b
            int r1 = r0.f9992S
            int r0 = r0.f10003b0
            int r1 = r1 + r0
            int r0 = r7.f10003b0
            int r1 = r1 - r0
            int r0 = r7.f9988O
            int r0 = r0 + r1
            r7.mo14366d(r1, r0)
            p096e.p114f.p117b.p118j.C3984m.m13658b(r7, r2, r1)
            return
        L_0x0093:
            e.f.b.j.e r0 = r7.f9974E
            e.f.b.j.e r0 = r0.f9941d
            if (r0 == 0) goto L_0x009a
            r1 = 1
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            e.f.b.j.e r0 = r7.f9974E
            e.f.b.j.e r0 = r0.f9941d
            goto L_0x00a5
        L_0x00a1:
            e.f.b.j.e r0 = r7.f9970C
            e.f.b.j.e r0 = r0.f9941d
        L_0x00a5:
            if (r0 == 0) goto L_0x00cc
            e.f.b.j.f r4 = r0.f9939b
            boolean r4 = r4.mo14374h(r2)
            if (r4 != 0) goto L_0x00b4
            e.f.b.j.f r4 = r0.f9939b
            r6.m13580a(r4)
        L_0x00b4:
            e.f.b.j.e$d r4 = r0.f9940c
            e.f.b.j.e$d r5 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM
            if (r4 != r5) goto L_0x00c4
            e.f.b.j.f r0 = r0.f9939b
            int r3 = r0.f9992S
            int r0 = r0.mo14381l()
            int r3 = r3 + r0
            goto L_0x00cc
        L_0x00c4:
            e.f.b.j.e$d r5 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP
            if (r4 != r5) goto L_0x00cc
            e.f.b.j.f r0 = r0.f9939b
            int r3 = r0.f9992S
        L_0x00cc:
            if (r1 == 0) goto L_0x00d6
            e.f.b.j.e r0 = r7.f9974E
            int r0 = r0.mo14304b()
            int r3 = r3 - r0
            goto L_0x00e2
        L_0x00d6:
            e.f.b.j.e r0 = r7.f9970C
            int r0 = r0.mo14304b()
            int r1 = r7.mo14381l()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00e2:
            int r0 = r7.mo14381l()
            int r0 = r3 - r0
            r7.mo14366d(r0, r3)
            p096e.p114f.p117b.p118j.C3984m.m13658b(r7, r2, r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3977h.m13580a(e.f.b.j.f):void");
    }
}
