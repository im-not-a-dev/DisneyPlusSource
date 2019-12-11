package p163g.p201e.p203b.p315s;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;
import p163g.p201e.p203b.p286j.C7300k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/landing/LandingPageLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "slugProvider", "Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;", "context", "Landroid/content/Context;", "deepLinks", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;", "(Lcom/bamtechmedia/dominguez/core/content/collections/SlugProvider;Landroid/content/Context;Lcom/bamtechmedia/dominguez/deeplink/DeepLinks;)V", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "Companion", "core_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.s.g */
/* compiled from: LandingPageLinkHandler.kt */
public final class C7754g implements C7290d {

    /* renamed from: d */
    private static final Pattern f16826d = Pattern.compile("(/[a-zA-Z-]{2,5})?/(movies|series)(/([a-z]+))?$");

    /* renamed from: a */
    private final C3678l f16827a;

    /* renamed from: b */
    private final Context f16828b;

    /* renamed from: c */
    private final C7300k f16829c;

    /* renamed from: g.e.b.s.g$a */
    /* compiled from: LandingPageLinkHandler.kt */
    public static final class C7755a {
        private C7755a() {
        }

        public /* synthetic */ C7755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7755a(null);
    }

    public C7754g(C3678l lVar, Context context, C7300k kVar) {
        this.f16827a = lVar;
        this.f16828b = context;
        this.f16829c = kVar;
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = f16826d.matcher(httpUrl.mo35750c());
        if (matcher.find()) {
            String group = matcher.group(2);
            matcher.group(3);
            C3678l lVar = this.f16827a;
            Intrinsics.checkReturnedValueIsNotNull((Object) group, "slugText");
            C3676k b = lVar.mo13389b(group);
            if (!C5837i.m18843e(this.f16828b)) {
                return C7745e.f16813n0.mo20659b(b);
            }
            this.f16829c.mo20106s();
        }
        return null;
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
