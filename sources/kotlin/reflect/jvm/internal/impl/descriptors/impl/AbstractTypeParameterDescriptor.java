package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {
    private final NotNullLazyValue<SimpleType> defaultType;
    private final int index;
    private final boolean reified;
    private final NotNullLazyValue<TypeConstructor> typeConstructor;
    private final Variance variance;

    private class TypeParameterTypeConstructor extends AbstractTypeConstructor {
        private final SupertypeLoopChecker supertypeLoopChecker;
        final /* synthetic */ AbstractTypeParameterDescriptor this$0;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = str2;
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 5) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public TypeParameterTypeConstructor(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker2) {
            if (storageManager == null) {
                $$$reportNull$$$0(0);
            }
            this.this$0 = abstractTypeParameterDescriptor;
            super(storageManager);
            this.supertypeLoopChecker = supertypeLoopChecker2;
        }

        /* access modifiers changed from: protected */
        public Collection<KotlinType> computeSupertypes() {
            List resolveUpperBounds = this.this$0.resolveUpperBounds();
            if (resolveUpperBounds == null) {
                $$$reportNull$$$0(1);
            }
            return resolveUpperBounds;
        }

        /* access modifiers changed from: protected */
        public KotlinType defaultSupertypeIfEmpty() {
            return ErrorUtils.createErrorType("Cyclic upper bounds");
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.this$0);
            if (builtIns == null) {
                $$$reportNull$$$0(4);
            }
            return builtIns;
        }

        public ClassifierDescriptor getDeclarationDescriptor() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.this$0;
            if (abstractTypeParameterDescriptor == null) {
                $$$reportNull$$$0(3);
            }
            return abstractTypeParameterDescriptor;
        }

        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(2);
            }
            return emptyList;
        }

        /* access modifiers changed from: protected */
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            SupertypeLoopChecker supertypeLoopChecker2 = this.supertypeLoopChecker;
            if (supertypeLoopChecker2 == null) {
                $$$reportNull$$$0(5);
            }
            return supertypeLoopChecker2;
        }

        public boolean isDenotable() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void reportSupertypeLoopError(KotlinType kotlinType) {
            if (kotlinType == null) {
                $$$reportNull$$$0(6);
            }
            this.this$0.reportSupertypeLoopError(kotlinType);
        }

        public String toString() {
            return this.this$0.getName().toString();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    protected AbstractTypeParameterDescriptor(final StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, final Name name, Variance variance2, boolean z, int i, SourceElement sourceElement, final SupertypeLoopChecker supertypeLoopChecker) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (annotations == null) {
            $$$reportNull$$$0(2);
        }
        if (name == null) {
            $$$reportNull$$$0(3);
        }
        if (variance2 == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        if (supertypeLoopChecker == null) {
            $$$reportNull$$$0(6);
        }
        super(declarationDescriptor, annotations, name, sourceElement);
        this.variance = variance2;
        this.reified = z;
        this.index = i;
        this.typeConstructor = storageManager.createLazyValue(new Function0<TypeConstructor>() {
            public TypeConstructor invoke() {
                return new TypeParameterTypeConstructor(AbstractTypeParameterDescriptor.this, storageManager, supertypeLoopChecker);
            }
        });
        this.defaultType = storageManager.createLazyValue(new Function0<SimpleType>() {
            public SimpleType invoke() {
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(Annotations.Companion.getEMPTY(), AbstractTypeParameterDescriptor.this.getTypeConstructor(), Collections.emptyList(), false, new LazyScopeAdapter(storageManager.createLazyValue(new Function0<MemberScope>() {
                    public MemberScope invoke() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Scope for type parameter ");
                        sb.append(name.asString());
                        return TypeIntersectionScope.create(sb.toString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
                    }
                })));
            }
        });
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d);
    }

    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.defaultType.invoke();
        if (simpleType == null) {
            $$$reportNull$$$0(10);
        }
        return simpleType;
    }

    public int getIndex() {
        return this.index;
    }

    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor2 = (TypeConstructor) this.typeConstructor.invoke();
        if (typeConstructor2 == null) {
            $$$reportNull$$$0(9);
        }
        return typeConstructor2;
    }

    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((TypeParameterTypeConstructor) getTypeConstructor()).getSupertypes();
        if (supertypes == null) {
            $$$reportNull$$$0(8);
        }
        return supertypes;
    }

    public Variance getVariance() {
        Variance variance2 = this.variance;
        if (variance2 == null) {
            $$$reportNull$$$0(7);
        }
        return variance2;
    }

    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    public boolean isReified() {
        return this.reified;
    }

    /* access modifiers changed from: protected */
    public abstract void reportSupertypeLoopError(KotlinType kotlinType);

    /* access modifiers changed from: protected */
    public abstract List<KotlinType> resolveUpperBounds();

    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(11);
        }
        return typeParameterDescriptor;
    }
}
