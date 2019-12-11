package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2132h;
import com.bamtech.shadow.gson.C2234k;
import com.bamtech.shadow.gson.C2236m;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.JsonDeserializationContext;
import com.bamtech.shadow.gson.JsonElement;
import com.bamtech.shadow.gson.JsonSerializationContext;
import com.bamtech.shadow.gson.internal.C2135a;
import com.bamtech.shadow.gson.internal.C2225i;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends C2241p<T> {

    /* renamed from: a */
    private final C2236m<T> f6194a;

    /* renamed from: b */
    private final C2132h<T> f6195b;

    /* renamed from: c */
    final Gson f6196c;

    /* renamed from: d */
    private final TypeToken<T> f6197d;

    /* renamed from: e */
    private final C2243q f6198e;

    /* renamed from: f */
    private final C2152b f6199f = new C2152b<>();

    /* renamed from: g */
    private C2241p<T> f6200g;

    private static final class SingleTypeFactory implements C2243q {

        /* renamed from: U */
        private final boolean f6201U;

        /* renamed from: V */
        private final Class<?> f6202V;

        /* renamed from: W */
        private final C2236m<?> f6203W;

        /* renamed from: X */
        private final C2132h<?> f6204X;

        /* renamed from: c */
        private final TypeToken<?> f6205c;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            C2132h<?> hVar = null;
            this.f6203W = obj instanceof C2236m ? (C2236m) obj : null;
            if (obj instanceof C2132h) {
                hVar = (C2132h) obj;
            }
            this.f6204X = hVar;
            C2135a.m8283a((this.f6203W == null && this.f6204X == null) ? false : true);
            this.f6205c = typeToken;
            this.f6201U = z;
            this.f6202V = cls;
        }

        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.f6205c;
            boolean z = typeToken2 != null ? typeToken2.equals(typeToken) || (this.f6201U && this.f6205c.getType() == typeToken.getRawType()) : this.f6202V.isAssignableFrom(typeToken.getRawType());
            if (!z) {
                return null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(this.f6203W, this.f6204X, gson, typeToken, this);
            return treeTypeAdapter;
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.bind.TreeTypeAdapter$b */
    private final class C2152b implements JsonSerializationContext, JsonDeserializationContext {
        private C2152b() {
        }

        /* renamed from: a */
        public <R> R mo11070a(JsonElement jsonElement, Type type) throws C2234k {
            return TreeTypeAdapter.this.f6196c.mo11040a(jsonElement, type);
        }

        public JsonElement serialize(Object obj) {
            return TreeTypeAdapter.this.f6196c.mo11052b(obj);
        }
    }

    public TreeTypeAdapter(C2236m<T> mVar, C2132h<T> hVar, Gson gson, TypeToken<T> typeToken, C2243q qVar) {
        this.f6194a = mVar;
        this.f6195b = hVar;
        this.f6196c = gson;
        this.f6197d = typeToken;
        this.f6198e = qVar;
    }

    /* renamed from: b */
    private C2241p<T> m8357b() {
        C2241p<T> pVar = this.f6200g;
        if (pVar != null) {
            return pVar;
        }
        C2241p<T> a = this.f6196c.mo11035a(this.f6198e, this.f6197d);
        this.f6200g = a;
        return a;
    }

    /* renamed from: a */
    public T mo11055a(C2249a aVar) throws IOException {
        if (this.f6195b == null) {
            return m8357b().mo11055a(aVar);
        }
        JsonElement a = C2225i.m8573a(aVar);
        if (a.mo11076g()) {
            return null;
        }
        return this.f6195b.deserialize(a, this.f6197d.getType(), this.f6199f);
    }

    /* renamed from: a */
    public void mo11057a(C2252c cVar, T t) throws IOException {
        C2236m<T> mVar = this.f6194a;
        if (mVar == null) {
            m8357b().mo11057a(cVar, t);
        } else if (t == null) {
            cVar.mo11193h();
        } else {
            C2225i.m8575a(mVar.serialize(t, this.f6197d.getType(), this.f6199f), cVar);
        }
    }

    /* renamed from: a */
    public static C2243q m8355a(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    /* renamed from: a */
    public static C2243q m8356a(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }
}
