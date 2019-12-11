package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

public class ClassDescriptorImpl extends ClassDescriptorBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<ClassConstructorDescriptor> constructors;
    private final ClassKind kind;
    private final Modality modality;
    private ClassConstructorDescriptor primaryConstructor;
    private final TypeConstructor typeConstructor;
    private MemberScope unsubstitutedMemberScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 13:
                objArr[1] = "getStaticScope";
                break;
            case 14:
                objArr[1] = "getKind";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 17:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 18:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public ClassDescriptorImpl(DeclarationDescriptor declarationDescriptor, Name name, Modality modality2, ClassKind classKind, Collection<KotlinType> collection, SourceElement sourceElement, boolean z, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (name == null) {
            $$$reportNull$$$0(1);
        }
        if (modality2 == null) {
            $$$reportNull$$$0(2);
        }
        if (classKind == null) {
            $$$reportNull$$$0(3);
        }
        if (collection == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        if (storageManager == null) {
            $$$reportNull$$$0(6);
        }
        super(storageManager, declarationDescriptor, name, sourceElement, z);
        this.modality = modality2;
        this.kind = classKind;
        this.typeConstructor = new ClassTypeConstructorImpl(this, Collections.emptyList(), collection, storageManager);
    }

    public Annotations getAnnotations() {
        Annotations empty = Annotations.Companion.getEMPTY();
        if (empty == null) {
            $$$reportNull$$$0(9);
        }
        return empty;
    }

    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    public Collection<ClassConstructorDescriptor> getConstructors() {
        Set<ClassConstructorDescriptor> set = this.constructors;
        if (set == null) {
            $$$reportNull$$$0(11);
        }
        return set;
    }

    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(17);
        }
        return emptyList;
    }

    public ClassKind getKind() {
        ClassKind classKind = this.kind;
        if (classKind == null) {
            $$$reportNull$$$0(14);
        }
        return classKind;
    }

    public Modality getModality() {
        Modality modality2 = this.modality;
        if (modality2 == null) {
            $$$reportNull$$$0(15);
        }
        return modality2;
    }

    public Collection<ClassDescriptor> getSealedSubclasses() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(18);
        }
        return emptyList;
    }

    public MemberScope getStaticScope() {
        Empty empty = Empty.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(13);
        }
        return empty;
    }

    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor2 = this.typeConstructor;
        if (typeConstructor2 == null) {
            $$$reportNull$$$0(10);
        }
        return typeConstructor2;
    }

    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope memberScope = this.unsubstitutedMemberScope;
        if (memberScope == null) {
            $$$reportNull$$$0(12);
        }
        return memberScope;
    }

    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return this.primaryConstructor;
    }

    public Visibility getVisibility() {
        Visibility visibility = Visibilities.PUBLIC;
        if (visibility == null) {
            $$$reportNull$$$0(16);
        }
        return visibility;
    }

    public final void initialize(MemberScope memberScope, Set<ClassConstructorDescriptor> set, ClassConstructorDescriptor classConstructorDescriptor) {
        if (memberScope == null) {
            $$$reportNull$$$0(7);
        }
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        this.unsubstitutedMemberScope = memberScope;
        this.constructors = set;
        this.primaryConstructor = classConstructorDescriptor;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }
}
