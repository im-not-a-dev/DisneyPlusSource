package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.b1 */
public final class C11037b1 extends C11388y7<C11037b1> {

    /* renamed from: c */
    public Long f26066c = null;

    /* renamed from: d */
    public String f26067d = null;

    /* renamed from: e */
    private Integer f26068e = null;

    /* renamed from: f */
    public C11193l0[] f26069f = new C11193l0[0];

    /* renamed from: g */
    public C11052c1[] f26070g = C11052c1.m34831d();

    /* renamed from: h */
    public C11022a1[] f26071h = C11022a1.m34734d();

    /* renamed from: i */
    private String f26072i = null;

    /* renamed from: j */
    public Boolean f26073j = null;

    /* renamed from: a */
    public final void mo28252a(C11361w7 w7Var) throws IOException {
        Long l = this.f26066c;
        int i = 0;
        if (l != null) {
            long longValue = l.longValue();
            w7Var.mo29118a(1, 0);
            w7Var.mo29123a(longValue);
        }
        String str = this.f26067d;
        if (str != null) {
            w7Var.mo29121a(2, str);
        }
        Integer num = this.f26068e;
        if (num != null) {
            w7Var.mo29125b(3, num.intValue());
        }
        C11193l0[] l0VarArr = this.f26069f;
        if (l0VarArr != null && l0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C11193l0[] l0VarArr2 = this.f26069f;
                if (i2 >= l0VarArr2.length) {
                    break;
                }
                C11193l0 l0Var = l0VarArr2[i2];
                if (l0Var != null) {
                    w7Var.mo29120a(4, (C11259p5) l0Var);
                }
                i2++;
            }
        }
        C11052c1[] c1VarArr = this.f26070g;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C11052c1[] c1VarArr2 = this.f26070g;
                if (i3 >= c1VarArr2.length) {
                    break;
                }
                C11052c1 c1Var = c1VarArr2[i3];
                if (c1Var != null) {
                    w7Var.mo29119a(5, (C11099e8) c1Var);
                }
                i3++;
            }
        }
        C11022a1[] a1VarArr = this.f26071h;
        if (a1VarArr != null && a1VarArr.length > 0) {
            while (true) {
                C11022a1[] a1VarArr2 = this.f26071h;
                if (i >= a1VarArr2.length) {
                    break;
                }
                C11022a1 a1Var = a1VarArr2[i];
                if (a1Var != null) {
                    w7Var.mo29119a(6, (C11099e8) a1Var);
                }
                i++;
            }
        }
        String str2 = this.f26072i;
        if (str2 != null) {
            w7Var.mo29121a(7, str2);
        }
        Boolean bool = this.f26073j;
        if (bool != null) {
            w7Var.mo29122a(8, bool.booleanValue());
        }
        super.mo28252a(w7Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11037b1)) {
            return false;
        }
        C11037b1 b1Var = (C11037b1) obj;
        Long l = this.f26066c;
        if (l == null) {
            if (b1Var.f26066c != null) {
                return false;
            }
        } else if (!l.equals(b1Var.f26066c)) {
            return false;
        }
        String str = this.f26067d;
        if (str == null) {
            if (b1Var.f26067d != null) {
                return false;
            }
        } else if (!str.equals(b1Var.f26067d)) {
            return false;
        }
        Integer num = this.f26068e;
        if (num == null) {
            if (b1Var.f26068e != null) {
                return false;
            }
        } else if (!num.equals(b1Var.f26068e)) {
            return false;
        }
        if (!C11063c8.m34933a((Object[]) this.f26069f, (Object[]) b1Var.f26069f) || !C11063c8.m34933a((Object[]) this.f26070g, (Object[]) b1Var.f26070g) || !C11063c8.m34933a((Object[]) this.f26071h, (Object[]) b1Var.f26071h)) {
            return false;
        }
        String str2 = this.f26072i;
        if (str2 == null) {
            if (b1Var.f26072i != null) {
                return false;
            }
        } else if (!str2.equals(b1Var.f26072i)) {
            return false;
        }
        Boolean bool = this.f26073j;
        if (bool == null) {
            if (b1Var.f26073j != null) {
                return false;
            }
        } else if (!bool.equals(b1Var.f26073j)) {
            return false;
        }
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            return this.f26656b.equals(b1Var.f26656b);
        }
        C11029a8 a8Var2 = b1Var.f26656b;
        return a8Var2 == null || a8Var2.mo28283a();
    }

    public final int hashCode() {
        int hashCode = (C11037b1.class.getName().hashCode() + 527) * 31;
        Long l = this.f26066c;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f26067d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f26068e;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + C11063c8.m34931a(this.f26069f)) * 31) + C11063c8.m34931a(this.f26070g)) * 31) + C11063c8.m34931a(this.f26071h)) * 31;
        String str2 = this.f26072i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f26073j;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C11029a8 a8Var = this.f26656b;
        if (a8Var != null && !a8Var.mo28283a()) {
            i = this.f26656b.hashCode();
        }
        return hashCode6 + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo28250a() {
        int a = super.mo28250a();
        Long l = this.f26066c;
        if (l != null) {
            long longValue = l.longValue();
            int b = C11361w7.m36644b(1);
            int i = (-128 & longValue) == 0 ? 1 : (-16384 & longValue) == 0 ? 2 : (-2097152 & longValue) == 0 ? 3 : (-268435456 & longValue) == 0 ? 4 : (-34359738368L & longValue) == 0 ? 5 : (-4398046511104L & longValue) == 0 ? 6 : (-562949953421312L & longValue) == 0 ? 7 : (-72057594037927936L & longValue) == 0 ? 8 : (longValue & Long.MIN_VALUE) == 0 ? 9 : 10;
            a += b + i;
        }
        String str = this.f26067d;
        if (str != null) {
            a += C11361w7.m36646b(2, str);
        }
        Integer num = this.f26068e;
        if (num != null) {
            a += C11361w7.m36649c(3, num.intValue());
        }
        C11193l0[] l0VarArr = this.f26069f;
        int i2 = 0;
        if (l0VarArr != null && l0VarArr.length > 0) {
            int i3 = a;
            int i4 = 0;
            while (true) {
                C11193l0[] l0VarArr2 = this.f26069f;
                if (i4 >= l0VarArr2.length) {
                    break;
                }
                C11193l0 l0Var = l0VarArr2[i4];
                if (l0Var != null) {
                    i3 += C11197l3.m35559c(4, (C11259p5) l0Var);
                }
                i4++;
            }
            a = i3;
        }
        C11052c1[] c1VarArr = this.f26070g;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i5 = a;
            int i6 = 0;
            while (true) {
                C11052c1[] c1VarArr2 = this.f26070g;
                if (i6 >= c1VarArr2.length) {
                    break;
                }
                C11052c1 c1Var = c1VarArr2[i6];
                if (c1Var != null) {
                    i5 += C11361w7.m36645b(5, (C11099e8) c1Var);
                }
                i6++;
            }
            a = i5;
        }
        C11022a1[] a1VarArr = this.f26071h;
        if (a1VarArr != null && a1VarArr.length > 0) {
            while (true) {
                C11022a1[] a1VarArr2 = this.f26071h;
                if (i2 >= a1VarArr2.length) {
                    break;
                }
                C11022a1 a1Var = a1VarArr2[i2];
                if (a1Var != null) {
                    a += C11361w7.m36645b(6, (C11099e8) a1Var);
                }
                i2++;
            }
        }
        String str2 = this.f26072i;
        if (str2 != null) {
            a += C11361w7.m36646b(7, str2);
        }
        Boolean bool = this.f26073j;
        if (bool == null) {
            return a;
        }
        bool.booleanValue();
        return a + C11361w7.m36644b(8) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C11099e8 mo28251a(C11318t7 t7Var) throws IOException {
        while (true) {
            int c = t7Var.mo29030c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f26066c = Long.valueOf(t7Var.mo29033f());
            } else if (c == 18) {
                this.f26067d = t7Var.mo29028b();
            } else if (c == 24) {
                this.f26068e = Integer.valueOf(t7Var.mo29032e());
            } else if (c == 34) {
                int a = C11115f8.m35229a(t7Var, 34);
                C11193l0[] l0VarArr = this.f26069f;
                int length = l0VarArr == null ? 0 : l0VarArr.length;
                C11193l0[] l0VarArr2 = new C11193l0[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26069f, 0, l0VarArr2, 0, length);
                }
                while (length < l0VarArr2.length - 1) {
                    l0VarArr2[length] = (C11193l0) t7Var.mo29024a(C11193l0.m35529p());
                    t7Var.mo29030c();
                    length++;
                }
                l0VarArr2[length] = (C11193l0) t7Var.mo29024a(C11193l0.m35529p());
                this.f26069f = l0VarArr2;
            } else if (c == 42) {
                int a2 = C11115f8.m35229a(t7Var, 42);
                C11052c1[] c1VarArr = this.f26070g;
                int length2 = c1VarArr == null ? 0 : c1VarArr.length;
                C11052c1[] c1VarArr2 = new C11052c1[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f26070g, 0, c1VarArr2, 0, length2);
                }
                while (length2 < c1VarArr2.length - 1) {
                    c1VarArr2[length2] = new C11052c1();
                    t7Var.mo29025a((C11099e8) c1VarArr2[length2]);
                    t7Var.mo29030c();
                    length2++;
                }
                c1VarArr2[length2] = new C11052c1();
                t7Var.mo29025a((C11099e8) c1VarArr2[length2]);
                this.f26070g = c1VarArr2;
            } else if (c == 50) {
                int a3 = C11115f8.m35229a(t7Var, 50);
                C11022a1[] a1VarArr = this.f26071h;
                int length3 = a1VarArr == null ? 0 : a1VarArr.length;
                C11022a1[] a1VarArr2 = new C11022a1[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f26071h, 0, a1VarArr2, 0, length3);
                }
                while (length3 < a1VarArr2.length - 1) {
                    a1VarArr2[length3] = new C11022a1();
                    t7Var.mo29025a((C11099e8) a1VarArr2[length3]);
                    t7Var.mo29030c();
                    length3++;
                }
                a1VarArr2[length3] = new C11022a1();
                t7Var.mo29025a((C11099e8) a1VarArr2[length3]);
                this.f26071h = a1VarArr2;
            } else if (c == 58) {
                this.f26072i = t7Var.mo29028b();
            } else if (c == 64) {
                this.f26073j = Boolean.valueOf(t7Var.mo29031d());
            } else if (!super.mo29192a(t7Var, c)) {
                return this;
            }
        }
    }
}
