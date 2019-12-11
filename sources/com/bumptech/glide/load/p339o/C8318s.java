package com.bumptech.glide.load.p339o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.s */
/* compiled from: ResourceLoader */
public class C8318s<Data> implements C8306n<Integer, Data> {

    /* renamed from: a */
    private final C8306n<Uri, Data> f17797a;

    /* renamed from: b */
    private final Resources f17798b;

    /* renamed from: com.bumptech.glide.load.o.s$a */
    /* compiled from: ResourceLoader */
    public static final class C8319a implements C8308o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f17799a;

        public C8319a(Resources resources) {
            this.f17799a = resources;
        }

        /* renamed from: a */
        public C8306n<Integer, AssetFileDescriptor> mo19954a(C8314r rVar) {
            return new C8318s(this.f17799a, rVar.mo21493a(Uri.class, AssetFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$b */
    /* compiled from: ResourceLoader */
    public static class C8320b implements C8308o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f17800a;

        public C8320b(Resources resources) {
            this.f17800a = resources;
        }

        /* renamed from: a */
        public C8306n<Integer, ParcelFileDescriptor> mo19954a(C8314r rVar) {
            return new C8318s(this.f17800a, rVar.mo21493a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$c */
    /* compiled from: ResourceLoader */
    public static class C8321c implements C8308o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f17801a;

        public C8321c(Resources resources) {
            this.f17801a = resources;
        }

        /* renamed from: a */
        public C8306n<Integer, InputStream> mo19954a(C8314r rVar) {
            return new C8318s(this.f17801a, rVar.mo21493a(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$d */
    /* compiled from: ResourceLoader */
    public static class C8322d implements C8308o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f17802a;

        public C8322d(Resources resources) {
            this.f17802a = resources;
        }

        /* renamed from: a */
        public C8306n<Integer, Uri> mo19954a(C8314r rVar) {
            return new C8318s(this.f17802a, C8328v.m24192a());
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C8318s(Resources resources, C8306n<Uri, Data> nVar) {
        this.f17798b = resources;
        this.f17797a = nVar;
    }

    /* renamed from: b */
    private Uri m24165b(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f17798b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.f17798b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.f17798b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (NotFoundException e) {
            String str = "ResourceLoader";
            if (Log.isLoggable(str, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                Log.w(str, sb2.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo19953a(Integer num) {
        return true;
    }

    /* renamed from: a */
    public C8307a<Data> mo19951a(Integer num, int i, int i2, C8115i iVar) {
        Uri b = m24165b(num);
        if (b == null) {
            return null;
        }
        return this.f17797a.mo19951a(b, i, i2, iVar);
    }
}
