package p520io.sentry.event.p550f;

import java.util.Deque;

/* renamed from: io.sentry.event.f.b */
/* compiled from: ExceptionInterface */
public class C12576b implements C12582h {

    /* renamed from: c */
    private final Deque<C12581g> f29138c;

    public C12576b(Throwable th) {
        this(C12581g.m39459a(th));
    }

    /* renamed from: Z */
    public String mo30763Z() {
        return "sentry.interfaces.Exception";
    }

    /* renamed from: a */
    public Deque<C12581g> mo30771a() {
        return this.f29138c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12576b.class != obj.getClass()) {
            return false;
        }
        return this.f29138c.equals(((C12576b) obj).f29138c);
    }

    public int hashCode() {
        return this.f29138c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExceptionInterface{exceptions=");
        sb.append(this.f29138c);
        sb.append('}');
        return sb.toString();
    }

    public C12576b(Deque<C12581g> deque) {
        this.f29138c = deque;
    }
}
