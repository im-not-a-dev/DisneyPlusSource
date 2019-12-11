package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.C2136b;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends C2241p<Object> {

    /* renamed from: c */
    public static final C2243q f6156c = new C2243q() {
        /* renamed from: a */
        public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d = C2136b.m8300d(type);
            return new ArrayTypeAdapter(gson, gson.mo11036a(TypeToken.get(d)), C2136b.m8301e(d));
        }
    };

    /* renamed from: a */
    private final Class<E> f6157a;

    /* renamed from: b */
    private final C2241p<E> f6158b;

    public ArrayTypeAdapter(Gson gson, C2241p<E> pVar, Class<E> cls) {
        this.f6158b = new C2196c(gson, pVar, cls);
        this.f6157a = cls;
    }

    /* renamed from: a */
    public Object mo11055a(C2249a aVar) throws IOException {
        if (aVar.peek() == C2251b.NULL) {
            aVar.mo11173n();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo11161a();
        while (aVar.mo11166f()) {
            arrayList.add(this.f6158b.mo11055a(aVar));
        }
        aVar.mo11164d();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f6157a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo11057a(C2252c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo11193h();
            return;
        }
        cVar.mo11181a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f6158b.mo11057a(cVar, Array.get(obj, i));
        }
        cVar.mo11186c();
    }
}
