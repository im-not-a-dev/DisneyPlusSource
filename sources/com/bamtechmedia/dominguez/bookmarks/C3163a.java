package com.bamtechmedia.dominguez.bookmarks;

import com.bamtechmedia.dominguez.config.C3524e;

/* renamed from: com.bamtechmedia.dominguez.bookmarks.a */
/* compiled from: BookmarksConfig.kt */
public final class C3163a {

    /* renamed from: a */
    private final C3524e f8109a;

    public C3163a(C3524e eVar) {
        this.f8109a = eVar;
    }

    /* renamed from: a */
    public final long mo12213a() {
        Long a = this.f8109a.mo12716a("bookmarks", "handshakeTTL");
        if (a != null) {
            return a.longValue();
        }
        return 10;
    }
}
