package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    private final LazyJavaAnnotations annotations = new LazyJavaAnnotations(this.f29564c, this.javaTypeParameter);

    /* renamed from: c */
    private final LazyJavaResolverContext f29564c;
    private final JavaTypeParameter javaTypeParameter;

    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaTypeParameter javaTypeParameter2, int i, DeclarationDescriptor declarationDescriptor) {
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, javaTypeParameter2.getName(), Variance.INVARIANT, false, i, SourceElement.NO_SOURCE, lazyJavaResolverContext.getComponents().getSupertypeLoopChecker());
        this.f29564c = lazyJavaResolverContext;
        this.javaTypeParameter = javaTypeParameter2;
    }

    /* access modifiers changed from: protected */
    public void reportSupertypeLoopError(KotlinType kotlinType) {
    }

    /* access modifiers changed from: protected */
    public List<KotlinType> resolveUpperBounds() {
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f29564c.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkReturnedValueIsNotNull((Object) anyType, "c.module.builtIns.anyType");
            SimpleType nullableAnyType = this.f29564c.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkReturnedValueIsNotNull((Object) nullableAnyType, "c.module.builtIns.nullableAnyType");
            return C13183n.m40498a(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) upperBounds, 10));
        for (JavaClassifierType transformJavaType : upperBounds) {
            arrayList.add(this.f29564c.getTypeResolver().transformJavaType(transformJavaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }

    public LazyJavaAnnotations getAnnotations() {
        return this.annotations;
    }
}
