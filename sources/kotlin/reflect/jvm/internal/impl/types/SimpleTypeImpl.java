package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope;

/* compiled from: KotlinTypeFactory.kt */
final class SimpleTypeImpl extends SimpleType {
    private final List<TypeProjection> arguments;
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    private final MemberScope memberScope;

    public SimpleTypeImpl(TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z, MemberScope memberScope2) {
        this.constructor = typeConstructor;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.memberScope = memberScope2;
        if (getMemberScope() instanceof ErrorScope) {
            StringBuilder sb = new StringBuilder();
            sb.append("SimpleTypeImpl should not be created for error type: ");
            sb.append(getMemberScope());
            sb.append(10);
            sb.append(getConstructor());
            throw new IllegalStateException(sb.toString());
        }
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

    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        if (z) {
            return new NullableSimpleType(this);
        }
        return new NotNullSimpleType(this);
    }

    public SimpleType replaceAnnotations(Annotations annotations) {
        if (annotations.isEmpty()) {
            return this;
        }
        return new AnnotatedSimpleType(this, annotations);
    }
}
