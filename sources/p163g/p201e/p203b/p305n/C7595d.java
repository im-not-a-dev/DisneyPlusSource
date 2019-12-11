package p163g.p201e.p203b.p305n;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;
import p163g.p201e.p203b.p305n.C7588b.C7589a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/editorial/EditorialPageLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "()V", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.n.d */
/* compiled from: EditorialPageLinkHandler.kt */
public final class C7595d implements C7290d {

    /* renamed from: a */
    private static final Pattern f16614a = Pattern.compile("(/([a-zA-Z]{2,5}))?/(collection|editorial|franchise|character|age)/([a-z_-]+)?");

    /* renamed from: g.e.b.n.d$a */
    /* compiled from: EditorialPageLinkHandler.kt */
    public static final class C7596a {
        private C7596a() {
        }

        public /* synthetic */ C7596a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7596a(null);
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = f16614a.matcher(httpUrl.mo35750c());
        if (!matcher.find()) {
            return null;
        }
        matcher.group(2);
        String group = matcher.group(3);
        String group2 = matcher.group(4);
        C7589a aVar = C7588b.f16602o0;
        Intrinsics.checkReturnedValueIsNotNull((Object) group, "contentClass");
        Intrinsics.checkReturnedValueIsNotNull((Object) group2, "editorialValue");
        C3676k kVar = new C3676k(group, group2, false, 4, null);
        return aVar.mo20528a(kVar);
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
