package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2131g;
import com.bamtech.shadow.gson.C2233j;
import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonObject;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.bamtech.shadow.gson.internal.bind.a */
/* compiled from: JsonTreeReader */
public final class C2192a extends C2249a {

    /* renamed from: n0 */
    private static final Reader f6277n0 = new C2193a();

    /* renamed from: o0 */
    private static final Object f6278o0 = new Object();

    /* renamed from: j0 */
    private Object[] f6279j0 = new Object[32];

    /* renamed from: k0 */
    private int f6280k0 = 0;

    /* renamed from: l0 */
    private String[] f6281l0 = new String[32];

    /* renamed from: m0 */
    private int[] f6282m0 = new int[32];

    /* renamed from: com.bamtech.shadow.gson.internal.bind.a$a */
    /* compiled from: JsonTreeReader */
    static class C2193a extends Reader {
        C2193a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C2192a(JsonElement jsonElement) {
        super(f6277n0);
        m8497a((Object) jsonElement);
    }

    /* renamed from: h */
    private String m8498h() {
        StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(mo11169j0());
        return sb.toString();
    }

    /* renamed from: r */
    private Object m8499r() {
        return this.f6279j0[this.f6280k0 - 1];
    }

    /* renamed from: s */
    private Object m8500s() {
        Object[] objArr = this.f6279j0;
        int i = this.f6280k0 - 1;
        this.f6280k0 = i;
        Object obj = objArr[i];
        objArr[this.f6280k0] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo11161a() throws IOException {
        m8496a(C2251b.BEGIN_ARRAY);
        m8497a((Object) ((C2131g) m8499r()).iterator());
        this.f6282m0[this.f6280k0 - 1] = 0;
    }

    /* renamed from: b */
    public void mo11162b() throws IOException {
        m8496a(C2251b.BEGIN_OBJECT);
        m8497a((Object) ((JsonObject) m8499r()).mo11086j().iterator());
    }

    public void close() throws IOException {
        this.f6279j0 = new Object[]{f6278o0};
        this.f6280k0 = 1;
    }

    /* renamed from: d */
    public void mo11164d() throws IOException {
        m8496a(C2251b.END_ARRAY);
        m8500s();
        m8500s();
        int i = this.f6280k0;
        if (i > 0) {
            int[] iArr = this.f6282m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo11165e() throws IOException {
        m8496a(C2251b.END_OBJECT);
        m8500s();
        m8500s();
        int i = this.f6280k0;
        if (i > 0) {
            int[] iArr = this.f6282m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public boolean mo11166f() throws IOException {
        C2251b peek = peek();
        return (peek == C2251b.END_OBJECT || peek == C2251b.END_ARRAY) ? false : true;
    }

    /* renamed from: i */
    public boolean mo11167i() throws IOException {
        m8496a(C2251b.BOOLEAN);
        boolean j = ((C2235l) m8500s()).mo11260j();
        int i = this.f6280k0;
        if (i > 0) {
            int[] iArr = this.f6282m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    /* renamed from: j */
    public double mo11168j() throws IOException {
        C2251b peek = peek();
        if (peek == C2251b.NUMBER || peek == C2251b.STRING) {
            double l = ((C2235l) m8499r()).mo11262l();
            if (mo11287g() || (!Double.isNaN(l) && !Double.isInfinite(l))) {
                m8500s();
                int i = this.f6280k0;
                if (i > 0) {
                    int[] iArr = this.f6282m0;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return l;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(l);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(C2251b.NUMBER);
        sb2.append(" but was ");
        sb2.append(peek);
        sb2.append(m8498h());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: j0 */
    public String mo11169j0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f6280k0) {
            Object[] objArr = this.f6279j0;
            if (objArr[i] instanceof C2131g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f6282m0[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f6281l0;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: k */
    public int mo11170k() throws IOException {
        C2251b peek = peek();
        if (peek == C2251b.NUMBER || peek == C2251b.STRING) {
            int m = ((C2235l) m8499r()).mo11263m();
            m8500s();
            int i = this.f6280k0;
            if (i > 0) {
                int[] iArr = this.f6282m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return m;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C2251b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m8498h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public long mo11171l() throws IOException {
        C2251b peek = peek();
        if (peek == C2251b.NUMBER || peek == C2251b.STRING) {
            long n = ((C2235l) m8499r()).mo11264n();
            m8500s();
            int i = this.f6280k0;
            if (i > 0) {
                int[] iArr = this.f6282m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C2251b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m8498h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public String mo11172m() throws IOException {
        m8496a(C2251b.NAME);
        Entry entry = (Entry) ((Iterator) m8499r()).next();
        String str = (String) entry.getKey();
        this.f6281l0[this.f6280k0 - 1] = str;
        m8497a(entry.getValue());
        return str;
    }

    /* renamed from: n */
    public void mo11173n() throws IOException {
        m8496a(C2251b.NULL);
        m8500s();
        int i = this.f6280k0;
        if (i > 0) {
            int[] iArr = this.f6282m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: o */
    public String mo11174o() throws IOException {
        C2251b peek = peek();
        if (peek == C2251b.STRING || peek == C2251b.NUMBER) {
            String e = ((C2235l) m8500s()).mo11074e();
            int i = this.f6280k0;
            if (i > 0) {
                int[] iArr = this.f6282m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C2251b.STRING);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m8498h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public void mo11175p() throws IOException {
        String str = "null";
        if (peek() == C2251b.NAME) {
            mo11172m();
            this.f6281l0[this.f6280k0 - 2] = str;
        } else {
            m8500s();
            int i = this.f6280k0;
            if (i > 0) {
                this.f6281l0[i - 1] = str;
            }
        }
        int i2 = this.f6280k0;
        if (i2 > 0) {
            int[] iArr = this.f6282m0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public C2251b peek() throws IOException {
        if (this.f6280k0 == 0) {
            return C2251b.END_DOCUMENT;
        }
        Object r = m8499r();
        if (r instanceof Iterator) {
            boolean z = this.f6279j0[this.f6280k0 - 2] instanceof JsonObject;
            Iterator it = (Iterator) r;
            if (!it.hasNext()) {
                return z ? C2251b.END_OBJECT : C2251b.END_ARRAY;
            } else if (z) {
                return C2251b.NAME;
            } else {
                m8497a(it.next());
                return peek();
            }
        } else if (r instanceof JsonObject) {
            return C2251b.BEGIN_OBJECT;
        } else {
            if (r instanceof C2131g) {
                return C2251b.BEGIN_ARRAY;
            }
            if (r instanceof C2235l) {
                C2235l lVar = (C2235l) r;
                if (lVar.mo11268r()) {
                    return C2251b.STRING;
                }
                if (lVar.mo11266p()) {
                    return C2251b.BOOLEAN;
                }
                if (lVar.mo11267q()) {
                    return C2251b.NUMBER;
                }
                throw new AssertionError();
            } else if (r instanceof C2233j) {
                return C2251b.NULL;
            } else {
                if (r == f6278o0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: q */
    public void mo11177q() throws IOException {
        m8496a(C2251b.NAME);
        Entry entry = (Entry) ((Iterator) m8499r()).next();
        m8497a(entry.getValue());
        m8497a((Object) new C2235l((String) entry.getKey()));
    }

    public String toString() {
        return C2192a.class.getSimpleName();
    }

    /* renamed from: a */
    private void m8496a(C2251b bVar) throws IOException {
        if (peek() != bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(peek());
            sb.append(m8498h());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m8497a(Object obj) {
        int i = this.f6280k0;
        Object[] objArr = this.f6279j0;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f6282m0, 0, iArr, 0, this.f6280k0);
            System.arraycopy(this.f6281l0, 0, strArr, 0, this.f6280k0);
            this.f6279j0 = objArr2;
            this.f6282m0 = iArr;
            this.f6281l0 = strArr;
        }
        Object[] objArr3 = this.f6279j0;
        int i2 = this.f6280k0;
        this.f6280k0 = i2 + 1;
        objArr3[i2] = obj;
    }
}
