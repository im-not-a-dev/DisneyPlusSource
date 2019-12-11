package p163g.p413f.p414a.p424w;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.load.p339o.C8302l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: g.f.a.w.k */
/* compiled from: Util */
public final class C10775k {

    /* renamed from: a */
    private static final char[] f25488a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f25489b = new char[64];

    /* renamed from: g.f.a.w.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C10776a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25490a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25490a = r0
                int[] r0 = f25490a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25490a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25490a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25490a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f25490a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p424w.C10775k.C10776a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m34019a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static String m34025a(byte[] bArr) {
        String a;
        synchronized (f25489b) {
            a = m34026a(bArr, f25489b);
        }
        return a;
    }

    /* renamed from: b */
    private static boolean m34032b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static boolean m34033b(int i, int i2) {
        return m34032b(i) && m34032b(i2);
    }

    /* renamed from: c */
    public static boolean m34035c() {
        return !m34036d();
    }

    /* renamed from: d */
    public static boolean m34036d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static void m34031b() {
        if (!m34036d()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    private static String m34026a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f25488a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static boolean m34034b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m34022a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static int m34020a(int i, int i2, Config config) {
        return i * i2 * m34021a(config);
    }

    /* renamed from: a */
    private static int m34021a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = C10776a.f25490a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: a */
    public static void m34029a() {
        if (!m34035c()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m34028a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m34027a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m34030a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof C8302l) {
            return ((C8302l) obj).mo21478a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    public static int m34017a(float f) {
        return m34018a(f, 17);
    }

    /* renamed from: a */
    public static int m34018a(float f, int i) {
        return m34019a(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m34023a(Object obj, int i) {
        return m34019a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m34024a(boolean z, int i) {
        return m34019a(z ? 1 : 0, i);
    }
}
