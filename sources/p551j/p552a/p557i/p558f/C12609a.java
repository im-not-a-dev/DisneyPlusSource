package p551j.p552a.p557i.p558f;

import java.util.Collection;

/* renamed from: j.a.i.f.a */
/* compiled from: CompoundResourceLocator */
public class C12609a implements C12610b {

    /* renamed from: a */
    private final Collection<C12610b> f29250a;

    public C12609a(Collection<C12610b> collection) {
        this.f29250a = collection;
    }

    /* renamed from: a */
    public String mo30921a() {
        for (C12610b a : this.f29250a) {
            String a2 = a.mo30921a();
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
