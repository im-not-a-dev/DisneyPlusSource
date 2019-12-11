package p163g.p201e.p203b.p299m;

import com.bamtechmedia.dominguez.dialogs.tier2.C6062c;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.m.n */
/* compiled from: DialogsTvBindingModule_ProvideTier2FactoryFactory */
public final class C7555n implements C11895c<C6062c> {

    /* renamed from: a */
    private static final C7555n f16560a = new C7555n();

    /* renamed from: a */
    public static C7555n m22517a() {
        return f16560a;
    }

    /* renamed from: b */
    public static C6062c m22518b() {
        C6062c b = C7551k.m22515b();
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6062c get() {
        return m22518b();
    }
}
