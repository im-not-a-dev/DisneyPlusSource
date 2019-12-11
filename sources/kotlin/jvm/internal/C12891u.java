package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.u */
/* compiled from: PropertyReference1Impl */
public class C12891u extends C12890t {

    /* renamed from: U */
    private final String f29531U;

    /* renamed from: V */
    private final String f29532V;

    /* renamed from: c */
    private final KDeclarationContainer f29533c;

    public C12891u(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f29533c = kDeclarationContainer;
        this.f29531U = str;
        this.f29532V = str2;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f29531U;
    }

    public KDeclarationContainer getOwner() {
        return this.f29533c;
    }

    public String getSignature() {
        return this.f29532V;
    }
}
