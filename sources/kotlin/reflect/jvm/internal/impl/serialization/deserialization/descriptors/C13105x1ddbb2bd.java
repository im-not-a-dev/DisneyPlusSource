package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1 */
/* compiled from: DeserializedClassDescriptor.kt */
final class C13105x1ddbb2bd extends C12881k implements Function1<SimpleFunctionDescriptor, Boolean> {
    final /* synthetic */ DeserializedClassMemberScope this$0;

    C13105x1ddbb2bd(DeserializedClassMemberScope deserializedClassMemberScope) {
        this.this$0 = deserializedClassMemberScope;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((SimpleFunctionDescriptor) obj));
    }

    public final boolean invoke(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        return this.this$0.getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(DeserializedClassDescriptor.this, simpleFunctionDescriptor);
    }
}
