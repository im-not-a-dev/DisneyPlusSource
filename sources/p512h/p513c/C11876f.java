package p512h.p513c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.inject.Provider;
import p512h.p513c.C11871b.C11872a;
import p512h.p515d.C11893a;
import p512h.p515d.C11897e;

/* renamed from: h.c.f */
/* compiled from: DispatchingAndroidInjector */
public final class C11876f<T> implements C11871b<T> {

    /* renamed from: a */
    private final Map<String, Provider<C11872a<?>>> f27533a;

    /* renamed from: h.c.f$a */
    /* compiled from: DispatchingAndroidInjector */
    public static final class C11877a extends RuntimeException {
        C11877a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    C11876f(Map<Class<?>, Provider<C11872a<?>>> map, Map<String, Provider<C11872a<?>>> map2) {
        this.f27533a = m38107a(map, map2);
    }

    /* renamed from: a */
    private static <C, V> Map<String, Provider<C11872a<?>>> m38107a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap c = C11893a.m38123c(map.size() + map2.size());
        c.putAll(map2);
        for (Entry entry : map.entrySet()) {
            c.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(c);
    }

    /* renamed from: c */
    private String m38108c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f27533a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    /* renamed from: b */
    public boolean mo30020b(T t) {
        Provider provider = (Provider) this.f27533a.get(t.getClass().getName());
        if (provider == null) {
            return false;
        }
        C11872a aVar = (C11872a) provider.get();
        try {
            C11871b a = aVar.mo11605a(t);
            C11897e.m38131a(a, "%s.create(I) should not return null.", aVar.getClass());
            a.mo11603a(t);
            return true;
        } catch (ClassCastException e) {
            throw new C11877a(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    /* renamed from: a */
    public void mo11603a(T t) {
        if (!mo30020b(t)) {
            throw new IllegalArgumentException(m38108c(t));
        }
    }
}
