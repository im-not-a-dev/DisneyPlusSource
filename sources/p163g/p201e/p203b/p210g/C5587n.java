package p163g.p201e.p203b.p210g;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: g.e.b.g.n */
/* compiled from: OfflineStateViewModel.kt */
public final class C5587n {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m18411b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
