package okhttp3.p688d0.p691i;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C14259v;

/* renamed from: okhttp3.d0.i.k */
/* compiled from: StatusLine */
public final class C14169k {

    /* renamed from: a */
    public final C14259v f31504a;

    /* renamed from: b */
    public final int f31505b;

    /* renamed from: c */
    public final String f31506c;

    public C14169k(C14259v vVar, int i, String str) {
        this.f31504a = vVar;
        this.f31505b = i;
        this.f31506c = str;
    }

    /* renamed from: a */
    public static C14169k m45050a(String str) throws IOException {
        C14259v vVar;
        String str2;
        int i = 9;
        String str3 = "Unexpected status line: ";
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new ProtocolException(sb.toString());
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                vVar = C14259v.HTTP_1_0;
            } else if (charAt == 1) {
                vVar = C14259v.HTTP_1_1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str);
                throw new ProtocolException(sb2.toString());
            }
        } else if (str.startsWith("ICY ")) {
            vVar = C14259v.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            throw new ProtocolException(sb3.toString());
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(str);
                    throw new ProtocolException(sb4.toString());
                }
                return new C14169k(vVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str);
                throw new ProtocolException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(str);
            throw new ProtocolException(sb6.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31504a == C14259v.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f31505b);
        if (this.f31506c != null) {
            sb.append(' ');
            sb.append(this.f31506c);
        }
        return sb.toString();
    }
}
