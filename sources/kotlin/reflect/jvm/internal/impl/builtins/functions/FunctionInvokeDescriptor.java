package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.C13147x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p590y.C13152b0;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* compiled from: FunctionInvokeDescriptor.kt */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    public static final Factory Factory = new Factory(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class Factory {
        private Factory() {
        }

        private final ValueParameterDescriptor createValueParameter(FunctionInvokeDescriptor functionInvokeDescriptor, int i, TypeParameterDescriptor typeParameterDescriptor) {
            String str;
            String asString = typeParameterDescriptor.getName().asString();
            Intrinsics.checkReturnedValueIsNotNull((Object) asString, "typeParameter.name.asString()");
            int hashCode = asString.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84 && asString.equals("T")) {
                    str = "instance";
                    Annotations empty = Annotations.Companion.getEMPTY();
                    Name identifier = Name.identifier(str);
                    Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(name)");
                    SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                    Intrinsics.checkReturnedValueIsNotNull((Object) defaultType, "typeParameter.defaultType");
                    SourceElement sourceElement = SourceElement.NO_SOURCE;
                    Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement, "SourceElement.NO_SOURCE");
                    ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, empty, identifier, defaultType, false, false, false, null, sourceElement);
                    return valueParameterDescriptorImpl;
                }
            } else if (asString.equals("E")) {
                str = "receiver";
                Annotations empty2 = Annotations.Companion.getEMPTY();
                Name identifier2 = Name.identifier(str);
                Intrinsics.checkReturnedValueIsNotNull((Object) identifier2, "Name.identifier(name)");
                SimpleType defaultType2 = typeParameterDescriptor.getDefaultType();
                Intrinsics.checkReturnedValueIsNotNull((Object) defaultType2, "typeParameter.defaultType");
                SourceElement sourceElement2 = SourceElement.NO_SOURCE;
                Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement2, "SourceElement.NO_SOURCE");
                ValueParameterDescriptorImpl valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, empty2, identifier2, defaultType2, false, false, false, null, sourceElement2);
                return valueParameterDescriptorImpl2;
            }
            if (asString != null) {
                str = asString.toLowerCase();
                Intrinsics.checkReturnedValueIsNotNull((Object) str, "(this as java.lang.String).toLowerCase()");
                Annotations empty22 = Annotations.Companion.getEMPTY();
                Name identifier22 = Name.identifier(str);
                Intrinsics.checkReturnedValueIsNotNull((Object) identifier22, "Name.identifier(name)");
                SimpleType defaultType22 = typeParameterDescriptor.getDefaultType();
                Intrinsics.checkReturnedValueIsNotNull((Object) defaultType22, "typeParameter.defaultType");
                SourceElement sourceElement22 = SourceElement.NO_SOURCE;
                Intrinsics.checkReturnedValueIsNotNull((Object) sourceElement22, "SourceElement.NO_SOURCE");
                ValueParameterDescriptorImpl valueParameterDescriptorImpl22 = new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, empty22, identifier22, defaultType22, false, false, false, null, sourceElement22);
                return valueParameterDescriptorImpl22;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public final FunctionInvokeDescriptor create(FunctionClassDescriptor functionClassDescriptor, boolean z) {
            List declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            List a = C13185o.m40513a();
            ArrayList arrayList = new ArrayList();
            for (Object next : declaredTypeParameters) {
                if (!(((TypeParameterDescriptor) next).getVariance() == Variance.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<C13152b0> u = C13199w.m40610u(arrayList);
            ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) u, 10));
            for (C13152b0 b0Var : u) {
                arrayList2.add(FunctionInvokeDescriptor.Factory.createValueParameter(functionInvokeDescriptor, b0Var.mo34196c(), (TypeParameterDescriptor) b0Var.mo34197d()));
            }
            functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, a, (List) arrayList2, (KotlinType) ((TypeParameterDescriptor) C13199w.m40593h(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, Visibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }

    private final FunctionDescriptor replaceParameterNames(List<Name> list) {
        boolean z;
        int size = getValueParameters().size() - list.size();
        boolean z2 = false;
        boolean z3 = size == 0 || size == 1;
        if (!C13147x.f29590a || z3) {
            List<ValueParameterDescriptor> valueParameters = getValueParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "valueParameters");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameters, 10));
            for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "it");
                Name name = valueParameterDescriptor.getName();
                Intrinsics.checkReturnedValueIsNotNull((Object) name, "it.name");
                int index = valueParameterDescriptor.getIndex();
                int i = index - size;
                if (i >= 0) {
                    Name name2 = (Name) list.get(i);
                    if (name2 != null) {
                        name = name2;
                    }
                }
                arrayList.add(valueParameterDescriptor.copy(this, name, index));
            }
            CopyConfiguration newCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Name) it.next()) == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            CopyConfiguration original = newCopyBuilder.setHasSynthesizedParameterNames(z2).setValueParameters((List) arrayList).setOriginal((CallableMemberDescriptor) getOriginal());
            Intrinsics.checkReturnedValueIsNotNull((Object) original, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
            FunctionDescriptor doSubstitute = super.doSubstitute(original);
            if (doSubstitute != null) {
                return doSubstitute;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }

    /* access modifiers changed from: protected */
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    /* access modifiers changed from: protected */
    public FunctionDescriptor doSubstitute(CopyConfiguration copyConfiguration) {
        boolean z;
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List valueParameters = functionInvokeDescriptor.getValueParameters();
        String str = "substituted.valueParameters";
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, str);
        String str2 = "it.type";
        String str3 = "it";
        boolean z2 = true;
        if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
            Iterator it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, str3);
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, str2);
                if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return functionInvokeDescriptor;
        }
        List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters2, str);
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) valueParameters2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor2 : valueParameters2) {
            Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor2, str3);
            KotlinType type2 = valueParameterDescriptor2.getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type2, str2);
            arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
        }
        return functionInvokeDescriptor.replaceParameterNames(arrayList);
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    private FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }
}
