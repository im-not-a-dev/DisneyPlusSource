package p163g.p500m.p501a;

import java.io.IOException;
import okio.C14280f;

/* renamed from: g.m.a.p */
/* compiled from: JsonUtf8Writer */
final class C11743p extends C11747s {

    /* renamed from: f0 */
    private static final String[] f27330f0 = new String[128];

    /* renamed from: c0 */
    private final C14280f f27331c0;

    /* renamed from: d0 */
    private String f27332d0 = ":";

    /* renamed from: e0 */
    private String f27333e0;

    static {
        for (int i = 0; i <= 31; i++) {
            f27330f0[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f27330f0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C11743p(C14280f fVar) {
        if (fVar != null) {
            this.f27331c0 = fVar;
            mo29810b(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: l */
    private void m37766l() throws IOException {
        int j = mo29817j();
        if (j == 5) {
            this.f27331c0.writeByte(44);
        } else if (j != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m37768n();
        mo29812c(4);
    }

    /* renamed from: m */
    private void m37767m() throws IOException {
        int j = mo29817j();
        if (j == 1) {
            mo29812c(2);
            m37768n();
        } else if (j == 2) {
            this.f27331c0.writeByte(44);
            m37768n();
        } else if (j != 4) {
            if (j != 6) {
                if (j != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f27345Y) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo29812c(7);
        } else {
            this.f27331c0.mo36301a(this.f27332d0);
            mo29812c(5);
        }
    }

    /* renamed from: n */
    private void m37768n() throws IOException {
        if (this.f27344X != null) {
            this.f27331c0.writeByte(10);
            int i = this.f27349c;
            for (int i2 = 1; i2 < i; i2++) {
                this.f27331c0.mo36301a(this.f27344X);
            }
        }
    }

    /* renamed from: o */
    private void m37769o() throws IOException {
        if (this.f27333e0 != null) {
            m37766l();
            m37764a(this.f27331c0, this.f27333e0);
            this.f27333e0 = null;
        }
    }

    /* renamed from: a */
    public C11747s mo29787a() throws IOException {
        if (!this.f27347a0) {
            m37769o();
            m37765b(1, 2, "[");
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Array cannot be used as a map key in JSON at path ");
        sb.append(mo29818j0());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public C11747s mo29791b() throws IOException {
        if (!this.f27347a0) {
            m37769o();
            m37765b(3, 5, "{");
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Object cannot be used as a map key in JSON at path ");
        sb.append(mo29818j0());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public C11747s mo29792c(boolean z) throws IOException {
        if (!this.f27347a0) {
            m37769o();
            m37767m();
            this.f27331c0.mo36301a(z ? "true" : "false");
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Boolean cannot be used as a map key in JSON at path ");
        sb.append(mo29818j0());
        throw new IllegalStateException(sb.toString());
    }

    public void close() throws IOException {
        this.f27331c0.close();
        int i = this.f27349c;
        if (i > 1 || (i == 1 && this.f27341U[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f27349c = 0;
    }

    /* renamed from: d */
    public C11747s mo29794d() throws IOException {
        m37763a(1, 2, "]");
        return this;
    }

    /* renamed from: e */
    public C11747s mo29795e() throws IOException {
        this.f27347a0 = false;
        m37763a(3, 5, "}");
        return this;
    }

    /* renamed from: f */
    public void mo29797f(String str) {
        super.mo29797f(str);
        this.f27332d0 = !str.isEmpty() ? ": " : ":";
    }

    public void flush() throws IOException {
        if (this.f27349c != 0) {
            this.f27331c0.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public C11747s mo29799g(String str) throws IOException {
        if (str == null) {
            mo29800i();
            return this;
        } else if (this.f27347a0) {
            mo29796e(str);
            return this;
        } else {
            m37769o();
            m37767m();
            m37764a(this.f27331c0, str);
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: i */
    public C11747s mo29800i() throws IOException {
        if (!this.f27347a0) {
            if (this.f27333e0 != null) {
                if (this.f27346Z) {
                    m37769o();
                } else {
                    this.f27333e0 = null;
                    return this;
                }
            }
            m37767m();
            this.f27331c0.mo36301a("null");
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null cannot be used as a map key in JSON at path ");
        sb.append(mo29818j0());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public C11747s mo29796e(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f27349c != 0) {
            int j = mo29817j();
            if ((j == 3 || j == 5) && this.f27333e0 == null) {
                this.f27333e0 = str;
                this.f27342V[this.f27349c - 1] = str;
                this.f27347a0 = false;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    private C11747s m37763a(int i, int i2, String str) throws IOException {
        int j = mo29817j();
        if (j != i2 && j != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f27333e0 == null) {
            int i3 = this.f27349c;
            int i4 = this.f27348b0;
            if (i3 == (~i4)) {
                this.f27348b0 = ~i4;
                return this;
            }
            this.f27349c = i3 - 1;
            String[] strArr = this.f27342V;
            int i5 = this.f27349c;
            strArr[i5] = null;
            int[] iArr = this.f27343W;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (j == i2) {
                m37768n();
            }
            this.f27331c0.mo36301a(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f27333e0);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private C11747s m37765b(int i, int i2, String str) throws IOException {
        int i3 = this.f27349c;
        if (i3 == this.f27348b0) {
            int[] iArr = this.f27341U;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f27348b0 = ~this.f27348b0;
                return this;
            }
        }
        m37767m();
        mo29813c();
        mo29810b(i);
        this.f27343W[this.f27349c - 1] = 0;
        this.f27331c0.mo36301a(str);
        return this;
    }

    /* renamed from: a */
    public C11747s mo29788a(double d) throws IOException {
        if (!this.f27345Y && (Double.isNaN(d) || Double.isInfinite(d))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f27347a0) {
            mo29796e(Double.toString(d));
            return this;
        } else {
            m37769o();
            m37767m();
            this.f27331c0.mo36301a(Double.toString(d));
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public C11747s mo29789a(long j) throws IOException {
        if (this.f27347a0) {
            mo29796e(Long.toString(j));
            return this;
        }
        m37769o();
        m37767m();
        this.f27331c0.mo36301a(Long.toString(j));
        int[] iArr = this.f27343W;
        int i = this.f27349c - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C11747s mo29790a(Number number) throws IOException {
        if (number == null) {
            mo29800i();
            return this;
        }
        String obj = number.toString();
        if (!this.f27345Y && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(number);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f27347a0) {
            mo29796e(obj);
            return this;
        } else {
            m37769o();
            m37767m();
            this.f27331c0.mo36301a(obj);
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    static void m37764a(C14280f fVar, String str) throws IOException {
        String str2;
        String[] strArr = f27330f0;
        fVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                fVar.mo36302a(str, i, i2);
            }
            fVar.mo36301a(str2);
            i = i2 + 1;
        }
        if (i < length) {
            fVar.mo36302a(str, i, length);
        }
        fVar.writeByte(34);
    }
}
