package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: KotlinTypeFactory.kt */
final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    public NullableSimpleType(SimpleType simpleType) {
        super(simpleType);
    }

    public boolean isMarkedNullable() {
        return true;
    }
}
