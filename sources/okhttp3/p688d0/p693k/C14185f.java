package okhttp3.p688d0.p693k;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.danlew.android.joda.DateUtils;
import okhttp3.p688d0.C14125d;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p695m.C14225e;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C14280f;

/* renamed from: okhttp3.d0.k.f */
/* compiled from: Http2Connection */
public final class C14185f implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public static final ExecutorService f31575n0;

    /* renamed from: U */
    final C14193h f31576U;

    /* renamed from: V */
    final Map<Integer, C14204i> f31577V = new LinkedHashMap();

    /* renamed from: W */
    final String f31578W;

    /* renamed from: X */
    int f31579X;

    /* renamed from: Y */
    int f31580Y;

    /* renamed from: Z */
    boolean f31581Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final ScheduledExecutorService f31582a0;

    /* renamed from: b0 */
    private final ExecutorService f31583b0;

    /* renamed from: c */
    final boolean f31584c;

    /* renamed from: c0 */
    final C14211l f31585c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public boolean f31586d0;

    /* renamed from: e0 */
    long f31587e0 = 0;

    /* renamed from: f0 */
    long f31588f0;

    /* renamed from: g0 */
    C14213m f31589g0 = new C14213m();

    /* renamed from: h0 */
    final C14213m f31590h0 = new C14213m();

    /* renamed from: i0 */
    boolean f31591i0 = false;

    /* renamed from: j0 */
    final Socket f31592j0;

    /* renamed from: k0 */
    final C14208j f31593k0;

    /* renamed from: l0 */
    final C14196j f31594l0;

    /* renamed from: m0 */
    final Set<Integer> f31595m0 = new LinkedHashSet();

    /* renamed from: okhttp3.d0.k.f$a */
    /* compiled from: Http2Connection */
    class C14186a extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31596U;

        /* renamed from: V */
        final /* synthetic */ C14179b f31597V;

        C14186a(String str, Object[] objArr, int i, C14179b bVar) {
            this.f31596U = i;
            this.f31597V = bVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            try {
                C14185f.this.mo36047b(this.f31596U, this.f31597V);
            } catch (IOException e) {
                C14185f.this.m45123a(e);
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$b */
    /* compiled from: Http2Connection */
    class C14187b extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31599U;

        /* renamed from: V */
        final /* synthetic */ long f31600V;

        C14187b(String str, Object[] objArr, int i, long j) {
            this.f31599U = i;
            this.f31600V = j;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            try {
                C14185f.this.f31593k0.mo36102b(this.f31599U, this.f31600V);
            } catch (IOException e) {
                C14185f.this.m45123a(e);
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$c */
    /* compiled from: Http2Connection */
    class C14188c extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31602U;

        /* renamed from: V */
        final /* synthetic */ List f31603V;

        C14188c(String str, Object[] objArr, int i, List list) {
            this.f31602U = i;
            this.f31603V = list;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            if (C14185f.this.f31585c0.mo36110a(this.f31602U, this.f31603V)) {
                try {
                    C14185f.this.f31593k0.mo36095a(this.f31602U, C14179b.CANCEL);
                    synchronized (C14185f.this) {
                        C14185f.this.f31595m0.remove(Integer.valueOf(this.f31602U));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$d */
    /* compiled from: Http2Connection */
    class C14189d extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31605U;

        /* renamed from: V */
        final /* synthetic */ List f31606V;

        /* renamed from: W */
        final /* synthetic */ boolean f31607W;

        C14189d(String str, Object[] objArr, int i, List list, boolean z) {
            this.f31605U = i;
            this.f31606V = list;
            this.f31607W = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            boolean a = C14185f.this.f31585c0.mo36111a(this.f31605U, this.f31606V, this.f31607W);
            if (a) {
                try {
                    C14185f.this.f31593k0.mo36095a(this.f31605U, C14179b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (a || this.f31607W) {
                synchronized (C14185f.this) {
                    C14185f.this.f31595m0.remove(Integer.valueOf(this.f31605U));
                }
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$e */
    /* compiled from: Http2Connection */
    class C14190e extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31609U;

        /* renamed from: V */
        final /* synthetic */ Buffer f31610V;

        /* renamed from: W */
        final /* synthetic */ int f31611W;

        /* renamed from: X */
        final /* synthetic */ boolean f31612X;

        C14190e(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            this.f31609U = i;
            this.f31610V = buffer;
            this.f31611W = i2;
            this.f31612X = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            try {
                boolean a = C14185f.this.f31585c0.mo36112a(this.f31609U, this.f31610V, this.f31611W, this.f31612X);
                if (a) {
                    C14185f.this.f31593k0.mo36095a(this.f31609U, C14179b.CANCEL);
                }
                if (a || this.f31612X) {
                    synchronized (C14185f.this) {
                        C14185f.this.f31595m0.remove(Integer.valueOf(this.f31609U));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$f */
    /* compiled from: Http2Connection */
    class C14191f extends C14125d {

        /* renamed from: U */
        final /* synthetic */ int f31614U;

        /* renamed from: V */
        final /* synthetic */ C14179b f31615V;

        C14191f(String str, Object[] objArr, int i, C14179b bVar) {
            this.f31614U = i;
            this.f31615V = bVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo35896b() {
            C14185f.this.f31585c0.mo36109a(this.f31614U, this.f31615V);
            synchronized (C14185f.this) {
                C14185f.this.f31595m0.remove(Integer.valueOf(this.f31614U));
            }
        }
    }

    /* renamed from: okhttp3.d0.k.f$g */
    /* compiled from: Http2Connection */
    public static class C14192g {

        /* renamed from: a */
        Socket f31617a;

        /* renamed from: b */
        String f31618b;

        /* renamed from: c */
        BufferedSource f31619c;

        /* renamed from: d */
        C14280f f31620d;

        /* renamed from: e */
        C14193h f31621e = C14193h.f31625a;

        /* renamed from: f */
        C14211l f31622f = C14211l.f31695a;

        /* renamed from: g */
        boolean f31623g;

        /* renamed from: h */
        int f31624h;

        public C14192g(boolean z) {
            this.f31623g = z;
        }

        /* renamed from: a */
        public C14192g mo36055a(Socket socket, String str, BufferedSource bufferedSource, C14280f fVar) {
            this.f31617a = socket;
            this.f31618b = str;
            this.f31619c = bufferedSource;
            this.f31620d = fVar;
            return this;
        }

        /* renamed from: a */
        public C14192g mo36056a(C14193h hVar) {
            this.f31621e = hVar;
            return this;
        }

        /* renamed from: a */
        public C14192g mo36054a(int i) {
            this.f31624h = i;
            return this;
        }

        /* renamed from: a */
        public C14185f mo36057a() {
            return new C14185f(this);
        }
    }

    /* renamed from: okhttp3.d0.k.f$h */
    /* compiled from: Http2Connection */
    public static abstract class C14193h {

        /* renamed from: a */
        public static final C14193h f31625a = new C14194a();

        /* renamed from: okhttp3.d0.k.f$h$a */
        /* compiled from: Http2Connection */
        class C14194a extends C14193h {
            C14194a() {
            }

            /* renamed from: a */
            public void mo35959a(C14204i iVar) throws IOException {
                iVar.mo36074a(C14179b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo35958a(C14185f fVar) {
        }

        /* renamed from: a */
        public abstract void mo35959a(C14204i iVar) throws IOException;
    }

    /* renamed from: okhttp3.d0.k.f$i */
    /* compiled from: Http2Connection */
    final class C14195i extends C14125d {

        /* renamed from: U */
        final boolean f31626U;

        /* renamed from: V */
        final int f31627V;

        /* renamed from: W */
        final int f31628W;

        C14195i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C14185f.this.f31578W, Integer.valueOf(i), Integer.valueOf(i2));
            this.f31626U = z;
            this.f31627V = i;
            this.f31628W = i2;
        }

        /* renamed from: b */
        public void mo35896b() {
            C14185f.this.mo36042a(this.f31626U, this.f31627V, this.f31628W);
        }
    }

    /* renamed from: okhttp3.d0.k.f$j */
    /* compiled from: Http2Connection */
    class C14196j extends C14125d implements C14203b {

        /* renamed from: U */
        final C14201h f31630U;

        /* renamed from: okhttp3.d0.k.f$j$a */
        /* compiled from: Http2Connection */
        class C14197a extends C14125d {

            /* renamed from: U */
            final /* synthetic */ C14204i f31632U;

            C14197a(String str, Object[] objArr, C14204i iVar) {
                this.f31632U = iVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo35896b() {
                try {
                    C14185f.this.f31576U.mo35959a(this.f31632U);
                } catch (IOException e) {
                    C14225e d = C14225e.m45335d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(C14185f.this.f31578W);
                    d.mo36133a(4, sb.toString(), (Throwable) e);
                    try {
                        this.f31632U.mo36074a(C14179b.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: okhttp3.d0.k.f$j$b */
        /* compiled from: Http2Connection */
        class C14198b extends C14125d {
            C14198b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo35896b() {
                C14185f fVar = C14185f.this;
                fVar.f31576U.mo35958a(fVar);
            }
        }

        /* renamed from: okhttp3.d0.k.f$j$c */
        /* compiled from: Http2Connection */
        class C14199c extends C14125d {

            /* renamed from: U */
            final /* synthetic */ C14213m f31635U;

            C14199c(String str, Object[] objArr, C14213m mVar) {
                this.f31635U = mVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo35896b() {
                try {
                    C14185f.this.f31593k0.mo36097a(this.f31635U);
                } catch (IOException e) {
                    C14185f.this.m45123a(e);
                }
            }
        }

        C14196j(C14201h hVar) {
            super("OkHttp %s", C14185f.this.f31578W);
            this.f31630U = hVar;
        }

        /* renamed from: a */
        public void mo36058a() {
        }

        /* renamed from: a */
        public void mo36059a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo36066a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (C14185f.this.mo36050c(i)) {
                C14185f.this.mo36035a(i, bufferedSource, i2, z);
                return;
            }
            C14204i b = C14185f.this.mo36045b(i);
            if (b == null) {
                C14185f.this.mo36049c(i, C14179b.PROTOCOL_ERROR);
                long j = (long) i2;
                C14185f.this.mo36038a(j);
                bufferedSource.skip(j);
                return;
            }
            b.mo36076a(bufferedSource, i2);
            if (z) {
                b.mo36075a(C14126e.f31332c, true);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo35896b() {
            C14179b bVar;
            C14179b bVar2;
            C14179b bVar3 = C14179b.INTERNAL_ERROR;
            e = null;
            try {
                this.f31630U.mo36068a((C14203b) this);
                while (this.f31630U.mo36069a(false, (C14203b) this)) {
                }
                bVar = C14179b.NO_ERROR;
                try {
                    bVar2 = C14179b.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar3;
                try {
                    bVar = C14179b.PROTOCOL_ERROR;
                    bVar2 = C14179b.PROTOCOL_ERROR;
                    C14185f.this.mo36040a(bVar, bVar2, e);
                    C14126e.m44830a((Closeable) this.f31630U);
                } catch (Throwable th) {
                    th = th;
                    C14185f.this.mo36040a(bVar, bVar3, e);
                    C14126e.m44830a((Closeable) this.f31630U);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar3;
                C14185f.this.mo36040a(bVar, bVar3, e);
                C14126e.m44830a((Closeable) this.f31630U);
                throw th;
            }
            C14185f.this.mo36040a(bVar, bVar2, e);
            C14126e.m44830a((Closeable) this.f31630U);
        }

        /* renamed from: a */
        public void mo36065a(boolean z, int i, int i2, List<C14180c> list) {
            if (C14185f.this.mo36050c(i)) {
                C14185f.this.mo36033a(i, list, z);
                return;
            }
            synchronized (C14185f.this) {
                C14204i b = C14185f.this.mo36045b(i);
                if (b != null) {
                    b.mo36075a(C14126e.m44840b(list), z);
                } else if (!C14185f.this.f31581Z) {
                    if (i > C14185f.this.f31579X) {
                        if (i % 2 != C14185f.this.f31580Y % 2) {
                            int i3 = i;
                            C14204i iVar = new C14204i(i3, C14185f.this, false, z, C14126e.m44840b(list));
                            C14185f.this.f31579X = i;
                            C14185f.this.f31577V.put(Integer.valueOf(i), iVar);
                            C14185f.f31575n0.execute(new C14197a("OkHttp %s stream %d", new Object[]{C14185f.this.f31578W, Integer.valueOf(i)}, iVar));
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo36062a(int i, C14179b bVar) {
            if (C14185f.this.mo36050c(i)) {
                C14185f.this.mo36034a(i, bVar);
                return;
            }
            C14204i d = C14185f.this.mo36052d(i);
            if (d != null) {
                d.mo36078b(bVar);
            }
        }

        /* renamed from: a */
        public void mo36067a(boolean z, C14213m mVar) {
            C14204i[] iVarArr;
            long j;
            int i;
            synchronized (C14185f.this) {
                int c = C14185f.this.f31590h0.mo36119c();
                if (z) {
                    C14185f.this.f31590h0.mo36115a();
                }
                C14185f.this.f31590h0.mo36116a(mVar);
                m45164a(mVar);
                int c2 = C14185f.this.f31590h0.mo36119c();
                iVarArr = null;
                if (c2 == -1 || c2 == c) {
                    j = 0;
                } else {
                    j = (long) (c2 - c);
                    if (!C14185f.this.f31591i0) {
                        C14185f.this.f31591i0 = true;
                    }
                    if (!C14185f.this.f31577V.isEmpty()) {
                        iVarArr = (C14204i[]) C14185f.this.f31577V.values().toArray(new C14204i[C14185f.this.f31577V.size()]);
                    }
                }
                C14185f.f31575n0.execute(new C14198b("OkHttp %s settings", C14185f.this.f31578W));
            }
            if (iVarArr != null && j != 0) {
                for (C14204i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.mo36072a(j);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m45164a(C14213m mVar) {
            try {
                C14185f.this.f31582a0.execute(new C14199c("OkHttp %s ACK Settings", new Object[]{C14185f.this.f31578W}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo36064a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C14185f.this) {
                    C14185f.this.f31586d0 = false;
                    C14185f.this.notifyAll();
                }
                return;
            }
            try {
                C14185f.this.f31582a0.execute(new C14195i(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo36063a(int i, C14179b bVar, ByteString byteString) {
            C14204i[] iVarArr;
            byteString.size();
            synchronized (C14185f.this) {
                iVarArr = (C14204i[]) C14185f.this.f31577V.values().toArray(new C14204i[C14185f.this.f31577V.size()]);
                C14185f.this.f31581Z = true;
            }
            for (C14204i iVar : iVarArr) {
                if (iVar.mo36079c() > i && iVar.mo36082f()) {
                    iVar.mo36078b(C14179b.REFUSED_STREAM);
                    C14185f.this.mo36052d(iVar.mo36079c());
                }
            }
        }

        /* renamed from: a */
        public void mo36061a(int i, long j) {
            if (i == 0) {
                synchronized (C14185f.this) {
                    C14185f.this.f31588f0 += j;
                    C14185f.this.notifyAll();
                }
                return;
            }
            C14204i b = C14185f.this.mo36045b(i);
            if (b != null) {
                synchronized (b) {
                    b.mo36072a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo36060a(int i, int i2, List<C14180c> list) {
            C14185f.this.mo36032a(i2, list);
        }
    }

    static {
        Class<C14185f> cls = C14185f.class;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14126e.m44827a("OkHttp Http2Connection", true));
        f31575n0 = threadPoolExecutor;
    }

    C14185f(C14192g gVar) {
        C14192g gVar2 = gVar;
        this.f31585c0 = gVar2.f31622f;
        boolean z = gVar2.f31623g;
        this.f31584c = z;
        this.f31576U = gVar2.f31621e;
        this.f31580Y = z ? 1 : 2;
        if (gVar2.f31623g) {
            this.f31580Y += 2;
        }
        if (gVar2.f31623g) {
            this.f31589g0.mo36114a(7, 16777216);
        }
        this.f31578W = gVar2.f31618b;
        this.f31582a0 = new ScheduledThreadPoolExecutor(1, C14126e.m44827a(C14126e.m44817a("OkHttp %s Writer", this.f31578W), false));
        if (gVar2.f31624h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f31582a0;
            C14195i iVar = new C14195i(false, 0, 0);
            int i = gVar2.f31624h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14126e.m44827a(C14126e.m44817a("OkHttp %s Push Observer", this.f31578W), true));
        this.f31583b0 = threadPoolExecutor;
        this.f31590h0.mo36114a(7, 65535);
        this.f31590h0.mo36114a(5, DateUtils.FORMAT_ABBREV_TIME);
        this.f31588f0 = (long) this.f31590h0.mo36119c();
        this.f31592j0 = gVar2.f31617a;
        this.f31593k0 = new C14208j(gVar2.f31620d, this.f31584c);
        this.f31594l0 = new C14196j(new C14201h(gVar2.f31619c, this.f31584c));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized C14204i mo36045b(int i) {
        return (C14204i) this.f31577V.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36049c(int i, C14179b bVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f31582a0;
            C14186a aVar = new C14186a("OkHttp %s stream %d", new Object[]{this.f31578W, Integer.valueOf(i)}, i, bVar);
            scheduledExecutorService.execute(aVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo36050c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public void close() {
        mo36040a(C14179b.NO_ERROR, C14179b.CANCEL, (IOException) null);
    }

    public void flush() throws IOException {
        this.f31593k0.flush();
    }

    /* renamed from: b */
    public synchronized int mo36044b() {
        return this.f31590h0.mo36118b(Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public void mo36048c() throws IOException {
        mo36041a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized C14204i mo36052d(int i) {
        C14204i iVar;
        iVar = (C14204i) this.f31577V.remove(Integer.valueOf(i));
        notifyAll();
        return iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.p688d0.p693k.C14204i m45127b(int r11, java.util.List<okhttp3.p688d0.p693k.C14180c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.d0.k.j r7 = r10.f31593k0
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f31580Y     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.d0.k.b r0 = okhttp3.p688d0.p693k.C14179b.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.mo36039a(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f31581Z     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f31580Y     // Catch:{ all -> 0x0075 }
            int r0 = r10.f31580Y     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f31580Y = r0     // Catch:{ all -> 0x0075 }
            okhttp3.d0.k.i r9 = new okhttp3.d0.k.i     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.f31588f0     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f31657b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.mo36083g()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r0 = r10.f31577V     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            okhttp3.d0.k.j r11 = r10.f31593k0     // Catch:{ all -> 0x0078 }
            r11.mo36099a(r6, r8, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f31584c     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            okhttp3.d0.k.j r0 = r10.f31593k0     // Catch:{ all -> 0x0078 }
            r0.mo36094a(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            okhttp3.d0.k.j r11 = r10.f31593k0
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            okhttp3.d0.k.a r11 = new okhttp3.d0.k.a     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14185f.m45127b(int, java.util.List, boolean):okhttp3.d0.k.i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo36038a(long j) {
        this.f31587e0 += j;
        if (this.f31587e0 >= ((long) (this.f31589g0.mo36119c() / 2))) {
            mo36046b(0, this.f31587e0);
            this.f31587e0 = 0;
        }
    }

    /* renamed from: a */
    public C14204i mo36031a(List<C14180c> list, boolean z) throws IOException {
        return m45127b(0, list, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36036a(int i, boolean z, List<C14180c> list) throws IOException {
        this.f31593k0.mo36099a(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f31588f0), r8.f31593k0.mo36101b());
        r6 = (long) r3;
        r8.f31588f0 -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36037a(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.d0.k.j r12 = r8.f31593k0
            r12.mo36100a(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f31588f0     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r3 = r8.f31577V     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.f31588f0     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            okhttp3.d0.k.j r3 = r8.f31593k0     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo36101b()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f31588f0     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f31588f0 = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            okhttp3.d0.k.j r4 = r8.f31593k0
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo36100a(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14185f.mo36037a(int, boolean, okio.Buffer, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36047b(int i, C14179b bVar) throws IOException {
        this.f31593k0.mo36095a(i, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36042a(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f31586d0;
                this.f31586d0 = true;
            }
            if (z2) {
                m45123a((IOException) null);
                return;
            }
        }
        try {
            this.f31593k0.mo36098a(z, i, i2);
        } catch (IOException e) {
            m45123a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36046b(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f31582a0;
            C14187b bVar = new C14187b("OkHttp Window Update %s stream %d", new Object[]{this.f31578W, Integer.valueOf(i)}, i, j);
            scheduledExecutorService.execute(bVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: a */
    public void mo36039a(C14179b bVar) throws IOException {
        synchronized (this.f31593k0) {
            synchronized (this) {
                if (!this.f31581Z) {
                    this.f31581Z = true;
                    int i = this.f31579X;
                    this.f31593k0.mo36096a(i, bVar, C14126e.f31330a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36040a(okhttp3.p688d0.p693k.C14179b r4, okhttp3.p688d0.p693k.C14179b r5, java.io.IOException r6) {
        /*
            r3 = this;
            r3.mo36039a(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r0 = r3.f31577V     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r4 = r3.f31577V     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r0 = r3.f31577V     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            okhttp3.d0.k.i[] r0 = new okhttp3.p688d0.p693k.C14204i[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            okhttp3.d0.k.i[] r4 = (okhttp3.p688d0.p693k.C14204i[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.d0.k.i> r0 = r3.f31577V     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.mo36074a(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            okhttp3.d0.k.j r4 = r3.f31593k0     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f31592j0     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f31582a0
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.f31583b0
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14185f.mo36040a(okhttp3.d0.k.b, okhttp3.d0.k.b, java.io.IOException):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m45123a(IOException iOException) {
        C14179b bVar = C14179b.PROTOCOL_ERROR;
        mo36040a(bVar, bVar, iOException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36041a(boolean z) throws IOException {
        if (z) {
            this.f31593k0.mo36091a();
            this.f31593k0.mo36103b(this.f31589g0);
            int c = this.f31589g0.mo36119c();
            if (c != 65535) {
                this.f31593k0.mo36102b(0, (long) (c - 65535));
            }
        }
        new Thread(this.f31594l0).start();
    }

    /* renamed from: a */
    public synchronized boolean mo36043a() {
        return this.f31581Z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r8;
        r2 = new okhttp3.p688d0.p693k.C14185f.C14188c(r3, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r8.f31578W, java.lang.Integer.valueOf(r9)}, r9, r10);
        m45124a((okhttp3.p688d0.C14125d) r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36032a(int r9, java.util.List<okhttp3.p688d0.p693k.C14180c> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f31595m0     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0014
            okhttp3.d0.k.b r10 = okhttp3.p688d0.p693k.C14179b.PROTOCOL_ERROR     // Catch:{ all -> 0x003c }
            r8.mo36049c(r9, r10)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            return
        L_0x0014:
            java.util.Set<java.lang.Integer> r0 = r8.f31595m0     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            r0.add(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            okhttp3.d0.k.f$c r0 = new okhttp3.d0.k.f$c     // Catch:{ RejectedExecutionException -> 0x003b }
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 0
            java.lang.String r2 = r8.f31578W     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r2 = r0
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x003b }
            r8.m45124a(r0)     // Catch:{ RejectedExecutionException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p693k.C14185f.mo36032a(int, java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36033a(int i, List<C14180c> list, boolean z) {
        try {
            C14189d dVar = new C14189d("OkHttp %s Push Headers[%s]", new Object[]{this.f31578W, Integer.valueOf(i)}, i, list, z);
            m45124a((C14125d) dVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36035a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        Buffer buffer = new Buffer();
        long j = (long) i2;
        bufferedSource.mo36330f(j);
        bufferedSource.mo35899a(buffer, j);
        if (buffer.mo36335h() == j) {
            C14190e eVar = new C14190e("OkHttp %s Push Data[%s]", new Object[]{this.f31578W, Integer.valueOf(i)}, i, buffer, i2, z);
            m45124a((C14125d) eVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(buffer.mo36335h());
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36034a(int i, C14179b bVar) {
        C14191f fVar = new C14191f("OkHttp %s Push Reset[%s]", new Object[]{this.f31578W, Integer.valueOf(i)}, i, bVar);
        m45124a((C14125d) fVar);
    }

    /* renamed from: a */
    private synchronized void m45124a(C14125d dVar) {
        if (!mo36043a()) {
            this.f31583b0.execute(dVar);
        }
    }
}
