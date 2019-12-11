package com.google.android.exoplayer2.p363r0.p365b;

import android.net.Uri;
import com.google.android.exoplayer2.C8672a0;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9574y;
import com.google.android.exoplayer2.upstream.C9497h;
import com.google.android.exoplayer2.upstream.C9507m;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9437b;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9438c;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9440e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.C14264y;
import okhttp3.CacheControl;
import okhttp3.Call.C14111a;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;

/* renamed from: com.google.android.exoplayer2.r0.b.a */
/* compiled from: OkHttpDataSource */
public class C8896a extends C9497h implements HttpDataSource {

    /* renamed from: s */
    private static final byte[] f19074s = new byte[4096];

    /* renamed from: e */
    private final C14111a f19075e;

    /* renamed from: f */
    private final C9440e f19076f = new C9440e();

    /* renamed from: g */
    private final String f19077g;

    /* renamed from: h */
    private final C9574y<String> f19078h;

    /* renamed from: i */
    private final CacheControl f19079i;

    /* renamed from: j */
    private final C9440e f19080j;

    /* renamed from: k */
    private DataSpec f19081k;

    /* renamed from: l */
    private Response f19082l;

    /* renamed from: m */
    private InputStream f19083m;

    /* renamed from: n */
    private boolean f19084n;

    /* renamed from: o */
    private long f19085o;

    /* renamed from: p */
    private long f19086p;

    /* renamed from: q */
    private long f19087q;

    /* renamed from: r */
    private long f19088r;

    static {
        C8672a0.m24990a("goog.exo.okhttp");
    }

    public C8896a(C14111a aVar, String str, C9574y<String> yVar, CacheControl cacheControl, C9440e eVar) {
        super(true);
        Assertions.checkNotNull(aVar);
        this.f19075e = aVar;
        this.f19077g = str;
        this.f19078h = yVar;
        this.f19079i = cacheControl;
        this.f19080j = eVar;
    }

    /* renamed from: c */
    private Request m26058c(DataSpec dataSpec) throws C9437b {
        long j = dataSpec.f21942e;
        long j2 = dataSpec.f21943f;
        HttpUrl e = HttpUrl.m44643e(dataSpec.f21938a.toString());
        if (e != null) {
            C14113a aVar = new C14113a();
            aVar.mo35843a(e);
            CacheControl cacheControl = this.f19079i;
            if (cacheControl != null) {
                aVar.mo35842a(cacheControl);
            }
            C9440e eVar = this.f19080j;
            if (eVar != null) {
                for (Entry entry : eVar.mo24454a().entrySet()) {
                    aVar.mo35849b((String) entry.getKey(), (String) entry.getValue());
                }
            }
            for (Entry entry2 : this.f19076f.mo24454a().entrySet()) {
                aVar.mo35849b((String) entry2.getKey(), (String) entry2.getValue());
            }
            if (!(j == 0 && j2 == -1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("bytes=");
                sb.append(j);
                sb.append("-");
                String sb2 = sb.toString();
                if (j2 != -1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append((j + j2) - 1);
                    sb2 = sb3.toString();
                }
                aVar.mo35840a("Range", sb2);
            }
            String str = this.f19077g;
            if (str != null) {
                aVar.mo35840a("User-Agent", str);
            }
            if (!dataSpec.mo24452a(1)) {
                aVar.mo35840a("Accept-Encoding", "identity");
            }
            if (dataSpec.mo24452a(2)) {
                aVar.mo35840a("Icy-MetaData", "1");
            }
            byte[] bArr = dataSpec.f21940c;
            C14262x xVar = null;
            if (bArr != null) {
                xVar = C14262x.m45502a((C14258u) null, bArr);
            } else if (dataSpec.f21939b == 2) {
                xVar = C14262x.m45502a((C14258u) null, Util.EMPTY_BYTE_ARRAY);
            }
            aVar.mo35841a(dataSpec.mo24451a(), xVar);
            return aVar.mo35846a();
        }
        throw new C9437b("Malformed URL", dataSpec, 1);
    }

    /* renamed from: d */
    private void m26060d() throws IOException {
        if (this.f19087q != this.f19085o) {
            while (true) {
                long j = this.f19087q;
                long j2 = this.f19085o;
                if (j != j2) {
                    int min = (int) Math.min(j2 - j, (long) f19074s.length);
                    InputStream inputStream = this.f19083m;
                    Util.castNonNull(inputStream);
                    int read = inputStream.read(f19074s, 0, min);
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f19087q += (long) read;
                        mo24566a(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        Response response = this.f19082l;
        return response == null ? Collections.emptyMap() : response.mo35862e().mo36249c();
    }

    public void close() throws C9437b {
        if (this.f19084n) {
            this.f19084n = false;
            mo24568b();
            m26059c();
        }
    }

    public Uri getUri() {
        Response response = this.f19082l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.mo35870m().mo35837g().toString());
    }

    public long open(DataSpec dataSpec) throws C9437b {
        this.f19081k = dataSpec;
        long j = 0;
        this.f19088r = 0;
        this.f19087q = 0;
        mo24567a(dataSpec);
        try {
            this.f19082l = this.f19075e.mo35727a(m26058c(dataSpec)).mo35726n0();
            Response response = this.f19082l;
            C14264y a = response.mo35855a();
            Assertions.checkNotNull(a);
            C14264y yVar = a;
            this.f19083m = yVar.mo36277a();
            int c = response.mo35858c();
            if (!response.mo35863f()) {
                Map c2 = response.mo35862e().mo36249c();
                m26059c();
                C9439d dVar = new C9439d(c, response.mo35864g(), c2, dataSpec);
                if (c == 416) {
                    dVar.initCause(new C9507m(0));
                }
                throw dVar;
            }
            C14258u c3 = yVar.mo35702c();
            String uVar = c3 != null ? c3.toString() : "";
            C9574y<String> yVar2 = this.f19078h;
            if (yVar2 == null || yVar2.mo24556a(uVar)) {
                if (c == 200) {
                    long j2 = dataSpec.f21942e;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                this.f19085o = j;
                long j3 = dataSpec.f21943f;
                long j4 = -1;
                if (j3 != -1) {
                    this.f19086p = j3;
                } else {
                    long b = yVar.mo35701b();
                    if (b != -1) {
                        j4 = b - this.f19085o;
                    }
                    this.f19086p = j4;
                }
                this.f19084n = true;
                mo24569b(dataSpec);
                return this.f19086p;
            }
            m26059c();
            throw new C9438c(uVar, dataSpec);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to connect to ");
            sb.append(dataSpec.f21938a);
            throw new C9437b(sb.toString(), e, dataSpec, 1);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9437b {
        try {
            m26060d();
            return m26057a(bArr, i, i2);
        } catch (IOException e) {
            DataSpec dataSpec = this.f19081k;
            Assertions.checkNotNull(dataSpec);
            throw new C9437b(e, dataSpec, 2);
        }
    }

    /* renamed from: a */
    private int m26057a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f19086p;
        if (j != -1) {
            long j2 = j - this.f19088r;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j2);
        }
        InputStream inputStream = this.f19083m;
        Util.castNonNull(inputStream);
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            this.f19088r += (long) read;
            mo24566a(read);
            return read;
        } else if (this.f19086p == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    private void m26059c() {
        Response response = this.f19082l;
        if (response != null) {
            C14264y a = response.mo35855a();
            Assertions.checkNotNull(a);
            a.close();
            this.f19082l = null;
        }
        this.f19083m = null;
    }
}
