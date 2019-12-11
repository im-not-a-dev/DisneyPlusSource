package com.bamtech.shadow.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.bamtech.shadow.gson.d */
/* compiled from: FieldNamingPolicy */
public enum C2123d implements C2129e {
    IDENTITY {
        /* renamed from: a */
        public String mo11092a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo11092a(Field field) {
            return C2123d.m8259a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo11092a(Field field) {
            return C2123d.m8259a(C2123d.m8260a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo11092a(Field field) {
            return C2123d.m8260a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo11092a(Field field) {
            return C2123d.m8260a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m8260a(String str, String str2) {
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
    static String m8259a(String str) {
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
        sb.append(m8258a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m8258a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str.substring(i));
        return sb.toString();
    }
}
