package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9549j0;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.hls.playlist.C9188h;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a;
import com.google.android.exoplayer2.source.p379m0.C9210b;
import com.google.android.exoplayer2.source.p379m0.C9212d;
import com.google.android.exoplayer2.source.p379m0.C9222j;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import com.google.android.exoplayer2.trackselection.C9292c;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.exoplayer2.source.hls.g */
/* compiled from: HlsChunkSource */
class C9156g {

    /* renamed from: a */
    private final HlsExtractorFactory f20565a;

    /* renamed from: b */
    private final DataSource f20566b;

    /* renamed from: c */
    private final DataSource f20567c;

    /* renamed from: d */
    private final C9175p f20568d;

    /* renamed from: e */
    private final Uri[] f20569e;

    /* renamed from: f */
    private final Format[] f20570f;

    /* renamed from: g */
    private final C9188h f20571g;

    /* renamed from: h */
    private final C9199j0 f20572h;

    /* renamed from: i */
    private final List<Format> f20573i;

    /* renamed from: j */
    private final C9158b f20574j = new C9158b();

    /* renamed from: k */
    private boolean f20575k;

    /* renamed from: l */
    private byte[] f20576l;

    /* renamed from: m */
    private IOException f20577m;

    /* renamed from: n */
    private Uri f20578n;

    /* renamed from: o */
    private boolean f20579o;

    /* renamed from: p */
    private C9311j f20580p;

    /* renamed from: q */
    private long f20581q = -9223372036854775807L;

    /* renamed from: r */
    private boolean f20582r;

    /* renamed from: com.google.android.exoplayer2.source.hls.g$a */
    /* compiled from: HlsChunkSource */
    private static final class C9157a extends C9222j {

        /* renamed from: k */
        private byte[] f20583k;

        public C9157a(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo23806a(byte[] bArr, int i) {
            this.f20583k = Arrays.copyOf(bArr, i);
        }

        /* renamed from: g */
        public byte[] mo23807g() {
            return this.f20583k;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.g$b */
    /* compiled from: HlsChunkSource */
    private static final class C9158b extends LinkedHashMap<Uri, byte[]> {
        public C9158b() {
            super(8, 1.0f, false);
        }

        /* renamed from: a */
        public byte[] put(Uri uri, byte[] bArr) {
            C9537e.m29296a(bArr);
            return (byte[]) super.put(uri, bArr);
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Entry<Uri, byte[]> entry) {
            return size() > 4;
        }

        public byte[] get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (byte[]) super.get(obj);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.g$c */
    /* compiled from: HlsChunkSource */
    public static final class C9159c {

        /* renamed from: a */
        public C9212d f20584a;

        /* renamed from: b */
        public boolean f20585b;

        /* renamed from: c */
        public Uri f20586c;

        public C9159c() {
            mo23812a();
        }

        /* renamed from: a */
        public void mo23812a() {
            this.f20584a = null;
            this.f20585b = false;
            this.f20586c = null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.g$d */
    /* compiled from: HlsChunkSource */
    private static final class C9160d extends C9210b {
        public C9160d(HlsMediaPlaylist hlsMediaPlaylist, long j, int i) {
            super((long) i, (long) (hlsMediaPlaylist.f20701o.size() - 1));
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.g$e */
    /* compiled from: HlsChunkSource */
    private static final class C9161e extends C9292c {

        /* renamed from: g */
        private int f20587g;

        public C9161e(C9199j0 j0Var, int[] iArr) {
            super(j0Var, iArr);
            this.f20587g = mo24065a(j0Var.mo23902a(0));
        }

        /* renamed from: a */
        public void mo23813a(long j, long j2, long j3, List<? extends C9224l> list, C9225m[] mVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo24071b(this.f20587g, elapsedRealtime)) {
                for (int i = this.f21203b - 1; i >= 0; i--) {
                    if (!mo24071b(i, elapsedRealtime)) {
                        this.f20587g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: b */
        public int mo23814b() {
            return this.f20587g;
        }

        /* renamed from: g */
        public int mo23815g() {
            return 0;
        }

        /* renamed from: h */
        public Object mo23816h() {
            return null;
        }
    }

    public C9156g(HlsExtractorFactory hlsExtractorFactory, C9188h hVar, Uri[] uriArr, Format[] formatArr, C9162h hVar2, TransferListener transferListener, C9175p pVar, List<Format> list) {
        this.f20565a = hlsExtractorFactory;
        this.f20571g = hVar;
        this.f20569e = uriArr;
        this.f20570f = formatArr;
        this.f20568d = pVar;
        this.f20573i = list;
        this.f20566b = hVar2.createDataSource(1);
        if (transferListener != null) {
            this.f20566b.addTransferListener(transferListener);
        }
        this.f20567c = hVar2.createDataSource(3);
        this.f20572h = new C9199j0(formatArr);
        int[] iArr = new int[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            iArr[i] = i;
        }
        this.f20580p = new C9161e(this.f20572h, iArr);
    }

    /* renamed from: a */
    public C9199j0 mo23795a() {
        return this.f20572h;
    }

    /* renamed from: b */
    public C9311j mo23803b() {
        return this.f20580p;
    }

    /* renamed from: c */
    public void mo23804c() throws IOException {
        IOException iOException = this.f20577m;
        if (iOException == null) {
            Uri uri = this.f20578n;
            if (uri != null && this.f20582r) {
                this.f20571g.mo23880b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: d */
    public void mo23805d() {
        this.f20577m = null;
    }

    /* renamed from: a */
    public void mo23798a(C9311j jVar) {
        this.f20580p = jVar;
    }

    /* renamed from: a */
    public void mo23799a(boolean z) {
        this.f20575k = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23796a(long r29, long r31, java.util.List<com.google.android.exoplayer2.source.hls.C9164j> r33, com.google.android.exoplayer2.source.hls.C9156g.C9159c r34) {
        /*
            r28 = this;
            r8 = r28
            r6 = r31
            r9 = r34
            boolean r0 = r33.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r33
            r4 = 0
            goto L_0x001f
        L_0x0011:
            int r0 = r33.size()
            int r0 = r0 - r11
            r1 = r33
            java.lang.Object r0 = r1.get(r0)
            com.google.android.exoplayer2.source.hls.j r0 = (com.google.android.exoplayer2.source.hls.C9164j) r0
            r4 = r0
        L_0x001f:
            if (r4 != 0) goto L_0x0024
            r0 = -1
            r5 = -1
            goto L_0x002d
        L_0x0024:
            com.google.android.exoplayer2.source.j0 r0 = r8.f20572h
            com.google.android.exoplayer2.Format r2 = r4.f20858c
            int r0 = r0.mo23901a(r2)
            r5 = r0
        L_0x002d:
            long r2 = r6 - r29
            long r12 = r28.m27458a(r29)
            if (r4 == 0) goto L_0x0056
            boolean r0 = r8.f20579o
            if (r0 != 0) goto L_0x0056
            long r14 = r4.mo23935c()
            long r2 = r2 - r14
            r10 = 0
            long r2 = java.lang.Math.max(r10, r2)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            long r12 = r12 - r14
            long r10 = java.lang.Math.max(r10, r12)
            r15 = r2
            r17 = r10
            goto L_0x0059
        L_0x0056:
            r15 = r2
            r17 = r12
        L_0x0059:
            com.google.android.exoplayer2.source.m0.m[] r20 = r8.mo23802a(r4, r6)
            com.google.android.exoplayer2.trackselection.j r12 = r8.f20580p
            r13 = r29
            r19 = r33
            r12.mo23813a(r13, r15, r17, r19, r20)
            com.google.android.exoplayer2.trackselection.j r0 = r8.f20580p
            int r10 = r0.mo24073d()
            r11 = 0
            if (r5 == r10) goto L_0x0071
            r12 = 1
            goto L_0x0072
        L_0x0071:
            r12 = 0
        L_0x0072:
            android.net.Uri[] r0 = r8.f20569e
            r13 = r0[r10]
            com.google.android.exoplayer2.source.hls.playlist.h r0 = r8.f20571g
            boolean r0 = r0.mo23878a(r13)
            if (r0 != 0) goto L_0x008e
            r9.f20586c = r13
            boolean r0 = r8.f20582r
            android.net.Uri r1 = r8.f20578n
            boolean r1 = r13.equals(r1)
            r0 = r0 & r1
            r8.f20582r = r0
            r8.f20578n = r13
            return
        L_0x008e:
            com.google.android.exoplayer2.source.hls.playlist.h r0 = r8.f20571g
            r1 = 1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r14 = r0.mo23872a(r13, r1)
            boolean r0 = r14.f20716c
            r8.f20579o = r0
            r8.m27462a(r14)
            long r0 = r14.f20692f
            com.google.android.exoplayer2.source.hls.playlist.h r2 = r8.f20571g
            long r2 = r2.mo23871a()
            long r15 = r0 - r2
            r0 = r28
            r1 = r4
            r2 = r12
            r3 = r14
            r25 = r4
            r17 = r5
            r4 = r15
            r6 = r31
            long r0 = r0.m27459a(r1, r2, r3, r4, r6)
            long r2 = r14.f20695i
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00df
            if (r25 == 0) goto L_0x00df
            if (r12 == 0) goto L_0x00df
            android.net.Uri[] r0 = r8.f20569e
            r0 = r0[r17]
            com.google.android.exoplayer2.source.hls.playlist.h r1 = r8.f20571g
            r2 = 1
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r1 = r1.mo23872a(r0, r2)
            long r2 = r1.f20692f
            com.google.android.exoplayer2.source.hls.playlist.h r4 = r8.f20571g
            long r4 = r4.mo23871a()
            long r2 = r2 - r4
            long r4 = r25.mo23956f()
            r15 = r2
            r10 = r17
            r3 = r0
            r2 = r1
            r0 = r4
            goto L_0x00e1
        L_0x00df:
            r3 = r13
            r2 = r14
        L_0x00e1:
            long r4 = r2.f20695i
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ef
            com.google.android.exoplayer2.source.p r0 = new com.google.android.exoplayer2.source.p
            r0.<init>()
            r8.f20577m = r0
            return
        L_0x00ef:
            long r0 = r0 - r4
            int r1 = (int) r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a> r0 = r2.f20701o
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0111
            boolean r0 = r2.f20698l
            if (r0 == 0) goto L_0x0101
            r0 = 1
            r9.f20585b = r0
            goto L_0x0110
        L_0x0101:
            r9.f20586c = r3
            boolean r0 = r8.f20582r
            android.net.Uri r1 = r8.f20578n
            boolean r1 = r3.equals(r1)
            r0 = r0 & r1
            r8.f20582r = r0
            r8.f20578n = r3
        L_0x0110:
            return
        L_0x0111:
            r8.f20582r = r11
            r0 = 0
            r8.f20578n = r0
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a> r0 = r2.f20701o
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a r0 = (com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.C9176a) r0
            com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$a r4 = r0.f20703U
            android.net.Uri r4 = m27460a(r2, r4)
            com.google.android.exoplayer2.source.m0.d r5 = r8.m27461a(r4, r10)
            r9.f20584a = r5
            com.google.android.exoplayer2.source.m0.d r5 = r9.f20584a
            if (r5 == 0) goto L_0x012f
            return
        L_0x012f:
            android.net.Uri r0 = m27460a(r2, r0)
            com.google.android.exoplayer2.source.m0.d r5 = r8.m27461a(r0, r10)
            r9.f20584a = r5
            com.google.android.exoplayer2.source.m0.d r5 = r9.f20584a
            if (r5 == 0) goto L_0x013e
            return
        L_0x013e:
            com.google.android.exoplayer2.source.hls.HlsExtractorFactory r12 = r8.f20565a
            com.google.android.exoplayer2.upstream.DataSource r13 = r8.f20566b
            com.google.android.exoplayer2.Format[] r5 = r8.f20570f
            r14 = r5[r10]
            java.util.List<com.google.android.exoplayer2.Format> r5 = r8.f20573i
            com.google.android.exoplayer2.trackselection.j r6 = r8.f20580p
            int r21 = r6.mo23815g()
            com.google.android.exoplayer2.trackselection.j r6 = r8.f20580p
            java.lang.Object r22 = r6.mo23816h()
            boolean r6 = r8.f20575k
            com.google.android.exoplayer2.source.hls.p r7 = r8.f20568d
            com.google.android.exoplayer2.source.hls.g$b r10 = r8.f20574j
            byte[] r26 = r10.get(r0)
            com.google.android.exoplayer2.source.hls.g$b r0 = r8.f20574j
            byte[] r27 = r0.get(r4)
            r17 = r2
            r18 = r1
            r19 = r3
            r20 = r5
            r23 = r6
            r24 = r7
            com.google.android.exoplayer2.source.hls.j r0 = com.google.android.exoplayer2.source.hls.C9164j.m27484a(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.f20584a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C9156g.mo23796a(long, long, java.util.List, com.google.android.exoplayer2.source.hls.g$c):void");
    }

    /* renamed from: a */
    public void mo23797a(C9212d dVar) {
        if (dVar instanceof C9157a) {
            C9157a aVar = (C9157a) dVar;
            this.f20576l = aVar.mo23957f();
            this.f20574j.put(aVar.f20856a.f21938a, aVar.mo23807g());
        }
    }

    /* renamed from: a */
    public boolean mo23801a(C9212d dVar, long j) {
        C9311j jVar = this.f20580p;
        return jVar.mo24069a(jVar.mo24072c(this.f20572h.mo23901a(dVar.f20858c)), j);
    }

    /* renamed from: a */
    public boolean mo23800a(Uri uri, long j) {
        boolean z = false;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f20569e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            } else if (uriArr[i].equals(uri)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return true;
        }
        int c = this.f20580p.mo24072c(i);
        if (c == -1) {
            return true;
        }
        this.f20582r = uri.equals(this.f20578n) | this.f20582r;
        if (j == -9223372036854775807L || this.f20580p.mo24069a(c, j)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public C9225m[] mo23802a(C9164j jVar, long j) {
        C9164j jVar2 = jVar;
        int a = jVar2 == null ? -1 : this.f20572h.mo23901a(jVar2.f20858c);
        C9225m[] mVarArr = new C9225m[this.f20580p.length()];
        for (int i = 0; i < mVarArr.length; i++) {
            int b = this.f20580p.mo24070b(i);
            Uri uri = this.f20569e[b];
            if (!this.f20571g.mo23878a(uri)) {
                mVarArr[i] = C9225m.f20923a;
            } else {
                HlsMediaPlaylist a2 = this.f20571g.mo23872a(uri, false);
                long a3 = a2.f20692f - this.f20571g.mo23871a();
                long j2 = a3;
                long a4 = m27459a(jVar, b != a, a2, a3, j);
                long j3 = a2.f20695i;
                if (a4 < j3) {
                    mVarArr[i] = C9225m.f20923a;
                } else {
                    mVarArr[i] = new C9160d(a2, j2, (int) (a4 - j3));
                }
            }
        }
        return mVarArr;
    }

    /* renamed from: a */
    private long m27459a(C9164j jVar, boolean z, HlsMediaPlaylist hlsMediaPlaylist, long j, long j2) {
        long a;
        long j3;
        if (jVar != null && !z) {
            return jVar.mo23956f();
        }
        long j4 = hlsMediaPlaylist.f20702p + j;
        if (jVar != null && !this.f20579o) {
            j2 = jVar.f20861f;
        }
        if (hlsMediaPlaylist.f20698l || j2 < j4) {
            a = (long) C9554k0.m29384a(hlsMediaPlaylist.f20701o, Long.valueOf(j2 - j), true, !this.f20571g.mo23883c() || jVar == null);
            j3 = hlsMediaPlaylist.f20695i;
        } else {
            a = hlsMediaPlaylist.f20695i;
            j3 = (long) hlsMediaPlaylist.f20701o.size();
        }
        return a + j3;
    }

    /* renamed from: a */
    private long m27458a(long j) {
        if (this.f20581q != -9223372036854775807L) {
            return this.f20581q - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private void m27462a(HlsMediaPlaylist hlsMediaPlaylist) {
        long j;
        if (hlsMediaPlaylist.f20698l) {
            j = -9223372036854775807L;
        } else {
            j = hlsMediaPlaylist.mo23865b() - this.f20571g.mo23871a();
        }
        this.f20581q = j;
    }

    /* renamed from: a */
    private C9212d m27461a(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        if (this.f20574j.containsKey(uri)) {
            C9158b bVar = this.f20574j;
            bVar.put(uri, (byte[]) bVar.remove(uri));
            return null;
        }
        DataSpec dataSpec = new DataSpec(uri, 0, -1, null, 1);
        C9157a aVar = new C9157a(this.f20567c, dataSpec, this.f20570f[i], this.f20580p.mo23815g(), this.f20580p.mo23816h(), this.f20576l);
        return aVar;
    }

    /* renamed from: a */
    private static Uri m27460a(HlsMediaPlaylist hlsMediaPlaylist, C9176a aVar) {
        if (aVar != null) {
            String str = aVar.f20708Z;
            if (str != null) {
                return C9549j0.m29368b(hlsMediaPlaylist.f20714a, str);
            }
        }
        return null;
    }
}
