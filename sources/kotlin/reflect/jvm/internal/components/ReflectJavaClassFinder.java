package kotlin.reflect.jvm.internal.components;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaPackage;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "request", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder$Request;", "findPackage", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "knownClassNamesInPackage", "", "", "packageFqName", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClassFinder.kt */
public final class ReflectJavaClassFinder implements JavaClassFinder {
    private final ClassLoader classLoader;

    public ReflectJavaClassFinder(ClassLoader classLoader2) {
        this.classLoader = classLoader2;
    }

    public JavaClass findClass(Request request) {
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkReturnedValueIsNotNull((Object) packageFqName, "classId.packageFqName");
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "classId.relativeClassName.asString()");
        String a = C12832w.m40115a(asString, '.', '$', false, 4, (Object) null);
        if (!packageFqName.isRoot()) {
            StringBuilder sb = new StringBuilder();
            sb.append(packageFqName.asString());
            sb.append(".");
            sb.append(a);
            a = sb.toString();
        }
        Class tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, a);
        if (tryLoadClass != null) {
            return new ReflectJavaClass(tryLoadClass);
        }
        return null;
    }

    public JavaPackage findPackage(FqName fqName) {
        return new ReflectJavaPackage(fqName);
    }

    public Set<String> knownClassNamesInPackage(FqName fqName) {
        return null;
    }
}
