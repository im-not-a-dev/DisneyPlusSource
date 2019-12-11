package com.bumptech.glide.load.p341p.p346g;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import p163g.p413f.p414a.p416q.C10680a.C10681a;

/* renamed from: com.bumptech.glide.load.p.g.b */
/* compiled from: GifBitmapProvider */
public final class C8411b implements C10681a {

    /* renamed from: a */
    private final C8159e f17913a;

    /* renamed from: b */
    private final C8154b f17914b;

    public C8411b(C8159e eVar, C8154b bVar) {
        this.f17913a = eVar;
        this.f17914b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo21589a(int i, int i2, Config config) {
        return this.f17913a.mo21245b(i, i2, config);
    }

    /* renamed from: b */
    public byte[] mo21594b(int i) {
        C8154b bVar = this.f17914b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo21224b(i, byte[].class);
    }

    /* renamed from: a */
    public void mo21590a(Bitmap bitmap) {
        this.f17913a.mo21244a(bitmap);
    }

    /* renamed from: a */
    public void mo21591a(byte[] bArr) {
        C8154b bVar = this.f17914b;
        if (bVar != null) {
            bVar.mo21223a(bArr);
        }
    }

    /* renamed from: a */
    public int[] mo21593a(int i) {
        C8154b bVar = this.f17914b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo21224b(i, int[].class);
    }

    /* renamed from: a */
    public void mo21592a(int[] iArr) {
        C8154b bVar = this.f17914b;
        if (bVar != null) {
            bVar.mo21223a(iArr);
        }
    }
}
