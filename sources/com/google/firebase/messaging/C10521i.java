package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p401p.C9953b;
import com.google.firebase.iid.C10505w;
import java.util.concurrent.ExecutorService;
import p096e.p147m.p148a.C4235a;
import p163g.p449j.p450a.p451a.p457d.p463f.C11002a;
import p163g.p449j.p450a.p451a.p457d.p463f.C11003b;
import p163g.p449j.p450a.p451a.p457d.p463f.C11007f;
import p163g.p449j.p450a.p451a.p467f.C11428c;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;
import p163g.p449j.p450a.p451a.p467f.C11439k;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.i */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public abstract class C10521i extends Service {

    /* renamed from: U */
    private Binder f24923U;

    /* renamed from: V */
    private final Object f24924V;

    /* renamed from: W */
    private int f24925W;

    /* renamed from: X */
    private int f24926X;

    /* renamed from: c */
    private final ExecutorService f24927c;

    public C10521i() {
        C11003b a = C11002a.m34718a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.f24927c = a.mo28231a(new C9953b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), C11007f.f26031a);
        this.f24924V = new Object();
        this.f24926X = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C11435h<Void> mo27386d(Intent intent) {
        if (mo27379b(intent)) {
            return C11439k.m36959a(null);
        }
        C11436i iVar = new C11436i();
        this.f24927c.execute(new C10523k(this, intent, iVar));
        return iVar.mo29271a();
    }

    /* renamed from: f */
    private final void m33204f(Intent intent) {
        if (intent != null) {
            C4235a.m14565a(intent);
        }
        synchronized (this.f24924V) {
            this.f24926X--;
            if (this.f24926X == 0) {
                stopSelfResult(this.f24925W);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo27374a(Intent intent);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo27385a(Intent intent, C11435h hVar) {
        m33204f(intent);
    }

    /* renamed from: b */
    public abstract boolean mo27379b(Intent intent);

    /* renamed from: c */
    public abstract void mo27380c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f24923U == null) {
            this.f24923U = new C10505w(new C10520h(this));
        }
        return this.f24923U;
    }

    public void onDestroy() {
        this.f24927c.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f24924V) {
            this.f24925W = i2;
            this.f24926X++;
        }
        Intent a = mo27374a(intent);
        if (a == null) {
            m33204f(intent);
            return 2;
        }
        C11435h e = mo27386d(a);
        if (e.mo29267d()) {
            m33204f(intent);
            return 2;
        }
        e.mo29254a(C10522j.f24928c, (C11428c<TResult>) new C10524l<TResult>(this, intent));
        return 3;
    }
}
