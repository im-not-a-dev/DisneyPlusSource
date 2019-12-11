package com.appboy.p033s;

import android.os.Bundle;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.appboy.s.d */
public class C1558d {
    /* renamed from: a */
    public static Bundle m7475a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }
}
