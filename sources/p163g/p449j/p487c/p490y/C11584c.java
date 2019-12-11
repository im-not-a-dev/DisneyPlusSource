package p163g.p449j.p487c.p490y;

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
import p163g.p449j.p487c.C11555h;
import p163g.p449j.p487c.C11560m;
import p163g.p449j.p487c.p493z.C11689a;

/* renamed from: g.j.c.y.c */
/* compiled from: ConstructorConstructor */
public final class C11584c {

    /* renamed from: a */
    private final Map<Type, C11555h<?>> f27037a;

    /* renamed from: g.j.c.y.c$a */
    /* compiled from: ConstructorConstructor */
    class C11585a implements C11611h<T> {
        C11585a(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: g.j.c.y.c$b */
    /* compiled from: ConstructorConstructor */
    class C11586b implements C11611h<T> {
        C11586b(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new TreeMap();
        }
    }

    /* renamed from: g.j.c.y.c$c */
    /* compiled from: ConstructorConstructor */
    class C11587c implements C11611h<T> {
        C11587c(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: g.j.c.y.c$d */
    /* compiled from: ConstructorConstructor */
    class C11588d implements C11611h<T> {
        C11588d(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new C11603g();
        }
    }

    /* renamed from: g.j.c.y.c$e */
    /* compiled from: ConstructorConstructor */
    class C11589e implements C11611h<T> {

        /* renamed from: a */
        private final C11616k f27038a = C11616k.m37404a();

        /* renamed from: b */
        final /* synthetic */ Class f27039b;

        /* renamed from: c */
        final /* synthetic */ Type f27040c;

        C11589e(C11584c cVar, Class cls, Type type) {
            this.f27039b = cls;
            this.f27040c = type;
        }

        /* renamed from: a */
        public T mo29593a() {
            try {
                return this.f27038a.mo29649a(this.f27039b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to invoke no-args constructor for ");
                sb.append(this.f27040c);
                sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: g.j.c.y.c$f */
    /* compiled from: ConstructorConstructor */
    class C11590f implements C11611h<T> {

        /* renamed from: a */
        final /* synthetic */ C11555h f27041a;

        /* renamed from: b */
        final /* synthetic */ Type f27042b;

        C11590f(C11584c cVar, C11555h hVar, Type type) {
            this.f27041a = hVar;
            this.f27042b = type;
        }

        /* renamed from: a */
        public T mo29593a() {
            return this.f27041a.mo29532a(this.f27042b);
        }
    }

    /* renamed from: g.j.c.y.c$g */
    /* compiled from: ConstructorConstructor */
    class C11591g implements C11611h<T> {

        /* renamed from: a */
        final /* synthetic */ C11555h f27043a;

        /* renamed from: b */
        final /* synthetic */ Type f27044b;

        C11591g(C11584c cVar, C11555h hVar, Type type) {
            this.f27043a = hVar;
            this.f27044b = type;
        }

        /* renamed from: a */
        public T mo29593a() {
            return this.f27043a.mo29532a(this.f27044b);
        }
    }

    /* renamed from: g.j.c.y.c$h */
    /* compiled from: ConstructorConstructor */
    class C11592h implements C11611h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f27045a;

        C11592h(C11584c cVar, Constructor constructor) {
            this.f27045a = constructor;
        }

        /* renamed from: a */
        public T mo29593a() {
            String str = " with no args";
            String str2 = "Failed to invoke ";
            try {
                return this.f27045a.newInstance(null);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f27045a);
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f27045a);
                sb2.append(str);
                throw new RuntimeException(sb2.toString(), e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: g.j.c.y.c$i */
    /* compiled from: ConstructorConstructor */
    class C11593i implements C11611h<T> {
        C11593i(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new TreeSet();
        }
    }

    /* renamed from: g.j.c.y.c$j */
    /* compiled from: ConstructorConstructor */
    class C11594j implements C11611h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f27046a;

        C11594j(C11584c cVar, Type type) {
            this.f27046a = type;
        }

        /* renamed from: a */
        public T mo29593a() {
            Type type = this.f27046a;
            String str = "Invalid EnumSet type: ";
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f27046a.toString());
                throw new C11560m(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f27046a.toString());
            throw new C11560m(sb2.toString());
        }
    }

    /* renamed from: g.j.c.y.c$k */
    /* compiled from: ConstructorConstructor */
    class C11595k implements C11611h<T> {
        C11595k(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: g.j.c.y.c$l */
    /* compiled from: ConstructorConstructor */
    class C11596l implements C11611h<T> {
        C11596l(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: g.j.c.y.c$m */
    /* compiled from: ConstructorConstructor */
    class C11597m implements C11611h<T> {
        C11597m(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new ArrayList();
        }
    }

    /* renamed from: g.j.c.y.c$n */
    /* compiled from: ConstructorConstructor */
    class C11598n implements C11611h<T> {
        C11598n(C11584c cVar) {
        }

        /* renamed from: a */
        public T mo29593a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C11584c(Map<Type, C11555h<?>> map) {
        this.f27037a = map;
    }

    /* renamed from: b */
    private <T> C11611h<T> m37354b(Type type, Class<? super T> cls) {
        return new C11589e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C11611h<T> mo29591a(C11689a<T> aVar) {
        Type b = aVar.mo29702b();
        Class a = aVar.mo29701a();
        C11555h hVar = (C11555h) this.f27037a.get(b);
        if (hVar != null) {
            return new C11590f(this, hVar, b);
        }
        C11555h hVar2 = (C11555h) this.f27037a.get(a);
        if (hVar2 != null) {
            return new C11591g(this, hVar2, b);
        }
        C11611h<T> a2 = m37352a(a);
        if (a2 != null) {
            return a2;
        }
        C11611h<T> a3 = m37353a(b, a);
        if (a3 != null) {
            return a3;
        }
        return m37354b(b, a);
    }

    public String toString() {
        return this.f27037a.toString();
    }

    /* renamed from: a */
    private <T> C11611h<T> m37352a(Class<? super T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C11592h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C11611h<T> m37353a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C11593i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C11594j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C11595k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C11596l(this);
            }
            return new C11597m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C11598n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C11585a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C11586b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C11689a.m37637a(((ParameterizedType) type).getActualTypeArguments()[0]).mo29701a())) {
                return new C11588d(this);
            }
            return new C11587c(this);
        }
    }
}
