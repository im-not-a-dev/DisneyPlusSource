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
import java.io.InputStream;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.y.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C8342c implements C8306n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f17820a;

    /* renamed from: com.bumptech.glide.load.o.y.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C8343a implements C8308o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f17821a;

        public C8343a(Context context) {
            this.f17821a = context;
        }

        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8342c(this.f17821a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8342c(Context context) {
        this.f17820a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        if (C8141b.m23617a(i, i2)) {
            return new C8307a<>(new C10760b(uri), C8142c.m23622a(this.f17820a, uri));
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return C8141b.m23618a(uri);
    }
}
