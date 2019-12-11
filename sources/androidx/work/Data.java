package androidx.work;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class Data {

    /* renamed from: b */
    private static final String f3997b = C1034h.m5551a("Data");

    /* renamed from: c */
    public static final Data f3998c = new C1011a().mo5594a();

    /* renamed from: a */
    Map<String, Object> f3999a;

    /* renamed from: androidx.work.Data$a */
    public static final class C1011a {

        /* renamed from: a */
        private Map<String, Object> f4000a = new HashMap();

        /* renamed from: a */
        public C1011a mo5592a(String str, String str2) {
            this.f4000a.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C1011a mo5590a(Data data) {
            mo5593a(data.f3999a);
            return this;
        }

        /* renamed from: a */
        public C1011a mo5593a(Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                mo5591a((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: a */
        public C1011a mo5591a(String str, Object obj) {
            if (obj == null) {
                this.f4000a.put(str, null);
            } else {
                Class<double[]> cls = obj.getClass();
                if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f4000a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f4000a.put(str, Data.m5452a((boolean[]) obj));
                } else if (cls == int[].class) {
                    this.f4000a.put(str, Data.m5455a((int[]) obj));
                } else if (cls == long[].class) {
                    this.f4000a.put(str, Data.m5456a((long[]) obj));
                } else if (cls == float[].class) {
                    this.f4000a.put(str, Data.m5454a((float[]) obj));
                } else if (cls == double[].class) {
                    this.f4000a.put(str, Data.m5453a((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        /* renamed from: a */
        public Data mo5594a() {
            Data data = new Data(this.f4000a);
            Data.m5451a(data);
            return data;
        }
    }

    Data() {
    }

    /* renamed from: a */
    public long mo5583a(String str, long j) {
        Object obj = this.f3999a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    /* renamed from: b */
    public String[] mo5587b(String str) {
        Object obj = this.f3999a.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        return this.f3999a.equals(((Data) obj).f3999a);
    }

    public int hashCode() {
        return this.f3999a.hashCode() * 31;
    }

    public Data(Data data) {
        this.f3999a = new HashMap(data.f3999a);
    }

    Data(Map<String, ?> map) {
        this.f3999a = new HashMap(map);
    }

    /* renamed from: a */
    public String mo5584a(String str) {
        Object obj = this.f3999a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: b */
    public int mo5586b() {
        return this.f3999a.size();
    }

    /* renamed from: a */
    public Map<String, Object> mo5585a() {
        return Collections.unmodifiableMap(this.f3999a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[SYNTHETIC, Splitter:B:31:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[SYNTHETIC, Splitter:B:41:0x008f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5451a(androidx.work.Data r5) throws java.lang.IllegalStateException {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006c }
            int r2 = r5.mo5586b()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f3999a     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
        L_0x001e:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            goto L_0x001e
        L_0x003b:
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0045
        L_0x003f:
            r5 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r5)
        L_0x0045:
            r1.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r5 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r5)
        L_0x004f:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005c
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0064:
            r5 = move-exception
            goto L_0x008d
        L_0x0066:
            r5 = move-exception
            r2 = r3
            goto L_0x006d
        L_0x0069:
            r5 = move-exception
            r3 = r2
            goto L_0x008d
        L_0x006c:
            r5 = move-exception
        L_0x006d:
            java.lang.String r3 = f3997b     // Catch:{ all -> 0x0069 }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x0069 }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0082
        L_0x007c:
            r2 = move-exception
            java.lang.String r3 = f3997b
            android.util.Log.e(r3, r0, r2)
        L_0x0082:
            r1.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r1)
        L_0x008c:
            return r5
        L_0x008d:
            if (r3 == 0) goto L_0x0099
            r3.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0099
        L_0x0093:
            r2 = move-exception
            java.lang.String r3 = f3997b
            android.util.Log.e(r3, r0, r2)
        L_0x0099:
            r1.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r1 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r1)
        L_0x00a3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.m5451a(androidx.work.Data):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b A[SYNTHETIC, Splitter:B:36:0x006b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:28:0x0058=Splitter:B:28:0x0058} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.Data m5450a(byte[] r7) throws java.lang.IllegalStateException {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x0080
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0043, ClassNotFoundException -> 0x0041, all -> 0x003d }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003b, ClassNotFoundException -> 0x0039 }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f3997b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x0039:
            r7 = move-exception
            goto L_0x0047
        L_0x003b:
            r7 = move-exception
            goto L_0x0047
        L_0x003d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x0069
        L_0x0041:
            r3 = move-exception
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0047:
            java.lang.String r4 = f3997b     // Catch:{ all -> 0x0068 }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r7 = move-exception
            java.lang.String r3 = f3997b
            android.util.Log.e(r3, r0, r7)
        L_0x0058:
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r7 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r7)
        L_0x0062:
            androidx.work.Data r7 = new androidx.work.Data
            r7.<init>(r1)
            return r7
        L_0x0068:
            r7 = move-exception
        L_0x0069:
            if (r3 == 0) goto L_0x0075
            r3.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r1 = move-exception
            java.lang.String r3 = f3997b
            android.util.Log.e(r3, r0, r1)
        L_0x0075:
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007f
        L_0x0079:
            r1 = move-exception
            java.lang.String r2 = f3997b
            android.util.Log.e(r2, r0, r1)
        L_0x007f:
            throw r7
        L_0x0080:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.m5450a(byte[]):androidx.work.Data");
    }

    /* renamed from: a */
    static Boolean[] m5452a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: a */
    static Integer[] m5455a(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: a */
    static Long[] m5456a(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* renamed from: a */
    static Float[] m5454a(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: a */
    static Double[] m5453a(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }
}
