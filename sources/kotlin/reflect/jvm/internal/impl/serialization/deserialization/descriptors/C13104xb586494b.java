package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 */
/* compiled from: DeserializedClassDescriptor.kt */
final class C13104xb586494b extends C12881k implements Function0<Collection<? extends DeclarationDescriptor>> {
    final /* synthetic */ DeserializedClassMemberScope this$0;

    C13104xb586494b(DeserializedClassMemberScope deserializedClassMemberScope) {
        this.this$0 = deserializedClassMemberScope;
        super(0);
    }

    public final Collection<DeclarationDescriptor> invoke() {
        return this.this$0.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
