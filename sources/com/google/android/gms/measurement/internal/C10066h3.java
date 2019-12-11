package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.internal.C9850c;
import com.google.android.gms.common.internal.C9850c.C9851a;
import com.google.android.gms.common.internal.C9850c.C9852b;

/* renamed from: com.google.android.gms.measurement.internal.h3 */
public final class C10066h3 extends C9850c<C10000b3> {
    public C10066h3(Context context, Looper looper, C9851a aVar, C9852b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo24960a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C10000b3) {
            return (C10000b3) queryLocalInterface;
        }
        return new C10022d3(iBinder);
    }

    /* renamed from: i */
    public final int mo24962i() {
        return C9832i.f23040a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final String mo24964y() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo24965z() {
        return "com.google.android.gms.measurement.START";
    }
}
