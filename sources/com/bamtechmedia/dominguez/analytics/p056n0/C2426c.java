package com.bamtechmedia.dominguez.analytics.p056n0;

import android.content.Context;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import com.bamtechmedia.dominguez.analytics.C2335a0;
import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Pair;
import p163g.p164a.p165a.C4666d1;
import p163g.p201e.p203b.C5370c;

/* renamed from: com.bamtechmedia.dominguez.analytics.n0.c */
/* compiled from: GlimpseExtrasGenerator.kt */
public final class C2426c {

    /* renamed from: a */
    private final Context f6689a;

    public C2426c(Context context) {
        this.f6689a = context;
    }

    /* renamed from: a */
    public static /* synthetic */ Map m8985a(C2426c cVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return cVar.mo11561a(str, str2);
    }

    /* renamed from: a */
    public final Map<String, Object> mo11561a(String str, String str2) {
        Pair[] pairArr = new Pair[3];
        String a = C4666d1.m16246a();
        if (a == null) {
            a = "";
        }
        boolean z = false;
        pairArr[0] = C12907r.m40244a("adobeId", a);
        pairArr[1] = C12907r.m40244a("kochavaAppId", this.f6689a.getResources().getString(C5370c.glimpse_kochavaAppId));
        pairArr[2] = C12907r.m40244a(StreamSampleTelemetryData.TIMESTAMP_KEY, C2335a0.f6535b.mo11444a());
        Map a2 = C5859p.m18901a(C13173j0.m40356a(pairArr), !(str == null || str.length() == 0), "action", str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        return C5859p.m18901a(a2, !z, "pageName", str2);
    }
}
