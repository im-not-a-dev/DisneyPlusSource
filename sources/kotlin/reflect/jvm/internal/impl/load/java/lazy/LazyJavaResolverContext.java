package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: context.kt */
public final class LazyJavaResolverContext {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(LazyJavaResolverContext.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};
    private final JavaResolverComponents components;
    private final Lazy defaultTypeQualifiers$delegate = this.delegateForDefaultTypeQualifiers;
    private final Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;
    private final TypeParameterResolver typeParameterResolver;
    private final JavaTypeResolver typeResolver = new JavaTypeResolver(this, this.typeParameterResolver);

    public LazyJavaResolverContext(JavaResolverComponents javaResolverComponents, TypeParameterResolver typeParameterResolver2, Lazy<JavaTypeQualifiersByElementType> lazy) {
        this.components = javaResolverComponents;
        this.typeParameterResolver = typeParameterResolver2;
        this.delegateForDefaultTypeQualifiers = lazy;
    }

    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        Lazy lazy = this.defaultTypeQualifiers$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (JavaTypeQualifiersByElementType) lazy.getValue();
    }

    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }

    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }
}
