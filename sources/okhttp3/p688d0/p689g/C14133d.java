package okhttp3.p688d0.p689g;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p694l.C14215a;
import okhttp3.p688d0.p695m.C14225e;
import okio.C14280f;
import okio.C14287m;
import okio.C14300v;
import okio.C14302x;

/* renamed from: okhttp3.d0.g.d */
/* compiled from: DiskLruCache */
public final class C14133d implements Closeable, Flushable {

    /* renamed from: n0 */
    static final Pattern f31360n0 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: U */
    final File f31361U;

    /* renamed from: V */
    private final File f31362V;

    /* renamed from: W */
    private final File f31363W;

    /* renamed from: X */
    private final File f31364X;

    /* renamed from: Y */
    private final int f31365Y;

    /* renamed from: Z */
    private long f31366Z;

    /* renamed from: a0 */
    final int f31367a0;

    /* renamed from: b0 */
    private long f31368b0 = 0;

    /* renamed from: c */
    final C14215a f31369c;

    /* renamed from: c0 */
    C14280f f31370c0;

    /* renamed from: d0 */
    final LinkedHashMap<String, C14138d> f31371d0 = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: e0 */
    int f31372e0;

    /* renamed from: f0 */
    boolean f31373f0;

    /* renamed from: g0 */
    boolean f31374g0;

    /* renamed from: h0 */
    boolean f31375h0;

    /* renamed from: i0 */
    boolean f31376i0;

    /* renamed from: j0 */
    boolean f31377j0;

    /* renamed from: k0 */
    private long f31378k0 = 0;

    /* renamed from: l0 */
    private final Executor f31379l0;

    /* renamed from: m0 */
    private final Runnable f31380m0 = new C14134a();

    /* renamed from: okhttp3.d0.g.d$a */
    /* compiled from: DiskLruCache */
    class C14134a implements Runnable {
        C14134a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f31381c.f31377j0 = true;
            r5.f31381c.f31370c0 = okio.C14287m.m45717a(okio.C14287m.m45718a());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                okhttp3.d0.g.d r0 = okhttp3.p688d0.p689g.C14133d.this
                monitor-enter(r0)
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f31374g0     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                okhttp3.d0.g.d r4 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.f31375h0     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ IOException -> 0x001d }
                r1.mo35912f()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ all -> 0x0045 }
                r1.f31376i0 = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.mo35908d()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ IOException -> 0x0033 }
                r1.mo35910e()     // Catch:{ IOException -> 0x0033 }
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ IOException -> 0x0033 }
                r1.f31372e0 = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ all -> 0x0045 }
                r1.f31377j0 = r3     // Catch:{ all -> 0x0045 }
                okhttp3.d0.g.d r1 = okhttp3.p688d0.p689g.C14133d.this     // Catch:{ all -> 0x0045 }
                okio.v r2 = okio.C14287m.m45718a()     // Catch:{ all -> 0x0045 }
                okio.f r2 = okio.C14287m.m45717a(r2)     // Catch:{ all -> 0x0045 }
                r1.f31370c0 = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.C14134a.run():void");
        }
    }

    /* renamed from: okhttp3.d0.g.d$b */
    /* compiled from: DiskLruCache */
    class C14135b extends C14140e {
        static {
            Class<C14133d> cls = C14133d.class;
        }

        C14135b(C14300v vVar) {
            super(vVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35916a(IOException iOException) {
            C14133d.this.f31373f0 = true;
        }
    }

    /* renamed from: okhttp3.d0.g.d$c */
    /* compiled from: DiskLruCache */
    public final class C14136c {

        /* renamed from: a */
        final C14138d f31383a;

        /* renamed from: b */
        final boolean[] f31384b;

        /* renamed from: c */
        private boolean f31385c;

        /* renamed from: okhttp3.d0.g.d$c$a */
        /* compiled from: DiskLruCache */
        class C14137a extends C14140e {
            C14137a(C14300v vVar) {
                super(vVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo35916a(IOException iOException) {
                synchronized (C14133d.this) {
                    C14136c.this.mo35920c();
                }
            }
        }

        C14136c(C14138d dVar) {
            this.f31383a = dVar;
            this.f31384b = dVar.f31392e ? null : new boolean[C14133d.this.f31367a0];
        }

        /* renamed from: a */
        public C14300v mo35917a(int i) {
            synchronized (C14133d.this) {
                if (this.f31385c) {
                    throw new IllegalStateException();
                } else if (this.f31383a.f31393f != this) {
                    C14300v a = C14287m.m45718a();
                    return a;
                } else {
                    if (!this.f31383a.f31392e) {
                        this.f31384b[i] = true;
                    }
                    try {
                        C14137a aVar = new C14137a(C14133d.this.f31369c.mo36125b(this.f31383a.f31391d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C14287m.m45718a();
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo35919b() throws IOException {
            synchronized (C14133d.this) {
                if (!this.f31385c) {
                    if (this.f31383a.f31393f == this) {
                        C14133d.this.mo35903a(this, true);
                    }
                    this.f31385c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo35920c() {
            if (this.f31383a.f31393f == this) {
                int i = 0;
                while (true) {
                    C14133d dVar = C14133d.this;
                    if (i < dVar.f31367a0) {
                        try {
                            dVar.f31369c.mo36128e(this.f31383a.f31391d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f31383a.f31393f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo35918a() throws IOException {
            synchronized (C14133d.this) {
                if (!this.f31385c) {
                    if (this.f31383a.f31393f == this) {
                        C14133d.this.mo35903a(this, false);
                    }
                    this.f31385c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: okhttp3.d0.g.d$d */
    /* compiled from: DiskLruCache */
    private final class C14138d {

        /* renamed from: a */
        final String f31388a;

        /* renamed from: b */
        final long[] f31389b;

        /* renamed from: c */
        final File[] f31390c;

        /* renamed from: d */
        final File[] f31391d;

        /* renamed from: e */
        boolean f31392e;

        /* renamed from: f */
        C14136c f31393f;

        /* renamed from: g */
        long f31394g;

        C14138d(String str) {
            this.f31388a = str;
            int i = C14133d.this.f31367a0;
            this.f31389b = new long[i];
            this.f31390c = new File[i];
            this.f31391d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C14133d.this.f31367a0; i2++) {
                sb.append(i2);
                this.f31390c[i2] = new File(C14133d.this.f31361U, sb.toString());
                sb.append(".tmp");
                this.f31391d[i2] = new File(C14133d.this.f31361U, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: b */
        private IOException m44890b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35923a(String[] strArr) throws IOException {
            if (strArr.length == C14133d.this.f31367a0) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f31389b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m44890b(strArr);
                        throw null;
                    }
                }
                return;
            }
            m44890b(strArr);
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35922a(C14280f fVar) throws IOException {
            for (long h : this.f31389b) {
                fVar.writeByte(32).mo36336h(h);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C14139e mo35921a() {
            if (Thread.holdsLock(C14133d.this)) {
                C14302x[] xVarArr = new C14302x[C14133d.this.f31367a0];
                long[] jArr = (long[]) this.f31389b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C14133d.this.f31367a0) {
                    try {
                        xVarArr[i2] = C14133d.this.f31369c.mo36123a(this.f31390c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C14133d.this.f31367a0 && xVarArr[i] != null) {
                            C14126e.m44830a((Closeable) xVarArr[i]);
                            i++;
                        }
                        try {
                            C14133d.this.mo35904a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                C14139e eVar = new C14139e(this.f31388a, this.f31394g, xVarArr, jArr);
                return eVar;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: okhttp3.d0.g.d$e */
    /* compiled from: DiskLruCache */
    public final class C14139e implements Closeable {

        /* renamed from: U */
        private final long f31396U;

        /* renamed from: V */
        private final C14302x[] f31397V;

        /* renamed from: c */
        private final String f31399c;

        C14139e(String str, long j, C14302x[] xVarArr, long[] jArr) {
            this.f31399c = str;
            this.f31396U = j;
            this.f31397V = xVarArr;
        }

        /* renamed from: a */
        public C14136c mo35924a() throws IOException {
            return C14133d.this.mo35901a(this.f31399c, this.f31396U);
        }

        /* renamed from: b */
        public C14302x mo35925b(int i) {
            return this.f31397V[i];
        }

        public void close() {
            for (C14302x a : this.f31397V) {
                C14126e.m44830a((Closeable) a);
            }
        }
    }

    static {
        Class<C14133d> cls = C14133d.class;
    }

    C14133d(C14215a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f31369c = aVar;
        this.f31361U = file;
        this.f31365Y = i;
        this.f31362V = new File(file, "journal");
        this.f31363W = new File(file, "journal.tmp");
        this.f31364X = new File(file, "journal.bkp");
        this.f31367a0 = i2;
        this.f31366Z = j;
        this.f31379l0 = executor;
    }

    /* renamed from: a */
    public static C14133d m44864a(C14215a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14126e.m44827a("OkHttp DiskLruCache", true));
            C14133d dVar = new C14133d(aVar, file, i, i2, j, threadPoolExecutor);
            return dVar;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: h */
    private C14280f m44867h() throws FileNotFoundException {
        return C14287m.m45717a((C14300v) new C14135b(this.f31369c.mo36129f(this.f31362V)));
    }

    /* renamed from: i */
    private void m44869i() throws IOException {
        this.f31369c.mo36128e(this.f31363W);
        Iterator it = this.f31371d0.values().iterator();
        while (it.hasNext()) {
            C14138d dVar = (C14138d) it.next();
            int i = 0;
            if (dVar.f31393f == null) {
                while (i < this.f31367a0) {
                    this.f31368b0 += dVar.f31389b[i];
                    i++;
                }
            } else {
                dVar.f31393f = null;
                while (i < this.f31367a0) {
                    this.f31369c.mo36128e(dVar.f31390c[i]);
                    this.f31369c.mo36128e(dVar.f31391d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|(1:19)(1:20)|(2:22|33)(1:34)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f31372e0 = r0 - r9.f31371d0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo36309a0() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo35910e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f31370c0 = m44867h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        m44865a((java.lang.Throwable) null, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r1 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        m44865a(r0, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x005d=Splitter:B:16:0x005d, B:23:0x007d=Splitter:B:23:0x007d} */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44871j() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.d0.l.a r1 = r9.f31369c
            java.io.File r2 = r9.f31362V
            okio.x r1 = r1.mo36123a(r2)
            okio.BufferedSource r1 = okio.C14287m.m45716a(r1)
            java.lang.String r2 = r1.mo36324d0()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r1.mo36324d0()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r1.mo36324d0()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r1.mo36324d0()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r1.mo36324d0()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f31365Y     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ab }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.f31367a0     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo36324d0()     // Catch:{ EOFException -> 0x005d }
            r9.m44868h(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r2 = r9.f31371d0     // Catch:{ all -> 0x00ab }
            int r2 = r2.size()     // Catch:{ all -> 0x00ab }
            int r0 = r0 - r2
            r9.f31372e0 = r0     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.mo36309a0()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0070
            r9.mo35910e()     // Catch:{ all -> 0x00ab }
            goto L_0x0076
        L_0x0070:
            okio.f r0 = r9.m44867h()     // Catch:{ all -> 0x00ab }
            r9.f31370c0 = r0     // Catch:{ all -> 0x00ab }
        L_0x0076:
            if (r1 == 0) goto L_0x007c
            r0 = 0
            m44865a(r0, r1)
        L_0x007c:
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r7.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ab }
            r7.append(r2)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r3)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r5)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ab }
            r4.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r4     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b3
            m44865a(r0, r1)
        L_0x00b3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.m44871j():void");
    }

    /* renamed from: b */
    public synchronized void mo35905b() throws IOException {
        if (!this.f31374g0) {
            if (this.f31369c.mo36127d(this.f31364X)) {
                if (this.f31369c.mo36127d(this.f31362V)) {
                    this.f31369c.mo36128e(this.f31364X);
                } else {
                    this.f31369c.mo36124a(this.f31364X, this.f31362V);
                }
            }
            if (this.f31369c.mo36127d(this.f31362V)) {
                try {
                    m44871j();
                    m44869i();
                    this.f31374g0 = true;
                    return;
                } catch (IOException e) {
                    C14225e d = C14225e.m45335d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(this.f31361U);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    d.mo36133a(5, sb.toString(), (Throwable) e);
                    mo35902a();
                    this.f31375h0 = false;
                } catch (Throwable th) {
                    this.f31375h0 = false;
                    throw th;
                }
            }
            mo35910e();
            this.f31374g0 = true;
        }
    }

    /* renamed from: c */
    public synchronized boolean mo35906c() {
        return this.f31375h0;
    }

    public synchronized void close() throws IOException {
        C14138d[] dVarArr;
        if (this.f31374g0) {
            if (!this.f31375h0) {
                for (C14138d dVar : (C14138d[]) this.f31371d0.values().toArray(new C14138d[this.f31371d0.size()])) {
                    if (dVar.f31393f != null) {
                        dVar.f31393f.mo35918a();
                    }
                }
                mo35912f();
                this.f31370c0.close();
                this.f31370c0 = null;
                this.f31375h0 = true;
                return;
            }
        }
        this.f31375h0 = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo35908d() {
        int i = this.f31372e0;
        return i >= 2000 && i >= this.f31371d0.size();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        m44865a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        throw r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35910e() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            okio.f r0 = r7.f31370c0     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x000a
            okio.f r0 = r7.f31370c0     // Catch:{ all -> 0x00c3 }
            r0.close()     // Catch:{ all -> 0x00c3 }
        L_0x000a:
            okhttp3.d0.l.a r0 = r7.f31369c     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f31363W     // Catch:{ all -> 0x00c3 }
            okio.v r0 = r0.mo36125b(r1)     // Catch:{ all -> 0x00c3 }
            okio.f r0 = okio.C14287m.m45717a(r0)     // Catch:{ all -> 0x00c3 }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            okio.f r2 = r0.mo36301a(r2)     // Catch:{ all -> 0x00ba }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "1"
            okio.f r2 = r0.mo36301a(r2)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f31365Y     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            okio.f r2 = r0.mo36336h(r4)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f31367a0     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            okio.f r2 = r0.mo36336h(r4)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r2 = r7.f31371d0     // Catch:{ all -> 0x00ba }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00ba }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ba }
        L_0x004c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00ba }
            okhttp3.d0.g.d$d r4 = (okhttp3.p688d0.p689g.C14133d.C14138d) r4     // Catch:{ all -> 0x00ba }
            okhttp3.d0.g.d$c r5 = r4.f31393f     // Catch:{ all -> 0x00ba }
            r6 = 32
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = "DIRTY"
            okio.f r5 = r0.mo36301a(r5)     // Catch:{ all -> 0x00ba }
            r5.writeByte(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r4.f31388a     // Catch:{ all -> 0x00ba }
            r0.mo36301a(r4)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0070:
            java.lang.String r5 = "CLEAN"
            okio.f r5 = r0.mo36301a(r5)     // Catch:{ all -> 0x00ba }
            r5.writeByte(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r4.f31388a     // Catch:{ all -> 0x00ba }
            r0.mo36301a(r5)     // Catch:{ all -> 0x00ba }
            r4.mo35922a(r0)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            m44865a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x008a:
            okhttp3.d0.l.a r0 = r7.f31369c     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f31362V     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.mo36127d(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x009d
            okhttp3.d0.l.a r0 = r7.f31369c     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f31362V     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f31364X     // Catch:{ all -> 0x00c3 }
            r0.mo36124a(r1, r2)     // Catch:{ all -> 0x00c3 }
        L_0x009d:
            okhttp3.d0.l.a r0 = r7.f31369c     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f31363W     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f31362V     // Catch:{ all -> 0x00c3 }
            r0.mo36124a(r1, r2)     // Catch:{ all -> 0x00c3 }
            okhttp3.d0.l.a r0 = r7.f31369c     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f31364X     // Catch:{ all -> 0x00c3 }
            r0.mo36128e(r1)     // Catch:{ all -> 0x00c3 }
            okio.f r0 = r7.m44867h()     // Catch:{ all -> 0x00c3 }
            r7.f31370c0 = r0     // Catch:{ all -> 0x00c3 }
            r0 = 0
            r7.f31373f0 = r0     // Catch:{ all -> 0x00c3 }
            r7.f31377j0 = r0     // Catch:{ all -> 0x00c3 }
            monitor-exit(r7)
            return
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r2 = move-exception
            if (r0 == 0) goto L_0x00c2
            m44865a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r2     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.mo35910e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.p688d0.p689g.C14133d.C14139e mo35911f(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo35905b()     // Catch:{ all -> 0x0050 }
            r3.m44866g()     // Catch:{ all -> 0x0050 }
            r3.m44870i(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r0 = r3.f31371d0     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            okhttp3.d0.g.d$d r0 = (okhttp3.p688d0.p689g.C14133d.C14138d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f31392e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.d0.g.d$e r0 = r0.mo35921a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f31372e0     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f31372e0 = r1     // Catch:{ all -> 0x0050 }
            okio.f r1 = r3.f31370c0     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.f r1 = r1.mo36301a(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.f r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            okio.f r4 = r1.mo36301a(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo35908d()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f31379l0     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f31380m0     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.mo35911f(java.lang.String):okhttp3.d0.g.d$e");
    }

    public synchronized void flush() throws IOException {
        if (this.f31374g0) {
            m44866g();
            mo35912f();
            this.f31370c0.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo35914g(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo35905b()     // Catch:{ all -> 0x0029 }
            r6.m44866g()     // Catch:{ all -> 0x0029 }
            r6.m44870i(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r0 = r6.f31371d0     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            okhttp3.d0.g.d$d r7 = (okhttp3.p688d0.p689g.C14133d.C14138d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo35904a(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f31368b0     // Catch:{ all -> 0x0029 }
            long r3 = r6.f31366Z     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f31376i0 = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.mo35914g(java.lang.String):boolean");
    }

    /* renamed from: h */
    private void m44868h(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f31371d0.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C14138d dVar = (C14138d) this.f31371d0.get(str2);
            if (dVar == null) {
                dVar = new C14138d(str2);
                this.f31371d0.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f31392e = true;
                dVar.f31393f = null;
                dVar.mo35923a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f31393f = new C14136c(dVar);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* renamed from: a */
    private static /* synthetic */ void m44865a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.p688d0.p689g.C14133d.C14136c mo35901a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo35905b()     // Catch:{ all -> 0x0074 }
            r5.m44866g()     // Catch:{ all -> 0x0074 }
            r5.m44870i(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r0 = r5.f31371d0     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.d0.g.d$d r0 = (okhttp3.p688d0.p689g.C14133d.C14138d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f31394g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.d0.g.d$c r7 = r0.f31393f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f31376i0     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f31377j0     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            okio.f r7 = r5.f31370c0     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            okio.f r7 = r7.mo36301a(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            okio.f r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.f r7 = r7.mo36301a(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.f r7 = r5.f31370c0     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f31373f0     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            okhttp3.d0.g.d$d r0 = new okhttp3.d0.g.d$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r7 = r5.f31371d0     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.d0.g.d$c r6 = new okhttp3.d0.g.d$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f31393f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f31379l0     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f31380m0     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.mo35901a(java.lang.String, long):okhttp3.d0.g.d$c");
    }

    /* renamed from: g */
    private synchronized void m44866g() {
        if (mo35906c()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: i */
    private void m44870i(String str) {
        if (!f31360n0.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo35912f() throws IOException {
        while (this.f31368b0 > this.f31366Z) {
            mo35904a((C14138d) this.f31371d0.values().iterator().next());
        }
        this.f31376i0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35903a(okhttp3.p688d0.p689g.C14133d.C14136c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.d0.g.d$d r0 = r10.f31383a     // Catch:{ all -> 0x00fb }
            okhttp3.d0.g.d$c r1 = r0.f31393f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f31392e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f31367a0     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f31384b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            okhttp3.d0.l.a r3 = r9.f31369c     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f31391d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo36127d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo35918a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo35918a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f31367a0     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f31391d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            okhttp3.d0.l.a r2 = r9.f31369c     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo36127d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f31390c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.d0.l.a r3 = r9.f31369c     // Catch:{ all -> 0x00fb }
            r3.mo36124a(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f31389b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.d0.l.a r10 = r9.f31369c     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo36130g(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f31389b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f31368b0     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f31368b0 = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            okhttp3.d0.l.a r2 = r9.f31369c     // Catch:{ all -> 0x00fb }
            r2.mo36128e(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f31372e0     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f31372e0 = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f31393f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f31392e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f31392e = r1     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            okio.f r10 = r10.mo36301a(r1)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f31388a     // Catch:{ all -> 0x00fb }
            r10.mo36301a(r1)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            r0.mo35922a(r10)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f31378k0     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f31378k0 = r1     // Catch:{ all -> 0x00fb }
            r0.f31394g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.d0.g.d$d> r10 = r9.f31371d0     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f31388a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            okio.f r10 = r10.mo36301a(r11)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f31388a     // Catch:{ all -> 0x00fb }
            r10.mo36301a(r11)     // Catch:{ all -> 0x00fb }
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            okio.f r10 = r9.f31370c0     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f31368b0     // Catch:{ all -> 0x00fb }
            long r0 = r9.f31366Z     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo35908d()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f31379l0     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f31380m0     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p689g.C14133d.mo35903a(okhttp3.d0.g.d$c, boolean):void");
    }

    /* renamed from: e */
    public C14136c mo35909e(String str) throws IOException {
        return mo35901a(str, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35904a(C14138d dVar) throws IOException {
        C14136c cVar = dVar.f31393f;
        if (cVar != null) {
            cVar.mo35920c();
        }
        for (int i = 0; i < this.f31367a0; i++) {
            this.f31369c.mo36128e(dVar.f31390c[i]);
            long j = this.f31368b0;
            long[] jArr = dVar.f31389b;
            this.f31368b0 = j - jArr[i];
            jArr[i] = 0;
        }
        this.f31372e0++;
        this.f31370c0.mo36301a("REMOVE").writeByte(32).mo36301a(dVar.f31388a).writeByte(10);
        this.f31371d0.remove(dVar.f31388a);
        if (mo35908d()) {
            this.f31379l0.execute(this.f31380m0);
        }
        return true;
    }

    /* renamed from: a */
    public void mo35902a() throws IOException {
        close();
        this.f31369c.mo36126c(this.f31361U);
    }
}
