package com.appboy.p033s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.security.MessageDigest;

/* renamed from: com.appboy.s.i */
public final class C1563i {

    /* renamed from: a */
    private static final String f5714a = C1557c.m7461a(C1563i.class);

    /* renamed from: a */
    public static String m7485a(String str) {
        if (str == null) {
            throw new NullPointerException("Provided String must be non-null.");
        } else if (str.length() != 0) {
            return str;
        } else {
            throw new IllegalArgumentException("Provided String must be non-empty.");
        }
    }

    /* renamed from: b */
    public static String m7488b(String str) {
        if (str.trim().equals("")) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    public static String m7489c(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception e) {
            C1557c.m7470c(f5714a, "Failed to calculate MD5 hash", e);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m7490d(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: e */
    public static boolean m7491e(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    public static int m7487b(String str, String str2) {
        return str.split(str2, -1).length - 1;
    }

    /* renamed from: a */
    public static String m7484a(Context context, String str, String str2) {
        String str3 = "null";
        if (str == null) {
            str = str3;
        }
        if (str.equals(str3)) {
            return m7486a("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String str4 = "user_id_key";
        String string = sharedPreferences.getString(str4, null);
        String str5 = "user_id_hash_value";
        if (string != null && string.equals(str)) {
            String string2 = sharedPreferences.getString(str5, null);
            if (!m7491e(string2)) {
                return m7486a(string2, str2);
            }
            C1557c.m7458a(f5714a, "The saved user id hash was null or empty.");
        }
        String str6 = f5714a;
        StringBuilder sb = new StringBuilder();
        sb.append("Generating MD5 for user id: ");
        sb.append(str);
        sb.append(" apiKey: ");
        sb.append(str2);
        C1557c.m7458a(str6, sb.toString());
        String c = m7489c(str);
        if (c == null) {
            c = Integer.toString(str.hashCode());
        }
        Editor edit = sharedPreferences.edit();
        edit.putString(str4, str);
        edit.putString(str5, c);
        edit.apply();
        return m7486a(c, str2);
    }

    /* renamed from: a */
    public static String m7483a(Context context, String str) {
        return m7484a(context, str, null);
    }

    /* renamed from: a */
    private static String m7486a(String str, String str2) {
        String str3 = ".";
        if (m7490d(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        sb2.append(str3);
        sb2.append(str2);
        return sb2.toString();
    }
}
