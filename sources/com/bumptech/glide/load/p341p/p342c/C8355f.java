package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import java.io.IOException;
import java.nio.ByteBuffer;
import p163g.p413f.p414a.p424w.C10761a;

/* renamed from: com.bumptech.glide.load.p.c.f */
/* compiled from: ByteBufferBitmapDecoder */
public class C8355f implements C8116j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C8371k f17836a;

    public C8355f(C8371k kVar) {
        this.f17836a = kVar;
    }

    /* renamed from: a */
    public boolean mo21166a(ByteBuffer byteBuffer, C8115i iVar) {
        return this.f17836a.mo21541a(byteBuffer);
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21165a(ByteBuffer byteBuffer, int i, int i2, C8115i iVar) throws IOException {
        return this.f17836a.mo21538a(C10761a.m33986c(byteBuffer), i, i2, iVar);
    }
}
