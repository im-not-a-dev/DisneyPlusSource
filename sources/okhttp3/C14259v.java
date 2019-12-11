package okhttp3;

import java.io.IOException;

/* renamed from: okhttp3.v */
/* compiled from: Protocol */
public enum C14259v {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: c */
    private final String f31827c;

    private C14259v(String str) {
        this.f31827c = str;
    }

    /* renamed from: a */
    public static C14259v m45485a(String str) throws IOException {
        if (str.equals(HTTP_1_0.f31827c)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f31827c)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.f31827c)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.f31827c)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f31827c)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f31827c)) {
            return QUIC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public String toString() {
        return this.f31827c;
    }
}
