package p163g.p164a.p165a;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.security.SecureRandom;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.u */
/* compiled from: MessageLocalNotification */
final class C4767u extends C4746q {

    /* renamed from: s */
    protected String f11858s;

    /* renamed from: t */
    protected String f11859t;

    /* renamed from: u */
    protected String f11860u;

    /* renamed from: v */
    protected Integer f11861v;

    C4767u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16048a(JSONObject jSONObject) {
        String str = "Messages - Tried to read userData for local notification message but found none.  This is not a required field";
        if (jSONObject == null || jSONObject.length() <= 0 || !super.mo16048a(jSONObject)) {
            return false;
        }
        C4783y0.m16630a("Messages -  Building Local Notification message.", new Object[0]);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                C4783y0.m16630a("Messages - Unable to create local notification message \"%s\", payload is empty", this.f11815a);
                return false;
            }
            try {
                this.f11858s = jSONObject2.getString("content");
                if (this.f11858s.length() <= 0) {
                    C4783y0.m16630a("Messages - Unable to create local notification message \"%s\", content is empty", this.f11815a);
                    return false;
                }
                try {
                    this.f11861v = Integer.valueOf(jSONObject2.getInt("wait"));
                    try {
                        this.f11859t = jSONObject2.getString("adb_deeplink");
                    } catch (JSONException unused) {
                        C4783y0.m16630a("Messages - Tried to read deeplink for local notification message but found none.  This is not a required field", new Object[0]);
                    }
                    try {
                        this.f11860u = jSONObject2.getJSONObject("userData").toString();
                    } catch (JSONException unused2) {
                        C4783y0.m16630a(str, new Object[0]);
                    } catch (NullPointerException unused3) {
                        C4783y0.m16630a(str, new Object[0]);
                    }
                    C4783y0.m16630a("Message created with: \n MessageID: \"%s\" \n Content: \"%s\" \n Delay: \"%d\" \n Deeplink: \"%s\" \n User Data: \"%s\"", this.f11815a, this.f11858s, this.f11861v, this.f11859t, this.f11860u);
                    return true;
                } catch (JSONException unused4) {
                    C4783y0.m16630a("Messages - Unable to create local notification message \"%s\", localNotificationDelay is required", this.f11815a);
                    return false;
                }
            } catch (JSONException unused5) {
                C4783y0.m16630a("Messages - Unable to create local notification message \"%s\", content is required", this.f11815a);
                return false;
            }
        } catch (JSONException unused6) {
            C4783y0.m16630a("Messages - Unable to create local notification message \"%s\", payload is required", this.f11815a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        super.mo16033h();
        mo16132f();
        try {
            Activity m = C4783y0.m16653m();
            int nextInt = new SecureRandom().nextInt();
            Calendar instance = Calendar.getInstance();
            instance.add(13, this.f11861v.intValue());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(m, C4692j0.class);
            intent.putExtra("adbMessageCode", C4721o0.f11736a);
            intent.putExtra("adb_m_l_id", this.f11815a);
            intent.putExtra("requestCode", nextInt);
            intent.putExtra("userData", this.f11860u);
            intent.putExtra("adb_deeplink", this.f11859t);
            intent.putExtra("alarm_message", this.f11858s);
            try {
                ((AlarmManager) C4783y0.m16603A().getSystemService("alarm")).set(0, instance.getTimeInMillis(), PendingIntent.getBroadcast(C4783y0.m16603A(), nextInt, intent, 134217728));
            } catch (C4785b e) {
                C4783y0.m16636b("Messaging - Error scheduling local notification (%s)", e.getMessage());
            }
        } catch (C4784a e2) {
            C4783y0.m16636b(e2.getMessage(), new Object[0]);
        }
    }
}
