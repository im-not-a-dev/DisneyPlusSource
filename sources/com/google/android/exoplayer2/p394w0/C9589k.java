package com.google.android.exoplayer2.p394w0;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9550k;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;

@TargetApi(17)
/* renamed from: com.google.android.exoplayer2.w0.k */
/* compiled from: DummySurface */
public final class C9589k extends Surface {

    /* renamed from: V */
    private static int f22382V;

    /* renamed from: W */
    private static boolean f22383W;

    /* renamed from: U */
    private boolean f22384U;

    /* renamed from: c */
    private final C9591b f22385c;

    /* renamed from: com.google.android.exoplayer2.w0.k$b */
    /* compiled from: DummySurface */
    private static class C9591b extends HandlerThread implements Callback {

        /* renamed from: U */
        private Handler f22386U;

        /* renamed from: V */
        private Error f22387V;

        /* renamed from: W */
        private RuntimeException f22388W;

        /* renamed from: X */
        private C9589k f22389X;

        /* renamed from: c */
        private C9550k f22390c;

        public C9591b() {
            super("dummySurface");
        }

        /* renamed from: b */
        private void m29622b(int i) {
            C9537e.m29296a(this.f22390c);
            this.f22390c.mo24641a(i);
            this.f22389X = new C9589k(this, this.f22390c.mo24640a(), i != 0);
        }

        /* renamed from: a */
        public C9589k mo24751a(int i) {
            boolean z;
            start();
            this.f22386U = new Handler(getLooper(), this);
            this.f22390c = new C9550k(this.f22386U);
            synchronized (this) {
                z = false;
                this.f22386U.obtainMessage(1, i, 0).sendToTarget();
                while (this.f22389X == null && this.f22388W == null && this.f22387V == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f22388W;
            if (runtimeException == null) {
                Error error = this.f22387V;
                if (error == null) {
                    C9589k kVar = this.f22389X;
                    C9537e.m29296a(kVar);
                    return kVar;
                }
                throw error;
            }
            throw runtimeException;
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    m29622b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.m29496a("DummySurface", "Failed to initialize dummy surface", e);
                    this.f22388W = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        Log.m29496a("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f22387V = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    m29621b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }

        /* renamed from: b */
        private void m29621b() {
            C9537e.m29296a(this.f22390c);
            this.f22390c.mo24642b();
        }

        /* renamed from: a */
        public void mo24752a() {
            C9537e.m29296a(this.f22386U);
            this.f22386U.sendEmptyMessage(2);
        }
    }

    /* renamed from: X */
    private static void m29617X() {
        if (Util.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    /* renamed from: a */
    public static C9589k m29619a(Context context, boolean z) {
        m29617X();
        int i = 0;
        C9537e.m29301b(!z || m29620b(context));
        C9591b bVar = new C9591b();
        if (z) {
            i = f22382V;
        }
        return bVar.mo24751a(i);
    }

    /* renamed from: b */
    public static synchronized boolean m29620b(Context context) {
        boolean z;
        synchronized (C9589k.class) {
            z = true;
            if (!f22383W) {
                f22382V = Util.SDK_INT < 24 ? 0 : m29618a(context);
                f22383W = true;
            }
            if (f22382V == 0) {
                z = false;
            }
        }
        return z;
    }

    public void release() {
        super.release();
        synchronized (this.f22385c) {
            if (!this.f22384U) {
                this.f22385c.mo24752a();
                this.f22384U = true;
            }
        }
    }

    private C9589k(C9591b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f22385c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ("XT1650".equals(com.google.android.exoplayer2.p393v0.Util.MODEL) != false) goto L_0x001b;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m29618a(android.content.Context r4) {
        /*
            int r0 = com.google.android.exoplayer2.p393v0.Util.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 >= r1) goto L_0x001c
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.Util.MANUFACTURER
            java.lang.String r3 = "samsung"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = com.google.android.exoplayer2.p393v0.Util.MODEL
            java.lang.String r3 = "XT1650"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return r2
        L_0x001c:
            int r0 = com.google.android.exoplayer2.p393v0.Util.SDK_INT
            if (r0 >= r1) goto L_0x002d
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r4 = r4.hasSystemFeature(r0)
            if (r4 != 0) goto L_0x002d
            return r2
        L_0x002d:
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.eglGetDisplay(r2)
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r4 = android.opengl.EGL14.eglQueryString(r4, r0)
            if (r4 != 0) goto L_0x003a
            return r2
        L_0x003a:
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0043
            return r2
        L_0x0043:
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 2
        L_0x004e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p394w0.C9589k.m29618a(android.content.Context):int");
    }
}
