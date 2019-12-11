package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: Modality.kt */
public final class ModalityKt {
    public static final boolean isFinalClass(ClassDescriptor classDescriptor) {
        return classDescriptor.getModality() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS;
    }
}
