package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: SpecialTypes.kt */
public abstract class DelegatingSimpleType extends SimpleType {
    public Annotations getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    /* access modifiers changed from: protected */
    public abstract SimpleType getDelegate();

    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }
}
