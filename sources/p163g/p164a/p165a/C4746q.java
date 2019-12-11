package p163g.p164a.p165a;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.q */
/* compiled from: Message */
abstract class C4746q {

    /* renamed from: m */
    private static final Long f11809m = Long.valueOf(0);

    /* renamed from: n */
    private static final Map<String, Class> f11810n = new C4747a();

    /* renamed from: o */
    private static HashMap<String, Integer> f11811o;

    /* renamed from: p */
    private static final Object f11812p = new Object();

    /* renamed from: q */
    private static final boolean[] f11813q = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* renamed from: r */
    private static final Map<String, C4726e> f11814r = new C4748b();

    /* renamed from: a */
    protected String f11815a;

    /* renamed from: b */
    protected C4726e f11816b;

    /* renamed from: c */
    protected Date f11817c;

    /* renamed from: d */
    protected Date f11818d;

    /* renamed from: e */
    protected boolean f11819e;

    /* renamed from: f */
    protected boolean f11820f;

    /* renamed from: g */
    protected int f11821g;

    /* renamed from: h */
    protected ArrayList<ArrayList<String>> f11822h;

    /* renamed from: i */
    private final SecureRandom f11823i = new SecureRandom();

    /* renamed from: j */
    protected ArrayList<C4770v> f11824j;

    /* renamed from: k */
    protected ArrayList<C4770v> f11825k;

    /* renamed from: l */
    private HashMap<String, Object> f11826l;

    /* renamed from: g.a.a.q$a */
    /* compiled from: Message */
    static class C4747a extends HashMap<String, Class> {
        C4747a() {
            put("local", C4767u.class);
            put("alert", C4753r.class);
            put("fullscreen", C4759s.class);
            put("callback", C4712m0.class);
            put("pii", C4714n0.class);
            put("openUrl", C4695k0.class);
        }
    }

    /* renamed from: g.a.a.q$b */
    /* compiled from: Message */
    static class C4748b extends HashMap<String, C4726e> {
        C4748b() {
            put("unknown", C4726e.MESSAGE_SHOW_RULE_UNKNOWN);
            put("always", C4726e.MESSAGE_SHOW_RULE_ALWAYS);
            put("once", C4726e.MESSAGE_SHOW_RULE_ONCE);
            put("untilClick", C4726e.MESSAGE_SHOW_RULE_UNTIL_CLICK);
        }
    }

    C4746q() {
    }

    /* renamed from: b */
    protected static C4746q m16505b(JSONObject jSONObject) {
        String str = "Messages - unable to create instance of message (%s)";
        C4746q qVar = null;
        try {
            C4746q qVar2 = (C4746q) ((Class) f11810n.get(jSONObject.getString("template"))).newInstance();
            if (qVar2.mo16048a(jSONObject)) {
                qVar = qVar2;
            }
            return qVar;
        } catch (JSONException unused) {
            C4783y0.m16640c("Messages - template is required for in-app message", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            C4783y0.m16640c("Messages - invalid template specified for message (%s)", "");
            return null;
        } catch (IllegalAccessException e) {
            C4783y0.m16640c(str, e.getMessage());
            return null;
        } catch (InstantiationException e2) {
            C4783y0.m16640c(str, e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16048a(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            try {
                this.f11815a = jSONObject.getString("messageId");
                if (this.f11815a.length() <= 0) {
                    C4783y0.m16640c("Messages - Unable to create message, messageId is empty", new Object[0]);
                    return false;
                }
                try {
                    String string = jSONObject.getString("showRule");
                    this.f11816b = m16508c(string);
                    if (this.f11816b == null || this.f11816b == C4726e.MESSAGE_SHOW_RULE_UNKNOWN) {
                        C4783y0.m16640c("Messages - Unable to create message \"%s\", showRule not valid (%s)", this.f11815a, string);
                        return false;
                    }
                    try {
                        this.f11817c = new Date(jSONObject.getLong("startDate") * 1000);
                    } catch (JSONException unused) {
                        C4783y0.m16630a("Messages - Tried to read startDate from message \"%s\" but none found. Using default value", this.f11815a);
                        this.f11817c = new Date(f11809m.longValue() * 1000);
                    }
                    try {
                        this.f11818d = new Date(jSONObject.getLong("endDate") * 1000);
                    } catch (JSONException unused2) {
                        C4783y0.m16630a("Messages - Tried to read endDate from message \"%s\" but none found. Using default value", this.f11815a);
                    }
                    try {
                        this.f11819e = jSONObject.getBoolean("showOffline");
                    } catch (JSONException unused3) {
                        C4783y0.m16630a("Messages - Tried to read showOffline from message \"%s\" but none found. Using default value", this.f11815a);
                        this.f11819e = false;
                    }
                    this.f11824j = new ArrayList<>();
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("audiences");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            this.f11824j.add(C4770v.m16563a(jSONArray.getJSONObject(i)));
                        }
                    } catch (JSONException e) {
                        C4783y0.m16630a("Messages - failed to read audience for message \"%s\", error: %s", this.f11815a, e.getMessage());
                    }
                    this.f11825k = new ArrayList<>();
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("triggers");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            this.f11825k.add(C4770v.m16563a(jSONArray2.getJSONObject(i2)));
                        }
                    } catch (JSONException e2) {
                        C4783y0.m16630a("Messages - failed to read trigger for message \"%s\", error: %s", this.f11815a, e2.getMessage());
                    }
                    if (this.f11825k.size() <= 0) {
                        C4783y0.m16640c("Messages - Unable to load message \"%s\" - at least one valid trigger is required for a message", this.f11815a);
                        return false;
                    }
                    this.f11820f = false;
                    return true;
                } catch (JSONException unused4) {
                    C4783y0.m16640c("Messages - Unable to create message \"%s\", showRule is required", this.f11815a);
                    return false;
                }
            } catch (JSONException unused5) {
                C4783y0.m16640c("Messages - Unable to create message, messageId is required", new Object[0]);
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo16129c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message ID: ");
        sb.append(this.f11815a);
        sb.append("; Show Rule: ");
        sb.append(this.f11816b.toString());
        sb.append("; Blacklisted: ");
        sb.append(mo16130d());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo16130d() {
        boolean z;
        synchronized (f11812p) {
            if (f11811o == null) {
                f11811o = mo16131e();
            }
            z = f11811o.get(this.f11815a) != null;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public HashMap<String, Integer> mo16131e() {
        try {
            String string = C4783y0.m16604B().getString("messagesBlackList", null);
            if (string == null) {
                return new HashMap<>();
            }
            return m16507b(string);
        } catch (C4785b e) {
            C4783y0.m16630a("Messaging - Unable to get shared preferences while loading blacklist. (%s)", e.getMessage());
            return new HashMap<>();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo16132f() {
        HashMap hashMap = new HashMap();
        hashMap.put("a.message.id", this.f11815a);
        hashMap.put("a.message.triggered", Integer.valueOf(1));
        C4671f.m16253a("In-App Message", hashMap, C4783y0.m16607E());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16133g() {
        if (mo16130d()) {
            synchronized (f11812p) {
                f11811o.remove(this.f11815a);
                C4783y0.m16630a("Messages - removing message \"%s\" from blacklist", this.f11815a);
                try {
                    Editor C = C4783y0.m16605C();
                    C.putString("messagesBlackList", m16506b((Map<String, Integer>) f11811o));
                    C.commit();
                } catch (C4785b e) {
                    C4783y0.m16636b("Messages - Error persisting blacklist map (%s).", e.getMessage());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        this.f11821g = C4783y0.m16654n();
        if (this.f11816b == C4726e.MESSAGE_SHOW_RULE_ONCE) {
            mo16126a();
        }
        if ((this instanceof C4753r) || (this instanceof C4759s)) {
            C4721o0.m16410a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo16134i() {
        HashMap hashMap = new HashMap();
        hashMap.put("a.message.id", this.f11815a);
        hashMap.put("a.message.viewed", Integer.valueOf(1));
        C4671f.m16253a("In-App Message", hashMap, C4783y0.m16607E());
        C4721o0.m16410a((C4746q) null);
    }

    /* renamed from: c */
    private static C4726e m16508c(String str) {
        return (C4726e) f11814r.get(str);
    }

    /* renamed from: d */
    private boolean m16509d(String str) {
        try {
            for (byte b : str.getBytes(Utf8Charset.NAME)) {
                if (!f11813q[b & 255]) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            C4783y0.m16636b("Data Callback - Unable to validate token (%s)", e.getLocalizedMessage());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16128b() {
        HashMap hashMap = new HashMap();
        hashMap.put("a.message.id", this.f11815a);
        hashMap.put("a.message.clicked", Integer.valueOf(1));
        C4671f.m16253a("In-App Message", hashMap, C4783y0.m16607E());
        if (this.f11816b == C4726e.MESSAGE_SHOW_RULE_UNTIL_CLICK) {
            mo16126a();
        }
        C4721o0.m16410a((C4746q) null);
    }

    /* renamed from: b */
    private HashMap<String, Integer> m16507b(String str) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, Integer.valueOf(jSONObject.getInt(str2)));
            }
        } catch (JSONException e) {
            C4783y0.m16636b("Messages- Unable to deserialize blacklist(%s)", e.getMessage());
        }
        return hashMap;
    }

    /* renamed from: b */
    private String m16506b(Map<String, Integer> map) {
        return new JSONObject(map).toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16126a() {
        synchronized (f11812p) {
            if (f11811o == null) {
                f11811o = mo16131e();
            }
            f11811o.put(this.f11815a, Integer.valueOf(this.f11816b.mo16069a()));
            C4783y0.m16630a("Messages - adding message \"%s\" to blacklist", this.f11815a);
            try {
                Editor C = C4783y0.m16605C();
                C.putString("messagesBlackList", m16506b((Map<String, Integer>) f11811o));
                C.commit();
            } catch (C4785b e) {
                C4783y0.m16636b("Messages - Error persisting blacklist map (%s).", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16127a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        HashMap hashMap;
        if (this.f11820f && this.f11821g != C4783y0.m16654n() && (this instanceof C4753r)) {
            return true;
        }
        if (C4721o0.m16415c() != null && !(this instanceof C4767u) && !(this instanceof C4712m0)) {
            return false;
        }
        if (map2 != null) {
            hashMap = new HashMap(map2);
        } else {
            hashMap = new HashMap();
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (hashMap.size() <= 0) {
            return false;
        }
        hashMap.putAll(m16504a((Map<String, Object>) hashMap));
        if (map3 != null) {
            hashMap.putAll(map3);
        }
        this.f11826l = new HashMap<>(hashMap);
        if (mo16130d()) {
            return false;
        }
        if (!C4728p0.m16448H().mo16075F() && !this.f11819e) {
            return false;
        }
        Date date = new Date(C4783y0.m16607E() * 1000);
        if (date.before(this.f11817c)) {
            return false;
        }
        Date date2 = this.f11818d;
        if (date2 != null && date.after(date2)) {
            return false;
        }
        Iterator it = this.f11824j.iterator();
        while (it.hasNext()) {
            if (!((C4770v) it.next()).mo16025a((Map<String, Object>[]) new Map[]{map3})) {
                return false;
            }
        }
        Map a = C4783y0.m16623a(map2);
        Iterator it2 = this.f11825k.iterator();
        while (it2.hasNext()) {
            if (!((C4770v) it2.next()).mo16025a((Map<String, Object>[]) new Map[]{map, a})) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private HashMap<String, Object> m16504a(Map<String, Object> map) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>(9);
        hashMap.put("%sdkver%", "4.17.1-AN");
        hashMap.put("%cachebust%", String.valueOf(this.f11823i.nextInt(100000000)));
        hashMap.put("%adid%", C4783y0.m16638c());
        hashMap.put("%timestampu%", String.valueOf(C4783y0.m16607E()));
        hashMap.put("%timestampz%", C4783y0.m16660t());
        hashMap.put("%pushid%", C4783y0.m16665y());
        String str2 = "";
        hashMap.put("%mcid%", C4673f1.m16289k().mo16013e() != null ? C4673f1.m16289k().mo16013e() : str2);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (String str3 : map.keySet()) {
            if (str3 != null) {
                Object obj = map.get(str3);
                if (obj == null) {
                    str = str2;
                } else {
                    str = obj.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C4783y0.m16619a(str3));
                sb.append("=");
                sb.append(C4783y0.m16619a(str));
                arrayList.add(sb.toString());
                hashMap2.put(str3, str);
            }
        }
        hashMap.put("%all_url%", TextUtils.join("&", arrayList));
        try {
            String jSONObject = new JSONObject(hashMap2).toString();
            if (jSONObject.length() > 0) {
                hashMap.put("%all_json%", jSONObject);
            }
        } catch (NullPointerException e) {
            C4783y0.m16630a("Data Callback - unable to create json string for vars:  (%s)", e.getLocalizedMessage());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HashMap<String, String> mo16125a(ArrayList<String> arrayList, boolean z) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Object obj = this.f11826l.get(str2.substring(1, str2.length() - 1).toLowerCase());
            if (obj == null) {
                str = "";
            } else {
                str = obj.toString();
            }
            if (z) {
                str = C4783y0.m16619a(str);
            }
            hashMap.put(str2, str);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<String> mo16124a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(32);
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) == '{') {
                int i2 = i + 1;
                while (i2 < length && str.charAt(i2) != '}') {
                    i2++;
                }
                if (i2 == length) {
                    break;
                }
                String substring = str.substring(i, i2 + 1);
                if (m16509d(substring.substring(1, substring.length() - 1))) {
                    arrayList.add(substring);
                    i = i2;
                }
            }
            i++;
        }
        return arrayList;
    }
}
