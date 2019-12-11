package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.p399o.C9928a;
import java.util.HashMap;
import p163g.p449j.p450a.p451a.p457d.p462e.C11001d;

/* renamed from: com.google.android.gms.common.internal.n0 */
final class C9891n0 extends C9879j implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final HashMap<C9880a, C9894o0> f23157V = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final Context f23158W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Handler f23159X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public final C9928a f23160Y;

    /* renamed from: Z */
    private final long f23161Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final long f23162a0;

    C9891n0(Context context) {
        this.f23158W = context.getApplicationContext();
        this.f23159X = new C11001d(context.getMainLooper(), this);
        this.f23160Y = C9928a.m30943a();
        this.f23161Z = 5000;
        this.f23162a0 = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25388a(C9880a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C9908u.m30854a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f23157V) {
            C9894o0 o0Var = (C9894o0) this.f23157V.get(aVar);
            if (o0Var == null) {
                o0Var = new C9894o0(this, aVar);
                o0Var.mo25416a(serviceConnection, str);
                o0Var.mo25417a(str);
                this.f23157V.put(aVar, o0Var);
            } else {
                this.f23159X.removeMessages(0, aVar);
                if (!o0Var.mo25418a(serviceConnection)) {
                    o0Var.mo25416a(serviceConnection, str);
                    int c = o0Var.mo25422c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(o0Var.mo25419b(), o0Var.mo25415a());
                    } else if (c == 2) {
                        o0Var.mo25417a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = o0Var.mo25423d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25389b(C9880a aVar, ServiceConnection serviceConnection, String str) {
        C9908u.m30854a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f23157V) {
            C9894o0 o0Var = (C9894o0) this.f23157V.get(aVar);
            if (o0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (o0Var.mo25418a(serviceConnection)) {
                o0Var.mo25420b(serviceConnection, str);
                if (o0Var.mo25424e()) {
                    this.f23159X.sendMessageDelayed(this.f23159X.obtainMessage(0, aVar), this.f23161Z);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f23157V) {
                C9880a aVar = (C9880a) message.obj;
                C9894o0 o0Var = (C9894o0) this.f23157V.get(aVar);
                if (o0Var != null && o0Var.mo25424e()) {
                    if (o0Var.mo25423d()) {
                        o0Var.mo25421b("GmsClientSupervisor");
                    }
                    this.f23157V.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f23157V) {
                C9880a aVar2 = (C9880a) message.obj;
                C9894o0 o0Var2 = (C9894o0) this.f23157V.get(aVar2);
                if (o0Var2 != null && o0Var2.mo25422c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = o0Var2.mo25419b();
                    if (b == null) {
                        b = aVar2.mo25390a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo25392b(), "unknown");
                    }
                    o0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
