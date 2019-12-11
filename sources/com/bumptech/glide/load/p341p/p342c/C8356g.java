package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.c.g */
/* compiled from: CenterCrop */
public class C8356g extends C8354e {

    /* renamed from: b */
    private static final byte[] f17837b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C8111g.f17370a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo21524a(C8159e eVar, Bitmap bitmap, int i, int i2) {
        return C8386u.m24379a(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C8356g;
    }

    public int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        messageDigest.update(f17837b);
    }
}
