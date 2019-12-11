package com.google.android.exoplayer2.p391ui.p392r;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.p391ui.p392r.C9424d.C9425a;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p394w0.C9597n;
import com.google.android.exoplayer2.p394w0.p395s.C9605a;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.exoplayer2.ui.r.h */
/* compiled from: SphericalSurfaceView */
public final class C9430h extends GLSurfaceView {

    /* renamed from: U */
    private final Sensor f21910U;

    /* renamed from: V */
    private final C9424d f21911V;

    /* renamed from: W */
    private final C9431a f21912W;

    /* renamed from: a0 */
    private final Handler f21913a0;

    /* renamed from: b0 */
    private final C9432i f21914b0;

    /* renamed from: c */
    private final SensorManager f21915c;

    /* renamed from: c0 */
    private final C9428f f21916c0;

    /* renamed from: d0 */
    private SurfaceTexture f21917d0;

    /* renamed from: e0 */
    private Surface f21918e0;

    /* renamed from: f0 */
    private VideoComponent f21919f0;

    /* renamed from: com.google.android.exoplayer2.ui.r.h$a */
    /* compiled from: SphericalSurfaceView */
    class C9431a implements Renderer, C9433a, C9425a {

        /* renamed from: U */
        private final float[] f21920U = new float[16];

        /* renamed from: V */
        private final float[] f21921V = new float[16];

        /* renamed from: W */
        private final float[] f21922W = new float[16];

        /* renamed from: X */
        private final float[] f21923X = new float[16];

        /* renamed from: Y */
        private final float[] f21924Y = new float[16];

        /* renamed from: Z */
        private float f21925Z;

        /* renamed from: a0 */
        private float f21926a0;

        /* renamed from: b0 */
        private final float[] f21927b0 = new float[16];

        /* renamed from: c */
        private final C9428f f21928c;

        /* renamed from: c0 */
        private final float[] f21929c0 = new float[16];

        public C9431a(C9428f fVar) {
            this.f21928c = fVar;
            Matrix.setIdentityM(this.f21922W, 0);
            Matrix.setIdentityM(this.f21923X, 0);
            Matrix.setIdentityM(this.f21924Y, 0);
            this.f21926a0 = 3.1415927f;
        }

        /* renamed from: a */
        public synchronized void mo24416a(float[] fArr, float f) {
            System.arraycopy(fArr, 0, this.f21922W, 0, this.f21922W.length);
            this.f21926a0 = -f;
            m28931a();
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f21929c0, 0, this.f21922W, 0, this.f21924Y, 0);
                Matrix.multiplyMM(this.f21927b0, 0, this.f21923X, 0, this.f21929c0, 0);
            }
            Matrix.multiplyMM(this.f21921V, 0, this.f21920U, 0, this.f21927b0, 0);
            this.f21928c.mo24425a(this.f21921V, false);
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = ((float) i) / ((float) i2);
            Matrix.perspectiveM(this.f21920U, 0, m28930a(f), f, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C9430h.this.m28927b(this.f21928c.mo24426b());
        }

        /* renamed from: a */
        private void m28931a() {
            Matrix.setRotateM(this.f21923X, 0, -this.f21925Z, (float) Math.cos((double) this.f21926a0), (float) Math.sin((double) this.f21926a0), 0.0f);
        }

        /* renamed from: a */
        public synchronized void mo24435a(PointF pointF) {
            this.f21925Z = pointF.y;
            m28931a();
            Matrix.setRotateM(this.f21924Y, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        /* renamed from: a */
        private float m28930a(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }
    }

    public C9430h(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28927b(SurfaceTexture surfaceTexture) {
        this.f21913a0.post(new C9422b(this, surfaceTexture));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21913a0.post(new C9423c(this));
    }

    public void onPause() {
        if (this.f21910U != null) {
            this.f21915c.unregisterListener(this.f21911V);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Sensor sensor = this.f21910U;
        if (sensor != null) {
            this.f21915c.registerListener(this.f21911V, sensor, 0);
        }
    }

    public void setDefaultStereoMode(int i) {
        this.f21916c0.mo24421a(i);
    }

    public void setSingleTapListener(C9429g gVar) {
        this.f21914b0.mo24439a(gVar);
    }

    public void setVideoComponent(VideoComponent videoComponent) {
        VideoComponent videoComponent2 = this.f21919f0;
        if (videoComponent != videoComponent2) {
            if (videoComponent2 != null) {
                Surface surface = this.f21918e0;
                if (surface != null) {
                    videoComponent2.mo22628b(surface);
                }
                this.f21919f0.mo22631b((C9597n) this.f21916c0);
                this.f21919f0.mo22633b((C9605a) this.f21916c0);
            }
            this.f21919f0 = videoComponent;
            VideoComponent videoComponent3 = this.f21919f0;
            if (videoComponent3 != null) {
                videoComponent3.mo22625a((C9597n) this.f21916c0);
                this.f21919f0.mo22627a((C9605a) this.f21916c0);
                this.f21919f0.mo22622a(this.f21918e0);
            }
        }
    }

    public C9430h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21913a0 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        Assertions.checkNotNull(systemService);
        this.f21915c = (SensorManager) systemService;
        Sensor defaultSensor = Util.SDK_INT >= 18 ? this.f21915c.getDefaultSensor(15) : null;
        if (defaultSensor == null) {
            defaultSensor = this.f21915c.getDefaultSensor(11);
        }
        this.f21910U = defaultSensor;
        this.f21916c0 = new C9428f();
        this.f21912W = new C9431a(this.f21916c0);
        this.f21914b0 = new C9432i(context, this.f21912W, 25.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Assertions.checkNotNull(windowManager);
        this.f21911V = new C9424d(windowManager.getDefaultDisplay(), this.f21914b0, this.f21912W);
        setEGLContextClientVersion(2);
        setRenderer(this.f21912W);
        setOnTouchListener(this.f21914b0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo24427a() {
        Surface surface = this.f21918e0;
        if (surface != null) {
            VideoComponent videoComponent = this.f21919f0;
            if (videoComponent != null) {
                videoComponent.mo22628b(surface);
            }
            m28925a(this.f21917d0, this.f21918e0);
            this.f21917d0 = null;
            this.f21918e0 = null;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo24428a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f21917d0;
        Surface surface = this.f21918e0;
        this.f21917d0 = surfaceTexture;
        this.f21918e0 = new Surface(surfaceTexture);
        VideoComponent videoComponent = this.f21919f0;
        if (videoComponent != null) {
            videoComponent.mo22622a(this.f21918e0);
        }
        m28925a(surfaceTexture2, surface);
    }

    /* renamed from: a */
    private static void m28925a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
