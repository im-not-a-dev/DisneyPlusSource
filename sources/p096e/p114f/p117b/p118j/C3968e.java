package p096e.p114f.p117b.p118j;

import p096e.p114f.p117b.C3955c;
import p096e.p114f.p117b.C3962i;
import p096e.p114f.p117b.C3962i.C3963a;

/* renamed from: e.f.b.j.e */
/* compiled from: ConstraintAnchor */
public class C3968e {

    /* renamed from: a */
    private C3986o f9938a = new C3986o(this);

    /* renamed from: b */
    public final C3973f f9939b;

    /* renamed from: c */
    public final C3972d f9940c;

    /* renamed from: d */
    public C3968e f9941d;

    /* renamed from: e */
    public int f9942e = 0;

    /* renamed from: f */
    int f9943f = -1;

    /* renamed from: g */
    private C3971c f9944g = C3971c.NONE;

    /* renamed from: h */
    private int f9945h;

    /* renamed from: i */
    C3962i f9946i;

    /* renamed from: e.f.b.j.e$a */
    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class C3969a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9947a = new int[C3972d.values().length];

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
                f9947a = r0
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x0040 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x004b }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.BASELINE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x0056 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x0062 }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f9947a     // Catch:{ NoSuchFieldError -> 0x006e }
                e.f.b.j.e$d r1 = p096e.p114f.p117b.p118j.C3968e.C3972d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3968e.C3969a.<clinit>():void");
        }
    }

    /* renamed from: e.f.b.j.e$b */
    /* compiled from: ConstraintAnchor */
    public enum C3970b {
        RELAXED,
        STRICT
    }

    /* renamed from: e.f.b.j.e$c */
    /* compiled from: ConstraintAnchor */
    public enum C3971c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: e.f.b.j.e$d */
    /* compiled from: ConstraintAnchor */
    public enum C3972d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3968e(C3973f fVar, C3972d dVar) {
        C3970b bVar = C3970b.RELAXED;
        this.f9945h = 0;
        this.f9939b = fVar;
        this.f9940c = dVar;
    }

    /* renamed from: a */
    public void mo14298a(C3955c cVar) {
        C3962i iVar = this.f9946i;
        if (iVar == null) {
            this.f9946i = new C3962i(C3963a.UNRESTRICTED, null);
        } else {
            iVar.mo14277a();
        }
    }

    /* renamed from: b */
    public int mo14304b() {
        if (this.f9939b.mo14315A() == 8) {
            return 0;
        }
        if (this.f9943f > -1) {
            C3968e eVar = this.f9941d;
            if (eVar != null && eVar.f9939b.mo14315A() == 8) {
                return this.f9943f;
            }
        }
        return this.f9942e;
    }

    /* renamed from: c */
    public final C3968e mo14305c() {
        switch (C3969a.f9947a[this.f9940c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f9939b.f9972D;
            case 3:
                return this.f9939b.f9968B;
            case 4:
                return this.f9939b.f9974E;
            case 5:
                return this.f9939b.f9970C;
            default:
                throw new AssertionError(this.f9940c.name());
        }
    }

    /* renamed from: d */
    public C3973f mo14306d() {
        return this.f9939b;
    }

    /* renamed from: e */
    public C3986o mo14307e() {
        return this.f9938a;
    }

    /* renamed from: f */
    public C3962i mo14308f() {
        return this.f9946i;
    }

    /* renamed from: g */
    public C3971c mo14309g() {
        return this.f9944g;
    }

    /* renamed from: h */
    public C3968e mo14310h() {
        return this.f9941d;
    }

    /* renamed from: i */
    public C3972d mo14311i() {
        return this.f9940c;
    }

    /* renamed from: j */
    public boolean mo14312j() {
        return this.f9941d != null;
    }

    /* renamed from: k */
    public void mo14313k() {
        this.f9941d = null;
        this.f9942e = 0;
        this.f9943f = -1;
        this.f9944g = C3971c.STRONG;
        this.f9945h = 0;
        C3970b bVar = C3970b.RELAXED;
        this.f9938a.mo14476c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9939b.mo14372g());
        sb.append(":");
        sb.append(this.f9940c.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public int mo14296a() {
        return this.f9945h;
    }

    /* renamed from: a */
    public boolean mo14303a(C3968e eVar, int i, C3971c cVar, int i2) {
        return mo14302a(eVar, i, -1, cVar, i2, false);
    }

    /* renamed from: a */
    public boolean mo14302a(C3968e eVar, int i, int i2, C3971c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f9941d = null;
            this.f9942e = 0;
            this.f9943f = -1;
            this.f9944g = C3971c.NONE;
            this.f9945h = 2;
            return true;
        } else if (!z && !mo14299a(eVar)) {
            return false;
        } else {
            this.f9941d = eVar;
            if (i > 0) {
                this.f9942e = i;
            } else {
                this.f9942e = 0;
            }
            this.f9943f = i2;
            this.f9944g = cVar;
            this.f9945h = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo14301a(C3968e eVar, int i, int i2) {
        return mo14302a(eVar, i, -1, C3971c.STRONG, i2, false);
    }

    /* renamed from: a */
    public boolean mo14300a(C3968e eVar, int i) {
        return mo14302a(eVar, i, -1, C3971c.STRONG, 0, false);
    }

    /* renamed from: a */
    public boolean mo14299a(C3968e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        C3972d i = eVar.mo14311i();
        C3972d dVar = this.f9940c;
        if (i != dVar) {
            switch (C3969a.f9947a[dVar.ordinal()]) {
                case 1:
                    if (!(i == C3972d.BASELINE || i == C3972d.CENTER_X || i == C3972d.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = i == C3972d.LEFT || i == C3972d.RIGHT;
                    if (eVar.mo14306d() instanceof C3980j) {
                        z2 = z2 || i == C3972d.CENTER_X;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = i == C3972d.TOP || i == C3972d.BOTTOM;
                    if (eVar.mo14306d() instanceof C3980j) {
                        z3 = z3 || i == C3972d.CENTER_Y;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f9940c.name());
            }
        } else if (dVar != C3972d.BASELINE || (eVar.mo14306d().mo14321G() && mo14306d().mo14321G())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo14297a(int i) {
        if (mo14312j()) {
            this.f9943f = i;
        }
    }
}
