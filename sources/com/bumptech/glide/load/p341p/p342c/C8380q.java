package com.bumptech.glide.load.p341p.p342c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.p334n.C8253r;
import com.bumptech.glide.load.p334n.C8258v;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.c.q */
/* compiled from: LazyBitmapDrawableResource */
public final class C8380q implements C8258v<BitmapDrawable>, C8253r {

    /* renamed from: U */
    private final C8258v<Bitmap> f17873U;

    /* renamed from: c */
    private final Resources f17874c;

    private C8380q(Resources resources, C8258v<Bitmap> vVar) {
        C10774j.m34012a(resources);
        this.f17874c = resources;
        C10774j.m34012a(vVar);
        this.f17873U = vVar;
    }

    /* renamed from: a */
    public static C8258v<BitmapDrawable> m24359a(Resources resources, C8258v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C8380q(resources, vVar);
    }

    /* renamed from: b */
    public Class<BitmapDrawable> mo21409b() {
        return BitmapDrawable.class;
    }

    public int getSize() {
        return this.f17873U.getSize();
    }

    public void initialize() {
        C8258v<Bitmap> vVar = this.f17873U;
        if (vVar instanceof C8253r) {
            ((C8253r) vVar).initialize();
        }
    }

    /* renamed from: a */
    public void mo21407a() {
        this.f17873U.mo21407a();
    }

    public BitmapDrawable get() {
        return new BitmapDrawable(this.f17874c, (Bitmap) this.f17873U.get());
    }
}
