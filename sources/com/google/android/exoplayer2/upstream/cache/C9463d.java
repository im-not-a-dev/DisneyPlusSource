package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.upstream.C9498h0;
import com.google.android.exoplayer2.upstream.C9504k;
import com.google.android.exoplayer2.upstream.C9507m;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache.C9457a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.cache.d */
/* compiled from: CacheDataSource */
public final class C9463d implements DataSource {

    /* renamed from: a */
    private final Cache f21995a;

    /* renamed from: b */
    private final DataSource f21996b;

    /* renamed from: c */
    private final DataSource f21997c;

    /* renamed from: d */
    private final DataSource f21998d;

    /* renamed from: e */
    private final C9469i f21999e;

    /* renamed from: f */
    private final C9464a f22000f;

    /* renamed from: g */
    private final boolean f22001g;

    /* renamed from: h */
    private final boolean f22002h;

    /* renamed from: i */
    private final boolean f22003i;

    /* renamed from: j */
    private DataSource f22004j;

    /* renamed from: k */
    private boolean f22005k;

    /* renamed from: l */
    private Uri f22006l;

    /* renamed from: m */
    private Uri f22007m;

    /* renamed from: n */
    private int f22008n;

    /* renamed from: o */
    private int f22009o;

    /* renamed from: p */
    private String f22010p;

    /* renamed from: q */
    private long f22011q;

    /* renamed from: r */
    private long f22012r;

    /* renamed from: s */
    private C9470j f22013s;

    /* renamed from: t */
    private boolean f22014t;

    /* renamed from: u */
    private boolean f22015u;

    /* renamed from: v */
    private long f22016v;

    /* renamed from: w */
    private long f22017w;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.d$a */
    /* compiled from: CacheDataSource */
    public interface C9464a {
        /* renamed from: a */
        void mo24493a(int i);

        /* renamed from: a */
        void mo24494a(long j, long j2);
    }

    public C9463d(Cache cache, DataSource dataSource, DataSource dataSource2, C9504k kVar, int i, C9464a aVar, C9469i iVar) {
        this.f21995a = cache;
        this.f21996b = dataSource2;
        if (iVar == null) {
            iVar = C9471k.f22036a;
        }
        this.f21999e = iVar;
        boolean z = false;
        this.f22001g = (i & 1) != 0;
        this.f22002h = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = true;
        }
        this.f22003i = z;
        this.f21998d = dataSource;
        if (kVar != null) {
            this.f21997c = new C9498h0(dataSource, kVar);
        } else {
            this.f21997c = null;
        }
        this.f22000f = aVar;
    }

    /* renamed from: b */
    private void m29016b() throws IOException {
        DataSource dataSource = this.f22004j;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f22004j = null;
                this.f22005k = false;
                C9470j jVar = this.f22013s;
                if (jVar != null) {
                    this.f21995a.mo24479a(jVar);
                    this.f22013s = null;
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m29017c() {
        return this.f22004j == this.f21998d;
    }

    /* renamed from: d */
    private boolean m29018d() {
        return this.f22004j == this.f21996b;
    }

    /* renamed from: e */
    private boolean m29019e() {
        return !m29018d();
    }

    /* renamed from: f */
    private boolean m29020f() {
        return this.f22004j == this.f21997c;
    }

    /* renamed from: g */
    private void m29021g() {
        C9464a aVar = this.f22000f;
        if (aVar != null && this.f22016v > 0) {
            aVar.mo24494a(this.f21995a.mo24482b(), this.f22016v);
            this.f22016v = 0;
        }
    }

    /* renamed from: h */
    private void m29022h() throws IOException {
        this.f22012r = 0;
        if (m29020f()) {
            C9481p pVar = new C9481p();
            C9481p.m29130a(pVar, this.f22011q);
            this.f21995a.mo24481a(this.f22010p, pVar);
        }
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        if (m29019e()) {
            return this.f21998d.mo9243a();
        }
        return Collections.emptyMap();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f21996b.addTransferListener(transferListener);
        this.f21998d.addTransferListener(transferListener);
    }

    public void close() throws IOException {
        this.f22006l = null;
        this.f22007m = null;
        this.f22008n = 1;
        m29021g();
        try {
            m29016b();
        } catch (Throwable th) {
            m29014a(th);
            throw th;
        }
    }

    public Uri getUri() {
        return this.f22007m;
    }

    public long open(DataSpec dataSpec) throws IOException {
        try {
            this.f22010p = this.f21999e.mo24488a(dataSpec);
            this.f22006l = dataSpec.f21938a;
            this.f22007m = m29012a(this.f21995a, this.f22010p, this.f22006l);
            this.f22008n = dataSpec.f21939b;
            this.f22009o = dataSpec.f21945h;
            this.f22011q = dataSpec.f21942e;
            int a = m29011a(dataSpec);
            this.f22015u = a != -1;
            if (this.f22015u) {
                m29013a(a);
            }
            if (dataSpec.f21943f == -1) {
                if (!this.f22015u) {
                    this.f22012r = C9479n.m29126a(this.f21995a.mo24476a(this.f22010p));
                    if (this.f22012r != -1) {
                        this.f22012r -= dataSpec.f21942e;
                        if (this.f22012r <= 0) {
                            throw new C9507m(0);
                        }
                    }
                    m29015a(false);
                    return this.f22012r;
                }
            }
            this.f22012r = dataSpec.f21943f;
            m29015a(false);
            return this.f22012r;
        } catch (Throwable th) {
            m29014a(th);
            throw th;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f22012r == 0) {
            return -1;
        }
        try {
            if (this.f22011q >= this.f22017w) {
                m29015a(true);
            }
            int read = this.f22004j.read(bArr, i, i2);
            if (read != -1) {
                if (m29018d()) {
                    this.f22016v += (long) read;
                }
                long j = (long) read;
                this.f22011q += j;
                if (this.f22012r != -1) {
                    this.f22012r -= j;
                }
            } else if (this.f22005k) {
                m29022h();
            } else {
                if (this.f22012r <= 0) {
                    if (this.f22012r == -1) {
                    }
                }
                m29016b();
                m29015a(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (!this.f22005k || !C9471k.m29052a(e)) {
                m29014a((Throwable) e);
                throw e;
            }
            m29022h();
            return -1;
        } catch (Throwable th) {
            m29014a(th);
            throw th;
        }
    }

    /* renamed from: a */
    private void m29015a(boolean z) throws IOException {
        C9470j jVar;
        DataSource dataSource;
        C9470j jVar2;
        DataSpec dataSpec;
        long j;
        DataSpec dataSpec2;
        Uri uri = null;
        if (this.f22015u) {
            jVar = null;
        } else if (this.f22001g) {
            try {
                jVar = this.f21995a.mo24475a(this.f22010p, this.f22011q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            jVar = this.f21995a.mo24484b(this.f22010p, this.f22011q);
        }
        if (jVar == null) {
            DataSource dataSource2 = this.f21998d;
            Uri uri2 = this.f22006l;
            int i = this.f22008n;
            long j2 = this.f22011q;
            DataSpec dataSpec3 = new DataSpec(uri2, i, null, j2, j2, this.f22012r, this.f22010p, this.f22009o);
            dataSource = dataSource2;
            jVar2 = jVar;
            dataSpec = dataSpec3;
        } else {
            if (jVar.f22032W) {
                Uri fromFile = Uri.fromFile(jVar.f22033X);
                long j3 = this.f22011q - jVar.f22030U;
                long j4 = jVar.f22031V - j3;
                long j5 = this.f22012r;
                if (j5 != -1) {
                    j4 = Math.min(j4, j5);
                }
                dataSpec2 = new DataSpec(fromFile, this.f22011q, j3, j4, this.f22010p, this.f22009o);
                dataSource = this.f21996b;
            } else {
                if (jVar.mo24505b()) {
                    j = this.f22012r;
                } else {
                    j = jVar.f22031V;
                    long j6 = this.f22012r;
                    if (j6 != -1) {
                        j = Math.min(j, j6);
                    }
                }
                long j7 = j;
                Uri uri3 = this.f22006l;
                int i2 = this.f22008n;
                long j8 = this.f22011q;
                dataSpec2 = new DataSpec(uri3, i2, null, j8, j8, j7, this.f22010p, this.f22009o);
                dataSource = this.f21997c;
                if (dataSource == null) {
                    dataSource = this.f21998d;
                    this.f21995a.mo24479a(jVar);
                    dataSpec = dataSpec2;
                    jVar2 = null;
                }
            }
            DataSpec dataSpec4 = dataSpec2;
            jVar2 = jVar;
            dataSpec = dataSpec4;
        }
        this.f22017w = (this.f22015u || dataSource != this.f21998d) ? Long.MAX_VALUE : this.f22011q + 102400;
        if (z) {
            Assertions.checkState(m29017c());
            if (dataSource != this.f21998d) {
                try {
                    m29016b();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (jVar2.mo24504a()) {
                        this.f21995a.mo24479a(jVar2);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (jVar2 != null && jVar2.mo24504a()) {
            this.f22013s = jVar2;
        }
        this.f22004j = dataSource;
        this.f22005k = dataSpec.f21943f == -1;
        long open = dataSource.open(dataSpec);
        C9481p pVar = new C9481p();
        if (this.f22005k && open != -1) {
            this.f22012r = open;
            C9481p.m29130a(pVar, this.f22011q + this.f22012r);
        }
        if (m29019e()) {
            this.f22007m = this.f22004j.getUri();
            if (!this.f22006l.equals(this.f22007m)) {
                uri = this.f22007m;
            }
            C9481p.m29131a(pVar, uri);
        }
        if (m29020f()) {
            this.f21995a.mo24481a(this.f22010p, pVar);
        }
    }

    /* renamed from: a */
    private static Uri m29012a(Cache cache, String str, Uri uri) {
        Uri b = C9479n.m29127b(cache.mo24476a(str));
        return b != null ? b : uri;
    }

    /* renamed from: a */
    private void m29014a(Throwable th) {
        if (m29018d() || (th instanceof C9457a)) {
            this.f22014t = true;
        }
    }

    /* renamed from: a */
    private int m29011a(DataSpec dataSpec) {
        if (!this.f22002h || !this.f22014t) {
            return (!this.f22003i || dataSpec.f21943f != -1) ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: a */
    private void m29013a(int i) {
        C9464a aVar = this.f22000f;
        if (aVar != null) {
            aVar.mo24493a(i);
        }
    }
}
