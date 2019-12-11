package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* compiled from: LazyJavaPackageFragment.kt */
final class LazyJavaPackageFragment$binaryClasses$2 extends C12881k implements Function0<Map<String, ? extends KotlinJvmBinaryClass>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.this$0 = lazyJavaPackageFragment;
        super(0);
    }

    public final Map<String, KotlinJvmBinaryClass> invoke() {
        PackagePartProvider packagePartProvider = this.this$0.f29560c.getComponents().getPackagePartProvider();
        String asString = this.this$0.getFqName().asString();
        C12880j.m40222a((Object) asString, "fqName.asString()");
        List<String> findPackageParts = packagePartProvider.findPackageParts(asString);
        ArrayList arrayList = new ArrayList();
        for (String str : findPackageParts) {
            JvmClassName byInternalName = JvmClassName.byInternalName(str);
            C12880j.m40222a((Object) byInternalName, "JvmClassName.byInternalName(partName)");
            ClassId classId = ClassId.topLevel(byInternalName.getFqNameForTopLevelClassMaybeWithDollars());
            C12880j.m40222a((Object) classId, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
            KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.this$0.f29560c.getComponents().getKotlinClassFinder(), classId);
            Pair a = findKotlinClass != null ? C12907r.m40244a(str, findKotlinClass) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }
}
