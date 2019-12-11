package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p334n.p335a0.C8160f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.p.c.l */
/* compiled from: DrawableToBitmapConverter */
final class C8374l {

    /* renamed from: a */
    private static final C8159e f17865a = new C8375a();

    /* renamed from: com.bumptech.glide.load.p.c.l$a */
    /* compiled from: DrawableToBitmapConverter */
    class C8375a extends C8160f {
        C8375a() {
        }

        /* renamed from: a */
        public void mo21244a(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C8258v<Bitmap> m24344a(C8159e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m24345b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f17865a;
        }
        return C8353d.m24266a(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m24345b(C8159e eVar, Drawable drawable, int i, int i2) {
        String str = "Unable to draw ";
        String str2 = "DrawableToBitmap";
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C8386u.m24380a();
            a.lock();
            Bitmap a2 = eVar.mo21241a(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a2;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w(str2, sb2.toString());
            }
            return null;
        }
    }
}
