package p096e.p114f.p117b.p118j.p119u;

import p096e.p114f.p117b.p118j.C3968e;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f;
import p096e.p114f.p117b.p118j.C3973f.C3975b;

/* renamed from: e.f.b.j.u.m */
/* compiled from: WidgetRun */
public abstract class C4010m implements C3998d {

    /* renamed from: a */
    public int f10208a;

    /* renamed from: b */
    C3973f f10209b;

    /* renamed from: c */
    C4007k f10210c;

    /* renamed from: d */
    protected C3975b f10211d;

    /* renamed from: e */
    C4002g f10212e = new C4002g(this);

    /* renamed from: f */
    public int f10213f = 0;

    /* renamed from: g */
    boolean f10214g = false;

    /* renamed from: h */
    public C4000f f10215h = new C4000f(this);

    /* renamed from: i */
    public C4000f f10216i = new C4000f(this);

    /* renamed from: j */
    protected C4012b f10217j = C4012b.NONE;

    /* renamed from: e.f.b.j.u.m$a */
    /* compiled from: WidgetRun */
    static /* synthetic */ class C4011a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10218a = new int[C3972d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                e.f.b.j.e$d[] r0 = p096e.p114f.p117b.p118j.C3968e.C3972d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10218a = r0
                int[] r0 = f10218a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10218a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10218a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10218a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10218a     // Catch:{ NoSuchFieldError -> 0x0040 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C4010m.C4011a.<clinit>():void");
        }
    }

    /* renamed from: e.f.b.j.u.m$b */
    /* compiled from: WidgetRun */
    enum C4012b {
        NONE,
        START,
        END,
        CENTER
    }

    public C4010m(C3973f fVar) {
        this.f10209b = fVar;
    }

    /* renamed from: b */
    private void m13773b(int i, int i2) {
        int i3;
        int i4 = this.f10208a;
        if (i4 == 0) {
            this.f10212e.mo14523a(mo14532a(i2, i));
        } else if (i4 == 1) {
            this.f10212e.mo14523a(Math.min(mo14532a(this.f10212e.f10198m, i), i2));
        } else if (i4 == 2) {
            C3973f r = this.f10209b.mo14393r();
            if (r != null) {
                C4010m mVar = i == 0 ? r.f10006d : r.f10008e;
                if (mVar.f10212e.f10186j) {
                    C3973f fVar = this.f10209b;
                    this.f10212e.mo14523a(mo14532a((int) ((((float) mVar.f10212e.f10183g) * (i == 0 ? fVar.f10030p : fVar.f10036s)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C3973f fVar2 = this.f10209b;
            C4005j jVar = fVar2.f10006d;
            C3975b bVar = jVar.f10211d;
            C3975b bVar2 = C3975b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && jVar.f10208a == 3) {
                C4008l lVar = fVar2.f10008e;
                if (lVar.f10211d == bVar2 && lVar.f10208a == 3) {
                    return;
                }
            }
            C3973f fVar3 = this.f10209b;
            C4010m mVar2 = i == 0 ? fVar3.f10008e : fVar3.f10006d;
            if (mVar2.f10212e.f10186j) {
                float h = this.f10209b.mo14373h();
                if (i == 1) {
                    i3 = (int) ((((float) mVar2.f10212e.f10183g) / h) + 0.5f);
                } else {
                    i3 = (int) ((h * ((float) mVar2.f10212e.f10183g)) + 0.5f);
                }
                this.f10212e.mo14523a(i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4000f mo14533a(C3968e eVar) {
        C3968e eVar2 = eVar.f9941d;
        C4000f fVar = null;
        if (eVar2 == null) {
            return null;
        }
        C3973f fVar2 = eVar2.f9939b;
        int i = C4011a.f10218a[eVar2.f9940c.ordinal()];
        if (i == 1) {
            fVar = fVar2.f10006d.f10215h;
        } else if (i == 2) {
            fVar = fVar2.f10006d.f10216i;
        } else if (i == 3) {
            fVar = fVar2.f10008e.f10215h;
        } else if (i == 4) {
            fVar = fVar2.f10008e.f10205k;
        } else if (i == 5) {
            fVar = fVar2.f10008e.f10216i;
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo14507a();

    /* renamed from: a */
    public void mo14508a(C3998d dVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo14509b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14538b(C3998d dVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo14510c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14539c(C3998d dVar) {
    }

    /* renamed from: d */
    public long mo14511d() {
        C4002g gVar = this.f10212e;
        if (gVar.f10186j) {
            return (long) gVar.f10183g;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract boolean mo14512e();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14535a(C3998d dVar, C3968e eVar, C3968e eVar2, int i) {
        float f;
        C4000f a = mo14533a(eVar);
        C4000f a2 = mo14533a(eVar2);
        if (a.f10186j && a2.f10186j) {
            int b = a.f10183g + eVar.mo14304b();
            int b2 = a2.f10183g - eVar2.mo14304b();
            int i2 = b2 - b;
            if (!this.f10212e.f10186j && this.f10211d == C3975b.MATCH_CONSTRAINT) {
                m13773b(i, i2);
            }
            C4002g gVar = this.f10212e;
            if (gVar.f10186j) {
                if (gVar.f10183g == i2) {
                    this.f10215h.mo14523a(b);
                    this.f10216i.mo14523a(b2);
                    return;
                }
                C3973f fVar = this.f10209b;
                if (i == 0) {
                    f = fVar.mo14383m();
                } else {
                    f = fVar.mo14406x();
                }
                if (a == a2) {
                    b = a.f10183g;
                    b2 = a2.f10183g;
                    f = 0.5f;
                }
                this.f10215h.mo14523a((int) (((float) b) + 0.5f + (((float) ((b2 - b) - this.f10212e.f10183g)) * f)));
                this.f10216i.mo14523a(this.f10215h.f10183g + this.f10212e.f10183g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo14532a(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C3973f fVar = this.f10209b;
            int i4 = fVar.f10028o;
            i3 = Math.max(fVar.f10026n, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C3973f fVar2 = this.f10209b;
            int i5 = fVar2.f10034r;
            int max = Math.max(fVar2.f10032q, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r3 != 5) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p096e.p114f.p117b.p118j.p119u.C4000f mo14534a(p096e.p114f.p117b.p118j.C3968e r3, int r4) {
        /*
            r2 = this;
            e.f.b.j.e r0 = r3.f9941d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            e.f.b.j.f r0 = r0.f9939b
            if (r4 != 0) goto L_0x000d
            e.f.b.j.u.j r4 = r0.f10006d
            goto L_0x000f
        L_0x000d:
            e.f.b.j.u.l r4 = r0.f10008e
        L_0x000f:
            e.f.b.j.e r3 = r3.f9941d
            e.f.b.j.e$d r3 = r3.f9940c
            int[] r0 = p096e.p114f.p117b.p118j.p119u.C4010m.C4011a.f10218a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L_0x002b
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x002b
            r0 = 5
            if (r3 == r0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            e.f.b.j.u.f r1 = r4.f10216i
            goto L_0x002d
        L_0x002b:
            e.f.b.j.u.f r1 = r4.f10215h
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.p119u.C4010m.mo14534a(e.f.b.j.e, int):e.f.b.j.u.f");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14536a(C4000f fVar, C4000f fVar2, int i) {
        fVar.f10188l.add(fVar2);
        fVar.f10182f = i;
        fVar2.f10187k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14537a(C4000f fVar, C4000f fVar2, int i, C4002g gVar) {
        fVar.f10188l.add(fVar2);
        fVar.f10188l.add(this.f10212e);
        fVar.f10184h = i;
        fVar.f10185i = gVar;
        fVar2.f10187k.add(fVar);
        gVar.f10187k.add(fVar);
    }
}
