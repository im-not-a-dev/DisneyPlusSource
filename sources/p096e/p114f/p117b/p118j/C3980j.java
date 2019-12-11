package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import java.util.HashMap;
import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.C3962i;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.j */
/* compiled from: Guideline */
public class C3980j extends C3973f {

    /* renamed from: J0 */
    protected float f10117J0 = -1.0f;

    /* renamed from: K0 */
    protected int f10118K0 = -1;

    /* renamed from: L0 */
    protected int f10119L0 = -1;

    /* renamed from: M0 */
    private C3968e f10120M0 = this.f9970C;

    /* renamed from: N0 */
    private int f10121N0;

    /* renamed from: O0 */
    private boolean f10122O0;

    /* renamed from: e.f.b.j.j$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C3981a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10123a = new int[C3972d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                e.f.b.j.e$d[] r0 = p096e.p114f.p117b.p118j.C3968e.C3972d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10123a = r0
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x0040 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x004b }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x0056 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x0062 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f10123a     // Catch:{ NoSuchFieldError -> 0x006e }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3980j.C3981a.<clinit>():void");
        }
    }

    public C3980j() {
        this.f10121N0 = 0;
        this.f10122O0 = false;
        new C3985n();
        this.f9984K.clear();
        this.f9984K.add(this.f10120M0);
        int length = this.f9983J.length;
        for (int i = 0; i < length; i++) {
            this.f9983J[i] = this.f10120M0;
        }
    }

    /* renamed from: A */
    public void mo14458A(int i) {
        if (i > -1) {
            this.f10117J0 = -1.0f;
            this.f10118K0 = -1;
            this.f10119L0 = i;
        }
    }

    /* renamed from: B */
    public void mo14459B(int i) {
        if (this.f10121N0 != i) {
            this.f10121N0 = i;
            this.f9984K.clear();
            if (this.f10121N0 == 1) {
                this.f10120M0 = this.f9968B;
            } else {
                this.f10120M0 = this.f9970C;
            }
            this.f9984K.add(this.f10120M0);
            int length = this.f9983J.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f9983J[i2] = this.f10120M0;
            }
        }
    }

    /* renamed from: R */
    public int mo14286R() {
        return this.f10121N0;
    }

    /* renamed from: S */
    public int mo14460S() {
        return this.f10118K0;
    }

    /* renamed from: T */
    public int mo14461T() {
        return this.f10119L0;
    }

    /* renamed from: U */
    public float mo14462U() {
        return this.f10117J0;
    }

    /* renamed from: a */
    public void mo14291a(C3973f fVar, HashMap<C3973f, C3973f> hashMap) {
        super.mo14291a(fVar, hashMap);
        C3980j jVar = (C3980j) fVar;
        this.f10117J0 = jVar.f10117J0;
        this.f10118K0 = jVar.f10118K0;
        this.f10119L0 = jVar.f10119L0;
        mo14459B(jVar.f10121N0);
    }

    /* renamed from: b */
    public boolean mo14292b() {
        return true;
    }

    /* renamed from: c */
    public ArrayList<C3968e> mo14357c() {
        return this.f9984K;
    }

    /* renamed from: e */
    public void mo14463e(float f) {
        if (f > -1.0f) {
            this.f10117J0 = f;
            this.f10118K0 = -1;
            this.f10119L0 = -1;
        }
    }

    /* renamed from: z */
    public void mo14294z(int i) {
        if (i > -1) {
            this.f10117J0 = -1.0f;
            this.f10118K0 = i;
            this.f10119L0 = -1;
        }
    }

    /* renamed from: c */
    public void mo14360c(C3957e eVar) {
        if (mo14393r() != null) {
            int b = eVar.mo14265b((Object) this.f10120M0);
            if (this.f10121N0 == 1) {
                mo14407x(b);
                mo14409y(0);
                mo14384m(mo14393r().mo14381l());
                mo14401u(0);
            } else {
                mo14407x(0);
                mo14409y(b);
                mo14401u(mo14393r().mo14316B());
                mo14384m(0);
            }
        }
    }

    /* renamed from: a */
    public C3968e mo14330a(C3972d dVar) {
        switch (C3981a.f10123a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f10121N0 == 1) {
                    return this.f10120M0;
                }
                break;
            case 3:
            case 4:
                if (this.f10121N0 == 0) {
                    return this.f10120M0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    /* renamed from: a */
    public void mo14289a(int i) {
        C3973f r = mo14393r();
        if (r != null) {
            if (mo14286R() == 1) {
                this.f9970C.mo14307e().mo14468a(1, r.f9970C.mo14307e(), 0);
                this.f9974E.mo14307e().mo14468a(1, r.f9970C.mo14307e(), 0);
                if (this.f10118K0 != -1) {
                    this.f9968B.mo14307e().mo14468a(1, r.f9968B.mo14307e(), this.f10118K0);
                    this.f9972D.mo14307e().mo14468a(1, r.f9968B.mo14307e(), this.f10118K0);
                } else if (this.f10119L0 != -1) {
                    this.f9968B.mo14307e().mo14468a(1, r.f9972D.mo14307e(), -this.f10119L0);
                    this.f9972D.mo14307e().mo14468a(1, r.f9972D.mo14307e(), -this.f10119L0);
                } else if (this.f10117J0 != -1.0f && r.mo14387o() == C3975b.FIXED) {
                    int i2 = (int) (((float) r.f9987N) * this.f10117J0);
                    this.f9968B.mo14307e().mo14468a(1, r.f9968B.mo14307e(), i2);
                    this.f9972D.mo14307e().mo14468a(1, r.f9968B.mo14307e(), i2);
                }
            } else {
                this.f9968B.mo14307e().mo14468a(1, r.f9968B.mo14307e(), 0);
                this.f9972D.mo14307e().mo14468a(1, r.f9968B.mo14307e(), 0);
                if (this.f10118K0 != -1) {
                    this.f9970C.mo14307e().mo14468a(1, r.f9970C.mo14307e(), this.f10118K0);
                    this.f9974E.mo14307e().mo14468a(1, r.f9970C.mo14307e(), this.f10118K0);
                } else if (this.f10119L0 != -1) {
                    this.f9970C.mo14307e().mo14468a(1, r.f9974E.mo14307e(), -this.f10119L0);
                    this.f9974E.mo14307e().mo14468a(1, r.f9974E.mo14307e(), -this.f10119L0);
                } else if (this.f10117J0 != -1.0f && r.mo14410z() == C3975b.FIXED) {
                    int i3 = (int) (((float) r.f9988O) * this.f10117J0);
                    this.f9970C.mo14307e().mo14468a(1, r.f9970C.mo14307e(), i3);
                    this.f9974E.mo14307e().mo14468a(1, r.f9970C.mo14307e(), i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14290a(C3957e eVar) {
        C3976g gVar = (C3976g) mo14393r();
        if (gVar != null) {
            C3968e a = gVar.mo14330a(C3972d.LEFT);
            C3968e a2 = gVar.mo14330a(C3972d.RIGHT);
            C3973f fVar = this.f9986M;
            boolean z = fVar != null && fVar.f9985L[0] == C3975b.WRAP_CONTENT;
            if (this.f10121N0 == 0) {
                a = gVar.mo14330a(C3972d.TOP);
                a2 = gVar.mo14330a(C3972d.BOTTOM);
                C3973f fVar2 = this.f9986M;
                z = fVar2 != null && fVar2.f9985L[1] == C3975b.WRAP_CONTENT;
            }
            if (this.f10118K0 != -1) {
                C3962i a3 = eVar.mo14256a((Object) this.f10120M0);
                eVar.mo14253a(a3, eVar.mo14256a((Object) a), this.f10118K0, 6);
                if (z) {
                    eVar.mo14267b(eVar.mo14256a((Object) a2), a3, 0, 5);
                }
            } else if (this.f10119L0 != -1) {
                C3962i a4 = eVar.mo14256a((Object) this.f10120M0);
                C3962i a5 = eVar.mo14256a((Object) a2);
                eVar.mo14253a(a4, a5, -this.f10119L0, 6);
                if (z) {
                    eVar.mo14267b(a4, eVar.mo14256a((Object) a), 0, 5);
                    eVar.mo14267b(a5, a4, 0, 5);
                }
            } else if (this.f10117J0 != -1.0f) {
                eVar.mo14257a(C3957e.m13365a(eVar, eVar.mo14256a((Object) this.f10120M0), eVar.mo14256a((Object) a), eVar.mo14256a((Object) a2), this.f10117J0, this.f10122O0));
            }
        }
    }
}
