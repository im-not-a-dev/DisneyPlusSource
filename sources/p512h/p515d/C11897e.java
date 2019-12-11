package p512h.p515d;

/* renamed from: h.d.e */
/* compiled from: Preconditions */
public final class C11897e {
    /* renamed from: a */
    public static <T> T m38129a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m38130a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> T m38131a(T t, String str, Object obj) {
        String str2;
        if (t != null) {
            return t;
        }
        String str3 = "%s";
        if (!str.contains(str3)) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf(str3) == str.lastIndexOf(str3)) {
            if (obj instanceof Class) {
                str2 = ((Class) obj).getCanonicalName();
            } else {
                str2 = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace(str3, str2));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }

    /* renamed from: a */
    public static <T> void m38132a(T t, Class<T> cls) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }
}
