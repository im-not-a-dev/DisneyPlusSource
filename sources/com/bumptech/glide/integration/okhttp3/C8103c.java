package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import java.io.InputStream;
import okhttp3.Call.Factory;
import okhttp3.OkHttpClient;

/* renamed from: com.bumptech.glide.integration.okhttp3.c */
/* compiled from: OkHttpUrlLoader */
public class C8103c implements C8306n<C8292g, InputStream> {

    /* renamed from: a */
    private final Factory f17352a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.c$a */
    /* compiled from: OkHttpUrlLoader */
    public static class C8104a implements C8308o<C8292g, InputStream> {

        /* renamed from: b */
        private static volatile Factory f17353b;

        /* renamed from: a */
        private final Factory f17354a;

        public C8104a() {
            this(m23520b());
        }

        /* renamed from: b */
        private static Factory m23520b() {
            if (f17353b == null) {
                synchronized (C8104a.class) {
                    if (f17353b == null) {
                        f17353b = new OkHttpClient();
                    }
                }
            }
            return f17353b;
        }

        /* renamed from: a */
        public C8306n<C8292g, InputStream> mo19954a(C8314r rVar) {
            return new C8103c(this.f17354a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        public C8104a(Factory aVar) {
            this.f17354a = aVar;
        }
    }

    public C8103c(Factory aVar) {
        this.f17352a = aVar;
    }

    /* renamed from: a */
    public boolean mo19953a(C8292g gVar) {
        return true;
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(C8292g gVar, int i, int i2, C8115i iVar) {
        return new C8307a<>(gVar, new C8102b(this.f17352a, gVar));
    }
}
