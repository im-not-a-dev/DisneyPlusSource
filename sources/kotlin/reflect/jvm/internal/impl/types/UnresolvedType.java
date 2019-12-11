package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: ErrorType.kt */
public final class UnresolvedType extends ErrorType {
    private final String presentableName;

    public UnresolvedType(String str, TypeConstructor typeConstructor, MemberScope memberScope, List<? extends TypeProjection> list, boolean z) {
        super(typeConstructor, memberScope, list, z);
        this.presentableName = str;
    }

    public final String getPresentableName() {
        return this.presentableName;
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        UnresolvedType unresolvedType = new UnresolvedType(this.presentableName, getConstructor(), getMemberScope(), getArguments(), z);
        return unresolvedType;
    }
}
