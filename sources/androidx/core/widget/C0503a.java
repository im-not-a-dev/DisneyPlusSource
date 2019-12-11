package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.stetho.server.http.HttpStatus;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.core.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0503a implements OnTouchListener {

    /* renamed from: k0 */
    private static final int f2245k0 = ViewConfiguration.getTapTimeout();

    /* renamed from: U */
    private final Interpolator f2246U = new AccelerateInterpolator();

    /* renamed from: V */
    final View f2247V;

    /* renamed from: W */
    private Runnable f2248W;

    /* renamed from: X */
    private float[] f2249X = {0.0f, 0.0f};

    /* renamed from: Y */
    private float[] f2250Y = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: Z */
    private int f2251Z;

    /* renamed from: a0 */
    private int f2252a0;

    /* renamed from: b0 */
    private float[] f2253b0 = {0.0f, 0.0f};

    /* renamed from: c */
    final C0504a f2254c = new C0504a();

    /* renamed from: c0 */
    private float[] f2255c0 = {0.0f, 0.0f};

    /* renamed from: d0 */
    private float[] f2256d0 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: e0 */
    private boolean f2257e0;

    /* renamed from: f0 */
    boolean f2258f0;

    /* renamed from: g0 */
    boolean f2259g0;

    /* renamed from: h0 */
    boolean f2260h0;

    /* renamed from: i0 */
    private boolean f2261i0;

    /* renamed from: j0 */
    private boolean f2262j0;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0504a {

        /* renamed from: a */
        private int f2263a;

        /* renamed from: b */
        private int f2264b;

        /* renamed from: c */
        private float f2265c;

        /* renamed from: d */
        private float f2266d;

        /* renamed from: e */
        private long f2267e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2268f = 0;

        /* renamed from: g */
        private int f2269g = 0;

        /* renamed from: h */
        private int f2270h = 0;

        /* renamed from: i */
        private long f2271i = -1;

        /* renamed from: j */
        private float f2272j;

        /* renamed from: k */
        private int f2273k;

        C0504a() {
        }

        /* renamed from: a */
        private float m2733a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo2841a(int i) {
            this.f2264b = i;
        }

        /* renamed from: b */
        public void mo2843b(int i) {
            this.f2263a = i;
        }

        /* renamed from: c */
        public int mo2844c() {
            return this.f2270h;
        }

        /* renamed from: d */
        public int mo2845d() {
            float f = this.f2265c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo2846e() {
            float f = this.f2266d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo2847f() {
            return this.f2271i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2271i + ((long) this.f2273k);
        }

        /* renamed from: g */
        public void mo2848g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2273k = C0503a.m2714a((int) (currentAnimationTimeMillis - this.f2267e), 0, this.f2264b);
            this.f2272j = m2734a(currentAnimationTimeMillis);
            this.f2271i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo2849h() {
            this.f2267e = AnimationUtils.currentAnimationTimeMillis();
            this.f2271i = -1;
            this.f2268f = this.f2267e;
            this.f2272j = 0.5f;
            this.f2269g = 0;
            this.f2270h = 0;
        }

        /* renamed from: a */
        private float m2734a(long j) {
            if (j < this.f2267e) {
                return 0.0f;
            }
            long j2 = this.f2271i;
            if (j2 < 0 || j < j2) {
                return C0503a.m2711a(((float) (j - this.f2267e)) / ((float) this.f2263a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2272j;
            return (1.0f - f) + (f * C0503a.m2711a(((float) j3) / ((float) this.f2273k), 0.0f, 1.0f));
        }

        /* renamed from: b */
        public int mo2842b() {
            return this.f2269g;
        }

        /* renamed from: a */
        public void mo2839a() {
            if (this.f2268f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2733a(m2734a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f2268f;
                this.f2268f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f2269g = (int) (this.f2265c * f);
                this.f2270h = (int) (f * this.f2266d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2840a(float f, float f2) {
            this.f2265c = f;
            this.f2266d = f2;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0505b implements Runnable {
        C0505b() {
        }

        public void run() {
            C0503a aVar = C0503a.this;
            if (aVar.f2260h0) {
                if (aVar.f2258f0) {
                    aVar.f2258f0 = false;
                    aVar.f2254c.mo2849h();
                }
                C0504a aVar2 = C0503a.this.f2254c;
                if (aVar2.mo2847f() || !C0503a.this.mo2829b()) {
                    C0503a.this.f2260h0 = false;
                    return;
                }
                C0503a aVar3 = C0503a.this;
                if (aVar3.f2259g0) {
                    aVar3.f2259g0 = false;
                    aVar3.mo2825a();
                }
                aVar2.mo2839a();
                C0503a.this.mo2826a(aVar2.mo2842b(), aVar2.mo2844c());
                C4187x.m14363a(C0503a.this.f2247V, (Runnable) this);
            }
        }
    }

    public C0503a(View view) {
        this.f2247V = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2828b(f2, f2);
        float f3 = (float) i;
        mo2831c(f3, f3);
        mo2834d(1);
        mo2823a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2833d(0.2f, 0.2f);
        mo2835e(1.0f, 1.0f);
        mo2832c(f2245k0);
        mo2837f(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        mo2836e(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    /* renamed from: a */
    static float m2711a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2714a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public C0503a mo2824a(boolean z) {
        if (this.f2261i0 && !z) {
            m2715c();
        }
        this.f2261i0 = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo2826a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo2827a(int i);

    /* renamed from: b */
    public C0503a mo2828b(float f, float f2) {
        float[] fArr = this.f2256d0;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public abstract boolean mo2830b(int i);

    /* renamed from: c */
    public C0503a mo2831c(float f, float f2) {
        float[] fArr = this.f2255c0;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: d */
    public C0503a mo2834d(int i) {
        this.f2251Z = i;
        return this;
    }

    /* renamed from: e */
    public C0503a mo2835e(float f, float f2) {
        float[] fArr = this.f2253b0;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: f */
    public C0503a mo2837f(int i) {
        this.f2254c.mo2843b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2261i0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m2715c()
            goto L_0x0058
        L_0x001a:
            r5.f2259g0 = r2
            r5.f2257e0 = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2247V
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2713a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2247V
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2713a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2254c
            r7.mo2840a(r0, r6)
            boolean r6 = r5.f2260h0
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2829b()
            if (r6 == 0) goto L_0x0058
            r5.m2716d()
        L_0x0058:
            boolean r6 = r5.f2262j0
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2260h0
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0503a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    private float m2717f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2251Z;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f2260h0 || this.f2251Z != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public C0503a mo2833d(float f, float f2) {
        float[] fArr = this.f2249X;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2829b() {
        C0504a aVar = this.f2254c;
        int e = aVar.mo2846e();
        int d = aVar.mo2845d();
        return (e != 0 && mo2830b(e)) || (d != 0 && mo2827a(d));
    }

    /* renamed from: c */
    public C0503a mo2832c(int i) {
        this.f2252a0 = i;
        return this;
    }

    /* renamed from: e */
    public C0503a mo2836e(int i) {
        this.f2254c.mo2841a(i);
        return this;
    }

    /* renamed from: c */
    private void m2715c() {
        if (this.f2258f0) {
            this.f2260h0 = false;
        } else {
            this.f2254c.mo2848g();
        }
    }

    /* renamed from: d */
    private void m2716d() {
        if (this.f2248W == null) {
            this.f2248W = new C0505b();
        }
        this.f2260h0 = true;
        this.f2258f0 = true;
        if (!this.f2257e0) {
            int i = this.f2252a0;
            if (i > 0) {
                C4187x.m14364a(this.f2247V, this.f2248W, (long) i);
                this.f2257e0 = true;
            }
        }
        this.f2248W.run();
        this.f2257e0 = true;
    }

    /* renamed from: a */
    public C0503a mo2823a(float f, float f2) {
        float[] fArr = this.f2250Y;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    private float m2713a(int i, float f, float f2, float f3) {
        float a = m2712a(this.f2249X[i], f2, this.f2250Y[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2253b0[i];
        float f5 = this.f2255c0[i];
        float f6 = this.f2256d0[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m2711a(a * f7, f5, f6);
        }
        return -m2711a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m2712a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2711a(f * f2, 0.0f, f3);
        float f6 = m2717f(f2 - f4, a) - m2717f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f2246U.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2246U.getInterpolation(f6);
        }
        return m2711a(f5, -1.0f, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2825a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2247V.onTouchEvent(obtain);
        obtain.recycle();
    }
}
