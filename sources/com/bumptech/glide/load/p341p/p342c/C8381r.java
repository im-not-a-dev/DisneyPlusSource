package com.bumptech.glide.load.p341p.p342c;

import com.bumptech.glide.load.p334n.p335a0.C8154b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.bumptech.glide.load.p.c.r */
/* compiled from: RecyclableBufferedInputStream */
public class C8381r extends FilterInputStream {

    /* renamed from: U */
    private int f17875U;

    /* renamed from: V */
    private int f17876V;

    /* renamed from: W */
    private int f17877W;

    /* renamed from: X */
    private int f17878X;

    /* renamed from: Y */
    private final C8154b f17879Y;

    /* renamed from: c */
    private volatile byte[] f17880c;

    /* renamed from: com.bumptech.glide.load.p.c.r$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C8382a extends IOException {
        C8382a(String str) {
            super(str);
        }
    }

    public C8381r(InputStream inputStream, C8154b bVar) {
        this(inputStream, bVar, DateUtils.FORMAT_ABBREV_MONTH);
    }

    /* renamed from: c */
    private static IOException m24363c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo21546a() {
        this.f17876V = this.f17880c.length;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f17880c == null || inputStream == null) {
            m24363c();
            throw null;
        }
        return (this.f17875U - this.f17878X) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo21548b() {
        if (this.f17880c != null) {
            this.f17879Y.mo21223a(this.f17880c);
            this.f17880c = null;
        }
    }

    public void close() throws IOException {
        if (this.f17880c != null) {
            this.f17879Y.mo21223a(this.f17880c);
            this.f17880c = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f17876V = Math.max(this.f17876V, i);
        this.f17877W = this.f17878X;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f17880c     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f17878X     // Catch:{ all -> 0x003f }
            int r4 = r6.f17875U     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.m24362a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f17880c     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f17880c     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m24363c()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f17875U     // Catch:{ all -> 0x003f }
            int r2 = r6.f17878X     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f17878X     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f17878X = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m24363c()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p341p.p342c.C8381r.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f17880c == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f17877W) {
            this.f17878X = this.f17877W;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.f17878X);
            sb.append(" markLimit: ");
            sb.append(this.f17876V);
            throw new C8382a(sb.toString());
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f17880c;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                m24363c();
                throw null;
            } else if (((long) (this.f17875U - this.f17878X)) >= j) {
                this.f17878X = (int) (((long) this.f17878X) + j);
                return j;
            } else {
                long j2 = ((long) this.f17875U) - ((long) this.f17878X);
                this.f17878X = this.f17875U;
                if (this.f17877W == -1 || j > ((long) this.f17876V)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m24362a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f17875U - this.f17878X)) >= j - j2) {
                        this.f17878X = (int) ((((long) this.f17878X) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f17875U)) - ((long) this.f17878X);
                    this.f17878X = this.f17875U;
                    return j3;
                }
            }
        } else {
            m24363c();
            throw null;
        }
    }

    C8381r(InputStream inputStream, C8154b bVar, int i) {
        super(inputStream);
        this.f17877W = -1;
        this.f17879Y = bVar;
        this.f17880c = (byte[]) bVar.mo21224b(i, byte[].class);
    }

    /* renamed from: a */
    private int m24362a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f17877W;
        if (i != -1) {
            int i2 = this.f17878X - i;
            int i3 = this.f17876V;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f17875U == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > i3) {
                        length = i3;
                    }
                    byte[] bArr2 = (byte[]) this.f17879Y.mo21224b(length, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f17880c = bArr2;
                    this.f17879Y.mo21223a(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f17877W;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                this.f17878X -= this.f17877W;
                this.f17877W = 0;
                this.f17875U = 0;
                int i5 = this.f17878X;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f17878X;
                if (read > 0) {
                    i6 += read;
                }
                this.f17875U = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f17877W = -1;
            this.f17878X = 0;
            this.f17875U = read2;
        }
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f17880c     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r4 = r6.f17875U     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f17875U     // Catch:{ all -> 0x009c }
            int r4 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f17875U     // Catch:{ all -> 0x009c }
            int r4 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f17878X     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f17878X = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f17877W     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.m24362a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f17880c     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f17880c     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            m24363c()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f17875U     // Catch:{ all -> 0x009c }
            int r5 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f17875U     // Catch:{ all -> 0x009c }
            int r5 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f17878X     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f17878X     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f17878X = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            m24363c()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            m24363c()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p341p.p342c.C8381r.read(byte[], int, int):int");
    }
}
