package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/sharedstore/RealLoginStatusAnalyticsStore;", "Lcom/bamtechmedia/dominguez/analytics/sharedstore/LoginStatusAnalyticsStore;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "loginStatus", "getLoginStatus", "()Ljava/lang/String;", "setLoginStatus", "(Ljava/lang/String;)V", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.q0.i */
/* compiled from: RealLoginStatusAnalyticsStore.kt */
public final class C2458i implements C2452d {

    /* renamed from: a */
    private final SharedPreferences f6749a;

    /* renamed from: com.bamtechmedia.dominguez.analytics.q0.i$a */
    /* compiled from: RealLoginStatusAnalyticsStore.kt */
    public static final class C2459a {
        private C2459a() {
        }

        public /* synthetic */ C2459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2459a(null);
    }

    public C2458i(SharedPreferences sharedPreferences) {
        this.f6749a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo11585a() {
        String string = this.f6749a.getString("loginStatus", "false");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(LO…TUS_KEY, USER_LOGGED_OUT)");
        return string;
    }

    /* renamed from: a */
    public void mo11586a(String str) {
        this.f6749a.edit().putString("loginStatus", str).apply();
    }
}
