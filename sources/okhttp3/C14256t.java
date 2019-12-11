package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.t */
/* compiled from: Headers */
public final class C14256t {

    /* renamed from: a */
    private final String[] f31814a;

    /* renamed from: okhttp3.t$a */
    /* compiled from: Headers */
    public static final class C14257a {

        /* renamed from: a */
        final List<String> f31815a = new ArrayList(20);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C14257a mo36253a(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                mo36257b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            String str3 = "";
            if (str.startsWith(str2)) {
                mo36257b(str3, str.substring(1));
                return this;
            }
            mo36257b(str3, str);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C14257a mo36257b(String str, String str2) {
            this.f31815a.add(str);
            this.f31815a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C14257a mo36258c(String str) {
            int i = 0;
            while (i < this.f31815a.size()) {
                if (str.equalsIgnoreCase((String) this.f31815a.get(i))) {
                    this.f31815a.remove(i);
                    this.f31815a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: b */
        public String mo36256b(String str) {
            for (int size = this.f31815a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f31815a.get(size))) {
                    return (String) this.f31815a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: c */
        public C14257a mo36259c(String str, String str2) {
            C14256t.m45466c(str);
            C14256t.m45465a(str2, str);
            mo36258c(str);
            mo36257b(str, str2);
            return this;
        }

        /* renamed from: a */
        public C14257a mo36254a(String str, String str2) {
            C14256t.m45466c(str);
            C14256t.m45465a(str2, str);
            mo36257b(str, str2);
            return this;
        }

        /* renamed from: a */
        public C14256t mo36255a() {
            return new C14256t(this);
        }
    }

    C14256t(C14257a aVar) {
        List<String> list = aVar.f31815a;
        this.f31814a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public String mo36244a(String str) {
        return m45462a(this.f31814a, str);
    }

    /* renamed from: b */
    public int mo36246b() {
        return this.f31814a.length / 2;
    }

    /* renamed from: c */
    public Map<String, List<String>> mo36249c() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int b = mo36246b();
        for (int i = 0; i < b; i++) {
            String lowerCase = mo36243a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(mo36247b(i));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14256t) && Arrays.equals(((C14256t) obj).f31814a, this.f31814a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31814a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = mo36246b();
        for (int i = 0; i < b; i++) {
            sb.append(mo36243a(i));
            sb.append(": ");
            sb.append(mo36247b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo36243a(int i) {
        return this.f31814a[i * 2];
    }

    /* renamed from: b */
    public String mo36247b(int i) {
        return this.f31814a[(i * 2) + 1];
    }

    private C14256t(String[] strArr) {
        this.f31814a = strArr;
    }

    /* renamed from: a */
    public C14257a mo36245a() {
        C14257a aVar = new C14257a();
        Collections.addAll(aVar.f31815a, this.f31814a);
        return aVar;
    }

    /* renamed from: b */
    public List<String> mo36248b(String str) {
        int b = mo36246b();
        ArrayList arrayList = null;
        for (int i = 0; i < b; i++) {
            if (str.equalsIgnoreCase(mo36243a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo36247b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static String m45462a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C14256t m45464a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m45466c(str);
                m45465a(str2, str);
            }
            return new C14256t(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    /* renamed from: c */
    static void m45466c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C14126e.m44817a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public static C14256t m45463a(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                String trim = ((String) entry.getKey()).trim();
                String trim2 = ((String) entry.getValue()).trim();
                m45466c(trim);
                m45465a(trim2, trim);
                strArr[i] = trim;
                strArr[i + 1] = trim2;
                i += 2;
            }
            return new C14256t(strArr);
        }
        throw new NullPointerException("headers == null");
    }

    /* renamed from: a */
    static void m45465a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C14126e.m44817a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }
}
