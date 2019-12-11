package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

public interface DeclarationDescriptor extends Named, Annotated {
    <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d);

    DeclarationDescriptor getContainingDeclaration();

    DeclarationDescriptor getOriginal();
}
