package p163g.p201e.p203b.p326x;

import android.content.Context;
import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market;
import com.bamnet.iap.p035c.C1624a;
import com.bamtechmedia.dominguez.config.C3524e;
import com.google.android.gms.common.GoogleApiAvailability;
import p163g.p201e.p203b.p405c0.C10562d;
import p520io.reactivex.Single;

/* renamed from: g.e.b.x.b */
/* compiled from: FeaturePlatformModule */
public abstract class C7917b {
    /* renamed from: a */
    static Market m23132a(C7922g gVar) {
        return gVar.mo20836a();
    }

    /* renamed from: a */
    static Single<C10562d> m23133a(Single<C3524e> single) {
        return single.mo30233g(C7916a.f17052c);
    }

    /* renamed from: a */
    static boolean m23135a(Context context) {
        return GoogleApiAvailability.m30032a().mo24987c(context) == 0;
    }

    /* renamed from: a */
    static Class<? extends BamnetIAPPurchase> m23134a() {
        return C1624a.class;
    }
}
