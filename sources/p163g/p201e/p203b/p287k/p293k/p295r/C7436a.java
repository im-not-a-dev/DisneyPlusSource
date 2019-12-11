package p163g.p201e.p203b.p287k.p293k.p295r;

import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.collections.items.C3347e.C3348a;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.detail.common.C5984l;
import com.bamtechmedia.dominguez.detail.common.C5989o;
import com.bamtechmedia.dominguez.detail.common.C6000s;
import com.bamtechmedia.dominguez.detail.common.C6007w;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.item.C5981c;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import java.util.List;
import java.util.Map;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p293k.C7382b;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7435b;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.p511l.C11866a;

/* renamed from: g.e.b.k.k.r.a */
/* compiled from: BaseSeriesDetailPresenter.kt */
public abstract class C7436a {

    /* renamed from: a */
    private final C7435b f16327a;

    /* renamed from: b */
    private final C7391d f16328b;

    /* renamed from: c */
    private final C3347e f16329c;

    /* renamed from: d */
    private final C7382b f16330d;

    /* renamed from: e */
    private final C5984l f16331e;

    /* renamed from: f */
    private final C5981c f16332f;

    /* renamed from: g */
    private final C6000s f16333g;

    /* renamed from: h */
    private final boolean f16334h;

    public C7436a(C7435b bVar, C3653c cVar, C7391d dVar, C3347e eVar, C7382b bVar2, C5984l lVar, C5981c cVar2, C6000s sVar, boolean z) {
        this.f16327a = bVar;
        this.f16328b = dVar;
        this.f16329c = eVar;
        this.f16330d = bVar2;
        this.f16331e = lVar;
        this.f16332f = cVar2;
        this.f16333g = sVar;
        this.f16334h = z;
    }

    /* renamed from: b */
    private final boolean m22219b(C6008x xVar) {
        return xVar.mo18028d() == C7313g.nav_extras;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11866a mo20280a(C6008x xVar, List<? extends C6008x> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11866a mo20281a(C7468g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo20282a(C6046d dVar);

    /* renamed from: a */
    public final boolean mo20283a(C6008x xVar) {
        return xVar != null && xVar.mo18028d() == C7313g.nav_episodes;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C3626b mo20284b(C7468g gVar);

    /* renamed from: c */
    public final List<C11847b> mo20285c(C7468g gVar) {
        List<C11847b> list;
        C7468g gVar2 = gVar;
        C6008x d = gVar.mo17871d();
        if (d == null) {
            return C13185o.m40513a();
        }
        Map h = gVar.mo20356h();
        if (mo20283a(d) && h != null) {
            list = this.f16330d.mo20210a(h, gVar2, this.f16328b);
        } else if (m22219b(d) && (d instanceof C5989o)) {
            list = this.f16331e.mo17892a(((C5989o) d).m19184a(), gVar2, this.f16332f);
        } else if (d instanceof C5989o) {
            C3347e eVar = this.f16329c;
            String c = d.mo18027c();
            String c2 = d.mo18027c();
            C3700c a = ((C5989o) d).m19184a();
            ContainerType containerType = ContainerType.GridContainer;
            C3343b bVar = new C3343b(0, null, null, null, null, null, d.mo18026b(), 63, null);
            list = C3348a.m11521a(eVar, "detailContent", containerType, c, c2, null, a, bVar, null, 144, null);
        } else if (d instanceof C6007w) {
            list = ((C6007w) d).mo18025a();
        } else {
            list = C13185o.m40513a();
        }
        return list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p163g.p509o.p510a.C11847b> mo20286d(p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g r13) {
        /*
            r12 = this;
            com.bamtechmedia.dominguez.core.content.v r1 = r13.mo20362m()
            if (r1 == 0) goto L_0x0091
            g.o.a.l.a r9 = r12.mo20281a(r13)
            com.bamtechmedia.dominguez.detail.series.models.d r0 = r13.mo20363n()
            r10 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r12.mo20282a(r0)
            r2 = r0
            goto L_0x0018
        L_0x0017:
            r2 = r10
        L_0x0018:
            com.bamtechmedia.dominguez.detail.series.models.d r0 = r13.mo20363n()
            if (r0 == 0) goto L_0x0024
            com.bamtechmedia.dominguez.core.content.PromoLabel r0 = r0.mo18283Z()
            r3 = r0
            goto L_0x0025
        L_0x0024:
            r3 = r10
        L_0x0025:
            com.bamtechmedia.dominguez.detail.series.models.d r4 = r13.mo20363n()
            com.bamtechmedia.dominguez.detail.series.models.f r5 = r13.mo20364o()
            com.bamtechmedia.dominguez.detail.series.models.d r0 = r13.mo20363n()
            if (r0 == 0) goto L_0x003f
            com.bamtechmedia.dominguez.detail.common.e0.c r0 = r0.mo18281X()
            if (r0 == 0) goto L_0x003f
            java.lang.CharSequence r0 = r0.mo17830g()
            r6 = r0
            goto L_0x0040
        L_0x003f:
            r6 = r10
        L_0x0040:
            com.bamtechmedia.dominguez.detail.common.j r0 = r13.mo20358i()
            if (r0 == 0) goto L_0x005a
            com.bamtechmedia.dominguez.detail.common.s r7 = r12.f16333g
            com.bamtechmedia.dominguez.detail.series.models.d r8 = r13.mo20363n()
            if (r8 == 0) goto L_0x0053
            com.bamtechmedia.dominguez.core.content.PromoLabel r8 = r8.mo18283Z()
            goto L_0x0054
        L_0x0053:
            r8 = r10
        L_0x0054:
            com.bamtechmedia.dominguez.core.content.o r0 = r7.mo18048a(r0, r8)
            r7 = r0
            goto L_0x005b
        L_0x005a:
            r7 = r10
        L_0x005b:
            com.bamtechmedia.dominguez.core.content.assets.b r0 = r12.mo20284b(r13)
            boolean r8 = r12.f16334h
            if (r8 == 0) goto L_0x0065
            r8 = r0
            goto L_0x0066
        L_0x0065:
            r8 = r10
        L_0x0066:
            g.e.b.k.k.o r11 = new g.e.b.k.k.o
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            g.e.b.k.k.q.a$b r0 = r12.f16327a
            g.e.b.k.k.q.a r0 = r0.mo20279a(r11)
            com.bamtechmedia.dominguez.detail.common.x r1 = r13.mo17871d()
            if (r1 == 0) goto L_0x0080
            java.util.List r13 = r13.mo17870c()
            g.o.a.l.a r10 = r12.mo20280a(r1, r13)
        L_0x0080:
            r13 = 3
            g.o.a.l.a[] r13 = new p163g.p509o.p510a.p511l.C11866a[r13]
            r1 = 0
            r13[r1] = r9
            r1 = 1
            r13[r1] = r0
            r0 = 2
            r13[r0] = r10
            java.util.List r13 = kotlin.p590y.C13185o.m40522d(r13)
            return r13
        L_0x0091:
            java.util.List r13 = kotlin.p590y.C13185o.m40513a()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p201e.p203b.p287k.p293k.p295r.C7436a.mo20286d(g.e.b.k.k.t.a$g):java.util.List");
    }
}
