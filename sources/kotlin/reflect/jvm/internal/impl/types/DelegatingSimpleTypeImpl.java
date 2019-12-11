package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: KotlinTypeFactory.kt */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    private final SimpleType delegate;

    public DelegatingSimpleTypeImpl(SimpleType simpleType) {
        this.delegate = simpleType;
    }

    /* access modifiers changed from: protected */
    public SimpleType getDelegate() {
        return this.delegate;
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return getDelegate().makeNullableAsSpecified(z).replaceAnnotations(getAnnotations());
    }

    public DelegatingSimpleTypeImpl replaceAnnotations(Annotations annotations) {
        return annotations != getAnnotations() ? new AnnotatedSimpleType(this, annotations) : this;
    }
}
