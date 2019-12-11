package com.bumptech.glide.load.p339o.p340y;

import com.bumptech.glide.load.C8112h;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8132j;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8303m;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.a */
/* compiled from: HttpGlideUrlLoader */
public class C8338a implements C8306n<C8292g, InputStream> {

    /* renamed from: b */
    public static final C8112h<Integer> f17815b = C8112h.m23532a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));

    /* renamed from: a */
    private final C8303m<C8292g, C8292g> f17816a;

    /* renamed from: com.bumptech.glide.load.o.y.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C8339a implements C8308o<C8292g, InputStream> {

        /* renamed from: a */
        private final C8303m<C8292g, C8292g> f17817a = new C8303m<>(500);

        /* renamed from: a */
        public C8306n<C8292g, InputStream> mo19954a(C8314r rVar) {
            return new C8338a(this.f17817a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8338a(C8303m<C8292g, C8292g> mVar) {
        this.f17816a = mVar;
    }

    /* renamed from: a */
    public boolean mo19953a(C8292g gVar) {
        return true;
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(C8292g gVar, int i, int i2, C8115i iVar) {
        C8303m<C8292g, C8292g> mVar = this.f17816a;
        if (mVar != null) {
            C8292g gVar2 = (C8292g) mVar.mo21479a(gVar, 0, 0);
            if (gVar2 == null) {
                this.f17816a.mo21480a(gVar, 0, 0, gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new C8307a<>(gVar, new C8132j(gVar, ((Integer) iVar.mo21162a(f17815b)).intValue()));
    }
}
