package kotlin.reflect.jvm.internal.components;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder$Result;", "fqName", "", "findKotlinClassOrContent", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectKotlinClassFinder.kt */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {
    private final ClassLoader classLoader;

    public ReflectKotlinClassFinder(ClassLoader classLoader2) {
        this.classLoader = classLoader2;
    }

    private final Result findKotlinClass(String str) {
        Class tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, str);
        if (tryLoadClass != null) {
            ReflectKotlinClass create = ReflectKotlinClass.Factory.create(tryLoadClass);
            if (create != null) {
                return new KotlinClass(create);
            }
        }
        return null;
    }

    public InputStream findBuiltInsData(FqName fqName) {
        if (!fqName.startsWith(KotlinBuiltIns.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.classLoader.getResourceAsStream(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
    }

    public Result findKotlinClassOrContent(ClassId classId) {
        return findKotlinClass(ReflectKotlinClassFinderKt.toRuntimeFqName(classId));
    }

    public Result findKotlinClassOrContent(JavaClass javaClass) {
        FqName fqName = javaClass.getFqName();
        if (fqName != null) {
            String asString = fqName.asString();
            if (asString != null) {
                return findKotlinClass(asString);
            }
        }
        return null;
    }
}
