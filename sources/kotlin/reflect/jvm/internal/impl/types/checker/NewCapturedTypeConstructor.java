package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {
    private final TypeProjection projection;
    private List<? extends UnwrappedType> supertypes;

    public NewCapturedTypeConstructor(TypeProjection typeProjection, List<? extends UnwrappedType> list) {
        this.projection = typeProjection;
        this.supertypes = list;
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = getProjection().getType();
        C12880j.m40222a((Object) type, "projection.type");
        return TypeUtilsKt.getBuiltIns(type);
    }

    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public List<TypeParameterDescriptor> getParameters() {
        return C13185o.m40513a();
    }

    public TypeProjection getProjection() {
        return this.projection;
    }

    public final void initializeSupertypes(List<? extends UnwrappedType> list) {
        boolean z = this.supertypes == null;
        if (!C13147x.f29590a || z) {
            this.supertypes = list;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Already initialized! oldValue = ");
        sb.append(this.supertypes);
        sb.append(", newValue = ");
        sb.append(list);
        throw new AssertionError(sb.toString());
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedType(");
        sb.append(getProjection());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(typeProjection, list);
    }

    public List<UnwrappedType> getSupertypes() {
        List<? extends UnwrappedType> list = this.supertypes;
        return list != null ? list : C13185o.m40513a();
    }
}
