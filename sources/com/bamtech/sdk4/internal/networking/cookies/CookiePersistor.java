package com.bamtech.sdk4.internal.networking.cookies;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/CookiePersistor;", "", "clear", "", "createCookieKey", "", "cookie", "Lokhttp3/Cookie;", "loadAll", "", "removeAll", "cookies", "", "saveAll", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CookiePersistor.kt */
public interface CookiePersistor {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: CookiePersistor.kt */
    public static final class DefaultImpls {
        public static String createCookieKey(CookiePersistor cookiePersistor, Cookie cookie) {
            StringBuilder sb = new StringBuilder();
            sb.append(cookie.mo35737g() ? "https" : "http");
            sb.append("://");
            sb.append(cookie.mo35728a());
            sb.append(cookie.mo35734e());
            sb.append("|");
            sb.append(cookie.mo35733d());
            return sb.toString();
        }
    }

    List<Cookie> loadAll();

    void removeAll(Collection<Cookie> collection);

    void saveAll(Collection<Cookie> collection);
}
