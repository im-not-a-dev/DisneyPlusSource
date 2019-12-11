package p163g.p164a.p165a;

/* renamed from: g.a.a.e1 */
/* compiled from: VisitorID */
public class C4669e1 {

    /* renamed from: a */
    public final String f11648a;

    /* renamed from: b */
    public String f11649b;

    /* renamed from: c */
    public C4670a f11650c = C4670a.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN;

    /* renamed from: g.a.a.e1$a */
    /* compiled from: VisitorID */
    public enum C4670a {
        VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN(0, "unknown"),
        VISITOR_ID_AUTHENTICATION_STATE_AUTHENTICATED(1, "authenticated"),
        VISITOR_ID_AUTHENTICATION_STATE_LOGGED_OUT(2, "logged_out");
        

        /* renamed from: c */
        private final int f11655c;

        private C4670a(int i, String str) {
            this.f11655c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo16005a() {
            return this.f11655c;
        }
    }

    protected C4669e1(String str, String str2, String str3, C4670a aVar) throws IllegalStateException {
        String b = C4783y0.m16635b(str2);
        if (b == null || b.length() == 0) {
            throw new IllegalStateException("idType must not be null/empty");
        }
        this.f11648a = b;
        this.f11649b = str3;
        this.f11650c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16003a(String str) {
        return this.f11648a.equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo16004b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11648a);
        sb.append(".id");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16002a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11648a);
        sb.append(".as");
        return sb.toString();
    }
}
