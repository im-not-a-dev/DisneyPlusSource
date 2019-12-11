package p163g.p449j.p487c;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p488a0.C11537d;
import p163g.p449j.p487c.p490y.C11584c;
import p163g.p449j.p487c.p490y.C11599d;
import p163g.p449j.p487c.p490y.C11612i;
import p163g.p449j.p487c.p490y.C11613j;
import p163g.p449j.p487c.p490y.p491l.C11621a;
import p163g.p449j.p487c.p490y.p491l.C11623b;
import p163g.p449j.p487c.p490y.p491l.C11625c;
import p163g.p449j.p487c.p490y.p491l.C11627d;
import p163g.p449j.p487c.p490y.p491l.C11632g;
import p163g.p449j.p487c.p490y.p491l.C11634h;
import p163g.p449j.p487c.p490y.p491l.C11637i;
import p163g.p449j.p487c.p490y.p491l.C11641j;
import p163g.p449j.p487c.p490y.p491l.C11643k;
import p163g.p449j.p487c.p490y.p491l.C11649n;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.f */
/* compiled from: Gson */
public final class C11547f {

    /* renamed from: k */
    private static final C11689a<?> f26991k = C11689a.m37636a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C11689a<?>, C11553f<?>>> f26992a = new ThreadLocal<>();

    /* renamed from: b */
    private final Map<C11689a<?>, C11571v<?>> f26993b = new ConcurrentHashMap();

    /* renamed from: c */
    private final List<C11573w> f26994c;

    /* renamed from: d */
    private final C11584c f26995d;

    /* renamed from: e */
    private final boolean f26996e;

    /* renamed from: f */
    private final boolean f26997f;

    /* renamed from: g */
    private final boolean f26998g;

    /* renamed from: h */
    private final boolean f26999h;

    /* renamed from: i */
    private final boolean f27000i;

    /* renamed from: j */
    private final C11627d f27001j;

    /* renamed from: g.j.c.f$a */
    /* compiled from: Gson */
    class C11548a extends C11571v<Number> {
        C11548a(C11547f fVar) {
        }

        /* renamed from: a */
        public Double m37271a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Double.valueOf(aVar.mo29473j());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo29503h();
                return;
            }
            C11547f.m37250a(number.doubleValue());
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.f$b */
    /* compiled from: Gson */
    class C11549b extends C11571v<Number> {
        C11549b(C11547f fVar) {
        }

        /* renamed from: a */
        public Float m37275a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Float.valueOf((float) aVar.mo29473j());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo29503h();
                return;
            }
            C11547f.m37250a((double) number.floatValue());
            cVar.mo29487a(number);
        }
    }

    /* renamed from: g.j.c.f$c */
    /* compiled from: Gson */
    static class C11550c extends C11571v<Number> {
        C11550c() {
        }

        /* renamed from: a */
        public Number m37279a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return Long.valueOf(aVar.mo29476l());
            }
            aVar.mo29478n();
            return null;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo29503h();
            } else {
                cVar.mo29501g(number.toString());
            }
        }
    }

    /* renamed from: g.j.c.f$d */
    /* compiled from: Gson */
    static class C11551d extends C11571v<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C11571v f27002a;

        C11551d(C11571v vVar) {
            this.f27002a = vVar;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, AtomicLong atomicLong) throws IOException {
            this.f27002a.mo29459a(cVar, Long.valueOf(atomicLong.get()));
        }

        /* renamed from: a */
        public AtomicLong m37283a(C11533a aVar) throws IOException {
            return new AtomicLong(((Number) this.f27002a.mo29458a(aVar)).longValue());
        }
    }

    /* renamed from: g.j.c.f$e */
    /* compiled from: Gson */
    static class C11552e extends C11571v<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C11571v f27003a;

        C11552e(C11571v vVar) {
            this.f27003a = vVar;
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.mo29484a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f27003a.mo29459a(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo29491c();
        }

        /* renamed from: a */
        public AtomicLongArray m37287a(C11533a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo29462a();
            while (aVar.mo29469f()) {
                arrayList.add(Long.valueOf(((Number) this.f27003a.mo29458a(aVar)).longValue()));
            }
            aVar.mo29467d();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* renamed from: g.j.c.f$f */
    /* compiled from: Gson */
    static class C11553f<T> extends C11571v<T> {

        /* renamed from: a */
        private C11571v<T> f27004a;

        C11553f() {
        }

        /* renamed from: a */
        public void mo29529a(C11571v<T> vVar) {
            if (this.f27004a == null) {
                this.f27004a = vVar;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public T mo29458a(C11533a aVar) throws IOException {
            C11571v<T> vVar = this.f27004a;
            if (vVar != null) {
                return vVar.mo29458a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, T t) throws IOException {
            C11571v<T> vVar = this.f27004a;
            if (vVar != null) {
                vVar.mo29459a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    C11547f(C11599d dVar, C11546e eVar, Map<Type, C11555h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C11568u uVar, List<C11573w> list) {
        this.f26995d = new C11584c(map);
        this.f26996e = z;
        this.f26998g = z3;
        this.f26997f = z4;
        this.f26999h = z5;
        this.f27000i = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11649n.f27175Y);
        arrayList.add(C11634h.f27119b);
        arrayList.add(dVar);
        arrayList.addAll(list);
        arrayList.add(C11649n.f27154D);
        arrayList.add(C11649n.f27189m);
        arrayList.add(C11649n.f27183g);
        arrayList.add(C11649n.f27185i);
        arrayList.add(C11649n.f27187k);
        C11571v a = m37247a(uVar);
        arrayList.add(C11649n.m37501a(Long.TYPE, Long.class, a));
        arrayList.add(C11649n.m37501a(Double.TYPE, Double.class, m37249a(z7)));
        arrayList.add(C11649n.m37501a(Float.TYPE, Float.class, m37253b(z7)));
        arrayList.add(C11649n.f27200x);
        arrayList.add(C11649n.f27191o);
        arrayList.add(C11649n.f27193q);
        arrayList.add(C11649n.m37500a(AtomicLong.class, m37248a(a)));
        arrayList.add(C11649n.m37500a(AtomicLongArray.class, m37252b(a)));
        arrayList.add(C11649n.f27195s);
        arrayList.add(C11649n.f27202z);
        arrayList.add(C11649n.f27156F);
        arrayList.add(C11649n.f27158H);
        arrayList.add(C11649n.m37500a(BigDecimal.class, C11649n.f27152B));
        arrayList.add(C11649n.m37500a(BigInteger.class, C11649n.f27153C));
        arrayList.add(C11649n.f27160J);
        arrayList.add(C11649n.f27162L);
        arrayList.add(C11649n.f27166P);
        arrayList.add(C11649n.f27168R);
        arrayList.add(C11649n.f27173W);
        arrayList.add(C11649n.f27164N);
        arrayList.add(C11649n.f27180d);
        arrayList.add(C11625c.f27099c);
        arrayList.add(C11649n.f27171U);
        arrayList.add(C11643k.f27139b);
        arrayList.add(C11641j.f27137b);
        arrayList.add(C11649n.f27169S);
        arrayList.add(C11621a.f27093c);
        arrayList.add(C11649n.f27178b);
        arrayList.add(new C11623b(this.f26995d));
        arrayList.add(new C11632g(this.f26995d, z2));
        this.f27001j = new C11627d(this.f26995d);
        arrayList.add(this.f27001j);
        arrayList.add(C11649n.f27176Z);
        arrayList.add(new C11637i(this.f26995d, eVar, dVar, this.f27001j));
        this.f26994c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private C11571v<Number> m37249a(boolean z) {
        if (z) {
            return C11649n.f27198v;
        }
        return new C11548a(this);
    }

    /* renamed from: b */
    private C11571v<Number> m37253b(boolean z) {
        if (z) {
            return C11649n.f27197u;
        }
        return new C11549b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f26996e);
        sb.append(",factories:");
        sb.append(this.f26994c);
        sb.append(",instanceCreators:");
        sb.append(this.f26995d);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static void m37250a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static C11571v<AtomicLongArray> m37252b(C11571v<Number> vVar) {
        return new C11552e(vVar).mo29567a();
    }

    /* renamed from: a */
    private static C11571v<Number> m37247a(C11568u uVar) {
        if (uVar == C11568u.DEFAULT) {
            return C11649n.f27196t;
        }
        return new C11550c();
    }

    /* renamed from: a */
    private static C11571v<AtomicLong> m37248a(C11571v<Number> vVar) {
        return new C11551d(vVar).mo29567a();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=g.j.c.z.a<T>, code=g.j.c.z.a, for r6v0, types: [g.j.c.z.a<T>, java.lang.Object, g.j.c.z.a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p163g.p449j.p487c.C11571v<T> mo29510a(p163g.p449j.p487c.p493z.C11689a r6) {
        /*
            r5 = this;
            java.util.Map<g.j.c.z.a<?>, g.j.c.v<?>> r0 = r5.f26993b
            if (r6 != 0) goto L_0x0007
            g.j.c.z.a<?> r1 = f26991k
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            g.j.c.v r0 = (p163g.p449j.p487c.C11571v) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<g.j.c.z.a<?>, g.j.c.f$f<?>>> r0 = r5.f26992a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<g.j.c.z.a<?>, g.j.c.f$f<?>>> r1 = r5.f26992a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            g.j.c.f$f r2 = (p163g.p449j.p487c.C11547f.C11553f) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            g.j.c.f$f r2 = new g.j.c.f$f     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            r0.put(r6, r2)     // Catch:{ all -> 0x007a }
            java.util.List<g.j.c.w> r3 = r5.f26994c     // Catch:{ all -> 0x007a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007a }
            g.j.c.w r4 = (p163g.p449j.p487c.C11573w) r4     // Catch:{ all -> 0x007a }
            g.j.c.v r4 = r4.mo16202a(r5, r6)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x003e
            r2.mo29529a(r4)     // Catch:{ all -> 0x007a }
            java.util.Map<g.j.c.z.a<?>, g.j.c.v<?>> r2 = r5.f26993b     // Catch:{ all -> 0x007a }
            r2.put(r6, r4)     // Catch:{ all -> 0x007a }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<g.j.c.z.a<?>, g.j.c.f$f<?>>> r6 = r5.f26992a
            r6.remove()
        L_0x0062:
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "GSON cannot handle "
            r3.append(r4)     // Catch:{ all -> 0x007a }
            r3.append(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r3)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x0085
            java.lang.ThreadLocal<java.util.Map<g.j.c.z.a<?>, g.j.c.f$f<?>>> r6 = r5.f26992a
            r6.remove()
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.C11547f.mo29510a(g.j.c.z.a):g.j.c.v");
    }

    /* renamed from: a */
    public <T> C11571v<T> mo29509a(C11573w wVar, C11689a<T> aVar) {
        if (!this.f26994c.contains(wVar)) {
            wVar = this.f27001j;
        }
        boolean z = false;
        for (C11573w wVar2 : this.f26994c) {
            if (z) {
                C11571v<T> a = wVar2.mo16202a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (wVar2 == wVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C11571v<T> mo29511a(Class<T> cls) {
        return mo29510a(C11689a.m37636a(cls));
    }

    /* renamed from: a */
    public String mo29517a(Object obj) {
        if (obj == null) {
            return mo29516a((C11559l) C11561n.f27022a);
        }
        return mo29518a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo29518a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo29522a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo29522a(Object obj, Type type, Appendable appendable) throws C11560m {
        try {
            mo29521a(obj, type, mo29508a(C11613j.m37402a(appendable)));
        } catch (IOException e) {
            throw new C11560m((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo29521a(Object obj, Type type, C11536c cVar) throws C11560m {
        C11571v a = mo29510a(C11689a.m37637a(type));
        boolean g = cVar.mo29502g();
        cVar.mo29490b(true);
        boolean f = cVar.mo29499f();
        cVar.mo29488a(this.f26997f);
        boolean e = cVar.mo29497e();
        cVar.mo29492c(this.f26996e);
        try {
            a.mo29459a(cVar, obj);
            cVar.mo29490b(g);
            cVar.mo29488a(f);
            cVar.mo29492c(e);
        } catch (IOException e2) {
            throw new C11560m((Throwable) e2);
        } catch (Throwable th) {
            cVar.mo29490b(g);
            cVar.mo29488a(f);
            cVar.mo29492c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo29516a(C11559l lVar) {
        StringWriter stringWriter = new StringWriter();
        mo29520a(lVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo29520a(C11559l lVar, Appendable appendable) throws C11560m {
        try {
            mo29519a(lVar, mo29508a(C11613j.m37402a(appendable)));
        } catch (IOException e) {
            throw new C11560m((Throwable) e);
        }
    }

    /* renamed from: a */
    public C11536c mo29508a(Writer writer) throws IOException {
        if (this.f26998g) {
            writer.write(")]}'\n");
        }
        C11536c cVar = new C11536c(writer);
        if (this.f26999h) {
            cVar.mo29498f("  ");
        }
        cVar.mo29492c(this.f26996e);
        return cVar;
    }

    /* renamed from: a */
    public C11533a mo29507a(Reader reader) {
        C11533a aVar = new C11533a(reader);
        aVar.mo29463a(this.f27000i);
        return aVar;
    }

    /* renamed from: a */
    public void mo29519a(C11559l lVar, C11536c cVar) throws C11560m {
        boolean g = cVar.mo29502g();
        cVar.mo29490b(true);
        boolean f = cVar.mo29499f();
        cVar.mo29488a(this.f26997f);
        boolean e = cVar.mo29497e();
        cVar.mo29492c(this.f26996e);
        try {
            C11613j.m37403a(lVar, cVar);
            cVar.mo29490b(g);
            cVar.mo29488a(f);
            cVar.mo29492c(e);
        } catch (IOException e2) {
            throw new C11560m((Throwable) e2);
        } catch (Throwable th) {
            cVar.mo29490b(g);
            cVar.mo29488a(f);
            cVar.mo29492c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo29514a(String str, Class<T> cls) throws C11567t {
        return C11612i.m37398a(cls).cast(mo29515a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo29515a(String str, Type type) throws C11567t {
        if (str == null) {
            return null;
        }
        return mo29513a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo29513a(Reader reader, Type type) throws C11560m, C11567t {
        C11533a a = mo29507a(reader);
        T a2 = mo29512a(a, type);
        m37251a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m37251a(Object obj, C11533a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != C11535b.END_DOCUMENT) {
                    throw new C11560m("JSON document was not fully consumed.");
                }
            } catch (C11537d e) {
                throw new C11567t((Throwable) e);
            } catch (IOException e2) {
                throw new C11560m((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo29512a(C11533a aVar, Type type) throws C11560m, C11567t {
        boolean g = aVar.mo29470g();
        aVar.mo29463a(true);
        try {
            aVar.peek();
            T a = mo29510a(C11689a.m37637a(type)).mo29458a(aVar);
            aVar.mo29463a(g);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo29463a(g);
                return null;
            }
            throw new C11567t((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C11567t((Throwable) e2);
        } catch (IOException e3) {
            throw new C11567t((Throwable) e3);
        } catch (Throwable th) {
            aVar.mo29463a(g);
            throw th;
        }
    }
}
