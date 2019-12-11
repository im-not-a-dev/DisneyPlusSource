package p163g.p201e.p203b.p287k.p293k;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.core.content.C3690l;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailLinkHandler;", "Lcom/bamtechmedia/dominguez/deeplink/DeepLinkHandler;", "factory", "Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailFragmentFactory;", "(Lcom/bamtechmedia/dominguez/detail/series/SeriesDetailFragmentFactory;)V", "createDeepLinkedFragment", "Landroidx/fragment/app/Fragment;", "link", "Lokhttp3/HttpUrl;", "mapSubPathToTab", "Lcom/bamtechmedia/dominguez/core/content/InitialTab;", "subPath", "", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: g.e.b.k.k.h */
/* compiled from: SeriesDetailLinkHandler.kt */
public final class C7398h implements C7290d {

    /* renamed from: b */
    private static final Pattern f16254b = Pattern.compile("(/[a-zA-Z-]{2,5})?/series/([^/]+)/([0-9a-zA-Z]+)/?(episodes|related|extras|details|(season/([\\d]+)(/episode/([\\d]+)/?.*)?)?)");

    /* renamed from: a */
    private final C7396f f16255a;

    /* renamed from: g.e.b.k.k.h$a */
    /* compiled from: SeriesDetailLinkHandler.kt */
    public static final class C7399a {
        private C7399a() {
        }

        public /* synthetic */ C7399a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7399a(null);
    }

    public C7398h(C7396f fVar) {
        this.f16255a = fVar;
    }

    /* renamed from: a */
    private final C3690l m22149a(String str) {
        switch (str.hashCode()) {
            case -1289032093:
                if (str.equals("extras")) {
                    return C3690l.EXTRAS;
                }
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    return C3690l.EPISODES;
                }
                break;
            case 1090493483:
                if (str.equals("related")) {
                    return C3690l.RELATED;
                }
                break;
            case 1557721666:
                if (str.equals("details")) {
                    return C3690l.DETAILS;
                }
                break;
        }
        return C3690l.NONE;
    }

    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        Matcher matcher = f16254b.matcher(httpUrl.mo35750c());
        Integer num = null;
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(3);
        String group2 = matcher.group(4);
        if (group2 == null) {
            group2 = "";
        }
        C3690l a = C12832w.m40123b(group2, "season/", false, 2, null) ? C3690l.EPISODES : m22149a(group2);
        String group3 = matcher.group(6);
        Integer d = group3 != null ? C12831v.m40110d(group3) : null;
        String group4 = matcher.group(8);
        if (group4 != null) {
            num = C12831v.m40110d(group4);
        }
        boolean contains = httpUrl.mo35762m().contains("addToWatchlist");
        boolean contains2 = httpUrl.mo35762m().contains("download");
        C7396f fVar = this.f16255a;
        C12880j.m40222a((Object) group, "encodedSeriesId");
        C7394e eVar = new C7394e(group, null, a, contains2, contains, d != null ? d.intValue() : 0, num != null ? num.intValue() : 0);
        return fVar.mo20240a(eVar);
    }

    public List<Fragment> createDeepLinkedFragmentStack(HttpUrl httpUrl) {
        return C7291a.m21910b(this, httpUrl);
    }

    public Intent createDeepLinkedIntent(HttpUrl httpUrl) {
        return C7291a.m21911c(this, httpUrl);
    }
}
