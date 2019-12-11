package p163g.p201e.p203b.p407e0;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p163g.p201e.p203b.p286j.C7290d;
import p163g.p201e.p203b.p286j.C7290d.C7291a;

/* renamed from: g.e.b.e0.k */
/* compiled from: WatchlistLinkHandler.kt */
public final class C10600k implements C7290d {
    public Fragment createDeepLinkedFragment(HttpUrl httpUrl) {
        if (Intrinsics.areEqual((Object) httpUrl.mo35750c(), (Object) "/watchlist")) {
            return new C10597i();
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
