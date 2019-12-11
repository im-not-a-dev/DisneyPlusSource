package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: AbstractTypeConstructor.kt */
final class AbstractTypeConstructor$supertypes$2 extends C12881k implements Function1<Boolean, Supertypes> {
    public static final AbstractTypeConstructor$supertypes$2 INSTANCE = new AbstractTypeConstructor$supertypes$2();

    AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }

    public final Supertypes invoke(boolean z) {
        return new Supertypes(C13183n.m40498a(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES));
    }
}
