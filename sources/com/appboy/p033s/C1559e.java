package com.appboy.p033s;

import java.util.Set;

/* renamed from: com.appboy.s.e */
public class C1559e {

    /* renamed from: a */
    private static final String f5709a = C1557c.m7461a(C1559e.class);

    /* renamed from: a */
    public static boolean m7477a(String str, Set<String> set) {
        if (str == null) {
            C1557c.m7473e(f5709a, "Custom attribute key cannot be null.");
            return false;
        } else if (!set.contains(str)) {
            return true;
        } else {
            String str2 = f5709a;
            StringBuilder sb = new StringBuilder();
            sb.append("Custom attribute key cannot be blacklisted attribute: ");
            sb.append(str);
            sb.append(".");
            C1557c.m7473e(str2, sb.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m7476a(String str) {
        if (str != null) {
            return true;
        }
        C1557c.m7473e(f5709a, "Custom attribute value cannot be null.");
        return false;
    }

    /* renamed from: a */
    public static String[] m7478a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = C1564j.m7492a(strArr[i]);
            }
        }
        return strArr;
    }
}
