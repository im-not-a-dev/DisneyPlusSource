package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: f.a.f0 */
public final class C4439f0 {

    /* renamed from: o */
    static final Pattern f11025o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p */
    private static final String f11026p = C1557c.m7461a(C4439f0.class);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final OutputStream f11027q = new C4441b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f11028a;

    /* renamed from: b */
    private final File f11029b;

    /* renamed from: c */
    private final File f11030c;

    /* renamed from: d */
    private final File f11031d;

    /* renamed from: e */
    private final int f11032e;

    /* renamed from: f */
    private long f11033f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f11034g;

    /* renamed from: h */
    private long f11035h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Writer f11036i;

    /* renamed from: j */
    private final LinkedHashMap<String, C4452g0> f11037j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f11038k;

    /* renamed from: l */
    private long f11039l = 0;

    /* renamed from: m */
    final ThreadPoolExecutor f11040m;

    /* renamed from: n */
    private final Callable<Void> f11041n;

    /* renamed from: f.a.f0$a */
    class C4440a implements Callable<Void> {
        C4440a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                f.a.f0 r0 = p161f.p162a.C4439f0.this
                monitor-enter(r0)
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f11036i     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x0028 }
                r1.m15350i()     // Catch:{ all -> 0x0028 }
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m15348g()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x0028 }
                r1.m15347f()     // Catch:{ all -> 0x0028 }
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f11038k = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.C4440a.call():java.lang.Void");
        }
    }

    /* renamed from: f.a.f0$b */
    static class C4441b extends OutputStream {
        C4441b() {
        }

        public void write(int i) {
        }
    }

    /* renamed from: f.a.f0$c */
    public final class C4442c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4452g0 f11043a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f11044b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f11045c;

        /* renamed from: f.a.f0$c$a */
        class C4443a extends FilterOutputStream {
            /* synthetic */ C4443a(C4442c cVar, OutputStream outputStream, C4440a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C4442c.this.f11045c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C4442c.this.f11045c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C4442c.this.f11045c = true;
                }
            }

            private C4443a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C4442c.this.f11045c = true;
                }
            }
        }

        /* synthetic */ C4442c(C4439f0 f0Var, C4452g0 g0Var, C4440a aVar) {
            this(g0Var);
        }

        private C4442c(C4452g0 g0Var) {
            this.f11043a = g0Var;
            this.f11044b = g0Var.f11061c ? null : new boolean[C4439f0.this.f11034g];
        }

        /* renamed from: b */
        public void mo15542b() {
            C4439f0.this.m15333a(this, false);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002a */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo15540a(int r4) {
            /*
                r3 = this;
                if (r4 < 0) goto L_0x004f
                f.a.f0 r0 = p161f.p162a.C4439f0.this
                int r0 = r0.f11034g
                if (r4 >= r0) goto L_0x004f
                f.a.f0 r0 = p161f.p162a.C4439f0.this
                monitor-enter(r0)
                f.a.g0 r1 = r3.f11043a     // Catch:{ all -> 0x004c }
                f.a.f0$c r1 = r1.f11062d     // Catch:{ all -> 0x004c }
                if (r1 != r3) goto L_0x0046
                f.a.g0 r1 = r3.f11043a     // Catch:{ all -> 0x004c }
                boolean r1 = r1.f11061c     // Catch:{ all -> 0x004c }
                if (r1 != 0) goto L_0x001e
                boolean[] r1 = r3.f11044b     // Catch:{ all -> 0x004c }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x004c }
            L_0x001e:
                f.a.g0 r1 = r3.f11043a     // Catch:{ all -> 0x004c }
                java.io.File r4 = r1.mo15564b(r4)     // Catch:{ all -> 0x004c }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002a }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002a }
                goto L_0x0038
            L_0x002a:
                f.a.f0 r1 = p161f.p162a.C4439f0.this     // Catch:{ all -> 0x004c }
                java.io.File r1 = r1.f11028a     // Catch:{ all -> 0x004c }
                r1.mkdirs()     // Catch:{ all -> 0x004c }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0040 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0040 }
            L_0x0038:
                f.a.f0$c$a r4 = new f.a.f0$c$a     // Catch:{ all -> 0x004c }
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch:{ all -> 0x004c }
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return r4
            L_0x0040:
                java.io.OutputStream r4 = p161f.p162a.C4439f0.f11027q     // Catch:{ all -> 0x004c }
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return r4
            L_0x0046:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004c }
                r4.<init>()     // Catch:{ all -> 0x004c }
                throw r4     // Catch:{ all -> 0x004c }
            L_0x004c:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                throw r4
            L_0x004f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected index "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r4)
                f.a.f0 r4 = p161f.p162a.C4439f0.this
                int r4 = r4.f11034g
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.C4442c.mo15540a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo15541a() {
            if (this.f11045c) {
                C4439f0.this.m15333a(this, false);
                C4439f0.this.mo15536c(this.f11043a.f11059a);
                return;
            }
            C4439f0.this.m15333a(this, true);
        }
    }

    /* renamed from: f.a.f0$d */
    public final class C4444d implements Closeable {

        /* renamed from: c */
        private final InputStream[] f11048c;

        /* synthetic */ C4444d(C4439f0 f0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, C4440a aVar) {
            this(f0Var, str, j, inputStreamArr, jArr);
        }

        /* renamed from: b */
        public InputStream mo15547b(int i) {
            return this.f11048c[i];
        }

        public void close() {
            for (InputStream a : this.f11048c) {
                C4469i0.m15468a((Closeable) a);
            }
        }

        private C4444d(C4439f0 f0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f11048c = inputStreamArr;
        }
    }

    private C4439f0(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f11040m = threadPoolExecutor;
        this.f11041n = new C4440a();
        this.f11028a = file2;
        this.f11032e = i;
        this.f11029b = new File(file2, "journal");
        this.f11030c = new File(file2, "journal.tmp");
        this.f11031d = new File(file2, "journal.bkp");
        this.f11034g = i2;
        this.f11033f = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m15348g() {
        int i = this.f11038k;
        return i >= 2000 && i >= this.f11037j.size();
    }

    /* renamed from: h */
    private void m15349h() {
        if (this.f11036i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m15350i() {
        while (this.f11035h > this.f11033f) {
            mo15536c((String) ((Entry) this.f11037j.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f11038k = r0 - r9.f11037j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo15567b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m15347f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f11036i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f11029b, true), p161f.p162a.C4469i0.f11099a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15340d() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            f.a.h0 r1 = new f.a.h0
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f11029b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p161f.p162a.C4469i0.f11099a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo15566a()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo15566a()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo15566a()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo15566a()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo15566a()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f11032e     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f11034g     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo15566a()     // Catch:{ EOFException -> 0x005f }
            r9.m15342d(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r2 = r9.f11037j     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f11038k = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo15567b()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m15347f()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f11029b     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p161f.p162a.C4469i0.f11099a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f11036i = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p161f.p162a.C4469i0.m15468a(r1)
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
            p161f.p162a.C4469i0.m15468a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.m15340d():void");
    }

    /* renamed from: e */
    private void m15344e() {
        m15335a(this.f11030c);
        Iterator it = this.f11037j.values().iterator();
        while (it.hasNext()) {
            C4452g0 g0Var = (C4452g0) it.next();
            int i = 0;
            if (g0Var.f11062d == null) {
                while (i < this.f11034g) {
                    this.f11035h += g0Var.f11060b[i];
                    i++;
                }
            } else {
                g0Var.f11062d = null;
                while (i < this.f11034g) {
                    m15335a(g0Var.mo15561a(i));
                    m15335a(g0Var.mo15564b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m15347f() {
        if (this.f11036i != null) {
            this.f11036i.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11030c), C4469i0.f11099a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f11032e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f11034g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C4452g0 g0Var : this.f11037j.values()) {
                if (g0Var.f11062d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(g0Var.f11059a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(g0Var.f11059a);
                    sb2.append(g0Var.mo15562a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f11029b.exists()) {
                m15336a(this.f11029b, this.f11031d, true);
            }
            m15336a(this.f11030c, this.f11029b, false);
            this.f11031d.delete();
            this.f11036i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11029b, true), C4469i0.f11099a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: b */
    public C4442c mo15534b(String str) {
        return m15330a(str, -1);
    }

    /* renamed from: b */
    public void mo15535b() {
        mo15533a();
        C4469i0.m15469a(this.f11028a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo15536c(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m15349h()     // Catch:{ all -> 0x008c }
            r7.m15345e(r8)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r0 = r7.f11037j     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008c }
            f.a.g0 r0 = (p161f.p162a.C4452g0) r0     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            f.a.f0$c r2 = r0.f11062d     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0017
            goto L_0x008a
        L_0x0017:
            int r2 = r7.f11034g     // Catch:{ all -> 0x008c }
            if (r1 >= r2) goto L_0x0055
            java.io.File r2 = r0.mo15561a(r1)     // Catch:{ all -> 0x008c }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008c }
            r0.append(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008c }
            r8.<init>(r0)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x0043:
            long r2 = r7.f11035h     // Catch:{ all -> 0x008c }
            long[] r4 = r0.f11060b     // Catch:{ all -> 0x008c }
            r5 = r4[r1]     // Catch:{ all -> 0x008c }
            long r2 = r2 - r5
            r7.f11035h = r2     // Catch:{ all -> 0x008c }
            long[] r2 = r0.f11060b     // Catch:{ all -> 0x008c }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008c }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0055:
            int r0 = r7.f11038k     // Catch:{ all -> 0x008c }
            r1 = 1
            int r0 = r0 + r1
            r7.f11038k = r0     // Catch:{ all -> 0x008c }
            java.io.Writer r0 = r7.f11036i     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r2.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008c }
            r2.append(r8)     // Catch:{ all -> 0x008c }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008c }
            r0.append(r2)     // Catch:{ all -> 0x008c }
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r0 = r7.f11037j     // Catch:{ all -> 0x008c }
            r0.remove(r8)     // Catch:{ all -> 0x008c }
            boolean r8 = r7.m15348g()     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0088
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f11040m     // Catch:{ all -> 0x008c }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f11041n     // Catch:{ all -> 0x008c }
            r8.submit(r0)     // Catch:{ all -> 0x008c }
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            monitor-exit(r7)
            return r1
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.mo15536c(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C4439f0 m15331a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m15336a(file2, file3, false);
                }
            }
            C4439f0 f0Var = new C4439f0(file, i, i2, j);
            if (f0Var.f11029b.exists()) {
                try {
                    f0Var.m15340d();
                    f0Var.m15344e();
                    return f0Var;
                } catch (IOException e) {
                    String str = f11026p;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    C1557c.m7465b(str, sb.toString());
                    f0Var.mo15535b();
                }
            }
            file.mkdirs();
            C4439f0 f0Var2 = new C4439f0(file, i, i2, j);
            f0Var2.m15347f();
            return f0Var2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: e */
    private void m15345e(String str) {
        if (!f11025o.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m15335a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private void m15342d(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f11037j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C4452g0 g0Var = (C4452g0) this.f11037j.get(str2);
            if (g0Var == null) {
                g0Var = new C4452g0(str2, this.f11034g, this.f11028a);
                this.f11037j.put(str2, g0Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                g0Var.f11061c = true;
                g0Var.f11062d = null;
                g0Var.mo15563a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                g0Var.f11062d = new C4442c(this, g0Var, null);
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
    private static void m15336a(File file, File file2, boolean z) {
        if (z) {
            m15335a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f11038k++;
        r1 = r11.f11036i;
        r2 = new java.lang.StringBuilder();
        r2.append("READ ");
        r2.append(r12);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (m15348g() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r11.f11040m.submit(r11.f11041n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = new p161f.p162a.C4439f0.C4444d(r11, r12, r0.f11063e, r8, r0.f11060b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p161f.p162a.C4439f0.C4444d mo15532a(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m15349h()     // Catch:{ all -> 0x0081 }
            r11.m15345e(r12)     // Catch:{ all -> 0x0081 }
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r0 = r11.f11037j     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0081 }
            f.a.g0 r0 = (p161f.p162a.C4452g0) r0     // Catch:{ all -> 0x0081 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f11061c     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.f11034g     // Catch:{ all -> 0x0081 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0081 }
            r2 = 0
            r3 = 0
        L_0x0020:
            int r4 = r11.f11034g     // Catch:{ FileNotFoundException -> 0x006f }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006f }
            java.io.File r5 = r0.mo15561a(r3)     // Catch:{ FileNotFoundException -> 0x006f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006f }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f11038k     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 1
            r11.f11038k = r1     // Catch:{ all -> 0x0081 }
            java.io.Writer r1 = r11.f11036i     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r12)     // Catch:{ all -> 0x0081 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r1.append(r2)     // Catch:{ all -> 0x0081 }
            boolean r1 = r11.m15348g()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f11040m     // Catch:{ all -> 0x0081 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f11041n     // Catch:{ all -> 0x0081 }
            r1.submit(r2)     // Catch:{ all -> 0x0081 }
        L_0x0060:
            f.a.f0$d r1 = new f.a.f0$d     // Catch:{ all -> 0x0081 }
            long r6 = r0.f11063e     // Catch:{ all -> 0x0081 }
            long[] r9 = r0.f11060b     // Catch:{ all -> 0x0081 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0081 }
            monitor-exit(r11)
            return r1
        L_0x006f:
            int r12 = r11.f11034g     // Catch:{ all -> 0x0081 }
            if (r2 >= r12) goto L_0x007f
            r12 = r8[r2]     // Catch:{ all -> 0x0081 }
            if (r12 == 0) goto L_0x007f
            r12 = r8[r2]     // Catch:{ all -> 0x0081 }
            p161f.p162a.C4469i0.m15468a(r12)     // Catch:{ all -> 0x0081 }
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007f:
            monitor-exit(r11)
            return r1
        L_0x0081:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.mo15532a(java.lang.String):f.a.f0$d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p161f.p162a.C4439f0.C4442c m15330a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m15349h()     // Catch:{ all -> 0x0060 }
            r5.m15345e(r6)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r0 = r5.f11037j     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0060 }
            f.a.g0 r0 = (p161f.p162a.C4452g0) r0     // Catch:{ all -> 0x0060 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001e
            long r1 = r0.f11063e     // Catch:{ all -> 0x0060 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0020
        L_0x001e:
            monitor-exit(r5)
            return r3
        L_0x0020:
            if (r0 != 0) goto L_0x0031
            f.a.g0 r0 = new f.a.g0     // Catch:{ all -> 0x0060 }
            int r7 = r5.f11034g     // Catch:{ all -> 0x0060 }
            java.io.File r8 = r5.f11028a     // Catch:{ all -> 0x0060 }
            r0.<init>(r6, r7, r8)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r7 = r5.f11037j     // Catch:{ all -> 0x0060 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0037
        L_0x0031:
            f.a.f0$c r7 = r0.f11062d     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            f.a.f0$c r7 = new f.a.f0$c     // Catch:{ all -> 0x0060 }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x0060 }
            r0.f11062d = r7     // Catch:{ all -> 0x0060 }
            java.io.Writer r8 = r5.f11036i     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0060 }
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0060 }
            r8.write(r6)     // Catch:{ all -> 0x0060 }
            java.io.Writer r6 = r5.f11036i     // Catch:{ all -> 0x0060 }
            r6.flush()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return r7
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.m15330a(java.lang.String, long):f.a.f0$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m15333a(p161f.p162a.C4439f0.C4442c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            f.a.g0 r0 = r10.f11043a     // Catch:{ all -> 0x00fd }
            f.a.f0$c r1 = r0.f11062d     // Catch:{ all -> 0x00fd }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x0049
            boolean r2 = r0.f11061c     // Catch:{ all -> 0x00fd }
            if (r2 != 0) goto L_0x0049
            r2 = 0
        L_0x0011:
            int r3 = r9.f11034g     // Catch:{ all -> 0x00fd }
            if (r2 >= r3) goto L_0x0049
            boolean[] r3 = r10.f11044b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.mo15564b(r2)     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x002c
            r10.mo15542b()     // Catch:{ all -> 0x00fd }
            monitor-exit(r9)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002f:
            r10.mo15542b()     // Catch:{ all -> 0x00fd }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.<init>(r11)     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x0049:
            int r10 = r9.f11034g     // Catch:{ all -> 0x00fd }
            if (r1 >= r10) goto L_0x0079
            java.io.File r10 = r0.mo15564b(r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x0073
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0076
            java.io.File r2 = r0.mo15561a(r1)     // Catch:{ all -> 0x00fd }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f11060b     // Catch:{ all -> 0x00fd }
            r3 = r10[r1]     // Catch:{ all -> 0x00fd }
            long r5 = r2.length()     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f11060b     // Catch:{ all -> 0x00fd }
            r10[r1] = r5     // Catch:{ all -> 0x00fd }
            long r7 = r9.f11035h     // Catch:{ all -> 0x00fd }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f11035h = r7     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x0073:
            m15335a(r10)     // Catch:{ all -> 0x00fd }
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0079:
            int r10 = r9.f11038k     // Catch:{ all -> 0x00fd }
            r1 = 1
            int r10 = r10 + r1
            r9.f11038k = r10     // Catch:{ all -> 0x00fd }
            r10 = 0
            r0.f11062d = r10     // Catch:{ all -> 0x00fd }
            boolean r10 = r0.f11061c     // Catch:{ all -> 0x00fd }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b9
            r0.f11061c = r1     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f11036i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.f11059a     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.mo15562a()     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f11039l     // Catch:{ all -> 0x00fd }
            r1 = 1
            long r1 = r1 + r10
            r9.f11039l = r1     // Catch:{ all -> 0x00fd }
            r0.f11063e = r10     // Catch:{ all -> 0x00fd }
            goto L_0x00db
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, f.a.g0> r10 = r9.f11037j     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.f11059a     // Catch:{ all -> 0x00fd }
            r10.remove(r11)     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f11036i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.f11059a     // Catch:{ all -> 0x00fd }
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r11)     // Catch:{ all -> 0x00fd }
        L_0x00db:
            java.io.Writer r10 = r9.f11036i     // Catch:{ all -> 0x00fd }
            r10.flush()     // Catch:{ all -> 0x00fd }
            long r10 = r9.f11035h     // Catch:{ all -> 0x00fd }
            long r0 = r9.f11033f     // Catch:{ all -> 0x00fd }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ee
            boolean r10 = r9.m15348g()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f11040m     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f11041n     // Catch:{ all -> 0x00fd }
            r10.submit(r11)     // Catch:{ all -> 0x00fd }
        L_0x00f5:
            monitor-exit(r9)
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            r10.<init>()     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4439f0.m15333a(f.a.f0$c, boolean):void");
    }

    /* renamed from: a */
    public synchronized void mo15533a() {
        if (this.f11036i != null) {
            Iterator it = new ArrayList(this.f11037j.values()).iterator();
            while (it.hasNext()) {
                C4452g0 g0Var = (C4452g0) it.next();
                if (g0Var.f11062d != null) {
                    g0Var.f11062d.mo15542b();
                }
            }
            m15350i();
            this.f11036i.close();
            this.f11036i = null;
        }
    }
}
