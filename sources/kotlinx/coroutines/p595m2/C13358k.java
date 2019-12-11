package kotlinx.coroutines.p595m2;

import kotlinx.coroutines.C13323k0;

/* renamed from: kotlinx.coroutines.m2.k */
/* compiled from: Tasks.kt */
public final class C13358k extends C13356i {

    /* renamed from: V */
    public final Runnable f29836V;

    public C13358k(Runnable runnable, long j, C13357j jVar) {
        super(j, jVar);
        this.f29836V = runnable;
    }

    public void run() {
        try {
            this.f29836V.run();
        } finally {
            this.f29834U.mo34546b();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(C13323k0.m40937a((Object) this.f29836V));
        sb.append('@');
        sb.append(C13323k0.m40939b(this.f29836V));
        String str = ", ";
        sb.append(str);
        sb.append(this.f29835c);
        sb.append(str);
        sb.append(this.f29834U);
        sb.append(']');
        return sb.toString();
    }
}
