package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.bind.ReflectiveTypeAdapterFactory.C2147b;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.bamtech.shadow.gson.internal.bind.c */
/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class C2196c<T> extends C2241p<T> {

    /* renamed from: a */
    private final Gson f6288a;

    /* renamed from: b */
    private final C2241p<T> f6289b;

    /* renamed from: c */
    private final Type f6290c;

    C2196c(Gson gson, C2241p<T> pVar, Type type) {
        this.f6288a = gson;
        this.f6289b = pVar;
        this.f6290c = type;
    }

    /* renamed from: a */
    public T mo11055a(C2249a aVar) throws IOException {
        return this.f6289b.mo11055a(aVar);
    }

    /* renamed from: a */
    public void mo11057a(C2252c cVar, T t) throws IOException {
        C2241p<T> pVar = this.f6289b;
        Type a = m8529a(this.f6290c, (Object) t);
        if (a != this.f6290c) {
            pVar = this.f6288a.mo11036a(TypeToken.get(a));
            if (pVar instanceof C2147b) {
                C2241p<T> pVar2 = this.f6289b;
                if (!(pVar2 instanceof C2147b)) {
                    pVar = pVar2;
                }
            }
        }
        pVar.mo11057a(cVar, t);
    }

    /* renamed from: a */
    private Type m8529a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }
}
