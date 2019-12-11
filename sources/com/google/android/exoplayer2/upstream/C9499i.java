package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.exoplayer2.upstream.i */
/* compiled from: ContentDataSource */
public final class C9499i extends C9497h {

    /* renamed from: e */
    private final ContentResolver f22119e;

    /* renamed from: f */
    private Uri f22120f;

    /* renamed from: g */
    private AssetFileDescriptor f22121g;

    /* renamed from: h */
    private FileInputStream f22122h;

    /* renamed from: i */
    private long f22123i;

    /* renamed from: j */
    private boolean f22124j;

    /* renamed from: com.google.android.exoplayer2.upstream.i$a */
    /* compiled from: ContentDataSource */
    public static class C9500a extends IOException {
        public C9500a(IOException iOException) {
            super(iOException);
        }
    }

    public C9499i(Context context) {
        super(false);
        this.f22119e = context.getContentResolver();
    }

    public void close() throws C9500a {
        this.f22120f = null;
        try {
            if (this.f22122h != null) {
                this.f22122h.close();
            }
            this.f22122h = null;
            try {
                if (this.f22121g != null) {
                    this.f22121g.close();
                }
                this.f22121g = null;
                if (this.f22124j) {
                    this.f22124j = false;
                    mo24568b();
                }
            } catch (IOException e) {
                throw new C9500a(e);
            } catch (Throwable th) {
                this.f22121g = null;
                if (this.f22124j) {
                    this.f22124j = false;
                    mo24568b();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C9500a(e2);
        } catch (Throwable th2) {
            this.f22122h = null;
            try {
                if (this.f22121g != null) {
                    this.f22121g.close();
                }
                this.f22121g = null;
                if (this.f22124j) {
                    this.f22124j = false;
                    mo24568b();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C9500a(e3);
            } catch (Throwable th3) {
                this.f22121g = null;
                if (this.f22124j) {
                    this.f22124j = false;
                    mo24568b();
                }
                throw th3;
            }
        }
    }

    public Uri getUri() {
        return this.f22120f;
    }

    public long open(DataSpec dataSpec) throws C9500a {
        try {
            this.f22120f = dataSpec.f21938a;
            mo24567a(dataSpec);
            this.f22121g = this.f22119e.openAssetFileDescriptor(this.f22120f, "r");
            if (this.f22121g != null) {
                this.f22122h = new FileInputStream(this.f22121g.getFileDescriptor());
                long startOffset = this.f22121g.getStartOffset();
                long skip = this.f22122h.skip(dataSpec.f21942e + startOffset) - startOffset;
                if (skip == dataSpec.f21942e) {
                    long j = -1;
                    if (dataSpec.f21943f != -1) {
                        this.f22123i = dataSpec.f21943f;
                    } else {
                        long length = this.f22121g.getLength();
                        if (length == -1) {
                            FileChannel channel = this.f22122h.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j = size - channel.position();
                            }
                            this.f22123i = j;
                        } else {
                            this.f22123i = length - skip;
                        }
                    }
                    this.f22124j = true;
                    mo24569b(dataSpec);
                    return this.f22123i;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not open file descriptor for: ");
            sb.append(this.f22120f);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new C9500a(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C9500a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22123i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C9500a(e);
            }
        }
        int read = this.f22122h.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f22123i;
            if (j2 != -1) {
                this.f22123i = j2 - ((long) read);
            }
            mo24566a(read);
            return read;
        } else if (this.f22123i == -1) {
            return -1;
        } else {
            throw new C9500a(new EOFException());
        }
    }
}
