package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11092b;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11095e;

/* renamed from: g.j.a.a.d.g.u5 */
final class C11331u5<T> implements C11077d6<T> {

    /* renamed from: a */
    private final C11259p5 f26562a;

    /* renamed from: b */
    private final C11360w6<?, ?> f26563b;

    /* renamed from: c */
    private final boolean f26564c;

    /* renamed from: d */
    private final C11314t3<?> f26565d;

    private C11331u5(C11360w6<?, ?> w6Var, C11314t3<?> t3Var, C11259p5 p5Var) {
        this.f26563b = w6Var;
        this.f26564c = t3Var.mo28888a(p5Var);
        this.f26565d = t3Var;
        this.f26562a = p5Var;
    }

    /* renamed from: a */
    static <T> C11331u5<T> m36427a(C11360w6<?, ?> w6Var, C11314t3<?> t3Var, C11259p5 p5Var) {
        return new C11331u5<>(w6Var, t3Var, p5Var);
    }

    /* renamed from: b */
    public final boolean mo28403b(T t, T t2) {
        if (!this.f26563b.mo29114d(t).equals(this.f26563b.mo29114d(t2))) {
            return false;
        }
        if (this.f26564c) {
            return this.f26565d.mo28882a((Object) t).equals(this.f26565d.mo28882a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public final void mo28404c(T t) {
        this.f26563b.mo29099a((Object) t);
        this.f26565d.mo28890c(t);
    }

    /* renamed from: d */
    public final int mo28405d(T t) {
        int hashCode = this.f26563b.mo29114d(t).hashCode();
        return this.f26564c ? (hashCode * 53) + this.f26565d.mo28882a((Object) t).hashCode() : hashCode;
    }

    public final T newInstance() {
        return this.f26562a.mo28428d().mo28445k0();
    }

    /* renamed from: a */
    public final void mo28399a(T t, T t2) {
        C11113f6.m35173a(this.f26563b, t, t2);
        if (this.f26564c) {
            C11113f6.m35172a(this.f26565d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo28398a(T t, C11333u7 u7Var) throws IOException {
        Iterator d = this.f26565d.mo28882a((Object) t).mo29041d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            C11357w3 w3Var = (C11357w3) entry.getKey();
            if (w3Var.mo29095c0() != C11290r7.MESSAGE || w3Var.mo29094b0() || w3Var.mo29097e0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C11301s4) {
                u7Var.mo28752a(w3Var.mo29093a0(), (Object) ((C11301s4) entry).mo28891a().mo29047a());
            } else {
                u7Var.mo28752a(w3Var.mo29093a0(), entry.getValue());
            }
        }
        C11360w6<?, ?> w6Var = this.f26563b;
        w6Var.mo29110b(w6Var.mo29114d(t), u7Var);
    }

    /* renamed from: b */
    public final int mo28402b(T t) {
        C11360w6<?, ?> w6Var = this.f26563b;
        int f = w6Var.mo29116f(w6Var.mo29114d(t)) + 0;
        return this.f26564c ? f + this.f26565d.mo28882a((Object) t).mo29044f() : f;
    }

    /* renamed from: a */
    public final void mo28400a(T t, byte[] bArr, int i, int i2, C11270q2 q2Var) throws IOException {
        C11090e4 e4Var = (C11090e4) t;
        C11400z6 z6Var = e4Var.zzahz;
        if (z6Var == C11400z6.m36843d()) {
            z6Var = C11400z6.m36844e();
            e4Var.zzahz = z6Var;
        }
        ((C11092b) t).mo28447n();
        C11095e eVar = null;
        while (i < i2) {
            int a = C11284r2.m36033a(bArr, i, q2Var);
            int i3 = q2Var.f26443a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a < i2) {
                    a = C11284r2.m36033a(bArr, a, q2Var);
                    int i5 = q2Var.f26443a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                C11399z5.m36838a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a = C11284r2.m36040e(bArr, a, q2Var);
                                obj = (C11342v2) q2Var.f26445c;
                            }
                        }
                    } else if (i7 == 0) {
                        a = C11284r2.m36033a(bArr, a, q2Var);
                        i4 = q2Var.f26443a;
                        eVar = (C11095e) this.f26565d.mo28884a(q2Var.f26446d, this.f26562a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C11284r2.m36025a(i5, bArr, a, i2, q2Var);
                }
                if (obj != null) {
                    z6Var.mo29200a((i4 << 3) | 2, obj);
                }
                i = a;
            } else if ((i3 & 7) == 2) {
                eVar = (C11095e) this.f26565d.mo28884a(q2Var.f26446d, this.f26562a, i3 >>> 3);
                if (eVar == null) {
                    i = C11284r2.m36026a(i3, bArr, a, i2, z6Var, q2Var);
                } else {
                    C11399z5.m36838a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = C11284r2.m36025a(i3, bArr, a, i2, q2Var);
            }
        }
        if (i != i2) {
            throw C11258p4.m35937h();
        }
    }

    /* renamed from: a */
    public final void mo28397a(T t, C11097e6 e6Var, C11285r3 r3Var) throws IOException {
        boolean z;
        C11360w6<?, ?> w6Var = this.f26563b;
        C11314t3<?> t3Var = this.f26565d;
        Object e = w6Var.mo29115e(t);
        C11329u3 b = t3Var.mo28889b(t);
        do {
            try {
                if (e6Var.mo28483p() == Integer.MAX_VALUE) {
                    w6Var.mo29111b((Object) t, e);
                    return;
                }
                int a = e6Var.mo28449a();
                if (a == 11) {
                    Object obj = null;
                    C11342v2 v2Var = null;
                    int i = 0;
                    while (e6Var.mo28483p() != Integer.MAX_VALUE) {
                        int a2 = e6Var.mo28449a();
                        if (a2 == 16) {
                            i = e6Var.mo28479n();
                            obj = t3Var.mo28884a(r3Var, this.f26562a, i);
                        } else if (a2 == 26) {
                            if (obj == null) {
                                v2Var = e6Var.mo28487r();
                            } else {
                                t3Var.mo28885a(e6Var, obj, r3Var, b);
                                throw null;
                            }
                        } else if (!e6Var.mo28476l()) {
                            break;
                        }
                    }
                    if (e6Var.mo28449a() == 12) {
                        if (v2Var != null) {
                            if (obj == null) {
                                w6Var.mo29102a(e, i, v2Var);
                            } else {
                                t3Var.mo28887a(v2Var, obj, r3Var, b);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw C11258p4.m35934e();
                    }
                } else if ((a & 7) == 2) {
                    Object a3 = t3Var.mo28884a(r3Var, this.f26562a, a >>> 3);
                    if (a3 == null) {
                        z = w6Var.mo29107a(e, e6Var);
                        continue;
                    } else {
                        t3Var.mo28885a(e6Var, a3, r3Var, b);
                        throw null;
                    }
                } else {
                    z = e6Var.mo28476l();
                    continue;
                }
            } finally {
                w6Var.mo29111b((Object) t, e);
            }
        } while (z);
    }

    /* renamed from: a */
    public final boolean mo28401a(T t) {
        return this.f26565d.mo28882a((Object) t).mo29039c();
    }
}
