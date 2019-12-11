package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.coroutines.l0 */
/* compiled from: DefaultExecutor.kt */
public final class C13330l0 extends C13405v0 implements Runnable {

    /* renamed from: Y */
    private static final long f29764Y;

    /* renamed from: Z */
    public static final C13330l0 f29765Z;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        C13330l0 l0Var = new C13330l0();
        f29765Z = l0Var;
        C13402u0.m41227a(l0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f29764Y = timeUnit.toNanos(l.longValue());
    }

    private C13330l0() {
    }

    /* renamed from: o */
    private final synchronized void m40956o() {
        if (m40958q()) {
            debugStatus = 3;
            mo34621n();
            notifyAll();
        }
    }

    /* renamed from: p */
    private final synchronized Thread m40957p() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: q */
    private final boolean m40958q() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: r */
    private final synchronized boolean m40959r() {
        if (m40958q()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Thread mo34355j() {
        Thread thread = _thread;
        return thread != null ? thread : m40957p();
    }

    public void run() {
        C13231d2.f29660b.mo34368a(this);
        C13235e2 a = C13239f2.m40692a();
        if (a != null) {
            a.mo34374a();
        }
        try {
            if (m40959r()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long m = mo34620m();
                    if (m == Long.MAX_VALUE) {
                        int i = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
                        if (i == 0) {
                            C13235e2 a2 = C13239f2.m40692a();
                            long b = a2 != null ? a2.mo34377b() : System.nanoTime();
                            if (i == 0) {
                                j = f29764Y + b;
                            }
                            long j2 = j - b;
                            if (j2 <= 0) {
                                _thread = null;
                                m40956o();
                                C13235e2 a3 = C13239f2.m40692a();
                                if (a3 != null) {
                                    a3.mo34379d();
                                }
                                if (!mo34619l()) {
                                    mo34355j();
                                }
                                return;
                            }
                            m = C12762h.m39918b(m, j2);
                        } else {
                            m = C12762h.m39918b(m, f29764Y);
                        }
                    }
                    if (m > 0) {
                        if (m40958q()) {
                            _thread = null;
                            m40956o();
                            C13235e2 a4 = C13239f2.m40692a();
                            if (a4 != null) {
                                a4.mo34379d();
                            }
                            if (!mo34619l()) {
                                mo34355j();
                            }
                            return;
                        }
                        C13235e2 a5 = C13239f2.m40692a();
                        if (a5 != null) {
                            a5.mo34375a(this, m);
                        } else {
                            LockSupport.parkNanos(this, m);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m40956o();
            C13235e2 a6 = C13239f2.m40692a();
            if (a6 != null) {
                a6.mo34379d();
            }
            if (!mo34619l()) {
                mo34355j();
            }
        }
    }
}
