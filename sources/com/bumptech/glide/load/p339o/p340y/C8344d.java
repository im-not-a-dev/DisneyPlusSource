package com.bumptech.glide.load.p339o.p340y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.p333o.C8141b;
import com.bumptech.glide.load.p332m.p333o.C8142c;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import com.bumptech.glide.load.p341p.p342c.C8390w;
import java.io.InputStream;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.y.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C8344d implements C8306n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f17822a;

    /* renamed from: com.bumptech.glide.load.o.y.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C8345a implements C8308o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f17823a;

        public C8345a(Context context) {
            this.f17823a = context;
        }

        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8344d(this.f17823a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8344d(Context context) {
        this.f17822a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        if (!C8141b.m23617a(i, i2) || !m24239a(iVar)) {
            return null;
        }
        return new C8307a<>(new C10760b(uri), C8142c.m23624b(this.f17822a, uri));
    }

    /* renamed from: a */
    private boolean m24239a(C8115i iVar) {
        Long l = (Long) iVar.mo21162a(C8390w.f17892d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return C8141b.m23620c(uri);
    }
}
