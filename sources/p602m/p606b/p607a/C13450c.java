package p602m.p606b.p607a;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: m.b.a.c */
/* compiled from: JSONObject */
public class C13450c extends HashMap implements Map, C13449b, C13451d {
    /* renamed from: a */
    public static String m41368a(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        stringBuffer.append('{');
        for (Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            m41367a(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String mo34701b() {
        return m41368a(this);
    }

    public String toString() {
        return mo34701b();
    }

    /* renamed from: a */
    private static String m41367a(String str, Object obj, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (str == null) {
            stringBuffer.append("null");
        } else {
            C13452e.m41373a(str, stringBuffer);
        }
        stringBuffer.append('\"');
        stringBuffer.append(':');
        stringBuffer.append(C13452e.m41371a(obj));
        return stringBuffer.toString();
    }
}
