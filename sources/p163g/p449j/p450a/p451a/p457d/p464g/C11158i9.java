package p163g.p449j.p450a.p451a.p457d.p464g;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p163g.p449j.p450a.p451a.p456c.C10954a;

/* renamed from: g.j.a.a.d.g.i9 */
public interface C11158i9 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C11048bc bcVar) throws RemoteException;

    void getAppInstanceId(C11048bc bcVar) throws RemoteException;

    void getCachedAppInstanceId(C11048bc bcVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C11048bc bcVar) throws RemoteException;

    void getCurrentScreenClass(C11048bc bcVar) throws RemoteException;

    void getCurrentScreenName(C11048bc bcVar) throws RemoteException;

    void getDeepLink(C11048bc bcVar) throws RemoteException;

    void getGmpAppId(C11048bc bcVar) throws RemoteException;

    void getMaxUserProperties(String str, C11048bc bcVar) throws RemoteException;

    void getTestFlag(C11048bc bcVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C11048bc bcVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C10954a aVar, C11161ic icVar, long j) throws RemoteException;

    void isDataCollectionEnabled(C11048bc bcVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C11048bc bcVar, long j) throws RemoteException;

    void logHealthData(int i, String str, C10954a aVar, C10954a aVar2, C10954a aVar3) throws RemoteException;

    void onActivityCreated(C10954a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C10954a aVar, long j) throws RemoteException;

    void onActivityPaused(C10954a aVar, long j) throws RemoteException;

    void onActivityResumed(C10954a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C10954a aVar, C11048bc bcVar, long j) throws RemoteException;

    void onActivityStarted(C10954a aVar, long j) throws RemoteException;

    void onActivityStopped(C10954a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C11048bc bcVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C11067cc ccVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C10954a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setEventInterceptor(C11067cc ccVar) throws RemoteException;

    void setInstanceIdProvider(C11133gc gcVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C10954a aVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C11067cc ccVar) throws RemoteException;
}
