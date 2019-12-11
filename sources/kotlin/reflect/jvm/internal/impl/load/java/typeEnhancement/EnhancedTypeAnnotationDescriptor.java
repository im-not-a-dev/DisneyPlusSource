package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: typeEnhancement.kt */
final class EnhancedTypeAnnotationDescriptor implements AnnotationDescriptor {
    public static final EnhancedTypeAnnotationDescriptor INSTANCE = new EnhancedTypeAnnotationDescriptor();

    private EnhancedTypeAnnotationDescriptor() {
    }

    private final Void throwError() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        throwError();
        throw null;
    }

    public FqName getFqName() {
        return DefaultImpls.getFqName(this);
    }

    public SourceElement getSource() {
        throwError();
        throw null;
    }

    public KotlinType getType() {
        throwError();
        throw null;
    }

    public String toString() {
        return "[EnhancedType]";
    }
}
