package p163g.p441i.p442a.p443a;

import java.io.IOException;

/* renamed from: g.i.a.a.j */
/* compiled from: JsonProcessingException */
public class C10908j extends IOException {

    /* renamed from: c */
    protected C10905g f25896c;

    protected C10908j(String str, C10905g gVar, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this.f25896c = gVar;
    }

    /* renamed from: a */
    public C10905g mo28077a() {
        return this.f25896c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28078b() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        C10905g a = mo28077a();
        String b = mo28078b();
        if (a == null && b == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (b != null) {
            sb.append(b);
        }
        if (a != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(a.toString());
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMessage());
        return sb.toString();
    }

    protected C10908j(String str, C10905g gVar) {
        this(str, gVar, null);
    }
}
