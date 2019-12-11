package com.google.android.exoplayer2.source.p379m0;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8911f;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.m0.e */
/* compiled from: ChunkExtractorWrapper */
public final class C9213e implements C8914i {

    /* renamed from: U */
    private final int f20864U;

    /* renamed from: V */
    private final Format f20865V;

    /* renamed from: W */
    private final SparseArray<C9214a> f20866W = new SparseArray<>();

    /* renamed from: X */
    private boolean f20867X;

    /* renamed from: Y */
    private C9215b f20868Y;

    /* renamed from: Z */
    private long f20869Z;

    /* renamed from: a0 */
    private C8920o f20870a0;

    /* renamed from: b0 */
    private Format[] f20871b0;

    /* renamed from: c */
    public final C8912g f20872c;

    /* renamed from: com.google.android.exoplayer2.source.m0.e$a */
    /* compiled from: ChunkExtractorWrapper */
    private static final class C9214a implements C8924q {

        /* renamed from: a */
        private final int f20873a;

        /* renamed from: b */
        private final int f20874b;

        /* renamed from: c */
        private final Format f20875c;

        /* renamed from: d */
        private final C8911f f20876d = new C8911f();

        /* renamed from: e */
        public Format f20877e;

        /* renamed from: f */
        private C8924q f20878f;

        /* renamed from: g */
        private long f20879g;

        public C9214a(int i, int i2, Format format) {
            this.f20873a = i;
            this.f20874b = i2;
            this.f20875c = format;
        }

        /* renamed from: a */
        public void mo23941a(C9215b bVar, long j) {
            if (bVar == null) {
                this.f20878f = this.f20876d;
                return;
            }
            this.f20879g = j;
            this.f20878f = bVar.mo23931a(this.f20873a, this.f20874b);
            Format format = this.f20877e;
            if (format != null) {
                this.f20878f.mo23304a(format);
            }
        }

        /* renamed from: a */
        public void mo23304a(Format format) {
            Format format2 = this.f20875c;
            if (format2 != null) {
                format = format.mo22601a(format2);
            }
            this.f20877e = format;
            this.f20878f.mo23304a(this.f20877e);
        }

        /* renamed from: a */
        public int mo23302a(C8913h hVar, int i, boolean z) throws IOException, InterruptedException {
            return this.f20878f.mo23302a(hVar, i, z);
        }

        /* renamed from: a */
        public void mo23305a(C9572w wVar, int i) {
            this.f20878f.mo23305a(wVar, i);
        }

        /* renamed from: a */
        public void mo23303a(long j, int i, int i2, int i3, C8925a aVar) {
            long j2 = this.f20879g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f20878f = this.f20876d;
            }
            this.f20878f.mo23303a(j, i, i2, i3, aVar);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m0.e$b */
    /* compiled from: ChunkExtractorWrapper */
    public interface C9215b {
        /* renamed from: a */
        C8924q mo23931a(int i, int i2);
    }

    public C9213e(C8912g gVar, int i, Format format) {
        this.f20872c = gVar;
        this.f20864U = i;
        this.f20865V = format;
    }

    /* renamed from: a */
    public void mo23938a(C9215b bVar, long j, long j2) {
        this.f20868Y = bVar;
        this.f20869Z = j2;
        if (!this.f20867X) {
            this.f20872c.mo23309a((C8914i) this);
            if (j != -9223372036854775807L) {
                this.f20872c.mo23308a(0, j);
            }
            this.f20867X = true;
            return;
        }
        C8912g gVar = this.f20872c;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        gVar.mo23308a(0, j);
        for (int i = 0; i < this.f20866W.size(); i++) {
            ((C9214a) this.f20866W.valueAt(i)).mo23941a(bVar, j2);
        }
    }

    /* renamed from: b */
    public Format[] mo23939b() {
        return this.f20871b0;
    }

    /* renamed from: c */
    public C8920o mo23940c() {
        return this.f20870a0;
    }

    /* renamed from: a */
    public C8924q mo23311a(int i, int i2) {
        C9214a aVar = (C9214a) this.f20866W.get(i);
        if (aVar == null) {
            Assertions.checkState(this.f20871b0 == null);
            aVar = new C9214a(i, i2, i2 == this.f20864U ? this.f20865V : null);
            aVar.mo23941a(this.f20868Y, this.f20869Z);
            this.f20866W.put(i, aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo23312a() {
        Format[] formatArr = new Format[this.f20866W.size()];
        for (int i = 0; i < this.f20866W.size(); i++) {
            formatArr[i] = ((C9214a) this.f20866W.valueAt(i)).f20877e;
        }
        this.f20871b0 = formatArr;
    }

    /* renamed from: a */
    public void mo23313a(C8920o oVar) {
        this.f20870a0 = oVar;
    }
}
