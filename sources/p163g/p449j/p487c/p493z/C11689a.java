package p163g.p449j.p487c.p493z;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p163g.p449j.p487c.p490y.C11579a;
import p163g.p449j.p487c.p490y.C11580b;

/* renamed from: g.j.c.z.a */
/* compiled from: TypeToken */
public class C11689a<T> {

    /* renamed from: a */
    final Class<? super T> f27220a;

    /* renamed from: b */
    final Type f27221b;

    /* renamed from: c */
    final int f27222c;

    protected C11689a() {
        this.f27221b = m37638b(C11689a.class);
        this.f27220a = C11580b.m37348e(this.f27221b);
        this.f27222c = this.f27221b.hashCode();
    }

    /* renamed from: b */
    static Type m37638b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C11580b.m37343b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo29701a() {
        return this.f27220a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11689a) && C11580b.m37342a(this.f27221b, ((C11689a) obj).f27221b);
    }

    public final int hashCode() {
        return this.f27222c;
    }

    public final String toString() {
        return C11580b.m37351h(this.f27221b);
    }

    /* renamed from: a */
    public static C11689a<?> m37637a(Type type) {
        return new C11689a<>(type);
    }

    /* renamed from: a */
    public static <T> C11689a<T> m37636a(Class<T> cls) {
        return new C11689a<>(cls);
    }

    C11689a(Type type) {
        C11579a.m37329a(type);
        this.f27221b = C11580b.m37343b(type);
        this.f27220a = C11580b.m37348e(this.f27221b);
        this.f27222c = this.f27221b.hashCode();
    }

    /* renamed from: b */
    public final Type mo29702b() {
        return this.f27221b;
    }
}
