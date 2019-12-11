package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.C9547i0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.exoplayer2.upstream.a0 */
/* compiled from: Loader */
public final class C9442a0 implements C9452b0 {

    /* renamed from: d */
    public static final C9445c f21954d = new C9445c(2, -9223372036854775807L);

    /* renamed from: e */
    public static final C9445c f21955e = new C9445c(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f21956a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9446d<? extends C9447e> f21957b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f21958c;

    /* renamed from: com.google.android.exoplayer2.upstream.a0$b */
    /* compiled from: Loader */
    public interface C9444b<T extends C9447e> {
        /* renamed from: a */
        C9445c mo23555a(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo23559a(T t, long j, long j2);

        /* renamed from: a */
        void mo23560a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.a0$c */
    /* compiled from: Loader */
    public static final class C9445c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f21959a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f21960b;

        private C9445c(int i, long j) {
            this.f21959a = i;
            this.f21960b = j;
        }

        /* renamed from: a */
        public boolean mo24463a() {
            int i = this.f21959a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.a0$d */
    /* compiled from: Loader */
    private final class C9446d<T extends C9447e> extends Handler implements Runnable {

        /* renamed from: U */
        private final T f21961U;

        /* renamed from: V */
        private final long f21962V;

        /* renamed from: W */
        private C9444b<T> f21963W;

        /* renamed from: X */
        private IOException f21964X;

        /* renamed from: Y */
        private int f21965Y;

        /* renamed from: Z */
        private volatile Thread f21966Z;

        /* renamed from: a0 */
        private volatile boolean f21967a0;

        /* renamed from: b0 */
        private volatile boolean f21968b0;

        /* renamed from: c */
        public final int f21969c;

        public C9446d(Looper looper, T t, C9444b<T> bVar, int i, long j) {
            super(looper);
            this.f21961U = t;
            this.f21963W = bVar;
            this.f21969c = i;
            this.f21962V = j;
        }

        /* renamed from: b */
        private void m28976b() {
            C9442a0.this.f21957b = null;
        }

        /* renamed from: c */
        private long m28977c() {
            return (long) Math.min((this.f21965Y - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void mo24464a(int i) throws IOException {
            IOException iOException = this.f21964X;
            if (iOException != null && this.f21965Y > i) {
                throw iOException;
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f21968b0) {
                int i = message.what;
                if (i == 0) {
                    m28975a();
                } else if (i != 4) {
                    m28976b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f21962V;
                    if (this.f21967a0) {
                        this.f21963W.mo23560a(this.f21961U, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        this.f21963W.mo23560a(this.f21961U, elapsedRealtime, j2, false);
                    } else if (i2 == 2) {
                        try {
                            this.f21963W.mo23559a(this.f21961U, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            Log.m29496a("LoadTask", "Unexpected exception handling load completed", e);
                            C9442a0.this.f21958c = new C9450h(e);
                        }
                    } else if (i2 == 3) {
                        this.f21964X = (IOException) message.obj;
                        this.f21965Y++;
                        C9445c a = this.f21963W.mo23555a(this.f21961U, elapsedRealtime, j2, this.f21964X, this.f21965Y);
                        if (a.f21959a == 3) {
                            C9442a0.this.f21958c = this.f21964X;
                        } else if (a.f21959a != 2) {
                            if (a.f21959a == 1) {
                                this.f21965Y = 1;
                            }
                            if (a.f21960b != -9223372036854775807L) {
                                j = a.f21960b;
                            } else {
                                j = m28977c();
                            }
                            mo24465a(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            String str = "LoadTask";
            try {
                this.f21966Z = Thread.currentThread();
                if (!this.f21967a0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("load:");
                    sb.append(this.f21961U.getClass().getSimpleName());
                    C9547i0.m29359a(sb.toString());
                    this.f21961U.load();
                    C9547i0.m29358a();
                }
                if (!this.f21968b0) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f21968b0) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                Assertions.checkState(this.f21967a0);
                if (!this.f21968b0) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.m29496a(str, "Unexpected exception loading stream", e2);
                if (!this.f21968b0) {
                    obtainMessage(3, new C9450h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.m29496a(str, "OutOfMemory error loading stream", e3);
                if (!this.f21968b0) {
                    obtainMessage(3, new C9450h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.m29496a(str, "Unexpected error loading stream", e4);
                if (!this.f21968b0) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C9547i0.m29358a();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo24465a(long j) {
            Assertions.checkState(C9442a0.this.f21957b == null);
            C9442a0.this.f21957b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m28975a();
            }
        }

        /* renamed from: a */
        public void mo24466a(boolean z) {
            this.f21968b0 = z;
            this.f21964X = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f21967a0 = true;
                this.f21961U.mo23567a();
                if (this.f21966Z != null) {
                    this.f21966Z.interrupt();
                }
            }
            if (z) {
                m28976b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f21963W.mo23560a(this.f21961U, elapsedRealtime, elapsedRealtime - this.f21962V, true);
                this.f21963W = null;
            }
        }

        /* renamed from: a */
        private void m28975a() {
            this.f21964X = null;
            C9442a0.this.f21956a.execute(C9442a0.this.f21957b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.a0$e */
    /* compiled from: Loader */
    public interface C9447e {
        /* renamed from: a */
        void mo23567a();

        void load() throws IOException, InterruptedException;
    }

    /* renamed from: com.google.android.exoplayer2.upstream.a0$f */
    /* compiled from: Loader */
    public interface C9448f {
        /* renamed from: h */
        void mo23563h();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.a0$g */
    /* compiled from: Loader */
    private static final class C9449g implements Runnable {

        /* renamed from: c */
        private final C9448f f21971c;

        public C9449g(C9448f fVar) {
            this.f21971c = fVar;
        }

        public void run() {
            this.f21971c.mo23563h();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.a0$h */
    /* compiled from: Loader */
    public static final class C9450h extends IOException {
        public C9450h(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    static {
        m28955a(false, -9223372036854775807L);
        m28955a(true, -9223372036854775807L);
    }

    public C9442a0(String str) {
        this.f21956a = Util.m29449e(str);
    }

    /* renamed from: c */
    public void mo24459c() {
        this.f21958c = null;
    }

    /* renamed from: d */
    public boolean mo24460d() {
        return this.f21958c != null;
    }

    /* renamed from: e */
    public boolean mo24461e() {
        return this.f21957b != null;
    }

    /* renamed from: f */
    public void mo24462f() {
        mo24457a((C9448f) null);
    }

    /* renamed from: b */
    public void mo24458b() {
        this.f21957b.mo24466a(false);
    }

    /* renamed from: a */
    public static C9445c m28955a(boolean z, long j) {
        return new C9445c(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public <T extends C9447e> long mo24455a(T t, C9444b<T> bVar, int i) {
        Looper myLooper = Looper.myLooper();
        Assertions.checkState(myLooper != null);
        this.f21958c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9446d dVar = new C9446d(myLooper, t, bVar, i, elapsedRealtime);
        dVar.mo24465a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public void mo24457a(C9448f fVar) {
        C9446d<? extends C9447e> dVar = this.f21957b;
        if (dVar != null) {
            dVar.mo24466a(true);
        }
        if (fVar != null) {
            this.f21956a.execute(new C9449g(fVar));
        }
        this.f21956a.shutdown();
    }

    /* renamed from: a */
    public void mo23621a() throws IOException {
        mo24456a(Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo24456a(int i) throws IOException {
        IOException iOException = this.f21958c;
        if (iOException == null) {
            C9446d<? extends C9447e> dVar = this.f21957b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f21969c;
                }
                dVar.mo24464a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
