package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;
import p163g.p166b.p167a.p168a.C4789a;

public class ProxyBillingActivity extends Activity {

    /* renamed from: c */
    private ResultReceiver f5071c;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = "ProxyBillingActivity";
        if (i == 100) {
            int b = C4789a.m16677b(intent, str);
            if (!(i2 == -1 && b == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity finished with resultCode ");
                sb.append(i2);
                sb.append(" and billing's responseCode: ");
                sb.append(b);
                C4789a.m16681c(str, sb.toString());
            }
            this.f5071c.send(b, intent == null ? null : intent.getExtras());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got onActivityResult with wrong requestCode: ");
            sb2.append(i);
            sb2.append("; skipping...");
            C4789a.m16681c(str, sb2.toString());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        String str = "result_receiver";
        String str2 = "ProxyBillingActivity";
        if (bundle == null) {
            C4789a.m16680b(str2, "Launching Play Store billing flow");
            this.f5071c = (ResultReceiver) getIntent().getParcelableExtra(str);
            String str3 = "BUY_INTENT";
            if (getIntent().hasExtra(str3)) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra(str3);
            } else {
                String str4 = "SUBS_MANAGEMENT_INTENT";
                pendingIntent = getIntent().hasExtra(str4) ? (PendingIntent) getIntent().getParcelableExtra(str4) : null;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (SendIntentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got exception while trying to start a purchase flow: ");
                sb.append(e);
                C4789a.m16681c(str2, sb.toString());
                this.f5071c.send(6, null);
                finish();
            }
        } else {
            C4789a.m16680b(str2, "Launching Play Store billing flow from savedInstanceState");
            this.f5071c = (ResultReceiver) bundle.getParcelable(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f5071c);
    }
}
