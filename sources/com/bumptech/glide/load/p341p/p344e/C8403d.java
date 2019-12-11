package com.bumptech.glide.load.p341p.p344e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p334n.C8258v;

/* renamed from: com.bumptech.glide.load.p.e.d */
/* compiled from: NonOwnedDrawableResource */
final class C8403d extends C8401b<Drawable> {
    private C8403d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static C8258v<Drawable> m24427a(Drawable drawable) {
        if (drawable != null) {
            return new C8403d(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo21407a() {
    }

    /* renamed from: b */
    public Class<Drawable> mo21409b() {
        return this.f17903c.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f17903c.getIntrinsicWidth() * this.f17903c.getIntrinsicHeight() * 4);
    }
}
