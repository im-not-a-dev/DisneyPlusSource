package kotlin.reflect.jvm.internal.impl.descriptors;

public interface DeclarationDescriptorNonRoot extends DeclarationDescriptorWithSource {
    DeclarationDescriptor getContainingDeclaration();
}
