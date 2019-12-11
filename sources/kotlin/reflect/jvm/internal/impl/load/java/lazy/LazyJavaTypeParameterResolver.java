package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: resolvers.kt */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29554c;
    /* access modifiers changed from: private */
    public final DeclarationDescriptor containingDeclaration;
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> resolve = this.f29554c.getStorageManager().createMemoizedFunctionWithNullableValues(new LazyJavaTypeParameterResolver$resolve$1(this));
    /* access modifiers changed from: private */
    public final Map<JavaTypeParameter, Integer> typeParameters;
    /* access modifiers changed from: private */
    public final int typeParametersIndexOffset;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        this.f29554c = lazyJavaResolverContext;
        this.containingDeclaration = declarationDescriptor;
        this.typeParametersIndexOffset = i;
        this.typeParameters = CollectionsKt.mapToIndex(javaTypeParameterListOwner.getTypeParameters());
    }

    public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.resolve.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f29554c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
