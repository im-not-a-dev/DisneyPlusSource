package com.google.android.exoplayer2.p366s0.p370u;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.C8737b;
import com.google.android.exoplayer2.metadata.p359j.C8770h.C8771a;
import com.google.android.exoplayer2.metadata.p359j.C8776k;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8916k;
import com.google.android.exoplayer2.p366s0.C8917l;
import com.google.android.exoplayer2.p366s0.C8918m;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.io.EOFException;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.u.e */
/* compiled from: Mp3Extractor */
public final class C8952e implements C8912g {

    /* renamed from: p */
    private static final C8771a f19359p = C8949b.f19355a;

    /* renamed from: q */
    private static final int f19360q = Util.m29428b("Xing");

    /* renamed from: r */
    private static final int f19361r = Util.m29428b("Info");

    /* renamed from: s */
    private static final int f19362s = Util.m29428b("VBRI");

    /* renamed from: a */
    private final int f19363a;

    /* renamed from: b */
    private final long f19364b;

    /* renamed from: c */
    private final C9572w f19365c;

    /* renamed from: d */
    private final C8918m f19366d;

    /* renamed from: e */
    private final C8916k f19367e;

    /* renamed from: f */
    private final C8917l f19368f;

    /* renamed from: g */
    private C8914i f19369g;

    /* renamed from: h */
    private C8924q f19370h;

    /* renamed from: i */
    private int f19371i;

    /* renamed from: j */
    private Metadata f19372j;

    /* renamed from: k */
    private C8953a f19373k;

    /* renamed from: l */
    private long f19374l;

    /* renamed from: m */
    private long f19375m;

    /* renamed from: n */
    private long f19376n;

    /* renamed from: o */
    private int f19377o;

    /* renamed from: com.google.android.exoplayer2.s0.u.e$a */
    /* compiled from: Mp3Extractor */
    interface C8953a extends C8920o {
        /* renamed from: a */
        long mo23360a(long j);

        /* renamed from: b */
        long mo23361b();
    }

    static {
        C8948a aVar = C8948a.f19354a;
    }

    public C8952e() {
        this(0);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m26325a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: a */
    private static boolean m26326a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26329b() {
        return new C8912g[]{new C8952e()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.exoplayer2.p366s0.p370u.C8952e.C8953a m26330c(com.google.android.exoplayer2.p366s0.C8913h r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            com.google.android.exoplayer2.v0.w r5 = new com.google.android.exoplayer2.v0.w
            com.google.android.exoplayer2.s0.m r0 = r9.f19366d
            int r0 = r0.f19158c
            r5.<init>(r0)
            byte[] r0 = r5.f22333a
            com.google.android.exoplayer2.s0.m r1 = r9.f19366d
            int r1 = r1.f19158c
            r6 = 0
            r10.mo23294b(r0, r6, r1)
            com.google.android.exoplayer2.s0.m r0 = r9.f19366d
            int r1 = r0.f19156a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.f19160e
            if (r1 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0028
            r3 = 36
            r7 = 36
            goto L_0x002f
        L_0x0026:
            if (r0 == r2) goto L_0x002b
        L_0x0028:
            r7 = 21
            goto L_0x002f
        L_0x002b:
            r3 = 13
            r7 = 13
        L_0x002f:
            int r8 = m26323a(r5, r7)
            int r0 = f19360q
            if (r8 == r0) goto L_0x005b
            int r0 = f19361r
            if (r8 != r0) goto L_0x003c
            goto L_0x005b
        L_0x003c:
            int r0 = f19362s
            if (r8 != r0) goto L_0x0056
            long r0 = r10.mo23287a()
            long r2 = r10.getPosition()
            com.google.android.exoplayer2.s0.m r4 = r9.f19366d
            com.google.android.exoplayer2.s0.u.f r0 = com.google.android.exoplayer2.p366s0.p370u.C8954f.m26340a(r0, r2, r4, r5)
            com.google.android.exoplayer2.s0.m r1 = r9.f19366d
            int r1 = r1.f19158c
            r10.mo23298c(r1)
            goto L_0x00ab
        L_0x0056:
            r0 = 0
            r10.mo23297c()
            goto L_0x00ab
        L_0x005b:
            long r0 = r10.mo23287a()
            long r2 = r10.getPosition()
            com.google.android.exoplayer2.s0.m r4 = r9.f19366d
            com.google.android.exoplayer2.s0.u.g r0 = com.google.android.exoplayer2.p366s0.p370u.C8955g.m26347a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x0093
            com.google.android.exoplayer2.s0.k r1 = r9.f19367e
            boolean r1 = r1.mo23314a()
            if (r1 != 0) goto L_0x0093
            r10.mo23297c()
            int r7 = r7 + 141
            r10.mo23288a(r7)
            com.google.android.exoplayer2.v0.w r1 = r9.f19365c
            byte[] r1 = r1.f22333a
            r2 = 3
            r10.mo23294b(r1, r6, r2)
            com.google.android.exoplayer2.v0.w r1 = r9.f19365c
            r1.mo24693e(r6)
            com.google.android.exoplayer2.s0.k r1 = r9.f19367e
            com.google.android.exoplayer2.v0.w r2 = r9.f19365c
            int r2 = r2.mo24714y()
            r1.mo23315a(r2)
        L_0x0093:
            com.google.android.exoplayer2.s0.m r1 = r9.f19366d
            int r1 = r1.f19158c
            r10.mo23298c(r1)
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r0.mo23279c()
            if (r1 != 0) goto L_0x00ab
            int r1 = f19361r
            if (r8 != r1) goto L_0x00ab
            com.google.android.exoplayer2.s0.u.e$a r10 = r9.m26328b(r10)
            return r10
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p366s0.p370u.C8952e.m26330c(com.google.android.exoplayer2.s0.h):com.google.android.exoplayer2.s0.u.e$a");
    }

    /* renamed from: d */
    private boolean m26331d(C8913h hVar) throws IOException, InterruptedException {
        C8953a aVar = this.f19373k;
        if (aVar != null) {
            long b = aVar.mo23361b();
            if (b != -1 && hVar.mo23293b() > b - 4) {
                return true;
            }
        }
        try {
            return !hVar.mo23296b(this.f19365c.f22333a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: e */
    private int m26332e(C8913h hVar) throws IOException, InterruptedException {
        if (this.f19377o == 0) {
            hVar.mo23297c();
            if (m26331d(hVar)) {
                return -1;
            }
            this.f19365c.mo24693e(0);
            int i = this.f19365c.mo24698i();
            if (!m26326a(i, (long) this.f19371i) || C8918m.m26171a(i) == -1) {
                hVar.mo23298c(1);
                this.f19371i = 0;
                return 0;
            }
            C8918m.m26173a(i, this.f19366d);
            if (this.f19374l == -9223372036854775807L) {
                this.f19374l = this.f19373k.mo23360a(hVar.getPosition());
                if (this.f19364b != -9223372036854775807L) {
                    this.f19374l += this.f19364b - this.f19373k.mo23360a(0);
                }
            }
            this.f19377o = this.f19366d.f19158c;
        }
        int a = this.f19370h.mo23302a(hVar, this.f19377o, true);
        if (a == -1) {
            return -1;
        }
        this.f19377o -= a;
        if (this.f19377o > 0) {
            return 0;
        }
        long j = this.f19374l;
        long j2 = this.f19375m * 1000000;
        C8918m mVar = this.f19366d;
        this.f19370h.mo23303a(j + (j2 / ((long) mVar.f19159d)), 1, mVar.f19158c, 0, null);
        this.f19375m += (long) this.f19366d.f19162g;
        this.f19377o = 0;
        return 0;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return m26327a(hVar, true);
    }

    public C8952e(int i) {
        this(i, -9223372036854775807L);
    }

    /* renamed from: b */
    private C8953a m26328b(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23294b(this.f19365c.f22333a, 0, 4);
        this.f19365c.mo24693e(0);
        C8918m.m26173a(this.f19365c.mo24698i(), this.f19366d);
        C8950c cVar = new C8950c(hVar.mo23287a(), hVar.getPosition(), this.f19366d);
        return cVar;
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19369g = iVar;
        this.f19370h = this.f19369g.mo23311a(0, 1);
        this.f19369g.mo23312a();
    }

    public C8952e(int i, long j) {
        this.f19363a = i;
        this.f19364b = j;
        this.f19365c = new C9572w(10);
        this.f19366d = new C8918m();
        this.f19367e = new C8916k();
        this.f19374l = -9223372036854775807L;
        this.f19368f = new C8917l();
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19371i = 0;
        this.f19374l = -9223372036854775807L;
        this.f19375m = 0;
        this.f19377o = 0;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        if (this.f19371i == 0) {
            try {
                m26327a(hVar2, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f19373k == null) {
            C8953a c = m26330c(hVar);
            C8951d a = m26324a(this.f19372j, hVar.getPosition());
            if (a != null) {
                this.f19373k = a;
            } else if (c != null) {
                this.f19373k = c;
            }
            C8953a aVar = this.f19373k;
            if (aVar == null || (!aVar.mo23279c() && (this.f19363a & 1) != 0)) {
                this.f19373k = m26328b(hVar);
            }
            this.f19369g.mo23313a(this.f19373k);
            C8924q qVar = this.f19370h;
            C8918m mVar = this.f19366d;
            String str = mVar.f19157b;
            int i = mVar.f19160e;
            int i2 = mVar.f19159d;
            C8916k kVar = this.f19367e;
            qVar.mo23304a(Format.m24873a((String) null, str, (String) null, -1, 4096, i, i2, -1, kVar.f19146a, kVar.f19147b, null, (DrmInitData) null, 0, (String) null, (this.f19363a & 2) != 0 ? null : this.f19372j));
            this.f19376n = hVar.getPosition();
        } else if (this.f19376n != 0) {
            long position = hVar.getPosition();
            long j = this.f19376n;
            if (position < j) {
                hVar2.mo23298c((int) (j - position));
            }
        }
        return m26332e(hVar);
    }

    /* renamed from: a */
    private boolean m26327a(C8913h hVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C8771a aVar;
        int i6 = z ? DateUtils.FORMAT_ABBREV_TIME : DateUtils.FORMAT_NUMERIC_DATE;
        hVar.mo23297c();
        if (hVar.getPosition() == 0) {
            if ((this.f19363a & 2) == 0) {
                aVar = null;
            } else {
                aVar = f19359p;
            }
            this.f19372j = this.f19368f.mo23317a(hVar, aVar);
            Metadata metadata = this.f19372j;
            if (metadata != null) {
                this.f19367e.mo23316a(metadata);
            }
            int b = (int) hVar.mo23293b();
            if (!z) {
                hVar.mo23298c(b);
            }
            i = b;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        while (true) {
            if (!m26331d(hVar)) {
                this.f19365c.mo24693e(0);
                int i7 = this.f19365c.mo24698i();
                if (i4 == 0 || m26326a(i7, (long) i4)) {
                    int a = C8918m.m26171a(i7);
                    if (a != -1) {
                        i5 = i3 + 1;
                        if (i5 != 1) {
                            if (i5 == 4) {
                                break;
                            }
                        } else {
                            C8918m.m26173a(i7, this.f19366d);
                            i4 = i7;
                        }
                        hVar.mo23288a(a - 4);
                    }
                }
                int i8 = i2 + 1;
                if (i2 != i6) {
                    if (z) {
                        hVar.mo23297c();
                        hVar.mo23288a(i + i8);
                    } else {
                        hVar.mo23298c(1);
                    }
                    i2 = i8;
                    i4 = 0;
                    i5 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new C8723g0("Searched too many bytes.");
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            hVar.mo23298c(i + i2);
        } else {
            hVar.mo23297c();
        }
        this.f19371i = i4;
        return true;
    }

    /* renamed from: a */
    private static int m26323a(C9572w wVar, int i) {
        if (wVar.mo24690d() >= i + 4) {
            wVar.mo24693e(i);
            int i2 = wVar.mo24698i();
            if (i2 == f19360q || i2 == f19361r) {
                return i2;
            }
        }
        if (wVar.mo24690d() >= 40) {
            wVar.mo24693e(36);
            int i3 = wVar.mo24698i();
            int i4 = f19362s;
            if (i3 == i4) {
                return i4;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static C8951d m26324a(Metadata metadata, long j) {
        if (metadata != null) {
            int X = metadata.mo22862X();
            for (int i = 0; i < X; i++) {
                C8737b a = metadata.mo22863a(i);
                if (a instanceof C8776k) {
                    return C8951d.m26317a(j, (C8776k) a);
                }
            }
        }
        return null;
    }
}
