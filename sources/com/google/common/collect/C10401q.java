package com.google.common.collect;

import com.google.common.base.C10374f;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.q */
/* compiled from: RegularImmutableMap */
final class C10401q<K, V> extends C10387h<K, V> {

    /* renamed from: Z */
    static final C10387h<Object, Object> f24707Z = new C10401q(null, new Object[0], 0);

    /* renamed from: W */
    private final transient Object f24708W;

    /* renamed from: X */
    final transient Object[] f24709X;

    /* renamed from: Y */
    private final transient int f24710Y;

    /* renamed from: com.google.common.collect.q$a */
    /* compiled from: RegularImmutableMap */
    static class C10402a<K, V> extends ImmutableSet<Entry<K, V>> {

        /* renamed from: V */
        private final transient C10387h<K, V> f24711V;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public final transient Object[] f24712W;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public final transient int f24713X;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public final transient int f24714Y;

        /* renamed from: com.google.common.collect.q$a$a */
        /* compiled from: RegularImmutableMap */
        class C10403a extends ImmutableList<Entry<K, V>> {
            C10403a() {
            }

            public int size() {
                return C10402a.this.f24714Y;
            }

            public Entry<K, V> get(int i) {
                C10374f.m32808a(i, C10402a.this.f24714Y);
                int i2 = i * 2;
                return new SimpleImmutableEntry(C10402a.this.f24712W[C10402a.this.f24713X + i2], C10402a.this.f24712W[i2 + (C10402a.this.f24713X ^ 1)]);
            }
        }

        C10402a(C10387h<K, V> hVar, Object[] objArr, int i, int i2) {
            this.f24711V = hVar;
            this.f24712W = objArr;
            this.f24713X = i;
            this.f24714Y = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f24711V.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public ImmutableList<Entry<K, V>> mo27140f() {
            return new C10403a();
        }

        public int size() {
            return this.f24714Y;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo27117a(Object[] objArr, int i) {
            return mo27138e().mo27117a(objArr, i);
        }

        public C10410v<Entry<K, V>> iterator() {
            return mo27138e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.q$b */
    /* compiled from: RegularImmutableMap */
    static final class C10404b<K> extends ImmutableSet<K> {

        /* renamed from: V */
        private final transient C10387h<K, ?> f24716V;

        /* renamed from: W */
        private final transient ImmutableList<K> f24717W;

        C10404b(C10387h<K, ?> hVar, ImmutableList<K> immutableList) {
            this.f24716V = hVar;
            this.f24717W = immutableList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo27117a(Object[] objArr, int i) {
            return mo27138e().mo27117a(objArr, i);
        }

        public boolean contains(Object obj) {
            return this.f24716V.get(obj) != null;
        }

        /* renamed from: e */
        public ImmutableList<K> mo27138e() {
            return this.f24717W;
        }

        public int size() {
            return this.f24716V.size();
        }

        public C10410v<K> iterator() {
            return mo27138e().iterator();
        }
    }

    /* renamed from: com.google.common.collect.q$c */
    /* compiled from: RegularImmutableMap */
    static final class C10405c extends ImmutableList<Object> {

        /* renamed from: V */
        private final transient Object[] f24718V;

        /* renamed from: W */
        private final transient int f24719W;

        /* renamed from: X */
        private final transient int f24720X;

        C10405c(Object[] objArr, int i, int i2) {
            this.f24718V = objArr;
            this.f24719W = i;
            this.f24720X = i2;
        }

        public Object get(int i) {
            C10374f.m32808a(i, this.f24720X);
            return this.f24718V[(i * 2) + this.f24719W];
        }

        public int size() {
            return this.f24720X;
        }
    }

    private C10401q(Object obj, Object[] objArr, int i) {
        this.f24708W = obj;
        this.f24709X = objArr;
        this.f24710Y = i;
    }

    /* renamed from: a */
    static <K, V> C10401q<K, V> m32895a(int i, Object[] objArr) {
        if (i == 0) {
            return (C10401q) f24707Z;
        }
        if (i == 1) {
            C10381c.m32851a(objArr[0], objArr[1]);
            return new C10401q<>(null, objArr, 1);
        }
        C10374f.m32815b(i, objArr.length >> 1);
        return new C10401q<>(m32898a(objArr, i, ImmutableSet.m32844f(i), 0), objArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ImmutableSet<K> mo27165b() {
        return new C10404b(this, new C10405c(this.f24709X, 0, this.f24710Y));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C10385g<V> mo27166c() {
        return new C10405c(this.f24709X, 1, this.f24710Y);
    }

    public V get(Object obj) {
        return m32897a(this.f24708W, this.f24709X, this.f24710Y, 0, obj);
    }

    public int size() {
        return this.f24710Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m32898a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto L_0x000e
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            com.google.common.collect.C10381c.m32851a(r10, r9)
            r9 = 0
            return r9
        L_0x000e:
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x0050
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x001b:
            if (r2 >= r10) goto L_0x004f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C10381c.m32851a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C10384f.m32853a(r5)
        L_0x0031:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x003f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x001b
        L_0x003f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x004a
            int r5 = r5 + 1
            goto L_0x0031
        L_0x004a:
            java.lang.IllegalArgumentException r9 = m32896a(r3, r4, r9, r6)
            throw r9
        L_0x004f:
            return r11
        L_0x0050:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L_0x0090
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x005a:
            if (r2 >= r10) goto L_0x008f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.C10381c.m32851a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.C10384f.m32853a(r5)
        L_0x0070:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x005a
        L_0x007f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x008a
            int r5 = r5 + 1
            goto L_0x0070
        L_0x008a:
            java.lang.IllegalArgumentException r9 = m32896a(r3, r4, r9, r6)
            throw r9
        L_0x008f:
            return r11
        L_0x0090:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0095:
            if (r2 >= r10) goto L_0x00c5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            com.google.common.collect.C10381c.m32851a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.C10384f.m32853a(r6)
        L_0x00ab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto L_0x00b5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00b5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00c0
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00c0:
            java.lang.IllegalArgumentException r9 = m32896a(r4, r5, r9, r7)
            throw r9
        L_0x00c5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C10401q.m32898a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: a */
    private static IllegalArgumentException m32896a(Object obj, Object obj2, Object[] objArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Multiple entries with same key: ");
        sb.append(obj);
        String str = "=";
        sb.append(str);
        sb.append(obj2);
        sb.append(" and ");
        sb.append(objArr[i]);
        sb.append(str);
        sb.append(objArr[i ^ 1]);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static Object m32897a(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        Object obj3 = null;
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj2)) {
                obj3 = objArr[i2 ^ 1];
            }
            return obj3;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a = C10384f.m32853a(obj2.hashCode());
                while (true) {
                    int i3 = a & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (objArr[b].equals(obj2)) {
                        return objArr[b ^ 1];
                    }
                    a = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a2 = C10384f.m32853a(obj2.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (objArr[s].equals(obj2)) {
                        return objArr[s ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a3 = C10384f.m32853a(obj2.hashCode());
                while (true) {
                    int i5 = a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (objArr[i6].equals(obj2)) {
                        return objArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ImmutableSet<Entry<K, V>> mo27164a() {
        return new C10402a(this, this.f24709X, 0, this.f24710Y);
    }
}
