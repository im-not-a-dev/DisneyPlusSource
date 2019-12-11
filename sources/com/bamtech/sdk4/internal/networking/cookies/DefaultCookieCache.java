package com.bamtech.sdk4.internal.networking.cookies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/DefaultCookieCache;", "Lcom/bamtech/sdk4/internal/networking/cookies/CookieCache;", "()V", "cookies", "", "Lcom/bamtech/sdk4/internal/networking/cookies/IdentifiableCookie;", "addAll", "", "", "Lokhttp3/Cookie;", "clear", "iterator", "", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultCookieCache.kt */
public final class DefaultCookieCache implements CookieCache {
    private final Set<IdentifiableCookie> cookies = new HashSet();

    public void addAll(Collection<Cookie> collection) {
        for (IdentifiableCookie identifiableCookie : IdentifiableCookie.Companion.decorateAll(collection)) {
            this.cookies.remove(identifiableCookie);
            this.cookies.add(identifiableCookie);
        }
    }

    public Iterator<Cookie> iterator() {
        Set<IdentifiableCookie> set = this.cookies;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (IdentifiableCookie cookie : set) {
            arrayList.add(cookie.getCookie());
        }
        return C13199w.m40574c((Collection) arrayList).iterator();
    }
}
