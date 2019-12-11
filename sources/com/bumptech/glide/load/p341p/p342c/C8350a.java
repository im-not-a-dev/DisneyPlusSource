package com.bumptech.glide.load.p341p.p342c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import java.io.IOException;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.p.c.a */
/* compiled from: BitmapDrawableDecoder */
public class C8350a<DataType> implements C8116j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C8116j<DataType, Bitmap> f17827a;

    /* renamed from: b */
    private final Resources f17828b;

    public C8350a(Resources resources, C8116j<DataType, Bitmap> jVar) {
        C10774j.m34012a(resources);
        this.f17828b = resources;
        C10774j.m34012a(jVar);
        this.f17827a = jVar;
    }

    /* renamed from: a */
    public boolean mo21166a(DataType datatype, C8115i iVar) throws IOException {
        return this.f17827a.mo21166a(datatype, iVar);
    }

    /* renamed from: a */
    public C8258v<BitmapDrawable> mo21165a(DataType datatype, int i, int i2, C8115i iVar) throws IOException {
        return C8380q.m24359a(this.f17828b, this.f17827a.mo21165a(datatype, i, i2, iVar));
    }
}
