package com.bamtechmedia.dominguez.brand;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/brand/BrandPageLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "slugProvider", "Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;", "(Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;)V", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.brand.g */
/* compiled from: BrandPageLinkHandler.kt */
public final class C3189g implements C7290d {

    /* renamed from: b */
    private static final Pattern f8154b = Pattern.compile("(/[a-zA-Z-]{2,5})?/brand/([a-z_-]+)?$");

    /* renamed from: a */
    private final C3678l f8155a;

    /* renamed from: com.bamtechmedia.dominguez.brand.g$a */
    /* compiled from: BrandPageLinkHandler.kt */
    public static final class C3190a {
        private C3190a() {
        }

        public /* synthetic */ C3190a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C3190a(null);
    }

    public C3189g(C3678l lVar) {
        this.f8155a = lVar;
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = f8154b.matcher(httpUrl.mo35750c());
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(2);
        C3678l lVar = this.f8155a;
        Intrinsics.checkReturnedValueIsNotNull((Object) group, "slugText");
        return C3176e.f8131t0.mo12240a(lVar.mo13387a(group));
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
