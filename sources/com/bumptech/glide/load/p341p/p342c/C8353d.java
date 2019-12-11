package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p334n.C8253r;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.c.d */
/* compiled from: BitmapResource */
public class C8353d implements C8258v<Bitmap>, C8253r {

    /* renamed from: U */
    private final C8159e f17834U;

    /* renamed from: c */
    private final Bitmap f17835c;

    public C8353d(Bitmap bitmap, C8159e eVar) {
        C10774j.m34013a(bitmap, "Bitmap must not be null");
        this.f17835c = bitmap;
        C10774j.m34013a(eVar, "BitmapPool must not be null");
        this.f17834U = eVar;
    }

    /* renamed from: a */
    public static C8353d m24266a(Bitmap bitmap, C8159e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C8353d(bitmap, eVar);
    }

    /* renamed from: b */
    public Class<Bitmap> mo21409b() {
        return Bitmap.class;
    }

    public int getSize() {
        return C10775k.m34022a(this.f17835c);
    }

    public void initialize() {
        this.f17835c.prepareToDraw();
    }

    /* renamed from: a */
    public void mo21407a() {
        this.f17834U.mo21244a(this.f17835c);
    }

    public Bitmap get() {
        return this.f17835c;
    }
}
