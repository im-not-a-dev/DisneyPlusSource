package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.io.EOFException;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.w.b */
/* compiled from: DefaultOggSeeker */
final class C8988b implements C8996g {

    /* renamed from: a */
    private final C8995f f19706a = new C8995f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f19707b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f19708c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8998i f19709d;

    /* renamed from: e */
    private int f19710e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f19711f;

    /* renamed from: g */
    private long f19712g;

    /* renamed from: h */
    private long f19713h;

    /* renamed from: i */
    private long f19714i;

    /* renamed from: j */
    private long f19715j;

    /* renamed from: k */
    private long f19716k;

    /* renamed from: l */
    private long f19717l;

    /* renamed from: com.google.android.exoplayer2.s0.w.b$b */
    /* compiled from: DefaultOggSeeker */
    private final class C8990b implements C8920o {
        private C8990b() {
        }

        /* renamed from: b */
        public C8921a mo23277b(long j) {
            return new C8921a(new C8923p(j, C9554k0.m29431b((C8988b.this.f19707b + ((C8988b.this.f19709d.mo23416b(j) * (C8988b.this.f19708c - C8988b.this.f19707b)) / C8988b.this.f19711f)) - 30000, C8988b.this.f19707b, C8988b.this.f19708c - 1)));
        }

        /* renamed from: c */
        public boolean mo23279c() {
            return true;
        }

        /* renamed from: d */
        public long mo23280d() {
            return C8988b.this.f19709d.mo23413a(C8988b.this.f19711f);
        }
    }

    public C8988b(C8998i iVar, long j, long j2, long j3, long j4, boolean z) {
        C9537e.m29299a(j >= 0 && j2 > j);
        this.f19709d = iVar;
        this.f19707b = j;
        this.f19708c = j2;
        if (j3 == j2 - j || z) {
            this.f19711f = j4;
            this.f19710e = 4;
            return;
        }
        this.f19710e = 0;
    }

    /* renamed from: e */
    private void m26522e(C8913h hVar) throws IOException, InterruptedException {
        this.f19706a.mo23411a(hVar, false);
        while (true) {
            C8995f fVar = this.f19706a;
            if (fVar.f19737c <= this.f19713h) {
                hVar.mo23298c(fVar.f19739e + fVar.f19740f);
                this.f19714i = hVar.getPosition();
                C8995f fVar2 = this.f19706a;
                this.f19716k = fVar2.f19737c;
                fVar2.mo23411a(hVar, false);
            } else {
                hVar.mo23297c();
                return;
            }
        }
    }

    /* renamed from: d */
    private long m26520d(C8913h hVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        if (this.f19714i == this.f19715j) {
            return -1;
        }
        long position = hVar.getPosition();
        if (!m26517a(hVar2, this.f19715j)) {
            long j = this.f19714i;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f19706a.mo23411a(hVar2, false);
        hVar.mo23297c();
        long j2 = this.f19713h;
        C8995f fVar = this.f19706a;
        long j3 = j2 - fVar.f19737c;
        int i = fVar.f19739e + fVar.f19740f;
        if (0 <= j3 && j3 < 72000) {
            return -1;
        }
        int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i2 < 0) {
            this.f19715j = position;
            this.f19717l = this.f19706a.f19737c;
        } else {
            this.f19714i = hVar.getPosition() + ((long) i);
            this.f19716k = this.f19706a.f19737c;
        }
        long j4 = this.f19715j;
        long j5 = this.f19714i;
        if (j4 - j5 < 100000) {
            this.f19715j = j5;
            return j5;
        }
        long position2 = hVar.getPosition() - (((long) i) * (i2 <= 0 ? 2 : 1));
        long j6 = this.f19715j;
        long j7 = this.f19714i;
        return C9554k0.m29431b(position2 + ((j3 * (j6 - j7)) / (this.f19717l - this.f19716k)), j7, j6 - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo23397b(C8913h hVar) throws IOException, InterruptedException {
        mo23399c(hVar);
        this.f19706a.mo23410a();
        while ((this.f19706a.f19736b & 4) != 4 && hVar.getPosition() < this.f19708c) {
            this.f19706a.mo23411a(hVar, false);
            C8995f fVar = this.f19706a;
            hVar.mo23298c(fVar.f19739e + fVar.f19740f);
        }
        return this.f19706a.f19737c;
    }

    /* renamed from: c */
    public void mo23398c(long j) {
        this.f19713h = C9554k0.m29431b(j, 0, this.f19711f - 1);
        this.f19710e = 2;
        this.f19714i = this.f19707b;
        this.f19715j = this.f19708c;
        this.f19716k = 0;
        this.f19717l = this.f19711f;
    }

    /* renamed from: a */
    public long mo23395a(C8913h hVar) throws IOException, InterruptedException {
        int i = this.f19710e;
        if (i == 0) {
            this.f19712g = hVar.getPosition();
            this.f19710e = 1;
            long j = this.f19708c - 65307;
            if (j > this.f19712g) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long d = m26520d(hVar);
                if (d != -1) {
                    return d;
                }
                this.f19710e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m26522e(hVar);
            this.f19710e = 4;
            return -(this.f19716k + 2);
        }
        this.f19711f = mo23397b(hVar);
        this.f19710e = 4;
        return this.f19712g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo23399c(C8913h hVar) throws IOException, InterruptedException {
        if (!m26517a(hVar, this.f19708c)) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public C8990b m26525a() {
        if (this.f19711f != 0) {
            return new C8990b();
        }
        return null;
    }

    /* renamed from: a */
    private boolean m26517a(C8913h hVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f19708c);
        byte[] bArr = new byte[DateUtils.FORMAT_NO_MIDNIGHT];
        int length = bArr.length;
        while (true) {
            int i2 = 0;
            if (hVar.getPosition() + ((long) length) > min) {
                int position = (int) (min - hVar.getPosition());
                if (position < 4) {
                    return false;
                }
                length = position;
            }
            hVar.mo23296b(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 >= i) {
                    break;
                } else if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                    hVar.mo23298c(i2);
                    return true;
                } else {
                    i2++;
                }
            }
            hVar.mo23298c(i);
        }
    }
}
