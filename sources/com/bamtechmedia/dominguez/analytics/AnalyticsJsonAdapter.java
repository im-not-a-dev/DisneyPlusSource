package com.bamtechmedia.dominguez.analytics;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p163g.p500m.p501a.C11725h;
import p163g.p500m.p501a.C11734j;
import p163g.p500m.p501a.C11737m;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11747s;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11780y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/AnalyticsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bamtechmedia/dominguez/analytics/Analytics;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "intAdapter", "", "listOfStringAdapter", "", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AnalyticsJsonAdapter.kt */
public final class AnalyticsJsonAdapter extends C11725h<Analytics> {
    private final C11725h<Boolean> booleanAdapter;
    private final C11725h<Integer> intAdapter;
    private final C11725h<List<String>> listOfStringAdapter;
    private final C11739b options;
    private final C11725h<String> stringAdapter;

    public AnalyticsJsonAdapter(C11760v vVar) {
        C11739b a = C11739b.m37729a("rsids", "server", "ssl", "offlineEnabled", "charset", "lifecycleTimeout", "privacyDefault", "batchLimit", "timezone", "timezoneOffset", "referrerTimeout", "backdateSessionInfo", "poi");
        Intrinsics.checkReturnedValueIsNotNull((Object) a, "JsonReader.Options.of(\"r…kdateSessionInfo\", \"poi\")");
        this.options = a;
        C11725h<String> a2 = vVar.mo29869a((Type) String.class, C13188p0.m40531a(), "rsids");
        Intrinsics.checkReturnedValueIsNotNull((Object) a2, "moshi.adapter<String>(St…ions.emptySet(), \"rsids\")");
        this.stringAdapter = a2;
        C11725h<Boolean> a3 = vVar.mo29869a((Type) Boolean.TYPE, C13188p0.m40531a(), "ssl");
        Intrinsics.checkReturnedValueIsNotNull((Object) a3, "moshi.adapter<Boolean>(B…ctions.emptySet(), \"ssl\")");
        this.booleanAdapter = a3;
        C11725h<Integer> a4 = vVar.mo29869a((Type) Integer.TYPE, C13188p0.m40531a(), "lifecycleTimeout");
        Intrinsics.checkReturnedValueIsNotNull((Object) a4, "moshi.adapter<Int>(Int::…et(), \"lifecycleTimeout\")");
        this.intAdapter = a4;
        C11725h<List<String>> a5 = vVar.mo29869a((Type) C11780y.m37894a((Type) List.class, String.class), C13188p0.m40531a(), "poi");
        Intrinsics.checkReturnedValueIsNotNull((Object) a5, "moshi.adapter<List<Strin…ctions.emptySet(), \"poi\")");
        this.listOfStringAdapter = a5;
    }

    /* renamed from: a */
    public void toJson(C11747s sVar, Analytics analytics) {
        if (analytics != null) {
            sVar.mo29791b();
            sVar.mo29796e("rsids");
            this.stringAdapter.toJson(sVar, analytics.mo11403i());
            sVar.mo29796e("server");
            this.stringAdapter.toJson(sVar, analytics.mo11404j());
            sVar.mo29796e("ssl");
            this.booleanAdapter.toJson(sVar, Boolean.valueOf(analytics.mo11405k()));
            sVar.mo29796e("offlineEnabled");
            this.booleanAdapter.toJson(sVar, Boolean.valueOf(analytics.mo11397e()));
            sVar.mo29796e("charset");
            this.stringAdapter.toJson(sVar, analytics.mo11395c());
            sVar.mo29796e("lifecycleTimeout");
            this.intAdapter.toJson(sVar, Integer.valueOf(analytics.mo11396d()));
            sVar.mo29796e("privacyDefault");
            this.stringAdapter.toJson(sVar, analytics.mo11400g());
            sVar.mo29796e("batchLimit");
            this.intAdapter.toJson(sVar, Integer.valueOf(analytics.mo11394b()));
            sVar.mo29796e("timezone");
            this.stringAdapter.toJson(sVar, analytics.mo11406l());
            sVar.mo29796e("timezoneOffset");
            this.intAdapter.toJson(sVar, Integer.valueOf(analytics.mo11407m()));
            sVar.mo29796e("referrerTimeout");
            this.intAdapter.toJson(sVar, Integer.valueOf(analytics.mo11401h()));
            sVar.mo29796e("backdateSessionInfo");
            this.booleanAdapter.toJson(sVar, Boolean.valueOf(analytics.mo11393a()));
            sVar.mo29796e("poi");
            this.listOfStringAdapter.toJson(sVar, analytics.mo11399f());
            sVar.mo29795e();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Analytics)";
    }

    public Analytics fromJson(C11737m mVar) {
        C11737m mVar2 = mVar;
        mVar.mo29763b();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        String str5 = null;
        Boolean bool3 = null;
        List list = null;
        while (mVar.mo29770f()) {
            switch (mVar2.mo29758a(this.options)) {
                case -1:
                    mVar.mo29783q();
                    mVar.mo29784r();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(mVar2);
                    if (str != null) {
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Non-null value 'rsids' was null at ");
                        sb.append(mVar.mo29775j0());
                        throw new C11734j(sb.toString());
                    }
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str2 != null) {
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Non-null value 'server' was null at ");
                        sb2.append(mVar.mo29775j0());
                        throw new C11734j(sb2.toString());
                    }
                case 2:
                    Boolean bool4 = (Boolean) this.booleanAdapter.fromJson(mVar2);
                    if (bool4 != null) {
                        bool = Boolean.valueOf(bool4.booleanValue());
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Non-null value 'ssl' was null at ");
                        sb3.append(mVar.mo29775j0());
                        throw new C11734j(sb3.toString());
                    }
                case 3:
                    Boolean bool5 = (Boolean) this.booleanAdapter.fromJson(mVar2);
                    if (bool5 != null) {
                        bool2 = Boolean.valueOf(bool5.booleanValue());
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Non-null value 'offlineEnabled' was null at ");
                        sb4.append(mVar.mo29775j0());
                        throw new C11734j(sb4.toString());
                    }
                case 4:
                    str3 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str3 != null) {
                        break;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Non-null value 'charset' was null at ");
                        sb5.append(mVar.mo29775j0());
                        throw new C11734j(sb5.toString());
                    }
                case 5:
                    Integer num5 = (Integer) this.intAdapter.fromJson(mVar2);
                    if (num5 != null) {
                        num = Integer.valueOf(num5.intValue());
                        break;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Non-null value 'lifecycleTimeout' was null at ");
                        sb6.append(mVar.mo29775j0());
                        throw new C11734j(sb6.toString());
                    }
                case 6:
                    str4 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str4 != null) {
                        break;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Non-null value 'privacyDefault' was null at ");
                        sb7.append(mVar.mo29775j0());
                        throw new C11734j(sb7.toString());
                    }
                case 7:
                    Integer num6 = (Integer) this.intAdapter.fromJson(mVar2);
                    if (num6 != null) {
                        num2 = Integer.valueOf(num6.intValue());
                        break;
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Non-null value 'batchLimit' was null at ");
                        sb8.append(mVar.mo29775j0());
                        throw new C11734j(sb8.toString());
                    }
                case 8:
                    str5 = (String) this.stringAdapter.fromJson(mVar2);
                    if (str5 != null) {
                        break;
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Non-null value 'timezone' was null at ");
                        sb9.append(mVar.mo29775j0());
                        throw new C11734j(sb9.toString());
                    }
                case 9:
                    Integer num7 = (Integer) this.intAdapter.fromJson(mVar2);
                    if (num7 != null) {
                        num3 = Integer.valueOf(num7.intValue());
                        break;
                    } else {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Non-null value 'timezoneOffset' was null at ");
                        sb10.append(mVar.mo29775j0());
                        throw new C11734j(sb10.toString());
                    }
                case 10:
                    Integer num8 = (Integer) this.intAdapter.fromJson(mVar2);
                    if (num8 != null) {
                        num4 = Integer.valueOf(num8.intValue());
                        break;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Non-null value 'referrerTimeout' was null at ");
                        sb11.append(mVar.mo29775j0());
                        throw new C11734j(sb11.toString());
                    }
                case 11:
                    Boolean bool6 = (Boolean) this.booleanAdapter.fromJson(mVar2);
                    if (bool6 != null) {
                        bool3 = Boolean.valueOf(bool6.booleanValue());
                        break;
                    } else {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("Non-null value 'backdateSessionInfo' was null at ");
                        sb12.append(mVar.mo29775j0());
                        throw new C11734j(sb12.toString());
                    }
                case 12:
                    List list2 = (List) this.listOfStringAdapter.fromJson(mVar2);
                    if (list2 != null) {
                        list = list2;
                        break;
                    } else {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("Non-null value 'poi' was null at ");
                        sb13.append(mVar.mo29775j0());
                        throw new C11734j(sb13.toString());
                    }
            }
        }
        mVar.mo29767d();
        if (str == null) {
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Required property 'rsids' missing at ");
            sb14.append(mVar.mo29775j0());
            throw new C11734j(sb14.toString());
        } else if (str2 == null) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Required property 'server' missing at ");
            sb15.append(mVar.mo29775j0());
            throw new C11734j(sb15.toString());
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                if (str3 == null) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("Required property 'charset' missing at ");
                    sb16.append(mVar.mo29775j0());
                    throw new C11734j(sb16.toString());
                } else if (num != null) {
                    int intValue = num.intValue();
                    if (str4 == null) {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("Required property 'privacyDefault' missing at ");
                        sb17.append(mVar.mo29775j0());
                        throw new C11734j(sb17.toString());
                    } else if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (str5 == null) {
                            StringBuilder sb18 = new StringBuilder();
                            sb18.append("Required property 'timezone' missing at ");
                            sb18.append(mVar.mo29775j0());
                            throw new C11734j(sb18.toString());
                        } else if (num3 != null) {
                            int intValue3 = num3.intValue();
                            if (num4 != null) {
                                int intValue4 = num4.intValue();
                                if (bool3 != null) {
                                    boolean booleanValue3 = bool3.booleanValue();
                                    if (list != null) {
                                        Analytics analytics = new Analytics(str, str2, booleanValue, booleanValue2, str3, intValue, str4, intValue2, str5, intValue3, intValue4, booleanValue3, list);
                                        return analytics;
                                    }
                                    StringBuilder sb19 = new StringBuilder();
                                    sb19.append("Required property 'poi' missing at ");
                                    sb19.append(mVar.mo29775j0());
                                    throw new C11734j(sb19.toString());
                                }
                                StringBuilder sb20 = new StringBuilder();
                                sb20.append("Required property 'backdateSessionInfo' missing at ");
                                sb20.append(mVar.mo29775j0());
                                throw new C11734j(sb20.toString());
                            }
                            StringBuilder sb21 = new StringBuilder();
                            sb21.append("Required property 'referrerTimeout' missing at ");
                            sb21.append(mVar.mo29775j0());
                            throw new C11734j(sb21.toString());
                        } else {
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("Required property 'timezoneOffset' missing at ");
                            sb22.append(mVar.mo29775j0());
                            throw new C11734j(sb22.toString());
                        }
                    } else {
                        StringBuilder sb23 = new StringBuilder();
                        sb23.append("Required property 'batchLimit' missing at ");
                        sb23.append(mVar.mo29775j0());
                        throw new C11734j(sb23.toString());
                    }
                } else {
                    StringBuilder sb24 = new StringBuilder();
                    sb24.append("Required property 'lifecycleTimeout' missing at ");
                    sb24.append(mVar.mo29775j0());
                    throw new C11734j(sb24.toString());
                }
            } else {
                StringBuilder sb25 = new StringBuilder();
                sb25.append("Required property 'offlineEnabled' missing at ");
                sb25.append(mVar.mo29775j0());
                throw new C11734j(sb25.toString());
            }
        } else {
            StringBuilder sb26 = new StringBuilder();
            sb26.append("Required property 'ssl' missing at ");
            sb26.append(mVar.mo29775j0());
            throw new C11734j(sb26.toString());
        }
    }
}
