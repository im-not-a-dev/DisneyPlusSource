package p520io.sentry.event;

import java.io.Serializable;
import java.util.Set;

/* renamed from: io.sentry.event.c */
/* compiled from: Sdk */
public class C12566c implements Serializable {

    /* renamed from: U */
    private String f29130U;

    /* renamed from: V */
    private Set<String> f29131V;

    /* renamed from: c */
    private String f29132c;

    public C12566c(String str, String str2, Set<String> set) {
        this.f29132c = str;
        this.f29130U = str2;
        this.f29131V = set;
    }

    /* renamed from: a */
    public Set<String> mo30756a() {
        return this.f29131V;
    }

    /* renamed from: b */
    public String mo30757b() {
        return this.f29132c;
    }

    /* renamed from: c */
    public String mo30758c() {
        return this.f29130U;
    }
}
