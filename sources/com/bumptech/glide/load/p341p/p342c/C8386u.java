package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.p.c.u */
/* compiled from: TransformationUtils */
public final class C8386u {

    /* renamed from: a */
    private static final Paint f17887a = new Paint(6);

    /* renamed from: b */
    private static final Paint f17888b = new Paint(7);

    /* renamed from: c */
    private static final Set<String> f17889c = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));

    /* renamed from: d */
    private static final Lock f17890d = (f17889c.contains(Build.MODEL) ? new ReentrantLock() : new C8387a());

    /* renamed from: com.bumptech.glide.load.p.c.u$a */
    /* compiled from: TransformationUtils */
    private static final class C8387a implements Lock {
        C8387a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        new Paint(7);
        f17888b.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m24376a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Lock m24380a() {
        return f17890d;
    }

    /* renamed from: b */
    public static Bitmap m24385b(C8159e eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size too big for input, fit centering instead");
            }
            return m24387c(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m24386b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static Bitmap m24387c(C8159e eVar, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = eVar.mo21241a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m24377a(bitmap));
        m24382a(bitmap, a);
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            Log.v(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(str2);
            sb2.append(bitmap.getHeight());
            Log.v(str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(a.getWidth());
            sb3.append(str2);
            sb3.append(a.getHeight());
            Log.v(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v(str, sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m24383a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m24379a(C8159e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f3 = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
        Bitmap a = eVar.mo21241a(i, i2, m24377a(bitmap));
        m24382a(bitmap, a);
        m24383a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static void m24382a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    public static Bitmap m24378a(C8159e eVar, Bitmap bitmap, int i) {
        if (!m24386b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m24381a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = eVar.mo21241a(Math.round(rectF.width()), Math.round(rectF.height()), m24377a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a.setHasAlpha(bitmap.hasAlpha());
        m24383a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    private static void m24384a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: a */
    private static Config m24377a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    private static void m24383a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f17890d.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f17887a);
            m24384a(canvas);
        } finally {
            f17890d.unlock();
        }
    }

    /* renamed from: a */
    static void m24381a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
