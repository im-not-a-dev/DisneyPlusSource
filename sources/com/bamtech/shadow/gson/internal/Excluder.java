package com.bamtech.shadow.gson.internal;

import com.bamtech.shadow.gson.C2121b;
import com.bamtech.shadow.gson.C2122c;
import com.bamtech.shadow.gson.C2241p;
import com.bamtech.shadow.gson.C2243q;
import com.bamtech.shadow.gson.Gson;
import com.bamtech.shadow.gson.p050r.C2244a;
import com.bamtech.shadow.gson.p050r.C2247d;
import com.bamtech.shadow.gson.p050r.C2248e;
import com.bamtech.shadow.gson.p051s.C2249a;
import com.bamtech.shadow.gson.p051s.C2252c;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class Excluder implements C2243q, Cloneable {

    /* renamed from: Z */
    public static final Excluder f6136Z = new Excluder();

    /* renamed from: U */
    private int f6137U = 136;

    /* renamed from: V */
    private boolean f6138V = true;

    /* renamed from: W */
    private boolean f6139W;

    /* renamed from: X */
    private List<C2121b> f6140X = Collections.emptyList();

    /* renamed from: Y */
    private List<C2121b> f6141Y = Collections.emptyList();

    /* renamed from: c */
    private double f6142c = -1.0d;

    /* renamed from: com.bamtech.shadow.gson.internal.Excluder$a */
    class C2134a extends C2241p<T> {

        /* renamed from: a */
        private C2241p<T> f6143a;

        /* renamed from: b */
        final /* synthetic */ boolean f6144b;

        /* renamed from: c */
        final /* synthetic */ boolean f6145c;

        /* renamed from: d */
        final /* synthetic */ Gson f6146d;

        /* renamed from: e */
        final /* synthetic */ TypeToken f6147e;

        C2134a(boolean z, boolean z2, Gson gson, TypeToken typeToken) {
            this.f6144b = z;
            this.f6145c = z2;
            this.f6146d = gson;
            this.f6147e = typeToken;
        }

        /* renamed from: b */
        private C2241p<T> m8279b() {
            C2241p<T> pVar = this.f6143a;
            if (pVar != null) {
                return pVar;
            }
            C2241p<T> a = this.f6146d.mo11035a((C2243q) Excluder.this, this.f6147e);
            this.f6143a = a;
            return a;
        }

        /* renamed from: a */
        public T mo11055a(C2249a aVar) throws IOException {
            if (!this.f6144b) {
                return m8279b().mo11055a(aVar);
            }
            aVar.mo11175p();
            return null;
        }

        /* renamed from: a */
        public void mo11057a(C2252c cVar, T t) throws IOException {
            if (this.f6145c) {
                cVar.mo11193h();
            } else {
                m8279b().mo11057a(cVar, t);
            }
        }
    }

    /* renamed from: b */
    private boolean m8274b(Class<?> cls) {
        return cls.isMemberClass() && !m8275c(cls);
    }

    /* renamed from: c */
    private boolean m8275c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C2241p<T> mo11098a(Gson gson, TypeToken<T> typeToken) {
        Class rawType = typeToken.getRawType();
        boolean a = mo11099a(rawType, true);
        boolean a2 = mo11099a(rawType, false);
        if (!a && !a2) {
            return null;
        }
        C2134a aVar = new C2134a(a2, a, gson, typeToken);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public boolean mo11100a(Field field, boolean z) {
        if ((this.f6137U & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f6142c != -1.0d && !m8271a((C2247d) field.getAnnotation(C2247d.class), (C2248e) field.getAnnotation(C2248e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f6139W) {
            C2244a aVar = (C2244a) field.getAnnotation(C2244a.class);
            if (aVar == null || (!z ? !aVar.deserialize() : !aVar.serialize())) {
                return true;
            }
        }
        if ((!this.f6138V && m8274b(field.getType())) || m8273a(field.getType())) {
            return true;
        }
        List<C2121b> list = z ? this.f6140X : this.f6141Y;
        if (!list.isEmpty()) {
            C2122c cVar = new C2122c(field);
            for (C2121b a : list) {
                if (a.mo11090a(cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo11099a(Class<?> cls, boolean z) {
        if (this.f6142c != -1.0d && !m8271a((C2247d) cls.getAnnotation(C2247d.class), (C2248e) cls.getAnnotation(C2248e.class))) {
            return true;
        }
        if ((!this.f6138V && m8274b(cls)) || m8273a(cls)) {
            return true;
        }
        for (C2121b a : z ? this.f6140X : this.f6141Y) {
            if (a.mo11091a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m8273a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    private boolean m8271a(C2247d dVar, C2248e eVar) {
        return m8270a(dVar) && m8272a(eVar);
    }

    /* renamed from: a */
    private boolean m8270a(C2247d dVar) {
        return dVar == null || dVar.value() <= this.f6142c;
    }

    /* renamed from: a */
    private boolean m8272a(C2248e eVar) {
        return eVar == null || eVar.value() > this.f6142c;
    }
}
