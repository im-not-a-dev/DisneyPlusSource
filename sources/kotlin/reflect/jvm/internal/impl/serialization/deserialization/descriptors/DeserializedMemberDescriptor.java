package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* compiled from: DeserializedMemberDescriptor.kt */
public interface DeserializedMemberDescriptor extends MemberDescriptor, DescriptorWithContainerSource {

    /* compiled from: DeserializedMemberDescriptor.kt */
    public enum CoroutinesCompatibilityMode {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    /* compiled from: DeserializedMemberDescriptor.kt */
    public static final class DefaultImpls {
        public static List<VersionRequirement> getVersionRequirements(DeserializedMemberDescriptor deserializedMemberDescriptor) {
            return VersionRequirement.Companion.create(deserializedMemberDescriptor.getProto(), deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getVersionRequirementTable());
        }
    }

    NameResolver getNameResolver();

    MessageLite getProto();

    TypeTable getTypeTable();

    VersionRequirementTable getVersionRequirementTable();

    List<VersionRequirement> getVersionRequirements();
}
