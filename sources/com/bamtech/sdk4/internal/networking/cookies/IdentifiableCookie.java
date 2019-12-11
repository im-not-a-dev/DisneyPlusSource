package com.bamtech.sdk4.internal.networking.cookies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/IdentifiableCookie;", "", "cookie", "Lokhttp3/Cookie;", "(Lokhttp3/Cookie;)V", "getCookie", "()Lokhttp3/Cookie;", "equals", "", "other", "hashCode", "", "Companion", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentifiableCookie.kt */
public final class IdentifiableCookie {
    public static final Companion Companion = new Companion(null);
    private final Cookie cookie;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/networking/cookies/IdentifiableCookie$Companion;", "", "()V", "decorateAll", "", "Lcom/bamtech/sdk4/internal/networking/cookies/IdentifiableCookie;", "cookies", "", "Lokhttp3/Cookie;", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: IdentifiableCookie.kt */
    public static final class Companion {
        private Companion() {
        }

        public final List<IdentifiableCookie> decorateAll(Collection<Cookie> collection) {
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) collection, 10));
            for (Cookie identifiableCookie : collection) {
                arrayList.add(new IdentifiableCookie(identifiableCookie));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IdentifiableCookie(Cookie cookie2) {
        this.cookie = cookie2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof IdentifiableCookie)) {
            return false;
        }
        IdentifiableCookie identifiableCookie = (IdentifiableCookie) obj;
        if (Intrinsics.areEqual((Object) identifiableCookie.cookie.mo35733d(), (Object) this.cookie.mo35733d()) && Intrinsics.areEqual((Object) identifiableCookie.cookie.mo35728a(), (Object) this.cookie.mo35728a()) && Intrinsics.areEqual((Object) identifiableCookie.cookie.mo35734e(), (Object) this.cookie.mo35734e()) && identifiableCookie.cookie.mo35737g() == this.cookie.mo35737g() && identifiableCookie.cookie.mo35732c() == this.cookie.mo35732c()) {
            z = true;
        }
        return z;
    }

    public final Cookie getCookie() {
        return this.cookie;
    }

    public int hashCode() {
        return ((((((((527 + this.cookie.mo35733d().hashCode()) * 31) + this.cookie.mo35728a().hashCode()) * 31) + this.cookie.mo35734e().hashCode()) * 31) + (this.cookie.mo35737g() ^ true ? 1 : 0)) * 31) + (this.cookie.mo35732c() ^ true ? 1 : 0);
    }
}
