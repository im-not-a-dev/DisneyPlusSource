package com.bumptech.glide.load.p341p.p342c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.C8116j;
import com.bumptech.glide.load.p334n.C8258v;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p334n.p335a0.C8159e;
import com.bumptech.glide.load.p341p.p342c.C8371k.C8373b;
import java.io.IOException;
import java.io.InputStream;
import p163g.p413f.p414a.p424w.C10766d;
import p163g.p413f.p414a.p424w.C10772h;

/* renamed from: com.bumptech.glide.load.p.c.t */
/* compiled from: StreamBitmapDecoder */
public class C8384t implements C8116j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C8371k f17883a;

    /* renamed from: b */
    private final C8154b f17884b;

    /* renamed from: com.bumptech.glide.load.p.c.t$a */
    /* compiled from: StreamBitmapDecoder */
    static class C8385a implements C8373b {

        /* renamed from: a */
        private final C8381r f17885a;

        /* renamed from: b */
        private final C10766d f17886b;

        C8385a(C8381r rVar, C10766d dVar) {
            this.f17885a = rVar;
            this.f17886b = dVar;
        }

        /* renamed from: a */
        public void mo21542a() {
            this.f17885a.mo21546a();
        }

        /* renamed from: a */
        public void mo21543a(C8159e eVar, Bitmap bitmap) throws IOException {
            IOException a = this.f17886b.mo27789a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo21244a(bitmap);
                }
                throw a;
            }
        }
    }

    public C8384t(C8371k kVar, C8154b bVar) {
        this.f17883a = kVar;
        this.f17884b = bVar;
    }

    /* renamed from: a */
    public boolean mo21166a(InputStream inputStream, C8115i iVar) {
        return this.f17883a.mo21540a(inputStream);
    }

    /* renamed from: a */
    public C8258v<Bitmap> mo21165a(InputStream inputStream, int i, int i2, C8115i iVar) throws IOException {
        C8381r rVar;
        boolean z;
        if (inputStream instanceof C8381r) {
            rVar = (C8381r) inputStream;
            z = false;
        } else {
            rVar = new C8381r(inputStream, this.f17884b);
            z = true;
        }
        C10766d b = C10766d.m33992b(rVar);
        try {
            return this.f17883a.mo21539a((InputStream) new C10772h(b), i, i2, iVar, (C8373b) new C8385a(rVar, b));
        } finally {
            b.mo27792b();
            if (z) {
                rVar.mo21548b();
            }
        }
    }
}
