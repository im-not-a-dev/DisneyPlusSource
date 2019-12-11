package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.C12898l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: LazyJavaPackageScope.kt */
final class LazyJavaPackageScope$classes$1 extends C12881k implements Function1<FindClassRequest, ClassDescriptor> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f29561$c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.this$0 = lazyJavaPackageScope;
        this.f29561$c = lazyJavaResolverContext;
        super(1);
    }

    public final ClassDescriptor invoke(FindClassRequest findClassRequest) {
        Result result;
        byte[] bArr;
        ClassId classId = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), findClassRequest.getName());
        if (findClassRequest.getJavaClass() != null) {
            result = this.f29561$c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(findClassRequest.getJavaClass());
        } else {
            result = this.f29561$c.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId);
        }
        ClassDescriptor classDescriptor = 0;
        KotlinJvmBinaryClass kotlinJvmBinaryClass = result != null ? result.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        KotlinClassLookupResult access$resolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
        if (access$resolveKotlinBinaryClass instanceof Found) {
            classDescriptor = ((Found) access$resolveKotlinBinaryClass).getDescriptor();
        } else if (!(access$resolveKotlinBinaryClass instanceof SyntheticClass)) {
            if (access$resolveKotlinBinaryClass instanceof NotFound) {
                JavaClass javaClass = findClassRequest.getJavaClass();
                if (javaClass == null) {
                    JavaClassFinder finder = this.f29561$c.getComponents().getFinder();
                    if (result != null) {
                        if (!(result instanceof ClassFileContent)) {
                            result = null;
                        }
                        ClassFileContent classFileContent = (ClassFileContent) result;
                        if (classFileContent != null) {
                            bArr = classFileContent.getContent();
                            Request request = new Request(classId, bArr, null, 4, null);
                            javaClass = finder.findClass(request);
                        }
                    }
                    bArr = null;
                    Request request2 = new Request(classId, bArr, null, 4, null);
                    javaClass = finder.findClass(request2);
                }
                JavaClass javaClass2 = javaClass;
                if ((javaClass2 != null ? javaClass2.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                    FqName fqName = javaClass2 != null ? javaClass2.getFqName() : null;
                    if (fqName != null && !fqName.isRoot() && !(!Intrinsics.areEqual((Object) fqName.parent(), (Object) this.this$0.getOwnerDescriptor().getFqName()))) {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f29561$c, this.this$0.getOwnerDescriptor(), javaClass2, null, 8, null);
                        this.f29561$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                        classDescriptor = lazyJavaClassDescriptor;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                    sb.append("JavaClass: ");
                    sb.append(javaClass2);
                    sb.append(10);
                    sb.append("ClassId: ");
                    sb.append(classId);
                    sb.append(10);
                    sb.append("findKotlinClass(JavaClass) = ");
                    sb.append(KotlinClassFinderKt.findKotlinClass(this.f29561$c.getComponents().getKotlinClassFinder(), javaClass2));
                    sb.append(10);
                    sb.append("findKotlinClass(ClassId) = ");
                    sb.append(KotlinClassFinderKt.findKotlinClass(this.f29561$c.getComponents().getKotlinClassFinder(), classId));
                    sb.append(10);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new C12898l();
            }
        }
        return classDescriptor;
    }
}
