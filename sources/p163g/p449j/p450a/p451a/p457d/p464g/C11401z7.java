package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: g.j.a.a.d.g.z7 */
final class C11401z7 implements Cloneable {

    /* renamed from: U */
    private Object f26729U;

    /* renamed from: V */
    private List<C11129g8> f26730V = new ArrayList();

    /* renamed from: c */
    private C11375x7<?, ?> f26731c;

    C11401z7() {
    }

    /* renamed from: b */
    private final byte[] m36852b() throws IOException {
        byte[] bArr = new byte[mo29208a()];
        mo29210a(C11361w7.m36647b(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C11401z7 clone() {
        C11401z7 z7Var = new C11401z7();
        try {
            z7Var.f26731c = this.f26731c;
            if (this.f26730V == null) {
                z7Var.f26730V = null;
            } else {
                z7Var.f26730V.addAll(this.f26730V);
            }
            if (this.f26729U != null) {
                if (this.f26729U instanceof C11099e8) {
                    z7Var.f26729U = (C11099e8) ((C11099e8) this.f26729U).clone();
                } else if (this.f26729U instanceof byte[]) {
                    z7Var.f26729U = ((byte[]) this.f26729U).clone();
                } else {
                    int i = 0;
                    if (this.f26729U instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f26729U;
                        byte[][] bArr2 = new byte[bArr.length][];
                        z7Var.f26729U = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f26729U instanceof boolean[]) {
                        z7Var.f26729U = ((boolean[]) this.f26729U).clone();
                    } else if (this.f26729U instanceof int[]) {
                        z7Var.f26729U = ((int[]) this.f26729U).clone();
                    } else if (this.f26729U instanceof long[]) {
                        z7Var.f26729U = ((long[]) this.f26729U).clone();
                    } else if (this.f26729U instanceof float[]) {
                        z7Var.f26729U = ((float[]) this.f26729U).clone();
                    } else if (this.f26729U instanceof double[]) {
                        z7Var.f26729U = ((double[]) this.f26729U).clone();
                    } else if (this.f26729U instanceof C11099e8[]) {
                        C11099e8[] e8VarArr = (C11099e8[]) this.f26729U;
                        C11099e8[] e8VarArr2 = new C11099e8[e8VarArr.length];
                        z7Var.f26729U = e8VarArr2;
                        while (i < e8VarArr.length) {
                            e8VarArr2[i] = (C11099e8) e8VarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return z7Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29209a(C11129g8 g8Var) throws IOException {
        List<C11129g8> list = this.f26730V;
        if (list != null) {
            list.add(g8Var);
            return;
        }
        Object obj = this.f26729U;
        if (obj instanceof C11099e8) {
            byte[] bArr = g8Var.f26215b;
            C11318t7 a = C11318t7.m36376a(bArr, 0, bArr.length);
            int e = a.mo29032e();
            if (e == bArr.length - C11361w7.m36648c(e)) {
                C11099e8 a2 = ((C11099e8) this.f26729U).mo28251a(a);
                this.f26731c = this.f26731c;
                this.f26729U = a2;
                this.f26730V = null;
                return;
            }
            throw C11044b8.m34810a();
        } else if (obj instanceof C11099e8[]) {
            Collections.singletonList(g8Var);
            throw new NoSuchMethodError();
        } else if (obj instanceof C11259p5) {
            Collections.singletonList(g8Var);
            throw new NoSuchMethodError();
        } else if (obj instanceof C11259p5[]) {
            Collections.singletonList(g8Var);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(g8Var);
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11401z7)) {
            return false;
        }
        C11401z7 z7Var = (C11401z7) obj;
        if (this.f26729U == null || z7Var.f26729U == null) {
            List<C11129g8> list = this.f26730V;
            if (list != null) {
                List<C11129g8> list2 = z7Var.f26730V;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m36852b(), z7Var.m36852b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            C11375x7<?, ?> x7Var = this.f26731c;
            if (x7Var != z7Var.f26731c) {
                return false;
            }
            if (!x7Var.f26606a.isArray()) {
                return this.f26729U.equals(z7Var.f26729U);
            }
            Object obj2 = this.f26729U;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) z7Var.f26729U);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) z7Var.f26729U);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) z7Var.f26729U);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) z7Var.f26729U);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) z7Var.f26729U);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) z7Var.f26729U);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) z7Var.f26729U);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m36852b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo29208a() {
        if (this.f26729U == null) {
            int i = 0;
            for (C11129g8 g8Var : this.f26730V) {
                i += C11361w7.m36650d(g8Var.f26214a) + 0 + g8Var.f26215b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29210a(C11361w7 w7Var) throws IOException {
        if (this.f26729U == null) {
            for (C11129g8 g8Var : this.f26730V) {
                w7Var.mo29117a(g8Var.f26214a);
                w7Var.mo29124a(g8Var.f26215b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
