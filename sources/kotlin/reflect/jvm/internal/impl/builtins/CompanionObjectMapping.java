package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: CompanionObjectMapping.kt */
public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    private static final LinkedHashSet<ClassId> classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        C12880j.m40222a((Object) set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) set, 10));
        for (PrimitiveType primitiveFqName : set) {
            arrayList.add(KotlinBuiltIns.getPrimitiveFqName(primitiveFqName));
        }
        List<FqName> a = C13199w.m40563a((Collection) C13199w.m40563a((Collection) C13199w.m40563a((Collection) arrayList, (Object) KotlinBuiltIns.FQ_NAMES.string.toSafe()), (Object) KotlinBuiltIns.FQ_NAMES._boolean.toSafe()), (Object) KotlinBuiltIns.FQ_NAMES._enum.toSafe());
        LinkedHashSet<ClassId> linkedHashSet = new LinkedHashSet<>();
        for (FqName fqName : a) {
            linkedHashSet.add(ClassId.topLevel(fqName));
        }
        classIds = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        Set<ClassId> unmodifiableSet = Collections.unmodifiableSet(classIds);
        C12880j.m40222a((Object) unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    public final boolean isMappedIntrinsicCompanionObject(ClassDescriptor classDescriptor) {
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            LinkedHashSet<ClassId> linkedHashSet = classIds;
            ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
            if (C13199w.m40564a((Iterable) linkedHashSet, (Object) classId != null ? classId.getOuterClassId() : null)) {
                return true;
            }
        }
        return false;
    }
}
