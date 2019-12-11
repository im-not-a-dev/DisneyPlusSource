package p163g.p201e.p203b.p326x;

import com.bamnet.iap.BamnetIAPPurchase;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.x.e */
/* compiled from: FeaturePlatformModule_ProvidePurchaseClassFactory */
public final class C7920e implements C11895c<Class<? extends BamnetIAPPurchase>> {

    /* renamed from: a */
    private static final C7920e f17055a = new C7920e();

    /* renamed from: a */
    public static C7920e m23140a() {
        return f17055a;
    }

    /* renamed from: b */
    public static Class<? extends BamnetIAPPurchase> m23141b() {
        Class<? extends BamnetIAPPurchase> a = C7917b.m23134a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Class<? extends BamnetIAPPurchase> get() {
        return m23141b();
    }
}
