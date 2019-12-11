package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: dynamicTypes.kt */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {
    private final Annotations annotations;

    public DynamicType(KotlinBuiltIns kotlinBuiltIns, Annotations annotations2) {
        SimpleType nothingType = kotlinBuiltIns.getNothingType();
        Intrinsics.checkReturnedValueIsNotNull((Object) nothingType, "builtIns.nothingType");
        SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        Intrinsics.checkReturnedValueIsNotNull((Object) nullableAnyType, "builtIns.nullableAnyType");
        super(nothingType, nullableAnyType);
        this.annotations = annotations2;
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public SimpleType getDelegate() {
        return getUpperBound();
    }

    public boolean isMarkedNullable() {
        return false;
    }

    public DynamicType makeNullableAsSpecified(boolean z) {
        return this;
    }

    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        return "dynamic";
    }

    public DynamicType replaceAnnotations(Annotations annotations2) {
        return new DynamicType(TypeUtilsKt.getBuiltIns(getDelegate()), annotations2);
    }
}
