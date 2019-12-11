package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.p0.w */
/* compiled from: FloatResamplingAudioProcessor */
final class C8866w extends C8854s {

    /* renamed from: h */
    private static final int f18967h = Float.floatToIntBits(Float.NaN);

    C8866w() {
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        if (Util.m29445d(i3)) {
            return mo23157b(i, i2, i3);
        }
        throw new C8841a(i, i2, i3);
    }

    /* renamed from: f */
    public int mo23066f() {
        return 4;
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return Util.m29445d(this.f18890d);
    }

    /* renamed from: a */
    public void mo23058a(ByteBuffer byteBuffer) {
        boolean z = this.f18890d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        ByteBuffer a = mo23156a(i);
        if (z) {
            while (position < limit) {
                m25819a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), a);
                position += 4;
            }
        } else {
            while (position < limit) {
                m25819a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), a);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    /* renamed from: a */
    private static void m25819a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f18967h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
