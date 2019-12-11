package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.d */
/* compiled from: DefaultExtractorInput */
public final class C8909d implements C8913h {

    /* renamed from: a */
    private final byte[] f19128a = new byte[4096];

    /* renamed from: b */
    private final DataSource f19129b;

    /* renamed from: c */
    private final long f19130c;

    /* renamed from: d */
    private long f19131d;

    /* renamed from: e */
    private byte[] f19132e = new byte[DateUtils.FORMAT_ABBREV_MONTH];

    /* renamed from: f */
    private int f19133f;

    /* renamed from: g */
    private int f19134g;

    public C8909d(DataSource dataSource, long j, long j2) {
        this.f19129b = dataSource;
        this.f19131d = j;
        this.f19130c = j2;
    }

    /* renamed from: d */
    private void m26125d(int i) {
        if (i != -1) {
            this.f19131d += (long) i;
        }
    }

    /* renamed from: e */
    private void m26126e(int i) {
        int i2 = this.f19133f + i;
        byte[] bArr = this.f19132e;
        if (i2 > bArr.length) {
            this.f19132e = Arrays.copyOf(this.f19132e, Util.m29382a(bArr.length * 2, DateUtils.FORMAT_ABBREV_MONTH + i2, i2 + DateUtils.FORMAT_ABBREV_ALL));
        }
    }

    /* renamed from: f */
    private int m26127f(int i) {
        int min = Math.min(this.f19134g, i);
        m26128g(min);
        return min;
    }

    /* renamed from: g */
    private void m26128g(int i) {
        this.f19134g -= i;
        this.f19133f = 0;
        byte[] bArr = this.f19132e;
        int i2 = this.f19134g;
        if (i2 < bArr.length - DateUtils.FORMAT_ABBREV_ALL) {
            bArr = new byte[(i2 + DateUtils.FORMAT_ABBREV_MONTH)];
        }
        System.arraycopy(this.f19132e, i, bArr, 0, this.f19134g);
        this.f19132e = bArr;
    }

    /* renamed from: a */
    public boolean mo23291a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int c = m26124c(bArr, i, i2);
        while (c < i2 && c != -1) {
            c = m26123a(bArr, i, i2, c, z);
        }
        m26125d(c);
        return c != -1;
    }

    /* renamed from: b */
    public int mo23292b(int i) throws IOException, InterruptedException {
        int f = m26127f(i);
        if (f == 0) {
            byte[] bArr = this.f19128a;
            f = m26123a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m26125d(f);
        return f;
    }

    /* renamed from: c */
    public void mo23298c(int i) throws IOException, InterruptedException {
        mo23295b(i, false);
    }

    public long getPosition() {
        return this.f19131d;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int c = m26124c(bArr, i, i2);
        if (c == 0) {
            c = m26123a(bArr, i, i2, 0, true);
        }
        m26125d(c);
        return c;
    }

    /* renamed from: c */
    public void mo23297c() {
        this.f19133f = 0;
    }

    /* renamed from: c */
    private int m26124c(byte[] bArr, int i, int i2) {
        int i3 = this.f19134g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f19132e, 0, bArr, i, min);
        m26128g(min);
        return min;
    }

    /* renamed from: a */
    public void mo23289a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo23291a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public boolean mo23290a(int i, boolean z) throws IOException, InterruptedException {
        m26126e(i);
        int i2 = this.f19134g - this.f19133f;
        while (i2 < i) {
            i2 = m26123a(this.f19132e, this.f19133f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f19134g = this.f19133f + i2;
        }
        this.f19133f += i;
        return true;
    }

    /* renamed from: b */
    public boolean mo23295b(int i, boolean z) throws IOException, InterruptedException {
        int f = m26127f(i);
        while (f < i && f != -1) {
            f = m26123a(this.f19128a, -f, Math.min(i, this.f19128a.length + f), f, z);
        }
        m26125d(f);
        return f != -1;
    }

    /* renamed from: a */
    public void mo23288a(int i) throws IOException, InterruptedException {
        mo23290a(i, false);
    }

    /* renamed from: b */
    public boolean mo23296b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo23290a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f19132e, this.f19133f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: a */
    public long mo23287a() {
        return this.f19130c;
    }

    /* renamed from: a */
    private int m26123a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.f19129b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: b */
    public void mo23294b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo23296b(bArr, i, i2, false);
    }

    /* renamed from: b */
    public long mo23293b() {
        return this.f19131d + ((long) this.f19133f);
    }
}
