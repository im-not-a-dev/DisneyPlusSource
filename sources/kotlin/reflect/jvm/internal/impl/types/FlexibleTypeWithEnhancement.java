package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* compiled from: TypeWithEnhancement.kt */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {
    private final KotlinType enhancement;
    private final FlexibleType origin;

    public FlexibleTypeWithEnhancement(FlexibleType flexibleType, KotlinType kotlinType) {
        super(flexibleType.getLowerBound(), flexibleType.getUpperBound());
        this.origin = flexibleType;
        this.enhancement = kotlinType;
    }

    public SimpleType getDelegate() {
        return getOrigin().getDelegate();
    }

    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        if (descriptorRendererOptions.getEnhancedTypes()) {
            return descriptorRenderer.renderType(getEnhancement());
        }
        return getOrigin().render(descriptorRenderer, descriptorRendererOptions);
    }

    public UnwrappedType replaceAnnotations(Annotations annotations) {
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAnnotations(annotations), getEnhancement());
    }

    public FlexibleType getOrigin() {
        return this.origin;
    }
}
