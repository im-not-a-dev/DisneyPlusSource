package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

public class DescriptorUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL = COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier("intrinsics"));
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL = COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier("experimental"));
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE = new FqName("kotlin.coroutines");
    public static final Name ENUM_VALUES = Name.identifier("values");
    public static final Name ENUM_VALUE_OF = Name.identifier("valueOf");
    public static final FqName JVM_NAME = new FqName("kotlin.jvm.JvmName");
    public static final FqName RESULT_FQ_NAME = new FqName("kotlin.Result");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 53:
            case 54:
            case 55:
            case 57:
            case 74:
            case 87:
            case 89:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                objArr[0] = str2;
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 60:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = "other";
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 50:
            case 61:
            case 62:
            case 63:
            case 70:
            case 71:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 51:
                objArr[0] = "innerClassName";
                break;
            case 52:
                objArr[0] = "location";
                break;
            case 59:
                objArr[0] = "variable";
                break;
            case 64:
                objArr[0] = "f";
                break;
            case 66:
                objArr[0] = "current";
                break;
            case 67:
                objArr[0] = "result";
                break;
            case 68:
                objArr[0] = "memberDescriptor";
                break;
            case 72:
            case 73:
                objArr[0] = "annotated";
                break;
            case 77:
            case 79:
            case 82:
            case 84:
                objArr[0] = "scope";
                break;
            case 80:
            case 83:
            case 85:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "getAllOverriddenDescriptors";
        String str4 = "unwrapFakeOverrideToAnyDeclaration";
        String str5 = "unwrapFakeOverride";
        String str6 = "getDefaultConstructorVisibility";
        String str7 = "getClassDescriptorForTypeConstructor";
        String str8 = "getSuperClassType";
        String str9 = "getSuperclassDescriptors";
        String str10 = "getContainingModule";
        String str11 = "getFqNameFromTopLevelClass";
        String str12 = "getFqNameUnsafe";
        String str13 = "getFqNameSafe";
        switch (i) {
            case 4:
                objArr[1] = str13;
                break;
            case 7:
                objArr[1] = str12;
                break;
            case 9:
            case 10:
                objArr[1] = str11;
                break;
            case 20:
                objArr[1] = str10;
                break;
            case 38:
                objArr[1] = str9;
                break;
            case 40:
            case 41:
                objArr[1] = str8;
                break;
            case 45:
                objArr[1] = str7;
                break;
            case 47:
            case 48:
            case 49:
                objArr[1] = str6;
                break;
            case 56:
                objArr[1] = str5;
                break;
            case 58:
                objArr[1] = str4;
                break;
            case 65:
                objArr[1] = str3;
                break;
            case 69:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 75:
            case 76:
                objArr[1] = "getContainingSourceFile";
                break;
            case 78:
                objArr[1] = "getAllDescriptors";
                break;
            case 81:
                objArr[1] = "getFunctionByName";
                break;
            case 86:
                objArr[1] = "getPropertyByName";
                break;
            case 88:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = str13;
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = str12;
                break;
            case 8:
                objArr[2] = str11;
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = str10;
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = str9;
                break;
            case 39:
                objArr[2] = str8;
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = str7;
                break;
            case 46:
                objArr[2] = str6;
                break;
            case 50:
            case 51:
            case 52:
                objArr[2] = "getInnerClassByName";
                break;
            case 53:
                objArr[2] = "isStaticNestedClass";
                break;
            case 54:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 55:
                objArr[2] = str5;
                break;
            case 57:
                objArr[2] = str4;
                break;
            case 59:
            case 60:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 61:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 62:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 63:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 64:
                objArr[2] = str3;
                break;
            case 66:
            case 67:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 70:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 71:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 72:
                objArr[2] = "getJvmName";
                break;
            case 73:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 74:
                objArr[2] = "getContainingSourceFile";
                break;
            case 77:
                objArr[2] = "getAllDescriptors";
                break;
            case 79:
            case 80:
                objArr[2] = "getFunctionByName";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 84:
            case 85:
                objArr[2] = "getPropertyByName";
                break;
            case 87:
                objArr[2] = "getDirectMember";
                break;
            case 89:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 56:
            case 58:
            case 65:
            case 69:
            case 75:
            case 76:
            case 78:
            case 81:
            case 86:
            case 88:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    static {
        String str = "Continuation";
        CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL = COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(str));
        CONTINUATION_INTERFACE_FQ_NAME_RELEASE = COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(str));
    }

    private DescriptorUtils() {
    }

    public static boolean areInSameModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(14);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(15);
        }
        return getContainingModule(declarationDescriptor).equals(getContainingModule(declarationDescriptor2));
    }

    private static <D extends CallableDescriptor> void collectAllOverriddenDescriptors(D d, Set<D> set) {
        if (d == null) {
            $$$reportNull$$$0(66);
        }
        if (set == null) {
            $$$reportNull$$$0(67);
        }
        if (!set.contains(d)) {
            for (CallableDescriptor original : d.getOriginal().getOverriddenDescriptors()) {
                CallableDescriptor original2 = original.getOriginal();
                collectAllOverriddenDescriptors(original2, set);
                set.add(original2);
            }
        }
    }

    public static <D extends CallableDescriptor> Set<D> getAllOverriddenDescriptors(D d) {
        if (d == null) {
            $$$reportNull$$$0(64);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectAllOverriddenDescriptors(d.getOriginal(), linkedHashSet);
        return linkedHashSet;
    }

    public static ClassDescriptor getClassDescriptorForType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(43);
        }
        return getClassDescriptorForTypeConstructor(kotlinType.getConstructor());
    }

    public static ClassDescriptor getClassDescriptorForTypeConstructor(TypeConstructor typeConstructor) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(44);
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructor.getDeclarationDescriptor();
        if (classDescriptor == null) {
            $$$reportNull$$$0(45);
        }
        return classDescriptor;
    }

    public static ModuleDescriptor getContainingModule(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(19);
        }
        ModuleDescriptor containingModuleOrNull = getContainingModuleOrNull(declarationDescriptor);
        if (containingModuleOrNull == null) {
            $$$reportNull$$$0(20);
        }
        return containingModuleOrNull;
    }

    public static ModuleDescriptor getContainingModuleOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(18);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return null;
        }
        return getContainingModuleOrNull((DeclarationDescriptor) declarationDescriptor);
    }

    public static SourceFile getContainingSourceFile(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(74);
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).getCorrespondingProperty();
        }
        if (declarationDescriptor instanceof DeclarationDescriptorWithSource) {
            SourceFile containingFile = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile();
            if (containingFile == null) {
                $$$reportNull$$$0(75);
            }
            return containingFile;
        }
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        if (sourceFile == null) {
            $$$reportNull$$$0(76);
        }
        return sourceFile;
    }

    public static Visibility getDefaultConstructorVisibility(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(46);
        }
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton() || isSealedClass(classDescriptor)) {
            Visibility visibility = Visibilities.PRIVATE;
            if (visibility == null) {
                $$$reportNull$$$0(47);
            }
            return visibility;
        } else if (isAnonymousObject(classDescriptor)) {
            Visibility visibility2 = Visibilities.DEFAULT_VISIBILITY;
            if (visibility2 == null) {
                $$$reportNull$$$0(48);
            }
            return visibility2;
        } else {
            Visibility visibility3 = Visibilities.PUBLIC;
            if (visibility3 == null) {
                $$$reportNull$$$0(49);
            }
            return visibility3;
        }
    }

    public static ReceiverParameterDescriptor getDispatchReceiverParameterIfNeeded(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) declarationDescriptor).getThisAsReceiverParameter();
        }
        return null;
    }

    public static FqNameUnsafe getFqName(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        FqName fqNameSafeIfPossible = getFqNameSafeIfPossible(declarationDescriptor);
        return fqNameSafeIfPossible != null ? fqNameSafeIfPossible.toUnsafe() : getFqNameUnsafe(declarationDescriptor);
    }

    public static FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        FqName fqNameSafeIfPossible = getFqNameSafeIfPossible(declarationDescriptor);
        if (fqNameSafeIfPossible == null) {
            fqNameSafeIfPossible = getFqNameUnsafe(declarationDescriptor).toSafe();
        }
        if (fqNameSafeIfPossible == null) {
            $$$reportNull$$$0(4);
        }
        return fqNameSafeIfPossible;
    }

    private static FqName getFqNameSafeIfPossible(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.isError(declarationDescriptor)) {
            return FqName.ROOT;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).getFqName();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).getFqName();
        }
        return null;
    }

    private static FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
        }
        FqNameUnsafe child = getFqName(declarationDescriptor.getContainingDeclaration()).child(declarationDescriptor.getName());
        if (child == null) {
            $$$reportNull$$$0(7);
        }
        return child;
    }

    public static <D extends DeclarationDescriptor> D getParentOfType(DeclarationDescriptor declarationDescriptor, Class<D> cls) {
        if (cls == null) {
            $$$reportNull$$$0(16);
        }
        return getParentOfType(declarationDescriptor, cls, true);
    }

    public static ClassDescriptor getSuperClassDescriptor(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(42);
        }
        for (KotlinType classDescriptorForType : classDescriptor.getTypeConstructor().getSupertypes()) {
            ClassDescriptor classDescriptorForType2 = getClassDescriptorForType(classDescriptorForType);
            if (classDescriptorForType2.getKind() != ClassKind.INTERFACE) {
                return classDescriptorForType2;
            }
        }
        return null;
    }

    public static boolean isAnnotationClass(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean isAnonymousObject(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(32);
        }
        return isClass(declarationDescriptor) && declarationDescriptor.getName().equals(SpecialNames.NO_NAME_PROVIDED);
    }

    public static boolean isClass(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.CLASS);
    }

    public static boolean isClassOrEnumClass(DeclarationDescriptor declarationDescriptor) {
        return isClass(declarationDescriptor) || isEnumClass(declarationDescriptor);
    }

    public static boolean isCompanionObject(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.OBJECT) && ((ClassDescriptor) declarationDescriptor).isCompanionObject();
    }

    public static boolean isDescriptorWithLocalVisibility(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == Visibilities.LOCAL;
    }

    public static boolean isDirectSubclass(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(24);
        }
        if (classDescriptor2 == null) {
            $$$reportNull$$$0(25);
        }
        for (KotlinType isSameClass : classDescriptor.getTypeConstructor().getSupertypes()) {
            if (isSameClass(isSameClass, classDescriptor2.getOriginal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnumClass(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.ENUM_CLASS);
    }

    public static boolean isEnumEntry(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(34);
        }
        return isKindOf(declarationDescriptor, ClassKind.ENUM_ENTRY);
    }

    public static boolean isInterface(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.INTERFACE);
    }

    private static boolean isKindOf(DeclarationDescriptor declarationDescriptor, ClassKind classKind) {
        if (classKind == null) {
            $$$reportNull$$$0(35);
        }
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
    }

    public static boolean isLocal(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        while (declarationDescriptor != null) {
            if (isAnonymousObject(declarationDescriptor) || isDescriptorWithLocalVisibility(declarationDescriptor)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    private static boolean isSameClass(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(28);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(29);
        }
        ClassifierDescriptor declarationDescriptor2 = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor2 != null) {
            DeclarationDescriptor original = declarationDescriptor2.getOriginal();
            if ((original instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).getTypeConstructor().equals(((ClassifierDescriptor) original).getTypeConstructor())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSealedClass(DeclarationDescriptor declarationDescriptor) {
        return isKindOf(declarationDescriptor, ClassKind.CLASS) && ((ClassDescriptor) declarationDescriptor).getModality() == Modality.SEALED;
    }

    public static boolean isSubclass(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(26);
        }
        if (classDescriptor2 == null) {
            $$$reportNull$$$0(27);
        }
        return isSubtypeOfClass(classDescriptor.getDefaultType(), classDescriptor2.getOriginal());
    }

    public static boolean isSubtypeOfClass(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(30);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(31);
        }
        if (isSameClass(kotlinType, declarationDescriptor)) {
            return true;
        }
        for (KotlinType isSubtypeOfClass : kotlinType.getConstructor().getSupertypes()) {
            if (isSubtypeOfClass(isSubtypeOfClass, declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTopLevelDeclaration(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor);
    }

    public static boolean shouldRecordInitializerForProperty(VariableDescriptor variableDescriptor, KotlinType kotlinType) {
        if (variableDescriptor == null) {
            $$$reportNull$$$0(59);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(60);
        }
        boolean z = false;
        if (!variableDescriptor.isVar() && !KotlinTypeKt.isError(kotlinType)) {
            if (TypeUtils.acceptsNullable(kotlinType)) {
                return true;
            }
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(variableDescriptor);
            if (KotlinBuiltIns.isPrimitiveType(kotlinType) || KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getStringType(), kotlinType) || KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getNumber().getDefaultType(), kotlinType) || KotlinTypeChecker.DEFAULT.equalTypes(builtIns.getAnyType(), kotlinType) || UnsignedTypes.INSTANCE.isUnsignedType(kotlinType)) {
                z = true;
            }
        }
        return z;
    }

    public static <D extends CallableMemberDescriptor> D unwrapFakeOverride(D d) {
        if (d == null) {
            $$$reportNull$$$0(55);
        }
        while (d.getKind() == Kind.FAKE_OVERRIDE) {
            Collection overriddenDescriptors = d.getOverriddenDescriptors();
            if (!overriddenDescriptors.isEmpty()) {
                d = (CallableMemberDescriptor) overriddenDescriptors.iterator().next();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Fake override should have at least one overridden descriptor: ");
                sb.append(d);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (d == null) {
            $$$reportNull$$$0(56);
        }
        return d;
    }

    public static <D extends DeclarationDescriptorWithVisibility> D unwrapFakeOverrideToAnyDeclaration(D d) {
        if (d == null) {
            $$$reportNull$$$0(57);
        }
        if (d instanceof CallableMemberDescriptor) {
            return unwrapFakeOverride((CallableMemberDescriptor) d);
        }
        if (d == null) {
            $$$reportNull$$$0(58);
        }
        return d;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, code=D, for r1v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> D getParentOfType(D r1, java.lang.Class<D> r2, boolean r3) {
        /*
            if (r2 != 0) goto L_0x0007
            r0 = 17
            $$$reportNull$$$0(r0)
        L_0x0007:
            r0 = 0
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            if (r3 == 0) goto L_0x0011
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.getContainingDeclaration()
        L_0x0011:
            if (r1 == 0) goto L_0x001f
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L_0x001a
            return r1
        L_0x001a:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.getContainingDeclaration()
            goto L_0x0011
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Class, boolean):kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor");
    }

    public static ModuleDescriptor getContainingModuleOrNull(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(21);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).getModule();
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }
}
