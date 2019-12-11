package p551j.p552a.p565o.p566b;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import p163g.p441i.p442a.p443a.C10903f;
import p520io.sentry.event.p550f.C12583i;
import p520io.sentry.event.p550f.C12584j;

/* renamed from: j.a.o.b.h */
/* compiled from: StackTraceInterfaceBinding */
public class C12671h implements C12665d<C12584j> {

    /* renamed from: c */
    private static final Pattern f29364c = Pattern.compile("\\$+(?:(?:(?:FastClass|Enhancer)[a-zA-Z]*CGLIB)|(?:HibernateProxy))\\$+");

    /* renamed from: a */
    private Collection<String> f29365a = Collections.emptyList();

    /* renamed from: b */
    private boolean f29366b = true;

    /* renamed from: a */
    private void m39751a(C10903f fVar, C12583i iVar, boolean z) throws IOException {
        fVar.mo28060f();
        fVar.mo28045a("filename", iVar.mo30819c());
        fVar.mo28045a("module", iVar.mo30824g());
        fVar.mo28046a("in_app", (!this.f29366b || !z) && m39752a(iVar));
        fVar.mo28045a("function", iVar.mo30820d());
        fVar.mo28042a("lineno", iVar.mo30821e());
        if (iVar.mo30818b() != null) {
            fVar.mo28042a("colno", iVar.mo30818b().intValue());
        }
        if (iVar.mo30825h() != null) {
            fVar.mo28045a("platform", iVar.mo30825h());
        }
        if (iVar.mo30817a() != null) {
            fVar.mo28045a("abs_path", iVar.mo30817a());
        }
        if (iVar.mo30823f() != null && !iVar.mo30823f().isEmpty()) {
            fVar.mo28065i("vars");
            for (Entry entry : iVar.mo30823f().entrySet()) {
                fVar.mo28063g((String) entry.getKey());
                fVar.mo28054b(entry.getValue());
            }
            fVar.mo28055c();
        }
        fVar.mo28055c();
    }

    /* renamed from: a */
    private boolean m39752a(C12583i iVar) {
        String g = iVar.mo30824g();
        if (m39753a(g)) {
            return false;
        }
        for (String startsWith : this.f29365a) {
            if (g.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m39753a(String str) {
        return (str.contains("CGLIB") || str.contains("Hibernate")) && f29364c.matcher(str).find();
    }

    /* renamed from: a */
    public void mo30988a(C10903f fVar, C12584j jVar) throws IOException {
        fVar.mo28060f();
        fVar.mo28061f("frames");
        C12583i[] b = jVar.mo30829b();
        int a = jVar.mo30828a();
        int length = b.length - 1;
        while (length >= 0) {
            int i = a - 1;
            m39751a(fVar, b[length], a > 0);
            length--;
            a = i;
        }
        fVar.mo28052b();
        fVar.mo28055c();
    }

    /* renamed from: a */
    public void mo30999a(boolean z) {
        this.f29366b = z;
    }

    /* renamed from: a */
    public void mo30998a(Collection<String> collection) {
        this.f29365a = collection;
    }
}
