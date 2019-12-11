package p520io.reactivex.p531y.p547j;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12006e;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.j.f */
/* compiled from: EndConsumerHelper */
public final class C12546f {
    /* renamed from: a */
    public static boolean m39348a(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        C12036b.m38663a(disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() != C12010c.DISPOSED) {
            m39347a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static String m39346a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m39347a(Class<?> cls) {
        C11915a.m38466b((Throwable) new C12006e(m39346a(cls.getName())));
    }
}
