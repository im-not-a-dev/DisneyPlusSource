package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.firebase.iid.h */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
abstract class C10475h<T> {

    /* renamed from: a */
    final int f24825a;

    /* renamed from: b */
    final C11436i<T> f24826b = new C11436i<>();

    /* renamed from: c */
    final int f24827c;

    /* renamed from: d */
    final Bundle f24828d;

    C10475h(int i, int i2, Bundle bundle) {
        this.f24825a = i;
        this.f24827c = i2;
        this.f24828d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo27299a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27311a(T t) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f24826b.mo29273a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo27300a();

    public String toString() {
        int i = this.f24827c;
        int i2 = this.f24825a;
        boolean a = mo27300a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27310a(C10473g gVar) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(gVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f24826b.mo29272a((Exception) gVar);
    }
}
