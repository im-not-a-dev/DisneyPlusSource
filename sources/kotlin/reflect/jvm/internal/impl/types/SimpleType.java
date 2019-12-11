package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;

/* compiled from: KotlinType.kt */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    public abstract SimpleType makeNullableAsSpecified(boolean z);

    public abstract SimpleType replaceAnnotations(Annotations annotations);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (AnnotationDescriptor renderAnnotation$default : getAnnotations()) {
            C12829t.m40103a(sb, "[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, renderAnnotation$default, null, 2, null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            C13199w.m40557a(getArguments(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
