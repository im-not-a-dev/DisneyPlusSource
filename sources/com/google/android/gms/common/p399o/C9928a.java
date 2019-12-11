package com.google.android.gms.common.p399o;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C9940d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.o.a */
public class C9928a {

    /* renamed from: a */
    private static final Object f23203a = new Object();

    /* renamed from: b */
    private static volatile C9928a f23204b;

    private C9928a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public static C9928a m30943a() {
        if (f23204b == null) {
            synchronized (f23203a) {
                if (f23204b == null) {
                    f23204b = new C9928a();
                }
            }
        }
        return f23204b;
    }

    /* renamed from: a */
    public final boolean mo25457a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C9940d.m30968a(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: a */
    public boolean mo25456a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo25457a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo25455a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
