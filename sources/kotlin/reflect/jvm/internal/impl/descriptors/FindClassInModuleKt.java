package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: findClassInModule.kt */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        FqName packageFqName = classId.getPackageFqName();
        C12880j.m40222a((Object) packageFqName, "classId.packageFqName");
        PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
        List pathSegments = classId.getRelativeClassName().pathSegments();
        C12880j.m40222a((Object) pathSegments, "classId.relativeClassName.pathSegments()");
        MemberScope memberScope = packageViewDescriptor.getMemberScope();
        Object f = C13199w.m40589f(pathSegments);
        C12880j.m40222a(f, "segments.first()");
        ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier((Name) f, NoLookupLocation.FROM_DESERIALIZATION);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        if (classDescriptor == null) {
            return null;
        }
        for (Name name : pathSegments.subList(1, pathSegments.size())) {
            MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
            C12880j.m40222a((Object) name, "name");
            ClassifierDescriptor contributedClassifier2 = unsubstitutedInnerClassesScope.getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(contributedClassifier2 instanceof ClassDescriptor)) {
                contributedClassifier2 = null;
            }
            classDescriptor = (ClassDescriptor) contributedClassifier2;
            if (classDescriptor == null) {
                return null;
            }
        }
        return classDescriptor;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            return findClassAcrossModuleDependencies;
        }
        return notFoundClasses.getClass(classId, C12788p.m39999g(C12788p.m39994d(C12781n.m39973a(classId, (Function1<? super T, ? extends T>) C12930x24bfe126.INSTANCE), C12931x24bfe127.INSTANCE)));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        FqName packageFqName = classId.getPackageFqName();
        C12880j.m40222a((Object) packageFqName, "classId.packageFqName");
        PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
        List pathSegments = classId.getRelativeClassName().pathSegments();
        C12880j.m40222a((Object) pathSegments, "classId.relativeClassName.pathSegments()");
        int size = pathSegments.size() - 1;
        MemberScope memberScope = packageViewDescriptor.getMemberScope();
        Object f = C13199w.m40589f(pathSegments);
        C12880j.m40222a(f, "segments.first()");
        ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier((Name) f, NoLookupLocation.FROM_DESERIALIZATION);
        if (size == 0) {
            if (!(contributedClassifier instanceof TypeAliasDescriptor)) {
                contributedClassifier = null;
            }
            return (TypeAliasDescriptor) contributedClassifier;
        }
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        if (classDescriptor == null) {
            return null;
        }
        for (Name name : pathSegments.subList(1, size)) {
            MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
            C12880j.m40222a((Object) name, "name");
            ClassifierDescriptor contributedClassifier2 = unsubstitutedInnerClassesScope.getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
            if (!(contributedClassifier2 instanceof ClassDescriptor)) {
                contributedClassifier2 = null;
            }
            classDescriptor = (ClassDescriptor) contributedClassifier2;
            if (classDescriptor == null) {
                return null;
            }
        }
        Name name2 = (Name) pathSegments.get(size);
        MemberScope unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope();
        C12880j.m40222a((Object) name2, "lastName");
        ClassifierDescriptor contributedClassifier3 = unsubstitutedMemberScope.getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
        if (!(contributedClassifier3 instanceof TypeAliasDescriptor)) {
            contributedClassifier3 = null;
        }
        return (TypeAliasDescriptor) contributedClassifier3;
    }
}
