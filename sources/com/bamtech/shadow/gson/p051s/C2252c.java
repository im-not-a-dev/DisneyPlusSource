package com.bamtech.shadow.gson.p051s;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.bamtech.shadow.gson.s.c */
/* compiled from: JsonWriter */
public class C2252c implements Closeable, Flushable {

    /* renamed from: c0 */
    private static final String[] f6369c0 = new String[128];

    /* renamed from: d0 */
    private static final String[] f6370d0;

    /* renamed from: U */
    private int[] f6371U = new int[32];

    /* renamed from: V */
    private int f6372V = 0;

    /* renamed from: W */
    private String f6373W;

    /* renamed from: X */
    private String f6374X;

    /* renamed from: Y */
    private boolean f6375Y;

    /* renamed from: Z */
    private boolean f6376Z;

    /* renamed from: a0 */
    private String f6377a0;

    /* renamed from: b0 */
    private boolean f6378b0;

    /* renamed from: c */
    private final Writer f6379c;

    static {
        for (int i = 0; i <= 31; i++) {
            f6369c0[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f6369c0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f6370d0 = (String[]) strArr.clone();
        String[] strArr2 = f6370d0;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2252c(Writer writer) {
        m8641b(6);
        this.f6374X = ":";
        this.f6378b0 = true;
        if (writer != null) {
            this.f6379c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: i */
    private void mo11194i() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.f6379c.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m8646k();
        m8642c(4);
    }

    /* renamed from: j */
    private void m8645j() throws IOException {
        int peek = peek();
        if (peek == 1) {
            m8642c(2);
            m8646k();
        } else if (peek == 2) {
            this.f6379c.append(',');
            m8646k();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f6375Y) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m8642c(7);
        } else {
            this.f6379c.append(this.f6374X);
            m8642c(5);
        }
    }

    /* renamed from: k */
    private void m8646k() throws IOException {
        if (this.f6373W != null) {
            this.f6379c.write("\n");
            int i = this.f6372V;
            for (int i2 = 1; i2 < i; i2++) {
                this.f6379c.write(this.f6373W);
            }
        }
    }

    /* renamed from: l */
    private void m8647l() throws IOException {
        if (this.f6377a0 != null) {
            mo11194i();
            m8643h(this.f6377a0);
            this.f6377a0 = null;
        }
    }

    private int peek() {
        int i = this.f6372V;
        if (i != 0) {
            return this.f6371U[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    public final void mo11289a(boolean z) {
        this.f6376Z = z;
    }

    /* renamed from: b */
    public final void mo11290b(boolean z) {
        this.f6375Y = z;
    }

    /* renamed from: c */
    public final void mo11291c(boolean z) {
        this.f6378b0 = z;
    }

    public void close() throws IOException {
        this.f6379c.close();
        int i = this.f6372V;
        if (i > 1 || (i == 1 && this.f6371U[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6372V = 0;
    }

    /* renamed from: d */
    public C2252c mo11188d() throws IOException {
        m8639a(3, 5, "}");
        return this;
    }

    /* renamed from: e */
    public final boolean mo11292e() {
        return this.f6378b0;
    }

    /* renamed from: f */
    public final void mo11293f(String str) {
        if (str.length() == 0) {
            this.f6373W = null;
            this.f6374X = ":";
            return;
        }
        this.f6373W = str;
        this.f6374X = ": ";
    }

    public void flush() throws IOException {
        if (this.f6372V != 0) {
            this.f6379c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo11295g() {
        return this.f6375Y;
    }

    /* renamed from: h */
    public C2252c mo11193h() throws IOException {
        if (this.f6377a0 != null) {
            if (this.f6378b0) {
                m8647l();
            } else {
                this.f6377a0 = null;
                return this;
            }
        }
        m8645j();
        this.f6379c.write("null");
        return this;
    }

    /* renamed from: a */
    public C2252c mo11181a() throws IOException {
        m8647l();
        m8640b(1, "[");
        return this;
    }

    /* renamed from: b */
    public C2252c mo11185b() throws IOException {
        m8647l();
        m8640b(3, "{");
        return this;
    }

    /* renamed from: c */
    public C2252c mo11186c() throws IOException {
        m8639a(1, 2, "]");
        return this;
    }

    /* renamed from: d */
    public C2252c mo11189d(boolean z) throws IOException {
        m8647l();
        m8645j();
        this.f6379c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: e */
    public C2252c mo11190e(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f6377a0 != null) {
            throw new IllegalStateException();
        } else if (this.f6372V != 0) {
            this.f6377a0 = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: g */
    public C2252c mo11192g(String str) throws IOException {
        if (str == null) {
            return mo11193h();
        }
        m8647l();
        m8645j();
        m8643h(str);
        return this;
    }

    /* renamed from: c */
    private void m8642c(int i) {
        this.f6371U[this.f6372V - 1] = i;
    }

    /* renamed from: a */
    private C2252c m8639a(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f6377a0 == null) {
            this.f6372V--;
            if (peek == i2) {
                m8646k();
            }
            this.f6379c.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f6377a0);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private C2252c m8640b(int i, String str) throws IOException {
        m8645j();
        m8641b(i);
        this.f6379c.write(str);
        return this;
    }

    /* renamed from: f */
    public final boolean mo11294f() {
        return this.f6376Z;
    }

    /* renamed from: b */
    private void m8641b(int i) {
        int i2 = this.f6372V;
        int[] iArr = this.f6371U;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f6371U = iArr2;
        }
        int[] iArr3 = this.f6371U;
        int i3 = this.f6372V;
        this.f6372V = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: h */
    private void m8643h(String str) throws IOException {
        String str2;
        String[] strArr = this.f6376Z ? f6370d0 : f6369c0;
        String str3 = "\"";
        this.f6379c.write(str3);
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
                this.f6379c.write(str, i, i2 - i);
            }
            this.f6379c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f6379c.write(str, i, length - i);
        }
        this.f6379c.write(str3);
    }

    /* renamed from: a */
    public C2252c mo11183a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo11193h();
        }
        m8647l();
        m8645j();
        this.f6379c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C2252c mo11182a(long j) throws IOException {
        m8647l();
        m8645j();
        this.f6379c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C2252c mo11184a(Number number) throws IOException {
        if (number == null) {
            return mo11193h();
        }
        m8647l();
        String obj = number.toString();
        if (this.f6375Y || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m8645j();
            this.f6379c.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }
}
