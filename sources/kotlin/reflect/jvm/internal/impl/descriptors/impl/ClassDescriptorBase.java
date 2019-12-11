package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public abstract class ClassDescriptorBase extends AbstractClassDescriptor {
    private final DeclarationDescriptor containingDeclaration;
    private final boolean isExternal;
    private final SourceElement source;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    protected ClassDescriptorBase(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement, boolean z) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        super(storageManager, name);
        this.containingDeclaration = declarationDescriptor;
        this.source = sourceElement;
        this.isExternal = z;
    }

    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor = this.containingDeclaration;
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        return declarationDescriptor;
    }

    public SourceElement getSource() {
        SourceElement sourceElement = this.source;
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        return sourceElement;
    }

    public boolean isExternal() {
        return this.isExternal;
    }
}
