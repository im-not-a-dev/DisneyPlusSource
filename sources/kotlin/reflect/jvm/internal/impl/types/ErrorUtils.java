package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl;

public class ErrorUtils {
    private static final ErrorClassDescriptor ERROR_CLASS = new ErrorClassDescriptor(Name.special("<ERROR CLASS>"));
    private static final ModuleDescriptor ERROR_MODULE = new ModuleDescriptor() {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = str2;
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            String str3 = "getSubPackagesOf";
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = str3;
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i == 12) {
                objArr[1] = "getOriginal";
            } else if (i != 13) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = str3;
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            if (declarationDescriptorVisitor == null) {
                $$$reportNull$$$0(10);
            }
            return null;
        }

        public Annotations getAnnotations() {
            Annotations empty = Annotations.Companion.getEMPTY();
            if (empty == null) {
                $$$reportNull$$$0(1);
            }
            return empty;
        }

        public KotlinBuiltIns getBuiltIns() {
            DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
            if (instance == null) {
                $$$reportNull$$$0(13);
            }
            return instance;
        }

        public DeclarationDescriptor getContainingDeclaration() {
            return null;
        }

        public Name getName() {
            Name special = Name.special("<ERROR MODULE>");
            if (special == null) {
                $$$reportNull$$$0(5);
            }
            return special;
        }

        public DeclarationDescriptor getOriginal() {
            return this;
        }

        public PackageViewDescriptor getPackage(FqName fqName) {
            if (fqName == null) {
                $$$reportNull$$$0(7);
            }
            throw new IllegalStateException("Should not be called!");
        }

        public Collection<FqName> getSubPackagesOf(FqName fqName, Function1<? super Name, Boolean> function1) {
            if (fqName == null) {
                $$$reportNull$$$0(2);
            }
            if (function1 == null) {
                $$$reportNull$$$0(3);
            }
            List a = C13185o.m40513a();
            if (a == null) {
                $$$reportNull$$$0(4);
            }
            return a;
        }

        public boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor) {
            if (moduleDescriptor == null) {
                $$$reportNull$$$0(11);
            }
            return false;
        }
    };
    private static final PropertyDescriptor ERROR_PROPERTY = createErrorProperty();
    /* access modifiers changed from: private */
    public static final Set<PropertyDescriptor> ERROR_PROPERTY_GROUP = Collections.singleton(ERROR_PROPERTY);
    private static final KotlinType ERROR_PROPERTY_TYPE = createErrorType("<ERROR PROPERTY TYPE>");
    public static final SimpleType ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES = createErrorType("<LOOP IN SUPERTYPES>");

    private static class ErrorClassDescriptor extends ClassDescriptorImpl {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 2 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 4 || i == 6) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 4:
                case 6:
                    objArr[0] = str2;
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 5:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            String str3 = "getMemberScope";
            String str4 = "substitute";
            if (i == 2) {
                objArr[1] = str4;
            } else if (i == 4 || i == 6) {
                objArr[1] = str3;
            } else {
                objArr[1] = str2;
            }
            switch (i) {
                case 1:
                    objArr[2] = str4;
                    break;
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public ErrorClassDescriptor(Name name) {
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            super(ErrorUtils.getErrorModule(), name, Modality.OPEN, ClassKind.CLASS, Collections.emptyList(), SourceElement.NO_SOURCE, false, LockBasedStorageManager.NO_LOCKS);
            ClassConstructorDescriptorImpl create = ClassConstructorDescriptorImpl.create(this, Annotations.Companion.getEMPTY(), true, SourceElement.NO_SOURCE);
            create.initialize(Collections.emptyList(), Visibilities.INTERNAL);
            MemberScope createErrorScope = ErrorUtils.createErrorScope(getName().asString());
            create.setReturnType(new ErrorType(ErrorUtils.createErrorTypeConstructorWithCustomDebugName("<ERROR>", this), createErrorScope));
            initialize(createErrorScope, Collections.singleton(create), create);
        }

        public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                $$$reportNull$$$0(5);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error scope for class ");
            sb.append(getName());
            sb.append(" with arguments: ");
            sb.append(typeSubstitution);
            MemberScope createErrorScope = ErrorUtils.createErrorScope(sb.toString());
            if (createErrorScope == null) {
                $$$reportNull$$$0(6);
            }
            return createErrorScope;
        }

        public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor == null) {
                $$$reportNull$$$0(1);
            }
            return this;
        }

        public String toString() {
            return getName().asString();
        }
    }

    public static class ErrorScope implements MemberScope {
        private final String debugMessage;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = str2;
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            String str3 = "getContributedDescriptors";
            String str4 = "getContributedFunctions";
            String str5 = "getContributedVariables";
            if (i == 7) {
                objArr[1] = str5;
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = str4;
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = str3;
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = str5;
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = str4;
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = str3;
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            return ErrorUtils.createErrorClass(name.asString());
        }

        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(16);
            }
            if (function1 == null) {
                $$$reportNull$$$0(17);
            }
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(18);
            }
            return emptyList;
        }

        public Set<Name> getFunctionNames() {
            Set<Name> emptySet = Collections.emptySet();
            if (emptySet == null) {
                $$$reportNull$$$0(11);
            }
            return emptySet;
        }

        public Set<Name> getVariableNames() {
            Set<Name> emptySet = Collections.emptySet();
            if (emptySet == null) {
                $$$reportNull$$$0(12);
            }
            return emptySet;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ErrorScope{");
            sb.append(this.debugMessage);
            sb.append('}');
            return sb.toString();
        }

        private ErrorScope(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.debugMessage = str;
        }

        public Set<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(8);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(9);
            }
            Set<? extends SimpleFunctionDescriptor> singleton = Collections.singleton(ErrorUtils.createErrorFunction(this));
            if (singleton == null) {
                $$$reportNull$$$0(10);
            }
            return singleton;
        }

        public Set<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            Set<? extends PropertyDescriptor> access$000 = ErrorUtils.ERROR_PROPERTY_GROUP;
            if (access$000 == null) {
                $$$reportNull$$$0(7);
            }
            return access$000;
        }
    }

    private static class ThrowingScope implements MemberScope {
        private final String debugMessage;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.debugMessage);
            sb.append(", required name: ");
            sb.append(name);
            throw new IllegalStateException(sb.toString());
        }

        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(9);
            }
            if (function1 == null) {
                $$$reportNull$$$0(10);
            }
            throw new IllegalStateException(this.debugMessage);
        }

        public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(7);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(8);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.debugMessage);
            sb.append(", required name: ");
            sb.append(name);
            throw new IllegalStateException(sb.toString());
        }

        public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.debugMessage);
            sb.append(", required name: ");
            sb.append(name);
            throw new IllegalStateException(sb.toString());
        }

        public Set<Name> getFunctionNames() {
            throw new IllegalStateException();
        }

        public Set<Name> getVariableNames() {
            throw new IllegalStateException();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ThrowingScope{");
            sb.append(this.debugMessage);
            sb.append('}');
            return sb.toString();
        }

        private ThrowingScope(String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.debugMessage = str;
        }
    }

    public static class UninferredParameterTypeConstructor implements TypeConstructor {
        private final TypeConstructor errorTypeConstructor;
        private final TypeParameterDescriptor typeParameterDescriptor;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "descriptor";
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.typeParameterDescriptor);
            if (builtIns == null) {
                $$$reportNull$$$0(4);
            }
            return builtIns;
        }

        public ClassifierDescriptor getDeclarationDescriptor() {
            return this.errorTypeConstructor.getDeclarationDescriptor();
        }

        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.errorTypeConstructor.getParameters();
            if (parameters == null) {
                $$$reportNull$$$0(2);
            }
            return parameters;
        }

        public Collection<KotlinType> getSupertypes() {
            Collection<KotlinType> supertypes = this.errorTypeConstructor.getSupertypes();
            if (supertypes == null) {
                $$$reportNull$$$0(3);
            }
            return supertypes;
        }

        public TypeParameterDescriptor getTypeParameterDescriptor() {
            TypeParameterDescriptor typeParameterDescriptor2 = this.typeParameterDescriptor;
            if (typeParameterDescriptor2 == null) {
                $$$reportNull$$$0(1);
            }
            return typeParameterDescriptor2;
        }

        public boolean isDenotable() {
            return this.errorTypeConstructor.isDenotable();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 6 || i == 19) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        String str3 = "createErrorFunction";
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = str3;
        } else if (i != 19) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = str3;
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 6 || i == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static ClassDescriptor createErrorClass(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<ERROR CLASS: ");
        sb.append(str);
        sb.append(">");
        return new ErrorClassDescriptor(Name.special(sb.toString()));
    }

    /* access modifiers changed from: private */
    public static SimpleFunctionDescriptor createErrorFunction(ErrorScope errorScope) {
        if (errorScope == null) {
            $$$reportNull$$$0(5);
        }
        ErrorSimpleFunctionDescriptorImpl errorSimpleFunctionDescriptorImpl = new ErrorSimpleFunctionDescriptorImpl(ERROR_CLASS, errorScope);
        errorSimpleFunctionDescriptorImpl.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, Collections.emptyList(), Collections.emptyList(), (KotlinType) createErrorType("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, Visibilities.PUBLIC);
        return errorSimpleFunctionDescriptorImpl;
    }

    private static PropertyDescriptorImpl createErrorProperty() {
        PropertyDescriptorImpl create = PropertyDescriptorImpl.create(ERROR_CLASS, Annotations.Companion.getEMPTY(), Modality.OPEN, Visibilities.PUBLIC, true, Name.special("<ERROR PROPERTY>"), Kind.DECLARATION, SourceElement.NO_SOURCE, false, false, false, false, false, false);
        create.setType(ERROR_PROPERTY_TYPE, Collections.emptyList(), null, null);
        if (create == null) {
            $$$reportNull$$$0(4);
        }
        return create;
    }

    public static MemberScope createErrorScope(String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        return createErrorScope(str, false);
    }

    public static SimpleType createErrorType(String str) {
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        return createErrorTypeWithArguments(str, Collections.emptyList());
    }

    public static TypeConstructor createErrorTypeConstructor(String str) {
        if (str == null) {
            $$$reportNull$$$0(15);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ERROR : ");
        sb.append(str);
        sb.append("]");
        return createErrorTypeConstructorWithCustomDebugName(sb.toString(), ERROR_CLASS);
    }

    public static TypeConstructor createErrorTypeConstructorWithCustomDebugName(String str) {
        if (str == null) {
            $$$reportNull$$$0(16);
        }
        return createErrorTypeConstructorWithCustomDebugName(str, ERROR_CLASS);
    }

    public static SimpleType createErrorTypeWithArguments(String str, List<TypeProjection> list) {
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        if (list == null) {
            $$$reportNull$$$0(12);
        }
        return new ErrorType(createErrorTypeConstructor(str), createErrorScope(str), list, false);
    }

    public static SimpleType createErrorTypeWithCustomConstructor(String str, TypeConstructor typeConstructor) {
        if (str == null) {
            $$$reportNull$$$0(9);
        }
        if (typeConstructor == null) {
            $$$reportNull$$$0(10);
        }
        return new ErrorType(typeConstructor, createErrorScope(str));
    }

    public static SimpleType createErrorTypeWithCustomDebugName(String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        return createErrorTypeWithCustomConstructor(str, createErrorTypeConstructorWithCustomDebugName(str));
    }

    public static ModuleDescriptor getErrorModule() {
        ModuleDescriptor moduleDescriptor = ERROR_MODULE;
        if (moduleDescriptor == null) {
            $$$reportNull$$$0(19);
        }
        return moduleDescriptor;
    }

    public static boolean isError(DeclarationDescriptor declarationDescriptor) {
        boolean z = false;
        if (declarationDescriptor == null) {
            return false;
        }
        if (isErrorClass(declarationDescriptor) || isErrorClass(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == ERROR_MODULE) {
            z = true;
        }
        return z;
    }

    private static boolean isErrorClass(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    public static boolean isUninferredParameter(KotlinType kotlinType) {
        return kotlinType != null && (kotlinType.getConstructor() instanceof UninferredParameterTypeConstructor);
    }

    public static MemberScope createErrorScope(String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        if (z) {
            return new ThrowingScope(str);
        }
        return new ErrorScope(str);
    }

    /* access modifiers changed from: private */
    public static TypeConstructor createErrorTypeConstructorWithCustomDebugName(final String str, final ErrorClassDescriptor errorClassDescriptor) {
        if (str == null) {
            $$$reportNull$$$0(17);
        }
        if (errorClassDescriptor == null) {
            $$$reportNull$$$0(18);
        }
        return new TypeConstructor() {
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[2];
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
                if (i == 1) {
                    objArr[1] = "getSupertypes";
                } else if (i != 2) {
                    objArr[1] = "getParameters";
                } else {
                    objArr[1] = "getBuiltIns";
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
            }

            public KotlinBuiltIns getBuiltIns() {
                DefaultBuiltIns instance = DefaultBuiltIns.getInstance();
                if (instance == null) {
                    $$$reportNull$$$0(2);
                }
                return instance;
            }

            public ClassifierDescriptor getDeclarationDescriptor() {
                return errorClassDescriptor;
            }

            public List<TypeParameterDescriptor> getParameters() {
                List<TypeParameterDescriptor> a = C13185o.m40513a();
                if (a == null) {
                    $$$reportNull$$$0(0);
                }
                return a;
            }

            public Collection<KotlinType> getSupertypes() {
                List a = C13185o.m40513a();
                if (a == null) {
                    $$$reportNull$$$0(1);
                }
                return a;
            }

            public boolean isDenotable() {
                return false;
            }

            public String toString() {
                return str;
            }
        };
    }
}
