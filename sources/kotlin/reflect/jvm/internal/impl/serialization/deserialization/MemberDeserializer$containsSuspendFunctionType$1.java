package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: MemberDeserializer.kt */
final /* synthetic */ class MemberDeserializer$containsSuspendFunctionType$1 extends C12890t {
    public static final KProperty1 INSTANCE = new MemberDeserializer$containsSuspendFunctionType$1();

    MemberDeserializer$containsSuspendFunctionType$1() {
    }

    public Object get(Object obj) {
        return Boolean.valueOf(FunctionTypesKt.isSuspendFunctionType((UnwrappedType) obj));
    }

    public String getName() {
        return "isSuspendFunctionType";
    }

    public KDeclarationContainer getOwner() {
        return C12895y.m40231a(FunctionTypesKt.class, "deserialization");
    }

    public String getSignature() {
        return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
