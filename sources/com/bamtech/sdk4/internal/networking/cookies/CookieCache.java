package com.bamtech.sdk4.internal.networking.cookies;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.p589f0.C12874c;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/CookieCache;", "", "Lokhttp3/Cookie;", "addAll", "", "cookies", "", "clear", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CookieCache.kt */
public interface CookieCache extends Iterable<Cookie>, C12874c {
    void addAll(Collection<Cookie> collection);
}
