package com.bumptech.glide.load.p334n.p335a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* renamed from: com.bumptech.glide.load.n.a0.f */
/* compiled from: BitmapPoolAdapter */
public class C8160f implements C8159e {
    /* renamed from: a */
    public void mo21242a() {
    }

    /* renamed from: a */
    public void mo21243a(int i) {
    }

    /* renamed from: a */
    public void mo21244a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: b */
    public Bitmap mo21245b(int i, int i2, Config config) {
        return mo21241a(i, i2, config);
    }

    /* renamed from: a */
    public Bitmap mo21241a(int i, int i2, Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
