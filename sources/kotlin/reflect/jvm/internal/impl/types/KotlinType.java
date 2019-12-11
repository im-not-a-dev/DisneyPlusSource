package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* compiled from: KotlinType.kt */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    private KotlinType() {
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (isMarkedNullable() != kotlinType.isMarkedNullable() || !StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap())) {
            z = false;
        }
        return z;
    }

    public abstract List<TypeProjection> getArguments();

    public abstract TypeConstructor getConstructor();

    public abstract MemberScope getMemberScope();

    public final int hashCode() {
        if (KotlinTypeKt.isError(this)) {
            return super.hashCode();
        }
        return (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    public abstract boolean isMarkedNullable();

    public abstract UnwrappedType unwrap();

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
