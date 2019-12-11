package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.p0.z */
/* compiled from: SilenceSkippingAudioProcessor */
public final class C8871z extends C8854s {

    /* renamed from: h */
    private int f18987h;

    /* renamed from: i */
    private boolean f18988i;

    /* renamed from: j */
    private byte[] f18989j;

    /* renamed from: k */
    private byte[] f18990k;

    /* renamed from: l */
    private int f18991l;

    /* renamed from: m */
    private int f18992m;

    /* renamed from: n */
    private int f18993n;

    /* renamed from: o */
    private boolean f18994o;

    /* renamed from: p */
    private long f18995p;

    public C8871z() {
        byte[] bArr = C9554k0.f22286f;
        this.f18989j = bArr;
        this.f18990k = bArr;
    }

    /* renamed from: b */
    private int m25874b(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs(byteBuffer.get(limit)) > 4) {
                int i = this.f18987h;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    /* renamed from: c */
    private int m25875c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i = this.f18987h;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: d */
    private void m25876d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo23156a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f18994o = true;
        }
    }

    /* renamed from: e */
    private void m25877e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c = m25875c(byteBuffer);
        int position = c - byteBuffer.position();
        byte[] bArr = this.f18989j;
        int length = bArr.length;
        int i = this.f18992m;
        int i2 = length - i;
        if (c >= limit || position >= i2) {
            int min = Math.min(position, i2);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.f18989j, this.f18992m, min);
            this.f18992m += min;
            int i3 = this.f18992m;
            byte[] bArr2 = this.f18989j;
            if (i3 == bArr2.length) {
                if (this.f18994o) {
                    m25873a(bArr2, this.f18993n);
                    this.f18995p += (long) ((this.f18992m - (this.f18993n * 2)) / this.f18987h);
                } else {
                    this.f18995p += (long) ((i3 - this.f18993n) / this.f18987h);
                }
                m25872a(byteBuffer, this.f18989j, this.f18992m);
                this.f18992m = 0;
                this.f18991l = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        m25873a(bArr, i);
        this.f18992m = 0;
        this.f18991l = 0;
    }

    /* renamed from: f */
    private void m25878f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f18989j.length));
        int b = m25874b(byteBuffer);
        if (b == byteBuffer.position()) {
            this.f18991l = 1;
        } else {
            byteBuffer.limit(b);
            m25876d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: g */
    private void m25879g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int c = m25875c(byteBuffer);
        byteBuffer.limit(c);
        this.f18995p += (long) (byteBuffer.remaining() / this.f18987h);
        m25872a(byteBuffer, this.f18990k, this.f18993n);
        if (c < limit) {
            m25873a(this.f18990k, this.f18993n);
            this.f18991l = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: a */
    public void mo23199a(boolean z) {
        this.f18988i = z;
        flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo23072i() {
        if (mo23059a()) {
            int a = m25871a(150000) * this.f18987h;
            if (this.f18989j.length != a) {
                this.f18989j = new byte[a];
            }
            this.f18993n = m25871a(20000) * this.f18987h;
            int length = this.f18990k.length;
            int i = this.f18993n;
            if (length != i) {
                this.f18990k = new byte[i];
            }
        }
        this.f18991l = 0;
        this.f18995p = 0;
        this.f18992m = 0;
        this.f18994o = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo23159j() {
        int i = this.f18992m;
        if (i > 0) {
            m25873a(this.f18989j, i);
        }
        if (!this.f18994o) {
            this.f18995p += (long) (this.f18993n / this.f18987h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo23073k() {
        this.f18988i = false;
        this.f18993n = 0;
        byte[] bArr = C9554k0.f22286f;
        this.f18989j = bArr;
        this.f18990k = bArr;
    }

    /* renamed from: l */
    public long mo23200l() {
        return this.f18995p;
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        if (i3 == 2) {
            this.f18987h = i2 * 2;
            return mo23157b(i, i2, i3);
        }
        throw new C8841a(i, i2, i3);
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return super.mo23059a() && this.f18988i;
    }

    /* renamed from: a */
    public void mo23058a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !mo23158h()) {
            int i = this.f18991l;
            if (i == 0) {
                m25878f(byteBuffer);
            } else if (i == 1) {
                m25877e(byteBuffer);
            } else if (i == 2) {
                m25879g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    private void m25873a(byte[] bArr, int i) {
        mo23156a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f18994o = true;
        }
    }

    /* renamed from: a */
    private void m25872a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f18993n);
        int i2 = this.f18993n - min;
        System.arraycopy(bArr, i - i2, this.f18990k, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f18990k, i2, min);
    }

    /* renamed from: a */
    private int m25871a(long j) {
        return (int) ((j * ((long) this.f18888b)) / 1000000);
    }
}
