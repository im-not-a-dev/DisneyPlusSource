package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p393v0.Util;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.google.android.exoplayer2.upstream.j */
/* compiled from: DataSchemeDataSource */
public final class C9503j extends C9497h {

    /* renamed from: e */
    private DataSpec f22135e;

    /* renamed from: f */
    private byte[] f22136f;

    /* renamed from: g */
    private int f22137g;

    /* renamed from: h */
    private int f22138h;

    public C9503j() {
        super(false);
    }

    public void close() {
        if (this.f22136f != null) {
            this.f22136f = null;
            mo24568b();
        }
        this.f22135e = null;
    }

    public Uri getUri() {
        DataSpec dataSpec = this.f22135e;
        if (dataSpec != null) {
            return dataSpec.f21938a;
        }
        return null;
    }

    public long open(DataSpec dataSpec) throws IOException {
        mo24567a(dataSpec);
        this.f22135e = dataSpec;
        this.f22138h = (int) dataSpec.f21942e;
        Uri uri = dataSpec.f21938a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] a = Util.m29423a(uri.getSchemeSpecificPart(), ",");
            if (a.length == 2) {
                String str = a[1];
                if (a[0].contains(";base64")) {
                    try {
                        this.f22136f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while parsing Base64 encoded string: ");
                        sb.append(str);
                        throw new C8723g0(sb.toString(), e);
                    }
                } else {
                    this.f22136f = Util.m29447d(URLDecoder.decode(str, "US-ASCII"));
                }
                long j = dataSpec.f21943f;
                this.f22137g = j != -1 ? ((int) j) + this.f22138h : this.f22136f.length;
                int i = this.f22137g;
                if (i > this.f22136f.length || this.f22138h > i) {
                    this.f22136f = null;
                    throw new C9507m(0);
                }
                mo24569b(dataSpec);
                return ((long) this.f22137g) - ((long) this.f22138h);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected URI format: ");
            sb2.append(uri);
            throw new C8723g0(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unsupported scheme: ");
        sb3.append(scheme);
        throw new C8723g0(sb3.toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f22137g - this.f22138h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f22136f;
        Util.castNonNull(bArr2);
        System.arraycopy(bArr2, this.f22138h, bArr, i, min);
        this.f22138h += min;
        mo24566a(min);
        return min;
    }
}
