package com.bumptech.glide.load.p339o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p332m.C8119a;
import com.bumptech.glide.load.p332m.C8122d;
import com.bumptech.glide.load.p332m.C8131i;
import com.bumptech.glide.load.p332m.C8139n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p163g.p413f.p414a.p423v.C10760b;

/* renamed from: com.bumptech.glide.load.o.w */
/* compiled from: UriLoader */
public class C8331w<Data> implements C8306n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f17808b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C8334c<Data> f17809a;

    /* renamed from: com.bumptech.glide.load.o.w$a */
    /* compiled from: UriLoader */
    public static final class C8332a implements C8308o<Uri, AssetFileDescriptor>, C8334c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f17810a;

        public C8332a(ContentResolver contentResolver) {
            this.f17810a = contentResolver;
        }

        /* renamed from: a */
        public C8306n<Uri, AssetFileDescriptor> mo19954a(C8314r rVar) {
            return new C8331w(this);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        /* renamed from: a */
        public C8122d<AssetFileDescriptor> mo21509a(Uri uri) {
            return new C8119a(this.f17810a, uri);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$b */
    /* compiled from: UriLoader */
    public static class C8333b implements C8308o<Uri, ParcelFileDescriptor>, C8334c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f17811a;

        public C8333b(ContentResolver contentResolver) {
            this.f17811a = contentResolver;
        }

        /* renamed from: a */
        public C8122d<ParcelFileDescriptor> mo21509a(Uri uri) {
            return new C8131i(this.f17811a, uri);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        /* renamed from: a */
        public C8306n<Uri, ParcelFileDescriptor> mo19954a(C8314r rVar) {
            return new C8331w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$c */
    /* compiled from: UriLoader */
    public interface C8334c<Data> {
        /* renamed from: a */
        C8122d<Data> mo21509a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.o.w$d */
    /* compiled from: UriLoader */
    public static class C8335d implements C8308o<Uri, InputStream>, C8334c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f17812a;

        public C8335d(ContentResolver contentResolver) {
            this.f17812a = contentResolver;
        }

        /* renamed from: a */
        public C8122d<InputStream> mo21509a(Uri uri) {
            return new C8139n(this.f17812a, uri);
        }

        /* renamed from: a */
        public void mo19955a() {
        }

        /* renamed from: a */
        public C8306n<Uri, InputStream> mo19954a(C8314r rVar) {
            return new C8331w(this);
        }
    }

    public C8331w(C8334c<Data> cVar) {
        this.f17809a = cVar;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(Uri uri, int i, int i2, C8115i iVar) {
        return new C8307a<>(new C10760b(uri), this.f17809a.mo21509a(uri));
    }

    /* renamed from: a */
    public boolean mo19953a(Uri uri) {
        return f17808b.contains(uri.getScheme());
    }
}
