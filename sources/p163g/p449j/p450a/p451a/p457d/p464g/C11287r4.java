package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.r4 */
public enum C11287r4 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C11342v2.class, C11342v2.class, C11342v2.f26574U),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: c */
    private final Class<?> f26477c;

    private C11287r4(Class<?> cls, Class<?> cls2, Object obj) {
        this.f26477c = cls2;
    }

    /* renamed from: a */
    public final Class<?> mo28869a() {
        return this.f26477c;
    }
}
