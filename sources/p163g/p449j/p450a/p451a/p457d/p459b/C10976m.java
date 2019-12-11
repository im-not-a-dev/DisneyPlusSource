package p163g.p449j.p450a.p451a.p457d.p459b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9874h;
import p163g.p449j.p450a.p451a.p452a.p453a.C10943a.C10944a;

/* renamed from: g.j.a.a.d.b.m */
public final class C10976m extends C9874h<C10981r> {

    /* renamed from: E */
    private final C10944a f26020E;

    public C10976m(Context context, Looper looper, C9864d dVar, C10944a aVar, C9700b bVar, C9701c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        this.f26020E = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C10981r) {
            return (C10981r) queryLocalInterface;
        }
        return new C10982s(iBinder);
    }

    /* renamed from: i */
    public final int mo24962i() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Bundle mo25333u() {
        C10944a aVar = this.f26020E;
        return aVar == null ? new Bundle() : aVar.mo28191a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo24964y() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo24965z() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
