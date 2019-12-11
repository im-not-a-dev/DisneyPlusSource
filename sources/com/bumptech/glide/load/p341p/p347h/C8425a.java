package com.bumptech.glide.load.p341p.p347h;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p341p.p343d.C8399b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.p.h.a */
/* compiled from: BitmapBytesTranscoder */
public class C8425a implements C8429e<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f17954a;

    /* renamed from: b */
    private final int f17955b;

    public C8425a() {
        this(CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C8258v<byte[]> mo21640a(C8258v<Bitmap> vVar, C8115i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f17954a, this.f17955b, byteArrayOutputStream);
        vVar.mo21407a();
        return new C8399b(byteArrayOutputStream.toByteArray());
    }

    public C8425a(CompressFormat compressFormat, int i) {
        this.f17954a = compressFormat;
        this.f17955b = i;
    }
}
