package p163g.p201e.p203b.p326x;

import com.bamnet.iap.C1622b;
import com.bamnet.iap.Market;
import com.bamnet.iap.p035c.C1625b;
import com.bamnet.iap.p035c.p036c.C1628c;
import com.bamtechmedia.dominguez.purchase.C7050h;
import p163g.p201e.p203b.p319v.C7873f;

/* renamed from: g.e.b.x.g */
/* compiled from: GoogleMarketFactory.kt */
public final class C7922g {

    /* renamed from: a */
    private final boolean f17057a;

    /* renamed from: b */
    private final boolean f17058b;

    /* renamed from: c */
    private final C7873f f17059c;

    public C7922g(boolean z, boolean z2, C7873f fVar) {
        this.f17057a = z;
        this.f17058b = z2;
        this.f17059c = fVar;
    }

    /* renamed from: a */
    public final Market mo20836a() {
        if (this.f17058b && !this.f17057a) {
            return new C7050h();
        }
        if (this.f17059c.mo20801e()) {
            return new C1628c(new C1622b(true));
        }
        return new C1625b();
    }
}
