package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.C13142s;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12894x;
import kotlin.p587i0.C12775h;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* compiled from: DescriptorUtils.kt */
public final class DescriptorUtilsKt {
    private static final Name RETENTION_PARAMETER_NAME;

    static {
        Name identifier = Name.identifier("value");
        C12880j.m40222a((Object) identifier, "Name.identifier(\"value\")");
        RETENTION_PARAMETER_NAME = identifier;
    }

    public static final Collection<ClassDescriptor> computeSealedSubclasses(ClassDescriptor classDescriptor) {
        if (classDescriptor.getModality() != Modality.SEALED) {
            return C13185o.m40513a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = new DescriptorUtilsKt$computeSealedSubclasses$1(classDescriptor, linkedHashSet);
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        C12880j.m40222a((Object) containingDeclaration, "sealedClass.containingDeclaration");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            descriptorUtilsKt$computeSealedSubclasses$1.invoke(((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), false);
        }
        MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
        C12880j.m40222a((Object) unsubstitutedInnerClassesScope, "sealedClass.unsubstitutedInnerClassesScope");
        descriptorUtilsKt$computeSealedSubclasses$1.invoke(unsubstitutedInnerClassesScope, true);
        return linkedHashSet;
    }

    public static final boolean declaresOrInheritsDefaultValue(ValueParameterDescriptor valueParameterDescriptor) {
        Boolean ifAny = DFS.ifAny(C13183n.m40498a(valueParameterDescriptor), DescriptorUtilsKt$declaresOrInheritsDefaultValue$1.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        C12880j.m40222a((Object) ifAny, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return ifAny.booleanValue();
    }

    public static final ConstantValue<?> firstArgument(AnnotationDescriptor annotationDescriptor) {
        return (ConstantValue) C13199w.m40590g((Iterable) annotationDescriptor.getAllValueArguments().values());
    }

    public static final CallableMemberDescriptor firstOverridden(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1<? super CallableMemberDescriptor, Boolean> function1) {
        C12894x xVar = new C12894x();
        xVar.f29534c = null;
        return (CallableMemberDescriptor) DFS.dfs(C13183n.m40498a(callableMemberDescriptor), new DescriptorUtilsKt$firstOverridden$1(z), new DescriptorUtilsKt$firstOverridden$2(xVar, function1));
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }

    public static final FqName fqNameOrNull(DeclarationDescriptor declarationDescriptor) {
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static final ClassDescriptor getAnnotationClass(AnnotationDescriptor annotationDescriptor) {
        ClassifierDescriptor declarationDescriptor = annotationDescriptor.getType().getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        return (ClassDescriptor) declarationDescriptor;
    }

    public static final KotlinBuiltIns getBuiltIns(DeclarationDescriptor declarationDescriptor) {
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final ClassId getClassId(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            return null;
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            return new ClassId(((PackageFragmentDescriptor) containingDeclaration).getFqName(), classifierDescriptor.getName());
        }
        if (!(containingDeclaration instanceof ClassifierDescriptorWithTypeParameters)) {
            return null;
        }
        ClassId classId = getClassId((ClassifierDescriptor) containingDeclaration);
        if (classId != null) {
            return classId.createNestedClassId(classifierDescriptor.getName());
        }
        return null;
    }

    public static final FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        C12880j.m40222a((Object) fqNameSafe, "DescriptorUtils.getFqNameSafe(this)");
        return fqNameSafe;
    }

    public static final FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        C12880j.m40222a((Object) fqName, "DescriptorUtils.getFqName(this)");
        return fqName;
    }

    public static final ModuleDescriptor getModule(DeclarationDescriptor declarationDescriptor) {
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        C12880j.m40222a((Object) containingModule, "DescriptorUtils.getContainingModule(this)");
        return containingModule;
    }

    public static final C12775h<DeclarationDescriptor> getParents(DeclarationDescriptor declarationDescriptor) {
        return C12788p.m39986a(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final C12775h<DeclarationDescriptor> getParentsWithSelf(DeclarationDescriptor declarationDescriptor) {
        return C12781n.m39973a(declarationDescriptor, (Function1<? super T, ? extends T>) DescriptorUtilsKt$parentsWithSelf$1.INSTANCE);
    }

    public static final CallableMemberDescriptor getPropertyIfAccessor(CallableMemberDescriptor callableMemberDescriptor) {
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        C12880j.m40222a((Object) correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    public static final ClassDescriptor getSuperClassNotAny(ClassDescriptor classDescriptor) {
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(declarationDescriptor)) {
                    if (declarationDescriptor != null) {
                        return (ClassDescriptor) declarationDescriptor;
                    }
                    throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    public static final ClassDescriptor resolveTopLevelClass(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        boolean z = !fqName.isRoot();
        if (!C13147x.f29590a || z) {
            FqName parent = fqName.parent();
            C12880j.m40222a((Object) parent, "topLevelClassFqName.parent()");
            MemberScope memberScope = moduleDescriptor.getPackage(parent).getMemberScope();
            Name shortName = fqName.shortName();
            C12880j.m40222a((Object) shortName, "topLevelClassFqName.shortName()");
            ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier(shortName, lookupLocation);
            if (!(contributedClassifier instanceof ClassDescriptor)) {
                contributedClassifier = null;
            }
            return (ClassDescriptor) contributedClassifier;
        }
        throw new AssertionError("Assertion failed");
    }
}
