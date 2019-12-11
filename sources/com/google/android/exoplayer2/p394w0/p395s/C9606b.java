package com.google.android.exoplayer2.p394w0.p395s;

import com.google.android.exoplayer2.C8679b0;
import com.google.android.exoplayer2.C8872q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p362q0.C8879e;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.w0.s.b */
/* compiled from: CameraMotionRenderer */
public class C9606b extends C8872q {

    /* renamed from: c0 */
    private final C8679b0 f22460c0 = new C8679b0();

    /* renamed from: d0 */
    private final C8879e f22461d0 = new C8879e(1);

    /* renamed from: e0 */
    private final C9572w f22462e0 = new C9572w();

    /* renamed from: f0 */
    private long f22463f0;

    /* renamed from: g0 */
    private C9605a f22464g0;

    /* renamed from: h0 */
    private long f22465h0;

    public C9606b() {
        super(5);
    }

    /* renamed from: x */
    private void m29728x() {
        this.f22465h0 = 0;
        C9605a aVar = this.f22464g0;
        if (aVar != null) {
            aVar.mo24420a();
        }
    }

    /* renamed from: a */
    public int mo22859a(Format format) {
        return "application/x-camera-motion".equals(format.f18349b0) ? 4 : 0;
    }

    /* renamed from: b */
    public boolean mo22843b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo22844c() {
        return mo22848g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22881t() {
        m29728x();
    }

    /* renamed from: a */
    public void mo22648a(int i, Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f22464g0 = (C9605a) obj;
        } else {
            super.mo22648a(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22879a(Format[] formatArr, long j) throws ExoPlaybackException {
        this.f22463f0 = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22878a(long j, boolean z) throws ExoPlaybackException {
        m29728x();
    }

    /* renamed from: a */
    public void mo22840a(long j, long j2) throws ExoPlaybackException {
        while (!mo22848g() && this.f22465h0 < 100000 + j) {
            this.f22461d0.mo23207b();
            if (mo23201a(this.f22460c0, this.f22461d0, false) == -4 && !this.f22461d0.mo23211d()) {
                this.f22461d0.mo23223f();
                C8879e eVar = this.f22461d0;
                this.f22465h0 = eVar.f19024W;
                if (this.f22464g0 != null) {
                    float[] a = m29727a(eVar.f19023V);
                    if (a != null) {
                        C9605a aVar = this.f22464g0;
                        Util.castNonNull(aVar);
                        aVar.mo24423a(this.f22465h0 - this.f22463f0, a);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private float[] m29727a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f22462e0.mo24684a(byteBuffer.array(), byteBuffer.limit());
        this.f22462e0.mo24693e(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.f22462e0.mo24701l());
        }
        return fArr;
    }
}
