package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.util.Arrays;

public final class DataSpec {

    /* renamed from: a */
    public final Uri f21938a;

    /* renamed from: b */
    public final int f21939b;

    /* renamed from: c */
    public final byte[] f21940c;

    /* renamed from: d */
    public final long f21941d;

    /* renamed from: e */
    public final long f21942e;

    /* renamed from: f */
    public final long f21943f;

    /* renamed from: g */
    public final String f21944g;

    /* renamed from: h */
    public final int f21945h;

    public DataSpec(Uri uri, int i) {
        this(uri, 0, -1, null, i);
    }

    /* renamed from: b */
    public static String m28944b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    /* renamed from: a */
    public boolean mo24452a(int i) {
        return (this.f21945h & i) == i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        sb.append(mo24451a());
        sb.append(" ");
        sb.append(this.f21938a);
        String str = ", ";
        sb.append(str);
        sb.append(Arrays.toString(this.f21940c));
        sb.append(str);
        sb.append(this.f21941d);
        sb.append(str);
        sb.append(this.f21942e);
        sb.append(str);
        sb.append(this.f21943f);
        sb.append(str);
        sb.append(this.f21944g);
        sb.append(str);
        sb.append(this.f21945h);
        sb.append("]");
        return sb.toString();
    }

    public DataSpec(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    /* renamed from: a */
    public final String mo24451a() {
        return m28944b(this.f21939b);
    }

    public DataSpec(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    /* renamed from: a */
    public DataSpec mo24449a(long j) {
        long j2 = this.f21943f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo24450a(j, j3);
    }

    public DataSpec(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    /* renamed from: a */
    public DataSpec mo24450a(long j, long j2) {
        if (j == 0 && this.f21943f == j2) {
            return this;
        }
        DataSpec dataSpec = new DataSpec(this.f21938a, this.f21939b, this.f21940c, this.f21941d + j, this.f21942e + j, j2, this.f21944g, this.f21945h);
        return dataSpec;
    }

    public DataSpec(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    public DataSpec(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C9537e.m29299a(j4 >= 0);
        C9537e.m29299a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C9537e.m29299a(z);
        this.f21938a = uri;
        this.f21939b = i;
        if (bArr2 == null || bArr2.length == 0) {
            bArr2 = null;
        }
        this.f21940c = bArr2;
        this.f21941d = j4;
        this.f21942e = j5;
        this.f21943f = j6;
        this.f21944g = str;
        this.f21945h = i2;
    }
}
