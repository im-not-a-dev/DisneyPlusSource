package p163g.p500m.p501a;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11737m.C11740c;

/* renamed from: g.m.a.q */
/* compiled from: JsonValueReader */
final class C11744q extends C11737m {

    /* renamed from: a0 */
    private static final Object f27334a0 = new Object();

    /* renamed from: Z */
    private Object[] f27335Z = new Object[32];

    /* renamed from: g.m.a.q$a */
    /* compiled from: JsonValueReader */
    static final class C11745a implements Iterator<Object>, Cloneable {

        /* renamed from: U */
        final Object[] f27336U;

        /* renamed from: V */
        int f27337V;

        /* renamed from: c */
        final C11740c f27338c;

        C11745a(C11740c cVar, Object[] objArr, int i) {
            this.f27338c = cVar;
            this.f27336U = objArr;
            this.f27337V = i;
        }

        public boolean hasNext() {
            return this.f27337V < this.f27336U.length;
        }

        public Object next() {
            Object[] objArr = this.f27336U;
            int i = this.f27337V;
            this.f27337V = i + 1;
            return objArr[i];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public C11745a clone() {
            return new C11745a(this.f27338c, this.f27336U, this.f27337V);
        }
    }

    C11744q(Object obj) {
        int[] iArr = this.f27299U;
        int i = this.f27304c;
        iArr[i] = 7;
        Object[] objArr = this.f27335Z;
        this.f27304c = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: s */
    private void m37785s() {
        this.f27304c--;
        Object[] objArr = this.f27335Z;
        int i = this.f27304c;
        objArr[i] = null;
        this.f27299U[i] = 0;
        if (i > 0) {
            int[] iArr = this.f27301W;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m37784a(it.next());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29760a() throws IOException {
        List list = (List) m37782a(List.class, C11740c.BEGIN_ARRAY);
        C11745a aVar = new C11745a(C11740c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f27335Z;
        int i = this.f27304c;
        objArr[i - 1] = aVar;
        this.f27299U[i - 1] = 1;
        this.f27301W[i - 1] = 0;
        if (aVar.hasNext()) {
            m37784a(aVar.next());
        }
    }

    /* renamed from: b */
    public void mo29763b() throws IOException {
        Map map = (Map) m37782a(Map.class, C11740c.BEGIN_OBJECT);
        C11745a aVar = new C11745a(C11740c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f27335Z;
        int i = this.f27304c;
        objArr[i - 1] = aVar;
        this.f27299U[i - 1] = 3;
        if (aVar.hasNext()) {
            m37784a(aVar.next());
        }
    }

    /* renamed from: c */
    public void mo29766c() throws IOException {
        C11745a aVar = (C11745a) m37782a(C11745a.class, C11740c.END_ARRAY);
        if (aVar.f27338c != C11740c.END_ARRAY || aVar.hasNext()) {
            throw mo29759a(aVar, C11740c.END_ARRAY);
        }
        m37785s();
    }

    public void close() throws IOException {
        Arrays.fill(this.f27335Z, 0, this.f27304c, null);
        this.f27335Z[0] = f27334a0;
        this.f27299U[0] = 8;
        this.f27304c = 1;
    }

    /* renamed from: d */
    public void mo29767d() throws IOException {
        C11745a aVar = (C11745a) m37782a(C11745a.class, C11740c.END_OBJECT);
        if (aVar.f27338c != C11740c.END_OBJECT || aVar.hasNext()) {
            throw mo29759a(aVar, C11740c.END_OBJECT);
        }
        this.f27300V[this.f27304c - 1] = null;
        m37785s();
    }

    /* renamed from: f */
    public boolean mo29770f() throws IOException {
        int i = this.f27304c;
        boolean z = false;
        if (i == 0) {
            return false;
        }
        Object obj = this.f27335Z[i - 1];
        if (!(obj instanceof Iterator) || ((Iterator) obj).hasNext()) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo29772h() throws IOException {
        Boolean bool = (Boolean) m37782a(Boolean.class, C11740c.BOOLEAN);
        m37785s();
        return bool.booleanValue();
    }

    /* renamed from: i */
    public double mo29773i() throws IOException {
        double d;
        Object a = m37782a(Object.class, C11740c.NUMBER);
        if (a instanceof Number) {
            d = ((Number) a).doubleValue();
        } else if (a instanceof String) {
            try {
                d = Double.parseDouble((String) a);
            } catch (NumberFormatException unused) {
                throw mo29759a(a, C11740c.NUMBER);
            }
        } else {
            throw mo29759a(a, C11740c.NUMBER);
        }
        if (this.f27302X || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m37785s();
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON forbids NaN and infinities: ");
        sb.append(d);
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11735k(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo29759a(r0, p163g.p500m.p501a.C11737m.C11740c.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).intValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo29774j() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            java.lang.Object r0 = r3.m37782a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x002b
        L_0x0013:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = r1.intValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.m37785s()
            return r0
        L_0x002f:
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            g.m.a.j r0 = r3.mo29759a(r0, r1)
            throw r0
        L_0x0036:
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            g.m.a.j r0 = r3.mo29759a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11744q.mo29774j():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo29759a(r0, p163g.p500m.p501a.C11737m.C11740c.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).longValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo29776k() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            java.lang.Object r0 = r3.m37782a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L_0x002b
        L_0x0013:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            long r0 = r1.longValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.m37785s()
            return r0
        L_0x002f:
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            g.m.a.j r0 = r3.mo29759a(r0, r1)
            throw r0
        L_0x0036:
            g.m.a.m$c r1 = p163g.p500m.p501a.C11737m.C11740c.NUMBER
            g.m.a.j r0 = r3.mo29759a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11744q.mo29776k():long");
    }

    /* renamed from: l */
    public String mo29777l() throws IOException {
        Entry entry = (Entry) m37782a(Entry.class, C11740c.NAME);
        String a = m37783a(entry);
        this.f27335Z[this.f27304c - 1] = entry.getValue();
        this.f27300V[this.f27304c - 2] = a;
        return a;
    }

    /* renamed from: m */
    public <T> T mo29778m() throws IOException {
        m37782a(Void.class, C11740c.NULL);
        m37785s();
        return null;
    }

    /* renamed from: n */
    public String mo29779n() throws IOException {
        int i = this.f27304c;
        String str = i != 0 ? this.f27335Z[i - 1] : null;
        if (str instanceof String) {
            m37785s();
            return str;
        } else if (str instanceof Number) {
            m37785s();
            return str.toString();
        } else if (str == f27334a0) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw mo29759a(str, C11740c.STRING);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo29780o() throws IOException {
        if (mo29770f()) {
            m37784a((Object) mo29777l());
        }
    }

    public C11740c peek() throws IOException {
        int i = this.f27304c;
        if (i == 0) {
            return C11740c.END_DOCUMENT;
        }
        Object obj = this.f27335Z[i - 1];
        if (obj instanceof C11745a) {
            return ((C11745a) obj).f27338c;
        }
        if (obj instanceof List) {
            return C11740c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return C11740c.BEGIN_OBJECT;
        }
        if (obj instanceof Entry) {
            return C11740c.NAME;
        }
        if (obj instanceof String) {
            return C11740c.STRING;
        }
        if (obj instanceof Boolean) {
            return C11740c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return C11740c.NUMBER;
        }
        if (obj == null) {
            return C11740c.NULL;
        }
        if (obj == f27334a0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo29759a(obj, "a JSON value");
    }

    /* renamed from: q */
    public void mo29783q() throws IOException {
        if (!this.f27303Y) {
            this.f27335Z[this.f27304c - 1] = ((Entry) m37782a(Entry.class, C11740c.NAME)).getValue();
            this.f27300V[this.f27304c - 2] = "null";
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot skip unexpected ");
        sb.append(peek());
        sb.append(" at ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    /* renamed from: r */
    public void mo29784r() throws IOException {
        if (!this.f27303Y) {
            int i = this.f27304c;
            if (i > 1) {
                this.f27300V[i - 2] = "null";
            }
            int i2 = this.f27304c;
            if ((i2 != 0 ? this.f27335Z[i2 - 1] : null) instanceof Entry) {
                Object[] objArr = this.f27335Z;
                int i3 = this.f27304c;
                objArr[i3 - 1] = ((Entry) objArr[i3 - 1]).getValue();
            } else if (this.f27304c > 0) {
                m37785s();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot skip unexpected ");
            sb.append(peek());
            sb.append(" at ");
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo29762b(p163g.p500m.p501a.C11737m.C11739b r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f27304c
            if (r0 == 0) goto L_0x000b
            java.lang.Object[] r1 = r5.f27335Z
            int r0 = r0 + -1
            r0 = r1[r0]
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof java.lang.String
            r2 = -1
            if (r1 != 0) goto L_0x001e
            java.lang.Object r6 = f27334a0
            if (r0 == r6) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonReader is closed"
            r6.<init>(r0)
            throw r6
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.String[] r3 = r6.f27306a
            int r3 = r3.length
        L_0x0024:
            if (r1 >= r3) goto L_0x0037
            java.lang.String[] r4 = r6.f27306a
            r4 = r4[r1]
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r5.m37785s()
            return r1
        L_0x0034:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11744q.mo29762b(g.m.a.m$b):int");
    }

    /* renamed from: a */
    public int mo29758a(C11739b bVar) throws IOException {
        Entry entry = (Entry) m37782a(Entry.class, C11740c.NAME);
        String a = m37783a(entry);
        int length = bVar.f27306a.length;
        for (int i = 0; i < length; i++) {
            if (bVar.f27306a[i].equals(a)) {
                this.f27335Z[this.f27304c - 1] = entry.getValue();
                this.f27300V[this.f27304c - 2] = a;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m37784a(Object obj) {
        int i = this.f27304c;
        if (i == this.f27335Z.length) {
            if (i != 256) {
                int[] iArr = this.f27299U;
                this.f27299U = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f27300V;
                this.f27300V = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f27301W;
                this.f27301W = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.f27335Z;
                this.f27335Z = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(mo29775j0());
                throw new C11734j(sb.toString());
            }
        }
        Object[] objArr2 = this.f27335Z;
        int i2 = this.f27304c;
        this.f27304c = i2 + 1;
        objArr2[i2] = obj;
    }

    /* renamed from: a */
    private <T> T m37782a(Class<T> cls, C11740c cVar) throws IOException {
        int i = this.f27304c;
        Object obj = i != 0 ? this.f27335Z[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == C11740c.NULL) {
            return null;
        }
        if (obj == f27334a0) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo29759a(obj, cVar);
    }

    /* renamed from: a */
    private String m37783a(Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw mo29759a(key, C11740c.NAME);
    }
}
