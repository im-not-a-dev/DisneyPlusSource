package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.List;
import kotlin.C12897k;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.TypeQualifierWithApplicability;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

/* compiled from: context.kt */
public final class ContextKt {
    public static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final LazyJavaResolverContext childForClassOrPackage(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        return child(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, C12763i.m39922a(C12897k.NONE, new ContextKt$childForClassOrPackage$1(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    public static final LazyJavaResolverContext childForMethod(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        return child(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, code=kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, for r6v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, java.lang.Iterable] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> r6) {
        /*
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r5.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver r0 = r0.getAnnotationTypeQualifierResolver()
            boolean r0 = r0.getDisabled()
            if (r0 == 0) goto L_0x0013
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r5 = r5.getDefaultTypeQualifiers()
            return r5
        L_0x0013:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability r1 = extractDefaultNullabilityQualifier(r5, r1)
            if (r1 == 0) goto L_0x001c
            r0.add(r1)
            goto L_0x001c
        L_0x0032:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r5 = r5.getDefaultTypeQualifiers()
            return r5
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r6 = r5.getDefaultTypeQualifiers()
            if (r6 == 0) goto L_0x004f
            java.util.EnumMap r6 = r6.getNullabilityQualifiers()
            if (r6 == 0) goto L_0x004f
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r6)
            goto L_0x0056
        L_0x004f:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType> r6 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.class
            r1.<init>(r6)
        L_0x0056:
            r6 = 0
            java.util.Iterator r0 = r0.iterator()
        L_0x005b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = r2.component1()
            java.util.Collection r2 = r2.component2()
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r6 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r6 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType) r6
            r1.put(r6, r3)
            r6 = 1
            goto L_0x0073
        L_0x0084:
            if (r6 != 0) goto L_0x008b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r5 = r5.getDefaultTypeQualifiers()
            goto L_0x0090
        L_0x008b:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType
            r5.<init>(r1)
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.computeNewDefaultTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations):kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType");
    }

    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        return annotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), C12763i.m39922a(C12897k.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(lazyJavaResolverContext, annotations)));
    }

    private static final NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier(LazyJavaResolverContext lazyJavaResolverContext, AnnotationDescriptor annotationDescriptor) {
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver();
        NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation = annotationTypeQualifierResolver.resolveQualifierBuiltInDefaultAnnotation(annotationDescriptor);
        if (resolveQualifierBuiltInDefaultAnnotation != null) {
            return resolveQualifierBuiltInDefaultAnnotation;
        }
        TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation = annotationTypeQualifierResolver.resolveTypeQualifierDefaultAnnotation(annotationDescriptor);
        if (resolveTypeQualifierDefaultAnnotation != null) {
            AnnotationDescriptor component1 = resolveTypeQualifierDefaultAnnotation.component1();
            List component2 = resolveTypeQualifierDefaultAnnotation.component2();
            ReportLevel resolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305CustomState(annotationDescriptor);
            if (resolveJsr305CustomState == null) {
                resolveJsr305CustomState = annotationTypeQualifierResolver.resolveJsr305AnnotationState(component1);
            }
            if (resolveJsr305CustomState.isIgnore()) {
                return null;
            }
            NullabilityQualifierWithMigrationStatus extractNullability = lazyJavaResolverContext.getComponents().getSignatureEnhancement().extractNullability(component1);
            if (extractNullability != null) {
                NullabilityQualifierWithMigrationStatus copy$default = NullabilityQualifierWithMigrationStatus.copy$default(extractNullability, null, resolveJsr305CustomState.isWarning(), 1, null);
                if (copy$default != null) {
                    return new NullabilityQualifierWithApplicability(copy$default, component2);
                }
            }
        }
        return null;
    }

    public static final LazyJavaResolverContext replaceComponents(LazyJavaResolverContext lazyJavaResolverContext, JavaResolverComponents javaResolverComponents) {
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        TypeParameterResolver typeParameterResolver;
        JavaResolverComponents components = lazyJavaResolverContext.getComponents();
        if (javaTypeParameterListOwner != null) {
            typeParameterResolver = new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            typeParameterResolver = lazyJavaResolverContext.getTypeParameterResolver();
        }
        return new LazyJavaResolverContext(components, typeParameterResolver, lazy);
    }
}
