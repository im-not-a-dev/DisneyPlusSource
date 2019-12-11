package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p456c.C10954a;
import p163g.p449j.p450a.p451a.p456c.C10957b;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;
import p163g.p449j.p450a.p451a.p457d.p464g.C11067cc;
import p163g.p449j.p450a.p451a.p457d.p464g.C11133gc;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;
import p163g.p449j.p450a.p451a.p457d.p464g.C11405zb;

@DynamiteApi
public class AppMeasurementDynamiteService extends C11405zb {

    /* renamed from: a */
    C10145o4 f23260a = null;

    /* renamed from: b */
    private Map<Integer, C10198t5> f23261b = new C3926a();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C9983a implements C10198t5 {

        /* renamed from: a */
        private C11067cc f23262a;

        C9983a(C11067cc ccVar) {
            this.f23262a = ccVar;
        }

        /* renamed from: a */
        public final void mo25573a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f23262a.mo28368a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f23260a.mo25898e().mo25877w().mo25909a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C9984b implements C10168q5 {

        /* renamed from: a */
        private C11067cc f23264a;

        C9984b(C11067cc ccVar) {
            this.f23264a = ccVar;
        }

        /* renamed from: a */
        public final void mo25574a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f23264a.mo28368a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f23260a.mo25898e().mo25877w().mo25909a("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: a */
    private final void m31072a(C11048bc bcVar, String str) {
        this.f23260a.mo26022G().mo26225a(bcVar, str);
    }

    /* renamed from: j */
    private final void m31073j() {
        if (this.f23260a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26046x().mo25576a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26150a(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26046x().mo25577b(str, j);
    }

    public void generateEventId(C11048bc bcVar) throws RemoteException {
        m31073j();
        this.f23260a.mo26022G().mo26223a(bcVar, this.f23260a.mo26022G().mo26240t());
    }

    public void getAppInstanceId(C11048bc bcVar) throws RemoteException {
        m31073j();
        this.f23260a.mo25897d().mo25800a((Runnable) new C10036e6(this, bcVar));
    }

    public void getCachedAppInstanceId(C11048bc bcVar) throws RemoteException {
        m31073j();
        m31072a(bcVar, this.f23260a.mo26047y().mo26132E());
    }

    public void getConditionalUserProperties(String str, String str2, C11048bc bcVar) throws RemoteException {
        m31073j();
        this.f23260a.mo25897d().mo25800a((Runnable) new C10006b9(this, bcVar, str, str2));
    }

    public void getCurrentScreenClass(C11048bc bcVar) throws RemoteException {
        m31073j();
        m31072a(bcVar, this.f23260a.mo26047y().mo26129B());
    }

    public void getCurrentScreenName(C11048bc bcVar) throws RemoteException {
        m31073j();
        m31072a(bcVar, this.f23260a.mo26047y().mo26130C());
    }

    public void getDeepLink(C11048bc bcVar) throws RemoteException {
        m31073j();
        C10218v5 y = this.f23260a.mo26047y();
        y.mo25662j();
        String str = "";
        if (!y.mo25900g().mo25819d(null, C10106l.f23613B0)) {
            y.mo25903m().mo26225a(bcVar, str);
        } else if (y.mo25899f().f23954z.mo26196a() > 0) {
            y.mo25903m().mo26225a(bcVar, str);
        } else {
            y.mo25899f().f23954z.mo26197a(y.mo25896c().mo25474c());
            y.f23701a.mo26025a(bcVar);
        }
    }

    public void getGmpAppId(C11048bc bcVar) throws RemoteException {
        m31073j();
        m31072a(bcVar, this.f23260a.mo26047y().mo26131D());
    }

    public void getMaxUserProperties(String str, C11048bc bcVar) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y();
        C9908u.m30863b(str);
        this.f23260a.mo26022G().mo26222a(bcVar, 25);
    }

    public void getTestFlag(C11048bc bcVar, int i) throws RemoteException {
        m31073j();
        if (i == 0) {
            this.f23260a.mo26022G().mo26225a(bcVar, this.f23260a.mo26047y().mo26135H());
        } else if (i == 1) {
            this.f23260a.mo26022G().mo26223a(bcVar, this.f23260a.mo26047y().mo26136I().longValue());
        } else if (i == 2) {
            C10251y8 G = this.f23260a.mo26022G();
            double doubleValue = this.f23260a.mo26047y().mo26138K().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                bcVar.mo28331c(bundle);
            } catch (RemoteException e) {
                G.f23701a.mo25898e().mo25877w().mo25909a("Error returning double value to wrapper", e);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.f23260a.mo26022G().mo26227a(bcVar, this.f23260a.mo26047y().mo26134G().booleanValue());
            }
        } else {
            this.f23260a.mo26022G().mo26222a(bcVar, this.f23260a.mo26047y().mo26137J().intValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C11048bc bcVar) throws RemoteException {
        m31073j();
        C10078i4 d = this.f23260a.mo25897d();
        C10037e7 e7Var = new C10037e7(this, bcVar, str, str2, z);
        d.mo25800a((Runnable) e7Var);
    }

    public void initForTests(Map map) throws RemoteException {
        m31073j();
    }

    public void initialize(C10954a aVar, C11161ic icVar, long j) throws RemoteException {
        Context context = (Context) C10957b.m34644a(aVar);
        C10145o4 o4Var = this.f23260a;
        if (o4Var == null) {
            this.f23260a = C10145o4.m31729a(context, icVar);
        } else {
            o4Var.mo25898e().mo25877w().mo25908a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C11048bc bcVar) throws RemoteException {
        m31073j();
        this.f23260a.mo25897d().mo25800a((Runnable) new C9995a9(this, bcVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26151a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C11048bc bcVar, long j) throws RemoteException {
        Bundle bundle2;
        m31073j();
        C9908u.m30863b(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str3 = "app";
        bundle2.putString("_o", str3);
        C10084j jVar = new C10084j(str2, new C10073i(bundle), str3, j);
        this.f23260a.mo25897d().mo25800a((Runnable) new C10049f8(this, bcVar, jVar, str));
    }

    public void logHealthData(int i, String str, C10954a aVar, C10954a aVar2, C10954a aVar3) throws RemoteException {
        Object obj;
        Object obj2;
        m31073j();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C10957b.m34644a(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C10957b.m34644a(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C10957b.m34644a(aVar3);
        }
        this.f23260a.mo25898e().mo25872a(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C10954a aVar, Bundle bundle, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityCreated((Activity) C10957b.m34644a(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C10954a aVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityDestroyed((Activity) C10957b.m34644a(aVar));
        }
    }

    public void onActivityPaused(C10954a aVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityPaused((Activity) C10957b.m34644a(aVar));
        }
    }

    public void onActivityResumed(C10954a aVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityResumed((Activity) C10957b.m34644a(aVar));
        }
    }

    public void onActivitySaveInstanceState(C10954a aVar, C11048bc bcVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        Bundle bundle = new Bundle();
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivitySaveInstanceState((Activity) C10957b.m34644a(aVar), bundle);
        }
        try {
            bcVar.mo28331c(bundle);
        } catch (RemoteException e) {
            this.f23260a.mo25898e().mo25877w().mo25909a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C10954a aVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityStarted((Activity) C10957b.m34644a(aVar));
        }
    }

    public void onActivityStopped(C10954a aVar, long j) throws RemoteException {
        m31073j();
        C10147o6 o6Var = this.f23260a.mo26047y().f23992c;
        if (o6Var != null) {
            this.f23260a.mo26047y().mo26133F();
            o6Var.onActivityStopped((Activity) C10957b.m34644a(aVar));
        }
    }

    public void performAction(Bundle bundle, C11048bc bcVar, long j) throws RemoteException {
        m31073j();
        bcVar.mo28331c(null);
    }

    public void registerOnMeasurementEventListener(C11067cc ccVar) throws RemoteException {
        m31073j();
        C10198t5 t5Var = (C10198t5) this.f23261b.get(Integer.valueOf(ccVar.mo28369id()));
        if (t5Var == null) {
            t5Var = new C9983a(ccVar);
            this.f23261b.put(Integer.valueOf(ccVar.mo28369id()), t5Var);
        }
        this.f23260a.mo26047y().mo26147a(t5Var);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26143a(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m31073j();
        if (bundle == null) {
            this.f23260a.mo25898e().mo25874t().mo25908a("Conditional user property must not be null");
        } else {
            this.f23260a.mo26047y().mo26145a(bundle, j);
        }
    }

    public void setCurrentScreen(C10954a aVar, String str, String str2, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26017B().mo26169a((Activity) C10957b.m34644a(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26162b(z);
    }

    public void setEventInterceptor(C11067cc ccVar) throws RemoteException {
        m31073j();
        C10218v5 y = this.f23260a.mo26047y();
        C9984b bVar = new C9984b(ccVar);
        y.mo25661h();
        y.mo25754x();
        y.mo25897d().mo25800a((Runnable) new C10248y5(y, bVar));
    }

    public void setInstanceIdProvider(C11133gc gcVar) throws RemoteException {
        m31073j();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26156a(z);
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26158b(j);
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26163c(j);
    }

    public void setUserId(String str, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26154a(null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, C10954a aVar, boolean z, long j) throws RemoteException {
        m31073j();
        this.f23260a.mo26047y().mo26154a(str, str2, C10957b.m34644a(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C11067cc ccVar) throws RemoteException {
        m31073j();
        C10198t5 t5Var = (C10198t5) this.f23261b.remove(Integer.valueOf(ccVar.mo28369id()));
        if (t5Var == null) {
            t5Var = new C9983a(ccVar);
        }
        this.f23260a.mo26047y().mo26160b(t5Var);
    }
}
