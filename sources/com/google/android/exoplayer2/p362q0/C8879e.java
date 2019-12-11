package com.google.android.exoplayer2.p362q0;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.q0.e */
/* compiled from: DecoderInputBuffer */
public class C8879e extends C8873a {

    /* renamed from: U */
    public final C8874b f19022U = new C8874b();

    /* renamed from: V */
    public ByteBuffer f19023V;

    /* renamed from: W */
    public long f19024W;

    /* renamed from: X */
    private final int f19025X;

    public C8879e(int i) {
        this.f19025X = i;
    }

    /* renamed from: i */
    public static C8879e m25938i() {
        return new C8879e(0);
    }

    /* renamed from: b */
    public void mo23207b() {
        super.mo23207b();
        ByteBuffer byteBuffer = this.f19023V;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: f */
    public void mo23224f(int i) {
        ByteBuffer byteBuffer = this.f19023V;
        if (byteBuffer == null) {
            this.f19023V = m25937g(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f19023V.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer g = m25937g(i2);
            if (position > 0) {
                this.f19023V.position(0);
                this.f19023V.limit(position);
                g.put(this.f19023V);
            }
            this.f19023V = g;
        }
    }

    /* renamed from: g */
    public final boolean mo23225g() {
        return mo23212d(1073741824);
    }

    /* renamed from: h */
    public final boolean mo23226h() {
        return this.f19023V == null && this.f19025X == 0;
    }

    /* renamed from: g */
    private ByteBuffer m25937g(int i) {
        int i2 = this.f19025X;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f19023V;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public final void mo23223f() {
        this.f19023V.flip();
    }
}
