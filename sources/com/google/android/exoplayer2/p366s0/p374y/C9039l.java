package com.google.android.exoplayer2.p366s0.p374y;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9031b;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9032c;
import com.google.android.exoplayer2.p382u0.p383m.C9342d;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.y.l */
/* compiled from: DefaultTsPayloadReaderFactory */
public final class C9039l implements C9032c {

    /* renamed from: a */
    private final int f19930a;

    /* renamed from: b */
    private final List<Format> f19931b;

    public C9039l(int i) {
        this(i, Collections.singletonList(Format.m24868a(null, "application/cea-608", 0, null)));
    }

    /* renamed from: b */
    private C9037j0 m26757b(C9031b bVar) {
        return new C9037j0(m26758c(bVar));
    }

    /* renamed from: c */
    private List<Format> m26758c(C9031b bVar) {
        int i;
        String str;
        List list;
        if (m26756a(32)) {
            return this.f19931b;
        }
        C9572w wVar = new C9572w(bVar.f19873d);
        List<Format> list2 = this.f19931b;
        while (wVar.mo24679a() > 0) {
            int c = wVar.mo24688c() + wVar.mo24711v();
            if (wVar.mo24711v() == 134) {
                list2 = new ArrayList<>();
                int v = wVar.mo24711v() & 31;
                for (int i2 = 0; i2 < v; i2++) {
                    String b = wVar.mo24687b(3);
                    int v2 = wVar.mo24711v();
                    boolean z = true;
                    boolean z2 = (v2 & 128) != 0;
                    if (z2) {
                        i = v2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v3 = (byte) wVar.mo24711v();
                    wVar.mo24695f(1);
                    if (z2) {
                        if ((v3 & 64) == 0) {
                            z = false;
                        }
                        list = C9342d.m28475a(z);
                    } else {
                        list = null;
                    }
                    list2.add(Format.m24876a((String) null, str, (String) null, -1, 0, b, i, (DrmInitData) null, Long.MAX_VALUE, list));
                }
            }
            wVar.mo24693e(c);
        }
        return list2;
    }

    /* renamed from: a */
    public SparseArray<C9029h0> mo23439a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C9029h0 mo23440a(int i, C9031b bVar) {
        if (i == 2) {
            return new C9055w(new C9043p(m26757b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C9055w(new C9053u(bVar.f19871b));
        }
        C9029h0 h0Var = null;
        if (i == 15) {
            if (!m26756a(2)) {
                h0Var = new C9055w(new C9038k(false, bVar.f19871b));
            }
            return h0Var;
        } else if (i == 17) {
            if (!m26756a(2)) {
                h0Var = new C9055w(new C9052t(bVar.f19871b));
            }
            return h0Var;
        } else if (i == 21) {
            return new C9055w(new C9051s());
        } else {
            if (i == 27) {
                if (!m26756a(4)) {
                    h0Var = new C9055w(new C9045q(m26755a(bVar), m26756a(1), m26756a(8)));
                }
                return h0Var;
            } else if (i == 36) {
                return new C9055w(new C9049r(m26755a(bVar)));
            } else {
                if (i == 89) {
                    return new C9055w(new C9041n(bVar.f19872c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new C9055w(new C9034i(bVar.f19871b));
                    }
                    if (i != 129) {
                        if (i != 130) {
                            if (i == 134) {
                                if (!m26756a(16)) {
                                    h0Var = new C9014b0(new C9018d0());
                                }
                                return h0Var;
                            } else if (i != 135) {
                                return null;
                            }
                        } else if (!m26756a(64)) {
                            return null;
                        }
                    }
                    return new C9055w(new C9024g(bVar.f19871b));
                }
                return new C9055w(new C9040m(bVar.f19871b));
            }
        }
    }

    public C9039l(int i, List<Format> list) {
        this.f19930a = i;
        this.f19931b = list;
    }

    /* renamed from: a */
    private C9016c0 m26755a(C9031b bVar) {
        return new C9016c0(m26758c(bVar));
    }

    /* renamed from: a */
    private boolean m26756a(int i) {
        return (i & this.f19930a) != 0;
    }
}
