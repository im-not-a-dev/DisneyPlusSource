package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C12907r;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: specialBuiltinMembers.kt */
public final class BuiltinSpecialProperties {
    private static final Map<Name, List<Name>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();
    private static final Map<FqName, Name> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final Set<FqName> SPECIAL_FQ_NAMES = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
    private static final Set<Name> SPECIAL_SHORT_NAMES;

    static {
        FqNameUnsafe fqNameUnsafe = KotlinBuiltIns.FQ_NAMES._enum;
        String str = "BUILTIN_NAMES._enum";
        Intrinsics.checkReturnedValueIsNotNull((Object) fqNameUnsafe, str);
        String str2 = "name";
        FqNameUnsafe fqNameUnsafe2 = KotlinBuiltIns.FQ_NAMES._enum;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqNameUnsafe2, str);
        String str3 = "ordinal";
        FqName fqName = KotlinBuiltIns.FQ_NAMES.collection;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "BUILTIN_NAMES.collection");
        String str4 = "size";
        FqName fqName2 = KotlinBuiltIns.FQ_NAMES.map;
        String str5 = "BUILTIN_NAMES.map";
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName2, str5);
        FqNameUnsafe fqNameUnsafe3 = KotlinBuiltIns.FQ_NAMES.charSequence;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqNameUnsafe3, "BUILTIN_NAMES.charSequence");
        String str6 = "length";
        FqName fqName3 = KotlinBuiltIns.FQ_NAMES.map;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName3, str5);
        FqName fqName4 = KotlinBuiltIns.FQ_NAMES.map;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName4, str5);
        String str7 = "values";
        FqName fqName5 = KotlinBuiltIns.FQ_NAMES.map;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName5, str5);
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = C13173j0.m40356a(C12907r.m40244a(SpecialBuiltinMembers.childSafe(fqNameUnsafe, str2), Name.identifier(str2)), C12907r.m40244a(SpecialBuiltinMembers.childSafe(fqNameUnsafe2, str3), Name.identifier(str3)), C12907r.m40244a(SpecialBuiltinMembers.child(fqName, str4), Name.identifier(str4)), C12907r.m40244a(SpecialBuiltinMembers.child(fqName2, str4), Name.identifier(str4)), C12907r.m40244a(SpecialBuiltinMembers.childSafe(fqNameUnsafe3, str6), Name.identifier(str6)), C12907r.m40244a(SpecialBuiltinMembers.child(fqName3, "keys"), Name.identifier("keySet")), C12907r.m40244a(SpecialBuiltinMembers.child(fqName4, str7), Name.identifier(str7)), C12907r.m40244a(SpecialBuiltinMembers.child(fqName5, "entries"), Name.identifier("entrySet")));
        Set<Entry> entrySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.entrySet();
        ArrayList<Pair> arrayList = new ArrayList<>(C13187p.m40525a((Iterable) entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.mo31016d();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair.mo31015c());
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap;
        Set<FqName> set = SPECIAL_FQ_NAMES;
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (FqName shortName : set) {
            arrayList2.add(shortName.shortName());
        }
        SPECIAL_SHORT_NAMES = C13199w.m40609t(arrayList2);
    }

    private BuiltinSpecialProperties() {
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(CallableMemberDescriptor callableMemberDescriptor) {
        if (C13199w.m40564a((Iterable) SPECIAL_FQ_NAMES, (Object) DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        boolean z = false;
        if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return false;
        }
        Collection overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkReturnedValueIsNotNull((Object) overriddenDescriptors, "overriddenDescriptors");
        if (!(overriddenDescriptors instanceof Collection) || !overriddenDescriptors.isEmpty()) {
            Iterator it = overriddenDescriptors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it.next();
                BuiltinSpecialProperties builtinSpecialProperties = INSTANCE;
                Intrinsics.checkReturnedValueIsNotNull((Object) callableMemberDescriptor2, "it");
                if (builtinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final String getBuiltinSpecialPropertyGetterName(CallableMemberDescriptor callableMemberDescriptor) {
        boolean isBuiltIn = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        if (!C13147x.f29590a || isBuiltIn) {
            CallableMemberDescriptor firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, C12966xbe16cae4.INSTANCE, 1, null);
            if (firstOverridden$default == null) {
                return null;
            }
            Name name = (Name) PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.get(DescriptorUtilsKt.getFqNameSafe(firstOverridden$default));
            if (name != null) {
                return name.asString();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This method is defined only for builtin members, but ");
        sb.append(callableMemberDescriptor);
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name) {
        List<Name> list = (List) GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(name);
        return list != null ? list : C13185o.m40513a();
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES$descriptors_jvm() {
        return SPECIAL_SHORT_NAMES;
    }

    public final boolean hasBuiltinSpecialPropertyFqName(CallableMemberDescriptor callableMemberDescriptor) {
        if (!SPECIAL_SHORT_NAMES.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
    }
}
