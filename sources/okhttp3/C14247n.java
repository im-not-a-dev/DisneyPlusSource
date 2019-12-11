package okhttp3;

import java.util.Collections;
import java.util.List;

/* renamed from: okhttp3.n */
/* compiled from: CookieJar */
public interface C14247n {

    /* renamed from: a */
    public static final C14247n f31800a = new C14248a();

    /* renamed from: okhttp3.n$a */
    /* compiled from: CookieJar */
    class C14248a implements C14247n {
        C14248a() {
        }

        public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }

        public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
