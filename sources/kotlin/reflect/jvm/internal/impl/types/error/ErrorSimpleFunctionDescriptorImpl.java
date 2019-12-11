package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

public class ErrorSimpleFunctionDescriptorImpl extends SimpleFunctionDescriptorImpl {
    private final ErrorScope ownerScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
                objArr[0] = str2;
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        if (i == 6) {
            objArr[1] = str3;
        } else if (i != 7) {
            objArr[1] = str2;
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = str3;
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public ErrorSimpleFunctionDescriptorImpl(ClassDescriptor classDescriptor, ErrorScope errorScope) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (errorScope == null) {
            $$$reportNull$$$0(1);
        }
        super(classDescriptor, null, Annotations.Companion.getEMPTY(), Name.special("<ERROR FUNCTION>"), Kind.DECLARATION, SourceElement.NO_SOURCE);
        this.ownerScope = errorScope;
    }

    public SimpleFunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z) {
        return this;
    }

    /* access modifiers changed from: protected */
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
        }
        if (annotations == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        return this;
    }

    public <V> V getUserData(UserDataKey<V> userDataKey) {
        return null;
    }

    public boolean isSuspend() {
        return false;
    }

    public CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder() {
        return new CopyBuilder<SimpleFunctionDescriptor>() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                String str;
                int i2;
                Throwable th;
                int i3 = i;
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                }
                str = "@NotNull method %s.%s must not return null";
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                }
                i2 = 2;
                Object[] objArr = new Object[i2];
                String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                switch (i3) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
                        objArr[0] = str2;
                        break;
                    case 2:
                        objArr[0] = "modality";
                        break;
                    case 4:
                        objArr[0] = "visibility";
                        break;
                    case 6:
                        objArr[0] = "kind";
                        break;
                    case 9:
                        objArr[0] = "name";
                        break;
                    case 11:
                    case 17:
                        objArr[0] = "parameters";
                        break;
                    case 13:
                        objArr[0] = "substitution";
                        break;
                    case 15:
                        objArr[0] = "userDataKey";
                        break;
                    case 19:
                        objArr[0] = "type";
                        break;
                    case 29:
                        objArr[0] = "additionalAnnotations";
                        break;
                    default:
                        objArr[0] = "owner";
                        break;
                }
                String str3 = "setOwner";
                if (i3 == 1) {
                    objArr[1] = str3;
                } else if (i3 == 3) {
                    objArr[1] = "setModality";
                } else if (i3 == 5) {
                    objArr[1] = "setVisibility";
                } else if (i3 == 10) {
                    objArr[1] = "setName";
                } else if (i3 == 12) {
                    objArr[1] = "setValueParameters";
                } else if (i3 == 14) {
                    objArr[1] = "setSubstitution";
                } else if (i3 == 16) {
                    objArr[1] = "putUserData";
                } else if (i3 == 18) {
                    objArr[1] = "setTypeParameters";
                } else if (i3 == 30) {
                    objArr[1] = "setAdditionalAnnotations";
                } else if (i3 == 7) {
                    objArr[1] = "setKind";
                } else if (i3 != 8) {
                    switch (i3) {
                        case 20:
                            objArr[1] = "setReturnType";
                            break;
                        case 21:
                            objArr[1] = "setExtensionReceiverParameter";
                            break;
                        case 22:
                            objArr[1] = "setDispatchReceiverParameter";
                            break;
                        case 23:
                            objArr[1] = "setOriginal";
                            break;
                        case 24:
                            objArr[1] = "setSignatureChange";
                            break;
                        case 25:
                            objArr[1] = "setPreserveSourceElement";
                            break;
                        case 26:
                            objArr[1] = "setDropOriginalInContainingParts";
                            break;
                        case 27:
                            objArr[1] = "setHiddenToOvercomeSignatureClash";
                            break;
                        case 28:
                            objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                            break;
                        default:
                            objArr[1] = str2;
                            break;
                    }
                } else {
                    objArr[1] = "setCopyOverrides";
                }
                switch (i3) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 30:
                        break;
                    case 2:
                        objArr[2] = "setModality";
                        break;
                    case 4:
                        objArr[2] = "setVisibility";
                        break;
                    case 6:
                        objArr[2] = "setKind";
                        break;
                    case 9:
                        objArr[2] = "setName";
                        break;
                    case 11:
                        objArr[2] = "setValueParameters";
                        break;
                    case 13:
                        objArr[2] = "setSubstitution";
                        break;
                    case 15:
                        objArr[2] = "putUserData";
                        break;
                    case 17:
                        objArr[2] = "setTypeParameters";
                        break;
                    case 19:
                        objArr[2] = "setReturnType";
                        break;
                    case 29:
                        objArr[2] = "setAdditionalAnnotations";
                        break;
                    default:
                        objArr[2] = str3;
                        break;
                }
                String format = String.format(str, objArr);
                if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                    switch (i3) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            break;
                        default:
                            th = new IllegalArgumentException(format);
                            break;
                    }
                }
                th = new IllegalStateException(format);
                throw th;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setAdditionalAnnotations(Annotations annotations) {
                if (annotations == null) {
                    $$$reportNull$$$0(29);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setCopyOverrides(boolean z) {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setDropOriginalInContainingParts() {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setHiddenForResolutionEverywhereBesideSupercalls() {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setHiddenToOvercomeSignatureClash() {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setKind(Kind kind) {
                if (kind == null) {
                    $$$reportNull$$$0(6);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setModality(Modality modality) {
                if (modality == null) {
                    $$$reportNull$$$0(2);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setName(Name name) {
                if (name == null) {
                    $$$reportNull$$$0(9);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setOwner(DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(0);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setPreserveSourceElement() {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setReturnType(KotlinType kotlinType) {
                if (kotlinType == null) {
                    $$$reportNull$$$0(19);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setSignatureChange() {
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setSubstitution(TypeSubstitution typeSubstitution) {
                if (typeSubstitution == null) {
                    $$$reportNull$$$0(13);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setTypeParameters(List<TypeParameterDescriptor> list) {
                if (list == null) {
                    $$$reportNull$$$0(17);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setValueParameters(List<ValueParameterDescriptor> list) {
                if (list == null) {
                    $$$reportNull$$$0(11);
                }
                return this;
            }

            public CopyBuilder<SimpleFunctionDescriptor> setVisibility(Visibility visibility) {
                if (visibility == null) {
                    $$$reportNull$$$0(4);
                }
                return this;
            }

            public SimpleFunctionDescriptor build() {
                return ErrorSimpleFunctionDescriptorImpl.this;
            }
        };
    }

    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(8);
        }
    }
}
