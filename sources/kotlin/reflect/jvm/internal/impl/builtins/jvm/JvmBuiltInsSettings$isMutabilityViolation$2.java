package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.C13142s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$isMutabilityViolation$2 extends C12881k implements Function1<CallableMemberDescriptor, Boolean> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$isMutabilityViolation$2(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        C12880j.m40222a((Object) callableMemberDescriptor, "overridden");
        if (callableMemberDescriptor.getKind() == Kind.DECLARATION) {
            JavaToKotlinClassMap access$getJ2kClassMap$p = this.this$0.j2kClassMap;
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            if (containingDeclaration == null) {
                throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            } else if (access$getJ2kClassMap$p.isMutable((ClassDescriptor) containingDeclaration)) {
                return true;
            }
        }
        return false;
    }
}
