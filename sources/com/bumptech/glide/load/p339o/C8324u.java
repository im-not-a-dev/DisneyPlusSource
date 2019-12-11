package com.bumptech.glide.load.p339o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.u */
/* compiled from: StringLoader */
public class C8324u<Data> implements C8306n<String, Data> {

    /* renamed from: a */
    private final C8306n<Uri, Data> f17804a;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    /* compiled from: StringLoader */
    public static final class C8325a implements C8308o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C8306n<String, AssetFileDescriptor> mo19954a(C8314r rVar) {
            return new C8324u(rVar.mo21493a(Uri.class, AssetFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$b */
    /* compiled from: StringLoader */
    public static class C8326b implements C8308o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C8306n<String, ParcelFileDescriptor> mo19954a(C8314r rVar) {
            return new C8324u(rVar.mo21493a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$c */
    /* compiled from: StringLoader */
    public static class C8327c implements C8308o<String, InputStream> {
        /* renamed from: a */
        public C8306n<String, InputStream> mo19954a(C8314r rVar) {
            return new C8324u(rVar.mo21493a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8324u(C8306n<Uri, Data> nVar) {
        this.f17804a = nVar;
    }

    /* renamed from: b */
    private static Uri m24180b(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            uri = m24181c(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m24181c(str) : parse;
        }
        return uri;
    }

    /* renamed from: c */
    private static Uri m24181c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public boolean mo19953a(String str) {
        return true;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(String str, int i, int i2, C8115i iVar) {
        Uri b = m24180b(str);
        if (b == null || !this.f17804a.mo19953a(b)) {
            return null;
        }
        return this.f17804a.mo19951a(b, i, i2, iVar);
    }
}
