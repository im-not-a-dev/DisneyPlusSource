package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: KotlinTypeFactory.kt */
final class NotNullSimpleType extends DelegatingSimpleTypeImpl {
    public NotNullSimpleType(SimpleType simpleType) {
        super(simpleType);
    }

    public boolean isMarkedNullable() {
        return false;
    }
}
