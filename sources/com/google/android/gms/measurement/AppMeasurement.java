package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.measurement.internal.C10123m5;
import com.google.android.gms.measurement.internal.C10136n6;
import com.google.android.gms.measurement.internal.C10145o4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: d */
    private static volatile AppMeasurement f23252d;

    /* renamed from: a */
    private final C10145o4 f23253a;

    /* renamed from: b */
    private final C10136n6 f23254b;

    /* renamed from: c */
    private final boolean f23255c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final Bundle m31058a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C10123m5.m31569a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        private ConditionalUserProperty(Bundle bundle) {
            C9908u.m30853a(bundle);
            this.mAppId = (String) C10123m5.m31568a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C10123m5.m31568a(bundle, "origin", String.class, null);
            this.mName = (String) C10123m5.m31568a(bundle, "name", String.class, null);
            this.mValue = C10123m5.m31568a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C10123m5.m31568a(bundle, "trigger_event_name", String.class, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) C10123m5.m31568a(bundle, "trigger_timeout", Long.class, valueOf)).longValue();
            this.mTimedOutEventName = (String) C10123m5.m31568a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C10123m5.m31568a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C10123m5.m31568a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C10123m5.m31568a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C10123m5.m31568a(bundle, "time_to_live", Long.class, valueOf)).longValue();
            this.mExpiredEventName = (String) C10123m5.m31568a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C10123m5.m31568a(bundle, "expired_event_params", Bundle.class, null);
        }
    }

    private AppMeasurement(C10145o4 o4Var) {
        C9908u.m30853a(o4Var);
        this.f23253a = o4Var;
        this.f23254b = null;
        this.f23255c = false;
    }

    /* renamed from: a */
    private static AppMeasurement m31054a(Context context, String str, String str2) {
        if (f23252d == null) {
            synchronized (AppMeasurement.class) {
                if (f23252d == null) {
                    C10136n6 b = m31055b(context, null);
                    if (b != null) {
                        f23252d = new AppMeasurement(b);
                    } else {
                        f23252d = new AppMeasurement(C10145o4.m31730a(context, null, null, null));
                    }
                }
            }
        }
        return f23252d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C10136n6 m31055b(android.content.Context r8, android.os.Bundle r9) {
        /*
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch:{  }
            com.google.android.gms.measurement.internal.n6 r8 = (com.google.android.gms.measurement.internal.C10136n6) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m31055b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.n6");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return m31054a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f23255c) {
            this.f23254b.mo25959b(str);
        } else {
            this.f23253a.mo26046x().mo25576a(str, this.f23253a.mo25896c().mo25472a());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f23255c) {
            this.f23254b.clearConditionalUserProperty(str, str2, bundle);
        } else {
            this.f23253a.mo26047y().mo26150a(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f23255c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f23253a.mo26047y().mo26155a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f23255c) {
            this.f23254b.mo25961c(str);
        } else {
            this.f23253a.mo26046x().mo25577b(str, this.f23253a.mo25896c().mo25472a());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.f23255c) {
            return this.f23254b.mo25958b();
        }
        return this.f23253a.mo26022G().mo26240t();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.f23255c) {
            return this.f23254b.mo25952a();
        }
        return this.f23253a.mo26047y().mo26132E();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.f23255c) {
            list = this.f23254b.mo25953a(str, str2);
        } else {
            list = this.f23253a.mo26047y().mo26157b(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f23255c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f23253a.mo26047y().mo26140a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.f23255c) {
            return this.f23254b.mo25964e();
        }
        return this.f23253a.mo26047y().mo26129B();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.f23255c) {
            return this.f23254b.mo25960c();
        }
        return this.f23253a.mo26047y().mo26130C();
    }

    @Keep
    public String getGmpAppId() {
        if (this.f23255c) {
            return this.f23254b.mo25963d();
        }
        return this.f23253a.mo26047y().mo26131D();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f23255c) {
            return this.f23254b.mo25951a(str);
        }
        this.f23253a.mo26047y();
        C9908u.m30863b(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f23255c) {
            return this.f23254b.mo25954a(str, str2, z);
        }
        return this.f23253a.mo26047y().mo26142a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f23255c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f23253a.mo26047y().mo26141a(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f23255c) {
            this.f23254b.mo25956a(str, str2, bundle);
        } else {
            this.f23253a.mo26047y().mo26161b(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C9908u.m30853a(conditionalUserProperty);
        if (this.f23255c) {
            this.f23254b.mo25955a(conditionalUserProperty.m31058a());
        } else {
            this.f23253a.mo26047y().mo26144a(conditionalUserProperty.m31058a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C9908u.m30853a(conditionalUserProperty);
        if (this.f23255c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f23253a.mo26047y().mo26159b(conditionalUserProperty.m31058a());
        throw null;
    }

    private AppMeasurement(C10136n6 n6Var) {
        C9908u.m30853a(n6Var);
        this.f23254b = n6Var;
        this.f23253a = null;
        this.f23255c = true;
    }

    /* renamed from: a */
    public static AppMeasurement m31053a(Context context, Bundle bundle) {
        if (f23252d == null) {
            synchronized (AppMeasurement.class) {
                if (f23252d == null) {
                    C10136n6 b = m31055b(context, bundle);
                    if (b != null) {
                        f23252d = new AppMeasurement(b);
                    } else {
                        f23252d = new AppMeasurement(C10145o4.m31730a(context, null, null, bundle));
                    }
                }
            }
        }
        return f23252d;
    }

    /* renamed from: a */
    public final void mo25495a(boolean z) {
        if (this.f23255c) {
            this.f23254b.setDataCollectionEnabled(z);
        } else {
            this.f23253a.mo26047y().mo26162b(z);
        }
    }

    /* renamed from: a */
    public void mo25494a(String str, String str2, Object obj) {
        C9908u.m30863b(str);
        if (this.f23255c) {
            this.f23254b.mo25957a(str, str2, obj);
        } else {
            this.f23253a.mo26047y().mo26153a(str, str2, obj, true);
        }
    }
}
