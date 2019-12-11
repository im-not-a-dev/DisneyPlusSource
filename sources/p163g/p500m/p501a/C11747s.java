package p163g.p500m.p501a;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import okio.C14280f;

/* renamed from: g.m.a.s */
/* compiled from: JsonWriter */
public abstract class C11747s implements Closeable, Flushable {

    /* renamed from: U */
    int[] f27341U = new int[32];

    /* renamed from: V */
    String[] f27342V = new String[32];

    /* renamed from: W */
    int[] f27343W = new int[32];

    /* renamed from: X */
    String f27344X;

    /* renamed from: Y */
    boolean f27345Y;

    /* renamed from: Z */
    boolean f27346Z;

    /* renamed from: a0 */
    boolean f27347a0;

    /* renamed from: b0 */
    int f27348b0 = -1;

    /* renamed from: c */
    int f27349c = 0;

    C11747s() {
    }

    /* renamed from: a */
    public static C11747s m37816a(C14280f fVar) {
        return new C11743p(fVar);
    }

    /* renamed from: a */
    public abstract C11747s mo29787a() throws IOException;

    /* renamed from: a */
    public abstract C11747s mo29788a(double d) throws IOException;

    /* renamed from: a */
    public abstract C11747s mo29789a(long j) throws IOException;

    /* renamed from: a */
    public abstract C11747s mo29790a(Number number) throws IOException;

    /* renamed from: b */
    public abstract C11747s mo29791b() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29810b(int i) {
        int[] iArr = this.f27341U;
        int i2 = this.f27349c;
        this.f27349c = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: c */
    public abstract C11747s mo29792c(boolean z) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo29813c() {
        int i = this.f27349c;
        int[] iArr = this.f27341U;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f27341U = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f27342V;
            this.f27342V = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f27343W;
            this.f27343W = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof C11746r) {
                C11746r rVar = (C11746r) this;
                Object[] objArr = rVar.f27339c0;
                rVar.f27339c0 = Arrays.copyOf(objArr, objArr.length * 2);
            }
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Nesting too deep at ");
        sb.append(mo29818j0());
        sb.append(": circular reference?");
        throw new C11734j(sb.toString());
    }

    /* renamed from: d */
    public abstract C11747s mo29794d() throws IOException;

    /* renamed from: e */
    public abstract C11747s mo29795e() throws IOException;

    /* renamed from: e */
    public abstract C11747s mo29796e(String str) throws IOException;

    /* renamed from: f */
    public void mo29797f(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f27344X = str;
    }

    /* renamed from: g */
    public abstract C11747s mo29799g(String str) throws IOException;

    /* renamed from: g */
    public final boolean mo29815g() {
        return this.f27346Z;
    }

    /* renamed from: h */
    public final boolean mo29816h() {
        return this.f27345Y;
    }

    /* renamed from: i */
    public abstract C11747s mo29800i() throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo29817j() {
        int i = this.f27349c;
        if (i != 0) {
            return this.f27341U[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: j0 */
    public final String mo29818j0() {
        return C11741n.m37730a(this.f27349c, this.f27341U, this.f27342V, this.f27343W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo29819k() throws IOException {
        int j = mo29817j();
        if (j == 5 || j == 3) {
            this.f27347a0 = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: a */
    public final void mo29809a(boolean z) {
        this.f27345Y = z;
    }

    /* renamed from: b */
    public final void mo29811b(boolean z) {
        this.f27346Z = z;
    }

    /* renamed from: f */
    public final String mo29814f() {
        String str = this.f27344X;
        return str != null ? str : "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo29812c(int i) {
        this.f27341U[this.f27349c - 1] = i;
    }
}
