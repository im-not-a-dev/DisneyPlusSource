package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.c.h */
/* compiled from: CenterInside */
public class C8357h extends C8354e {

    /* renamed from: b */
    private static final byte[] f17838b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C8111g.f17370a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo21524a(C8159e eVar, Bitmap bitmap, int i, int i2) {
        return C8386u.m24385b(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C8357h;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterInside".hashCode();
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        messageDigest.update(f17838b);
    }
}
