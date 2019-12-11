package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.c1 */
public final class C11052c1 extends C11388y7<C11052c1> {

    /* renamed from: g */
    private static volatile C11052c1[] f26093g;

    /* renamed from: c */
    public String f26094c = null;

    /* renamed from: d */
    public Boolean f26095d = null;

    /* renamed from: e */
    public Boolean f26096e = null;

    /* renamed from: f */
    public Integer f26097f = null;

    /* renamed from: d */
    public static C11052c1[] m34831d() {
        if (f26093g == null) {
            synchronized (C11063c8.f26116b) {
                if (f26093g == null) {
                    f26093g = new C11052c1[0];
                }
            }
        }
        return f26093g;
    }

    /* renamed from: a */
    public final void mo28252a(C11361w7 w7Var) throws IOException {
        String str = this.f26094c;
        if (str != null) {
            w7Var.mo29121a(1, str);
        }
        Boolean bool = this.f26095d;
        if (bool != null) {
            w7Var.mo29122a(2, bool.booleanValue());
        }
        Boolean bool2 = this.f26096e;
        if (bool2 != null) {
            w7Var.mo29122a(3, bool2.booleanValue());
        }
        Integer num = this.f26097f;
        if (num != null) {
            w7Var.mo29125b(4, num.intValue());
        }
        super.mo28252a(w7Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11052c1)) {
            return false;
        }
        C11052c1 c1Var = (C11052c1) obj;
        String str = this.f26094c;
        if (str == null) {
            if (c1Var.f26094c != null) {
                return false;
            }
        } else if (!str.equals(c1Var.f26094c)) {
            return false;
        }
        Boolean bool = this.f26095d;
        if (bool == null) {
            if (c1Var.f26095d != null) {
                return false;
            }
        } else if (!bool.equals(c1Var.f26095d)) {
            return false;
        }
        Boolean bool2 = this.f26096e;
        if (bool2 == null) {
            if (c1Var.f26096e != null) {
                return false;
            }
        } else if (!bool2.equals(c1Var.f26096e)) {
            return false;
        }
        Integer num = this.f26097f;
        if (num == null) {
            if (c1Var.f26097f != null) {
                return false;
            }
        } else if (!num.equals(c1Var.f26097f)) {
            return false;
        }
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            return this.f26656b.equals(c1Var.f26656b);
        }
        C11029a8 a8Var2 = c1Var.f26656b;
        return a8Var2 == null || a8Var2.mo28283a();
    }

    public final int hashCode() {
        int hashCode = (C11052c1.class.getName().hashCode() + 527) * 31;
        String str = this.f26094c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f26095d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26096e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f26097f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            i = this.f26656b.hashCode();
        }
        return hashCode5 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28250a() {
        int a = super.mo28250a();
        String str = this.f26094c;
        if (str != null) {
            a += C11361w7.m36646b(1, str);
        }
        Boolean bool = this.f26095d;
        if (bool != null) {
            bool.booleanValue();
            a += C11361w7.m36644b(2) + 1;
        }
        Boolean bool2 = this.f26096e;
        if (bool2 != null) {
            bool2.booleanValue();
            a += C11361w7.m36644b(3) + 1;
        }
        Integer num = this.f26097f;
        return num != null ? a + C11361w7.m36649c(4, num.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C11099e8 mo28251a(C11318t7 t7Var) throws IOException {
        while (true) {
            int c = t7Var.mo29030c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                this.f26094c = t7Var.mo29028b();
            } else if (c == 16) {
                this.f26095d = Boolean.valueOf(t7Var.mo29031d());
            } else if (c == 24) {
                this.f26096e = Boolean.valueOf(t7Var.mo29031d());
            } else if (c == 32) {
                this.f26097f = Integer.valueOf(t7Var.mo29032e());
            } else if (!super.mo29192a(t7Var, c)) {
                return this;
            }
        }
    }
}
