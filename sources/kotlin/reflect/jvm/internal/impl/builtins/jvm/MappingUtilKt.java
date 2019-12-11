package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: mappingUtil.kt */
public final class MappingUtilKt {
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        boolean z = classDescriptor.getDeclaredTypeParameters().size() == classDescriptor2.getDeclaredTypeParameters().size();
        if (!C13147x.f29590a || z) {
            Companion companion = TypeConstructorSubstitution.Companion;
            List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredTypeParameters, "from.declaredTypeParameters");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) declaredTypeParameters, 10));
            for (TypeParameterDescriptor typeConstructor : declaredTypeParameters) {
                arrayList.add(typeConstructor.getTypeConstructor());
            }
            List<TypeParameterDescriptor> declaredTypeParameters2 = classDescriptor2.getDeclaredTypeParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) declaredTypeParameters2, "to.declaredTypeParameters");
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) declaredTypeParameters2, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : declaredTypeParameters2) {
                Intrinsics.checkReturnedValueIsNotNull((Object) typeParameterDescriptor, "it");
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "it.defaultType");
                arrayList2.add(TypeUtilsKt.asTypeProjection(defaultType));
            }
            return Companion.createByConstructorsMap$default(companion, C13173j0.m40351a((Iterable) C13199w.m40586e((Iterable) arrayList, (Iterable) arrayList2)), false, 2, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(classDescriptor);
        sb.append(" and ");
        sb.append(classDescriptor2);
        sb.append(" should have same number of type parameters, ");
        sb.append("but ");
        sb.append(classDescriptor.getDeclaredTypeParameters().size());
        sb.append(" / ");
        sb.append(classDescriptor2.getDeclaredTypeParameters().size());
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
