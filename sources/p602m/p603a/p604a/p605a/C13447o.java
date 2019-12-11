package p602m.p603a.p604a.p605a;

/* renamed from: m.a.a.a.o */
/* compiled from: Util */
class C13447o {
    /* renamed from: a */
    static String m41362a(String str) {
        String str2 = "\"";
        if (str.startsWith(str2)) {
            str = str.substring(1, str.length());
        }
        return str.endsWith(str2) ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: b */
    static String m41363b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        if (str.startsWith("-")) {
            str = str.substring(1, str.length());
        }
        return str;
    }
}
