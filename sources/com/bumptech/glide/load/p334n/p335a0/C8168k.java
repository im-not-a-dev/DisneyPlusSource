package com.bumptech.glide.load.p334n.p335a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.n.a0.k */
/* compiled from: LruBitmapPool */
public class C8168k implements C8159e {

    /* renamed from: j */
    private static final Config f17451j = Config.ARGB_8888;

    /* renamed from: a */
    private final C8171l f17452a;

    /* renamed from: b */
    private final Set<Config> f17453b;

    /* renamed from: c */
    private final C8169a f17454c;

    /* renamed from: d */
    private long f17455d;

    /* renamed from: e */
    private long f17456e;

    /* renamed from: f */
    private int f17457f;

    /* renamed from: g */
    private int f17458g;

    /* renamed from: h */
    private int f17459h;

    /* renamed from: i */
    private int f17460i;

    /* renamed from: com.bumptech.glide.load.n.a0.k$a */
    /* compiled from: LruBitmapPool */
    private interface C8169a {
        /* renamed from: a */
        void mo21261a(Bitmap bitmap);

        /* renamed from: b */
        void mo21262b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.n.a0.k$b */
    /* compiled from: LruBitmapPool */
    private static final class C8170b implements C8169a {
        C8170b() {
        }

        /* renamed from: a */
        public void mo21261a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo21262b(Bitmap bitmap) {
        }
    }

    C8168k(long j, C8171l lVar, Set<Config> set) {
        this.f17455d = j;
        this.f17452a = lVar;
        this.f17453b = set;
        this.f17454c = new C8170b();
    }

    /* renamed from: c */
    private static Bitmap m23720c(int i, int i2, Config config) {
        if (config == null) {
            config = f17451j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: d */
    private synchronized Bitmap m23723d(int i, int i2, Config config) {
        Bitmap a;
        m23718a(config);
        a = this.f17452a.mo21226a(i, i2, config != null ? config : f17451j);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f17452a.mo21229b(i, i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f17458g++;
        } else {
            this.f17457f++;
            this.f17456e -= (long) this.f17452a.mo21228b(a);
            this.f17454c.mo21261a(a);
            m23722c(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f17452a.mo21229b(i, i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m23721c();
        return a;
    }

    /* renamed from: e */
    private void m23725e() {
        m23717a(this.f17455d);
    }

    @TargetApi(26)
    /* renamed from: f */
    private static Set<Config> m23726f() {
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    private static C8171l m23727g() {
        if (VERSION.SDK_INT >= 19) {
            return new C8173n();
        }
        return new C8155c();
    }

    /* renamed from: a */
    public synchronized void mo21244a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f17452a.mo21228b(bitmap)) <= this.f17455d) {
                        if (this.f17453b.contains(bitmap.getConfig())) {
                            int b = this.f17452a.mo21228b(bitmap);
                            this.f17452a.mo21227a(bitmap);
                            this.f17454c.mo21262b(bitmap);
                            this.f17459h++;
                            this.f17456e += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f17452a.mo21230c(bitmap));
                                Log.v("LruBitmapPool", sb.toString());
                            }
                            m23721c();
                            m23725e();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f17452a.mo21230c(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f17453b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: b */
    public long mo21260b() {
        return this.f17455d;
    }

    /* renamed from: c */
    private static void m23722c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m23719b(bitmap);
    }

    /* renamed from: b */
    public Bitmap mo21245b(int i, int i2, Config config) {
        Bitmap d = m23723d(i, i2, config);
        return d == null ? m23720c(i, i2, config) : d;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static void m23719b(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: c */
    private void m23721c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m23724d();
        }
    }

    public C8168k(long j) {
        this(j, m23727g(), m23726f());
    }

    /* renamed from: d */
    private void m23724d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f17457f);
        sb.append(", misses=");
        sb.append(this.f17458g);
        sb.append(", puts=");
        sb.append(this.f17459h);
        sb.append(", evictions=");
        sb.append(this.f17460i);
        sb.append(", currentSize=");
        sb.append(this.f17456e);
        sb.append(", maxSize=");
        sb.append(this.f17455d);
        sb.append("\nStrategy=");
        sb.append(this.f17452a);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* renamed from: a */
    public Bitmap mo21241a(int i, int i2, Config config) {
        Bitmap d = m23723d(i, i2, config);
        if (d == null) {
            return m23720c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m23718a(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(config);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo21242a() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        m23717a(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo21243a(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d(str, sb.toString());
        }
        if (i >= 40) {
            mo21242a();
        } else if (i >= 20 || i == 15) {
            m23717a(mo21260b() / 2);
        }
    }

    /* renamed from: a */
    private synchronized void m23717a(long j) {
        while (this.f17456e > j) {
            Bitmap a = this.f17452a.mo21225a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m23724d();
                }
                this.f17456e = 0;
                return;
            }
            this.f17454c.mo21261a(a);
            this.f17456e -= (long) this.f17452a.mo21228b(a);
            this.f17460i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f17452a.mo21230c(a));
                Log.d("LruBitmapPool", sb.toString());
            }
            m23721c();
            a.recycle();
        }
    }
}
