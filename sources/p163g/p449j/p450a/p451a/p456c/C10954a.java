package p163g.p449j.p450a.p451a.p456c;

import android.os.IBinder;
import android.os.IInterface;
import p163g.p449j.p450a.p451a.p457d.p462e.C10998a;
import p163g.p449j.p450a.p451a.p457d.p462e.C10999b;

/* renamed from: g.j.a.a.c.a */
public interface C10954a extends IInterface {

    /* renamed from: g.j.a.a.c.a$a */
    public static abstract class C10955a extends C10999b implements C10954a {

        /* renamed from: g.j.a.a.c.a$a$a */
        public static class C10956a extends C10998a implements C10954a {
            C10956a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C10955a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C10954a m34642a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C10954a) {
                return (C10954a) queryLocalInterface;
            }
            return new C10956a(iBinder);
        }
    }
}
