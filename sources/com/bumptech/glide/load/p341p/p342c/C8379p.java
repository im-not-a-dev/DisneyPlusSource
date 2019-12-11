package com.bumptech.glide.load.p341p.p342c;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.C8106b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.p.c.p */
/* compiled from: HardwareConfigState */
final class C8379p {

    /* renamed from: c */
    private static final File f17869c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C8379p f17870d;

    /* renamed from: a */
    private volatile int f17871a;

    /* renamed from: b */
    private volatile boolean f17872b = true;

    private C8379p() {
    }

    /* renamed from: a */
    static C8379p m24356a() {
        if (f17870d == null) {
            synchronized (C8379p.class) {
                if (f17870d == null) {
                    f17870d = new C8379p();
                }
            }
        }
        return f17870d;
    }

    /* renamed from: b */
    private synchronized boolean m24357b() {
        int i = this.f17871a + 1;
        this.f17871a = i;
        if (i >= 50) {
            boolean z = false;
            this.f17871a = 0;
            int length = f17869c.list().length;
            if (length < 700) {
                z = true;
            }
            this.f17872b = z;
            if (!this.f17872b && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(700);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f17872b;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    /* renamed from: a */
    public boolean mo21545a(int i, int i2, Options options, C8106b bVar, boolean z, boolean z2) {
        if (!z || VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m24357b();
        if (z3) {
            options.inPreferredConfig = Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
