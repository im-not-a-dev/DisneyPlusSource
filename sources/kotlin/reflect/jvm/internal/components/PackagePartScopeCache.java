package kotlin.reflect.jvm.internal.components;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope.Companion;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/PackagePartScopeCache;", "", "resolver", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/DeserializedDescriptorResolver;", "kotlinClassFinder", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "(Lorg/jetbrains/kotlin/load/kotlin/DeserializedDescriptorResolver;Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getPackagePartScope", "fileClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PackagePartScopeCache.kt */
public final class PackagePartScopeCache {
    private final ConcurrentHashMap<ClassId, MemberScope> cache = new ConcurrentHashMap<>();
    private final ReflectKotlinClassFinder kotlinClassFinder;
    private final DeserializedDescriptorResolver resolver;

    public PackagePartScopeCache(DeserializedDescriptorResolver deserializedDescriptorResolver, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        this.resolver = deserializedDescriptorResolver;
        this.kotlinClassFinder = reflectKotlinClassFinder;
    }

    public final MemberScope getPackagePartScope(ReflectKotlinClass reflectKotlinClass) {
        List<KotlinJvmBinaryClass> list;
        ConcurrentHashMap<ClassId, MemberScope> concurrentHashMap = this.cache;
        ClassId classId = reflectKotlinClass.getClassId();
        Object obj = concurrentHashMap.get(classId);
        if (obj == null) {
            FqName packageFqName = reflectKotlinClass.getClassId().getPackageFqName();
            C12880j.m40222a((Object) packageFqName, "fileClass.classId.packageFqName");
            if (reflectKotlinClass.getClassHeader().getKind() == Kind.MULTIFILE_CLASS) {
                List<String> multifilePartNames = reflectKotlinClass.getClassHeader().getMultifilePartNames();
                list = new ArrayList<>();
                for (String byInternalName : multifilePartNames) {
                    JvmClassName byInternalName2 = JvmClassName.byInternalName(byInternalName);
                    C12880j.m40222a((Object) byInternalName2, "JvmClassName.byInternalName(partName)");
                    ClassId classId2 = ClassId.topLevel(byInternalName2.getFqNameForTopLevelClassMaybeWithDollars());
                    C12880j.m40222a((Object) classId2, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                    KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass((KotlinClassFinder) this.kotlinClassFinder, classId2);
                    if (findKotlinClass != null) {
                        list.add(findKotlinClass);
                    }
                }
            } else {
                list = C13183n.m40498a(reflectKotlinClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(this.resolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            for (KotlinJvmBinaryClass createKotlinPackagePartScope : list) {
                MemberScope createKotlinPackagePartScope2 = this.resolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, createKotlinPackagePartScope);
                if (createKotlinPackagePartScope2 != null) {
                    arrayList.add(createKotlinPackagePartScope2);
                }
            }
            List q = C13199w.m40606q(arrayList);
            Companion companion = ChainedMemberScope.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("package ");
            sb.append(packageFqName);
            sb.append(" (");
            sb.append(reflectKotlinClass);
            sb.append(')');
            obj = companion.create(sb.toString(), q);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(classId, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        C12880j.m40222a(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return (MemberScope) obj;
    }
}
