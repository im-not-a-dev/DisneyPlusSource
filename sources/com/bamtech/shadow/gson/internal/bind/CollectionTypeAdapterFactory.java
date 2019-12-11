package com.bamtech.shadow.gson.internal.bind;

import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.internal.C2136b;
import com.bamtech.shadow.gson.internal.C2198c;
import com.bamtech.shadow.gson.internal.C2223g;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C2243q {

    /* renamed from: c */
    private final C2198c f6159c;

    /* renamed from: com.bamtech.shadow.gson.internal.bind.CollectionTypeAdapterFactory$a */
    private static final class C2141a<E> extends C2241p<Collection<E>> {

        /* renamed from: a */
        private final C2241p<E> f6160a;

        /* renamed from: b */
        private final C2223g<? extends Collection<E>> f6161b;

        public C2141a(Gson gson, Type type, C2241p<E> pVar, C2223g<? extends Collection<E>> gVar) {
            this.f6160a = new C2196c(gson, pVar, type);
            this.f6161b = gVar;
        }

        /* renamed from: a */
        public Collection<E> m8310a(C2249a aVar) throws IOException {
            if (aVar.peek() == C2251b.NULL) {
                aVar.mo11173n();
                return null;
            }
            Collection<E> collection = (Collection) this.f6161b.mo11200a();
            aVar.mo11161a();
            while (aVar.mo11166f()) {
                collection.add(this.f6160a.mo11055a(aVar));
            }
            aVar.mo11164d();
            return collection;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.mo11193h();
                return;
            }
            cVar.mo11181a();
            for (E a : collection) {
                this.f6160a.mo11057a(cVar, a);
            }
            cVar.mo11186c();
        }
    }

    public CollectionTypeAdapterFactory(C2198c cVar) {
        this.f6159c = cVar;
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type a = C2136b.m8289a(type, rawType);
        return new C2141a(gson, a, gson.mo11036a(TypeToken.get(a)), this.f6159c.mo11198a(typeToken));
    }
}
