package p096e.p114f.p117b.p118j.p119u;

import java.util.ArrayList;
import p096e.p114f.p117b.p118j.C3976g;

/* renamed from: e.f.b.j.u.k */
/* compiled from: RunGroup */
class C4007k {

    /* renamed from: d */
    public static int f10201d;

    /* renamed from: a */
    public boolean f10202a;

    /* renamed from: b */
    C4010m f10203b = null;

    /* renamed from: c */
    ArrayList<C4010m> f10204c = new ArrayList<>();

    public C4007k(C4010m mVar, int i) {
        f10201d++;
        this.f10203b = mVar;
    }

    /* renamed from: b */
    private long m13764b(C4000f fVar, long j) {
        C4010m mVar = fVar.f10180d;
        if (mVar instanceof C4004i) {
            return j;
        }
        int size = fVar.f10187k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3998d dVar = (C3998d) fVar.f10187k.get(i);
            if (dVar instanceof C4000f) {
                C4000f fVar2 = (C4000f) dVar;
                if (fVar2.f10180d != mVar) {
                    j2 = Math.max(j2, m13764b(fVar2, ((long) fVar2.f10182f) + j));
                }
            }
        }
        if (fVar == mVar.f10215h) {
            long d = j + mVar.mo14511d();
            j2 = Math.max(Math.max(j2, m13764b(mVar.f10216i, d)), d - ((long) mVar.f10216i.f10182f));
        }
        return j2;
    }

    /* renamed from: a */
    public void mo14529a(C4010m mVar) {
        this.f10204c.add(mVar);
    }

    /* renamed from: a */
    private long m13763a(C4000f fVar, long j) {
        C4010m mVar = fVar.f10180d;
        if (mVar instanceof C4004i) {
            return j;
        }
        int size = fVar.f10187k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3998d dVar = (C3998d) fVar.f10187k.get(i);
            if (dVar instanceof C4000f) {
                C4000f fVar2 = (C4000f) dVar;
                if (fVar2.f10180d != mVar) {
                    j2 = Math.min(j2, m13763a(fVar2, ((long) fVar2.f10182f) + j));
                }
            }
        }
        if (fVar == mVar.f10216i) {
            long d = j - mVar.mo14511d();
            j2 = Math.min(Math.min(j2, m13763a(mVar.f10215h, d)), d - ((long) mVar.f10215h.f10182f));
        }
        return j2;
    }

    /* renamed from: a */
    public long mo14528a(C3976g gVar, int i) {
        long j;
        int i2;
        long j2;
        C4010m mVar = this.f10203b;
        long j3 = 0;
        if (mVar instanceof C3997c) {
            if (((C3997c) mVar).f10213f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(mVar instanceof C4005j)) {
                return 0;
            }
        } else if (!(mVar instanceof C4008l)) {
            return 0;
        }
        C4000f fVar = (i == 0 ? gVar.f10006d : gVar.f10008e).f10215h;
        C4000f fVar2 = (i == 0 ? gVar.f10006d : gVar.f10008e).f10216i;
        boolean contains = this.f10203b.f10215h.f10188l.contains(fVar);
        boolean contains2 = this.f10203b.f10216i.f10188l.contains(fVar2);
        long d = this.f10203b.mo14511d();
        if (!contains || !contains2) {
            if (contains) {
                C4000f fVar3 = this.f10203b.f10215h;
                j = Math.max(m13764b(fVar3, (long) fVar3.f10182f), ((long) this.f10203b.f10215h.f10182f) + d);
            } else if (contains2) {
                C4000f fVar4 = this.f10203b.f10216i;
                j = Math.max(-m13763a(fVar4, (long) fVar4.f10182f), ((long) (-this.f10203b.f10216i.f10182f)) + d);
            } else {
                C4010m mVar2 = this.f10203b;
                j2 = ((long) mVar2.f10215h.f10182f) + mVar2.mo14511d();
                i2 = this.f10203b.f10216i.f10182f;
            }
            return j;
        }
        long b = m13764b(this.f10203b.f10215h, 0);
        long a = m13763a(this.f10203b.f10216i, 0);
        long j4 = b - d;
        int i3 = this.f10203b.f10216i.f10182f;
        if (j4 >= ((long) (-i3))) {
            j4 += (long) i3;
        }
        long j5 = (-a) - d;
        int i4 = this.f10203b.f10215h.f10182f;
        long j6 = j5 - ((long) i4);
        if (j6 >= ((long) i4)) {
            j6 -= (long) i4;
        }
        float b2 = this.f10203b.f10209b.mo14347b(i);
        if (b2 > 0.0f) {
            j3 = (long) ((((float) j6) / b2) + (((float) j4) / (1.0f - b2)));
        }
        float f = (float) j3;
        long j7 = ((long) ((f * b2) + 0.5f)) + d + ((long) ((f * (1.0f - b2)) + 0.5f));
        C4010m mVar3 = this.f10203b;
        j2 = ((long) mVar3.f10215h.f10182f) + j7;
        i2 = mVar3.f10216i.f10182f;
        j = j2 - ((long) i2);
        return j;
    }
}
