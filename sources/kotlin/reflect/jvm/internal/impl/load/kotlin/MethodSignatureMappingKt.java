package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: methodSignatureMapping.kt */
public final class MethodSignatureMappingKt {
    private static final void appendErasedType(StringBuilder sb, KotlinType kotlinType) {
        sb.append(mapToJvmType(kotlinType));
    }

    public static final String computeJvmDescriptor(FunctionDescriptor functionDescriptor, boolean z, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                str = "<init>";
            } else {
                str = functionDescriptor.getName().asString();
                Intrinsics.checkReturnedValueIsNotNull((Object) str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        for (ValueParameterDescriptor valueParameterDescriptor : functionDescriptor.getValueParameters()) {
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "parameter");
            KotlinType type = valueParameterDescriptor.getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "parameter.type");
            appendErasedType(sb, type);
        }
        sb.append(")");
        if (z) {
            if (TypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                sb.append("V");
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                if (returnType != null) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) returnType, "returnType!!");
                    appendErasedType(sb, returnType);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String computeJvmDescriptor$default(FunctionDescriptor functionDescriptor, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return computeJvmDescriptor(functionDescriptor, z, z2);
    }

    public static final String computeJvmSignature(CallableDescriptor callableDescriptor) {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.isLocal(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            Name name = classDescriptor.getName();
            Intrinsics.checkReturnedValueIsNotNull((Object) name, "classDescriptor.name");
            if (name.isSpecial()) {
                return null;
            }
            CallableDescriptor original = callableDescriptor.getOriginal();
            if (!(original instanceof SimpleFunctionDescriptor)) {
                original = null;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) original;
            if (simpleFunctionDescriptor != null) {
                return signatureBuildingComponents.signature(classDescriptor, computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null));
            }
        }
        return null;
    }

    public static final boolean forceSingleValueParameterBoxing(CallableDescriptor callableDescriptor) {
        boolean z = false;
        if (!(callableDescriptor instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
        if (functionDescriptor.getValueParameters().size() == 1 && !SpecialBuiltinMembers.isFromJavaOrBuiltins((CallableMemberDescriptor) callableDescriptor) && !(!Intrinsics.areEqual((Object) functionDescriptor.getName().asString(), (Object) "remove"))) {
            FunctionDescriptor original = functionDescriptor.getOriginal();
            Intrinsics.checkReturnedValueIsNotNull((Object) original, "f.original");
            List valueParameters = original.getValueParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "f.original.valueParameters");
            Object k = C13199w.m40599k(valueParameters);
            Intrinsics.checkReturnedValueIsNotNull(k, "f.original.valueParameters.single()");
            KotlinType type = ((ValueParameterDescriptor) k).getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type, "f.original.valueParameters.single().type");
            JvmType mapToJvmType = mapToJvmType(type);
            JvmPrimitiveType jvmPrimitiveType = null;
            if (!(mapToJvmType instanceof Primitive)) {
                mapToJvmType = null;
            }
            Primitive primitive = (Primitive) mapToJvmType;
            if (primitive != null) {
                jvmPrimitiveType = primitive.getJvmPrimitiveType();
            }
            if (jvmPrimitiveType != JvmPrimitiveType.INT) {
                return false;
            }
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                FunctionDescriptor original2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal();
                Intrinsics.checkReturnedValueIsNotNull((Object) original2, "overridden.original");
                List valueParameters2 = original2.getValueParameters();
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters2, "overridden.original.valueParameters");
                Object k2 = C13199w.m40599k(valueParameters2);
                Intrinsics.checkReturnedValueIsNotNull(k2, "overridden.original.valueParameters.single()");
                KotlinType type2 = ((ValueParameterDescriptor) k2).getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type2, "overridden.original.valueParameters.single().type");
                JvmType mapToJvmType2 = mapToJvmType(type2);
                DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
                Intrinsics.checkReturnedValueIsNotNull((Object) containingDeclaration, "overridden.containingDeclaration");
                if (Intrinsics.areEqual((Object) DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), (Object) KotlinBuiltIns.FQ_NAMES.mutableCollection.toUnsafe()) && (mapToJvmType2 instanceof Object) && Intrinsics.areEqual((Object) ((Object) mapToJvmType2).getInternalName(), (Object) "java/lang/Object")) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final String getInternalName(ClassDescriptor classDescriptor) {
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqNameUnsafe unsafe = DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe();
        Intrinsics.checkReturnedValueIsNotNull((Object) unsafe, "fqNameSafe.toUnsafe()");
        ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (mapKotlinToJava == null) {
            return TypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, false, 2, null);
        }
        JvmClassName byClassId = JvmClassName.byClassId(mapKotlinToJava);
        Intrinsics.checkReturnedValueIsNotNull((Object) byClassId, "JvmClassName.byClassId(it)");
        String internalName = byClassId.getInternalName();
        Intrinsics.checkReturnedValueIsNotNull((Object) internalName, "JvmClassName.byClassId(it).internalName");
        return internalName;
    }

    public static final JvmType mapToJvmType(KotlinType kotlinType) {
        return (JvmType) TypeSignatureMappingKt.mapType$default(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.DEFAULT, TypeMappingConfigurationImpl.INSTANCE, null, null, false, 32, null);
    }
}
