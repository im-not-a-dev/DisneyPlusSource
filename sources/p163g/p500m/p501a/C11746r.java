package p163g.p500m.p501a;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: g.m.a.r */
/* compiled from: JsonValueWriter */
final class C11746r extends C11747s {

    /* renamed from: c0 */
    Object[] f27339c0 = new Object[32];

    /* renamed from: d0 */
    private String f27340d0;

    C11746r() {
        mo29810b(6);
    }

    /* renamed from: a */
    public C11747s mo29787a() throws IOException {
        if (!this.f27347a0) {
            int i = this.f27349c;
            int i2 = this.f27348b0;
            if (i == i2 && this.f27341U[i - 1] == 1) {
                this.f27348b0 = ~i2;
                return this;
            }
            mo29813c();
            ArrayList arrayList = new ArrayList();
            m37803a((Object) arrayList);
            Object[] objArr = this.f27339c0;
            int i3 = this.f27349c;
            objArr[i3] = arrayList;
            this.f27343W[i3] = 0;
            mo29810b(1);
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
            int i = this.f27349c;
            int i2 = this.f27348b0;
            if (i == i2 && this.f27341U[i - 1] == 3) {
                this.f27348b0 = ~i2;
                return this;
            }
            mo29813c();
            C11748t tVar = new C11748t();
            m37803a((Object) tVar);
            this.f27339c0[this.f27349c] = tVar;
            mo29810b(3);
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
            m37803a((Object) Boolean.valueOf(z));
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
        int i = this.f27349c;
        if (i > 1 || (i == 1 && this.f27341U[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f27349c = 0;
    }

    /* renamed from: d */
    public C11747s mo29794d() throws IOException {
        if (mo29817j() == 1) {
            int i = this.f27349c;
            int i2 = this.f27348b0;
            if (i == (~i2)) {
                this.f27348b0 = ~i2;
                return this;
            }
            this.f27349c = i - 1;
            Object[] objArr = this.f27339c0;
            int i3 = this.f27349c;
            objArr[i3] = null;
            int[] iArr = this.f27343W;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: e */
    public C11747s mo29795e() throws IOException {
        if (mo29817j() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f27340d0 == null) {
            int i = this.f27349c;
            int i2 = this.f27348b0;
            if (i == (~i2)) {
                this.f27348b0 = ~i2;
                return this;
            }
            this.f27347a0 = false;
            this.f27349c = i - 1;
            Object[] objArr = this.f27339c0;
            int i3 = this.f27349c;
            objArr[i3] = null;
            this.f27342V[i3] = null;
            int[] iArr = this.f27343W;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f27340d0);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void flush() throws IOException {
        if (this.f27349c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: g */
    public C11747s mo29799g(String str) throws IOException {
        if (this.f27347a0) {
            mo29796e(str);
            return this;
        }
        m37803a((Object) str);
        int[] iArr = this.f27343W;
        int i = this.f27349c - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: i */
    public C11747s mo29800i() throws IOException {
        if (!this.f27347a0) {
            m37803a((Object) null);
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

    /* renamed from: l */
    public Object mo29808l() {
        int i = this.f27349c;
        if (i <= 1 && (i != 1 || this.f27341U[i - 1] == 7)) {
            return this.f27339c0[0];
        }
        throw new IllegalStateException("Incomplete document");
    }

    /* renamed from: a */
    public C11747s mo29788a(double d) throws IOException {
        if (!this.f27345Y && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f27347a0) {
            mo29796e(Double.toString(d));
            return this;
        } else {
            m37803a((Object) Double.valueOf(d));
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: e */
    public C11747s mo29796e(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f27349c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo29817j() == 3 && this.f27340d0 == null) {
            this.f27340d0 = str;
            this.f27342V[this.f27349c - 1] = str;
            this.f27347a0 = false;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: a */
    public C11747s mo29789a(long j) throws IOException {
        if (this.f27347a0) {
            mo29796e(Long.toString(j));
            return this;
        }
        m37803a((Object) Long.valueOf(j));
        int[] iArr = this.f27343W;
        int i = this.f27349c - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    public C11747s mo29790a(Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            mo29789a(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            mo29788a(number.doubleValue());
            return this;
        } else if (number == null) {
            mo29800i();
            return this;
        } else {
            if (number instanceof BigDecimal) {
                bigDecimal = (BigDecimal) number;
            } else {
                bigDecimal = new BigDecimal(number.toString());
            }
            if (this.f27347a0) {
                mo29796e(bigDecimal.toString());
                return this;
            }
            m37803a((Object) bigDecimal);
            int[] iArr = this.f27343W;
            int i = this.f27349c - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    private C11746r m37803a(Object obj) {
        int j = mo29817j();
        int i = this.f27349c;
        if (i == 1) {
            if (j == 6) {
                this.f27341U[i - 1] = 7;
                this.f27339c0[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (j == 3 && this.f27340d0 != null) {
            if (obj != null || this.f27346Z) {
                Object put = ((Map) this.f27339c0[this.f27349c - 1]).put(this.f27340d0, obj);
                if (put != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Map key '");
                    sb.append(this.f27340d0);
                    sb.append("' has multiple values at path ");
                    sb.append(mo29818j0());
                    sb.append(": ");
                    sb.append(put);
                    sb.append(" and ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f27340d0 = null;
        } else if (j == 1) {
            ((List) this.f27339c0[this.f27349c - 1]).add(obj);
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
        return this;
    }
}
