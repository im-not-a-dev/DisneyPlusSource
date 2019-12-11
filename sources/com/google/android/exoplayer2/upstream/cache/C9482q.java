package com.google.android.exoplayer2.upstream.cache;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.exoplayer2.upstream.cache.q */
/* compiled from: DefaultContentMetadata */
public final class C9482q implements C9480o {

    /* renamed from: c */
    public static final C9482q f22065c = new C9482q(Collections.emptyMap());

    /* renamed from: a */
    private int f22066a;

    /* renamed from: b */
    private final Map<String, byte[]> f22067b;

    public C9482q() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    public C9482q mo24549a(C9481p pVar) {
        Map a = m29138a(this.f22067b, pVar);
        if (m29141a(this.f22067b, a)) {
            return this;
        }
        return new C9482q(a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9482q.class != obj.getClass()) {
            return false;
        }
        return m29141a(this.f22067b, ((C9482q) obj).f22067b);
    }

    public int hashCode() {
        if (this.f22066a == 0) {
            int i = 0;
            for (Entry entry : this.f22067b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f22066a = i;
        }
        return this.f22066a;
    }

    public C9482q(Map<String, byte[]> map) {
        this.f22067b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public Set<Entry<String, byte[]>> mo24550a() {
        return this.f22067b.entrySet();
    }

    /* renamed from: a */
    public final String mo24543a(String str, String str2) {
        return this.f22067b.containsKey(str) ? new String((byte[]) this.f22067b.get(str), Charset.forName(Utf8Charset.NAME)) : str2;
    }

    /* renamed from: a */
    public final long mo24542a(String str, long j) {
        return this.f22067b.containsKey(str) ? ByteBuffer.wrap((byte[]) this.f22067b.get(str)).getLong() : j;
    }

    /* renamed from: a */
    private static boolean m29141a(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Map<String, byte[]> m29138a(Map<String, byte[]> map, C9481p pVar) {
        HashMap hashMap = new HashMap(map);
        m29139a(hashMap, pVar.mo24548b());
        m29140a(hashMap, pVar.mo24547a());
        return hashMap;
    }

    /* renamed from: a */
    private static void m29139a(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    /* renamed from: a */
    private static void m29140a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            hashMap.put(str, m29142a(map.get(str)));
        }
    }

    /* renamed from: a */
    private static byte[] m29142a(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(Utf8Charset.NAME));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }
}
