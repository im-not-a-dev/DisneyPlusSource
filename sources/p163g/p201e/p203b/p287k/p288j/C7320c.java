package p163g.p201e.p203b.p287k.p288j;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.C3690l;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;
import p163g.p201e.p203b.p287k.p288j.p292k.C7350a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/movie/MovieDetailLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "factory", "Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailFragmentFactory;", "(Lcom/bamtechmedia/dominguez/detail/movie/viewmodel/MovieDetailFragmentFactory;)V", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "mapSubPathToTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "subPath", "", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.j.c */
/* compiled from: MovieDetailLinkHandler.kt */
public final class C7320c implements C7290d {

    /* renamed from: b */
    private static final Pattern f16078b = Pattern.compile("(/[a-zA-Z-]{2,5})?/?(movies)/([^/]+)/([a-zA-Z0-9]+)/?(extras|related|details)?");

    /* renamed from: a */
    private final C7350a f16079a;

    /* renamed from: g.e.b.k.j.c$a */
    /* compiled from: MovieDetailLinkHandler.kt */
    public static final class C7321a {
        private C7321a() {
        }

        public /* synthetic */ C7321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7321a(null);
    }

    public C7320c(C7350a aVar) {
        this.f16079a = aVar;
    }

    /* renamed from: a */
    private final C3690l m21956a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1289032093) {
                if (hashCode != 1090493483) {
                    if (hashCode == 1557721666 && str.equals("details")) {
                        return C3690l.DETAILS;
                    }
                } else if (str.equals("related")) {
                    return C3690l.RELATED;
                }
            } else if (str.equals("extras")) {
                return C3690l.EXTRAS;
            }
        }
        return C3690l.NONE;
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = f16078b.matcher(httpUrl.mo35750c());
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(4);
        C3690l a = m21956a(matcher.group(5));
        boolean contains = httpUrl.mo35762m().contains("addToWatchlist");
        boolean contains2 = httpUrl.mo35762m().contains("download");
        C7350a aVar = this.f16079a;
        Intrinsics.checkReturnedValueIsNotNull((Object) group, "familyId");
        return aVar.mo20164a(group, a, contains, contains2);
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
