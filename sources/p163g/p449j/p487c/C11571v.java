package p163g.p449j.p487c;

import java.io.IOException;
import p163g.p449j.p487c.p488a0.C11533a;
import p163g.p449j.p487c.p488a0.C11535b;
import p163g.p449j.p487c.p488a0.C11536c;
import p163g.p449j.p487c.p490y.p491l.C11630f;

/* renamed from: g.j.c.v */
/* compiled from: TypeAdapter */
public abstract class C11571v<T> {

    /* renamed from: g.j.c.v$a */
    /* compiled from: TypeAdapter */
    class C11572a extends C11571v<T> {
        C11572a() {
        }

        /* renamed from: a */
        public void mo29459a(C11536c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo29503h();
            } else {
                C11571v.this.mo29459a(cVar, t);
            }
        }

        /* renamed from: a */
        public T mo29458a(C11533a aVar) throws IOException {
            if (aVar.peek() != C11535b.NULL) {
                return C11571v.this.mo29458a(aVar);
            }
            aVar.mo29478n();
            return null;
        }
    }

    /* renamed from: a */
    public final C11571v<T> mo29567a() {
        return new C11572a();
    }

    /* renamed from: a */
    public abstract T mo29458a(C11533a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo29459a(C11536c cVar, T t) throws IOException;

    /* renamed from: a */
    public final C11559l mo29566a(T t) {
        try {
            C11630f fVar = new C11630f();
            mo29459a(fVar, t);
            return fVar.mo29656i();
        } catch (IOException e) {
            throw new C11560m((Throwable) e);
        }
    }
}
