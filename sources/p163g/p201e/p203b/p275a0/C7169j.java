package p163g.p201e.p203b.p275a0;

import android.content.Context;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p275a0.C7159g.C7162c;
import p163g.p201e.p203b.p275a0.p276k.C7172c;
import p163g.p201e.p203b.p275a0.p276k.C7175e;

/* renamed from: g.e.b.a0.j */
/* compiled from: RipcutUrlResolverImpl.kt */
public final class C7169j implements C7166i {

    /* renamed from: a */
    private final Context f15847a;

    /* renamed from: b */
    private final C7172c f15848b;

    public C7169j(Context context, C7172c cVar) {
        this.f15847a = context;
        this.f15848b = cVar;
    }

    /* renamed from: a */
    public String mo20009a(String str, Function1<? super C7162c, C13145v> function1) {
        C7172c cVar = this.f15848b;
        Context context = this.f15847a;
        C7162c cVar2 = new C7162c();
        function1.invoke(cVar2);
        String uri = cVar.mo20013a(new C7175e(str, context, cVar2)).toString();
        C12880j.m40222a((Object) uri, "httpRipcutUriFactory.cre…   )\n        ).toString()");
        return uri;
    }
}
