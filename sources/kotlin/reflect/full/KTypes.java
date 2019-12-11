package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, mo31007d2 = {"isSubtypeOf", "", "Lkotlin/reflect/KType;", "other", "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: KTypes.kt */
public final class KTypes {
    public static final boolean isSubtypeOf(KType kType, KType kType2) {
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl) kType).getType(), ((KTypeImpl) kType2).getType());
    }

    public static final boolean isSupertypeOf(KType kType, KType kType2) {
        return isSubtypeOf(kType2, kType);
    }

    public static final KType withNullability(KType kType, boolean z) {
        if (kType.isMarkedNullable()) {
            if (!z) {
                KotlinType makeNotNullable = TypeUtils.makeNotNullable(((KTypeImpl) kType).getType());
                C12880j.m40222a((Object) makeNotNullable, "TypeUtils.makeNotNullabl…(this as KTypeImpl).type)");
                kType = new KTypeImpl(makeNotNullable, new KTypes$withNullability$1(kType));
            }
            return kType;
        }
        KotlinType type = ((KTypeImpl) kType).getType();
        if (FlexibleTypesKt.isFlexible(type)) {
            KotlinType makeNullableAsSpecified = TypeUtils.makeNullableAsSpecified(type, z);
            C12880j.m40222a((Object) makeNullableAsSpecified, "TypeUtils.makeNullableAs…ied(kotlinType, nullable)");
            return new KTypeImpl(makeNullableAsSpecified, new KTypes$withNullability$2(kType));
        }
        if (z) {
            KotlinType makeNullable = TypeUtils.makeNullable(type);
            C12880j.m40222a((Object) makeNullable, "TypeUtils.makeNullable(kotlinType)");
            kType = new KTypeImpl(makeNullable, new KTypes$withNullability$3(kType));
        }
        return kType;
    }
}
