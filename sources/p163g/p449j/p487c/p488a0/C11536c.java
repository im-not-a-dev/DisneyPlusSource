package p163g.p449j.p487c.p488a0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: g.j.c.a0.c */
/* compiled from: JsonWriter */
public class C11536c implements Closeable, Flushable {

    /* renamed from: c0 */
    private static final String[] f26974c0 = new String[128];

    /* renamed from: d0 */
    private static final String[] f26975d0;

    /* renamed from: U */
    private int[] f26976U = new int[32];

    /* renamed from: V */
    private int f26977V = 0;

    /* renamed from: W */
    private String f26978W;

    /* renamed from: X */
    private String f26979X;

    /* renamed from: Y */
    private boolean f26980Y;

    /* renamed from: Z */
    private boolean f26981Z;

    /* renamed from: a0 */
    private String f26982a0;

    /* renamed from: b0 */
    private boolean f26983b0;

    /* renamed from: c */
    private final Writer f26984c;

    static {
        for (int i = 0; i <= 31; i++) {
            f26974c0[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f26974c0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f26975d0 = (String[]) strArr.clone();
        String[] strArr2 = f26975d0;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C11536c(Writer writer) {
        m37211b(6);
        this.f26979X = ":";
        this.f26983b0 = true;
        if (writer != null) {
            this.f26984c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: i */
    private void mo29656i() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.f26984c.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m37216k();
        m37212c(4);
    }

    /* renamed from: j */
    private void m37215j() throws IOException {
        int peek = peek();
        if (peek == 1) {
            m37212c(2);
            m37216k();
        } else if (peek == 2) {
            this.f26984c.append(',');
            m37216k();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f26980Y) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m37212c(7);
        } else {
            this.f26984c.append(this.f26979X);
            m37212c(5);
        }
    }

    /* renamed from: k */
    private void m37216k() throws IOException {
        if (this.f26978W != null) {
            this.f26984c.write("\n");
            int i = this.f26977V;
            for (int i2 = 1; i2 < i; i2++) {
                this.f26984c.write(this.f26978W);
            }
        }
    }

    /* renamed from: l */
    private void m37217l() throws IOException {
        if (this.f26982a0 != null) {
            mo29656i();
            m37213h(this.f26982a0);
            this.f26982a0 = null;
        }
    }

    private int peek() {
        int i = this.f26977V;
        if (i != 0) {
            return this.f26976U[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    public final void mo29488a(boolean z) {
        this.f26981Z = z;
    }

    /* renamed from: b */
    public final void mo29490b(boolean z) {
        this.f26980Y = z;
    }

    /* renamed from: c */
    public final void mo29492c(boolean z) {
        this.f26983b0 = z;
    }

    public void close() throws IOException {
        this.f26984c.close();
        int i = this.f26977V;
        if (i > 1 || (i == 1 && this.f26976U[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f26977V = 0;
    }

    /* renamed from: d */
    public C11536c mo29494d() throws IOException {
        m37209a(3, 5, "}");
        return this;
    }

    /* renamed from: e */
    public final boolean mo29497e() {
        return this.f26983b0;
    }

    /* renamed from: f */
    public final void mo29498f(String str) {
        if (str.length() == 0) {
            this.f26978W = null;
            this.f26979X = ":";
            return;
        }
        this.f26978W = str;
        this.f26979X = ": ";
    }

    public void flush() throws IOException {
        if (this.f26977V != 0) {
            this.f26984c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo29502g() {
        return this.f26980Y;
    }

    /* renamed from: h */
    public C11536c mo29503h() throws IOException {
        if (this.f26982a0 != null) {
            if (this.f26983b0) {
                m37217l();
            } else {
                this.f26982a0 = null;
                return this;
            }
        }
        m37215j();
        this.f26984c.write("null");
        return this;
    }

    /* renamed from: a */
    public C11536c mo29484a() throws IOException {
        m37217l();
        m37210b(1, "[");
        return this;
    }

    /* renamed from: b */
    public C11536c mo29489b() throws IOException {
        m37217l();
        m37210b(3, "{");
        return this;
    }

    /* renamed from: c */
    public C11536c mo29491c() throws IOException {
        m37209a(1, 2, "]");
        return this;
    }

    /* renamed from: d */
    public C11536c mo29495d(boolean z) throws IOException {
        m37217l();
        m37215j();
        this.f26984c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: e */
    public C11536c mo29496e(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f26982a0 != null) {
            throw new IllegalStateException();
        } else if (this.f26977V != 0) {
            this.f26982a0 = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: g */
    public C11536c mo29501g(String str) throws IOException {
        if (str == null) {
            return mo29503h();
        }
        m37217l();
        m37215j();
        m37213h(str);
        return this;
    }

    /* renamed from: c */
    private void m37212c(int i) {
        this.f26976U[this.f26977V - 1] = i;
    }

    /* renamed from: a */
    private C11536c m37209a(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f26982a0 == null) {
            this.f26977V--;
            if (peek == i2) {
                m37216k();
            }
            this.f26984c.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f26982a0);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private C11536c m37210b(int i, String str) throws IOException {
        m37215j();
        m37211b(i);
        this.f26984c.write(str);
        return this;
    }

    /* renamed from: f */
    public final boolean mo29499f() {
        return this.f26981Z;
    }

    /* renamed from: b */
    private void m37211b(int i) {
        int i2 = this.f26977V;
        int[] iArr = this.f26976U;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f26976U = iArr2;
        }
        int[] iArr3 = this.f26976U;
        int i3 = this.f26977V;
        this.f26977V = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: h */
    private void m37213h(String str) throws IOException {
        String str2;
        String[] strArr = this.f26981Z ? f26975d0 : f26974c0;
        String str3 = "\"";
        this.f26984c.write(str3);
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
                this.f26984c.write(str, i, i2 - i);
            }
            this.f26984c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f26984c.write(str, i, length - i);
        }
        this.f26984c.write(str3);
    }

    /* renamed from: a */
    public C11536c mo29486a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo29503h();
        }
        m37217l();
        m37215j();
        this.f26984c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C11536c mo29485a(long j) throws IOException {
        m37217l();
        m37215j();
        this.f26984c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C11536c mo29487a(Number number) throws IOException {
        if (number == null) {
            return mo29503h();
        }
        m37217l();
        String obj = number.toString();
        if (this.f26980Y || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m37215j();
            this.f26984c.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }
}
