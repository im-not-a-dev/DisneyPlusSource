package com.google.android.exoplayer2.p391ui.p392r;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.C9543g0;
import com.google.android.exoplayer2.util.C9561o;
import com.google.android.exoplayer2.p394w0.C9597n;
import com.google.android.exoplayer2.p394w0.p395s.C9605a;
import com.google.android.exoplayer2.p394w0.p395s.C9607c;
import com.google.android.exoplayer2.p394w0.p395s.C9608d;
import com.google.android.exoplayer2.p394w0.p395s.C9611e;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.ui.r.f */
/* compiled from: SceneRenderer */
public final class C9428f implements C9597n, C9605a {

    /* renamed from: a */
    private final AtomicBoolean f21897a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f21898b = new AtomicBoolean(true);

    /* renamed from: c */
    private final C9426e f21899c = new C9426e();

    /* renamed from: d */
    private final C9607c f21900d = new C9607c();

    /* renamed from: e */
    private final C9543g0<Long> f21901e = new C9543g0<>();

    /* renamed from: f */
    private final C9543g0<C9608d> f21902f = new C9543g0<>();

    /* renamed from: g */
    private final float[] f21903g = new float[16];

    /* renamed from: h */
    private final float[] f21904h = new float[16];

    /* renamed from: i */
    private int f21905i;

    /* renamed from: j */
    private SurfaceTexture f21906j;

    /* renamed from: k */
    private volatile int f21907k = 0;

    /* renamed from: l */
    private int f21908l = -1;

    /* renamed from: m */
    private byte[] f21909m;

    /* renamed from: a */
    public void mo24421a(int i) {
        this.f21907k = i;
    }

    /* renamed from: b */
    public SurfaceTexture mo24426b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C9561o.m29483a();
        this.f21899c.mo24417a();
        C9561o.m29483a();
        this.f21905i = C9561o.m29486b();
        this.f21906j = new SurfaceTexture(this.f21905i);
        this.f21906j.setOnFrameAvailableListener(new C9421a(this));
        return this.f21906j;
    }

    /* renamed from: a */
    public /* synthetic */ void mo24424a(SurfaceTexture surfaceTexture) {
        this.f21897a.set(true);
    }

    /* renamed from: a */
    public void mo24425a(float[] fArr, boolean z) {
        GLES20.glClear(DateUtils.FORMAT_ABBREV_TIME);
        C9561o.m29483a();
        if (this.f21897a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f21906j;
            Assertions.checkNotNull(surfaceTexture);
            surfaceTexture.updateTexImage();
            C9561o.m29483a();
            if (this.f21898b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f21903g, 0);
            }
            long timestamp = this.f21906j.getTimestamp();
            Long l = (Long) this.f21901e.mo24625a(timestamp);
            if (l != null) {
                this.f21900d.mo24795a(this.f21903g, l.longValue());
            }
            C9608d dVar = (C9608d) this.f21902f.mo24628b(timestamp);
            if (dVar != null) {
                this.f21899c.mo24419a(dVar);
            }
        }
        Matrix.multiplyMM(this.f21904h, 0, fArr, 0, this.f21903g, 0);
        this.f21899c.mo24418a(this.f21905i, this.f21904h, z);
    }

    /* renamed from: a */
    public void mo24422a(long j, long j2, Format format) {
        this.f21901e.mo24627a(j2, Long.valueOf(j));
        m28917a(format.f18361m0, format.f18360l0, j2);
    }

    /* renamed from: a */
    public void mo24423a(long j, float[] fArr) {
        this.f21900d.mo24794a(j, fArr);
    }

    /* renamed from: a */
    public void mo24420a() {
        this.f21901e.mo24626a();
        this.f21900d.mo24793a();
        this.f21898b.set(true);
    }

    /* renamed from: a */
    private void m28917a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f21909m;
        int i2 = this.f21908l;
        this.f21909m = bArr;
        if (i == -1) {
            i = this.f21907k;
        }
        this.f21908l = i;
        if (i2 != this.f21908l || !Arrays.equals(bArr2, this.f21909m)) {
            C9608d dVar = null;
            byte[] bArr3 = this.f21909m;
            if (bArr3 != null) {
                dVar = C9611e.m29748a(bArr3, this.f21908l);
            }
            if (dVar == null || !C9426e.m28909b(dVar)) {
                dVar = C9608d.m29743a(this.f21908l);
            }
            this.f21902f.mo24627a(j, dVar);
        }
    }
}
