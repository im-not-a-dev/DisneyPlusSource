package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C12907r;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithSpecialGenericSignature {
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final List<NameAndSignature> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final Set<Name> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final Map<NameAndSignature, TypeSafeBarrierDescription> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();
    private static final Map<String, TypeSafeBarrierDescription> SIGNATURE_TO_DEFAULT_VALUES_MAP;

    /* compiled from: specialBuiltinMembers.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        private SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    public enum TypeSafeBarrierDescription {
        NULL(null),
        INDEX(Integer.valueOf(-1)),
        FALSE(Boolean.valueOf(false));
        
        private final Object defaultValue;

        /* compiled from: specialBuiltinMembers.kt */
        static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, null, null);
            }
        }

        private TypeSafeBarrierDescription(Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        String str;
        Set b = C13188p0.m40533b("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) b, 10));
        Iterator it = b.iterator();
        while (true) {
            str = "JvmPrimitiveType.BOOLEAN.desc";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            C12880j.m40222a((Object) desc, str);
            arrayList.add(SpecialBuiltinMembers.method("java/util/Collection", str2, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList;
        List<NameAndSignature> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list, 10));
        for (NameAndSignature signature : list) {
            arrayList2.add(signature.getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList2;
        List<NameAndSignature> list2 = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) list2, 10));
        for (NameAndSignature name : list2) {
            arrayList3.add(name.getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList3;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String str3 = "Collection";
        String javaUtil = signatureBuildingComponents.javaUtil(str3);
        String desc2 = JvmPrimitiveType.BOOLEAN.getDesc();
        C12880j.m40222a((Object) desc2, str);
        String str4 = "Ljava/lang/Object;";
        String javaUtil2 = signatureBuildingComponents.javaUtil(str3);
        String desc3 = JvmPrimitiveType.BOOLEAN.getDesc();
        C12880j.m40222a((Object) desc3, str);
        String str5 = "remove";
        String str6 = "Map";
        String javaUtil3 = signatureBuildingComponents.javaUtil(str6);
        String desc4 = JvmPrimitiveType.BOOLEAN.getDesc();
        C12880j.m40222a((Object) desc4, str);
        String javaUtil4 = signatureBuildingComponents.javaUtil(str6);
        String desc5 = JvmPrimitiveType.BOOLEAN.getDesc();
        C12880j.m40222a((Object) desc5, str);
        String javaUtil5 = signatureBuildingComponents.javaUtil(str6);
        String desc6 = JvmPrimitiveType.BOOLEAN.getDesc();
        C12880j.m40222a((Object) desc6, str);
        String str7 = "Ljava/lang/Object;Ljava/lang/Object;";
        String str8 = "List";
        String javaUtil6 = signatureBuildingComponents.javaUtil(str8);
        String desc7 = JvmPrimitiveType.INT.getDesc();
        String str9 = "JvmPrimitiveType.INT.desc";
        C12880j.m40222a((Object) desc7, str9);
        String javaUtil7 = signatureBuildingComponents.javaUtil(str8);
        String desc8 = JvmPrimitiveType.INT.getDesc();
        C12880j.m40222a((Object) desc8, str9);
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = C13173j0.m40356a(C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil, "contains", str4, desc2), TypeSafeBarrierDescription.FALSE), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil2, str5, str4, desc3), TypeSafeBarrierDescription.FALSE), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil3, "containsKey", str4, desc4), TypeSafeBarrierDescription.FALSE), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil4, "containsValue", str4, desc5), TypeSafeBarrierDescription.FALSE), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil5, str5, str7, desc6), TypeSafeBarrierDescription.FALSE), C12907r.m40244a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil(str6), "getOrDefault", str7, str4), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), C12907r.m40244a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil(str6), "get", str4, str4), TypeSafeBarrierDescription.NULL), C12907r.m40244a(SpecialBuiltinMembers.method(signatureBuildingComponents.javaUtil(str6), str5, str4, str4), TypeSafeBarrierDescription.NULL), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil6, "indexOf", str4, desc7), TypeSafeBarrierDescription.INDEX), C12907r.m40244a(SpecialBuiltinMembers.method(javaUtil7, "lastIndexOf", str4, desc8), TypeSafeBarrierDescription.INDEX));
        Map<NameAndSignature, TypeSafeBarrierDescription> map = GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        Set<NameAndSignature> a = C13190q0.m40534a(GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), (Iterable) ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        ArrayList arrayList4 = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (NameAndSignature name2 : a) {
            arrayList4.add(name2.getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = C13199w.m40609t(arrayList4);
        ArrayList arrayList5 = new ArrayList(C13187p.m40525a((Iterable) a, 10));
        for (NameAndSignature signature2 : a) {
            arrayList5.add(signature2.getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = C13199w.m40609t(arrayList5);
    }

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    /* access modifiers changed from: private */
    public final boolean getHasErasedValueParametersInJava(CallableMemberDescriptor callableMemberDescriptor) {
        return C13199w.m40564a((Iterable) ERASED_VALUE_PARAMETERS_SIGNATURES, (Object) MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(FunctionDescriptor functionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        C12880j.m40222a((Object) name, "functionDescriptor.name");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return null;
        }
        return (FunctionDescriptor) DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, C12964x3e04c33b.INSTANCE, 1, null);
    }

    public static final SpecialSignatureInfo getSpecialSignatureInfo(CallableMemberDescriptor callableMemberDescriptor) {
        SpecialSignatureInfo specialSignatureInfo;
        if (!ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(callableMemberDescriptor.getName())) {
            return null;
        }
        CallableMemberDescriptor firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, C12965xdb572182.INSTANCE, 1, null);
        if (firstOverridden$default != null) {
            String computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(firstOverridden$default);
            if (computeJvmSignature != null) {
                if (ERASED_COLLECTION_PARAMETER_SIGNATURES.contains(computeJvmSignature)) {
                    return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
                }
                if (((TypeSafeBarrierDescription) C13173j0.m40359b((Map) SIGNATURE_TO_DEFAULT_VALUES_MAP, (Object) computeJvmSignature)) == TypeSafeBarrierDescription.NULL) {
                    specialSignatureInfo = SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
                } else {
                    specialSignatureInfo = SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                }
                return specialSignatureInfo;
            }
        }
        return null;
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(Name name) {
        return ERASED_VALUE_PARAMETERS_SHORT_NAMES.contains(name);
    }
}
