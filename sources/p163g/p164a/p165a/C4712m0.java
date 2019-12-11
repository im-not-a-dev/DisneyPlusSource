package p163g.p164a.p165a;

import android.util.Base64;
import com.bamtechmedia.dominguez.legal.DefaultLegalApi;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.m0 */
/* compiled from: MessageTemplateCallback */
class C4712m0 extends C4746q {

    /* renamed from: s */
    protected String f11715s;

    /* renamed from: t */
    protected String f11716t;

    /* renamed from: u */
    protected String f11717u;

    /* renamed from: v */
    protected int f11718v;

    C4712m0() {
    }

    /* renamed from: m */
    private String m16377m() {
        String str = this.f11716t;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String str2 = this.f11717u;
        HashMap a = mo16125a(mo16124a(this.f11716t), !(str2 == null ? false : str2.toLowerCase().contains(DefaultLegalApi.MIME_TYPE_JSON)));
        ArrayList arrayList = new ArrayList();
        arrayList.add("{%all_url%}");
        arrayList.add("{%all_json%}");
        a.putAll(mo16125a(arrayList, false));
        return C4783y0.m16620a(this.f11716t, (Map<String, String>) a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16048a(JSONObject jSONObject) {
        String str = "%s - Failed to decode \"templatebody\" for data callback (%s).  This is not a required field";
        if (jSONObject == null || jSONObject.length() <= 0 || !super.mo16048a(jSONObject)) {
            return false;
        }
        String l = mo16034l();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            if (jSONObject2.length() <= 0) {
                C4783y0.m16630a("%s - Unable to create data callback %s, \"payload\" is empty", l, this.f11815a);
                return false;
            }
            try {
                this.f11715s = jSONObject2.getString("templateurl");
                if (this.f11715s.length() <= 0) {
                    C4783y0.m16630a("%s - Unable to create data callback %s, \"templateurl\" is empty", l, this.f11815a);
                    return false;
                }
                try {
                    this.f11718v = jSONObject2.getInt("timeout");
                } catch (JSONException unused) {
                    C4783y0.m16630a("%s - Tried to read \"timeout\" for data callback, but found none.  Using default value of two (2) seconds", l);
                    this.f11718v = 2;
                }
                try {
                    String string = jSONObject2.getString("templatebody");
                    if (string != null && string.length() > 0) {
                        byte[] decode = Base64.decode(string, 0);
                        if (decode != null) {
                            String str2 = new String(decode, Utf8Charset.NAME);
                            if (str2.length() > 0) {
                                this.f11716t = str2;
                            }
                        }
                    }
                } catch (JSONException unused2) {
                    C4783y0.m16630a("%s - Tried to read \"templatebody\" for data callback, but found none.  This is not a required field", l);
                } catch (UnsupportedEncodingException e) {
                    C4783y0.m16630a(str, l, e.getLocalizedMessage());
                } catch (IllegalArgumentException e2) {
                    C4783y0.m16630a(str, l, e2.getLocalizedMessage());
                }
                String str3 = this.f11716t;
                if (str3 != null && str3.length() > 0) {
                    try {
                        this.f11717u = jSONObject2.getString("contenttype");
                    } catch (JSONException unused3) {
                        C4783y0.m16630a("%s - Tried to read \"contenttype\" for data callback, but found none.  This is not a required field", l);
                    }
                }
                return true;
            } catch (JSONException unused4) {
                C4783y0.m16630a("%s - Unable to create data callback %s, \"templateurl\" is required", l, this.f11815a);
                return false;
            }
        } catch (JSONException unused5) {
            C4783y0.m16630a("%s - Unable to create create data callback %s, \"payload\" is required", l, this.f11815a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo16033h() {
        String j = mo16049j();
        String m = m16377m();
        C4783y0.m16630a("%s - Request Queued (url:%s body:%s contentType:%s)", mo16034l(), j, m, this.f11717u);
        mo16050k().mo15994a(j, m, this.f11717u, C4783y0.m16607E(), (long) this.f11718v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo16049j() {
        String str = this.f11715s;
        if (str == null || str.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("{%all_url%}");
        HashMap a = mo16125a(mo16124a(this.f11715s), true);
        a.putAll(mo16125a(arrayList, false));
        return C4783y0.m16620a(this.f11715s, (Map<String, String>) a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4660c1 mo16050k() {
        return C4660c1.m16235o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo16034l() {
        return "Postbacks";
    }
}
