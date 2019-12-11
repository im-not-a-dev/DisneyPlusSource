package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.p0.c0 */
/* compiled from: TrimmingAudioProcessor */
final class C8820c0 extends C8854s {

    /* renamed from: h */
    private boolean f18788h;

    /* renamed from: i */
    private int f18789i;

    /* renamed from: j */
    private int f18790j;

    /* renamed from: k */
    private int f18791k;

    /* renamed from: l */
    private boolean f18792l;

    /* renamed from: m */
    private int f18793m;

    /* renamed from: n */
    private byte[] f18794n = C9554k0.f22286f;

    /* renamed from: o */
    private int f18795o;

    /* renamed from: p */
    private long f18796p;

    /* renamed from: a */
    public void mo23071a(int i, int i2) {
        this.f18789i = i;
        this.f18790j = i2;
    }

    /* renamed from: b */
    public ByteBuffer mo23062b() {
        if (super.mo23063c()) {
            int i = this.f18795o;
            if (i > 0) {
                mo23156a(i).put(this.f18794n, 0, this.f18795o).flip();
                this.f18795o = 0;
            }
        }
        return super.mo23062b();
    }

    /* renamed from: c */
    public boolean mo23063c() {
        return super.mo23063c() && this.f18795o == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo23072i() {
        if (this.f18792l) {
            this.f18793m = 0;
        }
        this.f18795o = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo23073k() {
        this.f18794n = C9554k0.f22286f;
    }

    /* renamed from: l */
    public long mo23074l() {
        return this.f18796p;
    }

    /* renamed from: m */
    public void mo23075m() {
        this.f18796p = 0;
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        if (i3 == 2) {
            int i4 = this.f18795o;
            if (i4 > 0) {
                this.f18796p += (long) (i4 / this.f18791k);
            }
            this.f18791k = C9554k0.m29425b(2, i2);
            int i5 = this.f18790j;
            int i6 = this.f18791k;
            this.f18794n = new byte[(i5 * i6)];
            this.f18795o = 0;
            int i7 = this.f18789i;
            this.f18793m = i6 * i7;
            boolean z = this.f18788h;
            this.f18788h = (i7 == 0 && i5 == 0) ? false : true;
            this.f18792l = false;
            mo23157b(i, i2, i3);
            if (z != this.f18788h) {
                return true;
            }
            return false;
        }
        throw new C8841a(i, i2, i3);
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return this.f18788h;
    }

    /* renamed from: a */
    public void mo23058a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.f18792l = true;
            int min = Math.min(i, this.f18793m);
            this.f18796p += (long) (min / this.f18791k);
            this.f18793m -= min;
            byteBuffer.position(position + min);
            if (this.f18793m <= 0) {
                int i2 = i - min;
                int length = (this.f18795o + i2) - this.f18794n.length;
                ByteBuffer a = mo23156a(length);
                int a2 = C9554k0.m29382a(length, 0, this.f18795o);
                a.put(this.f18794n, 0, a2);
                int a3 = C9554k0.m29382a(length - a2, 0, i2);
                byteBuffer.limit(byteBuffer.position() + a3);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - a3;
                this.f18795o -= a2;
                byte[] bArr = this.f18794n;
                System.arraycopy(bArr, a2, bArr, 0, this.f18795o);
                byteBuffer.get(this.f18794n, this.f18795o, i3);
                this.f18795o += i3;
                a.flip();
            }
        }
    }
}
