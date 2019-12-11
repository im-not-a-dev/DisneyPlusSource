package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C9726e;

@KeepName
public class GoogleApiActivity extends Activity implements OnCancelListener {

    /* renamed from: c */
    private int f22692c = 0;

    /* renamed from: a */
    public static PendingIntent m30052a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m30053a(context, pendingIntent, i, true), 134217728);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f22692c = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C9726e a = C9726e.m30189a((Context) this);
                if (i2 == -1) {
                    a.mo25141c();
                } else if (i2 == 0) {
                    a.mo25138a(new C9820b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f22692c = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f22692c = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22692c = bundle.getInt("resolution");
        }
        if (this.f22692c != 1) {
            Bundle extras = getIntent().getExtras();
            String str = "GoogleApiActivity";
            if (extras == null) {
                Log.e(str, "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e(str, "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f22692c = 1;
                } catch (SendIntentException e) {
                    Log.e(str, "Failed to launch pendingIntent", e);
                    finish();
                }
            } else {
                GoogleApiAvailability.m30032a().mo24986b(this, num.intValue(), 2, this);
                this.f22692c = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f22692c);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Intent m30053a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }
}
