package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.jvm.internal.C12880j;
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
                C12880j.m40222a((Object) str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        for (ValueParameterDescriptor valueParameterDescriptor : functionDescriptor.getValueParameters()) {
            C12880j.m40222a((Object) valueParameterDescriptor, "parameter");
            KotlinType type = valueParameterDescriptor.getType();
            C12880j.m40222a((Object) type, "parameter.type");
            appendErasedType(sb, type);
        }
        sb.append(")");
        if (z) {
            if (TypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                sb.append("V");
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                if (returnType != null) {
                    C12880j.m40222a((Object) returnType, "returnType!!");
                    appendErasedType(sb, returnType);
                } else {
                    C12880j.m40220a();
                    throw null;
                }
            }
        }
        String sb2 = sb.toString();
        C12880j.m40222a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
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
            C12880j.m40222a((Object) name, "classDescriptor.name");
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
        if (functionDescriptor.getValueParameters().size() == 1 && !SpecialBuiltinMembers.isFromJavaOrBuiltins((CallableMemberDescriptor) callableDescriptor) && !(!C12880j.m40224a((Object) functionDescriptor.getName().asString(), (Object) "remove"))) {
            FunctionDescriptor original = functionDescriptor.getOriginal();
            C12880j.m40222a((Object) original, "f.original");
            List valueParameters = original.getValueParameters();
            C12880j.m40222a((Object) valueParameters, "f.original.valueParameters");
            Object k = C13199w.m40599k(valueParameters);
            C12880j.m40222a(k, "f.original.valueParameters.single()");
            KotlinType type = ((ValueParameterDescriptor) k).getType();
            C12880j.m40222a((Object) type, "f.original.valueParameters.single().type");
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
                C12880j.m40222a((Object) original2, "overridden.original");
                List valueParameters2 = original2.getValueParameters();
                C12880j.m40222a((Object) valueParameters2, "overridden.original.valueParameters");
                Object k2 = C13199w.m40599k(valueParameters2);
                C12880j.m40222a(k2, "overridden.original.valueParameters.single()");
                KotlinType type2 = ((ValueParameterDescriptor) k2).getType();
                C12880j.m40222a((Object) type2, "overridden.original.valueParameters.single().type");
                JvmType mapToJvmType2 = mapToJvmType(type2);
                DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
                C12880j.m40222a((Object) containingDeclaration, "overridden.containingDeclaration");
                if (C12880j.m40224a((Object) DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), (Object) KotlinBuiltIns.FQ_NAMES.mutableCollection.toUnsafe()) && (mapToJvmType2 instanceof Object) && C12880j.m40224a((Object) ((Object) mapToJvmType2).getInternalName(), (Object) "java/lang/Object")) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final String getInternalName(ClassDescriptor classDescriptor) {
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqNameUnsafe unsafe = DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe();
        C12880j.m40222a((Object) unsafe, "fqNameSafe.toUnsafe()");
        ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (mapKotlinToJava == null) {
            return TypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, false, 2, null);
        }
        JvmClassName byClassId = JvmClassName.byClassId(mapKotlinToJava);
        C12880j.m40222a((Object) byClassId, "JvmClassName.byClassId(it)");
        String internalName = byClassId.getInternalName();
        C12880j.m40222a((Object) internalName, "JvmClassName.byClassId(it).internalName");
        return internalName;
    }

    public static final JvmType mapToJvmType(KotlinType kotlinType) {
        return (JvmType) TypeSignatureMappingKt.mapType$default(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.DEFAULT, TypeMappingConfigurationImpl.INSTANCE, null, null, false, 32, null);
    }
}
