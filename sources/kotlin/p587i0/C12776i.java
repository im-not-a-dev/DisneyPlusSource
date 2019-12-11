package kotlin.p587i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C12900n;
import kotlin.C12900n.C12901a;
import kotlin.C12903o;
import kotlin.C13145v;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.p573a0.C12683c;
import kotlin.p573a0.C12688f;
import kotlin.p573a0.C12694g;
import kotlin.p573a0.p575i.p576a.C12708h;

/* renamed from: kotlin.i0.i */
/* compiled from: SequenceBuilder.kt */
final class C12776i<T> extends C12777j<T> implements Iterator<T>, C12683c<C13145v>, C12872a {

    /* renamed from: U */
    private T f29450U;

    /* renamed from: V */
    private Iterator<? extends T> f29451V;

    /* renamed from: W */
    private C12683c<? super C13145v> f29452W;

    /* renamed from: c */
    private int f29453c;

    /* renamed from: c */
    private final Throwable m39941c() {
        int i = this.f29453c;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state of the iterator: ");
        sb.append(this.f29453c);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    private final T m39942d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final void mo31099a(C12683c<? super C13145v> cVar) {
        this.f29452W = cVar;
    }

    /* renamed from: b */
    public void mo31039b(Object obj) {
        C12903o.m40241a(obj);
        this.f29453c = 4;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f29453c;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f29451V;
                    if (it == null) {
                        C12880j.m40220a();
                        throw null;
                    } else if (it.hasNext()) {
                        this.f29453c = 2;
                        return true;
                    } else {
                        this.f29451V = null;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m39941c();
                }
            }
            this.f29453c = 5;
            C12683c<? super C13145v> cVar = this.f29452W;
            if (cVar != null) {
                this.f29452W = null;
                C13145v vVar = C13145v.f29587a;
                C12901a aVar = C12900n.f29540c;
                C12900n.m40236a(vVar);
                cVar.mo31039b(vVar);
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
    }

    public T next() {
        int i = this.f29453c;
        if (i == 0 || i == 1) {
            return m39942d();
        }
        if (i == 2) {
            this.f29453c = 1;
            Iterator<? extends T> it = this.f29451V;
            if (it != null) {
                return it.next();
            }
            C12880j.m40220a();
            throw null;
        } else if (i == 3) {
            this.f29453c = 0;
            T t = this.f29450U;
            this.f29450U = null;
            return t;
        } else {
            throw m39941c();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: a */
    public Object mo31098a(T t, C12683c<? super C13145v> cVar) {
        this.f29450U = t;
        this.f29453c = 3;
        mo31099a(cVar);
        Object a = C12700d.m39820a();
        if (a == C12700d.m39820a()) {
            C12708h.m39847c(cVar);
        }
        return a;
    }

    /* renamed from: b */
    public C12688f mo31038b() {
        return C12694g.f29383c;
    }
}
