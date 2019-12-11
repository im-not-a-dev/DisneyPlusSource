package p551j.p552a;

import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.sentry.event.p550f.C12574a;
import p520io.sentry.event.p550f.C12576b;
import p520io.sentry.event.p550f.C12579e;
import p520io.sentry.event.p550f.C12580f;
import p520io.sentry.event.p550f.C12584j;
import p520io.sentry.event.p550f.C12585k;
import p551j.p552a.p556h.C12601a;
import p551j.p552a.p556h.C12602b;
import p551j.p552a.p557i.C12607d;
import p551j.p552a.p560j.C12625b;
import p551j.p552a.p560j.C12634d;
import p551j.p552a.p560j.C12638h;
import p551j.p552a.p560j.C12643l;
import p551j.p552a.p560j.C12644m;
import p551j.p552a.p560j.C12645n;
import p551j.p552a.p561k.C12648b;
import p551j.p552a.p561k.C12650d;
import p551j.p552a.p562l.C12652a;
import p551j.p552a.p564n.C12658b;
import p551j.p552a.p565o.C12660a;
import p551j.p552a.p565o.p566b.C12662a;
import p551j.p552a.p565o.p566b.C12663b;
import p551j.p552a.p565o.p566b.C12664c;
import p551j.p552a.p565o.p566b.C12665d;
import p551j.p552a.p565o.p566b.C12666e;
import p551j.p552a.p565o.p566b.C12669f;
import p551j.p552a.p565o.p566b.C12671h;
import p551j.p552a.p565o.p566b.C12672i;
import p551j.p552a.p569r.C12677b;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.a */
/* compiled from: DefaultSentryClientFactory */
public class C12586a extends C12591d {

    /* renamed from: b */
    public static final int f29184b = ((int) TimeUnit.SECONDS.toMillis(1));

    /* renamed from: c */
    public static final int f29185c = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: d */
    public static final long f29186d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: e */
    public static final long f29187e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f */
    private static final C13459b f29188f = C13460c.m41415a(C12586a.class);

    /* renamed from: g */
    private static final String f29189g = Boolean.FALSE.toString();

    /* renamed from: h */
    private static final Map<String, RejectedExecutionHandler> f29190h = new HashMap();

    /* renamed from: j.a.a$b */
    /* compiled from: DefaultSentryClientFactory */
    protected static final class C12588b implements ThreadFactory {

        /* renamed from: X */
        private static final AtomicInteger f29191X = new AtomicInteger(1);

        /* renamed from: U */
        private final AtomicInteger f29192U;

        /* renamed from: V */
        private final String f29193V;

        /* renamed from: W */
        private final int f29194W;

        /* renamed from: c */
        private final ThreadGroup f29195c;

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f29195c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29193V);
            sb.append(this.f29192U.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (!thread.isDaemon()) {
                thread.setDaemon(true);
            }
            int priority = thread.getPriority();
            int i = this.f29194W;
            if (priority != i) {
                thread.setPriority(i);
            }
            return thread;
        }

        private C12588b(int i) {
            this.f29192U = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            this.f29195c = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            StringBuilder sb = new StringBuilder();
            sb.append("sentry-pool-");
            sb.append(f29191X.getAndIncrement());
            sb.append("-thread-");
            this.f29193V = sb.toString();
            this.f29194W = i;
        }
    }

    static {
        f29190h.put("sync", new CallerRunsPolicy());
        f29190h.put("discardnew", new DiscardPolicy());
        f29190h.put("discardold", new DiscardOldestPolicy());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Set<String> mo30841A(C12652a aVar) {
        String b = C12607d.m39605b("mdctags", aVar);
        if (C12677b.m39771a(b)) {
            b = C12607d.m39605b("extratags", aVar);
            if (!C12677b.m39771a(b)) {
                f29188f.mo34724b("The 'extratags' option is deprecated, please use the 'mdctags' option instead.");
            }
        }
        return C12677b.m39774c(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo30842B(C12652a aVar) {
        return C12607d.m39605b("http.proxy.host", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo30843C(C12652a aVar) {
        return C12607d.m39605b("http.proxy.password", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo30844D(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("http.proxy.port", aVar), Integer.valueOf(80)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public String mo30845E(C12652a aVar) {
        return C12607d.m39605b("http.proxy.user", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo30846F(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("readtimeout", aVar), Integer.valueOf(f29185c)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public RejectedExecutionHandler mo30847G(C12652a aVar) {
        String b = C12607d.m39605b("async.queue.overflow", aVar);
        String lowerCase = !C12677b.m39771a(b) ? b.toLowerCase() : "discardold";
        RejectedExecutionHandler rejectedExecutionHandler = (RejectedExecutionHandler) f29190h.get(lowerCase);
        if (rejectedExecutionHandler != null) {
            return rejectedExecutionHandler;
        }
        String arrays = Arrays.toString(f29190h.keySet().toArray());
        StringBuilder sb = new StringBuilder();
        sb.append("RejectedExecutionHandler not found: '");
        sb.append(lowerCase);
        sb.append("', valid choices are: ");
        sb.append(arrays);
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public String mo30848H(C12652a aVar) {
        return C12607d.m39605b("release", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public Double mo30849I(C12652a aVar) {
        return C12677b.m39765a(C12607d.m39605b("sample.rate", aVar), (Double) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public String mo30850J(C12652a aVar) {
        return C12607d.m39605b("servername", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public Map<String, String> mo30851K(C12652a aVar) {
        return C12677b.m39775d(C12607d.m39605b("tags", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public int mo30852L(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("timeout", aVar), Integer.valueOf(f29184b)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo30853M(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("uncaught.handler.enabled", aVar));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p551j.p552a.C12590c mo30855a(p551j.p552a.p562l.C12652a r5) {
        /*
            r4 = this;
            j.a.c r0 = new j.a.c     // Catch:{ Exception -> 0x0037 }
            j.a.j.d r1 = r4.mo30858b(r5)     // Catch:{ Exception -> 0x0037 }
            j.a.k.b r2 = r4.mo30876t(r5)     // Catch:{ Exception -> 0x0037 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "javax.servlet.ServletRequestListener"
            r2 = 0
            java.lang.Class r3 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.Class.forName(r1, r2, r3)     // Catch:{ ClassNotFoundException -> 0x0024 }
            io.sentry.event.e.d r1 = new io.sentry.event.e.d     // Catch:{ ClassNotFoundException -> 0x0024 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x0024 }
            r0.mo30887a(r1)     // Catch:{ ClassNotFoundException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            m.c.b r1 = f29188f     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "The current environment doesn't provide access to servlets, or provides an unsupported version."
            r1.mo34720a(r2)     // Catch:{ Exception -> 0x0037 }
        L_0x002b:
            io.sentry.event.e.b r1 = new io.sentry.event.e.b     // Catch:{ Exception -> 0x0037 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0037 }
            r0.mo30887a(r1)     // Catch:{ Exception -> 0x0037 }
            r4.mo30854a(r0, r5)     // Catch:{ Exception -> 0x0037 }
            return r0
        L_0x0037:
            r5 = move-exception
            m.c.b r0 = f29188f
            java.lang.String r1 = "Failed to initialize sentry, falling back to no-op client"
            r0.mo34723a(r1, r5)
            j.a.c r5 = new j.a.c
            j.a.j.k r0 = new j.a.j.k
            r0.<init>()
            j.a.k.d r1 = new j.a.k.d
            r1.<init>()
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.C12586a.mo30855a(j.a.l.a):j.a.c");
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r2v1, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r2v2, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r2v4, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v8, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r0v12, types: [j.a.j.k] */
    /* JADX WARNING: type inference failed for: r0v14, types: [j.a.j.d] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p551j.p552a.p560j.C12634d mo30858b(p551j.p552a.p562l.C12652a r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.mo30965c()
            java.lang.String r1 = "http"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "https"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0015
            goto L_0x005a
        L_0x0015:
            java.lang.String r1 = "out"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0029
            m.c.b r0 = f29188f
            java.lang.String r1 = "Using StdOut to send events."
            r0.mo34720a(r1)
            j.a.j.d r0 = r10.mo30861e(r11)
            goto L_0x0069
        L_0x0029:
            java.lang.String r1 = "noop"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x003e
            m.c.b r0 = f29188f
            java.lang.String r1 = "Using noop to send events."
            r0.mo34720a(r1)
            j.a.j.k r0 = new j.a.j.k
            r0.<init>()
            goto L_0x0069
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Couldn't create a connection for the protocol '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x005a:
            m.c.b r1 = f29188f
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = "Using an {} connection to Sentry."
            r1.mo34729c(r2, r0)
            j.a.j.d r0 = r10.mo30859c(r11)
        L_0x0069:
            r2 = r0
            r0 = 0
            boolean r1 = r10.mo30869m(r11)
            if (r1 == 0) goto L_0x0093
            j.a.h.a r3 = r10.mo30868l(r11)
            if (r3 == 0) goto L_0x0093
            long r4 = r10.mo30870n(r11)
            boolean r6 = r10.mo30872p(r11)
            long r0 = r10.mo30873q(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            j.a.j.c r9 = new j.a.j.c
            long r7 = r0.longValue()
            r1 = r9
            r1.<init>(r2, r3, r4, r6, r7)
            r0 = r9
            r2 = r0
        L_0x0093:
            boolean r1 = r10.mo30862f(r11)
            if (r1 == 0) goto L_0x009d
            j.a.j.d r2 = r10.mo30856a(r11, r2)
        L_0x009d:
            if (r0 == 0) goto L_0x00a3
            j.a.j.d r2 = r0.mo30930a(r2)
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.C12586a.mo30858b(j.a.l.a):j.a.j.d");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12634d mo30859c(C12652a aVar) {
        Proxy proxy;
        URL a = C12638h.m39651a(aVar.mo30970g(), aVar.mo30964b());
        String B = mo30842B(aVar);
        String E = mo30845E(aVar);
        String C = mo30843C(aVar);
        int D = mo30844D(aVar);
        if (B != null) {
            Proxy proxy2 = new Proxy(Type.HTTP, new InetSocketAddress(B, D));
            if (!(E == null || C == null)) {
                Authenticator.setDefault(new C12644m(E, C));
            }
            proxy = proxy2;
        } else {
            proxy = null;
        }
        Double I = mo30849I(aVar);
        C12638h hVar = new C12638h(a, aVar.mo30967e(), aVar.mo30969f(), proxy, I != null ? new C12645n(I.doubleValue()) : null);
        hVar.mo30942a(mo30860d(aVar));
        hVar.mo30941a(mo30852L(aVar));
        hVar.mo30945b(mo30846F(aVar));
        hVar.mo30943a(mo30874r(aVar));
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C12660a mo30860d(C12652a aVar) {
        int z = mo30882z(aVar);
        C12666e a = mo30857a(z);
        C12671h hVar = new C12671h();
        hVar.mo30999a(mo30880x(aVar));
        hVar.mo30998a(mo30881y(aVar));
        a.mo30992a(C12584j.class, (C12665d<T>) hVar);
        a.mo30992a(C12576b.class, (C12665d<T>) new C12663b<T>(hVar));
        a.mo30992a(C12580f.class, (C12665d<T>) new C12669f<T>(z));
        a.mo30992a(C12585k.class, (C12665d<T>) new C12672i<T>());
        a.mo30992a(C12574a.class, (C12665d<T>) new C12662a<T>());
        a.mo30992a(C12579e.class, (C12665d<T>) new C12664c<T>());
        a.mo30993a(mo30875s(aVar));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12634d mo30861e(C12652a aVar) {
        C12643l lVar = new C12643l(System.out);
        lVar.mo30952a(mo30860d(aVar));
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo30862f(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("async", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo30863g(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("async.gracefulshutdown", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo30864h(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("async.priority", aVar), Integer.valueOf(1)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo30865i(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("async.queuesize", aVar), Integer.valueOf(50)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public long mo30866j(C12652a aVar) {
        return C12677b.m39767a(C12607d.m39605b("async.shutdowntimeout", aVar), Long.valueOf(f29187e)).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo30867k(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("async.threads", aVar), Integer.valueOf(Runtime.getRuntime().availableProcessors())).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C12601a mo30868l(C12652a aVar) {
        String b = C12607d.m39605b("buffer.dir", aVar);
        if (b != null) {
            return new C12602b(new File(b), mo30871o(aVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo30869m(C12652a aVar) {
        String b = C12607d.m39605b("buffer.enabled", aVar);
        if (b != null) {
            return Boolean.parseBoolean(b);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public long mo30870n(C12652a aVar) {
        return C12677b.m39767a(C12607d.m39605b("buffer.flushtime", aVar), Long.valueOf(60000)).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo30871o(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("buffer.size", aVar), Integer.valueOf(10)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo30872p(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("buffer.gracefulshutdown", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public long mo30873q(C12652a aVar) {
        return C12677b.m39767a(C12607d.m39605b("buffer.shutdowntimeout", aVar), Long.valueOf(f29186d)).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo30874r(C12652a aVar) {
        return aVar.mo30966d().contains("naive");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo30875s(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("compression", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C12648b mo30876t(C12652a aVar) {
        return new C12650d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo30877u(C12652a aVar) {
        return C12607d.m39605b("dist", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo30878v(C12652a aVar) {
        return C12607d.m39605b("environment", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Map<String, String> mo30879w(C12652a aVar) {
        return C12677b.m39773b(C12607d.m39605b("extra", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo30880x(C12652a aVar) {
        return !f29189g.equalsIgnoreCase(C12607d.m39605b("stacktrace.hidecommon", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Collection<String> mo30881y(C12652a aVar) {
        String[] split;
        String b = C12607d.m39605b("stacktrace.app.packages", aVar);
        if (C12677b.m39771a(b)) {
            if (b == null) {
                f29188f.mo34724b("No 'stacktrace.app.packages' was configured, this option is highly recommended as it affects stacktrace grouping and display on Sentry. See documentation: https://docs.sentry.io/clients/java/config/#in-application-stack-frames");
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : b.split(",")) {
            if (!str.trim().equals("")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo30882z(C12652a aVar) {
        return C12677b.m39766a(C12607d.m39605b("maxmessagelength", aVar), Integer.valueOf(1000)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12590c mo30854a(C12590c cVar, C12652a aVar) {
        String H = mo30848H(aVar);
        if (H != null) {
            cVar.mo30897d(H);
        }
        String u = mo30877u(aVar);
        if (u != null) {
            cVar.mo30894b(u);
        }
        String v = mo30878v(aVar);
        if (v != null) {
            cVar.mo30896c(v);
        }
        String J = mo30850J(aVar);
        if (J != null) {
            cVar.mo30898e(J);
        }
        Map K = mo30851K(aVar);
        if (!K.isEmpty()) {
            for (Entry entry : K.entrySet()) {
                cVar.mo30890a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Set<String> A = mo30841A(aVar);
        if (!A.isEmpty()) {
            for (String a : A) {
                cVar.mo30888a(a);
            }
        }
        Map w = mo30879w(aVar);
        if (!w.isEmpty()) {
            for (Entry entry2 : w.entrySet()) {
                cVar.mo30889a((String) entry2.getKey(), entry2.getValue());
            }
        }
        if (mo30853M(aVar)) {
            cVar.mo30892b();
        }
        for (String a2 : mo30881y(aVar)) {
            C12658b.m39696a(a2);
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12634d mo30856a(C12652a aVar, C12634d dVar) {
        BlockingQueue blockingQueue;
        int k = mo30867k(aVar);
        int h = mo30864h(aVar);
        int i = mo30865i(aVar);
        if (i == -1) {
            blockingQueue = new LinkedBlockingDeque();
        } else {
            blockingQueue = new LinkedBlockingDeque(i);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(k, k, 0, TimeUnit.MILLISECONDS, blockingQueue, new C12588b(h), mo30847G(aVar));
        C12625b bVar = new C12625b(dVar, threadPoolExecutor, mo30863g(aVar), mo30866j(aVar));
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12666e mo30857a(int i) {
        return new C12666e(i);
    }
}
