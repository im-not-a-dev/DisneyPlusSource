package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: KotlinType.kt */
public abstract class UnwrappedType extends KotlinType {
    private UnwrappedType() {
        super(null);
    }

    public abstract UnwrappedType makeNullableAsSpecified(boolean z);

    public abstract UnwrappedType replaceAnnotations(Annotations annotations);

    public final UnwrappedType unwrap() {
        return this;
    }

    public /* synthetic */ UnwrappedType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
