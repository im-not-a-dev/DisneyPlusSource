package com.bumptech.glide.load.p339o.p340y;

import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.o.y.e */
/* compiled from: UrlLoader */
public class C8346e implements C8306n<URL, InputStream> {

    /* renamed from: a */
    private final C8306n<C8292g, InputStream> f17824a;

    /* renamed from: com.bumptech.glide.load.o.y.e$a */
    /* compiled from: UrlLoader */
    public static class C8347a implements C8308o<URL, InputStream> {
        /* renamed from: a */
        public C8306n<URL, InputStream> mo19954a(C8314r rVar) {
            return new C8346e(rVar.mo21493a(C8292g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8346e(C8306n<C8292g, InputStream> nVar) {
        this.f17824a = nVar;
    }

    /* renamed from: a */
    public boolean mo19953a(URL url) {
        return true;
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(URL url, int i, int i2, C8115i iVar) {
        return this.f17824a.mo19951a(new C8292g(url), i, i2, iVar);
    }
}
