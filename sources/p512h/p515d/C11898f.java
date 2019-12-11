package p512h.p515d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: h.d.f */
/* compiled from: SetFactory */
public final class C11898f<T> implements C11895c<Set<T>> {

    /* renamed from: a */
    private final List<Provider<T>> f27541a;

    /* renamed from: b */
    private final List<Provider<Collection<T>>> f27542b;

    /* renamed from: h.d.f$b */
    /* compiled from: SetFactory */
    public static final class C11900b<T> {

        /* renamed from: a */
        private final List<Provider<T>> f27543a;

        /* renamed from: b */
        private final List<Provider<Collection<T>>> f27544b;

        /* renamed from: a */
        public C11900b<T> mo30024a(Provider<? extends T> provider) {
            this.f27543a.add(provider);
            return this;
        }

        private C11900b(int i, int i2) {
            this.f27543a = C11893a.m38124d(i);
            this.f27544b = C11893a.m38124d(i2);
        }

        /* renamed from: a */
        public C11898f<T> mo30025a() {
            return new C11898f<>(this.f27543a, this.f27544b);
        }
    }

    static {
        C11896d.m38128a(Collections.emptySet());
    }

    /* renamed from: a */
    public static <T> C11900b<T> m38133a(int i, int i2) {
        return new C11900b<>(i, i2);
    }

    private C11898f(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f27541a = list;
        this.f27542b = list2;
    }

    public Set<T> get() {
        int size = this.f27541a.size();
        ArrayList arrayList = new ArrayList(this.f27542b.size());
        int size2 = this.f27542b.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((Provider) this.f27542b.get(i2)).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet b = C11893a.m38122b(i);
        int size3 = this.f27541a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = ((Provider) this.f27541a.get(i3)).get();
            C11897e.m38129a(obj);
            b.add(obj);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object next : (Collection) arrayList.get(i4)) {
                C11897e.m38129a(next);
                b.add(next);
            }
        }
        return Collections.unmodifiableSet(b);
    }
}
