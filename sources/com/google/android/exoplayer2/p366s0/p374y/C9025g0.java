package com.google.android.exoplayer2.p366s0.p374y;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8899a.C8902c;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9030a;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9031b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9032c;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9571v;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.g0 */
/* compiled from: TsExtractor */
public final class C9025g0 implements C8912g {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final long f19834s = ((long) C9554k0.m29428b("AC-3"));
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final long f19835t = ((long) C9554k0.m29428b("EAC3"));
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final long f19836u = ((long) C9554k0.m29428b("AC-4"));
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final long f19837v = ((long) C9554k0.m29428b("HEVC"));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f19838a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C9545h0> f19839b;

    /* renamed from: c */
    private final C9572w f19840c;

    /* renamed from: d */
    private final SparseIntArray f19841d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9032c f19842e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SparseArray<C9029h0> f19843f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SparseBooleanArray f19844g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseBooleanArray f19845h;

    /* renamed from: i */
    private final C9023f0 f19846i;

    /* renamed from: j */
    private C9020e0 f19847j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8914i f19848k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f19849l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f19850m;

    /* renamed from: n */
    private boolean f19851n;

    /* renamed from: o */
    private boolean f19852o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C9029h0 f19853p;

    /* renamed from: q */
    private int f19854q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f19855r;

    /* renamed from: com.google.android.exoplayer2.s0.y.g0$a */
    /* compiled from: TsExtractor */
    private class C9026a implements C9012a0 {

        /* renamed from: a */
        private final C9571v f19856a = new C9571v(new byte[4]);

        public C9026a() {
        }

        /* renamed from: a */
        public void mo23423a(C9545h0 h0Var, C8914i iVar, C9033d dVar) {
        }

        /* renamed from: a */
        public void mo23424a(C9572w wVar) {
            if (wVar.mo24711v() == 0) {
                wVar.mo24695f(7);
                int a = wVar.mo24679a() / 4;
                for (int i = 0; i < a; i++) {
                    wVar.mo24682a(this.f19856a, 4);
                    int a2 = this.f19856a.mo24660a(16);
                    this.f19856a.mo24670c(3);
                    if (a2 == 0) {
                        this.f19856a.mo24670c(13);
                    } else {
                        int a3 = this.f19856a.mo24660a(13);
                        C9025g0.this.f19843f.put(a3, new C9014b0(new C9027b(a3)));
                        C9025g0.this.f19849l = C9025g0.this.f19849l + 1;
                    }
                }
                if (C9025g0.this.f19838a != 2) {
                    C9025g0.this.f19843f.remove(0);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.s0.y.g0$b */
    /* compiled from: TsExtractor */
    private class C9027b implements C9012a0 {

        /* renamed from: a */
        private final C9571v f19858a = new C9571v(new byte[5]);

        /* renamed from: b */
        private final SparseArray<C9029h0> f19859b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f19860c = new SparseIntArray();

        /* renamed from: d */
        private final int f19861d;

        public C9027b(int i) {
            this.f19861d = i;
        }

        /* renamed from: a */
        public void mo23423a(C9545h0 h0Var, C8914i iVar, C9033d dVar) {
        }

        /* renamed from: a */
        public void mo23424a(C9572w wVar) {
            C9545h0 h0Var;
            C9029h0 h0Var2;
            C9572w wVar2 = wVar;
            if (wVar.mo24711v() == 2) {
                int i = 0;
                if (C9025g0.this.f19838a == 1 || C9025g0.this.f19838a == 2 || C9025g0.this.f19849l == 1) {
                    h0Var = (C9545h0) C9025g0.this.f19839b.get(0);
                } else {
                    h0Var = new C9545h0(((C9545h0) C9025g0.this.f19839b.get(0)).mo24629a());
                    C9025g0.this.f19839b.add(h0Var);
                }
                wVar2.mo24695f(2);
                int B = wVar.mo24676B();
                int i2 = 3;
                wVar2.mo24695f(3);
                wVar2.mo24682a(this.f19858a, 2);
                this.f19858a.mo24670c(3);
                int i3 = 13;
                C9025g0.this.f19855r = this.f19858a.mo24660a(13);
                wVar2.mo24682a(this.f19858a, 2);
                int i4 = 4;
                this.f19858a.mo24670c(4);
                wVar2.mo24695f(this.f19858a.mo24660a(12));
                if (C9025g0.this.f19838a == 2 && C9025g0.this.f19853p == null) {
                    C9031b bVar = new C9031b(21, null, null, C9554k0.f22286f);
                    C9025g0 g0Var = C9025g0.this;
                    g0Var.f19853p = g0Var.f19842e.mo23440a(21, bVar);
                    C9025g0.this.f19853p.mo23426a(h0Var, C9025g0.this.f19848k, new C9033d(B, 21, ContentServiceClientExtras.URL_SIZE_LIMIT));
                }
                this.f19859b.clear();
                this.f19860c.clear();
                int a = wVar.mo24679a();
                while (a > 0) {
                    wVar2.mo24682a(this.f19858a, 5);
                    int a2 = this.f19858a.mo24660a(8);
                    this.f19858a.mo24670c(i2);
                    int a3 = this.f19858a.mo24660a(i3);
                    this.f19858a.mo24670c(i4);
                    int a4 = this.f19858a.mo24660a(12);
                    C9031b a5 = m26691a(wVar2, a4);
                    if (a2 == 6) {
                        a2 = a5.f19870a;
                    }
                    a -= a4 + 5;
                    int i5 = C9025g0.this.f19838a == 2 ? a2 : a3;
                    if (!C9025g0.this.f19844g.get(i5)) {
                        if (C9025g0.this.f19838a == 2 && a2 == 21) {
                            h0Var2 = C9025g0.this.f19853p;
                        } else {
                            h0Var2 = C9025g0.this.f19842e.mo23440a(a2, a5);
                        }
                        if (C9025g0.this.f19838a != 2 || a3 < this.f19860c.get(i5, ContentServiceClientExtras.URL_SIZE_LIMIT)) {
                            this.f19860c.put(i5, a3);
                            this.f19859b.put(i5, h0Var2);
                        }
                    }
                    i2 = 3;
                    i4 = 4;
                    i3 = 13;
                }
                int size = this.f19860c.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = this.f19860c.keyAt(i6);
                    int valueAt = this.f19860c.valueAt(i6);
                    C9025g0.this.f19844g.put(keyAt, true);
                    C9025g0.this.f19845h.put(valueAt, true);
                    C9029h0 h0Var3 = (C9029h0) this.f19859b.valueAt(i6);
                    if (h0Var3 != null) {
                        if (h0Var3 != C9025g0.this.f19853p) {
                            h0Var3.mo23426a(h0Var, C9025g0.this.f19848k, new C9033d(B, keyAt, ContentServiceClientExtras.URL_SIZE_LIMIT));
                        }
                        C9025g0.this.f19843f.put(valueAt, h0Var3);
                    }
                }
                if (C9025g0.this.f19838a != 2) {
                    C9025g0.this.f19843f.remove(this.f19861d);
                    C9025g0 g0Var2 = C9025g0.this;
                    if (g0Var2.f19838a != 1) {
                        i = C9025g0.this.f19849l - 1;
                    }
                    g0Var2.f19849l = i;
                    if (C9025g0.this.f19849l == 0) {
                        C9025g0.this.f19848k.mo23312a();
                        C9025g0.this.f19850m = true;
                    }
                } else if (!C9025g0.this.f19850m) {
                    C9025g0.this.f19848k.mo23312a();
                    C9025g0.this.f19849l = 0;
                    C9025g0.this.f19850m = true;
                }
            }
        }

        /* renamed from: a */
        private C9031b m26691a(C9572w wVar, int i) {
            int c = wVar.mo24688c();
            int i2 = i + c;
            String str = null;
            int i3 = -1;
            List list = null;
            while (wVar.mo24688c() < i2) {
                int v = wVar.mo24711v();
                int c2 = wVar.mo24688c() + wVar.mo24711v();
                if (v == 5) {
                    long x = wVar.mo24713x();
                    if (x != C9025g0.f19834s) {
                        if (x != C9025g0.f19835t) {
                            if (x != C9025g0.f19836u) {
                                if (x == C9025g0.f19837v) {
                                    i3 = 36;
                                }
                                wVar.mo24695f(c2 - wVar.mo24688c());
                            }
                        }
                        i3 = 135;
                        wVar.mo24695f(c2 - wVar.mo24688c());
                    }
                    i3 = 129;
                    wVar.mo24695f(c2 - wVar.mo24688c());
                } else {
                    if (v != 106) {
                        if (v != 122) {
                            if (v == 127) {
                                if (wVar.mo24711v() != 21) {
                                }
                            } else if (v == 123) {
                                i3 = 138;
                            } else if (v == 10) {
                                str = wVar.mo24687b(3).trim();
                            } else if (v == 89) {
                                ArrayList arrayList = new ArrayList();
                                while (wVar.mo24688c() < c2) {
                                    String trim = wVar.mo24687b(3).trim();
                                    int v2 = wVar.mo24711v();
                                    byte[] bArr = new byte[4];
                                    wVar.mo24685a(bArr, 0, 4);
                                    arrayList.add(new C9030a(trim, v2, bArr));
                                }
                                list = arrayList;
                                i3 = 89;
                            }
                            wVar.mo24695f(c2 - wVar.mo24688c());
                        }
                        i3 = 135;
                        wVar.mo24695f(c2 - wVar.mo24688c());
                    }
                    i3 = 129;
                    wVar.mo24695f(c2 - wVar.mo24688c());
                }
                i3 = 172;
                wVar.mo24695f(c2 - wVar.mo24688c());
            }
            wVar.mo24693e(i2);
            return new C9031b(i3, str, list, Arrays.copyOfRange(wVar.f22333a, c, i2));
        }
    }

    static {
        C9019e eVar = C9019e.f19805a;
    }

    public C9025g0() {
        this(0);
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    public C9025g0(int i) {
        this(1, i);
    }

    /* renamed from: f */
    private int m26675f() throws C8723g0 {
        int c = this.f19840c.mo24688c();
        int d = this.f19840c.mo24690d();
        int a = C9035i0.m26717a(this.f19840c.f22333a, c, d);
        this.f19840c.mo24693e(a);
        int i = a + 188;
        if (i > d) {
            this.f19854q += a - c;
            if (this.f19838a == 2 && this.f19854q > 376) {
                throw new C8723g0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f19854q = 0;
        }
        return i;
    }

    /* renamed from: g */
    static /* synthetic */ C8912g[] m26678g() {
        return new C8912g[]{new C9025g0()};
    }

    /* renamed from: h */
    private void m26680h() {
        this.f19844g.clear();
        this.f19843f.clear();
        SparseArray a = this.f19842e.mo23439a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f19843f.put(a.keyAt(i), a.valueAt(i));
        }
        this.f19843f.put(0, new C9014b0(new C9026a()));
        this.f19853p = null;
    }

    public C9025g0(int i, int i2) {
        this(i, new C9545h0(0), new C9039l(i2));
    }

    public C9025g0(int i, C9545h0 h0Var, C9032c cVar) {
        C9537e.m29296a(cVar);
        this.f19842e = cVar;
        this.f19838a = i;
        if (i == 1 || i == 2) {
            this.f19839b = Collections.singletonList(h0Var);
        } else {
            this.f19839b = new ArrayList();
            this.f19839b.add(h0Var);
        }
        this.f19840c = new C9572w(new byte[9400], 0);
        this.f19844g = new SparseBooleanArray();
        this.f19845h = new SparseBooleanArray();
        this.f19843f = new SparseArray<>();
        this.f19841d = new SparseIntArray();
        this.f19846i = new C9023f0();
        this.f19855r = -1;
        m26680h();
    }

    /* renamed from: b */
    private boolean m26668b(C8913h hVar) throws IOException, InterruptedException {
        C9572w wVar = this.f19840c;
        byte[] bArr = wVar.f22333a;
        if (9400 - wVar.mo24688c() < 188) {
            int a = this.f19840c.mo24679a();
            if (a > 0) {
                System.arraycopy(bArr, this.f19840c.mo24688c(), bArr, 0, a);
            }
            this.f19840c.mo24684a(bArr, a);
        }
        while (this.f19840c.mo24679a() < 188) {
            int d = this.f19840c.mo24690d();
            int read = hVar.read(bArr, d, 9400 - d);
            if (read == -1) {
                return false;
            }
            this.f19840c.mo24691d(d + read);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        boolean z;
        byte[] bArr = this.f19840c.f22333a;
        hVar.mo23294b(bArr, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                hVar.mo23298c(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f19848k = iVar;
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        C9537e.m29301b(this.f19838a != 2);
        int size = this.f19839b.size();
        for (int i = 0; i < size; i++) {
            C9545h0 h0Var = (C9545h0) this.f19839b.get(i);
            if ((h0Var.mo24633c() == -9223372036854775807L) || !(h0Var.mo24633c() == 0 || h0Var.mo24629a() == j2)) {
                h0Var.mo24635d();
                h0Var.mo24634c(j2);
            }
        }
        if (j2 != 0) {
            C9020e0 e0Var = this.f19847j;
            if (e0Var != null) {
                e0Var.mo23274b(j2);
            }
        }
        this.f19840c.mo24678D();
        this.f19841d.clear();
        for (int i2 = 0; i2 < this.f19843f.size(); i2++) {
            ((C9029h0) this.f19843f.valueAt(i2)).mo23425a();
        }
        this.f19854q = 0;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        C8919n nVar2 = nVar;
        long a = hVar.mo23287a();
        C9029h0 h0Var = null;
        if (this.f19850m) {
            if (((a == -1 || this.f19838a == 2) ? false : true) && !this.f19846i.mo23433c()) {
                return this.f19846i.mo23430a(hVar2, nVar2, this.f19855r);
            }
            m26662a(a);
            if (this.f19852o) {
                this.f19852o = false;
                mo23308a(0, 0);
                if (hVar.getPosition() != 0) {
                    nVar2.f19163a = 0;
                    return 1;
                }
            }
            C9020e0 e0Var = this.f19847j;
            if (e0Var != null && e0Var.mo23276b()) {
                return this.f19847j.mo23269a(hVar2, nVar2, (C8902c) null);
            }
        }
        if (!m26668b(hVar)) {
            return -1;
        }
        int f = m26675f();
        int d = this.f19840c.mo24690d();
        if (f > d) {
            return 0;
        }
        int i = this.f19840c.mo24698i();
        if ((8388608 & i) != 0) {
            this.f19840c.mo24693e(f);
            return 0;
        }
        int i2 = ((4194304 & i) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & i) >> 8;
        boolean z = (i & 32) != 0;
        if ((i & 16) != 0) {
            h0Var = (C9029h0) this.f19843f.get(i3);
        }
        if (h0Var == null) {
            this.f19840c.mo24693e(f);
            return 0;
        }
        if (this.f19838a != 2) {
            int i4 = i & 15;
            int i5 = this.f19841d.get(i3, i4 - 1);
            this.f19841d.put(i3, i4);
            if (i5 == i4) {
                this.f19840c.mo24693e(f);
                return 0;
            } else if (i4 != ((i5 + 1) & 15)) {
                h0Var.mo23425a();
            }
        }
        if (z) {
            i2 |= (this.f19840c.mo24711v() & 64) != 0 ? 2 : 0;
            this.f19840c.mo24695f(this.f19840c.mo24711v() - 1);
        }
        boolean z2 = this.f19850m;
        if (m26663a(i3)) {
            this.f19840c.mo24691d(f);
            h0Var.mo23427a(this.f19840c, i2);
            this.f19840c.mo24691d(d);
        }
        if (this.f19838a != 2 && !z2 && this.f19850m && a != -1) {
            this.f19852o = true;
        }
        this.f19840c.mo24693e(f);
        return 0;
    }

    /* renamed from: a */
    private void m26662a(long j) {
        if (!this.f19851n) {
            this.f19851n = true;
            if (this.f19846i.mo23431a() != -9223372036854775807L) {
                C9020e0 e0Var = new C9020e0(this.f19846i.mo23432b(), this.f19846i.mo23431a(), j, this.f19855r);
                this.f19847j = e0Var;
                this.f19848k.mo23313a(this.f19847j.mo23271a());
                return;
            }
            this.f19848k.mo23313a(new C8922b(this.f19846i.mo23431a()));
        }
    }

    /* renamed from: a */
    private boolean m26663a(int i) {
        if (this.f19838a == 2 || this.f19850m || !this.f19845h.get(i, false)) {
            return true;
        }
        return false;
    }
}
