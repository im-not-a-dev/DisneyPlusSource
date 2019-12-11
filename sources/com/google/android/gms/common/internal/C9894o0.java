package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.o0 */
final class C9894o0 implements ServiceConnection {

    /* renamed from: U */
    private int f23163U = 2;

    /* renamed from: V */
    private boolean f23164V;

    /* renamed from: W */
    private IBinder f23165W;

    /* renamed from: X */
    private final C9880a f23166X;

    /* renamed from: Y */
    private ComponentName f23167Y;

    /* renamed from: Z */
    private final /* synthetic */ C9891n0 f23168Z;

    /* renamed from: c */
    private final Set<ServiceConnection> f23169c = new HashSet();

    public C9894o0(C9891n0 n0Var, C9880a aVar) {
        this.f23168Z = n0Var;
        this.f23166X = aVar;
    }

    /* renamed from: a */
    public final void mo25417a(String str) {
        this.f23163U = 3;
        this.f23164V = this.f23168Z.f23160Y.mo25457a(this.f23168Z.f23158W, str, this.f23166X.mo25391a(this.f23168Z.f23158W), this, this.f23166X.mo25393c());
        if (this.f23164V) {
            this.f23168Z.f23159X.sendMessageDelayed(this.f23168Z.f23159X.obtainMessage(1, this.f23166X), this.f23168Z.f23162a0);
            return;
        }
        this.f23163U = 2;
        try {
            this.f23168Z.f23160Y.mo25455a(this.f23168Z.f23158W, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo25421b(String str) {
        this.f23168Z.f23159X.removeMessages(1, this.f23166X);
        this.f23168Z.f23160Y.mo25455a(this.f23168Z.f23158W, this);
        this.f23164V = false;
        this.f23163U = 2;
    }

    /* renamed from: c */
    public final int mo25422c() {
        return this.f23163U;
    }

    /* renamed from: d */
    public final boolean mo25423d() {
        return this.f23164V;
    }

    /* renamed from: e */
    public final boolean mo25424e() {
        return this.f23169c.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f23168Z.f23157V) {
            this.f23168Z.f23159X.removeMessages(1, this.f23166X);
            this.f23165W = iBinder;
            this.f23167Y = componentName;
            for (ServiceConnection onServiceConnected : this.f23169c) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f23163U = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f23168Z.f23157V) {
            this.f23168Z.f23159X.removeMessages(1, this.f23166X);
            this.f23165W = null;
            this.f23167Y = componentName;
            for (ServiceConnection onServiceDisconnected : this.f23169c) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f23163U = 2;
        }
    }

    /* renamed from: b */
    public final void mo25420b(ServiceConnection serviceConnection, String str) {
        this.f23168Z.f23160Y;
        this.f23168Z.f23158W;
        this.f23169c.remove(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName mo25419b() {
        return this.f23167Y;
    }

    /* renamed from: a */
    public final void mo25416a(ServiceConnection serviceConnection, String str) {
        this.f23168Z.f23160Y;
        this.f23168Z.f23158W;
        this.f23166X.mo25391a(this.f23168Z.f23158W);
        this.f23169c.add(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo25418a(ServiceConnection serviceConnection) {
        return this.f23169c.contains(serviceConnection);
    }

    /* renamed from: a */
    public final IBinder mo25415a() {
        return this.f23165W;
    }
}
