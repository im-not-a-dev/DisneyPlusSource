package okhttp3;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.p688d0.C14126e;
import okio.Buffer;
import okio.BufferedSource;

/* renamed from: okhttp3.y */
/* compiled from: ResponseBody */
public abstract class C14264y implements Closeable {

    /* renamed from: okhttp3.y$a */
    /* compiled from: ResponseBody */
    class C14265a extends C14264y {

        /* renamed from: U */
        final /* synthetic */ long f31840U;

        /* renamed from: V */
        final /* synthetic */ BufferedSource f31841V;

        /* renamed from: c */
        final /* synthetic */ C14258u f31842c;

        C14265a(C14258u uVar, long j, BufferedSource bufferedSource) {
            this.f31842c = uVar;
            this.f31840U = j;
            this.f31841V = bufferedSource;
        }

        /* renamed from: b */
        public long mo35701b() {
            return this.f31840U;
        }

        /* renamed from: c */
        public C14258u mo35702c() {
            return this.f31842c;
        }

        /* renamed from: d */
        public BufferedSource mo35703d() {
            return this.f31841V;
        }
    }

    /* renamed from: f */
    private Charset m45515f() {
        C14258u c = mo35702c();
        return c != null ? c.mo36261a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    /* renamed from: a */
    public final InputStream mo36277a() {
        return mo35703d().mo36334g0();
    }

    /* renamed from: b */
    public abstract long mo35701b();

    /* renamed from: c */
    public abstract C14258u mo35702c();

    public void close() {
        C14126e.m44830a((Closeable) mo35703d());
    }

    /* renamed from: d */
    public abstract BufferedSource mo35703d();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        m45514a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r2 = move-exception;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo36279e() throws java.io.IOException {
        /*
            r3 = this;
            okio.BufferedSource r0 = r3.mo35703d()
            java.nio.charset.Charset r1 = r3.m45515f()     // Catch:{ all -> 0x0017 }
            java.nio.charset.Charset r1 = okhttp3.p688d0.C14126e.m44822a(r0, r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r0.mo36300a(r1)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0016
            r2 = 0
            m45514a(r2, r0)
        L_0x0016:
            return r1
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            if (r0 == 0) goto L_0x001f
            m45514a(r1, r0)
        L_0x001f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C14264y.mo36279e():java.lang.String");
    }

    /* renamed from: a */
    private static /* synthetic */ void m45514a(Throwable th, AutoCloseable autoCloseable) {
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

    /* renamed from: a */
    public static C14264y m45513a(C14258u uVar, byte[] bArr) {
        return m45512a(uVar, (long) bArr.length, new Buffer().write(bArr));
    }

    /* renamed from: a */
    public static C14264y m45512a(C14258u uVar, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C14265a(uVar, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }
}
