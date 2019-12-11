package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.exoplayer2.drm.h */
/* compiled from: ClearKeyUtil */
final class ClearKeyUtil {
    /* renamed from: a */
    public static byte[] m25219a(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        return Util.m29447d(m25218a(Util.m29399a(bArr)));
    }

    /* renamed from: b */
    public static byte[] m25221b(byte[] bArr) {
        if (Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(Util.m29399a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m25220b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m25220b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return Util.m29447d(sb.toString());
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to adjust response data: ");
            sb2.append(Util.m29399a(bArr));
            Log.m29496a("ClearKeyUtil", sb2.toString(), e);
            return bArr;
        }
    }

    /* renamed from: a */
    private static String m25218a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: b */
    private static String m25220b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
