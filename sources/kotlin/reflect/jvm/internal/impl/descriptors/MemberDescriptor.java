package kotlin.reflect.jvm.internal.impl.descriptors;

public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    Modality getModality();

    Visibility getVisibility();

    boolean isActual();

    boolean isExpect();

    boolean isExternal();
}
