package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: IntegerLiteralTypeConstructor.kt */
final class IntegerLiteralTypeConstructor$valueToString$1 extends C12881k implements Function1<KotlinType, String> {
    public static final IntegerLiteralTypeConstructor$valueToString$1 INSTANCE = new IntegerLiteralTypeConstructor$valueToString$1();

    IntegerLiteralTypeConstructor$valueToString$1() {
        super(1);
    }

    public final String invoke(KotlinType kotlinType) {
        return kotlinType.toString();
    }
}
