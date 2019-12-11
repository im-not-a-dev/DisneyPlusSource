package com.bamtech.shadow.gson.internal;

import com.bamtech.shadow.gson.C2130f;
import com.bamtech.shadow.gson.C2133i;
import com.bamtech.shadow.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.bamtech.shadow.gson.internal.c */
/* compiled from: ConstructorConstructor */
public final class C2198c {

    /* renamed from: a */
    private final Map<Type, C2130f<?>> f6292a;

    /* renamed from: com.bamtech.shadow.gson.internal.c$a */
    /* compiled from: ConstructorConstructor */
    class C2199a implements C2223g<T> {
        C2199a(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$b */
    /* compiled from: ConstructorConstructor */
    class C2200b implements C2223g<T> {
        C2200b(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$c */
    /* compiled from: ConstructorConstructor */
    class C2201c implements C2223g<T> {
        C2201c(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$d */
    /* compiled from: ConstructorConstructor */
    class C2202d implements C2223g<T> {
        C2202d(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new C2215f();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$e */
    /* compiled from: ConstructorConstructor */
    class C2203e implements C2223g<T> {

        /* renamed from: a */
        private final C2228j f6293a = C2228j.m8576a();

        /* renamed from: b */
        final /* synthetic */ Class f6294b;

        /* renamed from: c */
        final /* synthetic */ Type f6295c;

        C2203e(C2198c cVar, Class cls, Type type) {
            this.f6294b = cls;
            this.f6295c = type;
        }

        /* renamed from: a */
        public T mo11200a() {
            try {
                return this.f6293a.mo11254a(this.f6294b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to invoke no-args constructor for ");
                sb.append(this.f6295c);
                sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$f */
    /* compiled from: ConstructorConstructor */
    class C2204f implements C2223g<T> {

        /* renamed from: a */
        final /* synthetic */ C2130f f6296a;

        /* renamed from: b */
        final /* synthetic */ Type f6297b;

        C2204f(C2198c cVar, C2130f fVar, Type type) {
            this.f6296a = fVar;
            this.f6297b = type;
        }

        /* renamed from: a */
        public T mo11200a() {
            return this.f6296a.mo11093a(this.f6297b);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$g */
    /* compiled from: ConstructorConstructor */
    class C2205g implements C2223g<T> {

        /* renamed from: a */
        final /* synthetic */ C2130f f6298a;

        /* renamed from: b */
        final /* synthetic */ Type f6299b;

        C2205g(C2198c cVar, C2130f fVar, Type type) {
            this.f6298a = fVar;
            this.f6299b = type;
        }

        /* renamed from: a */
        public T mo11200a() {
            return this.f6298a.mo11093a(this.f6299b);
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$h */
    /* compiled from: ConstructorConstructor */
    class C2206h implements C2223g<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f6300a;

        C2206h(C2198c cVar, Constructor constructor) {
            this.f6300a = constructor;
        }

        /* renamed from: a */
        public T mo11200a() {
            String str = " with no args";
            String str2 = "Failed to invoke ";
            try {
                return this.f6300a.newInstance(null);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f6300a);
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f6300a);
                sb2.append(str);
                throw new RuntimeException(sb2.toString(), e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$i */
    /* compiled from: ConstructorConstructor */
    class C2207i implements C2223g<T> {
        C2207i(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$j */
    /* compiled from: ConstructorConstructor */
    class C2208j implements C2223g<T> {

        /* renamed from: a */
        final /* synthetic */ Type f6301a;

        C2208j(C2198c cVar, Type type) {
            this.f6301a = type;
        }

        /* renamed from: a */
        public T mo11200a() {
            Type type = this.f6301a;
            String str = "Invalid EnumSet type: ";
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f6301a.toString());
                throw new C2133i(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f6301a.toString());
            throw new C2133i(sb2.toString());
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$k */
    /* compiled from: ConstructorConstructor */
    class C2209k implements C2223g<T> {
        C2209k(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$l */
    /* compiled from: ConstructorConstructor */
    class C2210l implements C2223g<T> {
        C2210l(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$m */
    /* compiled from: ConstructorConstructor */
    class C2211m implements C2223g<T> {
        C2211m(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.c$n */
    /* compiled from: ConstructorConstructor */
    class C2212n implements C2223g<T> {
        C2212n(C2198c cVar) {
        }

        /* renamed from: a */
        public T mo11200a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C2198c(Map<Type, C2130f<?>> map) {
        this.f6292a = map;
    }

    /* renamed from: b */
    private <T> C2223g<T> m8538b(Type type, Class<? super T> cls) {
        return new C2203e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C2223g<T> mo11198a(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        C2130f fVar = (C2130f) this.f6292a.get(type);
        if (fVar != null) {
            return new C2204f(this, fVar, type);
        }
        C2130f fVar2 = (C2130f) this.f6292a.get(rawType);
        if (fVar2 != null) {
            return new C2205g(this, fVar2, type);
        }
        C2223g<T> a = m8536a(rawType);
        if (a != null) {
            return a;
        }
        C2223g<T> a2 = m8537a(type, rawType);
        if (a2 != null) {
            return a2;
        }
        return m8538b(type, rawType);
    }

    public String toString() {
        return this.f6292a.toString();
    }

    /* renamed from: a */
    private <T> C2223g<T> m8536a(Class<? super T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C2206h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C2223g<T> m8537a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C2207i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C2208j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C2209k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C2210l(this);
            }
            return new C2211m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C2212n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C2199a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C2200b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C2202d(this);
            }
            return new C2201c(this);
        }
    }
}
