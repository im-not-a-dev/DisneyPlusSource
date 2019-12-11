package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C1426m.C1427a;

/* renamed from: com.android.billingclient.api.d */
/* compiled from: BillingClient */
public abstract class C1387d {

    /* renamed from: com.android.billingclient.api.d$b */
    /* compiled from: BillingClient */
    public static final class C1389b {

        /* renamed from: a */
        private final Context f5081a;

        /* renamed from: b */
        private int f5082b;

        /* renamed from: c */
        private int f5083c;

        /* renamed from: d */
        private boolean f5084d;

        /* renamed from: e */
        private C1431q f5085e;

        /* renamed from: a */
        public C1389b mo6464a(C1431q qVar) {
            this.f5085e = qVar;
            return this;
        }

        /* renamed from: b */
        public C1389b mo6466b() {
            this.f5084d = true;
            return this;
        }

        private C1389b(Context context) {
            this.f5082b = 0;
            this.f5083c = 0;
            this.f5081a = context;
        }

        /* renamed from: a */
        public C1387d mo6465a() {
            Context context = this.f5081a;
            if (context != null) {
                C1431q qVar = this.f5085e;
                if (qVar != null) {
                    boolean z = this.f5084d;
                    if (z) {
                        C1390e eVar = new C1390e(context, this.f5082b, this.f5083c, z, qVar);
                        return eVar;
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: a */
    public static C1389b m6778a(Context context) {
        return new C1389b(context);
    }

    /* renamed from: a */
    public abstract C1417h mo6456a(Activity activity, C1414g gVar);

    /* renamed from: a */
    public abstract C1427a mo6457a(String str);

    /* renamed from: a */
    public abstract void mo6458a();

    /* renamed from: a */
    public abstract void mo6459a(C1380a aVar, C1383b bVar);

    /* renamed from: a */
    public abstract void mo6460a(C1413f fVar);

    /* renamed from: a */
    public abstract void mo6461a(C1421j jVar, C1424k kVar);

    /* renamed from: a */
    public abstract void mo6462a(C1435t tVar, C1438u uVar);

    /* renamed from: b */
    public abstract boolean mo6463b();
}
