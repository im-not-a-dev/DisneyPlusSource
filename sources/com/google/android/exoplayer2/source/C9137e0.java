package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8874b;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p393v0.C9572w;
import com.google.android.exoplayer2.source.C9085d0.C9086a;
import com.google.android.exoplayer2.upstream.C9489e;
import com.google.android.exoplayer2.upstream.C9491f;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.source.e0 */
/* compiled from: SampleQueue */
public class C9137e0 implements C8924q {

    /* renamed from: a */
    private final C9491f f20499a;

    /* renamed from: b */
    private final int f20500b;

    /* renamed from: c */
    private final C9085d0 f20501c = new C9085d0();

    /* renamed from: d */
    private final C9086a f20502d = new C9086a();

    /* renamed from: e */
    private final C9572w f20503e = new C9572w(32);

    /* renamed from: f */
    private C9138a f20504f = new C9138a(0, this.f20500b);

    /* renamed from: g */
    private C9138a f20505g;

    /* renamed from: h */
    private C9138a f20506h;

    /* renamed from: i */
    private Format f20507i;

    /* renamed from: j */
    private boolean f20508j;

    /* renamed from: k */
    private Format f20509k;

    /* renamed from: l */
    private long f20510l;

    /* renamed from: m */
    private long f20511m;

    /* renamed from: n */
    private boolean f20512n;

    /* renamed from: o */
    private C9139b f20513o;

    /* renamed from: com.google.android.exoplayer2.source.e0$a */
    /* compiled from: SampleQueue */
    private static final class C9138a {

        /* renamed from: a */
        public final long f20514a;

        /* renamed from: b */
        public final long f20515b;

        /* renamed from: c */
        public boolean f20516c;

        /* renamed from: d */
        public C9489e f20517d;

        /* renamed from: e */
        public C9138a f20518e;

        public C9138a(long j, int i) {
            this.f20514a = j;
            this.f20515b = j + ((long) i);
        }

        /* renamed from: a */
        public void mo23773a(C9489e eVar, C9138a aVar) {
            this.f20517d = eVar;
            this.f20518e = aVar;
            this.f20516c = true;
        }

        /* renamed from: a */
        public int mo23771a(long j) {
            return ((int) (j - this.f20514a)) + this.f20517d.f22092b;
        }

        /* renamed from: a */
        public C9138a mo23772a() {
            this.f20517d = null;
            C9138a aVar = this.f20518e;
            this.f20518e = null;
            return aVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.e0$b */
    /* compiled from: SampleQueue */
    public interface C9139b {
        /* renamed from: a */
        void mo23556a(Format format);
    }

    public C9137e0(C9491f fVar) {
        this.f20499a = fVar;
        this.f20500b = fVar.mo24561c();
        C9138a aVar = this.f20504f;
        this.f20505g = aVar;
        this.f20506h = aVar;
    }

    /* renamed from: a */
    public void mo23753a(boolean z) {
        this.f20501c.mo23588a(z);
        m27380a(this.f20504f);
        this.f20504f = new C9138a(0, this.f20500b);
        C9138a aVar = this.f20504f;
        this.f20505g = aVar;
        this.f20506h = aVar;
        this.f20511m = 0;
        this.f20499a.mo24560b();
    }

    /* renamed from: b */
    public void mo23755b(long j, boolean z, boolean z2) {
        m27382c(this.f20501c.mo23592b(j, z, z2));
    }

    /* renamed from: c */
    public void mo23758c(int i) {
        this.f20501c.mo23595c(i);
    }

    /* renamed from: d */
    public int mo23759d() {
        return this.f20501c.mo23596d();
    }

    /* renamed from: e */
    public long mo23760e() {
        return this.f20501c.mo23597e();
    }

    /* renamed from: f */
    public long mo23761f() {
        return this.f20501c.mo23598f();
    }

    /* renamed from: g */
    public int mo23762g() {
        return this.f20501c.mo23599g();
    }

    /* renamed from: h */
    public Format mo23763h() {
        return this.f20501c.mo23600h();
    }

    /* renamed from: i */
    public int mo23764i() {
        return this.f20501c.mo23601i();
    }

    /* renamed from: j */
    public boolean mo23765j() {
        return this.f20501c.mo23602j();
    }

    /* renamed from: k */
    public boolean mo23766k() {
        return this.f20501c.mo23603k();
    }

    /* renamed from: l */
    public int mo23767l() {
        return this.f20501c.mo23604l();
    }

    /* renamed from: m */
    public void mo23768m() {
        mo23753a(false);
    }

    /* renamed from: n */
    public void mo23769n() {
        this.f20501c.mo23605m();
        this.f20505g = this.f20504f;
    }

    /* renamed from: o */
    public void mo23770o() {
        this.f20512n = true;
    }

    /* renamed from: d */
    private void m27383d(int i) {
        this.f20511m += (long) i;
        long j = this.f20511m;
        C9138a aVar = this.f20506h;
        if (j == aVar.f20515b) {
            this.f20506h = aVar.f20518e;
        }
    }

    /* renamed from: e */
    private int m27384e(int i) {
        C9138a aVar = this.f20506h;
        if (!aVar.f20516c) {
            aVar.mo23773a(this.f20499a.mo24557a(), new C9138a(this.f20506h.f20515b, this.f20500b));
        }
        return Math.min(i, (int) (this.f20506h.f20515b - this.f20511m));
    }

    /* renamed from: b */
    public void mo23754b() {
        m27382c(this.f20501c.mo23591b());
    }

    /* renamed from: c */
    public void mo23757c() {
        m27382c(this.f20501c.mo23594c());
    }

    /* renamed from: c */
    private void m27382c(long j) {
        C9138a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f20504f;
                if (j < aVar.f20515b) {
                    break;
                }
                this.f20499a.mo24558a(aVar.f20517d);
                this.f20504f = this.f20504f.mo23772a();
            }
            if (this.f20505g.f20514a < aVar.f20514a) {
                this.f20505g = aVar;
            }
        }
    }

    /* renamed from: b */
    public boolean mo23756b(int i) {
        return this.f20501c.mo23593b(i);
    }

    /* renamed from: b */
    private void m27381b(long j) {
        while (true) {
            C9138a aVar = this.f20505g;
            if (j >= aVar.f20515b) {
                this.f20505g = aVar.f20518e;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo23750a(int i) {
        this.f20511m = this.f20501c.mo23586a(i);
        long j = this.f20511m;
        if (j != 0) {
            C9138a aVar = this.f20504f;
            if (j != aVar.f20514a) {
                while (this.f20511m > aVar.f20515b) {
                    aVar = aVar.f20518e;
                }
                C9138a aVar2 = aVar.f20518e;
                m27380a(aVar2);
                aVar.f20518e = new C9138a(aVar.f20515b, this.f20500b);
                this.f20506h = this.f20511m == aVar.f20515b ? aVar.f20518e : aVar;
                if (this.f20505g == aVar2) {
                    this.f20505g = aVar.f20518e;
                    return;
                }
                return;
            }
        }
        m27380a(this.f20504f);
        this.f20504f = new C9138a(this.f20511m, this.f20500b);
        C9138a aVar3 = this.f20504f;
        this.f20505g = aVar3;
        this.f20506h = aVar3;
    }

    /* renamed from: a */
    public int mo23747a() {
        return this.f20501c.mo23583a();
    }

    /* renamed from: a */
    public int mo23748a(long j, boolean z, boolean z2) {
        return this.f20501c.mo23584a(j, z, z2);
    }

    /* renamed from: a */
    public int mo23749a(C8679b0 b0Var, C8879e eVar, boolean z, boolean z2, long j) {
        int a = this.f20501c.mo23585a(b0Var, eVar, z, z2, this.f20507i, this.f20502d);
        if (a == -5) {
            this.f20507i = b0Var.f18427a;
            return -5;
        } else if (a == -4) {
            if (!eVar.mo23211d()) {
                if (eVar.f19024W < j) {
                    eVar.mo23208b(Integer.MIN_VALUE);
                }
                if (!eVar.mo23226h()) {
                    if (eVar.mo23225g()) {
                        m27379a(eVar, this.f20502d);
                    }
                    eVar.mo23224f(this.f20502d.f20278a);
                    C9086a aVar = this.f20502d;
                    m27377a(aVar.f20279b, eVar.f19023V, aVar.f20278a);
                }
            }
            return -4;
        } else if (a == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m27379a(C8879e eVar, C9086a aVar) {
        int i;
        C8879e eVar2 = eVar;
        C9086a aVar2 = aVar;
        long j = aVar2.f20279b;
        this.f20503e.mo24689c(1);
        m27378a(j, this.f20503e.f22333a, 1);
        long j2 = j + 1;
        byte b = this.f20503e.f22333a[0];
        boolean z = (b & 128) != 0;
        byte b2 = b & Byte.MAX_VALUE;
        C8874b bVar = eVar2.f19022U;
        if (bVar.f19006a == null) {
            bVar.f19006a = new byte[16];
        }
        m27378a(j2, eVar2.f19022U.f19006a, (int) b2);
        long j3 = j2 + ((long) b2);
        if (z) {
            this.f20503e.mo24689c(2);
            m27378a(j3, this.f20503e.f22333a, 2);
            j3 += 2;
            i = this.f20503e.mo24676B();
        } else {
            i = 1;
        }
        int[] iArr = eVar2.f19022U.f19007b;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = eVar2.f19022U.f19008c;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            this.f20503e.mo24689c(i2);
            m27378a(j3, this.f20503e.f22333a, i2);
            j3 += (long) i2;
            this.f20503e.mo24693e(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = this.f20503e.mo24676B();
                iArr4[i3] = this.f20503e.mo24715z();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f20278a - ((int) (j3 - aVar2.f20279b));
        }
        C8925a aVar3 = aVar2.f20280c;
        C8874b bVar2 = eVar2.f19022U;
        bVar2.mo23216a(i, iArr2, iArr4, aVar3.f19172b, bVar2.f19006a, aVar3.f19171a, aVar3.f19173c, aVar3.f19174d);
        long j4 = aVar2.f20279b;
        int i4 = (int) (j3 - j4);
        aVar2.f20279b = j4 + ((long) i4);
        aVar2.f20278a -= i4;
    }

    /* renamed from: a */
    private void m27377a(long j, ByteBuffer byteBuffer, int i) {
        m27381b(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f20505g.f20515b - j));
            C9138a aVar = this.f20505g;
            byteBuffer.put(aVar.f20517d.f22091a, aVar.mo23771a(j), min);
            i -= min;
            j += (long) min;
            C9138a aVar2 = this.f20505g;
            if (j == aVar2.f20515b) {
                this.f20505g = aVar2.f20518e;
            }
        }
    }

    /* renamed from: a */
    private void m27378a(long j, byte[] bArr, int i) {
        m27381b(j);
        long j2 = j;
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f20505g.f20515b - j2));
            C9138a aVar = this.f20505g;
            System.arraycopy(aVar.f20517d.f22091a, aVar.mo23771a(j2), bArr, i - i2, min);
            i2 -= min;
            j2 += (long) min;
            C9138a aVar2 = this.f20505g;
            if (j2 == aVar2.f20515b) {
                this.f20505g = aVar2.f20518e;
            }
        }
    }

    /* renamed from: a */
    public void mo23752a(C9139b bVar) {
        this.f20513o = bVar;
    }

    /* renamed from: a */
    public void mo23751a(long j) {
        if (this.f20510l != j) {
            this.f20510l = j;
            this.f20508j = true;
        }
    }

    /* renamed from: a */
    public void mo23304a(Format format) {
        Format a = m27376a(format, this.f20510l);
        boolean a2 = this.f20501c.mo23590a(a);
        this.f20509k = format;
        this.f20508j = false;
        C9139b bVar = this.f20513o;
        if (bVar != null && a2) {
            bVar.mo23556a(a);
        }
    }

    /* renamed from: a */
    public int mo23302a(C8913h hVar, int i, boolean z) throws IOException, InterruptedException {
        int e = m27384e(i);
        C9138a aVar = this.f20506h;
        int read = hVar.read(aVar.f20517d.f22091a, aVar.mo23771a(this.f20511m), e);
        if (read != -1) {
            m27383d(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public void mo23305a(C9572w wVar, int i) {
        while (i > 0) {
            int e = m27384e(i);
            C9138a aVar = this.f20506h;
            wVar.mo24685a(aVar.f20517d.f22091a, aVar.mo23771a(this.f20511m), e);
            i -= e;
            m27383d(e);
        }
    }

    /* renamed from: a */
    public void mo23303a(long j, int i, int i2, int i3, C8925a aVar) {
        if (this.f20508j) {
            mo23304a(this.f20509k);
        }
        long j2 = j + this.f20510l;
        if (this.f20512n) {
            if ((i & 1) != 0 && this.f20501c.mo23589a(j2)) {
                this.f20512n = false;
            } else {
                return;
            }
        }
        int i4 = i2;
        this.f20501c.mo23587a(j2, i, (this.f20511m - ((long) i4)) - ((long) i3), i4, aVar);
    }

    /* renamed from: a */
    private void m27380a(C9138a aVar) {
        if (aVar.f20516c) {
            C9138a aVar2 = this.f20506h;
            boolean z = aVar2.f20516c;
            C9489e[] eVarArr = new C9489e[((z ? 1 : 0) + (((int) (aVar2.f20514a - aVar.f20514a)) / this.f20500b))];
            for (int i = 0; i < eVarArr.length; i++) {
                eVarArr[i] = aVar.f20517d;
                aVar = aVar.mo23772a();
            }
            this.f20499a.mo24559a(eVarArr);
        }
    }

    /* renamed from: a */
    private static Format m27376a(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0) {
            long j2 = format.f18354f0;
            if (j2 != Long.MAX_VALUE) {
                format = format.mo22606b(j2 + j);
            }
        }
        return format;
    }
}
