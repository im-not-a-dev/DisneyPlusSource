package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: com.bumptech.glide.load.p.c.v */
/* compiled from: UnitBitmapDecoder */
public final class C8388v implements C8116j<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.p.c.v$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C8389a implements C8258v<Bitmap> {

        /* renamed from: c */
        private final Bitmap f17891c;

        C8389a(Bitmap bitmap) {
            this.f17891c = bitmap;
        }

        /* renamed from: a */
        public void mo21407a() {
        }

        /* renamed from: b */
        public Class<Bitmap> mo21409b() {
            return Bitmap.class;
        }

        public int getSize() {
            return C10775k.m34022a(this.f17891c);
        }

        public Bitmap get() {
            return this.f17891c;
        }
    }

    /* renamed from: a */
    public boolean mo21166a(Bitmap bitmap, C8115i iVar) {
        return true;
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21165a(Bitmap bitmap, int i, int i2, C8115i iVar) {
        return new C8389a(bitmap);
    }
}
