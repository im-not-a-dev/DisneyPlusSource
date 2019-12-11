package p520io.reactivex.p531y.p547j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.p530x.C11998a;

/* renamed from: io.reactivex.y.j.h */
/* compiled from: ExceptionHelper */
public final class C12548h {

    /* renamed from: a */
    public static final Throwable f29081a = new C12549a();

    /* renamed from: io.reactivex.y.j.h$a */
    /* compiled from: ExceptionHelper */
    static final class C12549a extends Throwable {
        C12549a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m39352a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f29081a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C11998a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: b */
    public static RuntimeException m39353b(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> Throwable m39351a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f29081a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static <E extends Throwable> Exception m39349a(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static String m39350a(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }
}
