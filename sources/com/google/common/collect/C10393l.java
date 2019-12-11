package com.google.common.collect;

import com.google.common.base.C10368c;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.l */
/* compiled from: Maps */
public final class C10393l {

    /* renamed from: com.google.common.collect.l$a */
    /* compiled from: Maps */
    private enum C10394a implements C10368c<Entry<?, ?>, Object> {
        KEY {
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: a */
    static <V> C10368c<Entry<?, V>, V> m32878a() {
        return C10394a.VALUE;
    }

    /* renamed from: a */
    static boolean m32880a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: a */
    static String m32879a(Map<?, ?> map) {
        StringBuilder a = C10382d.m32852a(map.size());
        a.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
        }
        a.append('}');
        return a.toString();
    }
}
