package kotlin.p588j0;

import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.j0.w */
/* compiled from: StringsJVM.kt */
class C12832w extends C12831v {
    /* renamed from: a */
    public static /* synthetic */ String m40115a(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m40114a(str, c, c2, z);
    }

    /* renamed from: b */
    public static boolean m40122b(String str, String str2, boolean z) {
        boolean z2;
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            z2 = str.equals(str2);
        } else {
            z2 = str.equalsIgnoreCase(str2);
        }
        return z2;
    }

    /* renamed from: c */
    public static final boolean m40124c(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        return m40119a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: f */
    public static String m40125f(String str) {
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            C12880j.m40222a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            C12880j.m40222a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public static String m40126g(String str) {
        if (!(str.length() > 0) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String lowerCase = substring.toLowerCase();
            C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C12880j.m40222a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final String m40114a(String str, char c, char c2, boolean z) {
        if (!z) {
            String replace = str.replace(c, c2);
            C12880j.m40222a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return C12788p.m39984a(C12833x.m40147a((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40123b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40124c(str, str2, z);
    }

    /* renamed from: a */
    public static /* synthetic */ String m40117a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m40116a(str, str2, str3, z);
    }

    /* renamed from: a */
    public static final String m40116a(String str, String str2, String str3, boolean z) {
        return C12788p.m39984a(C12833x.m40167b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40121a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40120a(str, str2, z);
    }

    /* renamed from: a */
    public static final boolean m40120a(String str, String str2, boolean z) {
        if (!z) {
            return str.endsWith(str2);
        }
        return m40119a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m40118a(java.lang.CharSequence r4) {
        /*
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0039
            kotlin.h0.d r0 = kotlin.p588j0.C12833x.m40165b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x001b
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001b
        L_0x0019:
            r4 = 1
            goto L_0x0037
        L_0x001b:
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0019
            r3 = r0
            kotlin.y.e0 r3 = (kotlin.p590y.C13162e0) r3
            int r3 = r3.mo31079b()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.p588j0.C12798a.m40012a(r3)
            if (r3 != 0) goto L_0x001f
            r4 = 0
        L_0x0037:
            if (r4 == 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p588j0.C12832w.m40118a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static final boolean m40119a(String str, int i, String str2, int i2, int i3, boolean z) {
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: a */
    public static String m40113a(CharSequence charSequence, int i) {
        int i2 = 1;
        if (i >= 0) {
            String str = "";
            if (i == 0) {
                return str;
            }
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return str;
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                C12880j.m40222a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Count 'n' must be non-negative, but was ");
        sb3.append(i);
        sb3.append('.');
        throw new IllegalArgumentException(sb3.toString().toString());
    }
}
