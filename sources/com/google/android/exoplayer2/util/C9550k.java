package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
/* renamed from: com.google.android.exoplayer2.v0.k */
/* compiled from: EGLSurfaceTexture */
public final class C9550k implements OnFrameAvailableListener, Runnable {

    /* renamed from: a0 */
    private static final int[] f22273a0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: U */
    private final int[] f22274U;

    /* renamed from: V */
    private final C9553c f22275V;

    /* renamed from: W */
    private EGLDisplay f22276W;

    /* renamed from: X */
    private EGLContext f22277X;

    /* renamed from: Y */
    private EGLSurface f22278Y;

    /* renamed from: Z */
    private SurfaceTexture f22279Z;

    /* renamed from: c */
    private final Handler f22280c;

    /* renamed from: com.google.android.exoplayer2.v0.k$b */
    /* compiled from: EGLSurfaceTexture */
    public static final class C9552b extends RuntimeException {
        private C9552b(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.v0.k$c */
    /* compiled from: EGLSurfaceTexture */
    public interface C9553c {
        /* renamed from: a */
        void mo24645a();
    }

    public C9550k(Handler handler) {
        this(handler, null);
    }

    /* renamed from: c */
    private void m29373c() {
        C9553c cVar = this.f22275V;
        if (cVar != null) {
            cVar.mo24645a();
        }
    }

    /* renamed from: d */
    private static EGLDisplay m29374d() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C9552b("eglInitialize failed");
        }
        throw new C9552b("eglGetDisplay failed");
    }

    /* renamed from: a */
    public void mo24641a(int i) {
        this.f22276W = m29374d();
        EGLConfig a = m29369a(this.f22276W);
        this.f22277X = m29370a(this.f22276W, a, i);
        this.f22278Y = m29371a(this.f22276W, a, this.f22277X, i);
        m29372a(this.f22274U);
        this.f22279Z = new SurfaceTexture(this.f22274U[0]);
        this.f22279Z.setOnFrameAvailableListener(this);
    }

    /* renamed from: b */
    public void mo24642b() {
        this.f22280c.removeCallbacks(this);
        try {
            if (this.f22279Z != null) {
                this.f22279Z.release();
                GLES20.glDeleteTextures(1, this.f22274U, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f22276W;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f22276W;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f22278Y;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22276W, this.f22278Y);
            }
            EGLContext eGLContext = this.f22277X;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f22276W, eGLContext);
            }
            if (Util.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f22276W;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22276W);
            }
            this.f22276W = null;
            this.f22277X = null;
            this.f22278Y = null;
            this.f22279Z = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22280c.post(this);
    }

    public void run() {
        m29373c();
        SurfaceTexture surfaceTexture = this.f22279Z;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C9550k(Handler handler, C9553c cVar) {
        this.f22280c = handler;
        this.f22275V = cVar;
        this.f22274U = new int[1];
    }

    /* renamed from: a */
    public SurfaceTexture mo24640a() {
        SurfaceTexture surfaceTexture = this.f22279Z;
        Assertions.checkNotNull(surfaceTexture);
        return surfaceTexture;
    }

    /* renamed from: a */
    private static EGLConfig m29369a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f22273a0, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C9552b(Util.m29397a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    /* renamed from: a */
    private static EGLContext m29370a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C9552b("eglCreateContext failed");
    }

    /* renamed from: a */
    private static EGLSurface m29371a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new C9552b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C9552b("eglMakeCurrent failed");
    }

    /* renamed from: a */
    private static void m29372a(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C9561o.m29483a();
    }
}
