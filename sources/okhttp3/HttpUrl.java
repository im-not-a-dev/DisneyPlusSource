package okhttp3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.p688d0.C14126e;
import okio.Buffer;

public final class HttpUrl {

    /* renamed from: j */
    private static final char[] f31200j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f31201a;

    /* renamed from: b */
    private final String f31202b;

    /* renamed from: c */
    private final String f31203c;

    /* renamed from: d */
    final String f31204d;

    /* renamed from: e */
    final int f31205e;

    /* renamed from: f */
    private final List<String> f31206f;

    /* renamed from: g */
    private final List<String> f31207g;

    /* renamed from: h */
    private final String f31208h;

    /* renamed from: i */
    private final String f31209i;

    public static final class Builder {

        /* renamed from: a */
        String f31210a;

        /* renamed from: b */
        String f31211b;

        /* renamed from: c */
        String f31212c;

        /* renamed from: d */
        String f31213d;

        /* renamed from: e */
        int f31214e = -1;

        /* renamed from: f */
        final List<String> f31215f = new ArrayList();

        /* renamed from: g */
        List<String> f31216g;

        /* renamed from: h */
        String f31217h;

        public Builder() {
            String str = "";
            this.f31211b = str;
            this.f31212c = str;
            this.f31215f.add(str);
        }

        /* renamed from: f */
        private boolean m44672f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: g */
        private boolean m44673g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: a */
        public Builder mo35768a(int i) {
            if (i <= 0 || i > 65535) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected port: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f31214e = i;
            return this;
        }

        /* renamed from: b */
        public Builder mo35774b(String str) {
            if (str != null) {
                String a = m44664a(str, 0, str.length());
                if (a != null) {
                    this.f31213d = a;
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: c */
        public Builder mo35776c(String str) {
            if (str != null) {
                this.f31212c = HttpUrl.m44632a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: d */
        public Builder mo35777d(String str) {
            if (str != null) {
                String str2 = "http";
                if (str.equalsIgnoreCase(str2)) {
                    this.f31210a = str2;
                } else {
                    String str3 = "https";
                    if (str.equalsIgnoreCase(str3)) {
                        this.f31210a = str3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected scheme: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: e */
        public Builder mo35778e(String str) {
            if (str != null) {
                this.f31211b = HttpUrl.m44632a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f31210a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f31211b.isEmpty() || !this.f31212c.isEmpty()) {
                sb.append(this.f31211b);
                if (!this.f31212c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f31212c);
                }
                sb.append('@');
            }
            String str2 = this.f31213d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f31213d);
                    sb.append(']');
                } else {
                    sb.append(this.f31213d);
                }
            }
            if (!(this.f31214e == -1 && this.f31210a == null)) {
                int b = mo35773b();
                String str3 = this.f31210a;
                if (str3 == null || b != HttpUrl.m44641c(str3)) {
                    sb.append(':');
                    sb.append(b);
                }
            }
            HttpUrl.m44640b(sb, this.f31215f);
            if (this.f31216g != null) {
                sb.append('?');
                HttpUrl.m44636a(sb, this.f31216g);
            }
            if (this.f31217h != null) {
                sb.append('#');
                sb.append(this.f31217h);
            }
            return sb.toString();
        }

        /* renamed from: f */
        private static int m44671f(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: e */
        private static int m44670e(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: a */
        public Builder mo35769a(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.m44644f(HttpUrl.m44632a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f31216g = list;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Builder mo35775c() {
            int size = this.f31215f.size();
            for (int i = 0; i < size; i++) {
                this.f31215f.set(i, HttpUrl.m44632a((String) this.f31215f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f31216g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = (String) this.f31216g.get(i2);
                    if (str != null) {
                        this.f31216g.set(i2, HttpUrl.m44632a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f31217h;
            if (str2 != null) {
                this.f31217h = HttpUrl.m44632a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo35773b() {
            int i = this.f31214e;
            return i != -1 ? i : HttpUrl.m44641c(this.f31210a);
        }

        /* renamed from: b */
        private static int m44666b(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.m44630a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: a */
        public Builder mo35770a(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f31216g == null) {
                    this.f31216g = new ArrayList();
                }
                this.f31216g.add(HttpUrl.m44632a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                List<String> list = this.f31216g;
                if (str2 != null) {
                    str3 = HttpUrl.m44632a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: d */
        private void m44669d(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f31215f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f31215f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f31215f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.p688d0.C14126e.m44812a(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m44665a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.m44669d(java.lang.String, int, int):void");
        }

        /* renamed from: d */
        private void m44668d() {
            List<String> list = this.f31215f;
            String str = "";
            if (!((String) list.remove(list.size() - 1)).isEmpty() || this.f31215f.isEmpty()) {
                this.f31215f.add(str);
                return;
            }
            List<String> list2 = this.f31215f;
            list2.set(list2.size() - 1, str);
        }

        /* renamed from: a */
        public HttpUrl mo35772a() {
            if (this.f31210a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f31213d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: c */
        private static int m44667c(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Builder mo35771a(HttpUrl httpUrl, String str) {
            int a;
            int i;
            HttpUrl httpUrl2 = httpUrl;
            String str2 = str;
            int b = C14126e.m44839b(str2, 0, str.length());
            int c = C14126e.m44845c(str2, b, str.length());
            int e = m44670e(str2, b, c);
            if (e != -1) {
                if (str.regionMatches(true, b, "https:", 0, 6)) {
                    this.f31210a = "https";
                    b += 6;
                } else {
                    if (str.regionMatches(true, b, "http:", 0, 5)) {
                        this.f31210a = "http";
                        b += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        sb.append(str2.substring(0, e));
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (httpUrl2 != null) {
                this.f31210a = httpUrl2.f31201a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int f = m44671f(str2, b, c);
            char c2 = '?';
            char c3 = '#';
            if (f >= 2 || httpUrl2 == null || !httpUrl2.f31201a.equals(this.f31210a)) {
                int i2 = b + f;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C14126e.m44812a(str2, i2, c, "@/\\?#");
                    char charAt = a != c ? str2.charAt(a) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = a;
                        int c4 = m44667c(str2, i2, i3);
                        int i4 = c4 + 1;
                    } else {
                        if (charAt == '@') {
                            String str3 = "%40";
                            if (!z) {
                                int a2 = C14126e.m44811a(str2, i2, a, ':');
                                int i5 = a2;
                                String str4 = str3;
                                i = a;
                                String a3 = HttpUrl.m44630a(str, i2, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (z2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f31211b);
                                    sb2.append(str4);
                                    sb2.append(a3);
                                    a3 = sb2.toString();
                                }
                                this.f31211b = a3;
                                if (i5 != i) {
                                    this.f31212c = HttpUrl.m44630a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                String str5 = str3;
                                i = a;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f31212c);
                                sb3.append(str5);
                                sb3.append(HttpUrl.m44630a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.f31212c = sb3.toString();
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = a;
                int c42 = m44667c(str2, i2, i32);
                int i42 = c42 + 1;
                if (i42 < i32) {
                    this.f31213d = m44664a(str2, i2, c42);
                    this.f31214e = m44666b(str2, i42, i32);
                    if (this.f31214e == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        sb4.append(str2.substring(i42, i32));
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    this.f31213d = m44664a(str2, i2, c42);
                    this.f31214e = HttpUrl.m44641c(this.f31210a);
                }
                if (this.f31213d != null) {
                    b = i32;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    sb5.append(str2.substring(i2, c42));
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                this.f31211b = httpUrl.mo35754f();
                this.f31212c = httpUrl.mo35748b();
                this.f31213d = httpUrl2.f31204d;
                this.f31214e = httpUrl2.f31205e;
                this.f31215f.clear();
                this.f31215f.addAll(httpUrl.mo35751d());
                if (b == c || str2.charAt(b) == '#') {
                    mo35769a(httpUrl.mo35752e());
                }
            }
            int a4 = C14126e.m44812a(str2, b, c, "?#");
            m44669d(str2, b, a4);
            if (a4 < c && str2.charAt(a4) == '?') {
                int a5 = C14126e.m44811a(str2, a4, c, '#');
                this.f31216g = HttpUrl.m44644f(HttpUrl.m44630a(str, a4 + 1, a5, " \"'<>#", true, false, true, true, null));
                a4 = a5;
            }
            if (a4 < c && str2.charAt(a4) == '#') {
                this.f31217h = HttpUrl.m44630a(str, 1 + a4, c, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: a */
        private void m44665a(String str, int i, int i2, boolean z, boolean z2) {
            String a = HttpUrl.m44630a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!m44672f(a)) {
                if (m44673g(a)) {
                    m44668d();
                    return;
                }
                List<String> list = this.f31215f;
                if (((String) list.get(list.size() - 1)).isEmpty()) {
                    List<String> list2 = this.f31215f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f31215f.add(a);
                }
                if (z) {
                    this.f31215f.add("");
                }
            }
        }

        /* renamed from: a */
        private static String m44664a(String str, int i, int i2) {
            return C14126e.m44815a(HttpUrl.m44631a(str, i, i2, false));
        }
    }

    HttpUrl(Builder builder) {
        this.f31201a = builder.f31210a;
        this.f31202b = m44634a(builder.f31211b, false);
        this.f31203c = m44634a(builder.f31212c, false);
        this.f31204d = builder.f31213d;
        this.f31205e = builder.mo35773b();
        this.f31206f = m44635a(builder.f31215f, false);
        List<String> list = builder.f31216g;
        String str = null;
        this.f31207g = list != null ? m44635a(list, true) : null;
        String str2 = builder.f31217h;
        if (str2 != null) {
            str = m44634a(str2, false);
        }
        this.f31208h = str;
        this.f31209i = builder.toString();
    }

    /* renamed from: a */
    static void m44636a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: c */
    public static int m44641c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: b */
    public String mo35748b() {
        if (this.f31203c.isEmpty()) {
            return "";
        }
        return this.f31209i.substring(this.f31209i.indexOf(58, this.f31201a.length() + 3) + 1, this.f31209i.indexOf(64));
    }

    /* renamed from: d */
    public List<String> mo35751d() {
        int indexOf = this.f31209i.indexOf(47, this.f31201a.length() + 3);
        String str = this.f31209i;
        int a = C14126e.m44812a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C14126e.m44811a(this.f31209i, i, a, '/');
            arrayList.add(this.f31209i.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo35752e() {
        if (this.f31207g == null) {
            return null;
        }
        int indexOf = this.f31209i.indexOf(63) + 1;
        String str = this.f31209i;
        return this.f31209i.substring(indexOf, C14126e.m44811a(str, indexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).f31209i.equals(this.f31209i);
    }

    /* renamed from: f */
    public String mo35754f() {
        if (this.f31202b.isEmpty()) {
            return "";
        }
        int length = this.f31201a.length() + 3;
        String str = this.f31209i;
        return this.f31209i.substring(length, C14126e.m44812a(str, length, str.length(), ":@"));
    }

    /* renamed from: g */
    public String mo35755g() {
        return this.f31204d;
    }

    /* renamed from: h */
    public boolean mo35756h() {
        return this.f31201a.equals("https");
    }

    public int hashCode() {
        return this.f31209i.hashCode();
    }

    /* renamed from: i */
    public Builder mo35758i() {
        Builder builder = new Builder();
        builder.f31210a = this.f31201a;
        builder.f31211b = mo35754f();
        builder.f31212c = mo35748b();
        builder.f31213d = this.f31204d;
        builder.f31214e = this.f31205e != m44641c(this.f31201a) ? this.f31205e : -1;
        builder.f31215f.clear();
        builder.f31215f.addAll(mo35751d());
        builder.mo35769a(mo35752e());
        builder.f31217h = mo35746a();
        return builder;
    }

    /* renamed from: j */
    public List<String> mo35759j() {
        return this.f31206f;
    }

    /* renamed from: k */
    public int mo35760k() {
        return this.f31205e;
    }

    /* renamed from: l */
    public String mo35761l() {
        if (this.f31207g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m44636a(sb, this.f31207g);
        return sb.toString();
    }

    /* renamed from: m */
    public Set<String> mo35762m() {
        if (this.f31207g == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.f31207g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add((String) this.f31207g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: n */
    public String mo35763n() {
        String str = "";
        return mo35747a("/...").mo35778e(str).mo35776c(str).mo35772a().toString();
    }

    /* renamed from: o */
    public String mo35764o() {
        return this.f31201a;
    }

    /* renamed from: p */
    public URI mo35765p() {
        String builder = mo35758i().mo35775c().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: q */
    public URL mo35766q() {
        try {
            return new URL(this.f31209i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f31209i;
    }

    /* renamed from: c */
    public String mo35750c() {
        int indexOf = this.f31209i.indexOf(47, this.f31201a.length() + 3);
        String str = this.f31209i;
        return this.f31209i.substring(indexOf, C14126e.m44812a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: b */
    static void m44640b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: e */
    public static HttpUrl m44643e(String str) {
        try {
            return m44642d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: f */
    static List<String> m44644f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: d */
    public static HttpUrl m44642d(String str) {
        return new Builder().mo35771a((HttpUrl) null, str).mo35772a();
    }

    /* renamed from: a */
    public String mo35746a() {
        if (this.f31208h == null) {
            return null;
        }
        return this.f31209i.substring(this.f31209i.indexOf(35) + 1);
    }

    /* renamed from: b */
    public HttpUrl mo35749b(String str) {
        Builder a = mo35747a(str);
        if (a != null) {
            return a.mo35772a();
        }
        return null;
    }

    /* renamed from: a */
    public Builder mo35747a(String str) {
        try {
            return new Builder().mo35771a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m44634a(String str, boolean z) {
        return m44631a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m44635a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m44634a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m44631a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.m45553a(str, i, i3);
                m44638a(buffer, str, i3, i2, z);
                return buffer.mo36327e0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m44638a(Buffer buffer, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C14126e.m44810a(str.charAt(i + 1));
                    int a2 = C14126e.m44810a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        buffer.writeByte((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    buffer.mo36317c(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                buffer.writeByte(32);
                i += Character.charCount(codePointAt);
            }
            buffer.mo36317c(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m44639a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C14126e.m44810a(str.charAt(i + 1)) == -1 || C14126e.m44810a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m44630a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m44639a(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            Buffer buffer = new Buffer();
            int i5 = i;
            buffer.m45553a(str, i, i4);
            m44637a(buffer, str, i4, i2, str2, z, z2, z3, z4, charset);
            return buffer.mo36327e0();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m44637a(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    buffer.m45552a(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m44639a(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        buffer2.mo36317c(codePointAt);
                    } else {
                        buffer2.mo36303a(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!buffer2.mo36309a0()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f31200j[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f31200j[readByte & 15]);
                    }
                } else {
                    buffer.mo36317c(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m44633a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m44630a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m44632a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m44630a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
