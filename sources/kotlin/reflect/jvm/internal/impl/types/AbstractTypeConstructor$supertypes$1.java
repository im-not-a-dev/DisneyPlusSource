package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$1 extends C12881k implements Function0<Supertypes> {
    final /* synthetic */ AbstractTypeConstructor this$0;

    AbstractTypeConstructor$supertypes$1(AbstractTypeConstructor abstractTypeConstructor) {
        this.this$0 = abstractTypeConstructor;
        super(0);
    }

    public final Supertypes invoke() {
        return new Supertypes(this.this$0.computeSupertypes());
    }
}
