package com.bamtechmedia.dominguez.ripcut.glide;

import android.content.Context;
import com.bamtechmedia.dominguez.ripcut.cache.C7116a;
import com.bamtechmedia.dominguez.ripcut.glide.C7132d.C7133a;
import com.bumptech.glide.load.p339o.C8292g;
import com.bumptech.glide.load.p339o.C8308o;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10659l;
import p163g.p413f.p414a.p418s.C10708a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/ripcut/glide/GlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "()V", "registerComponents", "", "context", "Landroid/content/Context;", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "Companion", "ripcut_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GlideModule.kt */
public final class GlideModule extends C10708a {

    /* renamed from: com.bamtechmedia.dominguez.ripcut.glide.GlideModule$a */
    /* compiled from: GlideModule.kt */
    public static final class C7128a {
        private C7128a() {
        }

        public /* synthetic */ C7128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7128a(null);
    }

    /* renamed from: a */
    public void mo19914a(Context context, C10652e eVar, C10659l lVar) {
        OkHttpClient a = new Builder().mo35817a(new Cache(new File(context.getCacheDir(), "glide-cache"), 41943040)).mo35818a((Interceptor) new C7134e(0, 1, null)).mo35820a();
        C7116a aVar = new C7116a(context);
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "client");
        eVar.mo27527g().mo27557b(C8292g.class, InputStream.class, (C8308o<? extendsMODEL, ? extends Data>) new C7133a<Object,Object>(aVar, a));
    }
}
