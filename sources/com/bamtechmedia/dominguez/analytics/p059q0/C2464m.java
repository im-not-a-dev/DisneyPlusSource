package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/sharedstore/RealUserSubscriptionInfoAnalyticsStore;", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/UserSubscriptionInfoAnalyticsStore;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "subscriberStatus", "getSubscriberStatus", "()Ljava/lang/String;", "setSubscriberStatus", "(Ljava/lang/String;)V", "userVisitorState", "getUserVisitorState", "setUserVisitorState", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.q0.m */
/* compiled from: RealUserSubscriptionInfoAnalyticsStore.kt */
public final class C2464m implements C2467o {

    /* renamed from: a */
    private final SharedPreferences f6753a;

    /* renamed from: com.bamtechmedia.dominguez.analytics.q0.m$a */
    /* compiled from: RealUserSubscriptionInfoAnalyticsStore.kt */
    public static final class C2465a {
        private C2465a() {
        }

        public /* synthetic */ C2465a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2465a(null);
    }

    public C2464m(SharedPreferences sharedPreferences) {
        this.f6753a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo11587a() {
        String string = this.f6753a.getString("userSubscriptionState", "");
        C12880j.m40222a((Object) string, "sharedPrefs.getString(SUBSCRIPTION_STATE, \"\")");
        return string;
    }

    /* renamed from: b */
    public String mo11589b() {
        String string = this.f6753a.getString("userVisitorState", "");
        C12880j.m40222a((Object) string, "sharedPrefs.getString(USER_VISITOR_STATE, \"\")");
        return string;
    }

    /* renamed from: a */
    public void mo11588a(String str) {
        this.f6753a.edit().putString("userSubscriptionState", str).apply();
    }

    /* renamed from: b */
    public void mo11590b(String str) {
        this.f6753a.edit().putString("userVisitorState", str).apply();
    }
}
