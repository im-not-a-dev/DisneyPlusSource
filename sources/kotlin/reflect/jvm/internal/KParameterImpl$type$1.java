package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KParameterImpl.kt */
final class KParameterImpl$type$1 extends C12881k implements Function0<Type> {
    final /* synthetic */ KParameterImpl this$0;

    KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        this.this$0 = kParameterImpl;
        super(0);
    }

    public final Type invoke() {
        ParameterDescriptor access$getDescriptor$p = this.this$0.getDescriptor();
        if (!(access$getDescriptor$p instanceof ReceiverParameterDescriptor) || !Intrinsics.areEqual((Object) UtilKt.getInstanceReceiverParameter(this.this$0.getCallable().getDescriptor()), (Object) access$getDescriptor$p) || this.this$0.getCallable().getDescriptor().getKind() != Kind.FAKE_OVERRIDE) {
            return (Type) this.this$0.getCallable().getCaller().getParameterTypes().get(this.this$0.getIndex());
        }
        DeclarationDescriptor containingDeclaration = this.this$0.getCallable().getDescriptor().getContainingDeclaration();
        if (containingDeclaration != null) {
            Class javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
            if (javaClass != null) {
                return javaClass;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot determine receiver Java type of inherited declaration: ");
            sb.append(access$getDescriptor$p);
            throw new KotlinReflectionInternalError(sb.toString());
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }
}
