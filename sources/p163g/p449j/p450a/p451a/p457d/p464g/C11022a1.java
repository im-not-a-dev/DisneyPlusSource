package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.a1 */
public final class C11022a1 extends C11388y7<C11022a1> {

    /* renamed from: h */
    private static volatile C11022a1[] f26041h;

    /* renamed from: c */
    public Integer f26042c = null;

    /* renamed from: d */
    public C11085e0[] f26043d = new C11085e0[0];

    /* renamed from: e */
    public C11035b0[] f26044e = new C11035b0[0];

    /* renamed from: f */
    private Boolean f26045f = null;

    /* renamed from: g */
    private Boolean f26046g = null;

    /* renamed from: d */
    public static C11022a1[] m34734d() {
        if (f26041h == null) {
            synchronized (C11063c8.f26116b) {
                if (f26041h == null) {
                    f26041h = new C11022a1[0];
                }
            }
        }
        return f26041h;
    }

    /* renamed from: a */
    public final void mo28252a(C11361w7 w7Var) throws IOException {
        Integer num = this.f26042c;
        if (num != null) {
            w7Var.mo29125b(1, num.intValue());
        }
        C11085e0[] e0VarArr = this.f26043d;
        int i = 0;
        if (e0VarArr != null && e0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11085e0[] e0VarArr2 = this.f26043d;
                if (i2 >= e0VarArr2.length) {
                    break;
                }
                C11085e0 e0Var = e0VarArr2[i2];
                if (e0Var != null) {
                    w7Var.mo29120a(2, (C11259p5) e0Var);
                }
                i2++;
            }
        }
        C11035b0[] b0VarArr = this.f26044e;
        if (b0VarArr != null && b0VarArr.length > 0) {
            while (true) {
                C11035b0[] b0VarArr2 = this.f26044e;
                if (i >= b0VarArr2.length) {
                    break;
                }
                C11035b0 b0Var = b0VarArr2[i];
                if (b0Var != null) {
                    w7Var.mo29120a(3, (C11259p5) b0Var);
                }
                i++;
            }
        }
        Boolean bool = this.f26045f;
        if (bool != null) {
            w7Var.mo29122a(4, bool.booleanValue());
        }
        Boolean bool2 = this.f26046g;
        if (bool2 != null) {
            w7Var.mo29122a(5, bool2.booleanValue());
        }
        super.mo28252a(w7Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11022a1)) {
            return false;
        }
        C11022a1 a1Var = (C11022a1) obj;
        Integer num = this.f26042c;
        if (num == null) {
            if (a1Var.f26042c != null) {
                return false;
            }
        } else if (!num.equals(a1Var.f26042c)) {
            return false;
        }
        if (!C11063c8.m34933a((Object[]) this.f26043d, (Object[]) a1Var.f26043d) || !C11063c8.m34933a((Object[]) this.f26044e, (Object[]) a1Var.f26044e)) {
            return false;
        }
        Boolean bool = this.f26045f;
        if (bool == null) {
            if (a1Var.f26045f != null) {
                return false;
            }
        } else if (!bool.equals(a1Var.f26045f)) {
            return false;
        }
        Boolean bool2 = this.f26046g;
        if (bool2 == null) {
            if (a1Var.f26046g != null) {
                return false;
            }
        } else if (!bool2.equals(a1Var.f26046g)) {
            return false;
        }
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            return this.f26656b.equals(a1Var.f26656b);
        }
        C11029a8 a8Var2 = a1Var.f26656b;
        return a8Var2 == null || a8Var2.mo28283a();
    }

    public final int hashCode() {
        int hashCode = (C11022a1.class.getName().hashCode() + 527) * 31;
        Integer num = this.f26042c;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + C11063c8.m34931a(this.f26043d)) * 31) + C11063c8.m34931a(this.f26044e)) * 31;
        Boolean bool = this.f26045f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26046g;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            i = this.f26656b.hashCode();
        }
        return hashCode4 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28250a() {
        int a = super.mo28250a();
        Integer num = this.f26042c;
        if (num != null) {
            a += C11361w7.m36649c(1, num.intValue());
        }
        C11085e0[] e0VarArr = this.f26043d;
        int i = 0;
        if (e0VarArr != null && e0VarArr.length > 0) {
            int i2 = a;
            int i3 = 0;
            while (true) {
                C11085e0[] e0VarArr2 = this.f26043d;
                if (i3 >= e0VarArr2.length) {
                    break;
                }
                C11085e0 e0Var = e0VarArr2[i3];
                if (e0Var != null) {
                    i2 += C11197l3.m35559c(2, (C11259p5) e0Var);
                }
                i3++;
            }
            a = i2;
        }
        C11035b0[] b0VarArr = this.f26044e;
        if (b0VarArr != null && b0VarArr.length > 0) {
            while (true) {
                C11035b0[] b0VarArr2 = this.f26044e;
                if (i >= b0VarArr2.length) {
                    break;
                }
                C11035b0 b0Var = b0VarArr2[i];
                if (b0Var != null) {
                    a += C11197l3.m35559c(3, (C11259p5) b0Var);
                }
                i++;
            }
        }
        Boolean bool = this.f26045f;
        if (bool != null) {
            bool.booleanValue();
            a += C11361w7.m36644b(4) + 1;
        }
        Boolean bool2 = this.f26046g;
        if (bool2 == null) {
            return a;
        }
        bool2.booleanValue();
        return a + C11361w7.m36644b(5) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C11099e8 mo28251a(C11318t7 t7Var) throws IOException {
        while (true) {
            int c = t7Var.mo29030c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f26042c = Integer.valueOf(t7Var.mo29032e());
            } else if (c == 18) {
                int a = C11115f8.m35229a(t7Var, 18);
                C11085e0[] e0VarArr = this.f26043d;
                int length = e0VarArr == null ? 0 : e0VarArr.length;
                C11085e0[] e0VarArr2 = new C11085e0[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26043d, 0, e0VarArr2, 0, length);
                }
                while (length < e0VarArr2.length - 1) {
                    e0VarArr2[length] = (C11085e0) t7Var.mo29024a(C11085e0.m34997v());
                    t7Var.mo29030c();
                    length++;
                }
                e0VarArr2[length] = (C11085e0) t7Var.mo29024a(C11085e0.m34997v());
                this.f26043d = e0VarArr2;
            } else if (c == 26) {
                int a2 = C11115f8.m35229a(t7Var, 26);
                C11035b0[] b0VarArr = this.f26044e;
                int length2 = b0VarArr == null ? 0 : b0VarArr.length;
                C11035b0[] b0VarArr2 = new C11035b0[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f26044e, 0, b0VarArr2, 0, length2);
                }
                while (length2 < b0VarArr2.length - 1) {
                    b0VarArr2[length2] = (C11035b0) t7Var.mo29024a(C11035b0.m34767y());
                    t7Var.mo29030c();
                    length2++;
                }
                b0VarArr2[length2] = (C11035b0) t7Var.mo29024a(C11035b0.m34767y());
                this.f26044e = b0VarArr2;
            } else if (c == 32) {
                this.f26045f = Boolean.valueOf(t7Var.mo29031d());
            } else if (c == 40) {
                this.f26046g = Boolean.valueOf(t7Var.mo29031d());
            } else if (!super.mo29192a(t7Var, c)) {
                return this;
            }
        }
    }
}
