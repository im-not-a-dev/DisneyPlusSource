package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2129e;
import com.bamtech.shadow.gson.C2237n;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.C2136b;
import com.bamtech.shadow.gson.internal.C2198c;
import com.bamtech.shadow.gson.internal.C2223g;
import com.bamtech.shadow.gson.internal.C2224h;
import com.bamtech.shadow.gson.internal.Excluder;
import com.bamtech.shadow.gson.p050r.C2245b;
import com.bamtech.shadow.gson.p050r.C2246c;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C2243q {

    /* renamed from: U */
    private final C2129e f6175U;

    /* renamed from: V */
    private final Excluder f6176V;

    /* renamed from: W */
    private final JsonAdapterAnnotationTypeAdapterFactory f6177W;

    /* renamed from: c */
    private final C2198c f6178c;

    /* renamed from: com.bamtech.shadow.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    class C2146a extends C2148c {

        /* renamed from: d */
        final /* synthetic */ Field f6179d;

        /* renamed from: e */
        final /* synthetic */ boolean f6180e;

        /* renamed from: f */
        final /* synthetic */ C2241p f6181f;

        /* renamed from: g */
        final /* synthetic */ Gson f6182g;

        /* renamed from: h */
        final /* synthetic */ TypeToken f6183h;

        /* renamed from: i */
        final /* synthetic */ boolean f6184i;

        C2146a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, C2241p pVar, Gson gson, TypeToken typeToken, boolean z4) {
            this.f6179d = field;
            this.f6180e = z3;
            this.f6181f = pVar;
            this.f6182g = gson;
            this.f6183h = typeToken;
            this.f6184i = z4;
            super(str, z, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11123a(C2252c cVar, Object obj) throws IOException, IllegalAccessException {
            C2241p pVar;
            Object obj2 = this.f6179d.get(obj);
            if (this.f6180e) {
                pVar = this.f6181f;
            } else {
                pVar = new C2196c(this.f6182g, this.f6181f, this.f6183h.getType());
            }
            pVar.mo11057a(cVar, obj2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11122a(C2249a aVar, Object obj) throws IOException, IllegalAccessException {
            Object a = this.f6181f.mo11055a(aVar);
            if (a != null || !this.f6184i) {
                this.f6179d.set(obj, a);
            }
        }

        /* renamed from: a */
        public boolean mo11124a(Object obj) throws IOException, IllegalAccessException {
            boolean z = false;
            if (!this.f6188b) {
                return false;
            }
            if (this.f6179d.get(obj) != obj) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    public static final class C2147b<T> extends C2241p<T> {

        /* renamed from: a */
        private final C2223g<T> f6185a;

        /* renamed from: b */
        private final Map<String, C2148c> f6186b;

        C2147b(C2223g<T> gVar, Map<String, C2148c> map) {
            this.f6185a = gVar;
            this.f6186b = map;
        }

        /* renamed from: a */
        public T mo11055a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            T a = this.f6185a.mo11200a();
            try {
                aVar.mo11162b();
                while (aVar.mo11166f()) {
                    C2148c cVar = (C2148c) this.f6186b.get(aVar.mo11172m());
                    if (cVar != null) {
                        if (cVar.f6189c) {
                            cVar.mo11122a(aVar, (Object) a);
                        }
                    }
                    aVar.mo11175p();
                }
                aVar.mo11165e();
                return a;
            } catch (IllegalStateException e) {
                throw new C2237n((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo11193h();
                return;
            }
            cVar.mo11185b();
            try {
                for (C2148c cVar2 : this.f6186b.values()) {
                    if (cVar2.mo11124a(t)) {
                        cVar.mo11190e(cVar2.f6187a);
                        cVar2.mo11123a(cVar, (Object) t);
                    }
                }
                cVar.mo11188d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.ReflectiveTypeAdapterFactory$c */
    static abstract class C2148c {

        /* renamed from: a */
        final String f6187a;

        /* renamed from: b */
        final boolean f6188b;

        /* renamed from: c */
        final boolean f6189c;

        protected C2148c(String str, boolean z, boolean z2) {
            this.f6187a = str;
            this.f6188b = z;
            this.f6189c = z2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo11122a(C2249a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo11123a(C2252c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo11124a(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(C2198c cVar, C2129e eVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f6178c = cVar;
        this.f6175U = eVar;
        this.f6176V = excluder;
        this.f6177W = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    public boolean mo11121a(Field field, boolean z) {
        return m8334a(field, z, this.f6176V);
    }

    /* renamed from: a */
    static boolean m8334a(Field field, boolean z, Excluder excluder) {
        return !excluder.mo11099a(field.getType(), z) && !excluder.mo11100a(field, z);
    }

    /* renamed from: a */
    private List<String> m8332a(Field field) {
        C2246c cVar = (C2246c) field.getAnnotation(C2246c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f6175U.mo11092a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new C2147b(this.f6178c.mo11198a(typeToken), m8333a(gson, typeToken, rawType));
    }

    /* renamed from: a */
    private C2148c m8331a(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        Gson gson2 = gson;
        TypeToken<?> typeToken2 = typeToken;
        boolean a = C2224h.m8572a((Type) typeToken.getRawType());
        Field field2 = field;
        C2245b bVar = (C2245b) field.getAnnotation(C2245b.class);
        C2241p a2 = bVar != null ? this.f6177W.mo11119a(this.f6178c, gson, typeToken2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = gson.mo11036a(typeToken2);
        }
        C2146a aVar = new C2146a(this, str, z, z2, field, z3, a2, gson, typeToken, a);
        return aVar;
    }

    /* renamed from: a */
    private Map<String, C2148c> m8333a(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo11121a(field, true);
                boolean a2 = mo11121a(field, z);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = C2136b.m8291a(typeToken2.getType(), cls2, field.getGenericType());
                    List a4 = m8332a(field);
                    int size = a4.size();
                    C2148c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        C2148c cVar2 = cVar;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C2148c) linkedHashMap.put(str2, m8331a(gson, field, str2, TypeToken.get(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C2148c cVar3 = cVar;
                    if (cVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(type);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(cVar3.f6187a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = TypeToken.get(C2136b.m8291a(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }
}
