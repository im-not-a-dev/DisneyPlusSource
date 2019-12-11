package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p691i.C14161d;

public final class Cookie {

    /* renamed from: j */
    private static final Pattern f31181j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f31182k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f31183l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f31184m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f31185a;

    /* renamed from: b */
    private final String f31186b;

    /* renamed from: c */
    private final long f31187c;

    /* renamed from: d */
    private final String f31188d;

    /* renamed from: e */
    private final String f31189e;

    /* renamed from: f */
    private final boolean f31190f;

    /* renamed from: g */
    private final boolean f31191g;

    /* renamed from: h */
    private final boolean f31192h;

    /* renamed from: i */
    private final boolean f31193i;

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31185a = str;
        this.f31186b = str2;
        this.f31187c = j;
        this.f31188d = str3;
        this.f31189e = str4;
        this.f31190f = z;
        this.f31191g = z2;
        this.f31193i = z3;
        this.f31192h = z4;
    }

    /* renamed from: a */
    public String mo35728a() {
        return this.f31188d;
    }

    /* renamed from: b */
    public long mo35731b() {
        return this.f31187c;
    }

    /* renamed from: c */
    public boolean mo35732c() {
        return this.f31193i;
    }

    /* renamed from: d */
    public String mo35733d() {
        return this.f31185a;
    }

    /* renamed from: e */
    public String mo35734e() {
        return this.f31189e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.f31185a.equals(this.f31185a) && cookie.f31186b.equals(this.f31186b) && cookie.f31188d.equals(this.f31188d) && cookie.f31189e.equals(this.f31189e) && cookie.f31187c == this.f31187c && cookie.f31190f == this.f31190f && cookie.f31191g == this.f31191g && cookie.f31192h == this.f31192h && cookie.f31193i == this.f31193i) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo35736f() {
        return this.f31192h;
    }

    /* renamed from: g */
    public boolean mo35737g() {
        return this.f31190f;
    }

    /* renamed from: h */
    public String mo35738h() {
        return this.f31186b;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f31185a.hashCode()) * 31) + this.f31186b.hashCode()) * 31) + this.f31188d.hashCode()) * 31) + this.f31189e.hashCode()) * 31;
        long j = this.f31187c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.f31190f ^ true ? 1 : 0)) * 31) + (this.f31191g ^ true ? 1 : 0)) * 31) + (this.f31192h ^ true ? 1 : 0)) * 31) + (this.f31193i ^ true ? 1 : 0);
    }

    public String toString() {
        return mo35729a(false);
    }

    /* renamed from: b */
    private static boolean m44613b(HttpUrl httpUrl, String str) {
        String c = httpUrl.mo35750c();
        if (c.equals(str)) {
            return true;
        }
        if (!c.startsWith(str) || (!str.endsWith("/") && c.charAt(str.length()) != '/')) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo35730a(HttpUrl httpUrl) {
        boolean z;
        if (this.f31193i) {
            z = httpUrl.mo35755g().equals(this.f31188d);
        } else {
            z = m44611a(httpUrl.mo35755g(), this.f31188d);
        }
        if (!z || !m44613b(httpUrl, this.f31189e)) {
            return false;
        }
        if (!this.f31190f || httpUrl.mo35756h()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m44611a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C14126e.m44847d(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static long m44612b(String str) {
        long j = Long.MIN_VALUE;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                j = parseLong;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (!str.startsWith("-")) {
                    j = Long.MAX_VALUE;
                }
                return j;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static Cookie m44610a(HttpUrl httpUrl, String str) {
        return m44609a(System.currentTimeMillis(), httpUrl, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0131  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static okhttp3.Cookie m44609a(long r24, okhttp3.HttpUrl r26, java.lang.String r27) {
        /*
            r0 = r27
            int r1 = r27.length()
            r2 = 59
            r3 = 0
            int r4 = okhttp3.p688d0.C14126e.m44811a(r0, r3, r1, r2)
            r5 = 61
            int r6 = okhttp3.p688d0.C14126e.m44811a(r0, r3, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = okhttp3.p688d0.C14126e.m44846d(r0, r3, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0146
            int r8 = okhttp3.p688d0.C14126e.m44844c(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0146
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = okhttp3.p688d0.C14126e.m44846d(r0, r6, r4)
            int r11 = okhttp3.p688d0.C14126e.m44844c(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r19 = r8
            r14 = r10
            r21 = r12
            r17 = 0
            r18 = 0
            r20 = 1
            r23 = 0
        L_0x004d:
            if (r4 >= r1) goto L_0x00c1
            int r7 = okhttp3.p688d0.C14126e.m44811a(r0, r4, r1, r2)
            int r2 = okhttp3.p688d0.C14126e.m44811a(r0, r4, r7, r5)
            java.lang.String r4 = okhttp3.p688d0.C14126e.m44846d(r0, r4, r2)
            if (r2 >= r7) goto L_0x0064
            int r2 = r2 + 1
            java.lang.String r2 = okhttp3.p688d0.C14126e.m44846d(r0, r2, r7)
            goto L_0x0066
        L_0x0064:
            java.lang.String r2 = ""
        L_0x0066:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0079
            int r4 = r2.length()     // Catch:{ IllegalArgumentException -> 0x00b9 }
            long r4 = m44606a(r2, r3, r4)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            r21 = r4
            goto L_0x0086
        L_0x0079:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0089
            long r4 = m44612b(r2)     // Catch:{  }
            r14 = r4
        L_0x0086:
            r23 = 1
            goto L_0x00b9
        L_0x0089:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0099
            java.lang.String r2 = m44607a(r2)     // Catch:{ IllegalArgumentException -> 0x00b9 }
            r8 = r2
            r20 = 0
            goto L_0x00b9
        L_0x0099:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00a4
            r19 = r2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r2 = "secure"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00af
            r17 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r2 = "httponly"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00b9
            r18 = 1
        L_0x00b9:
            int r4 = r7 + 1
            r2 = 59
            r5 = 61
            r7 = 0
            goto L_0x004d
        L_0x00c1:
            r0 = -9223372036854775808
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00c9
        L_0x00c7:
            r11 = r0
            goto L_0x00ee
        L_0x00c9:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00db
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            goto L_0x00e0
        L_0x00db:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00e0:
            long r0 = r24 + r14
            int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r2 < 0) goto L_0x00ea
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c7
        L_0x00ea:
            r11 = r12
            goto L_0x00ee
        L_0x00ec:
            r11 = r21
        L_0x00ee:
            java.lang.String r0 = r26.mo35755g()
            if (r8 != 0) goto L_0x00f7
            r13 = r0
            r1 = 0
            goto L_0x0101
        L_0x00f7:
            boolean r1 = m44611a(r0, r8)
            if (r1 != 0) goto L_0x00ff
            r1 = 0
            return r1
        L_0x00ff:
            r1 = 0
            r13 = r8
        L_0x0101:
            int r0 = r0.length()
            int r2 = r13.length()
            if (r0 == r2) goto L_0x0116
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m45387a()
            java.lang.String r0 = r0.mo36188a(r13)
            if (r0 != 0) goto L_0x0116
            return r1
        L_0x0116:
            java.lang.String r0 = "/"
            r7 = r19
            if (r7 == 0) goto L_0x0125
            boolean r1 = r7.startsWith(r0)
            if (r1 != 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r14 = r7
            goto L_0x0136
        L_0x0125:
            java.lang.String r1 = r26.mo35750c()
            r2 = 47
            int r2 = r1.lastIndexOf(r2)
            if (r2 == 0) goto L_0x0135
            java.lang.String r0 = r1.substring(r3, r2)
        L_0x0135:
            r14 = r0
        L_0x0136:
            okhttp3.Cookie r0 = new okhttp3.Cookie
            r8 = r0
            r10 = r6
            r15 = r17
            r16 = r18
            r17 = r20
            r18 = r23
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0146:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.m44609a(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
    }

    /* renamed from: a */
    private static long m44606a(String str, int i, int i2) {
        int a = m44605a(str, i, i2, false);
        Matcher matcher = f31184m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m44605a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f31184m).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
                i7 = parseInt2;
                i4 = parseInt;
            } else if (i5 == -1 && matcher.usePattern(f31183l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(f31182k).matches()) {
                i6 = f31182k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(f31181j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a = m44605a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C14126e.f31337h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: a */
    private static int m44605a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static String m44607a(String str) {
        String str2 = ".";
        if (!str.endsWith(str2)) {
            if (str.startsWith(str2)) {
                str = str.substring(1);
            }
            String a = C14126e.m44815a(str);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static List<Cookie> m44608a(HttpUrl httpUrl, C14256t tVar) {
        List b = tVar.mo36248b("Set-Cookie");
        int size = b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Cookie a = m44610a(httpUrl, (String) b.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo35729a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31185a);
        sb.append('=');
        sb.append(this.f31186b);
        if (this.f31192h) {
            if (this.f31187c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C14161d.m45008a(new Date(this.f31187c)));
            }
        }
        if (!this.f31193i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f31188d);
        }
        sb.append("; path=");
        sb.append(this.f31189e);
        if (this.f31190f) {
            sb.append("; secure");
        }
        if (this.f31191g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
