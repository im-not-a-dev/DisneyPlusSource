package com.appboy.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.p033s.C1557c;

public class AppboyNotificationRoutingActivity extends Activity {

    /* renamed from: c */
    private static final String f5559c = C1557c.m7461a(AppboyNotificationRoutingActivity.class);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            C1557c.m7458a(f5559c, "Notification routing activity received null intent. Doing nothing.");
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            C1557c.m7458a(f5559c, "Notification routing activity received intent with null action. Doing nothing.");
            finish();
            return;
        }
        String str = f5559c;
        StringBuilder sb = new StringBuilder();
        sb.append("Notification routing activity received intent: ");
        sb.append(intent.toString());
        C1557c.m7469c(str, sb.toString());
        Context applicationContext = getApplicationContext();
        Intent intent2 = new Intent(action).setClass(applicationContext, C1525d.m7210b());
        intent2.putExtras(intent.getExtras());
        applicationContext.sendBroadcast(intent2);
        finish();
    }
}
