package com.bamtechmedia.dominguez.analytics.p055m0;

import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import com.bamtechmedia.dominguez.analytics.p057o0.C2434c;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.C11969r;
import p520io.reactivex.Single;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001a0\u0019H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/contributors/AndroidSystemContributor;", "Lcom/bamtechmedia/dominguez/analytics/globalvalues/AnalyticsStateContributor;", "locationManager", "Landroid/location/LocationManager;", "localeProvider", "Ljavax/inject/Provider;", "Ljava/util/Locale;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Landroid/location/LocationManager;Ljavax/inject/Provider;Landroid/telephony/TelephonyManager;Lio/reactivex/Scheduler;)V", "carrierValue", "", "deviceValue", "getDeviceValue", "()Ljava/lang/String;", "locationServicesValue", "getLocationServicesValue", "osVersionValue", "userLanguageValue", "kotlin.jvm.PlatformType", "userLocalValue", "getUserLocalValue", "createState", "Lio/reactivex/Single;", "", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.m0.e */
/* compiled from: AndroidSystemContributor.kt */
public final class C2386e implements C2434c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6616a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f6617b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f6618c = String.valueOf(VERSION.SDK_INT);

    /* renamed from: d */
    private final LocationManager f6619d;

    /* renamed from: e */
    private final Provider<Locale> f6620e;

    /* renamed from: f */
    private final C11969r f6621f;

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.e$a */
    /* compiled from: AndroidSystemContributor.kt */
    public static final class C2387a {
        private C2387a() {
        }

        public /* synthetic */ C2387a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.m0.e$b */
    /* compiled from: AndroidSystemContributor.kt */
    static final class C2388b<V> implements Callable<T> {

        /* renamed from: c */
        final /* synthetic */ C2386e f6622c;

        C2388b(C2386e eVar) {
            this.f6622c = eVar;
        }

        public final Map<String, String> call() {
            String str = "Android";
            return C13173j0.m40356a(C12907r.m40244a("platformType", "Mobile App"), C12907r.m40244a("platform", str), C12907r.m40244a(SubjectTokenTypes.DEVICE, this.f6622c.m8924b()), C12907r.m40244a("carrier", this.f6622c.f6616a), C12907r.m40244a("deviceLanguage", this.f6622c.f6617b), C12907r.m40244a("deviceLocale", this.f6622c.m8928d()), C12907r.m40244a("osName", str), C12907r.m40244a("osVersion", this.f6622c.f6618c), C12907r.m40244a("locationServices", this.f6622c.m8926c()));
        }
    }

    static {
        new C2387a(null);
    }

    public C2386e(LocationManager locationManager, Provider<Locale> provider, TelephonyManager telephonyManager, C11969r rVar) {
        this.f6619d = locationManager;
        this.f6620e = provider;
        this.f6621f = rVar;
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        Intrinsics.checkReturnedValueIsNotNull((Object) networkOperatorName, "networkOperatorName");
        Intrinsics.checkReturnedValueIsNotNull((Object) networkOperatorName, "telephonyManager.run { networkOperatorName }");
        this.f6616a = networkOperatorName;
        Object obj = this.f6620e.get();
        Intrinsics.checkReturnedValueIsNotNull(obj, "localeProvider.get()");
        this.f6617b = ((Locale) obj).getLanguage();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m8924b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.checkReturnedValueIsNotNull((Object) str2, "model");
        String str3 = "null cannot be cast to non-null type java.lang.String";
        if (str2 != null) {
            String lowerCase = str2.toLowerCase();
            String str4 = "(this as java.lang.String).toLowerCase()";
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, str4);
            Intrinsics.checkReturnedValueIsNotNull((Object) str, "manufacturer");
            if (str != null) {
                String lowerCase2 = str.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase2, str4);
                if (C12832w.m40123b(lowerCase, lowerCase2, false, 2, null)) {
                    return C12832w.m40125f(str2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C12832w.m40125f(str));
                sb.append(" ");
                sb.append(str2);
                return sb.toString();
            }
            throw new TypeCastException(str3);
        }
        throw new TypeCastException(str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m8926c() {
        LocationManager locationManager = this.f6619d;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network") ? "on" : "off";
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m8928d() {
        String locale = ((Locale) this.f6620e.get()).toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "localeProvider.get().toString()");
        return locale;
    }

    /* renamed from: a */
    public Single<Map<String, String>> mo11521a() {
        Single<Map<String, String>> b = Single.m38401c((Callable<? extends T>) new C2388b<Object>(this)).mo30220b(this.f6621f);
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.fromCallable {\n  ….subscribeOn(ioScheduler)");
        return b;
    }
}
