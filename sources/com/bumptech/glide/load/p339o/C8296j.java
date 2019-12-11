package com.bumptech.glide.load.p339o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.o.j */
/* compiled from: LazyHeaders */
public final class C8296j implements C8293h {

    /* renamed from: b */
    private final Map<String, List<C8295i>> f17756b;

    /* renamed from: c */
    private volatile Map<String, String> f17757c;

    /* renamed from: com.bumptech.glide.load.o.j$a */
    /* compiled from: LazyHeaders */
    public static final class C8297a {

        /* renamed from: b */
        private static final String f17758b = m24108b();

        /* renamed from: c */
        private static final Map<String, List<C8295i>> f17759c;

        /* renamed from: a */
        private Map<String, List<C8295i>> f17760a = f17759c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f17758b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C8298b(f17758b)));
            }
            f17759c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m24108b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C8296j mo21472a() {
            return new C8296j(this.f17760a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    /* compiled from: LazyHeaders */
    static final class C8298b implements C8295i {

        /* renamed from: a */
        private final String f17761a;

        C8298b(String str) {
            this.f17761a = str;
        }

        /* renamed from: a */
        public String mo21468a() {
            return this.f17761a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8298b)) {
                return false;
            }
            return this.f17761a.equals(((C8298b) obj).f17761a);
        }

        public int hashCode() {
            return this.f17761a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f17761a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    C8296j(Map<String, List<C8295i>> map) {
        this.f17756b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private Map<String, String> m24106b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f17756b.entrySet()) {
            String a = m24105a((List) entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo21467a() {
        if (this.f17757c == null) {
            synchronized (this) {
                if (this.f17757c == null) {
                    this.f17757c = Collections.unmodifiableMap(m24106b());
                }
            }
        }
        return this.f17757c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8296j)) {
            return false;
        }
        return this.f17756b.equals(((C8296j) obj).f17756b);
    }

    public int hashCode() {
        return this.f17756b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f17756b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private String m24105a(List<C8295i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((C8295i) list.get(i)).mo21468a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
}
