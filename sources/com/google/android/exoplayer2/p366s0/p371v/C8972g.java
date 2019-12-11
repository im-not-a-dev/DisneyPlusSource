package com.google.android.exoplayer2.p366s0.p371v;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.metadata.p356g.C8746a;
import com.google.android.exoplayer2.metadata.p356g.C8749c;
import com.google.android.exoplayer2.p361p0.C8828h;
import com.google.android.exoplayer2.p366s0.C8907b;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p366s0.C8924q.C8925a;
import com.google.android.exoplayer2.p382u0.p383m.C9348g;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9545h0;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.C9568u;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.v.g */
/* compiled from: FragmentedMp4Extractor */
public class C8972g implements C8912g {

    /* renamed from: K */
    private static final int f19547K = Util.m29428b("seig");

    /* renamed from: L */
    private static final byte[] f19548L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M */
    private static final Format f19549M = Format.m24870a(null, "application/x-emsg", Long.MAX_VALUE);

    /* renamed from: A */
    private C8974b f19550A;

    /* renamed from: B */
    private int f19551B;

    /* renamed from: C */
    private int f19552C;

    /* renamed from: D */
    private int f19553D;

    /* renamed from: E */
    private boolean f19554E;

    /* renamed from: F */
    private boolean f19555F;

    /* renamed from: G */
    private C8914i f19556G;

    /* renamed from: H */
    private C8924q[] f19557H;

    /* renamed from: I */
    private C8924q[] f19558I;

    /* renamed from: J */
    private boolean f19559J;

    /* renamed from: a */
    private final int f19560a;

    /* renamed from: b */
    private final C8983m f19561b;

    /* renamed from: c */
    private final List<Format> f19562c;

    /* renamed from: d */
    private final DrmInitData f19563d;

    /* renamed from: e */
    private final SparseArray<C8974b> f19564e;

    /* renamed from: f */
    private final C9572w f19565f;

    /* renamed from: g */
    private final C9572w f19566g;

    /* renamed from: h */
    private final C9572w f19567h;

    /* renamed from: i */
    private final byte[] f19568i;

    /* renamed from: j */
    private final C9572w f19569j;

    /* renamed from: k */
    private final C9545h0 f19570k;

    /* renamed from: l */
    private final C8749c f19571l;

    /* renamed from: m */
    private final C9572w f19572m;

    /* renamed from: n */
    private final ArrayDeque<C8959a> f19573n;

    /* renamed from: o */
    private final ArrayDeque<C8973a> f19574o;

    /* renamed from: p */
    private final C8924q f19575p;

    /* renamed from: q */
    private int f19576q;

    /* renamed from: r */
    private int f19577r;

    /* renamed from: s */
    private long f19578s;

    /* renamed from: t */
    private int f19579t;

    /* renamed from: u */
    private C9572w f19580u;

    /* renamed from: v */
    private long f19581v;

    /* renamed from: w */
    private int f19582w;

    /* renamed from: x */
    private long f19583x;

    /* renamed from: y */
    private long f19584y;

    /* renamed from: z */
    private long f19585z;

    /* renamed from: com.google.android.exoplayer2.s0.v.g$a */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C8973a {

        /* renamed from: a */
        public final long f19586a;

        /* renamed from: b */
        public final int f19587b;

        public C8973a(long j, int i) {
            this.f19586a = j;
            this.f19587b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.v.g$b */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C8974b {

        /* renamed from: a */
        public final C8924q f19588a;

        /* renamed from: b */
        public final C8985o f19589b = new C8985o();

        /* renamed from: c */
        public C8983m f19590c;

        /* renamed from: d */
        public C8968e f19591d;

        /* renamed from: e */
        public int f19592e;

        /* renamed from: f */
        public int f19593f;

        /* renamed from: g */
        public int f19594g;

        /* renamed from: h */
        public int f19595h;

        /* renamed from: i */
        private final C9572w f19596i = new C9572w(1);

        /* renamed from: j */
        private final C9572w f19597j = new C9572w();

        public C8974b(C8924q qVar) {
            this.f19588a = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public C8984n m26444d() {
            C8985o oVar = this.f19589b;
            int i = oVar.f19678a.f19537a;
            C8984n nVar = oVar.f19692o;
            if (nVar == null) {
                nVar = this.f19590c.mo23385a(i);
            }
            if (nVar == null || !nVar.f19673a) {
                return null;
            }
            return nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m26445e() {
            C8984n d = m26444d();
            if (d != null) {
                C9572w wVar = this.f19589b.f19694q;
                int i = d.f19676d;
                if (i != 0) {
                    wVar.mo24695f(i);
                }
                if (this.f19589b.mo23392c(this.f19592e)) {
                    wVar.mo24695f(wVar.mo24676B() * 6);
                }
            }
        }

        /* renamed from: c */
        public void mo23377c() {
            this.f19589b.mo23387a();
            this.f19592e = 0;
            this.f19594g = 0;
            this.f19593f = 0;
            this.f19595h = 0;
        }

        /* renamed from: a */
        public void mo23374a(C8983m mVar, C8968e eVar) {
            Assertions.checkNotNull(mVar);
            this.f19590c = mVar;
            Assertions.checkNotNull(eVar);
            this.f19591d = eVar;
            this.f19588a.mo23304a(mVar.f19667f);
            mo23377c();
        }

        /* renamed from: b */
        public int mo23376b() {
            C9572w wVar;
            int i;
            C8984n d = m26444d();
            if (d == null) {
                return 0;
            }
            int i2 = d.f19676d;
            if (i2 != 0) {
                int i3 = i2;
                wVar = this.f19589b.f19694q;
                i = i3;
            } else {
                byte[] bArr = d.f19677e;
                this.f19597j.mo24684a(bArr, bArr.length);
                wVar = this.f19597j;
                i = bArr.length;
            }
            boolean c = this.f19589b.mo23392c(this.f19592e);
            this.f19596i.f22333a[0] = (byte) ((c ? 128 : 0) | i);
            this.f19596i.mo24693e(0);
            this.f19588a.mo23305a(this.f19596i, 1);
            this.f19588a.mo23305a(wVar, i);
            if (!c) {
                return i + 1;
            }
            C9572w wVar2 = this.f19589b.f19694q;
            int B = wVar2.mo24676B();
            wVar2.mo24695f(-2);
            int i4 = (B * 6) + 2;
            this.f19588a.mo23305a(wVar2, i4);
            return i + 1 + i4;
        }

        /* renamed from: a */
        public void mo23373a(DrmInitData drmInitData) {
            C8984n a = this.f19590c.mo23385a(this.f19589b.f19678a.f19537a);
            this.f19588a.mo23304a(this.f19590c.f19667f.mo22602a(drmInitData.mo22752a(a != null ? a.f19674b : null)));
        }

        /* renamed from: a */
        public void mo23372a(long j) {
            long b = C.usToMs(j);
            int i = this.f19592e;
            while (true) {
                C8985o oVar = this.f19589b;
                if (i < oVar.f19683f && oVar.mo23386a(i) < b) {
                    if (this.f19589b.f19689l[i]) {
                        this.f19595h = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public boolean mo23375a() {
            this.f19592e++;
            this.f19593f++;
            int i = this.f19593f;
            int[] iArr = this.f19589b.f19685h;
            int i2 = this.f19594g;
            if (i != iArr[i2]) {
                return true;
            }
            this.f19594g = i2 + 1;
            this.f19593f = 0;
            return false;
        }
    }

    static {
        C8956a aVar = C8956a.f19388a;
    }

    public C8972g() {
        this(0);
    }

    /* renamed from: b */
    private void m26421b() {
        this.f19576q = 0;
        this.f19579t = 0;
    }

    /* renamed from: c */
    static /* synthetic */ C8912g[] m26431c() {
        return new C8912g[]{new C8972g()};
    }

    /* renamed from: d */
    private void m26433d() {
        int i;
        if (this.f19557H == null) {
            this.f19557H = new C8924q[2];
            C8924q qVar = this.f19575p;
            if (qVar != null) {
                this.f19557H[0] = qVar;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f19560a & 4) != 0) {
                int i2 = i + 1;
                this.f19557H[i] = this.f19556G.mo23311a(this.f19564e.size(), 4);
                i = i2;
            }
            this.f19557H = (C8924q[]) Arrays.copyOf(this.f19557H, i);
            for (C8924q a : this.f19557H) {
                a.mo23304a(f19549M);
            }
        }
        if (this.f19558I == null) {
            this.f19558I = new C8924q[this.f19562c.size()];
            for (int i3 = 0; i3 < this.f19558I.length; i3++) {
                C8924q a2 = this.f19556G.mo23311a(this.f19564e.size() + 1 + i3, 3);
                a2.mo23304a((Format) this.f19562c.get(i3));
                this.f19558I[i3] = a2;
            }
        }
    }

    /* renamed from: e */
    private boolean m26435e(C8913h hVar) throws IOException, InterruptedException {
        C8925a aVar;
        boolean z;
        boolean z2;
        int i;
        C8913h hVar2 = hVar;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.f19576q == 3) {
            if (this.f19550A == null) {
                C8974b a = m26405a(this.f19564e);
                if (a == null) {
                    int position = (int) (this.f19581v - hVar.getPosition());
                    if (position >= 0) {
                        hVar2.mo23298c(position);
                        m26421b();
                        return false;
                    }
                    throw new C8723g0("Offset to end of mdat was negative.");
                }
                int position2 = (int) (a.f19589b.f19684g[a.f19594g] - hVar.getPosition());
                if (position2 < 0) {
                    Log.m29500d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                hVar2.mo23298c(position2);
                this.f19550A = a;
            }
            C8974b bVar = this.f19550A;
            int[] iArr = bVar.f19589b.f19686i;
            int i5 = bVar.f19592e;
            this.f19551B = iArr[i5];
            if (i5 < bVar.f19595h) {
                hVar2.mo23298c(this.f19551B);
                this.f19550A.m26445e();
                if (!this.f19550A.mo23375a()) {
                    this.f19550A = null;
                }
                this.f19576q = 3;
                return true;
            }
            if (bVar.f19590c.f19668g == 1) {
                this.f19551B -= 8;
                hVar2.mo23298c(8);
            }
            this.f19552C = this.f19550A.mo23376b();
            this.f19551B += this.f19552C;
            this.f19576q = 4;
            this.f19553D = 0;
            this.f19555F = "audio/ac4".equals(this.f19550A.f19590c.f19667f.f18349b0);
        }
        C8974b bVar2 = this.f19550A;
        C8985o oVar = bVar2.f19589b;
        C8983m mVar = bVar2.f19590c;
        C8924q qVar = bVar2.f19588a;
        int i6 = bVar2.f19592e;
        long a2 = oVar.mo23386a(i6) * 1000;
        C9545h0 h0Var = this.f19570k;
        if (h0Var != null) {
            a2 = h0Var.mo24630a(a2);
        }
        long j = a2;
        int i7 = mVar.f19671j;
        if (i7 == 0) {
            if (this.f19555F) {
                C8828h.m25610a(this.f19551B, this.f19569j);
                int d = this.f19569j.mo24690d();
                qVar.mo23305a(this.f19569j, d);
                this.f19551B += d;
                this.f19552C += d;
                z2 = false;
                this.f19555F = false;
            } else {
                z2 = false;
            }
            while (true) {
                int i8 = this.f19552C;
                int i9 = this.f19551B;
                if (i8 >= i9) {
                    break;
                }
                this.f19552C += qVar.mo23302a(hVar2, i9 - i8, z2);
            }
        } else {
            byte[] bArr = this.f19566g.f22333a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = i7 + 1;
            int i11 = 4 - i7;
            while (this.f19552C < this.f19551B) {
                int i12 = this.f19553D;
                if (i12 == 0) {
                    hVar2.mo23289a(bArr, i11, i10);
                    this.f19566g.mo24693e(i4);
                    int i13 = this.f19566g.mo24698i();
                    if (i13 >= i3) {
                        this.f19553D = i13 - 1;
                        this.f19565f.mo24693e(i4);
                        qVar.mo23305a(this.f19565f, i2);
                        qVar.mo23305a(this.f19566g, i3);
                        this.f19554E = this.f19558I.length > 0 && C9568u.m29526a(mVar.f19667f.f18349b0, bArr[i2]);
                        this.f19552C += 5;
                        this.f19551B += i11;
                    } else {
                        throw new C8723g0("Invalid NAL length");
                    }
                } else {
                    if (this.f19554E) {
                        this.f19567h.mo24689c(i12);
                        hVar2.mo23289a(this.f19567h.f22333a, i4, this.f19553D);
                        qVar.mo23305a(this.f19567h, this.f19553D);
                        i = this.f19553D;
                        C9572w wVar = this.f19567h;
                        int c = C9568u.m29529c(wVar.f22333a, wVar.mo24690d());
                        this.f19567h.mo24693e("video/hevc".equals(mVar.f19667f.f18349b0) ? 1 : 0);
                        this.f19567h.mo24691d(c);
                        C9348g.m28497a(j, this.f19567h, this.f19558I);
                    } else {
                        i = qVar.mo23302a(hVar2, i12, false);
                    }
                    this.f19552C += i;
                    this.f19553D -= i;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        }
        boolean z3 = oVar.f19689l[i6];
        C8984n b = this.f19550A.m26444d();
        if (b != null) {
            z = z3 | true;
            aVar = b.f19675c;
        } else {
            z = z3;
            aVar = null;
        }
        long j2 = j;
        qVar.mo23303a(j, z ? 1 : 0, this.f19551B, 0, aVar);
        m26407a(j2);
        if (!this.f19550A.mo23375a()) {
            this.f19550A = null;
        }
        this.f19576q = 3;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8983m mo23371a(C8983m mVar) {
        return mVar;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return C8982l.m26501a(hVar);
    }

    public C8972g(int i) {
        this(i, null);
    }

    /* renamed from: c */
    private void m26429c(C8913h hVar) throws IOException, InterruptedException {
        int i = ((int) this.f19578s) - this.f19579t;
        C9572w wVar = this.f19580u;
        if (wVar != null) {
            hVar.mo23289a(wVar.f22333a, 8, i);
            m26411a(new C8960b(this.f19577r, this.f19580u), hVar.getPosition());
        } else {
            hVar.mo23298c(i);
        }
        m26422b(hVar.getPosition());
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19556G = iVar;
        C8983m mVar = this.f19561b;
        if (mVar != null) {
            C8974b bVar = new C8974b(iVar.mo23311a(0, mVar.f19663b));
            bVar.mo23374a(this.f19561b, new C8968e(0, 0, 0, 0));
            this.f19564e.put(0, bVar);
            m26433d();
            this.f19556G.mo23312a();
        }
    }

    public C8972g(int i, C9545h0 h0Var) {
        this(i, h0Var, null, null);
    }

    /* renamed from: b */
    private boolean m26427b(C8913h hVar) throws IOException, InterruptedException {
        if (this.f19579t == 0) {
            if (!hVar.mo23291a(this.f19572m.f22333a, 0, 8, true)) {
                return false;
            }
            this.f19579t = 8;
            this.f19572m.mo24693e(0);
            this.f19578s = this.f19572m.mo24713x();
            this.f19577r = this.f19572m.mo24698i();
        }
        long j = this.f19578s;
        if (j == 1) {
            hVar.mo23289a(this.f19572m.f22333a, 8, 8);
            this.f19579t += 8;
            this.f19578s = this.f19572m.mo24675A();
        } else if (j == 0) {
            long a = hVar.mo23287a();
            if (a == -1 && !this.f19573n.isEmpty()) {
                a = ((C8959a) this.f19573n.peek()).f19500g1;
            }
            if (a != -1) {
                this.f19578s = (a - hVar.getPosition()) + ((long) this.f19579t);
            }
        }
        if (this.f19578s >= ((long) this.f19579t)) {
            long position = hVar.getPosition() - ((long) this.f19579t);
            if (this.f19577r == C8958c.f19438Y) {
                int size = this.f19564e.size();
                for (int i = 0; i < size; i++) {
                    C8985o oVar = ((C8974b) this.f19564e.valueAt(i)).f19589b;
                    oVar.f19679b = position;
                    oVar.f19681d = position;
                    oVar.f19680c = position;
                }
            }
            int i2 = this.f19577r;
            if (i2 == C8958c.f19489v) {
                this.f19550A = null;
                this.f19581v = this.f19578s + position;
                if (!this.f19559J) {
                    this.f19556G.mo23313a(new C8922b(this.f19584y, position));
                    this.f19559J = true;
                }
                this.f19576q = 2;
                return true;
            }
            if (m26418a(i2)) {
                long position2 = (hVar.getPosition() + this.f19578s) - 8;
                this.f19573n.push(new C8959a(this.f19577r, position2));
                if (this.f19578s == ((long) this.f19579t)) {
                    m26422b(position2);
                } else {
                    m26421b();
                }
            } else if (m26426b(this.f19577r)) {
                if (this.f19579t == 8) {
                    long j2 = this.f19578s;
                    if (j2 <= 2147483647L) {
                        this.f19580u = new C9572w((int) j2);
                        System.arraycopy(this.f19572m.f22333a, 0, this.f19580u.f22333a, 0, 8);
                        this.f19576q = 1;
                    } else {
                        throw new C8723g0("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C8723g0("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f19578s <= 2147483647L) {
                this.f19580u = null;
                this.f19576q = 1;
            } else {
                throw new C8723g0("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new C8723g0("Atom size less than header length (unsupported).");
    }

    public C8972g(int i, C9545h0 h0Var, C8983m mVar, DrmInitData drmInitData) {
        this(i, h0Var, mVar, drmInitData, Collections.emptyList());
    }

    public C8972g(int i, C9545h0 h0Var, C8983m mVar, DrmInitData drmInitData, List<Format> list) {
        this(i, h0Var, mVar, drmInitData, list, null);
    }

    public C8972g(int i, C9545h0 h0Var, C8983m mVar, DrmInitData drmInitData, List<Format> list, C8924q qVar) {
        this.f19560a = i | (mVar != null ? 8 : 0);
        this.f19570k = h0Var;
        this.f19561b = mVar;
        this.f19563d = drmInitData;
        this.f19562c = Collections.unmodifiableList(list);
        this.f19575p = qVar;
        this.f19571l = new C8749c();
        this.f19572m = new C9572w(16);
        this.f19565f = new C9572w(C9568u.f22309a);
        this.f19566g = new C9572w(5);
        this.f19567h = new C9572w();
        this.f19568i = new byte[16];
        this.f19569j = new C9572w(this.f19568i);
        this.f19573n = new ArrayDeque<>();
        this.f19574o = new ArrayDeque<>();
        this.f19564e = new SparseArray<>();
        this.f19584y = -9223372036854775807L;
        this.f19583x = -9223372036854775807L;
        this.f19585z = -9223372036854775807L;
        m26421b();
    }

    /* renamed from: c */
    private void m26430c(C8959a aVar) throws C8723g0 {
        int i;
        int i2;
        C8959a aVar2 = aVar;
        boolean z = true;
        int i3 = 0;
        Assertions.m29302b(this.f19561b == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.f19563d;
        if (drmInitData == null) {
            drmInitData = m26403a(aVar2.f19501h1);
        }
        C8959a d = aVar2.mo23365d(C8958c.f19442a0);
        SparseArray sparseArray = new SparseArray();
        int size = d.f19501h1.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            C8960b bVar = (C8960b) d.f19501h1.get(i4);
            int i5 = bVar.f19499a;
            if (i5 == C8958c.f19418O) {
                Pair d2 = m26432d(bVar.f19503g1);
                sparseArray.put(((Integer) d2.first).intValue(), d2.second);
            } else if (i5 == C8958c.f19445b0) {
                j = m26419b(bVar.f19503g1);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.f19502i1.size();
        int i6 = 0;
        while (i6 < size2) {
            C8959a aVar3 = (C8959a) aVar2.f19502i1.get(i6);
            if (aVar3.f19499a == C8958c.f19428T) {
                i = i6;
                i2 = size2;
                C8983m a = C8961d.m26369a(aVar3, aVar2.mo23366e(C8958c.f19426S), j, drmInitData, (this.f19560a & 16) != 0, false);
                mo23371a(a);
                if (a != null) {
                    sparseArray2.put(a.f19662a, a);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.f19564e.size() == 0) {
            while (i3 < size3) {
                C8983m mVar = (C8983m) sparseArray2.valueAt(i3);
                C8974b bVar2 = new C8974b(this.f19556G.mo23311a(i3, mVar.f19663b));
                bVar2.mo23374a(mVar, m26404a(sparseArray, mVar.f19662a));
                this.f19564e.put(mVar.f19662a, bVar2);
                this.f19584y = Math.max(this.f19584y, mVar.f19666e);
                i3++;
            }
            m26433d();
            this.f19556G.mo23312a();
            return;
        }
        if (this.f19564e.size() != size3) {
            z = false;
        }
        Assertions.checkState(z);
        while (i3 < size3) {
            C8983m mVar2 = (C8983m) sparseArray2.valueAt(i3);
            ((C8974b) this.f19564e.get(mVar2.f19662a)).mo23374a(mVar2, m26404a(sparseArray, mVar2.f19662a));
            i3++;
        }
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        int size = this.f19564e.size();
        for (int i = 0; i < size; i++) {
            ((C8974b) this.f19564e.valueAt(i)).mo23377c();
        }
        this.f19574o.clear();
        this.f19582w = 0;
        this.f19583x = j2;
        this.f19573n.clear();
        this.f19555F = false;
        m26421b();
    }

    /* renamed from: d */
    private static Pair<Integer, C8968e> m26432d(C9572w wVar) {
        wVar.mo24693e(12);
        return Pair.create(Integer.valueOf(wVar.mo24698i()), new C8968e(wVar.mo24715z() - 1, wVar.mo24715z(), wVar.mo24715z(), wVar.mo24698i()));
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f19576q;
            if (i != 0) {
                if (i == 1) {
                    m26429c(hVar);
                } else if (i == 2) {
                    m26434d(hVar);
                } else if (m26435e(hVar)) {
                    return 0;
                }
            } else if (!m26427b(hVar)) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    private void m26411a(C8960b bVar, long j) throws C8723g0 {
        if (!this.f19573n.isEmpty()) {
            ((C8959a) this.f19573n.peek()).mo23364a(bVar);
            return;
        }
        int i = bVar.f19499a;
        if (i == C8958c.f19422Q) {
            Pair a = m26402a(bVar.f19503g1, j);
            this.f19585z = ((Long) a.first).longValue();
            this.f19556G.mo23313a((C8920o) a.second);
            this.f19559J = true;
        } else if (i == C8958c.f19431U0) {
            m26413a(bVar.f19503g1);
        }
    }

    /* renamed from: d */
    private void m26434d(C8913h hVar) throws IOException, InterruptedException {
        int size = this.f19564e.size();
        C8974b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C8985o oVar = ((C8974b) this.f19564e.valueAt(i)).f19589b;
            if (oVar.f19695r) {
                long j2 = oVar.f19681d;
                if (j2 < j) {
                    bVar = (C8974b) this.f19564e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f19576q = 3;
            return;
        }
        int position = (int) (j - hVar.getPosition());
        if (position >= 0) {
            hVar.mo23298c(position);
            bVar.f19589b.mo23389a(hVar);
            return;
        }
        throw new C8723g0("Offset to encryption data was negative.");
    }

    /* renamed from: a */
    private void m26408a(C8959a aVar) throws C8723g0 {
        int i = aVar.f19499a;
        if (i == C8958c.f19424R) {
            m26430c(aVar);
        } else if (i == C8958c.f19438Y) {
            m26423b(aVar);
        } else if (!this.f19573n.isEmpty()) {
            ((C8959a) this.f19573n.peek()).mo23363a(aVar);
        }
    }

    /* renamed from: a */
    private C8968e m26404a(SparseArray<C8968e> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C8968e) sparseArray.valueAt(0);
        }
        Object obj = sparseArray.get(i);
        Assertions.checkNotNull(obj);
        return (C8968e) obj;
    }

    /* renamed from: a */
    private void m26413a(C9572w wVar) {
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        C8924q[] qVarArr;
        C9572w wVar2 = wVar;
        C8924q[] qVarArr2 = this.f19557H;
        if (!(qVarArr2 == null || qVarArr2.length == 0)) {
            wVar2.mo24693e(8);
            int c = C8958c.m26357c(wVar.mo24698i());
            if (c == 0) {
                String s = wVar.mo24708s();
                Assertions.checkNotNull(s);
                String str3 = s;
                String s2 = wVar.mo24708s();
                Assertions.checkNotNull(s2);
                String str4 = s2;
                long x = wVar.mo24713x();
                j4 = Util.m29439c(wVar.mo24713x(), 1000000, x);
                long j5 = this.f19585z;
                long j6 = j5 != -9223372036854775807L ? j5 + j4 : -9223372036854775807L;
                str2 = str3;
                j2 = Util.m29439c(wVar.mo24713x(), 1000, x);
                str = str4;
                j = wVar.mo24713x();
                j3 = j6;
            } else if (c != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping unsupported emsg version: ");
                sb.append(c);
                Log.m29500d("FragmentedMp4Extractor", sb.toString());
                return;
            } else {
                long x2 = wVar.mo24713x();
                j3 = Util.m29439c(wVar.mo24675A(), 1000000, x2);
                long c2 = Util.m29439c(wVar.mo24713x(), 1000, x2);
                long x3 = wVar.mo24713x();
                String s3 = wVar.mo24708s();
                Assertions.checkNotNull(s3);
                String str5 = s3;
                String s4 = wVar.mo24708s();
                Assertions.checkNotNull(s4);
                str2 = str5;
                j2 = c2;
                j = x3;
                str = s4;
                j4 = -9223372036854775807L;
            }
            byte[] bArr = new byte[wVar.mo24679a()];
            wVar2.mo24685a(bArr, 0, wVar.mo24679a());
            C8746a aVar = new C8746a(str2, str, j2, j, bArr);
            C9572w wVar3 = new C9572w(this.f19571l.mo22890a(aVar));
            int a = wVar3.mo24679a();
            for (C8924q qVar : this.f19557H) {
                wVar3.mo24693e(0);
                qVar.mo23305a(wVar3, a);
            }
            if (j3 == -9223372036854775807L) {
                this.f19574o.addLast(new C8973a(j4, a));
                this.f19582w += a;
            } else {
                C9545h0 h0Var = this.f19570k;
                if (h0Var != null) {
                    j3 = h0Var.mo24630a(j3);
                }
                for (C8924q a2 : this.f19557H) {
                    a2.mo23303a(j3, 1, a, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    private static long m26428c(C9572w wVar) {
        wVar.mo24693e(8);
        return C8958c.m26357c(wVar.mo24698i()) == 1 ? wVar.mo24675A() : wVar.mo24713x();
    }

    /* renamed from: b */
    private void m26422b(long j) throws C8723g0 {
        while (!this.f19573n.isEmpty() && ((C8959a) this.f19573n.peek()).f19500g1 == j) {
            m26408a((C8959a) this.f19573n.pop());
        }
        m26421b();
    }

    /* renamed from: b */
    private void m26423b(C8959a aVar) throws C8723g0 {
        DrmInitData drmInitData;
        m26409a(aVar, this.f19564e, this.f19560a, this.f19568i);
        if (this.f19563d != null) {
            drmInitData = null;
        } else {
            drmInitData = m26403a(aVar.f19501h1);
        }
        if (drmInitData != null) {
            int size = this.f19564e.size();
            for (int i = 0; i < size; i++) {
                ((C8974b) this.f19564e.valueAt(i)).mo23373a(drmInitData);
            }
        }
        if (this.f19583x != -9223372036854775807L) {
            int size2 = this.f19564e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C8974b) this.f19564e.valueAt(i2)).mo23372a(this.f19583x);
            }
            this.f19583x = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    private static long m26419b(C9572w wVar) {
        wVar.mo24693e(8);
        return C8958c.m26357c(wVar.mo24698i()) == 0 ? wVar.mo24713x() : wVar.mo24675A();
    }

    /* renamed from: b */
    private static void m26424b(C8959a aVar, SparseArray<C8974b> sparseArray, int i, byte[] bArr) throws C8723g0 {
        C8974b a = m26406a(aVar.mo23366e(C8958c.f19416N).f19503g1, sparseArray);
        if (a != null) {
            C8985o oVar = a.f19589b;
            long j = oVar.f19696s;
            a.mo23377c();
            if (aVar.mo23366e(C8958c.f19414M) != null && (i & 2) == 0) {
                j = m26428c(aVar.mo23366e(C8958c.f19414M).f19503g1);
            }
            m26410a(aVar, a, j, i);
            C8984n a2 = a.f19590c.mo23385a(oVar.f19678a.f19537a);
            C8960b e = aVar.mo23366e(C8958c.f19480q0);
            if (e != null) {
                m26412a(a2, e.f19503g1, oVar);
            }
            C8960b e2 = aVar.mo23366e(C8958c.f19482r0);
            if (e2 != null) {
                m26415a(e2.f19503g1, oVar);
            }
            C8960b e3 = aVar.mo23366e(C8958c.f19490v0);
            if (e3 != null) {
                m26425b(e3.f19503g1, oVar);
            }
            C8960b e4 = aVar.mo23366e(C8958c.f19484s0);
            C8960b e5 = aVar.mo23366e(C8958c.f19486t0);
            if (!(e4 == null || e5 == null)) {
                m26417a(e4.f19503g1, e5.f19503g1, a2 != null ? a2.f19674b : null, oVar);
            }
            int size = aVar.f19501h1.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8960b bVar = (C8960b) aVar.f19501h1.get(i2);
                if (bVar.f19499a == C8958c.f19488u0) {
                    m26416a(bVar.f19503g1, oVar, bArr);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m26409a(C8959a aVar, SparseArray<C8974b> sparseArray, int i, byte[] bArr) throws C8723g0 {
        int size = aVar.f19502i1.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8959a aVar2 = (C8959a) aVar.f19502i1.get(i2);
            if (aVar2.f19499a == C8958c.f19440Z) {
                m26424b(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: a */
    private static void m26410a(C8959a aVar, C8974b bVar, long j, int i) {
        List<C8960b> list = aVar.f19501h1;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C8960b bVar2 = (C8960b) list.get(i4);
            if (bVar2.f19499a == C8958c.f19420P) {
                C9572w wVar = bVar2.f19503g1;
                wVar.mo24693e(12);
                int z = wVar.mo24715z();
                if (z > 0) {
                    i3 += z;
                    i2++;
                }
            }
        }
        bVar.f19594g = 0;
        bVar.f19593f = 0;
        bVar.f19592e = 0;
        bVar.f19589b.mo23388a(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C8960b bVar3 = (C8960b) list.get(i7);
            if (bVar3.f19499a == C8958c.f19420P) {
                int i8 = i5 + 1;
                i6 = m26401a(bVar, i5, j, i, bVar3.f19503g1, i6);
                i5 = i8;
            }
        }
    }

    /* renamed from: b */
    private static C8974b m26420b(SparseArray<C8974b> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C8974b) sparseArray.valueAt(0);
        }
        return (C8974b) sparseArray.get(i);
    }

    /* renamed from: a */
    private static void m26412a(C8984n nVar, C9572w wVar, C8985o oVar) throws C8723g0 {
        int i;
        int i2 = nVar.f19676d;
        wVar.mo24693e(8);
        boolean z = true;
        if ((C8958c.m26356b(wVar.mo24698i()) & 1) == 1) {
            wVar.mo24695f(8);
        }
        int v = wVar.mo24711v();
        int z2 = wVar.mo24715z();
        if (z2 == oVar.f19683f) {
            if (v == 0) {
                boolean[] zArr = oVar.f19691n;
                i = 0;
                for (int i3 = 0; i3 < z2; i3++) {
                    int v2 = wVar.mo24711v();
                    i += v2;
                    zArr[i3] = v2 > i2;
                }
            } else {
                if (v <= i2) {
                    z = false;
                }
                i = (v * z2) + 0;
                Arrays.fill(oVar.f19691n, 0, z2, z);
            }
            oVar.mo23391b(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Length mismatch: ");
        sb.append(z2);
        sb.append(", ");
        sb.append(oVar.f19683f);
        throw new C8723g0(sb.toString());
    }

    /* renamed from: b */
    private static void m26425b(C9572w wVar, C8985o oVar) throws C8723g0 {
        m26414a(wVar, 0, oVar);
    }

    /* renamed from: b */
    private static boolean m26426b(int i) {
        return i == C8958c.f19460g0 || i == C8958c.f19457f0 || i == C8958c.f19426S || i == C8958c.f19422Q || i == C8958c.f19462h0 || i == C8958c.f19414M || i == C8958c.f19416N || i == C8958c.f19448c0 || i == C8958c.f19418O || i == C8958c.f19420P || i == C8958c.f19464i0 || i == C8958c.f19480q0 || i == C8958c.f19482r0 || i == C8958c.f19490v0 || i == C8958c.f19488u0 || i == C8958c.f19484s0 || i == C8958c.f19486t0 || i == C8958c.f19454e0 || i == C8958c.f19445b0 || i == C8958c.f19431U0;
    }

    /* renamed from: a */
    private static void m26415a(C9572w wVar, C8985o oVar) throws C8723g0 {
        wVar.mo24693e(8);
        int i = wVar.mo24698i();
        if ((C8958c.m26356b(i) & 1) == 1) {
            wVar.mo24695f(8);
        }
        int z = wVar.mo24715z();
        if (z == 1) {
            oVar.f19681d += C8958c.m26357c(i) == 0 ? wVar.mo24713x() : wVar.mo24675A();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected saio entry count: ");
        sb.append(z);
        throw new C8723g0(sb.toString());
    }

    /* renamed from: a */
    private static C8974b m26406a(C9572w wVar, SparseArray<C8974b> sparseArray) {
        wVar.mo24693e(8);
        int b = C8958c.m26356b(wVar.mo24698i());
        C8974b b2 = m26420b(sparseArray, wVar.mo24698i());
        if (b2 == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long A = wVar.mo24675A();
            C8985o oVar = b2.f19589b;
            oVar.f19680c = A;
            oVar.f19681d = A;
        }
        C8968e eVar = b2.f19591d;
        b2.f19589b.f19678a = new C8968e((b & 2) != 0 ? wVar.mo24715z() - 1 : eVar.f19537a, (b & 8) != 0 ? wVar.mo24715z() : eVar.f19538b, (b & 16) != 0 ? wVar.mo24715z() : eVar.f19539c, (b & 32) != 0 ? wVar.mo24715z() : eVar.f19540d);
        return b2;
    }

    /* renamed from: a */
    private static int m26401a(C8974b bVar, int i, long j, int i2, C9572w wVar, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        C8974b bVar2 = bVar;
        wVar.mo24693e(8);
        int b = C8958c.m26356b(wVar.mo24698i());
        C8983m mVar = bVar2.f19590c;
        C8985o oVar = bVar2.f19589b;
        C8968e eVar = oVar.f19678a;
        oVar.f19685h[i] = wVar.mo24715z();
        long[] jArr = oVar.f19684g;
        jArr[i] = oVar.f19680c;
        if ((b & 1) != 0) {
            jArr[i] = jArr[i] + ((long) wVar.mo24698i());
        }
        boolean z6 = (b & 4) != 0;
        int i6 = eVar.f19540d;
        if (z6) {
            i6 = wVar.mo24715z();
        }
        boolean z7 = (b & 256) != 0;
        boolean z8 = (b & DateUtils.FORMAT_NO_NOON) != 0;
        boolean z9 = (b & 1024) != 0;
        boolean z10 = (b & DateUtils.FORMAT_NO_MIDNIGHT) != 0;
        long[] jArr2 = mVar.f19669h;
        long j2 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j2 = Util.m29439c(mVar.f19670i[0], 1000, mVar.f19664c);
        }
        int[] iArr = oVar.f19686i;
        int[] iArr2 = oVar.f19687j;
        long[] jArr3 = oVar.f19688k;
        boolean[] zArr = oVar.f19689l;
        int i7 = i6;
        boolean z11 = mVar.f19663b == 2 && (i2 & 1) != 0;
        int i8 = i3 + oVar.f19685h[i];
        long j3 = j2;
        boolean[] zArr2 = zArr;
        long j4 = mVar.f19664c;
        boolean[] zArr3 = zArr2;
        long[] jArr4 = jArr3;
        long j5 = i > 0 ? oVar.f19696s : j;
        int i9 = i3;
        while (i9 < i8) {
            int z12 = z7 ? wVar.mo24715z() : eVar.f19538b;
            if (z8) {
                z = z7;
                i4 = wVar.mo24715z();
            } else {
                z = z7;
                i4 = eVar.f19539c;
            }
            if (i9 == 0 && z6) {
                z2 = z6;
                i5 = i7;
            } else if (z9) {
                z2 = z6;
                i5 = wVar.mo24698i();
            } else {
                z2 = z6;
                i5 = eVar.f19540d;
            }
            if (z10) {
                z5 = z10;
                z4 = z8;
                z3 = z9;
                iArr2[i9] = (int) ((((long) wVar.mo24698i()) * 1000) / j4);
            } else {
                z5 = z10;
                z4 = z8;
                z3 = z9;
                iArr2[i9] = 0;
            }
            jArr4[i9] = Util.m29439c(j5, 1000, j4) - j3;
            iArr[i9] = i4;
            zArr3[i9] = ((i5 >> 16) & 1) == 0 && (!z11 || i9 == 0);
            i9++;
            j5 += (long) z12;
            z7 = z;
            z6 = z2;
            z10 = z5;
            z8 = z4;
            z9 = z3;
            i8 = i8;
        }
        int i10 = i8;
        oVar.f19696s = j5;
        return i10;
    }

    /* renamed from: a */
    private static void m26416a(C9572w wVar, C8985o oVar, byte[] bArr) throws C8723g0 {
        wVar.mo24693e(8);
        wVar.mo24685a(bArr, 0, 16);
        if (Arrays.equals(bArr, f19548L)) {
            m26414a(wVar, 16, oVar);
        }
    }

    /* renamed from: a */
    private static void m26414a(C9572w wVar, int i, C8985o oVar) throws C8723g0 {
        wVar.mo24693e(i + 8);
        int b = C8958c.m26356b(wVar.mo24698i());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int z2 = wVar.mo24715z();
            if (z2 == oVar.f19683f) {
                Arrays.fill(oVar.f19691n, 0, z2, z);
                oVar.mo23391b(wVar.mo24679a());
                oVar.mo23390a(wVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Length mismatch: ");
            sb.append(z2);
            sb.append(", ");
            sb.append(oVar.f19683f);
            throw new C8723g0(sb.toString());
        }
        throw new C8723g0("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: a */
    private static void m26417a(C9572w wVar, C9572w wVar2, String str, C8985o oVar) throws C8723g0 {
        byte[] bArr;
        wVar.mo24693e(8);
        int i = wVar.mo24698i();
        if (wVar.mo24698i() == f19547K) {
            if (C8958c.m26357c(i) == 1) {
                wVar.mo24695f(4);
            }
            if (wVar.mo24698i() == 1) {
                wVar2.mo24693e(8);
                int i2 = wVar2.mo24698i();
                if (wVar2.mo24698i() == f19547K) {
                    int c = C8958c.m26357c(i2);
                    if (c == 1) {
                        if (wVar2.mo24713x() == 0) {
                            throw new C8723g0("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c >= 2) {
                        wVar2.mo24695f(4);
                    }
                    if (wVar2.mo24713x() == 1) {
                        wVar2.mo24695f(1);
                        int v = wVar2.mo24711v();
                        int i3 = (v & 240) >> 4;
                        int i4 = v & 15;
                        boolean z = wVar2.mo24711v() == 1;
                        if (z) {
                            int v2 = wVar2.mo24711v();
                            byte[] bArr2 = new byte[16];
                            wVar2.mo24685a(bArr2, 0, bArr2.length);
                            if (v2 == 0) {
                                int v3 = wVar2.mo24711v();
                                byte[] bArr3 = new byte[v3];
                                wVar2.mo24685a(bArr3, 0, v3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            oVar.f19690m = true;
                            C8984n nVar = new C8984n(z, str, v2, bArr2, i3, i4, bArr);
                            oVar.f19692o = nVar;
                            return;
                        }
                        return;
                    }
                    throw new C8723g0("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new C8723g0("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: a */
    private static Pair<Long, C8907b> m26402a(C9572w wVar, long j) throws C8723g0 {
        long j2;
        long j3;
        C9572w wVar2 = wVar;
        wVar2.mo24693e(8);
        int c = C8958c.m26357c(wVar.mo24698i());
        wVar2.mo24695f(4);
        long x = wVar.mo24713x();
        if (c == 0) {
            j3 = wVar.mo24713x();
            j2 = wVar.mo24713x();
        } else {
            j3 = wVar.mo24675A();
            j2 = wVar.mo24675A();
        }
        long j4 = j3;
        long j5 = j + j2;
        long c2 = Util.m29439c(j4, 1000000, x);
        wVar2.mo24695f(2);
        int B = wVar.mo24676B();
        int[] iArr = new int[B];
        long[] jArr = new long[B];
        long[] jArr2 = new long[B];
        long[] jArr3 = new long[B];
        long j6 = j4;
        long j7 = c2;
        int i = 0;
        while (i < B) {
            int i2 = wVar.mo24698i();
            if ((i2 & Integer.MIN_VALUE) == 0) {
                long x2 = wVar.mo24713x();
                iArr[i] = i2 & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j7;
                j6 += x2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = B;
                int[] iArr2 = iArr;
                long[] jArr6 = jArr;
                j7 = Util.m29439c(j6, 1000000, x);
                jArr4[i] = j7 - jArr5[i];
                wVar2.mo24695f(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr6;
                B = i3;
            } else {
                throw new C8723g0("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(c2), new C8907b(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: a */
    private void m26407a(long j) {
        while (!this.f19574o.isEmpty()) {
            C8973a aVar = (C8973a) this.f19574o.removeFirst();
            this.f19582w -= aVar.f19587b;
            long j2 = aVar.f19586a + j;
            C9545h0 h0Var = this.f19570k;
            if (h0Var != null) {
                j2 = h0Var.mo24630a(j2);
            }
            for (C8924q a : this.f19557H) {
                a.mo23303a(j2, 1, aVar.f19587b, this.f19582w, null);
            }
        }
    }

    /* renamed from: a */
    private static C8974b m26405a(SparseArray<C8974b> sparseArray) {
        int size = sparseArray.size();
        C8974b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C8974b bVar2 = (C8974b) sparseArray.valueAt(i);
            int i2 = bVar2.f19594g;
            C8985o oVar = bVar2.f19589b;
            if (i2 != oVar.f19682e) {
                long j2 = oVar.f19684g[i2];
                if (j2 < j) {
                    bVar = bVar2;
                    j = j2;
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static DrmInitData m26403a(List<C8960b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C8960b bVar = (C8960b) list.get(i);
            if (bVar.f19499a == C8958c.f19464i0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f19503g1.f22333a;
                UUID c = C8980k.m26495c(bArr);
                if (c == null) {
                    Log.m29500d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new SchemeData(c, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<SchemeData>) arrayList);
    }

    /* renamed from: a */
    private static boolean m26418a(int i) {
        return i == C8958c.f19424R || i == C8958c.f19428T || i == C8958c.f19430U || i == C8958c.f19432V || i == C8958c.f19434W || i == C8958c.f19438Y || i == C8958c.f19440Z || i == C8958c.f19442a0 || i == C8958c.f19451d0;
    }
}
