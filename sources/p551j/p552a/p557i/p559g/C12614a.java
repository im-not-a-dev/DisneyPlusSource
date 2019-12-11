package p551j.p552a.p557i.p559g;

import java.util.Collection;

/* renamed from: j.a.i.g.a */
/* compiled from: CompoundConfigurationProvider */
public class C12614a implements C12615b {

    /* renamed from: a */
    private final Collection<C12615b> f29254a;

    public C12614a(Collection<C12615b> collection) {
        this.f29254a = collection;
    }

    /* renamed from: a */
    public String mo30922a(String str) {
        for (C12615b a : this.f29254a) {
            String a2 = a.mo30922a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
