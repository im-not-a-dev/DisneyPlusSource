package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.C9072a0;
import com.google.android.exoplayer2.source.C9072a0.C9073a;
import com.google.android.exoplayer2.source.C9141f0;
import com.google.android.exoplayer2.source.C9143g0;
import com.google.android.exoplayer2.source.C9143g0.C9144a;
import com.google.android.exoplayer2.source.C9199j0;
import com.google.android.exoplayer2.source.C9256t;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.p379m0.C9217g;
import com.google.android.exoplayer2.source.smoothstreaming.C9242c.C9243a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a.C9247b;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.C9491f;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.d */
/* compiled from: SsMediaPeriod */
final class C9244d implements C9072a0, C9144a<C9217g<C9242c>> {

    /* renamed from: U */
    private final TransferListener f20989U;

    /* renamed from: V */
    private final LoaderErrorThrower f20990V;

    /* renamed from: W */
    private final LoadErrorHandlingPolicy f20991W;

    /* renamed from: X */
    private final C9068a f20992X;

    /* renamed from: Y */
    private final C9491f f20993Y;

    /* renamed from: Z */
    private final TrackGroupArray f20994Z;

    /* renamed from: a0 */
    private final C9256t f20995a0;

    /* renamed from: b0 */
    private C9073a f20996b0;

    /* renamed from: c */
    private final C9243a f20997c;

    /* renamed from: c0 */
    private C9245a f20998c0;

    /* renamed from: d0 */
    private C9217g<C9242c>[] f20999d0 = m27913a(0);

    /* renamed from: e0 */
    private C9143g0 f21000e0;

    /* renamed from: f0 */
    private boolean f21001f0;

    public C9244d(C9245a aVar, C9243a aVar2, TransferListener transferListener, C9256t tVar, LoadErrorHandlingPolicy zVar, C9068a aVar3, LoaderErrorThrower b0Var, C9491f fVar) {
        this.f20998c0 = aVar;
        this.f20997c = aVar2;
        this.f20989U = transferListener;
        this.f20990V = b0Var;
        this.f20991W = zVar;
        this.f20992X = aVar3;
        this.f20993Y = fVar;
        this.f20995a0 = tVar;
        this.f20994Z = m27914b(aVar);
        this.f21000e0 = tVar.mo24003a(this.f20999d0);
        aVar3.mo23499a();
    }

    /* renamed from: b */
    public void mo23982b() {
        for (C9217g<C9242c> k : this.f20999d0) {
            k.mo23953k();
        }
        this.f20996b0 = null;
        this.f20992X.mo23518b();
    }

    /* renamed from: c */
    public void mo23545c(long j) {
        this.f21000e0.mo23545c(j);
    }

    /* renamed from: d */
    public void mo23546d() throws IOException {
        this.f20990V.maybeThrowError();
    }

    /* renamed from: e */
    public long mo23547e() {
        if (!this.f21001f0) {
            this.f20992X.mo23525c();
            this.f21001f0 = true;
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public TrackGroupArray mo23548f() {
        return this.f20994Z;
    }

    /* renamed from: g */
    public long mo23549g() {
        return this.f21000e0.mo23549g();
    }

    /* renamed from: a */
    public void mo23981a(C9245a aVar) {
        this.f20998c0 = aVar;
        for (C9217g<C9242c> i : this.f20999d0) {
            ((C9242c) i.mo23951i()).mo23977a(aVar);
        }
        this.f20996b0.mo23631a(this);
    }

    /* renamed from: c */
    public long mo23544c() {
        return this.f21000e0.mo23544c();
    }

    /* renamed from: b */
    public boolean mo23543b(long j) {
        return this.f21000e0.mo23543b(j);
    }

    /* renamed from: b */
    private static TrackGroupArray m27914b(C9245a aVar) {
        C9199j0[] j0VarArr = new C9199j0[aVar.f21007f.length];
        int i = 0;
        while (true) {
            C9247b[] bVarArr = aVar.f21007f;
            if (i >= bVarArr.length) {
                return new TrackGroupArray(j0VarArr);
            }
            j0VarArr[i] = new C9199j0(bVarArr[i].f21022j);
            i++;
        }
    }

    /* renamed from: a */
    public void mo23542a(C9073a aVar, long j) {
        this.f20996b0 = aVar;
        aVar.mo23550a(this);
    }

    /* renamed from: a */
    public long mo23540a(TrackSelection[] jVarArr, boolean[] zArr, C9141f0[] f0VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jVarArr.length; i++) {
            if (f0VarArr[i] != null) {
                C9217g gVar = f0VarArr[i];
                if (jVarArr[i] == null || !zArr[i]) {
                    gVar.mo23953k();
                    f0VarArr[i] = null;
                } else {
                    ((C9242c) gVar.mo23951i()).mo23978a(jVarArr[i]);
                    arrayList.add(gVar);
                }
            }
            if (f0VarArr[i] == null && jVarArr[i] != null) {
                C9217g a = m27912a(jVarArr[i], j);
                arrayList.add(a);
                f0VarArr[i] = a;
                zArr2[i] = true;
            }
        }
        this.f20999d0 = m27913a(arrayList.size());
        arrayList.toArray(this.f20999d0);
        this.f21000e0 = this.f20995a0.mo24003a(this.f20999d0);
        return j;
    }

    /* renamed from: a */
    public void mo23541a(long j, boolean z) {
        for (C9217g<C9242c> a : this.f20999d0) {
            a.mo23947a(j, z);
        }
    }

    /* renamed from: a */
    public long mo23538a(long j) {
        for (C9217g<C9242c> a : this.f20999d0) {
            a.mo23946a(j);
        }
        return j;
    }

    /* renamed from: a */
    public long mo23539a(long j, SeekParameters seekParameters) {
        C9217g<C9242c>[] gVarArr;
        for (C9217g<C9242c> gVar : this.f20999d0) {
            if (gVar.f20890c == 2) {
                return gVar.mo23943a(j, seekParameters);
            }
        }
        return j;
    }

    /* renamed from: a */
    public void mo23631a(C9217g<C9242c> gVar) {
        this.f20996b0.mo23631a(this);
    }

    /* renamed from: a */
    private C9217g<C9242c> m27912a(TrackSelection jVar, long j) {
        int a = this.f20994Z.mo23530a(jVar.mo24067a());
        C9217g gVar = new C9217g(this.f20998c0.f21007f[a].f21013a, null, null, this.f20997c.mo23979a(this.f20990V, this.f20998c0, a, jVar, this.f20989U), this, this.f20993Y, j, this.f20991W, this.f20992X);
        return gVar;
    }

    /* renamed from: a */
    private static C9217g<C9242c>[] m27913a(int i) {
        return new C9217g[i];
    }
}
