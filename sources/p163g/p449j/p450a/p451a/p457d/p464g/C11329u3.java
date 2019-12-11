package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p163g.p449j.p450a.p451a.p457d.p464g.C11357w3;

/* renamed from: g.j.a.a.d.g.u3 */
final class C11329u3<FieldDescriptorType extends C11357w3<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C11329u3 f26556d = new C11329u3(true);

    /* renamed from: a */
    final C11169j6<FieldDescriptorType, Object> f26557a = C11169j6.m35409b(16);

    /* renamed from: b */
    private boolean f26558b;

    /* renamed from: c */
    private boolean f26559c = false;

    private C11329u3() {
    }

    /* renamed from: g */
    public static <T extends C11357w3<T>> C11329u3<T> m36415g() {
        return f26556d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo29036a() {
        if (this.f26559c) {
            return new C11344v4(this.f26557a.mo28605e().iterator());
        }
        return this.f26557a.mo28605e().iterator();
    }

    /* renamed from: b */
    public final boolean mo29038b() {
        return this.f26558b;
    }

    /* renamed from: c */
    public final boolean mo29039c() {
        for (int i = 0; i < this.f26557a.mo28601c(); i++) {
            if (!m36410a(this.f26557a.mo28599a(i))) {
                return false;
            }
        }
        for (Entry a : this.f26557a.mo28604d()) {
            if (!m36410a(a)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C11329u3 u3Var = new C11329u3();
        for (int i = 0; i < this.f26557a.mo28601c(); i++) {
            Entry a = this.f26557a.mo28599a(i);
            u3Var.m36409a((FieldDescriptorType) (C11357w3) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f26557a.mo28604d()) {
            u3Var.m36409a((FieldDescriptorType) (C11357w3) entry.getKey(), entry.getValue());
        }
        u3Var.f26559c = this.f26559c;
        return u3Var;
    }

    /* renamed from: d */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo29041d() {
        if (this.f26559c) {
            return new C11344v4(this.f26557a.entrySet().iterator());
        }
        return this.f26557a.entrySet().iterator();
    }

    /* renamed from: e */
    public final void mo29042e() {
        if (!this.f26558b) {
            this.f26557a.mo28583b();
            this.f26558b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11329u3)) {
            return false;
        }
        return this.f26557a.equals(((C11329u3) obj).f26557a);
    }

    /* renamed from: f */
    public final int mo29044f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f26557a.mo28601c(); i2++) {
            i += m36414c(this.f26557a.mo28599a(i2));
        }
        for (Entry c : this.f26557a.mo28604d()) {
            i += m36414c(c);
        }
        return i;
    }

    public final int hashCode() {
        return this.f26557a.hashCode();
    }

    /* renamed from: b */
    private final void m36413b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C11357w3 w3Var = (C11357w3) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C11272q4) {
            C11272q4.m35963c();
            throw null;
        } else if (w3Var.mo29094b0()) {
            Object a = m36406a((FieldDescriptorType) w3Var);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m36407a(a2));
            }
            this.f26557a.put(w3Var, a);
        } else if (w3Var.mo29095c0() == C11290r7.MESSAGE) {
            Object a3 = m36406a((FieldDescriptorType) w3Var);
            if (a3 == null) {
                this.f26557a.put(w3Var, m36407a(value));
                return;
            }
            if (a3 instanceof C11316t5) {
                obj = w3Var.mo29092a((C11316t5) a3, (C11316t5) value);
            } else {
                obj = w3Var.mo29091a(((C11259p5) a3).mo28429e(), (C11259p5) value).mo28446l0();
            }
            this.f26557a.put(w3Var, obj);
        } else {
            this.f26557a.put(w3Var, m36407a(value));
        }
    }

    private C11329u3(boolean z) {
        mo29042e();
    }

    /* renamed from: a */
    private final Object m36406a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f26557a.get(fielddescriptortype);
        if (!(obj instanceof C11272q4)) {
            return obj;
        }
        C11272q4.m35963c();
        throw null;
    }

    /* renamed from: c */
    private static int m36414c(Entry<FieldDescriptorType, Object> entry) {
        C11357w3 w3Var = (C11357w3) entry.getKey();
        Object value = entry.getValue();
        if (w3Var.mo29095c0() != C11290r7.MESSAGE || w3Var.mo29094b0() || w3Var.mo29097e0()) {
            return m36412b(w3Var, value);
        }
        if (value instanceof C11272q4) {
            return C11197l3.m35553b(((C11357w3) entry.getKey()).mo29093a0(), (C11330u4) (C11272q4) value);
        }
        return C11197l3.m35563d(((C11357w3) entry.getKey()).mo29093a0(), (C11259p5) value);
    }

    /* renamed from: a */
    private final void m36409a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo29094b0()) {
            m36408a(fielddescriptortype.mo29096d0(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m36408a(fielddescriptortype.mo29096d0(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C11272q4) {
            this.f26559c = true;
        }
        this.f26557a.put(fielddescriptortype, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11272q4) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11167j4) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m36408a(p163g.p449j.p450a.p451a.p457d.p464g.C11247o7 r2, java.lang.Object r3) {
        /*
            p163g.p449j.p450a.p451a.p457d.p464g.C11111f4.m35151a(r3)
            int[] r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11371x3.f26602a
            g.j.a.a.d.g.r7 r2 = r2.mo28792a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11259p5
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11272q4
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11167j4
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof p163g.p449j.p450a.p451a.p457d.p464g.C11342v2
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11329u3.m36408a(g.j.a.a.d.g.o7, java.lang.Object):void");
    }

    /* renamed from: b */
    private static int m36411b(C11247o7 o7Var, Object obj) {
        switch (C11371x3.f26603b[o7Var.ordinal()]) {
            case 1:
                return C11197l3.m35548b(((Double) obj).doubleValue());
            case 2:
                return C11197l3.m35549b(((Float) obj).floatValue());
            case 3:
                return C11197l3.m35565d(((Long) obj).longValue());
            case 4:
                return C11197l3.m35569e(((Long) obj).longValue());
            case 5:
                return C11197l3.m35570f(((Integer) obj).intValue());
            case 6:
                return C11197l3.m35577g(((Long) obj).longValue());
            case 7:
                return C11197l3.m35582i(((Integer) obj).intValue());
            case 8:
                return C11197l3.m35557b(((Boolean) obj).booleanValue());
            case 9:
                return C11197l3.m35556b((C11259p5) obj);
            case 10:
                if (obj instanceof C11272q4) {
                    return C11197l3.m35543a((C11330u4) (C11272q4) obj);
                }
                return C11197l3.m35541a((C11259p5) obj);
            case 11:
                if (obj instanceof C11342v2) {
                    return C11197l3.m35544a((C11342v2) obj);
                }
                return C11197l3.m35545a((String) obj);
            case 12:
                if (obj instanceof C11342v2) {
                    return C11197l3.m35544a((C11342v2) obj);
                }
                return C11197l3.m35558b((byte[]) obj);
            case 13:
                return C11197l3.m35574g(((Integer) obj).intValue());
            case 14:
                return C11197l3.m35585j(((Integer) obj).intValue());
            case 15:
                return C11197l3.m35581h(((Long) obj).longValue());
            case 16:
                return C11197l3.m35578h(((Integer) obj).intValue());
            case 17:
                return C11197l3.m35573f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C11167j4) {
                    return C11197l3.m35587k(((C11167j4) obj).mo28380a0());
                }
                return C11197l3.m35587k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    private static boolean m36410a(Entry<FieldDescriptorType, Object> entry) {
        C11357w3 w3Var = (C11357w3) entry.getKey();
        if (w3Var.mo29095c0() == C11290r7.MESSAGE) {
            if (w3Var.mo29094b0()) {
                for (C11259p5 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C11259p5) {
                    if (!((C11259p5) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C11272q4) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo29037a(C11329u3<FieldDescriptorType> u3Var) {
        for (int i = 0; i < u3Var.f26557a.mo28601c(); i++) {
            m36413b(u3Var.f26557a.mo28599a(i));
        }
        for (Entry b : u3Var.f26557a.mo28604d()) {
            m36413b(b);
        }
    }

    /* renamed from: a */
    private static Object m36407a(Object obj) {
        if (obj instanceof C11316t5) {
            return ((C11316t5) obj).mo29022j0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    static int m36405a(C11247o7 o7Var, int i, Object obj) {
        int e = C11197l3.m35567e(i);
        if (o7Var == C11247o7.GROUP) {
            C11111f4.m35154a((C11259p5) obj);
            e <<= 1;
        }
        return e + m36411b(o7Var, obj);
    }

    /* renamed from: b */
    public static int m36412b(C11357w3<?> w3Var, Object obj) {
        C11247o7 d0 = w3Var.mo29096d0();
        int a0 = w3Var.mo29093a0();
        if (!w3Var.mo29094b0()) {
            return m36405a(d0, a0, obj);
        }
        int i = 0;
        if (w3Var.mo29097e0()) {
            for (Object b : (List) obj) {
                i += m36411b(d0, b);
            }
            return C11197l3.m35567e(a0) + i + C11197l3.m35590m(i);
        }
        for (Object a : (List) obj) {
            i += m36405a(d0, a0, a);
        }
        return i;
    }
}
