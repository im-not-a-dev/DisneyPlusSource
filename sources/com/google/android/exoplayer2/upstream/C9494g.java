package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.g */
/* compiled from: AssetDataSource */
public final class C9494g extends C9497h {

    /* renamed from: e */
    private final AssetManager f22102e;

    /* renamed from: f */
    private Uri f22103f;

    /* renamed from: g */
    private InputStream f22104g;

    /* renamed from: h */
    private long f22105h;

    /* renamed from: i */
    private boolean f22106i;

    /* renamed from: com.google.android.exoplayer2.upstream.g$a */
    /* compiled from: AssetDataSource */
    public static final class C9495a extends IOException {
        public C9495a(IOException iOException) {
            super(iOException);
        }
    }

    public C9494g(Context context) {
        super(false);
        this.f22102e = context.getAssets();
    }

    public void close() throws C9495a {
        this.f22103f = null;
        try {
            if (this.f22104g != null) {
                this.f22104g.close();
            }
            this.f22104g = null;
            if (this.f22106i) {
                this.f22106i = false;
                mo24568b();
            }
        } catch (IOException e) {
            throw new C9495a(e);
        } catch (Throwable th) {
            this.f22104g = null;
            if (this.f22106i) {
                this.f22106i = false;
                mo24568b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        return this.f22103f;
    }

    public long open(DataSpec dataSpec) throws C9495a {
        try {
            this.f22103f = dataSpec.f21938a;
            String path = this.f22103f.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo24567a(dataSpec);
            this.f22104g = this.f22102e.open(path, 1);
            if (this.f22104g.skip(dataSpec.f21942e) >= dataSpec.f21942e) {
                if (dataSpec.f21943f != -1) {
                    this.f22105h = dataSpec.f21943f;
                } else {
                    this.f22105h = (long) this.f22104g.available();
                    if (this.f22105h == 2147483647L) {
                        this.f22105h = -1;
                    }
                }
                this.f22106i = true;
                mo24569b(dataSpec);
                return this.f22105h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C9495a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9495a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22105h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C9495a(e);
            }
        }
        int read = this.f22104g.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f22105h;
            if (j2 != -1) {
                this.f22105h = j2 - ((long) read);
            }
            mo24566a(read);
            return read;
        } else if (this.f22105h == -1) {
            return -1;
        } else {
            throw new C9495a(new EOFException());
        }
    }
}
