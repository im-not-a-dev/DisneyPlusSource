package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.C12898l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* compiled from: TypeSubstitution.kt */
public final class TypeSubstitutionKt {
    public static final SimpleType asSimpleType(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SimpleType)) {
            unwrap = null;
        }
        SimpleType simpleType = (SimpleType) unwrap;
        if (simpleType != null) {
            return simpleType;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This is should be simple type: ");
        sb.append(kotlinType);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> list, Annotations annotations) {
        KotlinType kotlinType2;
        if ((list.isEmpty() || list == kotlinType.getArguments()) && annotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap;
            kotlinType2 = KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), list, annotations), replace(flexibleType.getUpperBound(), list, annotations));
        } else if (unwrap instanceof SimpleType) {
            kotlinType2 = replace((SimpleType) unwrap, list, annotations);
        } else {
            throw new C12898l();
        }
        return kotlinType2;
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        return replace(kotlinType, list, annotations);
    }

    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, Annotations annotations, int i, Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = simpleType.getAnnotations();
        }
        return replace(simpleType, list, annotations);
    }

    public static final SimpleType replace(SimpleType simpleType, List<? extends TypeProjection> list, Annotations annotations) {
        if (list.isEmpty() && annotations == simpleType.getAnnotations()) {
            return simpleType;
        }
        if (list.isEmpty()) {
            return simpleType.replaceAnnotations(annotations);
        }
        return KotlinTypeFactory.simpleType(annotations, simpleType.getConstructor(), list, simpleType.isMarkedNullable());
    }
}
