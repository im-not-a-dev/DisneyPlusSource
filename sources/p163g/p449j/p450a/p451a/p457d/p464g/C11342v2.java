package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: g.j.a.a.d.g.v2 */
public abstract class C11342v2 implements Serializable, Iterable<Byte> {

    /* renamed from: U */
    public static final C11342v2 f26574U = new C11110f3(C11111f4.f26199b);

    /* renamed from: V */
    private static final C11039b3 f26575V = (C11242o2.m35820a() ? new C11089e3(null) : new C11396z2(null));

    /* renamed from: c */
    private int f26576c = 0;

    static {
        new C11370x2();
    }

    C11342v2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m36525a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static C11342v2 m36528a(byte[] bArr, int i, int i2) {
        m36530b(i, i + i2, bArr.length);
        return new C11110f3(f26575V.mo28315a(bArr, i, i2));
    }

    /* renamed from: h */
    static C11074d3 m36531h(int i) {
        return new C11074d3(i, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo28509a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C11342v2 mo28510a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo28511a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo28512a(C11299s2 s2Var) throws IOException;

    /* renamed from: b */
    public final String mo29070b() {
        return size() == 0 ? "" : mo28511a(C11111f4.f26198a);
    }

    /* renamed from: c */
    public abstract boolean mo28514c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo29071d() {
        return this.f26576c;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract byte mo28517f(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract byte mo28518g(int i);

    public final int hashCode() {
        int i = this.f26576c;
        if (i == 0) {
            int size = size();
            i = mo28509a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f26576c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C11328u2(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: a */
    static C11342v2 m36527a(byte[] bArr) {
        return new C11110f3(bArr);
    }

    /* renamed from: b */
    static int m36530b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static C11342v2 m36526a(String str) {
        return new C11110f3(str.getBytes(C11111f4.f26198a));
    }
}
