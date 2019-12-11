package p163g.p413f.p414a.p415p;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.f.a.p.a */
/* compiled from: DiskLruCache */
public final class C10671a implements Closeable {

    /* renamed from: U */
    private final File f25207U;

    /* renamed from: V */
    private final File f25208V;

    /* renamed from: W */
    private final File f25209W;

    /* renamed from: X */
    private final int f25210X;

    /* renamed from: Y */
    private long f25211Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final int f25212Z;

    /* renamed from: a0 */
    private long f25213a0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Writer f25214b0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final File f25215c;

    /* renamed from: c0 */
    private final LinkedHashMap<String, C10675d> f25216c0 = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f25217d0;

    /* renamed from: e0 */
    private long f25218e0 = 0;

    /* renamed from: f0 */
    final ThreadPoolExecutor f25219f0;

    /* renamed from: g0 */
    private final Callable<Void> f25220g0;

    /* renamed from: g.f.a.p.a$a */
    /* compiled from: DiskLruCache */
    class C10672a implements Callable<Void> {
        C10672a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                g.f.a.p.a r0 = p163g.p413f.p414a.p415p.C10671a.this
                monitor-enter(r0)
                g.f.a.p.a r1 = p163g.p413f.p414a.p415p.C10671a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f25214b0     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                g.f.a.p.a r1 = p163g.p413f.p414a.p415p.C10671a.this     // Catch:{ all -> 0x0028 }
                r1.m33526g()     // Catch:{ all -> 0x0028 }
                g.f.a.p.a r1 = p163g.p413f.p414a.p415p.C10671a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m33519c()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                g.f.a.p.a r1 = p163g.p413f.p414a.p415p.C10671a.this     // Catch:{ all -> 0x0028 }
                r1.m33524f()     // Catch:{ all -> 0x0028 }
                g.f.a.p.a r1 = p163g.p413f.p414a.p415p.C10671a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f25217d0 = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p415p.C10671a.C10672a.call():java.lang.Void");
        }
    }

    /* renamed from: g.f.a.p.a$b */
    /* compiled from: DiskLruCache */
    private static final class C10673b implements ThreadFactory {
        private C10673b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C10673b(C10672a aVar) {
            this();
        }
    }

    /* renamed from: g.f.a.p.a$c */
    /* compiled from: DiskLruCache */
    public final class C10674c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C10675d f25222a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f25223b;

        /* renamed from: c */
        private boolean f25224c;

        /* synthetic */ C10674c(C10671a aVar, C10675d dVar, C10672a aVar2) {
            this(dVar);
        }

        /* renamed from: c */
        public void mo27593c() throws IOException {
            C10671a.this.m33512a(this, true);
            this.f25224c = true;
        }

        private C10674c(C10675d dVar) {
            this.f25222a = dVar;
            this.f25223b = dVar.f25230e ? null : new boolean[C10671a.this.f25212Z];
        }

        /* renamed from: a */
        public File mo27590a(int i) throws IOException {
            File b;
            synchronized (C10671a.this) {
                if (this.f25222a.f25231f == this) {
                    if (!this.f25222a.f25230e) {
                        this.f25223b[i] = true;
                    }
                    b = this.f25222a.mo27596b(i);
                    if (!C10671a.this.f25215c.exists()) {
                        C10671a.this.f25215c.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: b */
        public void mo27592b() {
            if (!this.f25224c) {
                try {
                    mo27591a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo27591a() throws IOException {
            C10671a.this.m33512a(this, false);
        }
    }

    /* renamed from: g.f.a.p.a$d */
    /* compiled from: DiskLruCache */
    private final class C10675d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f25226a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f25227b;

        /* renamed from: c */
        File[] f25228c;

        /* renamed from: d */
        File[] f25229d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f25230e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C10674c f25231f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f25232g;

        /* synthetic */ C10675d(C10671a aVar, String str, C10672a aVar2) {
            this(str);
        }

        private C10675d(String str) {
            this.f25226a = str;
            this.f25227b = new long[C10671a.this.f25212Z];
            this.f25228c = new File[C10671a.this.f25212Z];
            this.f25229d = new File[C10671a.this.f25212Z];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C10671a.this.f25212Z; i++) {
                sb.append(i);
                this.f25228c[i] = new File(C10671a.this.f25215c, sb.toString());
                sb.append(".tmp");
                this.f25229d[i] = new File(C10671a.this.f25215c, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m33545b(String[] strArr) throws IOException {
            if (strArr.length == C10671a.this.f25212Z) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f25227b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m33540a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m33540a(strArr);
            throw null;
        }

        /* renamed from: a */
        public String mo27595a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f25227b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo27596b(int i) {
            return this.f25229d[i];
        }

        /* renamed from: a */
        private IOException m33540a(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo27594a(int i) {
            return this.f25228c[i];
        }
    }

    /* renamed from: g.f.a.p.a$e */
    /* compiled from: DiskLruCache */
    public final class C10676e {

        /* renamed from: a */
        private final File[] f25234a;

        /* synthetic */ C10676e(C10671a aVar, String str, long j, File[] fileArr, long[] jArr, C10672a aVar2) {
            this(aVar, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo27597a(int i) {
            return this.f25234a[i];
        }

        private C10676e(C10671a aVar, String str, long j, File[] fileArr, long[] jArr) {
            this.f25234a = fileArr;
        }
    }

    private C10671a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C10673b(null));
        this.f25219f0 = threadPoolExecutor;
        this.f25220g0 = new C10672a();
        this.f25215c = file2;
        this.f25210X = i;
        this.f25207U = new File(file2, "journal");
        this.f25208V = new File(file2, "journal.tmp");
        this.f25209W = new File(file2, "journal.bkp");
        this.f25212Z = i2;
        this.f25211Y = j;
    }

    /* renamed from: h */
    private void m33527h(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f25216c0.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C10675d dVar = (C10675d) this.f25216c0.get(str2);
            if (dVar == null) {
                dVar = new C10675d(this, str2, null);
                this.f25216c0.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f25230e = true;
                dVar.f25231f = null;
                dVar.m33545b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f25231f = new C10674c(this, dVar, null);
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

    public synchronized void close() throws IOException {
        if (this.f25214b0 != null) {
            Iterator it = new ArrayList(this.f25216c0.values()).iterator();
            while (it.hasNext()) {
                C10675d dVar = (C10675d) it.next();
                if (dVar.f25231f != null) {
                    dVar.f25231f.mo27591a();
                }
            }
            m33526g();
            this.f25214b0.close();
            this.f25214b0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo27587g(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m33517b()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r0 = r7.f25216c0     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            g.f.a.p.a$d r0 = (p163g.p413f.p414a.p415p.C10671a.C10675d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            g.f.a.p.a$c r2 = r0.f25231f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f25212Z     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo27594a(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f25213a0     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f25227b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f25213a0 = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f25227b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f25217d0     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f25217d0 = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f25214b0     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f25214b0     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f25214b0     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f25214b0     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r0 = r7.f25216c0     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m33519c()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f25219f0     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f25220g0     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p415p.C10671a.mo27587g(java.lang.String):boolean");
    }

    /* renamed from: b */
    private void m33517b() {
        if (this.f25214b0 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m33519c() {
        int i = this.f25217d0;
        return i >= 2000 && i >= this.f25216c0.size();
    }

    /* renamed from: d */
    private void m33521d() throws IOException {
        m33514a(this.f25208V);
        Iterator it = this.f25216c0.values().iterator();
        while (it.hasNext()) {
            C10675d dVar = (C10675d) it.next();
            int i = 0;
            if (dVar.f25231f == null) {
                while (i < this.f25212Z) {
                    this.f25213a0 += dVar.f25227b[i];
                    i++;
                }
            } else {
                dVar.f25231f = null;
                while (i < this.f25212Z) {
                    m33514a(dVar.mo27594a(i));
                    m33514a(dVar.mo27596b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f25217d0 = r0 - r9.f25216c0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo27598a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m33524f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f25214b0 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f25207U, true), p163g.p413f.p414a.p415p.C10679c.f25241a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33522e() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            g.f.a.p.b r1 = new g.f.a.p.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f25207U
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p163g.p413f.p414a.p415p.C10679c.f25241a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo27599b()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo27599b()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo27599b()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo27599b()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo27599b()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f25210X     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f25212Z     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo27599b()     // Catch:{ EOFException -> 0x005f }
            r9.m33527h(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r2 = r9.f25216c0     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f25217d0 = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo27598a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m33524f()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f25207U     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p163g.p413f.p414a.p415p.C10679c.f25241a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f25214b0 = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p163g.p413f.p414a.p415p.C10679c.m33557a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p163g.p413f.p414a.p415p.C10679c.m33557a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p415p.C10671a.m33522e():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m33524f() throws IOException {
        if (this.f25214b0 != null) {
            this.f25214b0.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25208V), C10679c.f25241a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f25210X));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f25212Z));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C10675d dVar : this.f25216c0.values()) {
                if (dVar.f25231f != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f25226a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(dVar.f25226a);
                    sb2.append(dVar.mo27595a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f25207U.exists()) {
                m33515a(this.f25207U, this.f25209W, true);
            }
            m33515a(this.f25208V, this.f25207U, false);
            this.f25209W.delete();
            this.f25214b0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25207U, true), C10679c.f25241a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C10671a m33510a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m33515a(file2, file3, false);
                }
            }
            C10671a aVar = new C10671a(file, i, i2, j);
            if (aVar.f25207U.exists()) {
                try {
                    aVar.m33522e();
                    aVar.m33521d();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo27583a();
                }
            }
            file.mkdirs();
            C10671a aVar2 = new C10671a(file, i, i2, j);
            aVar2.m33524f();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m33526g() throws IOException {
        while (this.f25213a0 > this.f25211Y) {
            mo27587g((String) ((Entry) this.f25216c0.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: e */
    public C10674c mo27585e(String str) throws IOException {
        return m33509a(str, -1);
    }

    /* renamed from: a */
    private static void m33514a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m33515a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m33514a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: f */
    public synchronized C10676e mo27586f(String str) throws IOException {
        m33517b();
        C10675d dVar = (C10675d) this.f25216c0.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f25230e) {
            return null;
        }
        for (File exists : dVar.f25228c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f25217d0++;
        this.f25214b0.append("READ");
        this.f25214b0.append(' ');
        this.f25214b0.append(str);
        this.f25214b0.append(10);
        if (m33519c()) {
            this.f25219f0.submit(this.f25220g0);
        }
        C10676e eVar = new C10676e(this, str, dVar.f25232g, dVar.f25228c, dVar.f25227b, null);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p163g.p413f.p414a.p415p.C10671a.C10674c m33509a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m33517b()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r0 = r5.f25216c0     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            g.f.a.p.a$d r0 = (p163g.p413f.p414a.p415p.C10671a.C10675d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f25232g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            g.f.a.p.a$d r0 = new g.f.a.p.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r7 = r5.f25216c0     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            g.f.a.p.a$c r7 = r0.f25231f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            g.f.a.p.a$c r7 = new g.f.a.p.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            r0.f25231f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f25214b0     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f25214b0     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f25214b0     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f25214b0     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f25214b0     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p415p.C10671a.m33509a(java.lang.String, long):g.f.a.p.a$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m33512a(p163g.p413f.p414a.p415p.C10671a.C10674c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            g.f.a.p.a$d r0 = r10.f25222a     // Catch:{ all -> 0x010e }
            g.f.a.p.a$c r1 = r0.f25231f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f25230e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f25212Z     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f25223b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo27596b(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo27591a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo27591a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f25212Z     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo27596b(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo27594a(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f25227b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f25227b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f25213a0     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f25213a0 = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m33514a(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f25217d0     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f25217d0 = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            r0.f25231f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f25230e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            r0.f25230e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f25226a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo27595a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f25218e0     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f25218e0 = r1     // Catch:{ all -> 0x010e }
            r0.f25232g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, g.f.a.p.a$d> r10 = r9.f25216c0     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f25226a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f25226a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f25214b0     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f25213a0     // Catch:{ all -> 0x010e }
            long r0 = r9.f25211Y     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m33519c()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f25219f0     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f25220g0     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p415p.C10671a.m33512a(g.f.a.p.a$c, boolean):void");
    }

    /* renamed from: a */
    public void mo27583a() throws IOException {
        close();
        C10679c.m33558a(this.f25215c);
    }
}
