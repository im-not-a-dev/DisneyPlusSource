package p602m.p606b.p607a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m.b.a.a */
/* compiled from: JSONArray */
public class C13448a extends ArrayList implements List, C13449b, C13451d {
    /* renamed from: a */
    public static String m41364a(List list) {
        String str = "null";
        if (list == null) {
            return str;
        }
        boolean z = true;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (Object next : list) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            if (next == null) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(C13452e.m41371a(next));
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String mo34701b() {
        return m41364a(this);
    }

    public String toString() {
        return mo34701b();
    }
}
