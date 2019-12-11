package com.bamtechmedia.dominguez.analytics;

import com.bamtech.sdk4.useractivity.GlimpseEvent;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/GlimpseAnalytics;", "", "trackEvent", "", "action", "", "event", "Lcom/bamtech/sdk4/useractivity/GlimpseEvent;", "extras", "", "trackPageLoad", "trackSessionStart", "fguid", "playbackSessionId", "contentId", "mediaId", "analyticsApi_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.z */
/* compiled from: GlimpseAnalytics.kt */
public interface C2476z {

    /* renamed from: com.bamtechmedia.dominguez.analytics.z$a */
    /* compiled from: GlimpseAnalytics.kt */
    public static final class C2477a {
        /* renamed from: a */
        public static /* synthetic */ void m9078a(C2476z zVar, String str, GlimpseEvent glimpseEvent, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                if ((i & 4) != 0) {
                    map = C13173j0.m40350a();
                }
                zVar.mo11536a(str, glimpseEvent, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEvent");
        }
    }

    /* renamed from: a */
    void mo11536a(String str, GlimpseEvent glimpseEvent, Map<String, ? extends Object> map);

    /* renamed from: a */
    void mo11537a(String str, String str2, String str3, String str4);

    /* renamed from: i */
    void mo11539i();
}
