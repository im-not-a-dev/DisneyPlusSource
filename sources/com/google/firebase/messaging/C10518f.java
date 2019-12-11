package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0478i.C0481b;
import androidx.core.app.C0478i.C0483d;
import androidx.core.app.C0478i.C0485f;
import com.google.android.gms.common.util.C9948l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p163g.p449j.p450a.p451a.p467f.C11439k;

/* renamed from: com.google.firebase.messaging.f */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
final class C10518f {

    /* renamed from: a */
    private final Executor f24916a;

    /* renamed from: b */
    private final Context f24917b;

    /* renamed from: c */
    private final C10517e f24918c;

    /* renamed from: d */
    private final Bundle f24919d;

    public C10518f(Context context, Bundle bundle, Executor executor) {
        this.f24916a = executor;
        this.f24917b = context;
        this.f24919d = bundle;
        this.f24918c = new C10517e(context, context.getPackageName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27384a() {
        boolean z;
        if ("1".equals(C10517e.m33185a(this.f24919d, "gcm.n.noui"))) {
            return true;
        }
        if (!((KeyguardManager) this.f24917b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!C9948l.m30994g()) {
                SystemClock.sleep(10);
            }
            int myPid = Process.myPid();
            List runningAppProcesses = ((ActivityManager) this.f24917b.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                    if (runningAppProcessInfo.pid == myPid) {
                        if (runningAppProcessInfo.importance == 100) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        C10525m e = C10525m.m33212e(C10517e.m33185a(this.f24919d, "gcm.n.image"));
        if (e != null) {
            e.mo27393a(this.f24916a);
        }
        C10519g a = this.f24918c.mo27383a(this.f24919d);
        C0483d dVar = a.f24920a;
        String str = "FirebaseMessaging";
        if (e != null) {
            try {
                Bitmap bitmap = (Bitmap) C11439k.m36962a(e.mo27392a(), 5, TimeUnit.SECONDS);
                dVar.mo2650a(bitmap);
                C0481b bVar = new C0481b();
                bVar.mo2639b(bitmap);
                bVar.mo2636a((Bitmap) null);
                dVar.mo2654a((C0485f) bVar);
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                Log.w(str, "Interrupted while downloading image, showing notification without it");
                e.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused3) {
                Log.w(str, "Failed to download image in time, showing notification without it");
                e.close();
            }
        }
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Showing notification");
        }
        ((NotificationManager) this.f24917b.getSystemService("notification")).notify(a.f24921b, 0, a.f24920a.mo2644a());
        return true;
    }
}
