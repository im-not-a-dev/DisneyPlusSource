package com.bamtechmedia.dominguez.detail.common.p225b0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bamtechmedia.dominguez.detail.common.b0.b */
/* compiled from: DetailAnalytics.kt */
public final class C5907b {
    /* renamed from: a */
    public static final Map<String, String> m18991a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (map.containsKey("contentId") || map.containsKey("mediaId")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
