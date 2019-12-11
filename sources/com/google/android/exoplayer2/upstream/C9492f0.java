package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.f0 */
/* compiled from: RawResourceDataSource */
public final class C9492f0 extends C9497h {

    /* renamed from: e */
    private final Resources f22096e;

    /* renamed from: f */
    private Uri f22097f;

    /* renamed from: g */
    private AssetFileDescriptor f22098g;

    /* renamed from: h */
    private InputStream f22099h;

    /* renamed from: i */
    private long f22100i;

    /* renamed from: j */
    private boolean f22101j;

    /* renamed from: com.google.android.exoplayer2.upstream.f0$a */
    /* compiled from: RawResourceDataSource */
    public static class C9493a extends IOException {
        public C9493a(String str) {
            super(str);
        }

        public C9493a(IOException iOException) {
            super(iOException);
        }
    }

    public C9492f0(Context context) {
        super(false);
        this.f22096e = context.getResources();
    }

    public void close() throws C9493a {
        this.f22097f = null;
        try {
            if (this.f22099h != null) {
                this.f22099h.close();
            }
            this.f22099h = null;
            try {
                if (this.f22098g != null) {
                    this.f22098g.close();
                }
                this.f22098g = null;
                if (this.f22101j) {
                    this.f22101j = false;
                    mo24568b();
                }
            } catch (IOException e) {
                throw new C9493a(e);
            } catch (Throwable th) {
                this.f22098g = null;
                if (this.f22101j) {
                    this.f22101j = false;
                    mo24568b();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C9493a(e2);
        } catch (Throwable th2) {
            this.f22099h = null;
            try {
                if (this.f22098g != null) {
                    this.f22098g.close();
                }
                this.f22098g = null;
                if (this.f22101j) {
                    this.f22101j = false;
                    mo24568b();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C9493a(e3);
            } catch (Throwable th3) {
                this.f22098g = null;
                if (this.f22101j) {
                    this.f22101j = false;
                    mo24568b();
                }
                throw th3;
            }
        }
    }

    public Uri getUri() {
        return this.f22097f;
    }

    public long open(DataSpec dataSpec) throws C9493a {
        try {
            this.f22097f = dataSpec.f21938a;
            if (TextUtils.equals("rawresource", this.f22097f.getScheme())) {
                int parseInt = Integer.parseInt(this.f22097f.getLastPathSegment());
                mo24567a(dataSpec);
                this.f22098g = this.f22096e.openRawResourceFd(parseInt);
                this.f22099h = new FileInputStream(this.f22098g.getFileDescriptor());
                this.f22099h.skip(this.f22098g.getStartOffset());
                if (this.f22099h.skip(dataSpec.f21942e) >= dataSpec.f21942e) {
                    long j = -1;
                    if (dataSpec.f21943f != -1) {
                        this.f22100i = dataSpec.f21943f;
                    } else {
                        long length = this.f22098g.getLength();
                        if (length != -1) {
                            j = length - dataSpec.f21942e;
                        }
                        this.f22100i = j;
                    }
                    this.f22101j = true;
                    mo24569b(dataSpec);
                    return this.f22100i;
                }
                throw new EOFException();
            }
            throw new C9493a("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new C9493a("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new C9493a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9493a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22100i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C9493a(e);
            }
        }
        int read = this.f22099h.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f22100i;
            if (j2 != -1) {
                this.f22100i = j2 - ((long) read);
            }
            mo24566a(read);
            return read;
        } else if (this.f22100i == -1) {
            return -1;
        } else {
            throw new C9493a((IOException) new EOFException());
        }
    }
}
