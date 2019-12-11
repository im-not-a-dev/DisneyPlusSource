package com.bumptech.glide.load.p339o.p340y;

import android.net.Uri;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.y.b */
/* compiled from: HttpUriLoader */
public class C8340b implements C8306n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f17818b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C8306n<C8292g, InputStream> f17819a;

    /* renamed from: com.bumptech.glide.load.o.y.b$a */
    /* compiled from: HttpUriLoader */
    public static class C8341a implements C8308o<Uri, InputStream> {
        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8340b(rVar.mo21493a(C8292g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8340b(C8306n<C8292g, InputStream> nVar) {
        this.f17819a = nVar;
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        return this.f17819a.mo19951a(new C8292g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return f17818b.contains(uri.getScheme());
    }
}
