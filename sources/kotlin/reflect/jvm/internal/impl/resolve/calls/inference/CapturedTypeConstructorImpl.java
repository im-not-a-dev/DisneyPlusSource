package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {
    private NewCapturedTypeConstructor newTypeConstructor;
    private final TypeProjection projection;

    public CapturedTypeConstructorImpl(TypeProjection typeProjection) {
        this.projection = typeProjection;
        boolean z = getProjection().getProjectionKind() != Variance.INVARIANT;
        if (C13147x.f29590a && !z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Only nontrivial projections can be captured, not: ");
            sb.append(getProjection());
            throw new AssertionError(sb.toString());
        }
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        C12880j.m40222a((Object) builtIns, "projection.type.constructor.builtIns");
        return builtIns;
    }

    public Void getDeclarationDescriptor() {
        return null;
    }

    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    public List<TypeParameterDescriptor> getParameters() {
        return C13185o.m40513a();
    }

    public TypeProjection getProjection() {
        return this.projection;
    }

    public Collection<KotlinType> getSupertypes() {
        Object obj;
        if (getProjection().getProjectionKind() == Variance.OUT_VARIANCE) {
            obj = getProjection().getType();
        } else {
            obj = getBuiltIns().getNullableAnyType();
        }
        C12880j.m40222a(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return C13183n.m40498a(obj);
    }

    public boolean isDenotable() {
        return false;
    }

    public final void setNewTypeConstructor(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.newTypeConstructor = newCapturedTypeConstructor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedTypeConstructor(");
        sb.append(getProjection());
        sb.append(')');
        return sb.toString();
    }
}
