package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {
    private final boolean isStaticFinal;
    private final Pair<UserDataKey<?>, ?> singleUserData;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 20 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 20 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            case 20:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        if (i != 20) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = str3;
                break;
            case 20:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 20 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    protected JavaPropertyDescriptor(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, Visibility visibility, boolean z, Name name, SourceElement sourceElement, PropertyDescriptor propertyDescriptor, Kind kind, boolean z2, Pair<UserDataKey<?>, ?> pair) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
        }
        if (visibility == null) {
            $$$reportNull$$$0(3);
        }
        if (name == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        if (kind == null) {
            $$$reportNull$$$0(6);
        }
        super(declarationDescriptor, propertyDescriptor, annotations, modality, visibility, z, name, kind, sourceElement, false, false, false, false, false, false);
        this.isStaticFinal = z2;
        this.singleUserData = pair;
    }

    public static JavaPropertyDescriptor create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, Visibility visibility, boolean z, Name name, SourceElement sourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (annotations == null) {
            $$$reportNull$$$0(8);
        }
        if (modality == null) {
            $$$reportNull$$$0(9);
        }
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (name == null) {
            $$$reportNull$$$0(11);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(12);
        }
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, visibility, z, name, sourceElement, null, Kind.DECLARATION, z2, null);
        return javaPropertyDescriptor;
    }

    /* access modifiers changed from: protected */
    public PropertyDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, PropertyDescriptor propertyDescriptor, Kind kind, Name name) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (modality == null) {
            $$$reportNull$$$0(14);
        }
        if (visibility == null) {
            $$$reportNull$$$0(15);
        }
        if (kind == null) {
            $$$reportNull$$$0(16);
        }
        if (name == null) {
            $$$reportNull$$$0(17);
        }
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, visibility, isVar(), name, SourceElement.NO_SOURCE, propertyDescriptor, kind, this.isStaticFinal, this.singleUserData);
        return javaPropertyDescriptor;
    }

    public JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List<ValueParameterData> list, KotlinType kotlinType2, Pair<UserDataKey<?>, ?> pair) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType kotlinType3 = kotlinType;
        KotlinType kotlinType4 = kotlinType2;
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        if (kotlinType4 == null) {
            $$$reportNull$$$0(19);
        }
        PropertyDescriptor original = getOriginal() == this ? null : getOriginal();
        JavaPropertyDescriptor javaPropertyDescriptor = r5;
        JavaPropertyDescriptor javaPropertyDescriptor2 = new JavaPropertyDescriptor(getContainingDeclaration(), getAnnotations(), getModality(), getVisibility(), isVar(), getName(), getSource(), original, getKind(), this.isStaticFinal, pair);
        PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            propertyGetterDescriptorImpl = r5;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.getModality(), getter.getVisibility(), getter.isDefault(), getter.isExternal(), getter.isInline(), getKind(), original == null ? null : original.getGetter(), getter.getSource());
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(getter.getInitialSignatureDescriptor());
            propertyGetterDescriptorImpl.initialize(kotlinType4);
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = r5;
            PropertySetterDescriptorImpl propertySetterDescriptorImpl3 = new PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.getModality(), setter.getVisibility(), setter.isDefault(), setter.isExternal(), setter.isInline(), getKind(), original == null ? null : original.getSetter(), setter.getSource());
            propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptorImpl2.getInitialSignatureDescriptor());
            propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) setter.getValueParameters().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        JavaPropertyDescriptor javaPropertyDescriptor3 = javaPropertyDescriptor;
        javaPropertyDescriptor3.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, getBackingField(), getDelegateField());
        javaPropertyDescriptor3.setSetterProjectedOut(isSetterProjectedOut());
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.compileTimeInitializer;
        if (nullableLazyValue != null) {
            javaPropertyDescriptor3.setCompileTimeInitializer(nullableLazyValue);
        }
        javaPropertyDescriptor3.setOverriddenDescriptors(getOverriddenDescriptors());
        if (kotlinType3 == null) {
            receiverParameterDescriptor = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType3, Annotations.Companion.getEMPTY());
        }
        javaPropertyDescriptor3.setType(kotlinType4, getTypeParameters(), getDispatchReceiverParameter(), receiverParameterDescriptor);
        return javaPropertyDescriptor3;
    }

    public <V> V getUserData(UserDataKey<V> userDataKey) {
        Pair<UserDataKey<?>, ?> pair = this.singleUserData;
        if (pair == null || !((UserDataKey) pair.mo31015c()).equals(userDataKey)) {
            return null;
        }
        return this.singleUserData.mo31016d();
    }

    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public boolean isConst() {
        KotlinType type = getType();
        return this.isStaticFinal && ConstUtil.canBeUsedForConstVal(type) && (!TypeEnhancementKt.hasEnhancedNullability(type) || KotlinBuiltIns.isString(type));
    }
}
