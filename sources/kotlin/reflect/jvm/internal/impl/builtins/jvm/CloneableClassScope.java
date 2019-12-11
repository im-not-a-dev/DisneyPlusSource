package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: CloneableClassScope.kt */
public final class CloneableClassScope extends GivenFunctionsMemberScope {
    /* access modifiers changed from: private */
    public static final Name CLONE_NAME;
    public static final Companion Companion = new Companion(null);

    /* compiled from: CloneableClassScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Name getCLONE_NAME() {
            return CloneableClassScope.CLONE_NAME;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Name identifier = Name.identifier("clone");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(\"clone\")");
        CLONE_NAME = identifier;
    }

    public CloneableClassScope(StorageManager storageManager, ClassDescriptor classDescriptor) {
        super(storageManager, classDescriptor);
    }

    /* access modifiers changed from: protected */
    public List<FunctionDescriptor> computeDeclaredFunctions() {
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(getContainingClass(), Annotations.Companion.getEMPTY(), CLONE_NAME, Kind.DECLARATION, SourceElement.NO_SOURCE);
        create.initialize((ReceiverParameterDescriptor) null, getContainingClass().getThisAsReceiverParameter(), C13185o.m40513a(), C13185o.m40513a(), (KotlinType) DescriptorUtilsKt.getBuiltIns(getContainingClass()).getAnyType(), Modality.OPEN, Visibilities.PROTECTED);
        return C13183n.m40498a(create);
    }
}
