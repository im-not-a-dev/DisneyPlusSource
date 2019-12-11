package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* compiled from: KotlinType.kt */
public abstract class FlexibleType extends UnwrappedType implements SubtypingRepresentatives, FlexibleTypeMarker {
    private final SimpleType lowerBound;
    private final SimpleType upperBound;

    public FlexibleType(SimpleType simpleType, SimpleType simpleType2) {
        super(null);
        this.lowerBound = simpleType;
        this.upperBound = simpleType2;
    }

    public Annotations getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    public abstract SimpleType getDelegate();

    public final SimpleType getLowerBound() {
        return this.lowerBound;
    }

    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public KotlinType getSubTypeRepresentative() {
        return this.lowerBound;
    }

    public KotlinType getSuperTypeRepresentative() {
        return this.upperBound;
    }

    public final SimpleType getUpperBound() {
        return this.upperBound;
    }

    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    public abstract String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions);

    public boolean sameTypeConstructor(KotlinType kotlinType) {
        return false;
    }

    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
