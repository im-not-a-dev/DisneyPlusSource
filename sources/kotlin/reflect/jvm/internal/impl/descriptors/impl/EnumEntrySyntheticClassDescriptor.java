package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Annotations annotations;
    /* access modifiers changed from: private */
    public final NotNullLazyValue<Set<Name>> enumMemberNames;
    private final MemberScope scope;
    private final TypeConstructor typeConstructor;

    private class EnumEntryScope extends MemberScopeImpl {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;
        private final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> functions;
        private final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> properties;
        final /* synthetic */ EnumEntrySyntheticClassDescriptor this$0;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = str2;
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            String str3 = "getContributedDescriptors";
            String str4 = "resolveFakeOverrides";
            String str5 = "getContributedFunctions";
            String str6 = "getContributedVariables";
            if (i == 3) {
                objArr[1] = str6;
            } else if (i == 7) {
                objArr[1] = str5;
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = str3;
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = str4;
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = str6;
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = str5;
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = str4;
                    break;
                case 13:
                case 14:
                    objArr[2] = str3;
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public EnumEntryScope(final EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                $$$reportNull$$$0(0);
            }
            this.this$0 = enumEntrySyntheticClassDescriptor;
            this.functions = storageManager.createMemoizedFunction(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() {
                public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                    return EnumEntryScope.this.computeFunctions(name);
                }
            });
            this.properties = storageManager.createMemoizedFunction(new Function1<Name, Collection<? extends PropertyDescriptor>>() {
                public Collection<? extends PropertyDescriptor> invoke(Name name) {
                    return EnumEntryScope.this.computeProperties(name);
                }
            });
            this.allDescriptors = storageManager.createLazyValue(new Function0<Collection<DeclarationDescriptor>>() {
                public Collection<DeclarationDescriptor> invoke() {
                    return EnumEntryScope.this.computeAllDeclarations();
                }
            });
        }

        /* access modifiers changed from: private */
        public Collection<DeclarationDescriptor> computeAllDeclarations() {
            HashSet hashSet = new HashSet();
            for (Name name : (Set) this.this$0.enumMemberNames.invoke()) {
                hashSet.addAll(getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(getContributedVariables(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        /* access modifiers changed from: private */
        public Collection<? extends SimpleFunctionDescriptor> computeFunctions(Name name) {
            if (name == null) {
                $$$reportNull$$$0(8);
            }
            return resolveFakeOverrides(name, getSupertypeScope().getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* access modifiers changed from: private */
        public Collection<? extends PropertyDescriptor> computeProperties(Name name) {
            if (name == null) {
                $$$reportNull$$$0(4);
            }
            return resolveFakeOverrides(name, getSupertypeScope().getContributedVariables(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        private MemberScope getSupertypeScope() {
            MemberScope memberScope = ((KotlinType) this.this$0.getTypeConstructor().getSupertypes().iterator().next()).getMemberScope();
            if (memberScope == null) {
                $$$reportNull$$$0(9);
            }
            return memberScope;
        }

        private <D extends CallableMemberDescriptor> Collection<? extends D> resolveFakeOverrides(Name name, Collection<? extends D> collection) {
            if (name == null) {
                $$$reportNull$$$0(10);
            }
            if (collection == null) {
                $$$reportNull$$$0(11);
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.generateOverridesInFunctionGroup(name, collection, Collections.emptySet(), this.this$0, new NonReportingOverrideStrategy() {
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    Object[] objArr = new Object[3];
                    if (i == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i == 1 || i == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(0);
                    }
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }

                /* access modifiers changed from: protected */
                public void conflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(1);
                    }
                    if (callableMemberDescriptor2 == null) {
                        $$$reportNull$$$0(2);
                    }
                }
            });
            return linkedHashSet;
        }

        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(13);
            }
            if (function1 == null) {
                $$$reportNull$$$0(14);
            }
            Collection<DeclarationDescriptor> collection = (Collection) this.allDescriptors.invoke();
            if (collection == null) {
                $$$reportNull$$$0(15);
            }
            return collection;
        }

        public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            Collection<? extends SimpleFunctionDescriptor> collection = (Collection) this.functions.invoke(name);
            if (collection == null) {
                $$$reportNull$$$0(7);
            }
            return collection;
        }

        public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            Collection<? extends PropertyDescriptor> collection = (Collection) this.properties.invoke(name);
            if (collection == null) {
                $$$reportNull$$$0(3);
            }
            return collection;
        }

        public Set<Name> getFunctionNames() {
            Set<Name> set = (Set) this.this$0.enumMemberNames.invoke();
            if (set == null) {
                $$$reportNull$$$0(17);
            }
            return set;
        }

        public Set<Name> getVariableNames() {
            Set<Name> set = (Set) this.this$0.enumMemberNames.invoke();
            if (set == null) {
                $$$reportNull$$$0(19);
            }
            return set;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getConstructors";
                break;
            case 16:
                objArr[1] = "getTypeConstructor";
                break;
            case 17:
                objArr[1] = "getKind";
                break;
            case 18:
                objArr[1] = "getModality";
                break;
            case 19:
                objArr[1] = "getVisibility";
                break;
            case 20:
                objArr[1] = "getAnnotations";
                break;
            case 21:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 22:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    private EnumEntrySyntheticClassDescriptor(StorageManager storageManager, ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations2, SourceElement sourceElement) {
        if (storageManager == null) {
            $$$reportNull$$$0(6);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(8);
        }
        if (name == null) {
            $$$reportNull$$$0(9);
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(10);
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(11);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(12);
        }
        super(storageManager, classDescriptor, name, sourceElement, false);
        this.annotations = annotations2;
        this.typeConstructor = new ClassTypeConstructorImpl(this, Collections.emptyList(), Collections.singleton(kotlinType), storageManager);
        this.scope = new EnumEntryScope(this, storageManager);
        this.enumMemberNames = notNullLazyValue;
    }

    public static EnumEntrySyntheticClassDescriptor create(StorageManager storageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations2, SourceElement sourceElement) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(3);
        }
        if (annotations2 == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor = new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name, notNullLazyValue, annotations2, sourceElement);
        return enumEntrySyntheticClassDescriptor;
    }

    public Annotations getAnnotations() {
        Annotations annotations2 = this.annotations;
        if (annotations2 == null) {
            $$$reportNull$$$0(20);
        }
        return annotations2;
    }

    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    public Collection<ClassConstructorDescriptor> getConstructors() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(15);
        }
        return emptyList;
    }

    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(21);
        }
        return emptyList;
    }

    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            $$$reportNull$$$0(17);
        }
        return classKind;
    }

    public Modality getModality() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            $$$reportNull$$$0(18);
        }
        return modality;
    }

    public Collection<ClassDescriptor> getSealedSubclasses() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            $$$reportNull$$$0(22);
        }
        return emptyList;
    }

    public MemberScope getStaticScope() {
        Empty empty = Empty.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(14);
        }
        return empty;
    }

    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor2 = this.typeConstructor;
        if (typeConstructor2 == null) {
            $$$reportNull$$$0(16);
        }
        return typeConstructor2;
    }

    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope memberScope = this.scope;
        if (memberScope == null) {
            $$$reportNull$$$0(13);
        }
        return memberScope;
    }

    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public Visibility getVisibility() {
        Visibility visibility = Visibilities.PUBLIC;
        if (visibility == null) {
            $$$reportNull$$$0(19);
        }
        return visibility;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("enum entry ");
        sb.append(getName());
        return sb.toString();
    }
}
