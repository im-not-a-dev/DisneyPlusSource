package com.google.android.exoplayer2.source.dash.p376k;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.k.j */
/* compiled from: SegmentBase */
public abstract class C9127j {

    /* renamed from: a */
    final C9122h f20475a;

    /* renamed from: b */
    final long f20476b;

    /* renamed from: c */
    final long f20477c;

    /* renamed from: com.google.android.exoplayer2.source.dash.k.j$a */
    /* compiled from: SegmentBase */
    public static abstract class C9128a extends C9127j {

        /* renamed from: d */
        final long f20478d;

        /* renamed from: e */
        final long f20479e;

        /* renamed from: f */
        final List<C9131d> f20480f;

        public C9128a(C9122h hVar, long j, long j2, long j3, long j4, List<C9131d> list) {
            super(hVar, j, j2);
            this.f20478d = j3;
            this.f20479e = j4;
            this.f20480f = list;
        }

        /* renamed from: a */
        public abstract int mo23736a(long j);

        /* renamed from: a */
        public final long mo23737a(long j, long j2) {
            List<C9131d> list = this.f20480f;
            if (list != null) {
                return (((C9131d) list.get((int) (j - this.f20478d))).f20486b * 1000000) / this.f20476b;
            }
            int a = mo23736a(j2);
            return (a == -1 || j != (mo23739b() + ((long) a)) - 1) ? (this.f20479e * 1000000) / this.f20476b : j2 - mo23740b(j);
        }

        /* renamed from: a */
        public abstract C9122h mo23738a(C9123i iVar, long j);

        /* renamed from: b */
        public long mo23741b(long j, long j2) {
            long b = mo23739b();
            long a = (long) mo23736a(j2);
            if (a == 0) {
                return b;
            }
            if (this.f20480f == null) {
                long j3 = (j / ((this.f20479e * 1000000) / this.f20476b)) + this.f20478d;
                if (j3 >= b) {
                    if (a == -1) {
                        b = j3;
                    } else {
                        b = Math.min(j3, (b + a) - 1);
                    }
                }
                return b;
            }
            long j4 = (a + b) - 1;
            long j5 = b;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (mo23740b(j6) > j ? 1 : (mo23740b(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            if (j5 != b) {
                j5 = j4;
            }
            return j5;
        }

        /* renamed from: c */
        public boolean mo23742c() {
            return this.f20480f != null;
        }

        /* renamed from: b */
        public final long mo23740b(long j) {
            long j2;
            List<C9131d> list = this.f20480f;
            if (list != null) {
                j2 = ((C9131d) list.get((int) (j - this.f20478d))).f20485a - this.f20477c;
            } else {
                j2 = (j - this.f20478d) * this.f20479e;
            }
            return C9554k0.m29439c(j2, 1000000, this.f20476b);
        }

        /* renamed from: b */
        public long mo23739b() {
            return this.f20478d;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.k.j$b */
    /* compiled from: SegmentBase */
    public static class C9129b extends C9128a {

        /* renamed from: g */
        final List<C9122h> f20481g;

        public C9129b(C9122h hVar, long j, long j2, long j3, long j4, List<C9131d> list, List<C9122h> list2) {
            super(hVar, j, j2, j3, j4, list);
            this.f20481g = list2;
        }

        /* renamed from: a */
        public C9122h mo23738a(C9123i iVar, long j) {
            return (C9122h) this.f20481g.get((int) (j - this.f20478d));
        }

        /* renamed from: c */
        public boolean mo23742c() {
            return true;
        }

        /* renamed from: a */
        public int mo23736a(long j) {
            return this.f20481g.size();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.k.j$c */
    /* compiled from: SegmentBase */
    public static class C9130c extends C9128a {

        /* renamed from: g */
        final C9134l f20482g;

        /* renamed from: h */
        final C9134l f20483h;

        /* renamed from: i */
        final long f20484i;

        public C9130c(C9122h hVar, long j, long j2, long j3, long j4, long j5, List<C9131d> list, C9134l lVar, C9134l lVar2) {
            super(hVar, j, j2, j3, j5, list);
            this.f20482g = lVar;
            this.f20483h = lVar2;
            this.f20484i = j4;
        }

        /* renamed from: a */
        public C9122h mo23735a(C9123i iVar) {
            C9134l lVar = this.f20482g;
            if (lVar == null) {
                return C9127j.super.mo23735a(iVar);
            }
            Format format = iVar.f20466a;
            C9122h hVar = new C9122h(lVar.mo23744a(format.f18350c, 0, format.f18345X, 0), 0, -1);
            return hVar;
        }

        /* renamed from: a */
        public C9122h mo23738a(C9123i iVar, long j) {
            long j2;
            List<C9131d> list = this.f20480f;
            if (list != null) {
                j2 = ((C9131d) list.get((int) (j - this.f20478d))).f20485a;
            } else {
                j2 = (j - this.f20478d) * this.f20479e;
            }
            long j3 = j2;
            C9134l lVar = this.f20483h;
            Format format = iVar.f20466a;
            C9122h hVar = new C9122h(lVar.mo23744a(format.f18350c, j, format.f18345X, j3), 0, -1);
            return hVar;
        }

        /* renamed from: a */
        public int mo23736a(long j) {
            List<C9131d> list = this.f20480f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f20484i;
            if (j2 != -1) {
                return (int) ((j2 - this.f20478d) + 1);
            }
            if (j != -9223372036854775807L) {
                return (int) C9554k0.m29388a(j, (this.f20479e * 1000000) / this.f20476b);
            }
            return -1;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.k.j$d */
    /* compiled from: SegmentBase */
    public static class C9131d {

        /* renamed from: a */
        final long f20485a;

        /* renamed from: b */
        final long f20486b;

        public C9131d(long j, long j2) {
            this.f20485a = j;
            this.f20486b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.k.j$e */
    /* compiled from: SegmentBase */
    public static class C9132e extends C9127j {

        /* renamed from: d */
        final long f20487d;

        /* renamed from: e */
        final long f20488e;

        public C9132e(C9122h hVar, long j, long j2, long j3, long j4) {
            super(hVar, j, j2);
            this.f20487d = j3;
            this.f20488e = j4;
        }

        /* renamed from: b */
        public C9122h mo23743b() {
            long j = this.f20488e;
            if (j <= 0) {
                return null;
            }
            C9122h hVar = new C9122h(null, this.f20487d, j);
            return hVar;
        }

        public C9132e() {
            this(null, 1, 0, 0, 0);
        }
    }

    public C9127j(C9122h hVar, long j, long j2) {
        this.f20475a = hVar;
        this.f20476b = j;
        this.f20477c = j2;
    }

    /* renamed from: a */
    public C9122h mo23735a(C9123i iVar) {
        return this.f20475a;
    }

    /* renamed from: a */
    public long mo23734a() {
        return C9554k0.m29439c(this.f20477c, 1000000, this.f20476b);
    }
}
