package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "enter", "", "exit", "Ljava/io/IOException;", "cause", "exit$jvm", "throwOnTimeout", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "Companion", "Watchdog", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.d */
/* compiled from: AsyncTimeout.kt */
public class C14274d extends C14303y {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final long f31857h = TimeUnit.SECONDS.toMillis(60);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f31858i = TimeUnit.MILLISECONDS.toNanos(f31857h);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C14274d f31859j;

    /* renamed from: k */
    public static final C14275a f31860k = new C14275a(null);

    /* renamed from: e */
    private boolean f31861e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C14274d f31862f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f31863g;

    /* renamed from: okio.d$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C14275a {
        private C14275a() {
        }

        public /* synthetic */ C14275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m45671a(C14274d dVar, long j, boolean z) {
            Class<C14274d> cls = C14274d.class;
            synchronized (cls) {
                if (C14274d.f31859j == null) {
                    C14274d.f31859j = new C14274d();
                    new C14276b().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 && z) {
                    dVar.f31863g = Math.min(j, dVar.mo36419c() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    dVar.f31863g = j + nanoTime;
                } else if (z) {
                    dVar.f31863g = dVar.mo36419c();
                } else {
                    throw new AssertionError();
                }
                long a = dVar.m45656b(nanoTime);
                C14274d j2 = C14274d.f31859j;
                if (j2 != null) {
                    while (true) {
                        if (j2.f31862f != null) {
                            C14274d a2 = j2.f31862f;
                            if (a2 == null) {
                                Intrinsics.throwNpe();
                                throw null;
                            } else if (a < a2.m45656b(nanoTime)) {
                                break;
                            } else {
                                j2 = j2.f31862f;
                                if (j2 == null) {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            }
                        }
                    }
                    dVar.f31862f = j2.f31862f;
                    j2.f31862f = dVar;
                    if (j2 == C14274d.f31859j) {
                        cls.notify();
                    }
                    C13145v vVar = C13145v.f29587a;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m45673a(C14274d dVar) {
            synchronized (C14274d.class) {
                for (C14274d j = C14274d.f31859j; j != null; j = j.f31862f) {
                    if (j.f31862f == dVar) {
                        j.f31862f = dVar.f31862f;
                        dVar.f31862f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: a */
        public final C14274d mo36407a() throws InterruptedException {
            Class<C14274d> cls = C14274d.class;
            C14274d j = C14274d.f31859j;
            C14274d dVar = null;
            if (j != null) {
                C14274d a = j.f31862f;
                if (a == null) {
                    long nanoTime = System.nanoTime();
                    cls.wait(C14274d.f31857h);
                    C14274d j2 = C14274d.f31859j;
                    if (j2 != null) {
                        if (j2.f31862f == null && System.nanoTime() - nanoTime >= C14274d.f31858i) {
                            dVar = C14274d.f31859j;
                        }
                        return dVar;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                }
                long a2 = a.m45656b(System.nanoTime());
                if (a2 > 0) {
                    long j3 = a2 / 1000000;
                    cls.wait(j3, (int) (a2 - (1000000 * j3)));
                    return null;
                }
                C14274d j4 = C14274d.f31859j;
                if (j4 != null) {
                    j4.f31862f = a.f31862f;
                    a.f31862f = null;
                    return a;
                }
                Intrinsics.throwNpe();
                throw null;
            }
            Intrinsics.throwNpe();
            throw null;
        }
    }

    /* renamed from: okio.d$b */
    /* compiled from: AsyncTimeout.kt */
    private static final class C14276b extends Thread {
        public C14276b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.mo36001i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.d> r0 = okio.C14274d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.d$a r1 = okio.C14274d.f31860k     // Catch:{ all -> 0x001e }
                okio.d r1 = r1.mo36407a()     // Catch:{ all -> 0x001e }
                okio.d r2 = okio.C14274d.f31859j     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                okio.C14274d.f31859j = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                kotlin.v r2 = kotlin.C13145v.f29587a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo36001i()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C14274d.C14276b.run():void");
        }
    }

    /* renamed from: okio.d$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C14277c implements C14300v {

        /* renamed from: U */
        final /* synthetic */ C14300v f31864U;

        /* renamed from: c */
        final /* synthetic */ C14274d f31865c;

        C14277c(C14274d dVar, C14300v vVar) {
            this.f31865c = dVar;
            this.f31864U = vVar;
        }

        /* renamed from: b */
        public void mo35927b(Buffer buffer, long j) {
            C14273c.m45651a(buffer.mo36335h(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C14295s sVar = buffer.f31848c;
                    if (sVar != null) {
                        while (true) {
                            if (j2 >= ((long) DateUtils.FORMAT_ABBREV_MONTH)) {
                                break;
                            }
                            j2 += (long) (sVar.f31902c - sVar.f31901b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            sVar = sVar.f31905f;
                            if (sVar == null) {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        this.f31865c.mo36405g();
                        try {
                            this.f31864U.mo35927b(buffer, j2);
                            j -= j2;
                            this.f31865c.mo36404a(true);
                        } catch (IOException e) {
                            throw this.f31865c.mo36401a(e);
                        } catch (Throwable th) {
                            this.f31865c.mo36404a(false);
                            throw th;
                        }
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }

        public void close() {
            this.f31865c.mo36405g();
            try {
                this.f31864U.close();
                this.f31865c.mo36404a(true);
            } catch (IOException e) {
                throw this.f31865c.mo36401a(e);
            } catch (Throwable th) {
                this.f31865c.mo36404a(false);
                throw th;
            }
        }

        public void flush() {
            this.f31865c.mo36405g();
            try {
                this.f31864U.flush();
                this.f31865c.mo36404a(true);
            } catch (IOException e) {
                throw this.f31865c.mo36401a(e);
            } catch (Throwable th) {
                this.f31865c.mo36404a(false);
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.f31864U);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: X */
        public C14274d m45676X() {
            return this.f31865c;
        }
    }

    /* renamed from: okio.d$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C14278d implements C14302x {

        /* renamed from: U */
        final /* synthetic */ C14302x f31866U;

        /* renamed from: c */
        final /* synthetic */ C14274d f31867c;

        C14278d(C14274d dVar, C14302x xVar) {
            this.f31867c = dVar;
            this.f31866U = xVar;
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) {
            this.f31867c.mo36405g();
            try {
                long a = this.f31866U.mo35899a(buffer, j);
                this.f31867c.mo36404a(true);
                return a;
            } catch (IOException e) {
                throw this.f31867c.mo36401a(e);
            } catch (Throwable th) {
                this.f31867c.mo36404a(false);
                throw th;
            }
        }

        public void close() {
            this.f31867c.mo36405g();
            try {
                this.f31866U.close();
                this.f31867c.mo36404a(true);
            } catch (IOException e) {
                throw this.f31867c.mo36401a(e);
            } catch (Throwable th) {
                this.f31867c.mo36404a(false);
                throw th;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.source(");
            sb.append(this.f31866U);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: X */
        public C14274d m45679X() {
            return this.f31867c;
        }
    }

    /* renamed from: g */
    public final void mo36405g() {
        if (!this.f31861e) {
            long f = mo36467f();
            boolean d = mo36420d();
            if (f != 0 || d) {
                this.f31861e = true;
                f31860k.m45671a(this, f, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: h */
    public final boolean mo36406h() {
        if (!this.f31861e) {
            return false;
        }
        this.f31861e = false;
        return f31860k.m45673a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo36001i() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final long m45656b(long j) {
        return this.f31863g - j;
    }

    /* renamed from: a */
    public final C14300v mo36402a(C14300v vVar) {
        return new C14277c(this, vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo36089b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public final C14302x mo36403a(C14302x xVar) {
        return new C14278d(this, xVar);
    }

    /* renamed from: a */
    public final void mo36404a(boolean z) {
        if (mo36406h() && z) {
            throw mo36089b((IOException) null);
        }
    }

    /* renamed from: a */
    public final IOException mo36401a(IOException iOException) {
        return !mo36406h() ? iOException : mo36089b(iOException);
    }
}
