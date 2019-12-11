package p163g.p164a.p165a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.u0 */
/* compiled from: ReferrerHandler */
final class C4768u0 {

    /* renamed from: a */
    private static boolean f11862a = true;

    /* renamed from: b */
    static final HashSet<String> f11863b = new C4769a();

    /* renamed from: g.a.a.u0$a */
    /* compiled from: ReferrerHandler */
    static class C4769a extends HashSet<String> {
        C4769a() {
            add("a.acquisition.custom.unique_id");
            add("a.acquisition.custom.deeplinkid");
            add("a.acquisition.custom.link_deferred");
        }
    }

    /* renamed from: a */
    protected static void m16553a(boolean z) {
        f11862a = z;
    }

    /* renamed from: b */
    protected static HashMap<String, Object> m16556b(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str == null) {
            return hashMap;
        }
        try {
            hashMap.putAll(m16552a(new JSONObject(str), "googleReferrerData"));
        } catch (JSONException e) {
            C4783y0.m16630a("Could not retrieve Google referrer data (%s)", e.getMessage());
            hashMap.clear();
        }
        return hashMap;
    }

    /* renamed from: c */
    protected static HashMap<String, Object> m16557c(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str == null) {
            return hashMap;
        }
        try {
            hashMap.putAll(m16552a(new JSONObject(str), "otherReferrerData"));
        } catch (JSONException e) {
            C4783y0.m16630a("Could not retrieve referrer data (%s)", e.getMessage());
            hashMap.clear();
        }
        return hashMap;
    }

    /* renamed from: d */
    protected static HashMap<String, Object> m16558d(String str) {
        return m16552a(m16561g(str), "contextData");
    }

    /* renamed from: e */
    protected static String m16559e(String str) {
        String str2 = "a.acquisition.custom.";
        String str3 = "adobeData";
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap a = m16552a(jSONObject, str3);
            HashMap hashMap = new HashMap();
            if (a != null && a.size() > 0) {
                for (Entry entry : a.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (!str4.startsWith(str2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(str4);
                        str4 = sb.toString();
                    }
                    hashMap.put(str4, entry.getValue());
                }
                jSONObject.remove(str3);
                jSONObject.put(str3, new JSONObject(hashMap));
                str = jSONObject.toString();
            }
        } catch (JSONException e) {
            C4783y0.m16630a("Could not parse adobeData from the response (%s)", e.getMessage());
        }
        return str;
    }

    /* renamed from: f */
    protected static HashMap<String, Object> m16560f(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            HashMap a = m16552a(new JSONObject(str), "adobeData");
            if (a != null && a.size() > 0) {
                hashMap.putAll(m16551a(a));
            }
        } catch (JSONException e) {
            C4783y0.m16630a("Could not parse adobeData from the response (%s)", e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: g */
    protected static JSONObject m16561g(String str) {
        String str2 = "Analytics - Unable to parse acquisition service response (no contextData parameter in response)";
        if (!(str == null || str.length() == 0)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("contextData");
                    if (jSONObject2 == null) {
                        C4783y0.m16630a(str2, new Object[0]);
                        return null;
                    } else if (!jSONObject2.has("a.referrer.campaign.name")) {
                        C4783y0.m16630a("Analytics - Acquisition referrer data was not complete (no a.referrer.campaign.name in context data), ignoring", new Object[0]);
                        return null;
                    } else {
                        C4783y0.m16630a("Analytics - Received Referrer Data(%s)", str);
                        return jSONObject;
                    }
                } catch (JSONException unused) {
                    C4783y0.m16630a(str2, new Object[0]);
                    return null;
                }
            } catch (JSONException e) {
                C4783y0.m16630a("Analytics - Unable to parse response(%s)", e.getLocalizedMessage());
            }
        }
        return null;
    }

    /* renamed from: h */
    protected static void m16562h(String str) {
        if (str != null) {
            try {
                Activity m = C4783y0.m16653m();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                m.startActivity(intent);
            } catch (C4784a e) {
                C4783y0.m16640c(e.getMessage(), new Object[0]);
            } catch (Exception e2) {
                C4783y0.m16640c("Acquisition - Could not load deep link intent for Acquisition (%s)", e2.toString());
            }
        }
    }

    /* renamed from: a */
    protected static boolean m16554a() {
        return f11862a;
    }

    /* renamed from: a */
    protected static boolean m16555a(String str) {
        return f11863b.contains(str);
    }

    /* renamed from: a */
    protected static HashMap<String, Object> m16551a(HashMap<String, Object> hashMap) {
        if (hashMap == null || hashMap.size() == 0) {
            return null;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(hashMap);
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            if (m16555a((String) ((Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        return hashMap2;
    }

    /* renamed from: a */
    protected static HashMap<String, Object> m16552a(JSONObject jSONObject, String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return hashMap;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 == null) {
                return hashMap;
            }
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                try {
                    hashMap.put(obj, jSONObject2.getString(obj));
                } catch (JSONException unused) {
                    C4783y0.m16630a("Analytics - Unable to parse acquisition service response (the value for %s is not a string)", obj);
                }
            }
            return hashMap;
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String m16550a(org.json.JSONObject r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "adobeData"
            org.json.JSONObject r2 = r2.getJSONObject(r1)     // Catch:{ JSONException -> 0x0014 }
            if (r2 != 0) goto L_0x000d
            return r0
        L_0x000d:
            java.lang.String r1 = "a.acquisition.custom.link_deferred"
            java.lang.String r2 = r2.getString(r1)     // Catch:{  }
            return r2
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p164a.p165a.C4768u0.m16550a(org.json.JSONObject):java.lang.String");
    }
}
