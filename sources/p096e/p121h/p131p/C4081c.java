package p096e.p121h.p131p;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: e.h.p.c */
/* compiled from: SelfDestructiveThread */
public class C4081c {

    /* renamed from: a */
    private final Object f10301a = new Object();

    /* renamed from: b */
    private HandlerThread f10302b;

    /* renamed from: c */
    private Handler f10303c;

    /* renamed from: d */
    private int f10304d;

    /* renamed from: e */
    private Callback f10305e = new C4082a();

    /* renamed from: f */
    private final int f10306f;

    /* renamed from: g */
    private final int f10307g;

    /* renamed from: h */
    private final String f10308h;

    /* renamed from: e.h.p.c$a */
    /* compiled from: SelfDestructiveThread */
    class C4082a implements Callback {
        C4082a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C4081c.this.mo14615a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C4081c.this.mo14616a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: e.h.p.c$b */
    /* compiled from: SelfDestructiveThread */
    class C4083b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Handler f10310U;

        /* renamed from: V */
        final /* synthetic */ C4086d f10311V;

        /* renamed from: c */
        final /* synthetic */ Callable f10312c;

        /* renamed from: e.h.p.c$b$a */
        /* compiled from: SelfDestructiveThread */
        class C4084a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Object f10314c;

            C4084a(Object obj) {
                this.f10314c = obj;
            }

            public void run() {
                C4083b.this.f10311V.mo14603a(this.f10314c);
            }
        }

        C4083b(C4081c cVar, Callable callable, Handler handler, C4086d dVar) {
            this.f10312c = callable;
            this.f10310U = handler;
            this.f10311V = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f10312c.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f10310U.post(new C4084a(obj));
        }
    }

    /* renamed from: e.h.p.c$c */
    /* compiled from: SelfDestructiveThread */
    class C4085c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Callable f10315U;

        /* renamed from: V */
        final /* synthetic */ ReentrantLock f10316V;

        /* renamed from: W */
        final /* synthetic */ AtomicBoolean f10317W;

        /* renamed from: X */
        final /* synthetic */ Condition f10318X;

        /* renamed from: c */
        final /* synthetic */ AtomicReference f10319c;

        C4085c(C4081c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f10319c = atomicReference;
            this.f10315U = callable;
            this.f10316V = reentrantLock;
            this.f10317W = atomicBoolean;
            this.f10318X = condition;
        }

        public void run() {
            try {
                this.f10319c.set(this.f10315U.call());
            } catch (Exception unused) {
            }
            this.f10316V.lock();
            try {
                this.f10317W.set(false);
                this.f10318X.signal();
            } finally {
                this.f10316V.unlock();
            }
        }
    }

    /* renamed from: e.h.p.c$d */
    /* compiled from: SelfDestructiveThread */
    public interface C4086d<T> {
        /* renamed from: a */
        void mo14603a(T t);
    }

    public C4081c(String str, int i, int i2) {
        this.f10308h = str;
        this.f10307g = i;
        this.f10306f = i2;
        this.f10304d = 0;
    }

    /* renamed from: b */
    private void m14012b(Runnable runnable) {
        synchronized (this.f10301a) {
            if (this.f10302b == null) {
                this.f10302b = new HandlerThread(this.f10308h, this.f10307g);
                this.f10302b.start();
                this.f10303c = new Handler(this.f10302b.getLooper(), this.f10305e);
                this.f10304d++;
            }
            this.f10303c.removeMessages(0);
            this.f10303c.sendMessage(this.f10303c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo14617a(Callable<T> callable, C4086d<T> dVar) {
        m14012b(new C4083b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo14614a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            e.h.p.c$c r11 = new e.h.p.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m14012b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p131p.C4081c.mo14614a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14616a(Runnable runnable) {
        runnable.run();
        synchronized (this.f10301a) {
            this.f10303c.removeMessages(0);
            this.f10303c.sendMessageDelayed(this.f10303c.obtainMessage(0), (long) this.f10306f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14615a() {
        synchronized (this.f10301a) {
            if (!this.f10303c.hasMessages(1)) {
                this.f10302b.quit();
                this.f10302b = null;
                this.f10303c = null;
            }
        }
    }
}
