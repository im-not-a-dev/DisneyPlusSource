package p163g.p449j.p450a.p451a.p457d.p460c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9874h;
import p163g.p449j.p450a.p451a.p452a.p453a.C10946b;
import p163g.p449j.p450a.p451a.p452a.p453a.C10947c;

/* renamed from: g.j.a.a.d.c.b */
public final class C10986b extends C9874h<C10987c> {

    /* renamed from: E */
    private final Bundle f26024E;

    public C10986b(Context context, Looper looper, C9864d dVar, C10947c cVar, C9700b bVar, C9701c cVar2) {
        super(context, looper, 16, dVar, bVar, cVar2);
        if (cVar == null) {
            this.f26024E = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C10987c) {
            return (C10987c) queryLocalInterface;
        }
        return new C10988d(iBinder);
    }

    /* renamed from: i */
    public final int mo24962i() {
        return C9832i.f23040a;
    }

    /* renamed from: l */
    public final boolean mo25324l() {
        C9864d C = mo25375C();
        return !TextUtils.isEmpty(C.mo25356b()) && !C.mo25354a(C10946b.f26006c).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo25333u() {
        return this.f26024E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo24964y() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo24965z() {
        return "com.google.android.gms.auth.service.START";
    }
}
