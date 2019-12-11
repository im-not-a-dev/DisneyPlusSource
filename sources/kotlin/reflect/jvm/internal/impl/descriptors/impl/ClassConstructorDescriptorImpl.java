package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Name NAME = Name.special("<init>");
    protected final boolean isPrimary;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = str2;
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 25) {
            switch (i) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    protected ClassConstructorDescriptorImpl(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z, Kind kind, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        super(classDescriptor, constructorDescriptor, annotations, NAME, kind, sourceElement);
        this.isPrimary = z;
    }

    public static ClassConstructorDescriptorImpl create(ClassDescriptor classDescriptor, Annotations annotations, boolean z, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        if (annotations == null) {
            $$$reportNull$$$0(5);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(6);
        }
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl = new ClassConstructorDescriptorImpl(classDescriptor, null, annotations, z, Kind.DECLARATION, sourceElement);
        return classConstructorDescriptorImpl;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitConstructorDescriptor(this, d);
    }

    public ReceiverParameterDescriptor calculateDispatchReceiverParameter() {
        ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (containingDeclaration.isInner()) {
            DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
            if (containingDeclaration2 instanceof ClassDescriptor) {
                return ((ClassDescriptor) containingDeclaration2).getThisAsReceiverParameter();
            }
        }
        return null;
    }

    public ClassDescriptor getConstructedClass() {
        ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(16);
        }
        return containingDeclaration;
    }

    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            $$$reportNull$$$0(19);
        }
        return emptySet;
    }

    public ClassConstructorDescriptorImpl initialize(List<ValueParameterDescriptor> list, Visibility visibility, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(10);
        }
        if (visibility == null) {
            $$$reportNull$$$0(11);
        }
        if (list2 == null) {
            $$$reportNull$$$0(12);
        }
        super.initialize(null, calculateDispatchReceiverParameter(), list2, list, null, Modality.FINAL, visibility);
        return this;
    }

    public boolean isPrimary() {
        return this.isPrimary;
    }

    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(20);
        }
    }

    /* access modifiers changed from: protected */
    public ClassConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(21);
        }
        if (kind == null) {
            $$$reportNull$$$0(22);
        }
        if (annotations == null) {
            $$$reportNull$$$0(23);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(24);
        }
        if (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImpl = new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.isPrimary, Kind.DECLARATION, sourceElement);
            return classConstructorDescriptorImpl;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        String str = "\n";
        sb.append(str);
        sb.append("newOwner: ");
        sb.append(declarationDescriptor);
        sb.append(str);
        sb.append("kind: ");
        sb.append(kind);
        throw new IllegalStateException(sb.toString());
    }

    public ClassConstructorDescriptorImpl initialize(List<ValueParameterDescriptor> list, Visibility visibility) {
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        if (visibility == null) {
            $$$reportNull$$$0(14);
        }
        initialize(list, visibility, getContainingDeclaration().getDeclaredTypeParameters());
        return this;
    }

    public ClassConstructorDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z) {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.copy(declarationDescriptor, modality, visibility, kind, z);
        if (classConstructorDescriptor == null) {
            $$$reportNull$$$0(25);
        }
        return classConstructorDescriptor;
    }

    public ClassDescriptor getContainingDeclaration() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.getContainingDeclaration();
        if (classDescriptor == null) {
            $$$reportNull$$$0(15);
        }
        return classDescriptor;
    }

    public ClassConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(18);
        }
        return (ClassConstructorDescriptor) super.substitute(typeSubstitutor);
    }

    public ClassConstructorDescriptor getOriginal() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.getOriginal();
        if (classConstructorDescriptor == null) {
            $$$reportNull$$$0(17);
        }
        return classConstructorDescriptor;
    }
}
