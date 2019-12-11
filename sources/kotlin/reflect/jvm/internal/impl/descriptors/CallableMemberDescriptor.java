package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z);

    Kind getKind();

    CallableMemberDescriptor getOriginal();

    Collection<? extends CallableMemberDescriptor> getOverriddenDescriptors();

    void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection);
}
