package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.exoplayer2.upstream.w */
/* compiled from: FileDataSource */
public final class C9520w extends C9497h {

    /* renamed from: e */
    private RandomAccessFile f22220e;

    /* renamed from: f */
    private Uri f22221f;

    /* renamed from: g */
    private long f22222g;

    /* renamed from: h */
    private boolean f22223h;

    /* renamed from: com.google.android.exoplayer2.upstream.w$a */
    /* compiled from: FileDataSource */
    public static class C9521a extends IOException {
        public C9521a(IOException iOException) {
            super(iOException);
        }
    }

    public C9520w() {
        super(false);
    }

    public void close() throws C9521a {
        this.f22221f = null;
        try {
            if (this.f22220e != null) {
                this.f22220e.close();
            }
            this.f22220e = null;
            if (this.f22223h) {
                this.f22223h = false;
                mo24568b();
            }
        } catch (IOException e) {
            throw new C9521a(e);
        } catch (Throwable th) {
            this.f22220e = null;
            if (this.f22223h) {
                this.f22223h = false;
                mo24568b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f22221f;
    }

    public long open(DataSpec dataSpec) throws C9521a {
        try {
            this.f22221f = dataSpec.f21938a;
            mo24567a(dataSpec);
            this.f22220e = new RandomAccessFile(dataSpec.f21938a.getPath(), "r");
            this.f22220e.seek(dataSpec.f21942e);
            this.f22222g = dataSpec.f21943f == -1 ? this.f22220e.length() - dataSpec.f21942e : dataSpec.f21943f;
            if (this.f22222g >= 0) {
                this.f22223h = true;
                mo24569b(dataSpec);
                return this.f22222g;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C9521a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9521a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22222g;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f22220e.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f22222g -= (long) read;
                mo24566a(read);
            }
            return read;
        } catch (IOException e) {
            throw new C9521a(e);
        }
    }
}
