package com.appboy.p034ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.C1440a;
import com.appboy.C1477e;
import com.appboy.p025o.C1499g;
import com.appboy.p025o.C1501h;
import com.appboy.p025o.C1502i;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appboy.ui.inappmessage.jsinterface.AppboyInAppMessageHtmlUserJavascriptInterface */
public class AppboyInAppMessageHtmlUserJavascriptInterface {
    public static final String JS_BRIDGE_GENDER_FEMALE = C1499g.FEMALE.mo6750b();
    public static final String JS_BRIDGE_GENDER_MALE = C1499g.MALE.mo6750b();
    public static final String JS_BRIDGE_GENDER_NOT_APPLICABLE = C1499g.NOT_APPLICABLE.mo6750b();
    public static final String JS_BRIDGE_GENDER_OTHER = C1499g.OTHER.mo6750b();
    public static final String JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY = C1499g.PREFER_NOT_TO_SAY.mo6750b();
    public static final String JS_BRIDGE_GENDER_UNKNOWN = C1499g.UNKNOWN.mo6750b();
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageHtmlUserJavascriptInterface.class);
    private Context mContext;

    public AppboyInAppMessageHtmlUserJavascriptInterface(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void addToCustomAttributeArray(String str, String str2) {
        C1440a.m6921c(this.mContext).mo6581d().mo6644a(str, str2);
    }

    @JavascriptInterface
    public void incrementCustomUserAttribute(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6648b(str);
    }

    /* access modifiers changed from: 0000 */
    public C1501h monthFromInt(int i) {
        if (i < 1 || i > 12) {
            return null;
        }
        return C1501h.m7151a(i - 1);
    }

    /* access modifiers changed from: 0000 */
    public C1499g parseGender(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals(JS_BRIDGE_GENDER_MALE)) {
            return C1499g.MALE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_FEMALE)) {
            return C1499g.FEMALE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_OTHER)) {
            return C1499g.OTHER;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_UNKNOWN)) {
            return C1499g.UNKNOWN;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_NOT_APPLICABLE)) {
            return C1499g.NOT_APPLICABLE;
        }
        if (lowerCase.equals(JS_BRIDGE_GENDER_PREFER_NOT_TO_SAY)) {
            return C1499g.PREFER_NOT_TO_SAY;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String[] parseStringArrayFromJsonString(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e) {
            C1557c.m7470c(TAG, "Failed to parse custom attribute array", e);
            return null;
        }
    }

    @JavascriptInterface
    public void removeFromCustomAttributeArray(String str, String str2) {
        C1440a.m6921c(this.mContext).mo6581d().mo6650b(str, str2);
    }

    @JavascriptInterface
    public void setCountry(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6651c(str);
    }

    /* access modifiers changed from: 0000 */
    public void setCustomAttribute(C1477e eVar, String str, String str2) {
        String str3 = "Failed to parse custom attribute type for key: ";
        try {
            Object obj = new JSONObject(str2).get("value");
            if (obj instanceof String) {
                eVar.mo6652c(str, (String) obj);
            } else if (obj instanceof Boolean) {
                eVar.mo6645a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                eVar.mo6649b(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                eVar.mo6642a(str, ((Double) obj).floatValue());
            } else {
                String str4 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                C1557c.m7465b(str4, sb.toString());
            }
        } catch (Exception e) {
            String str5 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            C1557c.m7470c(str5, sb2.toString(), e);
        }
    }

    @JavascriptInterface
    public void setCustomUserAttributeArray(String str, String str2) {
        String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(str2);
        if (parseStringArrayFromJsonString == null) {
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to set custom attribute array for key ");
            sb.append(str);
            C1557c.m7465b(str3, sb.toString());
            return;
        }
        C1440a.m6921c(this.mContext).mo6581d().mo6646a(str, parseStringArrayFromJsonString);
    }

    @JavascriptInterface
    public void setCustomUserAttributeJSON(String str, String str2) {
        setCustomAttribute(C1440a.m6921c(this.mContext).mo6581d(), str, str2);
    }

    @JavascriptInterface
    public void setDateOfBirth(int i, int i2, int i3) {
        C1501h monthFromInt = monthFromInt(i2);
        if (monthFromInt == null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse month for value ");
            sb.append(i2);
            C1557c.m7465b(str, sb.toString());
            return;
        }
        C1440a.m6921c(this.mContext).mo6581d().mo6639a(i, monthFromInt, i3);
    }

    @JavascriptInterface
    public void setEmail(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6653d(str);
    }

    @JavascriptInterface
    public void setEmailNotificationSubscriptionType(String str) {
        C1502i subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ");
            sb.append(str);
            C1557c.m7465b(str2, sb.toString());
            return;
        }
        C1440a.m6921c(this.mContext).mo6581d().mo6641a(subscriptionTypeFromJavascriptString);
    }

    @JavascriptInterface
    public void setFirstName(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6654e(str);
    }

    @JavascriptInterface
    public void setGender(String str) {
        C1499g parseGender = parseGender(str);
        if (parseGender == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ");
            sb.append(str);
            C1557c.m7465b(str2, sb.toString());
            return;
        }
        C1440a.m6921c(this.mContext).mo6581d().mo6640a(parseGender);
    }

    @JavascriptInterface
    public void setHomeCity(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6655f(str);
    }

    @JavascriptInterface
    public void setLanguage(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6656g(str);
    }

    @JavascriptInterface
    public void setLastName(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6657h(str);
    }

    @JavascriptInterface
    public void setLocationCustomUserAttribute(String str, double d, double d2) {
        C1440a.m6921c(this.mContext).mo6581d().mo6638a(str, d, d2);
    }

    @JavascriptInterface
    public void setPhoneNumber(String str) {
        C1440a.m6921c(this.mContext).mo6581d().mo6658i(str);
    }

    @JavascriptInterface
    public void setPushNotificationSubscriptionType(String str) {
        C1502i subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(str);
        if (subscriptionTypeFromJavascriptString == null) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ");
            sb.append(str);
            C1557c.m7465b(str2, sb.toString());
            return;
        }
        C1440a.m6921c(this.mContext).mo6581d().mo6647b(subscriptionTypeFromJavascriptString);
    }

    /* access modifiers changed from: 0000 */
    public C1502i subscriptionTypeFromJavascriptString(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.equals("subscribed")) {
            return C1502i.SUBSCRIBED;
        }
        if (lowerCase.equals("unsubscribed")) {
            return C1502i.UNSUBSCRIBED;
        }
        if (lowerCase.equals("opted_in")) {
            return C1502i.OPTED_IN;
        }
        return null;
    }
}
