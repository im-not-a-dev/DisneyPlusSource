package p163g.p449j.p482b.p486h;

import com.google.firebase.components.C10429d;
import com.google.firebase.components.C10429d.C10431b;
import com.google.firebase.components.C10432e;
import com.google.firebase.components.C10447n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: g.j.b.h.c */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C11527c implements C11531g {

    /* renamed from: a */
    private final String f26940a;

    /* renamed from: b */
    private final C11528d f26941b;

    C11527c(Set<C11529e> set, C11528d dVar) {
        this.f26940a = m37162a(set);
        this.f26941b = dVar;
    }

    /* renamed from: a */
    private static String m37162a(Set<C11529e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C11529e eVar = (C11529e) it.next();
            sb.append(eVar.mo29451a());
            sb.append('/');
            sb.append(eVar.mo29452b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String getUserAgent() {
        if (this.f26941b.mo29457a().isEmpty()) {
            return this.f26940a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26940a);
        sb.append(' ');
        sb.append(m37162a(this.f26941b.mo29457a()));
        return sb.toString();
    }

    /* renamed from: a */
    public static C10429d<C11531g> m37160a() {
        C10431b a = C10429d.m32955a(C11531g.class);
        a.mo27230a(C10447n.m33012b(C11529e.class));
        a.mo27229a(C11526b.m37158a());
        return a.mo27231b();
    }

    /* renamed from: a */
    static /* synthetic */ C11531g m37161a(C10432e eVar) {
        return new C11527c(eVar.mo27218c(C11529e.class), C11528d.m37163b());
    }
}
