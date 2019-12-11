package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p163g.p166b.p167a.p168a.C4789a;

/* renamed from: com.android.billingclient.api.c */
/* compiled from: BillingBroadcastManager */
class C1384c {

    /* renamed from: a */
    private final Context f5076a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1386b f5077b;

    /* renamed from: com.android.billingclient.api.c$b */
    /* compiled from: BillingBroadcastManager */
    private class C1386b extends BroadcastReceiver {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1431q f5078a;

        /* renamed from: b */
        private boolean f5079b;

        public void onReceive(Context context, Intent intent) {
            this.f5078a.mo6441b(C4789a.m16673a(intent, "BillingBroadcastManager"), C4789a.m16676a(intent.getExtras()));
        }

        private C1386b(C1431q qVar) {
            this.f5078a = qVar;
        }

        /* renamed from: a */
        public void mo6454a(Context context, IntentFilter intentFilter) {
            if (!this.f5079b) {
                context.registerReceiver(C1384c.this.f5077b, intentFilter);
                this.f5079b = true;
            }
        }

        /* renamed from: a */
        public void mo6453a(Context context) {
            if (this.f5079b) {
                context.unregisterReceiver(C1384c.this.f5077b);
                this.f5079b = false;
                return;
            }
            C4789a.m16681c("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    C1384c(Context context, C1431q qVar) {
        this.f5076a = context;
        this.f5077b = new C1386b(qVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1431q mo6451b() {
        return this.f5077b.f5078a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6452c() {
        this.f5077b.mo6454a(this.f5076a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6450a() {
        this.f5077b.mo6453a(this.f5076a);
    }
}
