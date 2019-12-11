package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: TypeAliasConstructorDescriptor.kt */
final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends C12881k implements Function0<TypeAliasConstructorDescriptorImpl> {
    final /* synthetic */ ClassConstructorDescriptor $underlyingConstructorDescriptor;
    final /* synthetic */ TypeAliasConstructorDescriptorImpl this$0;

    TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.this$0 = typeAliasConstructorDescriptorImpl;
        this.$underlyingConstructorDescriptor = classConstructorDescriptor;
        super(0);
    }

    public final TypeAliasConstructorDescriptorImpl invoke() {
        StorageManager storageManager = this.this$0.getStorageManager();
        TypeAliasDescriptor typeAliasDescriptor = this.this$0.getTypeAliasDescriptor();
        ClassConstructorDescriptor classConstructorDescriptor = this.$underlyingConstructorDescriptor;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
        Annotations annotations = classConstructorDescriptor.getAnnotations();
        Kind kind = this.$underlyingConstructorDescriptor.getKind();
        C12880j.m40222a((Object) kind, "underlyingConstructorDescriptor.kind");
        SourceElement source = this.this$0.getTypeAliasDescriptor().getSource();
        C12880j.m40222a((Object) source, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source, null);
        TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass = TypeAliasConstructorDescriptorImpl.Companion.getTypeSubstitutorForUnderlyingClass(this.this$0.getTypeAliasDescriptor());
        if (access$getTypeSubstitutorForUnderlyingClass == null) {
            return null;
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = this.$underlyingConstructorDescriptor.getDispatchReceiverParameter();
        typeAliasConstructorDescriptorImpl2.initialize(null, dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(access$getTypeSubstitutorForUnderlyingClass) : null, this.this$0.getTypeAliasDescriptor().getDeclaredTypeParameters(), this.this$0.getValueParameters(), this.this$0.getReturnType(), Modality.FINAL, this.this$0.getTypeAliasDescriptor().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }
}
