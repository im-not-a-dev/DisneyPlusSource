package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.Arrays;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.z6 */
public final class C11400z6 {

    /* renamed from: f */
    private static final C11400z6 f26723f = new C11400z6(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f26724a;

    /* renamed from: b */
    private int[] f26725b;

    /* renamed from: c */
    private Object[] f26726c;

    /* renamed from: d */
    private int f26727d;

    /* renamed from: e */
    private boolean f26728e;

    private C11400z6() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static C11400z6 m36841a(C11400z6 z6Var, C11400z6 z6Var2) {
        int i = z6Var.f26724a + z6Var2.f26724a;
        int[] copyOf = Arrays.copyOf(z6Var.f26725b, i);
        System.arraycopy(z6Var2.f26725b, 0, copyOf, z6Var.f26724a, z6Var2.f26724a);
        Object[] copyOf2 = Arrays.copyOf(z6Var.f26726c, i);
        System.arraycopy(z6Var2.f26726c, 0, copyOf2, z6Var.f26724a, z6Var2.f26724a);
        return new C11400z6(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static C11400z6 m36843d() {
        return f26723f;
    }

    /* renamed from: e */
    static C11400z6 m36844e() {
        return new C11400z6();
    }

    /* renamed from: b */
    public final void mo29204b(C11333u7 u7Var) throws IOException {
        if (this.f26724a != 0) {
            if (u7Var.mo28745a() == C11094d.f26172k) {
                for (int i = 0; i < this.f26724a; i++) {
                    m36842a(this.f26725b[i], this.f26726c[i], u7Var);
                }
                return;
            }
            for (int i2 = this.f26724a - 1; i2 >= 0; i2--) {
                m36842a(this.f26725b[i2], this.f26726c[i2], u7Var);
            }
        }
    }

    /* renamed from: c */
    public final int mo29205c() {
        int i = this.f26727d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26724a; i3++) {
            i2 += C11197l3.m35564d(this.f26725b[i3] >>> 3, (C11342v2) this.f26726c[i3]);
        }
        this.f26727d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11400z6)) {
            return false;
        }
        C11400z6 z6Var = (C11400z6) obj;
        int i = this.f26724a;
        if (i == z6Var.f26724a) {
            int[] iArr = this.f26725b;
            int[] iArr2 = z6Var.f26725b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f26726c;
                Object[] objArr2 = z6Var.f26726c;
                int i3 = this.f26724a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f26724a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f26725b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f26726c;
        for (int i7 = 0; i7 < this.f26724a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    private C11400z6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26727d = -1;
        this.f26724a = i;
        this.f26725b = iArr;
        this.f26726c = objArr;
        this.f26728e = z;
    }

    /* renamed from: a */
    public final void mo29199a() {
        this.f26728e = false;
    }

    /* renamed from: b */
    public final int mo29203b() {
        int i;
        int i2 = this.f26727d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f26724a; i4++) {
            int i5 = this.f26725b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C11197l3.m35568e(i6, ((Long) this.f26726c[i4]).longValue());
            } else if (i7 == 1) {
                i = C11197l3.m35576g(i6, ((Long) this.f26726c[i4]).longValue());
            } else if (i7 == 2) {
                i = C11197l3.m35561c(i6, (C11342v2) this.f26726c[i4]);
            } else if (i7 == 3) {
                i = (C11197l3.m35567e(i6) << 1) + ((C11400z6) this.f26726c[i4]).mo29203b();
            } else if (i7 == 5) {
                i = C11197l3.m35583i(i6, ((Integer) this.f26726c[i4]).intValue());
            } else {
                throw new IllegalStateException(C11258p4.m35935f());
            }
            i3 += i;
        }
        this.f26727d = i3;
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29201a(C11333u7 u7Var) throws IOException {
        if (u7Var.mo28745a() == C11094d.f26173l) {
            for (int i = this.f26724a - 1; i >= 0; i--) {
                u7Var.mo28752a(this.f26725b[i] >>> 3, this.f26726c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f26724a; i2++) {
            u7Var.mo28752a(this.f26725b[i2] >>> 3, this.f26726c[i2]);
        }
    }

    /* renamed from: a */
    private static void m36842a(int i, Object obj, C11333u7 u7Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            u7Var.mo28770d(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            u7Var.mo28767c(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            u7Var.mo28751a(i2, (C11342v2) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                u7Var.mo28766c(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C11258p4.m35935f());
        } else if (u7Var.mo28745a() == C11094d.f26172k) {
            u7Var.mo28746a(i2);
            ((C11400z6) obj).mo29204b(u7Var);
            u7Var.mo28759b(i2);
        } else {
            u7Var.mo28759b(i2);
            ((C11400z6) obj).mo29204b(u7Var);
            u7Var.mo28746a(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29202a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f26724a; i2++) {
            C11273q5.m35967a(sb, i, String.valueOf(this.f26725b[i2] >>> 3), this.f26726c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29200a(int i, Object obj) {
        if (this.f26728e) {
            int i2 = this.f26724a;
            if (i2 == this.f26725b.length) {
                int i3 = this.f26724a + (i2 < 4 ? 8 : i2 >> 1);
                this.f26725b = Arrays.copyOf(this.f26725b, i3);
                this.f26726c = Arrays.copyOf(this.f26726c, i3);
            }
            int[] iArr = this.f26725b;
            int i4 = this.f26724a;
            iArr[i4] = i;
            this.f26726c[i4] = obj;
            this.f26724a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
