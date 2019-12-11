package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.b */
/* compiled from: Drawable.kt */
public final class C0493b {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bitmap m2654a(Drawable drawable, int i, int i2, Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return m2653a(drawable, i, i2, config);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r0.getConfig() == r9) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m2653a(android.graphics.drawable.Drawable r6, int r7, int r8, android.graphics.Bitmap.Config r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            java.lang.String r1 = "bitmap"
            if (r0 == 0) goto L_0x003d
            if (r9 == 0) goto L_0x0018
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != r9) goto L_0x003d
        L_0x0018:
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            int r9 = r6.getIntrinsicWidth()
            if (r7 != r9) goto L_0x002e
            int r9 = r6.getIntrinsicHeight()
            if (r8 != r9) goto L_0x002e
            android.graphics.Bitmap r6 = r6.getBitmap()
            kotlin.jvm.internal.C12880j.m40222a(r6, r1)
            return r6
        L_0x002e:
            android.graphics.Bitmap r6 = r6.getBitmap()
            r9 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r8, r9)
            java.lang.String r7 = "Bitmap.createScaledBitma…map, width, height, true)"
            kotlin.jvm.internal.C12880j.m40222a(r6, r7)
            return r6
        L_0x003d:
            android.graphics.Rect r0 = r6.getBounds()
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            if (r9 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x004e:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r7, r8, r9)
            r5 = 0
            r6.setBounds(r5, r5, r7, r8)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r9)
            r6.draw(r7)
            r6.setBounds(r2, r3, r4, r0)
            kotlin.jvm.internal.C12880j.m40222a(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0493b.m2653a(android.graphics.drawable.Drawable, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
