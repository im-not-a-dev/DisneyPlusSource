package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.C2198c;
import com.bamtech.shadow.gson.internal.C2224h;
import com.bamtech.shadow.gson.internal.C2225i;
import com.bamtech.shadow.gson.internal.Excluder;
import com.bamtech.shadow.gson.internal.bind.ArrayTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.C2192a;
import com.bamtech.shadow.gson.internal.bind.C2194b;
import com.bamtech.shadow.gson.internal.bind.CollectionTypeAdapterFactory;
import com.bamtech.shadow.gson.internal.bind.DateTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.bamtech.shadow.gson.internal.bind.MapTypeAdapterFactory;
import com.bamtech.shadow.gson.internal.bind.ObjectTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.bamtech.shadow.gson.internal.bind.SqlDateTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.TimeTypeAdapter;
import com.bamtech.shadow.gson.internal.bind.TypeAdapters;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.p051s.C2253d;
import com.bamtech.shadow.gson.reflect.TypeToken;
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

public final class Gson {

    /* renamed from: k */
    private static final TypeToken<?> f6095k = TypeToken.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<TypeToken<?>, C2119f<?>>> f6096a;

    /* renamed from: b */
    private final Map<TypeToken<?>, C2241p<?>> f6097b;

    /* renamed from: c */
    private final List<C2243q> f6098c;

    /* renamed from: d */
    private final C2198c f6099d;

    /* renamed from: e */
    private final boolean f6100e;

    /* renamed from: f */
    private final boolean f6101f;

    /* renamed from: g */
    private final boolean f6102g;

    /* renamed from: h */
    private final boolean f6103h;

    /* renamed from: i */
    private final boolean f6104i;

    /* renamed from: j */
    private final JsonAdapterAnnotationTypeAdapterFactory f6105j;

    /* renamed from: com.bamtech.shadow.gson.Gson$a */
    class C2114a extends C2241p<Number> {
        C2114a(Gson gson) {
        }

        /* renamed from: a */
        public Double m8206a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Double.valueOf(aVar.mo11168j());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo11193h();
                return;
            }
            Gson.m8182a(number.doubleValue());
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.Gson$b */
    class C2115b extends C2241p<Number> {
        C2115b(Gson gson) {
        }

        /* renamed from: a */
        public Float m8210a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Float.valueOf((float) aVar.mo11168j());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo11193h();
                return;
            }
            Gson.m8182a((double) number.floatValue());
            cVar.mo11184a(number);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.Gson$c */
    static class C2116c extends C2241p<Number> {
        C2116c() {
        }

        /* renamed from: a */
        public Number m8214a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return Long.valueOf(aVar.mo11171l());
            }
            aVar.mo11173n();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo11193h();
            } else {
                cVar.mo11192g(number.toString());
            }
        }
    }

    /* renamed from: com.bamtech.shadow.gson.Gson$d */
    static class C2117d extends C2241p<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C2241p f6106a;

        C2117d(C2241p pVar) {
            this.f6106a = pVar;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, AtomicLong atomicLong) throws IOException {
            this.f6106a.mo11057a(cVar, Long.valueOf(atomicLong.get()));
        }

        /* renamed from: a */
        public AtomicLong m8218a(C2249a aVar) throws IOException {
            return new AtomicLong(((Number) this.f6106a.mo11055a(aVar)).longValue());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.Gson$e */
    static class C2118e extends C2241p<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C2241p f6107a;

        C2118e(C2241p pVar) {
            this.f6107a = pVar;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.mo11181a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f6107a.mo11057a(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo11186c();
        }

        /* renamed from: a */
        public AtomicLongArray m8222a(C2249a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo11161a();
            while (aVar.mo11166f()) {
                arrayList.add(Long.valueOf(((Number) this.f6107a.mo11055a(aVar)).longValue()));
            }
            aVar.mo11164d();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* renamed from: com.bamtech.shadow.gson.Gson$f */
    static class C2119f<T> extends C2241p<T> {

        /* renamed from: a */
        private C2241p<T> f6108a;

        C2119f() {
        }

        /* renamed from: a */
        public void mo11062a(C2241p<T> pVar) {
            if (this.f6108a == null) {
                this.f6108a = pVar;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public T mo11055a(C2249a aVar) throws IOException {
            C2241p<T> pVar = this.f6108a;
            if (pVar != null) {
                return pVar.mo11055a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, T t) throws IOException {
            C2241p<T> pVar = this.f6108a;
            if (pVar != null) {
                pVar.mo11057a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.f6136Z, C2123d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C2238o.DEFAULT, Collections.emptyList());
    }

    /* renamed from: a */
    private C2241p<Number> m8181a(boolean z) {
        if (z) {
            return TypeAdapters.f6254v;
        }
        return new C2114a(this);
    }

    /* renamed from: b */
    private C2241p<Number> m8185b(boolean z) {
        if (z) {
            return TypeAdapters.f6253u;
        }
        return new C2115b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f6100e);
        sb.append(",factories:");
        sb.append(this.f6098c);
        sb.append(",instanceCreators:");
        sb.append(this.f6099d);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static void m8182a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static C2241p<AtomicLongArray> m8184b(C2241p<Number> pVar) {
        return new C2118e(pVar).mo11270a();
    }

    Gson(Excluder excluder, C2129e eVar, Map<Type, C2130f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C2238o oVar, List<C2243q> list) {
        this.f6096a = new ThreadLocal<>();
        this.f6097b = new ConcurrentHashMap();
        this.f6099d = new C2198c(map);
        this.f6100e = z;
        this.f6102g = z3;
        this.f6101f = z4;
        this.f6103h = z5;
        this.f6104i = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f6231Y);
        arrayList.add(ObjectTypeAdapter.f6172b);
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(TypeAdapters.f6210D);
        arrayList.add(TypeAdapters.f6245m);
        arrayList.add(TypeAdapters.f6239g);
        arrayList.add(TypeAdapters.f6241i);
        arrayList.add(TypeAdapters.f6243k);
        C2241p a = m8179a(oVar);
        arrayList.add(TypeAdapters.m8364a(Long.TYPE, Long.class, a));
        arrayList.add(TypeAdapters.m8364a(Double.TYPE, Double.class, m8181a(z7)));
        arrayList.add(TypeAdapters.m8364a(Float.TYPE, Float.class, m8185b(z7)));
        arrayList.add(TypeAdapters.f6256x);
        arrayList.add(TypeAdapters.f6247o);
        arrayList.add(TypeAdapters.f6249q);
        arrayList.add(TypeAdapters.m8363a(AtomicLong.class, m8180a(a)));
        arrayList.add(TypeAdapters.m8363a(AtomicLongArray.class, m8184b(a)));
        arrayList.add(TypeAdapters.f6251s);
        arrayList.add(TypeAdapters.f6258z);
        arrayList.add(TypeAdapters.f6212F);
        arrayList.add(TypeAdapters.f6214H);
        arrayList.add(TypeAdapters.m8363a(BigDecimal.class, TypeAdapters.f6208B));
        arrayList.add(TypeAdapters.m8363a(BigInteger.class, TypeAdapters.f6209C));
        arrayList.add(TypeAdapters.f6216J);
        arrayList.add(TypeAdapters.f6218L);
        arrayList.add(TypeAdapters.f6222P);
        arrayList.add(TypeAdapters.f6224R);
        arrayList.add(TypeAdapters.f6229W);
        arrayList.add(TypeAdapters.f6220N);
        arrayList.add(TypeAdapters.f6236d);
        arrayList.add(DateTypeAdapter.f6162c);
        arrayList.add(TypeAdapters.f6227U);
        arrayList.add(TimeTypeAdapter.f6192b);
        arrayList.add(SqlDateTypeAdapter.f6190b);
        arrayList.add(TypeAdapters.f6225S);
        arrayList.add(ArrayTypeAdapter.f6156c);
        arrayList.add(TypeAdapters.f6234b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f6099d));
        arrayList.add(new MapTypeAdapterFactory(this.f6099d, z2));
        this.f6105j = new JsonAdapterAnnotationTypeAdapterFactory(this.f6099d);
        arrayList.add(this.f6105j);
        arrayList.add(TypeAdapters.f6232Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f6099d, eVar, excluder, this.f6105j));
        this.f6098c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C2241p<Number> m8179a(C2238o oVar) {
        if (oVar == C2238o.DEFAULT) {
            return TypeAdapters.f6252t;
        }
        return new C2116c();
    }

    /* renamed from: b */
    public JsonElement mo11052b(Object obj) {
        if (obj == null) {
            return C2233j.f6335a;
        }
        return mo11053b(obj, obj.getClass());
    }

    /* renamed from: b */
    public JsonElement mo11053b(Object obj, Type type) {
        C2194b bVar = new C2194b();
        mo11050a(obj, type, (C2252c) bVar);
        return bVar.mo11194i();
    }

    /* renamed from: a */
    private static C2241p<AtomicLong> m8180a(C2241p<Number> pVar) {
        return new C2117d(pVar).mo11270a();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bamtech.shadow.gson.reflect.TypeToken<T>, code=com.bamtech.shadow.gson.reflect.TypeToken, for r6v0, types: [com.bamtech.shadow.gson.reflect.TypeToken<T>, java.lang.Object, com.bamtech.shadow.gson.reflect.TypeToken] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.bamtech.shadow.gson.C2241p<T> mo11036a(com.bamtech.shadow.gson.reflect.TypeToken r6) {
        /*
            r5 = this;
            java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.p<?>> r0 = r5.f6097b
            if (r6 != 0) goto L_0x0007
            com.bamtech.shadow.gson.reflect.TypeToken<?> r1 = f6095k
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            com.bamtech.shadow.gson.p r0 = (com.bamtech.shadow.gson.C2241p) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.Gson$f<?>>> r0 = r5.f6096a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.Gson$f<?>>> r1 = r5.f6096a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.bamtech.shadow.gson.Gson$f r2 = (com.bamtech.shadow.gson.Gson.C2119f) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.bamtech.shadow.gson.Gson$f r2 = new com.bamtech.shadow.gson.Gson$f     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            r0.put(r6, r2)     // Catch:{ all -> 0x007a }
            java.util.List<com.bamtech.shadow.gson.q> r3 = r5.f6098c     // Catch:{ all -> 0x007a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007a }
            com.bamtech.shadow.gson.q r4 = (com.bamtech.shadow.gson.C2243q) r4     // Catch:{ all -> 0x007a }
            com.bamtech.shadow.gson.p r4 = r4.mo11098a(r5, r6)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x003e
            r2.mo11062a(r4)     // Catch:{ all -> 0x007a }
            java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.p<?>> r2 = r5.f6097b     // Catch:{ all -> 0x007a }
            r2.put(r6, r4)     // Catch:{ all -> 0x007a }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.Gson$f<?>>> r6 = r5.f6096a
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
            java.lang.ThreadLocal<java.util.Map<com.bamtech.shadow.gson.reflect.TypeToken<?>, com.bamtech.shadow.gson.Gson$f<?>>> r6 = r5.f6096a
            r6.remove()
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.Gson.mo11036a(com.bamtech.shadow.gson.reflect.TypeToken):com.bamtech.shadow.gson.p");
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11035a(C2243q qVar, TypeToken<T> typeToken) {
        if (!this.f6098c.contains(qVar)) {
            qVar = this.f6105j;
        }
        boolean z = false;
        for (C2243q qVar2 : this.f6098c) {
            if (z) {
                C2241p<T> a = qVar2.mo11098a(this, typeToken);
                if (a != null) {
                    return a;
                }
            } else if (qVar2 == qVar) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(typeToken);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11037a(Class<T> cls) {
        return mo11036a(TypeToken.get(cls));
    }

    /* renamed from: a */
    public String mo11046a(Object obj) {
        if (obj == null) {
            return mo11045a((JsonElement) C2233j.f6335a);
        }
        return mo11047a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo11047a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo11051a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo11051a(Object obj, Type type, Appendable appendable) throws C2133i {
        try {
            mo11050a(obj, type, mo11039a(C2225i.m8574a(appendable)));
        } catch (IOException e) {
            throw new C2133i((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo11050a(Object obj, Type type, C2252c cVar) throws C2133i {
        C2241p a = mo11036a(TypeToken.get(type));
        boolean g = cVar.mo11295g();
        cVar.mo11290b(true);
        boolean f = cVar.mo11294f();
        cVar.mo11289a(this.f6101f);
        boolean e = cVar.mo11292e();
        cVar.mo11291c(this.f6100e);
        try {
            a.mo11057a(cVar, obj);
            cVar.mo11290b(g);
            cVar.mo11289a(f);
            cVar.mo11291c(e);
        } catch (IOException e2) {
            throw new C2133i((Throwable) e2);
        } catch (Throwable th) {
            cVar.mo11290b(g);
            cVar.mo11289a(f);
            cVar.mo11291c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo11045a(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        mo11049a(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo11049a(JsonElement jsonElement, Appendable appendable) throws C2133i {
        try {
            mo11048a(jsonElement, mo11039a(C2225i.m8574a(appendable)));
        } catch (IOException e) {
            throw new C2133i((Throwable) e);
        }
    }

    /* renamed from: a */
    public C2252c mo11039a(Writer writer) throws IOException {
        if (this.f6102g) {
            writer.write(")]}'\n");
        }
        C2252c cVar = new C2252c(writer);
        if (this.f6103h) {
            cVar.mo11293f("  ");
        }
        cVar.mo11291c(this.f6100e);
        return cVar;
    }

    /* renamed from: a */
    public C2249a mo11038a(Reader reader) {
        C2249a aVar = new C2249a(reader);
        aVar.mo11285a(this.f6104i);
        return aVar;
    }

    /* renamed from: a */
    public void mo11048a(JsonElement jsonElement, C2252c cVar) throws C2133i {
        boolean g = cVar.mo11295g();
        cVar.mo11290b(true);
        boolean f = cVar.mo11294f();
        cVar.mo11289a(this.f6101f);
        boolean e = cVar.mo11292e();
        cVar.mo11291c(this.f6100e);
        try {
            C2225i.m8575a(jsonElement, cVar);
            cVar.mo11290b(g);
            cVar.mo11289a(f);
            cVar.mo11291c(e);
        } catch (IOException e2) {
            throw new C2133i((Throwable) e2);
        } catch (Throwable th) {
            cVar.mo11290b(g);
            cVar.mo11289a(f);
            cVar.mo11291c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo11043a(String str, Class<T> cls) throws C2237n {
        return C2224h.m8570a(cls).cast(mo11044a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo11044a(String str, Type type) throws C2237n {
        if (str == null) {
            return null;
        }
        return mo11042a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo11042a(Reader reader, Type type) throws C2133i, C2237n {
        C2249a a = mo11038a(reader);
        T a2 = mo11041a(a, type);
        m8183a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m8183a(Object obj, C2249a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != C2251b.END_DOCUMENT) {
                    throw new C2133i("JSON document was not fully consumed.");
                }
            } catch (C2253d e) {
                throw new C2237n((Throwable) e);
            } catch (IOException e2) {
                throw new C2133i((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo11041a(C2249a aVar, Type type) throws C2133i, C2237n {
        boolean g = aVar.mo11287g();
        aVar.mo11285a(true);
        try {
            aVar.peek();
            T a = mo11036a(TypeToken.get(type)).mo11055a(aVar);
            aVar.mo11285a(g);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo11285a(g);
                return null;
            }
            throw new C2237n((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C2237n((Throwable) e2);
        } catch (IOException e3) {
            throw new C2237n((Throwable) e3);
        } catch (Throwable th) {
            aVar.mo11285a(g);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo11040a(JsonElement jsonElement, Type type) throws C2237n {
        if (jsonElement == null) {
            return null;
        }
        return mo11041a((C2249a) new C2192a(jsonElement), type);
    }
}
