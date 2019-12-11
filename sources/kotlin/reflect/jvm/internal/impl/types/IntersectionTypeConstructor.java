package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope.Companion;

/* compiled from: IntersectionTypeConstructor.kt */
public final class IntersectionTypeConstructor implements TypeConstructor {
    private final int hashCode;
    private final LinkedHashSet<KotlinType> intersectedTypes;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> collection) {
        boolean z = !collection.isEmpty();
        if (!C13147x.f29590a || z) {
            this.intersectedTypes = new LinkedHashSet<>(collection);
            this.hashCode = this.intersectedTypes.hashCode();
            return;
        }
        throw new AssertionError("Attempt to create an empty intersection");
    }

    private final String makeDebugNameForIntersectionType(Iterable<? extends KotlinType> iterable) {
        return C13199w.m40559a(C13199w.m40562a((Iterable) iterable, (Comparator) new C13119x55fe5063()), " & ", "{", "}", 0, null, null, 56, null);
    }

    public final MemberScope createScopeForKotlinType() {
        Companion companion = TypeIntersectionScope.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("member scope for intersection type ");
        sb.append(this);
        return companion.create(sb.toString(), this.intersectedTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.intersectedTypes, (Object) ((IntersectionTypeConstructor) obj).intersectedTypes);
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = ((KotlinType) this.intersectedTypes.iterator().next()).getConstructor().getBuiltIns();
        Intrinsics.checkReturnedValueIsNotNull((Object) builtIns, "intersectedTypes.iterato…xt().constructor.builtIns");
        return builtIns;
    }

    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public List<TypeParameterDescriptor> getParameters() {
        return C13185o.m40513a();
    }

    public Collection<KotlinType> getSupertypes() {
        return this.intersectedTypes;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        return makeDebugNameForIntersectionType(this.intersectedTypes);
    }
}
