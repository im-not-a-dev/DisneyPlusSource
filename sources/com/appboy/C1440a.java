package com.appboy;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.appboy.p024n.C1486a;
import com.appboy.p024n.C1489b;
import com.appboy.p027p.C1516a;
import com.appboy.p027p.C1517b;
import com.appboy.p027p.C1518c;
import com.appboy.p027p.C1519d;
import com.appboy.p029q.C1527a;
import com.appboy.p030r.p032p.C1551a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1562h;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1564j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p161f.p162a.C4380a0;
import p161f.p162a.C4381a1;
import p161f.p162a.C4410c;
import p161f.p162a.C4412c0;
import p161f.p162a.C4415c3;
import p161f.p162a.C4419d;
import p161f.p162a.C4420d0;
import p161f.p162a.C4424d3;
import p161f.p162a.C4428d5;
import p161f.p162a.C4432e1;
import p161f.p162a.C4445f1;
import p161f.p162a.C4462h1;
import p161f.p162a.C4472i3;
import p161f.p162a.C4475i6;
import p161f.p162a.C4477j0;
import p161f.p162a.C4484j6;
import p161f.p162a.C4486k0;
import p161f.p162a.C4506m0;
import p161f.p162a.C4517n1.C4519b;
import p161f.p162a.C4539o5;
import p161f.p162a.C4546p0;
import p161f.p162a.C4548p1;
import p161f.p162a.C4556q1;
import p161f.p162a.C4567r1;
import p161f.p162a.C4576s1;
import p161f.p162a.C4587t0;
import p161f.p162a.C4589t2;
import p161f.p162a.C4593t6;
import p161f.p162a.C4595u0;
import p161f.p162a.C4604v1;
import p161f.p162a.C4619x0;
import p161f.p162a.C4621x2;
import p161f.p162a.C4623x3;
import p161f.p162a.C4627y;
import p161f.p162a.C4628y0;
import p161f.p162a.C4632y4;
import p161f.p162a.C4637z0;
import p161f.p162a.C4641z4;

/* renamed from: com.appboy.a */
public class C1440a implements C1479g, C1484l {

    /* renamed from: A */
    private static final Object f5214A = new Object();

    /* renamed from: B */
    private static volatile C1480h f5215B;

    /* renamed from: C */
    private static volatile C1483k f5216C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static volatile boolean f5217D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static volatile boolean f5218E = false;

    /* renamed from: F */
    private static volatile boolean f5219F = false;

    /* renamed from: G */
    private static volatile C4415c3 f5220G;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f5221v = C1557c.m7461a(C1440a.class);
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final Set<String> f5222w = new HashSet(Arrays.asList(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"}));

    /* renamed from: x */
    private static final Set<String> f5223x = new HashSet(Collections.singletonList("calypso appcrawler"));

    /* renamed from: y */
    private static final Set<String> f5224y = new HashSet(Arrays.asList(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"}));
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: z */
    private static volatile C1440a f5225z = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5226a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4410c f5227b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4381a1 f5228c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4475i6 f5229d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1489b f5230e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4628y0 f5231f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4486k0 f5232g;

    /* renamed from: h */
    private final C4420d0 f5233h;

    /* renamed from: i */
    private final C4380a0 f5234i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1481i f5235j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C1477e f5236k;

    /* renamed from: l */
    private volatile C4419d f5237l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile C4621x2 f5238m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C4539o5 f5239n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C4506m0 f5240o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public volatile C4424d3 f5241p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public volatile C4546p0 f5242q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile C4589t2 f5243r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile C4619x0 f5244s;

    /* renamed from: t */
    volatile C4623x3 f5245t;

    /* renamed from: u */
    private volatile boolean f5246u = false;

    /* renamed from: com.appboy.a$a */
    class C1441a implements Runnable {
        C1441a() {
        }

        public void run() {
            try {
                C1440a.this.f5227b.mo15485a(C1440a.this.f5238m.mo15890a(), C1517b.class);
            } catch (JSONException e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to retrieve and publish feed from offline cache.", e);
            }
        }
    }

    /* renamed from: com.appboy.a$a0 */
    class C1442a0 implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String f5249c;

        C1442a0(String str) {
            this.f5249c = str;
        }

        public void run() {
            try {
                if (C1563i.m7490d(this.f5249c)) {
                    C1557c.m7473e(C1440a.f5221v, "Campaign ID cannot be null or blank for push delivery event.");
                } else {
                    C1440a.this.f5242q.mo15772a((C4432e1) C4548p1.m15792i(this.f5249c));
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log push delivery event.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$b */
    class C1443b implements Runnable {
        C1443b() {
        }

        public void run() {
            try {
                C4546p0 i = C1440a.this.f5242q;
                C4519b bVar = new C4519b();
                bVar.mo15712a();
                i.mo15765a(bVar);
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to request refresh of feed.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$b0 */
    class C1444b0 implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f5251U;

        /* renamed from: V */
        final /* synthetic */ String f5252V;

        /* renamed from: c */
        final /* synthetic */ String f5254c;

        C1444b0(String str, String str2, String str3) {
            this.f5254c = str;
            this.f5251U = str2;
            this.f5252V = str3;
        }

        public void run() {
            try {
                if (C1563i.m7490d(this.f5254c)) {
                    C1557c.m7473e(C1440a.f5221v, "Campaign ID cannot be null or blank. Not logging push notification action clicked.");
                } else if (C1563i.m7490d(this.f5251U)) {
                    C1557c.m7473e(C1440a.f5221v, "Action ID cannot be null or blank");
                } else {
                    C1440a.this.f5242q.mo15772a((C4432e1) C4556q1.m15827e(this.f5254c, this.f5251U, this.f5252V));
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log push notification action clicked.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$c */
    class C1445c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Context f5256c;

        C1445c(Context context) {
            this.f5256c = context;
        }

        public void run() {
            if (!C1440a.this.f5230e.mo6705A()) {
                C1557c.m7469c(C1440a.f5221v, "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.");
            } else if (C4587t0.m15916a(C1440a.this.f5226a, C1440a.this.f5230e)) {
                C1557c.m7469c(C1440a.f5221v, "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.");
                new C4587t0(this.f5256c).mo15833a(C1440a.this.f5230e.mo6716i());
            } else {
                C1557c.m7465b(C1440a.f5221v, "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.");
            }
            if (!C1440a.this.f5230e.mo6732y()) {
                C1557c.m7469c(C1440a.f5221v, "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.");
            } else if (C4477j0.m15497a(C1440a.this.f5226a)) {
                C1557c.m7469c(C1440a.f5221v, "Amazon Device Messaging found. Setting up Amazon Device Messaging");
                new C4477j0(C1440a.this.f5226a, C1440a.this.f5231f).mo15632a();
            } else {
                C1557c.m7465b(C1440a.f5221v, "ADM manifest requirements not met. Braze will not register for ADM.");
            }
        }
    }

    /* renamed from: com.appboy.a$c0 */
    class C1446c0 implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f5257U;

        /* renamed from: c */
        final /* synthetic */ String f5259c;

        C1446c0(String str, String str2) {
            this.f5259c = str;
            this.f5257U = str2;
        }

        public void run() {
            try {
                if (!C1564j.m7495a(this.f5259c, this.f5257U)) {
                    C1557c.m7473e(C1440a.f5221v, "Push story page click input was invalid. Not logging in-app purchase to Appboy.");
                } else {
                    C1440a.this.f5242q.mo15772a((C4432e1) C4576s1.m15896e(this.f5259c, this.f5257U));
                }
            } catch (Exception e) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to log push story page clicked for page id: ");
                sb.append(this.f5257U);
                sb.append(" cid: ");
                sb.append(this.f5259c);
                C1557c.m7474e(k, sb.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$d */
    class C1447d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f5261c;

        C1447d(boolean z) {
            this.f5261c = z;
        }

        public void run() {
            try {
                if (this.f5261c) {
                    C1440a.this.f5227b.mo15485a(C1440a.this.f5243r.mo15835a(), C1516a.class);
                } else {
                    C1440a.this.f5242q.mo15761a(C1440a.this.f5243r.mo15844b(), C1440a.this.f5243r.mo15847c());
                }
            } catch (Exception e) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to request Content Cards refresh. Requesting from cache: ");
                sb.append(this.f5261c);
                C1557c.m7474e(k, sb.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$d0 */
    class C1448d0 implements Runnable {
        C1448d0() {
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15772a((C4432e1) C4548p1.m15793k());
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log that Content Cards was displayed.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$e */
    class C1449e implements Runnable {
        C1449e() {
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15778d();
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to request data flush.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$e0 */
    class C1450e0 implements Runnable {
        C1450e0() {
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15772a((C4432e1) C4548p1.m15794l());
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log that the feed was displayed.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$f */
    class C1451f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String f5266c;

        C1451f(String str) {
            this.f5266c = str;
        }

        public void run() {
            try {
                if (C1563i.m7491e(this.f5266c)) {
                    C1557c.m7465b(C1440a.f5221v, "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
                    return;
                }
                String a = C1440a.this.f5236k.mo6636a();
                if (a.equals(this.f5266c)) {
                    String k = C1440a.f5221v;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received request to change current user ");
                    sb.append(this.f5266c);
                    sb.append(" to the same user id. Doing nothing.");
                    C1557c.m7469c(k, sb.toString());
                } else {
                    if (a.equals("")) {
                        String k2 = C1440a.f5221v;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Changing anonymous user to ");
                        sb2.append(this.f5266c);
                        C1557c.m7469c(k2, sb2.toString());
                        C1440a.this.f5229d.mo15627a(this.f5266c);
                        C1440a.this.f5236k.mo6637a(this.f5266c);
                    } else {
                        String k3 = C1440a.f5221v;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Changing current user ");
                        sb3.append(a);
                        sb3.append(" to new user ");
                        sb3.append(this.f5266c);
                        sb3.append(".");
                        C1557c.m7469c(k3, sb3.toString());
                        C1517b bVar = new C1517b(new ArrayList(), this.f5266c, false, C4472i3.m15480a());
                        C1440a.this.f5227b.mo15485a(bVar, C1517b.class);
                    }
                    C1440a.this.f5242q.mo15777c();
                    C1440a.this.f5229d.mo15627a(this.f5266c);
                    C4623x3 x3Var = C1440a.this.f5245t;
                    C4623x3 x3Var2 = new C4623x3(C1440a.this.f5226a, C1440a.this.f5229d, C1440a.this.f5230e, C1440a.this.f5227b, C1440a.this.f5232g, C1440a.this.f5231f, C1440a.f5217D, C1440a.f5218E, C1440a.this.f5228c);
                    C1440a.this.m6916a(x3Var2);
                    C1440a.this.f5245t.mo15902g().mo15604d();
                    C1440a.this.f5242q.mo15759a();
                    C4546p0 i = C1440a.this.f5242q;
                    C4519b bVar2 = new C4519b();
                    bVar2.mo15712a();
                    i.mo15765a(bVar2);
                    C1440a.this.mo6577b(false);
                    x3Var.mo15910o();
                }
            } catch (Exception e) {
                String k4 = C1440a.f5221v;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to set external id to: ");
                sb4.append(this.f5266c);
                C1557c.m7474e(k4, sb4.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$f0 */
    class C1452f0 implements Runnable {
        C1452f0() {
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15772a((C4432e1) C4548p1.m15795m());
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log that feedback was displayed.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$g */
    class C1453g implements Callable<C1477e> {
        C1453g() {
        }

        /* renamed from: a */
        public C1477e call() {
            return C1440a.this.f5236k;
        }
    }

    /* renamed from: com.appboy.a$h */
    class C1454h implements Runnable {
        C1454h(C1440a aVar) {
        }

        public void run() {
            C1557c.m7462a();
        }
    }

    /* renamed from: com.appboy.a$i */
    class C1455i implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4445f1 f5270c;

        C1455i(C4445f1 f1Var) {
            this.f5270c = f1Var;
        }

        public void run() {
            try {
                if (C1440a.this.f5240o != null) {
                    C1440a.this.f5240o.mo15677a(this.f5270c);
                } else {
                    C1557c.m7458a(C1440a.f5221v, "Geofence manager was null. Not requesting geofence refresh.");
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to request geofence refresh.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$j */
    class C1456j implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f5272c;

        C1456j(boolean z) {
            this.f5272c = z;
        }

        public void run() {
            try {
                if (C1440a.this.f5240o != null) {
                    C1440a.this.f5240o.mo15687b(this.f5272c);
                } else {
                    C1557c.m7458a(C1440a.f5221v, "Geofence manager was null. Not requesting geofence refresh.");
                }
            } catch (Exception e) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to request geofence refresh with rate limit ignore: ");
                sb.append(this.f5272c);
                C1557c.m7474e(k, sb.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$k */
    class C1457k implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C4593t6 f5273U;

        /* renamed from: c */
        final /* synthetic */ String f5275c;

        C1457k(String str, C4593t6 t6Var) {
            this.f5275c = str;
            this.f5273U = t6Var;
        }

        public void run() {
            try {
                if (C1440a.this.f5240o != null) {
                    C1440a.this.f5240o.mo15686b(this.f5275c, this.f5273U);
                } else {
                    C1557c.m7458a(C1440a.f5221v, "Geofence manager was null. Not posting geofence report");
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to post geofence report.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$l */
    class C1458l implements Runnable {
        C1458l() {
        }

        public void run() {
            C1557c.m7471d(C1440a.f5221v, "Starting up a new user dependency manager");
            C4623x3 x3Var = new C4623x3(C1440a.this.f5226a, C1440a.this.f5229d, C1440a.this.f5230e, C1440a.this.f5227b, C1440a.this.f5232g, C1440a.this.f5231f, C1440a.f5217D, C1440a.f5218E, C1440a.this.f5228c);
            C1440a.this.m6916a(x3Var);
        }
    }

    /* renamed from: com.appboy.a$m */
    class C1459m implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f5277U;

        /* renamed from: c */
        final /* synthetic */ String f5279c;

        C1459m(String str, String str2) {
            this.f5279c = str;
            this.f5277U = str2;
        }

        public void run() {
            try {
                C1440a.this.f5243r.mo15836a(new C4604v1(this.f5279c), this.f5277U);
            } catch (Exception e) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to update ContentCard storage provider with single card update. User id: ");
                sb.append(this.f5277U);
                sb.append(" Serialized json: ");
                sb.append(this.f5279c);
                C1557c.m7470c(k, sb.toString(), e);
            }
        }
    }

    /* renamed from: com.appboy.a$n */
    class C1460n implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C4445f1 f5281c;

        C1460n(C4445f1 f1Var) {
            this.f5281c = f1Var;
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15772a((C4432e1) C4548p1.m15761a(this.f5281c));
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log location recorded event.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$o */
    class C1461o implements Runnable {
        C1461o() {
        }

        public void run() {
            try {
                if (C1440a.this.f5240o != null) {
                    C1440a.this.f5240o.mo15675a();
                } else {
                    C1557c.m7458a(C1440a.f5221v, "Geofence manager was null. Not initializing geofences.");
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to initialize geofences with the geofence manager.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$p */
    class C1462p implements Runnable {
        C1462p() {
        }

        public void run() {
            try {
                if (C1440a.this.f5244s != null) {
                    C1440a.this.f5244s.mo15739a();
                } else {
                    C1557c.m7458a(C1440a.f5221v, "Location manager was null. Not requesting single location update.");
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to request single location update", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$q */
    class C1463q implements Runnable {

        /* renamed from: c */
        final /* synthetic */ boolean f5285c;

        C1463q(boolean z) {
            this.f5285c = z;
        }

        public void run() {
            C1440a.this.f5242q.mo15771a(this.f5285c);
            C1440a.this.f5245t.mo15897b().mo15727a(this.f5285c);
            if (C1440a.this.f5235j != null) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Setting the image loader deny network downloads to ");
                sb.append(this.f5285c);
                C1557c.m7458a(k, sb.toString());
                C1440a.this.f5235j.mo6661a(this.f5285c);
            }
        }
    }

    /* renamed from: com.appboy.a$r */
    class C1464r implements Runnable {

        /* renamed from: c */
        final /* synthetic */ String f5287c;

        C1464r(String str) {
            this.f5287c = str;
        }

        public void run() {
            try {
                if (C1563i.m7490d(this.f5287c)) {
                    C1557c.m7473e(C1440a.f5221v, "Campaign ID cannot be null or blank. Not logging push notification opened.");
                } else {
                    C1440a.this.f5242q.mo15772a((C4432e1) C4567r1.m15862j(this.f5287c));
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to log opened push.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$s */
    class C1465s implements C1480h {

        /* renamed from: a */
        final /* synthetic */ String f5288a;

        C1465s(C1440a aVar, String str) {
            this.f5288a = str;
        }

        /* renamed from: a */
        public Uri mo6614a(Uri uri) {
            return uri.buildUpon().encodedAuthority(this.f5288a).build();
        }
    }

    /* renamed from: com.appboy.a$t */
    class C1466t implements Runnable {
        C1466t() {
        }

        public void run() {
            try {
                C1440a.this.m6947r();
            } catch (Exception e) {
                C1557c.m7470c(C1440a.f5221v, "Failed to verify proper SDK setup", e);
            }
        }
    }

    /* renamed from: com.appboy.a$u */
    class C1467u implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f5291c;

        C1467u(Activity activity) {
            this.f5291c = activity;
        }

        public void run() {
            try {
                if (this.f5291c == null) {
                    C1557c.m7473e(C1440a.f5221v, "Cannot open session with null activity.");
                } else {
                    C1440a.this.f5242q.mo15760a(this.f5291c);
                }
            } catch (Exception e) {
                C1557c.m7470c(C1440a.f5221v, "Failed to open session.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$v */
    class C1468v implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Activity f5293c;

        C1468v(Activity activity) {
            this.f5293c = activity;
        }

        public void run() {
            try {
                if (this.f5293c == null) {
                    C1557c.m7473e(C1440a.f5221v, "Cannot close session with null activity.");
                    return;
                }
                C4462h1 b = C1440a.this.f5242q.mo15773b(this.f5293c);
                if (b != null) {
                    String k = C1440a.f5221v;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Closed session with ID: ");
                    sb.append(b.mo15570a());
                    C1557c.m7469c(k, sb.toString());
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Failed to close session.", e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$w */
    class C1469w implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f5294U;

        /* renamed from: V */
        final /* synthetic */ boolean f5295V;

        /* renamed from: c */
        final /* synthetic */ String f5297c;

        C1469w(String str, String str2, boolean z) {
            this.f5297c = str;
            this.f5294U = str2;
            this.f5295V = z;
        }

        public void run() {
            try {
                C1440a.this.f5242q.mo15768a(this.f5297c, this.f5294U, this.f5295V);
            } catch (Exception e) {
                String k = C1440a.f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to submit feedback: ");
                sb.append(this.f5294U);
                C1557c.m7474e(k, sb.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$x */
    class C1470x implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C1551a f5298U;

        /* renamed from: c */
        final /* synthetic */ String f5300c;

        C1470x(String str, C1551a aVar) {
            this.f5300c = str;
            this.f5298U = aVar;
        }

        public void run() {
            String str = this.f5300c;
            try {
                if (!C1564j.m7494a(str, C1440a.this.f5241p)) {
                    String k = C1440a.f5221v;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Log custom event input ");
                    sb.append(str);
                    sb.append(" was invalid. Not logging custom event to Appboy.");
                    C1557c.m7473e(k, sb.toString());
                    return;
                }
                String a = C1564j.m7492a(str);
                C4548p1 a2 = C4548p1.m15764a(a, this.f5298U);
                if (C1440a.this.f5242q.mo15772a((C4432e1) a2)) {
                    C1440a.this.f5239n.mo15653a((C4641z4) new C4632y4(a, this.f5298U, a2));
                }
            } catch (Exception e) {
                String k2 = C1440a.f5221v;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to log custom event: ");
                sb2.append(str);
                C1557c.m7474e(k2, sb2.toString(), e);
                C1440a.this.m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: com.appboy.a$y */
    class C1471y implements Runnable {

        /* renamed from: U */
        final /* synthetic */ String f5301U;

        /* renamed from: V */
        final /* synthetic */ BigDecimal f5302V;

        /* renamed from: W */
        final /* synthetic */ int f5303W;

        /* renamed from: X */
        final /* synthetic */ C1551a f5304X;

        /* renamed from: c */
        final /* synthetic */ String f5306c;

        C1471y(String str, String str2, BigDecimal bigDecimal, int i, C1551a aVar) {
            this.f5306c = str;
            this.f5301U = str2;
            this.f5302V = bigDecimal;
            this.f5303W = i;
            this.f5304X = aVar;
        }

        public void run() {
            String str = this.f5306c;
            String str2 = this.f5301U;
            if (str2 == null) {
                try {
                    String k = C1440a.f5221v;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The currencyCode is null. Expected one of ");
                    sb.append(C1440a.f5222w);
                    sb.append(". Not logging in-app purchase to Appboy.");
                    C1557c.m7473e(k, sb.toString());
                } catch (Exception e) {
                    String k2 = C1440a.f5221v;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to log purchase event of ");
                    sb2.append(str);
                    C1557c.m7474e(k2, sb2.toString(), e);
                    C1440a.this.m6917a((Throwable) e);
                }
            } else {
                String upperCase = str2.trim().toUpperCase(Locale.US);
                if (!C1564j.m7496a(str, upperCase, this.f5302V, this.f5303W, C1440a.this.f5241p, C1440a.f5222w)) {
                    C1557c.m7473e(C1440a.f5221v, "Log purchase input was invalid. Not logging in-app purchase to Appboy.");
                    return;
                }
                String a = C1564j.m7492a(str);
                C4548p1 a2 = C4548p1.m15771a(a, upperCase, this.f5302V, this.f5303W, this.f5304X);
                if (C1440a.this.f5242q.mo15772a((C4432e1) a2)) {
                    C1440a.this.f5239n.mo15653a((C4641z4) new C4428d5(a, this.f5304X, a2));
                }
            }
        }
    }

    /* renamed from: com.appboy.a$z */
    class C1472z implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Intent f5308c;

        C1472z(Intent intent) {
            this.f5308c = intent;
        }

        public void run() {
            String str = "ab_push_fetch_test_triggers_key";
            try {
                String stringExtra = this.f5308c.getStringExtra("cid");
                if (!C1563i.m7490d(stringExtra)) {
                    String k = C1440a.f5221v;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Logging push click to Appboy. Campaign Id: ");
                    sb.append(stringExtra);
                    C1557c.m7469c(k, sb.toString());
                    C1440a.this.mo6580c(stringExtra);
                } else {
                    C1557c.m7469c(C1440a.f5221v, "No campaign Id associated with this notification. Not logging push click to Appboy.");
                }
                if (this.f5308c.hasExtra(str) && this.f5308c.getStringExtra(str).equals("true")) {
                    C1557c.m7469c(C1440a.f5221v, "Push contained key for fetching test triggers, fetching triggers.");
                    C4546p0 i = C1440a.this.f5242q;
                    C4519b bVar = new C4519b();
                    bVar.mo15715b();
                    i.mo15765a(bVar);
                }
            } catch (Exception e) {
                C1557c.m7474e(C1440a.f5221v, "Error logging push notification", e);
            }
        }
    }

    C1440a(Context context) {
        long nanoTime = System.nanoTime();
        C1557c.m7458a(f5221v, "Braze SDK Initializing");
        C4627y yVar = new C4627y("Appboy-External-Event-Manager-Thread");
        C4380a0 a0Var = new C4380a0();
        yVar.mo15914a(a0Var);
        C4412c0 c0Var = new C4412c0("singleton_event_manager_parallel_executor_identifier", yVar);
        c0Var.execute(new C1454h(this));
        this.f5226a = context.getApplicationContext();
        this.f5228c = new C4381a1();
        C1557c.m7463a(this.f5228c);
        String str = Build.MODEL;
        if (str != null && f5223x.contains(str.toLowerCase(Locale.US))) {
            String str2 = f5221v;
            StringBuilder sb = new StringBuilder();
            sb.append("Device build model matches a known crawler. Enabling mock network request mode. Device model: ");
            sb.append(str);
            C1557c.m7469c(str2, sb.toString());
            m6940n();
        }
        this.f5235j = new C1527a(this.f5226a);
        this.f5230e = new C1489b(this.f5226a);
        if (!C1563i.m7490d(this.f5230e.mo6711d())) {
            m6927e(this.f5230e.mo6711d());
        }
        this.f5229d = new C4475i6(this.f5226a);
        this.f5232g = new C4486k0(this.f5226a);
        this.f5227b = new C4410c(c0Var, f5220G);
        this.f5231f = new C4637z0(this.f5226a, this.f5230e);
        c0Var.execute(new C1445c(context));
        C4627y yVar2 = new C4627y("Appboy-User-Dependency-Thread");
        this.f5234i = new C4380a0(this.f5227b);
        yVar2.mo15914a(this.f5234i);
        a0Var.mo15394a(this.f5227b);
        this.f5233h = new C4420d0("singleton_user_dependency_serial_executor_identifier", yVar2);
        this.f5233h.execute(new C1458l());
        c0Var.execute(new C1466t());
        long nanoTime2 = System.nanoTime();
        String str3 = f5221v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Appboy loaded in ");
        sb2.append(TimeUnit.MILLISECONDS.convert(nanoTime2 - nanoTime, TimeUnit.NANOSECONDS));
        sb2.append(" ms.");
        C1557c.m7458a(str3, sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m6947r() {
        boolean z = true;
        for (String str : f5224y) {
            if (!C1562h.m7482a(this.f5226a, str)) {
                String str2 = f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("The Braze SDK requires the permission ");
                sb.append(str);
                sb.append(". Check your AndroidManifest.");
                C1557c.m7465b(str2, sb.toString());
                z = false;
            }
        }
        if (this.f5230e.mo6707a().toString().equals("")) {
            C1557c.m7465b(f5221v, "The Braze SDK requires a non-empty API key. Check your appboy.xml or AppboyConfig.");
            z = false;
        }
        if (!z) {
            C1557c.m7465b(f5221v, "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/documentation/Android");
        }
    }

    /* renamed from: s */
    private static void m6948s() {
        try {
            C1557c.m7469c(f5221v, "Shutting down all queued work on the Braze SDK");
            synchronized (C1440a.class) {
                if (f5225z != null) {
                    if (f5225z.f5233h != null) {
                        C1557c.m7458a(f5221v, "Shutting down the user dependency executor");
                        f5225z.f5233h.shutdownNow();
                    }
                    C4623x3 x3Var = f5225z.f5245t;
                    if (x3Var != null) {
                        if (x3Var.mo15897b() != null) {
                            x3Var.mo15897b().mo15727a(true);
                        }
                        if (x3Var.mo15906k() != null) {
                            x3Var.mo15906k().mo15663a();
                        }
                        if (x3Var.mo15908m() != null) {
                            x3Var.mo15908m().mo15684b();
                        }
                    }
                    f5225z.f5246u = true;
                }
            }
        } catch (Exception e) {
            C1557c.m7474e(f5221v, "Failed to shutdown queued work on the Braze SDK.", e);
        }
    }

    /* renamed from: t */
    private static boolean m6949t() {
        if (f5220G == null) {
            C1557c.m7458a(f5221v, "SDK enablement provider was null. Returning SDK as enabled.");
            return false;
        }
        boolean a = f5220G.mo15491a();
        if (a) {
            C1557c.m7473e(f5221v, "SDK is disabled. Not performing action on SDK.");
        }
        return a;
    }

    /* renamed from: c */
    public static C1440a m6921c(Context context) {
        if (f5225z == null || f5225z.f5246u) {
            synchronized (C1440a.class) {
                if (f5225z != null) {
                    if (f5225z.f5246u) {
                    }
                }
                m6925d(m6912a(context).mo15491a());
                f5225z = new C1440a(context);
                C1440a aVar = f5225z;
                return aVar;
            }
        }
        return f5225z;
    }

    /* renamed from: n */
    public static boolean m6940n() {
        if (f5225z == null) {
            synchronized (C1440a.class) {
                if (f5225z == null) {
                    if (f5217D) {
                        C1557c.m7469c(f5221v, "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.");
                        return true;
                    }
                    C1557c.m7469c(f5221v, "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.");
                    f5217D = true;
                    return true;
                }
            }
        }
        C1557c.m7465b(f5221v, "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.");
        return false;
    }

    /* renamed from: p */
    public static C1483k m6943p() {
        return f5216C;
    }

    /* renamed from: q */
    public static boolean m6946q() {
        return f5218E;
    }

    /* renamed from: b */
    public void mo6572b(Activity activity) {
        if (!m6949t()) {
            this.f5233h.execute(new C1467u(activity));
        }
    }

    /* renamed from: d */
    public C1477e mo6581d() {
        try {
            return (C1477e) this.f5233h.submit(new C1453g()).get();
        } catch (Exception e) {
            C1557c.m7474e(f5221v, "Failed to retrieve the current user.", e);
            m6917a((Throwable) e);
            return null;
        }
    }

    /* renamed from: e */
    public void mo6583e() {
        if (!m6949t()) {
            this.f5233h.execute(new C1448d0());
        }
    }

    /* renamed from: f */
    public void mo6584f() {
        if (!m6949t()) {
            this.f5233h.execute(new C1450e0());
        }
    }

    /* renamed from: g */
    public void mo6585g() {
        if (!m6949t()) {
            this.f5233h.execute(new C1452f0());
        }
    }

    /* renamed from: h */
    public void mo6586h() {
        if (!m6949t()) {
            this.f5233h.execute(new C1443b());
        }
    }

    /* renamed from: i */
    public void mo6587i() {
        if (!m6949t()) {
            this.f5233h.execute(new C1441a());
        }
    }

    /* renamed from: j */
    public void mo6588j() {
        if (!m6949t()) {
            this.f5233h.execute(new C1449e());
        }
    }

    /* renamed from: e */
    private void m6927e(String str) {
        synchronized (f5214A) {
            m6915a((C1480h) new C1465s(this, str));
        }
    }

    /* renamed from: a */
    public void mo6558a(Activity activity) {
        if (!m6949t()) {
            this.f5233h.execute(new C1468v(activity));
        }
    }

    /* renamed from: b */
    public void mo6575b(String str) {
        if (!m6949t()) {
            this.f5233h.execute(new C1442a0(str));
        }
    }

    /* renamed from: a */
    public void mo6569a(String str, String str2, boolean z) {
        if (!m6949t()) {
            this.f5233h.execute(new C1469w(str, str2, z));
        }
    }

    /* renamed from: b */
    public void mo6576b(String str, String str2) {
        if (!m6949t()) {
            this.f5233h.execute(new C1446c0(str, str2));
        }
    }

    /* renamed from: d */
    public void mo6582d(String str) {
        if (!m6949t()) {
            try {
                if (C1563i.m7490d(str)) {
                    C1557c.m7473e(f5221v, "Push registration ID must not be null or blank. Not registering for push messages from Appboy.");
                    return;
                }
                String str2 = f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Push token ");
                sb.append(str);
                sb.append(" registered and immediately being flushed.");
                C1557c.m7469c(str2, sb.toString());
                this.f5231f.mo15917a(str);
                mo6588j();
            } catch (Exception e) {
                C1557c.m7474e(f5221v, "Failed to set the registration ID.", e);
                m6917a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo6564a(String str, C1551a aVar) {
        if (!m6949t()) {
            this.f5233h.execute(new C1470x(str, aVar));
        }
    }

    /* renamed from: b */
    public void mo6577b(boolean z) {
        if (!m6949t()) {
            this.f5233h.execute(new C1447d(z));
        }
    }

    /* renamed from: a */
    public void mo6568a(String str, String str2, BigDecimal bigDecimal, int i, C1551a aVar) {
        if (!m6949t()) {
            C4420d0 d0Var = this.f5233h;
            C1471y yVar = new C1471y(str, str2, bigDecimal, i, aVar);
            d0Var.execute(yVar);
        }
    }

    /* renamed from: b */
    public void mo6573b(C1518c<C1517b> cVar) {
        try {
            this.f5227b.mo15486a(cVar, C1517b.class);
        } catch (Exception e) {
            C1557c.m7474e(f5221v, "Failed to add subscriber for feed updates.", e);
            m6917a((Throwable) e);
        }
    }

    /* renamed from: c */
    public void mo6580c(String str) {
        if (!m6949t()) {
            this.f5233h.execute(new C1464r(str));
        }
    }

    /* renamed from: a */
    public void mo6559a(Intent intent) {
        if (!m6949t()) {
            this.f5233h.execute(new C1472z(intent));
        }
    }

    /* renamed from: b */
    public static void m6920b(Context context) {
        m6912a(context).mo15490a(true);
        C1557c.m7473e(f5221v, "Stopping the SDK instance.");
        m6948s();
        C1557c.m7473e(f5221v, "Disabling all network requests");
        m6925d(true);
    }

    /* renamed from: c */
    public void mo6579c(C1518c<C1519d> cVar) {
        try {
            this.f5227b.mo15486a(cVar, C1519d.class);
        } catch (Exception e) {
            C1557c.m7474e(f5221v, "Failed to add subscriber to new in-app messages.", e);
            m6917a((Throwable) e);
        }
    }

    /* renamed from: d */
    public static void m6925d(boolean z) {
        String str = f5221v;
        StringBuilder sb = new StringBuilder();
        sb.append("Appboy outbound network requests are now ");
        sb.append(z ? "disabled" : "enabled");
        C1557c.m7469c(str, sb.toString());
        synchronized (C1440a.class) {
            f5218E = z;
            if (f5225z != null) {
                f5225z.m6923c(z);
            }
        }
    }

    /* renamed from: a */
    public void mo6567a(String str, String str2, String str3) {
        if (!m6949t()) {
            this.f5233h.execute(new C1444b0(str, str2, str3));
        }
    }

    /* renamed from: a */
    public void mo6560a(C1518c<C1516a> cVar) {
        try {
            this.f5227b.mo15486a(cVar, C1516a.class);
        } catch (Exception e) {
            C1557c.m7474e(f5221v, "Failed to add subscriber for Content Cards updates.", e);
            m6917a((Throwable) e);
        }
    }

    /* renamed from: c */
    public C1481i mo6578c() {
        if (this.f5235j == null) {
            C1557c.m7458a(f5221v, "The Image Loader was null. Creating a new Image Loader and returning it.");
            this.f5235j = new C1527a(this.f5226a);
        }
        return this.f5235j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6574b(C4445f1 f1Var) {
        if (!m6949t()) {
            this.f5233h.execute(new C1460n(f1Var));
        }
    }

    /* renamed from: a */
    public <T> void mo6561a(C1518c<T> cVar, Class<T> cls) {
        try {
            this.f5227b.mo15488c(cVar, cls);
        } catch (Exception e) {
            String str = f5221v;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove ");
            sb.append(cls.getName());
            sb.append(" subscriber.");
            C1557c.m7474e(str, sb.toString(), e);
            m6917a((Throwable) e);
        }
    }

    /* renamed from: c */
    private void m6923c(boolean z) {
        this.f5233h.execute(new C1463q(z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6571b() {
        if (!m6949t()) {
            this.f5233h.execute(new C1462p());
        }
    }

    /* renamed from: a */
    public void mo6563a(String str) {
        if (!m6949t()) {
            this.f5233h.execute(new C1451f(str));
        }
    }

    /* renamed from: a */
    public static void m6915a(C1480h hVar) {
        synchronized (f5214A) {
            f5215B = hVar;
        }
    }

    /* renamed from: a */
    public static Uri m6910a(Uri uri) {
        synchronized (f5214A) {
            if (f5215B != null) {
                try {
                    Uri a = f5215B.mo6614a(uri);
                    if (a != null) {
                        return a;
                    }
                } catch (Exception unused) {
                    C1557c.m7465b(f5221v, "Caught exception trying to get a Braze API endpoint from the AppboyEndpointProvider. Using the original URI");
                }
            }
        }
        return uri;
    }

    /* renamed from: a */
    public static boolean m6918a(Context context, C1486a aVar) {
        if (f5225z != null) {
            C1557c.m7473e(f5221v, "Appboy.configure() must be called before the first call to Appboy.getInstance()");
        } else if (!f5219F) {
            synchronized (C1440a.class) {
                if (f5225z != null || f5219F) {
                    C1557c.m7469c(f5221v, "Appboy.configure() can only be called once during the lifetime of the singleton.");
                } else {
                    C4484j6 j6Var = new C4484j6(context.getApplicationContext());
                    if (aVar != null) {
                        f5219F = true;
                        j6Var.mo15644a(aVar);
                        return true;
                    }
                    C1557c.m7469c(f5221v, "Appboy.configure() called with a null config; Clearing all configuration values.");
                    j6Var.mo15642a();
                    return true;
                }
            }
        } else {
            C1557c.m7473e(f5221v, "Appboy.configure() can only be called once during the lifetime of the singleton.");
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6562a(C4445f1 f1Var) {
        if (!m6949t()) {
            this.f5233h.execute(new C1455i(f1Var));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6570a(boolean z) {
        if (!m6949t()) {
            this.f5233h.execute(new C1456j(z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6565a(String str, C4593t6 t6Var) {
        if (!m6949t()) {
            this.f5233h.execute(new C1457k(str, t6Var));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6566a(String str, String str2) {
        if (!m6949t()) {
            if (C1563i.m7490d(str)) {
                String str3 = f5221v;
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot add null or blank card json to storage. Returning. User id: ");
                sb.append(str2);
                sb.append(" Serialized json: ");
                sb.append(str);
                C1557c.m7473e(str3, sb.toString());
                return;
            }
            this.f5233h.execute(new C1459m(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6557a() {
        if (!m6949t()) {
            this.f5233h.execute(new C1461o());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6917a(Throwable th) {
        try {
            this.f5237l.mo15485a(th, Throwable.class);
        } catch (Exception e) {
            C1557c.m7470c(f5221v, "Failed to log throwable.", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6916a(C4623x3 x3Var) {
        this.f5245t = x3Var;
        this.f5242q = x3Var.mo15899d();
        this.f5233h.mo15949a((C4595u0) this.f5242q);
        this.f5241p = x3Var.mo15896a();
        this.f5239n = x3Var.mo15907l();
        this.f5240o = x3Var.mo15908m();
        this.f5243r = x3Var.mo15909n();
        this.f5244s = x3Var.mo15905j();
        C1477e eVar = new C1477e(x3Var.mo15902g(), this.f5242q, this.f5229d.mo15626a(), x3Var.mo15905j(), this.f5241p);
        this.f5236k = eVar;
        x3Var.mo15898c().mo15426a(x3Var.mo15901f());
        x3Var.mo15900e().mo15655a();
        this.f5237l = x3Var.mo15901f();
        this.f5234i.mo15394a(this.f5237l);
        ThreadPoolExecutor h = x3Var.mo15903h();
        this.f5238m = x3Var.mo15904i();
        this.f5239n = x3Var.mo15907l();
        x3Var.mo15906k().mo15666a(h, x3Var.mo15900e());
        this.f5228c.mo15396a((C4595u0) this.f5242q);
        this.f5228c.mo15399a(this.f5241p.mo15507k());
    }

    /* renamed from: a */
    private static C4415c3 m6912a(Context context) {
        if (f5220G == null) {
            f5220G = new C4415c3(context);
        }
        return f5220G;
    }
}
