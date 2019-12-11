package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.b6 */
final class C11042b6 implements C11231n5 {

    /* renamed from: a */
    private final C11259p5 f26080a;

    /* renamed from: b */
    private final String f26081b;

    /* renamed from: c */
    private final Object[] f26082c;

    /* renamed from: d */
    private final int f26083d;

    C11042b6(C11259p5 p5Var, String str, Object[] objArr) {
        this.f26080a = p5Var;
        this.f26081b = str;
        this.f26082c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f26083d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f26083d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final C11259p5 mo28316a() {
        return this.f26080a;
    }

    /* renamed from: b */
    public final boolean mo28317b() {
        return (this.f26083d & 2) == 2;
    }

    /* renamed from: c */
    public final int mo28318c() {
        return (this.f26083d & 1) == 1 ? C11094d.f26170i : C11094d.f26171j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo28319d() {
        return this.f26081b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Object[] mo28320e() {
        return this.f26082c;
    }
}
