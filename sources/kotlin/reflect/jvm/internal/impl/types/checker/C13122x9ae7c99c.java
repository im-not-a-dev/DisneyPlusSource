package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext$Companion$classicSubstitutionSupertypePolicy$2 */
/* compiled from: ClassicTypeCheckerContext.kt */
public final class C13122x9ae7c99c extends DoCustomTransform {
    final /* synthetic */ TypeSubstitutor $substitutor;
    final /* synthetic */ ClassicTypeSystemContext $this_classicSubstitutionSupertypePolicy;

    C13122x9ae7c99c(ClassicTypeSystemContext classicTypeSystemContext, TypeSubstitutor typeSubstitutor) {
        this.$this_classicSubstitutionSupertypePolicy = classicTypeSystemContext;
        this.$substitutor = typeSubstitutor;
    }

    public SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
        ClassicTypeSystemContext classicTypeSystemContext = this.$this_classicSubstitutionSupertypePolicy;
        TypeSubstitutor typeSubstitutor = this.$substitutor;
        SimpleTypeMarker lowerBoundIfFlexible = classicTypeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker);
        if (lowerBoundIfFlexible != null) {
            KotlinType safeSubstitute = typeSubstitutor.safeSubstitute((KotlinType) lowerBoundIfFlexible, Variance.INVARIANT);
            Intrinsics.checkReturnedValueIsNotNull((Object) safeSubstitute, "substitutor.safeSubstitu…ANT\n                    )");
            SimpleTypeMarker asSimpleType = classicTypeSystemContext.asSimpleType(safeSubstitute);
            if (asSimpleType != null) {
                return asSimpleType;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
    }
}
