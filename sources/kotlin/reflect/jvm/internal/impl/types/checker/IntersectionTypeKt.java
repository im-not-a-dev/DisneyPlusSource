package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.C12898l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: IntersectionType.kt */
public final class IntersectionTypeKt {
    public static final UnwrappedType intersectTypes(List<? extends UnwrappedType> list) {
        SimpleType simpleType;
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        } else if (size == 1) {
            return (UnwrappedType) C13199w.m40599k((List) list);
        } else {
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            boolean z = false;
            boolean z2 = false;
            for (UnwrappedType unwrappedType : list) {
                z = z || KotlinTypeKt.isError(unwrappedType);
                if (unwrappedType instanceof SimpleType) {
                    simpleType = (SimpleType) unwrappedType;
                } else if (!(unwrappedType instanceof FlexibleType)) {
                    throw new C12898l();
                } else if (DynamicTypesKt.isDynamic(unwrappedType)) {
                    return unwrappedType;
                } else {
                    simpleType = ((FlexibleType) unwrappedType).getLowerBound();
                    z2 = true;
                }
                arrayList.add(simpleType);
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Intersection of error types: ");
                sb.append(list);
                SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
                Intrinsics.checkReturnedValueIsNotNull((Object) createErrorType, "ErrorUtils.createErrorTy… of error types: $types\")");
                return createErrorType;
            } else if (!z2) {
                return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) list, 10));
                for (UnwrappedType upperIfFlexible : list) {
                    arrayList2.add(FlexibleTypesKt.upperIfFlexible(upperIfFlexible));
                }
                return KotlinTypeFactory.flexibleType(TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList), TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList2));
            }
        }
    }
}
