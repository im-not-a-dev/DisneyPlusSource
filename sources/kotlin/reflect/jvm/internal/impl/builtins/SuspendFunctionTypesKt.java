package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: suspendFunctionTypes.kt */
public final class SuspendFunctionTypesKt {
    private static final MutableClassDescriptor FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL;
    private static final MutableClassDescriptor FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE;

    static {
        ModuleDescriptor errorModule = ErrorUtils.getErrorModule();
        String str = "ErrorUtils.getErrorModule()";
        C12880j.m40222a((Object) errorModule, str);
        FqName fqName = DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;
        C12880j.m40222a((Object) fqName, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(new EmptyPackageFragmentDescriptor(errorModule, fqName), ClassKind.INTERFACE, false, false, DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL.shortName(), SourceElement.NO_SOURCE, LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor.setModality(Modality.ABSTRACT);
        mutableClassDescriptor.setVisibility(Visibilities.PUBLIC);
        String str2 = "T";
        mutableClassDescriptor.setTypeParameterDescriptors(C13183n.m40498a(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier(str2), 0)));
        mutableClassDescriptor.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL = mutableClassDescriptor;
        ModuleDescriptor errorModule2 = ErrorUtils.getErrorModule();
        C12880j.m40222a((Object) errorModule2, str);
        FqName fqName2 = DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE;
        C12880j.m40222a((Object) fqName2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        MutableClassDescriptor mutableClassDescriptor2 = new MutableClassDescriptor(new EmptyPackageFragmentDescriptor(errorModule2, fqName2), ClassKind.INTERFACE, false, false, DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_RELEASE.shortName(), SourceElement.NO_SOURCE, LockBasedStorageManager.NO_LOCKS);
        mutableClassDescriptor2.setModality(Modality.ABSTRACT);
        mutableClassDescriptor2.setVisibility(Visibilities.PUBLIC);
        mutableClassDescriptor2.setTypeParameterDescriptors(C13183n.m40498a(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor2, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier(str2), 0)));
        mutableClassDescriptor2.createTypeConstructor();
        FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE = mutableClassDescriptor2;
    }

    public static final boolean isContinuation(FqName fqName, boolean z) {
        if (z) {
            return C12880j.m40224a((Object) fqName, (Object) DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_RELEASE);
        }
        return C12880j.m40224a((Object) fqName, (Object) DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL);
    }

    public static final SimpleType transformSuspendFunctionToRuntimeFunctionType(KotlinType kotlinType, boolean z) {
        TypeConstructor typeConstructor;
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        if (!C13147x.f29590a || isSuspendFunctionType) {
            KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
            Annotations annotations = kotlinType.getAnnotations();
            KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
            List<TypeProjection> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType);
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameterTypesFromFunctionType, 10));
            for (TypeProjection type : valueParameterTypesFromFunctionType) {
                arrayList.add(type.getType());
            }
            Annotations empty = Annotations.Companion.getEMPTY();
            if (z) {
                typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.getTypeConstructor();
            } else {
                typeConstructor = FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.getTypeConstructor();
            }
            C12880j.m40222a((Object) typeConstructor, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
            List a = C13199w.m40563a((Collection) arrayList, (Object) KotlinTypeFactory.simpleType(empty, typeConstructor, C13183n.m40498a(TypeUtilsKt.asTypeProjection(FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType))), false));
            SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType();
            C12880j.m40222a((Object) nullableAnyType, "suspendFunType.builtIns.nullableAnyType");
            return FunctionTypesKt.createFunctionType$default(builtIns, annotations, receiverTypeFromFunctionType, a, null, nullableAnyType, false, 64, null).makeNullableAsSpecified(kotlinType.isMarkedNullable());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This type should be suspend function type: ");
        sb.append(kotlinType);
        throw new AssertionError(sb.toString());
    }
}
