package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9572w;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.y */
/* compiled from: IcyDataSource */
final class C9264y implements DataSource {

    /* renamed from: a */
    private final DataSource f21069a;

    /* renamed from: b */
    private final int f21070b;

    /* renamed from: c */
    private final C9265a f21071c;

    /* renamed from: d */
    private final byte[] f21072d;

    /* renamed from: e */
    private int f21073e;

    /* renamed from: com.google.android.exoplayer2.source.y$a */
    /* compiled from: IcyDataSource */
    public interface C9265a {
        /* renamed from: a */
        void mo23568a(C9572w wVar);
    }

    public C9264y(DataSource dataSource, int i, C9265a aVar) {
        Assertions.checkArgument(i > 0);
        this.f21069a = dataSource;
        this.f21070b = i;
        this.f21071c = aVar;
        this.f21072d = new byte[1];
        this.f21073e = i;
    }

    /* renamed from: b */
    private boolean m28001b() throws IOException {
        if (this.f21069a.read(this.f21072d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f21072d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f21069a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f21071c.mo23568a(new C9572w(bArr, i));
        }
        return true;
    }

    /* renamed from: a */
    public Map<String, List<String>> mo9243a() {
        return this.f21069a.mo9243a();
    }

    public void addTransferListener(TransferListener transferListener) {
        this.f21069a.addTransferListener(transferListener);
    }

    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    public Uri getUri() {
        return this.f21069a.getUri();
    }

    public long open(DataSpec dataSpec) throws IOException {
        throw new UnsupportedOperationException();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21073e == 0) {
            if (!m28001b()) {
                return -1;
            }
            this.f21073e = this.f21070b;
        }
        int read = this.f21069a.read(bArr, i, Math.min(this.f21073e, i2));
        if (read != -1) {
            this.f21073e -= read;
        }
        return read;
    }
}
