package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: KotlinTypeFactory.kt */
final class AnnotatedSimpleType extends DelegatingSimpleTypeImpl {
    private final Annotations annotations;

    public AnnotatedSimpleType(SimpleType simpleType, Annotations annotations2) {
        super(simpleType);
        this.annotations = annotations2;
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }
}
