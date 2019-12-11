package p551j.p552a.p569r;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: j.a.r.b */
/* compiled from: Util */
public final class C12677b {
    private C12677b() {
    }

    /* renamed from: a */
    public static boolean m39770a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static Map<String, String> m39773b(String str) {
        return m39769a(str, "extras");
    }

    /* renamed from: c */
    public static Set<String> m39774c(String str) {
        if (m39771a(str)) {
            return Collections.emptySet();
        }
        return new HashSet(Arrays.asList(str.split(",")));
    }

    /* renamed from: d */
    public static Map<String, String> m39775d(String str) {
        return m39769a(str, "tags");
    }

    /* renamed from: a */
    public static boolean m39771a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    private static Map<String, String> m39769a(String str, String str2) {
        if (m39771a(str)) {
            return Collections.emptyMap();
        }
        String[] split = str.split(",");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            String[] split2 = str3.split(":");
            if (split2.length == 2) {
                linkedHashMap.put(split2[0], split2[1]);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid ");
                sb.append(str2);
                sb.append(" entry: ");
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static Integer m39766a(String str, Integer num) {
        if (m39771a(str)) {
            return num;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* renamed from: a */
    public static Long m39767a(String str, Long l) {
        if (m39771a(str)) {
            return l;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    /* renamed from: a */
    public static Double m39765a(String str, Double d) {
        if (m39771a(str)) {
            return d;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* renamed from: a */
    public static String m39768a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() > i) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, i - 3));
            sb.append("...");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public static boolean m39772a(Thread thread) {
        try {
            return Runtime.getRuntime().removeShutdownHook(thread);
        } catch (IllegalStateException e) {
            if (e.getMessage().equals("Shutdown in progress")) {
                return false;
            }
            throw e;
        }
    }
}
