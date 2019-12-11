package p163g.p449j.p487c;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p163g.p449j.p487c.p490y.C11599d;
import p163g.p449j.p487c.p490y.p491l.C11649n;

/* renamed from: g.j.c.g */
/* compiled from: GsonBuilder */
public final class C11554g {

    /* renamed from: a */
    private C11599d f27005a = C11599d.f27047Z;

    /* renamed from: b */
    private C11568u f27006b = C11568u.DEFAULT;

    /* renamed from: c */
    private C11546e f27007c = C11540d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C11555h<?>> f27008d = new HashMap();

    /* renamed from: e */
    private final List<C11573w> f27009e = new ArrayList();

    /* renamed from: f */
    private final List<C11573w> f27010f = new ArrayList();

    /* renamed from: g */
    private boolean f27011g = false;

    /* renamed from: h */
    private String f27012h;

    /* renamed from: i */
    private int f27013i = 2;

    /* renamed from: j */
    private int f27014j = 2;

    /* renamed from: k */
    private boolean f27015k = false;

    /* renamed from: l */
    private boolean f27016l = false;

    /* renamed from: m */
    private boolean f27017m = true;

    /* renamed from: n */
    private boolean f27018n = false;

    /* renamed from: o */
    private boolean f27019o = false;

    /* renamed from: p */
    private boolean f27020p = false;

    /* renamed from: a */
    public C11554g mo29531a(C11573w wVar) {
        this.f27009e.add(wVar);
        return this;
    }

    /* renamed from: a */
    public C11547f mo29530a() {
        ArrayList arrayList = new ArrayList(this.f27009e.size() + this.f27010f.size() + 3);
        arrayList.addAll(this.f27009e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f27010f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m37293a(this.f27012h, this.f27013i, this.f27014j, arrayList);
        C11547f fVar = new C11547f(this.f27005a, this.f27007c, this.f27008d, this.f27011g, this.f27015k, this.f27019o, this.f27017m, this.f27018n, this.f27020p, this.f27016l, this.f27006b, arrayList);
        return fVar;
    }

    /* renamed from: a */
    private void m37293a(String str, int i, int i2, List<C11573w> list) {
        C11532a aVar;
        C11532a aVar2;
        C11532a aVar3;
        if (str != null) {
            if (!"".equals(str.trim())) {
                C11532a aVar4 = new C11532a(Date.class, str);
                aVar = new C11532a(Timestamp.class, str);
                aVar3 = new C11532a(java.sql.Date.class, str);
                aVar2 = aVar4;
                list.add(C11649n.m37500a(Date.class, aVar2));
                list.add(C11649n.m37500a(Timestamp.class, aVar));
                list.add(C11649n.m37500a(java.sql.Date.class, aVar3));
            }
        }
        if (i != 2 && i2 != 2) {
            aVar2 = new C11532a(Date.class, i, i2);
            C11532a aVar5 = new C11532a(Timestamp.class, i, i2);
            C11532a aVar6 = new C11532a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
            list.add(C11649n.m37500a(Date.class, aVar2));
            list.add(C11649n.m37500a(Timestamp.class, aVar));
            list.add(C11649n.m37500a(java.sql.Date.class, aVar3));
        }
    }
}
