package com.bumptech.glide.load.p334n.p336b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.n.b0.i */
/* compiled from: MemorySizeCalculator */
public final class C8193i {

    /* renamed from: a */
    private final int f17488a;

    /* renamed from: b */
    private final int f17489b;

    /* renamed from: c */
    private final Context f17490c;

    /* renamed from: d */
    private final int f17491d;

    /* renamed from: com.bumptech.glide.load.n.b0.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C8194a {

        /* renamed from: i */
        static final int f17492i = (VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f17493a;

        /* renamed from: b */
        ActivityManager f17494b;

        /* renamed from: c */
        C8196c f17495c;

        /* renamed from: d */
        float f17496d = 2.0f;

        /* renamed from: e */
        float f17497e = ((float) f17492i);

        /* renamed from: f */
        float f17498f = 0.4f;

        /* renamed from: g */
        float f17499g = 0.33f;

        /* renamed from: h */
        int f17500h = 4194304;

        public C8194a(Context context) {
            this.f17493a = context;
            this.f17494b = (ActivityManager) context.getSystemService("activity");
            this.f17495c = new C8195b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && C8193i.m23792a(this.f17494b)) {
                this.f17497e = 0.0f;
            }
        }

        /* renamed from: a */
        public C8193i mo21291a() {
            return new C8193i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C8195b implements C8196c {

        /* renamed from: a */
        private final DisplayMetrics f17501a;

        C8195b(DisplayMetrics displayMetrics) {
            this.f17501a = displayMetrics;
        }

        /* renamed from: a */
        public int mo21292a() {
            return this.f17501a.heightPixels;
        }

        /* renamed from: b */
        public int mo21293b() {
            return this.f17501a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C8196c {
        /* renamed from: a */
        int mo21292a();

        /* renamed from: b */
        int mo21293b();
    }

    C8193i(C8194a aVar) {
        int i;
        this.f17490c = aVar.f17493a;
        if (m23792a(aVar.f17494b)) {
            i = aVar.f17500h / 2;
        } else {
            i = aVar.f17500h;
        }
        this.f17491d = i;
        int a = m23790a(aVar.f17494b, aVar.f17498f, aVar.f17499g);
        float b = (float) (aVar.f17495c.mo21293b() * aVar.f17495c.mo21292a() * 4);
        int round = Math.round(aVar.f17497e * b);
        int round2 = Math.round(b * aVar.f17496d);
        int i2 = a - this.f17491d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f17489b = round2;
            this.f17488a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f17497e;
            float f3 = aVar.f17496d;
            float f4 = f / (f2 + f3);
            this.f17489b = Math.round(f3 * f4);
            this.f17488a = Math.round(f4 * aVar.f17497e);
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m23791a(this.f17489b));
            sb.append(", pool size: ");
            sb.append(m23791a(this.f17488a));
            sb.append(", byte array size: ");
            sb.append(m23791a(this.f17491d));
            sb.append(", memory class limited? ");
            sb.append(i3 > a);
            sb.append(", max size: ");
            sb.append(m23791a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f17494b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m23792a(aVar.f17494b));
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public int mo21288a() {
        return this.f17491d;
    }

    /* renamed from: b */
    public int mo21289b() {
        return this.f17488a;
    }

    /* renamed from: c */
    public int mo21290c() {
        return this.f17489b;
    }

    /* renamed from: a */
    private static int m23790a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (m23792a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m23791a(int i) {
        return Formatter.formatFileSize(this.f17490c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m23792a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }
}
