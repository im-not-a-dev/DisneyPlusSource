package p520io.sentry.event.p550f;

import java.io.Serializable;

/* renamed from: io.sentry.event.f.c */
/* compiled from: ExceptionMechanism */
public final class C12577c implements Serializable {

    /* renamed from: U */
    private final boolean f29139U;

    /* renamed from: c */
    private final String f29140c;

    public C12577c(String str, boolean z) {
        this.f29140c = str;
        this.f29139U = z;
    }

    /* renamed from: a */
    public String mo30775a() {
        return this.f29140c;
    }

    /* renamed from: b */
    public boolean mo30776b() {
        return this.f29139U;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12577c.class != obj.getClass()) {
            return false;
        }
        C12577c cVar = (C12577c) obj;
        String str = this.f29140c;
        if (str == null ? cVar.f29140c != null : !str.equals(cVar.f29140c)) {
            return false;
        }
        if (this.f29139U != cVar.f29139U) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f29140c;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f29139U ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExceptionMechanism{type='");
        sb.append(this.f29140c);
        sb.append('\'');
        sb.append(", handled=");
        sb.append(this.f29139U);
        sb.append('}');
        return sb.toString();
    }
}
