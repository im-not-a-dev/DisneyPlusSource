package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9566t;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9143g0;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C9167m.C9168a;
import com.google.android.exoplayer2.source.hls.playlist.C9182e;
import com.google.android.exoplayer2.source.hls.playlist.C9182e.C9183a;
import com.google.android.exoplayer2.source.hls.playlist.C9188h;
import com.google.android.exoplayer2.source.hls.playlist.C9188h.C9190b;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.C9524z;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.hls.k */
/* compiled from: HlsMediaPeriod */
public final class C9165k implements C9072a0, C9168a, C9190b {

    /* renamed from: U */
    private final C9188h f20614U;

    /* renamed from: V */
    private final C9162h f20615V;

    /* renamed from: W */
    private final TransferListener f20616W;

    /* renamed from: X */
    private final C9524z f20617X;

    /* renamed from: Y */
    private final C9068a f20618Y;

    /* renamed from: Z */
    private final C9491f f20619Z;

    /* renamed from: a0 */
    private final IdentityHashMap<C9141f0, Integer> f20620a0 = new IdentityHashMap<>();

    /* renamed from: b0 */
    private final C9175p f20621b0 = new C9175p();

    /* renamed from: c */
    private final HlsExtractorFactory f20622c;

    /* renamed from: c0 */
    private final C9256t f20623c0;

    /* renamed from: d0 */
    private final boolean f20624d0;

    /* renamed from: e0 */
    private final boolean f20625e0;

    /* renamed from: f0 */
    private C9073a f20626f0;

    /* renamed from: g0 */
    private int f20627g0;

    /* renamed from: h0 */
    private TrackGroupArray f20628h0;

    /* renamed from: i0 */
    private C9167m[] f20629i0 = new C9167m[0];

    /* renamed from: j0 */
    private C9167m[] f20630j0 = new C9167m[0];

    /* renamed from: k0 */
    private C9143g0 f20631k0;

    /* renamed from: l0 */
    private boolean f20632l0;

    public C9165k(HlsExtractorFactory hlsExtractorFactory, C9188h hVar, C9162h hVar2, TransferListener transferListener, C9524z zVar, C9068a aVar, C9491f fVar, C9256t tVar, boolean z, boolean z2) {
        this.f20622c = hlsExtractorFactory;
        this.f20614U = hVar;
        this.f20615V = hVar2;
        this.f20616W = transferListener;
        this.f20617X = zVar;
        this.f20618Y = aVar;
        this.f20619Z = fVar;
        this.f20623c0 = tVar;
        this.f20624d0 = z;
        this.f20625e0 = z2;
        this.f20631k0 = tVar.mo24003a(new C9143g0[0]);
        aVar.mo23499a();
    }

    /* renamed from: a */
    public long mo23539a(long j, SeekParameters seekParameters) {
        return j;
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        if (this.f20628h0 != null) {
            return this.f20631k0.mo23543b(j);
        }
        for (C9167m b : this.f20629i0) {
            b.mo23839b();
        }
        return false;
    }

    /* renamed from: c */
    public void mo23545c(long j) {
        this.f20631k0.mo23545c(j);
    }

    /* renamed from: d */
    public void mo23546d() throws IOException {
        for (C9167m d : this.f20629i0) {
            d.mo23843d();
        }
    }

    /* renamed from: e */
    public long mo23547e() {
        if (!this.f20632l0) {
            this.f20618Y.mo23525c();
            this.f20632l0 = true;
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public TrackGroupArray mo23548f() {
        return this.f20628h0;
    }

    /* renamed from: g */
    public long mo23549g() {
        return this.f20631k0.mo23549g();
    }

    /* renamed from: h */
    public void mo23824h() {
        this.f20614U.mo23875a((C9190b) this);
        for (C9167m j : this.f20629i0) {
            j.mo23847j();
        }
        this.f20626f0 = null;
        this.f20618Y.mo23518b();
    }

    /* renamed from: a */
    public void mo23542a(C9073a aVar, long j) {
        this.f20626f0 = aVar;
        this.f20614U.mo23881b((C9190b) this);
        m27499d(j);
    }

    /* renamed from: c */
    public long mo23544c() {
        return this.f20631k0.mo23544c();
    }

    /* renamed from: d */
    private void m27499d(long j) {
        Map map;
        C9182e b = this.f20614U.mo23879b();
        Assertions.checkNotNull(b);
        C9182e eVar = b;
        if (this.f20625e0) {
            map = m27496a(eVar.f20756k);
        } else {
            map = Collections.emptyMap();
        }
        Map map2 = map;
        boolean z = !eVar.f20750e.isEmpty();
        List<C9183a> list = eVar.f20751f;
        List<C9183a> list2 = eVar.f20752g;
        this.f20627g0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            m27498a(eVar, j, (List<C9167m>) arrayList, (List<int[]>) arrayList2, map2);
        }
        m27497a(j, list, (List<C9167m>) arrayList, (List<int[]>) arrayList2, map2);
        int i = 0;
        while (i < list2.size()) {
            C9183a aVar = (C9183a) list2.get(i);
            int i2 = i;
            C9183a aVar2 = aVar;
            C9167m a = m27495a(3, new Uri[]{aVar.f20757a}, new Format[]{aVar.f20758b}, null, Collections.emptyList(), map2, j);
            arrayList2.add(new int[]{i2});
            arrayList.add(a);
            a.mo23833a(new TrackGroupArray(new C9199j0(aVar2.f20758b)), 0, TrackGroupArray.f20167W);
            i = i2 + 1;
        }
        this.f20629i0 = (C9167m[]) arrayList.toArray(new C9167m[0]);
        int[][] iArr = (int[][]) arrayList2.toArray(new int[0][]);
        C9167m[] mVarArr = this.f20629i0;
        this.f20627g0 = mVarArr.length;
        mVarArr[0].mo23836a(true);
        for (C9167m b2 : this.f20629i0) {
            b2.mo23839b();
        }
        this.f20630j0 = this.f20629i0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        if (r5 != r8[0]) goto L_0x00ee;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo23540a(com.google.android.exoplayer2.trackselection.C9311j[] r21, boolean[] r22, com.google.android.exoplayer2.source.C9141f0[] r23, boolean[] r24, long r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            if (r6 >= r7) goto L_0x004e
            r7 = r2[r6]
            r8 = -1
            if (r7 != 0) goto L_0x0017
            r7 = -1
            goto L_0x0025
        L_0x0017:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.f0, java.lang.Integer> r7 = r0.f20620a0
            r9 = r2[r6]
            java.lang.Object r7 = r7.get(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0025:
            r3[r6] = r7
            r4[r6] = r8
            r7 = r1[r6]
            if (r7 == 0) goto L_0x004b
            r7 = r1[r6]
            com.google.android.exoplayer2.source.j0 r7 = r7.mo24067a()
            r9 = 0
        L_0x0034:
            com.google.android.exoplayer2.source.hls.m[] r10 = r0.f20629i0
            int r11 = r10.length
            if (r9 >= r11) goto L_0x004b
            r10 = r10[r9]
            com.google.android.exoplayer2.source.TrackGroupArray r10 = r10.mo23845f()
            int r10 = r10.mo23530a(r7)
            if (r10 == r8) goto L_0x0048
            r4[r6] = r9
            goto L_0x004b
        L_0x0048:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x004b:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x004e:
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.f0, java.lang.Integer> r6 = r0.f20620a0
            r6.clear()
            int r6 = r1.length
            com.google.android.exoplayer2.source.f0[] r6 = new com.google.android.exoplayer2.source.C9141f0[r6]
            int r7 = r1.length
            com.google.android.exoplayer2.source.f0[] r7 = new com.google.android.exoplayer2.source.C9141f0[r7]
            int r8 = r1.length
            com.google.android.exoplayer2.trackselection.j[] r15 = new com.google.android.exoplayer2.trackselection.C9311j[r8]
            com.google.android.exoplayer2.source.hls.m[] r8 = r0.f20629i0
            int r8 = r8.length
            com.google.android.exoplayer2.source.hls.m[] r13 = new com.google.android.exoplayer2.source.hls.C9167m[r8]
            r12 = 0
            r14 = 0
            r16 = 0
        L_0x0065:
            com.google.android.exoplayer2.source.hls.m[] r8 = r0.f20629i0
            int r8 = r8.length
            if (r14 >= r8) goto L_0x010a
            r8 = 0
        L_0x006b:
            int r9 = r1.length
            if (r8 >= r9) goto L_0x0084
            r9 = r3[r8]
            r10 = 0
            if (r9 != r14) goto L_0x0076
            r9 = r2[r8]
            goto L_0x0077
        L_0x0076:
            r9 = r10
        L_0x0077:
            r7[r8] = r9
            r9 = r4[r8]
            if (r9 != r14) goto L_0x007f
            r10 = r1[r8]
        L_0x007f:
            r15[r8] = r10
            int r8 = r8 + 1
            goto L_0x006b
        L_0x0084:
            com.google.android.exoplayer2.source.hls.m[] r8 = r0.f20629i0
            r11 = r8[r14]
            r8 = r11
            r9 = r15
            r10 = r22
            r5 = r11
            r11 = r7
            r2 = r12
            r12 = r24
            r17 = r2
            r18 = r13
            r2 = r14
            r13 = r25
            r19 = r15
            r15 = r16
            boolean r8 = r8.mo23838a(r9, r10, r11, r12, r13, r15)
            r9 = 0
            r10 = 0
        L_0x00a2:
            int r11 = r1.length
            r12 = 1
            if (r9 >= r11) goto L_0x00d5
            r11 = r4[r9]
            if (r11 != r2) goto L_0x00c5
            r10 = r7[r9]
            if (r10 == 0) goto L_0x00b0
            r10 = 1
            goto L_0x00b1
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            com.google.android.exoplayer2.p393v0.Assertions.checkState(r10)
            r10 = r7[r9]
            r6[r9] = r10
            java.util.IdentityHashMap<com.google.android.exoplayer2.source.f0, java.lang.Integer> r10 = r0.f20620a0
            r11 = r7[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r10.put(r11, r13)
            r10 = 1
            goto L_0x00d2
        L_0x00c5:
            r11 = r3[r9]
            if (r11 != r2) goto L_0x00d2
            r11 = r7[r9]
            if (r11 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            com.google.android.exoplayer2.p393v0.Assertions.checkState(r12)
        L_0x00d2:
            int r9 = r9 + 1
            goto L_0x00a2
        L_0x00d5:
            if (r10 == 0) goto L_0x00fd
            r18[r17] = r5
            int r9 = r17 + 1
            if (r17 != 0) goto L_0x00f7
            r5.mo23836a(r12)
            if (r8 != 0) goto L_0x00ed
            com.google.android.exoplayer2.source.hls.m[] r8 = r0.f20630j0
            int r10 = r8.length
            if (r10 == 0) goto L_0x00ed
            r10 = 0
            r8 = r8[r10]
            if (r5 == r8) goto L_0x00fb
            goto L_0x00ee
        L_0x00ed:
            r10 = 0
        L_0x00ee:
            com.google.android.exoplayer2.source.hls.p r5 = r0.f20621b0
            r5.mo23861a()
            r12 = r9
            r16 = 1
            goto L_0x0100
        L_0x00f7:
            r10 = 0
            r5.mo23836a(r10)
        L_0x00fb:
            r12 = r9
            goto L_0x0100
        L_0x00fd:
            r10 = 0
            r12 = r17
        L_0x0100:
            int r14 = r2 + 1
            r2 = r23
            r13 = r18
            r15 = r19
            goto L_0x0065
        L_0x010a:
            r17 = r12
            r18 = r13
            r10 = 0
            int r1 = r6.length
            r2 = r23
            java.lang.System.arraycopy(r6, r10, r2, r10, r1)
            r1 = r18
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            com.google.android.exoplayer2.source.hls.m[] r1 = (com.google.android.exoplayer2.source.hls.C9167m[]) r1
            r0.f20630j0 = r1
            com.google.android.exoplayer2.source.t r1 = r0.f20623c0
            com.google.android.exoplayer2.source.hls.m[] r2 = r0.f20630j0
            com.google.android.exoplayer2.source.g0 r1 = r1.mo24003a(r2)
            r0.f20631k0 = r1
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C9165k.mo23540a(com.google.android.exoplayer2.trackselection.j[], boolean[], com.google.android.exoplayer2.source.f0[], boolean[], long):long");
    }

    /* renamed from: b */
    public void mo23823b() {
        this.f20626f0.mo23631a(this);
    }

    /* renamed from: a */
    public void mo23541a(long j, boolean z) {
        for (C9167m a : this.f20630j0) {
            a.mo23832a(j, z);
        }
    }

    /* renamed from: a */
    public long mo23538a(long j) {
        C9167m[] mVarArr = this.f20630j0;
        if (mVarArr.length > 0) {
            boolean b = mVarArr[0].mo23841b(j, false);
            int i = 1;
            while (true) {
                C9167m[] mVarArr2 = this.f20630j0;
                if (i >= mVarArr2.length) {
                    break;
                }
                mVarArr2[i].mo23841b(j, b);
                i++;
            }
            if (b) {
                this.f20621b0.mo23861a();
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo23819a() {
        int i = this.f20627g0 - 1;
        this.f20627g0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (C9167m f : this.f20629i0) {
                i2 += f.mo23845f().f20170c;
            }
            C9199j0[] j0VarArr = new C9199j0[i2];
            C9167m[] mVarArr = this.f20629i0;
            int length = mVarArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C9167m mVar = mVarArr[i3];
                int i5 = mVar.mo23845f().f20170c;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    int i8 = i6 + 1;
                    j0VarArr[i6] = mVar.mo23845f().mo23531a(i7);
                    i7++;
                    i6 = i8;
                }
                i3++;
                i4 = i6;
            }
            this.f20628h0 = new TrackGroupArray(j0VarArr);
            this.f20626f0.mo23550a(this);
        }
    }

    /* renamed from: a */
    public void mo23820a(Uri uri) {
        this.f20614U.mo23882c(uri);
    }

    /* renamed from: a */
    public void mo23631a(C9167m mVar) {
        this.f20626f0.mo23631a(this);
    }

    /* renamed from: a */
    public boolean mo23822a(Uri uri, long j) {
        boolean z = true;
        for (C9167m a : this.f20629i0) {
            z &= a.mo23837a(uri, j);
        }
        this.f20626f0.mo23631a(this);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27498a(com.google.android.exoplayer2.source.hls.playlist.C9182e r20, long r21, java.util.List<com.google.android.exoplayer2.source.hls.C9167m> r23, java.util.List<int[]> r24, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r25) {
        /*
            r19 = this;
            r0 = r20
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$b> r1 = r0.f20750e
            int r1 = r1.size()
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000e:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$b> r6 = r0.f20750e
            int r6 = r6.size()
            r7 = -1
            r8 = 2
            r9 = 1
            if (r3 >= r6) goto L_0x0047
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$b> r6 = r0.f20750e
            java.lang.Object r6 = r6.get(r3)
            com.google.android.exoplayer2.source.hls.playlist.e$b r6 = (com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b) r6
            com.google.android.exoplayer2.Format r6 = r6.f20761b
            int r10 = r6.f18356h0
            if (r10 > 0) goto L_0x0040
            java.lang.String r10 = r6.f18346Y
            java.lang.String r10 = com.google.android.exoplayer2.p393v0.Util.m29396a(r10, r8)
            if (r10 == 0) goto L_0x0030
            goto L_0x0040
        L_0x0030:
            java.lang.String r6 = r6.f18346Y
            java.lang.String r6 = com.google.android.exoplayer2.p393v0.Util.m29396a(r6, r9)
            if (r6 == 0) goto L_0x003d
            r1[r3] = r9
            int r5 = r5 + 1
            goto L_0x0044
        L_0x003d:
            r1[r3] = r7
            goto L_0x0044
        L_0x0040:
            r1[r3] = r8
            int r4 = r4 + 1
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0047:
            int r3 = r1.length
            if (r4 <= 0) goto L_0x004c
            r3 = 1
            goto L_0x0057
        L_0x004c:
            int r4 = r1.length
            if (r5 >= r4) goto L_0x0055
            int r3 = r1.length
            int r4 = r3 - r5
            r3 = 0
            r5 = 1
            goto L_0x0058
        L_0x0055:
            r4 = r3
            r3 = 0
        L_0x0057:
            r5 = 0
        L_0x0058:
            android.net.Uri[] r12 = new android.net.Uri[r4]
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r4]
            int[] r15 = new int[r4]
            r10 = 0
            r11 = 0
        L_0x0060:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$b> r13 = r0.f20750e
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x008c
            if (r3 == 0) goto L_0x006e
            r13 = r1[r10]
            if (r13 != r8) goto L_0x0089
        L_0x006e:
            if (r5 == 0) goto L_0x0074
            r13 = r1[r10]
            if (r13 == r9) goto L_0x0089
        L_0x0074:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$b> r13 = r0.f20750e
            java.lang.Object r13 = r13.get(r10)
            com.google.android.exoplayer2.source.hls.playlist.e$b r13 = (com.google.android.exoplayer2.source.hls.playlist.C9182e.C9184b) r13
            android.net.Uri r14 = r13.f20760a
            r12[r11] = r14
            com.google.android.exoplayer2.Format r13 = r13.f20761b
            r6[r11] = r13
            int r13 = r11 + 1
            r15[r11] = r10
            r11 = r13
        L_0x0089:
            int r10 = r10 + 1
            goto L_0x0060
        L_0x008c:
            r1 = r6[r2]
            java.lang.String r1 = r1.f18346Y
            r11 = 0
            com.google.android.exoplayer2.Format r14 = r0.f20753h
            java.util.List<com.google.android.exoplayer2.Format> r3 = r0.f20754i
            r10 = r19
            r13 = r6
            r5 = r15
            r15 = r3
            r16 = r25
            r17 = r21
            com.google.android.exoplayer2.source.hls.m r3 = r10.m27495a(r11, r12, r13, r14, r15, r16, r17)
            r10 = r23
            r10.add(r3)
            r10 = r24
            r10.add(r5)
            r5 = r19
            boolean r10 = r5.f20624d0
            if (r10 == 0) goto L_0x018b
            if (r1 == 0) goto L_0x018b
            java.lang.String r8 = com.google.android.exoplayer2.p393v0.Util.m29396a(r1, r8)
            if (r8 == 0) goto L_0x00bc
            r8 = 1
            goto L_0x00bd
        L_0x00bc:
            r8 = 0
        L_0x00bd:
            java.lang.String r10 = com.google.android.exoplayer2.p393v0.Util.m29396a(r1, r9)
            if (r10 == 0) goto L_0x00c5
            r10 = 1
            goto L_0x00c6
        L_0x00c5:
            r10 = 0
        L_0x00c6:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r8 == 0) goto L_0x0128
            com.google.android.exoplayer2.Format[] r1 = new com.google.android.exoplayer2.Format[r4]
            r4 = 0
        L_0x00d0:
            int r8 = r1.length
            if (r4 >= r8) goto L_0x00de
            r8 = r6[r4]
            com.google.android.exoplayer2.Format r8 = m27493a(r8)
            r1[r4] = r8
            int r4 = r4 + 1
            goto L_0x00d0
        L_0x00de:
            com.google.android.exoplayer2.source.j0 r4 = new com.google.android.exoplayer2.source.j0
            r4.<init>(r1)
            r11.add(r4)
            if (r10 == 0) goto L_0x0108
            com.google.android.exoplayer2.Format r1 = r0.f20753h
            if (r1 != 0) goto L_0x00f4
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.e$a> r1 = r0.f20751f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0108
        L_0x00f4:
            com.google.android.exoplayer2.source.j0 r1 = new com.google.android.exoplayer2.source.j0
            com.google.android.exoplayer2.Format[] r4 = new com.google.android.exoplayer2.Format[r9]
            r6 = r6[r2]
            com.google.android.exoplayer2.Format r8 = r0.f20753h
            com.google.android.exoplayer2.Format r6 = m27494a(r6, r8, r2)
            r4[r2] = r6
            r1.<init>(r4)
            r11.add(r1)
        L_0x0108:
            java.util.List<com.google.android.exoplayer2.Format> r0 = r0.f20754i
            if (r0 == 0) goto L_0x0145
            r1 = 0
        L_0x010d:
            int r4 = r0.size()
            if (r1 >= r4) goto L_0x0145
            com.google.android.exoplayer2.source.j0 r4 = new com.google.android.exoplayer2.source.j0
            com.google.android.exoplayer2.Format[] r6 = new com.google.android.exoplayer2.Format[r9]
            java.lang.Object r8 = r0.get(r1)
            com.google.android.exoplayer2.Format r8 = (com.google.android.exoplayer2.Format) r8
            r6[r2] = r8
            r4.<init>(r6)
            r11.add(r4)
            int r1 = r1 + 1
            goto L_0x010d
        L_0x0128:
            if (r10 == 0) goto L_0x0174
            com.google.android.exoplayer2.Format[] r1 = new com.google.android.exoplayer2.Format[r4]
            r4 = 0
        L_0x012d:
            int r8 = r1.length
            if (r4 >= r8) goto L_0x013d
            r8 = r6[r4]
            com.google.android.exoplayer2.Format r10 = r0.f20753h
            com.google.android.exoplayer2.Format r8 = m27494a(r8, r10, r9)
            r1[r4] = r8
            int r4 = r4 + 1
            goto L_0x012d
        L_0x013d:
            com.google.android.exoplayer2.source.j0 r0 = new com.google.android.exoplayer2.source.j0
            r0.<init>(r1)
            r11.add(r0)
        L_0x0145:
            com.google.android.exoplayer2.source.j0 r0 = new com.google.android.exoplayer2.source.j0
            com.google.android.exoplayer2.Format[] r1 = new com.google.android.exoplayer2.Format[r9]
            r4 = 0
            java.lang.String r6 = "ID3"
            java.lang.String r8 = "application/id3"
            com.google.android.exoplayer2.Format r4 = com.google.android.exoplayer2.Format.m24879a(r6, r8, r4, r7, r4)
            r1[r2] = r4
            r0.<init>(r1)
            r11.add(r0)
            com.google.android.exoplayer2.source.TrackGroupArray r1 = new com.google.android.exoplayer2.source.TrackGroupArray
            com.google.android.exoplayer2.source.j0[] r4 = new com.google.android.exoplayer2.source.C9199j0[r2]
            java.lang.Object[] r4 = r11.toArray(r4)
            com.google.android.exoplayer2.source.j0[] r4 = (com.google.android.exoplayer2.source.C9199j0[]) r4
            r1.<init>(r4)
            com.google.android.exoplayer2.source.TrackGroupArray r4 = new com.google.android.exoplayer2.source.TrackGroupArray
            com.google.android.exoplayer2.source.j0[] r6 = new com.google.android.exoplayer2.source.C9199j0[r9]
            r6[r2] = r0
            r4.<init>(r6)
            r3.mo23833a(r1, r2, r4)
            goto L_0x018b
        L_0x0174:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected codecs attribute: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C9165k.m27498a(com.google.android.exoplayer2.source.hls.playlist.e, long, java.util.List, java.util.List, java.util.Map):void");
    }

    /* renamed from: a */
    private void m27497a(long j, List<C9183a> list, List<C9167m> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        List<C9183a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = ((C9183a) list4.get(i)).f20759c;
            if (!hashSet.add(str)) {
                List<C9167m> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (Util.m29414a((Object) str, (Object) ((C9183a) list4.get(i2)).f20759c)) {
                        C9183a aVar = (C9183a) list4.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f20757a);
                        arrayList2.add(aVar.f20758b);
                        z &= aVar.f20758b.f18346Y != null;
                    }
                }
                C9167m a = m27495a(1, (Uri[]) arrayList.toArray(new Uri[0]), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j);
                list3.add(Util.m29417a((List<Integer>) arrayList3));
                list2.add(a);
                if (this.f20624d0 && z) {
                    a.mo23833a(new TrackGroupArray(new C9199j0((Format[]) arrayList2.toArray(new Format[0]))), 0, TrackGroupArray.f20167W);
                }
            }
        }
    }

    /* renamed from: a */
    private C9167m m27495a(int i, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j) {
        C9156g gVar = new C9156g(this.f20622c, this.f20614U, uriArr, formatArr, this.f20615V, this.f20616W, this.f20621b0, list);
        C9167m mVar = new C9167m(i, this, gVar, map, this.f20619Z, j, format, this.f20617X, this.f20618Y);
        return mVar;
    }

    /* renamed from: a */
    private static Map<String, DrmInitData> m27496a(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitData = (DrmInitData) list.get(i);
            String str = drmInitData.f18460V;
            i++;
            DrmInitData drmInitData2 = drmInitData;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData3 = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData3.f18460V, str)) {
                    drmInitData2 = drmInitData2.mo22751a(drmInitData3);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, drmInitData2);
        }
        return hashMap;
    }

    /* renamed from: a */
    private static Format m27493a(Format format) {
        String a = Util.m29396a(format.f18346Y, 2);
        return Format.m24882a(format.f18350c, format.f18342U, format.f18348a0, C9566t.m29511d(a), a, format.f18347Z, format.f18345X, format.f18355g0, format.f18356h0, format.f18357i0, null, format.f18343V, format.f18344W);
    }

    /* renamed from: a */
    private static Format m27494a(Format format, Format format2, boolean z) {
        String str;
        int i;
        int i2;
        int i3;
        Metadata metadata;
        String str2;
        String str3;
        Format format3 = format;
        Format format4 = format2;
        if (format4 != null) {
            String str4 = format4.f18346Y;
            Metadata metadata2 = format4.f18347Z;
            int i4 = format4.f18363o0;
            int i5 = format4.f18343V;
            int i6 = format4.f18344W;
            String str5 = format4.f18368t0;
            str3 = format4.f18342U;
            str2 = str4;
            metadata = metadata2;
            i3 = i4;
            i2 = i5;
            i = i6;
            str = str5;
        } else {
            String a = Util.m29396a(format3.f18346Y, 1);
            Metadata metadata3 = format3.f18347Z;
            if (z) {
                int i7 = format3.f18363o0;
                int i8 = format3.f18343V;
                str2 = a;
                i3 = i7;
                i2 = i8;
                metadata = metadata3;
                i = format3.f18344W;
                str = format3.f18368t0;
                str3 = format3.f18342U;
            } else {
                str2 = a;
                str3 = null;
                str = null;
                metadata = metadata3;
                i3 = -1;
                i2 = 0;
                i = 0;
            }
        }
        return Format.m24883a(format3.f18350c, str3, format3.f18348a0, C9566t.m29511d(str2), str2, metadata, z ? format3.f18345X : -1, i3, -1, null, i2, i, str);
    }
}
