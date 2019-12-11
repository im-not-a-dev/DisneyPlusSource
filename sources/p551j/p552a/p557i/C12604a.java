package p551j.p552a.p557i;

import java.io.InputStream;
import java.util.Collection;

/* renamed from: j.a.i.a */
/* compiled from: CompoundResourceLoader */
public class C12604a implements C12608e {

    /* renamed from: a */
    private final Collection<C12608e> f29243a;

    public C12604a(Collection<C12608e> collection) {
        this.f29243a = collection;
    }

    /* renamed from: a */
    public InputStream mo30919a(String str) {
        for (C12608e a : this.f29243a) {
            InputStream a2 = a.mo30919a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
