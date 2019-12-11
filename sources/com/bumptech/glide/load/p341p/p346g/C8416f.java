package com.bumptech.glide.load.p341p.p346g;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.C8118l;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p341p.p342c.C8353d;
import java.security.MessageDigest;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.g.f */
/* compiled from: GifDrawableTransformation */
public class C8416f implements C8118l<C8412c> {

    /* renamed from: b */
    private final C8118l<Bitmap> f17927b;

    public C8416f(C8118l<Bitmap> lVar) {
        C10774j.m34012a(lVar);
        this.f17927b = lVar;
    }

    /* renamed from: a */
    public C8258v<C8412c> mo21168a(Context context, C8258v<C8412c> vVar, int i, int i2) {
        C8412c cVar = (C8412c) vVar.get();
        C8353d dVar = new C8353d(cVar.mo21598c(), C10652e.m33418b(context).mo27523c());
        C8258v a = this.f17927b.mo21168a(context, dVar, i, i2);
        if (!dVar.equals(a)) {
            dVar.mo21407a();
        }
        cVar.mo21596a(this.f17927b, (Bitmap) a.get());
        return vVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8416f)) {
            return false;
        }
        return this.f17927b.equals(((C8416f) obj).f17927b);
    }

    public int hashCode() {
        return this.f17927b.hashCode();
    }

    /* renamed from: a */
    public void mo21152a(MessageDigest messageDigest) {
        this.f17927b.mo21152a(messageDigest);
    }
}
