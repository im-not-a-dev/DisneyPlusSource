package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        D build();

        CopyBuilder<D> setAdditionalAnnotations(Annotations annotations);

        CopyBuilder<D> setCopyOverrides(boolean z);

        CopyBuilder<D> setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> setDropOriginalInContainingParts();

        CopyBuilder<D> setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> setHiddenForResolutionEverywhereBesideSupercalls();

        CopyBuilder<D> setHiddenToOvercomeSignatureClash();

        CopyBuilder<D> setKind(Kind kind);

        CopyBuilder<D> setModality(Modality modality);

        CopyBuilder<D> setName(Name name);

        CopyBuilder<D> setOriginal(CallableMemberDescriptor callableMemberDescriptor);

        CopyBuilder<D> setOwner(DeclarationDescriptor declarationDescriptor);

        CopyBuilder<D> setPreserveSourceElement();

        CopyBuilder<D> setReturnType(KotlinType kotlinType);

        CopyBuilder<D> setSignatureChange();

        CopyBuilder<D> setSubstitution(TypeSubstitution typeSubstitution);

        CopyBuilder<D> setTypeParameters(List<TypeParameterDescriptor> list);

        CopyBuilder<D> setValueParameters(List<ValueParameterDescriptor> list);

        CopyBuilder<D> setVisibility(Visibility visibility);
    }

    DeclarationDescriptor getContainingDeclaration();

    FunctionDescriptor getInitialSignatureDescriptor();

    FunctionDescriptor getOriginal();

    Collection<? extends FunctionDescriptor> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    CopyBuilder<? extends FunctionDescriptor> newCopyBuilder();

    FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
