package p520io.sentry.event;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.sentry.event.a */
/* compiled from: Breadcrumb */
public class C12559a implements Serializable {

    /* renamed from: U */
    private final Date f29099U;

    /* renamed from: V */
    private final C12560a f29100V;

    /* renamed from: W */
    private final String f29101W;

    /* renamed from: X */
    private final String f29102X;

    /* renamed from: Y */
    private final Map<String, String> f29103Y;

    /* renamed from: c */
    private final C12561b f29104c;

    /* renamed from: io.sentry.event.a$a */
    /* compiled from: Breadcrumb */
    public enum C12560a {
        DEBUG("debug"),
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");
        

        /* renamed from: c */
        private final String f29111c;

        private C12560a(String str) {
            this.f29111c = str;
        }

        /* renamed from: a */
        public String mo30735a() {
            return this.f29111c;
        }
    }

    /* renamed from: io.sentry.event.a$b */
    /* compiled from: Breadcrumb */
    public enum C12561b {
        DEFAULT("default"),
        HTTP("http"),
        NAVIGATION("navigation"),
        USER("user");
        

        /* renamed from: c */
        private final String f29117c;

        private C12561b(String str) {
            this.f29117c = str;
        }

        /* renamed from: a */
        public String mo30736a() {
            return this.f29117c;
        }
    }

    /* renamed from: a */
    public String mo30727a() {
        return this.f29102X;
    }

    /* renamed from: b */
    public Map<String, String> mo30728b() {
        return this.f29103Y;
    }

    /* renamed from: c */
    public C12560a mo30729c() {
        return this.f29100V;
    }

    /* renamed from: d */
    public String mo30730d() {
        return this.f29101W;
    }

    /* renamed from: e */
    public Date mo30731e() {
        return this.f29099U;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C12559a.class != obj.getClass()) {
            return false;
        }
        C12559a aVar = (C12559a) obj;
        if (this.f29104c != aVar.f29104c || !Objects.equals(this.f29099U, aVar.f29099U) || this.f29100V != aVar.f29100V || !Objects.equals(this.f29101W, aVar.f29101W) || !Objects.equals(this.f29102X, aVar.f29102X) || !Objects.equals(this.f29103Y, aVar.f29103Y)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public C12561b mo30733f() {
        return this.f29104c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f29104c, this.f29099U, this.f29100V, this.f29101W, this.f29102X, this.f29103Y});
    }
}
