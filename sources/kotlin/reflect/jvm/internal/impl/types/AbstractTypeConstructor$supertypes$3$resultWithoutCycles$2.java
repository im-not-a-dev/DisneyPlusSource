package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2 extends C12881k implements Function1<KotlinType, C13145v> {
    final /* synthetic */ AbstractTypeConstructor$supertypes$3 this$0;

    AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(AbstractTypeConstructor$supertypes$3 abstractTypeConstructor$supertypes$3) {
        this.this$0 = abstractTypeConstructor$supertypes$3;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KotlinType) obj);
        return C13145v.f29587a;
    }

    public final void invoke(KotlinType kotlinType) {
        this.this$0.this$0.reportSupertypeLoopError(kotlinType);
    }
}
