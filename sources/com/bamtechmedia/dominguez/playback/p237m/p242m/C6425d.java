package com.bamtechmedia.dominguez.playback.p237m.p242m;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.bamtechmedia.dominguez.core.utils.C5855o;
import com.bamtechmedia.dominguez.playback.C6266a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u000e\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\r\u0010\u0013\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0014J\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/playback/common/engine/StartupBitrateProvider;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "config", "Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;", "(Landroid/net/ConnectivityManager;Lcom/bamtechmedia/dominguez/playback/PlaybackConfig;)V", "bandwidth", "", "Lkotlin/Pair;", "getBandwidth", "(Lkotlin/Pair;)I", "startupBitrate", "getStartupBitrate", "bucketBasedStartupBitrate", "buckets", "", "capabilities", "Landroid/net/NetworkCapabilities;", "capabilitiesBasedStartupBitrate", "capabilitiesBasedStartupBitrate$playback_release", "playback_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.playback.m.m.d */
/* compiled from: StartupBitrateProvider.kt */
public final class C6425d {

    /* renamed from: a */
    private final ConnectivityManager f14574a;

    /* renamed from: b */
    private final C6266a f14575b;

    /* renamed from: com.bamtechmedia.dominguez.playback.m.m.d$a */
    /* compiled from: Comparisons.kt */
    public static final class C6426a<T> implements Comparator<T> {

        /* renamed from: c */
        final /* synthetic */ C6425d f14576c;

        public C6426a(C6425d dVar) {
            this.f14576c = dVar;
        }

        public final int compare(T t, T t2) {
            return C13206b.m40622a(Integer.valueOf(this.f14576c.m20088a((Pair) t)), Integer.valueOf(this.f14576c.m20088a((Pair) t2)));
        }
    }

    public C6425d(ConnectivityManager connectivityManager, C6266a aVar) {
        this.f14574a = connectivityManager;
        this.f14575b = aVar;
    }

    /* renamed from: b */
    public final int mo19078b() {
        int i;
        if (VERSION.SDK_INT >= 23) {
            i = mo19077a();
        } else {
            NetworkInfo activeNetworkInfo = this.f14574a.getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                i = this.f14575b.mo18857h();
            } else {
                i = this.f14575b.mo18852c();
            }
        }
        C5855o oVar = C5855o.f13640a;
        return i;
    }

    /* renamed from: a */
    public final int mo19077a() {
        int i;
        Network activeNetwork = this.f14574a.getActiveNetwork();
        if (activeNetwork != null) {
            NetworkCapabilities networkCapabilities = this.f14574a.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                Map k = this.f14575b.mo18860k();
                C5855o oVar = C5855o.f13640a;
                if (!k.isEmpty()) {
                    i = m20087a(k, networkCapabilities);
                } else if (networkCapabilities.hasTransport(0)) {
                    i = this.f14575b.mo18852c();
                } else {
                    i = this.f14575b.mo18857h();
                }
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private final int m20089b(Pair<Integer, Integer> pair) {
        return ((Number) pair.mo31016d()).intValue();
    }

    /* renamed from: a */
    private final int m20087a(Map<Integer, Integer> map, NetworkCapabilities networkCapabilities) {
        Object obj;
        boolean z;
        Iterator it = C13199w.m40562a((Iterable) C13177k0.m40416f(map), (Comparator) new C6426a(this)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m20088a((Pair) obj) > networkCapabilities.getLinkDownstreamBandwidthKbps()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            return m20089b(pair);
        }
        return this.f14575b.mo18857h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m20088a(Pair<Integer, Integer> pair) {
        return ((Number) pair.mo31015c()).intValue();
    }
}
