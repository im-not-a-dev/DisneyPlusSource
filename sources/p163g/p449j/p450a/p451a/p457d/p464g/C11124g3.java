package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.j.a.a.d.g.g3 */
public abstract class C11124g3 extends C11020a implements C11125g4 {
    /* renamed from: a */
    public static C11125g4 m35243a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C11125g4) {
            return (C11125g4) queryLocalInterface;
        }
        return new C11140h5(iBinder);
    }
}
