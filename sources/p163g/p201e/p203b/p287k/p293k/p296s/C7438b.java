package p163g.p201e.p203b.p287k.p293k.p296s;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.detail.common.C5969i;
import com.bamtechmedia.dominguez.detail.common.C5983k;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5920a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.series.data.C6037a;
import javax.inject.Provider;
import p163g.p201e.p203b.p287k.C7311e;
import p163g.p201e.p203b.p287k.p293k.C7383c;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.C7394e;
import p163g.p201e.p203b.p287k.p293k.C7396f;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a;

/* renamed from: g.e.b.k.k.s.b */
/* compiled from: FeatureSeriesDetailTvBindingModule */
public abstract class C7438b {

    /* renamed from: g.e.b.k.k.s.b$a */
    /* compiled from: FeatureSeriesDetailTvBindingModule */
    public static abstract class C7439a {
        /* renamed from: a */
        static C7394e m22228a(C7444g gVar) {
            return gVar.mo20291o();
        }

        /* renamed from: a */
        static C7454a m22230a(C7444g gVar, C6037a aVar, C5969i iVar, C5983k kVar, Context context, boolean z, C7391d dVar, C5920a aVar2, C3572r0 r0Var, C5948c cVar, C2366i0 i0Var, C7383c cVar2) {
            C7437a aVar3 = new C7437a(aVar, iVar, kVar, context, z, gVar, dVar, aVar2, r0Var, cVar, i0Var, cVar2);
            C7444g gVar2 = gVar;
            return (C7454a) C5856o0.m18893a((Fragment) gVar, C7454a.class, (Provider<T>) aVar3);
        }

        /* renamed from: a */
        static /* synthetic */ C7454a m22229a(C6037a aVar, C5969i iVar, C5983k kVar, Context context, boolean z, C7444g gVar, C7391d dVar, C5920a aVar2, C3572r0 r0Var, C5948c cVar, C2366i0 i0Var, C7383c cVar2) {
            C7454a aVar3 = new C7454a(aVar, null, iVar, kVar, context.getResources().getInteger(C7311e.series_detail_season_count), z, gVar.mo20291o(), dVar, aVar2, r0Var, cVar, i0Var, cVar2);
            return aVar3;
        }
    }

    /* renamed from: a */
    static C7396f m22227a() {
        return C7444g.f16350k0;
    }
}
