package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* compiled from: UnsignedType.kt */
public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();
    private static final HashMap<ClassId, ClassId> arrayClassIdToUnsignedClassId = new HashMap<>();
    private static final Set<Name> arrayClassesShortNames;
    private static final HashMap<ClassId, ClassId> unsignedClassIdToArrayClassId = new HashMap<>();
    private static final Set<Name> unsignedTypeNames;

    static {
        UnsignedType[] values;
        UnsignedType[] values2 = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (UnsignedType typeName : values2) {
            arrayList.add(typeName.getTypeName());
        }
        unsignedTypeNames = C13199w.m40609t(arrayList);
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType arrayClassId : values3) {
            linkedHashSet.add(arrayClassId.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = linkedHashSet;
        for (UnsignedType unsignedType : UnsignedType.values()) {
            arrayClassIdToUnsignedClassId.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    public final ClassId getUnsignedClassIdByArrayClassId(ClassId classId) {
        return (ClassId) arrayClassIdToUnsignedClassId.get(classId);
    }

    public final boolean isShortNameOfUnsignedArray(Name name) {
        return arrayClassesShortNames.contains(name);
    }

    public final boolean isUnsignedClass(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && Intrinsics.areEqual((Object) ((PackageFragmentDescriptor) containingDeclaration).getFqName(), (Object) KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(declarationDescriptor.getName());
    }

    public final boolean isUnsignedType(KotlinType kotlinType) {
        if (TypeUtils.noExpectedType(kotlinType)) {
            return false;
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return false;
        }
        Intrinsics.checkReturnedValueIsNotNull((Object) declarationDescriptor, "type.constructor.declara…escriptor ?: return false");
        return isUnsignedClass(declarationDescriptor);
    }
}
