package com.google.android.exoplayer2.p394w0;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.w0.o */
/* compiled from: VideoFrameReleaseTimeHelper */
public final class C9598o {

    /* renamed from: a */
    private final WindowManager f22438a;

    /* renamed from: b */
    private final C9600b f22439b;

    /* renamed from: c */
    private final C9599a f22440c;

    /* renamed from: d */
    private long f22441d;

    /* renamed from: e */
    private long f22442e;

    /* renamed from: f */
    private long f22443f;

    /* renamed from: g */
    private long f22444g;

    /* renamed from: h */
    private long f22445h;

    /* renamed from: i */
    private boolean f22446i;

    /* renamed from: j */
    private long f22447j;

    /* renamed from: k */
    private long f22448k;

    /* renamed from: l */
    private long f22449l;

    @TargetApi(17)
    /* renamed from: com.google.android.exoplayer2.w0.o$a */
    /* compiled from: VideoFrameReleaseTimeHelper */
    private final class C9599a implements DisplayListener {

        /* renamed from: a */
        private final DisplayManager f22450a;

        public C9599a(DisplayManager displayManager) {
            this.f22450a = displayManager;
        }

        /* renamed from: a */
        public void mo24770a() {
            this.f22450a.registerDisplayListener(this, null);
        }

        /* renamed from: b */
        public void mo24771b() {
            this.f22450a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                C9598o.this.m29688c();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.w0.o$b */
    /* compiled from: VideoFrameReleaseTimeHelper */
    private static final class C9600b implements FrameCallback, Callback {

        /* renamed from: Y */
        private static final C9600b f22452Y = new C9600b();

        /* renamed from: U */
        private final Handler f22453U;

        /* renamed from: V */
        private final HandlerThread f22454V = new HandlerThread("ChoreographerOwner:Handler");

        /* renamed from: W */
        private Choreographer f22455W;

        /* renamed from: X */
        private int f22456X;

        /* renamed from: c */
        public volatile long f22457c = -9223372036854775807L;

        private C9600b() {
            this.f22454V.start();
            this.f22453U = Util.m29393a(this.f22454V.getLooper(), (Callback) this);
            this.f22453U.sendEmptyMessage(0);
        }

        /* renamed from: c */
        private void m29694c() {
            this.f22456X++;
            if (this.f22456X == 1) {
                this.f22455W.postFrameCallback(this);
            }
        }

        /* renamed from: d */
        private void m29695d() {
            this.f22455W = Choreographer.getInstance();
        }

        /* renamed from: e */
        public static C9600b m29696e() {
            return f22452Y;
        }

        /* renamed from: f */
        private void m29697f() {
            this.f22456X--;
            if (this.f22456X == 0) {
                this.f22455W.removeFrameCallback(this);
                this.f22457c = -9223372036854775807L;
            }
        }

        /* renamed from: a */
        public void mo24775a() {
            this.f22453U.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public void mo24776b() {
            this.f22453U.sendEmptyMessage(2);
        }

        public void doFrame(long j) {
            this.f22457c = j;
            this.f22455W.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m29695d();
                return true;
            } else if (i == 1) {
                m29694c();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                m29697f();
                return true;
            }
        }
    }

    public C9598o(Context context) {
        C9599a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f22438a = (WindowManager) context.getSystemService("window");
        } else {
            this.f22438a = null;
        }
        if (this.f22438a != null) {
            if (Util.SDK_INT >= 17) {
                aVar = m29685a(context);
            }
            this.f22440c = aVar;
            this.f22439b = C9600b.m29696e();
        } else {
            this.f22440c = null;
            this.f22439b = null;
        }
        this.f22441d = -9223372036854775807L;
        this.f22442e = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29688c() {
        Display defaultDisplay = this.f22438a.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.f22441d = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f22442e = (this.f22441d * 80) / 100;
        }
    }

    /* renamed from: b */
    public void mo24769b() {
        this.f22446i = false;
        if (this.f22438a != null) {
            this.f22439b.mo24775a();
            C9599a aVar = this.f22440c;
            if (aVar != null) {
                aVar.mo24770a();
            }
            m29688c();
        }
    }

    /* renamed from: a */
    public void mo24768a() {
        if (this.f22438a != null) {
            C9599a aVar = this.f22440c;
            if (aVar != null) {
                aVar.mo24771b();
            }
            this.f22439b.mo24776b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24767a(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f22446i
            if (r2 == 0) goto L_0x0042
            long r2 = r10.f22443f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.f22449l
            r4 = 1
            long r2 = r2 + r4
            r10.f22449l = r2
            long r2 = r10.f22445h
            r10.f22444g = r2
        L_0x0019:
            long r2 = r10.f22449l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.f22448k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f22444g
            long r2 = r2 + r4
            boolean r4 = r10.m29687b(r2, r13)
            if (r4 == 0) goto L_0x0033
            r10.f22446i = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r10.f22447j
            long r4 = r4 + r2
            long r6 = r10.f22448k
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r10.m29687b(r0, r13)
            if (r2 == 0) goto L_0x0042
            r10.f22446i = r6
        L_0x0042:
            r4 = r13
            r2 = r0
        L_0x0044:
            boolean r6 = r10.f22446i
            if (r6 != 0) goto L_0x0053
            r10.f22448k = r0
            r10.f22447j = r13
            r13 = 0
            r10.f22449l = r13
            r13 = 1
            r10.f22446i = r13
        L_0x0053:
            r10.f22443f = r11
            r10.f22445h = r2
            com.google.android.exoplayer2.w0.o$b r11 = r10.f22439b
            if (r11 == 0) goto L_0x0078
            long r12 = r10.f22441d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            long r6 = r11.f22457c
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r8 = r10.f22441d
            long r11 = m29684a(r4, r6, r8)
            long r13 = r10.f22442e
            long r11 = r11 - r13
            return r11
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p394w0.C9598o.mo24767a(long, long):long");
    }

    /* renamed from: b */
    private boolean m29687b(long j, long j2) {
        return Math.abs((j2 - this.f22447j) - (j - this.f22448k)) > 20000000;
    }

    @TargetApi(17)
    /* renamed from: a */
    private C9599a m29685a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C9599a(displayManager);
    }

    /* renamed from: a */
    private static long m29684a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }
}
