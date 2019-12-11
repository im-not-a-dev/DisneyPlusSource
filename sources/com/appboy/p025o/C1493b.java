package com.appboy.p025o;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.appboy.o.b */
public enum C1493b {
    ADVERTISING,
    ANNOUNCEMENTS,
    NEWS,
    SOCIAL,
    NO_CATEGORY;
    

    /* renamed from: Y */
    private static final Map<String, C1493b> f5411Y = null;

    static {
        f5411Y = new HashMap();
        Iterator it = EnumSet.allOf(C1493b.class).iterator();
        while (it.hasNext()) {
            C1493b bVar = (C1493b) it.next();
            f5411Y.put(bVar.toString(), bVar);
        }
    }

    /* renamed from: a */
    public static C1493b m7138a(String str) {
        return (C1493b) f5411Y.get(str.toUpperCase(Locale.US));
    }

    /* renamed from: a */
    public static EnumSet<C1493b> m7139a() {
        return EnumSet.allOf(C1493b.class);
    }
}
