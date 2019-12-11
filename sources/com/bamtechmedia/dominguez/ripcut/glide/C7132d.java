package com.bamtechmedia.dominguez.ripcut.glide;

import android.net.Uri;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.ripcut.cache.C7116a;
import com.bumptech.glide.integration.okhttp3.C8103c;
import com.bumptech.glide.load.C8115i;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8306n;
import com.bumptech.glide.load.p339o.C8306n.C8307a;
import com.bumptech.glide.load.p339o.C8308o;
import com.bumptech.glide.load.p339o.C8314r;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\u0010\nJ0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/glide/GlideUriCachingLoader;", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "cacheFileResolver", "Lcom/bamtechmedia/dominguez/ripcut/cache/CacheFileResolver;", "httpUrlLoader", "Lcom/bumptech/glide/integration/okhttp3/OkHttpUrlLoader;", "fileLoader", "Ljava/io/File;", "(Lcom/bamtechmedia/dominguez/ripcut/cache/CacheFileResolver;Lcom/bumptech/glide/integration/okhttp3/OkHttpUrlLoader;Lcom/bumptech/glide/load/model/ModelLoader;)V", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "model", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "Factory", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.ripcut.glide.d */
/* compiled from: GlideUriCachingLoader.kt */
public final class C7132d implements C8306n<C8292g, InputStream> {

    /* renamed from: a */
    private final C7116a f15765a;

    /* renamed from: b */
    private final C8103c f15766b;

    /* renamed from: c */
    private final C8306n<File, InputStream> f15767c;

    /* renamed from: com.bamtechmedia.dominguez.ripcut.glide.d$a */
    /* compiled from: GlideUriCachingLoader.kt */
    public static final class C7133a implements C8308o<C8292g, InputStream> {

        /* renamed from: a */
        private final C7116a f15768a;

        /* renamed from: b */
        private final OkHttpClient f15769b;

        public C7133a(C7116a aVar, OkHttpClient okHttpClient) {
            this.f15768a = aVar;
            this.f15769b = okHttpClient;
        }

        /* renamed from: a */
        public C8306n<C8292g, InputStream> mo19954a(C8314r rVar) {
            C8306n a = rVar.mo21493a(File.class, InputStream.class);
            Intrinsics.checkReturnedValueIsNotNull((Object) a, "multiFactory.build(File:… InputStream::class.java)");
            return new C7132d(this.f15768a, new C8103c(this.f15769b), a);
        }

        /* renamed from: a */
        public void mo19955a() {
        }
    }

    public C7132d(C7116a aVar, C8103c cVar, C8306n<File, InputStream> nVar) {
        this.f15765a = aVar;
        this.f15766b = cVar;
        this.f15767c = nVar;
    }

    /* renamed from: a */
    public boolean mo19953a(C8292g gVar) {
        return true;
    }

    /* renamed from: a */
    public C8307a<InputStream> mo19951a(C8292g gVar, int i, int i2, C8115i iVar) {
        C7116a aVar = this.f15765a;
        Uri parse = Uri.parse(gVar.mo21464c());
        Intrinsics.checkReturnedValueIsNotNull((Object) parse, "Uri.parse(model.toStringUrl())");
        File a = aVar.mo19907a(parse);
        if (!a.isFile()) {
            a = null;
        }
        if (a == null) {
            return this.f15766b.mo19951a(gVar, i, i2, iVar);
        }
        C5855o oVar = C5855o.f13640a;
        return this.f15767c.mo19951a(a, i, i2, iVar);
    }
}
