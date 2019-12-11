package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: okhttp3.u */
/* compiled from: MediaType */
public final class C14258u {

    /* renamed from: c */
    private static final Pattern f31816c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    private static final Pattern f31817d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f31818a;

    /* renamed from: b */
    private final String f31819b;

    private C14258u(String str, String str2, String str3, String str4) {
        this.f31818a = str;
        this.f31819b = str4;
    }

    /* renamed from: a */
    public static C14258u m45481a(String str) {
        Matcher matcher = f31816c.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f31817d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                String str3 = "\" for: \"";
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 != null) {
                            String str4 = "'";
                            if (group2.startsWith(str4) && group2.endsWith(str4) && group2.length() > 2) {
                                group2 = group2.substring(1, group2.length() - 1);
                            }
                        } else {
                            group2 = matcher2.group(3);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group2);
                            sb.append(str3);
                            sb.append(str);
                            sb.append('\"');
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append(str3);
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new C14258u(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No subtype found for: \"");
        sb3.append(str);
        sb3.append('\"');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: b */
    public static C14258u m45482b(String str) {
        try {
            return m45481a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14258u) && ((C14258u) obj).f31818a.equals(this.f31818a);
    }

    public int hashCode() {
        return this.f31818a.hashCode();
    }

    public String toString() {
        return this.f31818a;
    }

    /* renamed from: a */
    public Charset mo36260a() {
        return mo36261a((Charset) null);
    }

    /* renamed from: a */
    public Charset mo36261a(Charset charset) {
        try {
            return this.f31819b != null ? Charset.forName(this.f31819b) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
