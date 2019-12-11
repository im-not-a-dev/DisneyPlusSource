package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import com.bamtech.sdk4.internal.media.StreamSampleTelemetryData;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.s */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10497s {

    /* renamed from: d */
    private static final long f24875d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f24876a;

    /* renamed from: b */
    private final String f24877b;

    /* renamed from: c */
    private final long f24878c;

    private C10497s(String str, String str2, long j) {
        this.f24876a = str;
        this.f24877b = str2;
        this.f24878c = j;
    }

    /* renamed from: a */
    static String m33122a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(StreamSampleTelemetryData.TIMESTAMP_KEY, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    static C10497s m33123b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C10497s(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C10497s(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(StreamSampleTelemetryData.TIMESTAMP_KEY));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    static String m33121a(C10497s sVar) {
        if (sVar == null) {
            return null;
        }
        return sVar.f24876a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27339a(String str) {
        return System.currentTimeMillis() > this.f24878c + f24875d || !str.equals(this.f24877b);
    }
}
