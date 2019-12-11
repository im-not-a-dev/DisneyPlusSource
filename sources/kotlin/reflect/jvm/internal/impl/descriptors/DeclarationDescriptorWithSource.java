package kotlin.reflect.jvm.internal.impl.descriptors;

public interface DeclarationDescriptorWithSource extends DeclarationDescriptor {
    SourceElement getSource();
}
