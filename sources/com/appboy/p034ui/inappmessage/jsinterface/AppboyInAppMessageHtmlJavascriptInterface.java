package com.appboy.p034ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.C1440a;
import com.appboy.p030r.p032p.C1551a;
import com.appboy.p033s.C1557c;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: com.appboy.ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface */
public class AppboyInAppMessageHtmlJavascriptInterface {
    private static final String TAG = C1557c.m7461a(AppboyInAppMessageHtmlJavascriptInterface.class);
    private Context mContext;
    private AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface;

    public AppboyInAppMessageHtmlJavascriptInterface(Context context) {
        this.mContext = context;
        this.mUserInterface = new AppboyInAppMessageHtmlUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public AppboyInAppMessageHtmlUserJavascriptInterface getUser() {
        return this.mUserInterface;
    }

    @JavascriptInterface
    public void logCustomEventWithJSON(String str, String str2) {
        C1440a.m6921c(this.mContext).mo6564a(str, parseProperties(str2));
    }

    @JavascriptInterface
    public void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        C1440a.m6921c(this.mContext).mo6568a(str4, str5, new BigDecimal(Double.toString(d)), i, parseProperties(str3));
    }

    /* access modifiers changed from: 0000 */
    public C1551a parseProperties(String str) {
        if (str != null) {
            try {
                if (!str.equals("undefined") && !str.equals("null")) {
                    return new C1551a(new JSONObject(str));
                }
            } catch (Exception e) {
                String str2 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse properties JSON String: ");
                sb.append(str);
                C1557c.m7470c(str2, sb.toString(), e);
            }
        }
        return null;
    }

    @JavascriptInterface
    public void requestImmediateDataFlush() {
        C1440a.m6921c(this.mContext).mo6588j();
    }
}
