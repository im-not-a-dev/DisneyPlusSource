package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/sharedstore/RealAcquisitionAnalyticsStore;", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/AcquisitionAnalyticsStore;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "aquisitionType", "getAquisitionType", "()Ljava/lang/String;", "setAquisitionType", "(Ljava/lang/String;)V", "campaignId", "getCampaignId", "setCampaignId", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.q0.e */
/* compiled from: RealAcquisitionAnalyticsStore.kt */
public final class C2453e implements C2449a {

    /* renamed from: a */
    private final SharedPreferences f6745a;

    /* renamed from: com.bamtechmedia.dominguez.analytics.q0.e$a */
    /* compiled from: RealAcquisitionAnalyticsStore.kt */
    public static final class C2454a {
        private C2454a() {
        }

        public /* synthetic */ C2454a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2454a(null);
    }

    public C2453e(SharedPreferences sharedPreferences) {
        this.f6745a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo11576a() {
        String string = this.f6745a.getString("cid", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(CAMPAIGN_ID_KEY, \"\")");
        return string;
    }

    /* renamed from: b */
    public String mo11577b() {
        String string = this.f6745a.getString("acquisitionType", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(ACQUISITION_TYPE_KEY, \"\")");
        return string;
    }
}
