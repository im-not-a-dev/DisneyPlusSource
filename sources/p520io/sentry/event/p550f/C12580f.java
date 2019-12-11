package p520io.sentry.event.p550f;

import java.util.List;
import java.util.Objects;

/* renamed from: io.sentry.event.f.f */
/* compiled from: MessageInterface */
public class C12580f implements C12582h {

    /* renamed from: U */
    private final List<String> f29161U;

    /* renamed from: V */
    private final String f29162V;

    /* renamed from: c */
    private final String f29163c;

    /* renamed from: Z */
    public String mo30763Z() {
        return "sentry.interfaces.Message";
    }

    /* renamed from: a */
    public String mo30803a() {
        return this.f29162V;
    }

    /* renamed from: b */
    public String mo30804b() {
        return this.f29163c;
    }

    /* renamed from: c */
    public List<String> mo30805c() {
        return this.f29161U;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12580f.class != obj.getClass()) {
            return false;
        }
        C12580f fVar = (C12580f) obj;
        if (!Objects.equals(this.f29163c, fVar.f29163c) || !Objects.equals(this.f29161U, fVar.f29161U) || !Objects.equals(this.f29162V, fVar.f29162V)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f29163c, this.f29161U, this.f29162V});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageInterface{message='");
        sb.append(this.f29163c);
        sb.append('\'');
        sb.append(", parameters=");
        sb.append(this.f29161U);
        sb.append(", formatted=");
        sb.append(this.f29162V);
        sb.append('}');
        return sb.toString();
    }
}
