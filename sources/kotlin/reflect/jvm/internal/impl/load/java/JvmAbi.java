package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

public final class JvmAbi {
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmField");
    public static final ClassId REFLECTION_FACTORY_IMPL = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "propertyName";
                break;
        }
        String str3 = "setterName";
        String str4 = "getterName";
        String str5 = "getSyntheticMethodNameForAnnotatedTypeAlias";
        String str6 = "getSyntheticMethodNameForAnnotatedProperty";
        if (i == 1) {
            objArr[1] = str6;
        } else if (i == 3) {
            objArr[1] = str5;
        } else if (i == 7) {
            objArr[1] = str4;
        } else if (i != 9) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = str5;
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = str6;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 3 || i == 7 || i == 9) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static String getterName(String str) {
        if (str == null) {
            $$$reportNull$$$0(6);
        }
        if (!startsWithIsPrefix(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("get");
            sb.append(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
            str = sb.toString();
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        return str;
    }

    public static boolean hasJvmFieldAnnotation(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (callableMemberDescriptor instanceof PropertyDescriptor) {
            FieldDescriptor backingField = ((PropertyDescriptor) callableMemberDescriptor).getBackingField();
            if (backingField != null && backingField.getAnnotations().hasAnnotation(JVM_FIELD_ANNOTATION_FQ_NAME)) {
                return true;
            }
        }
        return callableMemberDescriptor.getAnnotations().hasAnnotation(JVM_FIELD_ANNOTATION_FQ_NAME);
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(11);
        }
        return DescriptorUtils.isCompanionObject(declarationDescriptor) && DescriptorUtils.isClassOrEnumClass(declarationDescriptor.getContainingDeclaration()) && !isMappedIntrinsicCompanionObject((ClassDescriptor) declarationDescriptor);
    }

    public static boolean isGetterName(String str) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str.startsWith("get") || str.startsWith("is");
    }

    public static boolean isMappedIntrinsicCompanionObject(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        return CompanionObjectMapping.INSTANCE.isMappedIntrinsicCompanionObject(classDescriptor);
    }

    public static boolean isPropertyWithBackingFieldInOuterClass(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(10);
        }
        if (propertyDescriptor.getKind() == Kind.FAKE_OVERRIDE) {
            return false;
        }
        boolean z = true;
        if (isClassCompanionObjectWithBackingFieldsInOuter(propertyDescriptor.getContainingDeclaration())) {
            return true;
        }
        if (!DescriptorUtils.isCompanionObject(propertyDescriptor.getContainingDeclaration()) || !hasJvmFieldAnnotation(propertyDescriptor)) {
            z = false;
        }
        return z;
    }

    public static boolean isSetterName(String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        return str.startsWith("set");
    }

    public static String setterName(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(startsWithIsPrefix(str) ? str.substring(2) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        String sb2 = sb.toString();
        if (sb2 == null) {
            $$$reportNull$$$0(9);
        }
        return sb2;
    }

    public static boolean startsWithIsPrefix(String str) {
        boolean z = false;
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if ('a' > charAt || charAt > 'z') {
            z = true;
        }
        return z;
    }
}
