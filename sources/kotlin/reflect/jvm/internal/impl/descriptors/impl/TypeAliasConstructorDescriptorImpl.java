package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.C13142s;
import kotlin.C13147x;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final Companion Companion = new Companion(null);
    private final StorageManager storageManager;
    private final TypeAliasDescriptor typeAliasDescriptor;
    private ClassConstructorDescriptor underlyingConstructorDescriptor;
    private final NullableLazyValue withDispatchReceiver$delegate;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final TypeSubstitutor getTypeSubstitutorForUnderlyingClass(TypeAliasDescriptor typeAliasDescriptor) {
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return TypeSubstitutor.create((KotlinType) typeAliasDescriptor.getExpandedType());
        }

        public final TypeAliasConstructorDescriptor createIfAvailable(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor) {
            TypeSubstitutor typeSubstitutorForUnderlyingClass = getTypeSubstitutorForUnderlyingClass(typeAliasDescriptor);
            ReceiverParameterDescriptor receiverParameterDescriptor = null;
            if (typeSubstitutorForUnderlyingClass != null) {
                ClassConstructorDescriptor substitute = classConstructorDescriptor.substitute(typeSubstitutorForUnderlyingClass);
                if (substitute != null) {
                    Annotations annotations = classConstructorDescriptor.getAnnotations();
                    Kind kind = classConstructorDescriptor.getKind();
                    C12880j.m40222a((Object) kind, "constructor.kind");
                    SourceElement source = typeAliasDescriptor.getSource();
                    C12880j.m40222a((Object) source, "typeAliasDescriptor.source");
                    TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, substitute, null, annotations, kind, source, null);
                    List substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, classConstructorDescriptor.getValueParameters(), typeSubstitutorForUnderlyingClass);
                    if (substitutedValueParameters != null) {
                        C12880j.m40222a((Object) substitutedValueParameters, "FunctionDescriptorImpl.g…         ) ?: return null");
                        SimpleType lowerIfFlexible = FlexibleTypesKt.lowerIfFlexible(substitute.getReturnType().unwrap());
                        SimpleType defaultType = typeAliasDescriptor.getDefaultType();
                        C12880j.m40222a((Object) defaultType, "typeAliasDescriptor.defaultType");
                        SimpleType withAbbreviation = SpecialTypesKt.withAbbreviation(lowerIfFlexible, defaultType);
                        ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor.getDispatchReceiverParameter();
                        if (dispatchReceiverParameter != null) {
                            C12880j.m40222a((Object) dispatchReceiverParameter, "it");
                            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptorImpl, typeSubstitutorForUnderlyingClass.safeSubstitute(dispatchReceiverParameter.getType(), Variance.INVARIANT), Annotations.Companion.getEMPTY());
                        }
                        typeAliasConstructorDescriptorImpl.initialize(receiverParameterDescriptor, null, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, withAbbreviation, Modality.FINAL, typeAliasDescriptor.getVisibility());
                        return typeAliasConstructorDescriptorImpl;
                    }
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager2, TypeAliasDescriptor typeAliasDescriptor2, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager2, typeAliasDescriptor2, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }

    public ClassDescriptor getConstructedClass() {
        ClassDescriptor constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        C12880j.m40222a((Object) constructedClass, "underlyingConstructorDescriptor.constructedClass");
        return constructedClass;
    }

    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        if (returnType != null) {
            return returnType;
        }
        C12880j.m40220a();
        throw null;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.typeAliasDescriptor;
    }

    public ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.underlyingConstructorDescriptor;
    }

    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    private TypeAliasConstructorDescriptorImpl(StorageManager storageManager2, TypeAliasDescriptor typeAliasDescriptor2, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor2, typeAliasConstructorDescriptor, annotations, Name.special("<init>"), kind, sourceElement);
        this.storageManager = storageManager2;
        this.typeAliasDescriptor = typeAliasDescriptor2;
        setActual(getTypeAliasDescriptor().isActual());
        this.withDispatchReceiver$delegate = this.storageManager.createNullableLazyValue(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, classConstructorDescriptor));
        this.underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    /* access modifiers changed from: protected */
    public TypeAliasConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        boolean z = false;
        boolean z2 = kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED;
        if (!C13147x.f29590a || z2) {
            if (name == null) {
                z = true;
            }
            if (!C13147x.f29590a || z) {
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(this.storageManager, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, Kind.DECLARATION, sourceElement);
                return typeAliasConstructorDescriptorImpl;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Renaming type alias constructor: ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating a type alias constructor that is not a declaration: \ncopy from: ");
        sb2.append(this);
        sb2.append("\nnewOwner: ");
        sb2.append(declarationDescriptor);
        sb2.append("\nkind: ");
        sb2.append(kind);
        throw new AssertionError(sb2.toString());
    }

    public TypeAliasConstructorDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z) {
        FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z).build();
        if (build != null) {
            return (TypeAliasConstructorDescriptor) build;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    public TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    public TypeAliasConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        FunctionDescriptor substitute = super.substitute(typeSubstitutor);
        if (substitute != null) {
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) substitute;
            TypeSubstitutor create = TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
            C12880j.m40222a((Object) create, "TypeSubstitutor.create(s…asConstructor.returnType)");
            ClassConstructorDescriptor substitute2 = getUnderlyingConstructorDescriptor().getOriginal().substitute(create);
            if (substitute2 == null) {
                return null;
            }
            typeAliasConstructorDescriptorImpl.underlyingConstructorDescriptor = substitute2;
            return typeAliasConstructorDescriptorImpl;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    public TypeAliasConstructorDescriptor getOriginal() {
        FunctionDescriptor original = super.getOriginal();
        if (original != null) {
            return (TypeAliasConstructorDescriptor) original;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }
}
