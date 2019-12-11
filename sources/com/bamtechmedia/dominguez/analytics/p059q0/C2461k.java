package com.bamtechmedia.dominguez.analytics.p059q0;

import android.content.SharedPreferences;
import com.bamtechmedia.dominguez.analytics.C2350e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/sharedstore/RealPaywallAnalyticsStore;", "Lcom/bamtechmedia/dominguez/analytics/PaywallAnalyticsStore;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "purchaseEndDate", "getPurchaseEndDate", "()Ljava/lang/String;", "setPurchaseEndDate", "(Ljava/lang/String;)V", "purchaseName", "getPurchaseName", "setPurchaseName", "purchasePrice", "getPurchasePrice", "setPurchasePrice", "purchaseSku", "getPurchaseSku", "setPurchaseSku", "purchaseStartDate", "getPurchaseStartDate", "setPurchaseStartDate", "resetValues", "", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.q0.k */
/* compiled from: RealPaywallAnalyticsStore.kt */
public final class C2461k implements C2350e0 {

    /* renamed from: a */
    private final SharedPreferences f6751a;

    /* renamed from: com.bamtechmedia.dominguez.analytics.q0.k$a */
    /* compiled from: RealPaywallAnalyticsStore.kt */
    public static final class C2462a {
        private C2462a() {
        }

        public /* synthetic */ C2462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2462a(null);
    }

    public C2461k(SharedPreferences sharedPreferences) {
        this.f6751a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo11470a(String str) {
        this.f6751a.edit().putString("userPurchaseSKU", str).apply();
    }

    /* renamed from: b */
    public String mo11471b() {
        String string = this.f6751a.getString("userProductName", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(PURCHASE_NAME, \"\")");
        return string;
    }

    /* renamed from: c */
    public String mo11473c() {
        String string = this.f6751a.getString("userPurchaseSKU", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(PURCHASED_SKU_KEY, \"\")");
        return string;
    }

    /* renamed from: d */
    public void mo11476d(String str) {
        this.f6751a.edit().putString("userPurchaseStartDate", str).apply();
    }

    /* renamed from: e */
    public String mo11477e() {
        String string = this.f6751a.getString("userPurchaseStartDate", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(PURCHASED_START_DATE, \"\")");
        return string;
    }

    /* renamed from: f */
    public String mo11479f() {
        String string = this.f6751a.getString("userPurchaseEndDate", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(EXPIRATION_END_DATE, \"\")");
        return string;
    }

    /* renamed from: a */
    public String mo11469a() {
        String string = this.f6751a.getString("userPurchasePrice", "");
        Intrinsics.checkReturnedValueIsNotNull((Object) string, "sharedPrefs.getString(PURCHASE_PRICE, \"\")");
        return string;
    }

    /* renamed from: b */
    public void mo11472b(String str) {
        this.f6751a.edit().putString("userProductName", str).apply();
    }

    /* renamed from: c */
    public void mo11474c(String str) {
        this.f6751a.edit().putString("userPurchaseEndDate", str).apply();
    }

    /* renamed from: d */
    public void mo11475d() {
        String str = "";
        mo11474c(str);
        mo11472b(str);
        mo11470a(str);
        mo11476d(str);
        mo11478e(str);
    }

    /* renamed from: e */
    public void mo11478e(String str) {
        this.f6751a.edit().putString("userPurchasePrice", str).apply();
    }
}
