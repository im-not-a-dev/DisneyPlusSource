package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;

/* compiled from: DeserializedMemberDescriptor.kt */
public interface DeserializedCallableMemberDescriptor extends CallableMemberDescriptor, DeserializedMemberDescriptor {

    /* compiled from: DeserializedMemberDescriptor.kt */
    public static final class DefaultImpls {
        public static List<VersionRequirement> getVersionRequirements(DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor) {
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.DefaultImpls.getVersionRequirements(deserializedCallableMemberDescriptor);
        }
    }
}
