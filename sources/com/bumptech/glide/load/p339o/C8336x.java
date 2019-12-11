package com.bumptech.glide.load.p339o;

import android.net.Uri;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.x */
/* compiled from: UrlUriLoader */
public class C8336x<Data> implements C8306n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f17813b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C8306n<C8292g, Data> f17814a;

    /* renamed from: com.bumptech.glide.load.o.x$a */
    /* compiled from: UrlUriLoader */
    public static class C8337a implements C8308o<Uri, InputStream> {
        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8336x(rVar.mo21493a(C8292g.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8336x(C8306n<C8292g, Data> nVar) {
        this.f17814a = nVar;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        return this.f17814a.mo19951a(new C8292g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return f17813b.contains(uri.getScheme());
    }
}
