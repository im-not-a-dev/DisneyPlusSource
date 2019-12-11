package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C12907r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinMethodsWithDifferentJvmName {
    public static final BuiltinMethodsWithDifferentJvmName INSTANCE = new BuiltinMethodsWithDifferentJvmName();
    private static final Map<Name, List<Name>> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final Map<NameAndSignature, Name> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    private static final List<Name> ORIGINAL_SHORT_NAMES;
    private static final NameAndSignature REMOVE_AT_NAME_AND_SIGNATURE;
    /* access modifiers changed from: private */
    public static final Map<String, Name> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    static {
        String desc = JvmPrimitiveType.INT.getDesc();
        String str = "JvmPrimitiveType.INT.desc";
        Intrinsics.checkReturnedValueIsNotNull((Object) desc, str);
        REMOVE_AT_NAME_AND_SIGNATURE = SpecialBuiltinMembers.method("java/util/List", "removeAt", desc, "Ljava/lang/Object;");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String str2 = "Number";
        String javaLang = signatureBuildingComponents.javaLang(str2);
        String desc2 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc2, "JvmPrimitiveType.BYTE.desc");
        String str3 = "";
        String javaLang2 = signatureBuildingComponents.javaLang(str2);
        String desc3 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc3, "JvmPrimitiveType.SHORT.desc");
        String javaLang3 = signatureBuildingComponents.javaLang(str2);
        String desc4 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc4, str);
        String javaLang4 = signatureBuildingComponents.javaLang(str2);
        String desc5 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc5, "JvmPrimitiveType.LONG.desc");
        String javaLang5 = signatureBuildingComponents.javaLang(str2);
        String desc6 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc6, "JvmPrimitiveType.FLOAT.desc");
        String javaLang6 = signatureBuildingComponents.javaLang(str2);
        String desc7 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc7, "JvmPrimitiveType.DOUBLE.desc");
        String javaLang7 = signatureBuildingComponents.javaLang("CharSequence");
        String desc8 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc8, str);
        String desc9 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkReturnedValueIsNotNull((Object) desc9, "JvmPrimitiveType.CHAR.desc");
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = C13173j0.m40356a(C12907r.m40244a(SpecialBuiltinMembers.method(javaLang, "toByte", str3, desc2), Name.identifier("byteValue")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang2, "toShort", str3, desc3), Name.identifier("shortValue")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang3, "toInt", str3, desc4), Name.identifier("intValue")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang4, "toLong", str3, desc5), Name.identifier("longValue")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang5, "toFloat", str3, desc6), Name.identifier("floatValue")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang6, "toDouble", str3, desc7), Name.identifier("doubleValue")), C12907r.m40244a(REMOVE_AT_NAME_AND_SIGNATURE, Name.identifier("remove")), C12907r.m40244a(SpecialBuiltinMembers.method(javaLang7, "get", desc8, desc9), Name.identifier("charAt")));
        Map<NameAndSignature, Name> map = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap;
        Set<NameAndSignature> keySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) keySet, 10));
        for (NameAndSignature name : keySet) {
            arrayList.add(name.getName());
        }
        ORIGINAL_SHORT_NAMES = arrayList;
        Set<Entry> entrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        ArrayList<Pair> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) entrySet, 10));
        for (Entry entry2 : entrySet) {
            arrayList2.add(new Pair(((NameAndSignature) entry2.getKey()).getName(), entry2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Pair pair : arrayList2) {
            Name name2 = (Name) pair.mo31016d();
            Object obj = linkedHashMap2.get(name2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(name2, obj);
            }
            ((List) obj).add((Name) pair.mo31015c());
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap2;
    }

    private BuiltinMethodsWithDifferentJvmName() {
    }

    public final List<Name> getBuiltinFunctionNamesByJvmName(Name name) {
        List<Name> list = (List) JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP.get(name);
        return list != null ? list : C13185o.m40513a();
    }

    public final Name getJvmName(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Map<String, Name> map = SIGNATURE_TO_JVM_REPRESENTATION_NAME;
        String computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor);
        if (computeJvmSignature != null) {
            return (Name) map.get(computeJvmSignature);
        }
        return null;
    }

    public final List<Name> getORIGINAL_SHORT_NAMES() {
        return ORIGINAL_SHORT_NAMES;
    }

    public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
        return ORIGINAL_SHORT_NAMES.contains(name);
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        return KotlinBuiltIns.isBuiltIn(simpleFunctionDescriptor) && DescriptorUtilsKt.firstOverridden$default(simpleFunctionDescriptor, false, new C12963x6ce919c0(simpleFunctionDescriptor), 1, null) != null;
    }

    public final boolean isRemoveAtByIndex(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        return Intrinsics.areEqual((Object) simpleFunctionDescriptor.getName().asString(), (Object) "removeAt") && Intrinsics.areEqual((Object) MethodSignatureMappingKt.computeJvmSignature(simpleFunctionDescriptor), (Object) REMOVE_AT_NAME_AND_SIGNATURE.getSignature());
    }
}
