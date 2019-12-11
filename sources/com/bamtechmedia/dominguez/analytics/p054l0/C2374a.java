package com.bamtechmedia.dominguez.analytics.p054l0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C12907r;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078CX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/analytics/calltimevalues/CallTimeAnalyticsValues;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callTimeState", "", "", "getCallTimeState", "()Ljava/util/Map;", "connectionTypeValue", "getConnectionTypeValue", "()Ljava/lang/String;", "screenOrientationValue", "getScreenOrientationValue", "timestampValue", "determineMobileType", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkTypesUsingActiveNetworkInfo", "", "networkTypesUsingCapabilities", "orientation", "", "Companion", "analytics_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.analytics.l0.a */
/* compiled from: CallTimeAnalyticsValues.kt */
public final class C2374a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Lazy f6593c = C12763i.m39921a(C2375a.f6597c);

    /* renamed from: d */
    public static final C2376b f6594d = new C2376b(null);

    /* renamed from: a */
    private final String f6595a;

    /* renamed from: b */
    private final Context f6596b;

    /* renamed from: com.bamtechmedia.dominguez.analytics.l0.a$a */
    /* compiled from: CallTimeAnalyticsValues.kt */
    static final class C2375a extends C12881k implements Function0<SimpleDateFormat> {

        /* renamed from: c */
        public static final C2375a f6597c = new C2375a();

        C2375a() {
            super(0);
        }

        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: com.bamtechmedia.dominguez.analytics.l0.a$b */
    /* compiled from: CallTimeAnalyticsValues.kt */
    public static final class C2376b {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f6598a = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C2376b.class), "TIME_FORMAT", "getTIME_FORMAT()Ljava/text/SimpleDateFormat;"))};

        private C2376b() {
        }

        /* renamed from: a */
        public final SimpleDateFormat mo11508a() {
            Lazy b = C2374a.f6593c;
            C2376b bVar = C2374a.f6594d;
            KProperty kProperty = f6598a[0];
            return (SimpleDateFormat) b.getValue();
        }

        public /* synthetic */ C2376b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2374a(Context context) {
        this.f6596b = context;
        SimpleDateFormat a = f6594d.mo11508a();
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkReturnedValueIsNotNull((Object) instance, "Calendar.getInstance()");
        String format = a.format(instance.getTime());
        Intrinsics.checkReturnedValueIsNotNull((Object) format, "TIME_FORMAT.format(Calendar.getInstance().time)");
        this.f6595a = format;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private final String m8902c() {
        List list;
        Object systemService = this.f6596b.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (VERSION.SDK_INT >= 23) {
                list = mo11507b(connectivityManager);
            } else {
                list = mo11505a(connectivityManager);
            }
            return C13199w.m40559a(list, ", ", null, null, 0, null, null, 62, null);
        }
        throw new C13142s("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: d */
    private final String m8904d() {
        return m8900a(this.f6596b) != 2 ? "Portrait" : "Landscape";
    }

    /* renamed from: a */
    public final Map<String, String> mo11506a() {
        return C13173j0.m40356a(C12907r.m40244a("connectionType", m8902c()), C12907r.m40244a("screenOrientation", m8904d()), C12907r.m40244a(StreamSampleTelemetryData.TIMESTAMP_KEY, this.f6595a));
    }

    /* renamed from: b */
    public final List<String> mo11507b(ConnectivityManager connectivityManager) {
        ArrayList arrayList = new ArrayList();
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            arrayList.add("Wifi");
        }
        if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
            arrayList.add(m8903c(connectivityManager));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<String> mo11505a(ConnectivityManager connectivityManager) {
        ArrayList arrayList = new ArrayList();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Intrinsics.checkReturnedValueIsNotNull((Object) activeNetworkInfo, "activeNetworkInfo");
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            arrayList.add(m8903c(connectivityManager));
        } else if (type == 1) {
            arrayList.add("Wifi");
        }
        return arrayList;
    }

    /* renamed from: c */
    private final String m8903c(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Intrinsics.checkReturnedValueIsNotNull((Object) activeNetworkInfo, "connectivityManager.activeNetworkInfo");
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            default:
                return "Mobile Unknown";
        }
    }

    /* renamed from: a */
    private final int m8900a(Context context) {
        Resources resources = context.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "context.resources");
        return resources.getConfiguration().orientation;
    }
}
