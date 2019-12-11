package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2235l;
import com.bamtech.shadow.gson.C2237n;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.internal.C2136b;
import com.bamtech.shadow.gson.internal.C2198c;
import com.bamtech.shadow.gson.internal.C2213d;
import com.bamtech.shadow.gson.internal.C2223g;
import com.bamtech.shadow.gson.internal.C2225i;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class MapTypeAdapterFactory implements C2243q {

    /* renamed from: U */
    final boolean f6166U;

    /* renamed from: c */
    private final C2198c f6167c;

    /* renamed from: com.bamtech.shadow.gson.internal.bind.MapTypeAdapterFactory$a */
    private final class C2143a<K, V> extends C2241p<Map<K, V>> {

        /* renamed from: a */
        private final C2241p<K> f6168a;

        /* renamed from: b */
        private final C2241p<V> f6169b;

        /* renamed from: c */
        private final C2223g<? extends Map<K, V>> f6170c;

        public C2143a(Gson gson, Type type, C2241p<K> pVar, Type type2, C2241p<V> pVar2, C2223g<? extends Map<K, V>> gVar) {
            this.f6168a = new C2196c(gson, pVar, type);
            this.f6169b = new C2196c(gson, pVar2, type2);
            this.f6170c = gVar;
        }

        /* renamed from: a */
        public Map<K, V> m8325a(C2249a aVar) throws IOException {
            C2251b peek = aVar.peek();
            if (peek == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            Map<K, V> map = (Map) this.f6170c.mo11200a();
            String str = "duplicate key: ";
            if (peek == C2251b.BEGIN_ARRAY) {
                aVar.mo11161a();
                while (aVar.mo11166f()) {
                    aVar.mo11161a();
                    Object a = this.f6168a.mo11055a(aVar);
                    if (map.put(a, this.f6169b.mo11055a(aVar)) == null) {
                        aVar.mo11164d();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(a);
                        throw new C2237n(sb.toString());
                    }
                }
                aVar.mo11164d();
            } else {
                aVar.mo11162b();
                while (aVar.mo11166f()) {
                    C2213d.f6302a.mo11201a(aVar);
                    Object a2 = this.f6168a.mo11055a(aVar);
                    if (map.put(a2, this.f6169b.mo11055a(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(a2);
                        throw new C2237n(sb2.toString());
                    }
                }
                aVar.mo11165e();
            }
            return map;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.mo11193h();
            } else if (!MapTypeAdapterFactory.this.f6166U) {
                cVar.mo11185b();
                for (Entry entry : map.entrySet()) {
                    cVar.mo11190e(String.valueOf(entry.getKey()));
                    this.f6169b.mo11057a(cVar, entry.getValue());
                }
                cVar.mo11188d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    JsonElement a = this.f6168a.mo11269a(entry2.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry2.getValue());
                    z |= a.mo11075f() || a.mo11077h();
                }
                if (z) {
                    cVar.mo11181a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo11181a();
                        C2225i.m8575a((JsonElement) arrayList.get(i), cVar);
                        this.f6169b.mo11057a(cVar, arrayList2.get(i));
                        cVar.mo11186c();
                        i++;
                    }
                    cVar.mo11186c();
                } else {
                    cVar.mo11185b();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        cVar.mo11190e(m8323a((JsonElement) arrayList.get(i)));
                        this.f6169b.mo11057a(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.mo11188d();
                }
            }
        }

        /* renamed from: a */
        private String m8323a(JsonElement jsonElement) {
            if (jsonElement.mo11078i()) {
                C2235l d = jsonElement.mo11073d();
                if (d.mo11267q()) {
                    return String.valueOf(d.mo11265o());
                }
                if (d.mo11266p()) {
                    return Boolean.toString(d.mo11260j());
                }
                if (d.mo11268r()) {
                    return d.mo11074e();
                }
                throw new AssertionError();
            } else if (jsonElement.mo11076g()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public MapTypeAdapterFactory(C2198c cVar, boolean z) {
        this.f6167c = cVar;
        this.f6166U = z;
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] b = C2136b.m8298b(type, C2136b.m8301e(type));
        Gson gson2 = gson;
        C2143a aVar = new C2143a(gson2, b[0], m8321a(gson, b[0]), b[1], gson.mo11036a(TypeToken.get(b[1])), this.f6167c.mo11198a(typeToken));
        return aVar;
    }

    /* renamed from: a */
    private C2241p<?> m8321a(Gson gson, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.f6238f;
        }
        return gson.mo11036a(TypeToken.get(type));
    }
}
