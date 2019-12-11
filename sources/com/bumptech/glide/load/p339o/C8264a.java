package com.bumptech.glide.load.p339o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8130h;
import com.bumptech.glide.load.p332m.C8138m;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.InputStream;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.a */
/* compiled from: AssetUriLoader */
public class C8264a<Data> implements C8306n<Uri, Data> {

    /* renamed from: c */
    private static final int f17729c = 22;

    /* renamed from: a */
    private final AssetManager f17730a;

    /* renamed from: b */
    private final C8265a<Data> f17731b;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    /* compiled from: AssetUriLoader */
    public interface C8265a<Data> {
        /* renamed from: a */
        C8122d<Data> mo21443a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    /* compiled from: AssetUriLoader */
    public static class C8266b implements C8308o<Uri, ParcelFileDescriptor>, C8265a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f17732a;

        public C8266b(AssetManager assetManager) {
            this.f17732a = assetManager;
        }

        /* renamed from: a */
        public C8306n<Uri, ParcelFileDescriptor> mo19954a(C8314r rVar) {
            return new C8264a(this.f17732a, this);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        /* renamed from: a */
        public C8122d<ParcelFileDescriptor> mo21443a(AssetManager assetManager, String str) {
            return new C8130h(assetManager, str);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$c */
    /* compiled from: AssetUriLoader */
    public static class C8267c implements C8308o<Uri, InputStream>, C8265a<InputStream> {

        /* renamed from: a */
        private final AssetManager f17733a;

        public C8267c(AssetManager assetManager) {
            this.f17733a = assetManager;
        }

        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8264a(this.f17733a, this);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        /* renamed from: a */
        public C8122d<InputStream> mo21443a(AssetManager assetManager, String str) {
            return new C8138m(assetManager, str);
        }
    }

    public C8264a(AssetManager assetManager, C8265a<Data> aVar) {
        this.f17730a = assetManager;
        this.f17731b = aVar;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(uri), this.f17731b.mo21443a(this.f17730a, uri.toString().substring(f17729c)));
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        if ("android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
