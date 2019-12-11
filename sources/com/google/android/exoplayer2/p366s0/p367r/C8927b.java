package com.google.android.exoplayer2.p366s0.p367r;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8908c;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.r.b */
/* compiled from: AmrExtractor */
public final class C8927b implements C8912g {

    /* renamed from: p */
    private static final int[] f19176p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    private static final int[] f19177q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r */
    private static final byte[] f19178r = Util.m29447d("#!AMR\n");

    /* renamed from: s */
    private static final byte[] f19179s = Util.m29447d("#!AMR-WB\n");

    /* renamed from: t */
    private static final int f19180t = f19177q[8];

    /* renamed from: a */
    private final byte[] f19181a;

    /* renamed from: b */
    private final int f19182b;

    /* renamed from: c */
    private boolean f19183c;

    /* renamed from: d */
    private long f19184d;

    /* renamed from: e */
    private int f19185e;

    /* renamed from: f */
    private int f19186f;

    /* renamed from: g */
    private boolean f19187g;

    /* renamed from: h */
    private long f19188h;

    /* renamed from: i */
    private int f19189i;

    /* renamed from: j */
    private int f19190j;

    /* renamed from: k */
    private long f19191k;

    /* renamed from: l */
    private C8914i f19192l;

    /* renamed from: m */
    private C8924q f19193m;

    /* renamed from: n */
    private C8920o f19194n;

    /* renamed from: o */
    private boolean f19195o;

    static {
        C8926a aVar = C8926a.f19175a;
    }

    public C8927b() {
        this(0);
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26192b() {
        return new C8912g[]{new C8927b()};
    }

    /* renamed from: c */
    private boolean m26195c(C8913h hVar) throws IOException, InterruptedException {
        if (m26189a(hVar, f19178r)) {
            this.f19183c = false;
            hVar.mo23298c(f19178r.length);
            return true;
        } else if (!m26189a(hVar, f19179s)) {
            return false;
        } else {
            this.f19183c = true;
            hVar.mo23298c(f19179s.length);
            return true;
        }
    }

    /* renamed from: d */
    private int m26196d(C8913h hVar) throws IOException, InterruptedException {
        if (this.f19186f == 0) {
            try {
                this.f19185e = m26190b(hVar);
                this.f19186f = this.f19185e;
                if (this.f19189i == -1) {
                    this.f19188h = hVar.getPosition();
                    this.f19189i = this.f19185e;
                }
                if (this.f19189i == this.f19185e) {
                    this.f19190j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a = this.f19193m.mo23302a(hVar, this.f19186f, true);
        if (a == -1) {
            return -1;
        }
        this.f19186f -= a;
        if (this.f19186f > 0) {
            return 0;
        }
        this.f19193m.mo23303a(this.f19191k + this.f19184d, 1, this.f19185e, 0, null);
        this.f19184d += 20000;
        return 0;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return m26195c(hVar);
    }

    public C8927b(int i) {
        this.f19182b = i;
        this.f19181a = new byte[1];
        this.f19189i = -1;
    }

    /* renamed from: b */
    private int m26190b(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23297c();
        hVar.mo23294b(this.f19181a, 0, 1);
        byte b = this.f19181a[0];
        if ((b & 131) <= 0) {
            return m26185a((b >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid padding bits for frame header ");
        sb.append(b);
        throw new C8723g0(sb.toString());
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19192l = iVar;
        this.f19193m = iVar.mo23311a(0, 1);
        iVar.mo23312a();
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        if (hVar.getPosition() != 0 || m26195c(hVar)) {
            m26193c();
            int d = m26196d(hVar);
            m26188a(hVar.mo23287a(), d);
            return d;
        }
        throw new C8723g0("Could not find AMR header.");
    }

    /* renamed from: b */
    private boolean m26191b(int i) {
        return !this.f19183c && (i < 12 || i > 14);
    }

    /* renamed from: c */
    private void m26193c() {
        if (!this.f19195o) {
            this.f19195o = true;
            this.f19193m.mo23304a(Format.m24874a((String) null, this.f19183c ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, f19180t, 1, this.f19183c ? 16000 : 8000, -1, null, (DrmInitData) null, 0, (String) null));
        }
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19184d = 0;
        this.f19185e = 0;
        this.f19186f = 0;
        if (j != 0) {
            C8920o oVar = this.f19194n;
            if (oVar instanceof C8908c) {
                this.f19191k = ((C8908c) oVar).mo23286c(j);
                return;
            }
        }
        this.f19191k = 0;
    }

    /* renamed from: c */
    private boolean m26194c(int i) {
        return i >= 0 && i <= 15 && (m26197d(i) || m26191b(i));
    }

    /* renamed from: d */
    private boolean m26197d(int i) {
        return this.f19183c && (i < 10 || i > 13);
    }

    /* renamed from: a */
    private boolean m26189a(C8913h hVar, byte[] bArr) throws IOException, InterruptedException {
        hVar.mo23297c();
        byte[] bArr2 = new byte[bArr.length];
        hVar.mo23294b(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: a */
    private int m26185a(int i) throws C8723g0 {
        if (m26194c(i)) {
            return this.f19183c ? f19177q[i] : f19176p[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f19183c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new C8723g0(sb.toString());
    }

    /* renamed from: a */
    private void m26188a(long j, int i) {
        if (!this.f19187g) {
            if (!((this.f19182b & 1) == 0 || j == -1)) {
                int i2 = this.f19189i;
                if (i2 == -1 || i2 == this.f19185e) {
                    if (this.f19190j >= 20 || i == -1) {
                        this.f19194n = m26187a(j);
                        this.f19192l.mo23313a(this.f19194n);
                        this.f19187g = true;
                    }
                }
            }
            this.f19194n = new C8922b(-9223372036854775807L);
            this.f19192l.mo23313a(this.f19194n);
            this.f19187g = true;
        }
    }

    /* renamed from: a */
    private C8920o m26187a(long j) {
        long j2 = j;
        C8908c cVar = new C8908c(j2, this.f19188h, m26186a(this.f19189i, 20000), this.f19189i);
        return cVar;
    }

    /* renamed from: a */
    private static int m26186a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }
}
