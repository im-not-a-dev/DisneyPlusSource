package p163g.p441i.p442a.p443a;

/* renamed from: g.i.a.a.i */
/* compiled from: JsonParser */
public enum C10907i {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(true);
    

    /* renamed from: U */
    private final int f25894U;

    /* renamed from: c */
    private final boolean f25895c;

    private C10907i(boolean z) {
        this.f25894U = 1 << ordinal();
        this.f25895c = z;
    }

    /* renamed from: c */
    public static int m34417c() {
        C10907i[] values;
        int i = 0;
        for (C10907i iVar : values()) {
            if (iVar.mo28075a()) {
                i |= iVar.mo28076b();
            }
        }
        return i;
    }

    /* renamed from: a */
    public boolean mo28075a() {
        return this.f25895c;
    }

    /* renamed from: b */
    public int mo28076b() {
        return this.f25894U;
    }
}
