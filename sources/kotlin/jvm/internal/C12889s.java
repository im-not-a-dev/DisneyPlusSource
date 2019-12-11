package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.s */
/* compiled from: PropertyReference0Impl */
public class C12889s extends C12888r {

    /* renamed from: U */
    private final String f29528U;

    /* renamed from: V */
    private final String f29529V;

    /* renamed from: c */
    private final KDeclarationContainer f29530c;

    public C12889s(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f29530c = kDeclarationContainer;
        this.f29528U = str;
        this.f29529V = str2;
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public String getName() {
        return this.f29528U;
    }

    public KDeclarationContainer getOwner() {
        return this.f29530c;
    }

    public String getSignature() {
        return this.f29529V;
    }
}
