package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.billingclient.api.C1417h.C1419b;
import com.android.billingclient.api.C1426m.C1427a;
import com.android.billingclient.api.C1433s.C1434a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import p163g.p166b.p167a.p168a.C4789a;
import p163g.p166b.p169b.p170a.C4790a;
import p163g.p166b.p169b.p170a.C4790a.C4791a;

/* renamed from: com.android.billingclient.api.e */
/* compiled from: BillingClientImpl */
class C1390e extends C1387d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f5086a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f5087b;

    /* renamed from: c */
    private final Handler f5088c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1384c f5089d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f5090e;

    /* renamed from: f */
    private final int f5091f;

    /* renamed from: g */
    private final int f5092g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4790a f5093h;

    /* renamed from: i */
    private C1409p f5094i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f5095j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5096k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5097l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5098m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f5099n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f5100o;

    /* renamed from: p */
    private final boolean f5101p;

    /* renamed from: q */
    private ExecutorService f5102q;

    /* renamed from: r */
    private final ResultReceiver f5103r;

    /* renamed from: com.android.billingclient.api.e$a */
    /* compiled from: BillingClientImpl */
    class C1391a implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ List f5104U;

        /* renamed from: V */
        final /* synthetic */ C1438u f5105V;

        /* renamed from: c */
        final /* synthetic */ String f5107c;

        /* renamed from: com.android.billingclient.api.e$a$a */
        /* compiled from: BillingClientImpl */
        class C1392a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C1434a f5109c;

            C1392a(C1434a aVar) {
                this.f5109c = aVar;
            }

            public void run() {
                C1438u uVar = C1391a.this.f5105V;
                C1419b c = C1417h.m6850c();
                c.mo6505a(this.f5109c.mo6544b());
                c.mo6506a(this.f5109c.mo6543a());
                uVar.mo6439a(c.mo6507a(), this.f5109c.mo6545c());
            }
        }

        C1391a(String str, List list, C1438u uVar) {
            this.f5107c = str;
            this.f5104U = list;
            this.f5105V = uVar;
        }

        public Void call() {
            C1390e.this.m6799a((Runnable) new C1392a(C1390e.this.mo6467a(this.f5107c, this.f5104U)));
            return null;
        }
    }

    /* renamed from: com.android.billingclient.api.e$b */
    /* compiled from: BillingClientImpl */
    class C1393b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1438u f5110c;

        C1393b(C1390e eVar, C1438u uVar) {
            this.f5110c = uVar;
        }

        public void run() {
            this.f5110c.mo6439a(C1420i.f5187n, null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$c */
    /* compiled from: BillingClientImpl */
    class C1394c implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C1424k f5111U;

        /* renamed from: c */
        final /* synthetic */ C1421j f5113c;

        C1394c(C1421j jVar, C1424k kVar) {
            this.f5113c = jVar;
            this.f5111U = kVar;
        }

        public Void call() {
            C1390e.this.m6803b(this.f5113c, this.f5111U);
            return null;
        }
    }

    /* renamed from: com.android.billingclient.api.e$d */
    /* compiled from: BillingClientImpl */
    class C1395d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1424k f5114c;

        C1395d(C1390e eVar, C1424k kVar) {
            this.f5114c = kVar;
        }

        public void run() {
            this.f5114c.mo6438a(C1420i.f5187n, null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$e */
    /* compiled from: BillingClientImpl */
    class C1396e implements Callable<Void> {

        /* renamed from: U */
        final /* synthetic */ C1383b f5115U;

        /* renamed from: c */
        final /* synthetic */ C1380a f5117c;

        /* renamed from: com.android.billingclient.api.e$e$a */
        /* compiled from: BillingClientImpl */
        class C1397a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Exception f5119c;

            C1397a(Exception exc) {
                this.f5119c = exc;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Error acknowledge purchase; ex: ");
                sb.append(this.f5119c);
                C4789a.m16681c("BillingClient", sb.toString());
                C1396e.this.f5115U.mo6437a(C1420i.f5186m);
            }
        }

        /* renamed from: com.android.billingclient.api.e$e$b */
        /* compiled from: BillingClientImpl */
        class C1398b implements Runnable {

            /* renamed from: U */
            final /* synthetic */ String f5120U;

            /* renamed from: c */
            final /* synthetic */ int f5122c;

            C1398b(int i, String str) {
                this.f5122c = i;
                this.f5120U = str;
            }

            public void run() {
                C1383b bVar = C1396e.this.f5115U;
                C1419b c = C1417h.m6850c();
                c.mo6505a(this.f5122c);
                c.mo6506a(this.f5120U);
                bVar.mo6437a(c.mo6507a());
            }
        }

        C1396e(C1380a aVar, C1383b bVar) {
            this.f5117c = aVar;
            this.f5115U = bVar;
        }

        public Void call() {
            try {
                Bundle a = C1390e.this.f5093h.mo16159a(9, C1390e.this.f5090e.getPackageName(), this.f5117c.mo6447b(), C4789a.m16669a(this.f5117c, C1390e.this.f5087b));
                String str = "BillingClient";
                C1390e.this.m6799a((Runnable) new C1398b(C4789a.m16678b(a, str), C4789a.m16675a(a, str)));
                return null;
            } catch (Exception e) {
                C1390e.this.m6799a((Runnable) new C1397a(e));
                return null;
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$f */
    /* compiled from: BillingClientImpl */
    class C1399f implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C1383b f5123c;

        C1399f(C1390e eVar, C1383b bVar) {
            this.f5123c = bVar;
        }

        public void run() {
            this.f5123c.mo6437a(C1420i.f5187n);
        }
    }

    /* renamed from: com.android.billingclient.api.e$g */
    /* compiled from: BillingClientImpl */
    class C1400g extends ResultReceiver {
        C1400g(Handler handler) {
            super(handler);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            C1431q b = C1390e.this.f5089d.mo6451b();
            String str = "BillingClient";
            if (b == null) {
                C4789a.m16681c(str, "PurchasesUpdatedListener is null - no way to return the response.");
                return;
            }
            List a = C4789a.m16676a(bundle);
            C1419b c = C1417h.m6850c();
            c.mo6505a(i);
            c.mo6506a(C4789a.m16675a(bundle, str));
            b.mo6441b(c.mo6507a(), a);
        }
    }

    /* renamed from: com.android.billingclient.api.e$h */
    /* compiled from: BillingClientImpl */
    class C1401h implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Runnable f5125U;

        /* renamed from: c */
        final /* synthetic */ Future f5126c;

        C1401h(C1390e eVar, Future future, Runnable runnable) {
            this.f5126c = future;
            this.f5125U = runnable;
        }

        public void run() {
            if (!this.f5126c.isDone() && !this.f5126c.isCancelled()) {
                this.f5126c.cancel(true);
                C4789a.m16681c("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = this.f5125U;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: com.android.billingclient.api.e$i */
    /* compiled from: BillingClientImpl */
    class C1402i implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C1417h f5127U;

        /* renamed from: V */
        final /* synthetic */ String f5128V;

        /* renamed from: c */
        final /* synthetic */ C1424k f5129c;

        C1402i(C1390e eVar, C1424k kVar, C1417h hVar, String str) {
            this.f5129c = kVar;
            this.f5127U = hVar;
            this.f5128V = str;
        }

        public void run() {
            C4789a.m16680b("BillingClient", "Successfully consumed purchase.");
            this.f5129c.mo6438a(this.f5127U, this.f5128V);
        }
    }

    /* renamed from: com.android.billingclient.api.e$j */
    /* compiled from: BillingClientImpl */
    class C1403j implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C1424k f5130U;

        /* renamed from: V */
        final /* synthetic */ C1417h f5131V;

        /* renamed from: W */
        final /* synthetic */ String f5132W;

        /* renamed from: c */
        final /* synthetic */ int f5133c;

        C1403j(C1390e eVar, int i, C1424k kVar, C1417h hVar, String str) {
            this.f5133c = i;
            this.f5130U = kVar;
            this.f5131V = hVar;
            this.f5132W = str;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error consuming purchase with token. Response code: ");
            sb.append(this.f5133c);
            C4789a.m16681c("BillingClient", sb.toString());
            this.f5130U.mo6438a(this.f5131V, this.f5132W);
        }
    }

    /* renamed from: com.android.billingclient.api.e$k */
    /* compiled from: BillingClientImpl */
    class C1404k implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C1424k f5134U;

        /* renamed from: V */
        final /* synthetic */ String f5135V;

        /* renamed from: c */
        final /* synthetic */ Exception f5136c;

        C1404k(C1390e eVar, Exception exc, C1424k kVar, String str) {
            this.f5136c = exc;
            this.f5134U = kVar;
            this.f5135V = str;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error consuming purchase; ex: ");
            sb.append(this.f5136c);
            C4789a.m16681c("BillingClient", sb.toString());
            this.f5134U.mo6438a(C1420i.f5186m, this.f5135V);
        }
    }

    /* renamed from: com.android.billingclient.api.e$l */
    /* compiled from: BillingClientImpl */
    class C1405l implements Callable<Bundle> {

        /* renamed from: U */
        final /* synthetic */ String f5137U;

        /* renamed from: V */
        final /* synthetic */ String f5138V;

        /* renamed from: W */
        final /* synthetic */ Bundle f5139W;

        /* renamed from: c */
        final /* synthetic */ int f5141c;

        C1405l(int i, String str, String str2, Bundle bundle) {
            this.f5141c = i;
            this.f5137U = str;
            this.f5138V = str2;
            this.f5139W = bundle;
        }

        public Bundle call() throws Exception {
            return C1390e.this.f5093h.mo16164a(this.f5141c, C1390e.this.f5090e.getPackageName(), this.f5137U, this.f5138V, (String) null, this.f5139W);
        }
    }

    /* renamed from: com.android.billingclient.api.e$m */
    /* compiled from: BillingClientImpl */
    class C1406m implements Callable<Bundle> {

        /* renamed from: U */
        final /* synthetic */ String f5142U;

        /* renamed from: c */
        final /* synthetic */ C1414g f5144c;

        C1406m(C1414g gVar, String str) {
            this.f5144c = gVar;
            this.f5142U = str;
        }

        public Bundle call() throws Exception {
            return C1390e.this.f5093h.mo16165a(5, C1390e.this.f5090e.getPackageName(), Arrays.asList(new String[]{this.f5144c.mo6494c()}), this.f5142U, "subs", (String) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$n */
    /* compiled from: BillingClientImpl */
    class C1407n implements Callable<Bundle> {

        /* renamed from: U */
        final /* synthetic */ String f5145U;

        /* renamed from: c */
        final /* synthetic */ String f5147c;

        C1407n(String str, String str2) {
            this.f5147c = str;
            this.f5145U = str2;
        }

        public Bundle call() throws Exception {
            return C1390e.this.f5093h.mo16163a(3, C1390e.this.f5090e.getPackageName(), this.f5147c, this.f5145U, (String) null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$o */
    /* compiled from: BillingClientImpl */
    class C1408o implements Callable<C1427a> {

        /* renamed from: c */
        final /* synthetic */ String f5149c;

        C1408o(String str) {
            this.f5149c = str;
        }

        public C1427a call() throws Exception {
            return C1390e.this.m6801b(this.f5149c);
        }
    }

    /* renamed from: com.android.billingclient.api.e$p */
    /* compiled from: BillingClientImpl */
    private final class C1409p implements ServiceConnection {
        /* access modifiers changed from: private */

        /* renamed from: U */
        public boolean f5150U;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public C1413f f5151V;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Object f5153c;

        /* renamed from: com.android.billingclient.api.e$p$a */
        /* compiled from: BillingClientImpl */
        class C1410a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C1417h f5155c;

            C1410a(C1417h hVar) {
                this.f5155c = hVar;
            }

            public void run() {
                synchronized (C1409p.this.f5153c) {
                    if (C1409p.this.f5151V != null) {
                        C1409p.this.f5151V.mo6440b(this.f5155c);
                    }
                }
            }
        }

        /* renamed from: com.android.billingclient.api.e$p$b */
        /* compiled from: BillingClientImpl */
        class C1411b implements Callable<Void> {
            C1411b() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                r3 = com.android.billingclient.api.C1390e.m6805c(r10.f5156c.f5152W).getPackageName();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
                r5 = 10;
                r6 = 3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
                if (r5 < 3) goto L_0x003c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                r6 = com.android.billingclient.api.C1390e.m6810e(r10.f5156c.f5152W).mo16158a(r5, r3, "subs");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
                if (r6 != 0) goto L_0x0039;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
                r5 = r5 - 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
                r7 = r10.f5156c.f5152W;
                r9 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
                if (r5 < 5) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
                r8 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
                r8 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
                com.android.billingclient.api.C1390e.m6800a(r7, r8);
                r7 = r10.f5156c.f5152W;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
                if (r5 < 3) goto L_0x0053;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
                r8 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
                r8 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
                com.android.billingclient.api.C1390e.m6804b(r7, r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
                if (r5 >= 3) goto L_0x0060;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
                p163g.p166b.p167a.p168a.C4789a.m16680b("BillingClient", "In-app billing API does not support subscription on this device.");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
                r5 = 10;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
                if (r5 < 3) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
                r6 = com.android.billingclient.api.C1390e.m6810e(r10.f5156c.f5152W).mo16158a(r5, r3, "inapp");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
                if (r6 != 0) goto L_0x0075;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
                r5 = r5 - 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
                r5 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
                r3 = r10.f5156c.f5152W;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
                if (r5 < 10) goto L_0x0081;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
                com.android.billingclient.api.C1390e.m6807c(r3, r4);
                r3 = r10.f5156c.f5152W;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
                if (r5 < 9) goto L_0x008f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x008d, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x008f, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0090, code lost:
                com.android.billingclient.api.C1390e.m6809d(r3, r4);
                r3 = r10.f5156c.f5152W;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
                if (r5 < 8) goto L_0x009d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
                r4 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
                com.android.billingclient.api.C1390e.m6811e(r3, r4);
                r3 = r10.f5156c.f5152W;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
                if (r5 < 6) goto L_0x00a9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
                r9 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
                com.android.billingclient.api.C1390e.m6812f(r3, r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
                if (r5 >= 3) goto L_0x00b6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00af, code lost:
                p163g.p166b.p167a.p168a.C4789a.m16681c("BillingClient", "In-app billing API version 3 is not supported on this device.");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b6, code lost:
                if (r6 != 0) goto L_0x00c1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b8, code lost:
                com.android.billingclient.api.C1390e.m6790a(r10.f5156c.f5152W, 2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c1, code lost:
                com.android.billingclient.api.C1390e.m6790a(r10.f5156c.f5152W, 0);
                com.android.billingclient.api.C1390e.m6794a(r10.f5156c.f5152W, (p163g.p166b.p169b.p170a.C4790a) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
                r6 = 3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
                p163g.p166b.p167a.p168a.C4789a.m16681c("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                com.android.billingclient.api.C1390e.m6790a(r10.f5156c.f5152W, 0);
                com.android.billingclient.api.C1390e.m6794a(r10.f5156c.f5152W, (p163g.p166b.p169b.p170a.C4790a) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e6, code lost:
                if (r6 != 0) goto L_0x00f0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e8, code lost:
                com.android.billingclient.api.C1390e.C1409p.m6823a(r10.f5156c, com.android.billingclient.api.C1420i.f5185l);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
                com.android.billingclient.api.C1390e.C1409p.m6823a(r10.f5156c, com.android.billingclient.api.C1420i.f5174a);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
                return null;
             */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00e8  */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x00f0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() {
                /*
                    r10 = this;
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this
                    java.lang.Object r0 = r0.f5153c
                    monitor-enter(r0)
                    com.android.billingclient.api.e$p r1 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ all -> 0x00f8 }
                    boolean r1 = r1.f5150U     // Catch:{ all -> 0x00f8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x0012
                    monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                    return r2
                L_0x0012:
                    monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                    r0 = 3
                    r1 = 0
                    com.android.billingclient.api.e$p r3 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d0 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d0 }
                    android.content.Context r3 = r3.f5090e     // Catch:{ Exception -> 0x00d0 }
                    java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x00d0 }
                    r4 = 10
                    r5 = 10
                    r6 = 3
                L_0x0026:
                    if (r5 < r0) goto L_0x003c
                    com.android.billingclient.api.e$p r7 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    g.b.b.a.a r7 = r7.f5093h     // Catch:{ Exception -> 0x00d1 }
                    java.lang.String r8 = "subs"
                    int r6 = r7.mo16158a(r5, r3, r8)     // Catch:{ Exception -> 0x00d1 }
                    if (r6 != 0) goto L_0x0039
                    goto L_0x003d
                L_0x0039:
                    int r5 = r5 + -1
                    goto L_0x0026
                L_0x003c:
                    r5 = 0
                L_0x003d:
                    com.android.billingclient.api.e$p r7 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r8 = 5
                    r9 = 1
                    if (r5 < r8) goto L_0x0047
                    r8 = 1
                    goto L_0x0048
                L_0x0047:
                    r8 = 0
                L_0x0048:
                    r7.f5096k = r8     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e$p r7 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    if (r5 < r0) goto L_0x0053
                    r8 = 1
                    goto L_0x0054
                L_0x0053:
                    r8 = 0
                L_0x0054:
                    r7.f5095j = r8     // Catch:{ Exception -> 0x00d1 }
                    if (r5 >= r0) goto L_0x0060
                    java.lang.String r5 = "BillingClient"
                    java.lang.String r7 = "In-app billing API does not support subscription on this device."
                    p163g.p166b.p167a.p168a.C4789a.m16680b(r5, r7)     // Catch:{ Exception -> 0x00d1 }
                L_0x0060:
                    r5 = 10
                L_0x0062:
                    if (r5 < r0) goto L_0x0078
                    com.android.billingclient.api.e$p r7 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r7 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    g.b.b.a.a r7 = r7.f5093h     // Catch:{ Exception -> 0x00d1 }
                    java.lang.String r8 = "inapp"
                    int r6 = r7.mo16158a(r5, r3, r8)     // Catch:{ Exception -> 0x00d1 }
                    if (r6 != 0) goto L_0x0075
                    goto L_0x0079
                L_0x0075:
                    int r5 = r5 + -1
                    goto L_0x0062
                L_0x0078:
                    r5 = 0
                L_0x0079:
                    com.android.billingclient.api.e$p r3 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    if (r5 < r4) goto L_0x0081
                    r4 = 1
                    goto L_0x0082
                L_0x0081:
                    r4 = 0
                L_0x0082:
                    r3.f5100o = r4     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e$p r3 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r4 = 9
                    if (r5 < r4) goto L_0x008f
                    r4 = 1
                    goto L_0x0090
                L_0x008f:
                    r4 = 0
                L_0x0090:
                    r3.f5099n = r4     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e$p r3 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r4 = 8
                    if (r5 < r4) goto L_0x009d
                    r4 = 1
                    goto L_0x009e
                L_0x009d:
                    r4 = 0
                L_0x009e:
                    r3.f5098m = r4     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e$p r3 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r3 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r4 = 6
                    if (r5 < r4) goto L_0x00a9
                    goto L_0x00aa
                L_0x00a9:
                    r9 = 0
                L_0x00aa:
                    r3.f5097l = r9     // Catch:{ Exception -> 0x00d1 }
                    if (r5 >= r0) goto L_0x00b6
                    java.lang.String r0 = "BillingClient"
                    java.lang.String r3 = "In-app billing API version 3 is not supported on this device."
                    p163g.p166b.p167a.p168a.C4789a.m16681c(r0, r3)     // Catch:{ Exception -> 0x00d1 }
                L_0x00b6:
                    if (r6 != 0) goto L_0x00c1
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r3 = 2
                    r0.f5086a = r3     // Catch:{ Exception -> 0x00d1 }
                    goto L_0x00e6
                L_0x00c1:
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r0.f5086a = r1     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this     // Catch:{ Exception -> 0x00d1 }
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1390e.this     // Catch:{ Exception -> 0x00d1 }
                    r0.f5093h = r2     // Catch:{ Exception -> 0x00d1 }
                    goto L_0x00e6
                L_0x00d0:
                    r6 = 3
                L_0x00d1:
                    java.lang.String r0 = "BillingClient"
                    java.lang.String r3 = "Exception while checking if billing is supported; try to reconnect"
                    p163g.p166b.p167a.p168a.C4789a.m16681c(r0, r3)
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1390e.this
                    r0.f5086a = r1
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this
                    com.android.billingclient.api.e r0 = com.android.billingclient.api.C1390e.this
                    r0.f5093h = r2
                L_0x00e6:
                    if (r6 != 0) goto L_0x00f0
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this
                    com.android.billingclient.api.h r1 = com.android.billingclient.api.C1420i.f5185l
                    r0.m6824a(r1)
                    goto L_0x00f7
                L_0x00f0:
                    com.android.billingclient.api.e$p r0 = com.android.billingclient.api.C1390e.C1409p.this
                    com.android.billingclient.api.h r1 = com.android.billingclient.api.C1420i.f5174a
                    r0.m6824a(r1)
                L_0x00f7:
                    return r2
                L_0x00f8:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1390e.C1409p.C1411b.call():java.lang.Void");
            }
        }

        /* renamed from: com.android.billingclient.api.e$p$c */
        /* compiled from: BillingClientImpl */
        class C1412c implements Runnable {
            C1412c() {
            }

            public void run() {
                C1390e.this.f5086a = 0;
                C1390e.this.f5093h = null;
                C1409p.this.m6824a(C1420i.f5187n);
            }
        }

        /* synthetic */ C1409p(C1390e eVar, C1413f fVar, C1400g gVar) {
            this(fVar);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4789a.m16680b("BillingClient", "Billing service connected.");
            C1390e.this.f5093h = C4791a.m16693a(iBinder);
            if (C1390e.this.m6796a((Callable<T>) new C1411b<T>(), 30000, (Runnable) new C1412c()) == null) {
                m6824a(C1390e.this.m6806c());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C4789a.m16681c("BillingClient", "Billing service disconnected.");
            C1390e.this.f5093h = null;
            C1390e.this.f5086a = 0;
            synchronized (this.f5153c) {
                if (this.f5151V != null) {
                    this.f5151V.mo6442g();
                }
            }
        }

        private C1409p(C1413f fVar) {
            this.f5153c = new Object();
            this.f5150U = false;
            this.f5151V = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6486a() {
            synchronized (this.f5153c) {
                this.f5151V = null;
                this.f5150U = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m6824a(C1417h hVar) {
            C1390e.this.m6799a((Runnable) new C1410a(hVar));
        }
    }

    C1390e(Context context, int i, int i2, boolean z, C1431q qVar) {
        this(context, i, i2, z, qVar, "2.0.3");
    }

    private C1390e(Context context, int i, int i2, boolean z, C1431q qVar, String str) {
        this.f5086a = 0;
        this.f5088c = new Handler(Looper.getMainLooper());
        this.f5103r = new C1400g(this.f5088c);
        this.f5090e = context.getApplicationContext();
        this.f5091f = i;
        this.f5092g = i2;
        this.f5101p = z;
        this.f5089d = new C1384c(this.f5090e, qVar);
        this.f5087b = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C1417h m6806c() {
        int i = this.f5086a;
        return (i == 0 || i == 3) ? C1420i.f5186m : C1420i.f5182i;
    }

    /* renamed from: b */
    public boolean mo6463b() {
        return (this.f5086a != 2 || this.f5093h == null || this.f5094i == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C1427a m6801b(String str) {
        Bundle bundle;
        StringBuilder sb = new StringBuilder();
        sb.append("Querying owned items, item type: ");
        sb.append(str);
        String str2 = "BillingClient";
        C4789a.m16680b(str2, sb.toString());
        ArrayList arrayList = new ArrayList();
        Bundle b = C4789a.m16679b(this.f5099n, this.f5101p, this.f5087b);
        String str3 = null;
        do {
            try {
                if (this.f5099n) {
                    bundle = this.f5093h.mo16162a(9, this.f5090e.getPackageName(), str, str3, b);
                } else {
                    bundle = this.f5093h.mo16161a(3, this.f5090e.getPackageName(), str, str3);
                }
                C1417h a = C1428n.m6876a(bundle, str2, "getPurchase()");
                if (a != C1420i.f5185l) {
                    return new C1427a(a, null);
                }
                ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                while (i < stringArrayList2.size()) {
                    String str4 = (String) stringArrayList2.get(i);
                    String str5 = (String) stringArrayList3.get(i);
                    String str6 = (String) stringArrayList.get(i);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Sku is owned: ");
                    sb2.append(str6);
                    C4789a.m16680b(str2, sb2.toString());
                    try {
                        C1426m mVar = new C1426m(str4, str5);
                        if (TextUtils.isEmpty(mVar.mo6518f())) {
                            C4789a.m16681c(str2, "BUG: empty/null token!");
                        }
                        arrayList.add(mVar);
                        i++;
                    } catch (JSONException e) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Got an exception trying to decode the purchase: ");
                        sb3.append(e);
                        C4789a.m16681c(str2, sb3.toString());
                        return new C1427a(C1420i.f5182i, null);
                    }
                }
                str3 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Continuation token: ");
                sb4.append(str3);
                C4789a.m16680b(str2, sb4.toString());
            } catch (Exception e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Got exception trying to get purchases: ");
                sb5.append(e2);
                sb5.append("; try to reconnect");
                C4789a.m16681c(str2, sb5.toString());
                return new C1427a(C1420i.f5186m, null);
            }
        } while (!TextUtils.isEmpty(str3));
        return new C1427a(C1420i.f5185l, arrayList);
    }

    /* renamed from: a */
    public void mo6460a(C1413f fVar) {
        String str = "BillingClient";
        if (mo6463b()) {
            C4789a.m16680b(str, "Service connection is valid. No need to re-initialize.");
            fVar.mo6440b(C1420i.f5185l);
            return;
        }
        int i = this.f5086a;
        if (i == 1) {
            C4789a.m16681c(str, "Client is already in the process of connecting to billing service.");
            fVar.mo6440b(C1420i.f5177d);
        } else if (i == 3) {
            C4789a.m16681c(str, "Client was already closed and can't be reused. Please create another instance.");
            fVar.mo6440b(C1420i.f5186m);
        } else {
            this.f5086a = 1;
            this.f5089d.mo6452c();
            C4789a.m16680b(str, "Starting in-app billing setup.");
            this.f5094i = new C1409p(this, fVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            String str2 = "com.android.vending";
            intent.setPackage(str2);
            List queryIntentServices = this.f5090e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    String str3 = serviceInfo.packageName;
                    String str4 = resolveInfo.serviceInfo.name;
                    if (!str2.equals(str3) || str4 == null) {
                        C4789a.m16681c(str, "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str3, str4);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f5087b);
                        if (this.f5090e.bindService(intent2, this.f5094i, 1)) {
                            C4789a.m16680b(str, "Service was bonded successfully.");
                            return;
                        }
                        C4789a.m16681c(str, "Connection to Billing service is blocked.");
                    }
                }
            }
            this.f5086a = 0;
            C4789a.m16680b(str, "Billing service unavailable on device.");
            fVar.mo6440b(C1420i.f5176c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6803b(C1421j jVar, C1424k kVar) {
        String str;
        int i;
        String str2 = "BillingClient";
        String b = jVar.mo6509b();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Consuming purchase with token: ");
            sb.append(b);
            C4789a.m16680b(str2, sb.toString());
            if (this.f5099n) {
                Bundle c = this.f5093h.mo16168c(9, this.f5090e.getPackageName(), b, C4789a.m16671a(jVar, this.f5099n, this.f5087b));
                int i2 = c.getInt("RESPONSE_CODE");
                str = C4789a.m16675a(c, str2);
                i = i2;
            } else {
                i = this.f5093h.mo16166b(3, this.f5090e.getPackageName(), b);
                str = "";
            }
            C1419b c2 = C1417h.m6850c();
            c2.mo6505a(i);
            c2.mo6506a(str);
            C1417h a = c2.mo6507a();
            if (i == 0) {
                m6799a((Runnable) new C1402i(this, kVar, a, b));
                return;
            }
            C1403j jVar2 = new C1403j(this, i, kVar, a, b);
            m6799a((Runnable) jVar2);
        } catch (Exception e) {
            m6799a((Runnable) new C1404k(this, e, kVar, b));
        }
    }

    /* renamed from: a */
    public void mo6458a() {
        String str = "BillingClient";
        try {
            this.f5089d.mo6450a();
            if (this.f5094i != null) {
                this.f5094i.mo6486a();
            }
            if (!(this.f5094i == null || this.f5093h == null)) {
                C4789a.m16680b(str, "Unbinding from service.");
                this.f5090e.unbindService(this.f5094i);
                this.f5094i = null;
            }
            this.f5093h = null;
            if (this.f5102q != null) {
                this.f5102q.shutdownNow();
                this.f5102q = null;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("There was an exception while ending connection: ");
            sb.append(e);
            C4789a.m16681c(str, sb.toString());
        } catch (Throwable th) {
            this.f5086a = 3;
            throw th;
        }
        this.f5086a = 3;
    }

    /* renamed from: a */
    public C1417h mo6456a(Activity activity, C1414g gVar) {
        Future future;
        String str = "BUY_INTENT";
        String str2 = "; try to reconnect";
        if (!mo6463b()) {
            C1417h hVar = C1420i.f5186m;
            m6792a(hVar);
            return hVar;
        }
        String g = gVar.mo6498g();
        String e = gVar.mo6496e();
        C1433s f = gVar.mo6497f();
        boolean z = true;
        boolean z2 = f != null && f.mo6540l();
        String str3 = "BillingClient";
        if (e == null) {
            C4789a.m16681c(str3, "Please fix the input params. SKU can't be null.");
            C1417h hVar2 = C1420i.f5183j;
            m6792a(hVar2);
            return hVar2;
        } else if (g == null) {
            C4789a.m16681c(str3, "Please fix the input params. SkuType can't be null.");
            C1417h hVar3 = C1420i.f5184k;
            m6792a(hVar3);
            return hVar3;
        } else if (!g.equals("subs") || this.f5095j) {
            if (gVar.mo6494c() == null) {
                z = false;
            }
            if (!z || this.f5096k) {
                String str4 = "Current client doesn't support extra params for buy intent.";
                if (gVar.mo6500i() && !this.f5097l) {
                    C4789a.m16681c(str3, str4);
                    C1417h hVar4 = C1420i.f5180g;
                    m6792a(hVar4);
                    return hVar4;
                } else if (!z2 || this.f5097l) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Constructing buy intent for ");
                    sb.append(e);
                    sb.append(", item type: ");
                    sb.append(g);
                    C4789a.m16680b(str3, sb.toString());
                    if (this.f5097l) {
                        Bundle a = C4789a.m16670a(gVar, this.f5099n, this.f5101p, this.f5087b);
                        if (!f.mo6535h().isEmpty()) {
                            a.putString("skuDetailsToken", f.mo6535h());
                        }
                        if (z2) {
                            a.putString("rewardToken", f.mo6541m());
                            int i = this.f5091f;
                            if (i != 0) {
                                a.putInt("childDirected", i);
                            }
                            int i2 = this.f5092g;
                            if (i2 != 0) {
                                a.putInt("underAgeOfConsent", i2);
                            }
                        }
                        int i3 = this.f5099n ? 9 : gVar.mo6499h() ? 7 : 6;
                        C1405l lVar = new C1405l(i3, e, g, a);
                        future = m6796a((Callable<T>) lVar, 5000, (Runnable) null);
                    } else if (z) {
                        future = m6796a((Callable<T>) new C1406m<T>(gVar, e), 5000, (Runnable) null);
                    } else {
                        future = m6796a((Callable<T>) new C1407n<T>(e, g), 5000, (Runnable) null);
                    }
                    try {
                        Bundle bundle = (Bundle) future.get(5000, TimeUnit.MILLISECONDS);
                        int b = C4789a.m16678b(bundle, str3);
                        String a2 = C4789a.m16675a(bundle, str3);
                        if (b != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unable to buy item, Error response code: ");
                            sb2.append(b);
                            C4789a.m16681c(str3, sb2.toString());
                            C1419b c = C1417h.m6850c();
                            c.mo6505a(b);
                            c.mo6506a(a2);
                            C1417h a3 = c.mo6507a();
                            m6792a(a3);
                            return a3;
                        }
                        Intent intent = new Intent(activity, ProxyBillingActivity.class);
                        intent.putExtra("result_receiver", this.f5103r);
                        intent.putExtra(str, (PendingIntent) bundle.getParcelable(str));
                        activity.startActivity(intent);
                        return C1420i.f5185l;
                    } catch (CancellationException | TimeoutException unused) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Time out while launching billing flow: ; for sku: ");
                        sb3.append(e);
                        sb3.append(str2);
                        C4789a.m16681c(str3, sb3.toString());
                        C1417h hVar5 = C1420i.f5187n;
                        m6792a(hVar5);
                        return hVar5;
                    } catch (Exception unused2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Exception while launching billing flow: ; for sku: ");
                        sb4.append(e);
                        sb4.append(str2);
                        C4789a.m16681c(str3, sb4.toString());
                        C1417h hVar6 = C1420i.f5186m;
                        m6792a(hVar6);
                        return hVar6;
                    }
                } else {
                    C4789a.m16681c(str3, str4);
                    C1417h hVar7 = C1420i.f5180g;
                    m6792a(hVar7);
                    return hVar7;
                }
            } else {
                C4789a.m16681c(str3, "Current client doesn't support subscriptions update.");
                C1417h hVar8 = C1420i.f5189p;
                m6792a(hVar8);
                return hVar8;
            }
        } else {
            C4789a.m16681c(str3, "Current client doesn't support subscriptions.");
            C1417h hVar9 = C1420i.f5188o;
            m6792a(hVar9);
            return hVar9;
        }
    }

    /* renamed from: a */
    private C1417h m6792a(C1417h hVar) {
        this.f5089d.mo6451b().mo6441b(hVar, null);
        return hVar;
    }

    /* renamed from: a */
    public C1427a mo6457a(String str) {
        if (!mo6463b()) {
            return new C1427a(C1420i.f5186m, null);
        }
        if (TextUtils.isEmpty(str)) {
            C4789a.m16681c("BillingClient", "Please provide a valid SKU type.");
            return new C1427a(C1420i.f5179f, null);
        }
        try {
            return (C1427a) m6796a((Callable<T>) new C1408o<T>(str), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new C1427a(C1420i.f5187n, null);
        } catch (Exception unused2) {
            return new C1427a(C1420i.f5182i, null);
        }
    }

    /* renamed from: a */
    public void mo6462a(C1435t tVar, C1438u uVar) {
        if (!mo6463b()) {
            uVar.mo6439a(C1420i.f5186m, null);
            return;
        }
        String a = tVar.mo6546a();
        List b = tVar.mo6547b();
        String str = "BillingClient";
        if (TextUtils.isEmpty(a)) {
            C4789a.m16681c(str, "Please fix the input params. SKU type can't be empty.");
            uVar.mo6439a(C1420i.f5179f, null);
        } else if (b == null) {
            C4789a.m16681c(str, "Please fix the input params. The list of SKUs can't be empty.");
            uVar.mo6439a(C1420i.f5178e, null);
        } else {
            if (m6796a((Callable<T>) new C1391a<T>(a, b, uVar), 30000, (Runnable) new C1393b(this, uVar)) == null) {
                uVar.mo6439a(m6806c(), null);
            }
        }
    }

    /* renamed from: a */
    public void mo6461a(C1421j jVar, C1424k kVar) {
        if (!mo6463b()) {
            kVar.mo6438a(C1420i.f5186m, null);
            return;
        }
        if (m6796a((Callable<T>) new C1394c<T>(jVar, kVar), 30000, (Runnable) new C1395d(this, kVar)) == null) {
            kVar.mo6438a(m6806c(), null);
        }
    }

    /* renamed from: a */
    public void mo6459a(C1380a aVar, C1383b bVar) {
        if (!mo6463b()) {
            bVar.mo6437a(C1420i.f5186m);
        } else if (TextUtils.isEmpty(aVar.mo6447b())) {
            C4789a.m16681c("BillingClient", "Please provide a valid purchase token.");
            bVar.mo6437a(C1420i.f5181h);
        } else if (!this.f5099n) {
            bVar.mo6437a(C1420i.f5175b);
        } else {
            if (m6796a((Callable<T>) new C1396e<T>(aVar, bVar), 30000, (Runnable) new C1399f(this, bVar)) == null) {
                bVar.mo6437a(m6806c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> Future<T> m6796a(Callable<T> callable, long j, Runnable runnable) {
        long j2 = (long) (((double) j) * 0.95d);
        if (this.f5102q == null) {
            this.f5102q = Executors.newFixedThreadPool(C4789a.f11929a);
        }
        try {
            Future<T> submit = this.f5102q.submit(callable);
            this.f5088c.postDelayed(new C1401h(this, submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Async task throws exception ");
            sb.append(e);
            C4789a.m16681c("BillingClient", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1434a mo6467a(String str, List<String> list) {
        Bundle bundle;
        String str2 = "BillingClient";
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i, i2 > size ? size : i2));
            Bundle bundle2 = new Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle2.putString("playBillingLibraryVersion", this.f5087b);
            try {
                if (this.f5100o) {
                    bundle = this.f5093h.mo16160a(10, this.f5090e.getPackageName(), str, bundle2, C4789a.m16672a(this.f5099n, this.f5101p, this.f5087b));
                    String str3 = str;
                } else {
                    bundle = this.f5093h.mo16167b(3, this.f5090e.getPackageName(), str, bundle2);
                }
                if (bundle == null) {
                    C4789a.m16681c(str2, "querySkuDetailsAsync got null sku details list");
                    return new C1434a(4, "Null sku details list", null);
                }
                String str4 = "DETAILS_LIST";
                if (!bundle.containsKey(str4)) {
                    int b = C4789a.m16678b(bundle, str2);
                    String a = C4789a.m16675a(bundle, str2);
                    if (b != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("getSkuDetails() failed. Response code: ");
                        sb.append(b);
                        C4789a.m16681c(str2, sb.toString());
                        return new C1434a(b, a, arrayList);
                    }
                    C4789a.m16681c(str2, "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return new C1434a(6, a, arrayList);
                }
                ArrayList stringArrayList = bundle.getStringArrayList(str4);
                if (stringArrayList == null) {
                    String str5 = "querySkuDetailsAsync got null response list";
                    C4789a.m16681c(str2, str5);
                    return new C1434a(4, str5, null);
                }
                int i3 = 0;
                while (i3 < stringArrayList.size()) {
                    try {
                        C1433s sVar = new C1433s((String) stringArrayList.get(i3));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Got sku details: ");
                        sb2.append(sVar);
                        C4789a.m16680b(str2, sb2.toString());
                        arrayList.add(sVar);
                        i3++;
                    } catch (JSONException unused) {
                        C4789a.m16681c(str2, "Got a JSON exception trying to decode SkuDetails.");
                        return new C1434a(6, "Error trying to decode SkuDetails.", null);
                    }
                }
                i = i2;
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(e);
                C4789a.m16681c(str2, sb3.toString());
                return new C1434a(-1, "Service connection is disconnected.", null);
            }
        }
        return new C1434a(0, "", arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6799a(Runnable runnable) {
        if (!Thread.interrupted()) {
            this.f5088c.post(runnable);
        }
    }
}
