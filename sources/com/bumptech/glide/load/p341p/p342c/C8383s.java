package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p341p.p344e.C8404e;

/* renamed from: com.bumptech.glide.load.p.c.s */
/* compiled from: ResourceBitmapDecoder */
public class C8383s implements C8116j<Uri, Bitmap> {

    /* renamed from: a */
    private final C8404e f17881a;

    /* renamed from: b */
    private final C8159e f17882b;

    public C8383s(C8404e eVar, C8159e eVar2) {
        this.f17881a = eVar;
        this.f17882b = eVar2;
    }

    /* renamed from: a */
    public boolean mo21166a(Uri uri, C8115i iVar) {
        return "android.resource".equals(uri.getScheme());
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21165a(Uri uri, int i, int i2, C8115i iVar) {
        C8258v a = this.f17881a.mo21165a(uri, i, i2, iVar);
        if (a == null) {
            return null;
        }
        return C8374l.m24344a(this.f17882b, (Drawable) a.get(), i, i2);
    }
}
