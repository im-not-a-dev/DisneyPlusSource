package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p361p0.C8840m.C8841a;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.exoplayer2.p0.b0 */
/* compiled from: SonicAudioProcessor */
public final class C8818b0 implements C8840m {

    /* renamed from: b */
    private int f18772b = -1;

    /* renamed from: c */
    private int f18773c = -1;

    /* renamed from: d */
    private float f18774d = 1.0f;

    /* renamed from: e */
    private float f18775e = 1.0f;

    /* renamed from: f */
    private int f18776f = -1;

    /* renamed from: g */
    private int f18777g = -1;

    /* renamed from: h */
    private boolean f18778h;

    /* renamed from: i */
    private C8816a0 f18779i;

    /* renamed from: j */
    private ByteBuffer f18780j = C8840m.f18847a;

    /* renamed from: k */
    private ShortBuffer f18781k = this.f18780j.asShortBuffer();

    /* renamed from: l */
    private ByteBuffer f18782l = C8840m.f18847a;

    /* renamed from: m */
    private long f18783m;

    /* renamed from: n */
    private long f18784n;

    /* renamed from: o */
    private boolean f18785o;

    /* renamed from: a */
    public float mo23056a(float f) {
        float a = C9554k0.m29379a(f, 0.1f, 8.0f);
        if (this.f18775e != a) {
            this.f18775e = a;
            this.f18778h = true;
        }
        flush();
        return a;
    }

    /* renamed from: b */
    public float mo23061b(float f) {
        float a = C9554k0.m29379a(f, 0.1f, 8.0f);
        if (this.f18774d != a) {
            this.f18774d = a;
            this.f18778h = true;
        }
        flush();
        return a;
    }

    /* renamed from: c */
    public boolean mo23063c() {
        if (this.f18785o) {
            C8816a0 a0Var = this.f18779i;
            if (a0Var == null || a0Var.mo23052b() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo23064d() {
        return this.f18772b;
    }

    /* renamed from: e */
    public int mo23065e() {
        return this.f18776f;
    }

    /* renamed from: f */
    public int mo23066f() {
        return 2;
    }

    public void flush() {
        if (mo23059a()) {
            if (this.f18778h) {
                C8816a0 a0Var = new C8816a0(this.f18773c, this.f18772b, this.f18774d, this.f18775e, this.f18776f);
                this.f18779i = a0Var;
            } else {
                C8816a0 a0Var2 = this.f18779i;
                if (a0Var2 != null) {
                    a0Var2.mo23050a();
                }
            }
        }
        this.f18782l = C8840m.f18847a;
        this.f18783m = 0;
        this.f18784n = 0;
        this.f18785o = false;
    }

    /* renamed from: g */
    public void mo23068g() {
        C8816a0 a0Var = this.f18779i;
        if (a0Var != null) {
            a0Var.mo23054c();
        }
        this.f18785o = true;
    }

    public void reset() {
        this.f18774d = 1.0f;
        this.f18775e = 1.0f;
        this.f18772b = -1;
        this.f18773c = -1;
        this.f18776f = -1;
        this.f18780j = C8840m.f18847a;
        this.f18781k = this.f18780j.asShortBuffer();
        this.f18782l = C8840m.f18847a;
        this.f18777g = -1;
        this.f18778h = false;
        this.f18779i = null;
        this.f18783m = 0;
        this.f18784n = 0;
        this.f18785o = false;
    }

    /* renamed from: a */
    public long mo23057a(long j) {
        long j2;
        long j3 = this.f18784n;
        if (j3 < 1024) {
            return (long) (((double) this.f18774d) * ((double) j));
        }
        int i = this.f18776f;
        int i2 = this.f18773c;
        if (i == i2) {
            j2 = C9554k0.m29439c(j, this.f18783m, j3);
        } else {
            j2 = C9554k0.m29439c(j, this.f18783m * ((long) i), j3 * ((long) i2));
        }
        return j2;
    }

    /* renamed from: b */
    public ByteBuffer mo23062b() {
        ByteBuffer byteBuffer = this.f18782l;
        this.f18782l = C8840m.f18847a;
        return byteBuffer;
    }

    /* renamed from: a */
    public boolean mo23060a(int i, int i2, int i3) throws C8841a {
        if (i3 == 2) {
            int i4 = this.f18777g;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f18773c == i && this.f18772b == i2 && this.f18776f == i4) {
                return false;
            }
            this.f18773c = i;
            this.f18772b = i2;
            this.f18776f = i4;
            this.f18778h = true;
            return true;
        }
        throw new C8841a(i, i2, i3);
    }

    /* renamed from: a */
    public boolean mo23059a() {
        return this.f18773c != -1 && (Math.abs(this.f18774d - 1.0f) >= 0.01f || Math.abs(this.f18775e - 1.0f) >= 0.01f || this.f18776f != this.f18773c);
    }

    /* renamed from: a */
    public void mo23058a(ByteBuffer byteBuffer) {
        C8816a0 a0Var = this.f18779i;
        C9537e.m29296a(a0Var);
        C8816a0 a0Var2 = a0Var;
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f18783m += (long) remaining;
            a0Var2.mo23053b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b = a0Var2.mo23052b();
        if (b > 0) {
            if (this.f18780j.capacity() < b) {
                this.f18780j = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f18781k = this.f18780j.asShortBuffer();
            } else {
                this.f18780j.clear();
                this.f18781k.clear();
            }
            a0Var2.mo23051a(this.f18781k);
            this.f18784n += (long) b;
            this.f18780j.limit(b);
            this.f18782l = this.f18780j;
        }
    }
}
