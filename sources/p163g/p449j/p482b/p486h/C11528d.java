package p163g.p449j.p482b.p486h;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g.j.b.h.d */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C11528d {

    /* renamed from: b */
    private static volatile C11528d f26942b;

    /* renamed from: a */
    private final Set<C11529e> f26943a = new HashSet();

    C11528d() {
    }

    /* renamed from: b */
    public static C11528d m37163b() {
        C11528d dVar = f26942b;
        if (dVar == null) {
            synchronized (C11528d.class) {
                dVar = f26942b;
                if (dVar == null) {
                    dVar = new C11528d();
                    f26942b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Set<C11529e> mo29457a() {
        Set<C11529e> unmodifiableSet;
        synchronized (this.f26943a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f26943a);
        }
        return unmodifiableSet;
    }
}
