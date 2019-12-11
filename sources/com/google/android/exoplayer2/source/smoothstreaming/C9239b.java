package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.p366s0.p371v.C8972g;
import com.google.android.exoplayer2.p366s0.p371v.C8983m;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.source.C9230p;
import com.google.android.exoplayer2.source.p379m0.C9210b;
import com.google.android.exoplayer2.source.p379m0.C9212d;
import com.google.android.exoplayer2.source.p379m0.C9213e;
import com.google.android.exoplayer2.source.p379m0.C9216f;
import com.google.android.exoplayer2.source.p379m0.C9221i;
import com.google.android.exoplayer2.source.p379m0.C9224l;
import com.google.android.exoplayer2.source.p379m0.C9225m;
import com.google.android.exoplayer2.source.smoothstreaming.C9242c.C9243a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a;
import com.google.android.exoplayer2.source.smoothstreaming.p380e.C9245a.C9247b;
import com.google.android.exoplayer2.trackselection.C9311j;
import com.google.android.exoplayer2.upstream.C9452b0;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.C9435a;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.b */
/* compiled from: DefaultSsChunkSource */
public class C9239b implements C9242c {

    /* renamed from: a */
    private final C9452b0 f20980a;

    /* renamed from: b */
    private final int f20981b;

    /* renamed from: c */
    private final C9213e[] f20982c;

    /* renamed from: d */
    private final DataSource f20983d;

    /* renamed from: e */
    private C9311j f20984e;

    /* renamed from: f */
    private C9245a f20985f;

    /* renamed from: g */
    private int f20986g;

    /* renamed from: h */
    private IOException f20987h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.b$a */
    /* compiled from: DefaultSsChunkSource */
    public static final class C9240a implements C9243a {

        /* renamed from: a */
        private final C9435a f20988a;

        public C9240a(C9435a aVar) {
            this.f20988a = aVar;
        }

        /* renamed from: a */
        public C9242c mo23979a(C9452b0 b0Var, C9245a aVar, int i, C9311j jVar, TransferListener transferListener) {
            DataSource a = this.f20988a.mo24448a();
            if (transferListener != null) {
                a.addTransferListener(transferListener);
            }
            C9239b bVar = new C9239b(b0Var, aVar, i, jVar, a);
            return bVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.b$b */
    /* compiled from: DefaultSsChunkSource */
    private static final class C9241b extends C9210b {
        public C9241b(C9247b bVar, int i, int i2) {
            super((long) i2, (long) (bVar.f21023k - 1));
        }
    }

    public C9239b(C9452b0 b0Var, C9245a aVar, int i, C9311j jVar, DataSource dataSource) {
        C9245a aVar2 = aVar;
        int i2 = i;
        C9311j jVar2 = jVar;
        this.f20980a = b0Var;
        this.f20985f = aVar2;
        this.f20981b = i2;
        this.f20984e = jVar2;
        this.f20983d = dataSource;
        C9247b bVar = aVar2.f21007f[i2];
        this.f20982c = new C9213e[jVar.length()];
        int i3 = 0;
        while (i3 < this.f20982c.length) {
            int b = jVar2.mo24070b(i3);
            Format format = bVar.f21022j[b];
            int i4 = i3;
            C8983m mVar = r7;
            C8983m mVar2 = new C8983m(b, bVar.f21013a, bVar.f21015c, -9223372036854775807L, aVar2.f21008g, format, 0, format.f18353e0 != null ? aVar2.f21006e.f21012c : null, bVar.f21013a == 2 ? 4 : 0, null, null);
            this.f20982c[i4] = new C9213e(new C8972g(3, null, mVar, null), bVar.f21013a, format);
            i3 = i4 + 1;
        }
    }

    /* renamed from: a */
    public long mo23643a(long j, SeekParameters seekParameters) {
        C9247b bVar = this.f20985f.f21007f[this.f20981b];
        int a = bVar.mo23983a(j);
        long b = bVar.mo23987b(a);
        return Util.m29390a(j, seekParameters, b, (b >= j || a >= bVar.f21023k + -1) ? b : bVar.mo23987b(a + 1));
    }

    /* renamed from: a */
    public void mo23648a(C9212d dVar) {
    }

    /* renamed from: a */
    public void mo23977a(C9245a aVar) {
        C9247b[] bVarArr = this.f20985f.f21007f;
        int i = this.f20981b;
        C9247b bVar = bVarArr[i];
        int i2 = bVar.f21023k;
        C9247b bVar2 = aVar.f21007f[i];
        if (i2 == 0 || bVar2.f21023k == 0) {
            this.f20986g += i2;
        } else {
            int i3 = i2 - 1;
            long b = bVar.mo23987b(i3) + bVar.mo23984a(i3);
            long b2 = bVar2.mo23987b(0);
            if (b <= b2) {
                this.f20986g += i2;
            } else {
                this.f20986g += bVar.mo23983a(b2);
            }
        }
        this.f20985f = aVar;
    }

    /* renamed from: a */
    public void mo23978a(C9311j jVar) {
        this.f20984e = jVar;
    }

    /* renamed from: a */
    public void mo23646a() throws IOException {
        IOException iOException = this.f20987h;
        if (iOException == null) {
            this.f20980a.mo23621a();
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public int mo23642a(long j, List<? extends C9224l> list) {
        if (this.f20987h != null || this.f20984e.length() < 2) {
            return list.size();
        }
        return this.f20984e.mo24051a(j, list);
    }

    /* renamed from: a */
    public final void mo23647a(long j, long j2, List<? extends C9224l> list, C9216f fVar) {
        int i;
        long j3 = j2;
        C9216f fVar2 = fVar;
        if (this.f20987h == null) {
            C9245a aVar = this.f20985f;
            C9247b bVar = aVar.f21007f[this.f20981b];
            if (bVar.f21023k == 0) {
                fVar2.f20881b = !aVar.f21005d;
                return;
            }
            if (list.isEmpty()) {
                i = bVar.mo23983a(j3);
                List<? extends C9224l> list2 = list;
            } else {
                i = (int) (((C9224l) list.get(list.size() - 1)).mo23956f() - ((long) this.f20986g));
                if (i < 0) {
                    this.f20987h = new C9230p();
                    return;
                }
            }
            if (i >= bVar.f21023k) {
                fVar2.f20881b = !this.f20985f.f21005d;
                return;
            }
            long j4 = j3 - j;
            long a = m27898a(j);
            C9225m[] mVarArr = new C9225m[this.f20984e.length()];
            for (int i2 = 0; i2 < mVarArr.length; i2++) {
                mVarArr[i2] = new C9241b(bVar, this.f20984e.mo24070b(i2), i);
            }
            this.f20984e.mo23813a(j, j4, a, list, mVarArr);
            long b = bVar.mo23987b(i);
            long a2 = b + bVar.mo23984a(i);
            if (!list.isEmpty()) {
                j3 = -9223372036854775807L;
            }
            long j5 = j3;
            int i3 = i + this.f20986g;
            int b2 = this.f20984e.mo23814b();
            C9213e eVar = this.f20982c[b2];
            Uri a3 = bVar.mo23985a(this.f20984e.mo24070b(b2), i);
            fVar2.f20880a = m27899a(this.f20984e.mo24076f(), this.f20983d, a3, null, i3, b, a2, j5, this.f20984e.mo23815g(), this.f20984e.mo23816h(), eVar);
        }
    }

    /* renamed from: a */
    public boolean mo23649a(C9212d dVar, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            C9311j jVar = this.f20984e;
            if (jVar.mo24069a(jVar.mo24065a(dVar.f20858c), j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C9224l m27899a(Format format, DataSource dataSource, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, C9213e eVar) {
        Format format2 = format;
        DataSource dataSource2 = dataSource;
        long j4 = j;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        int i3 = i2;
        Object obj2 = obj;
        C9213e eVar2 = eVar;
        DataSpec dataSpec = r26;
        DataSpec dataSpec2 = new DataSpec(uri, 0, -1, str);
        C9221i iVar = new C9221i(dataSource2, dataSpec, format2, i3, obj2, j4, j6, j7, -9223372036854775807L, (long) i, 1, j5, eVar2);
        return iVar;
    }

    /* renamed from: a */
    private long m27898a(long j) {
        C9245a aVar = this.f20985f;
        if (!aVar.f21005d) {
            return -9223372036854775807L;
        }
        C9247b bVar = aVar.f21007f[this.f20981b];
        int i = bVar.f21023k - 1;
        return (bVar.mo23987b(i) + bVar.mo23984a(i)) - j;
    }
}
