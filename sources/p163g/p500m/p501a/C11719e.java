package p163g.p500m.p501a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p163g.p500m.p501a.C11725h.C11732g;

/* renamed from: g.m.a.e */
/* compiled from: CollectionJsonAdapter */
abstract class C11719e<C extends Collection<T>, T> extends C11725h<C> {

    /* renamed from: b */
    public static final C11732g f27290b = new C11720a();

    /* renamed from: a */
    private final C11725h<T> f27291a;

    /* renamed from: g.m.a.e$a */
    /* compiled from: CollectionJsonAdapter */
    class C11720a implements C11732g {
        C11720a() {
        }

        /* renamed from: a */
        public C11725h<?> mo11720a(Type type, Set<? extends Annotation> set, C11760v vVar) {
            Class<Set> d = C11780y.m37902d(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (d == List.class || d == Collection.class) {
                return C11719e.m37693a(type, vVar).nullSafe();
            }
            if (d == Set.class) {
                return C11719e.m37694b(type, vVar).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: g.m.a.e$b */
    /* compiled from: CollectionJsonAdapter */
    class C11721b extends C11719e<Collection<T>, T> {
        C11721b(C11725h hVar) {
            super(hVar, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Collection<T> mo29734a() {
            return new ArrayList();
        }

        public /* bridge */ /* synthetic */ Object fromJson(C11737m mVar) throws IOException {
            return C11719e.super.fromJson(mVar);
        }

        public /* bridge */ /* synthetic */ void toJson(C11747s sVar, Object obj) throws IOException {
            C11719e.super.mo29735a(sVar, (Collection) obj);
        }
    }

    /* renamed from: g.m.a.e$c */
    /* compiled from: CollectionJsonAdapter */
    class C11722c extends C11719e<Set<T>, T> {
        C11722c(C11725h hVar) {
            super(hVar, null);
        }

        public /* bridge */ /* synthetic */ Object fromJson(C11737m mVar) throws IOException {
            return C11719e.super.fromJson(mVar);
        }

        public /* bridge */ /* synthetic */ void toJson(C11747s sVar, Object obj) throws IOException {
            C11719e.super.mo29735a(sVar, (Set) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Set<T> m37700a() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ C11719e(C11725h hVar, C11720a aVar) {
        this(hVar);
    }

    /* renamed from: a */
    static <T> C11725h<Collection<T>> m37693a(Type type, C11760v vVar) {
        return new C11721b(vVar.mo29867a(C11780y.m37896a(type, Collection.class)));
    }

    /* renamed from: b */
    static <T> C11725h<Set<T>> m37694b(Type type, C11760v vVar) {
        return new C11722c(vVar.mo29867a(C11780y.m37896a(type, Collection.class)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C mo29734a();

    public C fromJson(C11737m mVar) throws IOException {
        C a = mo29734a();
        mVar.mo29760a();
        while (mVar.mo29770f()) {
            a.add(this.f27291a.fromJson(mVar));
        }
        mVar.mo29766c();
        return a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27291a);
        sb.append(".collection()");
        return sb.toString();
    }

    private C11719e(C11725h<T> hVar) {
        this.f27291a = hVar;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=C, code=C<java.lang.Object>, for r4v0, types: [C, C<java.lang.Object>, java.util.Collection] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29735a(p163g.p500m.p501a.C11747s r3, C<java.lang.Object> r4) throws java.io.IOException {
        /*
            r2 = this;
            r3.mo29787a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0007:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r4.next()
            g.m.a.h<T> r1 = r2.f27291a
            r1.toJson(r3, r0)
            goto L_0x0007
        L_0x0017:
            r3.mo29794d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11719e.mo29735a(g.m.a.s, java.util.Collection):void");
    }
}
