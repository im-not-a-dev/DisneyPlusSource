package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* compiled from: StubType.kt */
public final class StubType extends SimpleType implements StubTypeMarker {
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final MemberScope memberScope;
    private final TypeConstructor originalTypeVariable;

    public StubType(TypeConstructor typeConstructor, boolean z, TypeConstructor typeConstructor2, MemberScope memberScope2) {
        this.originalTypeVariable = typeConstructor;
        this.isMarkedNullable = z;
        this.constructor = typeConstructor2;
        this.memberScope = memberScope2;
    }

    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public List<TypeProjection> getArguments() {
        return C13185o.m40513a();
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
        sb.append("NonFixed: ");
        sb.append(this.originalTypeVariable);
        return sb.toString();
    }

    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        return new StubType(this.originalTypeVariable, z, getConstructor(), getMemberScope());
    }
}
