package p163g.p449j.p487c.p490y.p491l;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import p163g.p449j.p487c.C11556i;
import p163g.p449j.p487c.C11561n;
import p163g.p449j.p487c.C11562o;
import p163g.p449j.p487c.C11564q;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;

/* renamed from: g.j.c.y.l.e */
/* compiled from: JsonTreeReader */
public final class C11628e extends C11533a {

    /* renamed from: n0 */
    private static final Object f27103n0 = new Object();

    /* renamed from: j0 */
    private Object[] f27104j0;

    /* renamed from: k0 */
    private int f27105k0;

    /* renamed from: l0 */
    private String[] f27106l0;

    /* renamed from: m0 */
    private int[] f27107m0;

    /* renamed from: g.j.c.y.l.e$a */
    /* compiled from: JsonTreeReader */
    static class C11629a extends Reader {
        C11629a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C11629a();
    }

    /* renamed from: h */
    private String m37429h() {
        StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(mo29474j0());
        return sb.toString();
    }

    /* renamed from: r */
    private Object m37430r() {
        return this.f27104j0[this.f27105k0 - 1];
    }

    /* renamed from: s */
    private Object m37431s() {
        Object[] objArr = this.f27104j0;
        int i = this.f27105k0 - 1;
        this.f27105k0 = i;
        Object obj = objArr[i];
        objArr[this.f27105k0] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo29462a() throws IOException {
        m37427a(C11535b.BEGIN_ARRAY);
        m37428a((Object) ((C11556i) m37430r()).iterator());
        this.f27107m0[this.f27105k0 - 1] = 0;
    }

    /* renamed from: b */
    public void mo29464b() throws IOException {
        m37427a(C11535b.BEGIN_OBJECT);
        m37428a((Object) ((C11562o) m37430r()).mo29551i().iterator());
    }

    public void close() throws IOException {
        this.f27104j0 = new Object[]{f27103n0};
        this.f27105k0 = 1;
    }

    /* renamed from: d */
    public void mo29467d() throws IOException {
        m37427a(C11535b.END_ARRAY);
        m37431s();
        m37431s();
        int i = this.f27105k0;
        if (i > 0) {
            int[] iArr = this.f27107m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo29468e() throws IOException {
        m37427a(C11535b.END_OBJECT);
        m37431s();
        m37431s();
        int i = this.f27105k0;
        if (i > 0) {
            int[] iArr = this.f27107m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public boolean mo29469f() throws IOException {
        C11535b peek = peek();
        return (peek == C11535b.END_OBJECT || peek == C11535b.END_ARRAY) ? false : true;
    }

    /* renamed from: i */
    public boolean mo29472i() throws IOException {
        m37427a(C11535b.BOOLEAN);
        boolean i = ((C11564q) m37431s()).mo29555i();
        int i2 = this.f27105k0;
        if (i2 > 0) {
            int[] iArr = this.f27107m0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return i;
    }

    /* renamed from: j */
    public double mo29473j() throws IOException {
        C11535b peek = peek();
        if (peek == C11535b.NUMBER || peek == C11535b.STRING) {
            double k = ((C11564q) m37430r()).mo29557k();
            if (mo29470g() || (!Double.isNaN(k) && !Double.isInfinite(k))) {
                m37431s();
                int i = this.f27105k0;
                if (i > 0) {
                    int[] iArr = this.f27107m0;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return k;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(k);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(C11535b.NUMBER);
        sb2.append(" but was ");
        sb2.append(peek);
        sb2.append(m37429h());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: j0 */
    public String mo29474j0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f27105k0) {
            Object[] objArr = this.f27104j0;
            if (objArr[i] instanceof C11556i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f27107m0[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C11562o) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f27106l0;
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
    public int mo29475k() throws IOException {
        C11535b peek = peek();
        if (peek == C11535b.NUMBER || peek == C11535b.STRING) {
            int l = ((C11564q) m37430r()).mo29558l();
            m37431s();
            int i = this.f27105k0;
            if (i > 0) {
                int[] iArr = this.f27107m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return l;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11535b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m37429h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public long mo29476l() throws IOException {
        C11535b peek = peek();
        if (peek == C11535b.NUMBER || peek == C11535b.STRING) {
            long m = ((C11564q) m37430r()).mo29559m();
            m37431s();
            int i = this.f27105k0;
            if (i > 0) {
                int[] iArr = this.f27107m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return m;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11535b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m37429h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public String mo29477m() throws IOException {
        m37427a(C11535b.NAME);
        Entry entry = (Entry) ((Iterator) m37430r()).next();
        String str = (String) entry.getKey();
        this.f27106l0[this.f27105k0 - 1] = str;
        m37428a(entry.getValue());
        return str;
    }

    /* renamed from: n */
    public void mo29478n() throws IOException {
        m37427a(C11535b.NULL);
        m37431s();
        int i = this.f27105k0;
        if (i > 0) {
            int[] iArr = this.f27107m0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: o */
    public String mo29479o() throws IOException {
        C11535b peek = peek();
        if (peek == C11535b.STRING || peek == C11535b.NUMBER) {
            String o = ((C11564q) m37431s()).mo29561o();
            int i = this.f27105k0;
            if (i > 0) {
                int[] iArr = this.f27107m0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11535b.STRING);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m37429h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public void mo29480p() throws IOException {
        String str = "null";
        if (peek() == C11535b.NAME) {
            mo29477m();
            this.f27106l0[this.f27105k0 - 2] = str;
        } else {
            m37431s();
            int i = this.f27105k0;
            if (i > 0) {
                this.f27106l0[i - 1] = str;
            }
        }
        int i2 = this.f27105k0;
        if (i2 > 0) {
            int[] iArr = this.f27107m0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public C11535b peek() throws IOException {
        if (this.f27105k0 == 0) {
            return C11535b.END_DOCUMENT;
        }
        Object r = m37430r();
        if (r instanceof Iterator) {
            boolean z = this.f27104j0[this.f27105k0 - 2] instanceof C11562o;
            Iterator it = (Iterator) r;
            if (!it.hasNext()) {
                return z ? C11535b.END_OBJECT : C11535b.END_ARRAY;
            } else if (z) {
                return C11535b.NAME;
            } else {
                m37428a(it.next());
                return peek();
            }
        } else if (r instanceof C11562o) {
            return C11535b.BEGIN_OBJECT;
        } else {
            if (r instanceof C11556i) {
                return C11535b.BEGIN_ARRAY;
            }
            if (r instanceof C11564q) {
                C11564q qVar = (C11564q) r;
                if (qVar.mo29564r()) {
                    return C11535b.STRING;
                }
                if (qVar.mo29562p()) {
                    return C11535b.BOOLEAN;
                }
                if (qVar.mo29563q()) {
                    return C11535b.NUMBER;
                }
                throw new AssertionError();
            } else if (r instanceof C11561n) {
                return C11535b.NULL;
            } else {
                if (r == f27103n0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: q */
    public void mo29653q() throws IOException {
        m37427a(C11535b.NAME);
        Entry entry = (Entry) ((Iterator) m37430r()).next();
        m37428a(entry.getValue());
        m37428a((Object) new C11564q((String) entry.getKey()));
    }

    public String toString() {
        return C11628e.class.getSimpleName();
    }

    /* renamed from: a */
    private void m37427a(C11535b bVar) throws IOException {
        if (peek() != bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(peek());
            sb.append(m37429h());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m37428a(Object obj) {
        int i = this.f27105k0;
        Object[] objArr = this.f27104j0;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f27107m0, 0, iArr, 0, this.f27105k0);
            System.arraycopy(this.f27106l0, 0, strArr, 0, this.f27105k0);
            this.f27104j0 = objArr2;
            this.f27107m0 = iArr;
            this.f27106l0 = strArr;
        }
        Object[] objArr3 = this.f27104j0;
        int i2 = this.f27105k0;
        this.f27105k0 = i2 + 1;
        objArr3[i2] = obj;
    }
}
