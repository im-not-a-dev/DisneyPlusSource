package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p163g.p449j.p450a.p451a.p457d.p462e.C10999b;

/* renamed from: com.google.android.gms.common.internal.v0 */
public abstract class C9911v0 extends C10999b implements C9909u0 {
    /* renamed from: a */
    public static C9909u0 m30872a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C9909u0) {
            return (C9909u0) queryLocalInterface;
        }
        return new C9913w0(iBinder);
    }
}
