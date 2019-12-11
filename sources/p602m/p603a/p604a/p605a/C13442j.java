package p602m.p603a.p604a.p605a;

/* renamed from: m.a.a.a.j */
/* compiled from: OptionValidator */
class C13442j {
    /* renamed from: a */
    static void m41343a(String str) throws IllegalArgumentException {
        if (str != null) {
            String str2 = "'";
            int i = 0;
            if (str.length() == 1) {
                char charAt = str.charAt(0);
                if (!m41345b(charAt)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("illegal option value '");
                    stringBuffer.append(charAt);
                    stringBuffer.append(str2);
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            } else {
                char[] charArray = str.toCharArray();
                while (i < charArray.length) {
                    if (m41344a(charArray[i])) {
                        i++;
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("opt contains illegal character value '");
                        stringBuffer2.append(charArray[i]);
                        stringBuffer2.append(str2);
                        throw new IllegalArgumentException(stringBuffer2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m41345b(char c) {
        return m41344a(c) || c == ' ' || c == '?' || c == '@';
    }

    /* renamed from: a */
    private static boolean m41344a(char c) {
        return Character.isJavaIdentifierPart(c);
    }
}
