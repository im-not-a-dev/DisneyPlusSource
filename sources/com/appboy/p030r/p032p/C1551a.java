package com.appboy.p030r.p032p;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.appboy.p033s.C1564j;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appboy.r.p.a */
public final class C1551a implements C1535e<JSONObject> {

    /* renamed from: U */
    private static final String f5686U = C1557c.m7461a(C1551a.class);

    /* renamed from: c */
    private JSONObject f5687c = new JSONObject();

    public C1551a() {
    }

    /* renamed from: d */
    static boolean m7429d(String str) {
        if (str != null) {
            return true;
        }
        C1557c.m7473e(f5686U, "The AppboyProperties value cannot be null. Not adding property.");
        return false;
    }

    /* renamed from: I */
    public int mo6891I() {
        return this.f5687c.length();
    }

    /* renamed from: a */
    public C1551a mo6892a(String str, String str2) {
        if (m7428a(str) && m7429d(str2)) {
            try {
                this.f5687c.put(C1564j.m7492a(str), C1564j.m7492a(str2));
            } catch (JSONException e) {
                C1557c.m7470c(f5686U, "Caught json exception trying to add property.", e);
            }
        }
        return this;
    }

    /* renamed from: b */
    public JSONObject m7433b() {
        return this.f5687c;
    }

    public C1551a(JSONObject jSONObject) {
        this.f5687c = jSONObject;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        for (String str : arrayList) {
            if (!m7428a(str)) {
                this.f5687c.remove(str);
            } else {
                try {
                    if (jSONObject.get(str) instanceof String) {
                        if (!m7429d(jSONObject.getString(str))) {
                            this.f5687c.remove(str);
                        }
                    } else if (jSONObject.get(str) == JSONObject.NULL) {
                        this.f5687c.remove(str);
                    }
                } catch (JSONException e) {
                    String str2 = f5686U;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Caught json exception validating property with key name: ");
                    sb.append(str);
                    C1557c.m7470c(str2, sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m7428a(String str) {
        if (C1563i.m7490d(str)) {
            C1557c.m7473e(f5686U, "The AppboyProperties key cannot be null or contain only whitespaces. Not adding property.");
            return false;
        } else if (!str.startsWith("$")) {
            return true;
        } else {
            C1557c.m7473e(f5686U, "The leading character in the key string may not be '$'. Not adding property.");
            return false;
        }
    }
}
