package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

public abstract class AbstractClassDescriptor implements ClassDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final NotNullLazyValue<SimpleType> defaultType;
    private final Name name;
    private final NotNullLazyValue<ReceiverParameterDescriptor> thisAsReceiverParameter;
    private final NotNullLazyValue<MemberScope> unsubstitutedInnerClassesScope;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "typeArguments";
                break;
            case 8:
                objArr[0] = "typeSubstitution";
                break;
            case 10:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "substitute";
        String str4 = "getMemberScope";
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 7 || i == 9) {
            objArr[1] = str4;
        } else if (i == 11) {
            objArr[1] = str3;
        } else if (i != 12) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                break;
            case 6:
            case 8:
                objArr[2] = str4;
                break;
            case 10:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 9 || i == 11 || i == 12) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public AbstractClassDescriptor(StorageManager storageManager, Name name2) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (name2 == null) {
            $$$reportNull$$$0(1);
        }
        this.name = name2;
        this.defaultType = storageManager.createLazyValue(new Function0<SimpleType>() {
            public SimpleType invoke() {
                AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
                return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope());
            }
        });
        this.unsubstitutedInnerClassesScope = storageManager.createLazyValue(new Function0<MemberScope>() {
            public MemberScope invoke() {
                return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
            }
        });
        this.thisAsReceiverParameter = storageManager.createLazyValue(new Function0<ReceiverParameterDescriptor>() {
            public ReceiverParameterDescriptor invoke() {
                return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
            }
        });
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }

    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.defaultType.invoke();
        if (simpleType == null) {
            $$$reportNull$$$0(12);
        }
        return simpleType;
    }

    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(8);
        }
        if (typeSubstitution.isEmpty()) {
            MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope();
            if (unsubstitutedMemberScope == null) {
                $$$reportNull$$$0(9);
            }
            return unsubstitutedMemberScope;
        }
        return new SubstitutingScope(getUnsubstitutedMemberScope(), TypeSubstitutor.create(typeSubstitution));
    }

    public Name getName() {
        Name name2 = this.name;
        if (name2 == null) {
            $$$reportNull$$$0(2);
        }
        return name2;
    }

    public ClassDescriptor getOriginal() {
        return this;
    }

    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) this.thisAsReceiverParameter.invoke();
        if (receiverParameterDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        return receiverParameterDescriptor;
    }

    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScope = (MemberScope) this.unsubstitutedInnerClassesScope.invoke();
        if (memberScope == null) {
            $$$reportNull$$$0(4);
        }
        return memberScope;
    }

    public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(10);
        }
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }
}
