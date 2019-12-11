package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C9672u;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        String str = "RevocationService";
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
                String str2 = "Unknown action sent to RevocationBoundService: ";
                String valueOf = String.valueOf(intent.getAction());
                Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
        }
        if (Log.isLoggable(str, 2)) {
            String str3 = "RevocationBoundService handling ";
            String valueOf2 = String.valueOf(intent.getAction());
            Log.v(str, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
        }
        return new C9672u(this);
    }
}
