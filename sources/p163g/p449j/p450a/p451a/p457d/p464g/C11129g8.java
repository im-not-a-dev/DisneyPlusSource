package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Arrays;

/* renamed from: g.j.a.a.d.g.g8 */
final class C11129g8 {

    /* renamed from: a */
    final int f26214a;

    /* renamed from: b */
    final byte[] f26215b;

    C11129g8(int i, byte[] bArr) {
        this.f26214a = i;
        this.f26215b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11129g8)) {
            return false;
        }
        C11129g8 g8Var = (C11129g8) obj;
        return this.f26214a == g8Var.f26214a && Arrays.equals(this.f26215b, g8Var.f26215b);
    }

    public final int hashCode() {
        return ((this.f26214a + 527) * 31) + Arrays.hashCode(this.f26215b);
    }
}
