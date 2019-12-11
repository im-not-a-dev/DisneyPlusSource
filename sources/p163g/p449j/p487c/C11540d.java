package p163g.p449j.p487c;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: g.j.c.d */
/* compiled from: FieldNamingPolicy */
public enum C11540d implements C11546e {
    IDENTITY {
        /* renamed from: a */
        public String mo29506a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo29506a(Field field) {
            return C11540d.m37239a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo29506a(Field field) {
            return C11540d.m37239a(C11540d.m37240a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo29506a(Field field) {
            return C11540d.m37240a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo29506a(Field field) {
            return C11540d.m37240a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m37240a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m37239a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m37238a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m37238a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str.substring(i));
        return sb.toString();
    }
}
