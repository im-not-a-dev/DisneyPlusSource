package p602m.p606b.p607a;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import p602m.p606b.p607a.p608f.C13454b;

/* renamed from: m.b.a.e */
/* compiled from: JSONValue */
public class C13452e {
    /* renamed from: a */
    public static Object m41370a(Reader reader) {
        try {
            return new C13454b().mo34707a(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m41374b(String str) {
        return m41370a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public static String m41371a(Object obj) {
        String str = "null";
        if (obj == null) {
            return str;
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer();
            String str2 = "\"";
            stringBuffer.append(str2);
            stringBuffer.append(m41372a((String) obj));
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            return (d.isInfinite() || d.isNaN()) ? str : obj.toString();
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            return (f.isInfinite() || f.isNaN()) ? str : obj.toString();
        } else if (obj instanceof Number) {
            return obj.toString();
        } else {
            if (obj instanceof Boolean) {
                return obj.toString();
            }
            if (obj instanceof C13449b) {
                return ((C13449b) obj).mo34701b();
            }
            if (obj instanceof Map) {
                return C13450c.m41368a((Map) obj);
            }
            if (obj instanceof List) {
                return C13448a.m41364a((List) obj);
            }
            return obj.toString();
        }
    }

    /* renamed from: a */
    public static String m41372a(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        m41373a(str, stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m41373a(String str, StringBuffer stringBuffer) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                stringBuffer.append("\\f");
            } else if (charAt == 13) {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        stringBuffer.append("\\b");
                        break;
                    case 9:
                        stringBuffer.append("\\t");
                        break;
                    case 10:
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase());
                            break;
                        } else {
                            stringBuffer.append(charAt);
                            break;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
    }
}
