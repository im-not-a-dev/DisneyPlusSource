package com.bumptech.glide.load.p332m;

import com.bumptech.glide.load.p332m.C8124e.C8125a;
import com.bumptech.glide.load.p334n.p335a0.C8154b;
import com.bumptech.glide.load.p341p.p342c.C8381r;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.k */
/* compiled from: InputStreamRewinder */
public final class C8135k implements C8124e<InputStream> {

    /* renamed from: a */
    private final C8381r f17399a;

    /* renamed from: com.bumptech.glide.load.m.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C8136a implements C8125a<InputStream> {

        /* renamed from: a */
        private final C8154b f17400a;

        public C8136a(C8154b bVar) {
            this.f17400a = bVar;
        }

        /* renamed from: a */
        public C8124e<InputStream> mo21183a(InputStream inputStream) {
            return new C8135k(inputStream, this.f17400a);
        }

        /* renamed from: a */
        public Class<InputStream> mo21184a() {
            return InputStream.class;
        }
    }

    C8135k(InputStream inputStream, C8154b bVar) {
        this.f17399a = new C8381r(inputStream, bVar);
        this.f17399a.mark(5242880);
    }

    public void cleanup() {
        this.f17399a.mo21548b();
    }

    /* renamed from: a */
    public InputStream m23594a() throws IOException {
        this.f17399a.reset();
        return this.f17399a;
    }
}
