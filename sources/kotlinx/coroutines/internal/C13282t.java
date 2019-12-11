package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.t */
/* compiled from: SystemProps.common.kt */
final /* synthetic */ class C13282t {
    /* renamed from: a */
    public static final boolean m40834a(String str, boolean z) {
        String a = C13280r.m40826a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    /* renamed from: a */
    public static /* synthetic */ int m40831a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C13280r.m40822a(str, i, i2, i3);
    }

    /* renamed from: a */
    public static final int m40830a(String str, int i, int i2, int i3) {
        return (int) C13280r.m40824a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static /* synthetic */ long m40833a(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C13280r.m40824a(str, j, j4, j3);
    }

    /* renamed from: a */
    public static final long m40832a(String str, long j, long j2, long j3) {
        String a = C13280r.m40826a(str);
        if (a == null) {
            return j;
        }
        Long e = C12831v.m40112e(a);
        String str2 = "System property '";
        if (e != null) {
            long longValue = e.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
