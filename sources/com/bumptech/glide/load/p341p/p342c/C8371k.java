package com.bumptech.glide.load.p341p.p342c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C8106b;
import com.bumptech.glide.load.C8110f;
import com.bumptech.glide.load.C8112h;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p341p.p342c.C8363j.C8370g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import net.danlew.android.joda.DateUtils;
import p163g.p413f.p414a.p424w.C10770f;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.c.k */
/* compiled from: Downsampler */
public final class C8371k {

    /* renamed from: f */
    public static final C8112h<C8106b> f17853f = C8112h.m23532a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C8106b.f17363V);

    /* renamed from: g */
    public static final C8112h<Boolean> f17854g;

    /* renamed from: h */
    public static final C8112h<Boolean> f17855h;

    /* renamed from: i */
    private static final Set<String> f17856i = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: j */
    private static final C8373b f17857j = new C8372a();

    /* renamed from: k */
    private static final Set<ImageType> f17858k = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));

    /* renamed from: l */
    private static final Queue<Options> f17859l = C10775k.m34028a(0);

    /* renamed from: a */
    private final C8159e f17860a;

    /* renamed from: b */
    private final DisplayMetrics f17861b;

    /* renamed from: c */
    private final C8154b f17862c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f17863d;

    /* renamed from: e */
    private final C8379p f17864e = C8379p.m24356a();

    /* renamed from: com.bumptech.glide.load.p.c.k$a */
    /* compiled from: Downsampler */
    class C8372a implements C8373b {
        C8372a() {
        }

        /* renamed from: a */
        public void mo21542a() {
        }

        /* renamed from: a */
        public void mo21543a(C8159e eVar, Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.c.k$b */
    /* compiled from: Downsampler */
    public interface C8373b {
        /* renamed from: a */
        void mo21542a();

        /* renamed from: a */
        void mo21543a(C8159e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        C8112h<C8363j> hVar = C8363j.f17849f;
        Boolean valueOf = Boolean.valueOf(false);
        f17854g = C8112h.m23532a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", valueOf);
        f17855h = C8112h.m23532a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", valueOf);
    }

    public C8371k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C8159e eVar, C8154b bVar) {
        this.f17863d = list;
        C10774j.m34012a(displayMetrics);
        this.f17861b = displayMetrics;
        C10774j.m34012a(eVar);
        this.f17860a = eVar;
        C10774j.m34012a(bVar);
        this.f17862c = bVar;
    }

    /* renamed from: b */
    private static int m24330b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: c */
    private static int m24333c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m24334c(Options options) {
        m24335d(options);
        synchronized (f17859l) {
            f17859l.offer(options);
        }
    }

    /* renamed from: d */
    private static void m24335d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21538a(InputStream inputStream, int i, int i2, C8115i iVar) throws IOException {
        return mo21539a(inputStream, i, i2, iVar, f17857j);
    }

    /* renamed from: a */
    public boolean mo21540a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo21541a(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: b */
    private static int[] m24332b(InputStream inputStream, Options options, C8373b bVar, C8159e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m24320a(inputStream, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21539a(InputStream inputStream, int i, int i2, C8115i iVar, C8373b bVar) throws IOException {
        C8115i iVar2 = iVar;
        C10774j.m34016a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f17862c.mo21224b(DateUtils.FORMAT_ABBREV_MONTH, byte[].class);
        Options a = m24321a();
        a.inTempStorage = bArr;
        try {
            return C8353d.m24266a(m24319a(inputStream, a, (C8363j) iVar2.mo21162a(C8363j.f17849f), (C8106b) iVar2.mo21162a(f17853f), iVar2.mo21162a(f17855h) != null && ((Boolean) iVar2.mo21162a(f17855h)).booleanValue(), i, i2, ((Boolean) iVar2.mo21162a(f17854g)).booleanValue(), bVar), this.f17860a);
        } finally {
            m24334c(a);
            this.f17862c.mo21223a(bArr);
        }
    }

    /* renamed from: b */
    private static boolean m24331b(Options options) {
        int i = options.inTargetDensity;
        if (i > 0) {
            int i2 = options.inDensity;
            if (i2 > 0 && i != i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private Bitmap m24319a(InputStream inputStream, Options options, C8363j jVar, C8106b bVar, boolean z, int i, int i2, boolean z2, C8373b bVar2) throws IOException {
        C8371k kVar;
        int i3;
        int i4;
        int i5;
        InputStream inputStream2 = inputStream;
        Options options2 = options;
        C8373b bVar3 = bVar2;
        long a = C10770f.m33999a();
        int[] b = m24332b(inputStream2, options2, bVar3, this.f17860a);
        boolean z3 = false;
        int i6 = b[0];
        int i7 = b[1];
        String str = options2.outMimeType;
        boolean z4 = (i6 == -1 || i7 == -1) ? false : z;
        int a2 = C8110f.m23527a(this.f17863d, inputStream2, this.f17862c);
        int a3 = C8386u.m24376a(a2);
        boolean b2 = C8386u.m24386b(a2);
        int i8 = i;
        int i9 = i2;
        int i10 = i8 == Integer.MIN_VALUE ? i6 : i8;
        int i11 = i9 == Integer.MIN_VALUE ? i7 : i9;
        ImageType b3 = C8110f.m23529b(this.f17863d, inputStream2, this.f17862c);
        C8159e eVar = this.f17860a;
        ImageType imageType = b3;
        m24327a(b3, inputStream, bVar2, eVar, jVar, a3, i6, i7, i10, i11, options);
        int i12 = a2;
        String str2 = str;
        int i13 = i7;
        int i14 = i6;
        C8373b bVar4 = bVar3;
        Options options3 = options2;
        m24328a(inputStream, bVar, z4, b2, options, i10, i11);
        if (VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        String str3 = "Downsampler";
        if (options3.inSampleSize == 1 || z3) {
            kVar = this;
            if (kVar.m24329a(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z3) {
                    float f = m24331b(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i15 = options3.inSampleSize;
                    float f2 = (float) i15;
                    int ceil = (int) Math.ceil((double) (((float) i14) / f2));
                    int ceil2 = (int) Math.ceil((double) (((float) i13) / f2));
                    i5 = Math.round(((float) ceil) * f);
                    i4 = Math.round(((float) ceil2) * f);
                    if (Log.isLoggable(str3, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(i5);
                        String str4 = "x";
                        sb.append(str4);
                        sb.append(i4);
                        sb.append("] for source [");
                        sb.append(i14);
                        sb.append(str4);
                        sb.append(i13);
                        sb.append("], sampleSize: ");
                        sb.append(i15);
                        sb.append(", targetDensity: ");
                        sb.append(options3.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options3.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f);
                        Log.v(str3, sb.toString());
                    }
                } else {
                    i5 = i10;
                    i4 = i11;
                }
                if (i5 > 0 && i4 > 0) {
                    m24326a(options3, kVar.f17860a, i5, i4);
                }
            }
        } else {
            kVar = this;
        }
        Bitmap a4 = m24320a(inputStream, options3, bVar4, kVar.f17860a);
        bVar4.mo21543a(kVar.f17860a, a4);
        if (Log.isLoggable(str3, 2)) {
            i3 = i12;
            m24325a(i14, i13, str2, options, a4, i, i2, a);
        } else {
            i3 = i12;
        }
        Bitmap bitmap = null;
        if (a4 != null) {
            a4.setDensity(kVar.f17861b.densityDpi);
            bitmap = C8386u.m24378a(kVar.f17860a, a4, i3);
            if (!a4.equals(bitmap)) {
                kVar.f17860a.mo21244a(a4);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static void m24327a(ImageType imageType, InputStream inputStream, C8373b bVar, C8159e eVar, C8363j jVar, int i, int i2, int i3, int i4, int i5, Options options) throws IOException {
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        ImageType imageType2 = imageType;
        C8363j jVar2 = jVar;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        Options options2 = options;
        String str = "]";
        String str2 = "Downsampler";
        String str3 = "x";
        if (i11 <= 0 || i12 <= 0) {
            String str4 = str2;
            String str5 = str3;
            if (Log.isLoggable(str4, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i13);
                sb.append(str5);
                sb.append(i14);
                sb.append(str);
                Log.d(str4, sb.toString());
            }
            return;
        }
        if (i10 == 90 || i10 == 270) {
            f = jVar2.mo21537b(i12, i11, i13, i14);
        } else {
            f = jVar2.mo21537b(i11, i12, i13, i14);
        }
        String str6 = "], target: [";
        if (f > 0.0f) {
            C8370g a = jVar2.mo21536a(i11, i12, i13, i14);
            if (a != null) {
                float f2 = (float) i11;
                float f3 = (float) i12;
                String str7 = str2;
                String str8 = str3;
                int c = i11 / m24333c((double) (f * f2));
                int c2 = i12 / m24333c((double) (f * f3));
                if (a == C8370g.MEMORY) {
                    i6 = Math.max(c, c2);
                } else {
                    i6 = Math.min(c, c2);
                }
                if (VERSION.SDK_INT > 23 || !f17856i.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i6));
                    i7 = (a != C8370g.MEMORY || ((float) max) >= 1.0f / f) ? max : max << 1;
                } else {
                    i7 = 1;
                }
                options2.inSampleSize = i7;
                if (imageType2 == ImageType.JPEG) {
                    float min = (float) Math.min(i7, 8);
                    i8 = (int) Math.ceil((double) (f2 / min));
                    i9 = (int) Math.ceil((double) (f3 / min));
                    int i15 = i7 / 8;
                    if (i15 > 0) {
                        i8 /= i15;
                        i9 /= i15;
                    }
                } else {
                    if (imageType2 == ImageType.PNG || imageType2 == ImageType.PNG_A) {
                        float f4 = (float) i7;
                        i8 = (int) Math.floor((double) (f2 / f4));
                        d = Math.floor((double) (f3 / f4));
                    } else if (imageType2 == ImageType.WEBP || imageType2 == ImageType.WEBP_A) {
                        if (VERSION.SDK_INT >= 24) {
                            float f5 = (float) i7;
                            i8 = Math.round(f2 / f5);
                            i9 = Math.round(f3 / f5);
                        } else {
                            float f6 = (float) i7;
                            i8 = (int) Math.floor((double) (f2 / f6));
                            d = Math.floor((double) (f3 / f6));
                        }
                    } else if (i11 % i7 == 0 && i12 % i7 == 0) {
                        i8 = i11 / i7;
                        i9 = i12 / i7;
                    } else {
                        int[] b = m24332b(inputStream, options2, bVar, eVar);
                        int i16 = b[0];
                        i9 = b[1];
                        i8 = i16;
                    }
                    i9 = (int) d;
                }
                double b2 = (double) jVar2.mo21537b(i8, i9, i13, i14);
                if (VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m24318a(b2);
                    options2.inDensity = m24330b(b2);
                }
                if (m24331b(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str9 = str7;
                if (Log.isLoggable(str9, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i11);
                    String str10 = str8;
                    sb2.append(str10);
                    sb2.append(i12);
                    sb2.append(str6);
                    sb2.append(i13);
                    sb2.append(str10);
                    sb2.append(i14);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i8);
                    sb2.append(str10);
                    sb2.append(i9);
                    sb2.append("], exact scale factor: ");
                    sb2.append(f);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i7);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b2);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    Log.v(str9, sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        String str11 = str3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot scale with factor: ");
        sb3.append(f);
        sb3.append(" from: ");
        sb3.append(jVar2);
        sb3.append(", source: [");
        sb3.append(i11);
        sb3.append(str11);
        sb3.append(i12);
        sb3.append(str6);
        sb3.append(i13);
        sb3.append(str11);
        sb3.append(i14);
        sb3.append(str);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private static int m24318a(double d) {
        int b = m24330b(d);
        int c = m24333c(((double) b) * d);
        return m24333c((d / ((double) (((float) c) / ((float) b)))) * ((double) c));
    }

    /* renamed from: a */
    private boolean m24329a(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f17858k.contains(imageType);
    }

    /* renamed from: a */
    private void m24328a(InputStream inputStream, C8106b bVar, boolean z, boolean z2, Options options, int i, int i2) {
        if (!this.f17864e.mo21545a(i, i2, options, bVar, z, z2)) {
            if (bVar == C8106b.PREFER_ARGB_8888 || VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C8110f.m23529b(this.f17863d, inputStream, this.f17862c).hasAlpha();
            } catch (IOException e) {
                String str = "Downsampler";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(bVar);
                    Log.d(str, sb.toString(), e);
                }
            }
            options.inPreferredConfig = z3 ? Config.ARGB_8888 : Config.RGB_565;
            if (options.inPreferredConfig == Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m24320a(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.p341p.p342c.C8371k.C8373b r8, com.bumptech.glide.load.p334n.p335a0.C8159e r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.mo21542a()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p341p.p342c.C8386u.m24380a()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.p341p.p342c.C8386u.m24380a()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = m24322a(r5, r1, r2, r3, r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.mo21244a(r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = m24320a(r6, r7, r8, r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p341p.p342c.C8386u.m24380a()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p341p.p342c.C8386u.m24380a()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p341p.p342c.C8371k.m24320a(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.p.c.k$b, com.bumptech.glide.load.n.a0.e):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static void m24325a(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m24323a(bitmap));
        sb.append(" from [");
        sb.append(i);
        String str2 = "x";
        sb.append(str2);
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m24324a(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C10770f.m33998a(j));
        Log.v("Downsampler", sb.toString());
    }

    /* renamed from: a */
    private static String m24324a(Options options) {
        return m24323a(options.inBitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m24323a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static IOException m24322a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(m24324a(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m24326a(Options options, C8159e eVar, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo21245b(i, i2, config);
    }

    /* renamed from: a */
    private static synchronized Options m24321a() {
        Options options;
        synchronized (C8371k.class) {
            synchronized (f17859l) {
                options = (Options) f17859l.poll();
            }
            if (options == null) {
                options = new Options();
                m24335d(options);
            }
        }
        return options;
    }
}
