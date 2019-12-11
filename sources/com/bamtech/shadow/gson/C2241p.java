package com.bamtech.shadow.gson;

import com.bamtech.shadow.gson.internal.bind.C2194b;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2251b;
import com.bamtech.shadow.gson.p051s.C2252c;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.bamtech.shadow.gson.p */
/* compiled from: TypeAdapter */
public abstract class C2241p<T> {

    /* renamed from: com.bamtech.shadow.gson.p$a */
    /* compiled from: TypeAdapter */
    class C2242a extends C2241p<T> {
        C2242a() {
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo11193h();
            } else {
                C2241p.this.mo11057a(cVar, t);
            }
        }

        /* renamed from: a */
        public T mo11055a(C2249a aVar) throws IOException {
            if (aVar.peek() != C2251b.NULL) {
                return C2241p.this.mo11055a(aVar);
            }
            aVar.mo11173n();
            return null;
        }
    }

    /* renamed from: a */
    public final C2241p<T> mo11270a() {
        return new C2242a();
    }

    /* renamed from: a */
    public abstract T mo11055a(C2249a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo11057a(C2252c cVar, T t) throws IOException;

    /* renamed from: a */
    public final JsonElement mo11269a(T t) {
        try {
            C2194b bVar = new C2194b();
            mo11057a(bVar, t);
            return bVar.mo11194i();
        } catch (IOException e) {
            throw new C2133i((Throwable) e);
        }
    }

    /* renamed from: a */
    public final T mo11271a(Reader reader) throws IOException {
        return mo11055a(new C2249a(reader));
    }
}
