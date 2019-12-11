package com.bumptech.glide.load.p332m;

import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.IOException;
import java.io.OutputStream;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.bumptech.glide.load.m.c */
/* compiled from: BufferedOutputStream */
public final class C8121c extends OutputStream {

    /* renamed from: U */
    private byte[] f17380U;

    /* renamed from: V */
    private C8154b f17381V;

    /* renamed from: W */
    private int f17382W;

    /* renamed from: c */
    private final OutputStream f17383c;

    public C8121c(OutputStream outputStream, C8154b bVar) {
        this(outputStream, bVar, DateUtils.FORMAT_ABBREV_MONTH);
    }

    /* renamed from: a */
    private void m23558a() throws IOException {
        int i = this.f17382W;
        if (i > 0) {
            this.f17383c.write(this.f17380U, 0, i);
            this.f17382W = 0;
        }
    }

    /* renamed from: b */
    private void m23559b() throws IOException {
        if (this.f17382W == this.f17380U.length) {
            m23558a();
        }
    }

    /* renamed from: c */
    private void m23560c() {
        byte[] bArr = this.f17380U;
        if (bArr != null) {
            this.f17381V.mo21223a(bArr);
            this.f17380U = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f17383c.close();
            m23560c();
        } catch (Throwable th) {
            this.f17383c.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m23558a();
        this.f17383c.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f17380U;
        int i2 = this.f17382W;
        this.f17382W = i2 + 1;
        bArr[i2] = (byte) i;
        m23559b();
    }

    C8121c(OutputStream outputStream, C8154b bVar, int i) {
        this.f17383c = outputStream;
        this.f17381V = bVar;
        this.f17380U = (byte[]) bVar.mo21224b(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f17382W != 0 || i4 < this.f17380U.length) {
                int min = Math.min(i4, this.f17380U.length - this.f17382W);
                System.arraycopy(bArr, i5, this.f17380U, this.f17382W, min);
                this.f17382W += min;
                i3 += min;
                m23559b();
            } else {
                this.f17383c.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
