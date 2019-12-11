package p096e.p114f.p117b;

import java.util.Arrays;
import java.util.HashMap;
import p096e.p114f.p117b.C3962i.C3963a;
import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;

/* renamed from: e.f.b.e */
/* compiled from: LinearSystem */
public class C3957e {

    /* renamed from: q */
    private static int f9847q = 1000;

    /* renamed from: r */
    public static C3959f f9848r;

    /* renamed from: a */
    int f9849a = 0;

    /* renamed from: b */
    private HashMap<String, C3962i> f9850b = null;

    /* renamed from: c */
    private C3958a f9851c;

    /* renamed from: d */
    private int f9852d = 32;

    /* renamed from: e */
    private int f9853e;

    /* renamed from: f */
    C3954b[] f9854f;

    /* renamed from: g */
    public boolean f9855g;

    /* renamed from: h */
    public boolean f9856h;

    /* renamed from: i */
    private boolean[] f9857i;

    /* renamed from: j */
    int f9858j;

    /* renamed from: k */
    int f9859k;

    /* renamed from: l */
    private int f9860l;

    /* renamed from: m */
    final C3955c f9861m;

    /* renamed from: n */
    private C3962i[] f9862n;

    /* renamed from: o */
    private int f9863o;

    /* renamed from: p */
    private final C3958a f9864p;

    /* renamed from: e.f.b.e$a */
    /* compiled from: LinearSystem */
    interface C3958a {
        /* renamed from: a */
        C3962i mo14234a(C3957e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo14236a(C3958a aVar);

        /* renamed from: a */
        void mo14237a(C3962i iVar);

        void clear();

        C3962i getKey();
    }

    public C3957e() {
        int i = this.f9852d;
        this.f9853e = i;
        this.f9854f = null;
        this.f9855g = false;
        this.f9856h = false;
        this.f9857i = new boolean[i];
        this.f9858j = 1;
        this.f9859k = 0;
        this.f9860l = i;
        this.f9862n = new C3962i[f9847q];
        this.f9863o = 0;
        C3954b[] bVarArr = new C3954b[i];
        this.f9854f = new C3954b[i];
        m13374j();
        this.f9861m = new C3955c();
        this.f9851c = new C3956d(this.f9861m);
        this.f9864p = new C3954b(this.f9861m);
    }

    /* renamed from: d */
    private final void m13370d(C3954b bVar) {
        if (this.f9859k > 0) {
            bVar.f9842d.mo14218a(bVar, this.f9854f);
            if (bVar.f9842d.f9828a == 0) {
                bVar.f9843e = true;
            }
        }
    }

    /* renamed from: g */
    private void m13371g() {
        for (int i = 0; i < this.f9859k; i++) {
            C3954b bVar = this.f9854f[i];
            bVar.f9839a.f9901e = bVar.f9840b;
        }
    }

    /* renamed from: h */
    public static C3959f m13372h() {
        return f9848r;
    }

    /* renamed from: i */
    private void m13373i() {
        this.f9852d *= 2;
        this.f9854f = (C3954b[]) Arrays.copyOf(this.f9854f, this.f9852d);
        C3955c cVar = this.f9861m;
        cVar.f9846c = (C3962i[]) Arrays.copyOf(cVar.f9846c, this.f9852d);
        int i = this.f9852d;
        this.f9857i = new boolean[i];
        this.f9853e = i;
        this.f9860l = i;
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9870c++;
            fVar.f9881n = Math.max(fVar.f9881n, (long) i);
            C3959f fVar2 = f9848r;
            fVar2.f9866B = fVar2.f9881n;
        }
    }

    /* renamed from: j */
    private void m13374j() {
        int i = 0;
        while (true) {
            C3954b[] bVarArr = this.f9854f;
            if (i < bVarArr.length) {
                C3954b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f9861m.f9844a.mo14276a(bVar);
                }
                this.f9854f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C3962i mo14256a(Object obj) {
        C3962i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f9858j + 1 >= this.f9853e) {
            m13373i();
        }
        if (obj instanceof C3968e) {
            C3968e eVar = (C3968e) obj;
            iVar = eVar.mo14308f();
            if (iVar == null) {
                eVar.mo14298a(this.f9861m);
                iVar = eVar.mo14308f();
            }
            int i = iVar.f9898b;
            if (i == -1 || i > this.f9849a || this.f9861m.f9846c[i] == null) {
                if (iVar.f9898b != -1) {
                    iVar.mo14277a();
                }
                this.f9849a++;
                this.f9858j++;
                int i2 = this.f9849a;
                iVar.f9898b = i2;
                iVar.f9903g = C3963a.UNRESTRICTED;
                this.f9861m.f9846c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public C3954b mo14266b() {
        C3954b bVar = (C3954b) this.f9861m.f9844a.mo14274a();
        if (bVar == null) {
            bVar = new C3954b(this.f9861m);
        } else {
            bVar.mo14248d();
        }
        C3962i.m13405b();
        return bVar;
    }

    /* renamed from: c */
    public C3962i mo14269c() {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9879l++;
        }
        if (this.f9858j + 1 >= this.f9853e) {
            m13373i();
        }
        C3962i a = m13366a(C3963a.SLACK, (String) null);
        this.f9849a++;
        this.f9858j++;
        int i = this.f9849a;
        a.f9898b = i;
        this.f9861m.f9846c[i] = a;
        return a;
    }

    /* renamed from: e */
    public void mo14272e() throws Exception {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9871d++;
        }
        if (this.f9855g || this.f9856h) {
            C3959f fVar2 = f9848r;
            if (fVar2 != null) {
                fVar2.f9883p++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f9859k) {
                    z = true;
                    break;
                } else if (!this.f9854f[i].f9843e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo14259a(this.f9851c);
                return;
            }
            C3959f fVar3 = f9848r;
            if (fVar3 != null) {
                fVar3.f9882o++;
            }
            m13371g();
            return;
        }
        mo14259a(this.f9851c);
    }

    /* renamed from: f */
    public void mo14273f() {
        C3955c cVar;
        int i = 0;
        while (true) {
            cVar = this.f9861m;
            C3962i[] iVarArr = cVar.f9846c;
            if (i >= iVarArr.length) {
                break;
            }
            C3962i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo14277a();
            }
            i++;
        }
        cVar.f9845b.mo14275a(this.f9862n, this.f9863o);
        this.f9863o = 0;
        Arrays.fill(this.f9861m.f9846c, null);
        HashMap<String, C3962i> hashMap = this.f9850b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f9849a = 0;
        this.f9851c.clear();
        this.f9858j = 1;
        for (int i2 = 0; i2 < this.f9859k; i2++) {
            this.f9854f[i2].f9841c = false;
        }
        m13374j();
        this.f9859k = 0;
    }

    /* renamed from: b */
    private void m13368b(C3954b bVar) {
        bVar.mo14227a(this, 0);
    }

    /* renamed from: d */
    public C3955c mo14271d() {
        return this.f9861m;
    }

    /* renamed from: b */
    public int mo14265b(Object obj) {
        C3962i f = ((C3968e) obj).mo14308f();
        if (f != null) {
            return (int) (f.f9901e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private int m13367b(C3958a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f9859k) {
                z = false;
                break;
            }
            C3954b[] bVarArr = this.f9854f;
            if (bVarArr[i].f9839a.f9903g != C3963a.UNRESTRICTED && bVarArr[i].f9840b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3959f fVar = f9848r;
            if (fVar != null) {
                fVar.f9877j++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f9859k) {
                C3954b bVar = this.f9854f[i3];
                if (bVar.f9839a.f9903g != C3963a.UNRESTRICTED && !bVar.f9843e && bVar.f9840b < f) {
                    int i7 = 1;
                    while (i7 < this.f9858j) {
                        C3962i iVar = this.f9861m.f9846c[i7];
                        float b = bVar.f9842d.mo14223b(iVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = iVar.f9902f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C3954b bVar2 = this.f9854f[i4];
                bVar2.f9839a.f9899c = -1;
                C3959f fVar2 = f9848r;
                if (fVar2 != null) {
                    fVar2.f9876i++;
                }
                bVar2.mo14249d(this.f9861m.f9846c[i5]);
                C3962i iVar2 = bVar2.f9839a;
                iVar2.f9899c = i4;
                iVar2.mo14281c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f9858j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: c */
    private final void m13369c(C3954b bVar) {
        C3954b[] bVarArr = this.f9854f;
        int i = this.f9859k;
        if (bVarArr[i] != null) {
            this.f9861m.f9844a.mo14276a(bVarArr[i]);
        }
        C3954b[] bVarArr2 = this.f9854f;
        int i2 = this.f9859k;
        bVarArr2[i2] = bVar;
        C3962i iVar = bVar.f9839a;
        iVar.f9899c = i2;
        this.f9859k = i2 + 1;
        iVar.mo14281c(bVar);
    }

    /* renamed from: a */
    public C3962i mo14254a() {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9880m++;
        }
        if (this.f9858j + 1 >= this.f9853e) {
            m13373i();
        }
        C3962i a = m13366a(C3963a.SLACK, (String) null);
        this.f9849a++;
        this.f9858j++;
        int i = this.f9849a;
        a.f9898b = i;
        this.f9861m.f9846c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo14270c(C3962i iVar, C3962i iVar2, int i, int i2) {
        C3954b b = mo14266b();
        C3962i c = mo14269c();
        c.f9900d = 0;
        b.mo14240b(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo14258a(b, (int) (b.f9842d.mo14223b(c) * -1.0f), i2);
        }
        mo14257a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14258a(C3954b bVar, int i, int i2) {
        bVar.mo14228a(mo14255a(i2, (String) null), i);
    }

    /* renamed from: a */
    public C3962i mo14255a(int i, String str) {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9878k++;
        }
        if (this.f9858j + 1 >= this.f9853e) {
            m13373i();
        }
        C3962i a = m13366a(C3963a.ERROR, str);
        this.f9849a++;
        this.f9858j++;
        int i2 = this.f9849a;
        a.f9898b = i2;
        a.f9900d = i;
        this.f9861m.f9846c[i2] = a;
        this.f9851c.mo14237a(a);
        return a;
    }

    /* renamed from: b */
    public void mo14267b(C3962i iVar, C3962i iVar2, int i, int i2) {
        C3954b b = mo14266b();
        C3962i c = mo14269c();
        c.f9900d = 0;
        b.mo14232a(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo14258a(b, (int) (b.f9842d.mo14223b(c) * -1.0f), i2);
        }
        mo14257a(b);
    }

    /* renamed from: a */
    private C3962i m13366a(C3963a aVar, String str) {
        C3962i iVar = (C3962i) this.f9861m.f9845b.mo14274a();
        if (iVar == null) {
            iVar = new C3962i(aVar, str);
            iVar.mo14279a(aVar, str);
        } else {
            iVar.mo14277a();
            iVar.mo14279a(aVar, str);
        }
        int i = this.f9863o;
        int i2 = f9847q;
        if (i >= i2) {
            f9847q = i2 * 2;
            this.f9862n = (C3962i[]) Arrays.copyOf(this.f9862n, f9847q);
        }
        C3962i[] iVarArr = this.f9862n;
        int i3 = this.f9863o;
        this.f9863o = i3 + 1;
        iVarArr[i3] = iVar;
        return iVar;
    }

    /* renamed from: b */
    public void mo14268b(C3962i iVar, C3962i iVar2, int i, boolean z) {
        C3954b b = mo14266b();
        C3962i c = mo14269c();
        c.f9900d = 0;
        b.mo14240b(iVar, iVar2, c, i);
        if (z) {
            mo14258a(b, (int) (b.f9842d.mo14223b(c) * -1.0f), 1);
        }
        mo14257a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14259a(C3958a aVar) throws Exception {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9887t++;
            fVar.f9888u = Math.max(fVar.f9888u, (long) this.f9858j);
            C3959f fVar2 = f9848r;
            fVar2.f9889v = Math.max(fVar2.f9889v, (long) this.f9859k);
        }
        m13370d((C3954b) aVar);
        m13367b(aVar);
        m13364a(aVar, false);
        m13371g();
    }

    /* renamed from: a */
    public void mo14257a(C3954b bVar) {
        if (bVar != null) {
            C3959f fVar = f9848r;
            if (fVar != null) {
                fVar.f9872e++;
                if (bVar.f9843e) {
                    fVar.f9873f++;
                }
            }
            if (this.f9859k + 1 >= this.f9860l || this.f9858j + 1 >= this.f9853e) {
                m13373i();
            }
            boolean z = false;
            if (!bVar.f9843e) {
                m13370d(bVar);
                if (!bVar.mo14246c()) {
                    bVar.mo14235a();
                    if (bVar.mo14238a(this)) {
                        C3962i a = mo14254a();
                        bVar.f9839a = a;
                        m13369c(bVar);
                        this.f9864p.mo14236a((C3958a) bVar);
                        m13364a(this.f9864p, true);
                        if (a.f9899c == -1) {
                            if (bVar.f9839a == a) {
                                C3962i c = bVar.mo14245c(a);
                                if (c != null) {
                                    C3959f fVar2 = f9848r;
                                    if (fVar2 != null) {
                                        fVar2.f9876i++;
                                    }
                                    bVar.mo14249d(c);
                                }
                            }
                            if (!bVar.f9843e) {
                                bVar.f9839a.mo14281c(bVar);
                            }
                            this.f9859k--;
                        }
                        z = true;
                    }
                    if (!bVar.mo14242b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m13369c(bVar);
            }
        }
    }

    /* renamed from: a */
    private final int m13364a(C3958a aVar, boolean z) {
        C3959f fVar = f9848r;
        if (fVar != null) {
            fVar.f9874g++;
        }
        for (int i = 0; i < this.f9858j; i++) {
            this.f9857i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3959f fVar2 = f9848r;
            if (fVar2 != null) {
                fVar2.f9875h++;
            }
            i2++;
            if (i2 >= this.f9858j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f9857i[aVar.getKey().f9898b] = true;
            }
            C3962i a = aVar.mo14234a(this, this.f9857i);
            if (a != null) {
                boolean[] zArr = this.f9857i;
                int i3 = a.f9898b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f9859k; i5++) {
                    C3954b bVar = this.f9854f[i5];
                    if (bVar.f9839a.f9903g != C3963a.UNRESTRICTED && !bVar.f9843e && bVar.mo14243b(a)) {
                        float b = bVar.f9842d.mo14223b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f9840b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3954b bVar2 = this.f9854f[i4];
                    bVar2.f9839a.f9899c = -1;
                    C3959f fVar3 = f9848r;
                    if (fVar3 != null) {
                        fVar3.f9876i++;
                    }
                    bVar2.mo14249d(a);
                    C3962i iVar = bVar2.f9839a;
                    iVar.f9899c = i4;
                    iVar.mo14281c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo14262a(C3962i iVar, C3962i iVar2, int i, boolean z) {
        C3954b b = mo14266b();
        C3962i c = mo14269c();
        c.f9900d = 0;
        b.mo14232a(iVar, iVar2, c, i);
        if (z) {
            mo14258a(b, (int) (b.f9842d.mo14223b(c) * -1.0f), 1);
        }
        mo14257a(b);
    }

    /* renamed from: a */
    public void mo14261a(C3962i iVar, C3962i iVar2, int i, float f, C3962i iVar3, C3962i iVar4, int i2, int i3) {
        int i4 = i3;
        C3954b b = mo14266b();
        b.mo14230a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 6) {
            b.mo14227a(this, i4);
        }
        mo14257a(b);
    }

    /* renamed from: a */
    public void mo14263a(C3962i iVar, C3962i iVar2, C3962i iVar3, C3962i iVar4, float f, int i) {
        C3954b b = mo14266b();
        b.mo14233a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.mo14227a(this, i);
        }
        mo14257a(b);
    }

    /* renamed from: a */
    public C3954b mo14253a(C3962i iVar, C3962i iVar2, int i, int i2) {
        C3954b b = mo14266b();
        b.mo14229a(iVar, iVar2, i);
        if (i2 != 6) {
            b.mo14227a(this, i2);
        }
        mo14257a(b);
        return b;
    }

    /* renamed from: a */
    public void mo14260a(C3962i iVar, int i) {
        int i2 = iVar.f9899c;
        if (i2 != -1) {
            C3954b bVar = this.f9854f[i2];
            if (bVar.f9843e) {
                bVar.f9840b = (float) i;
            } else if (bVar.f9842d.f9828a == 0) {
                bVar.f9843e = true;
                bVar.f9840b = (float) i;
            } else {
                C3954b b = mo14266b();
                b.mo14244c(iVar, i);
                mo14257a(b);
            }
        } else {
            C3954b b2 = mo14266b();
            b2.mo14239b(iVar, i);
            mo14257a(b2);
        }
    }

    /* renamed from: a */
    public static C3954b m13365a(C3957e eVar, C3962i iVar, C3962i iVar2, C3962i iVar3, float f, boolean z) {
        C3954b b = eVar.mo14266b();
        if (z) {
            eVar.m13368b(b);
        }
        b.mo14231a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    public void mo14264a(C3973f fVar, C3973f fVar2, float f, int i) {
        C3973f fVar3 = fVar;
        C3973f fVar4 = fVar2;
        C3962i a = mo14256a((Object) fVar3.mo14330a(C3972d.LEFT));
        C3962i a2 = mo14256a((Object) fVar3.mo14330a(C3972d.TOP));
        C3962i a3 = mo14256a((Object) fVar3.mo14330a(C3972d.RIGHT));
        C3962i a4 = mo14256a((Object) fVar3.mo14330a(C3972d.BOTTOM));
        C3962i a5 = mo14256a((Object) fVar4.mo14330a(C3972d.LEFT));
        C3962i a6 = mo14256a((Object) fVar4.mo14330a(C3972d.TOP));
        C3962i a7 = mo14256a((Object) fVar4.mo14330a(C3972d.RIGHT));
        C3962i a8 = mo14256a((Object) fVar4.mo14330a(C3972d.BOTTOM));
        C3954b b = mo14266b();
        double d = (double) f;
        C3962i iVar = a3;
        double d2 = (double) i;
        C3962i iVar2 = a7;
        b.mo14241b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo14257a(b);
        C3954b b2 = mo14266b();
        b2.mo14241b(a, iVar, a5, iVar2, (float) (Math.cos(d) * d2));
        mo14257a(b2);
    }
}
