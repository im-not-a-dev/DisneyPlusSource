package com.bumptech.glide.load.p341p.p347h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p341p.p342c.C8353d;
import com.bumptech.glide.load.p341p.p346g.C8412c;

/* renamed from: com.bumptech.glide.load.p.h.c */
/* compiled from: DrawableBytesTranscoder */
public final class C8427c implements C8429e<Drawable, byte[]> {

    /* renamed from: a */
    private final C8159e f17957a;

    /* renamed from: b */
    private final C8429e<Bitmap, byte[]> f17958b;

    /* renamed from: c */
    private final C8429e<C8412c, byte[]> f17959c;

    public C8427c(C8159e eVar, C8429e<Bitmap, byte[]> eVar2, C8429e<C8412c, byte[]> eVar3) {
        this.f17957a = eVar;
        this.f17958b = eVar2;
        this.f17959c = eVar3;
    }

    /* renamed from: a */
    private static C8258v<C8412c> m24519a(C8258v<Drawable> vVar) {
        return vVar;
    }

    /* renamed from: a */
    public C8258v<byte[]> mo21640a(C8258v<Drawable> vVar, C8115i iVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f17958b.mo21640a(C8353d.m24266a(((BitmapDrawable) drawable).getBitmap(), this.f17957a), iVar);
        }
        if (!(drawable instanceof C8412c)) {
            return null;
        }
        C8429e<C8412c, byte[]> eVar = this.f17959c;
        m24519a(vVar);
        return eVar.mo21640a(vVar, iVar);
    }
}
