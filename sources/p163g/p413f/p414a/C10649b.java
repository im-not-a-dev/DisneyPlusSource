package p163g.p413f.p414a;

import android.content.Context;
import android.util.Log;
import com.bamtechmedia.dominguez.ripcut.glide.GlideModule;
import com.bumptech.glide.integration.okhttp3.C8101a;
import java.util.Collections;
import java.util.Set;

/* renamed from: g.f.a.b */
/* compiled from: GeneratedAppGlideModuleImpl */
final class C10649b extends C10648a {

    /* renamed from: a */
    private final GlideModule f25119a = new GlideModule();

    C10649b() {
        String str = "Glide";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Discovered AppGlideModule from annotation: com.bamtechmedia.dominguez.ripcut.glide.GlideModule");
            Log.d(str, "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    /* renamed from: a */
    public void mo27514a(Context context, C10653f fVar) {
        this.f25119a.mo27514a(context, fVar);
    }

    /* renamed from: b */
    public Set<Class<?>> mo27512b() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo19914a(Context context, C10652e eVar, C10659l lVar) {
        new C8101a().mo19914a(context, eVar, lVar);
        this.f25119a.mo19914a(context, eVar, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C10650c m33412c() {
        return new C10650c();
    }

    /* renamed from: a */
    public boolean mo27515a() {
        return this.f25119a.mo27515a();
    }
}
