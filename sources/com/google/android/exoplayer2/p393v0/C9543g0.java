package com.google.android.exoplayer2.p393v0;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.v0.g0 */
/* compiled from: TimedValueQueue */
public final class C9543g0<V> {

    /* renamed from: a */
    private long[] f22258a;

    /* renamed from: b */
    private V[] f22259b;

    /* renamed from: c */
    private int f22260c;

    /* renamed from: d */
    private int f22261d;

    public C9543g0() {
        this(10);
    }

    /* renamed from: c */
    private void m29326c(long j) {
        int i = this.f22261d;
        if (i > 0) {
            if (j <= this.f22258a[((this.f22260c + i) - 1) % this.f22259b.length]) {
                mo24626a();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo24627a(long j, V v) {
        m29326c(j);
        m29324b();
        m29325b(j, v);
    }

    /* renamed from: b */
    public synchronized V mo24628b(long j) {
        return m29322a(j, true);
    }

    public C9543g0(int i) {
        this.f22258a = new long[i];
        this.f22259b = m29323a(i);
    }

    /* renamed from: b */
    private void m29324b() {
        int length = this.f22259b.length;
        if (this.f22261d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] a = m29323a(i);
            int i2 = this.f22260c;
            int i3 = length - i2;
            System.arraycopy(this.f22258a, i2, jArr, 0, i3);
            System.arraycopy(this.f22259b, this.f22260c, a, 0, i3);
            int i4 = this.f22260c;
            if (i4 > 0) {
                System.arraycopy(this.f22258a, 0, jArr, i3, i4);
                System.arraycopy(this.f22259b, 0, a, i3, this.f22260c);
            }
            this.f22258a = jArr;
            this.f22259b = a;
            this.f22260c = 0;
        }
    }

    /* renamed from: a */
    public synchronized void mo24626a() {
        this.f22260c = 0;
        this.f22261d = 0;
        Arrays.fill(this.f22259b, null);
    }

    /* renamed from: a */
    public synchronized V mo24625a(long j) {
        return m29322a(j, false);
    }

    /* renamed from: a */
    private V m29322a(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (this.f22261d > 0) {
            long j3 = j - this.f22258a[this.f22260c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            V[] vArr = this.f22259b;
            int i = this.f22260c;
            v = vArr[i];
            vArr[i] = null;
            this.f22260c = (i + 1) % vArr.length;
            this.f22261d--;
            j2 = j3;
        }
        return v;
    }

    /* renamed from: b */
    private void m29325b(long j, V v) {
        int i = this.f22260c;
        int i2 = this.f22261d;
        int i3 = i + i2;
        V[] vArr = this.f22259b;
        int length = i3 % vArr.length;
        this.f22258a[length] = j;
        vArr[length] = v;
        this.f22261d = i2 + 1;
    }

    /* renamed from: a */
    private static <V> V[] m29323a(int i) {
        return new Object[i];
    }
}
