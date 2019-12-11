package com.bumptech.glide.load.p334n.p336b0;

import android.content.Context;
import com.bumptech.glide.load.p334n.p336b0.C8185d.C8186a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C8188f extends C8185d {

    /* renamed from: com.bumptech.glide.load.n.b0.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C8189a implements C8186a {

        /* renamed from: a */
        final /* synthetic */ Context f17485a;

        /* renamed from: b */
        final /* synthetic */ String f17486b;

        C8189a(Context context, String str) {
            this.f17485a = context;
            this.f17486b = str;
        }

        /* renamed from: a */
        public File mo21277a() {
            File cacheDir = this.f17485a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            String str = this.f17486b;
            return str != null ? new File(cacheDir, str) : cacheDir;
        }
    }

    public C8188f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C8188f(Context context, String str, long j) {
        super(new C8189a(context, str), j);
    }
}
