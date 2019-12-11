package okhttp3.p688d0.p693k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import okhttp3.C14256t;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14274d;
import okio.C14300v;
import okio.C14302x;
import okio.C14303y;

/* renamed from: okhttp3.d0.k.i */
/* compiled from: Http2Stream */
public final class C14204i {

    /* renamed from: a */
    long f31656a = 0;

    /* renamed from: b */
    long f31657b;

    /* renamed from: c */
    final int f31658c;

    /* renamed from: d */
    final C14185f f31659d;

    /* renamed from: e */
    private final Deque<C14256t> f31660e = new ArrayDeque();

    /* renamed from: f */
    private boolean f31661f;

    /* renamed from: g */
    private final C14206b f31662g;

    /* renamed from: h */
    final C14205a f31663h;

    /* renamed from: i */
    final C14207c f31664i = new C14207c();

    /* renamed from: j */
    final C14207c f31665j = new C14207c();

    /* renamed from: k */
    C14179b f31666k;

    /* renamed from: l */
    IOException f31667l;

    /* renamed from: okhttp3.d0.k.i$a */
    /* compiled from: Http2Stream */
    final class C14205a implements C14300v {

        /* renamed from: U */
        private C14256t f31668U;

        /* renamed from: V */
        boolean f31669V;

        /* renamed from: W */
        boolean f31670W;

        /* renamed from: c */
        private final Buffer f31672c = new Buffer();

        C14205a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m45235a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (C14204i.this) {
                C14204i.this.f31665j.mo36405g();
                while (C14204i.this.f31657b <= 0 && !this.f31670W && !this.f31669V && C14204i.this.f31666k == null) {
                    try {
                        C14204i.this.mo36086j();
                    } catch (Throwable th) {
                        C14204i.this.f31665j.mo36090m();
                        throw th;
                    }
                }
                C14204i.this.f31665j.mo36090m();
                C14204i.this.mo36077b();
                min = Math.min(C14204i.this.f31657b, this.f31672c.mo36335h());
                C14204i.this.f31657b -= min;
            }
            C14204i.this.f31665j.mo36405g();
            if (z) {
                try {
                    if (min == this.f31672c.mo36335h()) {
                        z2 = true;
                        C14204i.this.f31659d.mo36037a(C14204i.this.f31658c, z2, this.f31672c, min);
                        C14204i.this.f31665j.mo36090m();
                    }
                } catch (Throwable th2) {
                    C14204i.this.f31665j.mo36090m();
                    throw th2;
                }
            }
            z2 = false;
            C14204i.this.f31659d.mo36037a(C14204i.this.f31658c, z2, this.f31672c, min);
            C14204i.this.f31665j.mo36090m();
        }

        /* renamed from: X */
        public C14303y mo36019X() {
            return C14204i.this.f31665j;
        }

        /* renamed from: b */
        public void mo35927b(Buffer buffer, long j) throws IOException {
            this.f31672c.mo35927b(buffer, j);
            while (this.f31672c.mo36335h() >= 16384) {
                m45235a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f31672c.mo36335h() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.f31668U == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.f31672c.mo36335h() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            m45235a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.f31671X;
            r0.f31659d.mo36036a(r0.f31658c, true, okhttp3.p688d0.C14126e.m44824a(r8.f31668U));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.f31672c.mo36335h() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            m45235a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.f31671X;
            r0.f31659d.mo36037a(r0.f31658c, true, (okio.Buffer) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.f31671X;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.f31669V = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.f31671X.f31659d.flush();
            r8.f31671X.mo36071a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f31671X.f31663h.f31670W != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                monitor-enter(r0)
                boolean r1 = r8.f31669V     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                okhttp3.d0.k.i$a r0 = r0.f31663h
                boolean r0 = r0.f31670W
                r1 = 1
                if (r0 != 0) goto L_0x0067
                okio.Buffer r0 = r8.f31672c
                long r2 = r0.mo36335h()
                r0 = 0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                okhttp3.t r3 = r8.f31668U
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                okio.Buffer r2 = r8.f31672c
                long r2 = r2.mo36335h()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x003a
                r8.m45235a(r0)
                goto L_0x002c
            L_0x003a:
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                okhttp3.d0.k.f r2 = r0.f31659d
                int r0 = r0.f31658c
                okhttp3.t r3 = r8.f31668U
                java.util.List r3 = okhttp3.p688d0.C14126e.m44824a(r3)
                r2.mo36036a(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r2 == 0) goto L_0x005a
            L_0x004c:
                okio.Buffer r0 = r8.f31672c
                long r2 = r0.mo36335h()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.m45235a(r1)
                goto L_0x004c
            L_0x005a:
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                okhttp3.d0.k.f r2 = r0.f31659d
                int r3 = r0.f31658c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo36037a(r3, r4, r5, r6)
            L_0x0067:
                okhttp3.d0.k.i r2 = okhttp3.p688d0.p693k.C14204i.this
                monitor-enter(r2)
                r8.f31669V = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                okhttp3.d0.k.f r0 = r0.f31659d
                r0.flush()
                okhttp3.d0.k.i r0 = okhttp3.p688d0.p693k.C14204i.this
                r0.mo36071a()
                return
            L_0x007a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                throw r0
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14204i.C14205a.close():void");
        }

        public void flush() throws IOException {
            synchronized (C14204i.this) {
                C14204i.this.mo36077b();
            }
            while (this.f31672c.mo36335h() > 0) {
                m45235a(false);
                C14204i.this.f31659d.flush();
            }
        }
    }

    /* renamed from: okhttp3.d0.k.i$b */
    /* compiled from: Http2Stream */
    private final class C14206b implements C14302x {

        /* renamed from: U */
        private final Buffer f31673U = new Buffer();

        /* renamed from: V */
        private final long f31674V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public C14256t f31675W;

        /* renamed from: X */
        boolean f31676X;

        /* renamed from: Y */
        boolean f31677Y;

        /* renamed from: c */
        private final Buffer f31679c = new Buffer();

        C14206b(long j) {
            this.f31674V = j;
        }

        /* renamed from: X */
        public C14303y mo35898X() {
            return C14204i.this.f31664i;
        }

        public void close() throws IOException {
            long h;
            synchronized (C14204i.this) {
                this.f31676X = true;
                h = this.f31673U.mo36335h();
                this.f31673U.mo36308a();
                C14204i.this.notifyAll();
            }
            if (h > 0) {
                m45239a(h);
            }
            C14204i.this.mo36071a();
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            Throwable th;
            long a;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (C14204i.this) {
                        C14204i.this.f31664i.mo36405g();
                        try {
                            if (C14204i.this.f31666k != null) {
                                if (C14204i.this.f31667l != null) {
                                    th = C14204i.this.f31667l;
                                } else {
                                    th = new C14214n(C14204i.this.f31666k);
                                }
                            }
                            if (this.f31676X) {
                                throw new IOException("stream closed");
                            } else if (this.f31673U.mo36335h() > 0) {
                                a = this.f31673U.mo35899a(buffer, Math.min(j, this.f31673U.mo36335h()));
                                C14204i.this.f31656a += a;
                                if (th == null && C14204i.this.f31656a >= ((long) (C14204i.this.f31659d.f31589g0.mo36119c() / 2))) {
                                    C14204i.this.f31659d.mo36046b(C14204i.this.f31658c, C14204i.this.f31656a);
                                    C14204i.this.f31656a = 0;
                                }
                            } else if (this.f31677Y || th != null) {
                                a = -1;
                            } else {
                                C14204i.this.mo36086j();
                            }
                        } finally {
                            C14204i.this.f31664i.mo36090m();
                        }
                    }
                }
                a = -1;
                C14204i.this.f31664i.mo36090m();
                if (a != -1) {
                    m45239a(a);
                    return a;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: a */
        private void m45239a(long j) {
            C14204i.this.f31659d.mo36038a(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36088a(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C14204i.this) {
                    z = this.f31677Y;
                    z2 = true;
                    z3 = this.f31673U.mo36335h() + j > this.f31674V;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    C14204i.this.mo36073a(C14179b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long a = bufferedSource.mo35899a(this.f31679c, j);
                    if (a != -1) {
                        j -= a;
                        synchronized (C14204i.this) {
                            if (this.f31673U.mo36335h() != 0) {
                                z2 = false;
                            }
                            this.f31673U.mo36298a((C14302x) this.f31679c);
                            if (z2) {
                                C14204i.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* renamed from: okhttp3.d0.k.i$c */
    /* compiled from: Http2Stream */
    class C14207c extends C14274d {
        C14207c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo36089b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo36001i() {
            C14204i.this.mo36073a(C14179b.CANCEL);
        }

        /* renamed from: m */
        public void mo36090m() throws IOException {
            if (mo36406h()) {
                throw mo36089b(null);
            }
        }
    }

    C14204i(int i, C14185f fVar, boolean z, boolean z2, C14256t tVar) {
        if (fVar != null) {
            this.f31658c = i;
            this.f31659d = fVar;
            this.f31657b = (long) fVar.f31590h0.mo36119c();
            this.f31662g = new C14206b((long) fVar.f31589g0.mo36119c());
            this.f31663h = new C14205a();
            this.f31662g.f31677Y = z2;
            this.f31663h.f31670W = z;
            if (tVar != null) {
                this.f31660e.add(tVar);
            }
            if (mo36082f() && tVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo36082f() && tVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: b */
    private boolean m45217b(C14179b bVar, IOException iOException) {
        synchronized (this) {
            if (this.f31666k != null) {
                return false;
            }
            if (this.f31662g.f31677Y && this.f31663h.f31670W) {
                return false;
            }
            this.f31666k = bVar;
            this.f31667l = iOException;
            notifyAll();
            this.f31659d.mo36052d(this.f31658c);
            return true;
        }
    }

    /* renamed from: a */
    public void mo36074a(C14179b bVar, IOException iOException) throws IOException {
        if (m45217b(bVar, iOException)) {
            this.f31659d.mo36047b(this.f31658c, bVar);
        }
    }

    /* renamed from: c */
    public int mo36079c() {
        return this.f31658c;
    }

    /* renamed from: d */
    public C14300v mo36080d() {
        synchronized (this) {
            if (!this.f31661f) {
                if (!mo36082f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f31663h;
    }

    /* renamed from: e */
    public C14302x mo36081e() {
        return this.f31662g;
    }

    /* renamed from: f */
    public boolean mo36082f() {
        if (this.f31659d.f31584c == ((this.f31658c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public synchronized boolean mo36083g() {
        if (this.f31666k != null) {
            return false;
        }
        if ((this.f31662g.f31677Y || this.f31662g.f31676X) && ((this.f31663h.f31670W || this.f31663h.f31669V) && this.f31661f)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C14303y mo36084h() {
        return this.f31664i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public synchronized C14256t mo36085i() throws IOException {
        this.f31664i.mo36405g();
        while (this.f31660e.isEmpty() && this.f31666k == null) {
            try {
                mo36086j();
            } catch (Throwable th) {
                this.f31664i.mo36090m();
                throw th;
            }
        }
        this.f31664i.mo36090m();
        if (this.f31660e.isEmpty()) {
            throw (this.f31667l != null ? this.f31667l : new C14214n(this.f31666k));
        }
        return (C14256t) this.f31660e.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo36086j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: k */
    public C14303y mo36087k() {
        return this.f31665j;
    }

    /* renamed from: a */
    public void mo36073a(C14179b bVar) {
        if (m45217b(bVar, null)) {
            this.f31659d.mo36049c(this.f31658c, bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36076a(BufferedSource bufferedSource, int i) throws IOException {
        this.f31662g.mo36088a(bufferedSource, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36075a(okhttp3.C14256t r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f31661f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            okhttp3.d0.k.i$b r0 = r2.f31662g     // Catch:{ all -> 0x002e }
            r0.f31675W = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f31661f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<okhttp3.t> r0 = r2.f31660e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            okhttp3.d0.k.i$b r3 = r2.f31662g     // Catch:{ all -> 0x002e }
            r3.f31677Y = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.mo36083g()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            okhttp3.d0.k.f r3 = r2.f31659d
            int r4 = r2.f31658c
            r3.mo36052d(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14204i.mo36075a(okhttp3.t, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo36078b(C14179b bVar) {
        if (this.f31666k == null) {
            this.f31666k = bVar;
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36077b() throws IOException {
        C14205a aVar = this.f31663h;
        if (aVar.f31669V) {
            throw new IOException("stream closed");
        } else if (!aVar.f31670W) {
            C14179b bVar = this.f31666k;
            if (bVar != null) {
                Throwable th = this.f31667l;
                if (th == null) {
                    th = new C14214n(bVar);
                }
                throw th;
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36071a() throws IOException {
        boolean z;
        boolean g;
        synchronized (this) {
            z = !this.f31662g.f31677Y && this.f31662g.f31676X && (this.f31663h.f31670W || this.f31663h.f31669V);
            g = mo36083g();
        }
        if (z) {
            mo36074a(C14179b.CANCEL, (IOException) null);
        } else if (!g) {
            this.f31659d.mo36052d(this.f31658c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36072a(long j) {
        this.f31657b += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
