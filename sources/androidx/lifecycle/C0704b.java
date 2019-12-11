package androidx.lifecycle;

import androidx.lifecycle.C0715i.C0716a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.lifecycle.b */
/* compiled from: ClassesInfoCache */
class C0704b {

    /* renamed from: c */
    static C0704b f2985c = new C0704b();

    /* renamed from: a */
    private final Map<Class, C0705a> f2986a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Boolean> f2987b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    /* compiled from: ClassesInfoCache */
    static class C0705a {

        /* renamed from: a */
        final Map<C0716a, List<C0706b>> f2988a = new HashMap();

        /* renamed from: b */
        final Map<C0706b, C0716a> f2989b;

        C0705a(Map<C0706b, C0716a> map) {
            this.f2989b = map;
            for (Entry entry : map.entrySet()) {
                C0716a aVar = (C0716a) entry.getValue();
                List list = (List) this.f2988a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2988a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4114a(C0722m mVar, C0716a aVar, Object obj) {
            m3726a((List) this.f2988a.get(aVar), mVar, aVar, obj);
            m3726a((List) this.f2988a.get(C0716a.ON_ANY), mVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m3726a(List<C0706b> list, C0722m mVar, C0716a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0706b) list.get(size)).mo4115a(mVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    /* compiled from: ClassesInfoCache */
    static class C0706b {

        /* renamed from: a */
        final int f2990a;

        /* renamed from: b */
        final Method f2991b;

        C0706b(int i, Method method) {
            this.f2990a = i;
            this.f2991b = method;
            this.f2991b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4115a(C0722m mVar, C0716a aVar, Object obj) {
            try {
                int i = this.f2990a;
                if (i == 0) {
                    this.f2991b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2991b.invoke(obj, new Object[]{mVar});
                } else if (i == 2) {
                    this.f2991b.invoke(obj, new Object[]{mVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0706b.class != obj.getClass()) {
                return false;
            }
            C0706b bVar = (C0706b) obj;
            if (this.f2990a != bVar.f2990a || !this.f2991b.getName().equals(bVar.f2991b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f2990a * 31) + this.f2991b.getName().hashCode();
        }
    }

    C0704b() {
    }

    /* renamed from: c */
    private Method[] m3723c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0705a mo4112a(Class cls) {
        C0705a aVar = (C0705a) this.f2986a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m3721a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4113b(Class cls) {
        Boolean bool = (Boolean) this.f2987b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m3723c(cls);
        for (Method annotation : c) {
            if (((C0732u) annotation.getAnnotation(C0732u.class)) != null) {
                m3721a(cls, c);
                return true;
            }
        }
        this.f2987b.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private void m3722a(Map<C0706b, C0716a> map, C0706b bVar, C0716a aVar, Class cls) {
        C0716a aVar2 = (C0716a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2991b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0705a m3721a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0705a a = mo4112a(superclass);
            if (a != null) {
                hashMap.putAll(a.f2989b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo4112a(a2).f2989b.entrySet()) {
                m3722a(hashMap, (C0706b) entry.getKey(), (C0716a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3723c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0732u uVar = (C0732u) method.getAnnotation(C0732u.class);
            if (uVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0722m.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0716a value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0716a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0716a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m3722a(hashMap, new C0706b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0705a aVar = new C0705a(hashMap);
        this.f2986a.put(cls, aVar);
        this.f2987b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
