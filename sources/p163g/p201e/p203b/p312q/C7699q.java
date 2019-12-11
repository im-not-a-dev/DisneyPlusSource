package p163g.p201e.p203b.p312q;

import com.disney.disneyplus.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12880j;
import okhttp3.HttpUrl;

/* renamed from: g.e.b.q.q */
/* compiled from: GlobalNavTvDeepLinkMapper.kt */
public final class C7699q implements C7683e {

    /* renamed from: a */
    private static final Set<String> f16739a = C13186o0.m40524a("search");

    /* renamed from: b */
    private static final Set<String> f16740b = C13186o0.m40524a("watchlist");

    /* renamed from: c */
    private static final Set<String> f16741c = C13186o0.m40524a("movies");

    /* renamed from: d */
    private static final Set<String> f16742d = C13186o0.m40524a("series");

    /* renamed from: e */
    public static final C7699q f16743e = new C7699q();

    private C7699q() {
    }

    /* renamed from: a */
    public int mo20597a(HttpUrl httpUrl) {
        List j = httpUrl.mo35759j();
        String str = "link.pathSegments()";
        C12880j.m40222a((Object) j, str);
        String str2 = (String) C13199w.m40591g(j);
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        List j2 = httpUrl.mo35759j();
        C12880j.m40222a((Object) j2, str);
        String str4 = (String) C13199w.m40595i(j2);
        if (str4 == null) {
            str4 = str3;
        }
        if (f16739a.contains(str2)) {
            return R.id.menu_search;
        }
        if (f16740b.contains(str2)) {
            return R.id.menu_watchlist;
        }
        if (f16741c.contains(str4)) {
            return R.id.menu_movies;
        }
        return f16742d.contains(str4) ? R.id.menu_series : R.id.menu_home;
    }
}
