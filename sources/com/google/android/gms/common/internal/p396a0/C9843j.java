package com.google.android.gms.common.internal.p396a0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import com.google.android.gms.common.internal.C9864d;
import com.google.android.gms.common.internal.C9874h;

/* renamed from: com.google.android.gms.common.internal.a0.j */
public final class C9843j extends C9874h<C9846m> {
    public C9843j(Context context, Looper looper, C9864d dVar, C9700b bVar, C9701c cVar) {
        super(context, looper, 39, dVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C9846m) {
            return (C9846m) queryLocalInterface;
        }
        return new C9847n(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo24964y() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: z */
    public final String mo24965z() {
        return "com.google.android.gms.common.service.START";
    }
}
