package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C8107c;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8117k;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.p.c.b */
/* compiled from: BitmapDrawableEncoder */
public class C8351b implements C8117k<BitmapDrawable> {

    /* renamed from: a */
    private final C8159e f17829a;

    /* renamed from: b */
    private final C8117k<Bitmap> f17830b;

    public C8351b(C8159e eVar, C8117k<Bitmap> kVar) {
        this.f17829a = eVar;
        this.f17830b = kVar;
    }

    /* renamed from: a */
    public boolean mo21151a(C8258v<BitmapDrawable> vVar, File file, C8115i iVar) {
        return this.f17830b.mo21151a(new C8353d(((BitmapDrawable) vVar.get()).getBitmap(), this.f17829a), file, iVar);
    }

    /* renamed from: a */
    public C8107c mo21167a(C8115i iVar) {
        return this.f17830b.mo21167a(iVar);
    }
}
