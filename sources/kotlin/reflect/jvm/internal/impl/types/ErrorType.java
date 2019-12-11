package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: ErrorType.kt */
public class ErrorType extends SimpleType {
    private final List<TypeProjection> arguments;
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final MemberScope memberScope;

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2) {
        this(typeConstructor, memberScope2, null, false, 12, null);
    }

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            list = C13185o.m40513a();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(typeConstructor, memberScope2, list, z);
    }

    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public SimpleType replaceAnnotations(Annotations annotations) {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getConstructor().toString());
        sb.append(getArguments().isEmpty() ? "" : C13199w.m40558a(getArguments(), ", ", "<", ">", -1, "...", null));
        return sb.toString();
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        return new ErrorType(getConstructor(), getMemberScope(), getArguments(), z);
    }

    public ErrorType(TypeConstructor typeConstructor, MemberScope memberScope2, List<? extends TypeProjection> list, boolean z) {
        this.constructor = typeConstructor;
        this.memberScope = memberScope2;
        this.arguments = list;
        this.isMarkedNullable = z;
    }
}
