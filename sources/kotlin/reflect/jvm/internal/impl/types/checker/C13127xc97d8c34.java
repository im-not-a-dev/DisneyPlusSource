package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* compiled from: IntersectionType.kt */
final /* synthetic */ class C13127xc97d8c34 extends C12879i implements Function2<KotlinType, KotlinType, Boolean> {
    C13127xc97d8c34(NewKotlinTypeChecker newKotlinTypeChecker) {
        super(2, newKotlinTypeChecker);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(NewKotlinTypeChecker.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((KotlinType) obj, (KotlinType) obj2));
    }

    public final boolean invoke(KotlinType kotlinType, KotlinType kotlinType2) {
        return ((NewKotlinTypeChecker) this.receiver).equalTypes(kotlinType, kotlinType2);
    }
}
