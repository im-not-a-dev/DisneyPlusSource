package com.airbnb.lottie.p022w;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.airbnb.lottie.C1182d;

/* renamed from: com.airbnb.lottie.w.c */
/* compiled from: LottieValueAnimator */
public class C1372c extends C1370a implements FrameCallback {

    /* renamed from: V */
    private float f5034V = 1.0f;

    /* renamed from: W */
    private boolean f5035W = false;

    /* renamed from: X */
    private long f5036X = 0;

    /* renamed from: Y */
    private float f5037Y = 0.0f;

    /* renamed from: Z */
    private int f5038Z = 0;

    /* renamed from: a0 */
    private float f5039a0 = -2.14748365E9f;

    /* renamed from: b0 */
    private float f5040b0 = 2.14748365E9f;

    /* renamed from: c0 */
    private C1182d f5041c0;

    /* renamed from: d0 */
    protected boolean f5042d0 = false;

    /* renamed from: q */
    private float m6696q() {
        C1182d dVar = this.f5041c0;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.mo6040g()) / Math.abs(this.f5034V);
    }

    /* renamed from: r */
    private boolean m6697r() {
        return mo6410j() < 0.0f;
    }

    /* renamed from: s */
    private void m6698s() {
        if (this.f5041c0 != null) {
            float f = this.f5037Y;
            if (f < this.f5039a0 || f > this.f5040b0) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f5039a0), Float.valueOf(this.f5040b0), Float.valueOf(this.f5037Y)}));
            }
        }
    }

    /* renamed from: a */
    public void mo6394a(C1182d dVar) {
        boolean z = this.f5041c0 == null;
        this.f5041c0 = dVar;
        if (z) {
            mo6392a((float) ((int) Math.max(this.f5039a0, dVar.mo6045l())), (float) ((int) Math.min(this.f5040b0, dVar.mo6038e())));
        } else {
            mo6392a((float) ((int) dVar.mo6045l()), (float) ((int) dVar.mo6038e()));
        }
        float f = this.f5037Y;
        this.f5037Y = 0.0f;
        mo6393a((int) f);
    }

    /* renamed from: b */
    public void mo6396b(int i) {
        mo6392a((float) i, (float) ((int) this.f5040b0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6397c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f5042d0 = false;
        }
    }

    public void cancel() {
        mo6376a();
        mo6414n();
    }

    /* renamed from: d */
    public void mo6399d() {
        this.f5041c0 = null;
        this.f5039a0 = -2.14748365E9f;
        this.f5040b0 = 2.14748365E9f;
    }

    public void doFrame(long j) {
        mo6413m();
        if (this.f5041c0 != null && isRunning()) {
            long nanoTime = System.nanoTime();
            float q = ((float) (nanoTime - this.f5036X)) / m6696q();
            float f = this.f5037Y;
            if (m6697r()) {
                q = -q;
            }
            this.f5037Y = f + q;
            boolean z = !C1374e.m6730b(this.f5037Y, mo6408i(), mo6407h());
            this.f5037Y = C1374e.m6721a(this.f5037Y, mo6408i(), mo6407h());
            this.f5036X = nanoTime;
            mo6382c();
            if (z) {
                if (getRepeatCount() == -1 || this.f5038Z < getRepeatCount()) {
                    mo6380b();
                    this.f5038Z++;
                    if (getRepeatMode() == 2) {
                        this.f5035W = !this.f5035W;
                        mo6416p();
                    } else {
                        this.f5037Y = m6697r() ? mo6407h() : mo6408i();
                    }
                    this.f5036X = nanoTime;
                } else {
                    this.f5037Y = mo6407h();
                    mo6414n();
                    mo6377a(m6697r());
                }
            }
            m6698s();
        }
    }

    /* renamed from: e */
    public void mo6401e() {
        mo6414n();
        mo6377a(m6697r());
    }

    /* renamed from: f */
    public float mo6402f() {
        C1182d dVar = this.f5041c0;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f5037Y - dVar.mo6045l()) / (this.f5041c0.mo6038e() - this.f5041c0.mo6045l());
    }

    /* renamed from: g */
    public float mo6403g() {
        return this.f5037Y;
    }

    public float getAnimatedFraction() {
        float i;
        float h;
        float i2;
        if (this.f5041c0 == null) {
            return 0.0f;
        }
        if (m6697r()) {
            i = mo6407h() - this.f5037Y;
            h = mo6407h();
            i2 = mo6408i();
        } else {
            i = this.f5037Y - mo6408i();
            h = mo6407h();
            i2 = mo6408i();
        }
        return i / (h - i2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo6402f());
    }

    public long getDuration() {
        C1182d dVar = this.f5041c0;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.mo6035c();
    }

    /* renamed from: h */
    public float mo6407h() {
        C1182d dVar = this.f5041c0;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f5040b0;
        if (f == 2.14748365E9f) {
            f = dVar.mo6038e();
        }
        return f;
    }

    /* renamed from: i */
    public float mo6408i() {
        C1182d dVar = this.f5041c0;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f5039a0;
        if (f == -2.14748365E9f) {
            f = dVar.mo6045l();
        }
        return f;
    }

    public boolean isRunning() {
        return this.f5042d0;
    }

    /* renamed from: j */
    public float mo6410j() {
        return this.f5034V;
    }

    /* renamed from: k */
    public void mo6411k() {
        mo6414n();
    }

    /* renamed from: l */
    public void mo6412l() {
        this.f5042d0 = true;
        mo6381b(m6697r());
        mo6393a((int) (m6697r() ? mo6407h() : mo6408i()));
        this.f5036X = System.nanoTime();
        this.f5038Z = 0;
        mo6413m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo6413m() {
        if (isRunning()) {
            mo6397c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo6414n() {
        mo6397c(true);
    }

    /* renamed from: o */
    public void mo6415o() {
        this.f5042d0 = true;
        mo6413m();
        this.f5036X = System.nanoTime();
        if (m6697r() && mo6403g() == mo6408i()) {
            this.f5037Y = mo6407h();
        } else if (!m6697r() && mo6403g() == mo6407h()) {
            this.f5037Y = mo6408i();
        }
    }

    /* renamed from: p */
    public void mo6416p() {
        mo6395b(-mo6410j());
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f5035W) {
            this.f5035W = false;
            mo6416p();
        }
    }

    /* renamed from: b */
    public void mo6395b(float f) {
        this.f5034V = f;
    }

    /* renamed from: a */
    public void mo6393a(int i) {
        float f = (float) i;
        if (this.f5037Y != f) {
            this.f5037Y = C1374e.m6721a(f, mo6408i(), mo6407h());
            this.f5036X = System.nanoTime();
            mo6382c();
        }
    }

    /* renamed from: a */
    public void mo6391a(float f) {
        mo6392a(this.f5039a0, f);
    }

    /* renamed from: a */
    public void mo6392a(float f, float f2) {
        if (f <= f2) {
            C1182d dVar = this.f5041c0;
            float l = dVar == null ? -3.4028235E38f : dVar.mo6045l();
            C1182d dVar2 = this.f5041c0;
            float e = dVar2 == null ? Float.MAX_VALUE : dVar2.mo6038e();
            this.f5039a0 = C1374e.m6721a(f, l, e);
            this.f5040b0 = C1374e.m6721a(f2, l, e);
            mo6393a((int) C1374e.m6721a(this.f5037Y, f, f2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }
}
