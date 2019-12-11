package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.a */
/* compiled from: BinarySearchSeeker */
public abstract class C8899a {

    /* renamed from: a */
    protected final C8900a f19093a;

    /* renamed from: b */
    protected final C8906g f19094b;

    /* renamed from: c */
    protected C8903d f19095c;

    /* renamed from: d */
    private final int f19096d;

    /* renamed from: com.google.android.exoplayer2.s0.a$a */
    /* compiled from: BinarySearchSeeker */
    public static class C8900a implements C8920o {

        /* renamed from: a */
        private final C8904e f19097a;

        /* renamed from: b */
        private final long f19098b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f19099c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f19100d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f19101e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f19102f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f19103g;

        public C8900a(C8904e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f19097a = eVar;
            this.f19098b = j;
            this.f19099c = j2;
            this.f19100d = j3;
            this.f19101e = j4;
            this.f19102f = j5;
            this.f19103g = j6;
        }

        /* renamed from: c */
        public boolean mo23279c() {
            return true;
        }

        /* renamed from: b */
        public C8921a mo23277b(long j) {
            this.f19097a.mo23281a(j);
            return new C8921a(new C8923p(j, C8903d.m26089a(j, this.f19099c, this.f19100d, this.f19101e, this.f19102f, this.f19103g)));
        }

        /* renamed from: c */
        public long mo23278c(long j) {
            this.f19097a.mo23281a(j);
            return j;
        }

        /* renamed from: d */
        public long mo23280d() {
            return this.f19098b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$b */
    /* compiled from: BinarySearchSeeker */
    public static final class C8901b implements C8904e {
        /* renamed from: a */
        public long mo23281a(long j) {
            return j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$c */
    /* compiled from: BinarySearchSeeker */
    public static final class C8902c {
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$d */
    /* compiled from: BinarySearchSeeker */
    protected static class C8903d {

        /* renamed from: a */
        private final long f19104a;

        /* renamed from: b */
        private final long f19105b;

        /* renamed from: c */
        private final long f19106c;

        /* renamed from: d */
        private long f19107d;

        /* renamed from: e */
        private long f19108e;

        /* renamed from: f */
        private long f19109f;

        /* renamed from: g */
        private long f19110g;

        /* renamed from: h */
        private long f19111h;

        protected C8903d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f19104a = j;
            this.f19105b = j2;
            this.f19107d = j3;
            this.f19108e = j4;
            this.f19109f = j5;
            this.f19110g = j6;
            this.f19106c = j7;
            this.f19111h = m26089a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: f */
        private void m26103f() {
            this.f19111h = m26089a(this.f19105b, this.f19107d, this.f19108e, this.f19109f, this.f19110g, this.f19106c);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public long m26097c() {
            return this.f19111h;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public long m26099d() {
            return this.f19104a;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public long m26101e() {
            return this.f19105b;
        }

        /* renamed from: a */
        protected static long m26089a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C9554k0.m29431b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m26093b() {
            return this.f19109f;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m26095b(long j, long j2) {
            this.f19107d = j;
            this.f19109f = j2;
            m26103f();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public long m26088a() {
            return this.f19110g;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m26091a(long j, long j2) {
            this.f19108e = j;
            this.f19110g = j2;
            m26103f();
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$e */
    /* compiled from: BinarySearchSeeker */
    protected interface C8904e {
        /* renamed from: a */
        long mo23281a(long j);
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$f */
    /* compiled from: BinarySearchSeeker */
    public static final class C8905f {

        /* renamed from: d */
        public static final C8905f f19112d;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f19113a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f19114b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f19115c;

        static {
            C8905f fVar = new C8905f(-3, -9223372036854775807L, -1);
            f19112d = fVar;
        }

        private C8905f(int i, long j, long j2) {
            this.f19113a = i;
            this.f19114b = j;
            this.f19115c = j2;
        }

        /* renamed from: a */
        public static C8905f m26107a(long j, long j2) {
            C8905f fVar = new C8905f(-1, j, j2);
            return fVar;
        }

        /* renamed from: b */
        public static C8905f m26109b(long j, long j2) {
            C8905f fVar = new C8905f(-2, j, j2);
            return fVar;
        }

        /* renamed from: a */
        public static C8905f m26106a(long j) {
            C8905f fVar = new C8905f(0, -9223372036854775807L, j);
            return fVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.a$g */
    /* compiled from: BinarySearchSeeker */
    protected interface C8906g {
        /* renamed from: a */
        C8905f mo23282a(C8913h hVar, long j, C8902c cVar) throws IOException, InterruptedException;

        /* renamed from: a */
        void mo23283a();
    }

    protected C8899a(C8904e eVar, C8906g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f19094b = gVar;
        this.f19096d = i;
        C8900a aVar = new C8900a(eVar, j, j2, j3, j4, j5, j6);
        this.f19093a = aVar;
    }

    /* renamed from: a */
    public final C8920o mo23271a() {
        return this.f19093a;
    }

    /* renamed from: b */
    public final void mo23274b(long j) {
        C8903d dVar = this.f19095c;
        if (dVar == null || dVar.m26099d() != j) {
            this.f19095c = mo23270a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo23275b(boolean z, long j) {
    }

    /* renamed from: a */
    public int mo23269a(C8913h hVar, C8919n nVar, C8902c cVar) throws InterruptedException, IOException {
        C8906g gVar = this.f19094b;
        C9537e.m29296a(gVar);
        C8906g gVar2 = gVar;
        while (true) {
            C8903d dVar = this.f19095c;
            C9537e.m29296a(dVar);
            C8903d dVar2 = dVar;
            long b = dVar2.m26093b();
            long c = dVar2.m26088a();
            long d = dVar2.m26097c();
            if (c - b <= ((long) this.f19096d)) {
                mo23272a(false, b);
                return mo23268a(hVar, b, nVar);
            } else if (!mo23273a(hVar, d)) {
                return mo23268a(hVar, d, nVar);
            } else {
                hVar.mo23297c();
                C8905f a = gVar2.mo23282a(hVar, dVar2.m26101e(), cVar);
                int a2 = a.f19113a;
                if (a2 == -3) {
                    mo23272a(false, d);
                    return mo23268a(hVar, d, nVar);
                } else if (a2 == -2) {
                    dVar2.m26095b(a.f19114b, a.f19115c);
                } else if (a2 == -1) {
                    dVar2.m26091a(a.f19114b, a.f19115c);
                } else if (a2 == 0) {
                    mo23272a(true, a.f19115c);
                    mo23273a(hVar, a.f19115c);
                    return mo23268a(hVar, a.f19115c, nVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo23276b() {
        return this.f19095c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8903d mo23270a(long j) {
        long j2 = j;
        this.f19093a.mo23278c(j2);
        C8903d dVar = new C8903d(j, j2, this.f19093a.f19099c, this.f19093a.f19100d, this.f19093a.f19101e, this.f19093a.f19102f, this.f19093a.f19103g);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23272a(boolean z, long j) {
        this.f19095c = null;
        this.f19094b.mo23283a();
        mo23275b(z, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo23273a(C8913h hVar, long j) throws IOException, InterruptedException {
        long position = j - hVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        hVar.mo23298c((int) position);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo23268a(C8913h hVar, long j, C8919n nVar) {
        if (j == hVar.getPosition()) {
            return 0;
        }
        nVar.f19163a = j;
        return 1;
    }
}
