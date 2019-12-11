package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: DeserializedClassDataFinder.kt */
public final class DeserializedClassDataFinder implements ClassDataFinder {
    private final PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(PackageFragmentProvider packageFragmentProvider2) {
        this.packageFragmentProvider = packageFragmentProvider2;
    }

    public ClassData findClassData(ClassId classId) {
        PackageFragmentProvider packageFragmentProvider2 = this.packageFragmentProvider;
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkReturnedValueIsNotNull((Object) packageFqName, "classId.packageFqName");
        for (PackageFragmentDescriptor packageFragmentDescriptor : packageFragmentProvider2.getPackageFragments(packageFqName)) {
            if (packageFragmentDescriptor instanceof DeserializedPackageFragment) {
                ClassData findClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId);
                if (findClassData != null) {
                    return findClassData;
                }
            }
        }
        return null;
    }
}
