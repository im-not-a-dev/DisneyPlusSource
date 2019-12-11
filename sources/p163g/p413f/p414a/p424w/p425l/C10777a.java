package p163g.p413f.p414a.p424w.p425l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p096e.p121h.p134r.C4114f;
import p096e.p121h.p134r.C4116h;

/* renamed from: g.f.a.w.l.a */
/* compiled from: FactoryPools */
public final class C10777a {

    /* renamed from: a */
    private static final C10784g<Object> f25491a = new C10778a();

    /* renamed from: g.f.a.w.l.a$a */
    /* compiled from: FactoryPools */
    class C10778a implements C10784g<Object> {
        C10778a() {
        }

        /* renamed from: a */
        public void mo27819a(Object obj) {
        }
    }

    /* renamed from: g.f.a.w.l.a$b */
    /* compiled from: FactoryPools */
    class C10779b implements C10781d<List<T>> {
        C10779b() {
        }

        public List<T> create() {
            return new ArrayList();
        }
    }

    /* renamed from: g.f.a.w.l.a$c */
    /* compiled from: FactoryPools */
    class C10780c implements C10784g<List<T>> {
        C10780c() {
        }

        /* renamed from: a */
        public void mo27819a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: g.f.a.w.l.a$d */
    /* compiled from: FactoryPools */
    public interface C10781d<T> {
        T create();
    }

    /* renamed from: g.f.a.w.l.a$e */
    /* compiled from: FactoryPools */
    private static final class C10782e<T> implements C4114f<T> {

        /* renamed from: a */
        private final C10781d<T> f25492a;

        /* renamed from: b */
        private final C10784g<T> f25493b;

        /* renamed from: c */
        private final C4114f<T> f25494c;

        C10782e(C4114f<T> fVar, C10781d<T> dVar, C10784g<T> gVar) {
            this.f25494c = fVar;
            this.f25492a = dVar;
            this.f25493b = gVar;
        }

        /* renamed from: a */
        public T mo14666a() {
            T a = this.f25494c.mo14666a();
            if (a == null) {
                a = this.f25492a.create();
                String str = "FactoryPools";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(a.getClass());
                    Log.v(str, sb.toString());
                }
            }
            if (a instanceof C10783f) {
                ((C10783f) a).mo21296d().mo27822a(false);
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo14667a(T t) {
            if (t instanceof C10783f) {
                ((C10783f) t).mo21296d().mo27822a(true);
            }
            this.f25493b.mo27819a(t);
            return this.f25494c.mo14667a(t);
        }
    }

    /* renamed from: g.f.a.w.l.a$f */
    /* compiled from: FactoryPools */
    public interface C10783f {
        /* renamed from: d */
        C10786c mo21296d();
    }

    /* renamed from: g.f.a.w.l.a$g */
    /* compiled from: FactoryPools */
    public interface C10784g<T> {
        /* renamed from: a */
        void mo27819a(T t);
    }

    /* renamed from: a */
    public static <T extends C10783f> C4114f<T> m34038a(int i, C10781d<T> dVar) {
        return m34039a((C4114f<T>) new C4116h<T>(i), dVar);
    }

    /* renamed from: b */
    public static <T> C4114f<List<T>> m34042b() {
        return m34037a(20);
    }

    /* renamed from: a */
    public static <T> C4114f<List<T>> m34037a(int i) {
        return m34040a(new C4116h(i), new C10779b(), new C10780c());
    }

    /* renamed from: a */
    private static <T extends C10783f> C4114f<T> m34039a(C4114f<T> fVar, C10781d<T> dVar) {
        return m34040a(fVar, dVar, m34041a());
    }

    /* renamed from: a */
    private static <T> C4114f<T> m34040a(C4114f<T> fVar, C10781d<T> dVar, C10784g<T> gVar) {
        return new C10782e(fVar, dVar, gVar);
    }

    /* renamed from: a */
    private static <T> C10784g<T> m34041a() {
        return f25491a;
    }
}
