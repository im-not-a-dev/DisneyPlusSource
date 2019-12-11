package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    /* access modifiers changed from: private */
    public ReceiverParameterDescriptor dispatchReceiverParameter;
    private ReceiverParameterDescriptor extensionReceiverParameter;
    private boolean hasStableParameterNames;
    private boolean hasSynthesizedParameterNames;
    private FunctionDescriptor initialSignatureDescriptor;
    private boolean isActual;
    private boolean isExpect;
    private boolean isExternal;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls;
    private boolean isHiddenToOvercomeSignatureClash;
    private boolean isInfix;
    private boolean isInline;
    private boolean isOperator;
    private boolean isSuspend;
    private boolean isTailrec;
    private final Kind kind;
    private volatile Function0<Collection<FunctionDescriptor>> lazyOverriddenFunctionsTask;
    private Modality modality;
    private final FunctionDescriptor original;
    private Collection<? extends FunctionDescriptor> overriddenFunctions;
    private List<TypeParameterDescriptor> typeParameters;
    private KotlinType unsubstitutedReturnType;
    private List<ValueParameterDescriptor> unsubstitutedValueParameters;
    protected Map<UserDataKey<?>, Object> userDataMap;
    private Visibility visibility;

    public class CopyConfiguration implements CopyBuilder<FunctionDescriptor> {
        /* access modifiers changed from: private */
        public Annotations additionalAnnotations;
        protected boolean copyOverrides;
        protected ReceiverParameterDescriptor dispatchReceiverParameter;
        protected boolean dropOriginalInContainingParts;
        /* access modifiers changed from: private */
        public boolean isHiddenForResolutionEverywhereBesideSupercalls;
        /* access modifiers changed from: private */
        public boolean isHiddenToOvercomeSignatureClash;
        protected boolean justForTypeSubstitution;
        protected Kind kind;
        protected Name name;
        protected ReceiverParameterDescriptor newExtensionReceiverParameter;
        /* access modifiers changed from: private */
        public Boolean newHasSynthesizedParameterNames;
        protected Modality newModality;
        protected DeclarationDescriptor newOwner;
        protected KotlinType newReturnType;
        /* access modifiers changed from: private */
        public List<TypeParameterDescriptor> newTypeParameters;
        protected List<ValueParameterDescriptor> newValueParameterDescriptors;
        protected Visibility newVisibility;
        protected FunctionDescriptor original;
        protected boolean preserveSourceElement;
        protected boolean signatureChange;
        protected TypeSubstitution substitution;
        final /* synthetic */ FunctionDescriptorImpl this$0;
        /* access modifiers changed from: private */
        public Map<UserDataKey<?>, Object> userDataMap;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = str2;
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            String str3 = "putUserData";
            String str4 = "setSubstitution";
            String str5 = "setAdditionalAnnotations";
            String str6 = "setReturnType";
            String str7 = "setTypeParameters";
            String str8 = "setValueParameters";
            String str9 = "setName";
            String str10 = "setKind";
            String str11 = "setVisibility";
            String str12 = "setModality";
            String str13 = "setOwner";
            switch (i) {
                case 8:
                    objArr[1] = str13;
                    break;
                case 10:
                    objArr[1] = str12;
                    break;
                case 12:
                    objArr[1] = str11;
                    break;
                case 14:
                    objArr[1] = str10;
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = str9;
                    break;
                case 19:
                    objArr[1] = str8;
                    break;
                case 21:
                    objArr[1] = str7;
                    break;
                case 23:
                    objArr[1] = str6;
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = str5;
                    break;
                case 35:
                    objArr[1] = str4;
                    break;
                case 37:
                    objArr[1] = str3;
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
            switch (i) {
                case 7:
                    objArr[2] = str13;
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = str12;
                    break;
                case 11:
                    objArr[2] = str11;
                    break;
                case 13:
                    objArr[2] = str10;
                    break;
                case 16:
                    objArr[2] = str9;
                    break;
                case 18:
                    objArr[2] = str8;
                    break;
                case 20:
                    objArr[2] = str7;
                    break;
                case 22:
                    objArr[2] = str6;
                    break;
                case 32:
                    objArr[2] = str5;
                    break;
                case 34:
                    objArr[2] = str4;
                    break;
                case 36:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        public CopyConfiguration(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind2, List<ValueParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, KotlinType kotlinType, Name name2) {
            if (typeSubstitution == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            if (modality == null) {
                $$$reportNull$$$0(2);
            }
            if (visibility == null) {
                $$$reportNull$$$0(3);
            }
            if (kind2 == null) {
                $$$reportNull$$$0(4);
            }
            if (list == null) {
                $$$reportNull$$$0(5);
            }
            if (kotlinType == null) {
                $$$reportNull$$$0(6);
            }
            this.this$0 = functionDescriptorImpl;
            this.original = null;
            this.dispatchReceiverParameter = this.this$0.dispatchReceiverParameter;
            this.copyOverrides = true;
            this.signatureChange = false;
            this.preserveSourceElement = false;
            this.dropOriginalInContainingParts = false;
            this.isHiddenToOvercomeSignatureClash = this.this$0.isHiddenToOvercomeSignatureClash();
            this.newTypeParameters = null;
            this.additionalAnnotations = null;
            this.isHiddenForResolutionEverywhereBesideSupercalls = this.this$0.isHiddenForResolutionEverywhereBesideSupercalls();
            this.userDataMap = new LinkedHashMap();
            this.newHasSynthesizedParameterNames = null;
            this.justForTypeSubstitution = false;
            this.substitution = typeSubstitution;
            this.newOwner = declarationDescriptor;
            this.newModality = modality;
            this.newVisibility = visibility;
            this.kind = kind2;
            this.newValueParameterDescriptors = list;
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            this.newReturnType = kotlinType;
            this.name = name2;
        }

        public FunctionDescriptor build() {
            return this.this$0.doSubstitute(this);
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z) {
            this.newHasSynthesizedParameterNames = Boolean.valueOf(z);
            return this;
        }

        public CopyConfiguration setJustForTypeSubstitution(boolean z) {
            this.justForTypeSubstitution = z;
            return this;
        }

        public CopyConfiguration setAdditionalAnnotations(Annotations annotations) {
            if (annotations == null) {
                $$$reportNull$$$0(32);
            }
            this.additionalAnnotations = annotations;
            return this;
        }

        public CopyConfiguration setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        public CopyConfiguration setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.dispatchReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        public CopyConfiguration setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        public CopyConfiguration setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        public CopyConfiguration setHiddenForResolutionEverywhereBesideSupercalls() {
            this.isHiddenForResolutionEverywhereBesideSupercalls = true;
            return this;
        }

        public CopyConfiguration setHiddenToOvercomeSignatureClash() {
            this.isHiddenToOvercomeSignatureClash = true;
            return this;
        }

        public CopyConfiguration setKind(Kind kind2) {
            if (kind2 == null) {
                $$$reportNull$$$0(13);
            }
            this.kind = kind2;
            return this;
        }

        public CopyConfiguration setModality(Modality modality) {
            if (modality == null) {
                $$$reportNull$$$0(9);
            }
            this.newModality = modality;
            return this;
        }

        public CopyConfiguration setName(Name name2) {
            if (name2 == null) {
                $$$reportNull$$$0(16);
            }
            this.name = name2;
            return this;
        }

        public CopyConfiguration setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(7);
            }
            this.newOwner = declarationDescriptor;
            return this;
        }

        public CopyConfiguration setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        public CopyConfiguration setReturnType(KotlinType kotlinType) {
            if (kotlinType == null) {
                $$$reportNull$$$0(22);
            }
            this.newReturnType = kotlinType;
            return this;
        }

        public CopyConfiguration setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        public CopyConfiguration setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                $$$reportNull$$$0(34);
            }
            this.substitution = typeSubstitution;
            return this;
        }

        public CopyConfiguration setTypeParameters(List<TypeParameterDescriptor> list) {
            if (list == null) {
                $$$reportNull$$$0(20);
            }
            this.newTypeParameters = list;
            return this;
        }

        public CopyConfiguration setValueParameters(List<ValueParameterDescriptor> list) {
            if (list == null) {
                $$$reportNull$$$0(18);
            }
            this.newValueParameterDescriptors = list;
            return this;
        }

        public CopyConfiguration setVisibility(Visibility visibility) {
            if (visibility == null) {
                $$$reportNull$$$0(11);
            }
            this.newVisibility = visibility;
            return this;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = str2;
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "newCopyBuilder";
        String str4 = "initialize";
        switch (i) {
            case 8:
                objArr[1] = str4;
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = str3;
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = str4;
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = str3;
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    protected FunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Annotations annotations, Name name, Kind kind2, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (kind2 == null) {
            $$$reportNull$$$0(3);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(4);
        }
        super(declarationDescriptor, annotations, name, sourceElement);
        this.visibility = Visibilities.UNKNOWN;
        this.isOperator = false;
        this.isInfix = false;
        this.isExternal = false;
        this.isInline = false;
        this.isTailrec = false;
        this.isExpect = false;
        this.isActual = false;
        this.isHiddenToOvercomeSignatureClash = false;
        this.isHiddenForResolutionEverywhereBesideSupercalls = false;
        this.isSuspend = false;
        this.hasStableParameterNames = true;
        this.hasSynthesizedParameterNames = false;
        this.overriddenFunctions = null;
        this.lazyOverriddenFunctionsTask = null;
        this.initialSignatureDescriptor = null;
        this.userDataMap = null;
        if (functionDescriptor == 0) {
            functionDescriptor = this;
        }
        this.original = functionDescriptor;
        this.kind = kind2;
    }

    private SourceElement getSourceToUseForCopy(boolean z, FunctionDescriptor functionDescriptor) {
        SourceElement sourceElement;
        if (z) {
            if (functionDescriptor == null) {
                functionDescriptor = getOriginal();
            }
            sourceElement = functionDescriptor.getSource();
        } else {
            sourceElement = SourceElement.NO_SOURCE;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(25);
        }
        return sourceElement;
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            $$$reportNull$$$0(26);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(27);
        }
        return getSubstitutedValueParameters(functionDescriptor, list, typeSubstitutor, false, false, null);
    }

    private void performOverriddenLazyCalculationIfNeeded() {
        Function0<Collection<FunctionDescriptor>> function0 = this.lazyOverriddenFunctionsTask;
        if (function0 != null) {
            this.overriddenFunctions = (Collection) function0.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
    }

    private void setHiddenForResolutionEverywhereBesideSupercalls(boolean z) {
        this.isHiddenForResolutionEverywhereBesideSupercalls = z;
    }

    private void setHiddenToOvercomeSignatureClash(boolean z) {
        this.isHiddenToOvercomeSignatureClash = z;
    }

    private void setInitialSignatureDescriptor(FunctionDescriptor functionDescriptor) {
        this.initialSignatureDescriptor = functionDescriptor;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d);
    }

    /* access modifiers changed from: protected */
    public abstract FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind2, Name name, Annotations annotations, SourceElement sourceElement);

    /* access modifiers changed from: protected */
    public FunctionDescriptor doSubstitute(CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptor2;
        CopyConfiguration copyConfiguration2 = copyConfiguration;
        if (copyConfiguration2 == null) {
            $$$reportNull$$$0(23);
        }
        boolean[] zArr = new boolean[1];
        Annotations composeAnnotations = copyConfiguration.additionalAnnotations != null ? AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.additionalAnnotations) : getAnnotations();
        DeclarationDescriptor declarationDescriptor = copyConfiguration2.newOwner;
        FunctionDescriptor functionDescriptor = copyConfiguration2.original;
        FunctionDescriptorImpl createSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, functionDescriptor, copyConfiguration2.kind, copyConfiguration2.name, composeAnnotations, getSourceToUseForCopy(copyConfiguration2.preserveSourceElement, functionDescriptor));
        List typeParameters2 = copyConfiguration.newTypeParameters == null ? getTypeParameters() : copyConfiguration.newTypeParameters;
        zArr[0] = zArr[0] | (!typeParameters2.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters2.size());
        TypeSubstitutor substituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters2, copyConfiguration2.substitution, createSubstitutedCopy, arrayList, zArr);
        if (substituteTypeParameters == null) {
            return null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration2.newExtensionReceiverParameter;
        if (receiverParameterDescriptor3 != null) {
            KotlinType substitute = substituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), Variance.IN_VARIANCE);
            if (substitute == null) {
                return null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl = new ReceiverParameterDescriptorImpl(createSubstitutedCopy, new ExtensionReceiver(createSubstitutedCopy, substitute, copyConfiguration2.newExtensionReceiverParameter.getValue()), copyConfiguration2.newExtensionReceiverParameter.getAnnotations());
            zArr[0] = (substitute != copyConfiguration2.newExtensionReceiverParameter.getType()) | zArr[0];
            receiverParameterDescriptor = receiverParameterDescriptorImpl;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor4 = copyConfiguration2.dispatchReceiverParameter;
        if (receiverParameterDescriptor4 != null) {
            ReceiverParameterDescriptor substitute2 = receiverParameterDescriptor4.substitute(substituteTypeParameters);
            if (substitute2 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (substitute2 != copyConfiguration2.dispatchReceiverParameter);
            receiverParameterDescriptor2 = substitute2;
        } else {
            receiverParameterDescriptor2 = null;
        }
        List substitutedValueParameters = getSubstitutedValueParameters(createSubstitutedCopy, copyConfiguration2.newValueParameterDescriptors, substituteTypeParameters, copyConfiguration2.dropOriginalInContainingParts, copyConfiguration2.preserveSourceElement, zArr);
        if (substitutedValueParameters == null) {
            return null;
        }
        KotlinType substitute3 = substituteTypeParameters.substitute(copyConfiguration2.newReturnType, Variance.OUT_VARIANCE);
        if (substitute3 == null) {
            return null;
        }
        zArr[0] = zArr[0] | (substitute3 != copyConfiguration2.newReturnType);
        if (!zArr[0] && copyConfiguration2.justForTypeSubstitution) {
            return this;
        }
        final TypeSubstitutor typeSubstitutor = substituteTypeParameters;
        createSubstitutedCopy.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, arrayList, substitutedValueParameters, substitute3, copyConfiguration2.newModality, copyConfiguration2.newVisibility);
        createSubstitutedCopy.setOperator(this.isOperator);
        createSubstitutedCopy.setInfix(this.isInfix);
        createSubstitutedCopy.setExternal(this.isExternal);
        createSubstitutedCopy.setInline(this.isInline);
        createSubstitutedCopy.setTailrec(this.isTailrec);
        createSubstitutedCopy.setSuspend(this.isSuspend);
        createSubstitutedCopy.setExpect(this.isExpect);
        createSubstitutedCopy.setActual(this.isActual);
        createSubstitutedCopy.setHasStableParameterNames(this.hasStableParameterNames);
        createSubstitutedCopy.setHiddenToOvercomeSignatureClash(copyConfiguration.isHiddenToOvercomeSignatureClash);
        createSubstitutedCopy.setHiddenForResolutionEverywhereBesideSupercalls(copyConfiguration.isHiddenForResolutionEverywhereBesideSupercalls);
        createSubstitutedCopy.setHasSynthesizedParameterNames(copyConfiguration.newHasSynthesizedParameterNames != null ? copyConfiguration.newHasSynthesizedParameterNames.booleanValue() : this.hasSynthesizedParameterNames);
        if (!copyConfiguration.userDataMap.isEmpty() || this.userDataMap != null) {
            Map<UserDataKey<?>, Object> access$600 = copyConfiguration.userDataMap;
            Map<UserDataKey<?>, Object> map = this.userDataMap;
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!access$600.containsKey(entry.getKey())) {
                        access$600.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (access$600.size() == 1) {
                createSubstitutedCopy.userDataMap = Collections.singletonMap(access$600.keySet().iterator().next(), access$600.values().iterator().next());
            } else {
                createSubstitutedCopy.userDataMap = access$600;
            }
        }
        if (copyConfiguration2.signatureChange || getInitialSignatureDescriptor() != null) {
            createSubstitutedCopy.setInitialSignatureDescriptor((getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(typeSubstitutor));
        }
        if (copyConfiguration2.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (copyConfiguration2.substitution.isEmpty()) {
                Function0<Collection<FunctionDescriptor>> function0 = this.lazyOverriddenFunctionsTask;
                if (function0 != null) {
                    createSubstitutedCopy.lazyOverriddenFunctionsTask = function0;
                } else {
                    createSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                }
            } else {
                createSubstitutedCopy.lazyOverriddenFunctionsTask = new Function0<Collection<FunctionDescriptor>>() {
                    public Collection<FunctionDescriptor> invoke() {
                        SmartList smartList = new SmartList();
                        for (FunctionDescriptor substitute : FunctionDescriptorImpl.this.getOverriddenDescriptors()) {
                            smartList.add(substitute.substitute(typeSubstitutor));
                        }
                        return smartList;
                    }
                };
            }
        }
        return createSubstitutedCopy;
    }

    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    public Kind getKind() {
        Kind kind2 = this.kind;
        if (kind2 == null) {
            $$$reportNull$$$0(19);
        }
        return kind2;
    }

    public Modality getModality() {
        Modality modality2 = this.modality;
        if (modality2 == null) {
            $$$reportNull$$$0(13);
        }
        return modality2;
    }

    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        performOverriddenLazyCalculationIfNeeded();
        Collection<? extends FunctionDescriptor> collection = this.overriddenFunctions;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            $$$reportNull$$$0(12);
        }
        return collection;
    }

    public KotlinType getReturnType() {
        return this.unsubstitutedReturnType;
    }

    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.typeParameters;
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        return list;
    }

    public <V> V getUserData(UserDataKey<V> userDataKey) {
        Map<UserDataKey<?>, Object> map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return map.get(userDataKey);
    }

    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> list = this.unsubstitutedValueParameters;
        if (list == null) {
            $$$reportNull$$$0(17);
        }
        return list;
    }

    public Visibility getVisibility() {
        Visibility visibility2 = this.visibility;
        if (visibility2 == null) {
            $$$reportNull$$$0(14);
        }
        return visibility2;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public FunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality2, Visibility visibility2) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
        }
        if (visibility2 == null) {
            $$$reportNull$$$0(7);
        }
        this.typeParameters = C13199w.m40606q(list);
        this.unsubstitutedValueParameters = C13199w.m40606q(list2);
        this.unsubstitutedReturnType = kotlinType;
        this.modality = modality2;
        this.visibility = visibility2;
        this.extensionReceiverParameter = receiverParameterDescriptor;
        this.dispatchReceiverParameter = receiverParameterDescriptor2;
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = " but position is ";
            if (i2 < list.size()) {
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) list.get(i2);
                if (typeParameterDescriptor.getIndex() == i2) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(typeParameterDescriptor);
                    sb.append(" index is ");
                    sb.append(typeParameterDescriptor.getIndex());
                    sb.append(str);
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                while (i < list2.size()) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) list2.get(i);
                    if (valueParameterDescriptor.getIndex() == i + 0) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(valueParameterDescriptor);
                        sb2.append("index is ");
                        sb2.append(valueParameterDescriptor.getIndex());
                        sb2.append(str);
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                return this;
            }
        }
    }

    public boolean isActual() {
        return this.isActual;
    }

    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        for (FunctionDescriptor isInfix2 : getOriginal().getOverriddenDescriptors()) {
            if (isInfix2.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.isInline;
    }

    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        for (FunctionDescriptor isOperator2 : getOriginal().getOverriddenDescriptors()) {
            if (isOperator2.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.isSuspend;
    }

    public boolean isTailrec() {
        return this.isTailrec;
    }

    public CopyBuilder<? extends FunctionDescriptor> newCopyBuilder() {
        CopyConfiguration newCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
        if (newCopyBuilder == null) {
            $$$reportNull$$$0(21);
        }
        return newCopyBuilder;
    }

    public <V> void putInUserDataMap(UserDataKey<V> userDataKey, Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(userDataKey, obj);
    }

    public void setActual(boolean z) {
        this.isActual = z;
    }

    public void setExpect(boolean z) {
        this.isExpect = z;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = z;
    }

    public void setInfix(boolean z) {
        this.isInfix = z;
    }

    public void setInline(boolean z) {
        this.isInline = z;
    }

    public void setOperator(boolean z) {
        this.isOperator = z;
    }

    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(15);
        }
        this.overriddenFunctions = collection;
        for (FunctionDescriptor isHiddenForResolutionEverywhereBesideSupercalls2 : this.overriddenFunctions) {
            if (isHiddenForResolutionEverywhereBesideSupercalls2.isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.isHiddenForResolutionEverywhereBesideSupercalls = true;
                return;
            }
        }
    }

    public void setReturnType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(10);
        }
        this.unsubstitutedReturnType = kotlinType;
    }

    public void setSuspend(boolean z) {
        this.isSuspend = z;
    }

    public void setTailrec(boolean z) {
        this.isTailrec = z;
    }

    public void setVisibility(Visibility visibility2) {
        if (visibility2 == null) {
            $$$reportNull$$$0(9);
        }
        this.visibility = visibility2;
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        KotlinType kotlinType;
        Function0 function0;
        TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
        if (list == null) {
            $$$reportNull$$$0(28);
        }
        if (typeSubstitutor2 == null) {
            $$$reportNull$$$0(29);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType substitute = typeSubstitutor2.substitute(valueParameterDescriptor.getType(), Variance.IN_VARIANCE);
            KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
            if (varargElementType == null) {
                kotlinType = null;
            } else {
                kotlinType = typeSubstitutor2.substitute(varargElementType, Variance.IN_VARIANCE);
            }
            if (substitute == null) {
                return null;
            }
            if (!((substitute == valueParameterDescriptor.getType() && varargElementType == kotlinType) || zArr == null)) {
                zArr[0] = true;
            }
            if (valueParameterDescriptor instanceof WithDestructuringDeclaration) {
                final List destructuringVariables = ((WithDestructuringDeclaration) valueParameterDescriptor).getDestructuringVariables();
                function0 = new Function0<List<VariableDescriptor>>() {
                    public List<VariableDescriptor> invoke() {
                        return destructuringVariables;
                    }
                };
            } else {
                function0 = null;
            }
            arrayList.add(ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), substitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), kotlinType, z2 ? valueParameterDescriptor.getSource() : SourceElement.NO_SOURCE, function0));
        }
        return arrayList;
    }

    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality2, Visibility visibility2, Kind kind2, boolean z) {
        FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality2).setVisibility(visibility2).setKind(kind2).setCopyOverrides(z).build();
        if (build == null) {
            $$$reportNull$$$0(24);
        }
        return build;
    }

    /* access modifiers changed from: protected */
    public CopyConfiguration newCopyBuilder(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(22);
        }
        CopyConfiguration copyConfiguration = new CopyConfiguration(this, typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getExtensionReceiverParameter(), getReturnType(), null);
        return copyConfiguration;
    }

    public FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(20);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return newCopyBuilder(typeSubstitutor).setOriginal((CallableMemberDescriptor) getOriginal()).setJustForTypeSubstitution(true).build();
    }

    public FunctionDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor = this.original;
        FunctionDescriptor original2 = functionDescriptor == this ? this : functionDescriptor.getOriginal();
        if (original2 == 0) {
            $$$reportNull$$$0(18);
        }
        return original2;
    }
}
