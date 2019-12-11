package p551j.p552a.p560j;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p520io.sentry.event.Event;
import p551j.p552a.C12590c;
import p551j.p552a.p563m.C12654a;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;
import p602m.p609c.C13461d;

/* renamed from: j.a.j.b */
/* compiled from: AsyncConnection */
public class C12625b implements C12634d {
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final C13459b f29269Z = C13460c.m41415a(C12625b.class);
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C12634d f29270U;

    /* renamed from: V */
    private final ExecutorService f29271V;

    /* renamed from: W */
    private final C12628c f29272W = new C12628c();

    /* renamed from: X */
    private boolean f29273X;

    /* renamed from: Y */
    private volatile boolean f29274Y;

    /* renamed from: c */
    private final long f29275c;

    /* renamed from: j.a.j.b$b */
    /* compiled from: AsyncConnection */
    private final class C12627b implements Runnable {

        /* renamed from: U */
        private Map<String, String> f29276U;

        /* renamed from: c */
        private final Event f29278c;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
            if (r0 != null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r0 == null) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                p551j.p552a.p563m.C12654a.m39691c()
                java.util.Map r0 = p602m.p609c.C13461d.m41438c()
                java.util.Map<java.lang.String, java.lang.String> r1 = r4.f29276U
                if (r1 != 0) goto L_0x000f
                p602m.p609c.C13461d.m41437b()
                goto L_0x0012
            L_0x000f:
                p602m.p609c.C13461d.m41436a(r1)
            L_0x0012:
                j.a.j.b r1 = p551j.p552a.p560j.C12625b.this     // Catch:{ j | o -> 0x0039, Exception -> 0x002c }
                j.a.j.d r1 = r1.f29270U     // Catch:{ j | o -> 0x0039, Exception -> 0x002c }
                io.sentry.event.Event r2 = r4.f29278c     // Catch:{ j | o -> 0x0039, Exception -> 0x002c }
                r1.mo30925a(r2)     // Catch:{ j | o -> 0x0039, Exception -> 0x002c }
                if (r0 != 0) goto L_0x0023
            L_0x001f:
                p602m.p609c.C13461d.m41437b()
                goto L_0x0026
            L_0x0023:
                p602m.p609c.C13461d.m41436a(r0)
            L_0x0026:
                p551j.p552a.p563m.C12654a.m39692d()
                goto L_0x0056
            L_0x002a:
                r1 = move-exception
                goto L_0x0057
            L_0x002c:
                r1 = move-exception
                m.c.b r2 = p551j.p552a.p560j.C12625b.f29269Z     // Catch:{ all -> 0x002a }
                java.lang.String r3 = "An exception occurred while sending the event to Sentry."
                r2.mo34723a(r3, r1)     // Catch:{ all -> 0x002a }
                if (r0 != 0) goto L_0x0023
                goto L_0x001f
            L_0x0039:
                m.c.b r1 = p551j.p552a.p560j.C12625b.f29269Z     // Catch:{ all -> 0x002a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
                r2.<init>()     // Catch:{ all -> 0x002a }
                java.lang.String r3 = "Dropping an Event due to lockdown: "
                r2.append(r3)     // Catch:{ all -> 0x002a }
                io.sentry.event.Event r3 = r4.f29278c     // Catch:{ all -> 0x002a }
                r2.append(r3)     // Catch:{ all -> 0x002a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002a }
                r1.mo34720a(r2)     // Catch:{ all -> 0x002a }
                if (r0 != 0) goto L_0x0023
                goto L_0x001f
            L_0x0056:
                return
            L_0x0057:
                if (r0 != 0) goto L_0x005d
                p602m.p609c.C13461d.m41437b()
                goto L_0x0060
            L_0x005d:
                p602m.p609c.C13461d.m41436a(r0)
            L_0x0060:
                p551j.p552a.p563m.C12654a.m39692d()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p560j.C12625b.C12627b.run():void");
        }

        private C12627b(Event event, Map<String, String> map) {
            this.f29278c = event;
            this.f29276U = map;
        }
    }

    /* renamed from: j.a.j.b$c */
    /* compiled from: AsyncConnection */
    private final class C12628c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile boolean f29280c;

        private C12628c() {
            this.f29280c = true;
        }

        public void run() {
            if (this.f29280c) {
                C12654a.m39691c();
                try {
                    C12625b.this.m39634c();
                } catch (Exception e) {
                    C12625b.f29269Z.mo34723a("An exception occurred while closing the connection.", (Throwable) e);
                } catch (Throwable th) {
                    C12654a.m39692d();
                    throw th;
                }
                C12654a.m39692d();
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C12590c.class.getName());
        sb.append(".lockdown");
        C13460c.m41416a(sb.toString());
    }

    public C12625b(C12634d dVar, ExecutorService executorService, boolean z, long j) {
        this.f29270U = dVar;
        if (executorService == null) {
            this.f29271V = Executors.newSingleThreadExecutor();
        } else {
            this.f29271V = executorService;
        }
        if (z) {
            this.f29273X = z;
            m39632b();
        }
        this.f29275c = j;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        java.lang.Thread.currentThread().interrupt();
        f29269Z.mo34724b("Graceful shutdown interrupted, forcing the shutdown.");
        f29269Z.mo34721a(r0, (java.lang.Object) java.lang.Integer.valueOf(r6.f29271V.shutdownNow().size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        r6.f29270U.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0063 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m39634c() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "{} tasks failed to execute before shutdown."
            m.c.b r1 = f29269Z
            java.lang.String r2 = "Gracefully shutting down Sentry async threads."
            r1.mo34720a(r2)
            r1 = 1
            r6.f29274Y = r1
            java.util.concurrent.ExecutorService r1 = r6.f29271V
            r1.shutdown()
            long r1 = r6.f29275c     // Catch:{ InterruptedException -> 0x0063 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x002e
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x001b:
            java.util.concurrent.ExecutorService r3 = r6.f29271V     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0063 }
            boolean r3 = r3.awaitTermination(r1, r4)     // Catch:{ InterruptedException -> 0x0063 }
            if (r3 == 0) goto L_0x0026
            goto L_0x0054
        L_0x0026:
            m.c.b r3 = f29269Z     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r4 = "Still waiting on async executor to terminate."
            r3.mo34720a(r4)     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x001b
        L_0x002e:
            java.util.concurrent.ExecutorService r1 = r6.f29271V     // Catch:{ InterruptedException -> 0x0063 }
            long r2 = r6.f29275c     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0063 }
            boolean r1 = r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x0063 }
            if (r1 != 0) goto L_0x0054
            m.c.b r1 = f29269Z     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r2 = "Graceful shutdown took too much time, forcing the shutdown."
            r1.mo34724b(r2)     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.ExecutorService r1 = r6.f29271V     // Catch:{ InterruptedException -> 0x0063 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ InterruptedException -> 0x0063 }
            m.c.b r2 = f29269Z     // Catch:{ InterruptedException -> 0x0063 }
            int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x0063 }
            r2.mo34721a(r0, r1)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x0054:
            m.c.b r1 = f29269Z     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r2 = "Shutdown finished."
            r1.mo34720a(r2)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x005b:
            j.a.j.d r0 = r6.f29270U
            r0.close()
            goto L_0x0085
        L_0x0061:
            r0 = move-exception
            goto L_0x0086
        L_0x0063:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0061 }
            r1.interrupt()     // Catch:{ all -> 0x0061 }
            m.c.b r1 = f29269Z     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "Graceful shutdown interrupted, forcing the shutdown."
            r1.mo34724b(r2)     // Catch:{ all -> 0x0061 }
            java.util.concurrent.ExecutorService r1 = r6.f29271V     // Catch:{ all -> 0x0061 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ all -> 0x0061 }
            m.c.b r2 = f29269Z     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0061 }
            r2.mo34721a(r0, r1)     // Catch:{ all -> 0x0061 }
            goto L_0x005b
        L_0x0085:
            return
        L_0x0086:
            j.a.j.d r1 = r6.f29270U
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p560j.C12625b.m39634c():void");
    }

    public void close() throws IOException {
        if (this.f29273X) {
            C12677b.m39772a((Thread) this.f29272W);
            this.f29272W.f29280c = false;
        }
        m39634c();
    }

    /* renamed from: b */
    private void m39632b() {
        Runtime.getRuntime().addShutdownHook(this.f29272W);
    }

    /* renamed from: a */
    public void mo30925a(Event event) {
        if (!this.f29274Y) {
            this.f29271V.execute(new C12627b(event, C13461d.m41438c()));
        }
    }
}
