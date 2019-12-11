package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeCapabilities.kt */
public interface CustomTypeVariable {
    boolean isTypeVariable();

    KotlinType substitutionResult(KotlinType kotlinType);
}
