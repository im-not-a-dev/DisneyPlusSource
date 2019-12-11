package p551j.p552a.p557i;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p551j.p552a.C12589b;
import p551j.p552a.p557i.p558f.C12609a;
import p551j.p552a.p557i.p558f.C12610b;
import p551j.p552a.p557i.p558f.C12611c;
import p551j.p552a.p557i.p558f.C12612d;
import p551j.p552a.p557i.p558f.C12613e;
import p551j.p552a.p557i.p559g.C12614a;
import p551j.p552a.p557i.p559g.C12615b;
import p551j.p552a.p557i.p559g.C12616c;
import p551j.p552a.p557i.p559g.C12617d;
import p551j.p552a.p557i.p559g.C12620e;
import p551j.p552a.p557i.p559g.C12621f;
import p551j.p552a.p557i.p559g.C12623h;
import p551j.p552a.p562l.C12652a;
import p602m.p609c.C13459b;
import p602m.p609c.C13460c;

/* renamed from: j.a.i.d */
/* compiled from: Lookup */
public final class C12607d {

    /* renamed from: c */
    private static final C13459b f29245c = C13460c.m41415a(C12607d.class);

    /* renamed from: d */
    private static final Object f29246d = new Object();

    /* renamed from: e */
    private static C12607d f29247e;

    /* renamed from: a */
    private final C12615b f29248a;

    /* renamed from: b */
    private final C12615b f29249b;

    public C12607d() {
        this(new C12614a(m39604a()), new C12614a(m39606b()));
    }

    /* renamed from: a */
    private static List<C12615b> m39604a() {
        boolean a = C12620e.m39623a();
        ArrayList arrayList = new ArrayList(a ? 3 : 2);
        if (a) {
            arrayList.add(new C12617d());
        }
        arrayList.add(new C12623h());
        arrayList.add(new C12616c());
        return arrayList;
    }

    /* renamed from: b */
    private static List<C12615b> m39606b() {
        try {
            return Collections.singletonList(new C12621f(new C12604a(m39607c()), new C12609a(m39608d()), Charset.defaultCharset()));
        } catch (IOException e) {
            f29245c.mo34731c("Failed to instantiate resource locator-based configuration provider.", (Throwable) e);
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    private static List<C12608e> m39607c() {
        C12608e a = C12589b.m39529a();
        if (a == null) {
            return Arrays.asList(new C12608e[]{new C12606c(), new C12605b()});
        }
        return Arrays.asList(new C12608e[]{new C12606c(), a, new C12605b()});
    }

    /* renamed from: d */
    private static List<C12610b> m39608d() {
        return Arrays.asList(new C12610b[]{new C12613e(), new C12611c(), new C12612d()});
    }

    /* renamed from: e */
    private static C12607d m39609e() {
        C12607d dVar;
        synchronized (f29246d) {
            if (f29247e == null) {
                f29247e = new C12607d();
            }
            dVar = f29247e;
        }
        return dVar;
    }

    public C12607d(C12615b bVar, C12615b bVar2) {
        this.f29248a = bVar;
        this.f29249b = bVar2;
    }

    @Deprecated
    /* renamed from: b */
    public static String m39605b(String str, C12652a aVar) {
        return m39609e().mo30920a(str, aVar);
    }

    @Deprecated
    /* renamed from: a */
    public static String m39603a(String str) {
        return m39605b(str, null);
    }

    /* renamed from: a */
    public String mo30920a(String str, C12652a aVar) {
        String a = this.f29248a.mo30922a(str);
        if (a == null && aVar != null) {
            a = (String) aVar.mo30963a().get(str);
            if (a != null) {
                f29245c.mo34722a("Found {}={} in DSN.", str, a);
            }
        }
        if (a == null) {
            a = this.f29249b.mo30922a(str);
        }
        if (a == null) {
            return null;
        }
        return a.trim();
    }
}
