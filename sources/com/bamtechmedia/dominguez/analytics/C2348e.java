package com.bamtechmedia.dominguez.analytics;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J*\u0010\n\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "", "trackAction", "", "action", "", "extras", "", "hasPlaceholders", "", "trackPageLoad", "overridePage", "analyticsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.e */
/* compiled from: AdobeAnalytics.kt */
public interface C2348e {

    /* renamed from: com.bamtechmedia.dominguez.analytics.e$a */
    /* compiled from: AdobeAnalytics.kt */
    public static final class C2349a {
        /* renamed from: a */
        public static /* synthetic */ void m8854a(C2348e eVar, Map map, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    map = C13173j0.m40350a();
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                eVar.mo11468a(map, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPageLoad");
        }

        /* renamed from: a */
        public static /* synthetic */ void m8853a(C2348e eVar, String str, Map map, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = C13173j0.m40350a();
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                eVar.mo11467a(str, map, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAction");
        }
    }

    /* renamed from: a */
    void mo11467a(String str, Map<String, String> map, boolean z);

    /* renamed from: a */
    void mo11468a(Map<String, String> map, String str);
}
