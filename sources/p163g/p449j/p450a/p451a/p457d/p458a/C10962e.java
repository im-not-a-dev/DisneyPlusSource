package p163g.p449j.p450a.p451a.p457d.p458a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.j.a.a.d.a.e */
public abstract class C10962e extends C10959b implements C10961d {
    /* renamed from: a */
    public static C10961d m34651a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C10961d ? (C10961d) queryLocalInterface : new C10963f(iBinder);
    }
}
