package p163g.p201e.p203b.p286j;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "createDeepLinkedFragmentStack", "", "createDeepLinkedIntent", "Landroid/content/Intent;", "deeplinkApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.j.d */
/* compiled from: DeepLinkHandler.kt */
public interface C7290d {

    /* renamed from: g.e.b.j.d$a */
    /* compiled from: DeepLinkHandler.kt */
    public static final class C7291a {
        /* renamed from: a */
        public static Fragment m21909a(C7290d dVar, HttpUrl httpUrl) {
            return null;
        }

        /* renamed from: b */
        public static List<Fragment> m21910b(C7290d dVar, HttpUrl httpUrl) {
            return null;
        }

        /* renamed from: c */
        public static Intent m21911c(C7290d dVar, HttpUrl httpUrl) {
            return null;
        }
    }

    Fragment createDeepLinkedFragment(HttpUrl httpUrl);

    List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl);

    Intent createDeepLinkedIntent(HttpUrl httpUrl);
}
