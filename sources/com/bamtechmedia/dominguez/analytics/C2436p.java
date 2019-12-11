package com.bamtechmedia.dominguez.analytics;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&J\u001e\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/BrazeAnalytics;", "", "trackAction", "", "action", "", "extras", "", "trackPageLoad", "trackProfileChange", "profileId", "language", "isKidsProfile", "", "analyticsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.p */
/* compiled from: BrazeAnalytics.kt */
public interface C2436p {

    /* renamed from: com.bamtechmedia.dominguez.analytics.p$a */
    /* compiled from: BrazeAnalytics.kt */
    public static final class C2437a {
        /* renamed from: a */
        public static /* synthetic */ void m8999a(C2436p pVar, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                pVar.mo11567a(str, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAction");
        }
    }

    /* renamed from: a */
    void mo11566a(String str, String str2, boolean z);

    /* renamed from: a */
    void mo11567a(String str, Map<String, String> map);

    /* renamed from: a */
    void mo11568a(Map<String, String> map);
}
