package com.bamtechmedia.dominguez.legal;

import com.bamtechmedia.dominguez.analytics.C2334a;
import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2348e.C2349a;
import com.bamtechmedia.dominguez.analytics.C2378m;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/legal/LegalCenterAnalytics;", "", "activePageOverride", "Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;", "adobe", "Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;", "(Lcom/bamtechmedia/dominguez/analytics/ActivePageOverride;Lcom/bamtechmedia/dominguez/analytics/AdobeAnalytics;)V", "trackSectionClosed", "", "trackSectionOpened", "title", "", "legal_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LegalCenterAnalytics.kt */
public final class LegalCenterAnalytics {
    private final C2334a activePageOverride;
    private final C2348e adobe;

    public LegalCenterAnalytics(C2334a aVar, C2348e eVar) {
        this.activePageOverride = aVar;
        this.adobe = eVar;
    }

    public final void trackSectionClosed() {
        C2349a.m8853a(this.adobe, "{{ANALYTICS_PAGE}} : Back Click", null, false, 6, null);
    }

    public final void trackSectionOpened(String str) {
        C2334a aVar = this.activePageOverride;
        C2378m mVar = new C2378m(str, null, null, null, 12, null);
        aVar.mo11443a(mVar);
        C2349a.m8854a(this.adobe, null, null, 3, null);
    }
}
