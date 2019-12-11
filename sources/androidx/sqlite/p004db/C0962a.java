package androidx.sqlite.p004db;

/* renamed from: androidx.sqlite.db.a */
/* compiled from: SimpleSQLiteQuery */
public final class C0962a implements SupportSQLiteQuery {

    /* renamed from: U */
    private final Object[] f3796U;

    /* renamed from: c */
    private final String f3797c;

    public C0962a(String str, Object[] objArr) {
        this.f3797c = str;
        this.f3796U = objArr;
    }

    /* renamed from: a */
    public String mo5234a() {
        return this.f3797c;
    }

    /* renamed from: a */
    public void mo5240a(C0963b bVar) {
        m5212a(bVar, this.f3796U);
    }

    /* renamed from: a */
    public static void m5212a(C0963b bVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m5211a(bVar, i, obj);
            }
        }
    }

    public C0962a(String str) {
        this(str, null);
    }

    /* renamed from: a */
    private static void m5211a(C0963b bVar, int i, Object obj) {
        if (obj == null) {
            bVar.mo5235a(i);
        } else if (obj instanceof byte[]) {
            bVar.mo5239a(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            bVar.mo5236a(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            bVar.mo5236a(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bVar.mo5237a(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            bVar.mo5237a(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            bVar.mo5237a(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            bVar.mo5237a(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            bVar.mo5238a(i, (String) obj);
        } else if (obj instanceof Boolean) {
            bVar.mo5237a(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot bind ");
            sb.append(obj);
            sb.append(" at index ");
            sb.append(i);
            sb.append(" Supported types: null, byte[], float, double, long, int, short, byte,");
            sb.append(" string");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
