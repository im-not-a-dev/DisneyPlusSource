package p551j.p552a.p560j;

import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p520io.sentry.event.Event;
import p551j.p552a.p556h.C12601a;
import p551j.p552a.p563m.C12654a;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.j.c */
/* compiled from: BufferedConnection */
public class C12629c implements C12634d {
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final C13459b f29281a0 = C13460c.m41415a(C12629c.class);

    /* renamed from: U */
    private final ScheduledExecutorService f29282U = Executors.newSingleThreadScheduledExecutor(new C12630a(this));

    /* renamed from: V */
    private C12634d f29283V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C12601a f29284W;

    /* renamed from: X */
    private boolean f29285X;

    /* renamed from: Y */
    private long f29286Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public volatile boolean f29287Z = false;

    /* renamed from: c */
    private final C12633d f29288c = new C12633d(this, null);

    /* renamed from: j.a.j.c$a */
    /* compiled from: BufferedConnection */
    class C12630a implements ThreadFactory {
        C12630a(C12629c cVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: j.a.j.c$b */
    /* compiled from: BufferedConnection */
    class C12631b implements C12634d {

        /* renamed from: U */
        final /* synthetic */ C12634d f29289U;

        /* renamed from: c */
        final C12634d f29291c = this.f29289U;

        C12631b(C12634d dVar) {
            this.f29289U = dVar;
        }

        /* renamed from: a */
        public void mo30925a(Event event) throws C12635e {
            try {
                C12629c.this.f29284W.mo30913a(event);
            } catch (Exception e) {
                C12629c.f29281a0.mo34723a("Exception occurred while attempting to add Event to buffer: ", (Throwable) e);
            }
            this.f29291c.mo30925a(event);
        }

        public void close() throws IOException {
            this.f29291c.close();
        }
    }

    /* renamed from: j.a.j.c$c */
    /* compiled from: BufferedConnection */
    private class C12632c implements Runnable {

        /* renamed from: c */
        private long f29293c;

        C12632c(long j) {
            this.f29293c = j;
        }

        public void run() {
            C12629c.f29281a0.mo34728c("Running Flusher");
            C12654a.m39691c();
            try {
                Iterator b = C12629c.this.f29284W.mo30914b();
                while (b.hasNext() && !C12629c.this.f29287Z) {
                    Event event = (Event) b.next();
                    long currentTimeMillis = System.currentTimeMillis() - event.getTimestamp().getTime();
                    if (currentTimeMillis < this.f29293c) {
                        C13459b a = C12629c.f29281a0;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring buffered event because it only ");
                        sb.append(currentTimeMillis);
                        sb.append("ms old.");
                        a.mo34728c(sb.toString());
                        C12654a.m39692d();
                        return;
                    }
                    try {
                        C13459b a2 = C12629c.f29281a0;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Flusher attempting to send Event: ");
                        sb2.append(event.getId());
                        a2.mo34728c(sb2.toString());
                        C12629c.this.mo30925a(event);
                        C13459b a3 = C12629c.f29281a0;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Flusher successfully sent Event: ");
                        sb3.append(event.getId());
                        a3.mo34728c(sb3.toString());
                    } catch (Exception e) {
                        C13459b a4 = C12629c.f29281a0;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Flusher failed to send Event: ");
                        sb4.append(event.getId());
                        a4.mo34731c(sb4.toString(), (Throwable) e);
                        C12629c.f29281a0.mo34728c("Flusher run exiting early.");
                        C12654a.m39692d();
                        return;
                    }
                }
                C12629c.f29281a0.mo34728c("Flusher run exiting, no more events to send.");
            } catch (Exception e2) {
                C12629c.f29281a0.mo34723a("Error running Flusher: ", (Throwable) e2);
            } catch (Throwable th) {
                C12654a.m39692d();
                throw th;
            }
            C12654a.m39692d();
        }
    }

    /* renamed from: j.a.j.c$d */
    /* compiled from: BufferedConnection */
    private final class C12633d extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile boolean f29295c;

        private C12633d() {
            this.f29295c = true;
        }

        public void run() {
            if (this.f29295c) {
                C12654a.m39691c();
                try {
                    C12629c.this.close();
                } catch (Exception e) {
                    C12629c.f29281a0.mo34723a("An exception occurred while closing the connection.", (Throwable) e);
                } catch (Throwable th) {
                    C12654a.m39692d();
                    throw th;
                }
                C12654a.m39692d();
            }
        }

        /* synthetic */ C12633d(C12629c cVar, C12630a aVar) {
            this();
        }
    }

    public C12629c(C12634d dVar, C12601a aVar, long j, boolean z, long j2) {
        this.f29283V = dVar;
        this.f29284W = aVar;
        this.f29285X = z;
        this.f29286Y = j2;
        if (z) {
            Runtime.getRuntime().addShutdownHook(this.f29288c);
        }
        this.f29282U.scheduleWithFixedDelay(new C12632c(j), j, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        java.lang.Thread.currentThread().interrupt();
        f29281a0.mo34724b("Graceful shutdown interrupted, forcing the shutdown.");
        f29281a0.mo34721a(r0, (java.lang.Object) java.lang.Integer.valueOf(r6.f29282U.shutdownNow().size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        r6.f29283V.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "{} tasks failed to execute before the shutdown."
            boolean r1 = r6.f29285X
            if (r1 == 0) goto L_0x0011
            j.a.j.c$d r1 = r6.f29288c
            p551j.p552a.p569r.C12677b.m39772a(r1)
            j.a.j.c$d r1 = r6.f29288c
            r2 = 0
            r1.f29295c = r2
        L_0x0011:
            m.c.b r1 = f29281a0
            java.lang.String r2 = "Gracefully shutting down Sentry buffer threads."
            r1.mo34720a(r2)
            r1 = 1
            r6.f29287Z = r1
            java.util.concurrent.ScheduledExecutorService r1 = r6.f29282U
            r1.shutdown()
            long r1 = r6.f29286Y     // Catch:{ InterruptedException -> 0x0072 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r3 = r6.f29282U     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0072 }
            boolean r3 = r3.awaitTermination(r1, r4)     // Catch:{ InterruptedException -> 0x0072 }
            if (r3 == 0) goto L_0x0035
            goto L_0x0063
        L_0x0035:
            m.c.b r3 = f29281a0     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r4 = "Still waiting on buffer flusher executor to terminate."
            r3.mo34720a(r4)     // Catch:{ InterruptedException -> 0x0072 }
            goto L_0x002a
        L_0x003d:
            java.util.concurrent.ScheduledExecutorService r1 = r6.f29282U     // Catch:{ InterruptedException -> 0x0072 }
            long r2 = r6.f29286Y     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0072 }
            boolean r1 = r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x0072 }
            if (r1 != 0) goto L_0x0063
            m.c.b r1 = f29281a0     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r2 = "Graceful shutdown took too much time, forcing the shutdown."
            r1.mo34724b(r2)     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.ScheduledExecutorService r1 = r6.f29282U     // Catch:{ InterruptedException -> 0x0072 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ InterruptedException -> 0x0072 }
            m.c.b r2 = f29281a0     // Catch:{ InterruptedException -> 0x0072 }
            int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x0072 }
            r2.mo34721a(r0, r1)     // Catch:{ InterruptedException -> 0x0072 }
        L_0x0063:
            m.c.b r1 = f29281a0     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r2 = "Shutdown finished."
            r1.mo34720a(r2)     // Catch:{ InterruptedException -> 0x0072 }
        L_0x006a:
            j.a.j.d r0 = r6.f29283V
            r0.close()
            goto L_0x0094
        L_0x0070:
            r0 = move-exception
            goto L_0x0095
        L_0x0072:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0070 }
            r1.interrupt()     // Catch:{ all -> 0x0070 }
            m.c.b r1 = f29281a0     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "Graceful shutdown interrupted, forcing the shutdown."
            r1.mo34724b(r2)     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ScheduledExecutorService r1 = r6.f29282U     // Catch:{ all -> 0x0070 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ all -> 0x0070 }
            m.c.b r2 = f29281a0     // Catch:{ all -> 0x0070 }
            int r1 = r1.size()     // Catch:{ all -> 0x0070 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0070 }
            r2.mo34721a(r0, r1)     // Catch:{ all -> 0x0070 }
            goto L_0x006a
        L_0x0094:
            return
        L_0x0095:
            j.a.j.d r1 = r6.f29283V
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p560j.C12629c.close():void");
    }

    /* renamed from: a */
    public void mo30925a(Event event) {
        try {
            this.f29283V.mo30925a(event);
            this.f29284W.mo30915b(event);
        } catch (C12635e e) {
            boolean z = e.getCause() instanceof NotSerializableException;
            Integer b = e.mo30937b();
            if (z || b != null) {
                this.f29284W.mo30915b(event);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public C12634d mo30930a(C12634d dVar) {
        return new C12631b(dVar);
    }
}
