package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

/* renamed from: kotlin.jvm.internal.n */
/* compiled from: MutablePropertyReference1Impl */
public class C12884n extends C12883m {

    /* renamed from: U */
    private final String f29524U;

    /* renamed from: V */
    private final String f29525V;

    /* renamed from: c */
    private final KDeclarationContainer f29526c;

    public C12884n(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f29526c = kDeclarationContainer;
        this.f29524U = str;
        this.f29525V = str2;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f29524U;
    }

    public KDeclarationContainer getOwner() {
        return this.f29526c;
    }

    public String getSignature() {
        return this.f29525V;
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
