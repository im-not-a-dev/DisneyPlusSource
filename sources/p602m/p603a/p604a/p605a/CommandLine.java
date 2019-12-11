package p602m.p603a.p604a.p605a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: m.a.a.a.b */
/* compiled from: CommandLine */
public class CommandLine implements Serializable {

    /* renamed from: U */
    private List f29925U = new ArrayList();

    /* renamed from: c */
    private List f29926c = new LinkedList();

    CommandLine() {
    }

    /* renamed from: c */
    private C13440h m41302c(String str) {
        String b = C13447o.m41363b(str);
        for (C13440h hVar : this.f29925U) {
            if (b.equals(hVar.mo34669f())) {
                return hVar;
            }
            if (b.equals(hVar.mo34667e())) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List mo34644a() {
        return this.f29926c;
    }

    /* renamed from: b */
    public boolean mo34647b(String str) {
        return this.f29925U.contains(m41302c(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34645a(String str) {
        this.f29926c.add(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34646a(C13440h hVar) {
        this.f29925U.add(hVar);
    }
}
