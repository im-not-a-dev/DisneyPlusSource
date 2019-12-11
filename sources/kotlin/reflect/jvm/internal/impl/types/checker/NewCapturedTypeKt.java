package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13142s;
import kotlin.C13145v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeKt {
    public static final SimpleType captureFromArguments(SimpleType simpleType, CaptureStatus captureStatus, Function2<? super Integer, ? super NewCapturedType, C13145v> function2) {
        boolean z;
        if (simpleType.getArguments().size() != simpleType.getConstructor().getParameters().size()) {
            return null;
        }
        List<TypeProjection> arguments = simpleType.getArguments();
        boolean z2 = true;
        if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
            Iterator it = arguments.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((TypeProjection) it.next()).getProjectionKind() == Variance.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) arguments, 10));
        for (TypeProjection typeProjection : arguments) {
            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                typeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, (typeProjection.isStarProjection() || typeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjection.getType().unwrap(), typeProjection));
            }
            arrayList.add(typeProjection);
        }
        TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create(simpleType.getConstructor(), arrayList).buildSubstitutor();
        int size = arguments.size();
        for (int i = 0; i < size; i++) {
            TypeProjection typeProjection2 = (TypeProjection) arguments.get(i);
            TypeProjection typeProjection3 = (TypeProjection) arrayList.get(i);
            if (typeProjection2.getProjectionKind() != Variance.INVARIANT) {
                Object obj = simpleType.getConstructor().getParameters().get(i);
                Intrinsics.checkReturnedValueIsNotNull(obj, "type.constructor.parameters[index]");
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) obj).getUpperBounds();
                Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "type.constructor.parameters[index].upperBounds");
                List arrayList2 = new ArrayList(C13187p.m40525a((Iterable) upperBounds, 10));
                for (KotlinType safeSubstitute : upperBounds) {
                    arrayList2.add(NewKotlinTypeChecker.INSTANCE.transformToNewType(buildSubstitutor.safeSubstitute(safeSubstitute, Variance.INVARIANT).unwrap()));
                }
                if (!typeProjection2.isStarProjection() && typeProjection2.getProjectionKind() == Variance.OUT_VARIANCE) {
                    arrayList2 = C13199w.m40563a((Collection) arrayList2, (Object) NewKotlinTypeChecker.INSTANCE.transformToNewType(typeProjection2.getType().unwrap()));
                }
                KotlinType type = typeProjection3.getType();
                if (type != null) {
                    NewCapturedType newCapturedType = (NewCapturedType) type;
                    newCapturedType.getConstructor().initializeSupertypes(arrayList2);
                    function2.invoke(Integer.valueOf(i), newCapturedType);
                } else {
                    throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
            }
        }
        return KotlinTypeFactory.simpleType(simpleType.getAnnotations(), simpleType.getConstructor(), arrayList, simpleType.isMarkedNullable());
    }

    public static /* synthetic */ SimpleType captureFromArguments$default(SimpleType simpleType, CaptureStatus captureStatus, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = FunctionsKt.getDO_NOTHING_2();
        }
        return captureFromArguments(simpleType, captureStatus, function2);
    }
}
