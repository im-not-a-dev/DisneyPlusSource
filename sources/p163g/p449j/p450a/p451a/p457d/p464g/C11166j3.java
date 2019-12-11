package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.List;

/* renamed from: g.j.a.a.d.g.j3 */
final class C11166j3 implements C11097e6 {

    /* renamed from: a */
    private final C11152i3 f26265a;

    /* renamed from: b */
    private int f26266b;

    /* renamed from: c */
    private int f26267c;

    /* renamed from: d */
    private int f26268d = 0;

    private C11166j3(C11152i3 i3Var) {
        C11111f4.m35153a(i3Var, "input");
        this.f26265a = i3Var;
        this.f26265a.f26249c = this;
    }

    /* renamed from: a */
    public static C11166j3 m35349a(C11152i3 i3Var) {
        C11166j3 j3Var = i3Var.f26249c;
        if (j3Var != null) {
            return j3Var;
        }
        return new C11166j3(i3Var);
    }

    /* renamed from: c */
    private final <T> T m35353c(C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        int m = this.f26265a.mo28567m();
        C11152i3 i3Var = this.f26265a;
        if (i3Var.f26247a < i3Var.f26248b) {
            int d = i3Var.mo28556d(m);
            T newInstance = d6Var.newInstance();
            this.f26265a.f26247a++;
            d6Var.mo28397a(newInstance, this, r3Var);
            d6Var.mo28404c(newInstance);
            this.f26265a.mo28550a(0);
            C11152i3 i3Var2 = this.f26265a;
            i3Var2.f26247a--;
            i3Var2.mo28558e(d);
            return newInstance;
        }
        throw C11258p4.m35936g();
    }

    /* renamed from: b */
    public final boolean mo28456b() throws IOException {
        m35350a(0);
        return this.f26265a.mo28564j();
    }

    /* renamed from: d */
    public final int mo28459d() throws IOException {
        m35350a(5);
        return this.f26265a.mo28563i();
    }

    /* renamed from: e */
    public final long mo28461e() throws IOException {
        m35350a(0);
        return this.f26265a.mo28572r();
    }

    /* renamed from: f */
    public final long mo28463f() throws IOException {
        m35350a(1);
        return this.f26265a.mo28570p();
    }

    /* renamed from: g */
    public final long mo28465g() throws IOException {
        m35350a(1);
        return this.f26265a.mo28562h();
    }

    /* renamed from: h */
    public final double mo28467h() throws IOException {
        m35350a(1);
        return this.f26265a.mo28548a();
    }

    /* renamed from: i */
    public final int mo28469i() throws IOException {
        m35350a(5);
        return this.f26265a.mo28569o();
    }

    /* renamed from: j */
    public final int mo28471j() throws IOException {
        m35350a(0);
        return this.f26265a.mo28561g();
    }

    /* renamed from: k */
    public final int mo28473k() throws IOException {
        m35350a(0);
        return this.f26265a.mo28568n();
    }

    /* renamed from: l */
    public final boolean mo28476l() throws IOException {
        if (!this.f26265a.mo28573s()) {
            int i = this.f26266b;
            if (i != this.f26267c) {
                return this.f26265a.mo28552b(i);
            }
        }
        return false;
    }

    /* renamed from: m */
    public final long mo28477m() throws IOException {
        m35350a(0);
        return this.f26265a.mo28559f();
    }

    /* renamed from: n */
    public final int mo28479n() throws IOException {
        m35350a(0);
        return this.f26265a.mo28567m();
    }

    /* renamed from: o */
    public final String mo28481o() throws IOException {
        m35350a(2);
        return this.f26265a.mo28554c();
    }

    /* renamed from: p */
    public final int mo28483p() throws IOException {
        int i = this.f26268d;
        if (i != 0) {
            this.f26266b = i;
            this.f26268d = 0;
        } else {
            this.f26266b = this.f26265a.mo28555d();
        }
        int i2 = this.f26266b;
        if (i2 == 0 || i2 == this.f26267c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: q */
    public final long mo28485q() throws IOException {
        m35350a(0);
        return this.f26265a.mo28557e();
    }

    /* renamed from: r */
    public final C11342v2 mo28487r() throws IOException {
        m35350a(2);
        return this.f26265a.mo28566l();
    }

    /* renamed from: s */
    public final float mo28488s() throws IOException {
        m35350a(5);
        return this.f26265a.mo28551b();
    }

    /* renamed from: t */
    public final String mo28489t() throws IOException {
        m35350a(2);
        return this.f26265a.mo28565k();
    }

    /* renamed from: d */
    private final <T> T m35355d(C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        int i = this.f26267c;
        this.f26267c = ((this.f26266b >>> 3) << 3) | 4;
        try {
            T newInstance = d6Var.newInstance();
            d6Var.mo28397a(newInstance, this, r3Var);
            d6Var.mo28404c(newInstance);
            if (this.f26266b == this.f26267c) {
                return newInstance;
            }
            throw C11258p4.m35937h();
        } finally {
            this.f26267c = i;
        }
    }

    /* renamed from: a */
    public final int mo28449a() {
        return this.f26266b;
    }

    /* renamed from: b */
    public final <T> T mo28453b(C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        m35350a(2);
        return m35353c(d6Var, r3Var);
    }

    /* renamed from: e */
    public final void mo28462e(List<Float> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11025a4) {
            C11025a4 a4Var = (C11025a4) list;
            int i = this.f26266b & 7;
            if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35354c(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    a4Var.mo28258a(this.f26265a.mo28551b());
                } while (this.f26265a.mo28574t() < t);
            } else if (i == 5) {
                do {
                    a4Var.mo28258a(this.f26265a.mo28551b());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35354c(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Float.valueOf(this.f26265a.mo28551b()));
                } while (this.f26265a.mo28574t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f26265a.mo28551b()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: f */
    public final void mo28464f(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            int i = this.f26266b & 7;
            if (i == 1) {
                do {
                    d5Var.mo28390b(this.f26265a.mo28562h());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35352b(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    d5Var.mo28390b(this.f26265a.mo28562h());
                } while (this.f26265a.mo28574t() < t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f26265a.mo28562h()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35352b(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Long.valueOf(this.f26265a.mo28562h()));
                } while (this.f26265a.mo28574t() < t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: g */
    public final void mo28466g(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            int i = this.f26266b & 7;
            if (i == 1) {
                do {
                    d5Var.mo28390b(this.f26265a.mo28570p());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35352b(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    d5Var.mo28390b(this.f26265a.mo28570p());
                } while (this.f26265a.mo28574t() < t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f26265a.mo28570p()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35352b(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Long.valueOf(this.f26265a.mo28570p()));
                } while (this.f26265a.mo28574t() < t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: h */
    public final void mo28468h(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28561g());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    h4Var.mo28535g(this.f26265a.mo28561g());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28561g()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28561g()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: i */
    public final void mo28470i(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35354c(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    h4Var.mo28535g(this.f26265a.mo28569o());
                } while (this.f26265a.mo28574t() < t);
            } else if (i == 5) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28569o());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35354c(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28569o()));
                } while (this.f26265a.mo28574t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28569o()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: j */
    public final void mo28472j(List<Boolean> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11313t2) {
            C11313t2 t2Var = (C11313t2) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    t2Var.mo29015a(this.f26265a.mo28564j());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    t2Var.mo29015a(this.f26265a.mo28564j());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f26265a.mo28564j()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Boolean.valueOf(this.f26265a.mo28564j()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: k */
    public final void mo28474k(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    d5Var.mo28390b(this.f26265a.mo28572r());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    d5Var.mo28390b(this.f26265a.mo28572r());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f26265a.mo28572r()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Long.valueOf(this.f26265a.mo28572r()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: l */
    public final void mo28475l(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35354c(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    h4Var.mo28535g(this.f26265a.mo28563i());
                } while (this.f26265a.mo28574t() < t);
            } else if (i == 5) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28563i());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35354c(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28563i()));
                } while (this.f26265a.mo28574t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28563i()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: m */
    public final void mo28478m(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28571q());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    h4Var.mo28535g(this.f26265a.mo28571q());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28571q()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28571q()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: n */
    public final void mo28480n(List<String> list) throws IOException {
        m35351a(list, false);
    }

    /* renamed from: o */
    public final void mo28482o(List<C11342v2> list) throws IOException {
        int d;
        if ((this.f26266b & 7) == 2) {
            do {
                list.add(mo28487r());
                if (!this.f26265a.mo28573s()) {
                    d = this.f26265a.mo28555d();
                } else {
                    return;
                }
            } while (d == this.f26266b);
            this.f26268d = d;
            return;
        }
        throw C11258p4.m35935f();
    }

    /* renamed from: q */
    public final void mo28486q(List<String> list) throws IOException {
        m35351a(list, true);
    }

    /* renamed from: a */
    private final void m35350a(int i) throws IOException {
        if ((this.f26266b & 7) != i) {
            throw C11258p4.m35935f();
        }
    }

    /* renamed from: b */
    public final void mo28454b(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    d5Var.mo28390b(this.f26265a.mo28557e());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    d5Var.mo28390b(this.f26265a.mo28557e());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f26265a.mo28557e()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Long.valueOf(this.f26265a.mo28557e()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: a */
    public final <T> T mo28450a(C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        m35350a(3);
        return m35355d(d6Var, r3Var);
    }

    /* renamed from: p */
    public final void mo28484p(List<Double> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11229n3) {
            C11229n3 n3Var = (C11229n3) list;
            int i = this.f26266b & 7;
            if (i == 1) {
                do {
                    n3Var.mo28730a(this.f26265a.mo28548a());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int m = this.f26265a.mo28567m();
                m35352b(m);
                int t = this.f26265a.mo28574t() + m;
                do {
                    n3Var.mo28730a(this.f26265a.mo28548a());
                } while (this.f26265a.mo28574t() < t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f26265a.mo28548a()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int m2 = this.f26265a.mo28567m();
                m35352b(m2);
                int t2 = this.f26265a.mo28574t() + m2;
                do {
                    list.add(Double.valueOf(this.f26265a.mo28548a()));
                } while (this.f26265a.mo28574t() < t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: a */
    public final void mo28451a(List<Long> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11076d5) {
            C11076d5 d5Var = (C11076d5) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    d5Var.mo28390b(this.f26265a.mo28559f());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    d5Var.mo28390b(this.f26265a.mo28559f());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f26265a.mo28559f()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Long.valueOf(this.f26265a.mo28559f()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: c */
    public final int mo28457c() throws IOException {
        m35350a(0);
        return this.f26265a.mo28571q();
    }

    /* renamed from: d */
    public final void mo28460d(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28567m());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    h4Var.mo28535g(this.f26265a.mo28567m());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28567m()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28567m()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: c */
    public final void mo28458c(List<Integer> list) throws IOException {
        int d;
        int d2;
        if (list instanceof C11139h4) {
            C11139h4 h4Var = (C11139h4) list;
            int i = this.f26266b & 7;
            if (i == 0) {
                do {
                    h4Var.mo28535g(this.f26265a.mo28568n());
                    if (!this.f26265a.mo28573s()) {
                        d2 = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d2 == this.f26266b);
                this.f26268d = d2;
            } else if (i == 2) {
                int t = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    h4Var.mo28535g(this.f26265a.mo28568n());
                } while (this.f26265a.mo28574t() < t);
                m35356d(t);
            } else {
                throw C11258p4.m35935f();
            }
        } else {
            int i2 = this.f26266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28568n()));
                    if (!this.f26265a.mo28573s()) {
                        d = this.f26265a.mo28555d();
                    } else {
                        return;
                    }
                } while (d == this.f26266b);
                this.f26268d = d;
            } else if (i2 == 2) {
                int t2 = this.f26265a.mo28574t() + this.f26265a.mo28567m();
                do {
                    list.add(Integer.valueOf(this.f26265a.mo28568n()));
                } while (this.f26265a.mo28574t() < t2);
                m35356d(t2);
            } else {
                throw C11258p4.m35935f();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo28455b(List<T> list, C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        int d;
        int i = this.f26266b;
        if ((i & 7) == 3) {
            do {
                list.add(m35355d(d6Var, r3Var));
                if (!this.f26265a.mo28573s() && this.f26268d == 0) {
                    d = this.f26265a.mo28555d();
                } else {
                    return;
                }
            } while (d == i);
            this.f26268d = d;
            return;
        }
        throw C11258p4.m35935f();
    }

    /* renamed from: a */
    private final void m35351a(List<String> list, boolean z) throws IOException {
        int d;
        int d2;
        if ((this.f26266b & 7) != 2) {
            throw C11258p4.m35935f();
        } else if (!(list instanceof C11358w4) || z) {
            do {
                list.add(z ? mo28489t() : mo28481o());
                if (!this.f26265a.mo28573s()) {
                    d = this.f26265a.mo28555d();
                } else {
                    return;
                }
            } while (d == this.f26266b);
            this.f26268d = d;
        } else {
            C11358w4 w4Var = (C11358w4) list;
            do {
                w4Var.mo28321a(mo28487r());
                if (!this.f26265a.mo28573s()) {
                    d2 = this.f26265a.mo28555d();
                } else {
                    return;
                }
            } while (d2 == this.f26266b);
            this.f26268d = d2;
        }
    }

    /* renamed from: b */
    private static void m35352b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C11258p4.m35937h();
        }
    }

    /* renamed from: d */
    private final void m35356d(int i) throws IOException {
        if (this.f26265a.mo28574t() != i) {
            throw C11258p4.m35930a();
        }
    }

    /* renamed from: c */
    private static void m35354c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C11258p4.m35937h();
        }
    }

    /* renamed from: a */
    public final <T> void mo28452a(List<T> list, C11077d6<T> d6Var, C11285r3 r3Var) throws IOException {
        int d;
        int i = this.f26266b;
        if ((i & 7) == 2) {
            do {
                list.add(m35353c(d6Var, r3Var));
                if (!this.f26265a.mo28573s() && this.f26268d == 0) {
                    d = this.f26265a.mo28555d();
                } else {
                    return;
                }
            } while (d == i);
            this.f26268d = d;
            return;
        }
        throw C11258p4.m35935f();
    }
}
