package com.bamtech.sdk4.internal.networking.cookies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/PersistentCookieJar;", "Lcom/bamtech/sdk4/internal/networking/cookies/ClearableCookieJar;", "cache", "Lcom/bamtech/sdk4/internal/networking/cookies/CookieCache;", "persistor", "Lcom/bamtech/sdk4/internal/networking/cookies/CookiePersistor;", "(Lcom/bamtech/sdk4/internal/networking/cookies/CookieCache;Lcom/bamtech/sdk4/internal/networking/cookies/CookiePersistor;)V", "clear", "", "clearSession", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "cookies", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PersistentCookieJar.kt */
public final class PersistentCookieJar implements ClearableCookieJar {
    private final CookieCache cache;
    private final CookiePersistor persistor;

    public PersistentCookieJar(CookieCache cookieCache, CookiePersistor cookiePersistor) {
        this.cache = cookieCache;
        this.persistor = cookiePersistor;
        this.cache.addAll(this.persistor.loadAll());
    }

    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        Iterator it = this.cache.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (new DateTime(cookie.mo35731b()).isBeforeNow()) {
                arrayList2.add(cookie);
                it.remove();
            } else if (cookie.mo35730a(httpUrl)) {
                arrayList.add(cookie);
            }
        }
        this.persistor.removeAll(arrayList2);
        return arrayList;
    }

    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.cache.addAll(list);
        CookiePersistor cookiePersistor = this.persistor;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Cookie) next).mo35736f()) {
                arrayList.add(next);
            }
        }
        cookiePersistor.saveAll(arrayList);
    }
}
