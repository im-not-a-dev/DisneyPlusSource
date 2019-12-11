package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.p393v0.C9530b0;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.upstream.C9504k;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.Cache.C9457a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.exoplayer2.upstream.cache.b */
/* compiled from: CacheDataSink */
public final class C9460b implements C9504k {

    /* renamed from: a */
    private final Cache f21981a;

    /* renamed from: b */
    private final long f21982b;

    /* renamed from: c */
    private final int f21983c;

    /* renamed from: d */
    private DataSpec f21984d;

    /* renamed from: e */
    private long f21985e;

    /* renamed from: f */
    private File f21986f;

    /* renamed from: g */
    private OutputStream f21987g;

    /* renamed from: h */
    private FileOutputStream f21988h;

    /* renamed from: i */
    private long f21989i;

    /* renamed from: j */
    private long f21990j;

    /* renamed from: k */
    private C9530b0 f21991k;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.b$a */
    /* compiled from: CacheDataSink */
    public static class C9461a extends C9457a {
        public C9461a(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public C9460b(Cache cache, long j, int i) {
        Assertions.m29302b(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (i2 != 0 && j < 2097152) {
            Log.m29500d("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        Assertions.checkNotNull(cache);
        this.f21981a = cache;
        if (i2 == 0) {
            j = Long.MAX_VALUE;
        }
        this.f21982b = j;
        this.f21983c = i;
    }

    /* renamed from: a */
    private void m29008a() throws IOException {
        OutputStream outputStream = this.f21987g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                Util.m29406a((Closeable) this.f21987g);
                this.f21987g = null;
                File file = this.f21986f;
                this.f21986f = null;
                this.f21981a.mo24480a(file, this.f21989i);
            } catch (Throwable th) {
                Util.m29406a((Closeable) this.f21987g);
                this.f21987g = null;
                File file2 = this.f21986f;
                this.f21986f = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m29009b() throws IOException {
        long j = this.f21984d.f21943f;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.f21990j, this.f21985e);
        }
        long j3 = j2;
        Cache cache = this.f21981a;
        DataSpec dataSpec = this.f21984d;
        this.f21986f = cache.mo24477a(dataSpec.f21944g, dataSpec.f21941d + this.f21990j, j3);
        this.f21988h = new FileOutputStream(this.f21986f);
        int i = this.f21983c;
        if (i > 0) {
            C9530b0 b0Var = this.f21991k;
            if (b0Var == null) {
                this.f21991k = new C9530b0(this.f21988h, i);
            } else {
                b0Var.mo24595a(this.f21988h);
            }
            this.f21987g = this.f21991k;
        } else {
            this.f21987g = this.f21988h;
        }
        this.f21989i = 0;
    }

    public void close() throws C9461a {
        if (this.f21984d != null) {
            try {
                m29008a();
            } catch (IOException e) {
                throw new C9461a(e);
            }
        }
    }

    public void open(DataSpec dataSpec) throws C9461a {
        if (dataSpec.f21943f != -1 || !dataSpec.mo24452a(4)) {
            this.f21984d = dataSpec;
            this.f21985e = dataSpec.mo24452a(8) ? this.f21982b : Long.MAX_VALUE;
            this.f21990j = 0;
            try {
                m29009b();
            } catch (IOException e) {
                throw new C9461a(e);
            }
        } else {
            this.f21984d = null;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws C9461a {
        if (this.f21984d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f21989i == this.f21985e) {
                        m29008a();
                        m29009b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f21985e - this.f21989i);
                    this.f21987g.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f21989i += j;
                    this.f21990j += j;
                } catch (IOException e) {
                    throw new C9461a(e);
                }
            }
        }
    }
}
