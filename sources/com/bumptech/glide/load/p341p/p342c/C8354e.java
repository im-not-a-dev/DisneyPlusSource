package com.bumptech.glide.load.p341p.p342c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.c.e */
/* compiled from: BitmapTransformation */
public abstract class C8354e implements C8118l<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo21524a(C8159e eVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C8258v<Bitmap> mo21168a(Context context, C8258v<Bitmap> vVar, int i, int i2) {
        if (C10775k.m34033b(i, i2)) {
            C8159e c = C10652e.m33418b(context).mo27523c();
            Bitmap bitmap = (Bitmap) vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo21524a(c, bitmap, i, i2);
            return bitmap.equals(a) ? vVar : C8353d.m24266a(a, c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
